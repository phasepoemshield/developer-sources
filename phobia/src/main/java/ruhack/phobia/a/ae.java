/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4185
 *  net.minecraft.class_433
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_4185;
import net.minecraft.class_433;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.fg;

@Mixin(value={class_433.class})
public abstract class ae {
    @Shadow
    private class_4185 field_40792;

    @Inject(method={"method_20543", "method_25393"}, at={@At(value="TAIL")})
    private void updateDisconnectButton(CallbackInfo ci2) {
        if (this.field_40792 != null) {
            this.field_40792.field_22763 = !fg.shouldBlockExit();
        }
    }
}

