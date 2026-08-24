package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.رظ;
import oxxxde.زش;

// $VF: Compiled from MixinLivingEntity.java
@Mixin(LivingEntity.class)
public class MixinLivingEntity {
   @Inject(method = "method_6043", at = @At("HEAD"))
   public void hookJumpEvent(CallbackInfo ci) {
      if (this == MinecraftClient.getInstance().player) {
         رظ.INSTANCE.post(new زش());
      }
   }
}
