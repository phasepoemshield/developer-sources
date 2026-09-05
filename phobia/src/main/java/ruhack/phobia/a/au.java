/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_10185
 *  net.minecraft.class_3532
 *  net.minecraft.class_743
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_10185;
import net.minecraft.class_3532;
import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import ruhack.phobia.ax;
import ruhack.phobia.c;
import ruhack.phobia.cj;
import ruhack.phobia.ot;
import ruhack.phobia.ou;
import ruhack.phobia.ov;

@Mixin(value={class_743.class})
public class au {
    @ModifyExpressionValue(method={"method_3129"}, at={@At(value="NEW", target="(ZZZZZZZ)Lnet/minecraft/class_10185;")})
    private class_10185 tickHook(class_10185 original) {
        cj event = new cj(original);
        ax.callEvent(event);
        return this.transformInput(event.getInput());
    }

    @Unique
    private class_10185 transformInput(class_10185 input) {
        ot rotationController = ot.INSTANCE;
        ov angle = rotationController.getCurrentAngle();
        ou configurable = rotationController.getCurrentRotationPlan();
        if (c.mc.field_1724 == null || angle == null || configurable == null || !configurable.isMoveCorrection() || !configurable.isFreeCorrection()) {
            return input;
        }
        float deltaYaw = c.mc.field_1724.method_36454() - angle.getYaw();
        float z2 = class_743.method_40218((boolean)input.comp_3159(), (boolean)input.comp_3160());
        float x2 = class_743.method_40218((boolean)input.comp_3161(), (boolean)input.comp_3162());
        float newX = x2 * class_3532.method_15362((double)(deltaYaw * ((float)Math.PI / 180))) - z2 * class_3532.method_15374((double)(deltaYaw * ((float)Math.PI / 180)));
        float newZ = z2 * class_3532.method_15362((double)(deltaYaw * ((float)Math.PI / 180))) + x2 * class_3532.method_15374((double)(deltaYaw * ((float)Math.PI / 180)));
        int movementSideways = Math.round(newX);
        int movementForward = Math.round(newZ);
        return new class_10185((float)movementForward > 0.0f, (float)movementForward < 0.0f, (float)movementSideways > 0.0f, (float)movementSideways < 0.0f, input.comp_3163(), input.comp_3164(), input.comp_3165());
    }
}

