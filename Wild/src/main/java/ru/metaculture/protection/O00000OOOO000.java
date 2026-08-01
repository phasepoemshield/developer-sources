package ru.metaculture.protection;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OOOO000 {
   private static final O00000OOOO000 O00000000 = new O00000OOOO000();
   private static final String O000000000 = "assets/wild/shaders/foundry/node_surface.vert";
   private static final String O0000000000 = "assets/wild/shaders/foundry/node_surface.frag";
   private static final int O00000000000 = 26;
   private static final int O000000000000 = 6;
   private static final int O0000000000000 = 104;
   private O0000O00OO0 O000000000000O;
   private int O00000000000O;
   private int O00000000000O0;
   private int O00000000000OO = -1;
   private int O0000000000O = -1;
   private FloatBuffer O0000000000O0;
   private boolean O0000000000O00;
   private boolean O0000000000O0O;

   private O00000OOOO000() {
   }

   public static O00000OOOO000 O00000000() {
      return O00000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      ColorScheme o0000O000O0OO,
      float n,
      float o,
      int p,
      int q,
      boolean bl
   ) {
      if (!this.O0000000000O0O && o0000O00OO0O0 != null && !(h <= 1.0F) && !(i <= 1.0F) && p > 0 && q > 0) {
         float var16 = O00000000(o0000O00OO0O0.O0000000000O00(), 0.0F, 1.0F);
         if (!(var16 <= 0.001F) && this.O000000000()) {
            float[] var17 = o0000O00OO0O0.O0000000000O().O000000000000();
            float var18 = O00000000(var17, f, g);
            float var19 = O000000000(var17, f, g);
            float var20 = O00000000(var17, f + h, g);
            float var21 = O000000000(var17, f + h, g);
            float var22 = O00000000(var17, f + h, g + i);
            float var23 = O000000000(var17, f + h, g + i);
            float var24 = O00000000(var17, f, g + i);
            float var25 = O000000000(var17, f, g + i);
            float var26 = O00000000(var18, var20, var22, var24);
            float var27 = O00000000(var19, var21, var23, var25);
            float var28 = Math.max(1.0F, O000000000(var18, var20, var22, var24) - var26);
            float var29 = Math.max(1.0F, O000000000(var19, var21, var23, var25) - var27);
            float var30 = O00000000(var17);
            float var31 = Math.max(1.0F, j * var30);
            float var32 = Math.max(9.0F, Math.min(34.0F, (15.0F + l * 11.0F + k * 5.0F) * var30));
            float var33 = var32 * 2.18F + 4.0F;
            float var34 = var26 - var33;
            float var35 = var27 - var33;
            float var36 = var28 + var33 * 2.0F;
            float var37 = var29 + var33 * 2.0F;
            int var38 = o0000O000O0OO == null ? -36966 : o0000O000O0OO.O000000000O0();
            int var39 = o0000O000O0OO == null ? -8462337 : o0000O000O0OO.O000000000O00();
            int var40 = bl ? ColorScheme.O00000000(238, 242, 250, 214) : ColorScheme.O00000000(7, 9, 14, 218);
            this.O0000000000O0.clear();
            this.O00000000(var34, var35, var34 - var26, var35 - var27, var28, var29, var31, var32, var38, var39, var40, k, l, m, var16, n - var26, o - var27);
            this.O00000000(
               var34 + var36,
               var35,
               var34 + var36 - var26,
               var35 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               k,
               l,
               m,
               var16,
               n - var26,
               o - var27
            );
            this.O00000000(
               var34 + var36,
               var35 + var37,
               var34 + var36 - var26,
               var35 + var37 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               k,
               l,
               m,
               var16,
               n - var26,
               o - var27
            );
            this.O00000000(var34, var35, var34 - var26, var35 - var27, var28, var29, var31, var32, var38, var39, var40, k, l, m, var16, n - var26, o - var27);
            this.O00000000(
               var34 + var36,
               var35 + var37,
               var34 + var36 - var26,
               var35 + var37 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               k,
               l,
               m,
               var16,
               n - var26,
               o - var27
            );
            this.O00000000(
               var34,
               var35 + var37,
               var34 - var26,
               var35 + var37 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               k,
               l,
               m,
               var16,
               n - var26,
               o - var27
            );
            this.O0000000000O0.flip();
            o0000O00OO0O0.O0000000000();
            O0000O00O0OOO0.W373 var41 = O0000O00O0OOO0.O00000000();
            boolean var47 = false /* VF: Semaphore variable */;

            boolean var42;
            label90: {
               boolean var43;
               try {
                  var47 = true;
                  GL11.glViewport(0, 0, p, q);
                  GL11.glDisable(3089);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.O000000000000O.O00000000();
                  if (this.O00000000000OO >= 0) {
                     GL20.glUniform2f(this.O00000000000OO, p, q);
                  }

                  if (this.O0000000000O >= 0) {
                     GL20.glUniform1f(this.O0000000000O, O00000OOOO0O0.O00000000().O0000000000());
                  }

                  GL30.glBindVertexArray(this.O00000000000O);
                  GL15.glBindBuffer(34962, this.O00000000000O0);
                  GL15.glBufferSubData(34962, 0L, this.O0000000000O0);
                  GL11.glDrawArrays(4, 0, 6);
                  var42 = true;
                  var47 = false;
                  break label90;
               } catch (Throwable var48) {
                  this.O0000000000O0O = true;
                  var43 = false;
                  var47 = false;
               } finally {
                  if (var47) {
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     GL15.glBindBuffer(34962, 0);
                     O0000O00O0OOO0.O00000000(var41);
                  }
               }

               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               O0000O00O0OOO0.O00000000(var41);
               return var43;
            }

            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL15.glBindBuffer(34962, 0);
            O0000O00O0OOO0.O00000000(var41);
            return var42;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O000000000() {
      if (!this.O0000000000O00) {
         this.O0000000000O00 = true;

         try {
            this.O000000000000O = O0000O00OO0.O00000000("assets/wild/shaders/foundry/node_surface.vert", "assets/wild/shaders/foundry/node_surface.frag");
            this.O00000000000OO = this.O000000000000O.O00000000("uViewport");
            this.O0000000000O = this.O000000000000O.O00000000("uTime");
            this.O00000000000O = GL30.glGenVertexArrays();
            this.O00000000000O0 = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O00000000000O);
            GL15.glBindBuffer(34962, this.O00000000000O0);
            GL15.glBufferData(34962, 624L, 35048);
            int var1 = 0;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(3);
            GL20.glVertexAttribPointer(3, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(6);
            GL20.glVertexAttribPointer(6, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 2, 5126, false, 104, var1);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            this.O0000000000O0 = BufferUtils.createFloatBuffer(156);
            return true;
         } catch (Throwable var2) {
            this.O0000000000O0O = true;
            this.O000000000000O = null;
            return false;
         }
      } else {
         return this.O000000000000O != null && this.O00000000000O != 0;
      }
   }

   private void O00000000(
      float f, float g, float h, float i, float j, float k, float l, float m, int n, int o, int p, float q, float r, float s, float t, float u, float v
   ) {
      this.O0000000000O0.put(f).put(g);
      this.O0000000000O0.put(h).put(i);
      this.O0000000000O0.put(j).put(k).put(l).put(m);
      this.O00000000(n);
      this.O00000000(o);
      this.O00000000(p);
      this.O0000000000O0.put(O00000000(q, 0.0F, 1.0F)).put(O00000000(r, 0.0F, 1.0F)).put(O00000000(s, 0.0F, 1.0F)).put(t);
      this.O0000000000O0.put(u).put(v);
   }

   private void O00000000(int i) {
      this.O0000000000O0.put(O000000000(i)).put(O0000000000(i)).put(O00000000000(i)).put(O000000000000(i));
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

   private static float O000000000(int i) {
      return (i >>> 16 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
      return (i >>> 8 & 0xFF) / 255.0F;
   }

   private static float O00000000000(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private static float O000000000000(int i) {
      return (i >>> 24 & 0xFF) / 255.0F;
   }

   private static float O00000000(float f, float g, float h) {
      return f < g ? g : Math.min(f, h);
   }
}
