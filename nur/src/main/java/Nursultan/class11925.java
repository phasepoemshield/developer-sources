package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import minecraft.class00056;
import minecraft.class00312;
import minecraft.class00734;
import minecraft.class01054;
import minecraft.class01383;
import minecraft.class03386;
import minecraft.class03394;
import minecraft.class03396;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08066;
import minecraft.class08844;
import minecraft.class08879;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33C;

public class class11925 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object y_0 = 1.5F;
   public static Object y_1 = 1.0F;
   public static Object y_2 = 2.2F;
   public static Object y_3 = new Matrix4f();
   public static Object y_4 = new Matrix4f();
   public static Object L_0 = new class03394().N(class03396.field_60101);
   public static Object L_1 = new class00056("nursultan-unscale", -1000.0F, 11000.0F, true);
   public static Object L_2 = class06202.Nq();
   public static Object L_3 = new Matrix4f();
   public static Object L_4;
   public static Object L_5 = new class10203(null, 1, 1, true);
   public static Object L_6 = new class11216();

   public static double L(class07049 var0) {
      return !var0.method_5805() ? var0.method_23321() : class04995.u((double)N(var0), var0.field_5969, var0.method_23321());
   }

   public static void L(class08066 var0) {
      var0.N((class08066)L_5);
   }

   public static Matrix4f L() {
      return (Matrix4f)L_3;
   }

   private class11925() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      Z();
   }

   private static void Z() {
      N_0 = 4;
      N_1 = 4;
      N_2 = 16;
      N_3 = 20;
      N_4 = 5;
      N_5 = 35;
      N_6 = -1442182646;
      y_0 = 1.5F;
      y_1 = 1.0F;
      y_2 = 2.2F;
      y_3 = null;
      y_4 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      L_6 = null;
   }

   public static void i() {
      class08844 var0 = class06202.Nq().Nt();
      float var1 = (float)(var0.U() / var0.j());
      float var2 = (float)(var0.E() / var0.j());
      RenderSystem.setProjectionMatrix(((class00056)L_1).y(var1, var2), class00312.field_54954);
      ((Matrix4f)L_3).set(((class12035)((class00056)L_1)).N(var1, var2));
   }

   public static double i(class07049 var0) {
      return !var0.method_5805() ? var0.method_23317() : class04995.u((double)N(var0), var0.field_6014, var0.method_23317());
   }

   public static double u(class07049 var0) {
      return !var0.method_5805() ? var0.method_23318() : class04995.u((double)N(var0), var0.field_6036, var0.method_23318());
   }

   public static int u() {
      return GL12.glGetInteger(3379);
   }

   public static void u(class08066 var0) {
      N((class08066)L_5, var0.N, var0.y);
      ((class08066)L_5).N(var0);
   }

   public static class11893 y(float var0, float var1, float var2) {
      Vector4f var3 = new Vector4f(var0, var1, var2, 1.0F);
      var3.mul((Matrix4f)y_4);
      float var4 = var3.x / var3.w;
      float var5 = var3.y / var3.w;
      class08844 var6 = ((class06202)L_2).Nt();
      float var7 = (float)var6.U();
      float var8 = (float)var6.E();
      float var9 = (var4 * 0.5F + 0.5F) * var7;
      float var10 = (1.0F - (var5 * 0.5F + 0.5F)) * var8;
      boolean var11 = var3.w > 0.01F;
      if (!var11) {
         var9 = var7 - var9;
         var10 = var8 - var10;
      }

      return new class11893(new Vector2f(var9, var10), var11);
   }

   public static Matrix4f y(float var0, float var1) {
      RenderSystem.setProjectionMatrix(((class00056)L_1).y(var0, var1), class00312.field_54954);
      ((Matrix4f)L_3).set(((class12035)((class00056)L_1)).N(var0, var1));
      return (Matrix4f)L_3;
   }

   public static int y(class08066 var0) {
      GpuTexture var1 = var0.i();
      return var1 == null ? 0 : ((class08893)var1).N();
   }

   public static boolean y(class07049 var0) {
      return N(var0.method_5829());
   }

   public static class06889 y() {
      return ((class03386)((class06202)L_2).i_5).s().y();
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 16384, 9728);
   }

   public static void N(class01383 var0) {
      L_4 = var0;
   }

   public static Vector2f N(Vector2f var0, float var1, float var2, float var3) {
      float var4 = var1 / 2.0F;
      float var5 = var2 / 2.0F;
      float var6 = var4 - var3;
      float var7 = var5 - var3;
      float var8 = var0.x - var4;
      float var9 = var0.y - var5;
      if (var8 == 0.0F && var9 == 0.0F) {
         return new Vector2f(var4, var5 - var7);
      } else {
         float var10 = var8 * var8 / (var6 * var6) + var9 * var9 / (var7 * var7);
         float var11 = (float)(1.0 / Math.sqrt((double)var10));
         return new Vector2f(var4 + var8 * var11, var5 + var9 * var11);
      }
   }

   public static void N(FloatBuffer var0, int var1) {
      var0.clear();
      float var2 = Math.max((float)var1 / 3.0F, 1.0F);
      double var3 = 0.0;

      for (int var5 = 0; var5 <= var1; var5++) {
         double var6 = N((float)var5, var2);
         var0.put((float)var6);
         var3 += var5 == 0 ? var6 : var6 * 2.0;
      }

      for (int var8 = 0; var8 <= var1; var8++) {
         var0.put(var8, (float)((double)var0.get(var8) / var3));
      }

      var0.rewind();
   }

   public static double N(float var0, float var1) {
      double var2 = (double)(var1 * var1);
      return Math.exp((double)(-(var0 * var0)) / (2.0 * var2));
   }

   public static void N(class08066 var0, int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if (var1 != var0.N || var2 != var0.y) {
            var0.N(var1, var2);
            N(var0.L());
            N(var0.i());
         }
      }
   }

   public static Vector4f N(class07049 var0, boolean var1) {
      class06889 var2 = y();
      double var3 = (var1 ? i(var0) : var0.method_23317()) - var2.M;
      double var5 = (var1 ? u(var0) : var0.method_23318()) - var2.B;
      double var7 = (var1 ? L(var0) : var0.method_23321()) - var2.Z;
      float var9 = var0.method_17681() / 2.0F;
      float var10 = var0.method_17682();
      float var11 = (float)(var3 - (double)var9);
      float var12 = (float)var5;
      float var13 = (float)(var7 - (double)var9);
      float var14 = (float)(var3 + (double)var9);
      float var15 = (float)(var5 + (double)var10 + 0.1);
      float var16 = (float)(var7 + (double)var9);
      float[] var17 = new float[]{
         var11,
         var12,
         var13,
         var11,
         var15,
         var13,
         var14,
         var12,
         var13,
         var14,
         var15,
         var13,
         var11,
         var12,
         var16,
         var11,
         var15,
         var16,
         var14,
         var12,
         var16,
         var14,
         var15,
         var16
      };
      Vector4f var18 = new Vector4f(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);

      for (int var19 = 0; var19 < 8; var19++) {
         Vector2f var20 = N(var17[var19 * 3], var17[var19 * 3 + 1], var17[var19 * 3 + 2]);
         if (var20 != null) {
            var20 = var20.round();
            var18.set(Math.min(var20.x, var18.x()), Math.min(var20.y, var18.y()), Math.max(var20.x, var18.z()), Math.max(var20.y, var18.w()));
         }
      }

      return var18.x() == Float.MAX_VALUE && var18.y() == Float.MAX_VALUE && var18.z() == Float.MIN_VALUE && var18.w() == Float.MIN_VALUE ? null : var18;
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      GlStateManager._glBindFramebuffer(36008, var0);
      GlStateManager._glBindFramebuffer(36009, var1);
      GlStateManager._glBlitFrameBuffer(0, 0, var2, var3, 0, 0, var4, var5, var6, var7);
   }

   public static Vector2f N(float var0, float var1, float var2) {
      Vector4f var3 = new Vector4f(var0, var1, var2, 1.0F);
      var3.mul((Matrix4f)y_4);
      if (var3.w <= 0.01F) {
         return null;
      } else {
         float var4 = var3.x / var3.w;
         float var5 = var3.y / var3.w;
         class08844 var6 = ((class06202)L_2).Nt();
         float var7 = (var4 * 0.5F + 0.5F) * (float)var6.U();
         float var8 = (1.0F - (var5 * 0.5F + 0.5F)) * (float)var6.E();
         return new Vector2f(var7, var8);
      }
   }

   public static int N(class08066 var0) {
      return ((class08893)var0.L()).N();
   }

   public static void N(class09093 var0, class11213 var1, String var2, int var3, float var4, float var5, class06584 var6, int var7) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, -1.0F);
   }

   public static void N(class09093 var0, class11213 var1, String var2, int var3, float var4, float var5, class06584 var6, int var7, float var8) {
      String var10 = String.valueOf(Math.max((float)Math.round((float)var7 * 50.0F / 100.0F) / 10.0F, 0.0F));
      float var11 = var0.N((float)var3, class09079.REGULAR, false);
      boolean var12 = !var2.isEmpty();
      float var13 = var12 ? var0.y(var2, (float)var3, class09079.REGULAR, false) : 0.0F;
      float var14 = var12 ? var0.y(" ", (float)var3, class09079.REGULAR, false) : 0.0F;
      float var15 = var0.y(var10, (float)var3, class09079.REGULAR, false);
      float var16 = Math.max(35.0F, (float)Math.ceil((double)(var15 / 5.0F)) * 5.0F);
      float var17 = var13 + var14 + var16;
      float var18 = var17 + 20.0F + 8.0F;
      float var19 = 24.0F;
      float var20 = (float)class04995.y(var4 - var18 / 2.0F);
      float var21 = (float)class04995.y(var5 - var19 / 2.0F);
      float var22 = var20 + 4.0F + 20.0F;
      float var23 = var21 + (var19 - var11) / 2.0F;
      class11176.N(var1, var20 - 2.0F, var21, var18 + 4.0F + 4.0F, var19 + (float)(var8 >= 0.0F ? 2 : 0), -1442182646);
      class11938.k().N(var6, var20 + 4.0F, var21 + 4.0F, 16.0F);
      if (var12) {
         var0.y(var2).N(var22, var23).N((float)var3).N(class09079.REGULAR).i(-1).L();
      }

      var0.y(var10).N(var22 + var17 - var15, var23).N((float)var3).N(class09079.REGULAR).i(-1).L();
      if (var8 >= 0.0F) {
         float var24 = Math.min(var8, 1.0F);
         float var25 = var18 + 4.0F + 4.0F;
         int var26 = class04995.M(var24 / 3.0F, 1.0F, 1.0F) | 0xFF000000;
         class11176.N(var1, var20 - 2.0F, var21 + var19, var25 * var24, 2.0F, var26);
      }
   }

   public static void N(class08066 var0, class08066 var1) {
      RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var0.L(), var1.L(), 0, 0, 0, 0, 0, var1.N, var1.y);
   }

   public static Matrix4f N() {
      class08844 var0 = class06202.Nq().Nt();
      float var1 = (float)var0.U();
      float var2 = (float)var0.E();
      return y(var1, var2);
   }

   public static float N(class07049 var0) {
      return ((class06202)L_2).NK().N((class03448)((class06202)L_2).T_3 == null || !((class03448)((class06202)L_2).T_3).method_54719().N(var0));
   }

   public static void N(class08066 var0, class09064 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var4 > 0 && var5 > 0 && var8 > 0 && var9 > 0) {
         int var12 = ((class08893)var0.L()).N(((class08879)RenderSystem.getDevice()).y(), var0.i());
         class09060 var13 = class09060.N();
         class09086 var14 = var13.N(var12, var0.N, var0.y);
         class09086 var15 = ((class09065)class09065.y_0).L(var1);
         var13.N(var14, var15, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   public static void N(class01054 var0, class06584 var1, float var2, float var3) {
      var0.N(var1, class04995.y(var2), class04995.y(var3));
   }

   public static void N(class08066 var0, boolean var1) {
      ((class09065)class09065.y_0).N(var0, var1);
   }

   public static void N(GpuTexture var0) {
      if (var0 instanceof class08893 var1) {
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(var1.N());
         GL33C.glBindSampler(0, 0);
         GL12.glTexParameteri(3553, 10241, 9729);
         GL12.glTexParameteri(3553, 10240, 9729);
         GL12.glTexParameteri(3553, 10242, 33071);
         GL12.glTexParameteri(3553, 10243, 33071);
         GL12.glTexParameteri(3553, 33084, 0);
         GL12.glTexParameteri(3553, 33085, 0);
      }
   }

   public static boolean N(class00734 var0) {
      return (class01383)L_4 != null && ((class01383)L_4).method_23093(var0);
   }

   public static void N(class08066 var0, class09064 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 16384, 9728);
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var4 > 0 && var5 > 0 && var8 > 0 && var9 > 0) {
         int var12 = GlStateManager.getFrameBuffer(36008);
         int var13 = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, var0);
         GlStateManager._glBindFramebuffer(36009, var1);
         GlStateManager._glBlitFrameBuffer(var2, var3, var2 + var4, var3 + var5, var6, var7, var6 + var8, var7 + var9, var10, var11);
         GlStateManager._glBindFramebuffer(36009, var13);
         GlStateManager._glBindFramebuffer(36008, var12);
      }
   }

   public static void N(int var0, int var1, int var2, int var3, int var4, int var5) {
      N(var0, var1, var2, var3, var4, var5, 16384, 9728);
   }
}
