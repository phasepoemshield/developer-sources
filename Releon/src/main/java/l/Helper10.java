package l;

import fat.releon.Releon;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.ColorHelper;

public class Helper10 extends Widget8 {
   private static final float LABEL_X = 10.0F;
   private static final float LABEL_Y = 7.0F;
   private static final float SCISSOR_HEIGHT = 14.0F;
   private static final int LABEL_FONT_SIZE = 12;
   private static final float LABEL_RIGHT_GAP = 6.0F;
   private static final float BIND_BOX_Y = 4.5F;
   private static final float BIND_TEXT_Y = 10.0F;
   private final Setting9 setting;
   private boolean binding;

   public Helper10(Setting9 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      String var6 = Helper209.method1791(this.setting.getKey());
      String var7 = this.binding ? " ..." : var6;
      float var8 = Helper103.method927(11, Helper101.SEMI).method1479(var7) - 2.0F;
      String var9 = this.method341();
      float var10 = Helper103.method927(12, Helper101.DEFAULT).method1479(var9);
      float var11 = this.x + this.width - var8 - 19.0F;
      float var12 = Math.max(24.0F, var11 - (this.x + 10.0F) - 6.0F);
      this.height = 17.0F;
      rectangle.method677(
         Helper80.method841(var5, var11, this.y + 4.5F, var8 + 10.0F, 11.5)
            .method826(3.0F)
            .method834(1.0F)
            .method835(2.0F)
            .method839(new Color(25, 25, 25, 255).getRGB())
            .method825(
               new Color(25, 25, 25, 255).getRGB(),
               new Color(25, 25, 25, 255).getRGB(),
               new Color(25, 25, 25, 255).getRGB(),
               new Color(25, 25, 25, 255).getRGB()
            )
            .method840()
      );
      int var13 = ColorHelper.getArgb(255, 135, 136, 148);
      Helper103.method927(11, Helper101.SEMI).method1474(var5, var7, this.x + this.width - 14.0F - var8 - 1.0F, this.y + 10.0F, var13);
      Helper103.method927(15, Helper101.DEFAULT).method1474(var1.getMatrices(), "", this.x + 7.0F, this.y + 9.0F, new Color(102, 0, 153, 255).getRGB());
      if (var10 > var12) {
         Helper140 var14 = Releon.method71().method30();
         var14.method1209(var5.peek().getPositionMatrix(), this.x + 10.0F, this.y + 7.0F - 3.0F, var12, 14.0F);
         Helper103.method927(12, Helper101.DEFAULT).method1473(var5, var9, this.x + 10.0F, this.y + 7.0F, var12, new Color(255, 255, 255, 255).getRGB());
         var14.method1210();
      } else {
         Helper103.method927(12, Helper101.DEFAULT).method1474(var5, var9, this.x + 10.0F, this.y + 7.0F, new Color(255, 255, 255, 255).getRGB());
      }
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
