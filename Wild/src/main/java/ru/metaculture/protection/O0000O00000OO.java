package ru.metaculture.protection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;

public final class O0000O00000OO {
   private static final Map<Long, O0000O00000OO.W332> O00000000 = new HashMap<>();
   private static final float O000000000 = 1.08F;
   private static float O0000000000 = 1.08F;
   private static long O00000000000;

   public static void O00000000(O0000O00000 o0000O00000) {
      float var1 = o0000O00000 == null ? 1.0F : Math.max(1.0F, o0000O00000.O000000000());
      O0000000000 = var1 * 1.08F;
   }

   public static int O00000000(O0000O000O0OOO o0000O000O0OOO) {
      return O00000000(o0000O000O0OOO == null ? null : o0000O000O0OOO.O0000000000000());
   }

   public static int O00000000(ColorScheme o0000O000O0OO) {
      return o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O();
   }

   public static int O000000000(O0000O000O0OOO o0000O000O0OOO) {
      return O000000000(o0000O000O0OOO == null ? null : o0000O000O0OOO.O0000000000000());
   }

   public static int O000000000(ColorScheme o0000O000O0OO) {
      return o0000O000O0OO == null ? -1711276033 : o0000O000O0OO.O0000000000OOO();
   }

   public static int O0000000000(ColorScheme o0000O000O0OO) {
      return o0000O000O0OO == null ? 1728053247 : o0000O000O0OO.O0000000000OO0();
   }

   public static int O0000000000(O0000O000O0OOO o0000O000O0OOO) {
      return O00000000000(o0000O000O0OOO == null ? null : o0000O000O0OOO.O0000000000000());
   }

   public static int O00000000000(ColorScheme o0000O000O0OO) {
      return o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O();
   }

   public static int O000000000000(ColorScheme o0000O000O0OO) {
      if (o0000O000O0OO != null && o0000O000O0OO.O000000000O000()) {
         return -131586;
      } else {
         return o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O();
      }
   }

