package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class O0000O0O000O0 {
   public int O00000000 = 0;
   public int O000000000 = 0;
   public int O0000000000 = 0;
   public int O00000000000 = 0;
   public int O000000000000 = 0;

   public void O00000000(int i, int j) {
      if (i <= 0 || j <= 0) {
         this.O00000000();
      } else if (this.O00000000 == 0 || this.O000000000 == 0 || this.O0000000000 == 0 || this.O00000000000 != i || this.O000000000000 != j) {
         this.O00000000();
         this.O00000000000 = i;
         this.O000000000000 = j;
         O0000O00O0OOO0.W373 var3 = O0000O00O0OOO0.O00000000();

         int var4;
         try {
            this.O000000000 = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.O000000000);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            O0000O00O0OOOO.O00000000(32856, this.O00000000000, this.O000000000000, 6408, 5121);
            this.O0000000000 = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.O0000000000);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 34892, 0);
            O0000O00O0OOOO.O00000000(33190, this.O00000000000, this.O000000000000, 6402, 5125);
            this.O00000000 = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, this.O00000000);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, this.O000000000, 0);
            GL30.glFramebufferTexture2D(36160, 36096, 3553, this.O0000000000, 0);
            GL11.glDrawBuffer(36064);
            GL11.glReadBuffer(36064);
            var4 = GL30.glCheckFramebufferStatus(36160);
         } finally {
            O0000O00O0OOO0.O00000000(var3);
         }

         if (var4 != 36053) {
            this.O00000000();
            throw new IllegalStateException("DepthRenderTarget incomplete: status=" + var4);
         }
      }
   }

   public void O00000000() {
      if (this.O00000000 != 0) {
         GL30.glDeleteFramebuffers(this.O00000000);
         this.O00000000 = 0;
      }

      if (this.O000000000 != 0) {
         GL11.glDeleteTextures(this.O000000000);
         this.O000000000 = 0;
      }

      if (this.O0000000000 != 0) {
         GL11.glDeleteTextures(this.O0000000000);
         this.O0000000000 = 0;
      }

      this.O00000000000 = 0;
      this.O000000000000 = 0;
   }
}
