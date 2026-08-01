package ru.metaculture.protection;

import java.nio.FloatBuffer;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O0000O0000O000 {
   private static final FloatBuffer O00000000 = BufferUtils.createFloatBuffer(12);
   private static O0000O00OO0 O000000000;
   private static int O0000000000;
   private static int O00000000000;
   private static int O000000000000;
   private static int O0000000000000;
   private static int O000000000000O;
   private static int O00000000000O;
   private static int O00000000000O0;
   private static int O00000000000OO;
   private static int O0000000000O;
   private static int O0000000000O0;

   private O0000O0000O000() {
   }

   static void O00000000(float f, float g, float h, int i, int j, int k, float l, boolean bl) {
      MinecraftClient var8 = MinecraftClient.getInstance();
      if (var8 != null && var8.getWindow() != null && !var8.getWindow().hasZeroWidthOrHeight() && i > 0) {
         float var9 = h * 0.3F;
         O0000O00O0OOO0.W373 var10 = O0000O00O0OOO0.O00000000();

         try {
            O00000000();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(1, 771, 1, 771);
            GL30.glBindVertexArray(O0000000000);
            O000000000.O00000000();
            GL20.glUniform2f(O000000000000, var8.getWindow().getFramebufferWidth(), var8.getWindow().getFramebufferHeight());
            GL20.glUniform4f(O0000000000000, f - var9, g - var9, h + var9 * 2.0F, h + var9 * 2.0F);
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL20.glUniform1i(O000000000000O, 0);
            GL20.glUniform3f(O00000000000O, O00000000(j), O000000000(j), O0000000000(j));
            GL20.glUniform3f(O00000000000O0, O00000000(k), O000000000(k), O0000000000(k));
            GL20.glUniform1f(O00000000000OO, (float)(System.currentTimeMillis() % 1000000L) * 0.001F);
            GL20.glUniform1f(O0000000000O, Math.max(0.0F, Math.min(1.0F, l)));
            GL20.glUniform1f(O0000000000O0, bl ? 1.0F : 0.0F);
            GL11.glDrawArrays(4, 0, 6);
         } finally {
            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL11.glBindTexture(3553, 0);
            O0000O00O0OOO0.O00000000(var10);
         }
      }
   }

   private static void O00000000() {
      if (O000000000 == null) {
         O000000000 = O0000O00OO0.O00000000("assets/wild/shaders/hud/avatar.vert", "assets/wild/shaders/hud/avatar.frag");
         O000000000000 = O000000000.O00000000("uViewport");
         O0000000000000 = O000000000.O00000000("uDrawRect");
         O000000000000O = O000000000.O00000000("uTexture");
         O00000000000O = O000000000.O00000000("uAccentTop");
         O00000000000O0 = O000000000.O00000000("uAccentBottom");
         O00000000000OO = O000000000.O00000000("uTime");
         O0000000000O = O000000000.O00000000("uAlpha");
         O0000000000O0 = O000000000.O00000000("uLightMode");
      }

      if (O0000000000 == 0) {
         O0000000000 = GL30.glGenVertexArrays();
         O00000000000 = GL15.glGenBuffers();
         GL30.glBindVertexArray(O0000000000);
         GL15.glBindBuffer(34962, O00000000000);
         GL15.glBufferData(34962, O00000000, 35044);
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, 8, 0L);
         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
      }
   }

   private static float O00000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
      return (i & 0xFF) / 255.0F;
   }

   static {
      O00000000.put(0.0F).put(0.0F);
      O00000000.put(1.0F).put(0.0F);
      O00000000.put(1.0F).put(1.0F);
      O00000000.put(0.0F).put(0.0F);
      O00000000.put(1.0F).put(1.0F);
      O00000000.put(0.0F).put(1.0F);
      O00000000.flip();
   }
}
