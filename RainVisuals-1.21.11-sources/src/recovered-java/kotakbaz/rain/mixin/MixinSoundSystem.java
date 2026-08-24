/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.sound.Sound
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.client.sound.SoundSystem
 *  net.minecraft.client.sound.SoundSystem$PlayResult
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.MathHelper
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.sound.Sound;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundSystem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0631\u0634;

@Mixin(value={SoundSystem.class})
public class MixinSoundSystem {
    @Inject(method={"method_4853"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$overrideSelectedSoundVolume(SoundInstance sound, CallbackInfoReturnable<Float> cir) {
        Float multiplier = \u0631\u0634.INSTANCE.getVolumeMultiplier(sound.getId(), MixinSoundSystem.rain$getSoundResourceId(sound));
        if (multiplier == null) {
            return;
        }
        float adjustedVolume = ((Float)cir.getReturnValue()).floatValue();
        cir.setReturnValue((Object)Float.valueOf(MathHelper.clamp((float)(adjustedVolume * multiplier.floatValue()), (float)0.0f, (float)1.0f)));
    }

    @Inject(method={"method_4854"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$muteSelectedSoundPlayback(SoundInstance sound, CallbackInfoReturnable<SoundSystem.PlayResult> cir) {
        if (\u0631\u0634.INSTANCE.shouldMutePlayback(sound.getId(), MixinSoundSystem.rain$getSoundResourceId(sound))) {
            cir.setReturnValue((Object)SoundSystem.PlayResult.STARTED_SILENTLY);
        }
    }

    @Unique
    private static Identifier rain$getSoundResourceId(SoundInstance soundInstance) {
        Sound sound = soundInstance.getSound();
        return sound != null ? sound.getIdentifier() : null;
    }

    @ModifyExpressionValue(method={"method_4854"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1140;method_43222(FLnet/minecraft/class_3419;)F")})
    private float rain$adjustSelectedSoundStartVolume(float adjustedVolume, SoundInstance sound) {
        Float multiplier = \u0631\u0634.INSTANCE.getVolumeMultiplier(sound.getId(), MixinSoundSystem.rain$getSoundResourceId(sound));
        if (multiplier == null) {
            return adjustedVolume;
        }
        return MathHelper.clamp((float)(adjustedVolume * multiplier.floatValue()), (float)0.0f, (float)1.0f);
    }
}

