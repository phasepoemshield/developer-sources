/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_12074
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_761
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_12074;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ja;

@Mixin(value={class_761.class})
public class c {
    @Inject(method={"method_22712"}, at={@At(value="HEAD")}, cancellable=true)
    private void onDrawBlockOutline(class_4587 matrices, class_4588 vertexConsumer, double x2, double y2, double z2, class_12074 state, int color, float lineWidth, CallbackInfo ci2) {
        ja blockOverlay = ja.getInstance();
        if (blockOverlay != null && blockOverlay.isState()) {
            ci2.cancel();
        }
    }
}

