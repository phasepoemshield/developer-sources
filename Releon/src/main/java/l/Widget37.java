package l;

import net.minecraft.client.gui.DrawContext;

public class Widget37 extends Helper296 {
   private final Setting7 setting;
   private final int color;

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      rectangle.method677(Helper80.method841(var1.getMatrices(), this.x, this.y, 8.0, 8.0).method826(2.0F).method823(this.color).method840());
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Helper147.method1224(var1, var3, this.x, this.y, 8.0, 8.0) && var5 == 0) {
         this.setting.method2555(this.color);
      }

      return super.method247(var1, var3, var5);
   }

   public Widget37(Setting7 var1, int var2) {
      this.setting = var1;
      this.color = var2;
   }
}
