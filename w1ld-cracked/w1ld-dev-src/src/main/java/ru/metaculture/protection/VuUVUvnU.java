package ru.metaculture.protection;

import java.util.Optional;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class VuUVUvnU implements O000c0oocoo {
   public static class_3966 UuUVuuUu(class_1297 var0, class_243 var1, class_243 var2, class_238 var3, Predicate<class_1297> var4, double var5) {
      class_1937 var7 = var0.method_37908();
      double var8 = var5;
      class_1297 var10 = null;
      class_243 var11 = null;

      for (class_1297 var13 : var7.method_8333(var0, var3, var4)) {
         class_238 var14 = var13.method_5829().method_1014(var13.method_5871());
         Optional var15 = var14.method_992(var1, var2);
         if (var14.method_1006(var1) || var15.isPresent()) {
            double var16 = var15.<Double>map(var1::method_1025).orElse(0.0);
            var16 = Math.sqrt(var16);
            if ((var16 < var8 || var8 == 0.0) && var13.method_5668() != var0.method_5668()) {
               var10 = var13;
               var11 = var15.orElse(var1);
               var8 = var16;
            }
         }
      }

      return var10 == null ? null : new class_3966(var10, var11);
   }

   public static class_239 UuUVuuUu(double var0, float var2, float var3, class_1297 var4, boolean var5) {
      float var6 = a_.method_61966().method_60637(true);
      class_243 var7 = a_.field_1724.method_5836(var6);
      class_243 var8 = UuUVuuUu(var3, var2);
      class_243 var9 = var7.method_1019(var8.method_1021(var0));
      class_239 var10 = UuUVuuUu(var7, var9, class_3960.field_17558, class_242.field_1348);
      double var11 = var10.method_17784().method_1025(var7);
      class_238 var13 = var4.method_5829().method_18804(var8.method_1021(var0)).method_1014(1.0);
      class_3966 var14 = class_1675.method_18075(
         var4, var7, var9, var13, var0x -> !var0x.method_7325() && var0x.method_5805() && var0x.method_5863(), var0 * var0
      );
      return (class_239)(var14 == null || !var5 && !(var14.method_17784().method_1025(var7) < var11) ? var10 : var14);
   }

   public static boolean UuUVuuUu(float var0, float var1, double var2, class_1297 var4) {
      float var5 = a_.method_61966().method_60637(true);
      class_243 var6 = a_.field_1724.method_5836(var5);
      class_243 var7 = UuUVuuUu(var1, var0);
      class_243 var8 = var6.method_1019(var7.method_1021(var2));
      class_238 var9 = var4.method_5829();
      return var9.method_1006(var6) || var9.method_992(var6, var8).isPresent();
   }

   public static boolean UuUVuuUu(float var0, float var1, double var2, class_1297 var4, boolean var5) {
      return C00OOC00oO(var0, var1, var2, var4, var5) != null;
   }

   public static class_3966 C00OOC00oO(float var0, float var1, double var2, class_1297 var4, boolean var5) {
      if (a_.field_1724 != null && a_.field_1687 != null && var4 != null) {
         return UuUVuuUu(var2, var0, var1, a_.field_1724, var5) instanceof class_3966 var7 && var7.method_17782().equals(var4) ? var7 : null;
      } else {
         return null;
      }
   }

   public static boolean C00OOC00oO(float var0, float var1, double var2, class_1297 var4) {
      return uUnuvNvvNU(var0, var1, var2, var4, true);
   }

   public static boolean uUnuvNvvNU(float var0, float var1, double var2, class_1297 var4, boolean var5) {
      if (a_.field_1724 != null && a_.field_1687 != null && var4 != null) {
         class_243 var6 = a_.field_1724.method_33571();
         class_243 var7 = UuUVuuUu(var1, var0);
         class_243 var8 = var6.method_1019(var7.method_1021(var2));
         class_238 var9 = var4.method_5829().method_1014(var4.method_5871());
         Optional var10 = var9.method_992(var6, var8);
         if (var9.method_1006(var6)) {
            return true;
         } else if (var10.isEmpty()) {
            return false;
         } else if (var5) {
            return true;
         } else {
            class_239 var11 = UuUVuuUu(var6, var8, class_3960.field_17558, class_242.field_1348);
            return var11.method_17783() == class_240.field_1333 || ((class_243)var10.get()).method_1025(var6) < var11.method_17784().method_1025(var6);
         }
      } else {
         return false;
      }
   }

   public static class_243 UuUVuuUu(float var0, float var1) {
      float var2 = -var1 * (float) (Math.PI / 180.0) - (float) Math.PI;
      float var3 = -var0 * (float) (Math.PI / 180.0);
      float var4 = class_3532.method_15362(var2);
      float var5 = class_3532.method_15374(var2);
      float var6 = -class_3532.method_15362(var3);
      float var7 = class_3532.method_15374(var3);
      return new class_243(var5 * var6, var7, var4 * var6);
   }

   public static class_239 UuUVuuUu(class_243 var0, class_243 var1, class_3960 var2, class_242 var3) {
      return a_.field_1687.method_17742(new class_3959(var0, var1, var2, var3, a_.field_1724));
   }

   public static class_243 C00OOC00oO(float var0, float var1) {
      float var2 = (float)(var1 * (Math.PI / 180.0));
      float var3 = (float)(-var0 * (Math.PI / 180.0));
      float var4 = class_3532.method_15362(var3);
      float var5 = class_3532.method_15374(var3);
      float var6 = class_3532.method_15362(var2);
      float var7 = class_3532.method_15374(var2);
      return new class_243(var5 * var6, -var7, var4 * var6);
   }

   @Generated
   private VuUVUvnU() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
