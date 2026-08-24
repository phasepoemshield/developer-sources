package ru.pulse.mixin;

import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Vec2f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.events.EventBusService;
import pulse.events.MovementInputEvent;

@Mixin(KeyboardInput.class)
public class KeyboardInputMixin extends Input {
    @Shadow
    @Final
    private GameOptions settings;

    @Inject(require = 0, method = "tick", at = @At("HEAD"), cancellable = true)
    private void onTick(CallbackInfo callbackInfo) {
        this.playerInput = new PlayerInput(
            this.settings.forwardKey.isPressed(),
            this.settings.backKey.isPressed(),
            this.settings.leftKey.isPressed(),
            this.settings.rightKey.isPressed(),
            this.settings.jumpKey.isPressed(),
            this.settings.sneakKey.isPressed(),
            this.settings.sprintKey.isPressed()
        );
        float forward = getMovementMultiplier(this.playerInput.forward(), this.playerInput.backward());
        float sideways = getMovementMultiplier(this.playerInput.left(), this.playerInput.right());
        MovementInputEvent movementInputEvent = new MovementInputEvent(
            forward, sideways, this.playerInput.jump(), this.playerInput.sneak(), 0.3F
        );
        EventBusService.EVENT_BUS.post(movementInputEvent);
        if (movementInputEvent.c()) {
            this.movementVector = new Vec2f(0.0F, 0.0F);
            this.playerInput = new PlayerInput(false, false, false, false, false, false, this.playerInput.sprint());
        } else {
            this.movementVector = new Vec2f(movementInputEvent.e(), movementInputEvent.d());
            this.playerInput = new PlayerInput(
                movementInputEvent.d() > 0.0F,
                movementInputEvent.d() < 0.0F,
                movementInputEvent.e() > 0.0F,
                movementInputEvent.e() < 0.0F,
                movementInputEvent.f(),
                movementInputEvent.g(),
                this.playerInput.sprint()
            );
        }

        callbackInfo.cancel();
    }

    @Unique
    private static float getMovementMultiplier(boolean z, boolean z2) {
        if (z == z2) {
            return 0.0F;
        } else {
            return z ? 1.0F : -1.0F;
        }
    }
}
