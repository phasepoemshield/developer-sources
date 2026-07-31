package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class Widget29 extends Screen {
   private static final Color BUTTON_COLOR = new Color(24, 24, 28, 214);
   private static final Color OUTLINE_COLOR = new Color(72, 72, 80, 132);
   private static final Color GRADIENT_COLOR = new Color(48, 48, 56, 214);
   private static final Color TEXT_COLOR = new Color(228, 228, 236, 255);
   private static final Color BG_COLOR = new Color(10, 10, 14, 190);
   private final Screen parent;
   private Helper402 altScreen;

   public Widget29(Screen var1) {
      super(Text.of("Alt Manager"));
      this.parent = var1;
   }

   @Override
   protected void init() {
      super.init();
      this.altScreen = new Helper402(this.width / 2.0F, this.height / 2.0F);
      this.altScreen.method4109();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.altScreen != null) {
         this.altScreen.method4086();
      }
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      if (this.parent != null) {
         this.parent.render(context, -1, -1, delta);
      } else {
         this.renderBackground(context, mouseX, mouseY, delta);
      }

      if (this.altScreen != null) {
         this.altScreen.method4087(context, BUTTON_COLOR, OUTLINE_COLOR, GRADIENT_COLOR, TEXT_COLOR, BG_COLOR);
      }
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      return this.altScreen != null && this.altScreen.method4095(mouseX, mouseY, button) || super.mouseClicked(mouseX, mouseY, button);
   }

   @Override
   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      return this.altScreen != null && this.altScreen.method4104(mouseX, mouseY, verticalAmount)
         || super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   @Override
   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      return this.altScreen != null && this.altScreen.method4105(mouseX, mouseY, button) || super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
   }

   @Override
   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      return this.altScreen != null && this.altScreen.method4106() || super.mouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      return this.altScreen != null && this.altScreen.method4107(chr) || super.charTyped(chr, modifiers);
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         this.close();
         return true;
      } else {
         return this.altScreen != null && this.altScreen.method4108(keyCode) || super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   @Override
   public void close() {
      if (this.client != null) {
         this.client.setScreen(this.parent);
      }
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return true;
   }
}
