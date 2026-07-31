package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.MemoryUtil;

public final class O00000OOOO00O0 {
   private static final String O00000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String O000000000 = "assets/wild/shaders/advanced_neumorphism.frag";
   private static final String O0000000000 = "assets/wild/shaders/advanced_neumorphism_batch.vert";
   private static final String O00000000000 = "assets/wild/shaders/advanced_neumorphism_batch.frag";
   private static final int O000000000000 = 128;
   private static final int O0000000000000 = 7;
   private static final int O000000000000O = 3;
   private static final O0000O000OO O00000000000O = O0000O000OO.O00000000();
   private static Boolean O00000000000O0;
   private static Method O00000000000OO;
   private static Method O0000000000O;
   private static O0000O00OO0 O0000000000O0;
   private static O0000O00OO0 O0000000000O00;
   private static int O0000000000O0O;
   private static int O0000000000OO;
   private static int O0000000000OO0;
   private static int O0000000000OOO;
   private static final O00000OOOO00O0.W307[] O000000000O = O0000000000O00();
   private static final FloatBuffer O000000000O0 = MemoryUtil.memAllocFloat(3584);
   private static String O000000000O00 = "";

   private O00000OOOO00O0() {
   }

   public static void O00000000() {
      if (O0000000000OO0++ == 0) {
         O0000000000OOO = 0;
         RenderManager var0 = WildClient.O00000000();
         if (var0 != null) {
            try {
               var0.O0000000000();
            } catch (Throwable var2) {
            }
         }
      }
   }

