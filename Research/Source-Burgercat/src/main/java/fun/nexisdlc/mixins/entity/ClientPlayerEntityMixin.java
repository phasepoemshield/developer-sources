package fun.nexisdlc.mixins.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.*;
import fun.nexisdlc.client.events.impl.entity.EventMove;
import fun.nexisdlc.client.events.impl.player.SprintEvent;
import fun.nexisdlc.client.utils.baritone.BaritoneRotationHook;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.modules.impl.movement.NoSlow;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MovementType;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin extends AbstractClientPlayerEntity {
    @Shadow
    protected abstract void autoJump(float dx, float dz);

    public ClientPlayerEntityMixin(ClientWorld world, GameProfile profile) {
        super(world, profile);
    }
    @Unique
    private static final UpdateEvent UPDATE_EVENT = new UpdateEvent();
    @Unique
    private static final PostEvent POST_EVENT = new PostEvent();

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo ci) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        if (player == null) return;
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || mc.world == null) return;
        NexisClient.getEventBus().post(UPDATE_EVENT);
    }

    @Inject(method = "move", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V"), cancellable = true)
    public void move(MovementType movementType, Vec3d movement, CallbackInfo ci) {
        EventMove event = new EventMove(movement.x, movement.y, movement.z);
        NexisClient.getEventBus().post(event);

        if (event.isCancelled()) {
            double d = this.getX();
            double e = this.getZ();
            super.move(movementType, new Vec3d(event.getX(), event.getY(), event.getZ()));
            this.autoJump((float) (this.getX() - d), (float) (this.getZ() - e));
            ci.cancel();
        }
    }

    @Inject(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V", shift = At.Shift.AFTER))
    public void postTick(CallbackInfo callbackInfo) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player != null && mc.world != null) {
            NexisClient.getEventBus().post(POST_EVENT);
        }
    }

    @Redirect(
            method = "applyMovementSpeedFactors",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/Vec2f;multiply(F)Lnet/minecraft/util/math/Vec2f;", ordinal = 1)
    )
    private Vec2f nexis$cancelItemSlowdown(Vec2f input, float multiplier) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        NoSlow noSlow = NexisClient.getFunctionManager().getNoSlow();
        if (noSlow != null && noSlow.shouldCancelSlowdown() && !player.hasVehicle()) {
            return input.multiply(1.0F);
        }
        return input.multiply(multiplier);
    }

    @ModifyExpressionValue(method = "tickMovement", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/PlayerInput;sprint()Z"))
    private boolean hookSprintStart(boolean original) {
        SprintEvent event = new SprintEvent(original);
        NexisClient.getEventBus().post(event);
        if (BaritoneRotationHook.isActive()) {
            return false;
        }
        return event.isSprinting();
    }

    @ModifyExpressionValue(method = "tickMovement", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;shouldStopSprinting()Z"))
    private boolean hookSprintStop(boolean original) {
        SprintEvent event = new SprintEvent(!original);
        NexisClient.getEventBus().post(event);
        if (BaritoneRotationHook.isActive()) {
            return true;
        }
        return !event.isSprinting();
    }

    @Inject(method = "sendMovementPackets", at = @At("HEAD"), cancellable = true)
    private void onSendMovementPackets(CallbackInfo ci) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || mc.world == null) return;

        EventSync eventSync = new EventSync(player.getYaw(), player.getPitch());
        NexisClient.getEventBus().post(eventSync);

        SprintEvent eventSprint = new SprintEvent(player.isSprinting());
        NexisClient.getEventBus().post(eventSprint);

        if (eventSync.isCancelled()) {
            ci.cancel();
        }
    }

    @Inject(method = "sendMovementPackets", at = @At("RETURN"))
    private void afterSendMovementPackets(CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.world != null) {
            NexisClient.getEventBus().post(new EventPostSync());
        }
    }

    @Inject(method = "getCrosshairTarget(FLnet/minecraft/entity/Entity;)Lnet/minecraft/util/hit/HitResult;", at = @At("HEAD"), cancellable = true)
    private void onGetCrosshairTarget(float tickProgress, Entity cameraEntity, CallbackInfoReturnable<HitResult> cir) {
        RotationFixEvent event = new RotationFixEvent();
        NexisClient.getEventBus().post(event);

        if (event.isCancelled()) {
            ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
            float yaw = event.getYaw();
            float pitch = event.getPitch();

            double blockRange = player.getBlockInteractionRange();
            double entityRange = player.getEntityInteractionRange();
            double maxRange = Math.max(blockRange, entityRange);

            EntityHitResult entityHitResult = PlayerUtils.raytraceEntity(
                    maxRange, yaw, pitch,
                    entity -> !entity.isSpectator() && entity.canHit()
            );

            BlockHitResult blockHitResult = PlayerUtils.raycast(maxRange, yaw, pitch, false);

            Vec3d cameraPos = cameraEntity.getCameraPosVec(tickProgress);

            if (entityHitResult != null) {
                double entityDistance = entityHitResult.getPos().squaredDistanceTo(cameraPos);
                double blockDistance = blockHitResult != null ? blockHitResult.getPos().squaredDistanceTo(cameraPos) : Double.MAX_VALUE;

                if (entityDistance < blockDistance && entityDistance <= entityRange * entityRange) {
                    cir.setReturnValue(checkCrosshairTargetRange(entityHitResult, cameraPos, entityRange));
                    return;
                } else if (blockHitResult != null && blockDistance <= blockRange * blockRange) {
                    cir.setReturnValue(checkCrosshairTargetRange(blockHitResult, cameraPos, blockRange));
                    return;
                } else {
                    cir.setReturnValue(BlockHitResult.createMissed(cameraPos, Direction.UP, BlockPos.ofFloored(cameraPos)));
                    return;
                }
            } else if (blockHitResult != null) {
                cir.setReturnValue(checkCrosshairTargetRange(blockHitResult, cameraPos, blockRange));
                return;
            } else {
                cir.setReturnValue(BlockHitResult.createMissed(cameraPos, Direction.UP, BlockPos.ofFloored(cameraPos)));
                return;
            }
        }
    }

    @Unique
    private static HitResult checkCrosshairTargetRange(HitResult hitResult, Vec3d cameraPos, double range) {
        Vec3d hitPos = hitResult.getPos();
        if (!hitPos.isInRange(cameraPos, range)) {
            Direction direction = Direction.getFacing(
                hitPos.x - cameraPos.x,
                hitPos.y - cameraPos.y,
                hitPos.z - cameraPos.z
            );
            return BlockHitResult.createMissed(hitPos, direction, BlockPos.ofFloored(hitPos));
        }
        return hitResult;
    }

    @Inject(at = @At("HEAD"), method = "pushOutOfBlocks", cancellable = true)
    public void noPush(CallbackInfo ci) {
        if (PlayerUtils.shouldCancelBlockPush()) {
            ci.cancel();
        }
    }

    @Inject(method = "closeHandledScreen", at = @At("HEAD"), cancellable = true)
    private void nexis$onCloseHandledScreen(CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.currentScreen == null || NexisClient.getEventBus() == null) {
            return;
        }
        EventCloseScreen event = new EventCloseScreen(mc.currentScreen);
        NexisClient.getEventBus().post(event);
        if (event.isCancelled()) {
            ci.cancel();
        }
    }
}
