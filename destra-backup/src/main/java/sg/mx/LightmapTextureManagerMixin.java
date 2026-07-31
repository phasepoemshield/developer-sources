package sg.mx;

import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import ru.destra.module.FullBrightModule;

@Mixin(LightmapTextureManager.class)
public class LightmapTextureManagerMixin {
   @ModifyArg(method = "update", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gl/Uniform;set(I)V", ordinal = 0))
   private int destra$forceBrightLightmap(int var1) {
      return FullBrightModule.isFullBrightEnabled() ? 1 : var1;
   }

   @ModifyArg(method = "update", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gl/Uniform;set(F)V", ordinal = 3))
   private float destra$boostNightVisionFactor(float var1) {
      return FullBrightModule.isFullBrightEnabled() ? 1.0F : var1;
   }

   @ModifyArg(method = "update", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gl/Uniform;set(F)V", ordinal = 4))
   private float destra$disableDarknessScale(float var1) {
      return FullBrightModule.isFullBrightEnabled() ? 0.0F : var1;
   }

   @ModifyArg(method = "update", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gl/Uniform;set(F)V", ordinal = 5))
   private float destra$disableWorldDarkening(float var1) {
      return FullBrightModule.isFullBrightEnabled() ? 0.0F : var1;
   }

   @ModifyArg(method = "update", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gl/Uniform;set(F)V", ordinal = 6))
   private float destra$boostBrightnessFactor(float var1) {
      return FullBrightModule.isFullBrightEnabled() ? Math.max(var1, FullBrightModule.getFullBrightGamma()) : var1;
   }
}
