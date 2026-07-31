package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Widget21 extends Helper296 {
   private static final float TRACK_WIDTH = 16.0F;
   private static final float TRACK_HEIGHT = 8.0F;
   private static final float KNOB_SIZE = 8.0F;
   private static final float SLIDER_OFFSET = 8.0F;
   private boolean state;
   private Runnable runnable;
   private float alphaMultiplier = 1.0F;
   private final Helper467 alphaAnimation = new Animation2().method5003(400).method5004(255.0);
   private final Helper467 sliderAnimation = new Animation2().method5003(225).method5004(8.0);

   public Widget21() {
      this.alphaAnimation.method4997(Helper450.BACKWARDS);
      this.sliderAnimation.method4997(Helper450.BACKWARDS);
      this.alphaAnimation.method4993();
      this.sliderAnimation.method4993();
   }

   public Widget21 method3067(float var1, float var2) {
      this.x = var1 - 8.0F;
      this.y = var2;
      return this;
   }

   public Widget21 method3068(float var1) {
      this.alphaMultiplier = var1;
      return this;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      this.alphaAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.sliderAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
      int var6 = (int)(this.alphaAnimation.method5000().intValue() * this.alphaMultiplier);
      float var7 = this.x + this.sliderAnimation.method5000().floatValue();
      int var8 = ClickGui.method2650().method2655();
      int var9 = Helper133.method1108(var8, 0.28F);
      int var10 = Helper133.method1120(var8, Math.max(0, Math.min(255, var6)));
      rectangle.method677(Helper80.method841(var5, this.x, this.y, 16.0, 8.0).method826(4.5F).method823(var9).method840());
      rectangle.method677(Helper80.method841(var5, this.x, this.y, 16.0, 8.0).method826(4.5F).method823(var10).method840());
      rectangle.method677(Helper80.method841(var5, var7, this.y, 8.0, 8.0).method826(4.0F).method823(new Color(255, 255, 255, 200).getRGB()).method840());
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Helper147.method1224(var1, var3, this.x, this.y, 16.0, 8.0) && var5 == 0) {
         this.state = !this.state;
         if (this.runnable != null) {
            this.runnable.run();
         }

         this.alphaAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
         this.sliderAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
         return true;
      } else {
         return super.method247(var1, var3, var5);
      }
   }

   public Widget21 method3069(boolean var1) {
      this.state = var1;
      return this;
   }

   public Widget21 method3070(Runnable var1) {
      this.runnable = var1;
      return this;
   }
}