   public static int O0000000000000(ColorScheme o0000O000O0OO) {
      if (o0000O000O0OO != null && o0000O000O0OO.O000000000O000()) {
         return -723465;
      } else {
         return o0000O000O0OO == null ? -1711276033 : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O0000000000OOO(), 0.1F);
      }
   }

   public static int O000000000000O(ColorScheme o0000O000O0OO) {
      if (o0000O000O0OO == null) {
         return ColorScheme.O00000000(255, 255, 255, 178);
      } else if (!o0000O000O0OO.O000000000O000()) {
         if (O00000000000O0(o0000O000O0OO)) {
            int var1 = o0000O000O0OO.O0000000000000() >>> 24 & 0xFF;
            return ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), var1), 0.13F);
         } else {
            return o0000O000O0OO.O0000000000000();
         }
      } else {
         return ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 178), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 178), 0.055F);
      }
   }

   public static int O00000000000O(ColorScheme o0000O000O0OO) {
      if (o0000O000O0OO == null) {
         return ColorScheme.O00000000(255, 255, 255, 196);
      } else if (!o0000O000O0OO.O000000000O000()) {
         if (O00000000000O0(o0000O000O0OO)) {
            int var1 = o0000O000O0OO.O000000000000O() >>> 24 & 0xFF;
            return ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), var1), 0.1F);
         } else {
            return o0000O000O0OO.O000000000000O();
         }
      } else {
         return ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 196), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 196), 0.045F);
      }
   }

   public static int O00000000(ColorScheme o0000O000O0OO, float f) {
      if (o0000O000O0OO == null) {
         return ColorScheme.O00000000(255, 255, 255, 174);
      } else {
         float var2 = O000000000000O(f);
         if (!o0000O000O0OO.O000000000O000()) {
            return ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), var2);
         } else {
            int var3 = ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 214), ColorScheme.O00000000(255, 255, 255, 236), var2);
            return ColorScheme.O00000000(var3, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), var3 >>> 24 & 0xFF), 0.045F + 0.035F * var2);
         }
      }
   }

   public static int O000000000(ColorScheme o0000O000O0OO, float f) {
      float var2 = O000000000000O(f);
      if (o0000O000O0OO == null || o0000O000O0OO.O000000000O000()) {
         return ColorScheme.O00000000(255, 255, 255, Math.round(153.0F * var2));
      } else {
         return O00000000000O0(o0000O000O0OO)
            ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(52.0F * var2))
            : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(10.0F * var2));
      }
   }

   public static int O0000000000(ColorScheme o0000O000O0OO, float f) {
      float var2 = O000000000000O(f);
      return o0000O000O0OO != null && o0000O000O0OO.O000000000O000()
         ? ColorScheme.O00000000(0, 0, 0, Math.round(38.0F * var2))
         : ColorScheme.O00000000(0, 0, 0, Math.round(180.0F * var2));
   }

   public static int O00000000(ColorScheme o0000O000O0OO, int i, float f) {
      float var3 = O000000000000O(f);
      return o0000O000O0OO != null && o0000O000O0OO.O000000000O000()
         ? ColorScheme.O00000000(0, 0, 0, Math.round(38.0F * var3))
         : ColorScheme.O00000000(i, Math.round(255.0F * var3));
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k, float l, float m
   ) {
      if (o0000O00OO0O0 != null && o0000O00000 != null && o0000O000O0OO != null && !(m <= 0.0F)) {
         if (o0000O000O0OO.O000000000O000()) {
            o0000O00OO0O0.O00000000(f, g, h, i, j, k, l, ColorScheme.O00000000(0, 0, 0, Math.round(38.0F * O000000000000O(m))));
         } else {
            o0000O00OO0O0.O00000000(f, g, h, i, j, k, l, ColorScheme.O00000000(0, 0, 0, Math.round(180.0F * O000000000000O(m))));
         }
      }
   }

   public static int O00000000(GroupSetting o0000000OOOOOO, float f, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O00000000(3.0F);
      float var4 = 0.0F;
      int var5 = 1;

      for (int var6 = 0; var6 < o0000000OOOOOO.O00000000000.size(); var6++) {
         float var7 = O00000000(o0000O00000, FontRegistry.O00000000, O00000000(o0000000OOOOOO.O00000000000.get(var6)), 8.0F);
         float var8 = Math.max(o0000O00000.O00000000(18.0F), var7 + o0000O00000.O00000000(8.0F));
         if (var4 > 0.0F && var4 + var8 > f) {
            var5++;
            var4 = 0.0F;
         }

         var4 += var8 + var3;
      }

      return var5;
   }

   public static String O00000000(BooleanSetting o0000000OOO0O0) {
      return o0000000OOO0O0.O0000000000000 == -1
         ? o0000000OOO0O0.O00000000
         : o0000000OOO0O0.O00000000 + " [" + (o0000000OOO0O0.O000000000000O ? "H " : "") + O0000O000OO0O0.O00000000(o0000000OOO0O0.O0000000000000) + "]";
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f, float g, float h, String string, int i
   ) {
      float var8 = O00000000(o0000O00000, h);
      o0000O00OO0O0.O00000000(o0000O0O00O00O, f, g + var8, var8 * 2.0F, string, i);
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f, float g, float h, float i, String string, int j
   ) {
      O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, f, O00000000(o0000O00000, o0000O0O00O00O, g, h, i), i, string, j);
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f, float g, float h, float i, String string, int j, String string2
   ) {
      float var10 = O00000000(o0000O00000, i);
      o0000O00OO0O0.O00000000(o0000O0O00O00O, f, O00000000(o0000O00000, o0000O0O00O00O, g, h, i) + var10, var10 * 2.0F, string, j, string2);
   }

   public static float O00000000(FontObject o0000O0O00O00O, String string, float f) {
      return RenderManager.O00000000(o0000O0O00O00O, string == null ? "" : string, f * 2.0F * O0000000000).O00000000;
   }

   public static float O00000000(O0000O00000 o0000O00000, FontObject o0000O0O00O00O, String string, float f) {
      return RenderManager.O00000000(o0000O0O00O00O, string == null ? "" : string, O00000000(o0000O00000, f) * 2.0F).O00000000;
   }

   public static float O00000000(O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f) {
      float var3 = O00000000(o0000O00000, f);
      return Math.max(var3, RenderManager.O00000000(o0000O0O00O00O, "Ag", var3 * 2.0F).O000000000);
   }

   public static float O00000000(O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f, float g, float h) {
      return f + (g - O00000000(o0000O00000, o0000O0O00O00O, h)) * 0.5F;
   }

   private static float O00000000(O0000O00000 o0000O00000, float f) {
      float var2 = o0000O00000 == null ? 1.0F : Math.max(1.0F, o0000O00000.O000000000());
      return f * var2 * 1.08F;
   }

   public static boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g, float h, float i) {
      return O00000000(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), f, g, h, i);
   }

   public static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && g >= i && f < h + j && g < i + k;
   }

   public static float O00000000(float f) {
      return O00000000(f, 0.0F, 0.03F, 0.012F);
   }

   public static float O00000000(float f, float g) {
      return O00000000(f, g, 0.03F, 0.012F);
   }

   public static float O00000000(float f, float g, float h, float i) {
      float var4 = O000000000(f);
      float var5 = Math.min(Math.max(0.0F, i), Math.abs(g) * 0.16F);
      return 1.0F + var4 * h + var5;
   }

   public static float O000000000(float f) {
      float var1 = O0000O000O00O.O000000000(f);
      return 1.0F - (float)Math.exp(-3.25F * var1);
   }

   public static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, Runnable runnable) {
      O00000000(o0000O00OO0O0, f, g, h, i, j, j, j, j, runnable);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, float m, Runnable runnable) {
      if (o0000O00OO0O0 != null && runnable != null && !(h <= 0.0F) && !(i <= 0.0F)) {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, h, i, j, k, l, m);
         boolean var12 = false /* VF: Semaphore variable */;

         try {
            var12 = true;
            runnable.run();
            var12 = false;
         } finally {
            if (var12) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, float f, float g, float h, float i) {
      O00000000(o0000O00OO0O0, o0000O000O0OOO.O000000000000(), o0000O000O0OOO.O0000000000000(), f, g, h, i);
   }

   public static void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      o0000O00OO0O0.O000000000(f, g, h, h, o0000O00000.O00000000(3.0F), o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00());
      o0000O00OO0O0.O000000000(f + h + i, g, h, h, o0000O00000.O00000000(3.0F), -24930, -32126);
      o0000O00OO0O0.O000000000(f, g + h + i, h, h, o0000O00000.O00000000(3.0F), -24854, -32032);
      o0000O00OO0O0.O000000000(f + h + i, g + h + i, h, h, o0000O00000.O00000000(3.0F), -6357069, -8192089);
   }

   public static void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, String string, float f, float g, float h) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      String var8 = string == null ? "" : string;
      float var9 = Math.min(h * 0.55F, O00000000(var6, FontRegistry.O00000000, var8, 10.0F));
      float var10 = Math.max(var6.O00000000(34.0F), var9 + var6.O00000000(12.0F));
      float var11 = f + h - var10;
      o0000O00OO0O0.O00000000(var11, g, var10, var6.O00000000(16.0F), var6.O00000000(4.0F), var7.O00000000000O0());
      o0000O00OO0O0.O00000000(var11, g, var10, var6.O00000000(16.0F), var6.O00000000(4.0F), var7.O0000000000O(), 0.5F);
      O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000,
         var11 + var6.O00000000(6.0F),
         g,
         var6.O00000000(16.0F),
         10.0F,
         O00000000(FontRegistry.O00000000, var8, 10.0F, var10 - var6.O00000000(12.0F)),
         var7.O0000000000OOO()
      );
   }

   public static void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, float f, float g) {
      O0000O00000 var4 = o0000O000O0OOO.O000000000000();
      ColorScheme var5 = o0000O000O0OOO.O0000000000000();
      o0000O00OO0O0.O00000000(f, g, var4.O00000000(8.0F), var4.O00000000(8.0F), var4.O00000000(2.0F), O000000000000(var5));
      o0000O00OO0O0.O00000000(
         f + var4.O00000000(2.5F),
         g + var4.O00000000(2.0F),
         var4.O00000000(1.0F),
         var4.O00000000(4.0F),
         var4.O00000000(1.0F),
         ColorScheme.O00000000(21, 22, 26, 61)
      );
      o0000O00OO0O0.O00000000(
         f + var4.O00000000(4.5F),
         g + var4.O00000000(2.0F),
         var4.O00000000(1.0F),
         var4.O00000000(4.0F),
         var4.O00000000(1.0F),
         ColorScheme.O00000000(21, 22, 26, 61)
      );
   }

   public static List<String> O00000000(FontObject o0000O0O00O00O, String string, float f, float g, int i) {
      ArrayList var5 = new ArrayList();
      if (string != null && !string.isBlank()) {
         StringBuilder var6 = new StringBuilder();

         for (String var10 : string.split("\\s+")) {
            String var11 = var6.isEmpty() ? var10 : var6 + " " + var10;
            if (!(O00000000(o0000O0O00O00O, var11, f) <= g) && !var6.isEmpty()) {
               var5.add(var6.toString());
               var6 = new StringBuilder(var10);
               if (var5.size() == i) {
                  break;
               }
            } else {
               var6 = new StringBuilder(var11);
            }
         }

         if (var5.size() < i && !var6.isEmpty()) {
            var5.add(var6.toString());
         }

         if (!var5.isEmpty()) {
            int var12 = var5.size() - 1;
            var5.set(var12, O00000000(o0000O0O00O00O, (String)var5.get(var12), f, g));
         }

         return var5;
      } else {
         return var5;
      }
   }

   public static String O00000000(FontObject o0000O0O00O00O, String string, float f, float g) {
      String var4 = string == null ? "" : string;
      if (O00000000(o0000O0O00O00O, var4, f) <= g) {
         return var4;
      } else {
         String var5 = "...";

         while (!var4.isEmpty() && O00000000(o0000O0O00O00O, var4 + var5, f) > g) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         return var4 + var5;
      }
   }

   public static String O00000000(O0000O00000 o0000O00000, FontObject o0000O0O00O00O, String string, float f, float g) {
      String var5 = string == null ? "" : string;
      if (O00000000(o0000O00000, o0000O0O00O00O, var5, f) <= g) {
         return var5;
      } else {
         String var6 = "...";

         while (!var5.isEmpty() && O00000000(o0000O00000, o0000O0O00O00O, var5 + var6, f) > g) {
            var5 = var5.substring(0, var5.length() - 1);
         }

         return var5 + var6;
      }
   }

   public static String O0000000000(float f) {
      return Math.abs(f - Math.round(f)) < 0.001F ? Integer.toString(Math.round(f)) : String.format(Locale.ROOT, "%.1f", f);
   }

   public static String O000000000(float f, float g) {
      int var2 = O000000000000(g);
      return var2 > 0 && !(Math.abs(f - Math.round(f)) < 0.001F) ? String.format(Locale.ROOT, "%." + var2 + "f", f) : Integer.toString(Math.round(f));
   }

   private static int O000000000000(float f) {
      if (Float.isFinite(f) && !(f <= 0.0F)) {
         try {
            int var1 = new BigDecimal(Float.toString(Math.abs(f))).stripTrailingZeros().scale();
            return Math.min(4, Math.max(0, var1));
         } catch (NumberFormatException var2) {
            return 1;
         }
      } else {
         return 1;
      }
   }

   public static float O00000000(NumberSetting o000000O000) {
      float var1 = Math.max(1.0E-4F, o000000O000.O0000000000000 - o000000O000.O000000000000);
      return Math.max(0.0F, Math.min(1.0F, (o000000O000.O00000000000 - o000000O000.O000000000000) / var1));
   }

   public static float O00000000(ColorSetting o0000000OOOO0O) {
      float var1 = Math.max(1.0E-4F, o0000000OOOO0O.O000000000000O - o0000000OOOO0O.O0000000000000);
      return Math.max(0.0F, Math.min(1.0F, (o0000000OOOO0O.O000000000000 - o0000000OOOO0O.O0000000000000) / var1));
   }

   public static int O000000000(float f, float g, float h, float i) {
      f %= 360.0F;
      if (f < 0.0F) {
         f += 360.0F;
      }

      float var4 = (1.0F - Math.abs(2.0F * h - 1.0F)) * g;
      float var5 = var4 * (1.0F - Math.abs(f / 60.0F % 2.0F - 1.0F));
      float var6 = h - var4 * 0.5F;
      float var7;
      float var8;
      float var9;
      if (f < 60.0F) {
         var7 = var4;
         var8 = var5;
         var9 = 0.0F;
      } else if (f < 120.0F) {
         var7 = var5;
         var8 = var4;
         var9 = 0.0F;
      } else if (f < 180.0F) {
         var7 = 0.0F;
         var8 = var4;
         var9 = var5;
      } else if (f < 240.0F) {
         var7 = 0.0F;
         var8 = var5;
         var9 = var4;
      } else if (f < 300.0F) {
         var7 = var5;
         var8 = 0.0F;
         var9 = var4;
      } else {
         var7 = var4;
         var8 = 0.0F;
         var9 = var5;
      }

      return ColorScheme.O00000000(
         Math.round((var7 + var6) * 255.0F),
         Math.round((var8 + var6) * 255.0F),
         Math.round((var9 + var6) * 255.0F),
         Math.round(Math.max(0.0F, Math.min(1.0F, i)) * 255.0F)
      );
   }

   public static int O00000000(float f, float g, float h) {
      return O0000000000(f, g, h, 1.0F);
   }

   public static int O0000000000(float f, float g, float h, float i) {
      f %= 1.0F;
      if (f < 0.0F) {
         f++;
      }

      g = O000000000000O(g);
      h = O000000000000O(h);
      int var4 = (int)(f * 6.0F);
      float var5 = f * 6.0F - var4;
      float var6 = h * (1.0F - g);
      float var7 = h * (1.0F - var5 * g);
      float var8 = h * (1.0F - (1.0F - var5) * g);
      float var9;
      float var10;
      float var11;
      switch (var4 % 6) {
         case 0:
            var9 = h;
            var10 = var8;
            var11 = var6;
            break;
         case 1:
            var9 = var7;
            var10 = h;
            var11 = var6;
            break;
         case 2:
            var9 = var6;
            var10 = h;
            var11 = var8;
            break;
         case 3:
            var9 = var6;
            var10 = var7;
            var11 = h;
            break;
         case 4:
            var9 = var8;
            var10 = var6;
            var11 = h;
            break;
         default:
            var9 = h;
            var10 = var6;
            var11 = var7;
      }

      return ColorScheme.O00000000(Math.round(var9 * 255.0F), Math.round(var10 * 255.0F), Math.round(var11 * 255.0F), Math.round(O000000000000O(i) * 255.0F));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j) {
      float var6 = i / 6.0F;
      int[] var7 = new int[]{
         O00000000(0.0F, 1.0F, 1.0F),
         O00000000(0.16666667F, 1.0F, 1.0F),
         O00000000(0.33333334F, 1.0F, 1.0F),
         O00000000(0.5F, 1.0F, 1.0F),
         O00000000(0.6666667F, 1.0F, 1.0F),
         O00000000(0.8333333F, 1.0F, 1.0F),
         O00000000(1.0F, 1.0F, 1.0F)
      };
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);
      boolean var12 = false /* VF: Semaphore variable */;

      try {
         var12 = true;

         for (int var8 = 0; var8 < 6; var8++) {
            float var9 = g + var8 * var6;
            o0000O00OO0O0.O000000000(f, var9, h, var6 + 1.0F, 0.0F, var7[var8], var7[var8 + 1]);
         }

         var12 = false;
      } finally {
         if (var12) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   public static float O000000000(O0000O00000 o0000O00000) {
      return Math.max(15.0F, Math.min(20.0F, o0000O00000.O00000000(18.0F)));
   }

   public static float O0000000000(O0000O00000 o0000O00000) {
      return O000000000(o0000O00000) + Math.max(12.0F, o0000O00000.O00000000(18.0F));
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, float h, float i, float j, float k, float l, float m, float n, Runnable runnable
   ) {
      O00000000(o0000O00OO0O0, o0000O00000, null, f, g, h, i, j, k, l, m, n, runnable);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      Runnable runnable
   ) {
      if (o0000O00OO0O0 != null && runnable != null && !(h <= 1.0F) && !(i <= 1.0F)) {
         if (!MenuModule.O00000000(MenuModule.O000000000OOOO)) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(f, g, h, i, j, k, l, m);

            try {
               runnable.run();
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         } else {
            long var13 = O00000000000(f, g, h, i);
            O0000O00000OO.W331 var15 = O00000000(o0000O00000, var13, n, 1.8F, 30.0F, 150.0F);
            float var16 = var15.O000000000;
            float var17 = var15.O00000000000;
            if (var16 < 0.006F) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O00000000(f, g, h, i, j, k, l, m);

               try {
                  runnable.run();
               } finally {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               }
            } else {
               RenderManager.W384 var18 = o0000O00OO0O0.O00000000(f, g, h, i);
               if (var18 == null) {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O00000000(f, g, h, i, j, k, l, m);
                  boolean var32 = false /* VF: Semaphore variable */;

                  try {
                     var32 = true;
                     runnable.run();
                     var32 = false;
                  } finally {
                     if (var32) {
                        o0000O00OO0O0.O0000000000();
                        o0000O00OO0O0.O0000000000000();
                     }
                  }

                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               } else {
                  try {
                     runnable.run();
                  } finally {
                     o0000O00OO0O0.O00000000(var18);
                  }

                  float var19 = o0000O00000.O00000000(48.0F);
                  float var20 = Math.min(1.0F, var16 / Math.max(var19 * 0.08F, 1.0F));
                  float var21 = O000000000(o0000O00000) * var20;
                  float var22 = Math.min(1.0F, var16 / Math.max(o0000O00000.O00000000(26.0F), 1.0F));
                  float var23 = Math.min(o0000O00000.O00000000(15.0F), var16 * 0.6F) * var22;
                  o0000O00OO0O0.O00000000(var18, f, g, h, i, j, k, l, m, var21, var23, var16, var22, 0.0F, var17);
               }
            }
         }
      }
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k
   ) {
      long var9 = O00000000000(f + 41.7F, g + 19.3F, h + 3.1F, i + 2.4F);
      O0000O00000OO.W331 var11 = O00000000(o0000O00000, var9, k, 4.05F, 28.0F, 88.0F);
      float var12 = Math.min(1.0F, var11.O000000000 / Math.max(o0000O00000.O00000000(48.0F), 1.0F));
      float var13 = 0.0F;
      if (!(var12 <= 1.0E-4F) && !(h <= 1.0F) && !(i <= 1.0F)) {
         float var14 = var11.O00000000000;
         float var15 = O0000000000(Math.max(var12, var13 * 0.9F), 4.2F);
         float var16 = o0000O00000.O00000000(1.1F) + o0000O00000.O00000000(5.1F) * var15 + o0000O00000.O00000000(2.7F) * var13;
         float var17 = o0000O00000.O00000000(0.95F) + o0000O00000.O00000000(7.15F) * O0000000000(var12, 4.18F);
         float var18 = Math.min(i * 0.14F, o0000O00000.O00000000(6.5F) + o0000O00000.O00000000(10.5F) * var15);
         float var19 = Math.min(i * 0.1F, o0000O00000.O00000000(4.2F) + o0000O00000.O00000000(7.1F) * var15);
         float var20 = (float)Math.pow(Math.max(var12 * 0.24F + var15 * 0.76F, 0.0F), 0.82F);
         float var21 = (float)Math.pow(Math.max(var12 * 0.32F + var15 * 0.68F, 0.0F), 1.02F);
         float var22 = (float)Math.pow(Math.max(0.0F, var13), 0.82F);
         int var23 = ColorScheme.O00000000(
            ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), o0000O000O0OO.O000000000O00(), 0.08F), Math.round(18.0F * var20)
         );
         int var24 = ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), Math.round(10.0F * var21));
         int var25 = ColorScheme.O00000000(
            ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), o0000O000O0OO.O000000000O0(), 0.11F), Math.round(14.0F * var22)
         );
         int var26 = ColorScheme.O00000000(
            ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), o0000O000O0OO.O000000000O00(), 0.24F), Math.round(16.0F * var22)
         );
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000(f, g, h, i, var16);
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);

         try {
            if (var12 > 1.0E-4F) {
               for (int var27 = 0; var27 < 3; var27++) {
                  float var28 = (var27 + 1.0F) / 3.0F;
                  float var29 = var14 * var17 * var28;
                  float var30 = var12 * (0.019F - var27 * 0.0048F);
                  o0000O00OO0O0.O000000000(f, g + var29, h, i, j, var30);
               }
            }

            if (var13 > 1.0E-4F) {
               float var34 = Math.min(Math.min(h, i) * 0.18F, o0000O00000.O00000000(1.15F) + o0000O00000.O00000000(2.4F) * var22);
               o0000O00OO0O0.O000000000(f, g, h, i, j, 0.016F + var13 * 0.016F);
               if (h - var34 * 2.0F > 1.0F && i - var34 * 1.35F > 1.0F) {
                  o0000O00OO0O0.O000000000(
                     f + var34, g + var34 * 0.65F, h - var34 * 2.0F, i - var34 * 1.35F, Math.max(o0000O00000.O00000000(2.0F), j - var34 * 0.4F), var13 * 0.014F
                  );
               }

               o0000O00OO0O0.O00000000(f, g, h, i, j, var25);
               o0000O00OO0O0.O00000000(f, g, h, i, j, var26, 0.5F);
            }

            if (var12 > 1.0E-4F) {
               if (var14 > 0.0F) {
                  o0000O00OO0O0.O000000000(f, g, h, var18, j, var23, ColorScheme.O00000000(0, 0, 0, 0));
                  o0000O00OO0O0.O000000000(f, g + i - var19, h, var19, j, ColorScheme.O00000000(0, 0, 0, 0), var24);
               } else {
                  o0000O00OO0O0.O000000000(f, g + i - var18, h, var18, j, ColorScheme.O00000000(0, 0, 0, 0), var23);
                  o0000O00OO0O0.O000000000(f, g, h, var19, j, var24, ColorScheme.O00000000(0, 0, 0, 0));
               }
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   public static void O000000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k, float l, float m
   ) {
      O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, g, h, i, j, k, l, m, 0L, -1.0F, -1.0F, null);
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      long n,
      float o,
      float p,
      O00000OOOOOOO.W327 o000000000
   ) {
      if (o0000O00OO0O0 != null && o0000O00000 != null && o0000O000O0OO != null && !(h <= 0.0F) && !(i <= 0.0F) && !(k <= 0.0F)) {
         float var16 = 0.0F;
         if (n != 0L && o000000000 != null) {
            var16 = O00000OOOOOOO.O00000000(n, f, g, h, i, j, k, Math.max(o0000O00000.O00000000(4.5F), 5.0F), o, p, o000000000);
         }

         long var17 = O00000000000(f + 73.1F, g + 11.7F, h + 5.4F, i + 3.2F);
         O0000O00000OO.W331 var19 = O00000000(o0000O00000, var17, l, 3.4F, 24.0F, 78.0F);
         float var20 = var19.O00000000000;
         float var21 = Math.min(1.0F, var19.O000000000 / Math.max(o0000O00000.O00000000(48.0F), 1.0F));
         float var23 = Math.max(var21, Math.max(m * 0.72F, var16 * 0.85F));
         float var24 = 0.82F + 0.18F * O00000000000((float)System.currentTimeMillis() * 7.0E-4F + j * 0.015F);
         float var25 = var23 * var24;
         float var26 = var16 * (0.84F + 0.16F * var24);
         float var27 = Math.max(h * 0.5F, o0000O00000.O00000000(1.6F));
         float var28 = Math.min(o0000O00000.O00000000(1.15F), Math.max(o0000O00000.O00000000(0.85F), h * 0.26F));
         float var29 = f + var28;
         float var30 = Math.max(o0000O00000.O00000000(0.8F), h - var28 * 2.0F);
         float var31 = g + o0000O00000.O00000000(1.2F);
         float var32 = Math.max(o0000O00000.O00000000(8.0F), i - o0000O00000.O00000000(2.4F));
         float var33 = o0000O00000.O00000000(0.9F) * var16;
         float var34 = f - var33;
         float var35 = h + var33 * 2.0F;
         float var36 = Math.max(var35 * 0.5F, o0000O00000.O00000000(1.7F));
         o0000O00OO0O0.O00000000(f, g, h, i, var27, ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), 0.26F + var23 * 0.22F));
         o0000O00OO0O0.O00000000(
            var29,
            var31,
            var30,
            var32,
            var30 * 0.5F,
            ColorScheme.O00000000(
               ColorScheme.O00000000(0, 0, 0, 24), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 42), 0.1F + var25 * 0.18F + var16 * 0.08F
            )
         );
         o0000O00OO0O0.O00000000(f, g, h, i, var27, ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(14.0F * var23 + 10.0F * var26)), 0.5F);
         O000000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, j, h, k, var21, var20);
         int var37 = ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O00(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 140), 0.12F + var25 * 0.28F + var16 * 0.08F
         );
         int var38 = ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O0(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 154), 0.26F + var25 * 0.46F + var16 * 0.1F
         );
         o0000O00OO0O0.O00000000(
            var34 - o0000O00000.O00000000(0.25F),
            j + o0000O00000.O00000000(0.7F),
            var35 + o0000O00000.O00000000(0.5F),
            Math.max(o0000O00000.O00000000(12.0F), k - o0000O00000.O00000000(1.4F)),
            var36,
            o0000O00000.O00000000(3.0F + var25 * 4.5F + var16 * 2.1F),
            o0000O00000.O00000000(0.9F),
            o0000O000O0OO.O000000000O000()
               ? ColorScheme.O00000000(0, 0, 0, Math.round(18.0F * var25 + 10.0F * var26))
               : ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(20.0F * var25 + 12.0F * var26))
         );
         o0000O00OO0O0.O000000000(var34, j, var35, k, var36, var37, var38);
         float var39 = Math.max(o0000O00000.O00000000(0.75F), var35 * 0.22F);
         float var40 = Math.max(o0000O00000.O00000000(0.8F), var35 - var39 * 2.0F);
         float var41 = Math.min(
            Math.max(o0000O00000.O00000000(5.0F), k * (0.28F + var25 * 0.08F)), Math.max(o0000O00000.O00000000(6.0F), k - o0000O00000.O00000000(2.2F))
         );
         o0000O00OO0O0.O000000000(
            var34 + var39,
            j + o0000O00000.O00000000(1.15F),
            var40,
            var41,
            var40 * 0.5F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(26.0F * var25 + 14.0F * var26)),
            ColorScheme.O00000000(255, 255, 255, 0)
         );
         float var42 = Math.max(o0000O00000.O00000000(1.0F), var35 * 0.28F);
         float var43 = Math.max(o0000O00000.O00000000(0.75F), var35 - var42 * 2.0F);
         float var44 = j + o0000O00000.O00000000(2.0F);
         float var45 = Math.max(o0000O00000.O00000000(7.0F), k - o0000O00000.O00000000(4.0F));
         o0000O00OO0O0.O000000000(
            var34 + var42,
            var44,
            var43,
            var45,
            var43 * 0.5F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(18.0F * var25 + 10.0F * var26)),
            ColorScheme.O00000000(
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00(), 0.55F), Math.round(48.0F * var25 + 20.0F * var26)
            )
         );
         o0000O00OO0O0.O00000000(
            var34,
            j,
            var35,
            k,
            var36,
            ColorScheme.O00000000(
               ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O0(), 0.14F + var25 * 0.1F + var16 * 0.06F),
               Math.round(38.0F * var25 + 14.0F * var26)
            ),
            0.5F
         );
      }
   }

   public static void O000000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k
   ) {
      if (!(j <= 1.0E-4F) && !(h <= 0.0F) && !(i <= 0.0F)) {
         float var9 = Math.max(o0000O00000.O00000000(0.95F), h * 0.26F);
         float var10 = f + var9;
         float var11 = Math.max(o0000O00000.O00000000(0.75F), h - var9 * 2.0F);
         float var12 = o0000O00000.O00000000(1.8F) + o0000O00000.O00000000(7.5F) * j;
         float var13 = o0000O00000.O00000000(1.4F) + o0000O00000.O00000000(4.5F) * j;
         float var14 = k > 0.0F ? g - var12 : g + i - var13;
         float var15 = var12 + var13;
         float var16 = (float)Math.pow(j, 0.82F);
         int var17 = ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO.O000000000O0(), 0.56F), Math.round(11.0F * var16));
         int var18 = ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO.O000000000O0(), 0.16F), Math.round(18.0F * var16));
         o0000O00OO0O0.O00000000000();

         try {
            if (k > 0.0F) {
               o0000O00OO0O0.O000000000(var10, var14, var11, var15 * 0.72F, var11 * 0.5F, var17, var18);
               o0000O00OO0O0.O000000000(var10, var14 + var15 * 0.72F, var11, var15 * 0.28F, var11 * 0.5F, var18, ColorScheme.O00000000(255, 255, 255, 0));
            } else {
               o0000O00OO0O0.O000000000(var10, var14, var11, var15 * 0.28F, var11 * 0.5F, ColorScheme.O00000000(255, 255, 255, 0), var18);
               o0000O00OO0O0.O000000000(var10, var14 + var15 * 0.28F, var11, var15 * 0.72F, var11 * 0.5F, var18, var17);
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O000000000000();
         }
      }
   }

   private static float O00000000(O0000O00000 o0000O00000, float f, float g) {
      float var3 = Math.min(1.0F, Math.abs(f) / Math.max(o0000O00000.O00000000(g), 0.5F));
      return var3 <= 0.0F ? 0.0F : (float)Math.pow(var3, 0.82F);
   }

   private static O0000O00000OO.W331 O00000000(O0000O00000 o0000O00000, long l, float f, float g, float h, float i) {
      long var7 = System.currentTimeMillis();
      O0000O00000OO.W332 var9 = O00000000.computeIfAbsent(l, long_ -> new O0000O00000OO.W332());
      float var10 = var9.O0000000000000 == 0L ? 16.0F : Math.min(80.0F, Math.max(1.0F, (float)(var7 - var9.O0000000000000)));
      var9.O0000000000000 = var7;
      float var11 = o0000O00000.O00000000(48.0F);
      float var12 = o0000O00000.O00000000(0.028F);
      float var13 = Math.abs(f) * var12;
      float var14 = var11 * (1.0F - (float)Math.exp(-var13 / var11));
      float var15 = f < -0.001F ? -1.0F : (f > 0.001F ? 1.0F : 0.0F);
      if (var15 != 0.0F) {
         var9.O00000000000 = var15;
      }

      float var16 = var14 > var9.O00000000 ? h : i;
      var9.O00000000 = O0000O000O00O.O000000000(var9.O00000000, var14, var10, var16);
      var9.O000000000000 = f;
      if (var9.O00000000 <= 0.006F && Math.abs(f) <= 0.5F) {
         O00000000.remove(l);
         O00000000(var7);
         return new O0000O00000OO.W331(0.0F, 0.0F, 0.0F, var9.O00000000000 == 0.0F ? 1.0F : var9.O00000000000);
      } else {
         O00000000(var7);
         return new O0000O00000OO.W331(0.0F, var9.O00000000, 0.0F, var9.O00000000000 == 0.0F ? 1.0F : var9.O00000000000);
      }
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o
   ) {
      int var13 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), ColorScheme.O00000000(255, 255, 255, 255), 0.24F);
      int var14 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO.O000000000O00(), 0.52F);
      float var15 = Math.max(0.5F, o0000O00000.O00000000(0.7F));
      float var16 = f + var15;
      float var17 = g + var15;
      float var18 = Math.max(1.0F, h - var15 * 2.0F);
      float var19 = Math.max(1.0F, i - var15 * 2.0F);
      float var20 = o0000O00000.O00000000(1.0F);
      float var21 = var16 + var20;
      float var22 = var17 + var20;
      float var23 = Math.max(1.0F, var18 - var20 * 2.0F);
      float var24 = Math.max(1.0F, var19 - var20 * 2.0F);
      float var25 = Math.max(0.0F, j - var15);
      float var26 = Math.max(0.0F, k - var15);
      float var27 = Math.max(0.0F, l - var15);
      float var28 = Math.max(0.0F, m - var15);
      float var29 = Math.max(0.0F, var25 - var20);
      float var30 = Math.max(0.0F, var26 - var20);
      float var31 = Math.max(0.0F, var27 - var20);
      float var32 = Math.max(0.0F, var28 - var20);
      float var33 = Math.max(o0000O00000.O00000000(1.1F), Math.min(o0000O00000.O00000000(2.0F), h - o0000O00000.O00000000(1.4F)));
      float var34 = f + h - var33 - o0000O00000.O00000000(0.7F);
      float var35 = g + o0000O00000.O00000000(5.0F);
      float var36 = Math.max(1.0F, i - o0000O00000.O00000000(10.0F));
      float var37 = 0.72F + 0.28F * O00000000000((float)System.currentTimeMillis() * 7.8E-4F + g * 0.018F);
      float var38 = (float)Math.pow(Math.max(0.0F, Math.min(1.0F, o)), 0.72F);
      float var39 = (float)Math.pow(var38, 1.18F);
      float var40 = var39 * (0.78F + 0.22F * var37);
      float var41 = var40 * (0.82F + 0.18F * var37);
      float var42 = Math.min(var36, Math.max(o0000O00000.O00000000(10.0F), var36 * (0.18F + o * 0.08F)));
      float var43 = Math.max(0.0F, var36 - var42);
      float var44 = var35 + var43 * O00000000000((float)System.currentTimeMillis() * 9.2E-4F + n * 0.17F + f * 0.01F);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000000();

      try {
         o0000O00OO0O0.O00000000(
            var16,
            var17,
            var18,
            var19,
            var25,
            var26,
            var27,
            var28,
            ColorScheme.O00000000(var13, Math.round(42.0F * var38)),
            Math.max(0.75F, o0000O00000.O00000000(0.7F))
         );
         o0000O00OO0O0.O00000000(var21, var22, var23, var24, var29, var30, var31, var32, ColorScheme.O00000000(var14, Math.round(18.0F * var39)), 0.5F);
         o0000O00OO0O0.O00000000(
            var34,
            var35,
            var33,
            var36,
            var33 * 0.5F,
            o0000O00000.O00000000(4.2F + 6.8F * var40),
            o0000O00000.O00000000(0.85F),
            ColorScheme.O00000000(var14, Math.round(16.0F * var40))
         );
         o0000O00OO0O0.O000000000(
            var34,
            var35,
            var33,
            var36,
            var33 * 0.5F,
            ColorScheme.O00000000(var13, Math.round(34.0F * var40)),
            ColorScheme.O00000000(var14, Math.round(18.0F * var39))
         );
         o0000O00OO0O0.O000000000(
            var34,
            var44,
            var33,
            var42,
            var33 * 0.5F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(22.0F * var41)),
            ColorScheme.O00000000(255, 255, 255, 0)
         );
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O000000000000();
      }
   }

   private static float O0000000000000(float f) {
      float var1 = Math.max(0.0F, Math.min(1.0F, (f - 0.035F) / 0.5F));
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float O000000000(float f, float g, float h) {
      float var3 = Math.max(0.0F, Math.min(1.0F, (h - f) / Math.max(1.0E-5F, g - f)));
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static float O0000000000(float f, float g, float h) {
      float var3 = Math.max(0.0F, f);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         float var4 = var3 / Math.max(h, 1.0E-5F);
         var4 /= 1.0F + var4;
         float var5 = var3 / (var3 + Math.max(g, 1.0E-5F) * 2.35F);
         return Math.max(0.0F, Math.min(1.0F, var4 * (0.58F + 0.92F * var5) * 1.42F));
      }
   }

   private static float O0000000000(float f, float g) {
      float var2 = Math.max(0.0F, Math.min(1.0F, f));
      if (var2 <= 0.0F) {
         return 0.0F;
      } else {
         double var3 = Math.expm1(Math.max(1.0E-4F, g));
         return var3 <= 1.0E-7 ? var2 : (float)(Math.expm1(g * var2) / var3);
      }
   }

   public static float O00000000000(float f) {
      float var1 = f - (float)Math.floor(f);
      return 0.5F - 0.5F * (float)Math.cos(var1 * Math.PI * 2.0);
   }

   private static long O00000000000(float f, float g, float h, float i) {
      long var4 = 1469598103934665603L;
      var4 = (var4 ^ Math.round(f * 2.0F)) * 1099511628211L;
      var4 = (var4 ^ Math.round(g * 2.0F)) * 1099511628211L;
      var4 = (var4 ^ Math.round(h * 2.0F)) * 1099511628211L;
      return (var4 ^ Math.round(i * 2.0F)) * 1099511628211L;
   }

   private static float O000000000000O(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private static boolean O00000000000O0(ColorScheme o0000O000O0OO) {
      return o0000O000O0OO != null && (o0000O000O0OO.O000000000O0() & 16777215) == 61695 && (o0000O000O0OO.O000000000O00() & 16777215) == 17663;
   }

   private static void O00000000(long l) {
      if (l - O00000000000 >= 1800L) {
         O00000000000 = l;
         Iterator var2 = O00000000.entrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            O0000O00000OO.W332 var4 = (O0000O00000OO.W332)var3.getValue();
            if (var4 == null || l - var4.O0000000000000 > 2600L) {
               var2.remove();
            }
         }
      }
   }

   @Generated
   private O0000O00000OO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static final class W331 {
      private final float O00000000;
      final float O000000000;
      private final float O0000000000;
      final float O00000000000;

      W331(float f, float g, float h, float i) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
      }
   }

   static final class W332 {
      float O00000000;
      private float O000000000;
      private float O0000000000;
      float O00000000000 = 1.0F;
      float O000000000000;
      long O0000000000000;
   }
}
