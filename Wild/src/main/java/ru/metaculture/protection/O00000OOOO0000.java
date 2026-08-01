package ru.metaculture.protection;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OOOO0000 {
   private static final O00000OOOO0000 O00000000 = new O00000OOOO0000();
   private static final String O000000000 = "assets/wild/shaders/foundry/pin.vert";
   private static final String O0000000000 = "assets/wild/shaders/foundry/pin.frag";
   private static final int O00000000000 = 18;
   private static final int O000000000000 = 6;
   private static final int O0000000000000 = 96;
   private static final int O000000000000O = 576;
   private static final int O00000000000O = 72;
   private O0000O00OO0 O00000000000O0;
   private int O00000000000OO;
   private int O0000000000O;
   private FloatBuffer O0000000000O0;
   private boolean O0000000000O00;
   private boolean O0000000000O0O;
   private boolean O0000000000OO;
   private int O0000000000OO0;
   private int O0000000000OOO;
   private int O000000000O;
   private int O000000000O0 = -1;
   private int O000000000O00 = -1;

   private O00000OOOO0000() {
   }

   public static O00000OOOO0000 O00000000() {
      return O00000000;
   }

   public boolean O00000000(RenderManager o0000O00OO0O0, int i, int j) {
      if (this.O0000000000O0O || o0000O00OO0O0 == null || i <= 0 || j <= 0) {
         return false;
      } else if (!this.O0000000000()) {
         return false;
      } else {
         o0000O00OO0O0.O0000000000();
         this.O0000000000OO0 = i;
         this.O0000000000OOO = j;
         this.O000000000O = 0;
         this.O0000000000OO = true;
         this.O0000000000O0.clear();
         return true;
      }
   }

   public void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, int j, int k, float l, float m) {
      if (this.O0000000000OO && o0000O00OO0O0 != null && this.O000000000O + 6 <= 576 && !(h <= 0.001F) && !(i <= 0.001F)) {
         float var10 = Math.max(0.0F, Math.min(1.0F, o0000O00OO0O0.O0000000000O00()));
         if (!(var10 <= 0.001F)) {
            float[] var11 = o0000O00OO0O0.O0000000000O().O000000000000();
            float var12 = O00000000(var11, f, g);
            float var13 = O000000000(var11, f, g);
            float var14 = O00000000(var11);
            float var15 = Math.max(1.0F, h * var14);
            float var16 = Math.max(0.35F, Math.min(var15, i * var14));
            float var17 = var15 + 10.0F + l * 9.0F;
            float var18 = (j >>> 16 & 0xFF) / 255.0F;
            float var19 = (j >>> 8 & 0xFF) / 255.0F;
            float var20 = (j & 0xFF) / 255.0F;
            float var21 = (j >>> 24 & 0xFF) / 255.0F * var10;
            float var22 = (k >>> 16 & 0xFF) / 255.0F;
            float var23 = (k >>> 8 & 0xFF) / 255.0F;
            float var24 = (k & 0xFF) / 255.0F;
            float var25 = (k >>> 24 & 0xFF) / 255.0F * var10;
            this.O00000000(var12 - var17, var13 - var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, l, m, -1.0F, -1.0F);
            this.O00000000(var12 + var17, var13 - var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, l, m, 1.0F, -1.0F);
            this.O00000000(var12 + var17, var13 + var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, l, m, 1.0F, 1.0F);
            this.O00000000(var12 - var17, var13 - var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, l, m, -1.0F, -1.0F);
            this.O00000000(var12 + var17, var13 + var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, l, m, 1.0F, 1.0F);
            this.O00000000(var12 - var17, var13 + var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, l, m, -1.0F, 1.0F);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O000000000() {
      if (this.O0000000000OO) {
         this.O0000000000OO = false;
         if (this.O000000000O > 0) {
            this.O0000000000O0.flip();
            O0000O00O0OOO0.W373 var1 = O0000O00O0OOO0.O00000000();
            boolean var6 = false /* VF: Semaphore variable */;

            label75: {
               try {
                  var6 = true;
                  GL11.glViewport(0, 0, this.O0000000000OO0, this.O0000000000OOO);
                  GL11.glDisable(3089);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.O00000000000O0.O00000000();
                  if (this.O000000000O0 >= 0) {
                     GL20.glUniform2f(this.O000000000O0, this.O0000000000OO0, this.O0000000000OOO);
                  }

                  if (this.O000000000O00 >= 0) {
                     GL20.glUniform1f(this.O000000000O00, O00000OOOO0O0.O00000000().O0000000000());
                  }

                  GL30.glBindVertexArray(this.O00000000000OO);
                  GL15.glBindBuffer(34962, this.O0000000000O);
                  GL15.glBufferSubData(34962, 0L, this.O0000000000O0);
                  GL11.glDrawArrays(4, 0, this.O000000000O);
                  var6 = false;
                  break label75;
               } catch (Throwable var7) {
                  this.O0000000000O0O = true;
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

   private boolean O0000000000() {
      if (!this.O0000000000O00) {
         this.O0000000000O00 = true;

         try {
            this.O00000000000O0 = O0000O00OO0.O00000000("assets/wild/shaders/foundry/pin.vert", "assets/wild/shaders/foundry/pin.frag");
            this.O000000000O0 = this.O00000000000O0.O00000000("uViewport");
            this.O000000000O00 = this.O00000000000O0.O00000000("uTime");
            this.O00000000000OO = GL30.glGenVertexArrays();
            this.O0000000000O = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O00000000000OO);
            GL15.glBindBuffer(34962, this.O0000000000O);
            GL15.glBufferData(34962, 41472L, 35048);
            int var1 = 0;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, 72, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, 72, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 2, 5126, false, 72, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(3);
            GL20.glVertexAttribPointer(3, 4, 5126, false, 72, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, 5126, false, 72, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, 72, var1);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            this.O0000000000O0 = BufferUtils.createFloatBuffer(10368);
            return true;
         } catch (Throwable var2) {
            this.O0000000000O0O = true;
            this.O00000000000O0 = null;
            return false;
         }
      } else {
         return this.O00000000000O0 != null && this.O00000000000OO != 0;
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
      float w
   ) {
      this.O0000000000O0.put(f).put(g);
      this.O0000000000O0.put(h).put(i);
      this.O0000000000O0.put(j).put(k);
      this.O0000000000O0.put(l).put(m).put(n).put(o);
      this.O0000000000O0.put(p).put(q).put(r).put(s);
      this.O0000000000O0.put(Math.max(0.0F, Math.min(1.0F, t))).put(u).put(v).put(w);
      this.O000000000O++;
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
}
