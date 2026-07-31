package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class O00000OO0O0O0O {
   private static final String O00000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String O000000000 = "assets/wild/shaders/colorplus/sb_spectrum.frag";
   private static final String O0000000000 = "assets/wild/shaders/colorplus/hue_strip.frag";
   private static final String O00000000000 = "assets/wild/shaders/colorplus/cp_preview.frag";
   private static O00000OOO000 O000000000000;
   private static O00000OOO O0000000000000;
   private static O00000OOO000.W289 O000000000000O;
   private static O00000OOO000.W289 O00000000000O;
   private static O00000OOO000.W289 O00000000000O0;
   private static boolean O00000000000OO;

   private O00000OO0O0O0O() {
   }

   public static synchronized O00000OOO000.W289 O00000000() {
      if (O00000000000OO) {
         return null;
      } else {
         O0000000000000();
         return O000000000000O;
      }
   }

   public static synchronized O00000OOO000.W289 O000000000() {
      if (O00000000000OO) {
         return null;
      } else {
         O0000000000000();
         return O00000000000O;
      }
   }

   public static synchronized O00000OOO000.W289 O0000000000() {
      if (O00000000000OO) {
         return null;
      } else {
         O0000000000000();
         return O00000000000O0;
      }
   }

   public static synchronized O00000OOO O00000000000() {
      if (O00000000000OO) {
         return null;
      } else {
         O0000000000000();
         return O0000000000000;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static synchronized boolean O00000000(float f, float g, float h, float i, int j, int k, int l, int m, float n, float o, float p, float q, boolean bl) {
      if (!O00000000000OO && !(h <= 1.0F) && !(i <= 1.0F) && !(q <= 0.001F) && O000000000000O()) {
         O0000000000000();
         if (!O00000000000OO && O00000000000O0 != null && O0000000000000 != null) {
            MinecraftClient var13 = MinecraftClient.getInstance();
            if (var13 != null && var13.getWindow() != null) {
               int var14 = Math.max(1, var13.getWindow().getFramebufferWidth());
               int var15 = Math.max(1, var13.getWindow().getFramebufferHeight());
               O0000O00O0OOO0.W373 var16 = O0000O00O0OOO0.O00000000();
               boolean var22 = false /* VF: Semaphore variable */;

               boolean var17;
               label63: {
                  boolean var18;
                  try {
                     var22 = true;
                     GL11.glViewport(0, 0, var14, var15);
                     GL11.glDisable(2929);
                     GL11.glDisable(2884);
                     GL11.glDepthMask(false);
                     GL11.glColorMask(true, true, true, true);
                     GlStateManager._enableBlend();
                     GL11.glEnable(3042);
                     GL14.glBlendFuncSeparate(770, 771, 1, 771);
                     GL11.glDisable(36281);
                     O00000000000O0.O00000000();
                     O00000000000O0.O00000000("uViewport", var14, var15);
                     O00000000000O0.O00000000("uRect", f, g, h, i);
                     O00000000000O0.O00000000("u_ElementRect", f, g, h, i);
                     O00000000000O0.O00000000("uRectSize", h, i);
                     O00000000000O0.O00000000("uCornerRadius", Math.max(0.0F, p));
                     O00000000000O0.O00000000("uCurrentColor", O00000000(j), O000000000(j), O0000000000(j), O00000000000(j));
                     O00000000000O0.O00000000("uInitialColor", O00000000(k), O000000000(k), O0000000000(k), O00000000000(k));
                     O00000000000O0.O00000000("uAccentTop", O00000000(l), O000000000(l), O0000000000(l));
                     O00000000000O0.O00000000("uAccentBottom", O00000000(m), O000000000(m), O0000000000(m));
                     O00000000000O0.O00000000("uMouse", n - f, o - g);
                     O00000000000O0.O00000000("uTime", (float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
                     O00000000000O0.O00000000("uAlpha", Math.max(0.0F, Math.min(1.0F, q)));
                     O00000000000O0.O00000000("uLive", bl ? 1.0F : 0.0F);
                     O0000000000000.O00000000();
                     var17 = true;
                     var22 = false;
                     break label63;
                  } catch (Throwable var23) {
                     O000000000000();
                     O00000000000OO = true;
                     var18 = false;
                     var22 = false;
                  } finally {
                     if (var22) {
                        GL20.glUseProgram(0);
                        O0000O00O0OOO0.O00000000(var16);
                     }
                  }

                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var16);
                  return var18;
               }

               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var16);
               return var17;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static void O0000000000000() {
      if (O000000000000O == null || O00000000000O == null || O00000000000O0 == null || O0000000000000 == null) {
         try {
            if (O000000000000 == null) {
               O000000000000 = new O00000OOO000();
            }

            if (O0000000000000 == null) {
               O0000000000000 = new O00000OOO();
            }

            if (O000000000000O == null) {
               O000000000000O = O000000000000.O00000000(
                  "cp_sb", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/sb_spectrum.frag"
               );
            }

            if (O00000000000O == null) {
               O00000000000O = O000000000000.O00000000("cp_hue", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/hue_strip.frag");
            }

            if (O00000000000O0 == null) {
               O00000000000O0 = O000000000000.O00000000(
                  "cp_preview", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_preview.frag"
               );
            }
         } catch (Throwable var1) {
            O000000000000();
            O00000000000OO = true;
         }
      }
   }

   public static synchronized void O000000000000() {
      try {
         if (O0000000000000 != null) {
            try {
               O0000000000000.close();
            } catch (Throwable var2) {
            }

            O0000000000000 = null;
         }

         if (O000000000000 != null) {
            try {
               O000000000000.close();
            } catch (Throwable var1) {
            }

            O000000000000 = null;
         }

         O000000000000O = null;
         O00000000000O = null;
         O00000000000O0 = null;
         O00000000000OO = false;
      } catch (Throwable var3) {
      }
   }

   private static boolean O000000000000O() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static float O00000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private static float O00000000000(int i) {
      return (i >>> 24 & 0xFF) / 255.0F;
   }
}
