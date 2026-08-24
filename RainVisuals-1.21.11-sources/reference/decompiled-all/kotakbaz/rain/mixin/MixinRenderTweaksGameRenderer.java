package kotakbaz.rain.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.صِ;

// $VF: Compiled from MixinRenderTweaksGameRenderer.java
@Mixin(GameRenderer.class)
public abstract class MixinRenderTweaksGameRenderer {
   @Inject(method = "method_3198", at = @At("HEAD"), cancellable = true)
   private void rain$cancelHurtCamera(MatrixStack tickProgress, float ci, CallbackInfo matrices) {
      if (صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoHurtCam().getValue()) {
         ci.cancel();
      }
   }
}
