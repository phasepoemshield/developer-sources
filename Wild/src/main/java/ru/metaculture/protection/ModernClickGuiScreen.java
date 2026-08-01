package ru.metaculture.protection;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public final class ModernClickGuiScreen extends Screen {
   private final ClickGui O00000000 = new ClickGui();

   public ModernClickGuiScreen() {
      super(Text.literal("Wild Modern ClickGUI"));
   }

   public ClickGui O00000000() {
      return this.O00000000;
   }

   protected void init() {
      super.init();
      this.O00000000.O00000000(this.client);
      O0000000000OO0.O0000000000();
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
      } else {
         this.O00000000.O00000000(this.O00000000(mouseX), this.O000000000(mouseY));
      }
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j, float f) {
      if (!this.O000000000(i, j)) {
         this.O00000000.O00000000000O();
      } else {
         this.O00000000.O00000000(this.client, drawContext, o0000O00OO0O0, i, j, f);
         if (this.O00000000.O00000000000()) {
            this.O000000000000();
         }
      }
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
         return true;
      } else if (this.O00000000.O000000000000()) {
         return true;
      } else {
         this.O00000000.O00000000(this.O00000000(mouseX), this.O000000000(mouseY), button);
         return true;
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
         return true;
      } else if (this.O00000000.O000000000000()) {
         return true;
      } else {
         this.O00000000.O000000000();
         return true;
      }
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
         return true;
      } else if (this.O00000000.O000000000000()) {
         return true;
      } else {
         this.O00000000.O000000000(this.O00000000(mouseX), this.O000000000(mouseY));
         return true;
      }
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
         return true;
      } else if (this.O00000000.O000000000000()) {
         return true;
      } else {
         double var9 = horizontalAmount;
         double var11 = verticalAmount;
         if (horizontalAmount == 0.0 && (hasShiftDown() || hasControlDown())) {
            var9 = verticalAmount;
            var11 = 0.0;
         }

         this.O00000000.O00000000(this.O00000000(mouseX), this.O000000000(mouseY), var9, var11);
         return true;
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 300) {
         return super.keyPressed(keyCode, scanCode, modifiers);
      } else if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
         return true;
      } else if (keyCode == 256 && this.O00000000.O000000000000()) {
         this.O000000000000();
         return true;
      } else if (keyCode == this.O00000000000() && !this.O00000000.O0000000000000()) {
         this.close();
         return true;
      } else if (this.O00000000.O000000000000()) {
         return true;
      } else {
         return this.O00000000.O00000000(keyCode) ? true : super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   public boolean charTyped(char chr, int modifiers) {
      if (!this.O0000000000()) {
         this.O00000000.O00000000000O();
         return true;
      } else if (this.O00000000.O000000000000()) {
         return true;
      } else {
         return this.O00000000.O00000000(chr) ? true : super.charTyped(chr, modifiers);
      }
   }

   public void close() {
      if (!this.O00000000.O0000000000()) {
         this.O000000000000();
      }
   }

   public void removed() {
      this.O00000000.O00000000000O0();
      super.removed();
   }

   public boolean shouldPause() {
      return false;
   }

   public void O00000000(int i, int j) {
      if (i <= 0 || j <= 0) {
         this.O00000000.O00000000000O();
      }
   }

   public void O00000000(boolean bl) {
      if (!bl) {
         this.O00000000.O00000000000O();
      }
   }

   private float O00000000(double d) {
      if (this.client != null && this.client.getWindow() != null) {
         int var3 = this.client.getWindow().getFramebufferWidth();
         int var4 = this.client.getWindow().getScaledWidth();
         return var3 > 0 && var4 > 0 ? (float)(d * var3 / Math.max(1.0, (double)var4)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private float O000000000(double d) {
      if (this.client != null && this.client.getWindow() != null) {
         int var3 = this.client.getWindow().getFramebufferHeight();
         int var4 = this.client.getWindow().getScaledHeight();
         return var3 > 0 && var4 > 0 ? (float)(d * var3 / Math.max(1.0, (double)var4)) : (float)d;
      } else {
         return (float)d;
      }
   }

   private boolean O000000000() {
      return this.client != null && this.client.getWindow() != null
         ? this.O000000000(this.client.getWindow().getFramebufferWidth(), this.client.getWindow().getFramebufferHeight())
         : false;
   }

   private boolean O000000000(int i, int j) {
      return this.client != null && this.client.getWindow() != null
         ? i > 0
            && j > 0
            && this.client.getWindow().getFramebufferWidth() > 0
            && this.client.getWindow().getFramebufferHeight() > 0
            && this.client.getWindow().getScaledWidth() > 0
            && this.client.getWindow().getScaledHeight() > 0
         : false;
   }

   private boolean O0000000000() {
      return this.O000000000() && this.client.isWindowFocused();
   }

   private int O00000000000() {
      MenuModule var1 = MenuModule.O0000000000OO();
      return var1 != null && var1.O000000000000 != -1 ? var1.O000000000000 : 344;
   }

   private void O000000000000() {
      this.O00000000.O00000000000O0();
      if (this.client != null) {
         this.client.setScreen(null);
      }
   }
}
