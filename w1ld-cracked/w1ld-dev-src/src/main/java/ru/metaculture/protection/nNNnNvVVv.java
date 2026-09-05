package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;

public final class nNNnNvVVv {
   private static final int UuUVuuUu = 262144;
   private static final class_9799 C00OOC00oO = new class_9799(262144);
   private static final class_4598 uUnuvNvvNU = class_4597.method_22991(C00OOC00oO);

   private nNNnNvVVv() {
   }

   public static class_4598 UuUVuuUu() {
      return uUnuvNvvNU;
   }

   public static boolean UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_22683() != null) {
         class_1041 var1 = var0.method_22683();
         return !var1.method_65966() && var1.method_4489() > 0 && var1.method_4506() > 0;
      } else {
         return false;
      }
   }

   public static void C00OOC00oO() {
      uUnuvNvvNU.method_22993();
      C00OOC00oO.method_60809();
   }
}
