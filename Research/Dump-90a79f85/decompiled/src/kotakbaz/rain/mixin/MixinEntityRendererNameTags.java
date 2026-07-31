/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_327
 *  net.minecraft.class_327$class_6415
 *  net.minecraft.class_4597
 *  net.minecraft.class_897
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.M;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_897.class})
public class MixinEntityRendererNameTags {
    public MixinEntityRendererNameTags() {
        super();
    }

    @Redirect(method={"method_3926"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_327;method_27522(Lnet/minecraft/class_2561;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597;Lnet/minecraft/class_327$class_6415;II)V"))
    private void rain$redirectLabelDraw(class_327 textRenderer, class_2561 text, float x, float y, int color, boolean shadow, Matrix4f matrix, class_4597 vertexConsumers, class_327.class_6415 layerType, int backgroundColor, int light) {
        if (M.INSTANCE.isEnabled()) {
            boolean removeBg = (Boolean)M.INSTANCE.getRemoveBackground().getValue();
            boolean addShadow = (Boolean)M.INSTANCE.getAddShadow().getValue();
            int bgColor = removeBg ? 0 : backgroundColor;
            textRenderer.method_27522(text, x, y, color, addShadow, matrix, vertexConsumers, layerType, bgColor, light);
            return;
        }
        textRenderer.method_27522(text, x, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light);
    }
}

