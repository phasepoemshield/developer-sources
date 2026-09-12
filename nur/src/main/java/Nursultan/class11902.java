package Nursultan;

import minecraft.class01311;
import minecraft.class01337;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04462;
import minecraft.class04655;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08687;

public class class11902 {
   private static String[] u;
   private static double[] E;
   public static Object N_0 = class06202.Nq();

   private static void M() {
   }

   private class11902() {
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      i();
      R();
      M();
   }

   private static void i() {
      E = new double[1];
      E[0] = Double.longBitsToDouble(9218868437227405311L);
   }

   public static void y(class11385 var0) {
      var0.B(false);
      var0.u(false);
      var0.L(false);
      var0.R(false);
   }

   public static boolean y() {
      class05096 var0 = (class05096)((class06202)N_0).v_3;
      return !(var0 instanceof class01311) && !(var0 instanceof class01337) && !class09222.y()
         ? var0 != null
            && var0.method_25396().stream().filter(var0x -> var0x instanceof class04927).map(var0x -> (class04927)var0x).anyMatch(class06478::method_25370)
         : true;
   }

   private static boolean N(float var0, float var1) {
      return var0 != 0.0F || var1 != 0.0F;
   }

   public static float[] N(float var0) {
      class04453 var1 = (class04453)((class06202)N_0).T_4;
      float var2 = var1.fields_7212a028292fd3c078969e3ee4c71d9e8_2;
      float var3 = var1.fields_7212a028292fd3c078969e3ee4c71d9e8_0;
      float var4 = var1.method_36454();
      if (var2 == 0.0F && var3 == 0.0F) {
         return new float[]{0.0F, 0.0F};
      } else {
         if (var2 != 0.0F) {
            if (var3 > 0.0F) {
               var4 += var2 > 0.0F ? -45.0F : 45.0F;
            } else if (var3 < 0.0F) {
               var4 += var2 > 0.0F ? 45.0F : -45.0F;
            }

            var3 = 0.0F;
            var2 = var2 > 0.0F ? 1.0F : -1.0F;
         }

         double var5 = Math.toRadians((double)(var4 + 90.0F));
         double var7 = Math.sin(var5);
         double var9 = Math.cos(var5);
         float var11 = (float)((double)(var2 * var0) * var9 + (double)(var3 * var0) * var7);
         float var12 = (float)((double)(var2 * var0) * var7 - (double)(var3 * var0) * var9);
         return new float[]{var11, var12};
      }
   }

   public static boolean N(int var0) {
      return var0 == -1 ? false : class04655.N(((class06202)N_0).Nt(), var0);
   }

   public static float N(float var0, float var1, float var2) {
      return N(var1, var2) ? var0 + class04995.R(class11908.y(class04995.u((double)(-var2), (double)var1))) : var0;
   }

   public static boolean N(class08687 var0, boolean var1) {
      return var0.N() || var0.y() || var0.L() || var0.u() || var0.i() || var1 && var0.M() || var0.R();
   }

   public static float N() {
      return (float)class04995.R(
            ((class04453)((class06202)N_0).T_4).method_23317() - ((class04453)((class06202)N_0).T_4).field_6014,
            ((class04453)((class06202)N_0).T_4).method_23321() - ((class04453)((class06202)N_0).T_4).field_5969
         )
         * 20.0F
         * (Math.min(((class03448)((class06202)N_0).T_3).method_54719().R(), 20.0F) / 20.0F);
   }

   public static boolean N(class08687 var0) {
      return N(var0, true);
   }

   public static void N(class11385 var0) {
      y(var0);
      var0.M(false);
      var0.i(false);
      var0.y(false);
   }

   public static void N(class11385 var0, float var1) {
      if (!class11919.N()) {
         float var2 = class04462.N(var0.i(), var0.M());
         float var3 = class04462.N(var0.u(), var0.Z());
         if (N(var2, var3)) {
            float var4 = class04995.R(((class04453)((class06202)N_0).T_4).method_36454());
            double var5 = (double)N(var1, var2, var3);
            float var7 = 0.0F;
            float var8 = 0.0F;
            double var9 = E[0];

            for (int var11 = -1; var11 <= 1; var11++) {
               for (int var12 = -1; var12 <= 1; var12++) {
                  if (var12 != 0 || var11 != 0) {
                     double var13 = (double)N(var4, (float)var11, (float)var12);
                     double var15 = Math.abs(class04995.i(var5 - var13));
                     if (var15 < var9) {
                        var9 = var15;
                        var7 = (float)var11;
                        var8 = (float)var12;
                     }
                  }
               }
            }

            var0.B(var7 == 1.0F);
            var0.u(var7 == -1.0F);
            var0.L(var8 == 1.0F);
            var0.R(var8 == -1.0F);
         }
      }
   }

   private static void R() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }
}
