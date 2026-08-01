package fun.nexisdlc.modules.impl.combat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.math.MathHelper;

public final class AimBotAutoRefreshConfig {
    public static final String KEY = "Autorefresh";

    private final int seconds;

    public AimBotAutoRefreshConfig(int seconds) {
        this.seconds = MathHelper.clamp(seconds, 0, 3600);
    }

    public int seconds() {
        return seconds;
    }

    public void writeTo(JsonObject moduleObject) {
        moduleObject.addProperty(KEY, seconds);
    }

    public static AimBotAutoRefreshConfig fromJson(JsonObject moduleObject) {
        if (moduleObject == null) {
            return disabled();
        }

        JsonElement element = moduleObject.get(KEY);
        if (element == null || element.isJsonNull()) {
            return disabled();
        }

        try {
            return new AimBotAutoRefreshConfig(Math.round(element.getAsFloat()));
        } catch (Exception ignored) {
            return disabled();
        }
    }

    public static AimBotAutoRefreshConfig disabled() {
        return new AimBotAutoRefreshConfig(0);
    }
}
