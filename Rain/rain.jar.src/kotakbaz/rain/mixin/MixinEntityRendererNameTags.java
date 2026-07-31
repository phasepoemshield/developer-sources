/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.NameTagsModule;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.text.Text;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={EntityRenderer.class})
public class MixinEntityRendererNameTags {
    @Redirect(method={"method_3926"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_327;method_27522(Lnet/minecraft/class_2561;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597;Lnet/minecraft/class_327$class_6415;II)V"))
    private void rain$redirectLabelDraw(TextRenderer textRenderer, Text text, float x2, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, TextRenderer.TextLayerType layerType, int backgroundColor, int light) {
        if (NameTagsModule.INSTANCE.isEnabled()) {
            boolean removeBg = (Boolean)NameTagsModule.INSTANCE.getRemoveBackground().getValue();
            boolean addShadow = (Boolean)NameTagsModule.INSTANCE.getAddShadow().getValue();
            int bgColor = removeBg ? 0 : backgroundColor;
            textRenderer.draw(text, x2, y, color, addShadow, matrix, vertexConsumers, layerType, bgColor, light);
            return;
        }
        textRenderer.draw(text, x2, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light);
    }
}

