/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_1297
 *  net.minecraft.class_1531
 *  net.minecraft.class_897
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1531;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ff;
import ruhack.phobia.jk;
import ruhack.phobia.jr;

@Mixin(value={class_897.class})
public abstract class y<T extends class_1297, S extends class_10017> {
    @Inject(method={"method_3921"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$forceTag(T entity, double squaredDistance, CallbackInfoReturnable<Boolean> cir) {
        jr tags = jr.getInstance();
        if (tags != null && tags.isState() && tags.shouldTag((class_1297)entity)) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_62354"}, at={@At(value="TAIL")})
    private void phobia$updateTag(T entity, S state, float tickDelta, CallbackInfo ci2) {
        jk removals;
        if (ff.shadowsDisabled()) {
            ((class_10017)state).field_61823.clear();
            ((class_10017)state).field_61822 = 0.0f;
        }
        if ((removals = jk.getInstance()) != null && removals.isState()) {
            if (removals.modeSetting.isSelected("Shadows")) {
                ((class_10017)state).field_61823.clear();
                ((class_10017)state).field_61822 = 0.0f;
            }
            if (entity instanceof class_1531 && removals.modeSetting.isSelected("Holograms")) {
                ((class_10017)state).field_53337 = null;
                ((class_10017)state).field_53338 = null;
            }
        }
    }
}

