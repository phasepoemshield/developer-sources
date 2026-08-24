/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.registry.entry.RegistryEntry
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oxxxde.\u0635\u0650;

@Mixin(targets={"net/minecraft/class_329$class_6411"})
public class MixinRenderTweaksHeartType {
    @Redirect(method={"method_37301"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_6059(Lnet/minecraft/class_6880;)Z", ordinal=1))
    private static boolean rain$ignoreWitherHeartType(PlayerEntity player, RegistryEntry<StatusEffect> effect) {
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoBlackHearts().getValue()).booleanValue() && effect == StatusEffects.WITHER) {
            return false;
        }
        return player.hasStatusEffect(effect);
    }
}

