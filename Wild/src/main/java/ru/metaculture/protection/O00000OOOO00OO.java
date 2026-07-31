package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class O00000OOOO00OO {
   private O00000OOOO00OO() {
   }

   public static boolean O00000000(
      O00000OOOO00O o00000OOOO00O, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n
   ) {
      if (o00000OOOO00O != null && !(h <= 1.0F) && !(i <= 1.0F) && j > 0 && k > 0 && !(n <= 0.001F)) {
         O00000OOO00OO0 var11 = O00000OOOO0O00.O00000000().O000000000(o00000OOOO00O);
         if (var11 == null) {
            return false;
         } else {
            O0000O00OO0 var12 = O00000OOOO0O0.O00000000().O00000000(o00000OOOO00O, var11);
            return O00000000(
               var12,
               var11,
               O00000OOOO0O00.O00000000().O00000000000O(o00000OOOO00O),
               f,
               g,
               h,
               i,
               f,
               g,
               h,
               i,
               0.0F,
               j,
               k,
               l,
               m,
               o0000O000O0OO,
               n,
               O00000OOOO0O0.O00000000().O000000000000()
            );
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(String string, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n) {
      if (string != null && !(h <= 1.0F) && !(i <= 1.0F) && j > 0 && k > 0 && !(n <= 0.001F)) {
         O00000OOO00OO0 var11 = O00000OOOO0O00.O00000000().O000000000(string);
         if (var11 == null) {
            return false;
         } else {
            O0000O00OO0 var12 = O00000OOOO0O0.O00000000().O00000000(string, var11);
            return O00000000(
               var12,
               var11,
               O00000OOOO0O00.O00000000().O00000000000O0(string),
               f,
               g,
               h,
               i,
               f,
               g,
               h,
               i,
               0.0F,
               j,
               k,
               l,
               m,
               o0000O000O0OO,
               n,
               O00000OOOO0O0.O00000000().O000000000000()
            );
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(String string, int i, float f, float g, float h, float j, int k, int l, float m, float n, ColorScheme o0000O000O0OO, float o) {
      if (string != null && !(h <= 1.0F) && !(j <= 1.0F) && k > 0 && l > 0 && !(o <= 0.001F)) {
         O00000OOO00OO0 var12 = O00000OOOO0O00.O00000000().O000000000(string);
         if (var12 == null) {
            return false;
         } else {
            O0000O00OO0 var13 = O00000OOOO0O0.O00000000().O00000000(string, var12);
            int var14 = i > 0 ? i : O00000OOOO0O0.O00000000().O000000000000();
            return O00000000(var13, var12, O00000OOOO0O00.O00000000().O00000000000O0(string), f, g, h, j, f, g, h, j, 0.0F, k, l, m, n, o0000O000O0OO, o, var14);
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(
      O00000OOOO00O o00000OOOO00O, int i, float f, float g, float h, float j, int k, int l, float m, float n, ColorScheme o0000O000O0OO, float o
   ) {
      if (o00000OOOO00O != null && !(h <= 1.0F) && !(j <= 1.0F) && k > 0 && l > 0 && !(o <= 0.001F)) {
         O00000OOO00OO0 var12 = O00000OOOO0O00.O00000000().O000000000(o00000OOOO00O);
         if (var12 == null) {
            return false;
         } else {
            O0000O00OO0 var13 = O00000OOOO0O0.O00000000().O00000000(o00000OOOO00O, var12);
            int var14 = i > 0 ? i : O00000OOOO0O0.O00000000().O000000000000();
            return O00000000(
               var13, var12, O00000OOOO0O00.O00000000().O00000000000O(o00000OOOO00O), f, g, h, j, f, g, h, j, 0.0F, k, l, m, n, o0000O000O0OO, o, var14
            );
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(
      String string,
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
      if (string != null && !(h <= 1.0F) && !(i <= 1.0F) && !(l <= 1.0F) && !(m <= 1.0F) && o > 0 && p > 0 && !(s <= 0.001F)) {
         O00000OOO00OO0 var16 = O00000OOOO0O00.O00000000().O000000000(string);
         if (var16 == null) {
            return false;
         } else {
            O0000O00OO0 var17 = O00000OOOO0O0.O00000000().O00000000(string, var16);
            return O00000000(
               var17,
               var16,
               O00000OOOO0O00.O00000000().O00000000000O0(string),
               f,
               g,
               h,
               i,
               j,
               k,
               l,
               m,
               n,
               o,
               p,
               q,
               r,
               o0000O000O0OO,
               s,
               O00000OOOO0O0.O00000000().O000000000000()
            );
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(
      O00000OOOO00O o00000OOOO00O,
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
      if (o00000OOOO00O != null && !(h <= 1.0F) && !(i <= 1.0F) && !(l <= 1.0F) && !(m <= 1.0F) && o > 0 && p > 0 && !(s <= 0.001F)) {
         O00000OOO00OO0 var16 = O00000OOOO0O00.O00000000().O000000000(o00000OOOO00O);
         if (var16 == null) {
            return false;
         } else {
            O0000O00OO0 var17 = O00000OOOO0O0.O00000000().O00000000(o00000OOOO00O, var16);
            return O00000000(
               var17,
               var16,
               O00000OOOO0O00.O00000000().O00000000000O(o00000OOOO00O),
               f,
               g,
               h,
               i,
               j,
               k,
               l,
               m,
               n,
               o,
               p,
               q,
               r,
               o0000O000O0OO,
               s,
               O00000OOOO0O0.O00000000().O000000000000()
            );
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(
      String string,
      O00000OOO00OO0 o00000OOO00OO0,
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
      if (string != null
         && !string.isBlank()
         && o00000OOO00OO0 != null
         && !(h <= 1.0F)
         && !(i <= 1.0F)
         && !(l <= 1.0F)
         && !(m <= 1.0F)
         && o > 0
         && p > 0
         && !(s <= 0.001F)) {
         O0000O00OO0 var17 = O00000OOOO0O0.O00000000().O00000000(string, o00000OOO00OO0);
         return O00000000(var17, o00000OOO00OO0, Map.of(), f, g, h, i, j, k, l, m, n, o, p, q, r, o0000O000O0OO, s, O00000OOOO0O0.O00000000().O000000000000());
      } else {
         return false;
      }
   }

   public static boolean O00000000(
      String string, O00000OOO00OO0 o00000OOO00OO0, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n
   ) {
      if (string != null && !string.isBlank() && o00000OOO00OO0 != null && !(h <= 1.0F) && !(i <= 1.0F) && j > 0 && k > 0 && !(n <= 0.001F)) {
         O0000O00OO0 var12 = O00000OOOO0O0.O00000000().O00000000(string, o00000OOO00OO0);
         return O00000000(
            var12, o00000OOO00OO0, Map.of(), f, g, h, i, f, g, h, i, 0.0F, j, k, l, m, o0000O000O0OO, n, O00000OOOO0O0.O00000000().O000000000000()
         );
      } else {
         return false;
      }
   }

   public static boolean O00000000(
      String string,
      O00000OOO00OO0 o00000OOO00OO0,
      int i,
      float f,
      float g,
      float h,
      float j,
      int k,
      int l,
      float m,
      float n,
      ColorScheme o0000O000O0OO,
      float o
   ) {
      if (string != null && !string.isBlank() && o00000OOO00OO0 != null && !(h <= 1.0F) && !(j <= 1.0F) && k > 0 && l > 0 && !(o <= 0.001F)) {
         O0000O00OO0 var13 = O00000OOOO0O0.O00000000().O00000000(string, o00000OOO00OO0);
         int var14 = i > 0 ? i : O00000OOOO0O0.O00000000().O000000000000();
         return O00000000(var13, o00000OOO00OO0, Map.of(), f, g, h, j, f, g, h, j, 0.0F, k, l, m, n, o0000O000O0OO, o, var14);
      } else {
         return false;
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
      float s,
      int t
   ) {
      if (o0000O00OO0 == null) {
         return false;
      } else {
         O00000OOO var19 = O00000OOOO0O0.O00000000().O000000000();
         if (var19 == null) {
            return false;
         } else {
            int var20 = O00000000OO0.O00000000();
            int var21 = O00000000OO0.O000000000();
            int var22 = O00000000OO0.O0000000000();
            O00000000OO0OO.O00000000().O00000000000O0();
            O0000O00O0OOO0.W373 var23 = O0000O00O0OOO0.O00000000();

            boolean var28;
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
               GL11.glBindTexture(3553, t);
               O00000000(o0000O00OO0, "u_DiffuseMap", 0);
               O00000000(o0000O00OO0, "uViewport", o, p);
               O00000000(o0000O00OO0, "uRect", f, g, h, i);
               O00000000(o0000O00OO0, "u_ElementRect", j, k, l, m);
               O00000000(o0000O00OO0, "u_ElementRadius", Math.max(0.0F, n));
               O00000000(o0000O00OO0, "u_Time", O00000OOOO0O0.O00000000().O0000000000());
               O00000000(o0000O00OO0, "u_Resolution", Math.max(1.0F, (float)o), Math.max(1.0F, (float)p));
               O00000000(o0000O00OO0, "u_GlobalUV", j / Math.max(1.0F, (float)o), k / Math.max(1.0F, (float)p));
               O00000000(o0000O00OO0, "u_Mouse", q - j, r - k);
               int var24 = o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O0();
               int var25 = o0000O000O0OO == null ? -16777216 : o0000O000O0OO.O000000000O00();
               int var26 = o0000O000O0OO == null ? -15724520 : o0000O000O0OO.O0000000000000();
               int var27 = o0000O000O0OO == null ? -14671832 : o0000O000O0OO.O000000000000O();
               O00000000(o0000O00OO0, "u_AccentTop", O00000000(var24), O000000000(var24), O0000000000(var24));
               O00000000(o0000O00OO0, "u_AccentBottom", O00000000(var25), O000000000(var25), O0000000000(var25));
               O00000000(o0000O00OO0, "u_ThemeColors[0]", O00000000(var26), O000000000(var26), O0000000000(var26), O00000000000(var26));
               O00000000(o0000O00OO0, "u_ThemeColors[1]", O00000000(var27), O000000000(var27), O0000000000(var27), O00000000000(var27));
               O00000000(o0000O00OO0, "u_ThemeColors[2]", O00000000(var24), O000000000(var24), O0000000000(var24), s);
               O00000000(o0000O00OO0, "u_ThemeColors[3]", O00000000(var25), O000000000(var25), O0000000000(var25), s);
               O00000000(o0000O00OO0, "u_Alpha", s);
               O00000000(o0000O00OO0, o00000OOO00OO0, map);
               var19.O00000000();
               var28 = true;
            } catch (Throwable var45) {
               O00000000OO0OO.O00000000().O000000000("ThemeShaderDispatcher.drawProgram", var45);
               throw new IllegalStateException("unreachable shader failure", var45);
            } finally {
               try {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var23);
               } finally {
                  O00000000OO0OO.O00000000().O00000000(var20, var21, var22);
               }
            }

            return var28;
         }
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
