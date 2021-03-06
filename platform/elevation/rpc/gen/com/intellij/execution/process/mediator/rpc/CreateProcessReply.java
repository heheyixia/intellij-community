// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processMediator.proto

package com.intellij.execution.process.mediator.rpc;

/**
 * Protobuf type {@code intellij.process.mediator.rpc.CreateProcessReply}
 */
public final class CreateProcessReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:intellij.process.mediator.rpc.CreateProcessReply)
    CreateProcessReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateProcessReply.newBuilder() to construct.
  private CreateProcessReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateProcessReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateProcessReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateProcessReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            pid_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.intellij.execution.process.mediator.rpc.ProcessMediatorProto.internal_static_intellij_process_mediator_rpc_CreateProcessReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.intellij.execution.process.mediator.rpc.ProcessMediatorProto.internal_static_intellij_process_mediator_rpc_CreateProcessReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.intellij.execution.process.mediator.rpc.CreateProcessReply.class, com.intellij.execution.process.mediator.rpc.CreateProcessReply.Builder.class);
  }

  public static final int PID_FIELD_NUMBER = 1;
  private long pid_;
  /**
   * <code>uint64 pid = 1;</code>
   * @return The pid.
   */
  @java.lang.Override
  public long getPid() {
    return pid_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pid_ != 0L) {
      output.writeUInt64(1, pid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, pid_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.intellij.execution.process.mediator.rpc.CreateProcessReply)) {
      return super.equals(obj);
    }
    com.intellij.execution.process.mediator.rpc.CreateProcessReply other = (com.intellij.execution.process.mediator.rpc.CreateProcessReply) obj;

    if (getPid()
        != other.getPid()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.intellij.execution.process.mediator.rpc.CreateProcessReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code intellij.process.mediator.rpc.CreateProcessReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:intellij.process.mediator.rpc.CreateProcessReply)
      com.intellij.execution.process.mediator.rpc.CreateProcessReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.intellij.execution.process.mediator.rpc.ProcessMediatorProto.internal_static_intellij_process_mediator_rpc_CreateProcessReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.intellij.execution.process.mediator.rpc.ProcessMediatorProto.internal_static_intellij_process_mediator_rpc_CreateProcessReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.intellij.execution.process.mediator.rpc.CreateProcessReply.class, com.intellij.execution.process.mediator.rpc.CreateProcessReply.Builder.class);
    }

    // Construct using com.intellij.execution.process.mediator.rpc.CreateProcessReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pid_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.intellij.execution.process.mediator.rpc.ProcessMediatorProto.internal_static_intellij_process_mediator_rpc_CreateProcessReply_descriptor;
    }

    @java.lang.Override
    public com.intellij.execution.process.mediator.rpc.CreateProcessReply getDefaultInstanceForType() {
      return com.intellij.execution.process.mediator.rpc.CreateProcessReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.intellij.execution.process.mediator.rpc.CreateProcessReply build() {
      com.intellij.execution.process.mediator.rpc.CreateProcessReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.intellij.execution.process.mediator.rpc.CreateProcessReply buildPartial() {
      com.intellij.execution.process.mediator.rpc.CreateProcessReply result = new com.intellij.execution.process.mediator.rpc.CreateProcessReply(this);
      result.pid_ = pid_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.intellij.execution.process.mediator.rpc.CreateProcessReply) {
        return mergeFrom((com.intellij.execution.process.mediator.rpc.CreateProcessReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.intellij.execution.process.mediator.rpc.CreateProcessReply other) {
      if (other == com.intellij.execution.process.mediator.rpc.CreateProcessReply.getDefaultInstance()) return this;
      if (other.getPid() != 0L) {
        setPid(other.getPid());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.intellij.execution.process.mediator.rpc.CreateProcessReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.intellij.execution.process.mediator.rpc.CreateProcessReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pid_ ;
    /**
     * <code>uint64 pid = 1;</code>
     * @return The pid.
     */
    @java.lang.Override
    public long getPid() {
      return pid_;
    }
    /**
     * <code>uint64 pid = 1;</code>
     * @param value The pid to set.
     * @return This builder for chaining.
     */
    public Builder setPid(long value) {
      
      pid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPid() {
      
      pid_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:intellij.process.mediator.rpc.CreateProcessReply)
  }

  // @@protoc_insertion_point(class_scope:intellij.process.mediator.rpc.CreateProcessReply)
  private static final com.intellij.execution.process.mediator.rpc.CreateProcessReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.intellij.execution.process.mediator.rpc.CreateProcessReply();
  }

  public static com.intellij.execution.process.mediator.rpc.CreateProcessReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProcessReply>
      PARSER = new com.google.protobuf.AbstractParser<CreateProcessReply>() {
    @java.lang.Override
    public CreateProcessReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateProcessReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateProcessReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProcessReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.intellij.execution.process.mediator.rpc.CreateProcessReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

