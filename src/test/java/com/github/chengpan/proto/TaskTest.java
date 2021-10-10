package com.github.chengpan.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.Test;
import com.google.protobuf.util.JsonFormat;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    void serialize() throws InvalidProtocolBufferException {
     var task = Task.newBuilder()
             .setId("ship/123")
             .putMeta("name", "maria")
             .putMeta("age", "23")
             .setBlob(ByteString.copyFrom(new byte[]{(byte)11, (byte)22, (byte)33}))
             .setConsumerId("com.github.chengpan.consumer.callback")
             .setCallbackUrl("http://127.0.0.1/endpoint")
             .setSenderId("com.github.chengpan.sender.job")
             .build();

     var taskStr = JsonFormat.printer().print(task);

     var builder = Task.newBuilder();
     JsonFormat.parser().merge(taskStr, builder);
     
     var task2 = builder.build();
     assertEquals(task2, task);
    }
}