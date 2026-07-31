/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4184
 *  net.minecraft.class_757
 *  net.minecraft.class_9779
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.b_0;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_757.class})
public class MixinZoomGameRenderer {
    @Unique
    private final Vector3f rain$mouseVec = new Vector3f();

    public MixinZoomGameRenderer() {
        super();
    }

    @Inject(method={"method_3192"}, at={@At(value="HEAD")})
    private void rain$updateZoomFrame(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
        b_0.INSTANCE.onRenderFrame(tickCounter.method_60636());
    }

    @Inject(method={"method_3196"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifyZoomFov(class_4184 camera, float tickProgress, boolean changingFov, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue((Object)Float.valueOf(b_0.INSTANCE.modifyFov(((Float)cir.getReturnValue()).floatValue())));
    }

    @ModifyArgs(method={"method_3192"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_47413(Lnet/minecraft/class_332;IIF)V"))
    private void rain$transformScreenMouse(Args args) {
        if (!b_0.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        this.rain$mouseVec.set(((Number)args.get(1)).floatValue(), ((Number)args.get(2)).floatValue(), 1.0f);
        this.rain$mouseVec.mul(b_0.INSTANCE.getMouseTransform());
        args.set(1, (Object)((int)this.rain$mouseVec.x));
        args.set(2, (Object)((int)this.rain$mouseVec.y));
    }
}

