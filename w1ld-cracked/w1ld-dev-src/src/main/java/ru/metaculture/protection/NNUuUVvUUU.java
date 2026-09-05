package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class NNUuUVvUUU {
   private static final NNUuUVvUUU UuUVuuUu = new NNUuUVvUUU();
   private static final float C00OOC00oO = 1.08F;
   private static final int uUnuvNvvNU = 10;
   private static final int vVvUvVVuuNvV = -4205825;
   private static final int uNNnnnuuuN = -8547073;
   private final NNUuUVvUUU.nvnNNunvv nuUnNvnuUu = new NNUuUVvUUU.nvnNNunvv();
   private final NNUuUVvUUU.nvnNNunvv VVuuUN = new NNUuUVvUUU.nvnNNunvv();
   private final NNUuUVvUUU.nvnNNunvv vNUvnnVnUvu = new NNUuUVvUUU.nvnNNunvv();
   private final List<NNUuUVvUUU.NVnVnNnN> uVUuuVnNVU = new ArrayList<>();
   private vVvUNNUVVnNn vuuuNvNuv;
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
   private int uNnUnnuNUnNu = -1;
   private int NnUuNNU = -1;
   private int nNvNUVU;
   private int UnUNuUU;
   private int uUVuVvuNUvnu;
   private int UvUvUNuvNU;

   private NNUuUVvUUU() {
   }

   public static NNUuUVvUUU UuUVuuUu() {
      return UuUVuuUu;
   }

   public void UuUVuuUu(float var1, float var2, int var3, int var4) {
      if (Menu.UuUVuuUu(Menu.NVUunUNUN)) {
         class_310 var5 = class_310.method_1551();
         if (!C00OOC00oO(var5)) {
            this.C00OOC00oO();
         } else {
            class_1041 var6 = var5.method_22683();
            int var7 = var6.method_4489();
            int var8 = var6.method_4506();
            if (var7 > 0 && var8 > 0) {
               if (this.uVUuuVnNVU.isEmpty()) {
                  if (!this.UuUVuuUu(var5, this.nuUnNvnuUu, var7, var8)) {
                     this.C00OOC00oO();
                     return;
                  }
               } else if (!this.C00OOC00oO(this.nuUnNvnuUu, var7, var8)) {
                  this.C00OOC00oO();
                  return;
               }

               if (!this.UuUVuuUu(var5, var7, var8)) {
                  this.C00OOC00oO();
               } else {
                  NNUuUVvUUU.NVnVnNnN var9 = new NNUuUVvUUU.NVnVnNnN();
                  var9.uNNnnnuuuN = UuUVuuUu(var1, 0.0F, Math.max(0.0F, var7 - 1.0F));
                  var9.nuUnNvnuUu = UuUVuuUu(var2, 0.0F, Math.max(0.0F, var8 - 1.0F));
                  var9.VVuuUN = var3;
                  var9.vNUvnnVnUvu = var4;
                  if (!this.UuUVuuUu(var9.UuUVuuUu, var7, var8)) {
                     this.UuUVuuUu(var9.UuUVuuUu);
                     if (this.uVUuuVnNVU.isEmpty()) {
                        this.vVvUvVVuuNvV();
                     }
                  } else {
                     this.uVUuuVnNVU.add(var9);
                     oocOO0CCC0O.UuUVuuUu().uNNnnnuuuN();
                  }
               }
            } else {
               this.vVvUvVVuuNvV();
            }
         }
      }
   }

   public void UuUVuuUu(double var1, double var3, int var5, int var6) {
      class_310 var7 = class_310.method_1551();
      if (!C00OOC00oO(var7)) {
         this.C00OOC00oO();
      } else {
         class_1041 var8 = var7.method_22683();
         int var9 = var8.method_4489();
         int var10 = var8.method_4506();
         int var11 = var8.method_4486();
         int var12 = var8.method_4502();
         if (var9 > 0 && var10 > 0 && var11 > 0 && var12 > 0) {
            float var13 = (float)(var1 * var9 / var11);
            float var14 = (float)(var3 * var10 / var12);
            this.UuUVuuUu(var13, var14, var5, var6);
         } else {
            this.C00OOC00oO();
         }
      }
   }

   public void UuUVuuUu(float var1) {
      if (!this.uVUuuVnNVU.isEmpty()) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && C00OOC00oO(var2) && var2.field_1755 != null) {
            class_1041 var3 = var2.method_22683();
            int var4 = var3.method_4489();
            int var5 = var3.method_4506();
            if (var4 <= 0 || var5 <= 0 || !this.C00OOC00oO(this.nuUnNvnuUu, var4, var5)) {
               this.vVvUvVVuuNvV();
            } else if (!this.C00OOC00oO(var4, var5)) {
               this.C00OOC00oO();
            } else {
               NNUuUVvUUU.NVnVnNnN var6 = this.uVUuuVnNVU.get(this.uVUuuVnNVU.size() - 1);
               int var7 = this.UuUVuuUu(var2);
               if (var7 > 0 && this.UuUVuuUu(var2, var6.UuUVuuUu, var4, var5)) {
                  this.C00OOC00oO(var1);
                  if (!this.uUnuvNvvNU(var4, var5)) {
                     this.C00OOC00oO();
                  } else if (!this.uVUuuVnNVU.isEmpty()) {
                     this.uUnuvNvvNU();
                     if (this.vuuuNvNuv != null && this.uUVuVvuNUvnu != 0) {
                        if (this.uVUuuVnNVU.size() <= 1 || this.UuUVuuUu(this.VVuuUN, var4, var5) && this.UuUVuuUu(this.vNUvnnVnUvu, var4, var5)) {
                           int var8 = this.nuUnNvnuUu.C00OOC00oO;

                           for (int var9 = 0; var9 < this.uVUuuVnNVU.size(); var9++) {
                              NNUuUVvUUU.NVnVnNnN var10 = this.uVUuuVnNVU.get(var9);
                              boolean var11 = var9 == this.uVUuuVnNVU.size() - 1;
                              int var12 = var11 ? var7 : ((var9 & 1) == 0 ? this.VVuuUN.C00OOC00oO : this.vNUvnnVnUvu.C00OOC00oO);
                              this.UuUVuuUu(var8, var10.UuUVuuUu.C00OOC00oO, var12, var4, var5, var10);
                              var8 = var12;
                           }
                        } else {
                           this.C00OOC00oO();
                        }
                     } else {
                        this.C00OOC00oO();
                     }
                  }
               } else {
                  this.C00OOC00oO();
               }
            }
         } else {
            this.C00OOC00oO();
         }
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if ((this.nuUnNvnuUu.uUnuvNvvNU <= 0 || this.nuUnNvnuUu.uUnuvNvvNU == var1 && this.nuUnNvnuUu.vVvUvVVuuNvV == var2)
            && (this.VVuuUN.uUnuvNvvNU <= 0 || this.VVuuUN.uUnuvNvvNU == var1 && this.VVuuUN.vVvUvVVuuNvV == var2)
            && (this.vNUvnnVnUvu.uUnuvNvvNU <= 0 || this.vNUvnnVnUvu.uUnuvNvvNU == var1 && this.vNUvnnVnUvu.vVvUvVVuuNvV == var2)) {
            for (NNUuUVvUUU.NVnVnNnN var4 : this.uVUuuVnNVU) {
               if (var4.UuUVuuUu.uUnuvNvvNU > 0 && (var4.UuUVuuUu.uUnuvNvvNU != var1 || var4.UuUVuuUu.vVvUvVVuuNvV != var2)) {
                  this.vVvUvVVuuNvV();
                  return;
               }
            }
         } else {
            this.vVvUvVVuuNvV();
         }
      } else {
         this.vVvUvVVuuNvV();
      }
   }

   public void UuUVuuUu(boolean var1) {
      if (!var1) {
         this.vVvUvVVuuNvV();
      }
   }

   public void C00OOC00oO() {
      this.vVvUvVVuuNvV();
   }

   private boolean UuUVuuUu(class_310 var1, int var2, int var3) {
      while (this.uVUuuVnNVU.size() >= 10 && !this.uVUuuVnNVU.isEmpty()) {
         NNUuUVvUUU.NVnVnNnN var4 = this.uVUuuVnNVU.remove(0);
         boolean var5 = this.UuUVuuUu(var4.UuUVuuUu.C00OOC00oO, var2, var3, this.nuUnNvnuUu);
         this.UuUVuuUu(var4.UuUVuuUu);
         if (!var5) {
            return false;
         }
      }

      return true;
   }

   private boolean C00OOC00oO(int var1, int var2) {
      for (NNUuUVvUUU.NVnVnNnN var4 : this.uVUuuVnNVU) {
         if (!this.UuUVuuUu(var4.UuUVuuUu, var1, var2)) {
            return false;
         }
      }

      return true;
   }

   private void C00OOC00oO(float var1) {
      float var2 = uUnuvNvvNU(var1);

      for (NNUuUVvUUU.NVnVnNnN var4 : this.uVUuuVnNVU) {
         var4.vVvUvVVuuNvV += var2;
         var4.C00OOC00oO = UuUVuuUu(var4.C00OOC00oO + var2 / 1.08F, 0.0F, 1.0F);
         var4.uUnuvNvvNU = vVvUvVVuuNvV(var4.C00OOC00oO);
      }
   }

   private boolean uUnuvNvvNU(int var1, int var2) {
      while (!this.uVUuuVnNVU.isEmpty() && this.uVUuuVnNVU.get(0).C00OOC00oO >= 1.0F) {
         NNUuUVvUUU.NVnVnNnN var3 = this.uVUuuVnNVU.remove(0);
         boolean var4 = this.UuUVuuUu(var3.UuUVuuUu.C00OOC00oO, var1, var2, this.nuUnNvnuUu);
         this.UuUVuuUu(var3.UuUVuuUu);
         if (!var4) {
            return false;
         }
      }

      return true;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1, int var2, int var3, int var4, int var5, NNUuUVvUUU.NVnVnNnN var6) {
      VvuuVNVUn.NVnVnNnN var7 = VvuuVNVUn.UuUVuuUu();
      boolean var18 = false /* VF: Semaphore variable */;

      label154: {
         try {
            var18 = true;

            try (
               UNvnuVVnN var8 = UNvnuVVnN.UuUVuuUu(0, 3553);
               UNvnuVVnN var9 = UNvnuVVnN.UuUVuuUu(1, 3553);
            ) {
               if (this.UnUNuUU == 0) {
                  this.UnUNuUU = GL30.glGenFramebuffers();
               }

               GL30.glBindFramebuffer(36160, this.UnUNuUU);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, var3, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                  break label154;
               }

               GL11.glViewport(0, 0, var4, var5);
               GL11.glDisable(3089);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(3042);
               GL11.glDisable(36281);
               GL11.glColorMask(true, true, true, true);
               GL11.glDepthMask(false);
               this.vuuuNvNuv.UuUVuuUu();
               this.UuUVuuUu(var4, var5, var6);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, var1);
               GL13.glActiveTexture(33985);
               GL11.glBindTexture(3553, var2);
               GL30.glBindVertexArray(this.uUVuVvuNUvnu);
               VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
            }
         } finally {
            if (var18) {
               if (this.UnUNuUU != 0) {
                  GL30.glBindFramebuffer(36160, this.UnUNuUU);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
               }

               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var7);
            }
         }

         if (this.UnUNuUU != 0) {
            GL30.glBindFramebuffer(36160, this.UnUNuUU);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         }

         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var7);
         return;
      }

      if (this.UnUNuUU != 0) {
         GL30.glBindFramebuffer(36160, this.UnUNuUU);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      }

      GL20.glUseProgram(0);
      VvuuVNVUn.uUnuvNvvNU(var7);
   }

   private void UuUVuuUu(int var1, int var2, NNUuUVvUUU.NVnVnNnN var3) {
      float var4 = var1 / Math.max(1.0F, (float)var2);
      float var5 = this.UuUVuuUu(var1, var2, var4, var3.uNNnnnuuuN, var3.nuUnNvnuUu);
      float var6 = var5 * (0.004F + var3.uUnuvNvvNU * 1.145F);
      if (this.nvUVNnuu >= 0) {
         GL20.glUniform1i(this.nvUVNnuu, 0);
      }

      if (this.UuuNnUvUuv >= 0) {
         GL20.glUniform1i(this.UuuNnUvUuv, 1);
      }

      if (this.nUUVuvU >= 0) {
         GL20.glUniform2f(this.nUUVuvU, var1, var2);
      }

      if (this.UnUNVVVNuv >= 0) {
         GL20.glUniform1f(this.UnUNVVVNuv, var3.uUnuvNvvNU);
      }

      if (this.vNVuvnUUnuUn >= 0) {
         GL20.glUniform1f(this.vNVuvnUUnuUn, var3.C00OOC00oO);
      }

      if (this.UvnvNVnnnnNU >= 0) {
         GL20.glUniform1f(this.UvnvNVnnnnNU, var3.vVvUvVVuuNvV);
      }

      if (this.uVUVnuvnuVuv >= 0) {
         GL20.glUniform2f(this.uVUVnuvnuVuv, var3.uNNnnnuuuN, var3.nuUnNvnuUu);
      }

      if (this.NVNnnvnuunNv >= 0) {
         GL20.glUniform1f(this.NVNnnvnuunNv, var4);
      }

      if (this.uVunuUNVVUUV >= 0) {
         GL20.glUniform1f(this.uVunuUNVVUUV, var6);
      }

      if (this.UNnVVNvvnVvU >= 0) {
         GL20.glUniform1f(this.UNnVVNvvnVvU, var5);
      }

      if (this.uNnUnnuNUnNu >= 0) {
         GL20.glUniform3f(this.uNnUnnuNUnNu, (var3.VVuuUN >>> 16 & 0xFF) / 255.0F, (var3.VVuuUN >>> 8 & 0xFF) / 255.0F, (var3.VVuuUN & 0xFF) / 255.0F);
      }

      if (this.NnUuNNU >= 0) {
         GL20.glUniform3f(this.NnUuNNU, (var3.vNUvnnVnUvu >>> 16 & 0xFF) / 255.0F, (var3.vNUvnnVnUvu >>> 8 & 0xFF) / 255.0F, (var3.vNUvnnVnUvu & 0xFF) / 255.0F);
      }
   }

   private float UuUVuuUu(int var1, int var2, float var3, float var4, float var5) {
      float var6 = UuUVuuUu(var4 / Math.max(1.0F, (float)var1), 0.0F, 1.0F);
      float var7 = UuUVuuUu(1.0F - var5 / Math.max(1.0F, (float)var2), 0.0F, 1.0F);
      float var8 = UuUVuuUu(var6, var7, 0.0F, 0.0F, var3);
      float var9 = UuUVuuUu(var6, var7, 1.0F, 0.0F, var3);
      float var10 = UuUVuuUu(var6, var7, 1.0F, 1.0F, var3);
      float var11 = UuUVuuUu(var6, var7, 0.0F, 1.0F, var3);
      return Math.max(Math.max(var8, var9), Math.max(var10, var11));
   }

   private boolean UuUVuuUu(class_310 var1, NNUuUVvUUU.nvnNNunvv var2, int var3, int var4) {
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
   private boolean UuUVuuUu(int var1, int var2, int var3, NNUuUVvUUU.nvnNNunvv var4) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && this.UuUVuuUu(var4, var2, var3)) {
         VvuuVNVUn.NVnVnNnN var5 = VvuuVNVUn.UuUVuuUu();
         boolean var9 = false /* VF: Semaphore variable */;

         boolean var11;
         label85: {
            try {
               var9 = true;
               if (this.nNvNUVU == 0) {
                  this.nNvNUVU = GL30.glGenFramebuffers();
               }

               GL11.glDisable(3089);
               GL11.glDisable(3042);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(36281);
               GL30.glBindFramebuffer(36008, this.nNvNUVU);
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
                  if (this.nNvNUVU != 0) {
                     GL30.glBindFramebuffer(36008, this.nNvNUVU);
                     GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
                  }

                  VvuuVNVUn.uUnuvNvvNU(var5);
               }
            }

            if (this.nNvNUVU != 0) {
               GL30.glBindFramebuffer(36008, this.nNvNUVU);
               GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            }

            VvuuVNVUn.uUnuvNvvNU(var5);
            return var11;
         }

         if (this.nNvNUVU != 0) {
            GL30.glBindFramebuffer(36008, this.nNvNUVU);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
         }

         VvuuVNVUn.uUnuvNvvNU(var5);
         return var11;
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(NNUuUVvUUU.nvnNNunvv var1, int var2, int var3) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         if (var1.C00OOC00oO != 0 && (var1.uUnuvNvvNU != var2 || var1.vVvUvVVuuNvV != var3 || var1.UuUVuuUu == 0)) {
            this.UuUVuuUu(var1);
         }

         label61:
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
                  break label61;
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

   private void uUnuvNvvNU() {
      if (this.uUVuVvuNUvnu == 0) {
         VvuuVNVUn.NVnVnNnN var1 = VvuuVNVUn.UuUVuuUu();

         try {
            this.uUVuVvuNUvnu = GL30.glGenVertexArrays();
            this.UvUvUNuvNU = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.uUVuVvuNUvnu);
            GL15.glBindBuffer(34962, this.UvUvUNuvNU);
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

      if (this.vuuuNvNuv == null) {
         this.vuuuNvNuv = vVvUNNUVVnNn.UuUVuuUu(
            "assets/wild/shaders/postfx/theme_shockwave_transition.vert", "assets/wild/shaders/postfx/theme_shockwave_transition.frag"
         );
         this.nvUVNnuu = this.vuuuNvNuv.UuUVuuUu("u_textureOld");
         this.UuuNnUvUuv = this.vuuuNvNuv.UuUVuuUu("u_textureNew");
         this.nUUVuvU = this.vuuuNvNuv.UuUVuuUu("u_resolution");
         this.UnUNVVVNuv = this.vuuuNvNuv.UuUVuuUu("u_progress");
         this.vNVuvnUUnuUn = this.vuuuNvNuv.UuUVuuUu("u_linearProgress");
         this.UvnvNVnnnnNU = this.vuuuNvNuv.UuUVuuUu("u_time");
         this.uVUVnuvnuVuv = this.vuuuNvNuv.UuUVuuUu("u_center");
         this.NVNnnvnuunNv = this.vuuuNvNuv.UuUVuuUu("u_aspect");
         this.uVunuUNVVUUV = this.vuuuNvNuv.UuUVuuUu("u_radius");
         this.UNnVVNvvnVvU = this.vuuuNvNuv.UuUVuuUu("u_maxRadius");
         this.uNnUnnuNUnNu = this.vuuuNvNuv.UuUVuuUu("u_accentTop");
         this.NnUuNNU = this.vuuuNvNuv.UuUVuuUu("u_accentBottom");
      }
   }

   private boolean C00OOC00oO(NNUuUVvUUU.nvnNNunvv var1, int var2, int var3) {
      return var1 != null && var1.UuUVuuUu != 0 && var1.C00OOC00oO != 0 && var1.uUnuvNvvNU == var2 && var1.vVvUvVVuuNvV == var3;
   }

   private void vVvUvVVuuNvV() {
      for (NNUuUVvUUU.NVnVnNnN var2 : this.uVUuuVnNVU) {
         this.UuUVuuUu(var2.UuUVuuUu);
      }

      this.uVUuuVnNVU.clear();
      this.UuUVuuUu(this.nuUnNvnuUu);
      this.UuUVuuUu(this.VVuuUN);
      this.UuUVuuUu(this.vNUvnnVnUvu);
   }

   private void UuUVuuUu(NNUuUVvUUU.nvnNNunvv var1) {
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

   private static float uUnuvNvvNU(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? UuUVuuUu(var0, 0.0F, 6.0F) * 0.05F : 0.0F;
   }

   private static float vVvUvVVuuNvV(float var0) {
      float var1 = UuUVuuUu(var0, 0.0F, 1.0F);
      float var2 = var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
      float var3 = 1.0F - (float)Math.exp(-3.15F * var1);
      return UuUVuuUu(var2 * 0.58F + var3 * 0.42F, 0.0F, 1.0F);
   }

   private static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      float var5 = (var2 - var0) * var4;
      float var6 = var3 - var1;
      return (float)Math.sqrt(var5 * var5 + var6 * var6);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   static final class NVnVnNnN {
      final NNUuUVvUUU.nvnNNunvv UuUVuuUu = new NNUuUVvUUU.nvnNNunvv();
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      int VVuuUN = -4205825;
      int vNUvnnVnUvu = -8547073;
   }

   static final class nvnNNunvv {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
   }
}
