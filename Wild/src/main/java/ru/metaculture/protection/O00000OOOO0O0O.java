package ru.metaculture.protection;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OOOO0O0O {
   private static final O00000OOOO0O0O O00000000 = new O00000OOOO0O0O();
   private static final String O000000000 = "assets/wild/shaders/foundry/wire.vert";
   private static final String O0000000000 = "assets/wild/shaders/foundry/wire.frag";
   private static final int O00000000000 = 6;
   private static final int O000000000000 = 26;
   private static final int O0000000000000 = 104;
   private static final int O000000000000O = 256;
   private static final int O00000000000O = 1536;
   private O0000O00OO0 O00000000000O0;
   private int O00000000000OO;
   private int O0000000000O;
   private FloatBuffer O0000000000O0;
   private boolean O0000000000O00;
   private boolean O0000000000O0O;
   private boolean O0000000000OO;
   private int O0000000000OO0;
   private int O0000000000OOO;
   private float O000000000O;
   private int O000000000O0;
   private int O000000000O00;
   private int O000000000O000;
   private int O000000000O00O;
   private float[] O000000000O0O;

   private O00000OOOO0O0O() {
   }

   public static O00000OOOO0O0O O00000000() {
      return O00000000;
   }

   public boolean O00000000(RenderManager o0000O00OO0O0, int i, int j, float f) {
      if (!this.O0000000000O0O && o0000O00OO0O0 != null && i > 0 && j > 0) {
         float var5 = O00000000(f, 0.0F, 1.0F) * O00000000(o0000O00OO0O0.O0000000000O00(), 0.0F, 1.0F);
         if (!(var5 <= 0.001F) && this.O0000000000()) {
            o0000O00OO0O0.O0000000000();
            this.O0000000000OO0 = i;
            this.O0000000000OOO = j;
            this.O000000000O = var5;
            this.O000000000O0 = 0;
            this.O0000000000OO = true;
            this.O000000000O0O = o0000O00OO0O0.O0000000000O().O000000000000();
            this.O0000000000O0.clear();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void O00000000(float f, float g, float h, float i, float j, int k, int l, float m, boolean bl, float n, float o) {
      this.O00000000(f, g, h, i, j, k, l, m, bl, n, o, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void O00000000(float f, float g, float h, float i, float j, int k, int l, float m, boolean bl, float n, float o, float p, float q, float r, float s) {
      if (this.O0000000000OO && this.O000000000O0 + 6 <= 1536) {
         float var16 = (k >>> 24 & 0xFF) / 255.0F;
         float var17 = (l >>> 24 & 0xFF) / 255.0F;
         float var18 = (float)Math.hypot(h - f, i - g);
         if ((!(var16 <= 0.001F) || !(var17 <= 0.001F)) && !(var18 < 0.5F)) {
            float var19 = O00000000((i - g) * 0.035F, -18.0F, 18.0F) + O00000000((q + s) * 0.24F, -26.0F, 26.0F);
            float var20 = f + j + p * 0.34F;
            float var21 = g + var19 + q * 0.18F;
            float var22 = h - j + r * 0.34F;
            float var23 = i + var19 + s * 0.18F;
            float var24 = O00000000(this.O000000000O0O, f, g);
            float var25 = O000000000(this.O000000000O0O, f, g);
            float var26 = O00000000(this.O000000000O0O, var20, var21);
            float var27 = O000000000(this.O000000000O0O, var20, var21);
            float var28 = O00000000(this.O000000000O0O, var22, var23);
            float var29 = O000000000(this.O000000000O0O, var22, var23);
            float var30 = O00000000(this.O000000000O0O, h, i);
            float var31 = O000000000(this.O000000000O0O, h, i);
            float var32 = O00000000(this.O000000000O0O);
            float var33 = Math.min(1.86F, Math.max(0.96F, m * 0.88F * var32));
            float var34 = var33 + Math.max(3.1F, 3.7F * var32);
            float var35 = var33 + Math.max(9.0F, 10.6F * var32);
            float var36 = var35 + 4.5F;
            float var37 = O00000000(var24, var26, var28, var30) - var36;
            float var38 = O00000000(var25, var27, var29, var31) - var36;
            float var39 = O000000000(var24, var26, var28, var30) + var36;
            float var40 = O000000000(var25, var27, var29, var31) + var36;
            float var41 = (k >> 16 & 0xFF) / 255.0F;
            float var42 = (k >> 8 & 0xFF) / 255.0F;
            float var43 = (k & 0xFF) / 255.0F;
            float var44 = (l >> 16 & 0xFF) / 255.0F;
            float var45 = (l >> 8 & 0xFF) / 255.0F;
            float var46 = (l & 0xFF) / 255.0F;
            boolean var47 = o >= 0.0F && n > 0.001F;
            float var48 = var47 ? Math.min(1.0F, 0.7F + Math.max(0.0F, n) * 1.15F) : 0.0F;
            float var49 = var47 ? 1.0F : 0.0F;
            float var50 = o < 0.0F ? 0.0F : o;
            this.O00000000(
               var37,
               var38,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               n,
               var48,
               var49,
               var50
            );
            this.O00000000(
               var39,
               var38,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               n,
               var48,
               var49,
               var50
            );
            this.O00000000(
               var39,
               var40,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               n,
               var48,
               var49,
               var50
            );
            this.O00000000(
               var37,
               var38,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               n,
               var48,
               var49,
               var50
            );
            this.O00000000(
               var39,
               var40,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               n,
               var48,
               var49,
               var50
            );
            this.O00000000(
               var37,
               var40,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               n,
               var48,
               var49,
               var50
            );
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O000000000() {
      if (this.O0000000000OO) {
         this.O0000000000OO = false;
         this.O000000000O0O = null;
         if (this.O000000000O0 > 0) {
            this.O0000000000O0.flip();
            O0000O00O0OOO0.W373 var1 = O0000O00O0OOO0.O00000000();
            boolean var6 = false /* VF: Semaphore variable */;

            label54: {
               try {
                  var6 = true;
                  GL11.glViewport(0, 0, this.O0000000000OO0, this.O0000000000OOO);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDisable(3089);
                  GL11.glDepthMask(false);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.O00000000000O0.O00000000();
                  GL30.glBindVertexArray(this.O00000000000OO);
                  GL15.glBindBuffer(34962, this.O0000000000O);
                  GL15.glBufferSubData(34962, 0L, this.O0000000000O0);
                  GL20.glUniform2f(this.O000000000O00, this.O0000000000OO0, this.O0000000000OOO);
                  GL20.glUniform1f(this.O000000000O000, this.O000000000O);
                  GL20.glUniform1f(this.O000000000O00O, O00000OOOO0O0.O00000000().O0000000000());
                  GL11.glDrawArrays(4, 0, this.O000000000O0);
                  var6 = false;
                  break label54;
               } catch (Throwable var7) {
                  var6 = false;
               } finally {
                  if (var6) {
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     GL15.glBindBuffer(34962, 0);
                     O0000O00O0OOO0.O00000000(var1);
                  }
               }

               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               O0000O00O0OOO0.O00000000(var1);
               return;
            }

            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL15.glBindBuffer(34962, 0);
            O0000O00O0OOO0.O00000000(var1);
         }
      }
   }

   public boolean O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, int k, int l, float m, boolean bl, float n, float o, int p, int q
   ) {
      if (!this.O00000000(o0000O00OO0O0, p, q, o)) {
         return false;
      } else {
         this.O00000000(f, g, h, i, j, k, l, m, bl, n, -1.0F);
         this.O000000000();
         return true;
      }
   }

   private boolean O0000000000() {
      if (this.O0000000000O00) {
         return this.O00000000000O0 != null;
      } else {
         this.O0000000000O00 = true;

         try {
            this.O00000000000O0 = O0000O00OO0.O00000000("assets/wild/shaders/foundry/wire.vert", "assets/wild/shaders/foundry/wire.frag");
            this.O000000000O00 = this.O00000000000O0.O00000000("uViewport");
            this.O000000000O000 = this.O00000000000O0.O00000000("uAlpha");
            this.O000000000O00O = this.O00000000000O0.O00000000("u_Time");
            this.O00000000000OO = GL30.glGenVertexArrays();
            this.O0000000000O = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O00000000000OO);
            GL15.glBindBuffer(34962, this.O0000000000O);
            GL15.glBufferData(34962, 159744L, 35048);
            int var1 = 0;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(3);
            GL20.glVertexAttribPointer(3, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(6);
            GL20.glVertexAttribPointer(6, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(8);
            GL20.glVertexAttribPointer(8, 4, 5126, false, 104, var1);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            this.O0000000000O0 = BufferUtils.createFloatBuffer(39936);
            return true;
         } catch (Throwable var2) {
            this.O0000000000O0O = true;
            this.O00000000000O0 = null;
            return false;
         }
      }
   }

   private void O00000000(
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float x,
      float y,
      float z,
      float aa,
      float ab,
      float ac,
      float ad,
      float ae
   ) {
      this.O0000000000O0.put(f).put(g);
      this.O0000000000O0.put(h).put(i);
      this.O0000000000O0.put(j).put(k);
      this.O0000000000O0.put(l).put(m);
      this.O0000000000O0.put(n).put(o);
      this.O0000000000O0.put(p).put(q).put(r).put(s);
      this.O0000000000O0.put(t).put(u).put(v).put(w);
      this.O0000000000O0.put(x).put(y).put(z).put(aa);
      this.O0000000000O0.put(ab).put(ac).put(ad).put(ae);
      this.O000000000O0++;
   }

   private static float O00000000(float[] fs, float f, float g) {
      return fs != null && fs.length >= 9 ? fs[0] * f + fs[1] * g + fs[2] : f;
   }

   private static float O000000000(float[] fs, float f, float g) {
      return fs != null && fs.length >= 9 ? fs[3] * f + fs[4] * g + fs[5] : g;
   }

   private static float O00000000(float[] fs) {
      if (fs != null && fs.length >= 9) {
         float var1 = (float)Math.sqrt(fs[0] * fs[0] + fs[3] * fs[3]);
         float var2 = (float)Math.sqrt(fs[1] * fs[1] + fs[4] * fs[4]);
         return Math.max(0.001F, (var1 + var2) * 0.5F);
      } else {
         return 1.0F;
      }
   }

   private static float O00000000(float f, float g, float h, float i) {
      return Math.min(Math.min(f, g), Math.min(h, i));
   }

   private static float O000000000(float f, float g, float h, float i) {
      return Math.max(Math.max(f, g), Math.max(h, i));
   }

   private static float O00000000(float f, float g, float h) {
      return f < g ? g : Math.min(f, h);
   }
}
