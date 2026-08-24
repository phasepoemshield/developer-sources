package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.رو;

// $VF: Compiled from MixinLivingEntityRendererThirdName.java
@Mixin(LivingEntityRenderer.class)
public class MixinLivingEntityRendererThirdName {
   @Inject(method = "method_4055", at = @At("HEAD"), cancellable = true)
   private void rain$showThirdName(LivingEntity entity, double cir, CallbackInfoReturnable<Boolean> squaredDistanceToCamera) {
      if (رو.INSTANCE.isEnabled()) {
         MinecraftClient mc = MinecraftClient.getInstance();
         if (entity == mc.player) {
            cir.setReturnValue(!mc.options.getPerspective().isFirstPerson());
         }
      }
   }
}
