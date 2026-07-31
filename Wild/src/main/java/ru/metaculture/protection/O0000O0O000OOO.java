package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL30;

public final class O0000O0O000OOO {
   private static int O00000000;
   private static int O000000000;

   private O0000O0O000OOO() {
   }

   public static int O00000000() {
      if (!O00000000000()) {
         return 0;
      } else {
         if (O00000000 == 0) {
            O00000000 = GL30.glGenFramebuffers();
         }

         return O00000000;
      }
   }

   public static int O000000000() {
      if (!O00000000000()) {
         return 0;
      } else {
         if (O000000000 == 0) {
            O000000000 = GL30.glGenFramebuffers();
         }

         return O000000000;
      }
   }

   public static void O00000000(int i) {
      if (O00000000 == i) {
         O00000000 = 0;
      }
   }

   public static void O0000000000() {
      if (!O00000000000()) {
         O00000000 = 0;
         O000000000 = 0;
      } else {
         if (O00000000 != 0) {
            GL30.glDeleteFramebuffers(O00000000);
            O00000000 = 0;
         }

         if (O000000000 != 0) {
            GL30.glDeleteFramebuffers(O000000000);
            O000000000 = 0;
         }
      }
   }

   private static boolean O00000000000() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }
}
