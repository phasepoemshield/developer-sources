package sg.mx;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.module.WorldCustomizerModule;

@Mixin(World.class)
public abstract class WorldMixin {
   @Inject(method = "getRainGradient", at = @At("HEAD"), cancellable = true)
   private void destra$getRainGradient(float var1, CallbackInfoReturnable<Float> var2) {
      WorldCustomizerModule var3 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().worldCustomizer
         : null;
      if (var3 != null && var3.isWeatherChangeEnabled()) {
         var2.setReturnValue(var3.getRainStrength());
      }
   }

   @Inject(method = "getThunderGradient", at = @At("HEAD"), cancellable = true)
   private void destra$getThunderGradient(float var1, CallbackInfoReturnable<Float> var2) {
      WorldCustomizerModule var3 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().worldCustomizer
         : null;
      if (var3 != null && var3.isWeatherChangeEnabled()) {
         var2.setReturnValue(var3.getThunderStrength());
      }
   }
}
