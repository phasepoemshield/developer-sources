package zenith.zov.client.screens.shulker;

import net.minecraft.item.ItemStack;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.Identifier;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.render.VertexConsumerProvider.ControlsListWidget8;
import org.joml.Matrix4f;

public final class ShulkerTooltipComponent implements TooltipComponent {
   private final DefaultedList<ItemStack> items;
   private static final Identifier shulkerGuiTexture = Identifier.of("zenith", "textures/container.png");
   private static final int guiWidth = 176;
   private static final int guiHeight = 67;
   private static final int slotOffsetX = 8;
   private static final int slotOffsetY = 7;

   public ShulkerTooltipComponent(DefaultedList<ItemStack> DefaultedList) {
      this.items = DefaultedList;
   }

   public int getHeight(TextRenderer TextRenderer) {
      return 67;
   }

   public int getWidth(TextRenderer TextRenderer) {
      return 176;
   }

   public void drawText(TextRenderer TextRenderer, int i, int j, Matrix4f matrix4f, ControlsListWidget8 ControlsListWidget8) {
   }

   public void drawItems(TextRenderer TextRenderer, int i, int j, int j1, int k1, DrawContext DrawContext) {
      DrawContext.drawTexture(RenderLayer::getGuiTextured, shulkerGuiTexture, i, j, 0.0F, 0.0F, 176, 67, 176, 67);

      for (int k = 0; k < 27; k++) {
         ItemStack ItemStack = (ItemStack)this.items.get(k);
         if (!ItemStack.isEmpty()) {
            int l = i + 8 + k % 9 * 18;
            int i1 = j + 7 + k / 9 * 18;
            DrawContext.drawItem(ItemStack, l, i1);
            DrawContext.drawStackOverlay(TextRenderer, ItemStack, l, i1);
         }
      }
   }
}
