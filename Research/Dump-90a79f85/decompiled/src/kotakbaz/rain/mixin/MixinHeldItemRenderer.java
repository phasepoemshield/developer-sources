/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1799
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_742
 *  net.minecraft.class_759
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.E;
import kotakbaz.rain.event.events.f_0;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_759.class})
public abstract class MixinHeldItemRenderer {
    public MixinHeldItemRenderer() {
        super();
    }

    @Inject(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4587;method_22903()V", shift=At.Shift.AFTER, ordinal=0)})
    private void onRenderFirstPersonItem(class_742 player, float tickProgress, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        a.INSTANCE.post(new E(matrices, item, hand));
    }

    @Inject(method={"method_65816"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSwingArm(float swingProgress, float equipProgress, class_4587 matrices, int armX, class_1306 arm, CallbackInfo ci) {
        f_0 event = new f_0(matrices, arm, swingProgress, equipProgress);
        a.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
        }
    }
}

