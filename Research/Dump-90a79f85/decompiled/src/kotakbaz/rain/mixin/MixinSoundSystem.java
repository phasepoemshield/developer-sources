/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1111
 *  net.minecraft.class_1113
 *  net.minecraft.class_1140
 *  net.minecraft.class_1140$class_11518
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import kotakbaz.rain.module.modules.player.i_0;
import net.minecraft.class_1111;
import net.minecraft.class_1113;
import net.minecraft.class_1140;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1140.class})
public class MixinSoundSystem {
    public MixinSoundSystem() {
        super();
    }

    @ModifyExpressionValue(method={"method_4854"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1140;method_43222(FLnet/minecraft/class_3419;)F")})
    private float rain$adjustSelectedSoundStartVolume(float adjustedVolume, class_1113 sound) {
        Float multiplier = i_0.INSTANCE.getVolumeMultiplier(sound.method_4775(), MixinSoundSystem.rain$getSoundResourceId(sound));
        if (multiplier == null) {
            return adjustedVolume;
        }
        return class_3532.method_15363((float)(adjustedVolume * multiplier.floatValue()), (float)0.0f, (float)1.0f);
    }

    @Inject(method={"method_4853"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$overrideSelectedSoundVolume(class_1113 sound, CallbackInfoReturnable<Float> cir) {
        Float multiplier = i_0.INSTANCE.getVolumeMultiplier(sound.method_4775(), MixinSoundSystem.rain$getSoundResourceId(sound));
        if (multiplier == null) {
            return;
        }
        float adjustedVolume = ((Float)cir.getReturnValue()).floatValue();
        cir.setReturnValue((Object)Float.valueOf(class_3532.method_15363((float)(adjustedVolume * multiplier.floatValue()), (float)0.0f, (float)1.0f)));
    }

    @Inject(method={"method_4854"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$muteSelectedSoundPlayback(class_1113 sound, CallbackInfoReturnable<class_1140.class_11518> cir) {
        if (i_0.INSTANCE.shouldMutePlayback(sound.method_4775(), MixinSoundSystem.rain$getSoundResourceId(sound))) {
            cir.setReturnValue((Object)class_1140.class_11518.field_60955);
        }
    }

    @Unique
    private static class_2960 rain$getSoundResourceId(class_1113 soundInstance) {
        class_1111 sound = soundInstance.method_4776();
        return sound != null ? sound.method_4767() : null;
    }
}

