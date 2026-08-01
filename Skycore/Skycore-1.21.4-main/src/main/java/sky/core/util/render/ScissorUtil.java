package sky.core.util.render;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;

public final class ScissorUtil {
    private ScissorUtil() {
    }

    public static void enable(float x, float y, float width, float height) {
        Window window = MinecraftClient.getInstance().getWindow();
        double scale = ScreenScale.getScale();
        if (scale <= 0.0) {
            scale = 2.0;
        }

        int fbHeight = window.getFramebufferHeight();
        int scissorX = (int) Math.floor(x * scale);
        int scissorY = (int) Math.floor(fbHeight - (y + height) * scale);
        int scissorW = (int) Math.ceil(width * scale);
        int scissorH = (int) Math.ceil(height * scale);

        scissorX = Math.max(0, scissorX);
        scissorY = Math.max(0, scissorY);
        scissorW = Math.max(0, scissorW);
        scissorH = Math.max(0, scissorH);

        RenderSystem.enableScissor(scissorX, scissorY, scissorW, scissorH);
    }

    public static void disable() {
        RenderSystem.disableScissor();
    }
}
