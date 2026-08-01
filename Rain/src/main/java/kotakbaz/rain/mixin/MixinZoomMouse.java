/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ZoomModule;
import net.minecraft.client.Mouse;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={Mouse.class}, priority=500)
public class MixinZoomMouse {
    @Unique
    private static final Vector3f rain$mouseVec = new Vector3f();

    @ModifyArgs(method={"method_1601"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25402(DDI)Z"))
    private void rain$transformMouseDownCoordinates(Args args) {
        if (!ZoomModule.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(ZoomModule.INSTANCE.getMouseTransform());
        args.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }

    @ModifyArgs(method={"method_1601"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25406(DDI)Z"))
    private void rain$transformMouseUpCoordinates(Args args) {
        if (!ZoomModule.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(ZoomModule.INSTANCE.getMouseTransform());
        args.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }

    @ModifyArgs(method={"method_1598"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25401(DDDD)Z"))
    private void rain$transformMouseScrollCoordinates(Args args) {
        if (!ZoomModule.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(ZoomModule.INSTANCE.getMouseTransform());
        args.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }
}

