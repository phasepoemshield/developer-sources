package kotakbaz.rain.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.SkyRendering;
import net.minecraft.client.render.state.SkyRenderState;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.بؤ;

// $VF: Compiled from MixinCustomFogClientWorld.java
@Mixin(SkyRendering.class)
public class MixinCustomFogClientWorld {
   @Inject(method = "method_74926", at = @At("RETURN"))
   private void rain$modifySkyColor(ClientWorld ci, float tickProgress, Camera camera, SkyRenderState level, CallbackInfo state) {
      state.skyColor = بؤ.INSTANCE.fogSkyArgb(state.skyColor);
   }
}
