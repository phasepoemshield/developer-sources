package ru.metaculture.protection;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class VvNNUnNNVn implements AutoCloseable {
   private static int UuUVuuUu;
   private int C00OOC00oO;
   private int uUnuvNvvNU;
   private int vVvUvVVuuNvV;
   private int uNNnnnuuuN;
   private int nuUnNvnuUu = 32856;

   private static int VVuuUN() {
      if (UuUVuuUu <= 0) {
         UuUVuuUu = Math.max(1, GL11.glGetInteger(3379));
      }

      return UuUVuuUu;
   }

   public void UuUVuuUu(int var1, int var2) {
      this.UuUVuuUu(var1, var2, 32856);
   }

   public void C00OOC00oO(int var1, int var2) {
      this.UuUVuuUu(var1, var2, 34842);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1, int var2, int var3) {
      if (this.C00OOC00oO == 0 || this.uUnuvNvvNU == 0 || this.vVvUvVVuuNvV != var1 || this.uNNnnnuuuN != var2 || this.nuUnNvnuUu != var3) {
         if (GLFW.glfwGetCurrentContext() == 0L) {
            this.uVUuuVnNVU();
         } else if (var1 > 0 && var2 > 0) {
            int var4 = VVuuUN();
            int var5 = Math.max(1, Math.min(var1, var4));
            int var6 = Math.max(1, Math.min(var2, var4));
            if (this.C00OOC00oO == 0 || this.uUnuvNvvNU == 0 || this.vVvUvVVuuNvV != var5 || this.uNNnnnuuuN != var6 || this.nuUnNvnuUu != var3) {
               int var7 = GL11.glGetInteger(36006);
               int var8 = GL11.glGetInteger(36010);
               int var9 = GL11.glGetInteger(32873);
               int var10 = this.uUnuvNvvNU;
               this.vNUvnnVnUvu();
               if (var9 == var10) {
                  var9 = 0;
               }

               this.vVvUvVVuuNvV = var5;
               this.uNNnnnuuuN = var6;
               this.nuUnNvnuUu = var3;
               boolean var15 = false /* VF: Semaphore variable */;

               try {
                  var15 = true;
                  this.uUnuvNvvNU = GL11.glGenTextures();
                  GL11.glBindTexture(3553, this.uUnuvNvvNU);
                  GL11.glTexParameteri(3553, 10241, 9729);
                  GL11.glTexParameteri(3553, 10240, 9729);
                  GL11.glTexParameteri(3553, 10242, 33071);
                  GL11.glTexParameteri(3553, 10243, 33071);
                  o000OOoCO0OO.UuUVuuUu(this.nuUnNvnuUu, this.vVvUvVVuuNvV, this.uNNnnnuuuN, 6408, this.nuUnNvnuUu == 34842 ? 5131 : 5121);
                  this.C00OOC00oO = GL30.glGenFramebuffers();
                  GL30.glBindFramebuffer(36160, this.C00OOC00oO);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, this.uUnuvNvvNU, 0);
                  GL11.glDrawBuffer(36064);
                  if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                     this.vNUvnnVnUvu();
                     var15 = false;
                  } else {
                     float[] var11 = new float[4];
                     GL11.glGetFloatv(3106, var11);
                     boolean var12 = GL11.glIsEnabled(3089);
                     GL11.glDisable(3089);
                     GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                     GL11.glClear(16384);
                     if (var12) {
                        GL11.glEnable(3089);
                     }

                     GL11.glClearColor(var11[0], var11[1], var11[2], var11[3]);
                     var15 = false;
                  }
               } finally {
                  if (var15) {
                     VvuuVNVUn.UuUVuuUu(36008, var8);
                     VvuuVNVUn.UuUVuuUu(36009, var7);
                     GL11.glBindTexture(3553, var9);
                  }
               }

               VvuuVNVUn.UuUVuuUu(36008, var8);
               VvuuVNVUn.UuUVuuUu(36009, var7);
               GL11.glBindTexture(3553, var9);
            }
         } else {
            this.vNUvnnVnUvu();
         }
      }
   }

   public void UuUVuuUu() {
      if (this.nuUnNvnuUu()) {
         GL30.glBindFramebuffer(36160, this.C00OOC00oO);
         GL11.glViewport(0, 0, this.vVvUvVVuuNvV, this.uNNnnnuuuN);
      }
   }

   public int C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public int uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public int vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public int uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public boolean nuUnNvnuUu() {
      return this.C00OOC00oO != 0 && this.uUnuvNvvNU != 0 && this.vVvUvVVuuNvV > 0 && this.uNNnnnuuuN > 0;
   }

   private void vNUvnnVnUvu() {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         this.uVUuuVnNVU();
      } else {
         if (this.C00OOC00oO != 0) {
            GL30.glDeleteFramebuffers(this.C00OOC00oO);
            this.C00OOC00oO = 0;
         }

         if (this.uUnuvNvvNU != 0) {
            GL11.glDeleteTextures(this.uUnuvNvvNU);
            this.uUnuvNvvNU = 0;
         }

         this.vVvUvVVuuNvV = 0;
         this.uNNnnnuuuN = 0;
      }
   }

   private void uVUuuVnNVU() {
      this.C00OOC00oO = 0;
      this.uUnuvNvvNU = 0;
      this.vVvUvVVuuNvV = 0;
      this.uNNnnnuuuN = 0;
   }

   @Override
   public void close() {
      this.vNUvnnVnUvu();
   }
}
