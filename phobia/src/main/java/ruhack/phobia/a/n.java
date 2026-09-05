/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1313
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import net.minecraft.class_1313;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.c;
import ruhack.phobia.cq;
import ruhack.phobia.cu;
import ruhack.phobia.cv;
import ruhack.phobia.cy;
import ruhack.phobia.cz;
import ruhack.phobia.cz$Type;
import ruhack.phobia.dg;
import ruhack.phobia.nq;
import ruhack.phobia.ot;

@Mixin(value={class_746.class})
public abstract class n
extends class_742 {
    @Final
    @Shadow
    protected class_310 field_3937;
    private double prevX = 0.0;
    private double prevZ = 0.0;
    private float prevBodyYaw = 0.0f;

    public n(class_638 world, GameProfile profile) {
        super(world, profile);
    }

    @Shadow
    protected abstract void method_3148(float var1, float var2);

    @Inject(method={"method_5784"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_742;method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V")}, cancellable=true)
    public void onMoveHook(class_1313 movementType, class_243 movement, CallbackInfo ci2) {
        cq event = new cq(movement);
        ax.callEvent(event);
        class_243 from = this.method_73189();
        double d2 = this.method_23317();
        double e2 = this.method_23321();
        super.method_5784(movementType, event.getMovement());
        if (movementType == class_1313.field_6308) {
            ax.callEvent(new cu(from, this.method_73189(), this.method_24828(), this.field_6017));
        }
        this.method_3148((float)(this.method_23317() - d2), (float)(this.method_23321() - e2));
        ci2.cancel();
    }

    @Inject(method={"method_30673"}, at={@At(value="HEAD")}, cancellable=true)
    public void pushOutOfBlocks(double x2, double z2, CallbackInfo ci2) {
        cz event = new cz(cz$Type.BLOCK);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_5773"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_742;method_5773()V", shift=At.Shift.AFTER)})
    private void onPostPlayerTick(CallbackInfo ci2) {
        if (this.field_3937.field_1724 != null && this.field_3937.field_1687 != null) {
            ax.callEvent(new cy());
        }
    }

    @Inject(method={"method_5773"}, at={@At(value="TAIL")})
    private void onPlayerTickTail(CallbackInfo ci2) {
        if (this.field_3937.field_1724 != null && this.field_3937.field_1687 != null) {
            ax.callEvent(new cv());
        }
    }

    @Redirect(method={"method_67270"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_241;method_35582(F)Lnet/minecraft/class_241;", ordinal=1))
    private class_241 cancelItemSlowdown(class_241 vec2f, float multiplier) {
        dg event = new dg(1);
        ax.callEvent(event);
        if (event.isCancelled() && this.method_6115() && !this.method_5765()) {
            return vec2f.method_35582(1.0f);
        }
        return vec2f.method_35582(multiplier);
    }

    @ModifyExpressionValue(method={"method_3136"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_36454()F")})
    private float hookSilentRotationYaw(float original) {
        if (c.mc.field_1724 != null && ot.INSTANCE.getRotation() != null) {
            float newBodyYaw;
            float currentYaw = ot.INSTANCE.getRotation().getYaw();
            this.prevBodyYaw = newBodyYaw = nq.calculateBodyYaw(currentYaw, this.prevBodyYaw, this.prevX, this.prevZ, c.mc.field_1724.method_23317(), c.mc.field_1724.method_23321(), c.mc.field_1724.field_6251);
            this.prevX = c.mc.field_1724.method_23317();
            this.prevZ = c.mc.field_1724.method_23321();
            c.mc.field_1724.method_5636(newBodyYaw);
            return currentYaw;
        }
        return original;
    }

    @ModifyExpressionValue(method={"method_3136"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_36455()F")})
    private float hookSilentRotationPitch(float original) {
        return ot.INSTANCE.getRotation().getPitch();
    }
}

