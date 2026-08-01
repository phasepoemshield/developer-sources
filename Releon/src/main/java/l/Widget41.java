package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Widget41 extends Helper296 {
   private Runnable runnable;

   public Widget41() {
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      Helper103.method927(15, Helper101.GUIICONS).method1474(var1.getMatrices(), "B", this.x - 5.0F, this.y + 6.0F, new Color(128, 128, 128, 255).getRGB());
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Helper147.method1224(var1, var3, this.x - 5.0F, this.y + 6.0F, 7.0, 7.0) && var5 == 0) {
         this.runnable.run();
      }

      return super.method247(var1, var3, var5);
   }

   public Widget41 method4871(Runnable var1) {
      this.runnable = var1;
      return this;
   }
}
