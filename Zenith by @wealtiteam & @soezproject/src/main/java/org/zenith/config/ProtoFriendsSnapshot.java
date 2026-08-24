package org.zenith.config;

import org.zenith.core.TaskQueue;

import com.google.gson.JsonObject;

public class ProtoFriendsSnapshot implements ProtocolMessage {
   @Override
   public String type() {
      return "friends.snapshot.get";
   }

   @Override
   public JsonObject TaskQueue() {
      return new JsonObject();
   }
}
