// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

public interface HashedFeatureMapProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.HashedFeatureMapProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.HasherProto hasher = 1;</code>
   * @return Whether the hasher field is set.
   */
  boolean hasHasher();
  /**
   * <code>.tribuo.core.HasherProto hasher = 1;</code>
   * @return The hasher.
   */
  org.tribuo.protos.core.HasherProto getHasher();
  /**
   * <code>.tribuo.core.HasherProto hasher = 1;</code>
   */
  org.tribuo.protos.core.HasherProtoOrBuilder getHasherOrBuilder();

  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  java.util.List<org.tribuo.protos.core.VariableInfoProto> 
      getInfoList();
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  org.tribuo.protos.core.VariableInfoProto getInfo(int index);
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  int getInfoCount();
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  java.util.List<? extends org.tribuo.protos.core.VariableInfoProtoOrBuilder> 
      getInfoOrBuilderList();
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  org.tribuo.protos.core.VariableInfoProtoOrBuilder getInfoOrBuilder(
      int index);
}