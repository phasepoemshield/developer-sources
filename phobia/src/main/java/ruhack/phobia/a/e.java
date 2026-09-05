/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ax;
import ruhack.phobia.bn;
import ruhack.phobia.eh;
import ruhack.phobia.jk;
import ruhack.phobia.ot;
import ruhack.phobia.ov;

@Mixin(value={class_4184.class})
public abstract class e {
    @Shadow
    private class_243 field_18712;
    @Shadow
    @Final
    private class_2338.class_2339 field_18713;
    @Shadow
    private float field_18718;
    @Shadow
    private float field_18717;

    @Shadow
    public abstract void method_19325(float var1, float var2);

    @Shadow
    protected abstract void method_19324(float var1, float var2, float var3);

    @Shadow
    protected abstract float method_19318(float var1);

    @Inject(method={"method_19321"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4184;method_19327(DDD)V", shift=At.Shift.AFTER)})
    private void injectQuickPerspectiveSwap(class_1937 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickProgress, CallbackInfo ci2) {
        ot rotation = ot.INSTANCE;
        eh legitAura = eh.getInstance();
        if (legitAura != null && legitAura.isState()) {
            ov prev = rotation.getPreviousAngle();
            ov curr = rotation.getCurrentAngle();
            if (prev != null && curr != null) {
                float factor = class_3532.method_15363((float)tickProgress, (float)0.0f, (float)1.0f);
                float yaw = class_3532.method_17821((float)factor, (float)prev.getYaw(), (float)curr.getYaw());
                float pitch = class_3532.method_16439((float)factor, (float)prev.getPitch(), (float)curr.getPitch());
                this.method_19325(yaw, pitch);
            }
        }
    }

    @Inject(method={"method_19322(Lnet/minecraft/class_243;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void posHook(class_243 pos, CallbackInfo ci2) {
        bn event = new bn(pos);
        ax.callEvent(event);
        this.field_18712 = pos = event.getPos();
        this.field_18713.method_10102(pos.field_1352, pos.field_1351, pos.field_1350);
        ci2.cancel();
    }

    @Inject(method={"method_19318"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeCameraClip(float distance, CallbackInfoReturnable<Float> cir) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Camera Clip")) {
            cir.setReturnValue((Object)Float.valueOf(distance));
        }
    }
}
