package fun.nexisdlc.mixins.player;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.RotationFixEvent;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerMoveC2SPacket.class)
public class PlayerMoveC2SPacketMixin {
    @Mutable
    @Final
    @Shadow
    protected float yaw;

    @Mutable
    @Final
    @Shadow
    protected float pitch;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void nullform$rotationFixPacket(double x, double y, double z, float yaw, float pitch,
                                            boolean onGround, boolean horizontalCollision,
                                            boolean changePosition, boolean changeLook,
                                            CallbackInfo ci) {
        RotationFixEvent event = new RotationFixEvent();
        NexisClient.getEventBus().post(event);
        if (event.isCancelled()) {
            this.yaw = changeLook
                    ? RotationTask.sanitizePacketYaw(event.getYaw())
                    : RotationTask.continuousPacketYaw(event.getYaw());
            this.pitch = event.getPitch();
        } else if (changeLook) {
            RotationTask.recordPacketYaw(this.yaw);
        }
    }
}