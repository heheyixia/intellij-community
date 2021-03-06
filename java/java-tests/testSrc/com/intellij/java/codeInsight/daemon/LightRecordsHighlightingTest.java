// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.java.codeInsight.daemon;

import com.intellij.JavaTestUtil;
import com.intellij.java.refactoring.RenameFieldTest;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.psi.PsiDeclarationStatement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.refactoring.introduceVariable.ReassignVariableUtil;
import com.intellij.testFramework.IdeaTestUtil;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;
import org.jetbrains.annotations.NotNull;

public class LightRecordsHighlightingTest extends LightJavaCodeInsightFixtureTestCase {
  @Override
  protected String getBasePath() {
    return JavaTestUtil.getRelativeJavaTestDataPath() + "/codeInsight/daemonCodeAnalyzer/advHighlightingRecords";
  }

  @NotNull
  @Override
  protected LightProjectDescriptor getProjectDescriptor() {
    return JAVA_14;
  }

  public void testRecordBasics() {
    doTest();
  }
  public void testRecordBasicsJava15() {
    IdeaTestUtil.withLevel(getModule(), LanguageLevel.JDK_15_PREVIEW, this::doTest);
  }
  public void testRecordAccessors() {
    doTest();
  }
  public void testRecordAccessorsJava15() {
    IdeaTestUtil.withLevel(getModule(), LanguageLevel.JDK_15_PREVIEW, this::doTest);
  }
  public void testRecordConstructors() {
    doTest();
  }
  public void testRecordConstructorAccessJava15() {
    IdeaTestUtil.withLevel(getModule(), LanguageLevel.JDK_15_PREVIEW, this::doTest);
  }
  public void testRecordCompactConstructors() {
    doTest();
  }
  public void testRecordCompactConstructorsJava15() {
    IdeaTestUtil.withLevel(getModule(), LanguageLevel.JDK_15_PREVIEW, this::doTest);
  }
  public void testLocalRecords() {
    doTest();
  }
  public void testReassignToRecordComponentsDisabled() {
    myFixture.addClass("package java.lang; public abstract class Record {" +
                       "public abstract boolean equals(Object obj);" +
                       "public abstract int hashCode();" +
                       "public abstract String toString();" +
                       "}");
    myFixture.configureByText("A.java", "record Point(int x) {" +
                                        "    public Point {\n" +
                                        "        int x<caret>1 = 0\n" +
                                        "    }" + 
                                        "}");

    PsiDeclarationStatement decl = PsiTreeUtil.getParentOfType(myFixture.getElementAtCaret(), PsiDeclarationStatement.class);
    assertNotNull(decl);
    ReassignVariableUtil.registerDeclaration(getEditor(), decl, getTestRootDisposable());
    ReassignVariableUtil.reassign(getEditor());
  }

  public void testRenameOnRecordComponent() {
    doTestRename();
  }

  public void testRenameOnRecordCanonicalConstructor() {
    doTestRename();
  }

  public void testRenameOnCompactConstructorReference() {
    doTestRename();
  }

  public void testRenameOnExplicitGetter() {
    doTestRename();
  }

  public void testRenameWithCanonicalConstructor() {
    doTestRename();
  }

  public void testRenameGetterOverloadPresent() {
    doTestRename();
  }
  public void testRenameComponentUsedInOuterClass() {
    doTestRename();
  }

  public void testRenameOverloads() {
    doTest();
    RenameFieldTest.performRenameWithAutomaticRenamers("baz", getEditor(), getProject());
    myFixture.checkResultByFile(getTestName(false) + "_after.java");
  }

  private void doTestRename() {
    doTest();
    myFixture.renameElementAtCaret("baz");
    myFixture.checkResultByFile(getTestName(false) + "_after.java");
  }

  private void doTest() {
    myFixture.addClass("package java.lang; public abstract class Record {" +
                       "public abstract boolean equals(Object obj);" +
                       "public abstract int hashCode();" +
                       "public abstract String toString();" +
                       "}");
    myFixture.configureByFile(getTestName(false) + ".java");
    myFixture.checkHighlighting();
  }
}