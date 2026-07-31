package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.ChatButtonsOverlay;
import fun.nexisdlc.ui.hud.ChatOverlayState;
import fun.nexisdlc.ui.hud.CustomChatHud;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.HudSettingsOverlay;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.concurrent.atomic.AtomicBoolean;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(ChatScreen.class)
public class ChatScreenMixin implements CustomChatHud.TextFieldWidgetProvider {
    @Shadow private TextFieldWidget chatField;

    @Unique private static String openDraggingName = null;

    @Inject(method = "render", at = @At("HEAD"))
    public void renderHead(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (ClientContainer.isHide()) return;

        CursorHelper.setArrow();

        AtomicBoolean anyHovered = new AtomicBoolean(false);
        Dragging hovered = null;

        var mouseXNormal = mc.mouse.getX();
        var mouseYNormal = mc.mouse.getY();
        float maxW = MinecraftClient.getInstance().getWindow().getWidth();
        float maxH = MinecraftClient.getInstance().getWindow().getHeight();

        for (Dragging dragging : DraggingManager.draggables.values()) {
            if (dragging.getModule().isState()) {
                if (MathUtil.isHovered(mouseXNormal, mouseYNormal, dragging.getX(), dragging.getY(), dragging.getWidth(), dragging.getHeight())) {
                    anyHovered.set(true);
                    hovered = dragging;
                    CursorHelper.setHand();
                }
                dragging.onFix(mouseXNormal, mouseYNormal, maxW, maxH);
            }
        }
        ChatOverlayState.hoveredElementName = hovered != null ? hovered.getName() : null;
    }

    @Inject(method = "render", at = @At("TAIL"))
    public void renderTail(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (chatField == null || ClientContainer.isHide()) {
            return;
        }
        float scale = (float) mc.getWindow().getScaleFactor();
        boolean anyDragging = false;
        for (var dragging : DraggingManager.draggables.values()) {
            if (dragging.isDragging()) {
                anyDragging = true;
                break;
            }
        }
        ChatOverlayState.draggingAny = anyDragging;
        String hideLabel = ChatButtonsOverlay.HIDE_LABEL;
        String resetLabel = ChatButtonsOverlay.RESET_LABEL;
        int btnH = Math.round(16f * scale);
        int btnY = Math.round((chatField.getY() - 16 - 8) * scale);
        int rightEdge = Math.round((chatField.getX() + chatField.getWidth()) * scale);
        int gap = Math.round(6f * scale);

        ChatOverlayState.resetBtnW = Math.round((mc.textRenderer.getWidth(resetLabel) + 14) * scale);
        ChatOverlayState.resetBtnH = btnH;
        ChatOverlayState.resetBtnX = rightEdge - ChatOverlayState.resetBtnW;
        ChatOverlayState.resetBtnY = btnY;

        ChatOverlayState.hideBtnW = Math.round((mc.textRenderer.getWidth(hideLabel) + 14) * scale);
        ChatOverlayState.hideBtnH = btnH;
        ChatOverlayState.hideBtnX = rightEdge - ChatOverlayState.resetBtnW - gap - ChatOverlayState.hideBtnW;
        ChatOverlayState.hideBtnY = btnY;


        if (ChatOverlayState.hideChatInfo) {
            String text = chatField.getText();
            if (text == null || text.isEmpty()) {
                ChatOverlayState.barVisible = false;
                return;
            }
            int innerPadding = 4;
            int leftExtend = 6;
            int rightExtend = 3;
            int maxWidth = Math.max(0, chatField.getWidth() - innerPadding * 2 + leftExtend);
            int textWidth = mc.textRenderer.getWidth(text);
            int barWidth = Math.min(maxWidth, textWidth + rightExtend + leftExtend);
            int barXLocal = chatField.getX() + innerPadding - leftExtend;
            int barH = chatField.getHeight();
            int barYLocal = chatField.getY() - 2;
            int barWScaled = Math.round(barWidth * scale);
            int barHScaled = Math.round(barH * scale);
            ChatOverlayState.barVisible = barWScaled > 0 && barHScaled > 0;
            ChatOverlayState.barX = Math.round(barXLocal * scale);
            ChatOverlayState.barY = Math.round(barYLocal * scale);
            ChatOverlayState.barW = barWScaled;
            ChatOverlayState.barH = barHScaled;
        } else {
            ChatOverlayState.barVisible = false;
        }
    }

