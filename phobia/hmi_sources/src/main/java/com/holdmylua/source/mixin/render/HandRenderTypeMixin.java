/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.render;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets={"net/minecraft/class_759$class_5773"})
public abstract class HandRenderTypeMixin {
    @Shadow
    @Mutable
    private boolean field_28387;
    @Shadow
    @Mutable
    private boolean field_28388;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void makeBothHandsRenderTrue(String string, int i, boolean renderMainHand, boolean renderOffHand, CallbackInfo ci) {
        this.field_28387 = true;
        this.field_28388 = true;
    }
}

