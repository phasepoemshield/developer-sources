package Nursultan;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class05216;

public class class11458 {
   private static String[] y;

   public static class05216 L(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, true, true);
   }

   public static class05216 L(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, true, true);
   }

   private class11458() {
      throw new UnsupportedOperationException(y[0]);
   }

   static {
      y();
      N();
   }

   public static class05216 u(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, false, false);
   }

   public static class05216 u(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, true, false);
   }

   private static void y() {
   }

   public static class05216 y(class00392 var0, String var1) {
      return u(var0, var1, class00392.i());
   }

   public static class05216 y(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, false, false);
   }

   public static class05216 y(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, true, false);
   }

   private static List<class11471> y(String var0, String var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      if (var1.isEmpty()) {
         return var3;
      } else {
         String var4 = var1.toLowerCase(Locale.ROOT);
         String var5 = var0.toLowerCase(Locale.ROOT);
         int var6 = 0;

         while (true) {
            int var7 = var5.indexOf(var4, var6);
            if (var7 < 0) {
               break;
            }

            int var8 = var7 + var4.length();
            var3.add(new class11471(var7, var8));
            if (!var2) {
               break;
            }

            var6 = var8;
         }

         return var3;
      }
   }

   public static class05216 y(class00392 var0, Pattern var1) {
      return y(var0, var1, class00392.i());
   }

   private static List<class11471> N(String var0, Pattern var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      Matcher var4 = var1.matcher(var0);

      while (var4.find()) {
         var3.add(new class11471(var4.start(), var4.end()));
         if (!var2) {
            break;
         }
      }

      return var3;
   }

   private static void N(class05216 var0, List<class11468> var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = 0;

         for (class11468 var6 : var1) {
            int var8 = var4 + var6.N().length();
            if (var8 <= var2) {
               var4 = var8;
            } else {
               if (var4 >= var3) {
                  break;
               }

               int var9 = Math.max(var2, var4) - var4;
               int var10 = Math.min(var3, var8) - var4;
               if (var9 < var10) {
                  var0.y(class00392.y(var6.N().substring(var9, var10)).y(var6.y()));
               }

               var4 = var8;
            }
         }
      }
   }

   private static class00405 N(List<class11468> var0, int var1) {
      int var2 = 0;

      for (class11468 var4 : var0) {
         int var5 = var2 + var4.N().length();
         if (var1 < var5) {
            return var4.y();
         }

         var2 = var5;
      }

      return class00405.N;
   }

   private static class05216 N(List<class11468> var0, int var1, List<class11471> var2, class00392 var3, boolean var4) {
      class05216 var5 = class00392.i();
      int var6 = 0;

      for (class11471 var8 : var2) {
         if (var8.y() > var6) {
            N(var5, var0, var6, var8.y());
         }

         if (!var3.getString().isEmpty()) {
            class05216 var9 = var3.L();
            if (var4) {
               class00405 var10 = N(var0, var8.y());
               var9.y(var10);
               if (!var3.method_10866().B()) {
                  var9.L(var3.method_10866());
               }
            }

            var5.y(var9);
         }

         var6 = var8.N();
      }

      if (var6 < var1) {
         N(var5, var0, var6, var1);
      }

      return var5;
   }

   public static class05216 N(class00392 var0, Pattern var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> N(var1x, var1, var2x), var2, false, true);
   }

   private static void N() {
      y = new String[1];
      y[0] = "This is a utility class and cannot be instantiated";
   }

   public static class05216 N(class00392 var0, String var1, class00392 var2) {
      return N(var0, (var1x, var2x) -> y(var1x, var1, var2x), var2, false, true);
   }

   public static class05216 N(class00392 var0, String var1) {
      return y(var0, var1, class00392.i());
   }

   private static class05216 N(class00392 var0, class11486 var1, class00392 var2, boolean var3, boolean var4) {
      ArrayList var5 = new ArrayList();
      N(var0, var5);
      StringBuilder var6 = new StringBuilder();

      for (class11468 var8 : var5) {
         var6.append(var8.N());
      }

      String var9 = var6.toString();
      List<class11471> var8 = var1.collect(var9, var3);
      return var8.isEmpty() ? var0.L() : N(var5, var9.length(), var8, var2, var4);
   }

   public static class05216 N(class00392 var0, Pattern var1) {
      return u(var0, var1, class00392.i());
   }

   private static void N(class00392 var0, List<class11468> var1) {
      if (var0.method_10851() instanceof class01751 var2) {
         String var5 = var2.comp_737();
         if (var5 != null && !var5.isEmpty()) {
            var1.add(new class11468(var5, var0.method_10866()));
         }
      }

      for (class00392 var6 : var0.method_10855()) {
         N(var6, var1);
      }
   }
}
