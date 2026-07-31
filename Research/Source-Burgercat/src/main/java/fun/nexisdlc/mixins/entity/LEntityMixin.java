package fun.nexisdlc.mixins.entity;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.utils.player.SwingUtils;
import fun.nexisdlc.mixins.accessors.LEntityAccessor;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.player.PlayerUtilsFunction;
import fun.nexisdlc.modules.impl.utils.Tweaks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(LivingEntity.class)
public abstract class LEntityMixin implements LEntityAccessor {
    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        if (PlayerUtilsFunction.NoJumpDelay.get() && getLastJumpCooldown() > 0) {
            setLastJumpCooldown(0);
        }
    }

    @Inject(at = @At("HEAD"), method = "getHandSwingDuration", cancellable = true)
    private void swingSpeedChange(CallbackInfoReturnable<Integer> cir) {
        if ((Object) this == mc.player) {
            var defaultValue = Tweaks.fasterAttackAnimation.get() ? Tweaks.fasterAttackAnimationValue.get().intValue() : 6;

            if (SwingUtils.isSwingAnimEnabled() && !SwingUtils.getSwingAnimations().onlyAura.get()) {
                cir.setReturnValue(SwingUtils.getSwingAnimations().swingSpeed.get().intValue());
            } else if (SwingUtils.isSwingAnimEnabled() && SwingUtils.getSwingAnimations().onlyAura.get() &&
                    AuraModule.target != null) {
                cir.setReturnValue(SwingUtils.getSwingAnimations().swingSpeed.get().intValue());
            } else {
                if (StatusEffectUtil.hasHaste(mc.player)) {
                    cir.setReturnValue(defaultValue - (1 + StatusEffectUtil.getHasteAmplifier(mc.player)));
                } else {
                    cir.setReturnValue(mc.player.hasStatusEffect(StatusEffects.MINING_FATIGUE) ? defaultValue + (1 + mc.player.getStatusEffect(StatusEffects.MINING_FATIGUE).getAmplifier()) * 2 : 6);
                }
            }

            if (Tweaks.fasterAttackAnimation.get() && NexisClient.getFunctionManager().getTweaks().isState()) {
                cir.setReturnValue(defaultValue);
            }
        }
    }
}
