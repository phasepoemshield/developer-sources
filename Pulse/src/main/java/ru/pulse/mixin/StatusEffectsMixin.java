package ru.pulse.mixin;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulse.modules.visuals.RenderTweaks;
import pulse.module.ModuleRegistry;

@Mixin({LivingEntity.class})
public class StatusEffectsMixin {
    @Inject(method = {"hasStatusEffect"}, at = {@At("HEAD")}, cancellable = true)
    private void onHasStatusEffect(RegistryEntry<StatusEffect> RegistryEntryVar, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        RenderTweaks renderTweaks;
        if ((((Object)this) instanceof ClientPlayerEntity) && (renderTweaks = ModuleRegistry.RENDER_TWEAKS) != null && RegistryEntryVar == StatusEffects.WITHER && renderTweaks.t()) {
            callbackInfoReturnable.setReturnValue(false);
        }
    }
}
