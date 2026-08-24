package oxxxde;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.text.Text;

// $VF: Compiled from heavy
public final class ثع extends ClickableWidget {
   private static final int HOVERED_BACKGROUND_COLOR = -2697514;
   private static final ItemStack HOPPER_ICON = Items.HOPPER.getDefaultStack();
   private static final int WIDTH = 24;
   private static final int SORTING_EDGE_SHADOW_COLOR = -5738641;
   private static final int CONTAINER_GAP = 2;
   private long lastFrameNanos = System.nanoTime();
   private static final int SORTING_BACKGROUND_COLOR = -2647141;
   private static final int EDGE_SHADOW_COLOR = -7631989;
   private static final int SORTING_EDGE_HIGHLIGHT_COLOR = -11566;
   private static final int ITEM_SIZE = 14;
   private static final float ITEM_SCALE = 0.875F;
   private static final int BORDER_COLOR = -13158601;
   private static final int BACKGROUND_COLOR = -3750202;
   private static final int HEIGHT = 18;
   private static final int EDGE_HIGHLIGHT_COLOR = -1;
   private float sortingProgress;
   private static final int SORTING_HOVERED_BACKGROUND_COLOR = -1856854;

   private int channel(int shift, int color) {
      return color >> shift & 0xFF;
   }

   public ثع() {
      super(0, 0, 24, 18, Text.literal("Сортировка сундука"));
   }

   private void updateAnimation() {
      long now = System.nanoTime();
      float elapsedSeconds = Math.min((float)(now - this.lastFrameNanos) / 1.0E9F, 0.1F);
      this.lastFrameNanos = now;
      float target = ثث.INSTANCE.isSorting() ? 1.0F : 0.0F;
      float blend = 1.0F - (float)Math.exp(-elapsedSeconds * 9.0F);
      this.sortingProgress = this.sortingProgress + (target - this.sortingProgress) * blend;
      if (Math.abs(target - this.sortingProgress) < 0.002F) {
         this.sortingProgress = target;
      }
   }

   protected void renderWidget(DrawContext mouseX, int mouseY, int graphics, float partialTick) {
      this.updateAnimation();
      this.updateMessage();
      int left = this.getX();
      int top = this.getY();
      int right = this.getRight();
      int bottom = this.getBottom();
      int idleBackground = this.isSelected() ? -2697514 : -3750202;
      int sortingBackground = this.isSelected() ? -1856854 : -2647141;
      int backgroundColor = this.interpolate(idleBackground, sortingBackground, this.sortingProgress);
      int highlightColor = this.interpolate(-1, -11566, this.sortingProgress);
      int shadowColor = this.interpolate(-7631989, -5738641, this.sortingProgress);
      graphics.fill(left, top, right, bottom, -13158601);
      graphics.fill(left + 1, top + 1, right - 1, bottom - 1, backgroundColor);
      graphics.fill(left + 1, top + 1, right - 1, top + 2, highlightColor);
      graphics.fill(left + 1, top + 1, left + 2, bottom - 1, highlightColor);
      graphics.fill(right - 2, top + 2, right - 1, bottom - 1, shadowColor);
      graphics.fill(left + 2, bottom - 2, right - 1, bottom - 1, shadowColor);
      this.renderHopperIcon(graphics, left, top);
      if (this.isHovered()) {
         graphics.drawTooltip(this.getMessage(), mouseX, mouseY);
      }
   }

   private void renderHopperIcon(DrawContext left, int graphics, int top) {
      int iconX = left + 5;
      int iconY = top + 2;
      graphics.getMatrices().pushMatrix();
      graphics.getMatrices().translate(iconX, iconY);
      graphics.getMatrices().scale(0.875F, 0.875F);
      graphics.drawItem(HOPPER_ICON, 0, 0);
      graphics.getMatrices().popMatrix();
   }

   private int interpolate(int progress, int from, float to) {
      int alpha = this.channel(from, 24) + Math.round((this.channel(to, 24) - this.channel(from, 24)) * progress);
      int red = this.channel(from, 16) + Math.round((this.channel(to, 16) - this.channel(from, 16)) * progress);
      int green = this.channel(from, 8) + Math.round((this.channel(to, 8) - this.channel(from, 8)) * progress);
      int blue = this.channel(from, 0) + Math.round((this.channel(to, 0) - this.channel(from, 0)) * progress);
      return alpha << 24 | red << 16 | green << 8 | blue;
   }

   public void attachToContainer(int containerWidth, int containerTop, int containerLeft) {
      this.setX(containerLeft + containerWidth - 24);
      this.setY(containerTop - 18 - 2);
   }

   public void onClick(Click event, boolean doubled) {
      if (MinecraftClient.getInstance().currentScreen instanceof HandledScreen<?> screen) {
         if (screen.getScreenHandler() instanceof GenericContainerScreenHandler menu) {
            screen.endTouchDrag();
            ثث.INSTANCE.toggle(menu);
            this.setFocused(false);
         }
      }
   }

   private void updateMessage() {
      if (ثث.INSTANCE.isStopping()) {
         this.setMessage(Text.literal("Завершаю сортировку..."));
      } else if (ثث.INSTANCE.isSorting()) {
         this.setMessage(Text.literal("Сортировка сундука... Нажмите, чтобы остановить"));
      } else {
         this.setMessage(Text.literal("Сортировка сундука"));
      }
   }

   protected void appendClickableNarrations(NarrationMessageBuilder output) {
      this.appendDefaultNarrations(output);
   }
}
