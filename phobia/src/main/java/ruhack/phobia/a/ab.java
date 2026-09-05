/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.class_1309
 *  net.minecraft.class_1671
 *  net.minecraft.class_243
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import ruhack.phobia.ax;
import ruhack.phobia.by;
import ruhack.phobia.c;
import ruhack.phobia.ot;

@Mixin(value={class_1671.class})
public class ab
implements c {
    @Shadow
    @Nullable
    private class_1309 field_7616;

    @WrapOperation(method={"method_5773"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;")})
    public class_243 getRotationVectorHook(class_1309 instance, Operation<class_243> original) {
        if (this.field_7616 == ab.mc.field_1724) {
            return ot.INSTANCE.getMoveRotation().toVector();
        }
        return (class_243)original.call(new Object[]{instance});
    }

    @ModifyArg(method={"method_5773"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_18799(Lnet/minecraft/class_243;)V", ordinal=0), index=0)
    private class_243 modifyFireworkBoost(class_243 vanillaVelocity) {
        if (this.field_7616 != ab.mc.field_1724 || this.field_7616 == null) {
            return vanillaVelocity;
        }
        class_243 direction = ot.INSTANCE.getMoveRotation().toVector();
        by event = new by(1.5f, 0.1f, 0.5f, direction);
        ax.callEvent(event);
        class_243 velocity = this.field_7616.method_18798();
        class_243 boostDirection = event.getDirection();
        return velocity.method_1031(boostDirection.field_1352 * (double)event.getBaseBoost() + (boostDirection.field_1352 * (double)event.getBoostMultiplier() - velocity.field_1352) * (double)event.getSmoothingFactor(), boostDirection.field_1351 * (double)event.getBaseBoost() + (boostDirection.field_1351 * (double)event.getYSpeed() - velocity.field_1351) * (double)event.getSmoothingFactor(), boostDirection.field_1350 * (double)event.getBaseBoost() + (boostDirection.field_1350 * (double)event.getBoostMultiplier() - velocity.field_1350) * (double)event.getSmoothingFactor());
    }
}

