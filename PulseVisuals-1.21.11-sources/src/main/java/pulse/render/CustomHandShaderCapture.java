package pulse.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;

public final class CustomHandShaderCapture {
    private static final MinecraftClient keyCodec = MinecraftClient.getInstance();
    private static boolean e = false;

    private CustomHandShaderCapture() {
    }

    public static void beginCapture() {
    }

    public static void endCapture() {
    }

    public static boolean isActive() {
        return false;
    }

    public static boolean guiOpen() {
        return keyCodec.currentScreen != null;
    }

    public static Framebuffer getFramebuffer() {
        return null;
    }

    public static void resetForGui() {
    }
}
