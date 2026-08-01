package sky.core.util.mixin.client;

import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.events.EventJump;
import sky.core.events.EventLivingUpdate;
import sky.core.events.EventOnTravelPost;
import sky.core.events.EventTravel;
import sky.core.events.EventWillLand;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(method = "tick", at = @At("HEAD"))
    private void skycore$livingUpdate(CallbackInfo ci) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self != MinecraftClient.getInstance().player) {
            return;
        }
        EventManager.call(new EventLivingUpdate());
    }

    @Inject(method = "jump", at = @At("HEAD"), cancellable = true)
    private void skycore$jump(CallbackInfo ci) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self != MinecraftClient.getInstance().player) {
            return;
        }
        EventJump event = new EventJump();
        EventManager.call(event);
        if (event.isCancel()) {
            ci.cancel();
        }
    }

    @Inject(method = "travel", at = @At("HEAD"), cancellable = true)
    private void skycore$travel(Vec3d movementInput, CallbackInfo ci) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self != MinecraftClient.getInstance().player) {
            return;
        }
        EventTravel event = new EventTravel(self);
        EventManager.call(event);
        if (event.isCancel()) {
            ci.cancel();
        }
    }

    @Inject(method = "travel", at = @At("RETURN"))
    private void skycore$travelPost(Vec3d movementInput, CallbackInfo ci) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self != MinecraftClient.getInstance().player) {
            return;
        }
        EventManager.call(new EventOnTravelPost(self.getVelocity()));
    }

    @Inject(method = "handleFallDamage", at = @At("HEAD"))
    private void skycore$willLand(float fallDistance, float damageMultiplier, DamageSource source, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self != MinecraftClient.getInstance().player) {
            return;
        }
        EventWillLand event = new EventWillLand(fallDistance > 0.0F);
        EventManager.call(event);
    }
}
