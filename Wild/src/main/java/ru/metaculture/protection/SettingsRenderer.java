package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.client.MinecraftClient;

public final class SettingsRenderer {
   public static final float O00000000 = 186.0F;
   private static final long O000000000 = 5200L;
   private static final int O0000000000 = -1577754;
   private static final int O00000000000 = -3945532;

   public void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, Setting o0000000OOO00O, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      switch (o0000000OOO00O) {
         case BooleanSetting var10:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var10, f, g, h, o0000O000O0OOO);
            break;
         case NumberSetting var11:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var11, f, g, h, o0000O000O0OOO);
            break;
         case ColorSetting var12:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var12, f, g, h, o0000O000O0OOO);
            break;
         case ModeSetting var13:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var13, f, g, h, o0000O000O0OOO);
            break;
         case O000000O00 var14:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var14, f, g, h, o0000O000O0OOO);
            break;
         case GroupSetting var15:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var15, f, g, h, o0000O000O0OOO);
            break;
         case MultiSelectSetting var16:
            this.O00000000(
               o0000O00OO0O0, o0000O000O0O0, var16, var16.O00000000, var16.O000000000000O.isEmpty() ? "none" : var16.O000000000000(), f, g, h, o0000O000O0OOO
            );
            break;
         case KeybindSetting var17:
            String var20 = o0000O000O0O0.O0000000OOO0() == var17 ? "..." : (var17.O00000000000 == -1 ? "n/a" : O0000O000OO0O0.O00000000(var17.O00000000000));
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var17, var17.O00000000, var20, f, g, h, o0000O000O0OOO);
            break;
         case TextSetting var18:
            String var21 = o0000O000O0O0.O0000000OOO000() == var18 ? var18.O000000000000 + "|" : var18.O000000000000;
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var18, var18.O00000000, var21.isEmpty() ? "empty" : var21, f, g, h, o0000O000O0OOO);
            break;
         case ButtonSetting var19:
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var19, var19.O00000000, var19.O000000000000(), f, g, h, o0000O000O0OOO);
            break;
         default:
      }
   }

   public float O00000000(Setting o0000000OOO00O, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0) {
      return switch (o0000000OOO00O) {
         case NumberSetting var6 -> o0000O00000.O00000000(22.0F);
         case O000000O00 var7 -> o0000O00000.O00000000(18.0F);
         case ColorSetting var8 -> {
            float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000O(var8));
            yield o0000O00000.O00000000(16.0F) + o0000O00000.O00000000(186.0F) * var11;
         }
         case O000000O0 var9 -> o0000O00000.O00000000(var9.O0000000000());
         case GroupSetting var10 -> this.O00000000(var10, o0000O00000);
         default -> o0000O00000.O00000000(14.0F);
      };
   }

   public float O00000000(Setting o0000000OOO00O, O0000O00000 o0000O00000) {
      return switch (o0000000OOO00O) {
         case NumberSetting var5 -> o0000O00000.O00000000(22.0F);
         case O000000O00 var6 -> o0000O00000.O00000000(18.0F);
         case ColorSetting var7 -> o0000O00000.O00000000(22.0F);
         case O000000O0 var8 -> o0000O00000.O00000000(var8.O0000000000());
         case GroupSetting var9 -> this.O00000000(var9, o0000O00000);
         default -> o0000O00000.O00000000(14.0F);
      };
   }

   private float O00000000(GroupSetting o0000000OOOOOO, O0000O00000 o0000O00000) {
      float var3 = (o0000O00000.O0000000000OO() - o0000O00000.O00000000(32.0F)) * 0.7F;
      int var4 = O0000O00000OO.O00000000(o0000000OOOOOO, var3, o0000O00000);
      float var5 = o0000O00000.O00000000(14.0F);
      float var6 = o0000O00000.O00000000(3.0F);
      return o0000O00000.O00000000(2.0F) + var4 * var5 + (var4 > 1 ? (var4 - 1) * var6 : 0.0F);
   }

   public static float O00000000(float f) {
      return f * 0.4F;
   }

   public static float O00000000(float f, float g) {
      return f + g - O00000000(g);
   }

   public static float O00000000(ModeSetting o0000000OOOOO0, float f, O0000O00000 o0000O00000) {
      float var3 = f * 0.52F;
      float var4 = O0000O00000OO.O00000000(FontRegistry.O00000000, o0000000OOOOO0.O000000000000, 10.0F);
      return Math.max(o0000O00000.O00000000(52.0F), Math.min(var3, var4 + o0000O00000.O00000000(26.0F)));
   }

   public static float O00000000(ModeSetting o0000000OOOOO0, float f, float g, O0000O00000 o0000O00000) {
      return f + g - O00000000(o0000000OOOOO0, g, o0000O00000);
   }

   public static float O00000000(float f, O0000O00000 o0000O00000) {
      return f - o0000O00000.O00000000(1.0F);
   }

   public static float O00000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(16.0F);
   }

   public static float O000000000(float f) {
      return f;
   }

   public static float O000000000(float f, float g) {
      return f;
   }

   public static float O00000000(O000000O00 o000000O00, float f, O0000O00000 o0000O00000) {
      String var3 = o000000O00 == null ? "None" : o000000O00.O00000000000O();
      float var4 = f * 0.62F;
      float var5 = O0000O00000OO.O00000000(FontRegistry.O00000000, var3, 10.0F);
      return Math.max(o0000O00000.O00000000(86.0F), Math.min(var4, var5 + o0000O00000.O00000000(38.0F)));
   }

   public static float O00000000(O000000O00 o000000O00, float f, float g, O0000O00000 o0000O00000) {
      return f + g - O00000000(o000000O00, g, o0000O00000);
   }

   public static float O000000000(float f, O0000O00000 o0000O00000) {
      return f - o0000O00000.O00000000(1.0F);
   }

   public static float O000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(18.0F);
   }

   public static float O00000000(O000000O00 o000000O00, O0000O00000 o0000O00000) {
      int var2 = o000000O00 == null ? 1 : Math.max(1, o000000O00.O0000000000().size());
      return o0000O00000.O00000000(8.0F) + var2 * O0000000000(o0000O00000) + o0000O00000.O00000000(6.0F);
   }

   public static float O0000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(58.0F);
   }

   public static float O00000000(float f, float g, O0000O00000 o0000O00000) {
      return f + g - o0000O00000.O00000000(12.0F) - o0000O00000.O00000000(3.0F);
   }

   public static float O0000000000(float f, O0000O00000 o0000O00000) {
      return f - o0000O00000.O00000000(1.0F);
   }

   public static float O00000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(18.0F);
   }

   public static float O000000000(float f, float g, O0000O00000 o0000O00000) {
      return f + g - o0000O00000.O00000000(12.0F) - o0000O00000.O00000000(3.0F);
   }

   public static float O00000000000(float f, O0000O00000 o0000O00000) {
      return f - o0000O00000.O00000000(2.0F);
   }

   public static float O000000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(18.0F);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, BooleanSetting o0000000OOO0O0, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      float var10 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O00000000(o0000000OOO0O0), o0000000OOO0O0.O0000000000() ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
      );
      float var11 = var8.O00000000(12.0F);
      float var12 = f + h - var11;
      boolean var13 = o0000O000O0O0.O0000000OOO00() == o0000000OOO0O0;
      String var14 = var13 ? o0000000OOO0O0.O00000000 + " ..." : O0000O00000OO.O00000000(o0000000OOO0O0);
      this.O00000000(o0000O00OO0O0, var8, var14, f, g, var8.O00000000(14.0F), 12.0F, var12 - f - var8.O00000000(8.0F), O0000O00000OO.O00000000(var9));
      String var15 = O0000O000O00O0.O0000000000(o0000000OOO0O0);
      float var16 = o0000O000O0O0.O00000000(
         var15,
         O0000O00000OO.O00000000(
               o0000O000O0O0, var12 - var8.O00000000(3.0F), g - var8.O00000000(2.0F), var11 + var8.O00000000(6.0F), var11 + var8.O00000000(6.0F)
            )
            ? 1.0F
            : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      float var17 = O0000O00000OO.O00000000(var16, o0000O000O0O0.O000000000(var15));
      o0000O00OO0O0.O00000000(var17, var12 + var11 * 0.5F, g + var8.O00000000(1.0F) + var11 * 0.5F);
      boolean var20 = false /* VF: Semaphore variable */;

      try {
         var20 = true;
         o0000O00OO0O0.O00000000(var12, g + var8.O00000000(1.0F), var11, var11, var8.O00000000(4.0F), RenderManager.W382.O00000000000(255, 255, 255, 30));
         o0000O00OO0O0.O00000000(
            var12,
            g + var8.O00000000(1.0F),
            var11,
            var11,
            var8.O00000000(4.0F),
            ColorScheme.O00000000(var9.O0000000000O(), ColorScheme.O00000000(var9.O000000000O0(), 95), Math.max(var10 * 0.5F, var16)),
            0.5F
         );
         if (var10 > 0.01F) {
            o0000O00OO0O0.O000000000(
               var12 + var8.O00000000(2.0F),
               g + var8.O00000000(3.0F),
               var8.O00000000(8.0F),
               var8.O00000000(8.0F),
               var8.O00000000(8.0F),
               ColorScheme.O00000000(var9.O000000000O0(), Math.round(255.0F * var10)),
               ColorScheme.O00000000(var9.O000000000O00(), Math.round(255.0F * var10))
            );
            var20 = false;
         } else {
            var20 = false;
         }
      } finally {
         if (var20) {
            o0000O00OO0O0.O00000000000O0();
         }
      }

      o0000O00OO0O0.O00000000000O0();
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, NumberSetting o000000O000, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      float var10 = (o000000O000.O00000000000 - o000000O000.O000000000000) / (o000000O000.O0000000000000 - o000000O000.O000000000000);
      String var11 = O0000O000O00O0.O00000000(o000000O000) + "_prog";
      float var12 = o0000O000O0O0.O00000000(var11, var10, O0000O000O0O00.O00000000000OO());
      float var13 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000O(o000000O000));
      float var14 = Math.max(0.0F, Math.min(1.0F, var12 + (var10 - var12) * var13 * 0.85F));
      String var15 = O0000O000O00O0.O000000000(o000000O000);
      float var16 = o0000O000O0O0.O00000000(
         var15, O0000O00000OO.O00000000(o0000O000O0O0, f, g + var8.O00000000(11.0F), h, var8.O00000000(14.0F)) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
      );
      long var17 = System.currentTimeMillis();
      float var19 = (float)(var17 % 1000L) / 1000.0F;
      float var20 = var10 - var12;
      float var21 = o000000O000.O000000000000 + var14 * (o000000O000.O0000000000000 - o000000O000.O000000000000);
      String var22 = o000000O000.O00000000000()
         ? o000000O000.O000000000(o000000O000.O00000000000)
         : O0000O00000OO.O000000000(var21, o000000O000.O000000000000O);
      float var23 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var22, 12.0F);
      int var24 = ColorScheme.O00000000(O0000O00000OO.O000000000(var9), var9.O000000000O0(), var13 * 0.8F);
      float var25 = f + h - var23;
      this.O00000000(
         o0000O00OO0O0, var8, o000000O000.O00000000, f, g, var8.O00000000(14.0F), 12.0F, var25 - f - var8.O00000000(8.0F), O0000O00000OO.O00000000(var9)
      );
      O0000O00000OO.O00000000(o0000O00OO0O0, var8, FontRegistry.O00000000000, var25, g, var8.O00000000(14.0F), 12.0F, var22, var24);
      float var26 = g + var8.O00000000(17.0F);
      float var27 = var8.O00000000(5.0F);
      float var28 = var27 * 0.5F;
      float var29 = h * var14;
      o0000O00OO0O0.O00000000(f, var26, h, var27, var28, ColorScheme.O00000000(var9.O00000000000O0(), var9.O0000000000O(), var16 * 0.42F));
      int var30 = o000000O000.O00000000000() ? o000000O000.O0000000000O0.length - 1 : 5;

      for (int var31 = 1; var31 < var30; var31++) {
         float var32 = f + h * var31 / var30 - var8.O00000000(0.5F);
         o0000O00OO0O0.O00000000(
            var32, var26 + var8.O00000000(1.0F), var8.O00000000(1.0F), var27 - var8.O00000000(2.0F), var8.O00000000(0.5F), var9.O0000000000O()
         );
      }

      if (var29 > 1.0F) {
         o0000O00OO0O0.O00000000(f, var26, var29, var27, var28, var9.O000000000O00(), var9.O000000000O0());
         float var48 = 0.75F + 0.25F * (float)Math.sin(var19 * Math.PI * 2.0);
         float var50 = var14 * (1.0F + var13 * 0.6F);
         int var33 = var9.O000000000O000()
            ? ColorScheme.O00000000(0, 0, 0, Math.round((18.0F + var13 * 10.0F) * var48 * var50))
            : ColorScheme.O00000000(var9.O000000000O0(), Math.round((22.0F + var13 * 18.0F) * var48 * var50));
         o0000O00OO0O0.O00000000(
            f,
            var26,
            var29,
            var27,
            var28,
            var8.O00000000((var9.O000000000O000() ? 7 : 10) + var13 * 6.0F) * var48 * var50,
            var8.O00000000(var9.O000000000O000() ? 1.5F : 2.0F),
            var33
         );
         float var34 = var8.O00000000(8.0F + var13 * 6.0F);
         float var35 = Math.max(f, f + var29 - var34);
         o0000O00OO0O0.O00000000(
            var35,
            var26 - var8.O00000000(0.5F),
            Math.min(var34, var29),
            var27 + var8.O00000000(1.0F),
            var28,
            ColorScheme.O00000000(var9.O000000000O0(), 0),
            ColorScheme.O00000000(var9.O000000000O0(), Math.round((40.0F + var13 * 35.0F) * var48 * var50))
         );
      }

      float var49 = Math.abs(var20);
      float var51 = var13 * Math.min(0.3F, var49 * 8.0F);
      float var52 = Math.min(0.5F, var49 * 5.0F + var51);
      float var53 = var8.O00000000(5.5F);
      float var54 = var53 * 2.0F;
      float var36 = O0000O00000OO.O00000000(var16, o0000O000O0O0.O000000000(var15), 0.018F, 0.006F);
      float var37 = 1.0F + var13 * 0.12F;
      float var38 = var54 * (1.0F + var52) * var36 * var37;
      float var39 = var54 * (1.0F - var52 * 0.35F) * var36 * var37;
      float var40 = var39 * 0.5F;
      float var41 = f + h * var14;
      float var42 = Math.signum(var20) * Math.min(var8.O00000000(1.5F), var49 * var8.O00000000(20.0F));
      var41 += var42;
      float var43 = var41 - var38 * 0.5F;
      float var44 = var26 + (var27 - var39) * 0.5F;
      if (var13 > 0.01F) {
         float var45 = 0.6F + 0.4F * (float)Math.sin(var19 * Math.PI * 3.0);
         float var46 = var8.O00000000(14.0F) * var13 * var45;
         int var47 = var9.O000000000O000()
            ? ColorScheme.O00000000(0, 0, 0, Math.round(22.0F * var13 * var45))
            : ColorScheme.O00000000(var9.O000000000O0(), Math.round(35.0F * var13 * var45));
         o0000O00OO0O0.O00000000(
            var43 - var8.O00000000(2.0F),
            var44 - var8.O00000000(2.0F),
            var38 + var8.O00000000(4.0F),
            var39 + var8.O00000000(4.0F),
            var40 + var8.O00000000(2.0F),
            var46,
            var8.O00000000(2.0F),
            var47
         );
      }

      if (var14 > 0.01F) {
         float var56 = 0.5F + 0.5F * (float)Math.sin(var19 * Math.PI * 2.0);
         int var58 = var9.O000000000O000()
            ? ColorScheme.O00000000(0, 0, 0, Math.round(14.0F * var14 * var56))
            : ColorScheme.O00000000(var9.O000000000O0(), Math.round(18.0F * var14 * var56));
         o0000O00OO0O0.O00000000(
            var43 - var8.O00000000(1.0F),
            var44 - var8.O00000000(1.0F),
            var38 + var8.O00000000(2.0F),
            var39 + var8.O00000000(2.0F),
            var40 + var8.O00000000(1.0F),
            var8.O00000000(8.0F) * var56 * var14,
            var8.O00000000(1.0F),
            var58
         );
      }

      o0000O00OO0O0.O00000000(
         var43 + var8.O00000000(0.5F),
         var44 + var8.O00000000(1.0F),
         var38,
         var39,
         var40,
         var8.O00000000(3.0F),
         var8.O00000000(0.5F),
         ColorScheme.O00000000(0, 0, 0, 50)
      );
      o0000O00OO0O0.O000000000(var43, var44, var38, var39, var40, O0000O00000OO.O000000000000(var9), O0000O00000OO.O0000000000000(var9));
      if (var14 > 0.01F) {
         float var57 = Math.max(var14, var13);
         o0000O00OO0O0.O00000000(
            var43 + var8.O00000000(1.0F),
            var44 + var8.O00000000(1.0F),
            var38 - var8.O00000000(2.0F),
            var39 - var8.O00000000(2.0F),
            Math.max(0.0F, var40 - var8.O00000000(1.0F)),
            ColorScheme.O00000000(var9.O000000000O0(), Math.round((80.0F + var13 * 40.0F) * var57)),
            0.7F
         );
      }

      o0000O00OO0O0.O00000000(
         var41 - var53 * 0.4F,
         var44 + var8.O00000000(1.0F),
         var53 * 0.8F,
         var39 * 0.3F,
         var40 * 0.4F,
         ColorScheme.O00000000(var9.O000000000O000() ? -16777216 : var9.O000000000O(), var9.O000000000O000() ? 16 : 18)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      float var10 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000O(o0000000OOOO0O));
      float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O(o0000000OOOO0O), o0000000OOOO0O.O00000000000(), O0000O000O0O00.O00000000000OO());
      float var12 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O0(o0000000OOOO0O), o0000000OOOO0O.O0000000000OO, O0000O000O0O00.O00000000000OO());
      int var13 = O0000O00000OO.O0000000000(var11, o0000000OOOO0O.O0000000000O00, o0000000OOOO0O.O0000000000O0O, var12);
      float var14 = var8.O00000000(12.0F);
      float var15 = f + h - var14;
      float var16 = g + var8.O00000000(1.0F);
      float var17 = var8.O00000000(3.0F);
      this.O00000000(
         o0000O00OO0O0, var8, o0000000OOOO0O.O00000000, f, g, var8.O00000000(14.0F), 12.0F, var15 - f - var8.O00000000(8.0F), O0000O00000OO.O00000000(var9)
      );
      String var18 = O0000O000O00O0.O0000000000(o0000000OOOO0O);
      float var19 = o0000O000O0O0.O00000000(
         var18,
         O0000O00000OO.O00000000(
               o0000O000O0O0, var15 - var8.O00000000(3.0F), var16 - var8.O00000000(3.0F), var14 + var8.O00000000(6.0F), var14 + var8.O00000000(6.0F)
            )
            ? 1.0F
            : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var19, o0000O000O0O0.O000000000(var18)), var15 + var14 * 0.5F, var16 + var14 * 0.5F);

      try {
         o0000O00OO0O0.O00000000(var15, var16, var14, var14, var17, var17, var17, var17);

         try {
            this.O00000000(o0000O00OO0O0, var15, var16, var14, var14, this.O00000000(var8, 0.74F), 1.0F);
         } finally {
            o0000O00OO0O0.O0000000000000();
         }

         o0000O00OO0O0.O00000000(var15, var16, var14, var14, var17, var13);
         o0000O00OO0O0.O00000000(
            var15, var16, var14, var14 * 0.55F, var17, var17, 0.0F, 0.0F, ColorScheme.O00000000(-1, 60), ColorScheme.O00000000(-1, 60), 0, 0
         );
         int var20 = ColorScheme.O00000000(var9.O000000000O000() ? -16777216 : -1, 102);
         o0000O00OO0O0.O00000000(var15, var16, var14, var14, var17, ColorScheme.O00000000(var20, ColorScheme.O00000000(var9.O000000000O0(), 180), var19), 0.5F);
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }

      if (var10 > 0.01F) {
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000000OOOO0O, f, g + var8.O00000000(16.0F), h, var10, o0000O000O0OOO);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f, float g, float h, float i, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var9 = o0000O000O0OOO.O000000000000();
      ColorScheme var10 = o0000O000O0OOO.O0000000000000();
      float var11 = var9.O00000000(186.0F) * i;
      float var12 = var9.O00000000(5.0F);
      float var13 = var9.O00000000(12.0F);
      float var14 = var9.O00000000(5.0F);
      float var15 = var9.O00000000(9.0F);
      float var16 = var9.O00000000(16.0F);
      float var17 = var9.O00000000(16.0F);
      float var18 = var9.O00000000(14.0F);
      float var19 = var9.O00000000(12.0F);
      float var20 = h - var13 - var14;
      float var21 = var11 - var12 * 2.0F - var15 - var16 - var17 - var18 - var19 - var14 * 5.0F;
      float var22 = g + var12;
      float var23 = f + var20 + var14;
      float var24 = var22 + var21 + var14;
      float var25 = var24 + var15 + var14;
      float var26 = var25 + var16 + var14;
      float var27 = var26 + var17 + var14;
      float var28 = var27 + var18 + var14;
      float var29 = var9.O00000000(5.0F);
      if (o0000O000O0O0.O0000000OOOOOO() == o0000000OOOO0O && i > 0.025F) {
         o0000O000O0O0.O00000000O000O(f);
         o0000O000O0O0.O00000000O00O(var22);
         o0000O000O0O0.O00000000O00O0(Math.max(0.0F, var20));
         o0000O000O0O0.O00000000O00OO(Math.max(0.0F, var21));
         o0000O000O0O0.O00000000O0O(var23);
         o0000O000O0O0.O00000000O0O0(var22);
         o0000O000O0O0.O00000000O0O00(Math.max(0.0F, var13));
         o0000O000O0O0.O00000000O0O0O(Math.max(0.0F, var21));
         o0000O000O0O0.O00000000O0OO(f);
         o0000O000O0O0.O00000000O0OO0(var24);
         o0000O000O0O0.O00000000O0OOO(Math.max(0.0F, h));
         o0000O000O0O0.O00000000OO(Math.max(0.0F, var15));
         o0000O000O0O0.O00000000OO0(f);
         o0000O000O0O0.O00000000OO00(var25);
         o0000O000O0O0.O00000000OO000(Math.max(0.0F, h));
         o0000O000O0O0.O00000000OO00O(Math.max(0.0F, var16));
         o0000O000O0O0.O00000000OO0O(f);
         o0000O000O0O0.O00000000OO0O0(var26);
         o0000O000O0O0.O00000000OO0OO(Math.max(0.0F, h));
         o0000O000O0O0.O00000000OOO(Math.max(0.0F, var17));
         o0000O000O0O0.O00000000OOO0(f);
         o0000O000O0O0.O00000000OOO00(var27);
         o0000O000O0O0.O00000000OOO0O(Math.max(0.0F, h));
         o0000O000O0O0.O00000000OOOO(Math.max(0.0F, var18));
      }

      if (!(var21 <= 1.0F) && !(var20 <= 1.0F)) {
         o0000O00OO0O0.O000000000000(i);

         try {
            float var30 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O(o0000000OOOO0O), o0000000OOOO0O.O00000000000(), O0000O000O0O00.O00000000000OO());
            float var31 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O0(o0000000OOOO0O), o0000000OOOO0O.O0000000000OO, O0000O000O0O00.O00000000000OO());
            int var32 = O0000O00000OO.O00000000(var30, 1.0F, 1.0F);
            int var33 = ColorScheme.O00000000(255, 255, 255, 255);
            int var34 = ColorScheme.O00000000(0, 0, 0, 255);
            int var35 = ColorScheme.O00000000(0, 0, 0, 0);
            o0000O00OO0O0.O00000000(
               f - var9.O00000000(3.0F),
               g + var9.O00000000(1.0F),
               h + var9.O00000000(6.0F),
               var11 - var9.O00000000(2.0F),
               var9.O00000000(7.0F),
               ColorScheme.O00000000(var10.O00000000000O(), var10.O00000000000O0(), i)
            );
            o0000O00OO0O0.O00000000(
               f - var9.O00000000(3.0F),
               g + var9.O00000000(1.0F),
               h + var9.O00000000(6.0F),
               var11 - var9.O00000000(2.0F),
               var9.O00000000(7.0F),
               var10.O0000000000O(),
               0.5F
            );
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(f, var22, var20, var21, var29, var29, var29, var29);

            try {
               o0000O00OO0O0.O00000000(f, var22, var20, var21, var33, var32, var32, var33);
               o0000O00OO0O0.O00000000(f, var22, var20, var21, var35, var35, var34, var34);
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            o0000O00OO0O0.O00000000(f, var22, var20, var21, var29, var10.O0000000000O0(), 0.5F);
            O0000O00000OO.O00000000(o0000O00OO0O0, var23, var22, var13, var21, var29);
            o0000O00OO0O0.O00000000(var23, var22, var13, var21, var29, var10.O0000000000O0(), 0.5F);
            float var36 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000O0(o0000000OOOO0O), o0000000OOOO0O.O0000000000O00, O0000O000O0O00.O00000000000OO());
            float var37 = o0000O000O0O0.O00000000(
               O0000O000O00O0.O00000000000OO(o0000000OOOO0O), 1.0F - o0000000OOOO0O.O0000000000O0O, O0000O000O0O00.O00000000000OO()
            );
            float var38 = f + var36 * var20;
            float var39 = var22 + var37 * var21;
            float var40 = var9.O00000000(5.0F);
            int var41 = O0000O00000OO.O00000000(var30, var36, 1.0F - var37);
            o0000O00OO0O0.O00000000(
               var38 - var40,
               var39 - var40,
               var40 * 2.0F,
               var40 * 2.0F,
               var40,
               var9.O00000000(4.0F),
               var9.O00000000(1.0F),
               var10.O000000000O000() ? ColorScheme.O00000000(0, 0, 0, 34) : ColorScheme.O00000000(var41, 40)
            );
            o0000O00OO0O0.O00000000(var38 - var40, var39 - var40, var40 * 2.0F, var40 * 2.0F, var40, var10.O000000000O(), 1.5F);
            o0000O00OO0O0.O00000000(
               var38 - var40 + 1.0F,
               var39 - var40 + 1.0F,
               var40 * 2.0F - 2.0F,
               var40 * 2.0F - 2.0F,
               Math.max(0.0F, var40 - 1.0F),
               ColorScheme.O00000000(0, 0, 0, 80),
               0.5F
            );
            float var42 = var22 + var30 * var21;
            float var43 = var9.O00000000(4.0F);
            float var44 = var13 + var9.O00000000(2.0F);
            o0000O00OO0O0.O00000000(var23 - var9.O00000000(1.0F), var42 - var43 * 0.5F, var44, var43, var9.O00000000(2.0F), var10.O000000000O());
            o0000O00OO0O0.O00000000(
               var23 - var9.O00000000(1.0F), var42 - var43 * 0.5F, var44, var43, var9.O00000000(2.0F), ColorScheme.O00000000(0, 0, 0, 60), 0.5F
            );
            o0000O00OO0O0.O00000000(f, var24, h, var15, var9.O00000000(3.0F), var9.O00000000(3.0F), var9.O00000000(3.0F), var9.O00000000(3.0F));

            try {
               this.O00000000(o0000O00OO0O0, f, var24, h, var15, this.O00000000(var9, 1.0F), 1.0F);
               int var45 = O0000O00000OO.O0000000000(var30, o0000000OOOO0O.O0000000000O00, o0000000OOOO0O.O0000000000O0O, 0.0F);
               int var46 = O0000O00000OO.O0000000000(var30, o0000000OOOO0O.O0000000000O00, o0000000OOOO0O.O0000000000O0O, 1.0F);
               o0000O00OO0O0.O00000000(f, var24, h, var15, var9.O00000000(3.0F), var45, var46);
            } finally {
               o0000O00OO0O0.O0000000000000();
            }

            o0000O00OO0O0.O00000000(f, var24, h, var15, var9.O00000000(3.0F), var10.O0000000000O0(), 0.5F);
            float var61 = f + var31 * h;
            o0000O00OO0O0.O00000000(
               var61 - var9.O00000000(2.0F),
               var24 - var9.O00000000(2.0F),
               var9.O00000000(4.0F),
               var15 + var9.O00000000(4.0F),
               var9.O00000000(2.0F),
               var9.O00000000(4.0F),
               var9.O00000000(1.0F),
               ColorScheme.O00000000(0, 0, 0, 70)
            );
            o0000O00OO0O0.O00000000(
               var61 - var9.O00000000(1.5F),
               var24 - var9.O00000000(1.0F),
               var9.O00000000(3.0F),
               var15 + var9.O00000000(2.0F),
               var9.O00000000(1.5F),
               var10.O000000000O()
            );
            o0000O00OO0O0.O00000000(
               var61 - var9.O00000000(1.5F),
               var24 - var9.O00000000(1.0F),
               var9.O00000000(3.0F),
               var15 + var9.O00000000(2.0F),
               var9.O00000000(1.5F),
               ColorScheme.O00000000(0, 0, 0, 80),
               0.5F
            );
            this.O00000000(o0000O00OO0O0, var9, var10, f, var25, h, var16, var30, o0000000OOOO0O.O0000000000O00, o0000000OOOO0O.O0000000000O0O, var31);
            this.O00000000(o0000O00OO0O0, var9, var10, o0000000OOOO0O, f, var26, h, var17, var31);
            int var62 = O0000O00000OO.O0000000000(var30, o0000000OOOO0O.O0000000000O00, o0000000OOOO0O.O0000000000O0O, var31);
            int var47 = o0000O000O0O0.O000000000(o0000000OOOO0O);
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var9, var10, o0000000OOOO0O, f, var27, h, var18, var62, var47);
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var9, var10, o0000000OOOO0O, f, var28, h, var19, var62, var31);
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      ColorSetting o0000000OOOO0O,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k
   ) {
      float var12 = o0000O00000.O00000000(4.0F);
      float var13 = (h - var12) * 0.5F;
      float var15 = f + var13 + var12;
      float var16 = Math.min(i, var13);
      float var17 = var16 * 0.5F;
      float var18 = f + (var13 - var16) * 0.5F;
      float var19 = var15 + (var13 - var16) * 0.5F;
      if (o0000O000O0O0.O0000000OOOOOO() == o0000000OOOO0O) {
         o0000O000O0O0.O00000000OOOO0(var15);
         o0000O000O0O0.O00000000OOOOO(var13);
      }

      float[] var20 = this.O00000000(o0000O00OO0O0, var18, g, var16, var16);
      float[] var21 = this.O00000000(o0000O00OO0O0, var19, g, var16, var16);
      float var22 = this.O00000000(o0000O00OO0O0, var17);
      float var23 = o0000O00OO0O0.O0000000000O00();
      boolean var24 = o0000O000O0O0.O0000000OOOOOO() == o0000000OOOO0O && !o0000O000O0O0.O00000000OOOOO();
      o0000O00OO0O0.O0000000000();
      if (!var24
         || !O00000OO0O0O0O.O00000000(
            var20[0],
            var20[1],
            var20[2],
            var20[3],
            j,
            k,
            o0000O000O0OO.O000000000O0(),
            o0000O000O0OO.O000000000O00(),
            o0000O000O0O0.O0000000O(),
            o0000O000O0O0.O0000000O0(),
            var22,
            var23,
            true
         )) {
         if ((j >>> 24 & 0xFF) < 250) {
            o0000O00OO0O0.O00000000(var18, g, var16, var16, var17, var17, var17, var17);

            try {
               this.O00000000(o0000O00OO0O0, var18, g, var16, var16, this.O00000000(o0000O00000, 1.0F), 1.0F);
            } finally {
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O000000000(var18 + var17, g + var17, var17, 0.0F, 1.0F, j);
      }

      if (!var24
         || !O00000OO0O0O0O.O00000000(
            var21[0],
            var21[1],
            var21[2],
            var21[3],
            k,
            j,
            o0000O000O0OO.O000000000O00(),
            o0000O000O0OO.O000000000O0(),
            o0000O000O0O0.O0000000O(),
            o0000O000O0O0.O0000000O0(),
            var22,
            var23,
            false
         )) {
         if ((k >>> 24 & 0xFF) < 250) {
            o0000O00OO0O0.O00000000(var19, g, var16, var16, var17, var17, var17, var17);
            boolean var29 = false /* VF: Semaphore variable */;

            try {
               var29 = true;
               this.O00000000(o0000O00OO0O0, var19, g, var16, var16, this.O00000000(o0000O00000, 1.0F), 1.0F);
               var29 = false;
            } finally {
               if (var29) {
                  o0000O00OO0O0.O0000000000000();
               }
            }

            o0000O00OO0O0.O0000000000000();
         }

         o0000O00OO0O0.O000000000(var19 + var17, g + var17, var17, 0.0F, 1.0F, k);
      }

      o0000O00OO0O0.O00000000(var18, g, var16, var16, var17, o0000O000O0OO.O0000000000O0(), 0.5F);
      o0000O00OO0O0.O00000000(var19, g, var16, var16, var17, o0000O000O0OO.O0000000000O0(), 0.5F);
      float var25 = var15 - var12 * 0.5F;
      o0000O00OO0O0.O000000000(
         var25 - o0000O00000.O00000000(0.5F),
         g + o0000O00000.O00000000(2.0F),
         o0000O00000.O00000000(1.0F),
         i - o0000O00000.O00000000(4.0F),
         o0000O00000.O00000000(0.5F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 120),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 90)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      ColorSetting o0000000OOOO0O,
      float f,
      float g,
      float h,
      float i,
      int j,
      float k
   ) {
      float var12 = h * 0.62F;
      float var13 = h * 0.32F;
      float var15 = f + h - var13;
      float var16 = i + o0000O00000.O00000000(4.0F);
      float var17 = g - o0000O00000.O00000000(2.0F);
      float var18 = o0000O00000.O00000000(3.0F);
      if (o0000O000O0O0.O0000000OOOOOO() == o0000000OOOO0O) {
         o0000O000O0O0.O0000000O(f);
         o0000O000O0O0.O0000000O0(var17);
         o0000O000O0O0.O0000000O00(var12);
         o0000O000O0O0.O0000000O000(var16);
         o0000O000O0O0.O0000000O0000(var15);
         o0000O000O0O0.O0000000O00000(var17);
         o0000O000O0O0.O0000000O0000O(var13);
         o0000O000O0O0.O0000000O000O(var16);
      }

      boolean var19 = o0000O000O0O0.O000000O0O00O() == o0000000OOOO0O;
      boolean var20 = o0000O000O0O0.O000000O0O00OO() == o0000000OOOO0O;
      boolean var21 = System.currentTimeMillis() / 500L % 2L == 0L;
      int var22 = ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 36), var19 ? 1.0F : 0.0F);
      o0000O00OO0O0.O00000000(f, var17, var12, var16, var18, var22);
      if (var19) {
         o0000O00OO0O0.O00000000(f, var17, var12, var16, var18, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 220), 1.0F);
      } else {
         o0000O00OO0O0.O00000000(f, var17, var12, var16, var18, o0000O000O0OO.O0000000000O0(), 0.5F);
      }

      String var23;
      if (var19) {
         String var24 = o0000O000O0O0.O000000O0O00O0();
         var23 = "#" + (var24 == null ? "" : var24) + (var21 ? "|" : " ");
      } else {
         var23 = String.format("#%02X%02X%02X", j >>> 16 & 0xFF, j >>> 8 & 0xFF, j & 0xFF);
      }

      int var30 = var19 ? o0000O000O0OO.O000000000O() : o0000O000O0OO.O0000000000OOO();
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(6.0F),
         var17,
         var16,
         8.0F,
         O0000O00000OO.O00000000(FontRegistry.O00000000, var23, 8.0F, var12 - o0000O00000.O00000000(12.0F)),
         var30
      );
      int var25 = ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 36), var20 ? 1.0F : 0.0F);
      o0000O00OO0O0.O00000000(var15, var17, var13, var16, var18, var25);
      if (var20) {
         o0000O00OO0O0.O00000000(var15, var17, var13, var16, var18, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 220), 1.0F);
      } else {
         o0000O00OO0O0.O00000000(var15, var17, var13, var16, var18, o0000O000O0OO.O0000000000O0(), 0.5F);
      }

      String var26;
      if (var20) {
         String var27 = o0000O000O0O0.O000000O0O0O();
         var26 = (var27 == null ? "" : var27) + (var21 ? "|" : " ") + "%";
      } else {
         var26 = Math.round(k * 100.0F) + "%";
      }

      int var31 = var20 ? o0000O000O0OO.O000000000O() : o0000O000O0OO.O0000000000OOO();
      float var28 = O0000O00000OO.O00000000(FontRegistry.O00000000, var26, 8.0F);
      float var29 = var15 + (var13 - var28) * 0.5F;
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var29, var17, var16, 8.0F, var26, var31);
   }

   private float[] O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      float[] var6 = o0000O00OO0O0.O0000000000O().O000000000000();
      float var7 = this.O00000000(var6, f, g);
      float var8 = this.O000000000(var6, f, g);
      float var9 = this.O00000000(var6, f + h, g);
      float var10 = this.O000000000(var6, f + h, g);
      float var11 = this.O00000000(var6, f + h, g + i);
      float var12 = this.O000000000(var6, f + h, g + i);
      float var13 = this.O00000000(var6, f, g + i);
      float var14 = this.O000000000(var6, f, g + i);
      float var15 = Math.min(Math.min(var7, var9), Math.min(var11, var13));
      float var16 = Math.min(Math.min(var8, var10), Math.min(var12, var14));
      float var17 = Math.max(Math.max(var7, var9), Math.max(var11, var13));
      float var18 = Math.max(Math.max(var8, var10), Math.max(var12, var14));
      return new float[]{var15, var16, Math.max(0.0F, var17 - var15), Math.max(0.0F, var18 - var16)};
   }

   private float O00000000(RenderManager o0000O00OO0O0, float f) {
      float[] var3 = o0000O00OO0O0.O0000000000O().O000000000000();
      float var4 = (float)Math.sqrt(var3[0] * var3[0] + var3[3] * var3[3]);
      float var5 = (float)Math.sqrt(var3[1] * var3[1] + var3[4] * var3[4]);
      return f * Math.max(0.001F, (var4 + var5) * 0.5F);
   }

   private float O00000000(float[] fs, float f, float g) {
      return fs[0] * f + fs[1] * g + fs[2];
   }

   private float O000000000(float[] fs, float f, float g) {
      return fs[3] * f + fs[4] * g + fs[5];
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k, float l, float m
   ) {
      float var12 = o0000O00000.O00000000(3.0F);
      byte var13 = 5;
      float var14 = (h - var12 * (var13 - 1)) / var13;
      float var15 = o0000O00000.O00000000(4.0F);
      float[] var16 = new float[]{0.0F, 0.5F, -0.083333336F, 0.083333336F, 0.33333334F};
      float var17 = Math.max(0.65F, k);
      float var18 = Math.max(0.72F, l);

      for (int var19 = 0; var19 < var13; var19++) {
         float var20 = f + var19 * (var14 + var12);
         float var21 = j + var16[var19];
         o0000O00OO0O0.O00000000(var20, g, var14, i, var15, var15, var15, var15);

         try {
            if (m < 0.995F) {
               this.O00000000(o0000O00OO0O0, var20, g, var14, i, this.O00000000(o0000O00000, 0.92F), 1.0F);
            }

            o0000O00OO0O0.O00000000(var20, g, var14, i, var15, O0000O00000OO.O0000000000(var21, var17, var18, m));
         } finally {
            o0000O00OO0O0.O0000000000000();
         }

         o0000O00OO0O0.O00000000(
            var20, g, var14, i, var15, var19 == 0 ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 120) : o0000O000O0OO.O0000000000O0(), 0.5F
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, ColorSetting o0000000OOOO0O, float f, float g, float h, float i, float j
   ) {
      byte var10 = 9;
      float var11 = o0000O00000.O00000000(3.0F);
      float var12 = (h - var11 * (var10 - 1)) / var10;
      float var13 = o0000O00000.O00000000(4.0F);
      int var14 = o0000000OOOO0O.O00000000000O0();

      for (int var15 = 0; var15 < var10; var15++) {
         float var16 = f + var15 * (var12 + var11);
         boolean var17 = var15 == 8;
         boolean var18 = !var17 && var15 < o0000000OOOO0O.O0000000000OO0.size();
         o0000O00OO0O0.O00000000(var16, g, var12, i, var13, var13, var13, var13);

         try {
            this.O00000000(o0000O00OO0O0, var16, g, var12, i, this.O00000000(o0000O00000, 0.92F), var18 ? 0.8F : 0.35F);
            if (var18) {
               o0000O00OO0O0.O00000000(var16, g, var12, i, var13, o0000000OOOO0O.O0000000000OO0.get(var15));
            } else {
               o0000O00OO0O0.O00000000(
                  var16, g, var12, i, var13, var17 ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 18) : o0000O000O0OO.O00000000000O0()
               );
            }
         } finally {
            o0000O00OO0O0.O0000000000000();
         }

         if (var17) {
            float var19 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "O", 8.0F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000O,
               var16 + (var12 - var19) * 0.5F,
               g,
               i,
               8.0F,
               "O",
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(160.0F + 70.0F * j))
            );
         }

         boolean var23 = var18 && o0000000OOOO0O.O0000000000OO0.get(var15) == var14;
         if (var23) {
            float var20 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "j", 7.0F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000O,
               var16 + (var12 - var20) * 0.5F,
               g,
               i,
               7.0F,
               "j",
               ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 220)
            );
         }

         int var24 = var23
            ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 160)
            : (var17 ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 95) : o0000O000O0OO.O0000000000O0());
         o0000O00OO0O0.O00000000(var16, g, var12, i, var13, var24, var23 ? 0.8F : 0.5F);
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      if (!(h <= 0.0F) && !(i <= 0.0F) && !(j <= 0.0F)) {
         boolean var8 = false;

         for (float var9 = g; var9 < g + i; var9 += j) {
            boolean var10 = var8;
            float var11 = Math.min(j, g + i - var9);

            for (float var12 = f; var12 < f + h; var12 += j) {
               float var13 = Math.min(j, f + h - var12);
               o0000O00OO0O0.O00000000(var12, var9, var13, var11, ColorScheme.O00000000(var10 ? -1577754 : -3945532, Math.round(255.0F * k)));
               var10 = !var10;
            }

            var8 = !var8;
         }
      }
   }

   private float O00000000(O0000O00000 o0000O00000, float f) {
      return Math.max(4.5F, o0000O00000.O00000000(6.0F * f));
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ModeSetting o0000000OOOOO0, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      float var10 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(o0000000OOOOO0));
      float var11 = O00000000(o0000000OOOOO0, h, var8);
      float var12 = O00000000(o0000000OOOOO0, f, h, var8);
      float var13 = O00000000(var8);
      float var14 = O00000000(g, var8);
      float var15 = var8.O00000000(5.0F);
      this.O00000000(
         o0000O00OO0O0, var8, o0000000OOOOO0.O00000000, f, g, var8.O00000000(14.0F), 12.0F, var12 - f - var8.O00000000(8.0F), O0000O00000OO.O00000000(var9)
      );
      String var16 = O0000O000O00O0.O0000000000(o0000000OOOOO0);
      float var17 = o0000O000O0O0.O00000000(
         var16, O0000O00000OO.O00000000(o0000O000O0O0, var12, var14, var11, var13) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
      );
      float var18 = O0000O00000OO.O00000000(var17, o0000O000O0O0.O000000000(var16));
      o0000O00OO0O0.O00000000(var18, var12 + var11 * 0.5F, var14 + var13 * 0.5F);

      try {
         o0000O00OO0O0.O00000000(
            var12, var14, var11, var13, var15, ColorScheme.O00000000(var9.O00000000000O0(), var9.O0000000000O(), Math.max(var10, var17 * 0.58F))
         );
         o0000O00OO0O0.O00000000(
            var12,
            var14,
            var11,
            var13,
            var15,
            ColorScheme.O00000000(var9.O0000000000O0(), ColorScheme.O00000000(var9.O000000000O0(), 120), Math.max(var10, var17)),
            0.5F
         );
         o0000O00OO0O0.O000000000(
            var12 + var8.O00000000(1.5F),
            var14 + var8.O00000000(3.0F),
            var8.O00000000(1.5F),
            var13 - var8.O00000000(6.0F),
            var8.O00000000(1.0F),
            ColorScheme.O00000000(var9.O000000000O0(), 200),
            ColorScheme.O00000000(var9.O000000000O00(), 180)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var8,
            FontRegistry.O00000000,
            var12 + var8.O00000000(7.0F),
            var14,
            var13,
            10.0F,
            O0000O00000OO.O00000000(FontRegistry.O00000000, o0000000OOOOO0.O000000000000, 10.0F, var11 - var8.O00000000(22.0F)),
            O0000O00000OO.O00000000(var9)
         );
         float var19 = var12 + var11 - var8.O00000000(12.0F);
         float var20 = var14 + var13 * 0.5F;
         int var21 = ColorScheme.O00000000(ColorScheme.O00000000(var9.O000000000O0(), 160), var9.O000000000O0(), Math.max(var10, var17 * 0.5F));
         float var22 = 1.0F - 2.0F * var10;
         if (Math.abs(var22) > 0.01F) {
            o0000O00OO0O0.O00000000(var22, var19, var20);

            try {
               O0000O00000OO.O00000000(o0000O00OO0O0, var8, FontRegistry.O00000000000O, var19, var14, var13, 7.0F, "k", var21);
            } finally {
               o0000O00OO0O0.O00000000000O0();
            }
         }
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }

      if (var10 > 0.01F) {
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000000OOOOO0, f, g, h, var10, o0000O000O0OOO);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ModeSetting o0000000OOOOO0, float f, float g, float h, float i, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var9 = o0000O000O0OOO.O000000000000();
      ColorScheme var10 = o0000O000O0OOO.O0000000000000();
      float var11 = O00000000(h);
      float var12 = O00000000(f, h);
      float var13 = g + var9.O00000000(14.0F) + var9.O00000000(4.0F);
      float var14 = var9.O00000000(18.0F);
      float var15 = var9.O00000000(3.0F);
      float var16 = var15 * 2.0F + o0000000OOOOO0.O00000000000.size() * var14;
      float var17 = var9.O00000000(6.0F);
      o0000O00OO0O0.O000000000000(i);

      try {
         o0000O00OO0O0.O00000000(var12, var13, var11, var16 * i, var17, var10.O00000000000O0());
         o0000O00OO0O0.O00000000(var12, var13, var11, var16 * i, var17, var10.O0000000000O0(), 0.5F);
         if (i > 0.5F) {
            for (int var18 = 0; var18 < o0000000OOOOO0.O00000000000.size(); var18++) {
               String var19 = o0000000OOOOO0.O00000000000.get(var18);
               boolean var20 = var18 == o0000000OOOOO0.O00000000000O;
               float var21 = var13 + var15 + var18 * var14;
               if (var20) {
                  o0000O00OO0O0.O00000000(
                     var12 + var9.O00000000(2.0F),
                     var21,
                     var11 - var9.O00000000(4.0F),
                     var14,
                     var9.O00000000(4.0F),
                     ColorScheme.O00000000(var10.O000000000O00(), 35),
                     ColorScheme.O00000000(var10.O000000000O0(), 20)
                  );
               }

               String var22 = O0000O000O00O0.O0000000000(o0000000OOOOO0, var18);
               boolean var23 = O0000O00000OO.O00000000(o0000O000O0O0, var12, var21, var11, var14);
               float var24 = o0000O000O0O0.O00000000(var22, var23 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
               if (var24 > 0.01F && !var20) {
                  o0000O00OO0O0.O00000000(
                     var12 + var9.O00000000(2.0F),
                     var21,
                     var11 - var9.O00000000(4.0F),
                     var14,
                     var9.O00000000(4.0F),
                     ColorScheme.O00000000(var10.O00000000000O(), var10.O00000000000OO(), var24)
                  );
               }

               int var25 = var20 ? var10.O000000000O0() : (var24 > 0.2F ? O0000O00000OO.O00000000(var10) : O0000O00000OO.O000000000(var10));
               if (var20) {
                  o0000O00OO0O0.O000000000(
                     var12 + var9.O00000000(4.0F),
                     var21 + var9.O00000000(3.0F),
                     var9.O00000000(1.5F),
                     var14 - var9.O00000000(6.0F),
                     var9.O00000000(1.0F),
                     ColorScheme.O00000000(var10.O000000000O0(), 200),
                     ColorScheme.O00000000(var10.O000000000O00(), 180)
                  );
               }

               o0000O00OO0O0.O00000000(
                  O0000O00000OO.O00000000(var24, o0000O000O0O0.O000000000(var22), 0.012F, 0.004F), var12 + var11 * 0.5F, var21 + var14 * 0.5F
               );

               try {
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var9,
                     FontRegistry.O00000000,
                     var12 + var9.O00000000(10.0F),
                     var21,
                     var14,
                     10.0F,
                     O0000O00000OO.O00000000(FontRegistry.O00000000, var19, 10.0F, var11 - var9.O00000000(18.0F)),
                     var25
                  );
               } finally {
                  o0000O00OO0O0.O00000000000O0();
               }
            }
         }
      } finally {
         o0000O00OO0O0.O00000000000OO();
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O000000O00 o000000O00, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      o000000O00.O0000000000();
      float var10 = var8.O00000000(18.0F);
      float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(o000000O00));
      float var12 = O00000000(o000000O00, h, var8);
      float var13 = O00000000(o000000O00, f, h, var8);
      float var14 = O000000000(g, var8);
      float var15 = O000000000(var8);
      float var16 = var8.O00000000(6.0F);
      this.O00000000(o0000O00OO0O0, var8, o000000O00.O00000000, f, g, var10, 12.0F, var13 - f - var8.O00000000(8.0F), O0000O00000OO.O00000000(var9));
      String var17 = O0000O000O00O0.O0000000000(o000000O00);
      float var18 = o0000O000O0O0.O00000000(
         var17, O0000O00000OO.O00000000(o0000O000O0O0, var13, var14, var12, var15) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
      );
      float var19 = Math.max(var11, var18);
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var18, o0000O000O0O0.O000000000(var17), 0.014F, 0.004F), var13 + var12 * 0.5F, var14 + var15 * 0.5F);

      try {
         o0000O00OO0O0.O00000000(var13, var14, var12, var15, var16, ColorScheme.O00000000(var9.O00000000000O0(), var9.O0000000000O(), var19 * 0.7F));
         o0000O00OO0O0.O00000000(
            var13, var14, var12, var15, var16, ColorScheme.O00000000(var9.O0000000000O0(), ColorScheme.O00000000(var9.O000000000O0(), 120), var19), 0.5F
         );
         float var20 = var8.O00000000(12.0F);
         float var21 = var13 + var8.O00000000(4.0F);
         float var22 = var14 + (var15 - var20) * 0.5F;
         o0000O00OO0O0.O000000000(
            var21, var22, var20, var20, var8.O00000000(4.0F), ColorScheme.O00000000(var9.O000000000O0(), 190), ColorScheme.O00000000(var9.O000000000O00(), 150)
         );
         float var23 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "W", 7.0F);
         O0000O00000OO.O00000000(o0000O00OO0O0, var8, FontRegistry.O00000000000O, var21 + (var20 - var23) * 0.5F, var22, var20, 7.0F, "W", var9.O000000000O());
         float var24 = var13 + var12 - var8.O00000000(11.0F);
         float var25 = 1.0F - 2.0F * var11;
         if (Math.abs(var25) > 0.01F) {
            o0000O00OO0O0.O00000000(var25, var24, var14 + var15 * 0.5F);

            try {
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var8,
                  FontRegistry.O00000000000O,
                  var24,
                  var14,
                  var15,
                  7.0F,
                  "k",
                  ColorScheme.O00000000(var9.O0000000000OOO(), var9.O000000000O0(), var19)
               );
            } finally {
               o0000O00OO0O0.O00000000000O0();
            }
         }

         String var26 = o000000O00.O00000000000O();
         int var27 = o000000O00.O00000000000OO()
            ? ColorScheme.O00000000(O0000O00000OO.O0000000000(var9), var9.O000000000O00(), 0.45F)
            : ColorScheme.O00000000(O0000O00000OO.O000000000(var9), O0000O00000OO.O00000000(var9), var18 * 0.48F + var11 * 0.22F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var8,
            FontRegistry.O00000000,
            var13 + var8.O00000000(20.0F),
            var14,
            var15,
            10.0F,
            O0000O00000OO.O00000000(FontRegistry.O00000000, var26, 10.0F, var12 - var8.O00000000(36.0F)),
            var27
         );
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }

      if (var11 > 0.01F) {
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o000000O00, f, g, h, var11, o0000O000O0OOO);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O000000O00 o000000O00, float f, float g, float h, float i, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var9 = o0000O000O0OOO.O000000000000();
      ColorScheme var10 = o0000O000O0OOO.O0000000000000();
      o000000O00.O0000000000();
      float var11 = O000000000(h);
      float var12 = O000000000(f, h);
      float var13 = g + var9.O00000000(18.0F) + var9.O00000000(5.0F);
      float var14 = O0000000000(var9);
      float var15 = var9.O00000000(4.0F);
      float var16 = var15 * 2.0F + o000000O00.O00000000000.size() * var14;
      float var17 = var9.O00000000(8.0F);
      o0000O00OO0O0.O000000000000(i);

      try {
         o0000O00OO0O0.O00000000(
            var12,
            var13,
            var11,
            var16 * i,
            var17,
            var9.O00000000(14.0F),
            var9.O00000000(1.0F),
            ColorScheme.O00000000(var10.O000000000O0(), Math.round(34.0F * i))
         );
         o0000O00OO0O0.O00000000(var12, var13, var11, var16 * i, var17, ColorScheme.O00000000(var10.O00000000000O0(), var10.O0000000000O(), 0.28F));
         o0000O00OO0O0.O00000000(
            var12, var13, var11, var16 * i, var17, ColorScheme.O00000000(var10.O0000000000O0(), ColorScheme.O00000000(var10.O000000000O0(), 112), i), 0.55F
         );
         if (i > 0.45F) {
            for (int var18 = 0; var18 < o000000O00.O00000000000.size(); var18++) {
               String var19 = o000000O00.O00000000000.get(var18);
               boolean var20 = o000000O00.O000000000(var19);
               float var21 = var13 + var15 + var18 * var14;
               String var22 = O0000O000O00O0.O0000000000(o000000O00, var18);
               float var23 = o0000O000O0O0.O00000000(
                  var22, O0000O00000OO.O00000000(o0000O000O0O0, var12, var21, var11, var14) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
               );
               float var24 = var12 + var9.O00000000(7.0F);
               float var25 = var21 + var9.O00000000(6.0F);
               float var26 = var9.O00000000(76.0F);
               float var27 = var14 - var9.O00000000(12.0F);
               if (var20) {
                  o0000O00OO0O0.O00000000(
                     var12 + var9.O00000000(3.0F),
                     var21 + var9.O00000000(1.0F),
                     var11 - var9.O00000000(6.0F),
                     var14 - var9.O00000000(2.0F),
                     var9.O00000000(6.0F),
                     ColorScheme.O00000000(var10.O000000000O00(), 42),
                     ColorScheme.O00000000(var10.O000000000O0(), 24)
                  );
                  o0000O00OO0O0.O00000000(
                     var12 + var9.O00000000(5.0F),
                     var21 + var9.O00000000(4.0F),
                     var11 - var9.O00000000(10.0F),
                     var14 - var9.O00000000(8.0F),
                     var9.O00000000(7.0F),
                     var9.O00000000(10.0F),
                     var9.O00000000(1.0F),
                     ColorScheme.O00000000(var10.O000000000O0(), Math.round(24.0F * i))
                  );
               } else if (var23 > 0.01F) {
                  o0000O00OO0O0.O00000000(
                     var12 + var9.O00000000(3.0F),
                     var21 + var9.O00000000(1.0F),
                     var11 - var9.O00000000(6.0F),
                     var14 - var9.O00000000(2.0F),
                     var9.O00000000(6.0F),
                     ColorScheme.O00000000(var10.O00000000000O(), var10.O0000000000O(), var23)
                  );
               }

               this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, o000000O00, var19, var24, var25, var26, var27, i);
               float var28 = var24 + var26 + var9.O00000000(10.0F);
               int var29 = var20 ? var10.O000000000O0() : ColorScheme.O00000000(O0000O00000OO.O000000000(var10), O0000O00000OO.O00000000(var10), var23 * 0.55F);
               String var30 = this.O00000000(o000000O00, var19);
               o0000O00OO0O0.O00000000(
                  O0000O00000OO.O00000000(var23, o0000O000O0O0.O000000000(var22), 0.01F, 0.003F), var12 + var11 * 0.5F, var21 + var14 * 0.5F
               );

               try {
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var9,
                     FontRegistry.O00000000,
                     var28,
                     var21 + var9.O00000000(8.0F),
                     var9.O00000000(16.0F),
                     10.0F,
                     O0000O00000OO.O00000000(FontRegistry.O00000000, var19, 10.0F, var12 + var11 - var9.O00000000(12.0F) - var28),
                     var29
                  );
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var9,
                     FontRegistry.O00000000,
                     var28,
                     var21 + var9.O00000000(29.0F),
                     var9.O00000000(14.0F),
                     8.0F,
                     O0000O00000OO.O00000000(FontRegistry.O00000000, var30, 8.0F, var12 + var11 - var9.O00000000(12.0F) - var28),
                     ColorScheme.O00000000(var10.O0000000000OO0(), var10.O000000000O00(), var20 ? 0.55F : var23 * 0.38F)
                  );
               } finally {
                  o0000O00OO0O0.O00000000000O0();
               }
            }
         }
      } finally {
         o0000O00OO0O0.O00000000000OO();
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O000000O00 o000000O00,
      String string,
      float f,
      float g,
      float h,
      float i,
      float j
   ) {
      O0000O00000 var11 = o0000O000O0OOO.O000000000000();
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      float var13 = var11.O00000000(5.0F);
      o0000O00OO0O0.O00000000(f, g, h, i, var13, ColorScheme.O00000000(var12.O00000000000O(), var12.O00000000000O0(), 0.5F));
      boolean var14 = false;
      if (!"None".equalsIgnoreCase(string) && O00000OOOO0O00.O00000000().O000000000000(string)) {
         MinecraftClient var15 = MinecraftClient.getInstance();
         int var16 = var15 == null ? Math.max(1, Math.round(f + h)) : Math.max(1, var15.getWindow().getFramebufferWidth());
         int var17 = var15 == null ? Math.max(1, Math.round(g + i)) : Math.max(1, var15.getWindow().getFramebufferHeight());
         O00000OOO0OO00 var18 = O00000OOOO0O00.O00000000().O0000000000(string);
         O00000OOOO00O var19 = O00000OOOO00O.O00000000(var18 == null ? null : var18.O000000000());
         if (var19 == O00000OOOO00O.PREVIEW_ONLY) {
            var19 = o000000O00.O00000000000OO;
         }

         if (var18 != null) {
            O00000OOO0OOOO.O00000000(
               o0000O00OO0O0, o0000O000O0OOO, string, var19, var18, f, g, h, i, var16, var17, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), j
            );
            var14 = true;
         }
      }

      if (!var14) {
         if ("None".equalsIgnoreCase(string)) {
            o0000O00OO0O0.O00000000(
               f + var11.O00000000(5.0F),
               g + var11.O00000000(5.0F),
               h - var11.O00000000(10.0F),
               i - var11.O00000000(10.0F),
               var11.O00000000(4.0F),
               var12.O0000000000O00(),
               0.6F
            );
         } else {
            o0000O00OO0O0.O000000000(f, g, h, i, var13, ColorScheme.O00000000(var12.O000000000O0(), 72), ColorScheme.O00000000(var12.O000000000O00(), 48));
         }
      }

      o0000O00OO0O0.O00000000(f, g, h, i, var13, ColorScheme.O00000000(var12.O000000000O0(), Math.round(70.0F * j)), 0.55F);
   }

   private String O00000000(O000000O00 o000000O00, String string) {
      if ("None".equalsIgnoreCase(string)) {
         return o000000O00.O00000000000OO.O000000000() + " slot hidden";
      } else {
         O00000OOO0OO00 var3 = O00000OOOO0O00.O00000000().O0000000000(string);
         O00000OOOO00O var4 = O00000OOOO00O.O00000000(var3 == null ? null : var3.O000000000());
         if (var4 == O00000OOOO00O.PREVIEW_ONLY) {
            var4 = o000000O00.O00000000000OO;
         }

         int var5 = O00000OOOO0O00.O00000000().O00000000000O(string).size();
         O00000OOOO0O00.W313 var6 = O00000OOOO0O00.O00000000().O0000000000000(string);
         O00000OOOO0O00.W312 var7 = O00000OOOO0O00.O00000000().O000000000000O(string);
         return var6.name().toLowerCase(Locale.ROOT) + " / " + var4.O000000000() + " / " + var5 + " uniforms / " + var7.name().toLowerCase(Locale.ROOT);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, GroupSetting o0000000OOOOOO, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      float var10 = this.O00000000((Setting)o0000000OOOOOO, var8);
      float var11 = var8.O00000000(14.0F);
      float var12 = var8.O00000000(3.0F);
      float var13 = var8.O00000000(3.0F);
      float var14 = h * 0.7F;
      float var15 = f + h - var14;
      this.O00000000(o0000O00OO0O0, var8, o0000000OOOOOO.O00000000, f, g, var10, 12.0F, var15 - f - var8.O00000000(8.0F), O0000O00000OO.O00000000(var9));
      float var16 = 0.0F;
      int var17 = 0;
      float var18 = var8.O00000000(3.0F);

      for (int var19 = 0; var19 < o0000000OOOOOO.O00000000000.size(); var19++) {
         BooleanSetting var20 = o0000000OOOOOO.O00000000000.get(var19);
         float var21 = o0000O000O0O0.O00000000(
            O0000O000O00O0.O00000000(o0000000OOOOOO, var19), var20.O0000000000() ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
         );
         boolean var22 = o0000O000O0O0.O0000000OOO00() == var20;
         String var23 = O0000O00000OO.O00000000(var20);
         float var24 = O0000O00000OO.O00000000(FontRegistry.O00000000, var23, 8.0F);
         float var25 = Math.max(var8.O00000000(18.0F), var24 + var8.O00000000(8.0F));
         if (var16 > 0.0F && var16 + var25 > var14) {
            var17++;
            var16 = 0.0F;
         }

         float var26 = var15 + var16;
         float var27 = g + var8.O00000000(1.0F) + var17 * (var11 + var18);
         boolean var28 = O0000O00000OO.O00000000(o0000O000O0O0, var26, var27 - var8.O00000000(1.0F), var25, var11 + var8.O00000000(2.0F));
         String var29 = O0000O000O00O0.O000000000(o0000000OOOOOO, var19);
         float var30 = o0000O000O0O0.O00000000(var29, var28 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
         float var31 = Math.max(var21, Math.max(var30 * 0.72F, var22 ? 1.0F : 0.0F));
         o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var30, o0000O000O0O0.O000000000(var29), 0.026F, 0.008F), var26 + var25 * 0.5F, var27 + var11 * 0.5F);

         try {
            if (var21 > 0.01F) {
               o0000O00OO0O0.O00000000(
                  var26,
                  var27,
                  var25,
                  var11,
                  var13,
                  ColorScheme.O00000000(var9.O000000000O00(), Math.round(180.0F * var21)),
                  ColorScheme.O00000000(var9.O000000000O0(), Math.round(180.0F * var21))
               );
            }

            if (var21 <= 0.5F) {
               o0000O00OO0O0.O00000000(var26, var27, var25, var11, var13, ColorScheme.O00000000(var9.O00000000000O0(), var9.O0000000000O(), var31));
            }

            o0000O00OO0O0.O00000000(
               var26,
               var27,
               var25,
               var11,
               var13,
               ColorScheme.O00000000(var9.O0000000000O(), ColorScheme.O00000000(var9.O000000000O0(), 100), Math.max(var31, var30)),
               0.5F
            );
            int var32 = ColorScheme.O00000000(
               ColorScheme.O00000000(O0000O00000OO.O0000000000(var9), O0000O00000OO.O000000000(var9), O0000O00000OO.O000000000(var30)),
               O0000O00000OO.O00000000(var9),
               var21
            );
            String var33 = var22 ? "..." : O0000O00000OO.O00000000(FontRegistry.O00000000, var23, 8.0F, var25 - var8.O00000000(6.0F));
            float var34 = O0000O00000OO.O00000000(FontRegistry.O00000000, var33, 8.0F);
            O0000O00000OO.O00000000(o0000O00OO0O0, var8, FontRegistry.O00000000, var26 + (var25 - var34) * 0.5F, var27, var11, 8.0F, var33, var32);
         } finally {
            o0000O00OO0O0.O00000000000O0();
         }

         var16 += var25 + var12;
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      Setting o0000000OOO00O,
      String string,
      String string2,
      float f,
      float g,
      float h,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var10 = o0000O000O0OOO.O000000000000();
      ColorScheme var11 = o0000O000O0OOO.O0000000000000();
      float var12 = var10.O00000000(14.0F);
      String var13 = string2 == null ? "" : string2;
      float var14 = O0000O00000OO.O00000000(FontRegistry.O00000000, var13, 10.0F);
      float var15 = Math.min(h * 0.5F, var14);
      float var16 = Math.max(var10.O00000000(36.0F), var15 + var10.O00000000(14.0F));
      float var17 = var10.O00000000(16.0F);
      float var18 = f + h - var16;
      float var19 = g + (var12 - var17) * 0.5F;
      float var20 = var10.O00000000(5.0F);
      this.O00000000(o0000O00OO0O0, var10, string, f, g, var12, 12.0F, var18 - f - var10.O00000000(8.0F), O0000O00000OO.O00000000(var11));
      String var21 = O0000O000O00O0.O0000000000(o0000000OOO00O);
      float var22 = o0000O000O0O0.O00000000(
         var21, O0000O00000OO.O00000000(o0000O000O0O0, var18, var19, var16, var17) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
      );
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var22, o0000O000O0O0.O000000000(var21)), var18 + var16 * 0.5F, var19 + var17 * 0.5F);

      try {
         o0000O00OO0O0.O00000000(var18, var19, var16, var17, var20, ColorScheme.O00000000(var11.O00000000000O0(), var11.O0000000000O(), var22 * 0.72F));
         o0000O00OO0O0.O00000000(
            var18, var19, var16, var17, var20, ColorScheme.O00000000(var11.O0000000000O(), ColorScheme.O00000000(var11.O000000000O0(), 95), var22), 0.5F
         );
         String var23 = O0000O00000OO.O00000000(FontRegistry.O00000000, var13, 10.0F, var16 - var10.O00000000(8.0F));
         float var24 = O0000O00000OO.O00000000(FontRegistry.O00000000, var23, 10.0F);
         float var25 = var18 + (var16 - var24) * 0.5F;
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var10,
            FontRegistry.O00000000,
            var25,
            var19,
            var17,
            10.0F,
            var23,
            ColorScheme.O00000000(O0000O00000OO.O000000000(var11), O0000O00000OO.O00000000(var11), var22 * 0.46F)
         );
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, String string, float f, float g, float h, float i, float j, int k) {
      if (string != null && !string.isEmpty() && !(j <= 1.0F) && !(h <= 1.0F)) {
         float var10 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, i);
         if (var10 <= j) {
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f, g, h, i, string, k);
         } else {
            float var11 = var10 - j;
            float var12 = var11 * this.O00000000();
            o0000O00OO0O0.O00000000(f, g, Math.max(1.0F, j), h, 0.0F, 0.0F, 0.0F, 0.0F);
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f - var12, g, h, i, string, k);
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private float O00000000() {
      float var1 = (float)(System.currentTimeMillis() % 5200L) / 5200.0F;
      if (var1 < 0.22F) {
         return 0.0F;
      } else if (var1 < 0.46F) {
         return this.O0000000000((var1 - 0.22F) / 0.24F);
      } else if (var1 < 0.62F) {
         return 1.0F;
      } else {
         return var1 < 0.86F ? 1.0F - this.O0000000000((var1 - 0.62F) / 0.24F) : 0.0F;
      }
   }

   private float O0000000000(float f) {
      float var2 = Math.max(0.0F, Math.min(1.0F, f));
      return var2 * var2 * var2 * (var2 * (var2 * 6.0F - 15.0F) + 10.0F);
   }
}
