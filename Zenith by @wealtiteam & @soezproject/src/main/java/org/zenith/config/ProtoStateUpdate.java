package org.zenith.config;

import org.zenith.core.Easing;
import org.zenith.module.Module;

import org.zenith.core.MenuEaseE;
import org.zenith.core.TaskQueue;

import org.zenith.module.AutoBrewing;


import com.google.gson.JsonObject;

public record ProtoStateUpdate(JsonObject AutoBrewing) implements ProtocolMessage {

   public ProtoStateUpdate(JsonObject AutoBrewing) {
      AutoBrewing = ConfigJsonUtil.Easing(AutoBrewing, "state");
      this.AutoBrewing = AutoBrewing;
   }

   @Override
   public String type() {
      return "player.state.update";
   }

   @Override
   public JsonObject TaskQueue() {
      return this.AutoBrewing.deepCopy();
   }

   public JsonObject MenuEaseE() {
      return this.AutoBrewing;
   }
}
