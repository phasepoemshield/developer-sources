package org.zenith.util;

import org.zenith.module.TargetESP;
import org.zenith.module.TotemParticles;

import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ItemExt2_Var143
   implements JsonDeserializer<ItemExt2_Var159>,
   JsonSerializer<ItemExt2_Var159> {
   public ItemExt2_Var143() {
   }

   @Override
   public JsonElement serialize(ItemExt2_Var159 var1, Type var2, JsonSerializationContext var3) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("name", var1.name());
      jsonobject.addProperty("key", var1.TargetESP());
      jsonobject.addProperty("command", var1.TotemParticles());
      return jsonobject;
   }

   @Override
   public ItemExt2_Var159 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = var1.getAsJsonObject();
      String s = getString(jsonobject, "name", "");
      int i = getInt(jsonobject, "key");
      String s1 = getString(jsonobject, "command", "");
      return new ItemExt2_Var159(s, i, s1);
   }

   public static String getString(JsonObject var0, String var1, String var2) {
      JsonElement jsonelement = var0.get(var1);
      return jsonelement != null && !jsonelement.isJsonNull() ? jsonelement.getAsString() : var2;
   }

   public static int getInt(JsonObject var0, String var1) {
      JsonElement jsonelement = var0.get(var1);
      if (jsonelement != null && !jsonelement.isJsonNull()) {
         return jsonelement.getAsInt();
      } else {
         throw new JsonParseException("Missing key " + var1);
      }
   }
}
