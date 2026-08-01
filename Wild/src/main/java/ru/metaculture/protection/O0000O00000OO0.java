package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class O0000O00000OO0 implements AutoCloseable {
   private static final O0000O00000OO0 O00000000 = new O0000O00000OO0();
   private static final String O000000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String O0000000000 = "assets/wild/shaders/mainmenu/sakura_breeze.frag";
   private final O00000OOO000 O00000000000 = new O00000OOO000();
   private O00000OOO O000000000000;
   private O00000OOO000.W289 O0000000000000;
   private long O000000000000O = System.nanoTime();
   private long O00000000000O;
   private float O00000000000O0;
   private float O00000000000OO;
   private float O0000000000O;
   private float O0000000000O0;

   public static O0000O00000OO0 O00000000() {
      return O00000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(int i, int j, float f, float g, ColorScheme o0000O000O0OO, float h) {
      if (i > 0 && j > 0) {
         this.O000000000();
         O0000O00O0OOO0.W373 var7 = O0000O00O0OOO0.O00000000();
         boolean var18 = false /* VF: Semaphore variable */;

         try {
            var18 = true;
            GL11.glViewport(0, 0, i, j);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(3089);
            GL11.glDisable(36281);
            GlStateManager._enableBlend();
            GlStateManager._blendFuncSeparate(770, 771, 1, 771);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            this.O0000000000000.O00000000();
            this.O0000000000000.O00000000("uViewport", i, j);
            this.O0000000000000.O00000000("uRect", 0.0F, 0.0F, i, j);
            long var8 = System.nanoTime();
            float var10 = (float)(var8 - this.O000000000000O) / 1.0E9F;
            float var11 = this.O00000000(f / Math.max(1.0F, (float)i));
            float var12 = this.O00000000(g / Math.max(1.0F, (float)j));
            this.O00000000(var11, var12, var8);
            this.O0000000000000.O00000000("uTime", var10);
            this.O0000000000000.O00000000("uResolution", i, j);
            this.O0000000000000.O00000000("uMouse", var11, var12);
            this.O0000000000000.O00000000("uMouseVelocity", this.O0000000000O, this.O0000000000O0);
            int var13 = o0000O000O0OO == null ? -18491 : o0000O000O0OO.O000000000O0();
            int var14 = o0000O000O0OO == null ? -16181 : o0000O000O0OO.O000000000O00();
            this.O0000000000000.O00000000("uAccentTop", this.O00000000(var13, 16), this.O00000000(var13, 8), this.O00000000(var13, 0));
            this.O0000000000000.O00000000("uAccentBottom", this.O00000000(var14, 16), this.O00000000(var14, 8), this.O00000000(var14, 0));
            this.O0000000000000.O00000000("uActivity", 1.0F);
            this.O0000000000000.O00000000("uAlpha", this.O00000000(h) * 0.9F);
            this.O0000000000000.O00000000("uLightMode", o0000O000O0OO != null && o0000O000O0OO.O000000000O000() ? 1.0F : 0.0F);

            for (int var15 = 0; var15 < 14; var15++) {
               this.O0000000000000.O00000000("uTrail[" + var15 + "]", 0.0F, 0.0F, 100.0F, 0.0F);
            }

            this.O000000000000.O00000000();
            var18 = false;
         } finally {
            if (var18) {
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var7);
               GlStateManager._enableBlend();
               GlStateManager._blendFuncSeparate(770, 771, 1, 771);
            }
         }

         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var7);
         GlStateManager._enableBlend();
         GlStateManager._blendFuncSeparate(770, 771, 1, 771);
      }
   }

   private void O00000000(float f, float g, long l) {
      if (this.O00000000000O == 0L) {
         this.O00000000000O = l;
         this.O00000000000O0 = f;
         this.O00000000000OO = g;
         this.O0000000000O = 0.0F;
         this.O0000000000O0 = 0.0F;
      } else {
         float var5 = (float)(l - this.O00000000000O) / 1.0E9F;
         this.O00000000000O = l;
         if (Float.isFinite(var5) && !(var5 <= 0.0F)) {
            var5 = Math.min(var5, 0.08F);
            float var6 = this.O00000000((f - this.O00000000000O0) / var5, 4.0F);
            float var7 = this.O00000000((g - this.O00000000000OO) / var5, 4.0F);
            this.O00000000000O0 = f;
            this.O00000000000OO = g;
            float var8 = 1.0F - (float)Math.exp(-var5 * 16.0F);
            this.O0000000000O = this.O0000000000O + (var6 - this.O0000000000O) * var8;
            this.O0000000000O0 = this.O0000000000O0 + (var7 - this.O0000000000O0) * var8;
         }
      }
   }

   private void O000000000() {
      if (this.O000000000000 == null) {
         this.O000000000000 = new O00000OOO();
      }

      if (this.O0000000000000 == null) {
         this.O0000000000000 = this.O00000000000
            .O00000000("sakura_breeze_click_gui", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
      }
   }

   private float O00000000(int i, int j) {
      return (i >> j & 0xFF) / 255.0F;
   }

   private float O00000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private float O00000000(float f, float g) {
      return Math.max(-g, Math.min(g, f));
   }

   @Override
   public void close() {
      if (this.O000000000000 != null) {
         this.O000000000000.close();
         this.O000000000000 = null;
      }

      this.O00000000000.close();
      this.O0000000000000 = null;
      this.O000000000000O = System.nanoTime();
      this.O00000000000O = 0L;
      this.O00000000000O0 = 0.0F;
      this.O00000000000OO = 0.0F;
      this.O0000000000O = 0.0F;
      this.O0000000000O0 = 0.0F;
   }
}
