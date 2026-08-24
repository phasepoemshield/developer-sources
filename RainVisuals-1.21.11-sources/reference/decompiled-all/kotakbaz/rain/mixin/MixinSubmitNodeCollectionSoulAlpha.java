package kotakbaz.rain.mixin;

import net.minecraft.client.render.command.BatchingRenderCommandQueue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import oxxxde.صد;

// $VF: Compiled from MixinSubmitNodeCollectionSoulAlpha.java
@Mixin(BatchingRenderCommandQueue.class)
public class MixinSubmitNodeCollectionSoulAlpha {
   @ModifyVariable(method = "method_73494", at = @At("HEAD"), argsOnly = true, ordinal = 2)
   private int rain$applySoulModelPartAlpha(int color) {
      return صد.applyAlpha(color);
   }

   @ModifyVariable(method = "method_73490", at = @At("HEAD"), argsOnly = true, ordinal = 2)
   private int rain$applySoulModelAlpha(int color) {
      return صد.applyAlpha(color);
   }
}
