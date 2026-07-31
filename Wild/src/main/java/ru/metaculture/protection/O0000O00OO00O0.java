package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class O0000O00OO00O0 {
   private static volatile int O00000000 = -1;
   private static volatile Boolean O000000000;

   private O0000O00OO00O0() {
   }

   public static void O00000000(int i) {
      if (i <= 0) {
         O00000000 = -1;
      } else {
         O00000000 = O000000000(i) ? i : -1;
      }
   }

   public static boolean O000000000(int i) {
      if (i <= 0) {
         return false;
      } else {
         try {
            return GL30.glIsFramebuffer(i);
         } catch (Throwable var2) {
            return false;
         }
      }
   }

   public static boolean O00000000() {
      Boolean var0 = O00000000(System.getProperty("wild.render.weakGl"));
      if (var0 != null) {
         return var0;
      } else if (O000000000 != null) {
         return O000000000;
      } else {
         synchronized (O0000O00OO00O0.class) {
            if (O000000000 != null) {
               return O000000000;
            } else {
               O000000000 = O000000000();
               return O000000000;
            }
         }
      }
   }

   public static void O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         Window var1 = minecraftClient.getWindow();
         int var2 = var1.getFramebufferWidth();
         int var3 = var1.getFramebufferHeight();
         if (var2 > 0 && var3 > 0) {
            int var4 = O00000000;
            if (var4 > 0 && !O000000000(var4)) {
               O00000000 = -1;
               var4 = -1;
            }

            if (var4 <= 0) {
               var4 = GL11.glGetInteger(36006);
            }

            if (var4 > 0 && !O000000000(var4)) {
               O00000000 = -1;
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

   private static Boolean O00000000(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = string.trim().toLowerCase();

         return switch (var1) {
            case "true", "1", "yes", "on" -> true;
            case "false", "0", "no", "off" -> false;
            default -> null;
         };
      } else {
         return null;
      }
   }

   private static boolean O000000000() {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         return false;
      } else {
         try {
            String var0 = O0000000000(GL11.glGetString(7936));
            String var1 = O0000000000(GL11.glGetString(7937));
            String var2 = GL11.glGetString(7938);
            float var3 = O000000000(var2);
            return !var0.contains("intel") && !var1.contains("intel") && !var1.contains("hd graphics") ? var3 > 0.0F && var3 < 4.0F : true;
         } catch (Throwable var4) {
            return false;
         }
      }
   }

   private static float O000000000(String string) {
      if (string != null && !string.isBlank()) {
         int var1 = string.indexOf(32);
         String var2 = var1 >= 0 ? string.substring(0, var1) : string;
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

   private static String O0000000000(String string) {
      return string == null ? "" : string.toLowerCase();
   }
}
