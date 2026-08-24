package org.zenith.config;

import org.zenith.module.Module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.PermissionListsStore;
import org.zenith.core.TaskQueue;
import org.zenith.managers.MotorIntentModel;

import org.zenith.module.AirStuck;
import org.zenith.module.AutoSprint;


import com.google.gson.JsonObject;

public class ProtoConfigListGet implements ProtocolMessage {
   public final int AirStuck;
   public final int AutoSprint;

   public ProtoConfigListGet(int var1, int var2) {
      this.AirStuck = var1;
      this.AutoSprint = var2;
   }

   @Override
   public String type() {
      return "config.list.get";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("offset", this.AirStuck);
      jsonobject.addProperty("limit", this.AutoSprint);
      return jsonobject;
   }

   public int MotorIntentModel() {
      return this.AirStuck;
   }

   public int PermissionListsStore() {
      return this.AutoSprint;
   }
}
