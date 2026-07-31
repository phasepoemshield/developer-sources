package fun.wonderful.mixin;

import com.mojang.authlib.GameProfile;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventCloseInv;
import fun.wonderful.api.events.implement.EventMotion;
import fun.wonderful.api.events.implement.EventMove;
import fun.wonderful.api.events.implement.EventPostMotion;
import fun.wonderful.api.events.implement.EventSlowWalking;
import fun.wonderful.api.events.implement.EventSprint;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.events.implement.EventUpdatePost;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.player.ViaProtocolUtils;
import fun.wonderful.client.modules.impl.combat.Aura;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ClientPlayerEntity.class})
public abstract class ClientPlayerEntityMixin
extends PlayerEntity
implements QClient {
    @Shadow
    @Final
    public ClientPlayNetworkHandler networkHandler;

    public ClientPlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile) {
        super(world, pos, yaw, gameProfile);
    }

    @Shadow
    public abstract void closeScreen();

    @Inject(method={"tick"}, at={@At(value="HEAD", target="Lnet/minecraft/AbstractClientPlayerEntity;tick()V")})
    private void onTick(CallbackInfo ci) {
        if (EventInvoker.hasListeners(EventUpdate.class)) {
            new EventUpdate().call();
        }
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="HEAD")})
    private void onSendMovementPackets(CallbackInfo ci) {
        if (EventInvoker.hasListeners(EventMotion.class)) {
            new EventMotion(this.getYaw(), this.getPitch(), this.isOnGround()).call();
        }
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="TAIL")})
    private void onSendMovementPacketsPost(CallbackInfo ci) {
        if (EventInvoker.hasListeners(EventPostMotion.class)) {
            new EventPostMotion().call();
        }
    }

    @Inject(method={"tick"}, at={@At(value="TAIL", target="Lnet/minecraft/AbstractClientPlayerEntity;tick()V")})
    private void onTickPost(CallbackInfo ci) {
        if (EventInvoker.hasListeners(EventUpdatePost.class)) {
            new EventUpdatePost().call();
        }
        if (this.shouldSyncRotation()) {
            this.headYaw = this.getYaw();
            this.prevHeadYaw = this.getYaw();
            this.bodyYaw = this.getYaw();
            this.prevBodyYaw = this.getYaw();
        }
    }

    @Unique
    private boolean shouldSyncRotation() {
        Aura aura = ModuleClass.aura;
        return aura != null && aura.isEnable() && aura.getTarget() != null && Aura.clientLook.isState() && RotationStorage.instance != null && RotationStorage.instance.isRotating();
    }

    @Redirect(method={"tickMovement"}, at=@At(value="INVOKE", target="Lnet/minecraft/KeyBinding;isPressed()Z", ordinal=1), require=0)
    private boolean onSprintKeyPressed(KeyBinding instance) {
        if (ViaProtocolUtils.usesLegacyWaterMovement() && !ViaProtocolUtils.isLegacyWaterActive(mc) && (this.horizontalCollision || this.collidedSoftly)) {
            return false;
        }
        EventSprint event = new EventSprint();
        event.call();
        if (event.isCancelled()) {
            return false;
        }
        return instance.isPressed();
    }

    @Redirect(method={"tickMovement"}, at=@At(value="INVOKE", target="Lnet/minecraft/ClientPlayerEntity;isUsingItem()Z"), require=0)
    private boolean onSlowDownRedirect(ClientPlayerEntity player) {
        if (player.isUsingItem()) {
            EventSlowWalking event = new EventSlowWalking();
            event.call();
            return player.isUsingItem() && player.getVehicle() == null && !event.isCancelled();
        }
        return player.isUsingItem() && player.getVehicle() == null;
    }

    @Inject(method={"pushOutOfBlocks"}, at={@At(value="HEAD")}, cancellable=true)
    public void pushOutOfBlocks(double x2, double z2, CallbackInfo ci) {
        if (ModuleClass.noPush.isEnable() && ModuleClass.noPush.getCollisionList().is("Блоки")) {
            ci.cancel();
        }
    }

    @Inject(method={"move"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMoveHook(MovementType movementType, Vec3d movement, @NotNull CallbackInfo ci) {
        EventMove event = new EventMove(movement);
        event.call();
        if (!event.isCancelled() && event.getMovePos().equals((Object)movement)) {
            return;
        }
        if (event.isCancelled()) {
            ci.cancel();
            return;
        }
        double d2 = this.getX();
        double e2 = this.getZ();
        super.move(movementType, event.getMovePos());
        float f2 = (float)Math.sqrt(Math.pow(this.getX() - d2, 2.0) + Math.pow(this.getZ() - e2, 2.0));
        this.updateLimbs(f2);
        ci.cancel();
    }

    @Inject(method={"closeHandledScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void onCloseHandledScreen(CallbackInfo ci) {
        int syncId = this.currentScreenHandler.syncId;
        EventCloseInv event = new EventCloseInv(syncId);
        event.call();
        if (!event.isCancelled()) {
            this.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(syncId));
        }
        this.closeScreen();
        ci.cancel();
    }

    @Inject(method={"dropSelectedItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void onDropSelectedItem(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
        if (ModuleClass.lockSlot != null && ModuleClass.lockSlot.isCurrentSlotLockedForDrop()) {
            cir.setReturnValue((Object)false);
        }
    }
}