/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ZoomModule;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={GameRenderer.class})
public class MixinZoomGameRenderer {
    @Unique
    private final Vector3f rain$mouseVec = new Vector3f();

    @Inject(method={"method_3192"}, at={@At(value="HEAD")})
    private void rain$updateZoomFrame(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        ZoomModule.INSTANCE.onRenderFrame(tickCounter.getDynamicDeltaTicks());
    }

    @Inject(method={"method_3196"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifyZoomFov(Camera camera, float tickProgress, boolean changingFov, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue((Object)Float.valueOf(ZoomModule.INSTANCE.modifyFov(((Float)cir.getReturnValue()).floatValue())));
    }

    @ModifyArgs(method={"method_3192"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_47413(Lnet/minecraft/class_332;IIF)V"))
    private void rain$transformScreenMouse(Args args) {
        if (!ZoomModule.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        this.rain$mouseVec.set(((Number)args.get(1)).floatValue(), ((Number)args.get(2)).floatValue(), 1.0f);
        this.rain$mouseVec.mul(ZoomModule.INSTANCE.getMouseTransform());
        args.set(1, (Object)((int)this.rain$mouseVec.x));
        args.set(2, (Object)((int)this.rain$mouseVec.y));
    }
}

