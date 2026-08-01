package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Widget5 extends Helper296 {
   private boolean state;
   private Runnable runnable;
   private float alphaMultiplier = 1.0F;
   private final Helper467 alphaAnimation = new Animation2().method5003(400).method5004(255.0);
   private final Helper467 sliderAnimation = new Animation2().method5003(225).method5004(8.0);

   public Widget5() {
      this.alphaAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.sliderAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.alphaAnimation.method4993();
      this.sliderAnimation.method4993();
   }

   public Widget5 method290(float var1, float var2) {
      this.x = var1 - 8.0F;
      this.y = var2;
      return this;
   }

   public Widget5 method291(float var1) {
      this.alphaMultiplier = var1;
      return this;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      this.alphaAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.sliderAnimation.method4997(this.state ? Helper450.FORWARDS : Helper450.BACKWARDS);
      int var6 = (int)(255.0F * this.alphaMultiplier);
      int var7 = (int)(this.alphaAnimation.method5000().intValue() * this.alphaMultiplier);
      float var8 = this.x + this.sliderAnimation.method5000().floatValue();
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, 16.0, 8.0).method826(4.5F).method823(new Color(20, 20, 20, var6).getRGB()).method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, 16.0, 8.0).method826(4.5F).method823(new Color(147, 112, 219, var7).getRGB()).method840()
      );
      rectangle.method677(Helper80.method841(var5, var8, this.y, 8.0, 8.0).method826(4.0F).method823(new Color(220, 220, 220, var6).getRGB()).method840());
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
      }

      return super.method247(var1, var3, var5);
   }

   public Widget5 method292(boolean var1) {
      this.state = var1;
      return this;
   }

   public Widget5 method293(Runnable var1) {
      this.runnable = var1;
      return this;
   }
}
