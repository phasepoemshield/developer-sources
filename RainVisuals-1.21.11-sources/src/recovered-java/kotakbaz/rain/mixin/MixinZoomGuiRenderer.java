/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.render.GuiRenderer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.GuiRenderer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import oxxxde.\u0634\u0632;

@Mixin(value={GuiRenderer.class})
public class MixinZoomGuiRenderer {
    @ModifyArg(method={"method_71291"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11282;method_71106(Lorg/joml/Matrix4fc;Lorg/joml/Vector4fc;Lorg/joml/Vector3fc;Lorg/joml/Matrix4fc;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"), index=0)
    private Matrix4fc rain$applyZoomTransform(Matrix4fc modelView) {
        Matrix4f transform = new Matrix4f();
        transform.mul(modelView);
        transform.mul(\u0634\u0632.INSTANCE.getRenderTransform());
        return transform;
    }
}

