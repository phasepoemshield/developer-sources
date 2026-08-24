package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.sound.Sound;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundSystem;
import net.minecraft.client.sound.SoundSystem.PlayResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.رش;

// $VF: Compiled from MixinSoundSystem.java
@Mixin(SoundSystem.class)
public class MixinSoundSystem {
   @Inject(method = "method_4853", at = @At("RETURN"), cancellable = true)
   private void rain$overrideSelectedSoundVolume(SoundInstance sound, CallbackInfoReturnable<Float> cir) {
      Float multiplier = رش.INSTANCE.getVolumeMultiplier(sound.getId(), rain$getSoundResourceId(sound));
      if (multiplier != null) {
         float adjustedVolume = (Float)cir.getReturnValue();
         cir.setReturnValue(MathHelper.clamp(adjustedVolume * multiplier, 0.0F, 1.0F));
      }
   }

   @Inject(method = "method_4854", at = @At("HEAD"), cancellable = true)
   private void rain$muteSelectedSoundPlayback(SoundInstance sound, CallbackInfoReturnable<PlayResult> cir) {
      if (رش.INSTANCE.shouldMutePlayback(sound.getId(), rain$getSoundResourceId(sound))) {
         cir.setReturnValue(PlayResult.STARTED_SILENTLY);
      }
   }

   @Unique
   private static Identifier rain$getSoundResourceId(SoundInstance soundInstance) {
      Sound sound = soundInstance.getSound();
      return sound != null ? sound.getIdentifier() : null;
   }

   @ModifyExpressionValue(method = "method_4854", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1140;method_43222(FLnet/minecraft/class_3419;)F"))
   private float rain$adjustSelectedSoundStartVolume(float adjustedVolume, SoundInstance sound) {
      Float multiplier = رش.INSTANCE.getVolumeMultiplier(sound.getId(), rain$getSoundResourceId(sound));
      return multiplier == null ? adjustedVolume : MathHelper.clamp(adjustedVolume * multiplier, 0.0F, 1.0F);
   }
}
