package org.zenith.config;

import org.zenith.core.ItemRegistry;
import org.zenith.module.Module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.InventoryCodec;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.TaskQueue;

import org.zenith.module.StreamerMode;
import org.zenith.module.TapeMouse;


import com.google.gson.JsonObject;
import java.util.Objects;
import java.util.UUID;

public class ProtoConfigCodeRevoke implements ProtocolMessage {
   public final UUID StreamerMode;
   public final UUID TapeMouse;

   public ProtoConfigCodeRevoke(UUID var1, UUID var2) {
      Objects.requireNonNull(var1, "configId");
      Objects.requireNonNull(var2, "codeId");
      this.StreamerMode = var1;
      this.TapeMouse = var2;
   }

   @Override
   public String type() {
      return "config.code.revoke";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = ConfigJsonUtil.ItemRegistry("configId", this.StreamerMode.toString());
      jsonobject.addProperty("codeId", this.TapeMouse.toString());
      return jsonobject;
   }

   public UUID PermissionListCodec() {
      return this.StreamerMode;
   }

   public UUID InventoryCodec() {
      return this.TapeMouse;
   }
}
