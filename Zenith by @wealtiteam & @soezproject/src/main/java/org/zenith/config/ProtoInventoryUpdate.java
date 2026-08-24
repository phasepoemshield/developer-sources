package org.zenith.config;

import org.zenith.core.Easing;
import org.zenith.module.Module;

import org.zenith.core.MenuEaseA;
import org.zenith.core.TaskQueue;

import org.zenith.module.AutoMine;


import com.google.gson.JsonObject;

public record ProtoInventoryUpdate(JsonObject AutoMine) implements ProtocolMessage {

   public ProtoInventoryUpdate(JsonObject AutoMine) {
      AutoMine = ConfigJsonUtil.Easing(AutoMine, "inventory");
      this.AutoMine = AutoMine;
   }

   @Override
   public String type() {
      return "player.inventory.update";
   }

   @Override
   public JsonObject TaskQueue() {
      return this.AutoMine.deepCopy();
   }

   public JsonObject MenuEaseA() {
      return this.AutoMine;
   }
}
