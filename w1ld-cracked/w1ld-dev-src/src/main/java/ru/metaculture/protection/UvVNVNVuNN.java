package ru.metaculture.protection;

import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import java.util.UUID;

public final class UvVNVNVuNN {
   private static final Object2FloatOpenHashMap<UUID> UuUVuuUu = new Object2FloatOpenHashMap();
   private static final Object2LongOpenHashMap<UUID> C00OOC00oO = new Object2LongOpenHashMap();
   private static final long uUnuvNvvNU = 160L;

   private UvVNVNVuNN() {
   }

   public static void UuUVuuUu(UUID var0, float var1) {
      if (var0 != null && Float.isFinite(var1)) {
         long var2 = System.currentTimeMillis();
         boolean var4 = var2 - C00OOC00oO.getLong(var0) > 160L;
         if (var4 || var1 < UuUVuuUu.getFloat(var0)) {
            UuUVuuUu.put(var0, var1);
         }

         C00OOC00oO.put(var0, var2);
      }
   }

   public static float C00OOC00oO(UUID var0, float var1) {
      return var0 != null && System.currentTimeMillis() - C00OOC00oO.getLong(var0) <= 160L ? Math.min(var1, UuUVuuUu.getFloat(var0)) : var1;
   }
}
