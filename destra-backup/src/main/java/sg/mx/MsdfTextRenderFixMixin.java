package sg.mx;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru.destra.font.MsdfTextRender", remap = false)
public abstract class MsdfTextRenderFixMixin {

    @Unique
    private boolean destra$wasDepthMaskEnabled = true;

    @Inject(method = "render", at = @At("HEAD"), remap = false)
    private void destra$fixGLState(Matrix4f matrix, float x, float y, float z, CallbackInfo ci) {
        destra$wasDepthMaskEnabled = org.lwjgl.opengl.GL11.glGetBoolean(org.lwjgl.opengl.GL11.GL_DEPTH_WRITEMASK);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask(false);
    }

    @Inject(method = "render", at = @At("RETURN"), remap = false)
    private void destra$restoreGLState(Matrix4f matrix, float x, float y, float z, CallbackInfo ci) {
        RenderSystem.depthMask(destra$wasDepthMaskEnabled);
    }
}
