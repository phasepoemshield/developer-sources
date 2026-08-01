package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Widget3 extends Helper296 {
   private String text;
   private Runnable runnable;
   private int color = -8288257;

   public Widget3() {
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      this.width = Helper103.method926(12).method1479(this.text) + 13.0F;
      this.height = 12.0F;
      rectangle.method677(Helper80.method841(var5, this.x, this.y, this.width, this.height).method826(2.0F).method823(this.color).method840());
      Helper103.method927(12, Helper101.BOLD).method1477(var5, this.text, this.x + this.width / 2.0, this.y + 5.0F, -1);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height) && var5 == 0) {
         this.runnable.run();
      }

      return super.method247(var1, var3, var5);
   }

   public Widget3 method259(String var1) {
      this.text = var1;
      return this;
   }

   public Widget3 method260(Runnable var1) {
      this.runnable = var1;
      return this;
   }

   public Widget3 method261(int var1) {
      this.color = var1;
      return this;
   }
}
