package kotakbaz.rain.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.اإ;
import oxxxde.بم;
import oxxxde.تغ;
import oxxxde.ثث;
import oxxxde.جم;
import oxxxde.ذم;
import oxxxde.رظ;
import oxxxde.شْ;
import oxxxde.ظظ;

// $VF: Compiled from MixinClientPlayerInteractionManager.java
@Mixin(ClientPlayerInteractionManager.class)
public class MixinClientPlayerInteractionManager {
   @Inject(method = "method_2906", at = @At("HEAD"), cancellable = true)
   private void onClickSlot(int actionType, int player, int syncId, SlotActionType button, PlayerEntity ci, CallbackInfo slotId) {
      if (!ظظ.INSTANCE.shouldBlockInventoryClick()
         && !ثث.INSTANCE.shouldBlockInventoryClick()
         && !بم.INSTANCE.shouldBlockInventoryClick()
         && !شْ.INSTANCE.shouldBlockInventoryClick()) {
         تغ event = new تغ(actionType, slotId, button, syncId);
         رظ.INSTANCE.post(event);
         if (event.getCancel()) {
            ci.cancel();
         }
      } else {
         ci.cancel();
      }
   }

   @Inject(method = "method_2919", at = @At("RETURN"))
   private void onInteractItem(PlayerEntity hand, Hand cir, CallbackInfoReturnable<ActionResult> player) {
      رظ.INSTANCE.post(new جم(player, hand, (ActionResult)cir.getReturnValue()));
   }

   @Inject(method = "method_2918", at = @At("HEAD"), cancellable = true)
   private void onAttackEntity(PlayerEntity ci, Entity target, CallbackInfo player) {
      if (اإ.INSTANCE.handleAttack(target)) {
         ci.cancel();
      } else {
         رظ.INSTANCE.post(new ذم(target));
      }
   }

   @Inject(method = "method_2896", at = @At("RETURN"))
   private void onInteractBlock(ClientPlayerEntity cir, Hand player, BlockHitResult hand, CallbackInfoReturnable<ActionResult> hitResult) {
      رظ.INSTANCE.post(new جم(player, hand, (ActionResult)cir.getReturnValue()));
   }
}
