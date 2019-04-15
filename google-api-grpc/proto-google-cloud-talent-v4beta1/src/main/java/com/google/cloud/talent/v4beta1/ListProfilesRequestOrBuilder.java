// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public interface ListProfilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ListProfilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenants/foo".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenants/foo".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The token that specifies the current offset (that is, starting result).
   * Please set the value to
   * [ListProfilesResponse.next_page_token][google.cloud.talent.v4beta1.ListProfilesResponse.next_page_token]
   * to continue the list.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional.
   * The token that specifies the current offset (that is, starting result).
   * Please set the value to
   * [ListProfilesResponse.next_page_token][google.cloud.talent.v4beta1.ListProfilesResponse.next_page_token]
   * to continue the list.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The maximum number of profiles to be returned, at most 100.
   * Default is 100 unless a positive number smaller than 100 is specified.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional.
   * A field mask to specify the profile fields to be listed in response.
   * All fields are listed if it is unset.
   * Valid values are:
   * * name
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Optional.
   * A field mask to specify the profile fields to be listed in response.
   * All fields are listed if it is unset.
   * Valid values are:
   * * name
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Optional.
   * A field mask to specify the profile fields to be listed in response.
   * All fields are listed if it is unset.
   * Valid values are:
   * * name
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
