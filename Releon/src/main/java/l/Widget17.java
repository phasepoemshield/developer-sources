package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class Widget17 extends Widget35 {
   private final List<Widget14> components = new ArrayList<>();
   public final Helper465 item;
   private final Helper361 settings;

   public Widget17(Helper465 var1, Helper361 var2) {
      this.item = var1;
      this.settings = var2;
      this.method2937();
      this.method4826(true);
   }

   private void method2937() {
      this.components.add(new Helper26(this.settings));
      if (this.settings.method3595()) {
         this.components.add(new Helper25(this.settings));
      }
   }

   @Override
   public void method284(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Helper140 var6 = Releon.method71().method30();
      this.height = MathHelper.clamp(this.method2938() + 5, 0, 200);
      blur.method677(
         Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, this.height)
            .method826(8.0F)
            .method838(64.0F)
            .method823(new Color(0, 0, 0, 200).getRGB())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, this.height)
            .method826(8.0F)
            .method834(2.0F)
            .method835(0.5F)
            .method839(new Color(18, 19, 20, 225).getRGB())
            .method825(
               new Color(18, 19, 20, 175).getRGB(), new Color(0, 2, 5, 175).getRGB(), new Color(0, 2, 5, 175).getRGB(), new Color(18, 19, 20, 175).getRGB()
            )
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y + 22.0F, this.width, 0.5).method826(8.0F).method823(new Color(155, 155, 155, 55).getRGB()).method840()
      );
      ItemStack var7 = this.item.method365();
      Helper178.method1502(var1, var7, this.x + 7.0F, this.y + 4.0F, false, false, 0.8F);
      String var8 = this.item.method364();
      Helper103.method927(15, Helper101.SEMI)
         .method1475(var1.getMatrices(), var8, this.x + 25.0F, this.y + 10.0F, Helper133.method1160(), new Color(165, 165, 165, 255).getRGB());
      Helper103.method927(17, Helper101.ICONS)
         .method1474(var1.getMatrices(), "K", this.x + this.width - 15.0F, this.y + 10.0F, Helper133.method1159(0.5F));
      boolean var9 = MathHelper.clamp(this.height, 0.0F, 200.0F) == 200.0F;
      if (var9) {
         var6.method1209(var5.peek().getPositionMatrix(), this.x, this.y + 23.0F, this.width, this.height - 24.0F);
      }

      float var10 = 0.0F;
      int var11 = 0;

      for (int var12 = this.components.size() - 1; var12 >= 0; var12--) {
         Widget14 var13 = this.components.get(var12);
         var13.x = this.x;
         var13.y = (float)(this.y + 22.0F + var10 + (this.method2938() - 25 - var13.height) + this.smoothedScroll);
         var13.width = this.width;
         var13.method246(var1, var2, var3, var4);
         var10 -= var13.height;
         var11 += (int)var13.height;
      }

      if (var9) {
         var6.method1210();
      }

      int var19 = (int)Math.max(0.0F, var11 - (this.height - 28.0F));
      this.scroll = MathHelper.clamp(this.scroll, (double)(-var19), 0.0);
      this.smoothedScroll = MathHelper.lerp(0.1F, this.smoothedScroll, this.scroll);
      if (var9) {
         float var20 = this.height - 30.0F;
         float var14 = Math.max(20.0F, var20 / var11 * var20);
         float var15 = (float)(-this.smoothedScroll / var19);
         float var16 = this.y + 30.0F + var15 * (var20 - var14);
         float var17 = this.x + this.width - 6.0F;
         float var18 = 3.0F;
         rectangle.method677(
            Helper80.method841(var5, var17, this.y + 30.0F, var18, var20 - 6.0F).method826(1.0F).method823(new Color(30, 30, 30, 100).getRGB()).method840()
         );
         rectangle.method677(
            Helper80.method841(var5, var17, var16, var18, var14 - 6.0F).method826(1.5F).method823(new Color(100, 100, 100, 180).getRGB()).method840()
         );
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 == 0) {
         if (Helper147.method1224(var1, var3, this.x + this.width - 20.0F, this.y + 5.0F, 15.0, 15.0)) {
            this.method4830();
            return true;
         }

         if (Helper147.method1224(var1, var3, this.x, this.y, this.width, 19.0)) {
            this.dragging = true;
            this.dragX = (int)(this.x - var1);
            this.dragY = (int)(this.y - var3);
            return true;
         }
      }

      boolean var6 = this.components.stream().anyMatch(var4 -> var4.method285(var1, var3));
      if (var6) {
         this.components.forEach(var5x -> {
            if (var5x.method285(var1, var3)) {
               var5x.method247(var1, var3, var5);
            }
         });
         return true;
      } else {
         this.components.forEach(var5x -> var5x.method247(var1, var3, var5));
         return true;
      }
   }

   @Override
   public boolean method285(double var1, double var3) {
      this.components.forEach(var4 -> var4.method285(var1, var3));

      for (Helper296 var6 : this.components) {
         if (var6.method285(var1, var3)) {
            return true;
         }
      }

      return super.method4829(var1, var3);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.dragging = false;
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

   public int method2938() {
      float var1 = 0.0F;

      for (Widget14 var3 : this.components) {
         var1 += var3.height;
      }

      return (int)(var1 + 25.0F);
   }
}
