package sky.core.util.mixin.client;

import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.events.EventMotion;
import sky.core.events.EventPostUpdate;
import sky.core.events.EventUpdate;
import sky.core.util.NoRenderUtil;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Inject(method = "tick", at = @At("HEAD"))
    private void skycore$preUpdate(CallbackInfo ci) {
        EventManager.call(new EventUpdate());
    }

    @Inject(method = "tick", at = @At("RETURN"))
    private void skycore$postUpdate(CallbackInfo ci) {
        EventManager.call(new EventPostUpdate());
    }

    @Inject(method = "sendMovementPackets", at = @At("HEAD"), cancellable = true)
    private void skycore$motion(CallbackInfo ci) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        EventMotion event = new EventMotion(
                player.getX(),
                player.getY(),
                player.getZ(),
                player.getYaw(),
                player.getPitch(),
                player.isOnGround(),
                player.isSneaking(),
                player.isSprinting()
        );
        EventManager.call(event);
        if (event.isCancel()) {
            ci.cancel();
            return;
        }
        player.setYaw(event.getYaw());
        player.setPitch(event.getPitch());
    }

    @Inject(method = "tickNausea", at = @At("HEAD"), cancellable = true)
    private void skycore$hideBadEffects(boolean fromPortalEffect, CallbackInfo ci) {
        if (!fromPortalEffect && NoRenderUtil.shouldCancel(NoRenderUtil.Type.BAD_EFFECTS)) {
            ci.cancel();
        }
    }
}
