/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1937
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ax;
import ruhack.phobia.bl;
import ruhack.phobia.c;
import ruhack.phobia.cx;
import ruhack.phobia.ot;

@Mixin(value={class_1297.class})
public abstract class w
implements c {
    @Shadow
    private class_238 field_6005;
    @Shadow
    public float field_6031;
    @Unique
    private boolean client$local;

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void onInit(class_1299<?> type, class_1937 world, CallbackInfo ci2) {
        this.client$local = (class_1297)this instanceof class_746;
    }

    @Inject(method={"getBoundingBox"}, at={@At(value="HEAD")}, cancellable=true)
    public final void getBoundingBox(CallbackInfoReturnable<class_238> cir) {
        bl event = new bl(this.field_6005, (class_1297)this);
        ax.callEvent(event);
        cir.setReturnValue((Object)event.getBox());
    }

    @Redirect(method={"updateVelocity"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;movementInputToVelocity(Lnet/minecraft/util/math/Vec3d;FF)Lnet/minecraft/util/math/Vec3d;"))
    public class_243 hookVelocity(class_243 movementInput, float speed, float yaw) {
        if (this == w.mc.field_1724) {
            cx event = new cx(movementInput, speed, yaw, class_1297.method_18795((class_243)movementInput, (float)speed, (float)yaw));
            ax.callEvent(event);
            return event.getVelocity();
        }
        return class_1297.method_18795((class_243)movementInput, (float)speed, (float)yaw);
    }

    @ModifyVariable(method={"getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;"}, at=@At(value="HEAD"), ordinal=0, argsOnly=true)
    private float modifyPitch(float pitch) {
        if (this instanceof class_746 && ot.INSTANCE.getCurrentAngle() != null) {
            return ot.INSTANCE.getCurrentAngle().getPitch();
        }
        return pitch;
    }

    @ModifyVariable(method={"getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;"}, at=@At(value="HEAD"), ordinal=1, argsOnly=true)
    private float modifyYaw(float yaw) {
        if (this instanceof class_746 && ot.INSTANCE.getCurrentAngle() != null) {
            return ot.INSTANCE.getCurrentAngle().getYaw();
        }
        return yaw;
    }
}
