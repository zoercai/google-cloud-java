// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/operations.proto

package com.google.cloud.automl.v1beta1;

public interface BatchPredictOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BatchPredictOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 1;</code>
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 1;</code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 1;</code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;
   * </code>
   */
  boolean hasOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo
      getOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfoOrBuilder
      getOutputInfoOrBuilder();
}
