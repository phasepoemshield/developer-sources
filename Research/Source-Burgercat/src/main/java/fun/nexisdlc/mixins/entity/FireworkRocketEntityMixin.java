package fun.nexisdlc.mixins.entity;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.EventFireworkUse;
import fun.nexisdlc.client.events.impl.client.RotationFixEvent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(FireworkRocketEntity.class)
public class FireworkRocketEntityMixin {
    @Inject(
            method = "tick",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/projectile/FireworkRocketEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V",
                    shift = At.Shift.BEFORE
            )
    )
    private void nullform$rotationFixFireworkVelocity(CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();
        FireworkRocketEntity rocket = (FireworkRocketEntity) (Object) this;

        if (mc.world == null || mc.player == null) {
            return;
        }

        LivingEntity shooter = rocket.getOwner() instanceof LivingEntity living ? living : null;
        if (shooter == null || shooter != mc.player || !mc.player.isGliding()) {
            return;
        }

        RotationFixEvent rotationEvent = new RotationFixEvent();
        NexisClient.getEventBus().post(rotationEvent);

        float yaw = rotationEvent.isCancelled() ? rotationEvent.getYaw() : mc.player.getYaw();
        float pitch = rotationEvent.isCancelled() ? rotationEvent.getPitch() : mc.player.getPitch();

        double x = -MathHelper.sin((float) Math.toRadians(yaw)) * MathHelper.cos((float) Math.toRadians(pitch));
        double y = -MathHelper.sin((float) Math.toRadians(pitch));
        double z = MathHelper.cos((float) Math.toRadians(yaw)) * MathHelper.cos((float) Math.toRadians(pitch));
        Vec3d direction = new Vec3d(x, y, z);

        Vec3d originalVelocity = direction.normalize();

        EventFireworkUse fireworkEvent = new EventFireworkUse(originalVelocity, rocket.getVelocity());
        NexisClient.getEventBus().post(fireworkEvent);

        if (fireworkEvent.isCancelled()) {
            rocket.setVelocity(fireworkEvent.getVector());
        } else {
            rocket.setVelocity(originalVelocity);
        }
    }
}
