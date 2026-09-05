package ru.wexside.util;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.wexside.module.render.TargetESPModule;

public final class TargetEspDebugProbe {
    static final boolean ENABLED = Boolean.getBoolean("wexside.debug.targetesp");
    private static final Logger LOGGER = LoggerFactory.getLogger("TargetEspDebug");
    private static long lastCheck;
    private static boolean broken;
    private static ByteBuffer scratch;

    private TargetEspDebugProbe() {
    }

    public static void onFrameEnd() {
        if (!ENABLED || broken) {
            return;
        }
        long now = System.currentTimeMillis();
        if (now - lastCheck < 3000L) {
            return;
        }
        lastCheck = now;
        TargetESPModule module = TargetESPModule.getInstance();
        if (module == null) {
            return;
        }
        int expected = module.getPrimaryColor();
        int er = expected >> 16 & 0xFF;
        int eg = expected >> 8 & 0xFF;
        int eb = expected & 0xFF;
        try {
            long window = GLFW.glfwGetCurrentContext();
            if (window == 0L) {
                return;
            }
            try (MemoryStack stack = MemoryStack.stackPush()) {
                IntBuffer w = stack.mallocInt(1);
                IntBuffer h = stack.mallocInt(1);
                GLFW.glfwGetFramebufferSize(window, w, h);
                int width = w.get(0);
                int height = h.get(0);
                if (width <= 0 || height <= 0) {
                    return;
                }
                int bytes = width * height * 4;
                if (scratch == null || scratch.capacity() < bytes) {
                    scratch = ByteBuffer.allocateDirect(bytes);
                }
                scratch.clear().limit(bytes);
                GL33.glReadPixels(0, 0, width, height, GL33.GL_RGBA, GL33.GL_UNSIGNED_BYTE, scratch);
                int strict = 0;
                int loose = 0;
                for (int i = 0; i + 3 < bytes; i += 4) {
                    int dr = (scratch.get(i) & 0xFF) - er;
                    int dg = (scratch.get(i + 1) & 0xFF) - eg;
                    int db = (scratch.get(i + 2) & 0xFF) - eb;
                    int dist = dr * dr + dg * dg + db * db;
                    if (dist < 3600) {
                        ++strict;
                        continue;
                    }
                    if (dist < 19600) {
                        ++loose;
                    }
                }
                int center = (height / 2 * width + width / 2) * 4;
                String centerHex = String.format("#%02X%02X%02X", scratch.get(center) & 0xFF, scratch.get(center + 1) & 0xFF, scratch.get(center + 2) & 0xFF);
                LOGGER.info("[TargetEspDebug] pixel probe {}x{}: strict={} loose={} expected=#{} center={}", width, height, strict, loose, Integer.toHexString(expected), centerHex);
            }
        }
        catch (Throwable throwable) {
            broken = true;
            LOGGER.warn("[TargetEspDebug] pixel probe failed; disabling", throwable);
        }
    }
}
