package ru.metaculture.protection;

import java.nio.FloatBuffer;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O0000O0000OOO {
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
   private static int O0000000000O00;
   private static int O0000000000O0O;
   private static int O0000000000OO;
   private static int O0000000000OO0;
   private static int O0000000000OOO;
   private static int O000000000O;
   private static int O000000000O0;

   private O0000O0000OOO() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void O00000000(float f, float g, float h, int i, float j, float k, float l, int m, int n, int o, int p, int q, float r, boolean bl) {
      MinecraftClient var14 = MinecraftClient.getInstance();
      if (var14 != null && var14.getWindow() != null && !var14.getWindow().hasZeroWidthOrHeight()) {
         float var15 = Math.max(10.0F, h * 0.35F);
         O0000O00O0OOO0.W373 var16 = O0000O00O0OOO0.O00000000();
         boolean var19 = false /* VF: Semaphore variable */;

         try {
            var19 = true;
            O00000000();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(1, 771, 1, 771);
            GL30.glBindVertexArray(O0000000000);
            O000000000.O00000000();
            GL20.glUniform2f(O000000000000, var14.getWindow().getFramebufferWidth(), var14.getWindow().getFramebufferHeight());
            GL20.glUniform4f(O0000000000000, f - var15, g - var15, h + var15 * 2.0F, h + var15 * 2.0F);
            GL20.glUniform4f(O000000000000O, f, g, h, h);
            GL20.glUniform3f(O00000000000O, O00000000(m), O000000000(m), O0000000000(m));
            GL20.glUniform3f(O00000000000O0, O00000000(n), O000000000(n), O0000000000(n));
            GL20.glUniform4f(O00000000000OO, O00000000(o), O000000000(o), O0000000000(o), O00000000000(o));
            GL20.glUniform4f(O0000000000O, O00000000(p), O000000000(p), O0000000000(p), O00000000000(p));
            GL20.glUniform4f(O0000000000O0, O00000000(q), O000000000(q), O0000000000(q), O00000000000(q));
            GL20.glUniform1f(O0000000000O00, (float)(System.currentTimeMillis() % 1000000L) * 0.001F);
            GL20.glUniform1f(O0000000000O0O, r);
            GL20.glUniform1f(O0000000000OO, bl ? 1.0F : 0.0F);
            GL20.glUniform1f(O0000000000OO0, j);
            GL20.glUniform1f(O0000000000OOO, k);
            GL20.glUniform1f(O000000000O, l);
            GL20.glUniform1i(O000000000O0, i);
            GL11.glDrawArrays(4, 0, 6);
            var19 = false;
         } finally {
            if (var19) {
               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               O0000O00O0OOO0.O00000000(var16);
            }
         }

         GL20.glUseProgram(0);
         GL30.glBindVertexArray(0);
         O0000O00O0OOO0.O00000000(var16);
      }
   }

   private static void O00000000() {
      if (O000000000 == null) {
         O000000000 = O0000O00OO0.O00000000("assets/wild/shaders/hud/wild_logo.vert", "assets/wild/shaders/clickgui/sidebar_nav.frag");
         O000000000000 = O000000000.O00000000("uViewport");
         O0000000000000 = O000000000.O00000000("uDrawRect");
         O000000000000O = O000000000.O00000000("uBoxRect");
         O00000000000O = O000000000.O00000000("uAccentTop");
         O00000000000O0 = O000000000.O00000000("uAccentBottom");
         O00000000000OO = O000000000.O00000000("uMuted");
         O0000000000O = O000000000.O00000000("uFill");
         O0000000000O0 = O000000000.O00000000("uOutline");
         O0000000000O00 = O000000000.O00000000("uTime");
         O0000000000O0O = O000000000.O00000000("uAlpha");
         O0000000000OO = O000000000.O00000000("uLightMode");
         O0000000000OO0 = O000000000.O00000000("uHover");
         O0000000000OOO = O000000000.O00000000("uActive");
         O000000000O = O000000000.O00000000("uPop");
         O000000000O0 = O000000000.O00000000("uIcon");
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

   private static float O00000000000(int i) {
      return (i >>> 24 & 0xFF) / 255.0F;
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
