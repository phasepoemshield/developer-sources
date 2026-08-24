package org.zenith.config;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.core.CloudResponse;
import org.zenith.module.Module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.MotorPolicyNet;
import org.zenith.core.TaskQueue;

import org.zenith.module.ItemDebug;
import org.zenith.module.ItemScroller;


import com.google.gson.JsonObject;

public class ProtoChatDirect implements ProtocolMessage {
   public final String ItemDebug;
   public final String ItemScroller;

   public ProtoChatDirect(String var1, String var2) {
      var1 = ConfigJsonUtil.ItemSpec(var1, "recipientUserId");
      var2 = ConfigJsonUtil.CloudResponse(var2);
      this.ItemDebug = var1;
      this.ItemScroller = var2;
   }

   @Override
   public String type() {
      return "chat.direct.send";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = ConfigJsonUtil.ItemRegistry("recipientUserId", this.ItemDebug);
      jsonobject.addProperty("text", this.ItemScroller);
      return jsonobject;
   }

   public String MotorPolicyNet() {
      return this.ItemDebug;
   }

   public String text() {
      return this.ItemScroller;
   }
}
