package sg.mx;

import net.minecraft.client.render.Frustum;
import net.minecraft.util.math.Box;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.module.AspectRatioModule;

@Mixin(Frustum.class)
public class FrustumMixin {
   @Inject(method = "isVisible", at = @At("HEAD"), cancellable = true)
   private void destra$disableAspectRatioFrustum(Box var1, CallbackInfoReturnable<Boolean> var2) {
      DestraClient var3 = DestraClient.getInstance();
      if (var3 != null && var3.getModuleManager() != null) {
         AspectRatioModule var4 = var3.getModuleManager().aspectRatio;
         if (var4 != null && var4.isTransitioning()) {
            var2.setReturnValue(true);
         }
      }
   }
}
