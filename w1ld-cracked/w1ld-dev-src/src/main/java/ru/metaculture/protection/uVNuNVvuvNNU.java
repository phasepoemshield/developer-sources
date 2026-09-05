package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class uVNuNVvuvNNU {
   public static final long UuUVuuUu = 1L;
   public static final long C00OOC00oO = 2L;
   public static final long uUnuvNvvNU = 3L;
   private static final long vVvUvVVuuNvV = 0L;
   private static final long uNNnnnuuuN = 2L;
   private static final Map<Long, uVNuNVvuvNNU.NVnVnNnN> nuUnNvnuUu = new HashMap<>();
   private static long VVuuUN;
   private static long vNUvnnVnUvu;
   private static long uVUuuVnNVU;
   private static float vuuuNvNuv;

   private uVNuNVvuvNNU() {
   }

   public static void UuUVuuUu() {
      VVuuUN++;
      Iterator var0 = nuUnNvnuUu.entrySet().iterator();

      while (var0.hasNext()) {
         Entry var1 = (Entry)var0.next();
         if (VVuuUN - ((uVNuNVvuvNNU.NVnVnNnN)var1.getValue()).uVUuuVnNVU > 2L) {
            if (uVUuuVnNVU == (Long)var1.getKey()) {
               uVUuuVnNVU = 0L;
            }

            var0.remove();
         }
      }
   }

   public static float UuUVuuUu(
      long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, uVNuNVvuvNNU.nvnNNunvv var11
   ) {
      if (var0 != 0L && var11 != null) {
         uVNuNVvuvNNU.NVnVnNnN var12 = nuUnNvnuUu.computeIfAbsent(var0, var0x -> new uVNuNVvuvNNU.NVnVnNnN());
         long var13 = System.currentTimeMillis();
         float var15 = var12.nvUVNnuu == 0L ? 16.0F : Math.min(80.0F, Math.max(1.0F, (float)(var13 - var12.nvUVNnuu)));
         var12.UuUVuuUu = var2;
         var12.C00OOC00oO = var3;
         var12.uUnuvNvvNU = var4;
         var12.vVvUvVVuuNvV = var5;
         var12.uNNnnnuuuN = var6;
         var12.nuUnNvnuUu = var7;
         var12.VVuuUN = Math.max(2.0F, var8);
         var12.vNUvnnVnUvu = var11;
         var12.uVUuuVnNVU = VVuuUN;
         var12.vuuuNvNuv = ++vNUvnnVnUvu;
         var12.nvUVNnuu = var13;
         boolean var16 = uVUuuVnNVU == var0;
         boolean var17 = var16 || UuUVuuUu(var12, var9, var10) != 0;
         float var18 = var16 ? 1.0F : (var17 ? 0.55F : 0.0F);
         float var19 = var18 > var12.UuuNnUvUuv ? 90.0F : 260.0F;
         var12.UuuNnUvUuv = UUNnvUVnnnnN.C00OOC00oO(var12.UuuNnUvUuv, var18, var15, var19);
         return var12.UuuNnUvUuv;
      } else {
         return 0.0F;
      }
   }

   public static boolean UuUVuuUu(long var0) {
      return var0 != 0L && uVUuuVnNVU == var0;
   }

   public static boolean UuUVuuUu(float var0, float var1) {
      return UuUVuuUu(var0, var1, 0);
   }

   public static boolean UuUVuuUu(float var0, float var1, NNnNvVnvu.uunvUUVnuNn var2) {
      int var3 = var2 == NNnNvVnvu.uunvUUVnuNn.THEME ? 2 : (var2 == NNnNvVnvu.uunvUUVnuNn.MAIN ? 1 : 0);
      return UuUVuuUu(var0, var1, var3);
   }

   private static boolean UuUVuuUu(float var0, float var1, int var2) {
      long var3 = 0L;
      uVNuNVvuvNNU.NVnVnNnN var5 = null;
      int var6 = 0;

      for (Entry var8 : nuUnNvnuUu.entrySet()) {
         long var9 = (Long)var8.getKey();
         if ((var2 != 2 || var9 == 2L) && (var2 != 1 || var9 == 1L || var9 == 3L)) {
            uVNuNVvuvNNU.NVnVnNnN var11 = (uVNuNVvuvNNU.NVnVnNnN)var8.getValue();
            if (UuUVuuUu(var11) && var11.vNUvnnVnUvu != null) {
               int var12 = UuUVuuUu(var11, var0, var1);
               if (var12 != 0 && (var5 == null || var11.vuuuNvNuv > var5.vuuuNvNuv)) {
                  var5 = var11;
                  var3 = var9;
                  var6 = var12;
               }
            }
         }
      }

      if (var5 == null) {
         return false;
      } else {
         uVUuuVnNVU = var3;
         if (var6 == 1) {
            vuuuNvNuv = var1 - var5.uNNnnnuuuN;
         } else {
            vuuuNvNuv = var5.nuUnNvnuUu * 0.5F;
            UuUVuuUu(var5, var1);
         }

         return true;
      }
   }

   public static boolean C00OOC00oO(float var0, float var1) {
      if (uVUuuVnNVU == 0L) {
         return false;
      } else {
         uVNuNVvuvNNU.NVnVnNnN var2 = nuUnNvnuUu.get(uVUuuVnNVU);
         if (var2 != null && var2.vNUvnnVnUvu != null && UuUVuuUu(var2)) {
            UuUVuuUu(var2, var1);
            return true;
         } else {
            uVUuuVnNVU = 0L;
            return false;
         }
      }
   }

   public static boolean C00OOC00oO() {
      boolean var0 = uVUuuVnNVU != 0L;
      uVUuuVnNVU = 0L;
      return var0;
   }

   public static void uUnuvNvvNU() {
      uVUuuVnNVU = 0L;
      vNUvnnVnUvu = 0L;
      nuUnNvnuUu.clear();
   }

   public static void vVvUvVVuuNvV() {
      if (uVUuuVnNVU == 0L) {
         nuUnNvnuUu.clear();
      }
   }

   private static boolean UuUVuuUu(uVNuNVvuvNNU.NVnVnNnN var0) {
      return VVuuUN - var0.uVUuuVnNVU <= 0L;
   }

   private static void UuUVuuUu(uVNuNVvuvNNU.NVnVnNnN var0, float var1) {
      float var2 = Math.max(1.0F, var0.vVvUvVVuuNvV - var0.nuUnNvnuUu);
      float var3 = (var1 - vuuuNvNuv - var0.C00OOC00oO) / var2;
      var0.vNUvnnVnUvu.applyRatio(Math.max(0.0F, Math.min(1.0F, var3)));
   }

   private static int UuUVuuUu(uVNuNVvuvNNU.NVnVnNnN var0, float var1, float var2) {
      if (!(var0.uUnuvNvvNU <= 0.0F) && !(var0.vVvUvVVuuNvV <= 0.0F)) {
         float var3 = var0.VVuuUN;
         if (var1 < var0.UuUVuuUu - var3 || var1 > var0.UuUVuuUu + var0.uUnuvNvvNU + var3) {
            return 0;
         } else if (!(var2 < var0.C00OOC00oO - var3 * 0.5F) && !(var2 > var0.C00OOC00oO + var0.vVvUvVVuuNvV + var3 * 0.5F)) {
            float var4 = Math.min(var3, 4.0F);
            return var2 >= var0.uNNnnnuuuN - var4 && var2 <= var0.uNNnnnuuuN + var0.nuUnNvnuUu + var4 ? 1 : 2;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   static final class NVnVnNnN {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      uVNuNVvuvNNU.nvnNNunvv vNUvnnVnUvu;
      long uVUuuVnNVU;
      long vuuuNvNuv;
      long nvUVNnuu;
      float UuuNnUvUuv;
   }

   @FunctionalInterface
   public interface nvnNNunvv {
      void applyRatio(float var1);
   }
}
