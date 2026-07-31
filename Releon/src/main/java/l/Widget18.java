package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;

public class Widget18 extends Helper296 {
   private final List<Widget8> components = new ArrayList<>();
   private final Widget5 statusRender = new Widget5();
   private final Helper242 module;
   private boolean binding;
   private final Helper105 rectangle = new Helper105();
   private final Helper467 alphaAnimation = new Animation2().method5003(400).method5004(105.0);

   public Widget18(Helper242 var1) {
      this.module = var1;
      new Helper262().method2699(var1.settings(), this.components);
      this.alphaAnimation.method4997(var1.isState() ? Helper450.FORWARDS : Helper450.BACKWARDS);
      this.alphaAnimation.method4993();
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      float var5 = this.height = this.method2956();
      boolean var6 = this.module.settings().isEmpty();
      float var7 = var6 ? 9.5F : 8.0F;
      String var8 = "";
      String var9 = Helper20.method388(this.module);
      if (var9 == null) {
         var9 = "";
      }

      float var10 = this.width - 25.0F;
      float var11 = this.x + 10.0F;
      String[] var12 = var9.split(" ");
      int var13 = 1;

      for (String var17 : var12) {
         float var18 = Helper103.method927(12, Helper101.DEFAULT).method1479(var17 + " ");
         if (var11 + var18 > this.x + var10) {
            var13++;
            var11 = this.x + 10.0F;
         }

         var11 += var18;
      }

      float var26 = var13 == 1
         ? var13 * Helper103.method927(12, Helper101.DEFAULT).method1481(" ") - 13.0F
         : var13 * Helper103.method927(12, Helper101.DEFAULT).method1481(" ") - 20.0F;
      this.alphaAnimation.method4997(this.module.isState() ? Helper450.FORWARDS : Helper450.BACKWARDS);
      int var27 = 150 + this.alphaAnimation.method5000().intValue();
      int var28 = new Color(255, 255, 255, var27).getRGB();
      blur.method677(
         Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, var5)
            .method826(10.0F)
            .method838(1313125.0F)
            .method823(new Color(0, 0, 0, 255).getRGB())
            .method840()
      );
      blur.method677(
         Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, var5)
            .method826(10.0F)
            .method838(32.0F)
            .method823(new Color(0, 0, 0, 255).getRGB())
            .method840()
      );
      this.rectangle
         .method677(
            Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, var5).method826(9.0F).method823(new Color(0, 0, 0, 255).getRGB()).method840()
         );
      this.rectangle
         .method677(
            Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, var5)
               .method826(9.0F)
               .method825(new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 0).getRGB(), new Color(0, 0, 0, 0).getRGB(), new Color(0, 0, 0, 20).getRGB())
               .method840()
         );
      this.rectangle
         .method677(
            Helper80.method841(var1.getMatrices(), this.x, this.y, this.width, var5)
               .method826(9.0F)
               .method835(1.2F)
               .method839(new Color(0, 0, 0, 255).getRGB())
               .method823(0)
               .method840()
         );
      this.rectangle
         .method677(
            Helper80.method841(var1.getMatrices(), this.x, this.y + var26 + 25.0F, this.width, 1.0).method823(new Color(0, 0, 0, 255).getRGB()).method840()
         );
      Helper103.method927(18, Helper101.GUIICONS).method1474(var1.getMatrices(), "", this.x + 7.0F, this.y + var26 + 33.0F, -8355712);
      if (!var6) {
         Helper103.method927(16, Helper101.GUIICONS).method1474(var1.getMatrices(), "", this.x + 20.0F, this.y + var26 + 33.5F, -8355712);
      }

      this.statusRender
         .method290(this.x + this.width - 16.0F, this.y + var26 + 31.0F)
         .method293(this.module::switchState)
         .method292(this.module.isState())
         .method246(var1, var2, var3, var4);
      Helper103.method927(15, Helper101.DEFAULT)
         .method1474(var1.getMatrices(), var8 + this.module.getVisibleName(), this.x + 14.0F, this.y + var7 - 1.0F, var28);
      float var29 = this.y + 19.0F;
      var11 = this.x + 10.0F;
      StringBuilder var30 = new StringBuilder();
      int var19 = 1;

      for (String var23 : var12) {
         float var24 = Helper103.method927(12, Helper101.DEFAULT).method1479(var23 + " ");
         if (var11 + var24 > this.x + var10) {
            this.method2955(var1, var30.toString(), var29, var19 == 1);
            var29 += Helper103.method927(12, Helper101.DEFAULT).method1481(" ") - 7.0F;
            var30.setLength(0);
            var11 = this.x + 10.0F;
            var19++;
         }

         var30.append(var23).append(" ");
         var11 += var24;
      }

      if (!var30.isEmpty()) {
         this.method2955(var1, var30.toString(), var29, var19 == 1);
      }

      this.method2957(var1, var26);
   }

   private void method2955(DrawContext var1, String var2, float var3, boolean var4) {
      if (var4) {
         Helper103.method927(16, Helper101.DEFAULT).method1474(var1.getMatrices(), "", this.x + 7.5F, var3 + 1.0F, new Color(255, 255, 255, 255).getRGB());
         Helper103.method927(12, Helper101.DEFAULT).method1474(var1.getMatrices(), var2, this.x + 13.0F, var3, new Color(255, 255, 255, 255).getRGB());
      } else {
         Helper103.method927(12, Helper101.DEFAULT).method1474(var1.getMatrices(), var2, this.x + 13.0F, var3, new Color(255, 255, 255, 255).getRGB());
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (this.method285(var1, var3) && var5 == 1 && !this.module.settings().isEmpty()) {
         if (Widget16.windowManager.method4820().stream().noneMatch(var1x -> var1x instanceof Widget4 && ((Widget4)var1x).module.equals(this.module))) {
            Widget4 var10 = new Widget4(this.module);
            Widget16.windowManager.method4818(var10);
         }

         return true;
      } else {
         String var6 = Helper209.method1791(this.module.getKey());
         float var7 = Helper103.method927(12, Helper101.DEFAULT).method1479(var6);
         float var8 = this.x + this.width - 37.5F - var7;
         float var9 = this.y + this.method2956() - 15.0F;
         if (Helper147.method1224(var1, var3, var8, var9, var7 + 6.0F, 10.0) && var5 == 0) {
            this.binding = !this.binding;
            return true;
         } else {
            if (this.binding) {
               this.module.setKey(var5);
               this.binding = false;
            }

            this.statusRender.method247(var1, var3, var5);
            return super.method247(var1, var3, var5);
         }
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (!this.binding) {
         return false;
      } else {
         this.module.setKey(var1 == 261 ? -1 : var1);
         this.binding = false;
         return true;
      }
   }

   @Override
   public boolean method285(double var1, double var3) {
      return Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height);
   }

   public int method2956() {
      String var1 = Helper20.method388(this.module);
      if (var1 == null) {
         var1 = "";
      }

      float var2 = this.width - 25.0F;
      float var3 = this.x + 10.0F;
      int var4 = 1;

      for (String var8 : var1.split(" ")) {
         float var9 = Helper103.method927(12, Helper101.DEFAULT).method1479(var8 + " ");
         if (var3 + var9 > this.x + var2) {
            var4++;
            var3 = this.x + 10.0F;
         }

         var3 += var9;
      }

      float var10 = var4 == 1
         ? var4 * Helper103.method927(12, Helper101.DEFAULT).method1481(" ") - 13.0F
         : var4 * Helper103.method927(12, Helper101.DEFAULT).method1481(" ") - 20.0F;
      return (int)(45.0F + var10);
   }

   private void method2957(DrawContext var1, float var2) {
      String var3 = Helper209.method1791(this.module.getKey());
      boolean var4 = this.module.getKey() < 0 && !this.binding;
      String var5 = this.binding ? "..." : (var4 ? "N/A" : var3);
      float var6 = Helper103.method927(12, Helper101.DEFAULT).method1479(var5);
      float var7 = this.x + this.width - 37.5F - var6;
      float var8 = this.y + var2 + 6.0F + 23.75F;
      this.rectangle
         .method677(
            Helper80.method841(var1.getMatrices(), var7 + 0.25F, var8, var6 + 6.0F, 10.0)
               .method826(3.0F)
               .method839(new Color(155, 155, 165, 255).getRGB())
               .method825(
                  new Color(61, 67, 71, 80).getRGB(),
                  new Color(71, 77, 81, 80).getRGB(),
                  new Color(81, 87, 91, 80).getRGB(),
                  new Color(91, 97, 101, 80).getRGB()
               )
               .method840()
         );
      Helper103.method927(12, Helper101.DEFAULT)
         .method1474(var1.getMatrices(), var5, this.x + this.width - 34.5F - var6, this.y + var2 + 6.0F + 28.0F, new Color(135, 136, 148, 255).getRGB());
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Widget18 var2 && var2.module.equals(this.module);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.module);
   }

   public List<Widget8> method2958() {
      return this.components;
   }

   public Widget5 method2959() {
      return this.statusRender;
   }

   public Helper242 method2960() {
      return this.module;
   }

   public boolean method2961() {
      return this.binding;
   }

   public Helper105 method2962() {
      return this.rectangle;
   }

   public Helper467 method2963() {
      return this.alphaAnimation;
   }
}
