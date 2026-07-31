package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class O00000OOOOOOO {
   public static final long O00000000 = 1L;
   public static final long O000000000 = 2L;
   public static final long O0000000000 = 3L;
   private static final long O00000000000 = 1L;
   private static final long O000000000000 = 2L;
   private static final Map<Long, O00000OOOOOOO.W326> O0000000000000 = new HashMap<>();
   private static long O000000000000O;
   private static long O00000000000O;
   private static long O00000000000O0;
   private static float O00000000000OO;

   private O00000OOOOOOO() {
   }

   public static void O00000000() {
      O000000000000O++;
      Iterator var0 = O0000000000000.entrySet().iterator();

      while (var0.hasNext()) {
         Entry var1 = (Entry)var0.next();
         if (O000000000000O - ((O00000OOOOOOO.W326)var1.getValue()).O00000000000O0 > 2L) {
            if (O00000000000O0 == (Long)var1.getKey()) {
               O00000000000O0 = 0L;
            }

            var0.remove();
         }
      }
   }

   public static float O00000000(long l, float f, float g, float h, float i, float j, float k, float m, float n, float o, O00000OOOOOOO.W327 o000000000) {
      if (l != 0L && o000000000 != null) {
         O00000OOOOOOO.W326 var12 = O0000000000000.computeIfAbsent(l, long_ -> new O00000OOOOOOO.W326());
         long var13 = System.currentTimeMillis();
         float var15 = var12.O0000000000O == 0L ? 16.0F : Math.min(80.0F, Math.max(1.0F, (float)(var13 - var12.O0000000000O)));
         var12.O00000000 = f;
         var12.O000000000 = g;
         var12.O0000000000 = h;
         var12.O00000000000 = i;
         var12.O000000000000 = j;
         var12.O0000000000000 = k;
         var12.O000000000000O = Math.max(2.0F, m);
         var12.O00000000000O = o000000000;
         var12.O00000000000O0 = O000000000000O;
         var12.O00000000000OO = ++O00000000000O;
         var12.O0000000000O = var13;
         boolean var16 = O00000000000O0 == l;
         boolean var17 = var16 || O00000000(var12, n, o) != 0;
         float var18 = var16 ? 1.0F : (var17 ? 0.55F : 0.0F);
         float var19 = var18 > var12.O0000000000O0 ? 90.0F : 260.0F;
         var12.O0000000000O0 = O0000O000O00O.O000000000(var12.O0000000000O0, var18, var15, var19);
         return var12.O0000000000O0;
      } else {
         return 0.0F;
      }
   }

   public static boolean O00000000(long l) {
      return l != 0L && O00000000000O0 == l;
   }

   public static boolean O00000000(float f, float g) {
      long var2 = 0L;
      O00000OOOOOOO.W326 var4 = null;
      int var5 = 0;

      for (Entry var7 : O0000000000000.entrySet()) {
         O00000OOOOOOO.W326 var8 = (O00000OOOOOOO.W326)var7.getValue();
         if (O00000000(var8) && var8.O00000000000O != null) {
            int var9 = O00000000(var8, f, g);
            if (var9 != 0 && (var4 == null || var8.O00000000000OO > var4.O00000000000OO)) {
               var4 = var8;
               var2 = (Long)var7.getKey();
               var5 = var9;
            }
         }
      }

      if (var4 == null) {
         return false;
      } else {
         O00000000000O0 = var2;
         if (var5 == 1) {
            O00000000000OO = g - var4.O000000000000;
         } else {
            O00000000000OO = var4.O0000000000000 * 0.5F;
            O00000000(var4, g);
         }

         return true;
      }
   }

   public static boolean O000000000(float f, float g) {
      if (O00000000000O0 == 0L) {
         return false;
      } else {
         O00000OOOOOOO.W326 var2 = O0000000000000.get(O00000000000O0);
         if (var2 != null && var2.O00000000000O != null && O00000000(var2)) {
            O00000000(var2, g);
            return true;
         } else {
            O00000000000O0 = 0L;
            return false;
         }
      }
   }

   public static boolean O000000000() {
      boolean var0 = O00000000000O0 != 0L;
      O00000000000O0 = 0L;
      return var0;
   }

   public static void O0000000000() {
      O00000000000O0 = 0L;
      O00000000000O = 0L;
      O0000000000000.clear();
   }

   private static boolean O00000000(O00000OOOOOOO.W326 o00000000) {
      return O000000000000O - o00000000.O00000000000O0 <= 1L;
   }

   private static void O00000000(O00000OOOOOOO.W326 o00000000, float f) {
      float var2 = Math.max(1.0F, o00000000.O00000000000 - o00000000.O0000000000000);
      float var3 = (f - O00000000000OO - o00000000.O000000000) / var2;
      o00000000.O00000000000O.applyRatio(Math.max(0.0F, Math.min(1.0F, var3)));
   }

   private static int O00000000(O00000OOOOOOO.W326 o00000000, float f, float g) {
      if (!(o00000000.O0000000000 <= 0.0F) && !(o00000000.O00000000000 <= 0.0F)) {
         float var3 = o00000000.O000000000000O;
         if (f < o00000000.O00000000 - var3 || f > o00000000.O00000000 + o00000000.O0000000000 + var3) {
            return 0;
         } else if (!(g < o00000000.O000000000 - var3 * 0.5F) && !(g > o00000000.O000000000 + o00000000.O00000000000 + var3 * 0.5F)) {
            float var4 = Math.min(var3, 4.0F);
            return g >= o00000000.O000000000000 - var4 && g <= o00000000.O000000000000 + o00000000.O0000000000000 + var4 ? 1 : 2;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   static final class W326 {
      float O00000000;
      float O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      O00000OOOOOOO.W327 O00000000000O;
      long O00000000000O0;
      long O00000000000OO;
      long O0000000000O;
      float O0000000000O0;
   }

   @FunctionalInterface
   public interface W327 {
      void applyRatio(float f);
   }
}
