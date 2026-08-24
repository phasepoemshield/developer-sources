package kotakbaz.rain.mixin;

import net.minecraft.client.world.ClientWorld.Properties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.رز;

// $VF: Compiled from MixinTimeChangerClientWorldProperties.java
@Mixin(Properties.class)
public class MixinTimeChangerClientWorldProperties {
   @Inject(method = "method_217", at = @At("RETURN"), cancellable = true)
   private void rain$modifyClientTime(CallbackInfoReturnable<Long> cir) {
      cir.setReturnValue(رز.INSTANCE.modifyTime((Long)cir.getReturnValue()));
   }
}
