package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class O00000OOOO000O {
   private static final O00000OOOO000O O00000000 = new O00000OOOO000O();
   private final Map<String, O00000OOOO000O.W306> O000000000 = new HashMap<>();
   private ShaderSourceBuilder O0000000000;
   private O00000OOO0OOO O00000000000;

   private O00000OOOO000O() {
   }

   public static O00000OOOO000O O00000000() {
      return O00000000;
   }

   public synchronized void O00000000(ShaderSourceBuilder o00000OOO00OOO, O00000OOO0OOO o00000OOO0OOO) {
      this.O0000000000 = o00000OOO00OOO;
      this.O00000000000 = o00000OOO0OOO;
   }

   public synchronized boolean O00000000(String string, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n) {
      return this.O00000000(string, null, f, g, h, i, f, g, h, i, 0.0F, j, k, l, m, o0000O000O0OO, n);
   }

   public synchronized boolean O00000000(
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
      return this.O00000000(string, O00000OOOO00O.HUD, f, g, h, i, j, k, l, m, n, o, p, q, r, o0000O000O0OO, s);
   }

   private boolean O00000000(
      String string,
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
      if (string == null || string.isBlank() || this.O0000000000 == null || this.O00000000000 == null) {
         return false;
      } else if (!(h <= 1.0F) && !(i <= 1.0F) && !(l <= 1.0F) && !(m <= 1.0F) && !(s <= 0.001F)) {
         O00000OOOO000O.W306 var18 = this.O00000000(string, o00000OOOO00O);
         if (var18 != null && var18.O0000000000 != null) {
            O00000OOO var19 = O00000OOOO0O0.O00000000().O000000000();
            if (var19 == null) {
               return false;
            } else {
               O0000O00O0OOO0.W373 var20 = O0000O00O0OOO0.O00000000();

               boolean var25;
               try {
                  GL11.glViewport(0, 0, o, p);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  var18.O0000000000.O00000000();
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, O00000OOOO0O0.O00000000().O000000000000());
                  O00000000(var18.O0000000000, "u_DiffuseMap", 0);
                  O00000000(var18.O0000000000, "uViewport", o, p);
                  O00000000(var18.O0000000000, "uRect", f, g, h, i);
                  O00000000(var18.O0000000000, "u_ElementRect", j, k, l, m);
                  O00000000(var18.O0000000000, "u_ElementRadius", Math.max(0.0F, n));
                  O00000000(var18.O0000000000, "u_Time", O00000OOOO0O0.O00000000().O0000000000());
                  O00000000(var18.O0000000000, "u_Resolution", Math.max(1.0F, (float)o), Math.max(1.0F, (float)p));
                  O00000000(var18.O0000000000, "u_GlobalUV", j / Math.max(1.0F, (float)o), k / Math.max(1.0F, (float)p));
                  O00000000(var18.O0000000000, "u_Mouse", q - j, r - k);
                  int var21 = o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O0();
                  int var22 = o0000O000O0OO == null ? -16777216 : o0000O000O0OO.O000000000O00();
                  int var23 = o0000O000O0OO == null ? -15724520 : o0000O000O0OO.O0000000000000();
                  int var24 = o0000O000O0OO == null ? -14671832 : o0000O000O0OO.O000000000000O();
                  O00000000(var18.O0000000000, "u_AccentTop", O00000000(var21), O000000000(var21), O0000000000(var21));
                  O00000000(var18.O0000000000, "u_AccentBottom", O00000000(var22), O000000000(var22), O0000000000(var22));
                  O00000000(var18.O0000000000, "u_ThemeColors[0]", O00000000(var23), O000000000(var23), O0000000000(var23), O00000000000(var23));
                  O00000000(var18.O0000000000, "u_ThemeColors[1]", O00000000(var24), O000000000(var24), O0000000000(var24), O00000000000(var24));
                  O00000000(var18.O0000000000, "u_ThemeColors[2]", O00000000(var21), O000000000(var21), O0000000000(var21), s);
                  O00000000(var18.O0000000000, "u_ThemeColors[3]", O00000000(var22), O000000000(var22), O0000000000(var22), s);
                  O00000000(var18.O0000000000, "u_Alpha", s);
                  O00000000(var18.O0000000000, var18.O000000000);
                  var19.O00000000();
                  var25 = true;
               } catch (Throwable var29) {
                  O00000000OO0OO.O00000000().O000000000("NamedThemeCache.draw:" + string, var29);
                  throw new IllegalStateException("unreachable shader failure", var29);
               } finally {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var20);
               }

               return var25;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public synchronized void O00000000(String string) {
      if (string != null) {
         String var2 = string.trim();
         this.O000000000.entrySet().removeIf(entry -> {
            String var2x = entry.getKey();
            boolean var3x = var2x.equals(var2) || var2x.startsWith(var2 + "#");
            if (var3x && entry.getValue() != null && entry.getValue().O0000000000 != null) {
               entry.getValue().O0000000000.O000000000();
               entry.getValue().O0000000000 = null;
            }

            return var3x;
         });
         O00000OOOOO00 var3 = O00000OOOOO000.O00000000()
            .O000000000()
            .stream()
            .filter(o00000OOOOO00 -> var2.equals(o00000OOOOO00.O000000000()) || var2.equals(o00000OOOOO00.O00000000()))
            .findFirst()
            .orElse(null);
         if (var3 != null && !var3.O00000000().equals(var2)) {
            String var4 = var3.O00000000();
            this.O000000000.entrySet().removeIf(entry -> {
               String var2x = entry.getKey();
               boolean var3x = var2x.equals(var4) || var2x.startsWith(var4 + "#");
               if (var3x && entry.getValue() != null && entry.getValue().O0000000000 != null) {
                  entry.getValue().O0000000000.O000000000();
                  entry.getValue().O0000000000 = null;
               }

               return var3x;
            });
         }
      }
   }

   public synchronized void O000000000() {
      for (O00000OOOO000O.W306 var2 : this.O000000000.values()) {
         if (var2.O0000000000 != null) {
            var2.O0000000000.O000000000();
            var2.O0000000000 = null;
         }
      }

      this.O000000000.clear();
   }

   private O00000OOOO000O.W306 O00000000(String string, O00000OOOO00O o00000OOOO00O) {
      O00000OOOOO00 var3 = O00000OOOOO000.O00000000()
         .O000000000()
         .stream()
         .filter(o00000OOOOO00 -> string.equals(o00000OOOOO00.O00000000()) || string.equals(o00000OOOOO00.O000000000()))
         .findFirst()
         .orElse(null);
      if (var3 == null) {
         return null;
      } else {
         String var4 = o00000OOOO00O == null ? var3.O00000000() : var3.O00000000() + "#" + o00000OOOO00O.O00000000();
         O00000OOOO000O.W306 var5 = this.O000000000.get(var4);
         String var6 = o00000OOOO00O == null ? var3.O00000000000() : var3.O00000000000() + "#" + o00000OOOO00O.O00000000();
         if (var5 != null && var5.O00000000 != null && var5.O00000000.equals(var6) && var5.O0000000000 != null) {
            return var5;
         } else {
            try {
               O00000OOO0OO00 var7 = O00000OOOO0OO0.O00000000(var3.O00000000000(), this.O00000000000);
               if (o00000OOOO00O != null) {
                  var7.O00000000(o00000OOOO00O.O00000000());
               }

               O00000OOO00OO0 var8 = this.O0000000000.O00000000(var7);
               if (var5 != null && var5.O0000000000 != null) {
                  var5.O0000000000.O000000000();
                  var5.O0000000000 = null;
               }

               if (var5 == null) {
                  var5 = new O00000OOOO000O.W306();
                  this.O000000000.put(var4, var5);
               }

               var5.O00000000 = var6;
               var5.O000000000 = var8;
               var5.O0000000000 = new O0000O00OO0(O0000O00OO.O00000000("assets/wild/shaders/mainmenu/menu_quad.vert"), var8.fragmentSource());
               var5.O00000000000 = var8.error();
               return var5;
            } catch (Throwable var9) {
               if (var5 == null) {
                  var5 = new O00000OOOO000O.W306();
                  this.O000000000.put(var3.O00000000(), var5);
               }

               var5.O00000000000 = var9.getMessage() == null ? var9.getClass().getSimpleName() : var9.getMessage();
               var5.O0000000000 = null;
               var5.O000000000 = null;
               O00000000OO0OO.O00000000().O000000000("NamedThemeCache.compile:" + var3.O00000000(), var9);
               throw new IllegalStateException("unreachable shader failure", var9);
            }
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

   private static void O00000000(O0000O00OO0 o0000O00OO0, O00000OOO00OO0 o00000OOO00OO0) {
      if (o0000O00OO0 != null && o00000OOO00OO0 != null && !o00000OOO00OO0.exposedUniforms().isEmpty()) {
         for (O00000OOO00OO var3 : o00000OOO00OO0.exposedUniforms()) {
            float[] var4 = var3.defaults();
            if (var3.kind() == O00000OOO00OO.W302.FLOAT) {
               O00000000(o0000O00OO0, var3.uniformName(), var4[0]);
            } else {
               float var5 = var4.length > 0 ? var4[0] : 0.0F;
               float var6 = var4.length > 1 ? var4[1] : 0.0F;
               float var7 = var4.length > 2 ? var4[2] : 0.0F;
               float var8 = var4.length > 3 ? var4[3] : 1.0F;
               O00000000(o0000O00OO0, var3.uniformName(), var5, var6, var7, var8);
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

   static final class W306 {
      String O00000000 = "";
      O00000OOO00OO0 O000000000;
      O0000O00OO0 O0000000000;
      String O00000000000 = "";
   }
}
