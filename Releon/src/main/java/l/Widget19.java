package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget19 extends Helper296 {
   private static final float PICKER_SIZE = 80.0F;
   private static final float HUE_BAR_HEIGHT = 8.0F;
   private static final float GAP = 5.0F;
   private static final float PREVIEW_SIZE = 16.0F;
   private boolean expanded = false;
   private boolean satBrightDragging = false;
   private boolean hueDragging = false;
   private float hue = 0.0F;
   private float saturation = 1.0F;
   private float brightness = 1.0F;

   public Widget19() {
      Setting7 var1 = Hud.method1824().colorSetting;
      int var2 = var1.method2553();
      float[] var3 = Color.RGBtoHSB(var2 >> 16 & 0xFF, var2 >> 8 & 0xFF, var2 & 0xFF, null);
      this.hue = var3[0];
      this.saturation = var3[1];
      this.brightness = var3[2];
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      int var6 = Color.HSBtoRGB(this.hue, this.saturation, this.brightness);
      float var7 = this.x + this.width - 16.0F - 4.0F;
      float var8 = this.y + this.height - 16.0F - 4.0F;
      blur.method677(
         Helper80.method841(var5, var7 - 2.0F, var8 - 2.0F, 20.0, 20.0).method826(10.0F).method823(new Color(11, 12, 18, 200).getRGB()).method840()
      );
      rectangle.method677(Helper80.method841(var5, var7, var8, 16.0, 16.0).method826(8.0F).method823(var6).method840());
      rectangle.method677(Helper80.method841(var5, var7, var8, 16.0, 16.0).method826(8.0F).method835(1.5F).method823(0).method839(-1426063361).method840());
      if (this.expanded) {
         float var9 = var7 - 80.0F - 5.0F;
         float var10 = var8 - 80.0F - 8.0F - 5.0F - 4.0F;
         float var11 = 93.0F;
         blur.method677(
            Helper80.method841(var5, var9 - 4.0F, var10 - 4.0F, 88.0, var11 + 8.0F)
               .method826(6.0F)
               .method823(new Color(11, 12, 18, 230).getRGB())
               .method840()
         );
         int[] var12 = new int[]{-16777216, -1, -16777216, Color.HSBtoRGB(this.hue, 1.0F, 1.0F)};
         rectangle.method677(Helper80.method841(var5, var9, var10, 80.0, 80.0).method826(3.0F).method825(var12).method840());
         float var13 = MathHelper.clamp(var9 + 80.0F * this.saturation, var9, var9 + 80.0F - 4.0F);
         float var14 = MathHelper.clamp(var10 + 80.0F * (1.0F - this.brightness), var10, var10 + 80.0F - 4.0F);
         rectangle.method677(
            Helper80.method841(var5, var13 - 2.0F, var14 - 2.0F, 5.0, 5.0).method826(2.5F).method835(2.0F).method823(16777215).method839(-1).method840()
         );
         float var15 = var10 + 80.0F + 5.0F;
         image.method678("textures/gui/sliderhue.png").method677(Helper80.method841(var5, var9, var15, 80.0, 8.0).method826(2.0F).method840());
         float var16 = MathHelper.clamp(var9 + 80.0F * this.hue, var9, var9 + 80.0F - 8.0F);
         rectangle.method677(Helper80.method841(var5, var16, var15, 8.0, 8.0).method826(4.0F).method835(2.0F).method823(16777215).method839(-1).method840());
         if (this.satBrightDragging) {
            this.saturation = MathHelper.clamp((var2 - var9) / 80.0F, 0.0F, 1.0F);
            this.brightness = MathHelper.clamp(1.0F - (var3 - var10) / 80.0F, 0.0F, 1.0F);
            this.method2997();
         }

         if (this.hueDragging) {
            this.hue = MathHelper.clamp((var2 - var9) / 80.0F, 0.0F, 1.0F);
            this.method2997();
         }
      }
   }

   private void method2997() {
      int var1 = Color.HSBtoRGB(this.hue, this.saturation, this.brightness);
      Hud.method1824().colorSetting.method2555(var1);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         float var6 = this.x + this.width - 16.0F - 4.0F;
         float var7 = this.y + this.height - 16.0F - 4.0F;
         if (Helper147.method1224(var1, var3, var6 - 2.0F, var7 - 2.0F, 20.0, 20.0)) {
            this.expanded = !this.expanded;
            return true;
         } else if (!this.expanded) {
            return false;
         } else {
            float var8 = var6 - 80.0F - 5.0F;
            float var9 = var7 - 80.0F - 8.0F - 5.0F - 4.0F;
            float var10 = var9 + 80.0F + 5.0F;
            if (Helper147.method1224(var1, var3, var8, var9, 80.0, 80.0)) {
               this.satBrightDragging = true;
               this.saturation = MathHelper.clamp((float)(var1 - var8) / 80.0F, 0.0F, 1.0F);
               this.brightness = MathHelper.clamp(1.0F - (float)(var3 - var9) / 80.0F, 0.0F, 1.0F);
               this.method2997();
               return true;
            } else if (Helper147.method1224(var1, var3, var8, var10, 80.0, 8.0)) {
               this.hueDragging = true;
               this.hue = MathHelper.clamp((float)(var1 - var8) / 80.0F, 0.0F, 1.0F);
               this.method2997();
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.satBrightDragging = false;
      this.hueDragging = false;
      return super.method248(var1, var3, var5);
   }
}
