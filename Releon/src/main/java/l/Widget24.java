package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

class Widget24 extends Screen {
   final AutoBuy this$0;
   final Helper381 target;
   final Screen parent;
   String buffer;
   float ex;
   float ey;
   int editWidth;
   int editHeight;
   boolean dragging;
   double dragX;
   double dragY;

   protected Widget24(AutoBuy var1, Helper381 var2, Screen var3) {
      super(Text.of("Edit Price"));
      this.this$0 = var1;
      this.buffer = "";
      this.editWidth = 180;
      this.editHeight = 95;
      this.dragging = false;
      this.target = var2;
      this.parent = var3;
      this.buffer = var2.buyPrice > 0 ? String.valueOf(var2.buyPrice) : "";
      this.ex = (Helper160.mc.getWindow().getScaledWidth() - this.editWidth) / 2.0F;
      this.ey = (Helper160.mc.getWindow().getScaledHeight() - this.editHeight) / 2.0F;
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      this.renderBackground(context, mouseX, mouseY, delta);
      if (this.dragging) {
         this.ex = (float)(mouseX - this.dragX);
         this.ey = (float)(mouseY - this.dragY);
      }

      this.method3807(context, this.ex, this.ey, this.editWidth, this.editHeight, -871033579, -7829368);
      this.method3808(context, this.target.displayName, this.ex + this.editWidth / 2.0F, this.ey + 14.0F, -1);
      int var5 = (int)this.ex + 10;
      int var6 = (int)this.ey + 38;
      int var7 = this.editWidth - 20;
      byte var8 = 24;
      this.method3807(context, var5, var6, var7, var8, -1440406235, -11141291);
      context.drawTextWithShadow(Helper160.mc.textRenderer, "Макс. цена лота:", var5, var6 - 10, -4473925);
      String var9 = this.buffer.isEmpty() ? "0" : this.buffer;
      context.drawTextWithShadow(Helper160.mc.textRenderer, var9, var5 + 6, var6 + 7, -1);
      this.method3806(context, (int)this.ex + 10, (int)this.ey + this.editHeight - 22, 55, 18, "Отмена", -12303292);
      this.method3806(context, (int)this.ex + this.editWidth - 65, (int)this.ey + this.editHeight - 22, 55, 18, "Ок", -13391309);
   }

   private void method3806(DrawContext var1, int var2, int var3, int var4, int var5, String var6, int var7) {
      this.method3807(var1, var2, var3, var4, var5, -1440735200, var7);
      this.method3808(var1, var6, var2 + var4 / 2.0F, var3 + var5 / 2.0F - 4.0F, var7);
   }

   private void method3807(DrawContext var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      int var8 = (int)var2;
      int var9 = (int)var3;
      int var10 = (int)(var2 + var4);
      int var11 = (int)(var3 + var5);
      var1.fill(var8, var9, var10, var11, var6);
      var1.fill(var8, var9, var10, var9 + 1, var7);
      var1.fill(var8, var11 - 1, var10, var11, var7);
      var1.fill(var8, var9, var8 + 1, var11, var7);
      var1.fill(var10 - 1, var9, var10, var11, var7);
   }

   private void method3808(DrawContext var1, String var2, float var3, float var4, int var5) {
      var1.drawCenteredTextWithShadow(Helper160.mc.textRenderer, var2, (int)var3, (int)var4, var5);
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (mouseX >= this.ex && mouseX <= this.ex + this.editWidth && mouseY >= this.ey && mouseY <= this.ey + 25.0F) {
         this.dragging = true;
         this.dragX = mouseX - this.ex;
         this.dragY = mouseY - this.ey;
         return true;
      } else if (mouseX >= this.ex + 10.0F
         && mouseX <= this.ex + 65.0F
         && mouseY >= this.ey + this.editHeight - 22.0F
         && mouseY <= this.ey + this.editHeight - 4.0F) {
         Helper160.mc.setScreen(this.parent);
         return true;
      } else if (mouseX >= this.ex + this.editWidth - 65.0F
         && mouseX <= this.ex + this.editWidth - 10.0F
         && mouseY >= this.ey + this.editHeight - 22.0F
         && mouseY <= this.ey + this.editHeight - 4.0F) {
         try {
            int var6 = this.buffer.isEmpty() ? 0 : Integer.parseInt(this.buffer);
            this.target.buyPrice = var6;
            this.this$0.method3862();
            Notifications.method1666().method1668(this.target.displayName + " §aцена установлена: " + this.this$0.method3861(var6), 1500L);
         } catch (NumberFormatException var7) {
         }

         Helper160.mc.setScreen(this.parent);
         return true;
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   @Override
   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      this.dragging = false;
      return super.mouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 257) {
         try {
            this.target.buyPrice = this.buffer.isEmpty() ? 0 : Integer.parseInt(this.buffer);
            this.this$0.method3862();
         } catch (Exception var5) {
            this.target.buyPrice = 0;
         }

         Helper160.mc.setScreen(this.parent);
         return true;
      } else if (keyCode == 259 && !this.buffer.isEmpty()) {
         this.buffer = this.buffer.substring(0, this.buffer.length() - 1);
         return true;
      } else if (keyCode == 256) {
         Helper160.mc.setScreen(this.parent);
         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      if (Character.isDigit(chr) && this.buffer.length() < 9) {
         this.buffer = this.buffer + chr;
         return true;
      } else {
         return true;
      }
   }
}
