package kotakbaz.rain.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.رظ;
import oxxxde.سح;
import oxxxde.شض;

// $VF: Compiled from MixinClientPlayerEntity.java
@Mixin(ClientPlayerEntity.class)
public class MixinClientPlayerEntity {
   @Inject(method = "method_5773", at = @At("HEAD"))
   public void tickHook(CallbackInfo ci) {
      رظ.INSTANCE.post(new سح());
   }

   @Inject(method = "method_7290", at = @At("HEAD"), cancellable = true)
   private void rain$lockSlotOnDrop(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
      ClientPlayerEntity player = (ClientPlayerEntity)this;
      شض event = new شض(player.getInventory().getSelectedSlot(), entireStack);
      رظ.INSTANCE.post(event);
      if (event.getCancel()) {
         cir.setReturnValue(false);
      }
   }
}
