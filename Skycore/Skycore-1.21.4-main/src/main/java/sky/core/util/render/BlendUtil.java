package sky.core.util.render;

import com.mojang.blaze3d.systems.RenderSystem;

public final class BlendUtil {
    private BlendUtil() {
    }

    public static void runBlended(Runnable action) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        action.run();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }
}
