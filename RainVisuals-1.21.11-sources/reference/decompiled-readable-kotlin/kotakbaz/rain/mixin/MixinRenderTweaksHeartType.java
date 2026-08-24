package kotakbaz.rain.mixin;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oxxxde.صِ;

// $VF: Compiled from MixinRenderTweaksHeartType.java
@Mixin(targets = "net/minecraft/class_329$class_6411")
public class MixinRenderTweaksHeartType {
   @Redirect(method = "method_37301", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1657;method_6059(Lnet/minecraft/class_6880;)Z", ordinal = 1))
   private static boolean rain$ignoreWitherHeartType(PlayerEntity effect, RegistryEntry<StatusEffect> player) {
      return صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoBlackHearts().getValue() && effect == StatusEffects.WITHER ? false : player.hasStatusEffect(effect);
   }
}
