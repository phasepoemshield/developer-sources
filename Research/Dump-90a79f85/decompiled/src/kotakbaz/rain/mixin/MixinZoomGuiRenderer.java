/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11228
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.b_0;
import net.minecraft.class_11228;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={class_11228.class})
public class MixinZoomGuiRenderer {
    public MixinZoomGuiRenderer() {
        super();
    }

    @ModifyArg(method={"method_71291"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11282;method_71106(Lorg/joml/Matrix4fc;Lorg/joml/Vector4fc;Lorg/joml/Vector3fc;Lorg/joml/Matrix4fc;F)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"), index=0)
    private Matrix4fc rain$applyZoomTransform(Matrix4fc modelView) {
        Matrix4f transform = new Matrix4f();
        transform.mul(modelView);
        transform.mul(b_0.INSTANCE.getRenderTransform());
        return transform;
    }
}

