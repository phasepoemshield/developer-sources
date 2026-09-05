package ru.metaculture.protection;

import java.nio.FloatBuffer;
import net.minecraft.class_310;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class occc0oc00ooO {
   private static final FloatBuffer UuUVuuUu = BufferUtils.createFloatBuffer(12);
   private static vVvUNNUVVnNn C00OOC00oO;
   private static int uUnuvNvvNU;
   private static int vVvUvVVuuNvV;
   private static int uNNnnnuuuN;
   private static int nuUnNvnuUu;
   private static int VVuuUN;
   private static int vNUvnnVnUvu;
   private static int uVUuuVnNVU;
   private static int vuuuNvNuv;
   private static int nvUVNnuu;
   private static int UuuNnUvUuv;

   private occc0oc00ooO() {
   }

   static void UuUVuuUu(float var0, float var1, float var2, int var3, int var4, float var5, boolean var6) {
      class_310 var7 = class_310.method_1551();
      if (var7 != null && var7.method_22683() != null && !var7.method_22683().method_65966()) {
         float var8 = Math.max(10.0F, var2 * 0.34F);
         float var9 = var0 - var8;
         float var10 = var1 - var8;
         float var11 = var2 + var8 * 2.0F;
         float var12 = var2 + var8 * 2.0F;
         VvuuVNVUn.NVnVnNnN var13 = VvuuVNVUn.UuUVuuUu();

         try {
            UuUVuuUu();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL30.glBindVertexArray(uUnuvNvvNU);
            C00OOC00oO.UuUVuuUu();
            GL20.glUniform2f(uNNnnnuuuN, var7.method_22683().method_4489(), var7.method_22683().method_4506());
            GL20.glUniform4f(nuUnNvnuUu, var9, var10, var11, var12);
            GL20.glUniform4f(VVuuUN, var0, var1, var2, var2);
            int var14 = var6 ? -15066598 : var3;
            int var15 = var6 ? var3 : var4;
            GL20.glUniform3f(vNUvnnVnUvu, UuUVuuUu(var14), C00OOC00oO(var14), uUnuvNvvNU(var14));
            GL20.glUniform3f(uVUuuVnNVU, UuUVuuUu(var15), C00OOC00oO(var15), uUnuvNvvNU(var15));
            GL20.glUniform1f(vuuuNvNuv, (float)(System.currentTimeMillis() % 1000000L) * 0.001F);
            GL20.glUniform1f(nvUVNnuu, var5);
            GL20.glUniform1f(UuuNnUvUuv, var6 ? 1.0F : 0.0F);
            GL11.glDrawArrays(4, 0, 6);
         } finally {
            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            VvuuVNVUn.uUnuvNvvNU(var13);
         }
      }
   }

   private static void UuUVuuUu() {
      if (C00OOC00oO == null) {
         C00OOC00oO = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/hud/wild_logo.vert", "assets/wild/shaders/hud/wild_logo.frag");
         uNNnnnuuuN = C00OOC00oO.UuUVuuUu("uViewport");
         nuUnNvnuUu = C00OOC00oO.UuUVuuUu("uDrawRect");
         VVuuUN = C00OOC00oO.UuUVuuUu("uBoxRect");
         vNUvnnVnUvu = C00OOC00oO.UuUVuuUu("uAccentTop");
         uVUuuVnNVU = C00OOC00oO.UuUVuuUu("uAccentBottom");
         vuuuNvNuv = C00OOC00oO.UuUVuuUu("uTime");
         nvUVNnuu = C00OOC00oO.UuUVuuUu("uAlpha");
         UuuNnUvUuv = C00OOC00oO.UuUVuuUu("uLightMode");
      }

      if (uUnuvNvvNU == 0) {
         uUnuvNvvNU = GL30.glGenVertexArrays();
         vVvUvVVuuNvV = GL15.glGenBuffers();
         GL30.glBindVertexArray(uUnuvNvvNU);
         GL15.glBindBuffer(34962, vVvUvVVuuNvV);
         GL15.glBufferData(34962, UuUVuuUu, 35044);
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, 8, 0L);
         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
      }
   }

   private static float UuUVuuUu(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   static {
      UuUVuuUu.put(0.0F).put(0.0F);
      UuUVuuUu.put(1.0F).put(0.0F);
      UuUVuuUu.put(1.0F).put(1.0F);
      UuUVuuUu.put(0.0F).put(0.0F);
      UuUVuuUu.put(1.0F).put(1.0F);
      UuUVuuUu.put(0.0F).put(1.0F);
      UuUVuuUu.flip();
   }
}
