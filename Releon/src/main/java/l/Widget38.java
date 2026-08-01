package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget38 extends Helper296 {
   private final Setting7 setting;
   private boolean alphaDragging;
   private float X;
   private float Y;
   private float W;
   private float H;

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      this.X = this.x + 6.0F;
      this.Y = this.y + 83.5F;
      this.W = 88.0F;
      this.H = 4.0F;
      float var6 = MathHelper.clamp(this.X + this.W * this.setting.method2559(), this.X, this.X + this.W - 4.0F);
      float var7 = MathHelper.clamp((var2 - this.X) / this.W, 0.0F, 1.0F);
      image.method678("textures/gui/alphabar.png").method677(Helper80.method841(var5, this.X, this.Y, this.W, this.H).method826(4.0F).method840());
      rectangle.method677(
         Helper80.method841(var5, this.X, this.Y - 0.2, this.W + 0.5, this.H)
            .method826(1.5F)
            .method825(Integer.MIN_VALUE, 134217728, this.setting.method2554(), this.setting.method2554())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var5, var6, this.Y, this.H, this.H).method826(this.H / 2.0F).method835(3.0F).method823(16777215).method839(-1).method840()
      );
      if (this.alphaDragging) {
         this.setting.method2564(var7);
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.alphaDragging = var5 == 0 && Helper147.method1224(var1, var3, this.X, this.Y, this.W, this.H);
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.alphaDragging = false;
      return super.method248(var1, var3, var5);
   }

   public Widget38(Setting7 var1) {
      this.setting = var1;
   }
}
