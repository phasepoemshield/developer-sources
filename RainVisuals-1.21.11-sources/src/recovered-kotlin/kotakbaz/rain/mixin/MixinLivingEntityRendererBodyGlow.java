package kotakbaz.rain.mixin;

import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.أ;
import oxxxde.ضذ;

// $VF: Compiled from MixinLivingEntityRendererBodyGlow.java
@Mixin(LivingEntityRenderer.class)
public class MixinLivingEntityRendererBodyGlow {
   @Inject(method = "method_4054", at = @At("HEAD"))
   private void rain$submitBodyGlow(
      LivingEntityRenderState collector, MatrixStack cameraState, OrderedRenderCommandQueue state, CameraRenderState matrices, CallbackInfo ci
   ) {
      int entityId = ((ضذ)state).rain$getEntityId();
      أ.INSTANCE.submitAura(entityId, state, matrices, collector, cameraState);
   }
}
