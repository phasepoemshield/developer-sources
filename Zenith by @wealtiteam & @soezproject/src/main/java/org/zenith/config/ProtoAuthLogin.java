package org.zenith.config;

import org.zenith.core.ItemSpec;
import org.zenith.module.Module;
import org.zenith.rotation.Rotation;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.TaskQueue;

import org.zenith.rotation.RotationEasing;

import org.zenith.module.FakePlayer;


import com.google.gson.JsonObject;

public class ProtoAuthLogin implements ProtocolMessage {
   public final String FakePlayer;

   public ProtoAuthLogin(String var1) {
      var1 = ConfigJsonUtil.ItemSpec(var1, "accessToken");
      this.FakePlayer = var1;
   }

   @Override
   public String type() {
      return "auth.login";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("accessToken", this.FakePlayer);
      return jsonobject;
   }

   public String RotationEasing() {
      return this.FakePlayer;
   }
}
