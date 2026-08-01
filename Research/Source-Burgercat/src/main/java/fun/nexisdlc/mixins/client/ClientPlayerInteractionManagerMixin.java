package fun.nexisdlc.mixins.client;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.EventClickSlot;
import fun.nexisdlc.client.events.impl.client.RotationFixEvent;
import fun.nexisdlc.client.events.impl.entity.EventAttack;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;
import org.apache.commons.lang3.mutable.MutableObject;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.HashSet;
import java.util.Set;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(ClientPlayerInteractionManager.class)
public class ClientPlayerInteractionManagerMixin {
    @Shadow
    private GameMode gameMode;

    @Shadow
    private void syncSelectedSlot() {
    }

    @Shadow
    private void sendSequencedPacket(ClientWorld world, SequencedPacketCreator packetCreator) {
    }

    @Inject(at = @At("HEAD"), cancellable = true, method = "interactItem")
    public void interactItem(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        RotationFixEvent eventItemUseFix = new RotationFixEvent();
        NexisClient.getEventBus().post(eventItemUseFix);
   //     ContainerReach containerReach = (ContainerReach) ModuleManager.getInstance().getModuleByName("ContainerReach");

    //    if (containerReach != null
    //            && containerReach.isEnabled()
    //            && mc.world != null
    //            && mc.player != null) {
    //        BlockHitResult targetHit = findContainerThroughWalls(containerReach.range.getValue(), null);
    //        if (targetHit != null) {
    //            this.syncSelectedSlot();
    //            this.sendSequencedPacket(mc.world,
    //                    sequence -> new PlayerInteractBlockC2SPacket(hand, targetHit, sequence));
    //            mc.player.swingHand(hand);
    //            cir.setReturnValue(ActionResult.SUCCESS);
    //            return;
    //        }
    //    }

        if (this.gameMode == GameMode.SPECTATOR) {
            cir.setReturnValue(ActionResult.PASS);
        } else {
            this.syncSelectedSlot();
            MutableObject<ActionResult> mutableObject = new MutableObject<>();

            this.sendSequencedPacket(mc.world, (sequence) -> {
                float packetYaw = eventItemUseFix.isCancelled() ? eventItemUseFix.getYaw() : mc.player.getYaw();
                float packetPitch = eventItemUseFix.isCancelled() ? eventItemUseFix.getPitch() : mc.player.getPitch();

                PlayerInteractItemC2SPacket playerInteractItemC2SPacket = new PlayerInteractItemC2SPacket(hand,
                        sequence, packetYaw, packetPitch);

                ItemStack itemStack = player.getStackInHand(hand);
                if (player.getItemCooldownManager().isCoolingDown(itemStack)) {
                    mutableObject.setValue(ActionResult.PASS);
                    return playerInteractItemC2SPacket;
                } else {
                    ActionResult result = itemStack.use(mc.world, player, hand);
                    if (result.isAccepted()) {
                        ItemStack itemStack2 = player.getStackInHand(hand);
                        if (itemStack2 != itemStack) {
                            player.setStackInHand(hand, itemStack2);
                        }
                    }
                    mutableObject.setValue(result);
                    return playerInteractItemC2SPacket;
                }
            });

            cir.setReturnValue((ActionResult) mutableObject.getValue());
        }
    }

    @Unique
    private BlockHitResult findContainerThroughWalls(double range, BlockHitResult preferredHit) {
        if (mc.player == null || mc.world == null) {
            return null;
        }

        if (preferredHit != null && isContainer(preferredHit.getBlockPos())
                && mc.player.squaredDistanceTo(Vec3d.ofCenter(preferredHit.getBlockPos())) <= range * range) {
            return preferredHit;
        }

        Vec3d eyePos = mc.player.getEyePos();
        Vec3d look = mc.player.getRotationVec(1.0f).normalize();
        double step = 0.2;
        int maxSteps = Math.max(1, (int) Math.ceil(range / step));
        Set<Long> visited = new HashSet<>();

        for (int i = 1; i <= maxSteps; i++) {
            Vec3d sample = eyePos.add(look.multiply(i * step));
            BlockPos pos = BlockPos.ofFloored(sample);
            long key = pos.asLong();
            if (!visited.add(key))
                continue;

            if (mc.player.squaredDistanceTo(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5) > range * range) {
                continue;
            }

            if (!isContainer(pos))
                continue;

            Direction side = Direction.getFacing(look.x, look.y, look.z).getOpposite();
            Vec3d hitVec = Vec3d.ofCenter(pos);
            return new BlockHitResult(hitVec, side, pos, false);
        }

        if (mc.crosshairTarget instanceof BlockHitResult normalHit
                && mc.crosshairTarget.getType() == HitResult.Type.BLOCK) {
            BlockPos pos = normalHit.getBlockPos();
            if (isContainer(pos)) {
                return normalHit;
            }
        }

        return null;
    }

    @Unique
    private boolean isContainer(BlockPos pos) {
        if (mc.world == null) {
            return false;
        }
        BlockState state = mc.world.getBlockState(pos);
        if (state.isOf(Blocks.CHEST) || state.isOf(Blocks.TRAPPED_CHEST) || state.isOf(Blocks.ENDER_CHEST)) {
            return true;
        }
        return state.createScreenHandlerFactory(mc.world, pos) != null;
    }

    @Inject(method = "attackEntity", at = @At("HEAD"), cancellable = true)
    public void attackEntityHook(PlayerEntity player, Entity target, CallbackInfo info) {
        if (!(target instanceof LivingEntity living))
            return;

        var eventAttack = new EventAttack.Swing(living);
        NexisClient.getEventBus().post(eventAttack);
        if (eventAttack.isCancelled()) {
            info.cancel();
        }
    }

    @Inject(method = "clickSlot", at = @At("HEAD"), cancellable = true)
    public void clickSlotHook(int syncId, int slotId, int button, SlotActionType actionType, PlayerEntity player,
            CallbackInfo info) {
        EventClickSlot event = new EventClickSlot(syncId, slotId, button, actionType);
        NexisClient.getEventBus().post(event);
        if (event.isCancelled())
            info.cancel();
    }
}
