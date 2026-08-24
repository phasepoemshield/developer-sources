package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.DropEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.رظ;

// $VF: Compiled from MixinClientPlayerEntity.java
@Mixin(ClientPlayerEntity.class)
public class MixinClientPlayerEntity {
   @Inject(method = "method_5773", at = @At("HEAD"))
   public void tickHook(CallbackInfo ci) {
      رظ.INSTANCE.post(new PlayerUpdateEvent());
   }

   @Inject(method = "method_7290", at = @At("HEAD"), cancellable = true)
   private void rain$lockSlotOnDrop(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
      ClientPlayerEntity player = (ClientPlayerEntity)this;
      DropEvent event = new DropEvent(player.getInventory().getSelectedSlot(), entireStack);
      رظ.INSTANCE.post(event);
      if (event.getCancel()) {
         cir.setReturnValue(false);
      }
   }
}