    @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true)
    private void mouseClicked(Click click, boolean doubleClick, CallbackInfoReturnable<Boolean> cir) {
        int button = click.button();
        if (button != 0 && button != 1) {
            return;
        }
        double rawMouseX = mc.mouse.getX();
        double rawMouseY = mc.mouse.getY();

        if (HudSettingsOverlay.handleMouseClick(rawMouseX, rawMouseY, button)) {
            cir.setReturnValue(true);
            cir.cancel();
            return;
        }

        if (button == 1) {
            for (var dragging : DraggingManager.draggables.values()) {
                if (!dragging.getModule().isState()) {
                    continue;
                }
                if (MathUtil.isHovered(rawMouseX, rawMouseY, dragging.getX(), dragging.getY(), dragging.getWidth(), dragging.getHeight())) {
                    HudSettingsOverlay.open(dragging.getName(), rawMouseX, rawMouseY);
                    cir.setReturnValue(true);
                    cir.cancel();
                    return;
                }
            }
            HudSettingsOverlay.close();
            return;
        }

        if (rawMouseX >= ChatOverlayState.hideBtnX && rawMouseX <= ChatOverlayState.hideBtnX + ChatOverlayState.hideBtnW
                && rawMouseY >= ChatOverlayState.hideBtnY && rawMouseY <= ChatOverlayState.hideBtnY + ChatOverlayState.hideBtnH) {
            ChatOverlayState.hideChatInfo = !ChatOverlayState.hideChatInfo;
            cir.setReturnValue(true);
            cir.cancel();
            return;
        }
        if (rawMouseX >= ChatOverlayState.resetBtnX && rawMouseX <= ChatOverlayState.resetBtnX + ChatOverlayState.resetBtnW
                && rawMouseY >= ChatOverlayState.resetBtnY && rawMouseY <= ChatOverlayState.resetBtnY + ChatOverlayState.resetBtnH) {
            DraggingManager.draggables.values().forEach(dragging -> dragging.resetPosition());
            DraggingManager.save();
            cir.setReturnValue(true);
            cir.cancel();
            return;
        }
    }

    @Redirect(
            method = "render",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V"
            )
    )
    private void nexis$skipVanillaChatInputBackground(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        if (!CustomChatHud.shouldUseCustomChat() || y2 - y1 > 20) {
            context.fill(x1, y1, x2, y2, color);
        }
    }

    @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    private void nexis$keyPressed(KeyInput input, CallbackInfoReturnable<Boolean> cir) {
        // Nudge with arrow keys (Shift = gridSize, Ctrl+Z = Undo)
        int keyCode = input.key();
        var window = mc.getWindow();
        boolean ctrlDown = InputUtil.isKeyPressed(window, GLFW.GLFW_KEY_LEFT_CONTROL)
                || InputUtil.isKeyPressed(window, GLFW.GLFW_KEY_RIGHT_CONTROL);
        boolean shiftDown = InputUtil.isKeyPressed(window, GLFW.GLFW_KEY_LEFT_SHIFT)
                || InputUtil.isKeyPressed(window, GLFW.GLFW_KEY_RIGHT_SHIFT);

        // Ctrl+Z Undo
        if (ctrlDown && keyCode == GLFW.GLFW_KEY_Z) {
            if (DraggingManager.undo()) {
                cir.setReturnValue(true);
                cir.cancel();
            }
            return;
        }

        // Arrow nudge — only when a HUD element is hovered
        Dragging hovered = DraggingManager.getHoveredDragging(mc.mouse.getX(), mc.mouse.getY());
        if (hovered == null) return;

        float step = shiftDown ? Interface.getHudEditorGridSize() : 1f;
        if (step <= 0f) step = 1f;
        float deltaX = 0f, deltaY = 0f;

        switch (keyCode) {
            case GLFW.GLFW_KEY_LEFT -> deltaX = -step;
            case GLFW.GLFW_KEY_RIGHT -> deltaX = step;
            case GLFW.GLFW_KEY_UP -> deltaY = -step;
            case GLFW.GLFW_KEY_DOWN -> deltaY = step;
            default -> { return; }
        }

        if (deltaX != 0f || deltaY != 0f) {
            DraggingManager.pushUndoSnapshot(hovered.getName(), hovered.getX(), hovered.getY());
            float newX = hovered.getX() + deltaX;
            float newY = hovered.getY() + deltaY;
            float maxW = mc.getWindow().getWidth();
            float maxH = mc.getWindow().getHeight();
            newX = Math.max(0f, Math.min(maxW - hovered.getWidth(), newX));
            newY = Math.max(0f, Math.min(maxH - hovered.getHeight(), newY));
            hovered.setX(newX);
            hovered.setY(newY);
            DraggingManager.saveNow();
            cir.setReturnValue(true);
            cir.cancel();
        }
    }

    @Override
    public TextFieldWidget nexis$getChatField() {
        return chatField;
    }
}
