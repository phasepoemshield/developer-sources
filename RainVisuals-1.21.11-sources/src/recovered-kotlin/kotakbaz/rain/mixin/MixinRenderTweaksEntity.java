package kotakbaz.rain.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.صِ;

// $VF: Compiled from MixinRenderTweaksEntity.java
@Mixin(Entity.class)
public class MixinRenderTweaksEntity {
   @Inject(method = "method_5809", at = @At("HEAD"), cancellable = true)
   private void rain$cancelPlayerFireOverlay(CallbackInfoReturnable<Boolean> cir) {
      if (this instanceof ClientPlayerEntity) {
         if (صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoFire().getValue()) {
            cir.setReturnValue(false);
         }
      }
   }

   @Inject(method = "method_5851", at = @At("HEAD"), cancellable = true)
   private void rain$cancelEntityGlow(CallbackInfoReturnable<Boolean> cir) {
      if (صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoGlow().getValue()) {
         cir.setReturnValue(false);
      }
   }
}
