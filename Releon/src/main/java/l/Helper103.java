package l;

import fat.releon.Releon;
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Helper103 {
   private static final Map<Helper102, Helper175> fontCache = new HashMap<>();

   public Helper103() {
   }

   public static Helper175 method925(float var0, String var1) {
      try {
         String var2 = "assets/minecraft/fonts/" + var1 + ".ttf";

         Helper175 var5;
         try (InputStream var3 = Objects.requireNonNull(Releon.class.getClassLoader().getResourceAsStream(var2))) {
            Font var4 = Font.createFont(0, var3).deriveFont(var0 / 2.0F);
            var5 = new Helper175(var4, var0 / 2.0F);
         }

         return var5;
      } catch (Throwable var8) {
         throw new RuntimeException(var8);
      }
   }

   public static void init() {
      for (Helper101 var3 : Helper101.values()) {
         for (int var4 = 4; var4 <= 32; var4++) {
            fontCache.put(new Helper102(var4, var3), method925(var4, var3.method921()));
         }
      }
   }

   public static Helper175 method926(int var0) {
      return method927(var0, Helper101.INST);
   }

   public static Helper175 method927(int var0, Helper101 var1) {
      return fontCache.computeIfAbsent(new Helper102(var0, var1), var2 -> method925(var0, var1.method921()));
   }
}
