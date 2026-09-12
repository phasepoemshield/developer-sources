package Nursultan;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class09186 {
   public static Object N_0;

   private class09186() {
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = 2;
   }

   public static List<List<Entry<class11106, List<class11067>>>> N(class11072 var0, Map<class11106, List<class11067>> var1, int var2) {
      List<Entry<class11106, List<class11067>>> var3 = N(var0, var1);
      ArrayList var4 = new ArrayList(2);

      for (int var5 = 0; var5 < 2; var5++) {
         var4.add(new ArrayList());
      }

      int[] var8 = N(var3);
      int var6 = N(var8, var2);

      for (int var7 = 0; var7 < var3.size(); var7++) {
         ((List)var4.get(N(var6, var7))).add(var3.get(var7));
      }

      return var4;
   }

   private static List<Entry<class11106, List<class11067>>> N(class11072 var0, Map<class11106, List<class11067>> var1) {
      ArrayList var2 = new ArrayList(var1.size());
      EnumSet<class11106> var3 = EnumSet.noneOf(class11106.class);

      for (class11106 var7 : var0.y()) {
         List var8 = (List)var1.get(var7);
         if (var8 != null) {
            var2.add(Map.entry(var7, var8));
            var3.add(var7);
         }
      }

      var1.entrySet().stream().filter(var1x -> !var3.contains(var1x.getKey())).sorted(Entry.comparingByKey()).forEach(var2::add);
      return var2;
   }

   private static int N(int[] var0, int var1) {
      int var2 = var0.length;
      int var3 = 1 << var2;
      byte var4 = 0;
      int var5 = Integer.MAX_VALUE;
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MAX_VALUE;

      for (byte var8 = 0; var8 < var3; var8 += 2) {
         int var9 = N(var0, var1, var8, 0);
         int var10 = N(var0, var1, var8, 1);
         int var11 = Math.max(var9, var10);
         int var12 = Math.abs(var9 - var10);
         int var13 = N(var0.length, var8, 1);
         if (var11 < var5 || var11 == var5 && var12 < var6 || var11 == var5 && var12 == var6 && var13 < var7) {
            var5 = var11;
            var6 = var12;
            var7 = var13;
            var4 = var8;
         }
      }

      return var4;
   }

   private static int N(int var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var0; var4++) {
         if (N(var1, var4) == var2) {
            var3++;
         }
      }

      return var3;
   }

   private static void N() {
   }

   private static int N(int var0, int var1) {
      return (var0 & 1 << var1) == 0 ? 0 : 1;
   }

   private static int N(int[] var0, int var1, int var2, int var3) {
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < var0.length; var6++) {
         if (N(var2, var6) == var3) {
            if (var5 > 0) {
               var4 += var1;
            }

            var4 += var0[var6];
            var5++;
         }
      }

      return var4;
   }

   private static int[] N(List<Entry<class11106, List<class11067>>> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1[var2] = class09187.N(((List)((Entry)var0.get(var2)).getValue()).size());
      }

      return var1;
   }
}
