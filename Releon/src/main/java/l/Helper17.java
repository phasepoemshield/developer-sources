package l;

import fat.releon.Releon;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Helper17 extends Widget8 {
   private static final float LABEL_X = 10.0F;
   private static final float LABEL_Y = 7.0F;
   private static final float SCISSOR_HEIGHT = 14.0F;
   private final Setting7 setting;

   public Helper17(Setting7 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      String var6 = this.method341();
      float var7 = Helper103.method927(12, Helper101.DEFAULT).method1479(var6);
      float var8 = 62.0F;
      int var9 = ClickGui.method2650().method2655();
      this.height = 17.0F;
      Helper103.method927(20, Helper101.ICONRICHREG).method1474(var1.getMatrices(), "", this.x + 6.0F, this.y + 14.5F, var9);
      if (var7 > var8) {
         Helper140 var10 = Releon.method71().method30();
         var10.method1209(var5.peek().getPositionMatrix(), this.x + 10.0F, this.y + 7.0F - 3.0F, var8, 14.0F);
         Helper103.method927(12, Helper101.DEFAULT).method1473(var5, var6, this.x + 10.0F, this.y + 7.0F, var8, new Color(255, 255, 255, 255).getRGB());
         var10.method1210();
      } else {
         Helper103.method927(12, Helper101.DEFAULT).method1474(var5, var6, this.x + 10.0F, this.y + 7.0F, new Color(255, 255, 255, 255).getRGB());
      }

      rectangle.method677(
         Helper80.method841(var5, this.x + this.width - 18.0F, this.y + 5.0F, 7.0, 7.0).method826(3.0F).method823(this.setting.method2553()).method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x + this.width - 18.0F, this.y + 5.0F, 7.0, 7.0)
            .method826(3.0F)
            .method835(2.0F)
            .method834(1.0F)
            .method839(Helper133.method1160())
            .method823(16777215)
            .method840()
      );
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      float var6 = this.x + this.width - 18.0F;
      float var7 = this.y + 5.0F;
      if (Helper147.method1224(var1, var3, var6 - 2.0F, var7 - 2.0F, 11.0, 11.0) && var5 == 0) {
         Widget35 var8 = null;

         for (Widget35 var10 : windowManager.method4820()) {
            if (var10 instanceof Widget36) {
               var8 = var10;
               break;
            }
         }

         if (var8 != null) {
            windowManager.method4819(var8);
         } else {
            Widget35 var11 = new Widget36(this.setting).method4828((int)(var1 - 110.0), (int)(var3 - 20.0)).method4827(100.0F, 155.0F).method4826(true);
            windowManager.method4818(var11);
         }

         return true;
      } else {
         return super.method247(var1, var3, var5);
      }
   }
}
