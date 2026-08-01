package fun.nexisdlc.ui.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;

public final class VanillaScreenReloadFade {
    private static final long FADE_DURATION_MS = 260L;
    private static final String CLIENT_PACKAGE_PREFIX = "fun.nexisdlc.";
    private static long startedAt = -1L;
    private static Class<?> targetScreenClass;

    private VanillaScreenReloadFade() {
    }

    public static void start(Screen screen) {
        if (!isVanillaScreen(screen)) {
            reset();
            return;
        }

        startedAt = Util.getMeasuringTimeMs();
        targetScreenClass = screen.getClass();
    }

    public static float getFadeOverlayAlpha(Screen screen) {
        if (startedAt < 0L || screen == null || screen.getClass() != targetScreenClass) {
            return 0.0f;
        }

        float progress = (Util.getMeasuringTimeMs() - startedAt) / (float) FADE_DURATION_MS;
        if (progress >= 1.0f) {
            reset();
            return 0.0f;
        }

        return 1.0f - easeOutCubic(MathHelper.clamp(progress, 0.0f, 1.0f));
    }

    private static boolean isVanillaScreen(Screen screen) {
        if (screen == null) {
            return false;
        }

        return !screen.getClass().getName().startsWith(CLIENT_PACKAGE_PREFIX);
    }

    private static float easeOutCubic(float value) {
        float inverse = 1.0f - value;
        return 1.0f - inverse * inverse * inverse;
    }

    private static void reset() {
        startedAt = -1L;
        targetScreenClass = null;
    }
}
