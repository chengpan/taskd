// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/message.proto

package com.github.chengpan.proto;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_chengpan_proto_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_chengpan_proto_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_chengpan_proto_Task_MetaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_chengpan_proto_Task_MetaEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_chengpan_proto_TaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_chengpan_proto_TaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_chengpan_proto_TaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_chengpan_proto_TaskResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034src/main/proto/message.proto\022\031com.gith" +
      "ub.chengpan.proto\032\037google/protobuf/times" +
      "tamp.proto\"\360\001\n\004Task\022\n\n\002id\030\001 \001(\t\0227\n\004meta\030" +
      "\002 \003(\0132).com.github.chengpan.proto.Task.M" +
      "etaEntry\022\014\n\004blob\030\003 \001(\014\022\023\n\013consumer_id\030\004 " +
      "\001(\t\022\024\n\014callback_url\030\005 \001(\t\022\021\n\tsender_id\030\006" +
      " \001(\t\022*\n\006due_at\030\007 \001(\0132\032.google.protobuf.T" +
      "imestamp\032+\n\tMetaEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\t:\0028\001\"\232\001\n\013TaskRequest\022-\n\004task\030\001 " +
      "\001(\0132\037.com.github.chengpan.proto.Task\022=\n\006" +
      "action\030\002 \001(\0162-.com.github.chengpan.proto" +
      ".TaskRequest.Action\"\035\n\006Action\022\007\n\003PUT\020\000\022\n" +
      "\n\006DELETE\020\001\"\037\n\014TaskResponse\022\017\n\007err_msg\030\001 " +
      "\001(\tB&\n\031com.github.chengpan.protoB\007Messag" +
      "eP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_github_chengpan_proto_Task_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_chengpan_proto_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_chengpan_proto_Task_descriptor,
        new java.lang.String[] { "Id", "Meta", "Blob", "ConsumerId", "CallbackUrl", "SenderId", "DueAt", });
    internal_static_com_github_chengpan_proto_Task_MetaEntry_descriptor =
      internal_static_com_github_chengpan_proto_Task_descriptor.getNestedTypes().get(0);
    internal_static_com_github_chengpan_proto_Task_MetaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_chengpan_proto_Task_MetaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_github_chengpan_proto_TaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_chengpan_proto_TaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_chengpan_proto_TaskRequest_descriptor,
        new java.lang.String[] { "Task", "Action", });
    internal_static_com_github_chengpan_proto_TaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_github_chengpan_proto_TaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_chengpan_proto_TaskResponse_descriptor,
        new java.lang.String[] { "ErrMsg", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}