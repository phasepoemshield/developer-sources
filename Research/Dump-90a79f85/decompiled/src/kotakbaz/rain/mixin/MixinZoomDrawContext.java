/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  org.joml.Matrix3x2fStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.b_0;
import net.minecraft.class_332;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_332.class})
public class MixinZoomDrawContext {
    @Shadow
    @Final
    private Matrix3x2fStack field_44657;

    public MixinZoomDrawContext() {
        super();
    }

    @Inject(method={"method_44379"}, at={@At(value="HEAD")})
    private void rain$pushZoomTransform(int x1, int y1, int x2, int y2, CallbackInfo ci) {
        this.field_44657.pushMatrix();
        this.field_44657.mul(b_0.INSTANCE.getRenderTransform());
    }

    @Inject(method={"method_44379"}, at={@At(value="RETURN")})
    private void rain$popZoomTransform(int x1, int y1, int x2, int y2, CallbackInfo ci) {
        this.field_44657.popMatrix();
    }
}

