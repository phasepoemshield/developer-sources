package fun.nexisdlc.mixins.client;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.EventAimAssist;
import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.EventMouse;
import fun.nexisdlc.client.events.impl.client.EventScroll;
import fun.nexisdlc.client.utils.baritone.BaritoneRotationHook;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.modules.impl.render.CameraTweaks;
import fun.nexisdlc.modules.impl.render.FreeLook;
import fun.nexisdlc.ui.hud.HudSettingsOverlay;
import fun.nexisdlc.ui.hud.MediaPlayer;
import net.minecraft.client.Mouse;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.input.MouseInput;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(Mouse.class)
public class MouseMixin {
    @Shadow
    private double cursorDeltaX;
    @Shadow
    private double cursorDeltaY;

    @Unique
    private long nexis$lastAimAssistNs = 0L;

    @Inject(method = "onMouseButton", at = @At("HEAD"))
    public void onMouseButtonHook(long window, MouseInput input, int action, CallbackInfo ci) {
        var client = mc;
        if (client == null || window != client.getWindow().getHandle()) {
            return;
        }
        int button = input.button();

        if (client.currentScreen == null) {
            NexisClient.getEventBus().post(new EventMouse(button, action));
            if (button != GLFW.GLFW_KEY_UNKNOWN) {
                NexisClient.getEventBus().post(new EventKey(EventKey.MOUSE_BUTTON_OFFSET + button, action, InputUtil.Type.MOUSE));
            }
        }

        if (!(client.currentScreen instanceof ChatScreen) || ClientContainer.isHide() || button != 0) {
            return;
        }

        double mouseX = client.mouse.getX();
        double mouseY = client.mouse.getY();
        if (HudSettingsOverlay.isOpen()) {
            return;
        }
        if (action == 1) {
            if (MediaPlayer.handleMouseClick(mouseX, mouseY, button)) {
                return;
            }
            for (Dragging dragging : DraggingManager.draggables.values()) {
                if (dragging.getModule() != null && dragging.getModule().isState() && dragging.onClick(mouseX, mouseY, button)) {
                    break;
                }
            }
        } else {
            for (Dragging dragging : DraggingManager.draggables.values()) {
                if (dragging.getModule() != null && dragging.getModule().isState()) {
                    dragging.onRelease(button);
                }
            }
        }
    }

    @Inject(method = "onMouseScroll", at = @At("HEAD"), cancellable = true)
    public void onMouseScrollHook(long window, double horizontal, double vertical, CallbackInfo ci) {
        var client = mc;
        if (client == null || window != client.getWindow().getHandle()) {
            return;
        }

        NexisClient.getEventBus().post(new EventScroll(horizontal, vertical));

        CameraTweaks cameraTweaks = NexisClient.getFunctionManager().getCameraTweaks();
        if (cameraTweaks != null && cameraTweaks.isZoomActive() && client.currentScreen == null) {
            ci.cancel();
        }
    }

    @Inject(method = "updateMouse", at = @At("HEAD"))
    public void onUpdateMouse(double timeDelta, CallbackInfo ci) {
        // AimBot assist hook
        long now = System.nanoTime();
        double deltaSeconds;
        if (this.nexis$lastAimAssistNs == 0L) {
            deltaSeconds = 1.0 / 120.0;
        } else {
            deltaSeconds = MathHelper.clamp((now - this.nexis$lastAimAssistNs) / 1_000_000_000.0, 0.001, 0.2);
        }
        this.nexis$lastAimAssistNs = now;

        EventAimAssist aimAssistEvent = new EventAimAssist(this.cursorDeltaX, this.cursorDeltaY, deltaSeconds);
        NexisClient.getEventBus().post(aimAssistEvent);
        this.cursorDeltaX = aimAssistEvent.getDeltaX();
        this.cursorDeltaY = aimAssistEvent.getDeltaY();

        FreeLook freeLook = NexisClient.getFunctionManager().getFreeLook();
        if (freeLook != null && freeLook.isActive()) {
            freeLook.addRotation((float) this.cursorDeltaX, (float) this.cursorDeltaY);
            this.cursorDeltaX = 0.0;
            this.cursorDeltaY = 0.0;
            return;
        }

        // Baritone FreeLook: когда Baritone рулит серверной ротацией,
        // мышь управляет камерой (визуальной ротацией)
        if (BaritoneRotationHook.isActive() && mc.currentScreen == null) {
            BaritoneRotationHook.addCameraRotation((float) this.cursorDeltaX, (float) this.cursorDeltaY);
            this.cursorDeltaX = 0.0;
            this.cursorDeltaY = 0.0;
        }
    }
}
