package ru.metaculture.protection;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public final class VUUUNuNNn {
   private static final DateTimeFormatter UuUVuuUu = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
   private static final Set<String> C00OOC00oO = ConcurrentHashMap.newKeySet();
   private static final Object uUnuvNvvNU = new Object();
   private static final boolean vVvUvVVuuNvV = Boolean.getBoolean("wild.debug.gl.breadcrumbs");
   private static File uNNnnnuuuN;
   private static boolean nuUnNvnuUu;
   private static boolean VVuuUN;

   private VUUUNuNNn() {
   }

   public static boolean UuUVuuUu() {
      return vVvUvVVuuNvV;
   }

   public static void UuUVuuUu(String var0, String var1) {
      if (vVvUvVVuuNvV) {
         C00OOC00oO("[" + var0 + "] " + var1);
      }
   }

   public static void C00OOC00oO(String var0, String var1) {
      C00OOC00oO("[" + var0 + "] " + var1);
   }

   public static void UuUVuuUu(String var0, String var1, String var2) {
      if (C00OOC00oO.add(var0)) {
         C00OOC00oO("[" + var1 + "] " + var2);
      }
   }

   public static boolean C00OOC00oO() {
      try {
         return GLFW.glfwGetCurrentContext() != 0L;
      } catch (Throwable var1) {
         return false;
      }
   }

   public static String UuUVuuUu(String var0) {
      StringBuilder var1 = null;

      try {
         for (int var2 = 0; var2 < 16; var2++) {
            int var3 = GL11.glGetError();
            if (var3 == 0) {
               break;
            }

            if (var1 == null) {
               var1 = new StringBuilder();
            } else {
               var1.append(", ");
            }

            var1.append(UuUVuuUu(var3));
         }
      } catch (Throwable var4) {
         return null;
      }

      if (var1 == null) {
         return null;
      } else {
         String var5 = var1.toString();
         C00OOC00oO("[gl-error] before " + var0 + ": " + var5);
         return var5;
      }
   }

   public static String UuUVuuUu(int var0) {
      return switch (var0) {
         case 1280 -> "GL_INVALID_ENUM";
         case 1281 -> "GL_INVALID_VALUE";
         case 1282 -> "GL_INVALID_OPERATION";
         case 1283 -> "GL_STACK_OVERFLOW";
         case 1284 -> "GL_STACK_UNDERFLOW";
         case 1285 -> "GL_OUT_OF_MEMORY";
         case 33305 -> "GL_FRAMEBUFFER_UNDEFINED";
         default -> "0x" + Integer.toHexString(var0);
      };
   }

   public static String uUnuvNvvNU() {
      if (!C00OOC00oO()) {
         return "no current GL context on " + Thread.currentThread().getName();
      } else {
         try {
            return "vendor="
               + GL11.glGetString(7936)
               + " renderer="
               + GL11.glGetString(7937)
               + " version="
               + GL11.glGetString(7938)
               + " thread="
               + Thread.currentThread().getName();
         } catch (Throwable var1) {
            return "context query failed: " + var1;
         }
      }
   }

   private static void C00OOC00oO(String var0) {
      try {
         synchronized (uUnuvNvvNU) {
            File var2 = vVvUvVVuuNvV();
            if (var2 == null) {
               return;
            }

            try (PrintWriter var3 = new PrintWriter(new FileWriter(var2, true))) {
               if (!VVuuUN) {
                  VVuuUN = true;
                  var3.println();
                  var3.println("=== session " + LocalTime.now().format(UuUVuuUu) + " | " + uUnuvNvvNU() + " ===");
               }

               var3.println(LocalTime.now().format(UuUVuuUu) + " " + var0);
               var3.flush();
            }
         }
      } catch (Throwable var10) {
      }
   }

   private static File vVvUvVVuuNvV() {
      if (nuUnNvnuUu) {
         return uNNnnnuuuN;
      } else {
         nuUnNvnuUu = true;

         try {
            class_310 var0 = class_310.method_1551();
            File var1 = var0 != null && var0.field_1697 != null ? var0.field_1697 : new File(".");
            uNNnnnuuuN = new File(var1, "wild-gl.log");
         } catch (Throwable var2) {
            uNNnnnuuuN = null;
         }

         return uNNnnnuuuN;
      }
   }
}
