package org.zenith.config;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.module.Module;

import org.zenith.core.PlayerStateService;
import org.zenith.core.TaskQueue;

import org.zenith.module.ShulkerPreview;


import com.google.gson.JsonObject;

public record ProtoCodeRedeem(String ShulkerPreview) implements ProtocolMessage {

   public ProtoCodeRedeem(String ShulkerPreview) {
      ShulkerPreview = ConfigJsonUtil.ItemSpec(ShulkerPreview, "code");
      this.ShulkerPreview = ShulkerPreview;
   }

   @Override
   public String type() {
      return "config.code.redeem";
   }

   @Override
   public JsonObject TaskQueue() {
      return ConfigJsonUtil.ItemRegistry("code", this.ShulkerPreview);
   }

   public String PlayerStateService() {
      return this.ShulkerPreview;
   }
}
