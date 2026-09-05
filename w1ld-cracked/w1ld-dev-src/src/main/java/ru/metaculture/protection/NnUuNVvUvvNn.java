package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL30;

public final class NnUuNVvUvvNn {
   private static int UuUVuuUu;
   private static int C00OOC00oO;

   private NnUuNVvUvvNn() {
   }

   public static int UuUVuuUu() {
      if (!vVvUvVVuuNvV()) {
         return 0;
      } else {
         if (UuUVuuUu != 0 && !GL30.glIsFramebuffer(UuUVuuUu)) {
            UuUVuuUu = 0;
         }

         if (UuUVuuUu == 0) {
            UuUVuuUu = GL30.glGenFramebuffers();
         }

         return UuUVuuUu;
      }
   }

   public static int C00OOC00oO() {
      if (!vVvUvVVuuNvV()) {
         return 0;
      } else {
         if (C00OOC00oO != 0 && !GL30.glIsFramebuffer(C00OOC00oO)) {
            C00OOC00oO = 0;
         }

         if (C00OOC00oO == 0) {
            C00OOC00oO = GL30.glGenFramebuffers();
         }

         return C00OOC00oO;
      }
   }

   public static void UuUVuuUu(int var0) {
      if (UuUVuuUu == var0) {
         UuUVuuUu = 0;
      }
   }

   public static void uUnuvNvvNU() {
      if (!vVvUvVVuuNvV()) {
         UuUVuuUu = 0;
         C00OOC00oO = 0;
      } else {
         if (UuUVuuUu != 0) {
            GL30.glDeleteFramebuffers(UuUVuuUu);
            UuUVuuUu = 0;
         }

         if (C00OOC00oO != 0) {
            GL30.glDeleteFramebuffers(C00OOC00oO);
            C00OOC00oO = 0;
         }
      }
   }

   private static boolean vVvUvVVuuNvV() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }
}
