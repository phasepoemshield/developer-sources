package l;

import fat.releon.Releon;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Helper1 extends Widget8 {
   private static final float LABEL_X = 10.0F;
   private static final float LABEL_Y = 8.0F;
   private static final float SCISSOR_HEIGHT = 16.0F;
   private static final float TOGGLE_X = 21.0F;
   private static final float TOGGLE_Y = 7.0F;
   private static final float LABEL_RIGHT_GAP = 6.0F;
   private static final int LABEL_FONT_SIZE = 13;
   private final Widget21 checkComponent = new Widget21();
   private final Setting3 setting;

   public Helper1(Setting3 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      String var5 = this.method341();
      float var6 = Helper103.method927(13, Helper101.DEFAULT).method1479(var5);
      float var7 = this.x + this.width - 21.0F - 8.0F;
      float var8 = Math.max(24.0F, var7 - (this.x + 10.0F) - 6.0F);
      int var9 = ClickGui.method2650().method2655();
      Helper103.method927(20, Helper101.ICONS).method1474(var1.getMatrices(), "", this.x + 5.0F, this.y + 11.0F, var9);
      this.height = 19.0F;
      if (var6 > var8) {
         Helper140 var10 = Releon.method71().method30();
         var10.method1209(var1.getMatrices().peek().getPositionMatrix(), this.x + 10.0F, this.y + 8.0F - 3.0F, var8, 16.0F);
         Helper103.method927(13, Helper101.DEFAULT)
            .method1473(var1.getMatrices(), var5, this.x + 10.0F, this.y + 8.0F, var8, new Color(255, 255, 255, 255).getRGB());
         var10.method1210();
      } else {
         Helper103.method927(13, Helper101.DEFAULT)
            .method1474(var1.getMatrices(), var5, this.x + 10.0F, this.y + 8.0F, new Color(255, 255, 255, 255).getRGB());
      }

      this.checkComponent
         .method3067(this.x + this.width - 21.0F, this.y + 7.0F)
         .method3070(() -> this.setting.method2201(!this.setting.method2200()))
         .method3069(this.setting.method2200())
         .method246(var1, var2, var3, var4);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.checkComponent.method247(var1, var3, var5);
      return super.method247(var1, var3, var5);
   }
}
