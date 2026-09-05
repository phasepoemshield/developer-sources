package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class nuuvUNvn {
   private static volatile int UuUVuuUu = -1;
   private static volatile Boolean C00OOC00oO;
   private static volatile Boolean uUnuvNvvNU;

   private nuuvUNvn() {
   }

   public static void UuUVuuUu(int var0) {
      if (var0 <= 0) {
         UuUVuuUu = -1;
      } else {
         UuUVuuUu = C00OOC00oO(var0) ? var0 : -1;
      }
   }

   public static boolean C00OOC00oO(int var0) {
      if (var0 <= 0) {
         return false;
      } else {
         try {
            return GL30.glIsFramebuffer(var0);
         } catch (Throwable var2) {
            return false;
         }
      }
   }

   public static boolean UuUVuuUu() {
      Boolean var0 = UuUVuuUu(System.getProperty("wild.render.weakGl"));
      if (var0 != null) {
         return var0;
      } else if (C00OOC00oO != null) {
         return C00OOC00oO;
      } else {
         synchronized (nuuvUNvn.class) {
            if (C00OOC00oO != null) {
               return C00OOC00oO;
            } else {
               C00OOC00oO = uUnuvNvvNU();
               return C00OOC00oO;
            }
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean C00OOC00oO() {
      if (uUnuvNvvNU != null) {
         return uUnuvNvvNU;
      } else {
         Class<nuuvUNvn> var0 = nuuvUNvn.class;
         synchronized (nuuvUNvn.class){} // $VF: monitorenter 

         try {
            if (uUnuvNvvNU != null) {
               boolean var8 = uUnuvNvvNU;
               // $VF: monitorexit
               return var8;
            } else if (GLFW.glfwGetCurrentContext() == 0L) {
               // $VF: monitorexit
               return false;
            } else {
               try {
                  String var1 = uUnuvNvvNU(GL11.glGetString(7936));
                  String var2 = uUnuvNvvNU(GL11.glGetString(7937));
                  uUnuvNvvNU = UuUVuuUu(var1, "amd")
                     || UuUVuuUu(var1, "ati")
                     || var1.contains("advanced micro devices")
                     || UuUVuuUu(var2, "amd")
                     || UuUVuuUu(var2, "ati")
                     || var2.contains("radeon");
               } catch (Throwable var6) {
                  uUnuvNvvNU = false;
               }

               boolean var10000 = uUnuvNvvNU;
               // $VF: monitorexit
               return var10000;
            }
         } finally {
            // $VF: monitorexit
         }
      }
   }

   private static boolean UuUVuuUu(String var0, String var1) {
      if (var0 != null && !var0.isEmpty()) {
         int var2 = 0;

         while (var2 <= var0.length() - var1.length()) {
            int var3 = var0.indexOf(var1, var2);
            if (var3 < 0) {
               return false;
            }

            int var4 = var3 + var1.length();
            boolean var5 = var3 == 0 || !Character.isLetterOrDigit(var0.charAt(var3 - 1));
            boolean var6 = var4 >= var0.length() || !Character.isLetterOrDigit(var0.charAt(var4));
            if (var5 && var6) {
               return true;
            }

            var2 = var3 + 1;
         }

         return false;
      } else {
         return false;
      }
   }

   public static void UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_22683() != null) {
         class_1041 var1 = var0.method_22683();
         int var2 = var1.method_4489();
         int var3 = var1.method_4506();
         if (var2 > 0 && var3 > 0) {
            int var4 = UuUVuuUu;
            if (var4 > 0 && !C00OOC00oO(var4)) {
               UuUVuuUu = -1;
               var4 = -1;
            }

            if (var4 <= 0) {
               var4 = GL11.glGetInteger(36006);
            }

            if (var4 > 0 && !C00OOC00oO(var4)) {
               UuUVuuUu = -1;
               var4 = -1;
            }

            if (var4 > 0) {
               GL30.glBindFramebuffer(36009, var4);
               GL30.glBindFramebuffer(36008, var4);
               GL11.glDrawBuffer(36064);
               GL11.glReadBuffer(36064);
            }

            GL11.glViewport(0, 0, var2, var3);
            GL11.glColorMask(true, true, true, true);
            GL11.glDisable(3089);
         }
      }
   }

   private static Boolean UuUVuuUu(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim().toLowerCase();

         return switch (var1) {
            case "true", "1", "yes", "on" -> true;
            case "false", "0", "no", "off" -> false;
            default -> null;
         };
      } else {
         return null;
      }
   }

   private static boolean uUnuvNvvNU() {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         return false;
      } else {
         try {
            String var0 = uUnuvNvvNU(GL11.glGetString(7936));
            String var1 = uUnuvNvvNU(GL11.glGetString(7937));
            String var2 = GL11.glGetString(7938);
            float var3 = C00OOC00oO(var2);
            return !var0.contains("intel") && !var1.contains("intel") && !var1.contains("hd graphics") ? var3 > 0.0F && var3 < 4.0F : true;
         } catch (Throwable var4) {
            return false;
         }
      }
   }

   private static float C00OOC00oO(String var0) {
      if (var0 != null && !var0.isBlank()) {
         int var1 = var0.indexOf(32);
         String var2 = var1 >= 0 ? var0.substring(0, var1) : var0;
         int var3 = var2.indexOf(46);
         if (var3 <= 0) {
            return 0.0F;
         } else {
            try {
               return Float.parseFloat(var2.substring(0, var3));
            } catch (NumberFormatException var5) {
               return 0.0F;
            }
         }
      } else {
         return 0.0F;
      }
   }

   private static String uUnuvNvvNU(String var0) {
      return var0 == null ? "" : var0.toLowerCase();
   }
}