   public static void O000000000() {
      if (O0000000000OOO > 0) {
         RenderManager var0 = WildClient.O00000000();
         if (var0 != null) {
            try {
               var0.O0000000000();
            } catch (Throwable var2) {
            }
         }

         O00000000000O0();
         O0000000000OOO = 0;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O0000000000() {
      if (O0000000000OO0 <= 0) {
         O0000000000OO0 = 0;
      } else {
         boolean var2 = false /* VF: Semaphore variable */;

         try {
            var2 = true;
            O000000000();
            var2 = false;
         } finally {
            if (var2) {
               O0000000000OO0--;
               if (O0000000000OO0 == 0) {
                  O0000000000OOO = 0;
               }
            }
         }

         O0000000000OO0--;
         if (O0000000000OO0 == 0) {
            O0000000000OOO = 0;
         }
      }
   }

   public static boolean O00000000(O00000OOOO00O o00000OOOO00O) {
      return O00000OOOO0O00.O00000000().O000000000000(o00000OOOO00O);
   }

   public static boolean O00000000(
      O00000OOOO00O o00000OOOO00O, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n
   ) {
      return !O00000000(o00000OOOO00O) ? false : O00000OOOO00OO.O00000000(o00000OOOO00O, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
   }

   public static String O000000000(O00000OOOO00O o00000OOOO00O) {
      return O00000OOOO0O0.O00000000().O000000000(o00000OOOO00O);
   }

   public static String O0000000000(O00000OOOO00O o00000OOOO00O) {
      return O00000OOOO0O0.O00000000().O00000000(o00000OOOO00O);
   }

   public static boolean O00000000(String string, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n) {
      return O00000OOOO0O00.O00000000().O000000000000(string)
         ? O00000OOOO00OO.O00000000(string, f, g, h, i, j, k, l, m, o0000O000O0OO, n)
         : O00000OOOO000O.O00000000().O00000000(string, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j) {
      return O00000000(matrixStack, f, g, h, i, j, 1.0F);
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, float k) {
      String var7 = HudModule.O0000000000O0();
      return O00000000(matrixStack, var7, f, g, h, i, j, k);
   }

   public static boolean O00000000(MatrixStack matrixStack, String string, float f, float g, float h, float i, float j) {
      return O00000000(matrixStack, string, f, g, h, i, j, 1.0F);
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, boolean bl) {
      return O00000000(matrixStack, f, g, h, i, j, bl, 1.0F);
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, boolean bl, float k) {
      return O00000000(matrixStack, f, g, h, i, j, bl, k, O0000000000O());
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, boolean bl, float k, O00000OOOO00O0.W309 o0000000000) {
      O00000OOOO00O0.W309 var9 = o0000000000 == null ? O0000000000O() : o0000000000;
      return O000000000(matrixStack, f, g, h, i, j, var9.distance(), var9.blur(), var9.intensity(), var9.shape(), bl, k);
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, float k, float l, float m, int n, boolean bl) {
      return O00000000(matrixStack, f, g, h, i, j, k, l, m, n, bl, 1.0F);
   }

   public static boolean O00000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, float k, float l, float m, int n, boolean bl, float o) {
      return O000000000(matrixStack, f, g, h, i, j, k, l, m, n, bl, o);
   }

   public static void O000000000(MatrixStack matrixStack, float f, float g, float h, float i, float j, float k, float l, float m, int n, boolean bl) {
      O000000000(matrixStack, f, g, h, i, j, k, l, m, n, bl, 1.0F);
   }

   private static boolean O000000000(
      MatrixStack matrixStack, float f, float g, float h, float i, float j, float k, float l, float m, int n, boolean bl, float o
   ) {
      MinecraftClient var12 = MinecraftClient.getInstance();
      if (var12 != null && var12.getWindow() != null && !(h <= 1.0F) && !(i <= 1.0F) && !(o <= 0.001F)) {
         int var13 = var12.getWindow().getFramebufferWidth();
         int var14 = var12.getWindow().getFramebufferHeight();
         if (var13 > 0 && var14 > 0) {
            RenderManager var15 = WildClient.O00000000();
            if (O0000000000OO0 <= 0 && var15 != null) {
               try {
                  var15.O0000000000();
               } catch (Throwable var32) {
               }
            }

            O00000OOOO00O0.W308 var16 = O00000000(var15, matrixStack, f, g, h, i);
            float var17 = var16.maxX - var16.minX;
            float var18 = var16.maxY - var16.minY;
            if (!(var17 <= 1.0F) && !(var18 <= 1.0F)) {
               O00000OOOO00O0.W309 var19 = new O00000OOOO00O0.W309(k, l, m, n);
               float var20 = Math.min(var17 / Math.max(h, 1.0F), var18 / Math.max(i, 1.0F));
               float var21 = Math.max(0.0F, j * var20);
               float var22 = Math.max(0.5F, var19.distance() * var20);
               float var23 = Math.max(1.0F, var19.blur() * var20);
               O00000OOOO00O0.W309 var24 = new O00000OOOO00O0.W309(var22, var23, var19.intensity(), var19.shape());
               float var25 = bl ? Math.max(2.0F, Math.min(18.0F, var22 + var23 * 0.32F)) : Math.max(6.0F, Math.min(96.0F, var22 + var23 * 1.35F));
               float var26 = var16.minX - var25;
               float var27 = var16.minY - var25;
               float var28 = var17 + var25 * 2.0F;
               float var29 = var18 + var25 * 2.0F;
               O0000O000OO.W350 var30 = O0000O000OO.O00000000(O00000000000());
               if (O0000000000OO0 <= 0) {
                  O0000O00OO0 var31 = O000000000000O();
                  return var31 == null
                     ? false
                     : O00000000(
                        var31, var26, var27, var28, var29, var16.minX, var16.minY, var17, var18, var21, var13, var14, var30, bl, Math.min(1.0F, o), var24
                     );
               } else if (O00000000000O() == null) {
                  return false;
               } else {
                  O00000000(var26, var27, var28, var29, var16.minX, var16.minY, var17, var18, var21, var13, var14, var30, bl, Math.min(1.0F, o), var24);
                  return true;
               }
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

   public static O00000OOOO00O0.W309 O00000000(float f, float g, float h, String string) {
      return new O00000OOOO00O0.W309(f, g, h, O00000000000(string));
   }

   public static boolean O00000000000() {
      return O00000000000O.O0000000000(O0000000000000());
   }

   public static int O00000000(float f) {
      return O00000000(O0000O000OO.O00000000(O00000000000()).baseColor(), f);
   }

   public static int O000000000(float f) {
      return O00000000(O00000000000() ? -14670285 : -591617, f);
   }

   public static int O0000000000(float f) {
      return O00000000(O00000000000() ? -10194811 : -5524281, f);
   }

   public static boolean O00000000(MatrixStack matrixStack, String string, float f, float g, float h, float i, float j, float k) {
      String var8 = string == null ? "" : string.trim();
      if (var8.isBlank()) {
         return false;
      } else {
         MinecraftClient var9 = MinecraftClient.getInstance();
         if (var9 != null && var9.getWindow() != null && !(h <= 1.0F) && !(i <= 1.0F) && !(k <= 0.001F)) {
            int var10 = var9.getWindow().getFramebufferWidth();
            int var11 = var9.getWindow().getFramebufferHeight();
            if (var10 > 0 && var11 > 0) {
               O00000OOOO00O var12 = O0000000000(var8);
               if (var12 != O00000OOOO00O.HUD) {
                  return false;
               } else {
                  O0000O00OO0 var13 = O00000OOOO0O.O00000000000(var8);
                  O00000OOO00OO0 var14 = O00000OOOO0O00.O00000000().O000000000(var8);
                  if (var13 != null && var14 != null) {
                     RenderManager var15 = WildClient.O00000000();
                     if (var15 != null) {
                        try {
                           var15.O0000000000();
                        } catch (Throwable var24) {
                        }
                     }

                     O00000OOOO00O0.W308 var16 = O00000000(var15, matrixStack, f, g, h, i);
                     float var17 = var16.maxX - var16.minX;
                     float var18 = var16.maxY - var16.minY;
                     if (!(var17 <= 1.0F) && !(var18 <= 1.0F)) {
                        float var19 = Math.min(var17 / Math.max(h, 1.0F), var18 / Math.max(i, 1.0F));
                        float var20 = Math.max(0.0F, j * var19);
                        float var21 = O00000OO000O.O00000000().O000000000000O();
                        float var22 = O00000OO000O.O00000000().O00000000000O();
                        ColorScheme var23 = O000000000000();
                        return O00000000(
                           var13,
                           var14,
                           O00000OOOO0O00.O00000000().O00000000000O0(var8),
                           var16.minX,
                           var16.minY,
                           var17,
                           var18,
                           var16.minX,
                           var16.minY,
                           var17,
                           var18,
                           var20,
                           var10,
                           var11,
                           var21,
                           var22,
                           var23,
                           Math.min(1.0F, k)
                        );
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static boolean O00000000(
      MatrixStack matrixStack,
      O00000OOOO00O o00000OOOO00O,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      int l,
      float m,
      float n,
      ColorScheme o0000O000O0OO,
      float o
   ) {
      if (o00000OOOO00O != null && o00000OOOO00O.O00000000000() == O00000OOOO00O.HUD && !(h <= 1.0F) && !(i <= 1.0F) && k > 0 && l > 0 && !(o <= 0.001F)) {
         RenderManager var13 = WildClient.O00000000();
         if (var13 != null) {
            try {
               var13.O0000000000();
            } catch (Throwable var25) {
            }
         }

         O00000OOOO00O0.W308 var14 = O00000000(var13, matrixStack, f, g, h, i);
         float var15 = var14.maxX - var14.minX;
         float var16 = var14.maxY - var14.minY;
         if (!(var15 <= 1.0F) && !(var16 <= 1.0F)) {
            float var17 = Math.min(var15 / Math.max(h, 1.0F), var16 / Math.max(i, 1.0F));
            float var18 = Math.max(0.0F, j * var17);
            float var19 = Math.max(12.0F, Math.min(64.0F, Math.min(var15, var16) * 0.38F));
            float var20 = var14.minX - var19;
            float var21 = var14.minY - var19;
            float var22 = var15 + var19 * 2.0F;
            float var23 = var16 + var19 * 2.0F;
            ColorScheme var24 = o0000O000O0OO == null ? O000000000000() : o0000O000O0OO;
            return O00000OOOO00OO.O00000000(
               o00000OOOO00O, var20, var21, var22, var23, var14.minX, var14.minY, var15, var16, var18, k, l, m, n, var24, Math.min(1.0F, o)
            );
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(String string, int i, float f, float g, float h, float j, int k, int l, float m, float n, ColorScheme o0000O000O0OO, float o) {
      return !O00000OOOO0O00.O00000000().O000000000000(string) ? false : O00000OOOO00OO.O00000000(string, i, f, g, h, j, k, l, m, n, o0000O000O0OO, o);
   }

   public static void O00000000(String string) {
      O00000OOOO000O.O00000000().O00000000(string);
   }

   private static ColorScheme O000000000000() {
      Theme var0 = O0000000000000();
      return ColorScheme.O00000000(var0, O00000000000O.O0000000000(var0));
   }

   private static Theme O0000000000000() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
   }

   private static boolean O000000000(String string) {
      return O0000000000(string) == O00000OOOO00O.HUD;
   }

   private static O00000OOOO00O O0000000000(String string) {
      O00000OOO0OO00 var1 = O00000OOOO0O00.O00000000().O0000000000(string);
      return var1 == null ? O00000OOOO00O.PREVIEW_ONLY : O00000OOOO00O.O00000000(var1.O000000000()).O00000000000();
   }

   private static synchronized O0000O00OO0 O000000000000O() {
      if (O0000000000O0 != null) {
         return O0000000000O0;
      } else {
         try {
            O0000000000O0 = O0000O00OO0.O00000000("assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/advanced_neumorphism.frag");
            O000000000O00 = "";
            return O0000000000O0;
         } catch (Throwable var1) {
            O000000000O00 = var1.getMessage() == null ? var1.getClass().getSimpleName() : var1.getMessage();
            O0000000000O0 = null;
            O00000000OO0OO.O00000000().O000000000("ThemeShaderApply.acquireNeumorphicProgram", var1);
            throw new IllegalStateException("unreachable shader failure", var1);
         }
      }
   }

   private static synchronized O0000O00OO0 O00000000000O() {
      if (O0000000000O00 != null) {
         return O0000000000O00;
      } else {
         try {
            O0000000000O00 = O0000O00OO0.O00000000("assets/wild/shaders/advanced_neumorphism_batch.vert", "assets/wild/shaders/advanced_neumorphism_batch.frag");
            int var0 = GL31.glGetUniformBlockIndex(O0000000000O00.O0000000000(), "NeumorphicPlateBlock");
            if (var0 >= 0) {
               GL31.glUniformBlockBinding(O0000000000O00.O0000000000(), var0, 3);
            }

            if (O0000000000O0O == 0) {
               O0000000000O0O = GL30.glGenVertexArrays();
            }

            if (O0000000000OO == 0) {
               O0000000000OO = GL15.glGenBuffers();
               GL15.glBindBuffer(35345, O0000000000OO);
               GL15.glBufferData(35345, O000000000O0.capacity() * 4L, 35040);
               GL15.glBindBuffer(35345, 0);
            }

            O000000000O00 = "";
            return O0000000000O00;
         } catch (Throwable var1) {
            O000000000O00 = var1.getMessage() == null ? var1.getClass().getSimpleName() : var1.getMessage();
            O0000000000O00 = null;
            O00000000OO0OO.O00000000().O000000000("ThemeShaderApply.acquireNeumorphicBatchProgram", var1);
            throw new IllegalStateException("unreachable shader failure", var1);
         }
      }
   }

   private static void O00000000(
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      int o,
      int p,
      O0000O000OO.W350 o00000000,
      boolean bl,
      float q,
      O00000OOOO00O0.W309 o0000000000
   ) {
      if (O0000000000OOO >= 128) {
         O000000000();
      }

      O00000OOOO00O0.W307 var15 = O000000000O[O0000000000OOO++];
      var15.O00000000(
         f,
         g,
         h,
         i,
         j,
         k,
         l,
         m,
         n,
         o0000000000.distance(),
         o0000000000.blur(),
         o0000000000.intensity(),
         o0000000000.shape(),
         bl ? 1 : 0,
         o,
         p,
         o00000000.baseColor(),
         o00000000.darkShadowColor(),
         o00000000.lightShadowColor(),
         q
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void O00000000000O0() {
      O0000O00OO0 var0 = O00000000000O();
      if (var0 != null && O0000000000OOO > 0) {
         int var1 = 0;
         int var2 = 0;

         for (int var3 = 0; var3 < O0000000000OOO; var3++) {
            var1 = Math.max(var1, O000000000O[var3].O0000000000OO);
            var2 = Math.max(var2, O000000000O[var3].O0000000000OO0);
         }

         if (var1 > 0 && var2 > 0) {
            O00000000000OO();
            O0000O00O0OOO0.W373 var11 = O0000O00O0OOO0.O00000000();
            boolean var8 = false /* VF: Semaphore variable */;

            label90: {
               try {
                  var8 = true;
                  GL11.glViewport(0, 0, var1, var2);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  var0.O00000000();
                  O00000000(var0, "uViewport", var1, var2);
                  O00000000(var0, "u_LightDirection", -1.0F, -1.0F);
                  GL15.glBindBuffer(35345, O0000000000OO);
                  GL15.glBufferSubData(35345, 0L, O000000000O0);
                  GL30.glBindBufferBase(35345, 3, O0000000000OO);
                  GL30.glBindVertexArray(O0000000000O0O);
                  GL31.glDrawArraysInstanced(4, 0, 6, O0000000000OOO);
                  GL30.glBindVertexArray(0);
                  GL30.glBindBufferBase(35345, 3, 0);
                  GL15.glBindBuffer(35345, 0);
                  var8 = false;
                  break label90;
               } catch (Throwable var9) {
                  O000000000O00 = var9.getMessage() == null ? var9.getClass().getSimpleName() : var9.getMessage();
                  O00000000OO0OO.O00000000().O000000000("ThemeShaderApply.drawNeumorphicBatch", var9);
                  var8 = false;
               } finally {
                  if (var8) {
                     GL20.glUseProgram(0);
                     O0000O00O0OOO0.O00000000(var11);
                     O0000000000O0();
                  }
               }

               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var11);
               O0000000000O0();
               return;
            }

            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var11);
            O0000000000O0();
         }
      }
   }

   private static void O00000000000OO() {
      O000000000O0.clear();
      short var0 = 128;
      byte var1 = 0;
      int var2 = var0 * 4;
      int var3 = var0 * 8;
      int var4 = var0 * 12;
      int var5 = var0 * 16;
      int var6 = var0 * 20;
      int var7 = var0 * 24;

      for (int var8 = 0; var8 < O0000000000OOO; var8++) {
         O00000OOOO00O0.W307 var9 = O000000000O[var8];
         O00000000(var1 + var8 * 4, var9.O00000000, var9.O000000000, var9.O0000000000, var9.O00000000000);
         O00000000(var2 + var8 * 4, var9.O000000000000, var9.O0000000000000, var9.O000000000000O, var9.O00000000000O);
         O00000000(var3 + var8 * 4, var9.O00000000000O0, var9.O00000000000OO, var9.O0000000000O, var9.O0000000000O0);
         O00000000(var4 + var8 * 4, O00000000(var9.O0000000000OOO), O000000000(var9.O0000000000OOO), O0000000000(var9.O0000000000OOO), var9.O000000000O00);
         O00000000(var5 + var8 * 4, O00000000(var9.O000000000O), O000000000(var9.O000000000O), O0000000000(var9.O000000000O), O00000000000(var9.O000000000O));
         O00000000(
            var6 + var8 * 4, O00000000(var9.O000000000O0), O000000000(var9.O000000000O0), O0000000000(var9.O000000000O0), O00000000000(var9.O000000000O0)
         );
         O00000000(var7 + var8 * 4, var9.O0000000000O00, var9.O0000000000O0O, 0.0F, 0.0F);
      }

      O000000000O0.position(0);
      O000000000O0.limit(O000000000O0.capacity());
   }

   private static void O00000000(int i, float f, float g, float h, float j) {
      O000000000O0.put(i, f);
      O000000000O0.put(i + 1, g);
      O000000000O0.put(i + 2, h);
      O000000000O0.put(i + 3, j);
   }

   private static boolean O00000000(
      O0000O00OO0 o0000O00OO0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      int o,
      int p,
      O0000O000OO.W350 o00000000,
      boolean bl,
      float q,
      O00000OOOO00O0.W309 o0000000000
   ) {
      O00000OOO var16 = O00000OOOO0O0.O00000000().O000000000();
      if (o0000O00OO0 != null && var16 != null && o00000000 != null) {
         O0000O00O0OOO0.W373 var17 = O0000O00O0OOO0.O00000000();

         boolean var18;
         try {
            GL11.glViewport(0, 0, o, p);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDepthMask(false);
            GlStateManager._enableBlend();
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL11.glDisable(36281);
            o0000O00OO0.O00000000();
            O00000000(o0000O00OO0, "uViewport", o, p);
            O00000000(o0000O00OO0, "uRect", f, g, h, i);
            O00000000(o0000O00OO0, "u_ElementRect", j, k, l, m);
            O00000000(o0000O00OO0, "u_Resolution", Math.max(1.0F, (float)o), Math.max(1.0F, (float)p));
            O00000000(o0000O00OO0, "u_Radius", Math.max(0.0F, n));
            O00000000(o0000O00OO0, "u_ElementRadius", Math.max(0.0F, n));
            O00000000(o0000O00OO0, "u_BaseColor", O00000000(o00000000.baseColor()), O000000000(o00000000.baseColor()), O0000000000(o00000000.baseColor()));
            O00000000(
               o0000O00OO0,
               "u_LightShadowColor",
               O00000000(o00000000.lightShadowColor()),
               O000000000(o00000000.lightShadowColor()),
               O0000000000(o00000000.lightShadowColor())
            );
            O00000000(
               o0000O00OO0,
               "u_DarkShadowColor",
               O00000000(o00000000.darkShadowColor()),
               O000000000(o00000000.darkShadowColor()),
               O0000000000(o00000000.darkShadowColor())
            );
            O00000000(o0000O00OO0, "u_LightShadowAlpha", O00000000000(o00000000.lightShadowColor()));
            O00000000(o0000O00OO0, "u_DarkShadowAlpha", O00000000000(o00000000.darkShadowColor()));
            O00000000(o0000O00OO0, "u_Alpha", q);
            O00000000(o0000O00OO0, "u_Inset", bl ? 1 : 0);
            O00000000(o0000O00OO0, "u_Distance", o0000000000.distance());
            O00000000(o0000O00OO0, "u_Blur", o0000000000.blur());
            O00000000(o0000O00OO0, "u_Intensity", o0000000000.intensity());
            O00000000(o0000O00OO0, "u_ShapeType", o0000000000.shape());
            O00000000(o0000O00OO0, "u_Shape", o0000000000.shape());
            O00000000(o0000O00OO0, "u_LightDirection", -1.0F, -1.0F);
            var16.O00000000();
            var18 = true;
         } catch (Throwable var22) {
            O000000000O00 = var22.getMessage() == null ? var22.getClass().getSimpleName() : var22.getMessage();
            O00000000OO0OO.O00000000().O000000000("ThemeShaderApply.drawNeumorphicProgram", var22);
            throw new IllegalStateException("unreachable shader failure", var22);
         } finally {
            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var17);
            O0000000000O0();
         }

         return var18;
      } else {
         return false;
      }
   }

   private static O00000OOOO00O0.W309 O0000000000O() {
      try {
         O00000OO000O.W221 var0 = O00000OO000O.O00000000().O00000000;
         return O00000000(
            var0.O00000000000.O0000000000(), var0.O000000000000.O0000000000(), var0.O0000000000000.O0000000000(), var0.O000000000000O.O0000000000()
         );
      } catch (Throwable var1) {
         return new O00000OOOO00O0.W309(5.5F, 18.0F, 0.72F, 1);
      }
   }

   private static int O00000000000(String string) {
      if ("Вогнутая".equals(string)) {
         return 2;
      } else {
         return "Выпуклая".equals(string) ? 1 : 0;
      }
   }

   private static boolean O00000000(
      O0000O00OO0 o0000O00OO0,
      O00000OOO00OO0 o00000OOO00OO0,
      Map<String, float[]> map,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      int o,
      int p,
      float q,
      float r,
      ColorScheme o0000O000O0OO,
      float s
   ) {
      O00000OOO var18 = O00000OOOO0O0.O00000000().O000000000();
      if (o0000O00OO0 != null && o00000OOO00OO0 != null && var18 != null) {
         O0000O00O0OOO0.W373 var19 = O0000O00O0OOO0.O00000000();

         boolean var24;
         try {
            GL11.glViewport(0, 0, o, p);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDepthMask(false);
            GlStateManager._enableBlend();
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL11.glDisable(36281);
            o0000O00OO0.O00000000();
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, O00000OOOO0O0.O00000000().O000000000000());
            O00000000(o0000O00OO0, "u_DiffuseMap", 0);
            O00000000(o0000O00OO0, "uViewport", o, p);
            O00000000(o0000O00OO0, "uRect", f, g, h, i);
            O00000000(o0000O00OO0, "u_ElementRect", j, k, l, m);
            O00000000(o0000O00OO0, "u_ElementRadius", Math.max(0.0F, n));
            O00000000(o0000O00OO0, "u_GlobalUV", j / Math.max(1.0F, (float)o), k / Math.max(1.0F, (float)p));
            O00000000(o0000O00OO0, "u_Resolution", Math.max(1.0F, (float)o), Math.max(1.0F, (float)p));
            O00000000(o0000O00OO0, "u_Time", O00000OOOO0O0.O00000000().O0000000000());
            O00000000(o0000O00OO0, "u_Mouse", q - j, r - k);
            int var20 = o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O0();
            int var21 = o0000O000O0OO == null ? -16777216 : o0000O000O0OO.O000000000O00();
            int var22 = o0000O000O0OO == null ? -15724520 : o0000O000O0OO.O0000000000000();
            int var23 = o0000O000O0OO == null ? -14671832 : o0000O000O0OO.O000000000000O();
            O00000000(o0000O00OO0, "u_AccentTop", O00000000(var20), O000000000(var20), O0000000000(var20));
            O00000000(o0000O00OO0, "u_AccentBottom", O00000000(var21), O000000000(var21), O0000000000(var21));
            O00000000(o0000O00OO0, "u_ThemeColors[0]", O00000000(var22), O000000000(var22), O0000000000(var22), O00000000000(var22));
            O00000000(o0000O00OO0, "u_ThemeColors[1]", O00000000(var23), O000000000(var23), O0000000000(var23), O00000000000(var23));
            O00000000(o0000O00OO0, "u_ThemeColors[2]", O00000000(var20), O000000000(var20), O0000000000(var20), s);
            O00000000(o0000O00OO0, "u_ThemeColors[3]", O00000000(var21), O000000000(var21), O0000000000(var21), s);
            O00000000(o0000O00OO0, "u_Alpha", s);
            O00000000(o0000O00OO0, o00000OOO00OO0, map);
            var18.O00000000();
            var24 = true;
         } catch (Throwable var28) {
            O00000000OO0OO.O00000000().O000000000("ThemeShaderApply.drawHudProgram", var28);
            throw new IllegalStateException("unreachable shader failure", var28);
         } finally {
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            O0000O00O0OOO0.O00000000(var19);
            O0000000000O0();
         }

         return var24;
      } else {
         return false;
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f) {
      int var3 = o0000O00OO0.O00000000(string);
      if (var3 >= 0) {
         GL20.glUniform1f(var3, f);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, int i) {
      int var3 = o0000O00OO0.O00000000(string);
      if (var3 >= 0) {
         GL20.glUniform1i(var3, i);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g) {
      int var4 = o0000O00OO0.O00000000(string);
      if (var4 >= 0) {
         GL20.glUniform2f(var4, f, g);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g, float h) {
      int var5 = o0000O00OO0.O00000000(string);
      if (var5 >= 0) {
         GL20.glUniform3f(var5, f, g, h);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g, float h, float i) {
      int var6 = o0000O00OO0.O00000000(string);
      if (var6 >= 0) {
         GL20.glUniform4f(var6, f, g, h, i);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, O00000OOO00OO0 o00000OOO00OO0, Map<String, float[]> map) {
      if (o0000O00OO0 != null && o00000OOO00OO0 != null && !o00000OOO00OO0.exposedUniforms().isEmpty()) {
         for (O00000OOO00OO var4 : o00000OOO00OO0.exposedUniforms()) {
            float[] var5 = map == null ? null : (float[])map.get(var4.uniformName());
            if (var5 == null || var5.length == 0) {
               var5 = var4.defaults();
            }

            if (var4.kind() == O00000OOO00OO.W302.FLOAT) {
               O00000000(o0000O00OO0, var4.uniformName(), var5[0]);
            } else {
               float var6 = var5.length > 0 ? var5[0] : 0.0F;
               float var7 = var5.length > 1 ? var5[1] : 0.0F;
               float var8 = var5.length > 2 ? var5[2] : 0.0F;
               float var9 = var5.length > 3 ? var5[3] : 1.0F;
               O00000000(o0000O00OO0, var4.uniformName(), var6, var7, var8, var9);
            }
         }
      }
   }

   private static void O0000000000O0() {
      GL20.glUseProgram(0);
      if (!Boolean.FALSE.equals(O00000000000O0)) {
         try {
            if (O00000000000O0 == null) {
               Class var0 = Class.forName("com.mojang.blaze3d.systems.RenderSystem");
               Class var1 = Class.forName("net.minecraft.client.render.GameRenderer");
               O00000000000OO = var0.getMethod("setShader", Supplier.class);
               O0000000000O = var1.getMethod("getPositionColorProgram");
               O00000000000O0 = true;
            }

            Supplier var3 = () -> {
               try {
                  return O0000000000O.invoke(null);
               } catch (Throwable var1x) {
                  return null;
               }
            };
            O00000000000OO.invoke(null, var3);
         } catch (Throwable var2) {
            O00000000000O0 = false;
         }
      }
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

   private static int O00000000(int i, float f) {
      int var2 = Math.max(0, Math.min(255, Math.round(f * 255.0F)));
      return i & 16777215 | var2 << 24;
   }

   private static O00000OOOO00O0.W308 O00000000(RenderManager o0000O00OO0O0, MatrixStack matrixStack, float f, float g, float h, float i) {
      float[] var6 = o0000O00OO0O0 == null ? null : o0000O00OO0O0.O0000000000O().O000000000000();
      Matrix4f var7 = matrixStack == null ? null : new Matrix4f(matrixStack.peek().getPositionMatrix());
      float var10 = f + h;
      float var11 = g + i;
      O00000OOOO00O0.W310 var12 = O00000000(var6, var7, f, g);
      O00000OOOO00O0.W310 var13 = O00000000(var6, var7, var10, g);
      O00000OOOO00O0.W310 var14 = O00000000(var6, var7, var10, var11);
      O00000OOOO00O0.W310 var15 = O00000000(var6, var7, f, var11);
      float var16 = Math.min(Math.min(var12.x, var13.x), Math.min(var14.x, var15.x));
      float var17 = Math.min(Math.min(var12.y, var13.y), Math.min(var14.y, var15.y));
      float var18 = Math.max(Math.max(var12.x, var13.x), Math.max(var14.x, var15.x));
      float var19 = Math.max(Math.max(var12.y, var13.y), Math.max(var14.y, var15.y));
      return new O00000OOOO00O0.W308(var16, var17, var18, var19);
   }

   private static O00000OOOO00O0.W310 O00000000(float[] fs, Matrix4f matrix4f, float f, float g) {
      float var4 = fs != null && fs.length >= 6 ? fs[0] * f + fs[1] * g + fs[2] : f;
      float var5 = fs != null && fs.length >= 6 ? fs[3] * f + fs[4] * g + fs[5] : g;
      if (matrix4f != null) {
         Vector4f var6 = matrix4f.transform(new Vector4f(var4, var5, 0.0F, 1.0F));
         float var7 = Math.abs(var6.w) <= 1.0E-6F ? 1.0F : 1.0F / var6.w;
         var4 = var6.x * var7;
         var5 = var6.y * var7;
      }

      return new O00000OOOO00O0.W310(var4, var5);
   }

   static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static O00000OOOO00O0.W307[] O0000000000O00() {
      O00000OOOO00O0.W307[] var0 = new O00000OOOO00O0.W307[128];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = new O00000OOOO00O0.W307();
      }

      return var0;
   }

   static final class W307 {
      float O00000000;
      float O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      float O0000000000O;
      float O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      int O0000000000OO;
      int O0000000000OO0;
      int O0000000000OOO;
      int O000000000O;
      int O000000000O0;
      float O000000000O00;

      void O00000000(
         float f,
         float g,
         float h,
         float i,
         float j,
         float k,
         float l,
         float m,
         float n,
         float o,
         float p,
         float q,
         int r,
         int s,
         int t,
         int u,
         int v,
         int w,
         int x,
         float y
      ) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
         this.O000000000000 = j;
         this.O0000000000000 = k;
         this.O000000000000O = l;
         this.O00000000000O = m;
         this.O00000000000O0 = n;
         this.O00000000000OO = o;
         this.O0000000000O = p;
         this.O0000000000O0 = q;
         this.O0000000000O00 = r;
         this.O0000000000O0O = s;
         this.O0000000000OO = t;
         this.O0000000000OO0 = u;
         this.O0000000000OOO = v;
         this.O000000000O = w;
         this.O000000000O0 = x;
         this.O000000000O00 = y;
      }
   }

   record W308(float minX, float minY, float maxX, float maxY) {
   }

   public record W309(float distance, float blur, float intensity, int shape) {
      public W309(float distance, float blur, float intensity, int shape) {
         distance = O00000OOOO00O0.O00000000(distance, 1.0F, 36.0F);
         blur = O00000OOOO00O0.O00000000(blur, 2.0F, 96.0F);
         intensity = O00000OOOO00O0.O00000000(intensity, 0.0F, 1.4F);
         shape = Math.max(0, Math.min(2, shape));
         this.distance = distance;
         this.blur = blur;
         this.intensity = intensity;
         this.shape = shape;
      }
   }

   record W310(float x, float y) {
   }
}
