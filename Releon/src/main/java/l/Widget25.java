package l;

import java.util.ArrayList;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

class Widget25 extends Screen {
   final AutoBuy this$0;
   private static final int SLOT_SIZE = 44;
   private static final int PADDING = 6;
   private static final int COLS = 5;
   private static final int ROWS = 5;
   private static final int BUTTON_HEIGHT = 18;
   private float x;
   private float y;
   private int menuWidth;
   private int menuHeight;
   private boolean dragging;
   private double dragX;
   private double dragY;
   private int scrollOffset;
   private int maxScroll;
   private static float lastX = -1.0F;
   private static float lastY = -1.0F;

   protected Widget25(AutoBuy var1) {
      super(Text.of("Custom Prices"));
      this.this$0 = var1;
      this.menuWidth = 262;
      this.menuHeight = 306;
      this.dragging = false;
      this.scrollOffset = 0;
      this.maxScroll = 0;
      int var2 = var1.targets.size();
      int var3 = (int)Math.ceil(var2 / 5.0);
      this.maxScroll = Math.max(0, var3 - 5);
      if (lastX == -1.0F) {
         this.x = (Helper160.mc.getWindow().getScaledWidth() - this.menuWidth) / 2.0F;
         this.y = (Helper160.mc.getWindow().getScaledHeight() - this.menuHeight) / 2.0F;
      } else {
         this.x = lastX;
         this.y = lastY;
      }
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      if (this.dragging) {
         this.x = (float)(mouseX - this.dragX);
         this.y = (float)(mouseY - this.dragY);
         lastX = this.x;
         lastY = this.y;
      }

      this.method3809(context, this.x, this.y, this.menuWidth, this.menuHeight, -585820907, -11184811);
      this.method3810(context, "Custom Prices", this.x + this.menuWidth / 2.0F, this.y + 8.0F, -1);
      this.method3811(context, (int)this.x + 8, (int)this.y + 22, this.menuWidth - 16, 18, "AutoSetup", -11141291);
      int var5 = this.scrollOffset * 5;
      int var6 = Math.min(var5 + 25, this.this$0.targets.size());
      ArrayList var7 = new ArrayList<>(this.this$0.targets.values());

      for (int var8 = var5; var8 < var6; var8++) {
         Helper381 var9 = (Helper381)var7.get(var8);
         int var10 = var8 - var5;
         int var11 = var10 / 5;
         int var12 = var10 % 5;
         int var13 = (int)(this.x + 6.0F + 5.0F + var12 * 50);
         int var14 = (int)(this.y + 47.0F + var11 * 50);
         boolean var15 = var9.buyPrice > 0;
         this.method3809(context, var13, var14, 44.0F, 44.0F, var15 ? 1073807104 : -1440735200, var15 ? -11141291 : -12303292);
         context.drawItem(var9.displayStack, var13 + 14, var14 + 10);
         if (var15) {
            this.method3810(context, this.this$0.method3861(var9.buyPrice), var13 + 22.0F, var14 + 44 - 10, -11141291);
         }
      }
   }

   private void method3809(DrawContext var1, float var2, float var3, float var4, float var5, int var6, int var7) {
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

   private void method3810(DrawContext var1, String var2, float var3, float var4, int var5) {
      var1.drawCenteredTextWithShadow(Helper160.mc.textRenderer, var2, (int)var3, (int)var4, var5);
   }

   private void method3811(DrawContext var1, int var2, int var3, int var4, int var5, String var6, int var7) {
      this.method3809(var1, var2, var3, var4, var5, -1440735200, var7);
      this.method3810(var1, var6, var2 + var4 / 2.0F, var3 + var5 / 2.0F - 4.0F, var7);
   }

   @Override
   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.maxScroll > 0) {
         this.scrollOffset -= (int)verticalAmount;
         this.scrollOffset = Math.max(0, Math.min(this.scrollOffset, this.maxScroll));
         return true;
      } else {
         return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
      }
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (mouseY >= this.y && mouseY <= this.y + 20.0F && mouseX >= this.x && mouseX <= this.x + this.menuWidth) {
         this.dragging = true;
         this.dragX = mouseX - this.x;
         this.dragY = mouseY - this.y;
         return true;
      } else if (mouseX >= this.x + 8.0F && mouseX <= this.x + this.menuWidth - 8.0F && mouseY >= this.y + 22.0F && mouseY <= this.y + 22.0F + 18.0F) {
         this.this$0.method3814();
         Notifications.method1666().method1668("§aAutoParser запущен из Custom Prices", 2000L);
         return true;
      } else {
         int var6 = this.scrollOffset * 5;
         ArrayList var7 = new ArrayList<>(this.this$0.targets.values());

         for (int var8 = var6; var8 < Math.min(var6 + 25, var7.size()); var8++) {
            Helper381 var9 = (Helper381)var7.get(var8);
            int var10 = var8 - var6;
            int var11 = var10 / 5;
            int var12 = var10 % 5;
            int var13 = (int)(this.x + 6.0F + 5.0F + var12 * 50);
            int var14 = (int)(this.y + 47.0F + var11 * 50);
            if (mouseX >= var13 && mouseX <= var13 + 44 && mouseY >= var14 && mouseY <= var14 + 44) {
               if (button == 0) {
                  Helper160.mc.setScreen(new Widget24(this.this$0, var9, this));
               } else if (button == 1) {
                  var9.buyPrice = 0;
                  this.this$0.method3862();
                  Notifications.method1666().method1668("Сброшена цена для " + var9.displayName, 1000L);
               }

               return true;
            }
         }

         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   @Override
   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      this.dragging = false;
      return super.mouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean shouldPause() {
      return false;
   }
}
