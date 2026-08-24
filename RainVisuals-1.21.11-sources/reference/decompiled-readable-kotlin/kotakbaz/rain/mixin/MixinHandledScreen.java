package kotakbaz.rain.mixin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.ui.inventory.InventorySlotState;
import kotakbaz.rain.ui.inventory.InventorySlotVisual;
import kotakbaz.rain.ui.inventory.MissingInventoryItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.util.InputUtil;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.اة;
import oxxxde.ات;
import oxxxde.بم;
import oxxxde.ثث;
import oxxxde.ثر;
import oxxxde.ثع;
import oxxxde.دُ;
import oxxxde.ذج;
import oxxxde.ذه;
import oxxxde.شج;
import oxxxde.صص;
import oxxxde.ضا;
import oxxxde.ضل;
import oxxxde.ضَ;
import oxxxde.ظد;
import oxxxde.ظظ;

// $VF: Compiled from MixinHandledScreen.java
@Mixin(HandledScreen.class)
public abstract class MixinHandledScreen<T extends ScreenHandler> extends Screen implements ScreenHandlerProvider<T>, اة, ذه {
   @Unique
   private long lastQuickMoveAt;
   @Shadow
   protected int y;
   @Unique
   private ضل rain$funTimeOnlineHelperButton;
   @Unique
   private static final int SORT_BUTTON_HEIGHT = 20;
   @Unique
   private ثع rain$chestSorterButton;
   @Unique
   private boolean rain$inventoryAnimationFinished;
   @Unique
   private static final long INVENTORY_ANIMATION_DURATION_NANOS = 240000000L;
   @Unique
   private static final int MISSING_PANEL_GAP = 4;
   @Unique
   private int rain$missingScroll;
   @Unique
   private boolean rain$backgroundAnimationPose;
   @Unique
   private static final int MISSING_ROW_SIZE = 18;
   @Unique
   private static final Identifier MISSING_SLOT = Identifier.ofVanilla("container/slot");
   @Unique
   private long rain$inventoryAnimationStart;
   @Unique
   private static final float INVENTORY_ANIMATION_START_SCALE = 0.9F;
   @Shadow
   protected Slot focusedSlot;
   @Unique
   private static final int MISSING_PANEL_WIDTH = 86;
   @Unique
   private static final int MISSING_LIST_TOP = 22;
   @Unique
   private ButtonWidget rain$sortButton;
   @Shadow
   protected int backgroundWidth;
   @Unique
   private static final Identifier MISSING_PANEL_BACKGROUND = Identifier.ofVanilla("popup/background");
   @Shadow
   protected int x;
   @Shadow
   protected int backgroundHeight;
   @Unique
   private static final int SORT_BUTTON_WIDTH = 92;
   @Unique
   private دُ rain$inventoryChestButton;
   @Unique
   private static final int MISSING_ROW_HEIGHT = 20;
   @Unique
   private static final Identifier MISSING_SLOT_HIGHLIGHT = Identifier.ofVanilla("container/slot_highlight_front");

   @Unique
   private boolean rain$isInsideMissingPanel(double mouseY, double mouseX) {
      int panelX = this.rain$missingPanelX();
      return mouseX >= panelX && mouseX < panelX + 86 && mouseY >= this.y && mouseY < this.y + this.backgroundHeight;
   }

   @Inject(method = "method_25420", at = @At("RETURN"))
   private void rain$finishInventoryBackgroundAnimation(DrawContext mouseY, int mouseX, int delta, float context, CallbackInfo ci) {
      if (this.rain$backgroundAnimationPose) {
         this.rain$popInventoryAnimation(context);
         this.rain$backgroundAnimationPose = false;
      }
   }

