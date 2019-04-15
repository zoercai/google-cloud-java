// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface AcceleratorConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.AcceleratorConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full URL, partial URI, or short name of the accelerator type resource to
   * expose to this instance. See
   * [Compute Engine
   * AcceleratorTypes](/compute/docs/reference/beta/acceleratorTypes).
   * Examples:
   * * `https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
   * * `projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
   * * `nvidia-tesla-k80`
   * **Auto Zone Exception**: If you are using the Cloud Dataproc
   * [Auto Zone
   * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the accelerator type
   * resource, for example, `nvidia-tesla-k80`.
   * </pre>
   *
   * <code>string accelerator_type_uri = 1;</code>
   */
  java.lang.String getAcceleratorTypeUri();
  /**
   *
   *
   * <pre>
   * Full URL, partial URI, or short name of the accelerator type resource to
   * expose to this instance. See
   * [Compute Engine
   * AcceleratorTypes](/compute/docs/reference/beta/acceleratorTypes).
   * Examples:
   * * `https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
   * * `projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
   * * `nvidia-tesla-k80`
   * **Auto Zone Exception**: If you are using the Cloud Dataproc
   * [Auto Zone
   * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the accelerator type
   * resource, for example, `nvidia-tesla-k80`.
   * </pre>
   *
   * <code>string accelerator_type_uri = 1;</code>
   */
  com.google.protobuf.ByteString getAcceleratorTypeUriBytes();

  /**
   *
   *
   * <pre>
   * The number of the accelerator cards of this type exposed to this instance.
   * </pre>
   *
   * <code>int32 accelerator_count = 2;</code>
   */
  int getAcceleratorCount();
}
