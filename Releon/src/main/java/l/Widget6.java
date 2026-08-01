package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Widget6 extends Helper296 {
   private static final int[] THEME_COLORS = new int[]{-39623, -9659651, -7569409, -23178, -33925, -8650827, -10496, -38476, -16724271, -47872};
   private static final float CIRCLE_SIZE = 10.0F;
   private static final float CIRCLE_GAP = 5.0F;
   private int selectedIndex = 0;

   public Widget6() {
      int var1 = Hud.method1824().colorSetting.method2553() | 0xFF000000;

      for (int var2 = 0; var2 < THEME_COLORS.length; var2++) {
         if (THEME_COLORS[var2] == var1) {
            this.selectedIndex = var2;
            break;
         }
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      float var6 = THEME_COLORS.length * 10.0F + (THEME_COLORS.length - 1) * 5.0F;
      float var7 = this.x + (this.width - var6) / 2.0F;
      float var8 = this.y + (this.height - 10.0F) / 2.0F;

      for (int var9 = 0; var9 < THEME_COLORS.length; var9++) {
         float var10 = var7 + var9 * 15.0F;
         int var11 = THEME_COLORS[var9];
         rectangle.method677(Helper80.method841(var5, var10, var8, 10.0, 10.0).method826(5.0F).method823(var11).method840());
         if (var9 == this.selectedIndex) {
            rectangle.method677(
               Helper80.method841(var5, var10 - 1.0F, var8 - 1.0F, 12.0, 12.0).method826(6.0F).method835(1.5F).method823(0).method839(-1).method840()
            );
         }
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         float var6 = THEME_COLORS.length * 10.0F + (THEME_COLORS.length - 1) * 5.0F;
         float var7 = this.x + (this.width - var6) / 2.0F;
         float var8 = this.y + (this.height - 10.0F) / 2.0F;

         for (int var9 = 0; var9 < THEME_COLORS.length; var9++) {
            float var10 = var7 + var9 * 15.0F;
            if (Helper147.method1224(var1, var3, var10, var8, 10.0, 10.0)) {
               this.selectedIndex = var9;
               Hud.method1824().colorSetting.method2555(THEME_COLORS[var9]);
               return true;
            }
         }

         return false;
      }
   }
}
