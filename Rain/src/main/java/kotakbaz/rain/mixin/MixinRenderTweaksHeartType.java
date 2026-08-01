/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.RenderTweaksModule;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets={"net/minecraft/class_329$class_6411"})
public class MixinRenderTweaksHeartType {
    @Redirect(method={"method_37301"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_6059(Lnet/minecraft/class_6880;)Z", ordinal=1))
    private static boolean rain$ignoreWitherHeartType(PlayerEntity player, RegistryEntry<StatusEffect> effect) {
        if (RenderTweaksModule.INSTANCE.isEnabled() && ((Boolean)RenderTweaksModule.INSTANCE.getNoBlackHearts().getValue()).booleanValue() && effect == StatusEffects.WITHER) {
            return false;
        }
        return player.hasStatusEffect(effect);
    }
}

