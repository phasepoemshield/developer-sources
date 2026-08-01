package ru.metaculture.protection;

import java.nio.FloatBuffer;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O0000O0000O0O0 {
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

   private O0000O0000O0O0() {
   }

   static void O00000000(float f, float g, float h, int i, int j, float k, boolean bl) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      if (var7 != null && var7.getWindow() != null && !var7.getWindow().hasZeroWidthOrHeight()) {
         float var8 = Math.max(10.0F, h * 0.34F);
         float var9 = f - var8;
         float var10 = g - var8;
         float var11 = h + var8 * 2.0F;
         float var12 = h + var8 * 2.0F;
         O0000O00O0OOO0.W373 var13 = O0000O00O0OOO0.O00000000();

         try {
            O00000000();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL30.glBindVertexArray(O0000000000);
            O000000000.O00000000();
            GL20.glUniform2f(O000000000000, var7.getWindow().getFramebufferWidth(), var7.getWindow().getFramebufferHeight());
            GL20.glUniform4f(O0000000000000, var9, var10, var11, var12);
            GL20.glUniform4f(O000000000000O, f, g, h, h);
            int var14 = bl ? -15066598 : i;
            int var15 = bl ? i : j;
            GL20.glUniform3f(O00000000000O, O00000000(var14), O000000000(var14), O0000000000(var14));
            GL20.glUniform3f(O00000000000O0, O00000000(var15), O000000000(var15), O0000000000(var15));
            GL20.glUniform1f(O00000000000OO, (float)(System.currentTimeMillis() % 1000000L) * 0.001F);
            GL20.glUniform1f(O0000000000O, k);
            GL20.glUniform1f(O0000000000O0, bl ? 1.0F : 0.0F);
            GL11.glDrawArrays(4, 0, 6);
         } finally {
            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            O0000O00O0OOO0.O00000000(var13);
         }
      }
   }

   private static void O00000000() {
      if (O000000000 == null) {
         O000000000 = O0000O00OO0.O00000000("assets/wild/shaders/hud/wild_logo.vert", "assets/wild/shaders/hud/wild_logo.frag");
         O000000000000 = O000000000.O00000000("uViewport");
         O0000000000000 = O000000000.O00000000("uDrawRect");
         O000000000000O = O000000000.O00000000("uBoxRect");
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
