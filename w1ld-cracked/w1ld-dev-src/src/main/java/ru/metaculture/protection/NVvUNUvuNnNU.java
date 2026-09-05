package ru.metaculture.protection;

import java.nio.FloatBuffer;
import net.minecraft.class_310;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class NVvUNUvuNnNU {
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
   private static int nUUVuvU;
   private static int UnUNVVVNuv;
   private static int vNVuvnUUnuUn;
   private static int UvnvNVnnnnNU;
   private static int uVUVnuvnuVuv;
   private static int NVNnnvnuunNv;
   private static int uVunuUNVVUUV;
   private static int UNnVVNvvnVvU;

   private NVvUNUvuNnNU() {
   }

   static void UuUVuuUu(
      float var0,
      float var1,
      float var2,
      int var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      float var12,
      boolean var13
   ) {
      UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, false);
   }

   public static void UuUVuuUu(float var0, float var1, float var2, int var3, int var4, float var5, boolean var6) {
      UuUVuuUu(var0, var1, var2, 5, 1.0F, 1.0F, 1.0F, var3, 0, 0, 0, 0, var5, var6, true);
   }

   private static void UuUVuuUu(
      float var0,
      float var1,
      float var2,
      int var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      float var12,
      boolean var13,
      boolean var14
   ) {
      class_310 var15 = class_310.method_1551();
      if (var15 != null && var15.method_22683() != null && !var15.method_22683().method_65966()) {
         float var16 = Math.max(10.0F, var2 * 0.35F);
         VvuuVNVUn.NVnVnNnN var17 = VvuuVNVUn.UuUVuuUu();

         try {
            UuUVuuUu();
            if (var14) {
               GL11.glViewport(0, 0, var15.method_22683().method_4489(), var15.method_22683().method_4506());
               GL11.glDisable(3089);
            }

            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(1, 771, 1, 771);
            GL30.glBindVertexArray(uUnuvNvvNU);
            C00OOC00oO.UuUVuuUu();
            GL20.glUniform2f(uNNnnnuuuN, var15.method_22683().method_4489(), var15.method_22683().method_4506());
            GL20.glUniform4f(nuUnNvnuUu, var0 - var16, var1 - var16, var2 + var16 * 2.0F, var2 + var16 * 2.0F);
            GL20.glUniform4f(VVuuUN, var0, var1, var2, var2);
            GL20.glUniform3f(vNUvnnVnUvu, UuUVuuUu(var7), C00OOC00oO(var7), uUnuvNvvNU(var7));
            GL20.glUniform3f(uVUuuVnNVU, UuUVuuUu(var8), C00OOC00oO(var8), uUnuvNvvNU(var8));
            GL20.glUniform4f(vuuuNvNuv, UuUVuuUu(var9), C00OOC00oO(var9), uUnuvNvvNU(var9), vVvUvVVuuNvV(var9));
            GL20.glUniform4f(nvUVNnuu, UuUVuuUu(var10), C00OOC00oO(var10), uUnuvNvvNU(var10), vVvUvVVuuNvV(var10));
            GL20.glUniform4f(UuuNnUvUuv, UuUVuuUu(var11), C00OOC00oO(var11), uUnuvNvvNU(var11), vVvUvVVuuNvV(var11));
            GL20.glUniform1f(nUUVuvU, (float)(System.currentTimeMillis() % 1000000L) * 0.001F);
            GL20.glUniform1f(UnUNVVVNuv, var12);
            GL20.glUniform1f(vNVuvnUUnuUn, var13 ? 1.0F : 0.0F);
            GL20.glUniform1f(UvnvNVnnnnNU, var4);
            GL20.glUniform1f(uVUVnuvnuVuv, var5);
            GL20.glUniform1f(NVNnnvnuunNv, var6);
            GL20.glUniform1i(uVunuUNVVUUV, var3);
            GL20.glUniform1f(UNnVVNvvnVvU, var14 ? 1.0F : 0.0F);
            GL11.glDrawArrays(4, 0, 6);
         } finally {
            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            VvuuVNVUn.uUnuvNvvNU(var17);
         }
      }
   }

   private static void UuUVuuUu() {
      if (C00OOC00oO == null) {
         C00OOC00oO = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/hud/wild_logo.vert", "assets/wild/shaders/clickgui/sidebar_nav.frag");
         uNNnnnuuuN = C00OOC00oO.UuUVuuUu("uViewport");
         nuUnNvnuUu = C00OOC00oO.UuUVuuUu("uDrawRect");
         VVuuUN = C00OOC00oO.UuUVuuUu("uBoxRect");
         vNUvnnVnUvu = C00OOC00oO.UuUVuuUu("uAccentTop");
         uVUuuVnNVU = C00OOC00oO.UuUVuuUu("uAccentBottom");
         vuuuNvNuv = C00OOC00oO.UuUVuuUu("uMuted");
         nvUVNnuu = C00OOC00oO.UuUVuuUu("uFill");
         UuuNnUvUuv = C00OOC00oO.UuUVuuUu("uOutline");
         nUUVuvU = C00OOC00oO.UuUVuuUu("uTime");
         UnUNVVVNuv = C00OOC00oO.UuUVuuUu("uAlpha");
         vNVuvnUUnuUn = C00OOC00oO.UuUVuuUu("uLightMode");
         UvnvNVnnnnNU = C00OOC00oO.UuUVuuUu("uHover");
         uVUVnuvnuVuv = C00OOC00oO.UuUVuuUu("uActive");
         NVNnnvnuunNv = C00OOC00oO.UuUVuuUu("uPop");
         uVunuUNVVUUV = C00OOC00oO.UuUVuuUu("uIcon");
         UNnVVNvvnVvU = C00OOC00oO.UuUVuuUu("uIconOnly");
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

   private static float vVvUvVVuuNvV(int var0) {
      return (var0 >>> 24 & 0xFF) / 255.0F;
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
