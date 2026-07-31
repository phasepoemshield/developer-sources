package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;

public class Widget44 extends Helper296 {
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   private final List<Widget5> itemStatusRenders = new ArrayList<>();
   private final Helper358 autoBuyManager = Helper358.method3577();

   public Widget44() {
      this.method4975();
   }

   private void method4975() {
      this.itemStatusRenders.clear();

      for (Helper465 var3 : Helper359.method3582()) {
         Widget5 var4 = new Widget5();
         var4.method292(var3.isEnabled()).method293(() -> {
            this.autoBuyManager.method3580(var3);
            this.method4975();
         });
         this.itemStatusRenders.add(var4);
      }
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS) {
         MatrixStack var5 = var1.getMatrices();
         this.method4976(var1, var5, var2, var3, var4);
      }
   }

   private void method4976(DrawContext var1, MatrixStack var2, int var3, int var4, float var5) {
      Matrix4f var6 = var2.peek().getPositionMatrix();
      Helper140 var7 = Releon.method71().method30();
      float var8 = this.x + 55.0F;
      float var9 = this.y + 25.0F;
      float var10 = this.width - 43.0F - 15.0F;
      float var11 = this.height - 48.0F;
      float var12 = this.method4977();
      float var13 = Math.max(0.0F, var12 - var11);
      this.scroll = MathHelper.clamp(this.scroll, -var13, 0.0F);
      this.smoothedScroll = Helper147.method1245(this.smoothedScroll, this.scroll, 0.15F);
      var7.method1209(var6, var8, var9 + 4.0F, var10, var11 - 11.0F);
      float var14 = var9 + 10.0F + this.smoothedScroll;
      int var15 = 0;
      List var16 = Helper359.method3584();
      if (!var16.isEmpty()) {
         this.method4978(var2, var8, var14, var10, "Крушитель");
         var14 += 20.0F;

         for (int var17 = 0; var17 < var16.size(); var17++) {
            Helper465 var18 = (Helper465)var16.get(var17);
            float var19 = var8 + var17 % 2 * 190;
            if (var17 % 2 == 0 && var17 > 0) {
               var14 += 50.0F;
            }

            this.method4979(var1, var2, var18, var19, var14, var3, var4, var5, var15);
            var15++;
         }

         var14 += 50.0F;
         var14 += 25.0F;
      }

      List var38 = Helper359.method3585();
      if (!var38.isEmpty()) {
         this.method4978(var2, var8, var14, var10, "Талисманы");
         var14 += 20.0F;

         for (int var39 = 0; var39 < var38.size(); var39++) {
            Helper465 var41 = (Helper465)var38.get(var39);
            float var20 = var8 + var39 % 2 * 190;
            if (var39 % 2 == 0 && var39 > 0) {
               var14 += 50.0F;
            }

            this.method4979(var1, var2, var41, var20, var14, var3, var4, var5, var15);
            var15++;
         }

         var14 += 50.0F;
         var14 += 25.0F;
      }

      List var40 = Helper359.method3586();
      if (!var40.isEmpty()) {
         this.method4978(var2, var8, var14, var10, "Сферы");
         var14 += 20.0F;

         for (int var42 = 0; var42 < var40.size(); var42++) {
            Helper465 var44 = (Helper465)var40.get(var42);
            float var21 = var8 + var42 % 2 * 190;
            if (var42 % 2 == 0 && var42 > 0) {
               var14 += 50.0F;
            }

            this.method4979(var1, var2, var44, var21, var14, var3, var4, var5, var15);
            var15++;
         }

         var14 += 50.0F;
         var14 += 25.0F;
      }

      List var43 = Helper359.method3587();
      if (!var43.isEmpty()) {
         this.method4978(var2, var8, var14, var10, "Разное");
         var14 += 20.0F;

         for (int var45 = 0; var45 < var43.size(); var45++) {
            Helper465 var47 = (Helper465)var43.get(var45);
            float var22 = var8 + var45 % 2 * 190;
            if (var45 % 2 == 0 && var45 > 0) {
               var14 += 50.0F;
            }

            this.method4979(var1, var2, var47, var22, var14, var3, var4, var5, var15);
            var15++;
         }

         var14 += 50.0F;
         var14 += 25.0F;
      }

      List var46 = Helper359.method3588();
      if (!var46.isEmpty()) {
         this.method4978(var2, var8, var14, var10, "Донаторские");
         var14 += 20.0F;

         for (int var48 = 0; var48 < var46.size(); var48++) {
            Helper465 var50 = (Helper465)var46.get(var48);
            float var23 = var8 + var48 % 2 * 190;
            if (var48 % 2 == 0 && var48 > 0) {
               var14 += 50.0F;
            }

            this.method4979(var1, var2, var50, var23, var14, var3, var4, var5, var15);
            var15++;
         }

         var14 += 50.0F;
         var14 += 25.0F;
      }

      List var49 = Helper359.method3589();
      if (!var49.isEmpty()) {
         this.method4978(var2, var8, var14, var10, "Зелья");
         var14 += 20.0F;

         for (int var51 = 0; var51 < var49.size(); var51++) {
            Helper465 var52 = (Helper465)var49.get(var51);
            float var24 = var8 + var51 % 2 * 190;
            if (var51 % 2 == 0 && var51 > 0) {
               var14 += 50.0F;
            }

            this.method4979(var1, var2, var52, var24, var14, var3, var4, var5, var15);
            var15++;
         }

         var14 += 50.0F;
         var14 += 10.0F;
      }

      var7.method1210();
   }

   private float method4977() {
      List var1 = Helper359.method3584();
      List var2 = Helper359.method3585();
      List var3 = Helper359.method3586();
      List var4 = Helper359.method3587();
      List var5 = Helper359.method3588();
      List var6 = Helper359.method3589();
      float var7 = 10.0F;
      if (!var1.isEmpty()) {
         var7 += 20.0F + (var1.size() + 1) / 2 * 50.0F + 25.0F;
      }

      if (!var2.isEmpty()) {
         var7 += 20.0F + (var2.size() + 1) / 2 * 50.0F + 25.0F;
      }

      if (!var3.isEmpty()) {
         var7 += 20.0F + (var3.size() + 1) / 2 * 50.0F + 25.0F;
      }

      if (!var4.isEmpty()) {
         var7 += 20.0F + (var4.size() + 1) / 2 * 50.0F + 25.0F;
      }

      if (!var5.isEmpty()) {
         var7 += 20.0F + (var5.size() + 1) / 2 * 50.0F + 25.0F;
      }

      if (!var6.isEmpty()) {
         var7 += 20.0F + (var6.size() + 1) / 2 * 50.0F + 10.0F;
      }

      return var7;
   }

   private void method4978(MatrixStack var1, float var2, float var3, float var4, String var5) {
      float var6 = Helper103.method927(14, Helper101.SEMI).method1479(var5);
      float var7 = (var4 - var6 - 20.0F) / 2.0F;
      rectangle.method677(Helper80.method841(var1, var2, var3 + 6.0F, var7 - 10.0F, 1.0).method823(new Color(54, 54, 56, 255).getRGB()).method840());
      Helper103.method927(14, Helper101.SEMI).method1474(var1, var5, var2 + var7, var3 + 4.0F, Helper133.method1159(1.0F));
      rectangle.method677(
         Helper80.method841(var1, var2 + var7 + var6 + 10.0F, var3 + 6.0F, var7 - 6.0F, 1.0).method823(new Color(54, 54, 56, 255).getRGB()).method840()
      );
   }

   private void method4979(DrawContext var1, MatrixStack var2, Helper465 var3, float var4, float var5, int var6, int var7, float var8, int var9) {
      Helper175 var10 = Helper103.method927(16, Helper101.SEMI);
      ItemStack var11 = var3.method365();
      blur.method677(
         Helper80.method841(var2, var4, var5, 175.0, 45.0).method826(6.0F).method838(64.0F).method823(new Color(0, 0, 0, 200).getRGB()).method840()
      );
      rectangle.method677(
         Helper80.method841(var2, var4, var5, 175.0, 45.0)
            .method826(6.0F)
            .method834(2.0F)
            .method835(0.1F)
            .method839(new Color(18, 19, 20, 225).getRGB())
            .method825(
               new Color(18, 19, 20, 175).getRGB(), new Color(0, 2, 5, 175).getRGB(), new Color(0, 2, 5, 175).getRGB(), new Color(18, 19, 20, 175).getRGB()
            )
            .method840()
      );
      Helper178.method1502(var1, var11, var4 + 6.0F, var5 + 13.5F, false, false, 1.0F);
      Helper103.method927(14, Helper101.SEMI)
         .method1475(var2, var3.method364(), var4 + 30.0F, var5 + 14.0F, Helper133.method1160(), Helper133.method1159(0.65F));
      Helper103.method927(12, Helper101.REGULAR)
         .method1474(var2, "Цена покупки: $" + var3.method368().method3592(), var4 + 30.0F, var5 + 23.0F, Helper133.method1159(0.65F));
      Helper103.method927(12, Helper101.REGULAR)
         .method1474(var2, "Каличество покупки от: " + var3.method368().method3594(), var4 + 30.0F, var5 + 30.0F, Helper133.method1159(0.65F));
      if (var9 < this.itemStatusRenders.size()) {
         this.itemStatusRenders.get(var9).method290(var4 + 160.0F, var5 + 18.5F).method246(var1, var6, var7, var8);
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (Widget16.INSTANCE.getCategory() != Helper269.CONFIGS) {
         return super.method247(var1, var3, var5);
      } else {
         float var6 = this.x + 55.0F;
         float var7 = this.y + 25.0F;
         float var8 = var7 + 10.0F + this.smoothedScroll;
         int var9 = 0;
         List var10 = Helper359.method3584();
         if (!var10.isEmpty()) {
            var8 += 20.0F;

            for (int var11 = 0; var11 < var10.size(); var11++) {
               Helper465 var12 = (Helper465)var10.get(var11);
               float var13 = var6 + var11 % 2 * 190;
               if (var11 % 2 == 0 && var11 > 0) {
                  var8 += 50.0F;
               }

               if (var5 == 1 && Helper147.method1224(var1, var3, var13, var8, 175.0, 45.0)) {
                  this.method4980(var12);
                  return true;
               }

               if (var5 == 0 && var9 < this.itemStatusRenders.size()) {
                  Widget5 var14 = this.itemStatusRenders.get(var9);
                  var14.method290(var13 + 160.0F, var8 + 18.5F);
                  if (var14.method247(var1, var3, var5)) {
                     this.autoBuyManager.method3580(var12);
                     this.method4975();
                     return true;
                  }
               }

               var9++;
            }

            var8 += 50.0F;
            var8 += 25.0F;
         }

         List var31 = Helper359.method3585();
         if (!var31.isEmpty()) {
            var8 += 20.0F;

            for (int var32 = 0; var32 < var31.size(); var32++) {
               Helper465 var34 = (Helper465)var31.get(var32);
               float var37 = var6 + var32 % 2 * 190;
               if (var32 % 2 == 0 && var32 > 0) {
                  var8 += 50.0F;
               }

               if (var5 == 1 && Helper147.method1224(var1, var3, var37, var8, 175.0, 45.0)) {
                  this.method4980(var34);
                  return true;
               }

               if (var5 == 0 && var9 < this.itemStatusRenders.size()) {
                  Widget5 var15 = this.itemStatusRenders.get(var9);
                  var15.method290(var37 + 160.0F, var8 + 18.5F);
                  if (var15.method247(var1, var3, var5)) {
                     this.autoBuyManager.method3580(var34);
                     this.method4975();
                     return true;
                  }
               }

               var9++;
            }

            var8 += 50.0F;
            var8 += 25.0F;
         }

         List var33 = Helper359.method3586();
         if (!var33.isEmpty()) {
            var8 += 20.0F;

            for (int var35 = 0; var35 < var33.size(); var35++) {
               Helper465 var38 = (Helper465)var33.get(var35);
               float var41 = var6 + var35 % 2 * 190;
               if (var35 % 2 == 0 && var35 > 0) {
                  var8 += 50.0F;
               }

               if (var5 == 1 && Helper147.method1224(var1, var3, var41, var8, 175.0, 45.0)) {
                  this.method4980(var38);
                  return true;
               }

               if (var5 == 0 && var9 < this.itemStatusRenders.size()) {
                  Widget5 var16 = this.itemStatusRenders.get(var9);
                  var16.method290(var41 + 160.0F, var8 + 18.5F);
                  if (var16.method247(var1, var3, var5)) {
                     this.autoBuyManager.method3580(var38);
                     this.method4975();
                     return true;
                  }
               }

               var9++;
            }

            var8 += 50.0F;
            var8 += 25.0F;
         }

         List var36 = Helper359.method3587();
         if (!var36.isEmpty()) {
            var8 += 20.0F;

            for (int var39 = 0; var39 < var36.size(); var39++) {
               Helper465 var42 = (Helper465)var36.get(var39);
               float var45 = var6 + var39 % 2 * 190;
               if (var39 % 2 == 0 && var39 > 0) {
                  var8 += 50.0F;
               }

               if (var5 == 1 && Helper147.method1224(var1, var3, var45, var8, 175.0, 45.0)) {
                  this.method4980(var42);
                  return true;
               }

               if (var5 == 0 && var9 < this.itemStatusRenders.size()) {
                  Widget5 var17 = this.itemStatusRenders.get(var9);
                  var17.method290(var45 + 160.0F, var8 + 18.5F);
                  if (var17.method247(var1, var3, var5)) {
                     this.autoBuyManager.method3580(var42);
                     this.method4975();
                     return true;
                  }
               }

               var9++;
            }

            var8 += 50.0F;
            var8 += 25.0F;
         }

         List var40 = Helper359.method3588();
         if (!var40.isEmpty()) {
            var8 += 20.0F;

            for (int var43 = 0; var43 < var40.size(); var43++) {
               Helper465 var46 = (Helper465)var40.get(var43);
               float var48 = var6 + var43 % 2 * 190;
               if (var43 % 2 == 0 && var43 > 0) {
                  var8 += 50.0F;
               }

               if (var5 == 1 && Helper147.method1224(var1, var3, var48, var8, 175.0, 45.0)) {
                  this.method4980(var46);
                  return true;
               }

               if (var5 == 0 && var9 < this.itemStatusRenders.size()) {
                  Widget5 var18 = this.itemStatusRenders.get(var9);
                  var18.method290(var48 + 160.0F, var8 + 18.5F);
                  if (var18.method247(var1, var3, var5)) {
                     this.autoBuyManager.method3580(var46);
                     this.method4975();
                     return true;
                  }
               }

               var9++;
            }

            var8 += 50.0F;
            var8 += 25.0F;
         }

         List var44 = Helper359.method3589();
         if (!var44.isEmpty()) {
            var8 += 20.0F;

            for (int var47 = 0; var47 < var44.size(); var47++) {
               Helper465 var49 = (Helper465)var44.get(var47);
               float var50 = var6 + var47 % 2 * 190;
               if (var47 % 2 == 0 && var47 > 0) {
                  var8 += 50.0F;
               }

               if (var5 == 1 && Helper147.method1224(var1, var3, var50, var8, 175.0, 45.0)) {
                  this.method4980(var49);
                  return true;
               }

               if (var5 == 0 && var9 < this.itemStatusRenders.size()) {
                  Widget5 var19 = this.itemStatusRenders.get(var9);
                  var19.method290(var50 + 160.0F, var8 + 18.5F);
                  if (var19.method247(var1, var3, var5)) {
                     this.autoBuyManager.method3580(var49);
                     this.method4975();
                     return true;
                  }
               }

               var9++;
            }
         }

         return super.method247(var1, var3, var5);
      }
   }

   private void method4980(Helper465 var1) {
      if (Widget16.windowManager.method4820().stream().noneMatch(var1x -> var1x instanceof Widget17 && ((Widget17)var1x).item.equals(var1))) {
         Widget17 var2 = new Widget17(var1, var1.method368());
         var2.method4828(Widget16.INSTANCE.x + Widget16.INSTANCE.width + 24, Widget16.INSTANCE.y).method4827(180.0F, var2.method2938());
         Widget16.windowManager.method4818(var2);
      }
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS
         && Helper147.method1224(var1, var3, this.x + 55.0F, this.y + 38.0F, this.width - 43.0F - 15.0F, this.height - 48.0F)) {
         this.scroll = (float)(this.scroll + var5 * 20.0);
         return true;
      } else {
         return super.method249(var1, var3, var5);
      }
   }

   public Widget44 method4981(float var1) {
      this.scroll = var1;
      return this;
   }

   public Widget44 method4982(float var1) {
      this.smoothedScroll = var1;
      return this;
   }
}
