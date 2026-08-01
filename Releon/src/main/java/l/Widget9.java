package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget9 extends Helper296 {
   private static final float PICKER_SIZE = 60.0F;
   private static final float HUE_BAR_HEIGHT = 6.0F;
   private static final float GAP = 4.0F;
   private static final float PREVIEW_SIZE = 14.0F;
   private static final float SLIDER_HEIGHT = 4.0F;
   private static final float SLIDER_WIDTH = 80.0F;
   private boolean expanded = false;
   private boolean satBrightDragging = false;
   private boolean hueDragging = false;
   private boolean alphaDragging = false;
   private boolean textSatBrightDragging = false;
   private boolean textHueDragging = false;
   private boolean enabledSatBrightDragging = false;
   private boolean enabledHueDragging = false;
   private float hue = 0.0F;
   private float saturation = 0.0F;
   private float brightness = 0.1F;
   private float alpha = 0.8F;
   private float textHue = 0.0F;
   private float textSaturation = 0.0F;
   private float textBrightness = 1.0F;
   private float enabledHue = 0.0F;
   private float enabledSaturation = 0.0F;
   private float enabledBrightness = 0.5F;

   public Widget9() {
      this.method349();
   }

   private void method349() {
      ClickGui var1 = ClickGui.method2650();
      int var2 = var1.backgroundColorSetting.method2553();
      Color var3 = new Color(var2, true);
      float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
      this.hue = var4[0];
      this.saturation = var4[1];
      this.brightness = var4[2];
      this.alpha = var1.method2653();
      int var5 = var1.textColorSetting.method2553();
      Color var6 = new Color(var5);
      float[] var7 = Color.RGBtoHSB(var6.getRed(), var6.getGreen(), var6.getBlue(), null);
      this.textHue = var7[0];
      this.textSaturation = var7[1];
      this.textBrightness = var7[2];
      int var8 = var1.enabledColorSetting.method2553();
      Color var9 = new Color(var8);
      float[] var10 = Color.RGBtoHSB(var9.getRed(), var9.getGreen(), var9.getBlue(), null);
      this.enabledHue = var10[0];
      this.enabledSaturation = var10[1];
      this.enabledBrightness = var10[2];
   }

   private void method350() {
      ClickGui var1 = ClickGui.method2650();
      int var2 = new Color(Color.HSBtoRGB(this.hue, this.saturation, this.brightness), true).getRGB();
      var2 = var2 & 16777215 | (int)(this.alpha * 255.0F) << 24;
      var1.backgroundColorSetting.method2555(var2);
      var1.alphaSetting.method2086(this.alpha);
      int var3 = Color.HSBtoRGB(this.textHue, this.textSaturation, this.textBrightness);
      var1.textColorSetting.method2555(var3);
      int var4 = Color.HSBtoRGB(this.enabledHue, this.enabledSaturation, this.enabledBrightness);
      var1.enabledColorSetting.method2555(var4);
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      int var6 = new Color(Color.HSBtoRGB(this.hue, this.saturation, this.brightness), true).getRGB();
      var6 = var6 & 16777215 | (int)(this.alpha * 255.0F) << 24;
      float var7 = this.x + this.width - 14.0F - 4.0F;
      float var8 = this.y + this.height - 14.0F - 4.0F;
      blur.method677(
         Helper80.method841(var5, var7 - 2.0F, var8 - 2.0F, 18.0, 18.0).method826(9.0F).method823(new Color(11, 12, 18, 200).getRGB()).method840()
      );
      rectangle.method677(Helper80.method841(var5, var7, var8, 14.0, 14.0).method826(7.0F).method823(var6).method840());
      rectangle.method677(Helper80.method841(var5, var7, var8, 14.0, 14.0).method826(7.0F).method835(1.0F).method823(0).method839(-1426063361).method840());
      float var9 = this.x + this.width - 14.0F - 4.0F;
      float var10 = this.y + this.height - 14.0F - 4.0F - 14.0F - 8.0F;
      blur.method677(
         Helper80.method841(var5, var9 - 2.0F, var10 - 2.0F, 18.0, 18.0).method826(9.0F).method823(new Color(11, 12, 18, 200).getRGB()).method840()
      );
      int var11 = Color.HSBtoRGB(this.textHue, this.textSaturation, this.textBrightness);
      rectangle.method677(Helper80.method841(var5, var9, var10, 14.0, 14.0).method826(7.0F).method823(var11).method840());
      rectangle.method677(Helper80.method841(var5, var9, var10, 14.0, 14.0).method826(7.0F).method835(1.0F).method823(0).method839(-1426063361).method840());
      float var12 = this.x + this.width - 14.0F - 4.0F;
      float var13 = this.y + this.height - 14.0F - 4.0F - 44.0F;
      blur.method677(
         Helper80.method841(var5, var12 - 2.0F, var13 - 2.0F, 18.0, 18.0).method826(9.0F).method823(new Color(11, 12, 18, 200).getRGB()).method840()
      );
      int var14 = Color.HSBtoRGB(this.enabledHue, this.enabledSaturation, this.enabledBrightness);
      rectangle.method677(Helper80.method841(var5, var12, var13, 14.0, 14.0).method826(7.0F).method823(var14).method840());
      rectangle.method677(Helper80.method841(var5, var12, var13, 14.0, 14.0).method826(7.0F).method835(1.0F).method823(0).method839(-1426063361).method840());
      if (this.expanded) {
         float var15 = var7 - 60.0F - 4.0F - 10.0F;
         float var16 = var13 - 60.0F - 6.0F - 4.0F - 20.0F;
         float var17 = 216.0F;
         float var18 = 103.0F;
         blur.method677(
            Helper80.method841(var5, var15 - 4.0F, var16 - 4.0F, var17 + 8.0F, var18 + 8.0F)
               .method826(6.0F)
               .method823(new Color(11, 12, 18, 230).getRGB())
               .method840()
         );
         float var19 = var15 + 10.0F;
         float var20 = var16 + 10.0F;
         int[] var21 = new int[]{-16777216, -1, -16777216, Color.HSBtoRGB(this.hue, 1.0F, 1.0F)};
         rectangle.method677(Helper80.method841(var5, var19, var20, 60.0, 60.0).method826(3.0F).method825(var21).method840());
         float var22 = MathHelper.clamp(var19 + 60.0F * this.saturation, var19, var19 + 60.0F - 4.0F);
         float var23 = MathHelper.clamp(var20 + 60.0F * (1.0F - this.brightness), var20, var20 + 60.0F - 4.0F);
         rectangle.method677(
            Helper80.method841(var5, var22 - 2.0F, var23 - 2.0F, 5.0, 5.0).method826(2.5F).method835(2.0F).method823(16777215).method839(-1).method840()
         );
         float var24 = var20 + 60.0F + 4.0F;
         image.method678("textures/gui/sliderhue.png").method677(Helper80.method841(var5, var19, var24, 60.0, 6.0).method826(2.0F).method840());
         float var25 = MathHelper.clamp(var19 + 60.0F * this.hue, var19, var19 + 60.0F - 6.0F);
         rectangle.method677(Helper80.method841(var5, var25, var24, 6.0, 6.0).method826(3.0F).method835(2.0F).method823(16777215).method839(-1).method840());
         float var26 = var19 + 60.0F + 4.0F;
         int[] var28 = new int[]{-16777216, -1, -16777216, Color.HSBtoRGB(this.textHue, 1.0F, 1.0F)};
         rectangle.method677(Helper80.method841(var5, var26, var20, 60.0, 60.0).method826(3.0F).method825(var28).method840());
         float var29 = MathHelper.clamp(var26 + 60.0F * this.textSaturation, var26, var26 + 60.0F - 4.0F);
         float var30 = MathHelper.clamp(var20 + 60.0F * (1.0F - this.textBrightness), var20, var20 + 60.0F - 4.0F);
         rectangle.method677(
            Helper80.method841(var5, var29 - 2.0F, var30 - 2.0F, 5.0, 5.0).method826(2.5F).method835(2.0F).method823(16777215).method839(-1).method840()
         );
         float var31 = var20 + 60.0F + 4.0F;
         image.method678("textures/gui/sliderhue.png").method677(Helper80.method841(var5, var26, var31, 60.0, 6.0).method826(2.0F).method840());
         float var32 = MathHelper.clamp(var26 + 60.0F * this.textHue, var26, var26 + 60.0F - 6.0F);
         rectangle.method677(Helper80.method841(var5, var32, var31, 6.0, 6.0).method826(3.0F).method835(2.0F).method823(16777215).method839(-1).method840());
         float var33 = var26 + 60.0F + 4.0F;
         int[] var35 = new int[]{-16777216, -1, -16777216, Color.HSBtoRGB(this.enabledHue, 1.0F, 1.0F)};
         rectangle.method677(Helper80.method841(var5, var33, var20, 60.0, 60.0).method826(3.0F).method825(var35).method840());
         float var36 = MathHelper.clamp(var33 + 60.0F * this.enabledSaturation, var33, var33 + 60.0F - 4.0F);
         float var37 = MathHelper.clamp(var20 + 60.0F * (1.0F - this.enabledBrightness), var20, var20 + 60.0F - 4.0F);
         rectangle.method677(
            Helper80.method841(var5, var36 - 2.0F, var37 - 2.0F, 5.0, 5.0).method826(2.5F).method835(2.0F).method823(16777215).method839(-1).method840()
         );
         float var38 = var20 + 60.0F + 4.0F;
         image.method678("textures/gui/sliderhue.png").method677(Helper80.method841(var5, var33, var38, 60.0, 6.0).method826(2.0F).method840());
         float var39 = MathHelper.clamp(var33 + 60.0F * this.enabledHue, var33, var33 + 60.0F - 6.0F);
         rectangle.method677(Helper80.method841(var5, var39, var38, 6.0, 6.0).method826(3.0F).method835(2.0F).method823(16777215).method839(-1).method840());
         float var40 = var24 + 6.0F + 4.0F + 8.0F;
         float var41 = var15 + 10.0F;
         rectangle.method677(Helper80.method841(var5, var41, var40, 80.0, 4.0).method826(2.0F).method823(-13421773).method840());

         for (int var42 = 0; var42 < 80.0F; var42++) {
            float var43 = var42 / 80.0F;
            int var44 = new Color(Color.HSBtoRGB(this.hue, this.saturation, this.brightness), true).getRGB();
            var44 = var44 & 16777215 | (int)(var43 * 255.0F) << 24;
            rectangle.method677(Helper80.method841(var5, var41 + var42, var40, 1.0, 4.0).method823(var44).method840());
         }

         float var46 = MathHelper.clamp(var41 + 80.0F * this.alpha, var41, var41 + 80.0F - 6.0F);
         rectangle.method677(
            Helper80.method841(var5, var46, var40 - 1.0F, 6.0, 6.0).method826(3.0F).method835(2.0F).method823(16777215).method839(-1).method840()
         );
         Helper103.method926(10).method1474(var5, "Alpha", var41, var40 - 10.0F, -1);
         if (this.satBrightDragging) {
            this.saturation = MathHelper.clamp((var2 - var19) / 60.0F, 0.0F, 1.0F);
            this.brightness = MathHelper.clamp(1.0F - (var3 - var20) / 60.0F, 0.0F, 1.0F);
            this.method350();
         }

         if (this.hueDragging) {
            this.hue = MathHelper.clamp((var2 - var19) / 60.0F, 0.0F, 1.0F);
            this.method350();
         }

         if (this.alphaDragging) {
            this.alpha = MathHelper.clamp((var2 - var41) / 80.0F, 0.0F, 1.0F);
            this.method350();
         }

         if (this.textSatBrightDragging) {
            this.textSaturation = MathHelper.clamp((var2 - var26) / 60.0F, 0.0F, 1.0F);
            this.textBrightness = MathHelper.clamp(1.0F - (var3 - var20) / 60.0F, 0.0F, 1.0F);
            this.method350();
         }

         if (this.textHueDragging) {
            this.textHue = MathHelper.clamp((var2 - var26) / 60.0F, 0.0F, 1.0F);
            this.method350();
         }

         if (this.enabledSatBrightDragging) {
            this.enabledSaturation = MathHelper.clamp((var2 - var33) / 60.0F, 0.0F, 1.0F);
            this.enabledBrightness = MathHelper.clamp(1.0F - (var3 - var20) / 60.0F, 0.0F, 1.0F);
            this.method350();
         }

         if (this.enabledHueDragging) {
            this.enabledHue = MathHelper.clamp((var2 - var33) / 60.0F, 0.0F, 1.0F);
            this.method350();
         }
      }
   }

   public int method351() {
      return ClickGui.method2650().method2652();
   }

   public float method352() {
      return ClickGui.method2650().method2653();
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         float var6 = this.x + this.width - 14.0F - 4.0F;
         float var7 = this.y + this.height - 14.0F - 4.0F;
         float var8 = this.x + this.width - 14.0F - 4.0F;
         float var9 = this.y + this.height - 14.0F - 4.0F - 14.0F - 8.0F;
         float var10 = this.x + this.width - 14.0F - 4.0F;
         float var11 = this.y + this.height - 14.0F - 4.0F - 44.0F;
         if (Helper147.method1224(var1, var3, var6 - 2.0F, var7 - 2.0F, 18.0, 18.0)) {
            this.expanded = !this.expanded;
            if (this.expanded) {
               this.method349();
            }

            return true;
         } else if (Helper147.method1224(var1, var3, var8 - 2.0F, var9 - 2.0F, 18.0, 18.0)) {
            this.expanded = !this.expanded;
            if (this.expanded) {
               this.method349();
            }

            return true;
         } else if (Helper147.method1224(var1, var3, var10 - 2.0F, var11 - 2.0F, 18.0, 18.0)) {
            this.expanded = !this.expanded;
            if (this.expanded) {
               this.method349();
            }

            return true;
         } else if (!this.expanded) {
            return false;
         } else {
            float var12 = var6 - 60.0F - 4.0F - 10.0F;
            float var13 = var11 - 60.0F - 6.0F - 4.0F - 20.0F;
            float var14 = var12 + 10.0F;
            float var15 = var13 + 10.0F;
            float var16 = var14 + 60.0F + 4.0F;
            float var18 = var16 + 60.0F + 4.0F;
            if (Helper147.method1224(var1, var3, var14, var15, 60.0, 60.0)) {
               this.satBrightDragging = true;
               this.saturation = MathHelper.clamp((float)(var1 - var14) / 60.0F, 0.0F, 1.0F);
               this.brightness = MathHelper.clamp(1.0F - (float)(var3 - var15) / 60.0F, 0.0F, 1.0F);
               this.method350();
               return true;
            } else {
               float var20 = var15 + 60.0F + 4.0F;
               if (Helper147.method1224(var1, var3, var14, var20, 60.0, 6.0)) {
                  this.hueDragging = true;
                  this.hue = MathHelper.clamp((float)(var1 - var14) / 60.0F, 0.0F, 1.0F);
                  this.method350();
                  return true;
               } else if (Helper147.method1224(var1, var3, var16, var15, 60.0, 60.0)) {
                  this.textSatBrightDragging = true;
                  this.textSaturation = MathHelper.clamp((float)(var1 - var16) / 60.0F, 0.0F, 1.0F);
                  this.textBrightness = MathHelper.clamp(1.0F - (float)(var3 - var15) / 60.0F, 0.0F, 1.0F);
                  this.method350();
                  return true;
               } else {
                  float var21 = var15 + 60.0F + 4.0F;
                  if (Helper147.method1224(var1, var3, var16, var21, 60.0, 6.0)) {
                     this.textHueDragging = true;
                     this.textHue = MathHelper.clamp((float)(var1 - var16) / 60.0F, 0.0F, 1.0F);
                     this.method350();
                     return true;
                  } else {
                     float var22 = var20 + 6.0F + 4.0F + 8.0F;
                     float var23 = var12 + 10.0F;
                     if (Helper147.method1224(var1, var3, var23, var22, 80.0, 4.0)) {
                        this.alphaDragging = true;
                        this.alpha = MathHelper.clamp((float)(var1 - var23) / 80.0F, 0.0F, 1.0F);
                        this.method350();
                        return true;
                     } else if (Helper147.method1224(var1, var3, var18, var15, 60.0, 60.0)) {
                        this.enabledSatBrightDragging = true;
                        this.enabledSaturation = MathHelper.clamp((float)(var1 - var18) / 60.0F, 0.0F, 1.0F);
                        this.enabledBrightness = MathHelper.clamp(1.0F - (float)(var3 - var15) / 60.0F, 0.0F, 1.0F);
                        this.method350();
                        return true;
                     } else {
                        float var24 = var15 + 60.0F + 4.0F;
                        if (Helper147.method1224(var1, var3, var18, var24, 60.0, 6.0)) {
                           this.enabledHueDragging = true;
                           this.enabledHue = MathHelper.clamp((float)(var1 - var18) / 60.0F, 0.0F, 1.0F);
                           this.method350();
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.satBrightDragging = false;
      this.hueDragging = false;
      this.alphaDragging = false;
      this.textSatBrightDragging = false;
      this.textHueDragging = false;
      this.enabledSatBrightDragging = false;
      this.enabledHueDragging = false;
      return super.method248(var1, var3, var5);
   }

   public int method353() {
      return ClickGui.method2650().method2654();
   }

   public int method354() {
      return ClickGui.method2650().method2655();
   }
}
