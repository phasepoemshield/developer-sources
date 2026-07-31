package zenith.zov.utility.mixin.client_core;

import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.ZenithInternal031;
import zenith.EventImpl_19;
import zenith.EventBus;
import zenith.Event;
import zenith.GetSlotIdHandler_2;
import zenith.BlockPosHolder_2;

@Mixin({ClientPlayerInteractionManager.class})
public class MixinClientPlayerInteractionManager {
   @Inject(
      method = {"clickSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void clickSlotHook(int i, int j, int k, SlotActionType SlotActionType, PlayerEntity PlayerEntity, CallbackInfo callbackinfo) {
      GetSlotIdHandler_2 lilli1ilililii1i1 = new GetSlotIdHandler_2(i, j, k, SlotActionType);
      EventBus.StringHolder_8((Event)lilli1ilililii1i1);
      if (lilli1ilililii1i1.Event()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"updateBlockBreakingProgress"},
      at = {@At("HEAD")}
   )
   private void injectBlockBreaking(BlockPos BlockPos, Direction Direction, CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      EventBus.StringHolder_8((Event)(new BlockPosHolder_2(BlockPos, Direction)));
   }

   @Inject(
      method = {"interactItem"},
      at = {@At("HEAD")}
   )
   private void interactBlock(PlayerEntity PlayerEntity, Hand Hand, CallbackInfoReturnable<ActionResult> callbackinforeturnable) {
      EventBus.StringHolder_8((Event)(new EventImpl_19()));
   }

   @Inject(
      method = {"interactBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void interactBlock(ClientPlayerEntity ClientPlayerEntity, Hand Hand, BlockHitResult BlockHitResult, CallbackInfoReturnable<ActionResult> callbackinforeturnable) {
      ZenithInternal031 i1lllii11il = new ZenithInternal031();
      EventBus.StringHolder_8((Event)i1lllii11il);
      if (i1lllii11il.Event()) {
         callbackinforeturnable.setReturnValue(ActionResult.FAIL);
      }
   }
}
