package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.ColorHelper;

public class Helper471 extends Widget8 {
   private final Setting9 setting;
   private boolean binding;

   public Helper471(Setting9 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      String var6 = Helper209.method1791(this.setting.getKey());
      String var7 = this.binding ? "(" + var6 + ") ..." : var6;
      float var8 = Helper103.method927(11, Helper101.SEMI).method1479(var7) - 2.0F;
      this.height = 20.0F;
      rectangle.method677(
         Helper80.method841(var5, this.x + this.width - var8 - 17.0F, this.y + 5.5F, var8 + 10.0F, 12.0)
            .method826(3.0F)
            .method839(new Color(200, 200, 200, 255).getRGB())
            .method825(
               new Color(255, 255, 255, 255).getRGB(),
               new Color(255, 255, 255, 255).getRGB(),
               new Color(255, 255, 255, 255).getRGB(),
               new Color(255, 255, 255, 255).getRGB()
            )
            .method840()
      );
      int var9 = ColorHelper.getArgb(255, 135, 136, 148);
      Helper103.method927(11, Helper101.SEMI).method1474(var5, var7, this.x + this.width - 12.0F - var8 - 1.0F, this.y + 11.0F, var9);
      Helper103.method927(14, Helper101.ICONRICHREG).method1474(var1.getMatrices(), "", this.x + 6.0F, this.y + 11.0F, new Color(0, 0, 0, 255).getRGB());
      Helper103.method927(12, Helper101.DEFAULT).method1474(var1.getMatrices(), this.method341(), this.x + 17.0F, this.y + 10.0F, -2828575);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 == 0) {
         if (Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height)) {
            this.binding = !this.binding;
         } else {
            this.binding = false;
         }
      }

      if (this.binding && var5 > 1) {
         this.setting.method2706(var5);
         this.binding = false;
      }

      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      int var4 = var1 == 261 ? -1 : var1;
      if (this.binding) {
         this.setting.method2706(var4);
         this.binding = false;
      }

      return super.method250(var1, var2, var3);
   }
}
