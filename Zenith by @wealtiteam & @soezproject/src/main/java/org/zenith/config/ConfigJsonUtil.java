package org.zenith.config;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.CloudResponse;
import org.zenith.ZenithClient;

import com.google.gson.JsonObject;
import java.util.Locale;
import java.util.Objects;

public final class ConfigJsonUtil {
   public ConfigJsonUtil() {
   }

   public static JsonObject ItemRegistry(String var0, String var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty(var0, var1);
      return jsonobject;
   }

   public static void on23(JsonObject var0, String var1, String var2) {
      if (var2 != null && !var2.isBlank()) {
         var0.addProperty(var1, var2);
      }
   }

   public static String ConfigJsonUtil(String var0) {
      String s = ItemSpec(var0, "name").strip();
      return s.toLowerCase(Locale.ROOT).endsWith(".zenith") ? s : s + ".zenith";
   }

   public static JsonObject Easing(JsonObject var0, String var1) {
      return Objects.requireNonNull(var0, var1).deepCopy();
   }

   public static String ItemSpec(String var0, String var1) {
      if (var0 != null && !var0.isBlank()) {
         return var0;
      } else {
         throw new IllegalArgumentException(var1 + " is required");
      }
   }

   public static String CloudResponse(String var0) {
      String s = ItemSpec(var0, "text").strip();
      int i = s.codePointCount(0, s.length());
      if (i <= 512 && !s.codePoints().anyMatch(Character::isISOControl)) {
         return s;
      } else {
         throw new IllegalArgumentException("text must contain 1..512 printable characters");
      }
   }
}
