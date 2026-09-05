package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class VvuuVNVUn {
   private static final int UuUVuuUu = 12;
   private static final int C00OOC00oO = 12;
   private static final IntBuffer uUnuvNvvNU = BufferUtils.createIntBuffer(16);
   private static final ByteBuffer vVvUvVVuuNvV = BufferUtils.createByteBuffer(4);
   private static final FloatBuffer uNNnnnuuuN = BufferUtils.createFloatBuffer(2);

   private VvuuVNVUn() {
   }

   public static VvuuVNVUn.NVnVnNnN UuUVuuUu() {
      return C00OOC00oO(new VvuuVNVUn.NVnVnNnN());
   }

   public static VvuuVNVUn.NVnVnNnN UuUVuuUu(VvuuVNVUn.NVnVnNnN var0) {
      return var0 == null ? UuUVuuUu() : C00OOC00oO(var0);
   }

   public static VvuuVNVUn.NVnVnNnN C00OOC00oO(VvuuVNVUn.NVnVnNnN var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("target must not be null");
      } else {
         VvuuVNVUn.NVnVnNnN var1 = var0;
         IntBuffer var2 = uUnuvNvvNU;
         ByteBuffer var3 = vVvUvVVuuNvV;
         FloatBuffer var4 = uNNnnnuuuN;
         var2.clear();
         var3.clear();
         var4.clear();
         GL11.glGetIntegerv(36006, var2);
         var0.UuUVuuUu = var2.get(0);
         GL11.glGetIntegerv(36010, var2);
         var0.C00OOC00oO = var2.get(0);
         GL11.glGetIntegerv(3073, var2);
         var0.uUnuvNvvNU = var2.get(0);
         GL11.glGetIntegerv(3074, var2);
         var0.vVvUvVVuuNvV = var2.get(0);
         GL11.glGetIntegerv(35725, var2);
         var0.c0oOOCcCoC0 = var2.get(0);
         GL11.glGetIntegerv(34229, var2);
         var0.VVnVNnunVvu = var2.get(0);
         GL11.glGetIntegerv(34964, var2);
         var0.unNNVVNnvvV = var2.get(0);
         GL11.glGetIntegerv(34965, var2);
         var0.NuunnvnN = var2.get(0);
         GL11.glGetIntegerv(34016, var2);
         int var5 = var2.get(0);
         var0.NVUunUNUN = var5 == 0 ? '蓀' : var5;

         for (int var6 = 0; var6 < 12; var6++) {
            GL13.glActiveTexture(33984 + var6);
            GL11.glGetIntegerv(32873, var2);
            var1.vuvnUnVnUNnV[var6] = var2.get(0);
         }

         GL13.glActiveTexture(var1.NVUunUNUN);
         int var7 = var1.NVUunUNUN - 33984;
         var1.UUVNuUNUvUnV = var7 >= 0 && var7 < 12 ? var1.vuvnUnVnUNnV[var7] : 0;
         GL11.glGetIntegerv(3317, var2);
         var1.nnuUVNUuvvVU = var2.get(0) == 0 ? 4 : var2.get(0);
         GL11.glGetIntegerv(2978, var2);
         var1.uNNnnnuuuN[0] = var2.get(0);
         var1.uNNnnnuuuN[1] = var2.get(1);
         var1.uNNnnnuuuN[2] = var2.get(2);
         var1.uNNnnnuuuN[3] = var2.get(3);
         GL11.glGetIntegerv(3088, var2);
         var1.VVuuUN[0] = var2.get(0);
         var1.VVuuUN[1] = var2.get(1);
         var1.VVuuUN[2] = var2.get(2);
         var1.VVuuUN[3] = var2.get(3);
         GL11.glGetIntegerv(32969, var2);
         var1.UuuNnUvUuv = var2.get(0);
         GL11.glGetIntegerv(32968, var2);
         var1.nUUVuvU = var2.get(0);
         GL11.glGetIntegerv(32971, var2);
         var1.UnUNVVVNuv = var2.get(0);
         GL11.glGetIntegerv(32970, var2);
         var1.vNVuvnUUnuUn = var2.get(0);
         GL11.glGetBooleanv(3107, var3);
         var1.UvnvNVnnnnNU = var3.get(0) != 0;
         var1.uVUVnuvnuVuv = var3.get(1) != 0;
         var1.NVNnnvnuunNv = var3.get(2) != 0;
         var1.uVunuUNVVUUV = var3.get(3) != 0;
         GL11.glGetBooleanv(2930, var3);
         var1.UNnVVNvvnVvU = var3.get(0) != 0;
         GL11.glGetIntegerv(2932, var2);
         var1.uNnUnnuNUnNu = var2.get(0);
         GL11.glGetFloatv(32824, var4);
         var1.nNvNUVU = var4.get(0);
         GL11.glGetFloatv(10752, var4);
         var1.UnUNuUU = var4.get(0);
         GL11.glGetIntegerv(3056, var2);
         var1.UvUvUNuvNU = var2.get(0);
         var1.vuuuNvNuv = GL11.glIsEnabled(3042);
         var1.vNUvnnVnUvu = GL11.glIsEnabled(2929);
         var1.uVUuuVnNVU = GL11.glIsEnabled(2884);
         var1.nuUnNvnuUu = GL11.glIsEnabled(3089);
         var1.nvUVNnuu = GL11.glIsEnabled(36281);
         var1.NnUuNNU = GL11.glIsEnabled(32823);
         var1.uUVuVvuNUvnu = GL11.glIsEnabled(3058);
         return var1;
      }
   }

   public static void uUnuvNvvNU(VvuuVNVUn.NVnVnNnN var0) {
      if (var0 != null) {
         int var1 = UuUVuuUu(var0.UuUVuuUu);
         int var2 = var0.C00OOC00oO == var0.UuUVuuUu ? var1 : UuUVuuUu(var0.C00OOC00oO);
         GL30.glBindFramebuffer(36009, var1);
         GL30.glBindFramebuffer(36008, var2);
         GL11.glDrawBuffer(C00OOC00oO(var1, var0.uUnuvNvvNU));
         GL11.glReadBuffer(uUnuvNvvNU(var2, var0.vVvUvVVuuNvV));
         GL20.glUseProgram(var0.c0oOOCcCoC0);
         GL30.glBindVertexArray(var0.VVnVNnunVvu);
         GL15.glBindBuffer(34962, var0.unNNVVNnvvV);
         GL15.glBindBuffer(34963, var0.NuunnvnN);

         for (int var3 = 0; var3 < 12; var3++) {
            GL13.glActiveTexture(33984 + var3);
            GL11.glBindTexture(3553, var0.vuvnUnVnUNnV[var3]);
         }

         GL13.glActiveTexture(var0.NVUunUNUN);
         GL11.glPixelStorei(3317, var0.nnuUVNUuvvVU);
         UuUVuuUu(3042, var0.vuuuNvNuv);
         UuUVuuUu(2929, var0.vNUvnnVnUvu);
         UuUVuuUu(2884, var0.uVUuuVnNVU);
         UuUVuuUu(3089, var0.nuUnNvnuUu);
         UuUVuuUu(36281, var0.nvUVNnuu);
         GL14.glBlendFuncSeparate(var0.UuuNnUvUuv, var0.nUUVuvU, var0.UnUNVVVNuv, var0.vNVuvnUUnuUn);
         GL11.glColorMask(var0.UvnvNVnnnnNU, var0.uVUVnuvnuVuv, var0.NVNnnvnuunNv, var0.uVunuUNVVUUV);
         GL11.glDepthMask(var0.UNnVVNvvnVvU);
         GL11.glDepthFunc(var0.uNnUnnuNUnNu);
         GL11.glPolygonOffset(var0.nNvNUVU, var0.UnUNuUU);
         UuUVuuUu(32823, var0.NnUuNNU);
         GL11.glLogicOp(var0.UvUvUNuvNU);
         UuUVuuUu(3058, var0.uUVuVvuNUvnu);
         GL11.glViewport(var0.uNNnnnuuuN[0], var0.uNNnnnuuuN[1], var0.uNNnnnuuuN[2], var0.uNNnnnuuuN[3]);
         GL11.glScissor(var0.VVuuUN[0], var0.VVuuUN[1], var0.VVuuUN[2], var0.VVuuUN[3]);
      }
   }

   public static void vVvUvVVuuNvV(VvuuVNVUn.NVnVnNnN var0) {
      if (var0 != null) {
         int var1 = UuUVuuUu(var0.UuUVuuUu);
         int var2 = var0.C00OOC00oO == var0.UuUVuuUu ? var1 : UuUVuuUu(var0.C00OOC00oO);
         GlStateManager._glBindFramebuffer(36009, var1);
         GlStateManager._glBindFramebuffer(36008, var2);
         int var3 = Math.min(12, 12);

         for (int var4 = 0; var4 < var3; var4++) {
            GlStateManager._activeTexture(33984 + var4);
            GlStateManager._bindTexture(var0.vuvnUnVnUNnV[var4]);
         }

         int var5 = var0.NVUunUNUN - 33984;
         GlStateManager._activeTexture(33984);
         if (var5 > 0 && var5 < var3) {
            GlStateManager._activeTexture(var0.NVUunUNUN);
         }

         if (var0.vuuuNvNuv) {
            GlStateManager._enableBlend();
         } else {
            GlStateManager._disableBlend();
         }

         if (var0.vNUvnnVnUvu) {
            GlStateManager._enableDepthTest();
         } else {
            GlStateManager._disableDepthTest();
         }

         if (var0.uVUuuVnNVU) {
            GlStateManager._enableCull();
         } else {
            GlStateManager._disableCull();
         }

         if (var0.nuUnNvnuUu) {
            GlStateManager._enableScissorTest();
         } else {
            GlStateManager._disableScissorTest();
         }

         GlStateManager._blendFuncSeparate(var0.UuuNnUvUuv, var0.nUUVuvU, var0.UnUNVVVNuv, var0.vNVuvnUUnuUn);
         GlStateManager._colorMask(var0.UvnvNVnnnnNU, var0.uVUVnuvnuVuv, var0.NVNnnvnuunNv, var0.uVunuUNVVUUV);
         GlStateManager._depthMask(var0.UNnVVNvvnVvU);
         GlStateManager._depthFunc(var0.uNnUnnuNUnNu);
         if (var0.NnUuNNU) {
            GlStateManager._polygonOffset(var0.nNvNUVU, var0.UnUNuUU);
            GlStateManager._enablePolygonOffset();
         } else {
            GlStateManager._disablePolygonOffset();
         }

         if (var0.uUVuVvuNUvnu) {
            GlStateManager._logicOp(var0.UvUvUNuvNU);
            GlStateManager._enableColorLogicOp();
         } else {
            GlStateManager._disableColorLogicOp();
         }

         GlStateManager._viewport(var0.uNNnnnuuuN[0], var0.uNNnnnuuuN[1], var0.uNNnnnuuuN[2], var0.uNNnnnuuuN[3]);
         GlStateManager._scissorBox(var0.VVuuUN[0], var0.VVuuUN[1], var0.VVuuUN[2], var0.VVuuUN[3]);
      }
   }

   public static boolean UuUVuuUu(int var0, int var1) {
      int var2 = UuUVuuUu(var1);
      GL30.glBindFramebuffer(var0, var2);
      return var2 == var1;
   }

   public static int UuUVuuUu(int var0) {
      if (var0 <= 0) {
         return 0;
      } else {
         try {
            return GL30.glIsFramebuffer(var0) ? var0 : 0;
         } catch (Throwable var2) {
            return 0;
         }
      }
   }

   private static int C00OOC00oO(int var0, int var1) {
      return var0 == 0 && var1 != 1029 && var1 != 1028 && var1 != 1032 ? 1029 : var1;
   }

   private static int uUnuvNvvNU(int var0, int var1) {
      return var0 == 0 && var1 != 1029 && var1 != 1028 && var1 != 1032 ? 1029 : var1;
   }

   private static void UuUVuuUu(int var0, boolean var1) {
      if (var1) {
         GL11.glEnable(var0);
      } else {
         GL11.glDisable(var0);
      }
   }

   public static final class NVnVnNnN {
      public int UuUVuuUu;
      public int C00OOC00oO;
      public int uUnuvNvvNU;
      public int vVvUvVVuuNvV;
      public final int[] uNNnnnuuuN = new int[4];
      public boolean nuUnNvnuUu;
      public final int[] VVuuUN = new int[4];
      public boolean vNUvnnVnUvu;
      public boolean uVUuuVnNVU;
      public boolean vuuuNvNuv;
      public boolean nvUVNnuu;
      public int UuuNnUvUuv;
      public int nUUVuvU;
      public int UnUNVVVNuv;
      public int vNVuvnUUnuUn;
      public boolean UvnvNVnnnnNU;
      public boolean uVUVnuvnuVuv;
      public boolean NVNnnvnuunNv;
      public boolean uVunuUNVVUUV;
      public boolean UNnVVNvvnVvU;
      public int uNnUnnuNUnNu;
      public boolean NnUuNNU;
      public float nNvNUVU;
      public float UnUNuUU;
      public boolean uUVuVvuNUvnu;
      public int UvUvUNuvNU;
      public int c0oOOCcCoC0;
      public int VVnVNnunVvu;
      public int unNNVVNnvvV;
      public int NuunnvnN;
      public int NVUunUNUN;
      public int UUVNuUNUvUnV;
      public final int[] vuvnUnVnUNnV = new int[12];
      public int nnuUVNUuvvVU;
   }
}
