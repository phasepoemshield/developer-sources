package ru.metaculture.protection;

import java.nio.FloatBuffer;
import net.minecraft.class_310;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class vuuuVVvVuNV {
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

   private vuuuVVvVuNV() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void UuUVuuUu(float var0, float var1, float var2, int var3, int var4, int var5, float var6, boolean var7) {
      class_310 var8 = class_310.method_1551();
      if (var8 != null && var8.method_22683() != null && !var8.method_22683().method_65966() && var3 > 0) {
         float var9 = var2 * 0.3F;
         VvuuVNVUn.NVnVnNnN var10 = VvuuVNVUn.UuUVuuUu();
         boolean var13 = false /* VF: Semaphore variable */;

         try {
            var13 = true;
            UuUVuuUu();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(1, 771, 1, 771);
            GL30.glBindVertexArray(uUnuvNvvNU);
            C00OOC00oO.UuUVuuUu();
            GL20.glUniform2f(uNNnnnuuuN, var8.method_22683().method_4489(), var8.method_22683().method_4506());
            GL20.glUniform4f(nuUnNvnuUu, var0 - var9, var1 - var9, var2 + var9 * 2.0F, var2 + var9 * 2.0F);
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var3);
            GL20.glUniform1i(VVuuUN, 0);
            GL20.glUniform3f(vNUvnnVnUvu, UuUVuuUu(var4), C00OOC00oO(var4), uUnuvNvvNU(var4));
            GL20.glUniform3f(uVUuuVnNVU, UuUVuuUu(var5), C00OOC00oO(var5), uUnuvNvvNU(var5));
            GL20.glUniform1f(vuuuNvNuv, (float)(System.currentTimeMillis() % 1000000L) * 0.001F);
            GL20.glUniform1f(nvUVNnuu, Math.max(0.0F, Math.min(1.0F, var6)));
            GL20.glUniform1f(UuuNnUvUuv, var7 ? 1.0F : 0.0F);
            GL11.glDrawArrays(4, 0, 6);
            var13 = false;
         } finally {
            if (var13) {
               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL11.glBindTexture(3553, 0);
               VvuuVNVUn.uUnuvNvvNU(var10);
            }
         }

         GL20.glUseProgram(0);
         GL30.glBindVertexArray(0);
         GL11.glBindTexture(3553, 0);
         VvuuVNVUn.uUnuvNvvNU(var10);
      }
   }

   private static void UuUVuuUu() {
      if (C00OOC00oO == null) {
         C00OOC00oO = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/hud/avatar.vert", "assets/wild/shaders/hud/avatar.frag");
         uNNnnnuuuN = C00OOC00oO.UuUVuuUu("uViewport");
         nuUnNvnuUu = C00OOC00oO.UuUVuuUu("uDrawRect");
         VVuuUN = C00OOC00oO.UuUVuuUu("uTexture");
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
