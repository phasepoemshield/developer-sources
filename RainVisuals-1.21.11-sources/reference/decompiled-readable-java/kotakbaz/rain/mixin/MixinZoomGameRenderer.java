/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderTickCounter
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
import oxxxde.\u0634\u0632;

@Mixin(value={GameRenderer.class})
public class MixinZoomGameRenderer {
    @Unique
    private final Vector3f rain$mouseVec = new Vector3f();

    @Inject(method={"method_3192"}, at={@At(value="HEAD")})
    private void rain$updateZoomFrame(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        \u0634\u0632.INSTANCE.onRenderFrame(tickCounter.getFixedDeltaTicks());
    }

    @Inject(method={"method_3196"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifyZoomFov(Camera camera, float tickProgress, boolean changingFov, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue((Object)Float.valueOf(\u0634\u0632.INSTANCE.modifyFov(((Float)cir.getReturnValue()).floatValue())));
    }

    @ModifyArgs(method={"method_3192"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_47413(Lnet/minecraft/class_332;IIF)V"))
    private void rain$transformScreenMouse(Args args2) {
        if (!\u0634\u0632.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        this.rain$mouseVec.set(((Number)args2.get(1)).floatValue(), ((Number)args2.get(2)).floatValue(), 1.0f);
        this.rain$mouseVec.mul(\u0634\u0632.INSTANCE.getMouseTransform());
        args2.set(1, (Object)((int)this.rain$mouseVec.x));
        args2.set(2, (Object)((int)this.rain$mouseVec.y));
    }
}

