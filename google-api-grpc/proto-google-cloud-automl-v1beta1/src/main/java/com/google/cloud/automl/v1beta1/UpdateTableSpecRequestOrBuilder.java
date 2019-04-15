// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface UpdateTableSpecRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.UpdateTableSpecRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The table spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
   */
  boolean hasTableSpec();
  /**
   *
   *
   * <pre>
   * The table spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
   */
  com.google.cloud.automl.v1beta1.TableSpec getTableSpec();
  /**
   *
   *
   * <pre>
   * The table spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
   */
  com.google.cloud.automl.v1beta1.TableSpecOrBuilder getTableSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
