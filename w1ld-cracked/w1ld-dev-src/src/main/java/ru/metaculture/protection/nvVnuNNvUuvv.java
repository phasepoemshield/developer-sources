package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class nvVnuNNvUuvv {
   private static final String UuUVuuUu = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String C00OOC00oO = "assets/wild/shaders/colorplus/sb_spectrum.frag";
   private static final String uUnuvNvvNU = "assets/wild/shaders/colorplus/hue_strip.frag";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/colorplus/cp_preview.frag";
   private static uUvVUVnVNV uNNnnnuuuN;
   private static nnUnNnuvvN nuUnNvnuUu;
   private static uUvVUVnVNV.NVnVnNnN VVuuUN;
   private static uUvVUVnVNV.NVnVnNnN vNUvnnVnUvu;
   private static uUvVUVnVNV.NVnVnNnN uVUuuVnNVU;
   private static boolean vuuuNvNuv;

   private nvVnuNNvUuvv() {
   }

   public static synchronized uUvVUVnVNV.NVnVnNnN UuUVuuUu() {
      if (vuuuNvNuv) {
         return null;
      } else {
         nuUnNvnuUu();
         return VVuuUN;
      }
   }

   public static synchronized uUvVUVnVNV.NVnVnNnN C00OOC00oO() {
      if (vuuuNvNuv) {
         return null;
      } else {
         nuUnNvnuUu();
         return vNUvnnVnUvu;
      }
   }

   public static synchronized uUvVUVnVNV.NVnVnNnN uUnuvNvvNU() {
      if (vuuuNvNuv) {
         return null;
      } else {
         nuUnNvnuUu();
         return uVUuuVnNVU;
      }
   }

   public static synchronized nnUnNnuvvN vVvUvVVuuNvV() {
      if (vuuuNvNuv) {
         return null;
      } else {
         nuUnNvnuUu();
         return nuUnNvnuUu;
      }
   }

   public static synchronized boolean UuUVuuUu(
      float var0, float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, boolean var12
   ) {
      if (!vuuuNvNuv && !(var2 <= 1.0F) && !(var3 <= 1.0F) && !(var11 <= 0.001F) && VVuuUN()) {
         nuUnNvnuUu();
         if (!vuuuNvNuv && uVUuuVnNVU != null && nuUnNvnuUu != null) {
            class_310 var13 = class_310.method_1551();
            if (var13 != null && var13.method_22683() != null) {
               int var14 = Math.max(1, var13.method_22683().method_4489());
               int var15 = Math.max(1, var13.method_22683().method_4506());
               VvuuVNVUn.NVnVnNnN var16 = VvuuVNVUn.UuUVuuUu();

               boolean var18;
               try {
                  GL11.glViewport(0, 0, var14, var15);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GL11.glColorMask(true, true, true, true);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  uVUuuVnNVU.UuUVuuUu();
                  uVUuuVnNVU.UuUVuuUu("uViewport", var14, var15);
                  uVUuuVnNVU.UuUVuuUu("uRect", var0, var1, var2, var3);
                  uVUuuVnNVU.UuUVuuUu("u_ElementRect", var0, var1, var2, var3);
                  uVUuuVnNVU.UuUVuuUu("uRectSize", var2, var3);
                  uVUuuVnNVU.UuUVuuUu("uCornerRadius", Math.max(0.0F, var10));
                  uVUuuVnNVU.UuUVuuUu("uCurrentColor", UuUVuuUu(var4), C00OOC00oO(var4), uUnuvNvvNU(var4), vVvUvVVuuNvV(var4));
                  uVUuuVnNVU.UuUVuuUu("uInitialColor", UuUVuuUu(var5), C00OOC00oO(var5), uUnuvNvvNU(var5), vVvUvVVuuNvV(var5));
                  uVUuuVnNVU.UuUVuuUu("uAccentTop", UuUVuuUu(var6), C00OOC00oO(var6), uUnuvNvvNU(var6));
                  uVUuuVnNVU.UuUVuuUu("uAccentBottom", UuUVuuUu(var7), C00OOC00oO(var7), uUnuvNvvNU(var7));
                  uVUuuVnNVU.UuUVuuUu("uMouse", var8 - var0, var9 - var1);
                  uVUuuVnNVU.UuUVuuUu("uTime", (float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
                  uVUuuVnNVU.UuUVuuUu("uAlpha", Math.max(0.0F, Math.min(1.0F, var11)));
                  uVUuuVnNVU.UuUVuuUu("uLive", var12 ? 1.0F : 0.0F);
                  nuUnNvnuUu.UuUVuuUu();
                  return true;
               } catch (Throwable var22) {
                  uNNnnnuuuN();
                  vuuuNvNuv = true;
                  var18 = false;
               } finally {
                  GL20.glUseProgram(0);
                  VvuuVNVUn.uUnuvNvvNU(var16);
               }

               return var18;
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

   private static void nuUnNvnuUu() {
      if (VVuuUN == null || vNUvnnVnUvu == null || uVUuuVnNVU == null || nuUnNvnuUu == null) {
         try {
            if (uNNnnnuuuN == null) {
               uNNnnnuuuN = new uUvVUVnVNV();
            }

            if (nuUnNvnuUu == null) {
               nuUnNvnuUu = new nnUnNnuvvN();
            }

            if (VVuuUN == null) {
               VVuuUN = uNNnnnuuuN.UuUVuuUu("cp_sb", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/sb_spectrum.frag");
            }

            if (vNUvnnVnUvu == null) {
               vNUvnnVnUvu = uNNnnnuuuN.UuUVuuUu("cp_hue", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/hue_strip.frag");
            }

            if (uVUuuVnNVU == null) {
               uVUuuVnNVU = uNNnnnuuuN.UuUVuuUu("cp_preview", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_preview.frag");
            }
         } catch (Throwable var1) {
            uNNnnnuuuN();
            vuuuNvNuv = true;
         }
      }
   }

   public static synchronized void uNNnnnuuuN() {
      try {
         if (nuUnNvnuUu != null) {
            try {
               nuUnNvnuUu.close();
            } catch (Throwable var2) {
            }

            nuUnNvnuUu = null;
         }

         if (uNNnnnuuuN != null) {
            try {
               uNNnnnuuuN.close();
            } catch (Throwable var1) {
            }

            uNNnnnuuuN = null;
         }

         VVuuUN = null;
         vNUvnnVnUvu = null;
         uVUuuVnNVU = null;
         vuuuNvNuv = false;
      } catch (Throwable var3) {
      }
   }

   private static boolean VVuuUN() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static float UuUVuuUu(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static float vVvUvVVuuNvV(int var0) {
      return (var0 >>> 24 & 0xFF) / 255.0F;
   }
}
