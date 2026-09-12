package Nursultan;

import java.util.List;
import org.joml.Vector4f;

public class class11617 {
   private static String[] L;
   private static String[] R;
   private static String[] v;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3 = List.of();
   public static Object N_4 = List.of();
   public static Object y_0;
   public static Object y_1;
   public static Object y_2 = class11213.N((class09087)class09063.N_6, 65536);
   public static Object y_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.N_2).N(4).N()).N((class11213)y_2).N(6).N();
   public static Object y_4 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.N_3).N(4).N()).N((class11213)y_2).N(6).N();

   private class11617() {
   }

   static {
      N();
      u();
      y();
   }

   private static void i() {
      if ((Integer)N_0 != 0 && ((class11213)y_2).M().i() != 0) {
         int var0 = Math.min(Math.min(((List)N_3).size(), ((List)N_4).size()), 64);
         boolean var1 = var0 > 1;
         (var1 ? (class11174)y_4 : (class11174)y_3).y(var2 -> {
            var2.z(R[0]).N(class11925.L());
            var2.M(R[1]).N((Integer)N_0);
            var2.i(v[0]).N((Float)N_1);
            var2.i(v[1]).N((Float)N_2);
            var2.N(L[0]).N(1.0F, 1.0F, 1.0F, 1.0F);
            var2.N(L[1]).N(1.0F, 1.0F, 1.0F, 0.0F);
            if (!var1) {
               if (var0 == 1) {
                  Vector4f var6 = (Vector4f)((List)N_3).getFirst();
                  Vector4f var7 = (Vector4f)((List)N_4).getFirst();
                  var2.L(L[2]).N(1);
                  var2.N(L[3]).N(var6.x(), var6.y(), var6.z(), var6.w());
                  var2.N(L[4]).N(var7.x(), var7.y(), var7.z(), var7.w());
               } else {
                  var2.L(L[5]).N(0);
               }
            } else {
               var2.L(L[6]).N(var0);
               var2.L(L[7]).N(0);

               for (int var3 = 0; var3 < var0; var3++) {
                  Vector4f var4 = (Vector4f)((List)N_3).get(var3);
                  Vector4f var5 = (Vector4f)((List)N_4).get(var3);
                  var2.N("u_clip_rects[" + var3 + "]").N(var4.x(), var4.y(), var4.z(), var4.w());
                  var2.N("u_clip_rounds[" + var3 + "]").N(var5.x(), var5.y(), var5.z(), var5.w());
               }
            }
         });
      }
   }

   private static void u() {
      R = new String[2];
      R[0] = "u_projection";
      R[1] = "texture_in";
      v = new String[2];
      v[0] = "u_mask_start";
      v[1] = "u_mask_end";
      L = new String[8];
      L[0] = "u_mask_start_color";
      L[1] = "u_mask_end_color";
      L[2] = "u_clip_flags";
      L[3] = "u_clip_rect";
      L[4] = "u_clip_round";
      L[5] = "u_clip_flags";
      L[6] = "u_clip_count";
      L[7] = "u_clip_flags";
   }

   private static void y() {
      y_0 = 64;
      y_1 = 1;
      N_0 = 0;
      N_1 = 0.0F;
      N_2 = 0.0F;
   }

   private static void y(class09093 var0, class09084 var1) {
      int var2 = var0.u(var1.j());
      if ((Integer)N_0 != 0 && (Integer)N_0 != var2) {
         i();
      }

      N_0 = var2;
      float var3 = var1.y() / (float)Math.max(1, var1.M());
      float var4 = var1.y() / (float)Math.max(1, var1.W());
      ((class11213)y_2)
         .M()
         .N(var1.m())
         .N(var1.b())
         .N(var1.s())
         .N(var1.N())
         .N(var1.L())
         .N(var1.z())
         .N(var1.i())
         .N(var1.R())
         .y(var1.Z())
         .N(var3)
         .N(var4)
         .y(0)
         .y();
   }

   public static void N(
      String var0, int var1, float var2, class09079 var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      class09093 var12 = class09080.u();
      if (var12 != null && var0 != null && !var0.isEmpty()) {
         float var14 = var10 / Math.max(1.0F, var4);
         float var15 = Math.max(1.0F, (float)Math.round(var2 * var14));
         float var16 = var12.N(var15, var3, false);
         float var17 = (float)Math.round(var8 + var5 * var14);
         float var18 = (float)Math.round(var9 + (var11 - var16) / 2.0F);
         N_1 = var8 + var6 * var14;
         N_2 = var8 + var7 * var14;
         class11635 var19 = class11620.y();
         N_3 = var19.N();
         N_4 = var19.y();
         N_0 = 0;
         var12.u();
         var12.N(var0, var17, var18, var15, 1.0F, var3, false, var1, var1x -> y(var12, var1x));
         i();
         N_3 = List.of();
         N_4 = List.of();
      }
   }

   private static void N() {
   }
}
