/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10026
 *  net.minecraft.class_11659
 *  net.minecraft.class_12075
 *  net.minecraft.class_4587
 *  net.minecraft.class_906
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_10026;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_4587;
import net.minecraft.class_906;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.jk;

@Mixin(value={class_906.class})
public class ad {
    @Inject(method={"method_3974"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeFishingRod(class_10026 state, class_4587 matrices, class_11659 queue, class_12075 cameraState, CallbackInfo ci2) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Fishing Rod")) {
            ci2.cancel();
        }
    }
}

