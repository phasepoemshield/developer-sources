/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_312
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.b_0;
import net.minecraft.class_312;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_312.class}, priority=500)
public class MixinZoomMouse {
    @Unique
    private static final Vector3f rain$mouseVec = new Vector3f();

    public MixinZoomMouse() {
        super();
    }

    @ModifyArgs(method={"method_1601"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25402(DDI)Z"))
    private void rain$transformMouseDownCoordinates(Args args) {
        if (!b_0.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(b_0.INSTANCE.getMouseTransform());
        args.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }

    @ModifyArgs(method={"method_1601"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25406(DDI)Z"))
    private void rain$transformMouseUpCoordinates(Args args) {
        if (!b_0.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(b_0.INSTANCE.getMouseTransform());
        args.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }

    @ModifyArgs(method={"method_1598"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25401(DDDD)Z"))
    private void rain$transformMouseScrollCoordinates(Args args) {
        if (!b_0.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(b_0.INSTANCE.getMouseTransform());
        args.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }
}

