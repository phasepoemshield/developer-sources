package org.zenith.config;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.module.Module;
import org.zenith.rotation.Rotation;

import org.zenith.core.TaskQueue;

import org.zenith.rotation.RoundedRectEasing;

import org.zenith.module.WallBypass;


import com.google.gson.JsonObject;

public record ProtoFriendRemove(String WallBypass) implements ProtocolMessage {

   public ProtoFriendRemove(String WallBypass) {
      WallBypass = ConfigJsonUtil.ItemSpec(WallBypass, "friendUserId");
      this.WallBypass = WallBypass;
   }

   @Override
   public String type() {
      return "friends.remove";
   }

   @Override
   public JsonObject TaskQueue() {
      return ConfigJsonUtil.ItemRegistry("friendUserId", this.WallBypass);
   }

   public String RoundedRectEasing() {
      return this.WallBypass;
   }
}
