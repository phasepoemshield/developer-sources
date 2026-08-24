package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.config.ProtocolMessage;
import org.zenith.ZenithClient;

import org.zenith.module.EventTracker;


import com.google.gson.JsonObject;
import java.util.Objects;
import java.util.UUID;

public final class AnalyticsTracker {
   public static final int EventTracker = 3;

   public AnalyticsTracker() {
   }

   public static String on23(UUID var0, ProtocolMessage var1) {
      Objects.requireNonNull(var0, "id");
      Objects.requireNonNull(var1, "packet");
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("v", 3);
      jsonobject.addProperty("type", var1.type());
      jsonobject.addProperty("id", var0.toString());
      jsonobject.add("payload", var1.TaskQueue());
      return jsonobject.toString();
   }
}
