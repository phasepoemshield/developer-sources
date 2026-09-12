package Nursultan;

import java.util.List;
import org.joml.Vector4f;

public class class11748 {
   private static String[] l;
   public static Object N_0 = class09991.N().N(class09969.FLOATING).N(class09962.N()).y(class09962.N()).N(class09975.COLUMN).B(3.0F).L(true);
   public static Object N_1 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW);
   public static Object N_2 = N(true, true);
   public static Object N_3 = N(true, false);
   public static Object N_4 = N(false, true);
   public static Object N_5 = N(false, false);
   public static Object N_6 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()).N(1.5F, -1778384896), class09221.N(12, class09079.REGULAR)));
   public static Object N_7;
   public static Object y_0;
   public static Object y_1;
   public static Object L_0 = 3.0F;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object u_0 = new String[][]{{l[0], l[1]}, {l[2], l[3]}, {l[4], l[5]}};
   public static Object u_1 = ((Object[])u_0).length;
   public static Object u_2;
   public static Object u_3;
   public static Object u_4;
   public static Object u_5;

   private class11748() {
   }

   static {
      N();
      u();
      y();
//       (Integer)u_1;
//       (Integer)u_1;
      class09991 var68 = class09991.N();
      N_7 = class09991.N(var68.i((Integer)class09181.N_0).N(1.5F, -1778384896), class09221.N(12, class09079.REGULAR));
   }

   private static void u() {
      l = new String[6];
      l[0] = "hud.hint.move.key";
      l[1] = "hud.hint.move.text";
      l[2] = "hud.hint.snap.key";
      l[3] = "hud.hint.snap.text";
      l[4] = "hud.hint.reset.key";
      l[5] = "hud.hint.reset.text";
   }

   private static void y() {
      u_1 = 0;
      u_2 = 12;
      u_3 = 3.0F;
      u_4 = 7.0F;
      u_5 = 5.0F;
      y_0 = 8.0F;
      y_1 = 2.0F;
      L_0 = 0.0F;
      L_1 = 0.18F;
      L_2 = 0.08F;
      L_3 = 0.144F;
      L_4 = 0.056F;
   }

   private static class09991[] N(boolean var0, boolean var1) {
      class09991[] var2 = new class09991[(Integer)u_1];

      for (int var3 = 0; var3 < (Integer)u_1; var3++) {
         int var4 = var1 ? (Integer)u_1 - 1 - var3 : var3;
         class09728 var5 = var0
            ? new class09728(0.18F, class09759.EASE_OUT, (float)var4 * 0.08F)
            : new class09728(0.144F, class09759.EASE_OUT, (float)((Integer)u_1 - 1 - var4) * 0.056F);
         var2[var3] = class09991.N(
            (class09991)N_1,
            class09991.N().l(var0 ? 1.0F : 0.0F).m(var0 ? 0.0F : (var1 ? 5.0F : -5.0F)).N(class09692.N(class09994.s(var5), class09994.Z(var5)))
         );
      }

      return var2;
   }

   private static boolean N(class11769 var0, float var1, float var2, float var3, float var4) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         for (class11769 var6 : (List)class11730.N_7) {
            if (var6 != var0) {
               Vector4f var7 = var6.R();
               if (var7 != null && var1 < var7.x + var7.z && var1 + var3 > var7.x && var2 < var7.y + var7.w && var2 + var4 > var7.y) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static void N() {
   }

   private static boolean N(class11769 var0, Vector4f var1, float var2, float var3, float var4) {
      if (var1 == null) {
         return true;
      } else {
         float var5 = var1.y - 7.0F - var4;
         float var6 = var1.y + var1.w + 7.0F;
         if (var5 < 2.0F) {
            return false;
         } else if (var6 + var4 > class11769.u() - 2.0F) {
            return true;
         } else {
            float var7 = var1.x + var2;
            return !N(var0, var7, var5, var3, var4) || N(var0, var7, var6, var3, var4);
         }
      }
   }

   public static class09798 N(class09809 var0, class11769 var1) {
      String var2 = var1.E();
      class09211 var3 = var0.N((class09804<class09211>)class09211.N_6);
      boolean var4 = var0.L(var2 + "HintTargeted", var1::W);
      Vector4f var5 = var1.R();
      class09904 var6 = var1.i().N();
      boolean var7 = var6 != null && var6.K() != null;
      float var8 = var7 ? var6.c().i() : (Float)L_0;
      float var9 = var7 ? var6.c().u() : 0.0F;
      float var11 = var5 != null && var9 > 0.0F && var5.x + var9 > class11769.B() - 8.0F ? var5.z - var9 : 0.0F;
      boolean var12 = N(var1, var5, var11, var9, var8);
      float var13 = var12 ? -(var8 + 7.0F) : var5.w + 7.0F;
      class09991[] var14 = var4 ? (var12 ? (class09991[])N_2 : (class09991[])N_3) : (var12 ? (class09991[])N_4 : (class09991[])N_5);
      return class09778.N(class09991.N((class09991)N_0, class09991.N().U(var11).E(var13)), var4x -> {
         var4x.N(var2 + "Hints");
         var4x.N(var1.i());

         for (int var5x = 0; var5x < (Integer)u_1; var5x++) {
            String var6x = var2 + "Hint" + var5x;
            String[] var7x = ((String[][])u_0)[var5x];
            class09991 var8x = var14[var5x];
            var4x.N_3(var8x, var3xx -> {
               var3xx.N(var6x);
               var3xx.y(var3xxx -> var3xxx.N(var6x + "Key").L(class12020.N(var7x[0])).N(((class09227)N_6).N(var3)));
               var3xx.y(var2xxx -> var2xxx.N(var6x + "Body").L(" — " + class12020.N(var7x[1])).N((class09991)N_7));
            });
         }
      });
   }
}
