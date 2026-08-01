package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.render.EventCamera;
import fun.nexisdlc.modules.impl.player.FreeCamera;
import fun.nexisdlc.modules.impl.render.FreeLook;
import fun.nexisdlc.modules.impl.utils.Tweaks;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(Camera.class)
public abstract class CameraMixin {
    @Shadow
    private boolean thirdPerson;

    @Shadow
    protected abstract void setRotation(float yaw, float pitch);

    @Shadow
    protected abstract void moveBy(float f, float g, float h);

    @Shadow
    protected abstract void setPos(double x, double y, double z);

    @Shadow
    protected abstract float clipToSpace(float f);

    @Unique
    private float nexis$perspectiveDistance = 0.3f;
    @Unique
    private long nexis$lastPerspectiveNs = System.nanoTime();
    @Unique
    private float nexis$lastTargetDistance = 0f;

    @Inject(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V", shift = At.Shift.AFTER), cancellable = true)
    public void onUpdate(World area, Entity focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {
        EventCamera event = new EventCamera();
        NexisClient.getEventBus().post(event);

        FreeCamera freeCamera = NexisClient.getFunctionManager().getFreeCamera();
        if (freeCamera != null && freeCamera.isState()) {
            setRotation(freeCamera.getFakeYaw(), freeCamera.getFakePitch());
            setPos(
                    freeCamera.getFakeX(tickDelta),
                    freeCamera.getFakeY(tickDelta),
                    freeCamera.getFakeZ(tickDelta)
            );
            this.thirdPerson = true;
            ci.cancel();
            return;
        }

        FreeLook freeLook = NexisClient.getFunctionManager().getFreeLook();
        if (freeLook != null && freeLook.isActive() && focusedEntity instanceof ClientPlayerEntity player && !player.isSleeping()) {
            float pitch = inverseView ? -freeLook.getCameraPitch() : freeLook.getCameraPitch();
            float yaw = freeLook.getCameraYaw() - (inverseView ? 180f : 0f);
            float distance = thirdPerson ? event.getDistance() : 0f;
            setRotation(yaw, pitch);
            moveBy(event.isCameraClip() ? -distance : -clipToSpace(distance), 0.0F, 0.0F);
            ci.cancel();
            return;
        }

        // Baritone rotation redirect: когда Baritone управляет серверной ротацией,
        // камера показывает cameraYaw/cameraPitch (управляемые мышью игрока),
        // а не mc.player.getYaw/getPitch (которые содержат Baritone desired rotation).
        if (fun.nexisdlc.client.utils.baritone.BaritoneRotationHook.isActive()
                && focusedEntity instanceof ClientPlayerEntity player && !player.isSleeping()) {
            float camYaw = fun.nexisdlc.client.utils.baritone.BaritoneRotationHook.getCameraYaw();
            float camPitch = fun.nexisdlc.client.utils.baritone.BaritoneRotationHook.getCameraPitch();
            float pitch = inverseView ? -camPitch : camPitch;
            float yaw = camYaw - (inverseView ? 180f : 0f);
            float distance = thirdPerson ? event.getDistance() : 0f;
            setRotation(yaw, pitch);
            moveBy(event.isCameraClip() ? -distance : -clipToSpace(distance), 0.0F, 0.0F);
            ci.cancel();
            return;
        }

        float targetDistance = thirdPerson ? event.getDistance() : 0f;
        boolean enteringThirdPerson = targetDistance > 0f && nexis$lastTargetDistance <= 0f;
        nexis$lastTargetDistance = targetDistance;
        long now = System.nanoTime();
        float dt = (now - nexis$lastPerspectiveNs) / 1_000_000_000.0f;
        nexis$lastPerspectiveNs = now;

        boolean check = NexisClient.getFunctionManager().getTweaks().isState() && Tweaks.f5animation.get();

        if (ClientContainer.isHide() || !check) {
            nexis$perspectiveDistance = targetDistance;
        } else {
            if (enteringThirdPerson) {
                nexis$perspectiveDistance = 0.3f;
            }
            float speed = 14;
            float t = MathHelper.clamp(dt * speed, 0f, 1f);
            nexis$perspectiveDistance = MathHelper.lerp(t, nexis$perspectiveDistance, targetDistance);
        }

        if ((thirdPerson || nexis$perspectiveDistance > 0.01f) && focusedEntity instanceof ClientPlayerEntity player && !player.isSleeping()) {
            float pitch = inverseView ? -mc.player.getPitch() : mc.player.getPitch();
            float yaw = mc.player.getYaw() - (inverseView ? 180f : 0f);
            float distance = nexis$perspectiveDistance;
            setRotation(yaw, pitch);
            moveBy(event.isCameraClip() ? -distance : -clipToSpace(distance), 0.0F, 0.0F);
            ci.cancel();
        }
    }

    @Inject(method = "update", at = @At("HEAD"))
    private void onUpdateHead(CallbackInfo ci) {
        if (NexisClient.getEventBus() == null) return;
        EventCamera event = new EventCamera();
        NexisClient.getEventBus().post(event);
    }
}
