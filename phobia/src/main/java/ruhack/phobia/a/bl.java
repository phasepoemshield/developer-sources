/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2394
 *  net.minecraft.class_2396
 *  net.minecraft.class_2398
 *  net.minecraft.class_702
 *  net.minecraft.class_703
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_2394;
import net.minecraft.class_2396;
import net.minecraft.class_2398;
import net.minecraft.class_702;
import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ff;
import ruhack.phobia.jk;

@Mixin(value={class_702.class})
public class bl {
    @Inject(method={"method_3056(Lnet/minecraft/class_2394;DDDDDD)Lnet/minecraft/class_703;"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeParticles(class_2394 effect, double x2, double y2, double z2, double velocityX, double velocityY, double velocityZ, CallbackInfoReturnable<class_703> cir) {
        jk removals = jk.getInstance();
        if (removals == null || !removals.isState()) {
            return;
        }
        class_2396 type = effect.method_10295();
        if (removals.modeSetting.isSelected("Destroy Particles") && (type == class_2398.field_11217 || type == class_2398.field_35434 || type == class_2398.field_11206 || type == class_2398.field_50248)) {
            cir.setReturnValue(null);
            return;
        }
        if (removals.modeSetting.isSelected("Smoke") && (type == class_2398.field_11251 || type == class_2398.field_11237 || type == class_2398.field_17430 || type == class_2398.field_17431)) {
            cir.setReturnValue(null);
        }
    }

    @Inject(method={"method_3058(Lnet/minecraft/class_703;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$skipParticleQueue(class_703 particle, CallbackInfo ci2) {
        if (ff.particlesDisabled()) {
            ci2.cancel();
        }
    }
}
