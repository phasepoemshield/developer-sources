package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class UNVUNunnvnNU {
   public int UuUVuuUu = 0;
   public int C00OOC00oO = 0;
   public int uUnuvNvvNU = 0;
   public int vVvUvVVuuNvV = 0;
   public int uNNnnnuuuN = 0;

   public void UuUVuuUu(int var1, int var2) {
      if (var1 <= 0 || var2 <= 0) {
         this.UuUVuuUu();
      } else if (this.UuUVuuUu == 0 || this.C00OOC00oO == 0 || this.uUnuvNvvNU == 0 || this.vVvUvVVuuNvV != var1 || this.uNNnnnuuuN != var2) {
         this.UuUVuuUu();
         this.vVvUvVVuuNvV = var1;
         this.uNNnnnuuuN = var2;
         VvuuVNVUn.NVnVnNnN var3 = VvuuVNVUn.UuUVuuUu();

         int var4;
         try {
            this.C00OOC00oO = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.C00OOC00oO);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            o000OOoCO0OO.UuUVuuUu(32856, this.vVvUvVVuuNvV, this.uNNnnnuuuN, 6408, 5121);
            this.uUnuvNvvNU = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.uUnuvNvvNU);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 34892, 0);
            o000OOoCO0OO.UuUVuuUu(33190, this.vVvUvVVuuNvV, this.uNNnnnuuuN, 6402, 5125);
            this.UuUVuuUu = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, this.UuUVuuUu);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, this.C00OOC00oO, 0);
            GL30.glFramebufferTexture2D(36160, 36096, 3553, this.uUnuvNvvNU, 0);
            GL11.glDrawBuffer(36064);
            GL11.glReadBuffer(36064);
            var4 = GL30.glCheckFramebufferStatus(36160);
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var3);
         }

         if (var4 != 36053) {
            this.UuUVuuUu();
            throw new IllegalStateException("DepthRenderTarget incomplete: status=" + var4);
         }
      }
   }

   public void UuUVuuUu() {
      if (this.UuUVuuUu != 0) {
         GL30.glDeleteFramebuffers(this.UuUVuuUu);
         this.UuUVuuUu = 0;
      }

      if (this.C00OOC00oO != 0) {
         GL11.glDeleteTextures(this.C00OOC00oO);
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
