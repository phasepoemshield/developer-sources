package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class Widget16 extends Screen implements Helper160 {
   public static Widget16 INSTANCE = new Widget16();
   private final List<Helper296> components = new ArrayList<>();
   private final Widget13 backgroundComponent = new Widget13();
   private final Widget7 userComponent = new Widget7();
   private final Widget20 searchComponent = new Widget20();
   private final Widget43 categoryContainerComponent = new Widget43();
   private final Widget2 panelsContainerComponent = new Widget2();
   private final Widget9 interfaceSettingsComponent = new Widget9();
   public final Helper32 animation = new Helper32(325, 1.0, 1.5F);
   public Helper269 category = Helper269.COMBAT;
   public int x;
   public int y;
   public int width;
   public int height;
   private boolean guiDragging = false;
   private double dragOffsetX;
   private double dragOffsetY;
   private float offsetXPercent = 0.5F;
   private float offsetYPercent = 0.5F;
   private int lastScreenWidth = 0;
   private int lastScreenHeight = 0;
   private double lastTransformedMouseX = 0.0;
   private double lastTransformedMouseY = 0.0;

   public void method2887() {
      this.animation.method469(Helper449.FORWARDS);
      this.categoryContainerComponent.method4908();
      this.panelsContainerComponent.method255();
      this.components.clear();
      this.components.addAll(Arrays.asList(this.userComponent, this.searchComponent, this.panelsContainerComponent));
   }

   public Widget16() {
      super(Text.of("MenuScreen"));
      this.method2887();
   }

   @Override
   public void tick() {
      this.close();
      if (!Helper470.typing && !Widget20.typing) {
         Helper59.method663();
      } else {
         Helper59.method662();
      }

      this.components.forEach(Helper296::method2930);
      super.tick();
   }

   private double[] method2888(double var1, double var3) {
      float var5 = this.method2890();
      if (var5 <= 0.01F) {
         var5 = 1.0F;
      }

      float var6 = this.x + this.width / 2.0F;
      float var7 = this.y + this.height / 2.0F;
      double var8 = (var1 - var6) / var5 + var6;
      double var10 = (var3 - var7) / var5 + var7;
      return new double[]{var8, var10};
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      this.width = 890;
      this.height = 305;
      int var5 = window.getScaledWidth();
      int var6 = window.getScaledHeight();
      if (this.lastScreenWidth != var5 || this.lastScreenHeight != var6) {
         if (this.lastScreenWidth != 0 && this.lastScreenHeight != 0) {
            this.x = (int)(var5 * this.offsetXPercent - this.width / 2);
            this.y = (int)(var6 * this.offsetYPercent - this.height / 2);
         } else {
            this.x = var5 / 2 - this.width / 2;
            this.y = var6 / 2 - this.height / 2;
            this.offsetXPercent = (this.x + this.width / 2.0F) / var5;
            this.offsetYPercent = (this.y + this.height / 2.0F) / var6;
         }

         this.lastScreenWidth = var5;
         this.lastScreenHeight = var6;
      }

      double[] var7 = this.method2888(mouseX, mouseY);
      this.lastTransformedMouseX = var7[0];
      this.lastTransformedMouseY = var7[1];
      rectangle.method677(
         Helper80.method841(context.getMatrices(), 0.0, 0.0, window.getScaledWidth(), window.getScaledHeight())
            .method823(Helper147.method1241(-16777216, 200.0F * Math.min(1.0F, this.method2890())))
            .method840()
      );
      this.panelsContainerComponent.method294(this.x + 15, this.y + 12).method1960(this.width - 30, this.height - 24);
      float scale = this.method2890();
      Runnable renderGui = () -> {
         this.components.forEach(var3 -> var3.method246(context, (int)this.lastTransformedMouseX, (int)this.lastTransformedMouseY, delta));
         windowManager.method246(context, (int)this.lastTransformedMouseX, (int)this.lastTransformedMouseY, delta);
      };
      if (scale > 0.98F && scale < 1.02F) {
         renderGui.run();
      } else {
         Helper147.method1230(context.getMatrices(), this.x + this.width / 2.0F, this.y + this.height / 2.0F, scale, renderGui);
      }

      super.render(context, mouseX, mouseY, delta);
   }

   public void method2889() {
      if (!SelfDestruct.unhooked) {
         this.animation.method469(Helper449.FORWARDS);
         this.animation.method465();
         mc.setScreen(this);
         Helper56.method645(Helper56.OPEN_GUI);
      }
   }

   public float method2890() {
      return (float)this.animation.method472();
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      double[] var6 = this.method2888(mouseX, mouseY);
      boolean var7 = windowManager.method247(var6[0], var6[1], button);
      if (var7) {
         return true;
      } else {
         for (Helper296 var9 : this.components) {
            if (var9.method247(var6[0], var6[1], button)) {
               return true;
            }
         }

         if (button == 2 && this.method2891(var6[0], var6[1])) {
            this.guiDragging = true;
            this.dragOffsetX = var6[0] - this.x;
            this.dragOffsetY = var6[1] - this.y;
            return true;
         } else {
            return super.mouseClicked(mouseX, mouseY, button);
         }
      }
   }

   @Override
   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      double[] var6 = this.method2888(mouseX, mouseY);
      if (button == 2) {
         this.guiDragging = false;
         this.offsetXPercent = (this.x + this.width / 2.0F) / window.getScaledWidth();
         this.offsetYPercent = (this.y + this.height / 2.0F) / window.getScaledHeight();
      }

      for (Helper296 var8 : this.components) {
         var8.method248(var6[0], var6[1], button);
      }

      windowManager.method248(var6[0], var6[1], button);
      return super.mouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      double[] var10 = this.method2888(mouseX, mouseY);
      if (this.guiDragging && button == 2) {
         this.x = (int)(var10[0] - this.dragOffsetX);
         this.y = (int)(var10[1] - this.dragOffsetY);
         return true;
      } else {
         boolean var11 = windowManager.method2931(var10[0], var10[1], button, deltaX, deltaY);
         if (!var11) {
            for (Helper296 var13 : this.components) {
               var13.method2931(var10[0], var10[1], button, deltaX, deltaY);
            }
         }

         return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
      }
   }

   @Override
   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      double[] var9 = this.method2888(mouseX, mouseY);
      if (windowManager.method249(var9[0], var9[1], verticalAmount)) {
         return true;
      } else {
         for (Helper296 var12 : this.components) {
            if (var12.method249(var9[0], var9[1], verticalAmount)) {
               return true;
            }
         }

         return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
      }
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256 && this.shouldCloseOnEsc()) {
         Helper56.method645(Helper56.CLOSE_GUI);
         this.animation.method469(Helper449.BACKWARDS);
         return true;
      } else {
         if (!windowManager.method250(keyCode, scanCode, modifiers)) {
            for (Helper296 var5 : this.components) {
               var5.method250(keyCode, scanCode, modifiers);
            }
         }

         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      if (!windowManager.method251(chr, modifiers)) {
         for (Helper296 var4 : this.components) {
            var4.method251(chr, modifiers);
         }
      }

      return super.charTyped(chr, modifiers);
   }

   @Override
   public boolean shouldPause() {
      return false;
   }

   @Override
   public void close() {
      if (this.animation.method461(Helper449.BACKWARDS)) {
         Helper470.method5029();
         Widget20.typing = false;
         super.close();
      }
   }

   private boolean method2891(double var1, double var3) {
      return var1 >= this.x - 20 && var1 <= this.x + this.width + 20 && var3 >= this.y && var3 <= this.y + this.height;
   }

   public boolean method2892() {
      return true;
   }

   public void method2893(Helper269 var1) {
      this.category = var1;
   }

   public void method2894(int var1) {
      this.x = var1;
   }

   public void method2895(int var1) {
      this.y = var1;
   }

   public void method2896(int var1) {
      this.width = var1;
   }

   public void method2897(int var1) {
      this.height = var1;
   }

   public void method2898(boolean var1) {
      this.guiDragging = var1;
   }

   public void method2899(double var1) {
      this.dragOffsetX = var1;
   }

   public void method2900(double var1) {
      this.dragOffsetY = var1;
   }

   public void method2901(float var1) {
      this.offsetXPercent = var1;
   }

   public void method2902(float var1) {
      this.offsetYPercent = var1;
   }

   public void method2903(int var1) {
      this.lastScreenWidth = var1;
   }

   public void method2904(int var1) {
      this.lastScreenHeight = var1;
   }

   public void method2905(double var1) {
      this.lastTransformedMouseX = var1;
   }

   public void method2906(double var1) {
      this.lastTransformedMouseY = var1;
   }

   public List<Helper296> method2907() {
      return this.components;
   }

   public Widget13 method2908() {
      return this.backgroundComponent;
   }

   public Widget7 method2909() {
      return this.userComponent;
   }

   public Widget20 method2910() {
      return this.searchComponent;
   }

   public Widget43 method2911() {
      return this.categoryContainerComponent;
   }

   public Widget2 method2912() {
      return this.panelsContainerComponent;
   }

   public Widget9 method2913() {
      return this.interfaceSettingsComponent;
   }

   public Helper32 method2914() {
      return this.animation;
   }

   public Helper269 getCategory() {
      return this.category;
   }

   public int method2915() {
      return this.x;
   }

   public int method2916() {
      return this.y;
   }

   public int method2917() {
      return this.width;
   }

   public int method2918() {
      return this.height;
   }

   public boolean method2919() {
      return this.guiDragging;
   }

   public double method2920() {
      return this.dragOffsetX;
   }

   public double method2921() {
      return this.dragOffsetY;
   }

   public float method2922() {
      return this.offsetXPercent;
   }

   public float method2923() {
      return this.offsetYPercent;
   }

   public int method2924() {
      return this.lastScreenWidth;
   }

   public int method2925() {
      return this.lastScreenHeight;
   }

   public double method2926() {
      return this.lastTransformedMouseX;
   }

   public double method2927() {
      return this.lastTransformedMouseY;
   }
}
