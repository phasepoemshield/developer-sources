package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;

public class Widget12 extends Helper296 {
   private final List<Widget18> moduleComponents = new ArrayList<>();
   private static final Set<Widget18> globalModuleComponents = new HashSet<>();
   private final Helper269 category;
   private final Helper467 alphaAnimation = new Animation4().method5003(300).method5004(1.0);
   private final Helper467 scaleAnimation = new Animation4().method5003(300).method5004(1.0);
   private boolean initializedAnimations = false;
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;

   private void method412() {
      for (Helper242 var3 : Releon.method71().method17().method2314()) {
         Widget18 var4 = new Widget18(var3);
         if (globalModuleComponents.add(var4)) {
            this.moduleComponents.add(var4);
         }
      }
   }

   public void method413() {
      if (!this.initializedAnimations) {
         if (Widget16.INSTANCE.getCategory().equals(this.category)) {
            this.alphaAnimation.method4997(Helper450.FORWARDS);
            this.scaleAnimation.method4997(Helper450.FORWARDS);
            this.alphaAnimation.method4993();
            this.scaleAnimation.method4993();
            this.alphaAnimation.method5003(0);
            this.scaleAnimation.method5003(0);
         } else {
            this.alphaAnimation.method4997(Helper450.BACKWARDS);
            this.scaleAnimation.method4997(Helper450.BACKWARDS);
            this.alphaAnimation.method4993();
            this.scaleAnimation.method4993();
            this.alphaAnimation.method5003(0);
            this.scaleAnimation.method5003(0);
         }

         this.initializedAnimations = true;
      }
   }

