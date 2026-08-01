package l;

import java.awt.Color;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector4f;

public class Widget40 extends Helper296 {
   private final Setting5 setting;
   private final String text;
   private float alpha = 1.0F;
   private final Helper467 selectAnimation = new Animation2().method5003(300).method5004(1.0);
   private final Helper467 hoverAnimation = new Animation2().method5003(200).method5004(0.0);

   public Widget40(Setting5 var1, String var2) {
      this.setting = var1;
      this.text = var2;
      this.selectAnimation.method4997(Helper450.BACKWARDS);
      this.hoverAnimation.method4997(Helper450.BACKWARDS);
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      boolean var6 = this.setting.method2385(this.text);
      boolean var7 = Helper147.method1224(var2, var3, this.x, this.y, this.width, this.height);
      this.selectAnimation.method4997(var6 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.hoverAnimation.method4997(var7 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var8 = this.selectAnimation.method5000().floatValue();
      float var9 = this.hoverAnimation.method5000().floatValue();
      float var10 = Math.max(var8, var9 * 0.6F);
      int var11 = (int)(var10 * this.alpha * 140.0F);
      if (var11 > 5) {
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), this.x + 0.5F, this.y, this.width - 1.0F, this.height - 0.5F)
               .method827(method4847(this.setting.method2387(), this.text))
               .method825(
                  new Color(58, 58, 60, var11).getRGB(),
                  new Color(58, 58, 60, var11).getRGB(),
                  new Color(58, 58, 60, 0).getRGB(),
                  new Color(58, 58, 60, 0).getRGB()
               )
               .method840()
         );
      }

      int var12 = var6 ? new Color(255, 255, 255, (int)(this.alpha * 255.0F)).getRGB() : new Color(225, 225, 225, (int)(this.alpha * 255.0F)).getRGB();
      Helper103.method927(12, Helper101.BOLD).method1474(var5, this.text, this.x + 4.0F, this.y + 5.0F, var12);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height) && var5 == 0) {
         this.setting.method2389(this.text);
         return true;
      } else {
         return super.method247(var1, var3, var5);
      }
   }

   public static Vector4f method4847(List<String> var0, String var1) {
      int var2 = var0.indexOf(var1);
      if (var2 == -1) {
         return new Vector4f(0.0F);
      } else if (var0.size() == 1) {
         return new Vector4f(3.0F, 3.0F, 3.0F, 3.0F);
      } else if (var2 == 0) {
         return new Vector4f(3.0F, 3.0F, 0.0F, 0.0F);
      } else {
         return var2 == var0.size() - 1 ? new Vector4f(0.0F, 0.0F, 3.0F, 3.0F) : new Vector4f(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }

   public Widget40 method4848(float var1) {
      this.alpha = var1;
      return this;
   }
}
