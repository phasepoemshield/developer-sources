package fun.nexisdlc.client.utils.render;

import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

public class CursorHelper {
    private static long handCursor;
    private static long hResizeCursor;
    private static long iBeamCursor;
    private static long arrowCursor;

    private static boolean initialized = false;

    public static void init() {
        if (initialized) return;
        handCursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_HAND_CURSOR);
        hResizeCursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_HRESIZE_CURSOR);
        iBeamCursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_IBEAM_CURSOR);
        arrowCursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_ARROW_CURSOR);
        initialized = true;
    }

    public static void destroy() {
        if (!initialized) return;
        GLFW.glfwDestroyCursor(handCursor);
        GLFW.glfwDestroyCursor(hResizeCursor);
        GLFW.glfwDestroyCursor(iBeamCursor);
        GLFW.glfwDestroyCursor(arrowCursor);
        initialized = false;
    }

    public static void setArrow() {
        setCursor(arrowCursor);
    }

    public static void setHand() {
        setCursor(handCursor);
    }

    public static void setHResize() {
        setCursor(hResizeCursor);
    }

    public static void setIBeam() {
        setCursor(iBeamCursor);
    }

    public static void ensureVisible() {
        if (!initialized) init();
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) return;
        var window = client.getWindow();
        if (window == null) return;
        client.mouse.unlockCursor();
        GLFW.glfwSetInputMode(window.getHandle(), GLFW.GLFW_CURSOR, GLFW.GLFW_CURSOR_NORMAL);
    }

    private static void setCursor(long cursor) {
        if (!initialized) init();
        if (cursor == 0) return;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) return;
        var window = client.getWindow();
        if (window == null) return;
        client.mouse.unlockCursor();
        GLFW.glfwSetInputMode(window.getHandle(), GLFW.GLFW_CURSOR, GLFW.GLFW_CURSOR_NORMAL);
        GLFW.glfwSetCursor(window.getHandle(), cursor);
    }
}
