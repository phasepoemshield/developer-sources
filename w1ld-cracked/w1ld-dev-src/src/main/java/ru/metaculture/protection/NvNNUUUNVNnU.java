package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class NvNNUUUNVNnU {
   private static final int UuUVuuUu = 6;
   private static final float C00OOC00oO = 0.5F;
   private static final float uUnuvNvvNU = 30.0F;
   private final vVvUNNUVVnNn vVvUvVVuuNvV;
   private final vVvUNNUVVnNn uNNnnnuuuN;
   private final vVvUNNUVVnNn nuUnNvnuUu;
   private final vVvUNNUVVnNn VVuuUN;
   private final int vNUvnnVnUvu;
   private final int uVUuuVnNVU;
   private final int vuuuNvNuv;
   private final int nvUVNnuu;
   private final int UuuNnUvUuv;
   private final int nUUVuvU;
   private final int UnUNVVVNuv;
   private final int vNVuvnUUnuUn;
   private final int UvnvNVnnnnNU;
   private final int uVUVnuvnuVuv;
   private final int NVNnnvnuunNv;
   private final int uVunuUNVVUUV;
   private final int UNnVVNvvnVvU;
   private final int uNnUnnuNUnNu;
   private int NnUuNNU;
   private int nNvNUVU;
   private final NvNNUUUNVNnU.NVnVnNnN[] UnUNuUU = new NvNNUUUNVNnU.NVnVnNnN[6];
   private final NvNNUUUNVNnU.NVnVnNnN uUVuVvuNUvnu = new NvNNUUUNVNnU.NVnVnNnN();
   private final NvNNUUUNVNnU.NVnVnNnN UvUvUNuvNU = new NvNNUUUNVNnU.NVnVnNnN();

   public float UuUVuuUu() {
      return 0.5F;
   }

   public float C00OOC00oO() {
      return 30.0F;
   }

   public NvNNUUUNVNnU() {
      this(32856, 5121);
   }

   public NvNNUUUNVNnU(int var1, int var2) {
      if (var1 == 0) {
         throw new IllegalArgumentException("intermediateInternalFormat must be a valid OpenGL format constant");
      } else if (var2 == 0) {
         throw new IllegalArgumentException("intermediatePixelType must be a valid OpenGL pixel type constant");
      } else {
         this.vVvUvVVuuNvV = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_downsample.frag");
         this.uNNnnnuuuN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_upsample.frag");
         this.nuUnNvnuUu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_small_horizontal.frag");
         this.VVuuUN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/blur/blur_small_vertical.frag");
         this.vNUvnnVnUvu = var1;
         this.uVUuuVnNVU = var2;
         this.vuuuNvNuv = this.vVvUvVVuuNvV.UuUVuuUu("uSource");
         this.nvUVNnuu = this.vVvUvVVuuNvV.UuUVuuUu("uTexelSize");
         this.UuuNnUvUuv = this.vVvUvVVuuNvV.UuUVuuUu("uOffset");
         this.nUUVuvU = this.uNNnnnuuuN.UuUVuuUu("uSource");
         this.UnUNVVVNuv = this.uNNnnnuuuN.UuUVuuUu("uTexelSize");
         this.vNVuvnUUnuUn = this.uNNnnnuuuN.UuUVuuUu("uOffset");
         this.UvnvNVnnnnNU = this.nuUnNvnuUu.UuUVuuUu("uSource");
         this.uVUVnuvnuVuv = this.nuUnNvnuUu.UuUVuuUu("uTexelSize");
         this.NVNnnvnuunNv = this.nuUnNvnuUu.UuUVuuUu("uRadius");
         this.uVunuUNVVUUV = this.VVuuUN.UuUVuuUu("uSource");
         this.UNnVVNvvnVvU = this.VVuuUN.UuUVuuUu("uTexelSize");
         this.uNnUnnuNUnNu = this.VVuuUN.UuUVuuUu("uRadius");

         for (int var3 = 0; var3 < this.UnUNuUU.length; var3++) {
            this.UnUNuUU[var3] = new NvNNUUUNVNnU.NVnVnNnN();
         }

         VvuuVNVUn.NVnVnNnN var9 = VvuuVNVUn.UuUVuuUu();

         try {
            this.NnUuNNU = GL30.glGenVertexArrays();
            this.nNvNUVU = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.NnUuNNU);
            GL15.glBindBuffer(34962, this.nNvNUVU);
            float[] var4 = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
            GL15.glBufferData(34962, var4, 35044);
            byte var5 = 16;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, var5, 0L);
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, var5, 8L);
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var9);
         }
      }
   }

   public void uUnuvNvvNU() {
      this.vVvUvVVuuNvV();
      if (this.NnUuNNU != 0) {
         GL30.glDeleteVertexArrays(this.NnUuNNU);
         this.NnUuNNU = 0;
      }

      if (this.nNvNUVU != 0) {
         GL15.glDeleteBuffers(this.nNvNUVU);
         this.nNvNUVU = 0;
      }

      this.vVvUvVVuuNvV.C00OOC00oO();
      this.uNNnnnuuuN.C00OOC00oO();
      this.nuUnNvnuUu.C00OOC00oO();
      this.VVuuUN.C00OOC00oO();
   }

   public void vVvUvVVuuNvV() {
      for (NvNNUUUNVNnU.NVnVnNnN var4 : this.UnUNuUU) {
         this.C00OOC00oO(var4);
      }

      this.C00OOC00oO(this.uUVuVvuNUvnu);
      this.C00OOC00oO(this.UvUvUNuvNU);
   }

   public int UuUVuuUu(int var1, int var2, int var3, float var4) {
      return this.UuUVuuUu(var1, var2, var3, var4, true);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int UuUVuuUu(int var1, int var2, int var3, float var4, boolean var5) {
      if (var1 != 0 && var2 > 0 && var3 > 0) {
         float var6 = Math.max(var4, 0.5F);
         boolean var7 = var6 <= 30.0F;
         int var8 = 0;
         float[] var9 = null;
         if (var7) {
            if (!this.UuUVuuUu(this.uUVuVvuNUvnu, var2, var3) || !this.UuUVuuUu(this.UvUvUNuvNU, var2, var3)) {
               return 0;
            }
         } else {
            var8 = this.UuUVuuUu(var6, var2, var3);
            if (var8 <= 0) {
               return var1;
            }

            var9 = this.UuUVuuUu(var8, var6);
            if (!this.UuUVuuUu(var2, var3, var8) || !this.UuUVuuUu(this.uUVuVvuNUvnu, var2, var3)) {
               return 0;
            }
         }

         VvuuVNVUn.NVnVnNnN var10 = var5 ? VvuuVNVUn.UuUVuuUu() : null;
         boolean var18 = false /* VF: Semaphore variable */;

         int var12;
         try {
            var18 = true;

            try (UNvnuVVnN var11 = UNvnuVVnN.UuUVuuUu(0, 3553)) {
               GL11.glDisable(3089);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3042);
               GL11.glDisable(36281);
               GL13.glActiveTexture(33984);
               GL30.glBindVertexArray(this.NnUuNNU);
               if (var7) {
                  this.C00OOC00oO(var1, var2, var3, var6);
               } else {
                  this.UuUVuuUu(var1, var2, var3, var8, var9);
               }

               var12 = this.uUVuVvuNUvnu.C00OOC00oO;
            }
         } finally {
            if (var18) {
               GL30.glBindVertexArray(0);
               GL20.glUseProgram(0);
               GL30.glBindFramebuffer(36160, 0);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               if (var5 && var10 != null) {
                  VvuuVNVUn.uUnuvNvvNU(var10);
               }
            }
         }

         GL30.glBindVertexArray(0);
         GL20.glUseProgram(0);
         GL30.glBindFramebuffer(36160, 0);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         if (var5 && var10 != null) {
            VvuuVNVUn.uUnuvNvvNU(var10);
         }

         return var12;
      } else {
         return 0;
      }
   }

   private void C00OOC00oO(int var1, int var2, int var3, float var4) {
      this.nuUnNvnuUu.UuUVuuUu();
      if (this.UvnvNVnnnnNU >= 0) {
         GL20.glUniform1i(this.UvnvNVnnnnNU, 0);
      }

      if (this.uVUVnuvnuVuv >= 0) {
         GL20.glUniform2f(this.uVUVnuvnuVuv, 1.0F / Math.max(1, var2), 1.0F / Math.max(1, var3));
      }

      if (this.NVNnnvnuunNv >= 0) {
         GL20.glUniform1f(this.NVNnnvnuunNv, var4);
      }

      if (this.UuUVuuUu(this.UvUvUNuvNU)) {
         GL11.glBindTexture(3553, var1);
         this.uNNnnnuuuN();
         this.VVuuUN.UuUVuuUu();
         if (this.uVunuUNVVUUV >= 0) {
            GL20.glUniform1i(this.uVunuUNVVUUV, 0);
         }

         if (this.UNnVVNvvnVvU >= 0) {
            GL20.glUniform2f(this.UNnVVNvvnVvU, 1.0F / Math.max(1, var2), 1.0F / Math.max(1, var3));
         }

         if (this.uNnUnnuNUnNu >= 0) {
            GL20.glUniform1f(this.uNnUnnuNUnNu, var4);
         }

         if (this.UuUVuuUu(this.uUVuVvuNUvnu)) {
            GL11.glBindTexture(3553, this.UvUvUNuvNU.C00OOC00oO);
            this.uNNnnnuuuN();
         }
      }
   }

   private void UuUVuuUu(int var1, int var2, int var3, int var4, float[] var5) {
      if (var5 != null && var5.length == var4) {
         int var6 = var1;
         int var7 = var2;
         int var8 = var3;
         this.vVvUvVVuuNvV.UuUVuuUu();
         if (this.vuuuNvNuv >= 0) {
            GL20.glUniform1i(this.vuuuNvNuv, 0);
         }

         for (int var9 = 0; var9 < var4; var9++) {
            NvNNUUUNVNnU.NVnVnNnN var10 = this.UnUNuUU[var9];
            if (!this.UuUVuuUu(var10)) {
               return;
            }

            if (this.nvUVNnuu >= 0) {
               GL20.glUniform2f(this.nvUVNnuu, 1.0F / Math.max(1, var7), 1.0F / Math.max(1, var8));
            }

            if (this.UuuNnUvUuv >= 0) {
               GL20.glUniform1f(this.UuuNnUvUuv, var5[var9]);
            }

            GL11.glBindTexture(3553, var6);
            this.uNNnnnuuuN();
            var6 = var10.C00OOC00oO;
            var7 = var10.uUnuvNvvNU;
            var8 = var10.vVvUvVVuuNvV;
         }

         this.uNNnnnuuuN.UuUVuuUu();
         if (this.nUUVuvU >= 0) {
            GL20.glUniform1i(this.nUUVuvU, 0);
         }

         for (int var11 = var4 - 2; var11 >= 0; var11--) {
            NvNNUUUNVNnU.NVnVnNnN var12 = this.UnUNuUU[var11];
            if (!this.UuUVuuUu(var12)) {
               return;
            }

            if (this.UnUNVVVNuv >= 0) {
               GL20.glUniform2f(this.UnUNVVVNuv, 1.0F / Math.max(1, var7), 1.0F / Math.max(1, var8));
            }

            if (this.vNVuvnUUnuUn >= 0) {
               GL20.glUniform1f(this.vNVuvnUUnuUn, var5[var11]);
            }

            GL11.glBindTexture(3553, var6);
            this.uNNnnnuuuN();
            var6 = var12.C00OOC00oO;
            var7 = var12.uUnuvNvvNU;
            var8 = var12.vVvUvVVuuNvV;
         }

         if (this.UuUVuuUu(this.uUVuVvuNUvnu)) {
            if (this.UnUNVVVNuv >= 0) {
               GL20.glUniform2f(this.UnUNVVVNuv, 1.0F / Math.max(1, var7), 1.0F / Math.max(1, var8));
            }

            if (this.vNVuvnUUnuUn >= 0) {
               GL20.glUniform1f(this.vNVuvnUUnuUn, var5.length > 0 ? var5[0] : 0.5F);
            }

            GL11.glBindTexture(3553, var6);
            this.uNNnnnuuuN();
         }
      } else {
         throw new IllegalArgumentException("offsets length must match passCount");
      }
   }

   private void uNNnnnuuuN() {
      VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
      GL11.glDrawArrays(5, 0, 4);
   }

   private boolean UuUVuuUu(NvNNUUUNVNnU.NVnVnNnN var1) {
      if (var1 != null && var1.UuUVuuUu != 0 && var1.C00OOC00oO != 0 && var1.uUnuvNvvNU > 0 && var1.vVvUvVVuuNvV > 0) {
         GL30.glBindFramebuffer(36160, var1.UuUVuuUu);
         GL11.glViewport(0, 0, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV);
         GL11.glDrawBuffer(36064);
         return true;
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(int var1, int var2, int var3) {
      if (var1 > 0 && var2 > 0 && var3 > 0) {
         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 1 << var4 + 1;
            int var6 = Math.max(1, var1 / var5);
            int var7 = Math.max(1, var2 / var5);
            if (!this.UuUVuuUu(this.UnUNuUU[var4], var6, var7)) {
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
   private boolean UuUVuuUu(NvNNUUUNVNnU.NVnVnNnN var1, int var2, int var3) {
      if (var1 == null) {
         return false;
      } else if (var2 > 0 && var3 > 0) {
         if (var1.C00OOC00oO != 0 && (var1.uUnuvNvvNU != var2 || var1.vVvUvVVuuNvV != var3)) {
            GL11.glDeleteTextures(var1.C00OOC00oO);
            GL30.glDeleteFramebuffers(var1.UuUVuuUu);
            var1.C00OOC00oO = 0;
            var1.UuUVuuUu = 0;
         }

         VvuuVNVUn.NVnVnNnN var4;
         boolean var10;
         label82: {
            label100: {
               if (var1.C00OOC00oO == 0) {
                  var4 = VvuuVNVUn.UuUVuuUu();
                  boolean var8 = false /* VF: Semaphore variable */;

                  try {
                     var8 = true;
                     var1.C00OOC00oO = this.UuUVuuUu(var2, var3);
                     if (var1.C00OOC00oO == 0) {
                        var1.uUnuvNvvNU = 0;
                        var1.vVvUvVVuuNvV = 0;
                        var10 = false;
                        var8 = false;
                        break label82;
                     }

                     var1.UuUVuuUu = this.UuUVuuUu(var1.C00OOC00oO);
                     if (var1.UuUVuuUu == 0) {
                        GL11.glDeleteTextures(var1.C00OOC00oO);
                        var1.C00OOC00oO = 0;
                        var1.uUnuvNvvNU = 0;
                        var1.vVvUvVVuuNvV = 0;
                        var10 = false;
                        var8 = false;
                        break label100;
                     }

                     var8 = false;
                  } finally {
                     if (var8) {
                        VvuuVNVUn.uUnuvNvvNU(var4);
                     }
                  }

                  VvuuVNVUn.uUnuvNvvNU(var4);
               }

               var1.uUnuvNvvNU = var2;
               var1.vVvUvVVuuNvV = var3;
               return true;
            }

            VvuuVNVUn.uUnuvNvvNU(var4);
            return var10;
         }

         VvuuVNVUn.uUnuvNvvNU(var4);
         return var10;
      } else {
         this.C00OOC00oO(var1);
         return false;
      }
   }

   private void C00OOC00oO(NvNNUUUNVNnU.NVnVnNnN var1) {
      if (var1 != null) {
         if (var1.C00OOC00oO != 0) {
            GL11.glDeleteTextures(var1.C00OOC00oO);
            var1.C00OOC00oO = 0;
         }

         if (var1.UuUVuuUu != 0) {
            GL30.glDeleteFramebuffers(var1.UuUVuuUu);
            var1.UuUVuuUu = 0;
         }

         var1.uUnuvNvvNU = 0;
         var1.vVvUvVVuuNvV = 0;
      }
   }

   private int UuUVuuUu(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         int var3 = GL11.glGenTextures();
         GL11.glBindTexture(3553, var3);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         o000OOoCO0OO.UuUVuuUu(this.vNUvnnVnUvu, var1, var2, 6408, this.uVUuuVnNVU);
         GL11.glBindTexture(3553, 0);
         return var3;
      } else {
         return 0;
      }
   }

   private int UuUVuuUu(int var1) {
      if (var1 <= 0) {
         return 0;
      } else {
         int var2 = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, var2);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, var1, 0);
         int var3 = GL30.glCheckFramebufferStatus(36160);
         GL30.glBindFramebuffer(36160, 0);
         if (var3 != 36053) {
            GL30.glDeleteFramebuffers(var2);
            GL11.glDeleteTextures(var1);
            throw new IllegalStateException("Blur framebuffer incomplete: status=" + var3);
         } else {
            return var2;
         }
      }
   }

   private int UuUVuuUu(float var1, int var2, int var3) {
      int var4 = 0;
      int var5 = var2;
      int var6 = var3;

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

      int var7 = Math.max(1, (int)Math.ceil(Math.sqrt(var1 / 2.0F)));
      return Math.min(var4, var7);
   }

   private float[] UuUVuuUu(int var1, float var2) {
      float[] var3 = new float[var1];

      for (int var4 = 0; var4 < var1; var4++) {
         float var5 = 1.0F / (1 << var4);
         float var6 = var2 / var1;
         var3[var4] = Math.max(0.5F, var6 * var5 * 2.0F + 0.5F);
      }

      return var3;
   }

   static final class NVnVnNnN {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
   }
}
