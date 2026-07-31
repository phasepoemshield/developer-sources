package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;

public class Widget11 extends Helper296 {
   private static final float HEADER_HEIGHT = 18.0F;
   private static final float BUTTON_HEIGHT = 18.0F;
   private static final float DISCOUNT_HEIGHT = 18.0F;
   private static final float ROW_HEIGHT = 29.0F;
   private static final float ROW_GAP = 3.0F;
   private static final float PADDING = 6.0F;
   private static final float SCROLL_STEP = 20.0F;
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   private Helper381 editingTarget;
   private String priceBuffer = "";
   private final Helper467 buttonAnimation = new Animation2().method5003(160).method5004(1.0);
   private final Map<String, Helper467> rowAnimations = new HashMap<>();

   public Widget11() {
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Matrix4f var6 = var5.peek().getPositionMatrix();
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height)
            .method826(5.0F)
            .method823(-16777216)
            .method840()
      );
      int var7 = Widget16.INSTANCE.method2913().method353();
      Helper103.method927(14, Helper101.DEFAULT).method1474(var5, "Цены AutoBuy", this.x + 10.0F, this.y + 6.0F, var7);
      float var8 = this.x + 6.0F;
      float var9 = this.y + 18.0F + 5.0F;
      float var10 = this.width - 12.0F;
      boolean var11 = Helper147.method1224(var2, var3, var8, var9, var10, 18.0);
      this.buttonAnimation.method4997(var11 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var12 = this.method409(this.buttonAnimation.method5000().floatValue());
      int var13 = new Color(0, 0, 0, 230).getRGB();
      rectangle.method677(Helper80.method841(var5, var8, var9, var10, 18.0).method826(4.0F).method823(var13).method840());
      Helper103.method927(14, Helper101.BOLD).method1474(var5, "AutoParcer", var8 + 7.0F, var9 + 6.0F, Helper133.method1159(0.9F));
      float var14 = var9 + 18.0F + 5.0F;
      this.method402(var5, var8, var14, var10, var2, var3);
      List<Helper381> var15 = this.method406();
      float var16 = this.x + 6.0F;
      float var17 = var14 + 18.0F + 7.0F;
      float var18 = this.width - 12.0F;
      float var19 = this.height - (var17 - this.y) - 7.0F;
      float var20 = var15.size() * 32.0F;
      float var21 = Math.max(0.0F, var20 - var19);
      this.scroll = MathHelper.clamp(this.scroll, -var21, 0.0F);
      this.smoothedScroll = Helper147.method1245(this.smoothedScroll, this.scroll, 0.18F);
      Helper140 var22 = Releon.method71().method30();
      var22.method1209(var6, var16, var17, var18, var19);
      float var23 = var17 + this.smoothedScroll;

      for (Helper381 var25 : var15) {
         this.method403(var1, var5, var25, var16, var23, var18, var2, var3);
         var23 += 32.0F;
      }

      var22.method1210();
   }

   private void method402(MatrixStack var1, float var2, float var3, float var4, int var5, int var6) {
      AutoBuy var7 = AutoBuy.method3812();
      int var8 = var7 == null ? 50 : var7.method3815();
      boolean var9 = Helper147.method1224(var5, var6, var2, var3, var4, 18.0);
      int var10 = var9 ? new Color(0, 0, 0, 245).getRGB() : new Color(0, 0, 0, 210).getRGB();
      rectangle.method677(
         Helper80.method841(var1, var2, var3, var4, 18.0)
            .method826(4.0F)
            .method835(0.5F)
            .method839(var9 ? Widget16.INSTANCE.method2913().method354() : new Color(0, 0, 0, 255).getRGB())
            .method823(var10)
            .method840()
      );
      Helper103.method927(12, Helper101.BOLD).method1474(var1, "Скидка", var2 + 6.0F, var3 + 6.0F, Helper133.method1159(0.85F));
      String var11 = var8 + "%";
      float var12 = Helper103.method927(12, Helper101.DEFAULT).method1479(var11);
      Helper103.method927(12, Helper101.DEFAULT).method1474(var1, var11, var2 + var4 - var12 - 6.0F, var3 + 6.0F, new Color(95, 255, 125, 255).getRGB());
   }

   private void method403(DrawContext var1, MatrixStack var2, Helper381 var3, float var4, float var5, float var6, int var7, int var8) {
      boolean var9 = Helper147.method1224(var7, var8, var4, var5, var6, 29.0);
      boolean var10 = var3 == this.editingTarget;
      Helper467 var11 = this.rowAnimations.computeIfAbsent(var3.method3797(), var0 -> {
         Helper467 var1x = new Animation2().method5003(150).method5004(1.0);
         var1x.method4997(Helper450.BACKWARDS);
         var1x.method4993();
         return var1x;
      });
      var11.method4997(!var9 && !var10 ? Helper450.BACKWARDS : Helper450.FORWARDS);
      float var12 = this.method409(var11.method5000().floatValue());
      int var13 = new Color(0, 0, 0, 215).getRGB();
      rectangle.method677(
         Helper80.method841(var2, var4, var5, var6, 29.0)
            .method826(4.0F)
            .method835(0.5F)
            .method839(Helper133.method1111(var12, new Color(0, 0, 0, 255).getRGB(), Widget16.INSTANCE.method2913().method354()))
            .method823(var13)
            .method840()
      );
      var2.push();
      var2.translate(var4 + 3.0F, var5 + 6.0F, 0.0F);
      var2.scale(0.8F, 0.8F, 1.0F);
      var1.drawItem(var3.method3799(), 0, 0);
      var2.pop();
      String var14 = this.method407(var3.method3798(), var6 - 32.0F, 11);
      Helper103.method927(12, Helper101.BOLD).method1474(var2, var14, var4 + 27.0F + var12, var5 + 6.0F, Helper133.method1159(0.95F));
      String var15 = var10 ? (this.priceBuffer.isEmpty() ? "0" : this.priceBuffer) : this.method408(var3.method3805());
      int var16 = var3.method3805() <= 0 && !var10 ? Helper133.method1159(0.45F) : new Color(95, 255, 125, 255).getRGB();
      Helper103.method927(11, Helper101.DEFAULT).method1474(var2, "$" + var15, var4 + 27.0F + var12, var5 + 17.0F, var16);
      if (var10) {
         float var17 = var4 + 31.0F + Helper103.method927(11, Helper101.DEFAULT).method1479(var15);
         Helper103.method927(11, Helper101.DEFAULT).method1474(var2, "|", var17, var5 + 17.0F, var16);
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      float var6 = this.x + 6.0F;
      float var7 = this.y + 18.0F + 5.0F;
      float var8 = this.width - 12.0F;
      if (Helper147.method1224(var1, var3, var6, var7, var8, 18.0)) {
         AutoBuy var18 = AutoBuy.method3812();
         if (var18 == null) {
            return true;
         } else {
            mc.setScreen(null);
            mc.execute(var18::method3814);
            return true;
         }
      } else {
         float var9 = var7 + 18.0F + 5.0F;
         if (Helper147.method1224(var1, var3, var6, var9, var8, 18.0)) {
            AutoBuy var19 = AutoBuy.method3812();
            if (var19 == null) {
               return true;
            } else {
               int var20 = var5 == 1 ? -5 : 5;
               var19.method3816(var19.method3815() + var20);
               return true;
            }
         } else {
            List<Helper381> var10 = this.method406();
            float var11 = this.x + 6.0F;
            float var12 = var9 + 18.0F + 7.0F;
            float var13 = this.width - 12.0F;
            float var14 = var12 + this.smoothedScroll;

            for (Helper381 var16 : var10) {
               if (Helper147.method1224(var1, var3, var11, var14, var13, 29.0)) {
                  AutoBuy var17 = AutoBuy.method3812();
                  if (var17 == null) {
                     return true;
                  }

                  if (var5 == 1) {
                     var17.method3818(var16.method3797(), 0);
                     if (var16 == this.editingTarget) {
                        this.method405();
                     }

                     return true;
                  }

                  if (var5 == 0) {
                     this.editingTarget = var16;
                     this.priceBuffer = var16.method3805() > 0 ? String.valueOf(var16.method3805()) : "";
                     return true;
                  }
               }

               var14 += 32.0F;
            }

            return Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height);
         }
      }
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      if (!Helper147.method1224(var1, var3, this.x, this.y, this.width, this.height)) {
         return false;
      } else {
         this.scroll = (float)(this.scroll + var5 * 20.0);
         return true;
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (this.editingTarget == null) {
         return false;
      } else if (var1 == 257 || var1 == 335) {
         this.method404();
         return true;
      } else if (var1 == 259) {
         if (!this.priceBuffer.isEmpty()) {
            this.priceBuffer = this.priceBuffer.substring(0, this.priceBuffer.length() - 1);
         }

         return true;
      } else if (var1 == 256) {
         this.method405();
         return true;
      } else if (var1 == 261) {
         this.priceBuffer = "";
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (this.editingTarget == null) {
         return false;
      } else if (Character.isDigit(var1) && this.priceBuffer.length() < 9) {
         this.priceBuffer = this.priceBuffer + var1;
         return true;
      } else {
         return Character.isDigit(var1);
      }
   }

   private void method404() {
      AutoBuy var1 = AutoBuy.method3812();
      if (var1 != null && this.editingTarget != null) {
         int var2 = 0;
         if (!this.priceBuffer.isEmpty()) {
            try {
               var2 = Integer.parseInt(this.priceBuffer);
            } catch (NumberFormatException var4) {
               var2 = 0;
            }
         }

         var1.method3818(this.editingTarget.method3797(), var2);
      }

      this.method405();
   }

   private void method405() {
      this.editingTarget = null;
      this.priceBuffer = "";
   }

   private List<Helper381> method406() {
      AutoBuy var1 = AutoBuy.method3812();
      return (List<Helper381>)(var1 == null ? List.of() : new ArrayList<>(var1.method3813()));
   }

   private String method407(String var1, float var2, int var3) {
      if (Helper103.method927(var3, Helper101.DEFAULT).method1479(var1) <= var2) {
         return var1;
      } else {
         String var4 = "...";
         String var5 = var1;

         while (!var5.isEmpty() && Helper103.method927(var3, Helper101.DEFAULT).method1479(var5 + var4) > var2) {
            var5 = var5.substring(0, var5.length() - 1);
         }

         return var5 + var4;
      }
   }

   private String method408(int var1) {
      if (var1 <= 0) {
         return "0";
      } else if (var1 >= 1000000) {
         return String.format("%.1fM", var1 / 1000000.0F);
      } else {
         return var1 >= 1000 ? String.format("%.1fK", var1 / 1000.0F) : String.valueOf(var1);
      }
   }

   private float method409(float var1) {
      return Math.max(0.0F, Math.min(1.0F, var1));
   }
}
