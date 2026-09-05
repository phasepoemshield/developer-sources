/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11653
 *  net.minecraft.class_310
 *  net.minecraft.class_3928
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_11653;
import net.minecraft.class_310;
import net.minecraft.class_3928;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.nb;

@Mixin(value={class_3928.class})
public abstract class aw {
    @Shadow
    private class_11653 field_61631;
    @Unique
    private int phobia$loadingTicks;

    @Inject(method={"method_25393"}, at={@At(value="TAIL")})
    private void phobia$unstickLoading(CallbackInfo ci2) {
        ++this.phobia$loadingTicks;
        if (this.field_61631 != null && this.field_61631.method_72902()) {
            return;
        }
        if (nb.shouldForceClose(this.phobia$loadingTicks, class_310.method_1551())) {
            ((class_3928)this).method_25419();
        }
    }
}

