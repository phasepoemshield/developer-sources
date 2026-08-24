/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.Element
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider
 *  net.minecraft.client.gui.widget.ButtonWidget
 *  net.minecraft.client.input.KeyInput
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.Window
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.text.Text
 *  net.minecraft.util.Formatting
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.collection.DefaultedList
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
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
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.Window;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0627\u0629;
import oxxxde.\u0627\u062a;
import oxxxde.\u0628\u0645;
import oxxxde.\u062b\u062b;
import oxxxde.\u062b\u0631;
import oxxxde.\u062b\u0639;
import oxxxde.\u062f\u064f;
import oxxxde.\u0630\u062c;
import oxxxde.\u0630\u0647;
import oxxxde.\u0634\u062c;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0627;
import oxxxde.\u0636\u0644;
import oxxxde.\u0636\u064e;
import oxxxde.\u0638\u062f;
import oxxxde.\u0638\u0638;

@Mixin(value={HandledScreen.class})
public abstract class MixinHandledScreen<T extends ScreenHandler>
extends Screen
implements ScreenHandlerProvider<T>,
\u0630\u0647,
\u0627\u0629 {
    @Unique
    private long lastQuickMoveAt;
    @Shadow
    protected int y;
    @Unique
    private \u0636\u0644 rain$funTimeOnlineHelperButton;
    @Unique
    private static final int SORT_BUTTON_HEIGHT = 20;
    @Unique
    private \u062b\u0639 rain$chestSorterButton;
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
    private static final Identifier MISSING_SLOT;
    @Unique
    private long rain$inventoryAnimationStart;
    @Unique
    private static final float INVENTORY_ANIMATION_START_SCALE = 0.9f;
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
    private static final Identifier MISSING_PANEL_BACKGROUND;
    @Shadow
    protected int x;
    @Shadow
    protected int backgroundHeight;
    @Unique
    private static final int SORT_BUTTON_WIDTH = 92;
    @Unique
    private \u062f\u064f rain$inventoryChestButton;
    @Unique
    private static final int MISSING_ROW_HEIGHT = 20;
    @Unique
    private static final Identifier MISSING_SLOT_HIGHLIGHT;

    @Unique
    private boolean rain$isInsideMissingPanel(double mouseX, double mouseY) {
        int panelX = this.rain$missingPanelX();
        return mouseX >= (double)panelX && mouseX < (double)(panelX + 86) && mouseY >= (double)this.y && mouseY < (double)(this.y + this.backgroundHeight);
    }

    @Inject(method={"method_25420"}, at={@At(value="RETURN")})
    private void rain$finishInventoryBackgroundAnimation(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!this.rain$backgroundAnimationPose) {
            return;
        }
        this.rain$popInventoryAnimation(context);
        this.rain$backgroundAnimationPose = false;
    }

    @Unique
    private void rain$searchAuction(MissingInventoryItem item) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.getNetworkHandler() == null) {
            return;
        }
        String name = \u0636\u064e.sanitizeName(item.getStack().getName());
        if (name.isEmpty()) {
            return;
        }
        \u0638\u0638.INSTANCE.expectInventoryReturnFromAuction();
        client.getNetworkHandler().sendChatCommand("ah search " + name);
    }

    @Inject(method={"method_2380"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$renderInventoryLayoutTooltip(DrawContext context, int mouseX, int mouseY, CallbackInfo ci) {
        if (this.focusedSlot != null && \u0636\u0627.INSTANCE.scheduleTooltip(context, this.focusedSlot.getStack(), mouseX, mouseY)) {
            ci.cancel();
            return;
        }
        if (!(this instanceof InventoryScreen)) {
            return;
        }
        if (this.focusedSlot == null) {
            return;
        }
        int menuSlot = this.getScreenHandler().slots.indexOf((Object)this.focusedSlot);
        InventorySlotVisual visual = \u0638\u0638.INSTANCE.visualAt(menuSlot);
        if (visual == null) {
            return;
        }
        ItemStack current = this.focusedSlot.getStack();
        ItemStack tooltipStack = current.isEmpty() ? visual.getExpected() : current;
        context.drawTooltip(MinecraftClient.getInstance().textRenderer, this.rain$slotTooltip(visual, current), tooltipStack.getTooltipData(), mouseX, mouseY, (Identifier)tooltipStack.get(DataComponentTypes.TOOLTIP_STYLE));
        ci.cancel();
    }

    @Unique
    private boolean rain$isShiftDown(MinecraftClient client) {
        return InputUtil.isKeyPressed((Window)client.getWindow(), (int)340) || InputUtil.isKeyPressed((Window)client.getWindow(), (int)344);
    }

    @Override
    public float rain$getInventoryAnimationProgress() {
        if (this.rain$inventoryAnimationFinished) {
            return 1.0f;
        }
        if (!this.rain$shouldAnimateInventory()) {
            this.rain$inventoryAnimationFinished = true;
            return 1.0f;
        }
        long elapsed = Math.max(0L, System.nanoTime() - this.rain$inventoryAnimationStart);
        if (elapsed >= 240000000L) {
            this.rain$inventoryAnimationFinished = true;
            return 1.0f;
        }
        float linear = (float)elapsed / 2.4E8f;
        float inverse = 1.0f - linear;
        return 1.0f - inverse * inverse * inverse * inverse;
    }

    @Inject(method={"method_2385"}, at={@At(value="HEAD")})
    private void rain$renderItemHighliterBackground(DrawContext context, Slot slot, int mouseX, int mouseY, CallbackInfo ci) {
        \u062b\u0631.INSTANCE.renderHighlight(context, slot.getStack(), slot.x, slot.y);
        if (!(this instanceof InventoryScreen)) {
            return;
        }
        int menuSlot = this.getScreenHandler().slots.indexOf((Object)slot);
        if (menuSlot < 0) {
            return;
        }
        InventorySlotVisual visual = \u0638\u0638.INSTANCE.visualAt(menuSlot);
        if (visual == null || visual.getState() != InventorySlotState.MISSING) {
            return;
        }
        context.drawItem(visual.getExpected(), slot.x, slot.y);
        \u0638\u0638.INSTANCE.markGhost(this.x + slot.x, this.y + slot.y);
    }

    @Inject(method={"method_25404"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$blockInventoryKey(KeyInput event, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private void rain$processItemScroller(int mouseX, int mouseY) {
        if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
            return;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null || client.world == null) {
            return;
        }
        if (!\u0627\u062a.INSTANCE.isEnabled()) {
            return;
        }
        if (!this.rain$isShiftDown(client) || !this.rain$isHoldingLeftMouse(client)) {
            return;
        }
        if (!this.rain$isDelayComplete()) {
            return;
        }
        DefaultedList menuSlots = this.getScreenHandler().slots;
        for (int menuSlotId = 0; menuSlotId < menuSlots.size(); ++menuSlotId) {
            Slot slot = (Slot)menuSlots.get(menuSlotId);
            if (slot == null || !slot.isEnabled() || slot.getStack().isEmpty() || !this.isPointOverSlot(slot, mouseX, mouseY)) continue;
            this.onMouseClick(slot, menuSlotId, 0, SlotActionType.QUICK_MOVE);
            this.lastQuickMoveAt = System.currentTimeMillis();
            break;
        }
    }

    @Inject(method={"method_71085"}, at={@At(value="RETURN")})
    private void rain$tintSortingButton(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.rain$sortButton == null || !this.rain$sortButton.visible || !\u0638\u0638.INSTANCE.isSorting()) {
            return;
        }
        context.fill(this.rain$sortButton.getX() + 2, this.rain$sortButton.getY() + 2, this.rain$sortButton.getRight() - 2, this.rain$sortButton.getBottom() - 2, 953236283);
    }

    @Unique
    private void rain$renderMissingScrollbar(DrawContext context, int panelX, int itemCount, int visibleRows, int maxScroll) {
        int trackTop = this.y + 22;
        int trackHeight = visibleRows * 20 - 2;
        int thumbHeight = Math.max(12, trackHeight * visibleRows / itemCount);
        int thumbY = trackTop + (trackHeight - thumbHeight) * this.rain$missingScroll / maxScroll;
        int trackX = panelX + 86 - 4;
        context.fill(trackX, trackTop, trackX + 2, trackTop + trackHeight, -15000805);
        context.fill(trackX, thumbY, trackX + 2, thumbY + thumbHeight, -5592406);
    }

    @Inject(method={"method_25406"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$blockInventoryRelease(Click event, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Override
    public boolean rain$isSortButtonHovered(double mouseX, double mouseY) {
        boolean inventorySortHovered = this.rain$sortButton != null && this.rain$sortButton.visible && this.rain$sortButton.isMouseOver(mouseX, mouseY);
        boolean chestSortHovered = this.rain$chestSorterButton != null && this.rain$chestSorterButton.visible && this.rain$chestSorterButton.isMouseOver(mouseX, mouseY);
        boolean onlineHelperHovered = this.rain$funTimeOnlineHelperButton != null && this.rain$funTimeOnlineHelperButton.visible && this.rain$funTimeOnlineHelperButton.isMouseOver(mouseX, mouseY);
        return inventorySortHovered || chestSortHovered || onlineHelperHovered;
    }

    @Unique
    private void rain$updateInventoryButtons() {
        boolean sorting = \u0638\u0638.INSTANCE.isSorting();
        if (this.rain$chestSorterButton != null) {
            this.rain$chestSorterButton.attachToContainer(this.x, this.y, this.backgroundWidth);
            this.rain$chestSorterButton.visible = true;
        }
        if (this.rain$funTimeOnlineHelperButton != null) {
            this.rain$funTimeOnlineHelperButton.attachToContainer(this.x, this.y, this.backgroundWidth);
            this.rain$funTimeOnlineHelperButton.visible = \u0628\u0645.INSTANCE.shouldShowButton(this.title);
        }
        if (this.rain$inventoryChestButton != null) {
            this.rain$inventoryChestButton.attachToInventory(this.x, this.y, this.backgroundWidth);
            boolean bl = this.rain$inventoryChestButton.visible = !sorting;
        }
        if (this.rain$sortButton != null) {
            if (this.getFocused() == this.rain$sortButton) {
                this.setFocused(null);
            }
            this.rain$sortButton.setFocused(false);
            this.rain$sortButton.setX(this.x + (this.backgroundWidth - 92) / 2);
            this.rain$sortButton.setY(this.y - 20 - 2);
            this.rain$sortButton.visible = \u0638\u0638.INSTANCE.hasLoadedInventory() && \u0635\u0635.INSTANCE.getCustomScreen() == null;
            this.rain$sortButton.setMessage((Text)(sorting ? Text.literal((String)"\u0421\u043e\u0440\u0442\u0438\u0440\u0443\u044e..(\u0421\u0442\u043e\u043f)").formatted(Formatting.RED) : Text.literal((String)"\u0421\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c")));
        }
    }

    @Inject(method={"method_25419"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$keepInventoryOpenWhileSorting(CallbackInfo ci) {
        if (this.rain$isAutomationSorting()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_25426"}, at={@At(value="RETURN")})
    private void rain$addInventoryChestButton(CallbackInfo ci) {
        this.rain$inventoryAnimationStart = System.nanoTime();
        this.rain$inventoryAnimationFinished = false;
        if (this.getScreenHandler() instanceof GenericContainerScreenHandler) {
            if (\u0628\u0645.INSTANCE.isSelectorMenu(this.title)) {
                if (\u0628\u0645.INSTANCE.shouldShowButton(this.title)) {
                    this.rain$funTimeOnlineHelperButton = (\u0636\u0644)this.addDrawableChild((Element)new \u0636\u0644());
                }
            } else if (\u062b\u062b.INSTANCE.isChestScreen(this.title)) {
                this.rain$chestSorterButton = (\u062b\u0639)this.addDrawableChild((Element)new \u062b\u0639());
            }
        }
        if (!(this instanceof InventoryScreen)) {
            this.rain$updateInventoryButtons();
            return;
        }
        this.rain$inventoryChestButton = (\u062f\u064f)this.addDrawableChild((Element)new \u062f\u064f());
        this.rain$sortButton = (ButtonWidget)this.addDrawableChild((Element)ButtonWidget.builder((Text)Text.literal((String)"\u0421\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c"), button -> this.rain$toggleSorting()).dimensions(0, 0, 92, 20).build());
        this.rain$missingScroll = 0;
        this.rain$updateInventoryButtons();
    }

    @Inject(method={"method_25403"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$blockInventoryDrag(Click event, double dragX, double dragY, CallbackInfoReturnable<Boolean> cir) {
        if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private boolean rain$isOverMissingItem(double mouseX, double mouseY, int slotX, int rowY) {
        return mouseX >= (double)slotX && mouseX < (double)(slotX + 18) && mouseY >= (double)rowY && mouseY < (double)(rowY + 18);
    }

    @Inject(method={"method_25402"}, at={@At(value="RETURN")})
    private void rain$dropSortButtonFocus(Click event, boolean doubled, CallbackInfoReturnable<Boolean> cir) {
        if (this.getFocused() == this.rain$sortButton) {
            this.setFocused(null);
        }
    }

    @Unique
    private int rain$missingPanelX() {
        return this.x - 4 - 86;
    }

    @Inject(method={"method_2383"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$blockInventorySlotAction(Slot slot, int slotId, int button, SlotActionType actionType, CallbackInfo ci) {
        if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
            ci.cancel();
        }
    }

    @Unique
    private void rain$renderMissingPanel(DrawContext context, int mouseX, int mouseY) {
        if (!this.rain$showMissingPanel()) {
            this.rain$missingScroll = 0;
            return;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        List<MissingInventoryItem> items = \u0638\u0638.INSTANCE.missingItems();
        int panelX = this.rain$missingPanelX();
        int visibleRows = this.rain$missingVisibleRows();
        int maxScroll = Math.max(0, items.size() - visibleRows);
        this.rain$missingScroll = Math.min(this.rain$missingScroll, maxScroll);
        context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, MISSING_PANEL_BACKGROUND, panelX, this.y, 86, this.backgroundHeight);
        context.drawText(client.textRenderer, "\u041d\u0435 \u0445\u0432\u0430\u0442\u0430\u0435\u0442:", panelX + 8, this.y + 7, -1, true);
        if (items.isEmpty()) {
            context.drawText(client.textRenderer, "\u041d\u0438\u0447\u0435\u0433\u043e", panelX + 8, this.y + 22 + 5, -5592406, false);
            return;
        }
        int end = Math.min(items.size(), this.rain$missingScroll + visibleRows);
        for (int index = this.rain$missingScroll; index < end; ++index) {
            MissingInventoryItem item = items.get(index);
            int rowY = this.y + 22 + (index - this.rain$missingScroll) * 20;
            int slotX = panelX + 7;
            String count = "x" + item.getCount();
            int countX = slotX + 18 + 6;
            context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, MISSING_SLOT, slotX, rowY, 18, 18);
            context.drawItem(item.getStack(), slotX + 1, rowY + 1);
            context.drawText(client.textRenderer, count, countX, rowY + 5, -1, true);
            if (!this.rain$isOverMissingItem(mouseX, mouseY, slotX, rowY)) continue;
            context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, MISSING_SLOT_HIGHLIGHT, slotX - 3, rowY - 3, 24, 24);
        }
        if (maxScroll > 0) {
            this.rain$renderMissingScrollbar(context, panelX, items.size(), visibleRows, maxScroll);
        }
    }

    @Shadow
    protected abstract void onMouseClick(Slot var1, int var2, int var3, SlotActionType var4);

    @Unique
    private boolean rain$shouldAnimateInventory() {
        return \u0630\u062c.INSTANCE.isEnabled() && (Boolean)\u0630\u062c.INSTANCE.getAnimateInventory().getValue() != false;
    }

    @Unique
    private boolean rain$isAutomationSorting() {
        return \u0638\u0638.INSTANCE.isSorting() || \u062b\u062b.INSTANCE.isSorting() || \u0628\u0645.INSTANCE.isRunning();
    }

    @Unique
    private boolean rain$isDelayComplete() {
        return System.currentTimeMillis() - this.lastQuickMoveAt >= \u0627\u062a.INSTANCE.delayMs();
    }

    @Unique
    private int rain$missingVisibleRows() {
        return Math.max(1, (this.backgroundHeight - 22 - 2) / 20);
    }

    @Inject(method={"method_2385"}, at={@At(value="RETURN")})
    private void rain$renderInventoryLayoutState(DrawContext context, Slot slot, int mouseX, int mouseY, CallbackInfo ci) {
        if (!(this instanceof InventoryScreen)) {
            return;
        }
        int menuSlot = this.getScreenHandler().slots.indexOf((Object)slot);
        if (menuSlot < 0) {
            return;
        }
        InventorySlotVisual visual = \u0638\u0638.INSTANCE.visualAt(menuSlot);
        if (visual == null) {
            return;
        }
        if (visual.getState() == InventorySlotState.CONFLICT) {
            context.fill(slot.x + 7, slot.y + 7, slot.x + 17, slot.y + 17, -871362544);
            context.getMatrices().pushMatrix();
            context.getMatrices().translate((float)(slot.x + 8), (float)(slot.y + 8));
            context.getMatrices().scale(0.5f, 0.5f);
            context.drawItem(visual.getExpected(), 0, 0);
            context.getMatrices().popMatrix();
        }
        this.rain$drawSlotBorder(context, slot.x, slot.y, this.rain$slotColor(visual.getState()));
    }

    @Unique
    private void rain$toggleSorting() {
        ((HandledScreen)this).endTouchDrag();
        \u0638\u0638.INSTANCE.toggleSorting();
        this.setFocused(null);
        this.rain$sortButton.setFocused(false);
    }

    @Override
    public void rain$popInventoryAnimation(DrawContext context) {
        \u0638\u062f.pop();
        context.getMatrices().popMatrix();
    }

    @Inject(method={"method_25420"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_465;method_2389(Lnet/minecraft/class_332;FII)V")})
    private void rain$beginInventoryBackgroundAnimation(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        this.rain$backgroundAnimationPose = this.rain$pushInventoryAnimation(context);
    }

    @Inject(method={"method_25401"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$blockInventoryScroll(double mouseX, double mouseY, double horizontal, double vertical, CallbackInfoReturnable<Boolean> cir) {
        int maxScroll;
        if (this.rain$isInsideMissingPanel(mouseX, mouseY) && this.rain$showMissingPanel() && (maxScroll = Math.max(0, \u0638\u0638.INSTANCE.missingItems().size() - this.rain$missingVisibleRows())) > 0 && vertical != 0.0) {
            this.rain$missingScroll = Math.max(0, Math.min(maxScroll, this.rain$missingScroll + (vertical > 0.0 ? -1 : 1)));
            cir.setReturnValue((Object)true);
            return;
        }
        if (this.rain$isInventoryManagerOpen() || this.rain$isAutomationSorting()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private int rain$slotColor(InventorySlotState state) {
        return switch (state) {
            default -> throw new MatchException(null, null);
            case InventorySlotState.CORRECT -> -1942374310;
            case InventorySlotState.MISSING -> -639121845;
            case InventorySlotState.MISPLACED -> -639591874;
            case InventorySlotState.CONFLICT -> -522630325;
        };
    }

    @Inject(method={"method_25402"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$blockInventoryClick(Click event, boolean doubled, CallbackInfoReturnable<Boolean> cir) {
        MissingInventoryItem missing;
        if (this.rain$isInventoryManagerOpen()) {
            cir.setReturnValue((Object)true);
            return;
        }
        if (this.rain$isAutomationSorting() && !this.rain$isSortButtonHovered(event.x(), event.y())) {
            cir.setReturnValue((Object)true);
            return;
        }
        if (event.button() == 0 && (missing = this.rain$missingItemAt(event.x(), event.y())) != null) {
            this.rain$searchAuction(missing);
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private boolean rain$isHoldingLeftMouse(MinecraftClient client) {
        return GLFW.glfwGetMouseButton((long)client.getWindow().getHandle(), (int)0) == 1;
    }

    protected MixinHandledScreen(Text title) {
        super(title);
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$handleInventoryManagerOverlay(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        this.rain$updateInventoryButtons();
        if (this.rain$isInventoryManagerOpen()) {
            ci.cancel();
        }
    }

    @Shadow
    private boolean isPointOverSlot(Slot slot, double pointX, double pointY) {
        return false;
    }

    @Override
    public boolean rain$pushInventoryAnimation(DrawContext context) {
        float progress = this.rain$getInventoryAnimationProgress();
        if (progress >= 1.0f) {
            return false;
        }
        float scale = 0.9f + 0.100000024f * progress;
        float centerX = (float)this.x + (float)this.backgroundWidth * 0.5f;
        float centerY = (float)this.y + (float)this.backgroundHeight * 0.5f;
        context.getMatrices().pushMatrix();
        context.getMatrices().translate(centerX, centerY);
        context.getMatrices().scale(scale, scale);
        context.getMatrices().translate(-centerX, -centerY);
        \u0638\u062f.push();
        return true;
    }

    @Unique
    private List<Text> rain$slotTooltip(InventorySlotVisual visual, ItemStack current) {
        ArrayList<Text> lines = new ArrayList<Text>();
        if (!current.isEmpty()) {
            lines.addAll(Screen.getTooltipFromItem((MinecraftClient)MinecraftClient.getInstance(), (ItemStack)current));
        }
        if (!lines.isEmpty()) {
            lines.add((Text)Text.empty());
        }
        switch (visual.getState()) {
            case CORRECT: {
                lines.add((Text)Text.literal((String)"\u041d\u0430 \u0441\u0432\u043e\u0451\u043c \u043c\u0435\u0441\u0442\u0435").formatted(Formatting.GREEN));
                break;
            }
            case MISSING: {
                lines.add((Text)Text.literal((String)"\u0414\u043e\u043b\u0436\u043d\u043e \u0431\u044b\u0442\u044c: ").formatted(Formatting.YELLOW).append(visual.getExpected().getName()));
                lines.add((Text)Text.literal((String)(visual.getAvailable() ? "\u041f\u0440\u0435\u0434\u043c\u0435\u0442 \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u0434\u0440\u0443\u0433\u043e\u043c \u0441\u043b\u043e\u0442\u0435" : "\u041f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u043d\u0435\u0442 \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435")).formatted(visual.getAvailable() ? Formatting.GOLD : Formatting.RED));
                break;
            }
            case MISPLACED: {
                lines.add((Text)Text.literal((String)"\u041d\u0435 \u043d\u0430 \u0441\u0432\u043e\u0451\u043c \u043c\u0435\u0441\u0442\u0435").formatted(Formatting.GOLD));
                Integer destination = visual.getDestination();
                lines.add((Text)Text.literal((String)(destination == null ? "\u0414\u043b\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u043d\u0435\u0442 \u043c\u0435\u0441\u0442\u0430 \u0432 \u0448\u0430\u0431\u043b\u043e\u043d\u0435" : "\u041f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u043e\u0435 \u043c\u0435\u0441\u0442\u043e: " + \u0638\u0638.INSTANCE.slotName(destination))).formatted(Formatting.GRAY));
                break;
            }
            case CONFLICT: {
                lines.add((Text)Text.literal((String)"\u0414\u043e\u043b\u0436\u043d\u043e \u0431\u044b\u0442\u044c: ").formatted(Formatting.RED).append(visual.getExpected().getName()));
            }
        }
        return lines;
    }

    static {
        MISSING_PANEL_BACKGROUND = Identifier.ofVanilla((String)"popup/background");
        MISSING_SLOT = Identifier.ofVanilla((String)"container/slot");
        MISSING_SLOT_HIGHLIGHT = Identifier.ofVanilla((String)"container/slot_highlight_front");
    }

    @Unique
    private void rain$drawSlotBorder(DrawContext context, int x, int y, int color) {
        context.fill(x - 1, y - 1, x + 17, y, color);
        context.fill(x - 1, y + 16, x + 17, y + 17, color);
        context.fill(x - 1, y, x, y + 16, color);
        context.fill(x + 16, y, x + 17, y + 16, color);
    }

    @Inject(method={"method_71085"}, at={@At(value="HEAD")})
    private void rain$positionInventoryChestButton(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        this.rain$updateInventoryButtons();
        this.rain$processItemScroller(mouseX, mouseY);
        if (this instanceof InventoryScreen) {
            \u0638\u0638.INSTANCE.beginInventoryFrame(this.getScreenHandler());
            this.rain$renderMissingPanel(context, mouseX, mouseY);
        }
    }

    @Unique
    private boolean rain$showMissingPanel() {
        MinecraftClient client = MinecraftClient.getInstance();
        ServerInfo server = client.getCurrentServerEntry();
        return this instanceof InventoryScreen && \u0638\u0638.INSTANCE.hasLoadedInventory() && \u0635\u0635.INSTANCE.getCustomScreen() == null && server != null && server.address != null && server.address.toLowerCase(Locale.ROOT).contains("funtime") && !\u0638\u0638.INSTANCE.missingItems().isEmpty();
    }

    @Unique
    private MissingInventoryItem rain$missingItemAt(double mouseX, double mouseY) {
        int rowY;
        if (!this.rain$showMissingPanel() || !this.rain$isInsideMissingPanel(mouseX, mouseY)) {
            return null;
        }
        int relativeY = (int)mouseY - this.y - 22;
        if (relativeY < 0) {
            return null;
        }
        int row = relativeY / 20;
        if (row >= this.rain$missingVisibleRows()) {
            return null;
        }
        int slotX = this.rain$missingPanelX() + 7;
        if (!this.rain$isOverMissingItem(mouseX, mouseY, slotX, rowY = this.y + 22 + row * 20)) {
            return null;
        }
        int index = this.rain$missingScroll + row;
        List<MissingInventoryItem> items = \u0638\u0638.INSTANCE.missingItems();
        return index < items.size() ? items.get(index) : null;
    }

    @Unique
    private boolean rain$isInventoryManagerOpen() {
        return this instanceof InventoryScreen && \u0635\u0635.INSTANCE.getCustomScreen() == \u0634\u062c.INSTANCE;
    }
}

