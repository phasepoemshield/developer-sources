package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Widget4 extends Widget35 {
   private static final int HEADER_HEIGHT = 26;
   private static final int SIDE_PADDING = 12;
   private static final int TOP_PADDING = 8;
   private static final int MAX_HEIGHT = 220;
   private static final int MIN_HEIGHT = 40;
   private static final float SCROLL_SPEED = 18.0F;
   private static final float SMOOTH_FACTOR = 0.18F;
   private final List<Widget8> settingComponents = new ArrayList<>();
   public final Helper242 module;
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;

   public Widget4(Helper242 var1, float var2, float var3) {
      this.module = var1;
      this.x = var2;
      this.y = var3;
      new Helper262().method2699(var1.settings(), this.settingComponents);
      this.method4826(true);
      if (this.width <= 0.0F) {
         this.width = 220.0F;
      }
   }

   public Widget4(Helper242 var1) {
      this(var1, 700.0F, 150.0F);
   }

   private boolean method282(Widget8 var1) {
      Supplier var2 = var1.method344().method2703();
      return var2 == null || (Boolean)var2.get();
   }

   private int method283() {
      int var1 = 0;

      for (Widget8 var3 : this.settingComponents) {
         if (this.method282(var3)) {
            var1 += (int)var3.height;
         }
      }

      return var1;
   }

   @Override
   public void method284(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Helper140 var6 = Releon.method71().method30();
      int var7 = new Color(180, 180, 200, 255).getRGB();
      int var8 = this.method283();
      this.height = MathHelper.clamp(var8 + 26 + 16, 40, 220);
      boolean var9 = var8 > this.height - 26.0F - 8.0F;
      int var10 = (int)(this.height - 26.0F - 8.0F);
      blur.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height)
            .method826(12.0F)
            .method838(40.0F)
            .method823(new Color(0, 0, 0, 255).getRGB())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height).method826(11.0F).method823(new Color(0, 0, 0, 255).getRGB()).method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height)
            .method826(11.0F)
            .method835(1.4F)
            .method839(new Color(0, 0, 0, 255).getRGB())
            .method823(0)
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x + 12.0F, this.y + 26.0F - 2.0F, this.width - 24.0F, 1.0).method823(new Color(0, 0, 0, 255).getRGB()).method840()
      );
      Helper103.method927(16, Helper101.SEMI)
         .method1475(
            var5,
            Helper300.method2976(this.module.getVisibleName()) + " " + Helper300.method2976("Settings"),
            this.x + 12.0F,
            this.y + 8.0F + 2.0F,
            Helper133.method1160(),
            var7
         );
      float var11 = this.x + this.width - 12.0F - 12.0F;
      float var12 = this.y + 8.0F + 5.0F;
      boolean var13 = Helper147.method1224(var2, var3, var11 - 12.0F, var12 - 5.0F, 24.0, 24.0);
      int var14 = var13 ? -1 : Helper133.method1159(0.7F);
      Helper103.method927(19, Helper101.ICONS).method1477(var5, "K", var11, var12, var14);
      int var15 = Math.max(0, var8 - var10);
      this.scroll = MathHelper.clamp(this.scroll, (float)(-var15), 0.0F);
      this.smoothedScroll = MathHelper.lerp(0.18F, this.smoothedScroll, this.scroll);
      if (var9) {
         var6.method1209(var5.peek().getPositionMatrix(), this.x + 12.0F, this.y + 26.0F, this.width - 24.0F, var10);
      }

      float var16 = this.y + 26.0F + this.smoothedScroll;

      for (Widget8 var18 : this.settingComponents) {
         if (this.method282(var18)) {
            var18.x = this.x + 12.0F;
            var18.y = var16;
            var18.width = this.width - 24.0F;
            var18.method246(var1, var2, var3, var4);
            var16 += var18.height;
         }
      }

      if (var9) {
         var6.method1210();
      }

      if (var9) {
         float var24 = -this.smoothedScroll / var15;
         float var25 = this.y + 26.0F;
         float var19 = var10;
         float var20 = Math.max(20.0F, var19 * ((float)var10 / var8));
         float var21 = var25 + var24 * (var19 - var20);
         float var22 = this.x + this.width - 8.0F;
         float var23 = 4.0F;
         rectangle.method677(Helper80.method841(var5, var22, var25, var23, var19).method826(2.0F).method823(new Color(0, 0, 0, 255).getRGB()).method840());
         rectangle.method677(Helper80.method841(var5, var22, var21, var23, var20).method826(2.0F).method823(var7).method840());
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 == 0) {
         float var6 = this.x + this.width - 12.0F - 12.0F;
         float var7 = this.y + 8.0F + 10.0F;
         if (Helper147.method1224(var1, var3, var6 - 12.0F, var7 - 12.0F, 24.0, 24.0)) {
            this.method4830();
            return true;
         }

         if (Helper147.method1224(var1, var3, this.x, this.y, this.width, 26.0)) {
            this.dragging = true;
            this.dragX = (int)(this.x - var1);
            this.dragY = (int)(this.y - var3);
            return true;
         }
      }

      for (Widget8 var11 : this.settingComponents) {
         var11.method285(var1, var3);
      }

      boolean var10 = false;

      for (Widget8 var8 : this.settingComponents) {
         if (this.method282(var8) && var8.method285(var1, var3)) {
            var10 = true;
            break;
         }
      }

      if (var10) {
         for (int var13 = this.settingComponents.size() - 1; var13 >= 0; var13--) {
            Widget8 var15 = this.settingComponents.get(var13);
            if (this.method282(var15) && var15.method285(var1, var3)) {
               var15.method247(var1, var3, var5);
               return true;
            }
         }
      }

      for (Widget8 var16 : this.settingComponents) {
         if (this.method282(var16)) {
            var16.method247(var1, var3, var5);
         }
      }

      return true;
   }

   @Override
   public boolean method285(double var1, double var3) {
      for (Widget8 var6 : this.settingComponents) {
         var6.method285(var1, var3);
      }

      for (Widget8 var8 : this.settingComponents) {
         if (this.method282(var8) && var8.method285(var1, var3)) {
            return true;
         }
      }

      return super.method4829(var1, var3);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.dragging = false;
      this.settingComponents.forEach(var5x -> var5x.method248(var1, var3, var5));
      return super.method248(var1, var3, var5);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      boolean var7 = Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height);
      if (var7 && this.method283() > this.height - 26.0F - 8.0F) {
         this.scroll += (float)var5 * 18.0F;
         return true;
      } else {
         this.settingComponents.forEach(var6 -> var6.method249(var1, var3, var5));
         return false;
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      this.settingComponents.forEach(var3x -> var3x.method250(var1, var2, var3));
      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      this.settingComponents.forEach(var2x -> var2x.method251(var1, var2));
      return super.method251(var1, var2);
   }
}