   public Widget12(Helper269 var1) {
      this.category = var1;
      this.method412();
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      this.method413();
      Widget16 var5 = Widget16.INSTANCE;
      globalModuleComponents.clear();
      Matrix4f var6 = var1.getMatrices().peek().getPositionMatrix();
      Helper140 var7 = Releon.method71().method30();
      this.method414(var1, var1.getMatrices(), var2, var3);
      int[] var8 = this.method415();
      short var9 = 142;
      int var10 = 0;
      int var11 = 0;
      float var12 = 35.0F;
      float var13 = 14.0F;
      var7.method1209(var6, var5.x + var12 - 75.0F, var5.y + var13 + 15.0F, var5.width - var12 + 150.0F, var5.height - var13 - 15.0F);

      for (int var14 = this.moduleComponents.size() - 1; var14 >= 0; var14--) {
         Widget18 var15 = this.moduleComponents.get(var14);
         if (this.method416(var15)) {
            int var16 = var15.method2956() + 9;
            var15.x = var5.x + 32 + var10 * (var9 + 48);
            var15.y = var5.y + 35 + var8[var10] - var16 + this.smoothedScroll;
            var15.width = var9 + 40;
            if (var15.y > var5.y - var16 && var5.y + var5.height + 15 > var15.y) {
               var15.method246(var1, var2, var3, var4);
            }

            var8[var10] -= var16;
            var11 = Math.max(var11, var8[var10]);
            var10 = (var10 + 1) % 2;
         }
      }

      var7.method1210();
      int var24 = MathHelper.clamp(var11 - (var5.height / 2 + 35), 0, var11);
      this.scroll = MathHelper.clamp(this.scroll, (float)(-var24), 0.0F);
      this.smoothedScroll = Helper147.method1250(2.0, this.smoothedScroll, this.scroll);
      if (var24 > 0) {
         float var25 = 4.0F;
         float var26 = var5.x + var5.width - var12 - var25 + 50.0F;
         float var17 = var5.y + var13 + 22.0F;
         float var18 = var5.height - var13 * 2.0F - 14.0F;
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), var26, var17, var25, var18)
               .method826(2.0F)
               .method825(
                  new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 255).getRGB()
               )
               .method840()
         );
         float var19 = var24;
         float var20 = var5.height - var13 * 2.0F;
         float var21 = Math.max(20.0F, var20 * (var20 / (var19 + var20)));
         float var22 = -this.smoothedScroll / var19;
         float var23 = var17 + (var18 - var21) * var22;
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), var26, var23, var25, var21)
               .method826(2.0F)
               .method825(
                  new Color(255, 255, 255, 255).getRGB(),
                  new Color(255, 255, 255, 255).getRGB(),
                  new Color(255, 255, 255, 255).getRGB(),
                  new Color(255, 255, 255, 255).getRGB()
               )
               .method840()
         );
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      Widget16 var6 = Widget16.INSTANCE;
      float var7 = 0.5F + this.scaleAnimation.method5000().floatValue() * 0.5F;
      float var8 = 20.0F;
      float var9 = 20.0F;
      float var10 = var8 * var7;
      float var11 = var9 * var7;
      float var12 = Helper269.RENDER.equals(this.category) ? this.x + 4.65F : (Helper269.MOVEMENT.equals(this.category) ? this.x + 4.75F : this.x + 5.25F);
      float var13 = this.y;
      float var14 = var12 + var8 / 2.0F;
      float var15 = var13 + var9 / 2.0F;
      float var16 = var14 - var10 / 2.0F;
      float var17 = var15 - var11 / 2.0F;
      float var18 = Helper269.RENDER.equals(this.category) ? this.x + 4.65F : (Helper269.MOVEMENT.equals(this.category) ? this.x + 4.75F : this.x + 5.25F);
      float var19 = this.y;
      if (Helper147.method1224(var1, var3, var18, var19, var8, var9) && var5 == 0) {
         Widget16.INSTANCE.method2893(this.category);
         this.alphaAnimation.method5003(300);
         this.scaleAnimation.method5003(300);
         this.alphaAnimation.method4997(Helper450.FORWARDS);
         this.scaleAnimation.method4997(Helper450.FORWARDS);
         return true;
      } else {
         float var20 = 35.0F;
         float var21 = 14.0F;
         if (Helper147.method1224(var1, var3, var6.x + var20 - 75.0F, var6.y + var21, var6.width - var20 + 150.0F, var6.height - var21 + 15.0F)) {
            for (int var22 = 0; var22 < this.moduleComponents.size(); var22++) {
               Widget18 var23 = this.moduleComponents.get(var22);
               if (this.method416(var23) && var23.method285(var1, var3)) {
                  return var23.method247(var1, var3, var5);
               }
            }
         }

         return super.method247(var1, var3, var5);
      }
   }

   @Override
   public boolean method285(double var1, double var3) {
      float var5 = 0.5F + this.scaleAnimation.method5000().floatValue() * 0.5F;
      float var6 = 20.0F;
      float var7 = 20.0F;
      float var8 = var6 * var5;
      float var9 = var7 * var5;
      float var10 = Helper269.RENDER.equals(this.category) ? this.x + 4.65F : (Helper269.MOVEMENT.equals(this.category) ? this.x + 4.75F : this.x + 5.25F);
      float var11 = this.y;
      float var12 = var10 + var6 / 2.0F;
      float var13 = var11 + var7 / 2.0F;
      float var14 = var12 - var8 / 2.0F;
      float var15 = var13 - var9 / 2.0F;
      boolean var16 = Helper147.method1224(var1, var3, var14, var15, var8, var9);
      if (var16) {
         return true;
      } else {
         this.moduleComponents.forEach(var4 -> var4.method285(var1, var3));

         for (Widget18 var18 : this.moduleComponents) {
            if (var18.method285(var1, var3)) {
               return true;
            }
         }

         return super.method285(var1, var3);
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.moduleComponents.forEach(var5x -> var5x.method248(var1, var3, var5));
      return super.method248(var1, var3, var5);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      Widget16 var7 = Widget16.INSTANCE;
      float var8 = 35.0F;
      float var9 = 13.0F;
      if (Helper147.method1224(var1, var3, var7.x + var8, var7.y + var9, var7.width - var8 + 7.0F, var7.height - var9 + 15.0F)) {
         this.scroll = (float)(this.scroll + var5 * 20.0);
      }

      this.moduleComponents.forEach(var7x -> {
         if (this.method416(var7x)) {
            var7x.method249(var1, var3, var5);
         }
      });
      return super.method249(var1, var3, var5);
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      this.moduleComponents.forEach(var4 -> {
         if (this.method416(var4)) {
            var4.method250(var1, var2, var3);
         }
      });
      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      this.moduleComponents.forEach(var3 -> {
         if (this.method416(var3)) {
            var3.method251(var1, var2);
         }
      });
      return super.method251(var1, var2);
   }

   private void method414(DrawContext var1, MatrixStack var2, int var3, int var4) {
      this.alphaAnimation.method4997(Widget16.INSTANCE.getCategory().equals(this.category) ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.scaleAnimation.method4997(Widget16.INSTANCE.getCategory().equals(this.category) ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var5 = this.alphaAnimation.method5000().floatValue();
      float var6 = 0.5F + this.scaleAnimation.method5000().floatValue() * 0.5F;
      int var7 = MathHelper.clamp((int)(var5 * 135.0F), 0, 135);
      float var8 = 20.0F;
      float var9 = 20.0F;
      float var10 = var8 * var6;
      float var11 = var9 * var6;
      float var12 = Helper269.RENDER.equals(this.category) ? this.x + 4.65F : (Helper269.MOVEMENT.equals(this.category) ? this.x + 4.75F : this.x + 5.25F);
      float var13 = this.y;
      float var14 = var12 + var8 / 2.0F;
      float var15 = var13 + var9 / 2.0F;
      float var16 = var14 - var10 / 2.0F;
      float var17 = var15 - var11 / 2.0F;
      float var18 = Helper269.RENDER.equals(this.category) ? this.x + 4.65F : (Helper269.MOVEMENT.equals(this.category) ? this.x + 4.75F : this.x + 5.25F);
      float var19 = this.y;
      if (!Widget16.INSTANCE.getCategory().equals(this.category) && Helper147.method1224(var3, var4, var18, var19, var8, var9)) {
         rectangle.method677(
            Helper80.method841(var2, var18, var19, var8, var9)
               .method826(4.0F)
               .method825(
                  new Color(55, 55, 55, 100).getRGB(),
                  new Color(85, 85, 100, 100).getRGB(),
                  new Color(55, 55, 55, 100).getRGB(),
                  new Color(85, 85, 100, 100).getRGB()
               )
               .method840()
         );
      }

      rectangle.method677(
         Helper80.method841(var2, var16, var17, var10, var11)
            .method826(5.0F)
            .method825(
               new Color(21, 21, 21, var7).getRGB(),
               new Color(61, 61, 61, var7).getRGB(),
               new Color(61, 61, 61, var7).getRGB(),
               new Color(21, 21, 21, var7).getRGB()
            )
            .method840()
      );
      if (Helper269.COMBAT.equals(this.category)) {
         Helper103.method927(21, Helper101.ICONRICHREG).method1477(var1.getMatrices(), "B", this.x + 16.0F, this.y + 8.5F, Helper133.method1160());
      }

      if (Helper269.MOVEMENT.equals(this.category)) {
         Helper103.method927(23, Helper101.ICONRICHREG).method1477(var1.getMatrices(), "D", this.x + 15.0F, this.y + 8.5F, Helper133.method1160());
      }

      if (Helper269.RENDER.equals(this.category)) {
         Helper103.method927(21, Helper101.ICONS).method1477(var1.getMatrices(), "E", this.x + 15.0F, this.y + 8.5F, Helper133.method1160());
      }

      if (Helper269.PLAYER.equals(this.category)) {
         Helper103.method927(27, Helper101.ICONRICHREG).method1477(var1.getMatrices(), "F", this.x + 15.0F, this.y + 8.5F, Helper133.method1160());
      }

      if (Helper269.MISC.equals(this.category)) {
         Helper103.method927(21, Helper101.GUIICONS).method1477(var1.getMatrices(), "B", this.x + 15.5F, this.y + 8.5F, Helper133.method1160());
      }
   }

   private int[] method415() {
      int[] var1 = new int[2];
      int var2 = 0;

      for (int var3 = this.moduleComponents.size() - 1; var3 >= 0; var3--) {
         Widget18 var4 = this.moduleComponents.get(var3);
         if (this.method416(var4)) {
            int var5 = var4.method2956() + 9;
            var1[var2] += var5;
            var2 = (var2 + 1) % 2;
         }
      }

      return var1;
   }

   private boolean method416(Widget18 var1) {
      Widget16 var2 = Widget16.INSTANCE;
      Helper269 var3 = var1.method2960().getCategory();
      String var4 = var2.method2910().method3061().toLowerCase();
      String var5 = var1.method2960().getVisibleName().toLowerCase();
      return var4.equalsIgnoreCase("") ? var3.equals(var2.getCategory()) : var5.contains(var4);
   }
}
