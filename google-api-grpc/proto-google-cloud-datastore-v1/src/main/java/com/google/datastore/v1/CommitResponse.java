// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The response for [Datastore.Commit][google.datastore.v1.Datastore.Commit].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.CommitResponse}
 */
public final class CommitResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.CommitResponse)
    CommitResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CommitResponse.newBuilder() to construct.
  private CommitResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CommitResponse() {
    mutationResults_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CommitResponse(
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
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mutationResults_ =
                    new java.util.ArrayList<com.google.datastore.v1.MutationResult>();
                mutable_bitField0_ |= 0x00000001;
              }
              mutationResults_.add(
                  input.readMessage(
                      com.google.datastore.v1.MutationResult.parser(), extensionRegistry));
              break;
            }
          case 32:
            {
              indexUpdates_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mutationResults_ = java.util.Collections.unmodifiableList(mutationResults_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_CommitResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_CommitResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.CommitResponse.class,
            com.google.datastore.v1.CommitResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MUTATION_RESULTS_FIELD_NUMBER = 3;
  private java.util.List<com.google.datastore.v1.MutationResult> mutationResults_;
  /**
   *
   *
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
   */
  public java.util.List<com.google.datastore.v1.MutationResult> getMutationResultsList() {
    return mutationResults_;
  }
  /**
   *
   *
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
   */
  public java.util.List<? extends com.google.datastore.v1.MutationResultOrBuilder>
      getMutationResultsOrBuilderList() {
    return mutationResults_;
  }
  /**
   *
   *
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
   */
  public int getMutationResultsCount() {
    return mutationResults_.size();
  }
  /**
   *
   *
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
   */
  public com.google.datastore.v1.MutationResult getMutationResults(int index) {
    return mutationResults_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The result of performing the mutations.
   * The i-th mutation result corresponds to the i-th mutation in the request.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
   */
  public com.google.datastore.v1.MutationResultOrBuilder getMutationResultsOrBuilder(int index) {
    return mutationResults_.get(index);
  }

  public static final int INDEX_UPDATES_FIELD_NUMBER = 4;
  private int indexUpdates_;
  /**
   *
   *
   * <pre>
   * The number of index entries updated during the commit, or zero if none were
   * updated.
   * </pre>
   *
   * <code>int32 index_updates = 4;</code>
   */
  public int getIndexUpdates() {
    return indexUpdates_;
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
    for (int i = 0; i < mutationResults_.size(); i++) {
      output.writeMessage(3, mutationResults_.get(i));
    }
    if (indexUpdates_ != 0) {
      output.writeInt32(4, indexUpdates_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mutationResults_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, mutationResults_.get(i));
    }
    if (indexUpdates_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, indexUpdates_);
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
    if (!(obj instanceof com.google.datastore.v1.CommitResponse)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.CommitResponse other = (com.google.datastore.v1.CommitResponse) obj;

    if (!getMutationResultsList().equals(other.getMutationResultsList())) return false;
    if (getIndexUpdates() != other.getIndexUpdates()) return false;
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
    if (getMutationResultsCount() > 0) {
      hash = (37 * hash) + MUTATION_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getMutationResultsList().hashCode();
    }
    hash = (37 * hash) + INDEX_UPDATES_FIELD_NUMBER;
    hash = (53 * hash) + getIndexUpdates();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.CommitResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.CommitResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.CommitResponse parseFrom(
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

  public static Builder newBuilder(com.google.datastore.v1.CommitResponse prototype) {
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
   * The response for [Datastore.Commit][google.datastore.v1.Datastore.Commit].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.CommitResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.CommitResponse)
      com.google.datastore.v1.CommitResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_CommitResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_CommitResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.CommitResponse.class,
              com.google.datastore.v1.CommitResponse.Builder.class);
    }

    // Construct using com.google.datastore.v1.CommitResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMutationResultsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mutationResultsBuilder_ == null) {
        mutationResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mutationResultsBuilder_.clear();
      }
      indexUpdates_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_CommitResponse_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.CommitResponse getDefaultInstanceForType() {
      return com.google.datastore.v1.CommitResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.CommitResponse build() {
      com.google.datastore.v1.CommitResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.CommitResponse buildPartial() {
      com.google.datastore.v1.CommitResponse result =
          new com.google.datastore.v1.CommitResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (mutationResultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mutationResults_ = java.util.Collections.unmodifiableList(mutationResults_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mutationResults_ = mutationResults_;
      } else {
        result.mutationResults_ = mutationResultsBuilder_.build();
      }
      result.indexUpdates_ = indexUpdates_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.datastore.v1.CommitResponse) {
        return mergeFrom((com.google.datastore.v1.CommitResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.CommitResponse other) {
      if (other == com.google.datastore.v1.CommitResponse.getDefaultInstance()) return this;
      if (mutationResultsBuilder_ == null) {
        if (!other.mutationResults_.isEmpty()) {
          if (mutationResults_.isEmpty()) {
            mutationResults_ = other.mutationResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMutationResultsIsMutable();
            mutationResults_.addAll(other.mutationResults_);
          }
          onChanged();
        }
      } else {
        if (!other.mutationResults_.isEmpty()) {
          if (mutationResultsBuilder_.isEmpty()) {
            mutationResultsBuilder_.dispose();
            mutationResultsBuilder_ = null;
            mutationResults_ = other.mutationResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mutationResultsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMutationResultsFieldBuilder()
                    : null;
          } else {
            mutationResultsBuilder_.addAllMessages(other.mutationResults_);
          }
        }
      }
      if (other.getIndexUpdates() != 0) {
        setIndexUpdates(other.getIndexUpdates());
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
      com.google.datastore.v1.CommitResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.CommitResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.datastore.v1.MutationResult> mutationResults_ =
        java.util.Collections.emptyList();

    private void ensureMutationResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mutationResults_ =
            new java.util.ArrayList<com.google.datastore.v1.MutationResult>(mutationResults_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1.MutationResult,
            com.google.datastore.v1.MutationResult.Builder,
            com.google.datastore.v1.MutationResultOrBuilder>
        mutationResultsBuilder_;

    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public java.util.List<com.google.datastore.v1.MutationResult> getMutationResultsList() {
      if (mutationResultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mutationResults_);
      } else {
        return mutationResultsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public int getMutationResultsCount() {
      if (mutationResultsBuilder_ == null) {
        return mutationResults_.size();
      } else {
        return mutationResultsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public com.google.datastore.v1.MutationResult getMutationResults(int index) {
      if (mutationResultsBuilder_ == null) {
        return mutationResults_.get(index);
      } else {
        return mutationResultsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder setMutationResults(int index, com.google.datastore.v1.MutationResult value) {
      if (mutationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationResultsIsMutable();
        mutationResults_.set(index, value);
        onChanged();
      } else {
        mutationResultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder setMutationResults(
        int index, com.google.datastore.v1.MutationResult.Builder builderForValue) {
      if (mutationResultsBuilder_ == null) {
        ensureMutationResultsIsMutable();
        mutationResults_.set(index, builderForValue.build());
        onChanged();
      } else {
        mutationResultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder addMutationResults(com.google.datastore.v1.MutationResult value) {
      if (mutationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationResultsIsMutable();
        mutationResults_.add(value);
        onChanged();
      } else {
        mutationResultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder addMutationResults(int index, com.google.datastore.v1.MutationResult value) {
      if (mutationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMutationResultsIsMutable();
        mutationResults_.add(index, value);
        onChanged();
      } else {
        mutationResultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder addMutationResults(
        com.google.datastore.v1.MutationResult.Builder builderForValue) {
      if (mutationResultsBuilder_ == null) {
        ensureMutationResultsIsMutable();
        mutationResults_.add(builderForValue.build());
        onChanged();
      } else {
        mutationResultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder addMutationResults(
        int index, com.google.datastore.v1.MutationResult.Builder builderForValue) {
      if (mutationResultsBuilder_ == null) {
        ensureMutationResultsIsMutable();
        mutationResults_.add(index, builderForValue.build());
        onChanged();
      } else {
        mutationResultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder addAllMutationResults(
        java.lang.Iterable<? extends com.google.datastore.v1.MutationResult> values) {
      if (mutationResultsBuilder_ == null) {
        ensureMutationResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mutationResults_);
        onChanged();
      } else {
        mutationResultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder clearMutationResults() {
      if (mutationResultsBuilder_ == null) {
        mutationResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mutationResultsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public Builder removeMutationResults(int index) {
      if (mutationResultsBuilder_ == null) {
        ensureMutationResultsIsMutable();
        mutationResults_.remove(index);
        onChanged();
      } else {
        mutationResultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public com.google.datastore.v1.MutationResult.Builder getMutationResultsBuilder(int index) {
      return getMutationResultsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public com.google.datastore.v1.MutationResultOrBuilder getMutationResultsOrBuilder(int index) {
      if (mutationResultsBuilder_ == null) {
        return mutationResults_.get(index);
      } else {
        return mutationResultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public java.util.List<? extends com.google.datastore.v1.MutationResultOrBuilder>
        getMutationResultsOrBuilderList() {
      if (mutationResultsBuilder_ != null) {
        return mutationResultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mutationResults_);
      }
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public com.google.datastore.v1.MutationResult.Builder addMutationResultsBuilder() {
      return getMutationResultsFieldBuilder()
          .addBuilder(com.google.datastore.v1.MutationResult.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public com.google.datastore.v1.MutationResult.Builder addMutationResultsBuilder(int index) {
      return getMutationResultsFieldBuilder()
          .addBuilder(index, com.google.datastore.v1.MutationResult.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The result of performing the mutations.
     * The i-th mutation result corresponds to the i-th mutation in the request.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.MutationResult mutation_results = 3;</code>
     */
    public java.util.List<com.google.datastore.v1.MutationResult.Builder>
        getMutationResultsBuilderList() {
      return getMutationResultsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1.MutationResult,
            com.google.datastore.v1.MutationResult.Builder,
            com.google.datastore.v1.MutationResultOrBuilder>
        getMutationResultsFieldBuilder() {
      if (mutationResultsBuilder_ == null) {
        mutationResultsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.datastore.v1.MutationResult,
                com.google.datastore.v1.MutationResult.Builder,
                com.google.datastore.v1.MutationResultOrBuilder>(
                mutationResults_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mutationResults_ = null;
      }
      return mutationResultsBuilder_;
    }

    private int indexUpdates_;
    /**
     *
     *
     * <pre>
     * The number of index entries updated during the commit, or zero if none were
     * updated.
     * </pre>
     *
     * <code>int32 index_updates = 4;</code>
     */
    public int getIndexUpdates() {
      return indexUpdates_;
    }
    /**
     *
     *
     * <pre>
     * The number of index entries updated during the commit, or zero if none were
     * updated.
     * </pre>
     *
     * <code>int32 index_updates = 4;</code>
     */
    public Builder setIndexUpdates(int value) {

      indexUpdates_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of index entries updated during the commit, or zero if none were
     * updated.
     * </pre>
     *
     * <code>int32 index_updates = 4;</code>
     */
    public Builder clearIndexUpdates() {

      indexUpdates_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.CommitResponse)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.CommitResponse)
  private static final com.google.datastore.v1.CommitResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.CommitResponse();
  }

  public static com.google.datastore.v1.CommitResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitResponse> PARSER =
      new com.google.protobuf.AbstractParser<CommitResponse>() {
        @java.lang.Override
        public CommitResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CommitResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CommitResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.CommitResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
