package fun.wonderful.api.utils.player;

import fun.wonderful.api.QClient;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;

public final class Counter
implements QClient {
    private static int currentFPS;

    public static void updateFPS() {
        int prevFPS = mc.getCurrentFps();
        currentFPS = MathHelper.lerp((float)0.5f, (int)prevFPS, (int)currentFPS);
    }

    @Generated
    private Counter() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @Generated
    public static int getCurrentFPS() {
        return currentFPS;
    }
}