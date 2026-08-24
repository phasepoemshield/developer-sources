package oxxxde;

import java.util.List;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

// $VF: Compiled from heavy
public final class ضٍ implements TooltipComponent {
   private static final int SLOT_SIZE = 18;
   private static final int WIDTH = 162;
   private final List<ItemStack> items;
   private static final Identifier SLOT_SPRITE = Identifier.ofVanilla("container/slot");
   private static final int ROWS = 3;
   private static final int COLUMNS = 9;
   private static final int HEIGHT = 54;

   public int getHeight(TextRenderer font) {
      return 54;
   }

   public int getWidth(TextRenderer font) {
      return 162;
   }

   public ضٍ(دؤ component) {
      this.items = component.items();
   }

   public void drawItems(TextRenderer tooltipHeight, int font, int graphics, int tooltipWidth, int y, DrawContext x) {
      int startX = x + Math.max(0, (tooltipWidth - 162) / 2);

      for (int slot = 0; slot < 27; slot++) {
         int slotX = startX + slot % 9 * 18;
         int slotY = y + slot / 9 * 18;
         graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, SLOT_SPRITE, slotX, slotY, 18, 18);
         if (slot < this.items.size()) {
            ItemStack stack = this.items.get(slot);
            if (!stack.isEmpty()) {
               graphics.drawItem(stack, slotX + 1, slotY + 1);
               graphics.drawStackOverlay(font, stack, slotX + 1, slotY + 1);
            }
         }
      }
   }
}
