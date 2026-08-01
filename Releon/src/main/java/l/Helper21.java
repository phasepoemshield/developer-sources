package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Helper21 extends Widget8 {
   private final Widget21 checkComponent = new Widget21();
   private final Widget41 settingComponent = new Widget41();
   private final Setting1 setting;

   public Helper21(Setting1 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      this.height = 15.0F;
      Helper103.method927(20, Helper101.ICONRICHREG)
         .method1474(var1.getMatrices(), "", this.x + 6.0F, this.y + 10.0F, new Color(255, 255, 255, 255).getRGB());
      Helper103.method927(12, Helper101.DEFAULT).method1474(var1.getMatrices(), this.method341(), this.x + 20.0F, this.y + 11.0F, -2828575);
      this.checkComponent
         .method3067(this.x + this.width - 19.0F, this.y + 6.5F)
         .method3070(() -> this.setting.method1976(!this.setting.method1974()))
         .method3069(this.setting.method1974())
         .method246(var1, var2, var3, var4);
      ((Widget41)this.settingComponent.method294(this.x + this.width - 31.0F, this.y + 6.0F))
         .method4871(() -> this.method389(var2, var3))
         .method246(var1, var2, var3, var4);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.checkComponent.method247(var1, var3, var5);
      this.settingComponent.method247(var1, var3, var5);
      return super.method247(var1, var3, var5);
   }

   private void method389(int var1, int var2) {
      Widget35 var3 = null;

      for (Widget35 var5 : windowManager.method4820()) {
         if (var5 instanceof Widget27 && ((Widget27)var5).method3930() == this.setting) {
            var3 = var5;
            break;
         }
      }

      if (var3 != null) {
         windowManager.method4819(var3);
      } else {
         Widget35 var6 = new Widget27(this.setting).method4828(var1 + 10, var2).method4827(137.0F, 23.0F).method4826(false);
         windowManager.method4818(var6);
      }
   }
}
