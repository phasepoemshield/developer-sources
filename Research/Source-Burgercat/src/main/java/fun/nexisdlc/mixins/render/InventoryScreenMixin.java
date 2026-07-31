package fun.nexisdlc.mixins.render;

import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.modules.impl.render.Beautifully;
import fun.nexisdlc.modules.impl.utils.ClientHide;
import fun.nexisdlc.modules.impl.utils.Tweaks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(InventoryScreen.class)
public abstract class InventoryScreenMixin extends HandledScreen<PlayerScreenHandler> {
    @Unique
    private static final int DROP_BUTTON_WIDTH = 98;
    @Unique
    private static final int DROP_BUTTON_HEIGHT = 20;
    @Unique
    private int nexis$dropButtonX;
    @Unique
    private int nexis$dropButtonY;
    @Unique
    private static long nexis$handCursor;
    @Unique
    private static long nexis$arrowCursor;
    @Unique
    private boolean nexis$wasHovered;

    public InventoryScreenMixin(PlayerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Inject(method = "render", at = @At("RETURN"))
    private void nexis$highlightPotionSlots(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!Beautifully.shouldHighlightInventoryPotions()) {
            return;
        }

        for (Slot slot : this.handler.slots) {
            if (slot == null || !slot.hasStack()) {
                continue;
            }

            ItemStack stack = slot.getStack();
            int color = Beautifully.getPotionHighlightColor(stack);
            if (color == 0) {
                continue;
            }

            int slotX = this.x + slot.x;
            int slotY = this.y + slot.y;
            context.fill(slotX, slotY, slotX + 16, slotY + 16, color);
        }
    }

    @Inject(method = "render", at = @At("RETURN"))
    private void nexis$renderDropAllButton(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!nexis$isButtonVisible()) {
            if (nexis$wasHovered) {
                nexis$wasHovered = false;
                nexis$setCursor(GLFW.GLFW_ARROW_CURSOR);
            }
            return;
        }

        int centerX = this.x + 88;
        int buttonY = this.y + 84 - 120;
        int buttonX = centerX - DROP_BUTTON_WIDTH / 2;

        this.nexis$dropButtonX = buttonX;
        this.nexis$dropButtonY = buttonY;

        boolean hasItems = nexis$hasInventoryItems();
        boolean hovered = mouseX >= buttonX && mouseX <= buttonX + DROP_BUTTON_WIDTH
                && mouseY >= buttonY && mouseY <= buttonY + DROP_BUTTON_HEIGHT;

        if (hovered != nexis$wasHovered) {
            nexis$wasHovered = hovered;
            nexis$setCursor(hovered && hasItems ? GLFW.GLFW_HAND_CURSOR : GLFW.GLFW_ARROW_CURSOR);
        }

        Identifier texture;
        int textColor;
        if (!hasItems) {
            texture = Identifier.ofVanilla("widget/button_disabled");
            textColor = 0xAA888888;
        } else if (hovered) {
            texture = Identifier.ofVanilla("widget/button_highlighted");
            textColor = 0xFFFFFFFF;
        } else {
            texture = Identifier.ofVanilla("widget/button");
            textColor = 0xFFFFFFFF;
        }

        context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, texture, buttonX, buttonY, DROP_BUTTON_WIDTH, DROP_BUTTON_HEIGHT);

        String text = "Выкинуть всё";
        context.drawText(this.textRenderer, Text.literal(text),
                buttonX + DROP_BUTTON_WIDTH / 2 - this.textRenderer.getWidth(text) / 2,
                buttonY + DROP_BUTTON_HEIGHT / 2 - this.textRenderer.fontHeight / 2,
                textColor, true);
    }


    @Inject(method = "mouseReleased", at = @At("HEAD"), cancellable = true)
    private void nexis$onMouseReleased(Click click, CallbackInfoReturnable<Boolean> cir) {
        if (!nexis$isButtonVisible() || click.button() != 0) return;

        int bx = this.nexis$dropButtonX;
        int by = this.nexis$dropButtonY;
        double mx = click.x();
        double my = click.y();
        if (mx < bx || mx > bx + DROP_BUTTON_WIDTH
                || my < by || my > by + DROP_BUTTON_HEIGHT) return;

        if (nexis$hasInventoryItems()) {
            nexis$dropAllItems();
        }
        cir.setReturnValue(true);
    }

    @Unique
    private boolean nexis$hasInventoryItems() {
        for (int i = 9; i < 46; i++) {
            Slot slot = this.handler.getSlot(i);
            if (slot.hasStack()) return true;
        }
        return false;
    }

    @Unique
    private void nexis$dropAllItems() {
        if (Tweaks.dropAllMode.is("Легитный")) {
            nexis$dropAllItemsLegit();
        } else {
            nexis$dropAllItemsNormal();
        }
    }

    @Unique
    private void nexis$dropAllItemsNormal() {
        PlayerUtils.addTask(() -> {
            for (int i = 9; i < 46; i++) {
                Slot slot = nexis$getHandlerSlot(i);
                if (slot != null && slot.hasStack()) {
                    PlayerInventoryUtil.clickSlot(slot.id, 1, SlotActionType.THROW);
                }
            }
        });
    }

    @Unique
    private void nexis$dropAllItemsLegit() {
        boolean moving = PlayerUtils.hasPlayerMovement();

        PlayerUtils.script.cleanup();

        if (moving) {
            PlayerUtils.script.addTickStep(0, PlayerUtils::disableMoveKeys);
        }

        List<Integer> slotIds = new ArrayList<>();
        for (int i = 9; i < 46; i++) {
            Slot slot = this.handler.getSlot(i);
            if (slot.hasStack()) {
                slotIds.add(slot.id);
            }
        }

        if (slotIds.isEmpty()) return;

        int startTick = moving ? 2 : 1;
        for (int idx = 0; idx < slotIds.size(); idx++) {
            int sid = slotIds.get(idx);
            PlayerUtils.script.addTickStep(startTick + idx, () ->
                    PlayerInventoryUtil.clickSlot(sid, 1, SlotActionType.THROW));
        }

        if (moving) {
            PlayerUtils.script.addTickStep(startTick + slotIds.size(), PlayerUtils::enableMoveKeys);
        }
    }

    @Unique
    private boolean nexis$isButtonVisible() {
        return !ClientHide.unhooked;
    }

    @Unique
    private static void nexis$setCursor(int glfwCursor) {
        long window = MinecraftClient.getInstance().getWindow().getHandle();
        if (glfwCursor == GLFW.GLFW_ARROW_CURSOR) {
            if (nexis$arrowCursor == 0) {
                nexis$arrowCursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_ARROW_CURSOR);
            }
            GLFW.glfwSetCursor(window, nexis$arrowCursor);
        } else {
            if (nexis$handCursor == 0) {
                nexis$handCursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_HAND_CURSOR);
            }
            GLFW.glfwSetCursor(window, nexis$handCursor);
        }
    }

    @Unique
    private static void nexis$destroyCursors() {
        if (nexis$handCursor != 0) {
            GLFW.glfwDestroyCursor(nexis$handCursor);
            nexis$handCursor = 0;
        }
        if (nexis$arrowCursor != 0) {
            GLFW.glfwDestroyCursor(nexis$arrowCursor);
            nexis$arrowCursor = 0;
        }
    }

    @Unique
    private Slot nexis$getHandlerSlot(int index) {
        if (index < 0 || index >= this.handler.slots.size()) return null;
        return this.handler.slots.get(index);
    }
}
