package l;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class Widget30 extends Screen {
   private final AutoSwap autoSwap;
   private final int wheelSlotIndex;
   private static final int ROWS = 4;
   private static final int COLS = 9;
   private static final int SLOT_SIZE = 18;
   private static final int SLOT_PAD = 4;

   public Widget30(AutoSwap var1, int var2) {
      super(Text.literal("Select Item"));
      this.autoSwap = var1;
      this.wheelSlotIndex = var2;
   }

   @Override
   public boolean shouldPause() {
      return false;
   }

   @Override
   public void close() {
      if (this.client != null) {
         this.client.setScreen(new Widget22(this.autoSwap));
      }
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         this.close();
         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      super.render(context, mouseX, mouseY, delta);
      if (this.client != null && this.client.player != null) {
         short var5 = 210;
         byte var6 = 122;
         int var7 = (this.width - var5) / 2;
         int var8 = (this.height - var6) / 2;
         context.fill(var7, var8, var7 + var5, var8 + var6, -585886695);
         context.drawTextWithShadow(this.textRenderer, "Нажмите ЛКМ чтобы выбрать слот " + this.wheelSlotIndex, var7 + 8, var8 + 8, -1);
         int var9 = var7 + 6;
         int var10 = var8 + 20;
         PlayerInventory var11 = this.client.player.getInventory();

         for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 9; var13++) {
               int var14 = var12 * 9 + var13;
               int var15 = var9 + var13 * 22;
               int var16 = var10 + var12 * 22;
               context.fill(var15, var16, var15 + 18, var16 + 18, -1439879882);
               ItemStack var17 = var11.getStack(var14);
               if (!var17.isEmpty()) {
                  context.drawItem(var17, var15 + 1, var16 + 1);
               }
            }
         }
      }
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (this.client != null && this.client.player != null) {
         if (button != 0) {
            return super.mouseClicked(mouseX, mouseY, button);
         } else {
            short var6 = 210;
            byte var7 = 122;
            int var8 = (this.width - var6) / 2;
            int var9 = (this.height - var7) / 2;
            int var10 = var8 + 6;
            int var11 = var9 + 20;
            PlayerInventory var12 = this.client.player.getInventory();

            for (int var13 = 0; var13 < 4; var13++) {
               for (int var14 = 0; var14 < 9; var14++) {
                  int var15 = var13 * 9 + var14;
                  int var16 = var10 + var14 * 22;
                  int var17 = var11 + var13 * 22;
                  if (mouseX >= var16 && mouseX <= var16 + 18 && mouseY >= var17 && mouseY <= var17 + 18) {
                     ItemStack var18 = var12.getStack(var15);
                     if (!var18.isEmpty()) {
                        this.autoSwap.method4472(this.wheelSlotIndex, var18.getItem(), var18.getName().getString());
                     }

                     this.close();
                     return true;
                  }
               }
            }

            return super.mouseClicked(mouseX, mouseY, button);
         }
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }
}
