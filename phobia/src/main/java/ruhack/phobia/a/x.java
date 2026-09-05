/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_10055
 *  net.minecraft.class_11659
 *  net.minecraft.class_12075
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 *  net.minecraft.class_898
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.jk;

@Mixin(value={class_898.class})
public class x {
    @Inject(method={"method_72976"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removePlayers(class_10017 state, class_12075 cameraState, double x2, double y2, double z2, class_4587 matrices, class_11659 queue, CallbackInfo ci2) {
        if (!(state instanceof class_10055)) {
            return;
        }
        class_10055 playerState = (class_10055)state;
        jk removals = jk.getInstance();
        class_746 player = class_310.method_1551().field_1724;
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Players") && (player == null || playerState.field_53528 != player.method_5628())) {
            ci2.cancel();
        }
    }
}

