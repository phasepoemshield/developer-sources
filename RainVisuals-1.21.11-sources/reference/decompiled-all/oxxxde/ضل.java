package oxxxde;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.text.Text;

// $VF: Compiled from heavy
public final class ضل extends ClickableWidget {
   private static final int DOT_COLOR = -921103;
   private static final int ACTIVE_DOT_COLOR = -38037;
   private static final int RIGHT_MARGIN = 4;
   private static final int HEIGHT = 9;
   private static final int EDGE_SHADOW_COLOR = -7631989;
   private static final int ACTIVE_HOVERED_BACKGROUND_COLOR = -3618616;
   private static final int ACTIVE_EDGE_HIGHLIGHT_COLOR = -1447447;
   private static final int TOP_MARGIN = 4;
   private static final int ACTIVE_BACKGROUND_COLOR = -4671304;
   private static final int WIDTH = 9;
   private static final int BACKGROUND_COLOR = -3750202;
   private static final int ACTIVE_EDGE_SHADOW_COLOR = -8947849;
   private long lastFrameNanos = System.nanoTime();
   private static final int BORDER_COLOR = -13158601;
   private static final int HOVERED_BACKGROUND_COLOR = -2697514;
   private float activeProgress;
   private static final int EDGE_HIGHLIGHT_COLOR = -1;

   public ضل() {
      super(0, 0, 9, 9, Text.literal("Найти анархию с минимальным онлайном"));
   }

   private void renderDot(DrawContext left, int graphics, int top) {
      int centerX = left + 4;
      int centerY = top + 4;
      int color = this.interpolate(-921103, -38037, this.activeProgress);
      graphics.fill(centerX - 1, centerY - 1, centerX + 2, centerY + 2, color);
   }

   protected void renderWidget(DrawContext graphics, int partialTick, int mouseX, float mouseY) {
      this.updateAnimation();
      this.setMessage(Text.literal(بم.INSTANCE.getStatusText()));
      int left = this.getX();
      int top = this.getY();
      int right = this.getRight();
      int bottom = this.getBottom();
      int idleBackground = this.isSelected() ? -2697514 : -3750202;
      int activeBackground = this.isSelected() ? -3618616 : -4671304;
      int backgroundColor = this.interpolate(idleBackground, activeBackground, this.activeProgress);
      int highlightColor = this.interpolate(-1, -1447447, this.activeProgress);
      int shadowColor = this.interpolate(-7631989, -8947849, this.activeProgress);
      graphics.fill(left, top, right, bottom, -13158601);
      graphics.fill(left + 1, top + 1, right - 1, bottom - 1, backgroundColor);
      graphics.fill(left + 1, top + 1, right - 1, top + 2, highlightColor);
      graphics.fill(left + 1, top + 1, left + 2, bottom - 1, highlightColor);
      graphics.fill(right - 2, top + 2, right - 1, bottom - 1, shadowColor);
      graphics.fill(left + 2, bottom - 2, right - 1, bottom - 1, shadowColor);
      this.renderDot(graphics, left, top);
      if (this.isHovered()) {
         graphics.drawTooltip(this.getMessage(), mouseX, mouseY);
      }
   }

   private int channel(int color, int shift) {
      return color >> shift & 0xFF;
   }

   private void updateAnimation() {
      long now = System.nanoTime();
      float elapsedSeconds = Math.min((float)(now - this.lastFrameNanos) / 1.0E9F, 0.1F);
      this.lastFrameNanos = now;
      float target = بم.INSTANCE.isRunning() ? 1.0F : 0.0F;
      float blend = 1.0F - (float)Math.exp(-elapsedSeconds * 9.0F);
      this.activeProgress = this.activeProgress + (target - this.activeProgress) * blend;
      if (Math.abs(target - this.activeProgress) < 0.002F) {
         this.activeProgress = target;
      }
   }

   private int interpolate(int to, int from, float progress) {
      int alpha = this.channel(from, 24) + Math.round((this.channel(to, 24) - this.channel(from, 24)) * progress);
      int red = this.channel(from, 16) + Math.round((this.channel(to, 16) - this.channel(from, 16)) * progress);
      int green = this.channel(from, 8) + Math.round((this.channel(to, 8) - this.channel(from, 8)) * progress);
      int blue = this.channel(from, 0) + Math.round((this.channel(to, 0) - this.channel(from, 0)) * progress);
      return alpha << 24 | red << 16 | green << 8 | blue;
   }

   protected void appendClickableNarrations(NarrationMessageBuilder output) {
      this.appendDefaultNarrations(output);
   }

   public void attachToContainer(int containerTop, int containerLeft, int containerWidth) {
      this.setX(containerLeft + containerWidth - 9 - 4);
      this.setY(containerTop + 4);
   }

   public void onClick(Click doubled, boolean event) {
      if (MinecraftClient.getInstance().currentScreen instanceof HandledScreen<?> screen) {
         if (screen.getScreenHandler() instanceof GenericContainerScreenHandler menu) {
            screen.endTouchDrag();
            بم.INSTANCE.toggle(menu, screen.getTitle());
            this.setFocused(false);
         }
      }
   }
}
