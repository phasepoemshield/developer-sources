package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget26 extends Helper296 {
   private final Setting7 setting;
   private boolean hueDragging;
   private float X;
   private float Y;
   private float W;
   private float H;

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      this.X = this.x + 6.0F;
      this.Y = this.y + 18.5F;
      this.W = 88.0F;
      this.H = 50.0F;
      int[] var6 = new int[]{-16777216, -1, -16777216, Color.HSBtoRGB(this.setting.method2556(), 1.0F, 1.0F)};
      rectangle.method677(Helper80.method841(var5, this.X, this.Y, this.W, this.H).method826(2.0F).method825(var6).method840());
      float var7 = MathHelper.clamp(this.X + this.W * this.setting.method2557(), this.X, this.X + this.W - 5.0F);
      float var8 = MathHelper.clamp(this.Y + this.H * (1.0F - this.setting.method2558()), this.Y, this.Y + this.H - 5.0F);
      rectangle.method677(
         Helper80.method841(var5, var7, var8, 5.0, 5.0).method826(2.5F).method834(1.0F).method835(3.0F).method823(16777215).method839(-1).method840()
      );
      float var9 = MathHelper.clamp((var2 - this.X) / this.W, 0.0F, 1.0F);
      if (this.hueDragging) {
         this.setting.method2563(MathHelper.clamp(1.0F - (var3 - this.Y) / this.H, 0.0F, 1.0F));
         this.setting.method2562(var9);
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.hueDragging = var5 == 0 && Helper147.method1224(var1, var3, this.X, this.Y, this.W, this.H);
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.hueDragging = false;
      return super.method248(var1, var3, var5);
   }

   public Widget26(Setting7 var1) {
      this.setting = var1;
   }
}
