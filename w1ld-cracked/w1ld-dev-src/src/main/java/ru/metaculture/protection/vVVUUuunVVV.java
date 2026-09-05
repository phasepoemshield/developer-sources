package ru.metaculture.protection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class vVVUUuunVVV {
   private static final int UuUVuuUu = 4096;
   private static final Map<vVVUUuunVVV.NVnVnNnN, vVVUUuunVVV.nvnNNunvv> C00OOC00oO = new LinkedHashMap<vVVUUuunVVV.NVnVnNnN, vVVUUuunVVV.nvnNNunvv>(
      1024, 0.75F, true
   ) {
      @Override
      protected boolean removeEldestEntry(Entry<vVVUUuunVVV.NVnVnNnN, vVVUUuunVVV.nvnNNunvv> var1) {
         return this.size() > 4096;
      }
   };

   private vVVUUuunVVV() {
   }

   public static vVVUUuunVVV.nvnNNunvv UuUVuuUu(nUVnuvUu var0, String var1, float var2) {
      if (var1 == null) {
         var1 = "";
      }

      vVVUUuunVVV.NVnVnNnN var3 = new vVVUUuunVVV.NVnVnNnN(var0, var1, Float.floatToIntBits(var2));
      vVVUUuunVVV.nvnNNunvv var4 = C00OOC00oO.get(var3);
      if (var4 != null) {
         return var4;
      } else {
         VuuUvnvnuu.nvnNNunvv var5 = UnVNvNnU.UuUVuuUu(var0, var1, var2);
         var4 = new vVVUUuunVVV.nvnNNunvv(var5.UuUVuuUu, var5.C00OOC00oO);
         C00OOC00oO.put(var3, var4);
         return var4;
      }
   }

   public static float C00OOC00oO(nUVnuvUu var0, String var1, float var2) {
      return UuUVuuUu(var0, var1, var2).UuUVuuUu;
   }

   public static float uUnuvNvvNU(nUVnuvUu var0, String var1, float var2) {
      return UuUVuuUu(var0, var1, var2).C00OOC00oO;
   }

   public static void UuUVuuUu() {
      C00OOC00oO.clear();
   }

   record NVnVnNnN(nUVnuvUu font, String text, int sizeBits) {
   }

   public static final class nvnNNunvv {
      public final float UuUVuuUu;
      public final float C00OOC00oO;

      nvnNNunvv(float var1, float var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
