package Nursultan;

import java.util.ArrayList;
import java.util.List;

public abstract class class11526 {
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;

   static {
      i();
   }

   private static void i() {
      y_0 = 200;
      y_1 = 100;
      y_2 = 50;
      y_3 = 20;
      y_4 = 5;
      y_5 = 0;
   }

   public List<String> N(List<String> var1, String var2) {
      ArrayList var3 = new ArrayList(var1.size() + 1);
      var3.addAll(var1);
      var3.add(var2);
      return var3;
   }

   public int N(String var1, String var2, int var3) {
      int var4 = var1.length();
      int var5 = var2.length();
      if (Math.abs(var4 - var5) > var3) {
         return var3 + 1;
      } else if (var4 == 0) {
         return var5;
      } else if (var5 == 0) {
         return var4;
      } else {
         int[][] var6 = new int[var4 + 1][var5 + 1];
         int var7 = 0;

         while (var7 <= var4) {
            var6[var7][0] = var7++;
         }

         var7 = 0;

         while (var7 <= var5) {
            var6[0][var7] = var7++;
         }

         for (int var13 = 1; var13 <= var4; var13++) {
            int var8 = Integer.MAX_VALUE;

            for (int var9 = 1; var9 <= var5; var9++) {
               int var10 = var1.charAt(var13 - 1) == var2.charAt(var9 - 1) ? 0 : 1;
               int var11 = Math.min(Math.min(var6[var13 - 1][var9] + 1, var6[var13][var9 - 1] + 1), var6[var13 - 1][var9 - 1] + var10);
               if (var13 > 1 && var9 > 1 && var1.charAt(var13 - 1) == var2.charAt(var9 - 2) && var1.charAt(var13 - 2) == var2.charAt(var9 - 1)) {
                  var11 = Math.min(var11, var6[var13 - 2][var9 - 2] + 1);
               }

               var6[var13][var9] = var11;
               if (var11 < var8) {
                  var8 = var11;
               }
            }

            if (var8 > var3) {
               return var3 + 1;
            }
         }

         return var6[var4][var5];
      }
   }

   public int N(String var1, String var2) {
      if (var1 == null) {
         return 0;
      } else {
         String var3 = var1.toLowerCase();
         if (var3.equals(var2)) {
            return 200;
         } else if (var3.startsWith(var2)) {
            return 100;
         } else if (var3.contains(var2)) {
            return 50;
         } else {
            int var4 = this.N(var2.length());
            if (var4 == 0) {
               return 0;
            } else {
               int var5 = this.N(var3, var2, var4);
               return var5 > var4 ? 0 : 20 - (var5 - 1) * 5;
            }
         }
      }
   }

   public abstract void N(String var1, int var2, List<class11510> var3);

   public int N(int var1) {
      if (var1 <= 3) {
         return 0;
      } else {
         return var1 <= 6 ? 1 : 2;
      }
   }
}
