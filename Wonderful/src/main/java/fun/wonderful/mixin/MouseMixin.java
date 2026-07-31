package fun.wonderful.mixin;

import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventLook;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.client.modules.impl.combat.AutoSwap;
import fun.wonderful.client.modules.impl.player.CatchItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.util.math.Smoother;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Mouse.class})
public abstract class MouseMixin {
    @Shadow
    @Final
    private MinecraftClient client;
    @Shadow
    private double cursorDeltaX;
    @Shadow
    private double cursorDeltaY;
    @Shadow
    private Smoother cursorXSmoother;
    @Shadow
    private Smoother cursorYSmoother;

    @Inject(method={"onMouseButton"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMouseButton(long window, int button, int action, int mods, CallbackInfo ci) {
        try {
            if (this.client.player == null) {
                return;
            }
            if (AutoSwap.INSTANCE.capturesWheelMouse()) {
                ci.cancel();
                return;
            }
            int buttonId = button;
            int actionId = action == 1 ? 1 : 0;
            double[] cursorX = new double[1];
            double[] cursorY = new double[1];
            GLFW.glfwGetCursorPos((long)window, (double[])cursorX, (double[])cursorY);
            double scale = this.client.getWindow().getScaleFactor();
            if (CatchItems.INSTANCE.handleHudClick(buttonId, action, cursorX[0] / scale, cursorY[0] / scale)) {
                ci.cancel();
                return;
            }
            KeyBoardUtils.callMouse(buttonId, actionId);
        }
        catch (Exception exception) {
            
        }
    }

    @Inject(method={"updateMouse"}, at={@At(value="HEAD")}, cancellable=true)
    private void onUpdateMouse(double timeDelta, CallbackInfo ci) {
        try {
            double j2;
            double i2;
            if (this.client.player == null) {
                return;
            }
            if (AutoSwap.INSTANCE.capturesWheelMouse()) {
                this.cursorDeltaX = 0.0;
                this.cursorDeltaY = 0.0;
                this.cursorXSmoother.clear();
                this.cursorYSmoother.clear();
                ci.cancel();
                return;
            }
            double sensitivity = (Double)(Object)this.client.options.getMouseSensitivity().getValue() * 0.6 + 0.2;
            double scaled = sensitivity * sensitivity * sensitivity * 8.0;
            if (this.client.options.smoothCameraEnabled) {
                i2 = this.cursorXSmoother.smooth(this.cursorDeltaX * scaled, timeDelta * scaled);
                j2 = this.cursorYSmoother.smooth(this.cursorDeltaY * scaled, timeDelta * scaled);
            } else if (this.client.options.getPerspective().isFirstPerson() && this.client.player.isUsingSpyglass()) {
                this.cursorXSmoother.clear();
                this.cursorYSmoother.clear();
                i2 = this.cursorDeltaX * sensitivity * sensitivity * sensitivity;
                j2 = this.cursorDeltaY * sensitivity * sensitivity * sensitivity;
            } else {
                this.cursorXSmoother.clear();
                this.cursorYSmoother.clear();
                i2 = this.cursorDeltaX * scaled;
                j2 = this.cursorDeltaY * scaled;
            }
            int invert = (Boolean)(Object)this.client.options.getInvertYMouse().getValue() != false ? -1 : 1;
            EventLook event = new EventLook(i2, j2 * (double)invert);
            EventInvoker.invoke(event);
            if (!event.isCancelled()) {
                this.client.getTutorialManager().onUpdateMouse(event.getYaw(), event.getPitch());
                this.client.player.changeLookDirection(event.getYaw(), event.getPitch());
            }
            this.cursorDeltaX = 0.0;
            this.cursorDeltaY = 0.0;
            ci.cancel();
        }
        catch (Exception exception) {
            
        }
    }
}