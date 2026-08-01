package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O0000O0O000O00 {
   private static final int O00000000 = 6;
   private static final float O000000000 = 0.5F;
   private static final float O0000000000 = 30.0F;
   private final O0000O00OO0 O00000000000;
   private final O0000O00OO0 O000000000000;
   private final O0000O00OO0 O0000000000000;
   private final O0000O00OO0 O000000000000O;
   private final int O00000000000O;
   private final int O00000000000O0;
   private final int O00000000000OO;
   private final int O0000000000O;
   private final int O0000000000O0;
   private final int O0000000000O00;
   private final int O0000000000O0O;
   private final int O0000000000OO;
   private final int O0000000000OO0;
   private final int O0000000000OOO;
   private final int O000000000O;
   private final int O000000000O0;
   private final int O000000000O00;
   private final int O000000000O000;
   private int O000000000O00O;
   private int O000000000O0O;
   private final O0000O0O000O00.W388[] O000000000O0O0 = new O0000O0O000O00.W388[6];
   private final O0000O0O000O00.W388 O000000000O0OO = new O0000O0O000O00.W388();
   private final O0000O0O000O00.W388 O000000000OO = new O0000O0O000O00.W388();

   public float O00000000() {
      return 0.5F;
   }

   public float O000000000() {
      return 30.0F;
   }

   public O0000O0O000O00() {
      this(32856, 5121);
   }

   public O0000O0O000O00(int i, int j) {
      if (i == 0) {
         throw new IllegalArgumentException("intermediateInternalFormat must be a valid OpenGL format constant");
      } else if (j == 0) {
         throw new IllegalArgumentException("intermediatePixelType must be a valid OpenGL pixel type constant");
      } else {
         this.O00000000000 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_downsample.frag");
         this.O000000000000 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_upsample.frag");
         this.O0000000000000 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_small_horizontal.frag");
         this.O000000000000O = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_small_vertical.frag");
         this.O00000000000O = i;
         this.O00000000000O0 = j;
         this.O00000000000OO = this.O00000000000.O00000000("uSource");
         this.O0000000000O = this.O00000000000.O00000000("uTexelSize");
         this.O0000000000O0 = this.O00000000000.O00000000("uOffset");
         this.O0000000000O00 = this.O000000000000.O00000000("uSource");
         this.O0000000000O0O = this.O000000000000.O00000000("uTexelSize");
         this.O0000000000OO = this.O000000000000.O00000000("uOffset");
         this.O0000000000OO0 = this.O0000000000000.O00000000("uSource");
         this.O0000000000OOO = this.O0000000000000.O00000000("uTexelSize");
         this.O000000000O = this.O0000000000000.O00000000("uRadius");
         this.O000000000O0 = this.O000000000000O.O00000000("uSource");
         this.O000000000O00 = this.O000000000000O.O00000000("uTexelSize");
         this.O000000000O000 = this.O000000000000O.O00000000("uRadius");

         for (int var3 = 0; var3 < this.O000000000O0O0.length; var3++) {
            this.O000000000O0O0[var3] = new O0000O0O000O00.W388();
         }

         O0000O00O0OOO0.W373 var9 = O0000O00O0OOO0.O00000000();

         try {
            this.O000000000O00O = GL30.glGenVertexArrays();
            this.O000000000O0O = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000O00O);
            GL15.glBindBuffer(34962, this.O000000000O0O);
            float[] var4 = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
            GL15.glBufferData(34962, var4, 35044);
            byte var5 = 16;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, var5, 0L);
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, var5, 8L);
         } finally {
            O0000O00O0OOO0.O00000000(var9);
         }
      }
   }

   public void O0000000000() {
      this.O00000000000();
      if (this.O000000000O00O != 0) {
         GL30.glDeleteVertexArrays(this.O000000000O00O);
         this.O000000000O00O = 0;
      }

      if (this.O000000000O0O != 0) {
         GL15.glDeleteBuffers(this.O000000000O0O);
         this.O000000000O0O = 0;
      }

      this.O00000000000.O000000000();
      this.O000000000000.O000000000();
      this.O0000000000000.O000000000();
      this.O000000000000O.O000000000();
   }

   public void O00000000000() {
      for (O0000O0O000O00.W388 var4 : this.O000000000O0O0) {
         this.O000000000(var4);
      }

      this.O000000000(this.O000000000O0OO);
      this.O000000000(this.O000000000OO);
   }

   public int O00000000(int i, int j, int k, float f) {
      return this.O00000000(i, j, k, f, true);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int O00000000(int i, int j, int k, float f, boolean bl) {
      if (i != 0 && j > 0 && k > 0) {
         float var6 = Math.max(f, 0.5F);
         boolean var7 = var6 <= 30.0F;
         int var8 = 0;
         float[] var9 = null;
         if (var7) {
            if (!this.O00000000(this.O000000000O0OO, j, k) || !this.O00000000(this.O000000000OO, j, k)) {
               return 0;
            }
         } else {
            var8 = this.O00000000(var6, j, k);
            if (var8 <= 0) {
               return i;
            }

            var9 = this.O00000000(var8, var6);
            if (!this.O00000000(j, k, var8) || !this.O00000000(this.O000000000O0OO, j, k)) {
               return 0;
            }
         }

         O0000O00O0OOO0.W373 var10 = bl ? O0000O00O0OOO0.O00000000() : null;
         boolean var18 = false /* VF: Semaphore variable */;

         int var12;
         try {
            var18 = true;

            try (O0000O0O00O var11 = O0000O0O00O.O00000000(0, 3553)) {
               GL11.glDisable(3089);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3042);
               GL11.glDisable(36281);
               GL13.glActiveTexture(33984);
               GL30.glBindVertexArray(this.O000000000O00O);
               if (var7) {
                  this.O000000000(i, j, k, var6);
               } else {
                  this.O00000000(i, j, k, var8, var9);
               }

               var12 = this.O000000000O0OO.O000000000;
            }
         } finally {
            if (var18) {
               GL30.glBindVertexArray(0);
               GL20.glUseProgram(0);
               GL30.glBindFramebuffer(36160, 0);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               if (bl && var10 != null) {
                  O0000O00O0OOO0.O00000000(var10);
               }
            }
         }

         GL30.glBindVertexArray(0);
         GL20.glUseProgram(0);
         GL30.glBindFramebuffer(36160, 0);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         if (bl && var10 != null) {
            O0000O00O0OOO0.O00000000(var10);
         }

         return var12;
      } else {
         return 0;
      }
   }

   private void O000000000(int i, int j, int k, float f) {
      this.O0000000000000.O00000000();
      if (this.O0000000000OO0 >= 0) {
         GL20.glUniform1i(this.O0000000000OO0, 0);
      }

      if (this.O0000000000OOO >= 0) {
         GL20.glUniform2f(this.O0000000000OOO, 1.0F / Math.max(1, j), 1.0F / Math.max(1, k));
      }

      if (this.O000000000O >= 0) {
         GL20.glUniform1f(this.O000000000O, f);
      }

      if (this.O00000000(this.O000000000OO)) {
         GL11.glBindTexture(3553, i);
         this.O000000000000();
         this.O000000000000O.O00000000();
         if (this.O000000000O0 >= 0) {
            GL20.glUniform1i(this.O000000000O0, 0);
         }

         if (this.O000000000O00 >= 0) {
            GL20.glUniform2f(this.O000000000O00, 1.0F / Math.max(1, j), 1.0F / Math.max(1, k));
         }

         if (this.O000000000O000 >= 0) {
            GL20.glUniform1f(this.O000000000O000, f);
         }

         if (this.O00000000(this.O000000000O0OO)) {
            GL11.glBindTexture(3553, this.O000000000OO.O000000000);
            this.O000000000000();
         }
      }
   }

   private void O00000000(int i, int j, int k, int l, float[] fs) {
      if (fs != null && fs.length == l) {
         int var6 = i;
         int var7 = j;
         int var8 = k;
         this.O00000000000.O00000000();
         if (this.O00000000000OO >= 0) {
            GL20.glUniform1i(this.O00000000000OO, 0);
         }

         for (int var9 = 0; var9 < l; var9++) {
            O0000O0O000O00.W388 var10 = this.O000000000O0O0[var9];
            if (!this.O00000000(var10)) {
               return;
            }

            if (this.O0000000000O >= 0) {
               GL20.glUniform2f(this.O0000000000O, 1.0F / Math.max(1, var7), 1.0F / Math.max(1, var8));
            }

            if (this.O0000000000O0 >= 0) {
               GL20.glUniform1f(this.O0000000000O0, fs[var9]);
            }

            GL11.glBindTexture(3553, var6);
            this.O000000000000();
            var6 = var10.O000000000;
            var7 = var10.O0000000000;
            var8 = var10.O00000000000;
         }

         this.O000000000000.O00000000();
         if (this.O0000000000O00 >= 0) {
            GL20.glUniform1i(this.O0000000000O00, 0);
         }

         for (int var11 = l - 2; var11 >= 0; var11--) {
            O0000O0O000O00.W388 var12 = this.O000000000O0O0[var11];
            if (!this.O00000000(var12)) {
               return;
            }

            if (this.O0000000000O0O >= 0) {
               GL20.glUniform2f(this.O0000000000O0O, 1.0F / Math.max(1, var7), 1.0F / Math.max(1, var8));
            }

            if (this.O0000000000OO >= 0) {
               GL20.glUniform1f(this.O0000000000OO, fs[var11]);
            }

            GL11.glBindTexture(3553, var6);
            this.O000000000000();
            var6 = var12.O000000000;
            var7 = var12.O0000000000;
            var8 = var12.O00000000000;
         }

         if (this.O00000000(this.O000000000O0OO)) {
            if (this.O0000000000O0O >= 0) {
               GL20.glUniform2f(this.O0000000000O0O, 1.0F / Math.max(1, var7), 1.0F / Math.max(1, var8));
            }

            if (this.O0000000000OO >= 0) {
               GL20.glUniform1f(this.O0000000000OO, fs.length > 0 ? fs[0] : 0.5F);
            }

            GL11.glBindTexture(3553, var6);
            this.O000000000000();
         }
      } else {
         throw new IllegalArgumentException("offsets length must match passCount");
      }
   }

   private void O000000000000() {
      O0000O00OO0O.O00000000().O00000000(2);
      GL11.glDrawArrays(5, 0, 4);
   }

   private boolean O00000000(O0000O0O000O00.W388 o00000000) {
      if (o00000000 != null && o00000000.O00000000 != 0 && o00000000.O000000000 != 0 && o00000000.O0000000000 > 0 && o00000000.O00000000000 > 0) {
         GL30.glBindFramebuffer(36160, o00000000.O00000000);
         GL11.glViewport(0, 0, o00000000.O0000000000, o00000000.O00000000000);
         GL11.glDrawBuffer(36064);
         return true;
      } else {
         return false;
      }
   }

   private boolean O00000000(int i, int j, int k) {
      if (i > 0 && j > 0 && k > 0) {
         for (int var4 = 0; var4 < k; var4++) {
            int var5 = 1 << var4 + 1;
            int var6 = Math.max(1, i / var5);
            int var7 = Math.max(1, j / var5);
            if (!this.O00000000(this.O000000000O0O0[var4], var6, var7)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(O0000O0O000O00.W388 o00000000, int i, int j) {
      if (o00000000 == null) {
         return false;
      } else if (i > 0 && j > 0) {
         if (o00000000.O000000000 != 0 && (o00000000.O0000000000 != i || o00000000.O00000000000 != j)) {
            GL11.glDeleteTextures(o00000000.O000000000);
            GL30.glDeleteFramebuffers(o00000000.O00000000);
            o00000000.O000000000 = 0;
            o00000000.O00000000 = 0;
         }

         O0000O00O0OOO0.W373 var4;
         boolean var10;
         label82: {
            label100: {
               if (o00000000.O000000000 == 0) {
                  var4 = O0000O00O0OOO0.O00000000();
                  boolean var8 = false /* VF: Semaphore variable */;

                  try {
                     var8 = true;
                     o00000000.O000000000 = this.O00000000(i, j);
                     if (o00000000.O000000000 == 0) {
                        o00000000.O0000000000 = 0;
                        o00000000.O00000000000 = 0;
                        var10 = false;
                        var8 = false;
                        break label82;
                     }

                     o00000000.O00000000 = this.O00000000(o00000000.O000000000);
                     if (o00000000.O00000000 == 0) {
                        GL11.glDeleteTextures(o00000000.O000000000);
                        o00000000.O000000000 = 0;
                        o00000000.O0000000000 = 0;
                        o00000000.O00000000000 = 0;
                        var10 = false;
                        var8 = false;
                        break label100;
                     }

                     var8 = false;
                  } finally {
                     if (var8) {
                        O0000O00O0OOO0.O00000000(var4);
                     }
                  }

                  O0000O00O0OOO0.O00000000(var4);
               }

               o00000000.O0000000000 = i;
               o00000000.O00000000000 = j;
               return true;
            }

            O0000O00O0OOO0.O00000000(var4);
            return var10;
         }

         O0000O00O0OOO0.O00000000(var4);
         return var10;
      } else {
         this.O000000000(o00000000);
         return false;
      }
   }

   private void O000000000(O0000O0O000O00.W388 o00000000) {
      if (o00000000 != null) {
         if (o00000000.O000000000 != 0) {
            GL11.glDeleteTextures(o00000000.O000000000);
            o00000000.O000000000 = 0;
         }

         if (o00000000.O00000000 != 0) {
            GL30.glDeleteFramebuffers(o00000000.O00000000);
            o00000000.O00000000 = 0;
         }

         o00000000.O0000000000 = 0;
         o00000000.O00000000000 = 0;
      }
   }

   private int O00000000(int i, int j) {
      if (i > 0 && j > 0) {
         int var3 = GL11.glGenTextures();
         GL11.glBindTexture(3553, var3);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         O0000O00O0OOOO.O00000000(this.O00000000000O, i, j, 6408, this.O00000000000O0);
         GL11.glBindTexture(3553, 0);
         return var3;
      } else {
         return 0;
      }
   }

   private int O00000000(int i) {
      if (i <= 0) {
         return 0;
      } else {
         int var2 = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, var2);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
         int var3 = GL30.glCheckFramebufferStatus(36160);
         GL30.glBindFramebuffer(36160, 0);
         if (var3 != 36053) {
            GL30.glDeleteFramebuffers(var2);
            GL11.glDeleteTextures(i);
            throw new IllegalStateException("Blur framebuffer incomplete: status=" + var3);
         } else {
            return var2;
         }
      }
   }

   private int O00000000(float f, int i, int j) {
      int var4 = 0;
      int var5 = i;
      int var6 = j;

      while (var4 < 6 && (var5 > 1 || var6 > 1)) {
         var5 = Math.max(1, var5 / 2);
         var6 = Math.max(1, var6 / 2);
         var4++;
         if (var5 == 1 && var6 == 1) {
            break;
         }
      }

      if (var4 == 0) {
         var4 = 1;
      }

      int var7 = Math.max(1, (int)Math.ceil(Math.sqrt(f / 2.0F)));
      return Math.min(var4, var7);
   }

   private float[] O00000000(int i, float f) {
      float[] var3 = new float[i];

      for (int var4 = 0; var4 < i; var4++) {
         float var5 = 1.0F / (1 << var4);
         float var6 = f / i;
         var3[var4] = Math.max(0.5F, var6 * var5 * 2.0F + 0.5F);
      }

      return var3;
   }

   static final class W388 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
   }
}
