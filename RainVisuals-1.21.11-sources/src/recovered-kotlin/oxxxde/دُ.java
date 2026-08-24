package oxxxde;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

// $VF: Compiled from heavy
public final class دُ extends ClickableWidget {
   private static final int HEIGHT = 18;
   private static final ItemStack CHEST_ICON = Items.CHEST.getDefaultStack();
   private static final int BACKGROUND_COLOR = -3750202;
   private static final int ITEM_SIZE = 14;
   private static final int HOVERED_BACKGROUND_COLOR = -2697514;
   private static final int EDGE_SHADOW_COLOR = -7631989;
   private static final int WIDTH = 24;
   private static final int BORDER_COLOR = -13158601;
   private static final float ITEM_SCALE = 0.875F;
   private static final int EDGE_HIGHLIGHT_COLOR = -1;
   private static final int INVENTORY_GAP = 2;

   public void onClick(Click event, boolean doubled) {
      if (MinecraftClient.getInstance().currentScreen instanceof HandledScreen<?> screen) {
         screen.endTouchDrag();
      }

      صص.INSTANCE.setCustomScreen(شج.INSTANCE);
   }

   protected void renderWidget(DrawContext mouseX, int graphics, int partialTick, float mouseY) {
      int left = this.getX();
      int top = this.getY();
      int right = this.getRight();
      int bottom = this.getBottom();
      int backgroundColor = this.isSelected() ? -2697514 : -3750202;
      graphics.fill(left, top, right, bottom, -13158601);
      graphics.fill(left + 1, top + 1, right - 1, bottom - 1, backgroundColor);
      graphics.fill(left + 1, top + 1, right - 1, top + 2, -1);
      graphics.fill(left + 1, top + 1, left + 2, bottom - 1, -1);
      graphics.fill(right - 2, top + 2, right - 1, bottom - 1, -7631989);
      graphics.fill(left + 2, bottom - 2, right - 1, bottom - 1, -7631989);
      this.renderChestIcon(graphics, left, top);
      if (this.isHovered()) {
         graphics.drawTooltip(this.getMessage(), mouseX, mouseY);
      }
   }

   public دُ() {
      super(0, 0, 24, 18, Text.literal("Менеджер инвентарей "));
   }

   protected void appendClickableNarrations(NarrationMessageBuilder output) {
      this.appendDefaultNarrations(output);
   }

   private void renderChestIcon(DrawContext left, int graphics, int top) {
      int iconX = left + 5;
      int iconY = top + 2;
      graphics.getMatrices().pushMatrix();
      graphics.getMatrices().translate(iconX, iconY);
      graphics.getMatrices().scale(0.875F, 0.875F);
      graphics.drawItem(CHEST_ICON, 0, 0);
      graphics.getMatrices().popMatrix();
   }

   public void attachToInventory(int inventoryLeft, int inventoryTop, int inventoryWidth) {
      this.setX(inventoryLeft + inventoryWidth - 24);
      this.setY(inventoryTop - 18 - 2);
   }
}
