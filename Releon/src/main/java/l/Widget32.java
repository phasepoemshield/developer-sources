package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget32 extends Helper296 {
   private final Setting7 setting;

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      int var6 = (int)(this.setting.method2559() * 100.0F);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      if (Helper147.method1224(var1, var3, this.x + 122.0F, this.y + 90.5F, 22.0, 14.0)) {
         this.setting.method2564(MathHelper.clamp((float)(this.setting.method2559() - var5 * 2.0 / 100.0), 0.0F, 1.0F));
      }

      return super.method249(var1, var3, var5);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      return super.method248(var1, var3, var5);
   }

   public Widget32(Setting7 var1) {
      this.setting = var1;
   }
}
