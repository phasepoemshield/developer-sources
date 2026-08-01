package sg.mx;

import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.font.FontRenderer;

@Mixin(targets = "ru.destra.font.FontRenderer", remap = false)
public abstract class FontRendererDrawTextFixMixin {

    @Inject(method = "drawText", at = @At("HEAD"), remap = false)
    private void destra$replaceMatrixWithIdentity(
            Matrix4f matrix, VertexConsumer buffer, String text,
            float size, float thickness, float spacing,
            float x, float y, float z, int color,
            CallbackInfo ci) {
        matrix.identity();
    }
}
