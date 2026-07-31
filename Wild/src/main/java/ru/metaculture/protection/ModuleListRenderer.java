package ru.metaculture.protection;

import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lombok.Generated;
import net.minecraft.client.gui.DrawContext;
import org.wild.module.api.Module;

public final class ModuleListRenderer {
   static final float O00000000 = 120.0F;
   static final float O000000000 = 14.0F;
   static final O0000O00O0O0O0 O0000000000 = O0000O00O0O0O0.O00000000((float)(Math.sqrt(120.0) / (Math.PI * 2)), 14.0F / (2.0F * (float)Math.sqrt(120.0)));
   private final SettingsRenderer O00000000000;
   private final Map<Module, O0000O00O0O0OO> O000000000000 = new IdentityHashMap<>();

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O000O0OOO o0000O000O0OOO, float f
   ) {
      Module var7 = o0000O00000000.O00000000();
      float var8 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(var7));
      if (!(var8 < 0.01F)) {
         float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000000(var7));
         if (!(var9 < 0.005F)) {
            O0000O00000 var10 = o0000O000O0OOO.O000000000000();
            ColorScheme var11 = o0000O000O0OOO.O0000000000000();
            float var12 = o0000O00000000.O000000000();
            float var13 = o0000O00000000.O0000000000();
            float var14 = o0000O00000000.O00000000000();
            String var15 = O0000O000O00O0.O000000000(var7);
            float var16 = o0000O000O0O0.O00000000(var15);
            float var17 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000(var7));
            float var18 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000O(var7));
            float var19 = this.O0000000000(var9);
            float var20 = var8 * Math.min(1.0F, var9);
            float var21 = 0.85F + 0.15F * var19;
            float var22 = O0000O00000OO.O00000000(var16, o0000O000O0O0.O000000000(var15));
            float var23 = (1.0F - var19) * var10.O00000000(15.0F);
            float var24 = var12 + var14 * 0.5F;
            float var25 = var13 + o0000O00000000.O000000000000() * 0.5F;
            o0000O00OO0O0.O000000000000(var20);
            boolean var49 = false /* VF: Semaphore variable */;

            try {
               var49 = true;
               o0000O00OO0O0.O00000000(0.0F, var23);

               try {
                  o0000O00OO0O0.O00000000(var21 * var22, var24, var25);

                  try {
                     float var26 = var16 * var10.O00000000(1.5F);
                     float var27 = var13 - var26;
                     float var28 = o0000O00000000.O000000000000();
                     float var29 = var10.O00000000(8.0F);
                     boolean var30 = o0000O000O0O0.O00000000OOOOO();
                     float var31 = var30 ? 1.0F : this.O00000000000(Math.min(var8, var18));
                     float var32 = this.O00000000();
                     float var33 = this.O00000000(0.02F, 0.9F, f);
                     if (!var30) {
                        this.O00000000(o0000O00OO0O0, var10, var11, var12, var27, var14, var28, var29, var31, var16, var17);
                     }

                     if (var11.O000000000O000()) {
                        int var34 = o0000O000O0OOO.O00000000000() == Theme.VERNAL_SOLSTICE
                           ? ColorScheme.O00000000(10, 31, 10, Math.round(15.0F + 8.0F * var16 + 7.0F * var33))
                           : ColorScheme.O00000000(54, 34, 42, Math.round(12.0F + 7.0F * var16 + 6.0F * var33));
                        o0000O00OO0O0.O00000000(
                           var12,
                           var27 + var10.O00000000(2.0F),
                           var14,
                           var28,
                           var29,
                           var10.O00000000(12.0F + 5.0F * var33 + 2.0F * var16),
                           var10.O00000000(1.6F),
                           var34
                        );
                     }

                     if (var17 > 0.3F) {
                        int var66 = var11.O000000000O000()
                           ? (
                              o0000O000O0OOO.O00000000000() == Theme.VERNAL_SOLSTICE
                                 ? ColorScheme.O00000000(10, 31, 10, Math.round(30.0F * var17))
                                 : ColorScheme.O00000000(54, 34, 42, Math.round(26.0F * var17))
                           )
                           : ColorScheme.O00000000(var11.O000000000O00(), Math.round(18.0F * var17));
                        o0000O00OO0O0.O00000000(
                           var12,
                           var27,
                           var14,
                           var28,
                           var29,
                           var10.O00000000(var11.O000000000O000() ? 12.0F : 6.0F) * var17,
                           var10.O00000000(var11.O000000000O000() ? 2.0F : 1.0F),
                           var66
                        );
                     }

                     if (var16 > 0.01F) {
                        o0000O00OO0O0.O00000000(
                           var12,
                           var27,
                           var14,
                           var28,
                           var29,
                           var10.O00000000(var11.O000000000O000() ? 10.0F : 4.0F) * var16,
                           var10.O00000000(var11.O000000000O000() ? 2.0F : 1.0F),
                           ColorScheme.O00000000(0, 0, 0, Math.round((var11.O000000000O000() ? 24 : 25) * var16))
                        );
                     }

                     int var67 = var11.O000000000O000()
                        ? this.O00000000(var11, var16, var17, var33)
                        : ColorScheme.O00000000(var7.O0000000000000 ? var11.O00000000000O0() : var11.O00000000000O(), var11.O00000000000OO(), var16);
                     int var35 = var11.O000000000O000()
                        ? ColorScheme.O00000000(
                           O0000O00000OO.O000000000(var11, 0.96F + var16 * 0.12F + var33 * 0.08F),
                           ColorScheme.O00000000(var11.O000000000O0(), 104),
                           Math.max(var17 * 0.18F, Math.max(var16 * 0.22F, var33 * 0.1F))
                        )
                        : ColorScheme.O00000000(var7.O0000000000000 ? var11.O0000000000O() : var11.O00000000000O0(), var11.O0000000000O0(), var16);
                     int var36 = var11.O000000000O00();
                     int var37 = var11.O000000000O0();
                     if (var11.O000000000O000()) {
                        o0000O00OO0O0.O00000000(var12, var27, var14, var28, var29, 0.64F + var16 * 0.1F + var17 * 0.07F + var33 * 0.05F);
                     }

                     boolean var38 = MenuModule.O00000000(MenuModule.O00000000O);
                     RenderManager.W384 var39 = !var30 && var38 ? o0000O00OO0O0.O000000000(var12, var27, var14, var28) : null;
                     if (var39 != null) {
                        try {
                           this.O00000000(
                              o0000O00OO0O0, drawContext, o0000O000O0O0, o0000O00000000, var7, var12, var27, var14, var28, var17, var16, o0000O000O0OOO
                           );
                        } finally {
                           o0000O00OO0O0.O00000000(var39);
                        }

                        o0000O00OO0O0.O00000000(var39, var12, var27, var14, var28, var29, var67, var35, var36, var37, var31, var32);
                     } else {
                        this.O00000000(
                           o0000O00OO0O0,
                           drawContext,
                           o0000O000O0O0,
                           o0000O00000000,
                           var7,
                           var12,
                           var27,
                           var14,
                           var28,
                           var29,
                           var67,
                           var35,
                           var17,
                           var16,
                           o0000O000O0OOO
                        );
                     }

                     float var40 = (1.0F - var17) * (1.0F - var16 * 0.55F);
                     if (var40 > 0.01F) {
                        int var41 = ColorScheme.O00000000(var11.O000000000O(), Math.round(34.0F * var40));
                        o0000O00OO0O0.O00000000(var12, var27, var14, var28, var29, var41, 0.5F);
                     }

                     this.O00000000(o0000O00OO0O0, var10, o0000O000O0OOO, var12, var27, var14, var28, var29, var16, var17, var32);
                  } finally {
                     o0000O00OO0O0.O00000000000O0();
                  }
               } finally {
                  o0000O00OO0O0.O00000000000O();
               }

               var49 = false;
            } finally {
               if (var49) {
                  o0000O00OO0O0.O00000000000OO();
               }
            }

            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k, float l, float m
   ) {
      float var12 = this.O00000000(0.025F, 0.18F, k) * (1.0F - this.O00000000(0.88F, 1.0F, k));
      float var13 = this.O00000000(0.18F, 0.46F, k) * (1.0F - this.O00000000(0.72F, 1.0F, k));
      float var14 = Math.max(Math.max(var12, var13 * 0.42F), m * 0.18F + l * 0.08F);
      if (!(var14 <= 0.01F)) {
         int var15 = ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO.O000000000O0(), 0.42F);
         int var16 = ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO.O000000000O(), 0.2F);
         if (o0000O000O0OO.O000000000O000()) {
            o0000O00OO0O0.O00000000(
               f,
               g + o0000O00000.O00000000(2.0F),
               h,
               i,
               j,
               o0000O00000.O00000000(20.0F) * var14,
               o0000O00000.O00000000(3.2F),
               ColorScheme.O00000000(0, 0, 0, Math.round(24.0F * var14))
            );
            o0000O00OO0O0.O00000000(
               f,
               g + o0000O00000.O00000000(5.0F),
               h,
               i,
               j,
               o0000O00000.O00000000(34.0F) * var14,
               o0000O00000.O00000000(4.2F),
               ColorScheme.O00000000(0, 0, 0, Math.round(10.0F * var14))
            );
            if (var12 > 0.01F) {
               float var21 = o0000O00000.O00000000(1.4F);
               o0000O00OO0O0.O00000000(
                  f + var21,
                  g + var21,
                  h - var21 * 2.0F,
                  i - var21 * 2.0F,
                  Math.max(0.0F, j - var21),
                  ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(26.0F * var12)),
                  0.5F
               );
            }
         } else {
            o0000O00OO0O0.O00000000000();

            try {
               o0000O00OO0O0.O00000000(
                  f, g, h, i, j, o0000O00000.O00000000(18.0F) * var14, o0000O00000.O00000000(3.2F), ColorScheme.O00000000(var16, Math.round(26.0F * var14))
               );
               o0000O00OO0O0.O00000000(
                  f, g, h, i, j, o0000O00000.O00000000(9.0F) * var14, o0000O00000.O00000000(1.4F), ColorScheme.O00000000(var15, Math.round(34.0F * var14))
               );
               if (var12 > 0.01F) {
                  float var17 = o0000O00000.O00000000(1.4F);
                  o0000O00OO0O0.O00000000(
                     f + var17,
                     g + var17,
                     h - var17 * 2.0F,
                     i - var17 * 2.0F,
                     Math.max(0.0F, j - var17),
                     ColorScheme.O00000000(var15, Math.round(28.0F * var12)),
                     0.5F
                  );
               }
            } finally {
               o0000O00OO0O0.O000000000000();
            }
         }
      }
   }

   private float O00000000(float f, float g, float h) {
      float var4 = this.O000000000000((h - f) / Math.max(1.0E-5F, g - f));
      return var4 * var4 * (3.0F - 2.0F * var4);
   }

   private float O00000000(float f) {
      float var2 = this.O000000000000(f);
      return var2 * var2 * var2 * (var2 * (var2 * 6.0F - 15.0F) + 10.0F);
   }

   private float O000000000(float f) {
      float var2 = this.O00000000(f);
      float var3 = this.O00000000(0.08F, 0.92F, var2);
      return O0000O00OO0OO0.O00000000000OO(var2 * 0.72F + var3 * 0.28F, 0.0F, 1.0F);
   }

   private float O0000000000(float f) {
      float var2 = this.O000000000000(f);
      return var2 * var2 * (3.0F - 2.0F * var2);
   }

   private float O00000000000(float f) {
      float var2 = this.O000000000000(f);
      return (float)Math.pow(var2, 1.42F);
   }

   private int O00000000(ColorScheme o0000O000O0OO, float f, float g, float h) {
      float var5 = Math.max(f, Math.max(g * 0.22F, h * 0.34F));
      int var6 = O0000O00000OO.O00000000(o0000O000O0OO, var5);
      int var7 = ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 232), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 232), 0.04F);
      int var8 = ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 238), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 238), 0.035F);
      return ColorScheme.O00000000(ColorScheme.O00000000(var6, var7, 0.28F + h * 0.12F), var8, g * 0.035F);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000000 o0000O00000000,
      Module module,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      int l,
      float m,
      float n,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      ColorScheme var16 = o0000O000O0OOO.O0000000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, j, k);
      o0000O00OO0O0.O00000000(f, g, h, i, j, l, var16.O000000000O000() ? 1.0F : 0.5F);
      this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o0000O00000000, module, f, g, h, i, m, n, o0000O000O0OOO);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m
   ) {
      if (o0000O000O0OOO.O00000000000() == Theme.VERNAL_SOLSTICE) {
         ColorScheme var12 = o0000O000O0OOO.O0000000000000();
         float var13 = Math.max(0.18F, k * 0.72F + l * 0.34F);
         float var14 = (m * 0.18F + f * 0.0031F + g * 0.0017F) % 1.0F;
         if (var14 < 0.0F) {
            var14++;
         }

         float var15 = Math.max(o0000O00000.O00000000(42.0F), h * 0.28F);
         float var16 = f - var15 + (h + var15 * 2.0F) * var14;
         int var17 = ColorScheme.O00000000(var12.O000000000O00(), Math.round(28.0F * var13));
         int var18 = ColorScheme.O00000000(
            ColorScheme.O00000000(var12.O000000000O00(), ColorScheme.O00000000(255, 255, 255, 255), 0.45F), Math.round(46.0F * var13)
         );
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);
         boolean var21 = false /* VF: Semaphore variable */;

         try {
            var21 = true;
            o0000O00OO0O0.O00000000(var16, g + o0000O00000.O00000000(0.7F), var15 * 0.5F, Math.max(1.0F, o0000O00000.O00000000(0.85F)), 0.0F, 0, var17);
            o0000O00OO0O0.O00000000(
               var16 + var15 * 0.5F, g + o0000O00000.O00000000(0.7F), var15 * 0.5F, Math.max(1.0F, o0000O00000.O00000000(0.85F)), 0.0F, var18, 0
            );
            var21 = false;
         } finally {
            if (var21) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000000 o0000O00000000,
      Module module,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var13 = o0000O000O0OOO.O000000000000();
      ColorScheme var14 = o0000O000O0OOO.O0000000000000();
      if (j > 0.01F) {
         int var15 = ColorScheme.O00000000(
            ColorScheme.O00000000(var14.O000000000O0(), var14.O000000000O00(), var14.O000000000O000() ? 0.38F : 0.0F),
            Math.round((var14.O000000000O000() ? 26 : 20) * j)
         );
         o0000O00OO0O0.O00000000(
            f + var13.O00000000(1.0F), g, h - var13.O00000000(2.0F), var13.O00000000(1.0F), var13.O00000000(8.0F), var13.O00000000(8.0F), 0.0F, 0.0F, var15
         );
      }

      this.O00000000(o0000O00OO0O0, o0000O000O0O0, module, f, g, h, i, j, k, o0000O000O0OOO);
      if (o0000O00000000.O0000000000000() > 0.01F) {
         this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o0000O00000000, module, f, g, h, i, o0000O000O0OOO);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000000 o0000O00000000,
      Module module,
      float f,
      float g,
      float h,
      float i,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var11 = o0000O000O0OOO.O000000000000();
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      float var13 = this.O000000000000(o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(module)));
      float var14 = this.O00000000(module, h, o0000O000O0OOO);
      float var15 = g + var14;
      float var16 = Math.max(var11.O00000000(1.0F), i - var14);
      boolean var17 = MenuModule.O00000000(MenuModule.O00000000O);
      if (!o0000O000O0O0.O00000000OOOOO() && var17) {
         RenderManager.W384 var18 = o0000O00OO0O0.O000000000(f, var15, h, var16);
         if (var18 != null) {
            try {
               this.O000000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o0000O00000000, module, f, g, h, i, o0000O000O0OOO);
            } finally {
               o0000O00OO0O0.O00000000(var18);
            }

            int var19 = var12.O000000000O000() ? ColorScheme.O00000000(var12.O000000000O0(), var12.O000000000O(), 0.45F) : var12.O000000000O0();
            int var20 = var12.O000000000O000() ? ColorScheme.O00000000(var12.O000000000O00(), var12.O000000000O(), 0.45F) : var12.O000000000O00();
            int var21 = ColorScheme.O00000000(ColorScheme.O00000000(var20, var19, 0.5F), Math.round(200.0F * var13));
            boolean var22 = o0000O000O0O0.O00000000O0O().contains(module);
            float var23 = 0.988F + 0.012F * this.O00000000(0.0F, 0.6F, var13);
            o0000O00OO0O0.O00000000(var23, f + h * 0.5F, var15);
            o0000O00OO0O0.O000000000000(this.O00000000(0.02F, 0.3F, var13));
            boolean var27 = false /* VF: Semaphore variable */;

            try {
               var27 = true;
               o0000O00OO0O0.O00000000(
                  var18,
                  f,
                  var15,
                  h,
                  var16,
                  var11.O00000000(7.0F),
                  ColorScheme.O00000000(var19, var22 ? 255 : 0),
                  ColorScheme.O00000000(var20, 255),
                  var21,
                  var13,
                  this.O00000000()
               );
               var27 = false;
            } finally {
               if (var27) {
                  o0000O00OO0O0.O00000000000OO();
                  o0000O00OO0O0.O00000000000O0();
               }
            }

            o0000O00OO0O0.O00000000000OO();
            o0000O00OO0O0.O00000000000O0();
         } else {
            O0000O00000OO.O00000000(o0000O00OO0O0, f, var15, h, var16, var11.O00000000(7.0F), () -> {
               o0000O00OO0O0.O000000000000(var13);
               boolean var14x = false /* VF: Semaphore variable */;

               try {
                  var14x = true;
                  this.O000000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o0000O00000000, module, f, g, h, i, o0000O000O0OOO);
                  var14x = false;
               } finally {
                  if (var14x) {
                     o0000O00OO0O0.O00000000000OO();
                  }
               }

               o0000O00OO0O0.O00000000000OO();
            });
         }
      } else {
         O0000O00000OO.O00000000(o0000O00OO0O0, f, var15, h, var16, var11.O00000000(7.0F), () -> {
            o0000O00OO0O0.O000000000000(var13);

            try {
               this.O000000000(o0000O00OO0O0, drawContext, o0000O000O0O0, o0000O00000000, module, f, g, h, i, o0000O000O0OOO);
            } finally {
               o0000O00OO0O0.O00000000000OO();
            }
         });
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000000 o0000O00000000,
      Module module,
      float f,
      float g,
      float h,
      float i,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var11 = o0000O000O0OOO.O000000000000();
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      float var13 = this.O00000000(module, h, o0000O000O0OOO);
      o0000O00OO0O0.O00000000(
         f + var11.O00000000(1.0F),
         g + var13,
         h - var11.O00000000(2.0F),
         var11.O00000000(1.0F),
         module.O0000000000000 ? var12.O0000000000O0() : var12.O00000000000OO()
      );
      O0000O000O000 var14 = O0000O000O0000.O00000000(module);
      if (var14 != null) {
         O0000O00000000 var15 = new O0000O00000000(module, f, g, h, i, o0000O00000000.O0000000000000());
         var14.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var15, o0000O000O0OOO);
      } else {
         this.O00000000(
            o0000O00OO0O0, o0000O000O0O0, module, f + var11.O00000000(16.0F), g + var13 + var11.O00000000(10.0F), h - var11.O00000000(32.0F), o0000O000O0OOO
         );
      }
   }

   private float O00000000() {
      return (float)(System.currentTimeMillis() % 1000000L) / 1000.0F;
   }

   private float O000000000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      Module module,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var11 = o0000O000O0OOO.O000000000000();
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      float var13 = f + var11.O00000000(16.0F);
      float var14 = g + var11.O00000000(16.0F);
      boolean var15 = !o0000O000O0O0.O00000000OOOOO() && O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i);
      int var16 = ColorScheme.O00000000(O0000O00000OO.O000000000(var12), O0000O00000OO.O00000000(var12), Math.max(j, k * 0.45F));
      if (j > 0.01F) {
         o0000O00OO0O0.O000000000(
            var13,
            var14 + var11.O00000000(2.0F),
            var11.O00000000(1.0F),
            var11.O00000000(10.0F),
            var11.O00000000(1.0F),
            ColorScheme.O00000000(var12.O000000000O0(), Math.round(255.0F * j)),
            ColorScheme.O00000000(var12.O000000000O00(), Math.round(255.0F * j))
         );
      }

      float var17 = var13 + var11.O00000000(9.0F) * j;
      O0000O00000OO.O00000000(o0000O00OO0O0, var11, FontRegistry.O00000000000, var17, var14, var11.O00000000(14.0F), 12.0F, module.O00000000000O0, var16);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, module, f, h, var14, k, var15, o0000O000O0OOO);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, module, f, h, var14, j, k, o0000O000O0OOO);
      this.O00000000(
         o0000O00OO0O0, module, f, g, h, ColorScheme.O00000000(O0000O00000OO.O0000000000(var12), O0000O00000OO.O000000000(var12), j), o0000O000O0OOO
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, Module module, float f, float g, float h, float i, boolean bl, O0000O000O0OOO o0000O000O0OOO
   ) {
      if (!module.O000000000000O().isEmpty()) {
         O0000O00000 var10 = o0000O000O0OOO.O000000000000();
         ColorScheme var11 = o0000O000O0OOO.O0000000000000();
         O0000O00O0O0OO var12 = this.O000000000000.computeIfAbsent(module, modulex -> this.O000000000());
         var12.O0000000000(1.0F);
         float var13 = O0000O00OO0OO0.O00000000000OO(var12.O00000000(), 0.0F, 1.0F);
         List var14 = this.O00000000(module);
         float var15 = f + g - var10.O00000000(16.0F) - var10.O00000000(24.0F);
         float var16 = var15 - var10.O00000000(this.O000000000(module) ? 32.0F : 9.0F);
         float var17 = f + var10.O00000000(90.0F);
         float var18 = var16 - var17;
         float var19 = var10.O00000000(15.5F);
         float var20 = h + var10.O00000000(7.0F);
         float var21 = var10.O00000000(5.0F);
         float var22 = var10.O00000000(22.0F);
         float var23 = this.O00000000();
         float var24 = var21 * Math.max(0, var14.size() - 1);

         for (O0000000OO0OOO var26 : (List<O0000000OO0OOO>)var14) {
            var24 += this.O00000000(var10, var26);
         }

         boolean var36 = var24 <= var18;
         int var37 = var14.size();
         float var27 = var37 <= 1 ? 0.0F : Math.min(0.42F, 0.07F * (var37 - 1)) / (var37 - 1);
         float var28 = Math.max(0.001F, 1.0F - var27 * Math.max(0, var37 - 1));
         float var29 = var16;

         for (int var30 = 0; var30 < var37; var30++) {
            O0000000OO0OOO var31 = (O0000000OO0OOO)var14.get(var30);
            float var32 = var36 ? this.O00000000(var10, var31) : var22;
            float var33 = var29 - var32;
            if (var33 < var17 && var30 > 0) {
               break;
            }

            float var34 = O0000O00OO0OO0.O00000000000OO((var13 - var30 * var27) / var28, 0.0F, 1.0F);
            float var35 = this.O000000000(var34);
            this.O00000000(o0000O00OO0O0, var10, var11, var31, var33, var20 - var19 * 0.5F, var32, var19, var36, var35, i, var23, var30);
            var29 -= var32 + var21;
         }
      }
   }

   private O0000O00O0O0OO O000000000() {
      O0000O00O0O0OO var1 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O0000000000, 0.0F, 0.0F, 1.0F, 6.0E-4F, 6.0E-4F);
      var1.O00000000(this::O00000000);
      return var1;
   }

   private List<O0000000OO0OOO> O00000000(Module module) {
      return module.O000000000000O().stream().sorted(Comparator.comparingInt(O0000000OO0OOO::O00000000000).thenComparing(Enum::name)).toList();
   }

   private float O00000000(O0000O00000 o0000O00000, O0000000OO0OOO o0000000OO0OOO) {
      String var3 = o0000000OO0OOO.O00000000().toUpperCase(Locale.ROOT);
      float var4 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O0000000000(), o0000000OO0OOO.O0000000000(), 7.6F);
      float var5 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var3, 8.0F);
      return Math.max(o0000O00000.O00000000(25.0F), var4 + var5 + o0000O00000.O00000000(21.0F));
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O0000000OO0OOO o0000000OO0OOO,
      float f,
      float g,
      float h,
      float i,
      boolean bl,
      float j,
      float k,
      float l,
      int m
   ) {
      if (!(j <= 0.001F)) {
         boolean var14 = o0000O000O0OO.O000000000O000();
         int var15 = o0000000OO0OOO.O000000000();
         float var16 = i * 0.5F;
         g += (1.0F - j) * o0000O00000.O00000000(4.0F);
         float var17 = j;
         float var18 = k * k;
         float var19 = 0.5F + 0.5F * (float)Math.sin(l * 2.1F + m * 0.9F);
         int var20 = ColorScheme.O00000000(var15, Math.round((9.0F + 15.0F * var18 + 5.0F * var19) * j));
         o0000O00OO0O0.O00000000(f, g, h, i, var16, o0000O00000.O00000000(3.5F + 6.0F * var18), o0000O00000.O00000000(0.9F), var20);
         int var21 = var14
            ? ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var15, 0.12F), Math.round((32.0F + 16.0F * var18) * j))
            : ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), var15, 0.22F), Math.round((36.0F + 16.0F * var18) * j));
         int var22 = var14
            ? ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var15, 0.05F), Math.round((20.0F + 12.0F * var18) * j))
            : ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), var15, 0.1F), Math.round((22.0F + 12.0F * var18) * j));
         o0000O00OO0O0.O000000000(f, g, h, i, var16, var21, var22);
         int var23 = ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var15, 0.3F), Math.round((var14 ? 42.0F : 34.0F) * j));
         o0000O00OO0O0.O00000000(
            f + var16 * 0.6F,
            g + o0000O00000.O00000000(1.5F),
            Math.max(o0000O00000.O00000000(1.0F), h - var16 * 1.2F),
            Math.max(o0000O00000.O00000000(0.85F), 1.0F),
            o0000O00000.O00000000(0.5F),
            var23
         );
         int var24 = ColorScheme.O00000000(var15, Math.round((74.0F + 66.0F * var18 + 32.0F * var19) * j));
         o0000O00OO0O0.O00000000(f, g, h, i, var16, var24, var14 ? 1.0F : 0.9F);
         if (var18 > 0.01F) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(f, g, h, i, var16, var16, var16, var16);

            try {
               float var25 = h * 0.42F;
               float var26 = (float)(l * 0.5 + m * 0.17);
               var26 -= (float)Math.floor(var26);
               float var27 = f - var25 + (h + var25) * var26;
               int var28 = ColorScheme.O00000000(o0000O000O0OO.O000000000O(), var15, 0.25F);
               int var29 = ColorScheme.O00000000(var28, Math.round(26.0F * var18 * var17));
               int var30 = ColorScheme.O00000000(var28, 0);
               o0000O00OO0O0.O00000000(var27, g, var25, i, 0.0F, var30, var29);
               o0000O00OO0O0.O00000000(var27 + var25, g, var25 * 0.6F, i, 0.0F, var29, var30);
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         float var35 = 7.4F;
         float var37 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O0000000000(), o0000000OO0OOO.O0000000000(), var35);
         int var38 = ColorScheme.O00000000(ColorScheme.O00000000(var15, o0000O000O0OO.O000000000O(), var14 ? 0.34F : 0.56F), Math.round(246.0F * j));
         if (bl) {
            float var39 = f + o0000O00000.O00000000(7.5F);
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O0000000000(), var39, g, i, var35, o0000000OO0OOO.O0000000000(), var38);
            String var41 = o0000000OO0OOO.O00000000().toUpperCase(Locale.ROOT);
            int var42 = ColorScheme.O00000000(ColorScheme.O00000000(var15, o0000O000O0OO.O000000000O(), var14 ? 0.5F : 0.74F), Math.round(242.0F * j));
            O0000O00000OO.O00000000(
               o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, var39 + var37 + o0000O00000.O00000000(5.0F), g, i, 8.0F, var41, var42
            );
         } else {
            float var40 = f + (h - var37) * 0.5F;
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O0000000000(), var40, g, i, var35, o0000000OO0OOO.O0000000000(), var38);
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, Module module, float f, float g, float h, float i, float j, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var10 = o0000O000O0OOO.O000000000000();
      ColorScheme var11 = o0000O000O0OOO.O0000000000000();
      float var12 = var10.O00000000(24.0F);
      float var13 = var10.O00000000(14.0F);
      float var14 = f + g - var10.O00000000(16.0F) - var12;
      int var16 = var11.O0000000000O0O();
      int var17 = ColorScheme.O00000000(var11.O000000000O00(), var11.O000000000O0(), 0.5F);
      int var18 = ColorScheme.O00000000(var16, var17, i);
      if (i > 0.01F) {
         int var19 = var11.O000000000O000()
            ? ColorScheme.O00000000(0, 0, 0, Math.round(24.0F * i))
            : ColorScheme.O00000000(var11.O000000000O00(), Math.round(40.0F * i));
         o0000O00OO0O0.O00000000(
            var14,
            h,
            var12,
            var13,
            var13 * 0.5F,
            var10.O00000000(var11.O000000000O000() ? 8.0F : 4.0F) * i,
            var10.O00000000(var11.O000000000O000() ? 1.5F : 1.0F),
            var19
         );
      }

      if (i > 0.5F) {
         o0000O00OO0O0.O00000000(var14, h, var12, var13, var13 * 0.5F, var11.O000000000O00(), var11.O000000000O0());
      } else {
         o0000O00OO0O0.O00000000(var14, h, var12, var13, var13 * 0.5F, ColorScheme.O00000000(var16, var18, i * 2.0F));
      }

      float var26 = var10.O00000000(10.0F);
      float var20 = var12 - var26 - var10.O00000000(4.0F);
      int var21 = ColorScheme.O00000000(O0000O00000OO.O0000000000000(var11), O0000O00000OO.O000000000000(var11), i);
      float var22 = var14 + var10.O00000000(2.0F) + i * var20;
      o0000O00OO0O0.O00000000(
         var22,
         h + var10.O00000000(2.0F),
         var26,
         var26,
         var26 * 0.5F,
         var10.O00000000(3.0F),
         var10.O00000000(0.5F),
         ColorScheme.O00000000(0, 0, 0, Math.round(60.0F * (0.5F + i * 0.5F)))
      );
      o0000O00OO0O0.O00000000(var22, h + var10.O00000000(2.0F), var26, var26, var26 * 0.5F, var21);
      if (this.O000000000(module)) {
         float var23 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000(module));
         float var24 = Math.max(var23, j * 0.35F);
         int var25 = ColorScheme.O00000000(O0000O00000OO.O0000000000(var11), O0000O00000OO.O000000000(var11), i);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var10,
            FontRegistry.O0000000000,
            var14 - var10.O00000000(22.0F),
            h,
            var10.O00000000(14.0F),
            14.0F,
            "I",
            ColorScheme.O00000000(var25, var11.O000000000O0(), var24)
         );
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, Module module, float f, float g, float h, int i, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      ColorScheme var9 = o0000O000O0OOO.O0000000000000();
      float var10 = g + var8.O00000000(38.0F);
      List var11 = O0000O00000OO.O00000000(
         FontRegistry.O00000000,
         module.O00000000000OO == null ? "" : module.O00000000000OO,
         10.0F,
         Math.max(var8.O00000000(160.0F), h - var8.O00000000(90.0F)),
         10
      );

      for (int var12 = 0; var12 < var11.size(); var12++) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var8,
            FontRegistry.O00000000,
            f + var8.O00000000(16.0F),
            var10 + var12 * var8.O00000000(12.0F),
            var8.O00000000(12.0F),
            10.0F,
            (String)var11.get(var12),
            i
         );
      }

      if (module.O0000000000O || module.O000000000000 != -1) {
         String var14 = module.O0000000000O ? "..." : O0000O000OO0O0.O00000000(module.O000000000000);
         float var13 = O0000O00000OO.O00000000(FontRegistry.O00000000, var14, 10.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var8,
            FontRegistry.O00000000,
            f + var8.O0000000000OO() - var8.O00000000(30.0F) - var13,
            var10,
            var8.O00000000(12.0F),
            10.0F,
            var14,
            i
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var8,
            FontRegistry.O000000000000,
            f + var8.O0000000000OO() - var8.O00000000(26.0F),
            var10,
            var8.O00000000(12.0F),
            10.0F,
            "g",
            ColorScheme.O00000000(var9.O0000000000O0O(), O0000O00000OO.O0000000000(var9), this.O00000000(i))
         );
      }
   }

   private float O00000000(int i) {
      return (i >>> 24 & 0xFF) / 255.0F;
   }

   private float O000000000(float f, float g, float h) {
      float var4 = this.O000000000000(h);
      return f + (g - f) * var4;
   }

   private float O00000000(Module module, float f, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var4 = o0000O000O0OOO.O000000000000();
      String var5 = module.O00000000000OO == null ? "" : module.O00000000000OO;
      if (var5.isBlank()) {
         return var4.O0000000000OO0();
      } else {
         int var6 = O0000O00000OO.O00000000(FontRegistry.O00000000, var5, 10.0F, Math.max(var4.O00000000(160.0F), f - var4.O00000000(90.0F)), 10).size();
         return Math.max(var4.O0000000000OO0(), var4.O00000000(54.0F) + Math.max(1, var6) * var4.O00000000(12.0F));
      }
   }

   private boolean O000000000(Module module) {
      return O0000O000O0000.O000000000(module) || !module.O0000000000000().isEmpty();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, Module module, float f, float g, float h, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var8 = o0000O000O0OOO.O000000000000();
      float var9 = g;

      for (Setting var11 : module.O0000000000000()) {
         if (var11 instanceof O000000O0 var12) {
            var9 += var8.O00000000(var12.O0000000000());
         } else {
            float var21 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000(var11));
            if (!(var21 < 0.01F)) {
               float var13 = (1.0F - var21) * var8.O00000000(8.0F);
               o0000O00OO0O0.O000000000000(var21);

               try {
                  this.O00000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, var11, f, var9 + var13, h, o0000O000O0OOO);
               } finally {
                  o0000O00OO0O0.O00000000000OO();
               }

               float var14 = this.O00000000000.O00000000(var11, var8, o0000O000O0O0);
               float var15 = 0.0F;
               if (var11 instanceof ModeSetting var16) {
                  float var18 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(var16));
                  if (var18 > 0.01F) {
                     var15 = (var8.O00000000(6.0F) + var16.O00000000000.size() * var8.O00000000(18.0F) + var8.O00000000(4.0F)) * var18;
                  }
               } else if (var11 instanceof O000000O00 var17) {
                  float var22 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(var17));
                  if (var22 > 0.01F) {
                     var15 = SettingsRenderer.O00000000(var17, var8) * var22;
                  }
               }

               var9 += (var14 + var15 + var8.O00000000(12.0F)) * var21;
            }
         }
      }
   }

   @Generated
   public ModuleListRenderer(SettingsRenderer o0000O0000OO0O) {
      this.O00000000000 = o0000O0000OO0O;
   }
}
