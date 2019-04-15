// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The request for [Datastore.Rollback][google.datastore.v1.Datastore.Rollback].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.RollbackRequest}
 */
public final class RollbackRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.RollbackRequest)
    RollbackRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RollbackRequest.newBuilder() to construct.
  private RollbackRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RollbackRequest() {
    projectId_ = "";
    transaction_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RollbackRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              transaction_ = input.readBytes();
              break;
            }
          case 66:
            {
              java.lang.String s = input.readStringRequireUtf8();

              projectId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_RollbackRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.RollbackRequest.class,
            com.google.datastore.v1.RollbackRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString transaction_;
  /**
   *
   *
   * <pre>
   * The transaction identifier, returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 1;</code>
   */
  public com.google.protobuf.ByteString getTransaction() {
    return transaction_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!transaction_.isEmpty()) {
      output.writeBytes(1, transaction_);
    }
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, projectId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!transaction_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, transaction_);
    }
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, projectId_);
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
    if (!(obj instanceof com.google.datastore.v1.RollbackRequest)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.RollbackRequest other = (com.google.datastore.v1.RollbackRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getTransaction().equals(other.getTransaction())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
    hash = (53 * hash) + getTransaction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.datastore.v1.RollbackRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [Datastore.Rollback][google.datastore.v1.Datastore.Rollback].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.RollbackRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.RollbackRequest)
      com.google.datastore.v1.RollbackRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RollbackRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.RollbackRequest.class,
              com.google.datastore.v1.RollbackRequest.Builder.class);
    }

    // Construct using com.google.datastore.v1.RollbackRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      transaction_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RollbackRequest_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.RollbackRequest getDefaultInstanceForType() {
      return com.google.datastore.v1.RollbackRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.RollbackRequest build() {
      com.google.datastore.v1.RollbackRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.RollbackRequest buildPartial() {
      com.google.datastore.v1.RollbackRequest result =
          new com.google.datastore.v1.RollbackRequest(this);
      result.projectId_ = projectId_;
      result.transaction_ = transaction_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.RollbackRequest) {
        return mergeFrom((com.google.datastore.v1.RollbackRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.RollbackRequest other) {
      if (other == com.google.datastore.v1.RollbackRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.getTransaction() != com.google.protobuf.ByteString.EMPTY) {
        setTransaction(other.getTransaction());
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
      com.google.datastore.v1.RollbackRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.RollbackRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString transaction_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The transaction identifier, returned by a call to
     * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
     * </pre>
     *
     * <code>bytes transaction = 1;</code>
     */
    public com.google.protobuf.ByteString getTransaction() {
      return transaction_;
    }
    /**
     *
     *
     * <pre>
     * The transaction identifier, returned by a call to
     * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
     * </pre>
     *
     * <code>bytes transaction = 1;</code>
     */
    public Builder setTransaction(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      transaction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The transaction identifier, returned by a call to
     * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
     * </pre>
     *
     * <code>bytes transaction = 1;</code>
     */
    public Builder clearTransaction() {

      transaction_ = getDefaultInstance().getTransaction();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.RollbackRequest)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.RollbackRequest)
  private static final com.google.datastore.v1.RollbackRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.RollbackRequest();
  }

  public static com.google.datastore.v1.RollbackRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RollbackRequest> PARSER =
      new com.google.protobuf.AbstractParser<RollbackRequest>() {
        @java.lang.Override
        public RollbackRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RollbackRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RollbackRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RollbackRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.RollbackRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
