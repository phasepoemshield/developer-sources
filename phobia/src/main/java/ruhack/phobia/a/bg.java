/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_1007
 *  net.minecraft.class_11659
 *  net.minecraft.class_11890
 *  net.minecraft.class_12075
 *  net.minecraft.class_1297
 *  net.minecraft.class_4587
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.jg;
import ruhack.phobia.jk;
import ruhack.phobia.jm;
import ruhack.phobia.jr;

@Mixin(value={class_1007.class})
public class bg {
    @Inject(method={"method_4213"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$hideGhostCopyLabel(class_10055 state, class_4587 matrices, class_11659 queue, class_12075 cameraState, CallbackInfo ci2) {
        if (jg.isGhostRenderPass()) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_62604"}, at={@At(value="TAIL")})
    private void phobia$shaderEspPlayers(class_11890 player, class_10055 state, float tickProgress, CallbackInfo ci2) {
        jm shaderESP;
        jk removals = jk.getInstance();
        if (removals != null && removals.isState()) {
            if (removals.modeSetting.isSelected("Glowing Players")) {
                state.field_61821 = 0;
            }
            if (removals.modeSetting.isSelected("Arrows")) {
                state.field_53539 = 0;
            }
        }
        if ((shaderESP = jm.getInstance()) != null && shaderESP.isState() && shaderESP.shouldOutline(player)) {
            state.field_61821 = shaderESP.usesCustomModelOutline(player) ? 0 : shaderESP.getOutlineColor();
        }
    }

    @Inject(method={"method_74935"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$forcePlayerTag(class_11890 player, double squaredDistance, CallbackInfoReturnable<Boolean> cir) {
        jr tags = jr.getInstance();
        if (tags != null && tags.isState() && tags.shouldTag((class_1297)player)) {
            cir.setReturnValue((Object)false);
        }
    }
}

