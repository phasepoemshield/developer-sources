package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_437;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class VVnVVnvnNuUn {
   private static final VVnVVnvnNuUn UuUVuuUu = new VVnVVnvnNuUn();
   private static final float C00OOC00oO = 0.3F;
   private static final float uUnuvNvvNU = 9.0F;
   private static final float vVvUvVVuuNvV = 0.5F;
   private static final VVnVVnvnNuUn.NVnVnNnN uNNnnnuuuN = new VVnVVnvnNuUn.NVnVnNnN(0.4F, 0.0F, 0.1F, 1.0F);
   private final VVnVVnvnNuUn.nvnNNunvv nuUnNvnuUu = new VVnVVnvnNuUn.nvnNNunvv();
   private final VVnVVnvnNuUn.nvnNNunvv VVuuUN = new VVnVVnvnNuUn.nvnNNunvv();
   private NvNNUUUNVNnU vNUvnnVnUvu;
   private vVvUNNUVVnNn uVUuuVnNVU;
   private int vuuuNvNuv = -1;
   private int nvUVNnuu = -1;
   private int UuuNnUvUuv = -1;
   private int nUUVuvU = -1;
   private int UnUNVVVNuv = -1;
   private int vNVuvnUUnuUn = -1;
   private int UvnvNVnnnnNU = -1;
   private int uVUVnuvnuVuv = -1;
   private int NVNnnvnuunNv = -1;
   private int uVunuUNVVUUV = -1;
   private int UNnVVNvvnVvU = -1;
   private int uNnUnnuNUnNu;
   private int NnUuNNU;
   private int nNvNUVU;
   private int UnUNuUU;
   private boolean uUVuVvuNUvnu;
   private float UvUvUNuvNU;
   private float c0oOOCcCoC0;
   private float VVnVNnunVvu;

   private VVnVVnvnNuUn() {
   }

   public static VVnVVnvnNuUn UuUVuuUu() {
      return UuUVuuUu;
   }

   public void UuUVuuUu(class_437 var1, class_437 var2) {
      if (var1 != var2) {
         if (var1 instanceof uNVUuVuNNUvn || var2 instanceof uNVUuVuNNUvn) {
            this.uUnuvNvvNU();
         } else if (nuuvUNvn.UuUVuuUu()) {
            this.uUnuvNvvNU();
         } else if (!Menu.UuUVuuUu(Menu.nnuUVNUuvvVU)) {
            this.uUnuvNvvNU();
         } else {
            class_310 var3 = class_310.method_1551();
            if (var3 != null && var3.field_1687 != null && var2 == null) {
               this.uUnuvNvvNU();
            } else if (UuUVuuUu(var3, var1, var2) && C00OOC00oO(var3)) {
               class_1041 var4 = var3.method_22683();
               int var5 = var4.method_4489();
               int var6 = var4.method_4506();
               if (var5 > 0 && var6 > 0) {
                  boolean var7 = this.uUVuVvuNUvnu
                     && this.C00OOC00oO(this.VVuuUN, var5, var6)
                     && this.UuUVuuUu(this.VVuuUN.C00OOC00oO, var5, var6, this.nuUnNvnuUu);
                  if (!var7) {
                     var7 = this.UuUVuuUu(var3, this.nuUnNvnuUu, var5, var6);
                  }

                  if (!var7) {
                     this.nuUnNvnuUu();
                  } else {
                     this.uUVuVvuNUvnu = true;
                     this.UvUvUNuvNU = 0.0F;
                     this.c0oOOCcCoC0 = 0.0F;
                     this.VVnVNnunVvu = 0.0F;
                  }
               } else {
                  this.VVuuUN();
               }
            } else {
               this.nuUnNvnuUu();
            }
         }
      }
   }

   public void C00OOC00oO() {
      class_310 var1 = class_310.method_1551();
      float var2 = var1 != null && var1.method_61966() != null ? var1.method_61966().method_60636() : 0.0F;
      this.UuUVuuUu(var2);
   }

   public void UuUVuuUu(float var1) {
      if (this.uUVuVvuNUvnu) {
         class_310 var2 = class_310.method_1551();
         if (var2 == null || !C00OOC00oO(var2)) {
            this.nuUnNvnuUu();
         } else if (var2.field_1755 != null && var2.field_1687 == null) {
            class_1041 var3 = var2.method_22683();
            int var4 = var3.method_4489();
            int var5 = var3.method_4506();
            if (var4 > 0 && var5 > 0 && this.C00OOC00oO(this.nuUnNvnuUu, var4, var5)) {
               this.C00OOC00oO(var1);
               if (this.UvUvUNuvNU >= 1.0F) {
                  this.nuUnNvnuUu();
               } else {
                  int var6 = this.UuUVuuUu(var2);
                  if (var6 > 0 && this.UuUVuuUu(var2, this.VVuuUN, var4, var5) && this.C00OOC00oO(this.VVuuUN, var4, var5)) {
                     this.uNNnnnuuuN();
                     if (this.uVUuuVnNVU != null && this.nNvNUVU != 0) {
                        float var7 = this.vVvUvVVuuNvV();
                        float var8 = UuUVuuUu(var7 / 9.0F, 0.0F, 1.0F);
                        int var9 = this.UuUVuuUu(var4, var5, var7);
                        if (var9 <= 0) {
                           var9 = this.VVuuUN.C00OOC00oO;
                           var8 = 0.0F;
                        }

                        this.UuUVuuUu(var6, var4, var5, var9, var8);
                        if (this.UvUvUNuvNU >= 1.0F) {
                           this.nuUnNvnuUu();
                        }
                     } else {
                        this.nuUnNvnuUu();
                     }
                  } else {
                     this.nuUnNvnuUu();
                  }
               }
            } else {
               this.VVuuUN();
            }
         } else {
            this.uUnuvNvvNU();
         }
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if ((this.nuUnNvnuUu.uUnuvNvvNU <= 0 || this.nuUnNvnuUu.uUnuvNvvNU == var1 && this.nuUnNvnuUu.vVvUvVVuuNvV == var2)
            && (this.VVuuUN.uUnuvNvvNU <= 0 || this.VVuuUN.uUnuvNvvNU == var1 && this.VVuuUN.vVvUvVVuuNvV == var2)) {
            if (this.vNUvnnVnUvu != null) {
               this.vNUvnnVnUvu.vVvUvVVuuNvV();
            }
         } else {
            this.VVuuUN();
         }
      } else {
         this.VVuuUN();
      }
   }

   public void UuUVuuUu(boolean var1) {
      if (!var1) {
         this.VVuuUN();
      }
   }

   private void C00OOC00oO(float var1) {
      float var2 = vVvUvVVuuNvV(var1);
      this.VVnVNnunVvu += var2;
      this.UvUvUNuvNU = UuUVuuUu(this.UvUvUNuvNU + var2 / 0.3F, 0.0F, 1.0F);
      this.c0oOOCcCoC0 = uNNnnnuuuN.solve(this.UvUvUNuvNU);
   }

   private float vVvUvVVuuNvV() {
      float var1 = uUnuvNvvNU(this.c0oOOCcCoC0 * 1.6F);
      return 9.0F * var1;
   }

   private int UuUVuuUu(int var1, int var2, float var3) {
      if (var3 < 0.5F) {
         return this.nuUnNvnuUu.C00OOC00oO;
      } else {
         if (this.vNUvnnVnUvu == null) {
            this.vNUvnnVnUvu = new NvNNUUUNVNnU(32856, 5121);
         }

         return this.vNUvnnVnUvu.UuUVuuUu(this.nuUnNvnuUu.C00OOC00oO, var1, var2, var3);
      }
   }

   private static float uUnuvNvvNU(float var0) {
      float var1 = UuUVuuUu(var0, 0.0F, 1.0F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1, int var2, int var3, int var4, float var5) {
      VvuuVNVUn.NVnVnNnN var6 = VvuuVNVUn.UuUVuuUu();
      boolean var20 = false /* VF: Semaphore variable */;

      label200: {
         try {
            var20 = true;

            try (
               UNvnuVVnN var7 = UNvnuVVnN.UuUVuuUu(0, 3553);
               UNvnuVVnN var8 = UNvnuVVnN.UuUVuuUu(1, 3553);
               UNvnuVVnN var9 = UNvnuVVnN.UuUVuuUu(2, 3553);
            ) {
               if (this.NnUuNNU == 0) {
                  this.NnUuNNU = GL30.glGenFramebuffers();
               }

               GL30.glBindFramebuffer(36160, this.NnUuNNU);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, var1, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                  break label200;
               }

               GL11.glViewport(0, 0, var2, var3);
               GL11.glDisable(3089);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(3042);
               GL11.glDisable(36281);
               GL11.glColorMask(true, true, true, true);
               GL11.glDepthMask(false);
               this.uVUuuVnNVU.UuUVuuUu();
               this.C00OOC00oO(var2, var3, var5);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, this.nuUnNvnuUu.C00OOC00oO);
               GL13.glActiveTexture(33985);
               GL11.glBindTexture(3553, this.VVuuUN.C00OOC00oO);
               GL13.glActiveTexture(33986);
               GL11.glBindTexture(3553, var4);
               GL30.glBindVertexArray(this.nNvNUVU);
               VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
            }
         } finally {
            if (var20) {
               if (this.NnUuNNU != 0) {
                  GL30.glBindFramebuffer(36160, this.NnUuNNU);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
               }

               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var6);
            }
         }

         if (this.NnUuNNU != 0) {
            GL30.glBindFramebuffer(36160, this.NnUuNNU);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         }

         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var6);
         return;
      }

      if (this.NnUuNNU != 0) {
         GL30.glBindFramebuffer(36160, this.NnUuNNU);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      }

      GL20.glUseProgram(0);
      VvuuVNVUn.uUnuvNvvNU(var6);
   }

   private void C00OOC00oO(int var1, int var2, float var3) {
      if (this.vuuuNvNuv >= 0) {
         GL20.glUniform1i(this.vuuuNvNuv, 0);
      }

      if (this.nvUVNnuu >= 0) {
         GL20.glUniform1i(this.nvUVNnuu, 1);
      }

      if (this.UuuNnUvUuv >= 0) {
         GL20.glUniform1i(this.UuuNnUvUuv, 2);
      }

      if (this.nUUVuvU >= 0) {
         GL20.glUniform2f(this.nUUVuvU, var1, var2);
      }

      if (this.UnUNVVVNuv >= 0) {
         GL20.glUniform1f(this.UnUNVVVNuv, this.c0oOOCcCoC0);
      }

      if (this.vNVuvnUUnuUn >= 0) {
         GL20.glUniform1f(this.vNVuvnUUnuUn, this.UvUvUNuvNU);
      }

      if (this.UvnvNVnnnnNU >= 0) {
         GL20.glUniform1f(this.UvnvNVnnnnNU, this.c0oOOCcCoC0);
      }

      if (this.uVUVnuvnuVuv >= 0) {
         GL20.glUniform1f(this.uVUVnuvnuVuv, 1.04F - 0.04F * this.c0oOOCcCoC0);
      }

      if (this.NVNnnvnuunNv >= 0) {
         GL20.glUniform1f(this.NVNnnvnuunNv, var3);
      }

      if (this.uVunuUNVVUUV >= 0) {
         GL20.glUniform1f(this.uVunuUNVVUUV, 0.0F);
      }

      if (this.UNnVVNvvnVvU >= 0) {
         GL20.glUniform1f(this.UNnVVNvvnVvU, this.VVnVNnunVvu);
      }
   }

   private boolean UuUVuuUu(class_310 var1, VVnVVnvnNuUn.nvnNNunvv var2, int var3, int var4) {
      int var5 = this.UuUVuuUu(var1);
      return var5 > 0 && this.UuUVuuUu(var5, var3, var4, var2);
   }

   private int UuUVuuUu(class_310 var1) {
      if (var1 == null) {
         return 0;
      } else {
         class_276 var2 = var1.method_1522();
         if (var2 == null) {
            return 0;
         } else {
            return var2.method_30277() instanceof class_10868 var4 ? var4.method_68427() : 0;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean UuUVuuUu(int var1, int var2, int var3, VVnVVnvnNuUn.nvnNNunvv var4) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && this.UuUVuuUu(var4, var2, var3)) {
         VvuuVNVUn.NVnVnNnN var5 = VvuuVNVUn.UuUVuuUu();
         boolean var9 = false /* VF: Semaphore variable */;

         boolean var11;
         label85: {
            try {
               var9 = true;
               if (this.uNnUnnuNUnNu == 0) {
                  this.uNnUnnuNUnNu = GL30.glGenFramebuffers();
               }

               GL11.glDisable(3089);
               GL11.glDisable(3042);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(36281);
               GL30.glBindFramebuffer(36008, this.uNnUnnuNUnNu);
               GL30.glFramebufferTexture2D(36008, 36064, 3553, var1, 0);
               if (GL30.glCheckFramebufferStatus(36008) != 36053) {
                  var11 = false;
                  var9 = false;
                  break label85;
               }

               GL30.glBindFramebuffer(36009, var4.UuUVuuUu);
               GL11.glReadBuffer(36064);
               GL11.glDrawBuffer(36064);
               GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var2, var3, 16384, 9728);
               var11 = true;
               var9 = false;
            } finally {
               if (var9) {
                  if (this.uNnUnnuNUnNu != 0) {
                     GL30.glBindFramebuffer(36008, this.uNnUnnuNUnNu);
                     GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
                  }

                  VvuuVNVUn.uUnuvNvvNU(var5);
               }
            }

            if (this.uNnUnnuNUnNu != 0) {
               GL30.glBindFramebuffer(36008, this.uNnUnnuNUnNu);
               GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            }

            VvuuVNVUn.uUnuvNvvNU(var5);
            return var11;
         }

         if (this.uNnUnnuNUnNu != 0) {
            GL30.glBindFramebuffer(36008, this.uNnUnnuNUnNu);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
         }

         VvuuVNVUn.uUnuvNvvNU(var5);
         return var11;
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(VVnVVnvnNuUn.nvnNNunvv var1, int var2, int var3) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         if (var1.C00OOC00oO != 0 && (var1.uUnuvNvvNU != var2 || var1.vVvUvVVuuNvV != var3 || var1.UuUVuuUu == 0)) {
            this.UuUVuuUu(var1);
         }

         label65:
         if (var1.C00OOC00oO == 0) {
            VvuuVNVUn.NVnVnNnN var4 = VvuuVNVUn.UuUVuuUu();

            boolean var5;
            try {
               var1.C00OOC00oO = GL11.glGenTextures();
               GL11.glBindTexture(3553, var1.C00OOC00oO);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               o000OOoCO0OO.UuUVuuUu(32856, var2, var3, 6408, 5121);
               var1.UuUVuuUu = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36160, var1.UuUVuuUu);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, var1.C00OOC00oO, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) == 36053) {
                  break label65;
               }

               this.UuUVuuUu(var1);
               var5 = false;
            } finally {
               VvuuVNVUn.uUnuvNvvNU(var4);
            }

            return var5;
         }

         var1.uUnuvNvvNU = var2;
         var1.vVvUvVVuuNvV = var3;
         return true;
      } else {
         return false;
      }
   }

   private void uNNnnnuuuN() {
      if (this.nNvNUVU == 0) {
         VvuuVNVUn.NVnVnNnN var1 = VvuuVNVUn.UuUVuuUu();

         try {
            this.nNvNUVU = GL30.glGenVertexArrays();
            this.UnUNuUU = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.nNvNUVU);
            GL15.glBindBuffer(34962, this.UnUNuUU);
            float[] var2 = new float[]{
               -1.0F,
               -1.0F,
               0.0F,
               0.0F,
               1.0F,
               -1.0F,
               1.0F,
               0.0F,
               1.0F,
               1.0F,
               1.0F,
               1.0F,
               -1.0F,
               -1.0F,
               0.0F,
               0.0F,
               1.0F,
               1.0F,
               1.0F,
               1.0F,
               -1.0F,
               1.0F,
               0.0F,
               1.0F
            };
            GL15.glBufferData(34962, var2, 35044);
            byte var3 = 16;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, var3, 0L);
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, var3, 8L);
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var1);
         }
      }

      if (this.uVUuuVnNVU == null) {
         this.uVUuuVnNVU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/postfx/cinematic_screen_transition.frag");
         this.vuuuNvNuv = this.uVUuuVnNVU.UuUVuuUu("uOldScreen");
         this.nvUVNnuu = this.uVUuuVnNVU.UuUVuuUu("uNewScreen");
         this.UuuNnUvUuv = this.uVUuuVnNVU.UuUVuuUu("uBlurredScreen");
         this.nUUVuvU = this.uVUuuVnNVU.UuUVuuUu("uResolution");
         this.UnUNVVVNuv = this.uVUuuVnNVU.UuUVuuUu("uProgress");
         this.vNVuvnUUnuUn = this.uVUuuVnNVU.UuUVuuUu("uLinearProgress");
         this.UvnvNVnnnnNU = this.uVUuuVnNVU.UuUVuuUu("uAlpha");
         this.uVUVnuvnuVuv = this.uVUuuVnNVU.UuUVuuUu("uScale");
         this.NVNnnvnuunNv = this.uVUuuVnNVU.UuUVuuUu("uBlurMix");
         this.uVunuUNVVUUV = this.uVUuuVnNVU.UuUVuuUu("uExposure");
         this.UNnVVNvvnVvU = this.uVUuuVnNVU.UuUVuuUu("uTime");
      }
   }

   private boolean C00OOC00oO(VVnVVnvnNuUn.nvnNNunvv var1, int var2, int var3) {
      return var1 != null && var1.UuUVuuUu != 0 && var1.C00OOC00oO != 0 && var1.uUnuvNvvNU == var2 && var1.vVvUvVVuuNvV == var3;
   }

   private void nuUnNvnuUu() {
      this.uUVuVvuNUvnu = false;
      this.UvUvUNuvNU = 0.0F;
      this.c0oOOCcCoC0 = 0.0F;
      this.VVnVNnunVvu = 0.0F;
   }

   public void uUnuvNvvNU() {
      this.VVuuUN();
   }

   private void VVuuUN() {
      this.nuUnNvnuUu();
      this.UuUVuuUu(this.nuUnNvnuUu);
      this.UuUVuuUu(this.VVuuUN);
      if (this.vNUvnnVnUvu != null) {
         this.vNUvnnVnUvu.vVvUvVVuuNvV();
      }
   }

   private void UuUVuuUu(VVnVVnvnNuUn.nvnNNunvv var1) {
      if (var1 != null) {
         if (var1.UuUVuuUu != 0) {
            GL30.glDeleteFramebuffers(var1.UuUVuuUu);
            var1.UuUVuuUu = 0;
         }

         if (var1.C00OOC00oO != 0) {
            GL11.glDeleteTextures(var1.C00OOC00oO);
            var1.C00OOC00oO = 0;
         }

         var1.uUnuvNvvNU = 0;
         var1.vVvUvVVuuNvV = 0;
      }
   }

   private static boolean C00OOC00oO(class_310 var0) {
      if (var0 != null && var0.method_22683() != null) {
         class_1041 var1 = var0.method_22683();
         return !var1.method_65966() && var1.method_4489() > 0 && var1.method_4506() > 0;
      } else {
         return false;
      }
   }

   private static boolean UuUVuuUu(class_310 var0, class_437 var1, class_437 var2) {
      return !(var1 instanceof uNVUuVuNNUvn) && !(var2 instanceof uNVUuVuNNUvn)
         ? var0 != null && var0.field_1687 == null && var1 != null && var2 != null
         : false;
   }

   private static float vVvUvVVuuNvV(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? UuUVuuUu(var0, 0.0F, 6.0F) * 0.05F : 0.0F;
   }

   static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   record NVnVnNnN(float x1, float y1, float x2, float y2) {
      float solve(float var1) {
         float var2 = VVnVVnvnNuUn.UuUVuuUu(var1, 0.0F, 1.0F);
         float var3 = var2;

         for (int var4 = 0; var4 < 7; var4++) {
            float var5 = sample(var3, this.x1, this.x2) - var2;
            if (Math.abs(var5) < 1.0E-5F) {
               return VVnVVnvnNuUn.UuUVuuUu(sample(var3, this.y1, this.y2), 0.0F, 1.0F);
            }

            float var6 = derivative(var3, this.x1, this.x2);
            if (Math.abs(var6) < 1.0E-5F) {
               break;
            }

            var3 = VVnVVnvnNuUn.UuUVuuUu(var3 - var5 / var6, 0.0F, 1.0F);
         }

         float var9 = 0.0F;
         float var10 = 1.0F;
         var3 = var2;

         for (int var11 = 0; var11 < 10; var11++) {
            float var7 = sample(var3, this.x1, this.x2);
            if (Math.abs(var7 - var2) < 1.0E-5F) {
               break;
            }

            if (var7 < var2) {
               var9 = var3;
            } else {
               var10 = var3;
            }

            var3 = (var9 + var10) * 0.5F;
         }

         return VVnVVnvnNuUn.UuUVuuUu(sample(var3, this.y1, this.y2), 0.0F, 1.0F);
      }

      private static float sample(float var0, float var1, float var2) {
         float var3 = 1.0F - var0;
         return 3.0F * var3 * var3 * var0 * var1 + 3.0F * var3 * var0 * var0 * var2 + var0 * var0 * var0;
      }

      private static float derivative(float var0, float var1, float var2) {
         float var3 = 1.0F - var0;
         return 3.0F * var3 * var3 * var1 + 6.0F * var3 * var0 * (var2 - var1) + 3.0F * var0 * var0 * (1.0F - var2);
      }
   }

   static final class nvnNNunvv {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
   }
}
