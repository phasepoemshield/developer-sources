package ru.metaculture.protection;

import java.util.Arrays;
import net.minecraft.class_2960;

public final class UNnnUuUuuNuN {
   public static final int UuUVuuUu = 48;
   private static final class_2960[] C00OOC00oO = new class_2960[NNNunUNVuv.NVnVnNnN.values().length];
   private static final int[] uUnuvNvvNU = new int[C00OOC00oO.length];
   private static final int[] vVvUvVVuuNvV = new int[C00OOC00oO.length];
   private static final long[] uNNnnnuuuN = new long[C00OOC00oO.length];
   private static final long nuUnNvnuUu = 250000000L;

   private UNnnUuUuuNuN() {
   }

   public static int UuUVuuUu(NNNunUNVuv.NVnVnNnN var0) {
      return UuUVuuUu(var0, 48);
   }

   public static int UuUVuuUu(NNNunUNVuv.NVnVnNnN var0, int var1) {
      int var2 = var0.ordinal();
      class_2960 var3 = C00OOC00oO[var2];
      if (var3 == null) {
         return -1;
      } else {
         int var4 = UuUVuuUu(var1);
         int var5 = uUnuvNvvNU[var2];
         if (vVvUvVVuuNvV[var2] == var4 && var5 > 0) {
            return var5;
         } else {
            long var6 = System.nanoTime();
            if (vVvUvVVuuNvV[var2] == var4 && var6 < uNNnnnuuuN[var2]) {
               return -1;
            } else {
               int var8 = COCc00CCc.UuUVuuUu(var3, var4, true);
               if (var8 > 0) {
                  vVvUvVVuuNvV[var2] = var4;
                  uUnuvNvvNU[var2] = var8;
                  uNNnnnuuuN[var2] = 0L;
                  return var8;
               } else {
                  vVvUvVVuuNvV[var2] = var4;
                  uUnuvNvvNU[var2] = 0;
                  uNNnnnuuuN[var2] = var6 + 250000000L;
                  return -1;
               }
            }
         }
      }
   }

   public static void UuUVuuUu() {
      UuUVuuUu(NNNunUNVuv.NVnVnNnN.MATRIX, 48);
      UuUVuuUu(NNNunUNVuv.NVnVnNnN.GRIM, 48);
   }

   private static int UuUVuuUu(int var0) {
      return Math.max(8, Math.min(512, var0));
   }

   public static void C00OOC00oO() {
      Arrays.fill(uUnuvNvvNU, 0);
      Arrays.fill(vVvUvVVuuNvV, 0);
      Arrays.fill(uNNnnnuuuN, 0L);
   }

   static {
      C00OOC00oO[NNNunUNVuv.NVnVnNnN.MATRIX.ordinal()] = class_2960.method_60654(NNNunUNVuv.NVnVnNnN.MATRIX.C00OOC00oO());
      C00OOC00oO[NNNunUNVuv.NVnVnNnN.GRIM.ordinal()] = class_2960.method_60654(NNNunUNVuv.NVnVnNnN.GRIM.C00OOC00oO());
   }
}
