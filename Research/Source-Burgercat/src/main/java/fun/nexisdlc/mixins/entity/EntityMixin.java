package fun.nexisdlc.mixins.entity;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.RotationFixEvent;
import fun.nexisdlc.client.events.impl.player.FixVelocityEvent;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.modules.impl.utils.NoEffects;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(Entity.class)
public class EntityMixin {

    @Inject(method = "pushAwayFrom(Lnet/minecraft/entity/Entity;)V", at = @At("HEAD"), cancellable = true)
    public void cancelPushAway(Entity other, CallbackInfo ci) {
        if ((Object) this == mc.player && PlayerUtils.shouldCancelEntityPush()) {
            ci.cancel();
        }
    }

    @Redirect(method = "updateVelocity", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;movementInputToVelocity(Lnet/minecraft/util/math/Vec3d;FF)Lnet/minecraft/util/math/Vec3d;"))
    public Vec3d hookVelocity(Vec3d movementInput, float speed, float yaw) {
        if ((Object) this == mc.player) {
            FixVelocityEvent event = new FixVelocityEvent(yaw);
            NexisClient.getEventBus().post(event);

            float finalYaw = Float.isNaN(event.getTargetYaw()) ? yaw : event.getTargetYaw();
            return Entity.movementInputToVelocity(movementInput, speed, finalYaw);
        }
        return Entity.movementInputToVelocity(movementInput, speed, yaw);
    }

    @Inject(method = "getRotationVector()Lnet/minecraft/util/math/Vec3d;", at = @At("HEAD"), cancellable = true)
    public void proRespectMoment(CallbackInfoReturnable<Vec3d> cir) {
        if ((Object) this == mc.player) {
            RotationFixEvent event = new RotationFixEvent();
            NexisClient.getEventBus().post(event);

            float yaw = event.isCancelled() ? event.getYaw() : mc.player.getYaw();
            float pitch = event.isCancelled() ? event.getPitch() : mc.player.getPitch();

            float f = pitch * ((float) Math.PI / 180F);
            float g = -yaw * ((float) Math.PI / 180F);
            float h = MathHelper.cos((double) g);
            float i = MathHelper.sin((double) g);
            float j = MathHelper.cos((double) f);
            float k = MathHelper.sin((double) f);

            cir.setReturnValue(new Vec3d((double) (i * j), (double) (-k), (double) (h * j)));
        }
    }

    @Inject(method = "isGlowing", at = @At("HEAD"), cancellable = true)
    private void onIsGlowing(CallbackInfoReturnable<Boolean> cir) {
        if (mc.world == null) {
            return;
        }
        if (WorldRenderLayers.isShaderPackActive()) {
            return;
        }

        NoEffects noEffects = Nexis.getFunctionManager().getNoEffects();
        if (noEffects != null
                && noEffects.isState()
                && noEffects.modeListSetting.getByName("Свечение").get()) {
            cir.setReturnValue(false);
        }
    }

}
