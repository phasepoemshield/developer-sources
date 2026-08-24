package org.zenith.config;

import org.zenith.core.ItemSpec;
import org.zenith.module.Module;
import org.zenith.rotation.Rotation;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.MenuEaseB;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.TaskQueue;

import org.zenith.rotation.RotationStrategyBase;

import org.zenith.module.Timer;
import org.zenith.module.Velocity;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class ProtoHello implements ProtocolMessage {
   public final String Timer;
   public final List<String> Velocity;

   public ProtoHello(String var1, List<String> var2) {
      var1 = ConfigJsonUtil.ItemSpec(var1, "clientVersion");
      var2 = var2 == null ? List.of() : List.copyOf(var2);
      this.Timer = var1;
      this.Velocity = var2;
   }

   @Override
   public String type() {
      return "connection.hello";
   }

   @Override
   public JsonObject TaskQueue() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("clientVersion", this.Timer);
      JsonArray jsonarray = new JsonArray();
      this.Velocity.forEach(jsonarray::add);
      jsonobject.add("capabilities", jsonarray);
      return jsonobject;
   }

   public String RotationStrategyBase() {
      return this.Timer;
   }

   public List<String> MenuEaseB() {
      return this.Velocity;
   }
}