   @Unique
   private void rain$searchAuction(MissingInventoryItem item) {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client.getNetworkHandler() != null) {
         String name = ضَ.sanitizeName(item.getStack().getName());
         if (!name.isEmpty()) {
            ظظ.INSTANCE.expectInventoryReturnFromAuction();
            client.getNetworkHandler().sendChatCommand("ah search " + name);
         }
      }
   }

   @Inject(method = "method_2380", at = @At("HEAD"), cancellable = true)
   private void rain$renderInventoryLayoutTooltip(DrawContext context, int mouseX, int mouseY, CallbackInfo ci) {
      if (this.focusedSlot != null && ضا.INSTANCE.scheduleTooltip(context, this.focusedSlot.getStack(), mouseX, mouseY)) {
         ci.cancel();
      } else if (this instanceof InventoryScreen) {
         if (this.focusedSlot != null) {
            int menuSlot = this.getScreenHandler().slots.indexOf(this.focusedSlot);
            InventorySlotVisual visual = ظظ.INSTANCE.visualAt(menuSlot);
            if (visual != null) {
               ItemStack current = this.focusedSlot.getStack();
               ItemStack tooltipStack = current.isEmpty() ? visual.getExpected() : current;
               context.drawTooltip(
                  MinecraftClient.getInstance().textRenderer,
                  this.rain$slotTooltip(visual, current),
                  tooltipStack.getTooltipData(),
                  mouseX,
                  mouseY,
                  (Identifier)tooltipStack.get(DataComponentTypes.TOOLTIP_STYLE)
               );
               ci.cancel();
            }
         }
      }
   }

   @Unique
   private boolean rain$isShiftDown(MinecraftClient client) {
      return InputUtil.isKeyPressed(client.getWindow(), 340) || InputUtil.isKeyPressed(client.getWindow(), 344);
   }

   @Override
   public float rain$getInventoryAnimationProgress() {
      if (this.rain$inventoryAnimationFinished) {
         return 1.0F;
      } else if (!this.rain$shouldAnimateInventory()) {
         this.rain$inventoryAnimationFinished = true;
         return 1.0F;
      } else {
         long elapsed = Math.max(0L, System.nanoTime() - this.rain$inventoryAnimationStart);
         if (elapsed >= 240000000L) {
            this.rain$inventoryAnimationFinished = true;
            return 1.0F;
         } else {
            float linear = (float)elapsed / 2.4E8F;
            float inverse = 1.0F - linear;
            return 1.0F - inverse * inverse * inverse * inverse;
         }
      }
   }

   @Inject(method = "method_2385", at = @At("HEAD"))
   private void rain$renderItemHighliterBackground(DrawContext mouseX, Slot context, int ci, int mouseY, CallbackInfo slot) {
      ثر.INSTANCE.renderHighlight(context, slot.getStack(), slot.x, slot.y);
      if (this instanceof InventoryScreen) {
         int menuSlot = this.getScreenHandler().slots.indexOf(slot);
         if (menuSlot >= 0) {
            InventorySlotVisual visual = ظظ.INSTANCE.visualAt(menuSlot);
            if (visual != null && visual.getState() == InventorySlotState.MISSING) {
               context.drawItem(visual.getExpected(), slot.x, slot.y);
               ظظ.INSTANCE.markGhost(this.x + slot.x, this.y + slot.y);
            }
         }
      }
   }

   @Inject(method = "method_25404", at = @At("HEAD"), cancellable = true)
   private void rain$blockInventoryKey(KeyInput cir, CallbackInfoReturnable<Boolean> event) {
      if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
         cir.setReturnValue(true);
      }
   }

   @Unique
   private void rain$processItemScroller(int mouseX, int mouseY) {
      if (!this.rain$isInventoryManagerOpen() && !this.rain$isAutomationSorting()) {
         MinecraftClient client = MinecraftClient.getInstance();
         if (client.player != null && client.world != null) {
            if (ات.INSTANCE.isEnabled()) {
               if (this.rain$isShiftDown(client) && this.rain$isHoldingLeftMouse(client)) {
                  if (this.rain$isDelayComplete()) {
                     List<Slot> menuSlots = this.getScreenHandler().slots;

                     for (int menuSlotId = 0; menuSlotId < menuSlots.size(); menuSlotId++) {
                        Slot slot = menuSlots.get(menuSlotId);
                        if (slot != null && slot.isEnabled() && !slot.getStack().isEmpty() && this.isPointOverSlot(slot, mouseX, mouseY)) {
                           this.onMouseClick(slot, menuSlotId, 0, SlotActionType.QUICK_MOVE);
                           this.lastQuickMoveAt = System.currentTimeMillis();
                           break;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(method = "method_71085", at = @At("RETURN"))
   private void rain$tintSortingButton(DrawContext context, int mouseX, int delta, float mouseY, CallbackInfo ci) {
      if (this.rain$sortButton != null && this.rain$sortButton.visible && ظظ.INSTANCE.isSorting()) {
         context.fill(
            this.rain$sortButton.getX() + 2,
            this.rain$sortButton.getY() + 2,
            this.rain$sortButton.getRight() - 2,
            this.rain$sortButton.getBottom() - 2,
            953236283
         );
      }
   }

   @Unique
   private void rain$renderMissingScrollbar(DrawContext maxScroll, int itemCount, int visibleRows, int context, int panelX) {
      int trackTop = this.y + 22;
      int trackHeight = visibleRows * 20 - 2;
      int thumbHeight = Math.max(12, trackHeight * visibleRows / itemCount);
      int thumbY = trackTop + (trackHeight - thumbHeight) * this.rain$missingScroll / maxScroll;
      int trackX = panelX + 86 - 4;
      context.fill(trackX, trackTop, trackX + 2, trackTop + trackHeight, -15000805);
      context.fill(trackX, thumbY, trackX + 2, thumbY + thumbHeight, -5592406);
   }

   @Inject(method = "method_25406", at = @At("HEAD"), cancellable = true)
   private void rain$blockInventoryRelease(Click event, CallbackInfoReturnable<Boolean> cir) {
      if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
         cir.setReturnValue(true);
      }
   }

   @Override
   public boolean rain$isSortButtonHovered(double mouseX, double mouseY) {
      boolean inventorySortHovered = this.rain$sortButton != null && this.rain$sortButton.visible && this.rain$sortButton.isMouseOver(mouseX, mouseY);
      boolean chestSortHovered = this.rain$chestSorterButton != null
         && this.rain$chestSorterButton.visible
         && this.rain$chestSorterButton.isMouseOver(mouseX, mouseY);
      boolean onlineHelperHovered = this.rain$funTimeOnlineHelperButton != null
         && this.rain$funTimeOnlineHelperButton.visible
         && this.rain$funTimeOnlineHelperButton.isMouseOver(mouseX, mouseY);
      return inventorySortHovered || chestSortHovered || onlineHelperHovered;
   }

   @Unique
   private void rain$updateInventoryButtons() {
      boolean sorting = ظظ.INSTANCE.isSorting();
      if (this.rain$chestSorterButton != null) {
         this.rain$chestSorterButton.attachToContainer(this.x, this.y, this.backgroundWidth);
         this.rain$chestSorterButton.visible = true;
      }

      if (this.rain$funTimeOnlineHelperButton != null) {
         this.rain$funTimeOnlineHelperButton.attachToContainer(this.x, this.y, this.backgroundWidth);
         this.rain$funTimeOnlineHelperButton.visible = بم.INSTANCE.shouldShowButton(this.title);
      }

      if (this.rain$inventoryChestButton != null) {
         this.rain$inventoryChestButton.attachToInventory(this.x, this.y, this.backgroundWidth);
         this.rain$inventoryChestButton.visible = !sorting;
      }

      if (this.rain$sortButton != null) {
         if (this.getFocused() == this.rain$sortButton) {
            this.setFocused(null);
         }

         this.rain$sortButton.setFocused(false);
         this.rain$sortButton.setX(this.x + (this.backgroundWidth - 92) / 2);
         this.rain$sortButton.setY(this.y - 20 - 2);
         this.rain$sortButton.visible = ظظ.INSTANCE.hasLoadedInventory() && صص.INSTANCE.getCustomScreen() == null;
         this.rain$sortButton.setMessage(sorting ? Text.literal("Сортирую..(Стоп)").formatted(Formatting.RED) : Text.literal("Сортировать"));
      }
   }

   @Inject(method = "method_25419", at = @At("HEAD"), cancellable = true)
   private void rain$keepInventoryOpenWhileSorting(CallbackInfo ci) {
      if (this.rain$isAutomationSorting()) {
         ci.cancel();
      }
   }

   @Inject(method = "method_25426", at = @At("RETURN"))
   private void rain$addInventoryChestButton(CallbackInfo ci) {
      this.rain$inventoryAnimationStart = System.nanoTime();
      this.rain$inventoryAnimationFinished = false;
      if (this.getScreenHandler() instanceof GenericContainerScreenHandler) {
         if (بم.INSTANCE.isSelectorMenu(this.title)) {
            if (بم.INSTANCE.shouldShowButton(this.title)) {
               this.rain$funTimeOnlineHelperButton = (ضل)this.addDrawableChild(new ضل());
            }
         } else if (ثث.INSTANCE.isChestScreen(this.title)) {
            this.rain$chestSorterButton = (ثع)this.addDrawableChild(new ثع());
         }
      }

      if (!(this instanceof InventoryScreen)) {
         this.rain$updateInventoryButtons();
      } else {
         this.rain$inventoryChestButton = (دُ)this.addDrawableChild(new دُ());
         this.rain$sortButton = (ButtonWidget)this.addDrawableChild(
            ButtonWidget.builder(Text.literal("Сортировать"), button -> this.rain$toggleSorting()).dimensions(0, 0, 92, 20).build()
         );
         this.rain$missingScroll = 0;
         this.rain$updateInventoryButtons();
      }
   }

   @Inject(method = "method_25403", at = @At("HEAD"), cancellable = true)
   private void rain$blockInventoryDrag(Click dragX, double event, double dragY, CallbackInfoReturnable<Boolean> cir) {
      if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
         cir.setReturnValue(true);
      }
   }

   @Unique
   private boolean rain$isOverMissingItem(double mouseY, double mouseX, int rowY, int slotX) {
      return mouseX >= slotX && mouseX < slotX + 18 && mouseY >= rowY && mouseY < rowY + 18;
   }

   @Inject(method = "method_25402", at = @At("RETURN"))
   private void rain$dropSortButtonFocus(Click cir, boolean event, CallbackInfoReturnable<Boolean> doubled) {
      if (this.getFocused() == this.rain$sortButton) {
         this.setFocused(null);
      }
   }

   @Unique
   private int rain$missingPanelX() {
      return this.x - 4 - 86;
   }

   @Inject(method = "method_2383", at = @At("HEAD"), cancellable = true)
   private void rain$blockInventorySlotAction(Slot ci, int actionType, int slotId, SlotActionType button, CallbackInfo slot) {
      if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
         ci.cancel();
      }
   }

   @Unique
   private void rain$renderMissingPanel(DrawContext mouseY, int mouseX, int context) {
      if (!this.rain$showMissingPanel()) {
         this.rain$missingScroll = 0;
      } else {
         MinecraftClient client = MinecraftClient.getInstance();
         List<MissingInventoryItem> items = ظظ.INSTANCE.missingItems();
         int panelX = this.rain$missingPanelX();
         int visibleRows = this.rain$missingVisibleRows();
         int maxScroll = Math.max(0, items.size() - visibleRows);
         this.rain$missingScroll = Math.min(this.rain$missingScroll, maxScroll);
         context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, MISSING_PANEL_BACKGROUND, panelX, this.y, 86, this.backgroundHeight);
         context.drawText(client.textRenderer, "Не хватает:", panelX + 8, this.y + 7, -1, true);
         if (items.isEmpty()) {
            context.drawText(client.textRenderer, "Ничего", panelX + 8, this.y + 22 + 5, -5592406, false);
         } else {
            int end = Math.min(items.size(), this.rain$missingScroll + visibleRows);

            for (int index = this.rain$missingScroll; index < end; index++) {
               MissingInventoryItem item = items.get(index);
               int rowY = this.y + 22 + (index - this.rain$missingScroll) * 20;
               int slotX = panelX + 7;
               String count = "x" + item.getCount();
               int countX = slotX + 18 + 6;
               context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, MISSING_SLOT, slotX, rowY, 18, 18);
               context.drawItem(item.getStack(), slotX + 1, rowY + 1);
               context.drawText(client.textRenderer, count, countX, rowY + 5, -1, true);
               if (this.rain$isOverMissingItem(mouseX, mouseY, slotX, rowY)) {
                  context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, MISSING_SLOT_HIGHLIGHT, slotX - 3, rowY - 3, 24, 24);
               }
            }

            if (maxScroll > 0) {
               this.rain$renderMissingScrollbar(context, panelX, items.size(), visibleRows, maxScroll);
            }
         }
      }
   }

   @Shadow
   protected abstract void onMouseClick(Slot var1, int var2, int var3, SlotActionType var4);

   @Unique
   private boolean rain$shouldAnimateInventory() {
      return ذج.INSTANCE.isEnabled() && ذج.INSTANCE.getAnimateInventory().getValue();
   }

   @Unique
   private boolean rain$isAutomationSorting() {
      return ظظ.INSTANCE.isSorting() || ثث.INSTANCE.isSorting() || بم.INSTANCE.isRunning();
   }

   @Unique
   private boolean rain$isDelayComplete() {
      return System.currentTimeMillis() - this.lastQuickMoveAt >= ات.INSTANCE.delayMs();
   }

   @Unique
   private int rain$missingVisibleRows() {
      return Math.max(1, (this.backgroundHeight - 22 - 2) / 20);
   }

   @Inject(method = "method_2385", at = @At("RETURN"))
   private void rain$renderInventoryLayoutState(DrawContext ci, Slot slot, int mouseX, int mouseY, CallbackInfo context) {
      if (this instanceof InventoryScreen) {
         int menuSlot = this.getScreenHandler().slots.indexOf(slot);
         if (menuSlot >= 0) {
            InventorySlotVisual visual = ظظ.INSTANCE.visualAt(menuSlot);
            if (visual != null) {
               if (visual.getState() == InventorySlotState.CONFLICT) {
                  context.fill(slot.x + 7, slot.y + 7, slot.x + 17, slot.y + 17, -871362544);
                  context.getMatrices().pushMatrix();
                  context.getMatrices().translate(slot.x + 8, slot.y + 8);
                  context.getMatrices().scale(0.5F, 0.5F);
                  context.drawItem(visual.getExpected(), 0, 0);
                  context.getMatrices().popMatrix();
               }

               this.rain$drawSlotBorder(context, slot.x, slot.y, this.rain$slotColor(visual.getState()));
            }
         }
      }
   }

   @Unique
   private void rain$toggleSorting() {
      ((HandledScreen)this).endTouchDrag();
      ظظ.INSTANCE.toggleSorting();
      this.setFocused(null);
      this.rain$sortButton.setFocused(false);
   }

   @Override
   public void rain$popInventoryAnimation(DrawContext context) {
      ظد.pop();
      context.getMatrices().popMatrix();
   }

   @Inject(method = "method_25420", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_465;method_2389(Lnet/minecraft/class_332;FII)V"))
   private void rain$beginInventoryBackgroundAnimation(DrawContext context, int mouseX, int delta, float ci, CallbackInfo mouseY) {
      this.rain$backgroundAnimationPose = this.rain$pushInventoryAnimation(context);
   }

   @Inject(method = "method_25401", at = @At("HEAD"), cancellable = true)
   private void rain$blockInventoryScroll(double horizontal, double vertical, double cir, double mouseY, CallbackInfoReturnable<Boolean> mouseX) {
      if (this.rain$isInsideMissingPanel(mouseX, mouseY) && this.rain$showMissingPanel()) {
         int maxScroll = Math.max(0, ظظ.INSTANCE.missingItems().size() - this.rain$missingVisibleRows());
         if (maxScroll > 0 && vertical != 0.0) {
            this.rain$missingScroll = Math.max(0, Math.min(maxScroll, this.rain$missingScroll + (vertical > 0.0 ? -1 : 1)));
            cir.setReturnValue(true);
            return;
         }
      }

      if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
         cir.setReturnValue(true);
      }
   }

   @Unique
   private int rain$slotColor(InventorySlotState state) {
      return switch (state) {
         case CORRECT -> -1942374310;
         case MISSING -> -639121845;
         case MISPLACED -> -639591874;
         case CONFLICT -> -522630325;
      };
   }

   @Inject(method = "method_25402", at = @At("HEAD"), cancellable = true)
   private void rain$blockInventoryClick(Click cir, boolean doubled, CallbackInfoReturnable<Boolean> event) {
      if (this.rain$isInventoryManagerOpen()) {
         cir.setReturnValue(true);
      } else if (this.rain$isAutomationSorting() && !this.rain$isSortButtonHovered(event.x(), event.y())) {
         cir.setReturnValue(true);
      } else {
         if (event.button() == 0) {
            MissingInventoryItem missing = this.rain$missingItemAt(event.x(), event.y());
            if (missing != null) {
               this.rain$searchAuction(missing);
               cir.setReturnValue(true);
            }
         }
      }
   }

   @Unique
   private boolean rain$isHoldingLeftMouse(MinecraftClient client) {
      return GLFW.glfwGetMouseButton(client.getWindow().getHandle(), 0) == 1;
   }

   protected MixinHandledScreen(Text title) {
      super(title);
   }

   @Inject(method = "method_25394", at = @At("HEAD"), cancellable = true)
   private void rain$handleInventoryManagerOverlay(DrawContext mouseX, int ci, int mouseY, float context, CallbackInfo delta) {
      this.rain$updateInventoryButtons();
      if (this.rain$isInventoryManagerOpen()) {
         ci.cancel();
      }
   }

   @Shadow
   private boolean isPointOverSlot(Slot pointY, double slot, double pointX) {
      return false;
   }

   @Override
   public boolean rain$pushInventoryAnimation(DrawContext context) {
      float progress = this.rain$getInventoryAnimationProgress();
      if (progress >= 1.0F) {
         return false;
      }

      float scale = 0.9F + 0.100000024F * progress;
      float centerX = this.x + this.backgroundWidth * 0.5F;
      float centerY = this.y + this.backgroundHeight * 0.5F;
      context.getMatrices().pushMatrix();
      context.getMatrices().translate(centerX, centerY);
      context.getMatrices().scale(scale, scale);
      context.getMatrices().translate(-centerX, -centerY);
      ظد.push();
      return true;
   }

   @Unique
   private List<Text> rain$slotTooltip(InventorySlotVisual current, ItemStack visual) {
      List<Text> lines = new ArrayList<>();
      if (!current.isEmpty()) {
         lines.addAll(Screen.getTooltipFromItem(MinecraftClient.getInstance(), current));
      }

      if (!lines.isEmpty()) {
         lines.add(Text.empty());
      }

      switch (visual.getState()) {
         case CORRECT:
            lines.add(Text.literal("На своём месте").formatted(Formatting.GREEN));
            break;
         case MISSING:
            lines.add(Text.literal("Должно быть: ").formatted(Formatting.YELLOW).append(visual.getExpected().getName()));
            lines.add(
               Text.literal(visual.getAvailable() ? "Предмет находится в другом слоте" : "Предмета нет в инвентаре")
                  .formatted(visual.getAvailable() ? Formatting.GOLD : Formatting.RED)
            );
            break;
         case MISPLACED:
            lines.add(Text.literal("Не на своём месте").formatted(Formatting.GOLD));
            Integer destination = visual.getDestination();
            lines.add(
               Text.literal(destination == null ? "Для предмета нет места в шаблоне" : "Правильное место: " + ظظ.INSTANCE.slotName(destination))
                  .formatted(Formatting.GRAY)
            );
            break;
         case CONFLICT:
            lines.add(Text.literal("Должно быть: ").formatted(Formatting.RED).append(visual.getExpected().getName()));
      }

      return lines;
   }

   @Unique
   private void rain$drawSlotBorder(DrawContext context, int color, int y, int x) {
      context.fill(x - 1, y - 1, x + 17, y, color);
      context.fill(x - 1, y + 16, x + 17, y + 17, color);
      context.fill(x - 1, y, x, y + 16, color);
      context.fill(x + 16, y, x + 17, y + 16, color);
   }

   @Inject(method = "method_71085", at = @At("HEAD"))
   private void rain$positionInventoryChestButton(DrawContext context, int mouseY, int ci, float mouseX, CallbackInfo delta) {
      this.rain$updateInventoryButtons();
      this.rain$processItemScroller(mouseX, mouseY);
      if (this instanceof InventoryScreen) {
         ظظ.INSTANCE.beginInventoryFrame(this.getScreenHandler());
         this.rain$renderMissingPanel(context, mouseX, mouseY);
      }
   }

   @Unique
   private boolean rain$showMissingPanel() {
      MinecraftClient client = MinecraftClient.getInstance();
      ServerInfo server = client.getCurrentServerEntry();
      return this instanceof InventoryScreen
         && ظظ.INSTANCE.hasLoadedInventory()
         && صص.INSTANCE.getCustomScreen() == null
         && server != null
         && server.address != null
         && server.address.toLowerCase(Locale.ROOT).contains("funtime")
         && !ظظ.INSTANCE.missingItems().isEmpty();
   }

   @Unique
   private MissingInventoryItem rain$missingItemAt(double mouseY, double mouseX) {
      if (this.rain$showMissingPanel() && this.rain$isInsideMissingPanel(mouseX, mouseY)) {
         int relativeY = (int)mouseY - this.y - 22;
         if (relativeY < 0) {
            return null;
         }

         int row = relativeY / 20;
         if (row >= this.rain$missingVisibleRows()) {
            return null;
         }

         int slotX = this.rain$missingPanelX() + 7;
         int rowY = this.y + 22 + row * 20;
         if (!this.rain$isOverMissingItem(mouseX, mouseY, slotX, rowY)) {
            return null;
         }

         List<MissingInventoryItem> items = ظظ.INSTANCE.missingItems();
         int index = this.rain$missingScroll + row;
         return index < items.size() ? items.get(index) : null;
      } else {
         return null;
      }
   }

   @Unique
   private boolean rain$isInventoryManagerOpen() {
      return this instanceof InventoryScreen && صص.INSTANCE.getCustomScreen() == شج.INSTANCE;
   }
}
