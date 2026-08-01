package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Helper459 extends Widget8 {
   private static final int HOVER_ANIMATION_MS = 170;
   private static final int SELECT_ANIMATION_MS = 220;
   private static final float CHIP_BG_ALPHA = 0.42F;
   private static final float CHIP_OUTLINE_ALPHA = 0.58F;
   private static final float CHIP_HOVER_BG_BLEND = 0.12F;
   private static final float CHIP_HOVER_OUTLINE_BLEND = 0.22F;
   private static final float CHIP_HOVER_TEXT_BLEND = 0.15F;
   private final Setting8 setting;
   private final Map<String, Helper467> chipAnimations = new HashMap<>();
   private final Map<String, Helper467> chipHoverAnimations = new HashMap<>();
   private float chipsStartX;
   private float chipsStartY;
   private float chipsMaxW;
   private float chipsEndY;

   public Helper459(Setting8 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      float var6 = 12.0F;
      String var7 = this.method341();
      float var8 = this.x + 8.0F;
      float var9 = this.y + 7.0F;
      float var10 = Math.max(0.0F, this.x + this.width - 6.0F - var8);
      Helper140 var11 = Releon.method71().method30();
      var11.method1209(var5.peek().getPositionMatrix(), var8, this.y + 2.0F, var10, var6);
      Helper103.method927(13, Helper101.DEFAULT).method1473(var5, var7, var8, var9, var10, -2828575);
      var11.method1210();
      this.chipsStartX = this.x + 8.0F;
      this.chipsStartY = this.y + var6 + 2.0F;
      this.chipsMaxW = Math.max(40.0F, this.width - 17.0F);
      this.method4849(var5, var2, var3);
      this.height = Math.max(var6 + 6.0F, this.chipsEndY - this.y + 4.0F);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      return var5 == 0 && this.method4850(var1, var3) ? true : super.method247(var1, var3, var5);
   }

   @Override
   public boolean method285(double var1, double var3) {
      return Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height);
   }

   private void method4849(MatrixStack var1, int var2, int var3) {
      Helper175 var4 = Helper103.method927(12, Helper101.DEFAULT);
      List<String> var5 = this.setting.method2589();
      float var6 = 3.0F;
      float var7 = 10.0F;
      float var8 = 2.0F;
      float var9 = 3.0F;
      float var10 = this.chipsStartX;
      float var11 = this.chipsStartY;
      float var12 = this.chipsStartX + this.chipsMaxW;
      int var13 = ClickGui.method2650().method2655();

      for (String var15 : var5) {
         String var16 = this.method343(var15);
         float var17 = var4.method1479(var16);
         float var18 = Math.min(this.chipsMaxW, var17 + var6 * 2.0F);
         if (var10 + var18 > var12) {
            var10 = this.chipsStartX;
            var11 += var7 + var8;
         }

         boolean var19 = Helper147.method1224(var2, var3, var10, var11, var18, var7);
         Helper467 var20 = this.chipHoverAnimations.computeIfAbsent(var15, var0 -> new Animation2().method5003(170).method5004(1.0));
         var20.method4997(var19 ? Helper450.FORWARDS : Helper450.BACKWARDS);
         float var21 = Math.max(0.0F, Math.min(1.0F, var20.method5000().floatValue()));
         boolean var22 = this.setting.method2588(var15);
         Helper467 var23 = this.chipAnimations.computeIfAbsent(var15, var0 -> new Animation2().method5003(220).method5004(1.0));
         var23.method4997(var22 ? Helper450.FORWARDS : Helper450.BACKWARDS);
         float var24 = Math.max(0.0F, Math.min(1.0F, var23.method5000().floatValue()));
         int var25 = new Color(40, 40, 45, 40).getRGB();
         int var26 = Helper133.method1108(var13, 0.42F);
         int var27 = new Color(55, 52, 55, 180).getRGB();
         int var28 = Helper133.method1108(var13, 0.58F);
         int var29 = -2828575;
         byte var30 = -1;
         int var31 = Helper133.method1111(var24, var25, var26);
         int var32 = Helper133.method1111(var24, var27, var28);
         int var33 = Helper133.method1111(var24, var29, var30);
         int var34 = Helper133.method1091(var31) << 24 | 16777215;
         int var35 = Helper133.method1091(var32) << 24 | 16777215;
         var31 = Helper133.method1111(var21 * 0.12F, var31, var34);
         var32 = Helper133.method1111(var21 * 0.22F, var32, var35);
         var33 = Helper133.method1111(var21 * 0.15F, var33, -1);
         rectangle.method677(
            Helper80.method841(var1, var10, var11, var18, var7).method826(2.0F).method835(1.0F).method839(var32).method823(var31).method840()
         );
         float var36 = var10 + (var18 - var17) / 2.0F;
         float var37 = var4.method1481(var16);
         float var38 = var11 + (var7 - var37) / 2.0F + var37 - 8.5F;
         var4.method1474(var1, var16, var36, var38, var33);
         var10 += var18 + var9;
      }

      this.chipsEndY = var11 + var7;
   }

   private boolean method4850(double var1, double var3) {
      Helper175 var5 = Helper103.method927(12, Helper101.DEFAULT);
      List<String> var6 = this.setting.method2589();
      float var7 = 3.0F;
      float var8 = 10.0F;
      float var9 = 2.0F;
      float var10 = 3.0F;
      float var11 = this.chipsStartX;
      float var12 = this.chipsStartY;
      float var13 = this.chipsStartX + this.chipsMaxW;

      for (String var15 : var6) {
         float var16 = var5.method1479(this.method343(var15));
         float var17 = Math.min(this.chipsMaxW, var16 + var7 * 2.0F);
         if (var11 + var17 > var13) {
            var11 = this.chipsStartX;
            var12 += var8 + var9;
         }

         if (Helper147.method1224(var1, var3, var11, var12, var17, var8)) {
            if (this.setting.method2588(var15)) {
               this.setting.method2590().remove(var15);
            } else {
               this.setting.method2590().add(var15);
            }

            return true;
         }

         var11 += var17 + var10;
      }

      return false;
   }
}
