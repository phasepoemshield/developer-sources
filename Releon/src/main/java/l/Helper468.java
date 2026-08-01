package l;

import fat.releon.Releon;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

public class Helper468 extends Widget8 {
   public static final int SLIDER_WIDTH = 65;
   public static final int SLIDER_X_OFFSET = 24;
   private static final float LABEL_X = 10.0F;
   private static final float LABEL_Y = 7.0F;
   private static final float VALUE_Y = 7.0F;
   private static final float HOVER_Y = 14.0F;
   private static final float TRACK_Y = 17.0F;
   private static final float KNOB_OUTER_Y = 14.5F;
   private static final float KNOB_INNER_Y = 15.5F;
   private static final float SCISSOR_HEIGHT = 14.0F;
   private final Setting2 setting;
   private boolean dragging;
   private double animation;

   public Helper468(Setting2 var1) {
      super(var1);
      this.setting = var1;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      int var6 = ClickGui.method2650().method2655();
      String var7 = this.method341();
      float var8 = Helper103.method927(12, Helper101.DEFAULT).method1479(var7);
      float var9 = this.x + this.width - 65.0F - 24.0F;
      if (this.dragging && mc.getWindow() != null && GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), 0) != 1) {
         this.dragging = false;
      }

      this.height = 17.0F;
      String var10 = String.valueOf(this.setting.method2082());
      Helper103.method927(12, Helper101.BOLD)
         .method1474(var5, var10, this.x + this.width - 9.0F - Helper103.method926(12).method1479(var10), this.y + 7.0F, Helper133.method1160());
      float var11 = this.method5005(var2, var5, var6);
      this.method5006(var11);
      Helper103.method927(20, Helper101.ICONRICHREG).method1474(var5, "", this.x + 6.0F, this.y + 14.5F, var6);
      float var12 = 62.0F;
      if (var8 > var12) {
         Helper140 var13 = Releon.method71().method30();
         var13.method1209(var5.peek().getPositionMatrix(), this.x + 10.0F, this.y + 7.0F - 3.0F, var12, 14.0F);
         Helper103.method927(12, Helper101.DEFAULT).method1473(var5, var7, this.x + 10.0F, this.y + 7.0F, var12, new Color(255, 255, 255, 255).getRGB());
         var13.method1210();
      } else {
         Helper103.method927(12, Helper101.DEFAULT).method1474(var5, var7, this.x + 10.0F, this.y + 7.0F, new Color(255, 255, 255, 255).getRGB());
      }

      boolean var14 = Helper147.method1224(var2, var3, var9, this.y + 14.0F, 65.0, 8.0);
      if (var14) {
         rectangle.method677(
            Helper80.method841(var5, var9, this.y + 14.0F, 65.0, 8.0).method826(2.0F).method823(new Color(255, 255, 255, 20).getRGB()).method840()
         );
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.dragging = Helper147.method1224(var1, var3, this.x + this.width - 65.0F - 24.0F, this.y + 14.0F, 65.0, 8.0) && var5 == 0;
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.dragging = false;
      return super.method248(var1, var3, var5);
   }

   private float method5005(int var1, MatrixStack var2, int var3) {
      float var4 = this.x + this.width - 65.0F - 24.0F;
      float var5 = 65.0F * (this.setting.method2082() - this.setting.method2083()) / (this.setting.method2084() - this.setting.method2083());
      float var6 = MathHelper.clamp(var1 - var4, 0.0F, 65.0F);
      this.animation = Helper147.method1249(this.animation, var5);
      rectangle.method677(Helper80.method841(var2, var4, this.y + 17.0F, 65.0, 2.0).method826(1.0F).method823(new Color(0, 0, 0, 255).getRGB()).method840());
      rectangle.method677(
         Helper80.method841(var2, var4, this.y + 17.0F, (float)this.animation, 2.0).method826(2.0F).method825(var3, var3, var3, var3).method840()
      );
      float var7 = var4 + (float)this.animation;
      rectangle.method677(Helper80.method841(var2, var7 - 3.5F, this.y + 14.5F, 7.0, 7.0).method826(3.0F).method823(Helper133.method1154()).method840());
      rectangle.method677(
         Helper80.method841(var2, var7 - 3.0F, this.y + 15.5F, 6.0, 6.0)
            .method826(3.0F)
            .method835(2.0F)
            .method834(0.0F)
            .method825(
               new Color(255, 255, 255, 255).getRGB(),
               new Color(255, 255, 255, 255).getRGB(),
               new Color(255, 255, 255, 255).getRGB(),
               new Color(255, 255, 255, 255).getRGB()
            )
            .method840()
      );
      return var6;
   }

   private void method5006(float var1) {
      BigDecimal var2 = BigDecimal.valueOf((double)(var1 / 65.0F * (this.setting.method2084() - this.setting.method2083()) + this.setting.method2083()))
         .setScale(2, RoundingMode.HALF_UP);
      if (this.dragging) {
         float var3 = var1 == 0.0F ? this.setting.method2083() : var2.floatValue();
         if (this.setting.method2085()) {
            var3 = (int)var3;
         }

         this.setting.method2086(var3);
      }
   }
}
