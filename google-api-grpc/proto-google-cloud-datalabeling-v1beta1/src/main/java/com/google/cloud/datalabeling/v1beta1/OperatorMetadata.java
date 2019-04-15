// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * General information useful for labels coming from contributors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.OperatorMetadata}
 */
public final class OperatorMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.OperatorMetadata)
    OperatorMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OperatorMetadata.newBuilder() to construct.
  private OperatorMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OperatorMetadata() {
    comments_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OperatorMetadata(
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
          case 13:
            {
              score_ = input.readFloat();
              break;
            }
          case 16:
            {
              totalVotes_ = input.readInt32();
              break;
            }
          case 24:
            {
              labelVotes_ = input.readInt32();
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                comments_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              comments_.add(s);
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
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        comments_ = comments_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.OperatorMetadata.class,
            com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   *
   *
   * <pre>
   * Confidence score corresponding to a label. For examle, if 3 contributors
   * have answered the question and 2 of them agree on the final label, the
   * confidence score will be 0.67 (2/3).
   * </pre>
   *
   * <code>float score = 1;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int TOTAL_VOTES_FIELD_NUMBER = 2;
  private int totalVotes_;
  /**
   *
   *
   * <pre>
   * The total number of contributors that answer this question.
   * </pre>
   *
   * <code>int32 total_votes = 2;</code>
   */
  public int getTotalVotes() {
    return totalVotes_;
  }

  public static final int LABEL_VOTES_FIELD_NUMBER = 3;
  private int labelVotes_;
  /**
   *
   *
   * <pre>
   * The total number of contributors that choose this label.
   * </pre>
   *
   * <code>int32 label_votes = 3;</code>
   */
  public int getLabelVotes() {
    return labelVotes_;
  }

  public static final int COMMENTS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList comments_;
  /** <code>repeated string comments = 4;</code> */
  public com.google.protobuf.ProtocolStringList getCommentsList() {
    return comments_;
  }
  /** <code>repeated string comments = 4;</code> */
  public int getCommentsCount() {
    return comments_.size();
  }
  /** <code>repeated string comments = 4;</code> */
  public java.lang.String getComments(int index) {
    return comments_.get(index);
  }
  /** <code>repeated string comments = 4;</code> */
  public com.google.protobuf.ByteString getCommentsBytes(int index) {
    return comments_.getByteString(index);
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
    if (score_ != 0F) {
      output.writeFloat(1, score_);
    }
    if (totalVotes_ != 0) {
      output.writeInt32(2, totalVotes_);
    }
    if (labelVotes_ != 0) {
      output.writeInt32(3, labelVotes_);
    }
    for (int i = 0; i < comments_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, comments_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, score_);
    }
    if (totalVotes_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, totalVotes_);
    }
    if (labelVotes_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, labelVotes_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < comments_.size(); i++) {
        dataSize += computeStringSizeNoTag(comments_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCommentsList().size();
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.OperatorMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.OperatorMetadata other =
        (com.google.cloud.datalabeling.v1beta1.OperatorMetadata) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(other.getScore())) return false;
    if (getTotalVotes() != other.getTotalVotes()) return false;
    if (getLabelVotes() != other.getLabelVotes()) return false;
    if (!getCommentsList().equals(other.getCommentsList())) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    hash = (37 * hash) + TOTAL_VOTES_FIELD_NUMBER;
    hash = (53 * hash) + getTotalVotes();
    hash = (37 * hash) + LABEL_VOTES_FIELD_NUMBER;
    hash = (53 * hash) + getLabelVotes();
    if (getCommentsCount() > 0) {
      hash = (37 * hash) + COMMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getCommentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.OperatorMetadata prototype) {
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
   * General information useful for labels coming from contributors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.OperatorMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.OperatorMetadata)
      com.google.cloud.datalabeling.v1beta1.OperatorMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.OperatorMetadata.class,
              com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.OperatorMetadata.newBuilder()
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
      score_ = 0F;

      totalVotes_ = 0;

      labelVotes_ = 0;

      comments_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.OperatorMetadata getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.OperatorMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.OperatorMetadata build() {
      com.google.cloud.datalabeling.v1beta1.OperatorMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.OperatorMetadata buildPartial() {
      com.google.cloud.datalabeling.v1beta1.OperatorMetadata result =
          new com.google.cloud.datalabeling.v1beta1.OperatorMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.score_ = score_;
      result.totalVotes_ = totalVotes_;
      result.labelVotes_ = labelVotes_;
      if (((bitField0_ & 0x00000008) != 0)) {
        comments_ = comments_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.comments_ = comments_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.OperatorMetadata) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.OperatorMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.OperatorMetadata other) {
      if (other == com.google.cloud.datalabeling.v1beta1.OperatorMetadata.getDefaultInstance())
        return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.getTotalVotes() != 0) {
        setTotalVotes(other.getTotalVotes());
      }
      if (other.getLabelVotes() != 0) {
        setLabelVotes(other.getLabelVotes());
      }
      if (!other.comments_.isEmpty()) {
        if (comments_.isEmpty()) {
          comments_ = other.comments_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureCommentsIsMutable();
          comments_.addAll(other.comments_);
        }
        onChanged();
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
      com.google.cloud.datalabeling.v1beta1.OperatorMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.OperatorMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private float score_;
    /**
     *
     *
     * <pre>
     * Confidence score corresponding to a label. For examle, if 3 contributors
     * have answered the question and 2 of them agree on the final label, the
     * confidence score will be 0.67 (2/3).
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Confidence score corresponding to a label. For examle, if 3 contributors
     * have answered the question and 2 of them agree on the final label, the
     * confidence score will be 0.67 (2/3).
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public Builder setScore(float value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Confidence score corresponding to a label. For examle, if 3 contributors
     * have answered the question and 2 of them agree on the final label, the
     * confidence score will be 0.67 (2/3).
     * </pre>
     *
     * <code>float score = 1;</code>
     */
    public Builder clearScore() {

      score_ = 0F;
      onChanged();
      return this;
    }

    private int totalVotes_;
    /**
     *
     *
     * <pre>
     * The total number of contributors that answer this question.
     * </pre>
     *
     * <code>int32 total_votes = 2;</code>
     */
    public int getTotalVotes() {
      return totalVotes_;
    }
    /**
     *
     *
     * <pre>
     * The total number of contributors that answer this question.
     * </pre>
     *
     * <code>int32 total_votes = 2;</code>
     */
    public Builder setTotalVotes(int value) {

      totalVotes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of contributors that answer this question.
     * </pre>
     *
     * <code>int32 total_votes = 2;</code>
     */
    public Builder clearTotalVotes() {

      totalVotes_ = 0;
      onChanged();
      return this;
    }

    private int labelVotes_;
    /**
     *
     *
     * <pre>
     * The total number of contributors that choose this label.
     * </pre>
     *
     * <code>int32 label_votes = 3;</code>
     */
    public int getLabelVotes() {
      return labelVotes_;
    }
    /**
     *
     *
     * <pre>
     * The total number of contributors that choose this label.
     * </pre>
     *
     * <code>int32 label_votes = 3;</code>
     */
    public Builder setLabelVotes(int value) {

      labelVotes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of contributors that choose this label.
     * </pre>
     *
     * <code>int32 label_votes = 3;</code>
     */
    public Builder clearLabelVotes() {

      labelVotes_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList comments_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureCommentsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        comments_ = new com.google.protobuf.LazyStringArrayList(comments_);
        bitField0_ |= 0x00000008;
      }
    }
    /** <code>repeated string comments = 4;</code> */
    public com.google.protobuf.ProtocolStringList getCommentsList() {
      return comments_.getUnmodifiableView();
    }
    /** <code>repeated string comments = 4;</code> */
    public int getCommentsCount() {
      return comments_.size();
    }
    /** <code>repeated string comments = 4;</code> */
    public java.lang.String getComments(int index) {
      return comments_.get(index);
    }
    /** <code>repeated string comments = 4;</code> */
    public com.google.protobuf.ByteString getCommentsBytes(int index) {
      return comments_.getByteString(index);
    }
    /** <code>repeated string comments = 4;</code> */
    public Builder setComments(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCommentsIsMutable();
      comments_.set(index, value);
      onChanged();
      return this;
    }
    /** <code>repeated string comments = 4;</code> */
    public Builder addComments(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCommentsIsMutable();
      comments_.add(value);
      onChanged();
      return this;
    }
    /** <code>repeated string comments = 4;</code> */
    public Builder addAllComments(java.lang.Iterable<java.lang.String> values) {
      ensureCommentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, comments_);
      onChanged();
      return this;
    }
    /** <code>repeated string comments = 4;</code> */
    public Builder clearComments() {
      comments_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /** <code>repeated string comments = 4;</code> */
    public Builder addCommentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureCommentsIsMutable();
      comments_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.OperatorMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.OperatorMetadata)
  private static final com.google.cloud.datalabeling.v1beta1.OperatorMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.OperatorMetadata();
  }

  public static com.google.cloud.datalabeling.v1beta1.OperatorMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperatorMetadata> PARSER =
      new com.google.protobuf.AbstractParser<OperatorMetadata>() {
        @java.lang.Override
        public OperatorMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OperatorMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OperatorMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperatorMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.OperatorMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
