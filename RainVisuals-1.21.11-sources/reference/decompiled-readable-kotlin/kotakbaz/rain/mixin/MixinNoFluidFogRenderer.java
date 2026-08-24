package kotakbaz.rain.mixin;

import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.شص;

// $VF: Compiled from MixinNoFluidFogRenderer.java
@Mixin(FogRenderer.class)
public class MixinNoFluidFogRenderer {
   @Inject(method = "method_71652", at = @At("RETURN"), cancellable = true)
   private void rain$clearFluidFog(Camera camera, CallbackInfoReturnable<CameraSubmersionType> cir) {
      CameraSubmersionType current = (CameraSubmersionType)cir.getReturnValue();
      boolean clearWater = current == CameraSubmersionType.WATER && شص.INSTANCE.shouldClearWaterFog();
      boolean clearLava = current == CameraSubmersionType.LAVA && شص.INSTANCE.shouldClearLavaFog();
      if (clearWater || clearLava) {
         cir.setReturnValue(CameraSubmersionType.ATMOSPHERIC);
      }
   }
}
