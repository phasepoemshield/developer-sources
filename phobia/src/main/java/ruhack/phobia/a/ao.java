/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1058
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4603
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.jk;

@Mixin(value={class_4603.class})
public class ao {
    @Inject(method={"method_23070"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderFireOverlayHook(class_4587 matrices, class_4597 vertexConsumers, class_1058 sprite, CallbackInfo ci2) {
        jk noRender = jk.getInstance();
        if (noRender.isState() && noRender.modeSetting.isSelected("Fire")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_23068"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderInWallOverlayHook(class_1058 sprite, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci2) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && noRender.modeSetting.isSelected("Block Overlay")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_23069"}, at={@At(value="HEAD")}, cancellable=true)
    private static void phobia$removeUnderwaterOverlay(class_310 client, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci2) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Underwater Blur")) {
            ci2.cancel();
        }
    }
}

