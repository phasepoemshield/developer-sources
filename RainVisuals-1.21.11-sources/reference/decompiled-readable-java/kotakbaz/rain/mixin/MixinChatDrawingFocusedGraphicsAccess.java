/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import oxxxde.\u0627\u0630;

@Mixin(targets={"net/minecraft/class_338$class_12235"})
public class MixinChatDrawingFocusedGraphicsAccess {
    @ModifyArg(method={"method_75810"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7591$class_7592;method_44712(Lnet/minecraft/class_332;II)V"), index=1)
    private int rain$offsetTagIconX(int x) {
        return \u0627\u0630.offsetX(x);
    }
}

