/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_418
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_418;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bt;

@Mixin(value={class_418.class})
public abstract class u {
    @Shadow
    private int field_2451;

    @Inject(method={"method_25393"}, at={@At(value="TAIL")})
    private void phobia$dispatchDeathScreenEvent(CallbackInfo ci2) {
        ax.callEvent(new bt(this.field_2451));
    }
}

