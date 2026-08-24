package org.zenith.config;

import org.zenith.core.ItemRegistry;
import org.zenith.core.CloudResponse;
import org.zenith.module.Module;

import org.zenith.core.TaskQueue;

import org.zenith.module.ItemUseController;


import com.google.gson.JsonObject;

public record ProtoChatGlobal(String ItemUseController) implements ProtocolMessage {

   public ProtoChatGlobal(String ItemUseController) {
      ItemUseController = ConfigJsonUtil.CloudResponse(ItemUseController);
      this.ItemUseController = ItemUseController;
   }

   @Override
   public String type() {
      return "chat.global.send";
   }

   @Override
   public JsonObject TaskQueue() {
      return ConfigJsonUtil.ItemRegistry("text", this.ItemUseController);
   }

   public String text() {
      return this.ItemUseController;
   }
}
