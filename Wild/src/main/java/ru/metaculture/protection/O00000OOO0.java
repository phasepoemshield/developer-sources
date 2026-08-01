package ru.metaculture.protection;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class O00000OOO0 implements AutoCloseable {
   private int O00000000;
   private int O000000000;
   private int O0000000000;
   private int O00000000000;

   public void O00000000(int i, int j) {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         this.O000000000000O();
      } else if (i > 0 && j > 0) {
         int var3 = Math.max(1, GL11.glGetInteger(3379));
         int var4 = Math.max(1, Math.min(i, var3));
         int var5 = Math.max(1, Math.min(j, var3));
         if (this.O00000000 == 0 || this.O000000000 == 0 || this.O0000000000 != var4 || this.O00000000000 != var5) {
            int var6 = GL11.glGetInteger(36006);
            int var7 = GL11.glGetInteger(36010);
            int var8 = GL11.glGetInteger(32873);
            int var9 = this.O000000000;
            this.O0000000000000();
            if (var8 == var9) {
               var8 = 0;
            }

            this.O0000000000 = var4;
            this.O00000000000 = var5;

            try {
               this.O000000000 = GL11.glGenTextures();
               GL11.glBindTexture(3553, this.O000000000);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               O0000O00O0OOOO.O00000000(32856, this.O0000000000, this.O00000000000, 6408, 5121);
               this.O00000000 = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36160, this.O00000000);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, this.O000000000, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                  this.O0000000000000();
               } else {
                  float[] var10 = new float[4];
                  GL11.glGetFloatv(3106, var10);
                  boolean var11 = GL11.glIsEnabled(3089);
                  GL11.glDisable(3089);
                  GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                  GL11.glClear(16384);
                  if (var11) {
                     GL11.glEnable(3089);
                  }

                  GL11.glClearColor(var10[0], var10[1], var10[2], var10[3]);
               }
            } finally {
               O0000O00O0OOO0.O00000000(36008, var7);
               O0000O00O0OOO0.O00000000(36009, var6);
               GL11.glBindTexture(3553, var8);
            }
         }
      } else {
         this.O0000000000000();
      }
   }

   public void O00000000() {
      if (this.O000000000000()) {
         GL30.glBindFramebuffer(36160, this.O00000000);
         GL11.glViewport(0, 0, this.O0000000000, this.O00000000000);
      }
   }

   public int O000000000() {
      return this.O000000000;
   }

   public int O0000000000() {
      return this.O0000000000;
   }

   public int O00000000000() {
      return this.O00000000000;
   }

   public boolean O000000000000() {
      return this.O00000000 != 0 && this.O000000000 != 0 && this.O0000000000 > 0 && this.O00000000000 > 0;
   }

   private void O0000000000000() {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         this.O000000000000O();
      } else {
         if (this.O00000000 != 0) {
            GL30.glDeleteFramebuffers(this.O00000000);
            this.O00000000 = 0;
         }

         if (this.O000000000 != 0) {
            GL11.glDeleteTextures(this.O000000000);
            this.O000000000 = 0;
         }

         this.O0000000000 = 0;
         this.O00000000000 = 0;
      }
   }

   private void O000000000000O() {
      this.O00000000 = 0;
      this.O000000000 = 0;
      this.O0000000000 = 0;
      this.O00000000000 = 0;
   }

   @Override
   public void close() {
      this.O0000000000000();
   }
}
