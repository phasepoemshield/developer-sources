package rainpatch;

import java.util.Map;
import oxxxde.ري;

/** Runtime-only repairs for invalid state in recovered Rain bytecode. */
public final class RuntimeFixes {
    private RuntimeFixes() {
    }

    public static ري animation(Map<String, ري> animations, String key) {
        return animations.computeIfAbsent(key, ignored -> new ري());
    }

    /** Starts the actual Rain client without the leak wrapper's browser side effects. */
    public static void initializeRain() {
        try {
            Class<?> client = Class.forName("oxxxde.صص");
            Object instance = client.getField("INSTANCE").get(null);
            client.getMethod("onInitializeClient").invoke(instance);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }
}
