package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class Widget39 extends Helper296 {
   private final Setting8 setting;
   private final String text;
   private float alpha;
   private final Helper467 alphaAnimation = new Animation2().method5003(300).method5004(1.0);

   public Widget39(Setting8 var1, String var2) {
      this.setting = var1;
      this.text = var2;
      this.alphaAnimation.method4997(Helper450.BACKWARDS);
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      boolean var6 = this.setting.method2590().contains(this.text);
      this.alphaAnimation.method4997(var6 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var7 = this.alphaAnimation.method5000().floatValue();
      Color var8 = new Color(102, 0, 153, 200);
      Color var9 = new Color(20, 20, 20, 255);
      int var10 = Helper133.method1123(var9.getRGB(), var8.getRGB(), var7);
      int var11 = Helper133.method1108(var10, this.alpha);
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.x + 1.0F, this.y + 0.5F, this.width - 2.0F, this.height - 1.0F)
            .method827(Widget40.method4847(this.setting.method2589(), this.text))
            .method823(var11)
            .method840()
      );
      int var12 = var6 ? new Color(255, 255, 255).getRGB() : new Color(180, 180, 180).getRGB();
      int var13 = Helper133.method1108(var12, this.alpha);
      Helper103.method927(12, Helper101.BOLD).method1474(var5, this.text, this.x + 6.0F, this.y + 4.5F, var13);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height) && var5 == 0) {
         ArrayList var6 = new ArrayList<>(this.setting.method2590());
         if (var6.contains(this.text)) {
            var6.remove(this.text);
         } else {
            var6.add(this.text);
            this.method4845(var6, this.setting.method2589());
         }

         this.setting.method2592(var6);
         return true;
      } else {
         return false;
      }
   }

   private void method4845(List<String> var1, List<String> var2) {
      var1.sort(Comparator.comparingInt(var2::indexOf));
   }

   public Widget39 method4846(float var1) {
      this.alpha = var1;
      return this;
   }
}
