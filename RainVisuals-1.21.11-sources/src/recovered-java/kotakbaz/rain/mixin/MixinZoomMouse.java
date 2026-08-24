/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Mouse
 *  net.minecraft.client.gui.Click
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.Mouse;
import net.minecraft.client.gui.Click;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.\u0634\u0632;

@Mixin(value={Mouse.class}, priority=500)
public class MixinZoomMouse {
    @Unique
    private static final Vector3f rain$mouseVec = new Vector3f();

    @ModifyArgs(method={"method_1601"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25406(Lnet/minecraft/class_11909;)Z"))
    private void rain$transformMouseUpCoordinates(Args args2) {
        if (!\u0634\u0632.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        Click event = (Click)args2.get(0);
        rain$mouseVec.set((float)event.x(), (float)event.y(), 1.0f);
        rain$mouseVec.mul(\u0634\u0632.INSTANCE.getMouseTransform());
        args2.set(0, (Object)new Click((double)MixinZoomMouse.rain$mouseVec.x, (double)MixinZoomMouse.rain$mouseVec.y, event.buttonInfo()));
    }

    @ModifyArgs(method={"method_1601"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25402(Lnet/minecraft/class_11909;Z)Z"))
    private void rain$transformMouseDownCoordinates(Args args2) {
        if (!\u0634\u0632.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        Click event = (Click)args2.get(0);
        rain$mouseVec.set((float)event.x(), (float)event.y(), 1.0f);
        rain$mouseVec.mul(\u0634\u0632.INSTANCE.getMouseTransform());
        args2.set(0, (Object)new Click((double)MixinZoomMouse.rain$mouseVec.x, (double)MixinZoomMouse.rain$mouseVec.y, event.buttonInfo()));
    }

    @ModifyArgs(method={"method_1598"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25401(DDDD)Z"))
    private void rain$transformMouseScrollCoordinates(Args args2) {
        if (!\u0634\u0632.INSTANCE.shouldTransformScreenMouse()) {
            return;
        }
        rain$mouseVec.set(((Number)args2.get(0)).floatValue(), ((Number)args2.get(1)).floatValue(), 1.0f);
        rain$mouseVec.mul(\u0634\u0632.INSTANCE.getMouseTransform());
        args2.set(0, (Object)MixinZoomMouse.rain$mouseVec.x);
        args2.set(1, (Object)MixinZoomMouse.rain$mouseVec.y);
    }
}

