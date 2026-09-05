package ru.metaculture.protection;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_3532;

public final class VUUuVvvnNVUu implements O000c0oocoo {
   public static boolean UuUVuuUu() {
      return a_.field_1724 == null || a_.field_1687 == null;
   }

   public static boolean UuUVuuUu(double var0, double var2, double var4) {
      class_2338 var6 = class_2338.method_49637(var0, var2, var4);
      return a_.field_1687.method_8320(var6).method_26234(a_.field_1687, var6);
   }

   public static class_2248 UuUVuuUu(class_2338 var0) {
      return a_.field_1687.method_8320(var0).method_26204();
   }

   public static float UuUVuuUu(float var0) {
      double var1 = a_.field_1724.method_23317() - a_.field_1724.field_6038;
      double var3 = a_.field_1724.method_23321() - a_.field_1724.field_5989;
      float var5 = (float)(var1 * var1 + var3 * var3);
      float var6 = a_.field_1724.field_6220;
      float var7 = var6;
      if (var5 > 0.0025000002F) {
         var7 = (float)class_3532.method_15349(var3, var1) * 180.0F / (float) Math.PI - 90.0F;
      }

      if (a_.field_1724 != null && a_.field_1724.field_6251 > 0.0F) {
      }

      float var8 = class_3532.method_15393(var0 - (var6 + class_3532.method_15393(var7 - var6) * 0.3F));
      var8 = class_3532.method_15363(var8, -50.0F, 50.0F);
      var6 = var0 - var8;
      if (var8 * var8 > 2500.0F) {
         var6 += var8 * 0.2F;
      }

      return var6;
   }

   public static boolean C00OOC00oO() {
      class_238 var0 = a_.field_1724.method_5829();
      class_2338 var1 = a_.field_1724.method_24515();
      return C00OOC00oO(var1).stream().anyMatch(var1x -> UuUVuuUu(var0, var1x));
   }

   private static boolean UuUVuuUu(class_238 var0, class_2338 var1) {
      if (!a_.field_1687.method_8320(var1).method_27852(class_2246.field_10343)) {
         return false;
      } else {
         class_238 var2 = new class_238(var1);
         return var0.method_994(var2);
      }
   }

   private static List<class_2338> C00OOC00oO(class_2338 var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = var0.method_10263() - 2; var2 <= var0.method_10263() + 2; var2++) {
         for (int var3 = var0.method_10264() - 1; var3 <= var0.method_10264() + 4; var3++) {
            for (int var4 = var0.method_10260() - 2; var4 <= var0.method_10260() + 2; var4++) {
               var1.add(new class_2338(var2, var3, var4));
            }
         }
      }

      return var1;
   }

   public static List<class_2338> UuUVuuUu(class_2338 var0, float var1, float var2) {
      ArrayList var3 = new ArrayList();
      int var4 = var0.method_10263();
      int var5 = var0.method_10264();
      int var6 = var0.method_10260();

      for (int var7 = var4 - (int)var1; var7 <= var4 + (int)var1; var7++) {
         for (int var8 = var6 - (int)var1; var8 <= var6 + (int)var1; var8++) {
            for (int var9 = var5; var9 <= var5 + (int)var2; var9++) {
               var3.add(new class_2338(var7, var9, var8));
            }
         }
      }

      return var3;
   }

   public static boolean UuUVuuUu(class_2248 var0, class_2338 var1, float var2, float var3) {
      return UuUVuuUu(var1, var2, var3).stream().map(var0x -> a_.field_1687.method_8320(var0x).method_26204()).anyMatch(var1x -> var1x.equals(var0));
   }

   public static boolean UuUVuuUu(String var0) {
      if (var0 == null || var0.isEmpty()) {
         return false;
      } else if (!UuUVuuUu() && a_.method_1562() != null) {
         String var1 = null;
         if (a_.method_1558() != null) {
            var1 = a_.method_1558().field_3761;
         }

         if ((var1 == null || var1.isEmpty()) && a_.method_1562().method_48296() != null) {
            SocketAddress var2 = a_.method_1562().method_48296().method_10755();
            if (var2 != null) {
               var1 = var2.toString();
               if (var1.startsWith("/")) {
                  var1 = var1.substring(1);
               }
            }
         }

         if (a_.method_47392()) {
            var1 = "localhost";
         }

         return var1 != null && !var1.isEmpty() ? var1.toLowerCase().contains(var0.toLowerCase()) : false;
      } else {
         return false;
      }
   }

   @Generated
   private VUUuVvvnNVUu() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
