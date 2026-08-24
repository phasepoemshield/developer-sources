package org.zenith.config;

import org.zenith.core.ItemSpec;
import org.zenith.module.Module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.GmmModel;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.PermissionListsStore;
import org.zenith.core.TaskQueue;
import org.zenith.managers.MotorIntentModel;

import org.zenith.module.PathTeleport;
import org.zenith.module.PvpSafe;
import org.zenith.module.ServerHelper;


import com.google.gson.JsonObject;

public class ProtoConfigCatalogGet implements ProtocolMessage {
   public final String PathTeleport;
   public final int PvpSafe;
   public final int ServerHelper;

   public ProtoConfigCatalogGet(String var1, int var2, int var3) {
      var1 = ConfigJsonUtil.ItemSpec(var1, "scope");
      this.PathTeleport = var1;
      this.PvpSafe = var2;
      this.ServerHelper = var3;
   }

   @Override
   public String type() {
      return "config.catalog.get";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("scope", this.PathTeleport);
      jsonobject.addProperty("offset", this.PvpSafe);
      jsonobject.addProperty("limit", this.ServerHelper);
      return jsonobject;
   }

   public String GmmModel() {
      return this.PathTeleport;
   }

   public int MotorIntentModel() {
      return this.PvpSafe;
   }

   public int PermissionListsStore() {
      return this.ServerHelper;
   }
}
