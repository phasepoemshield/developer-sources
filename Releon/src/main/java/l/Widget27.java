package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget27 extends Widget35 {
   private final List<Widget8> components = new ArrayList<>();
   private final Setting1 setting;

   public Widget27(Setting1 var1) {
      this.setting = var1;
      new Helper262().method2699(var1.method1975(), this.components);
   }

   @Override
   public void method284(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Helper140 var6 = Releon.method71().method30();
      this.height = MathHelper.clamp(this.method3928(), 0, 200);
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width + 30.0F, this.height)
            .method826(4.0F)
            .method834(2.0F)
            .method835(1.0F)
            .method839(new Color(75, 75, 75, 255).getRGB())
            .method825(
               new Color(14, 14, 16, 255).getRGB(),
               new Color(31, 27, 35, 255).getRGB(),
               new Color(31, 27, 35, 255).getRGB(),
               new Color(14, 14, 16, 255).getRGB()
            )
            .method840()
      );
      Helper103.method927(15, Helper101.SEMI)
         .method1475(
            var1.getMatrices(),
            Helper300.method2976(this.setting.getName()) + " " + Helper300.method2976("Settings"),
            this.x + 10.0F,
            this.y + 10.0F,
            Helper133.method1160(),
            new Color(165, 165, 165, 255).getRGB()
         );
      boolean var7 = MathHelper.clamp(this.height, 0.0F, 200.0F) == 200.0F;
      if (var7) {
         var6.method1209(var5.peek().getPositionMatrix(), this.x, this.y + 23.0F, this.width, this.height - 28.0F);
      }

      float var8 = 0.0F;
      int var9 = 0;

      for (int var10 = this.components.size() - 1; var10 >= 0; var10--) {
         Widget8 var11 = this.components.get(var10);
         Supplier var12 = var11.method344().method2703();
         if (var12 == null || (Boolean)var12.get()) {
            var11.x = this.x;
            var11.y = (float)(this.y + 19.0F + var8 + (this.method3928() - 25 - var11.height) + this.smoothedScroll);
            var11.width = this.width + 30.0F;
            var11.method246(var1, var2, var3, var4);
            var8 -= var11.height;
            var9 += (int)var11.height;
         }
      }

      if (var7) {
         var6.method1210();
      }

      int var13 = Math.max(0, var9 - (int)(this.height - 23.0F));
      this.scroll = MathHelper.clamp(this.scroll, (double)(-var13), 0.0);
      this.smoothedScroll = MathHelper.lerp(0.1F, this.smoothedScroll, this.scroll);
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.method4826(Helper147.method1224(var1, var3, this.x, this.y, this.width, 19.0) && var5 == 0);
      boolean var6 = false;

      for (Widget8 var8 : this.components) {
         if (var8.method285(var1, var3)) {
            var6 = true;
            break;
         }
      }

      if (var6) {
         for (int var9 = this.components.size() - 1; var9 >= 0; var9--) {
            Widget8 var10 = this.components.get(var9);
            if (var10.method285(var1, var3)) {
               var10.method247(var1, var3, var5);
               return super.method247(var1, var3, var5);
            }
         }
      }

      this.components.forEach(var5x -> var5x.method247(var1, var3, var5));
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method285(double var1, double var3) {
      this.components.forEach(var4 -> var4.method285(var1, var3));

      for (Helper296 var6 : this.components) {
         if (var6.method285(var1, var3)) {
            return true;
         }
      }

      return super.method285(var1, var3);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.components.forEach(var5x -> var5x.method248(var1, var3, var5));
      return super.method248(var1, var3, var5);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      boolean var7 = MathHelper.clamp(this.height, 0.0F, 200.0F) == 200.0F && Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height);
      if (var7) {
         this.scroll += var5 * 20.0;
      }

      this.components.forEach(var6 -> var6.method249(var1, var3, var5));
      return var7;
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      this.components.forEach(var3x -> var3x.method250(var1, var2, var3));
      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      this.components.forEach(var2x -> var2x.method251(var1, var2));
      return super.method251(var1, var2);
   }

   public int method3928() {
      float var1 = 0.0F;

      for (Widget8 var3 : this.components) {
         Supplier var4 = var3.method344().method2703();
         if (var4 == null || (Boolean)var4.get()) {
            var1 += var3.height;
         }
      }

      return (int)(var1 + 25.0F);
   }

   public List<Widget8> method3929() {
      return this.components;
   }

   public Setting1 method3930() {
      return this.setting;
   }
}
