package sg.mx;

import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru.destra.font.MsdfTextRender", remap = false)
public abstract class MsdfTextRenderDiagnosticMixin {

    private static int destra$renderCallCount = 0;

    @Inject(method = "render", at = @At("HEAD"), remap = false)
    private void destra$diagRenderHead(Matrix4f matrix, float x, float y, float z, CallbackInfo ci) {
        // Removed console spam
    }

    @Inject(method = "render", at = @At("RETURN"), remap = false)
    private void destra$diagRenderTail(Matrix4f matrix, float x, float y, float z, CallbackInfo ci) {
        // Removed console spam
    }
}
