package fun.nexisdlc.client.utils.player.rotation;

import fun.nexisdlc.client.utils.client.IMinecraft;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SensUtility implements IMinecraft {
    public static float getSensitivity(float rot) {
        float gcdValue = getGCDValue();
        if (!Float.isFinite(gcdValue) || gcdValue <= 0.0f) {
            return rot;
        }

        float snapped = Math.round(rot / gcdValue) * gcdValue;
        if (snapped == 0.0f && rot != 0.0f) {
            return Math.copySign(gcdValue, rot);
        }

        return snapped;
    }

    public static float getGCDValue() {
        return (float) (getGCD() * 0.15);
    }

    public static float getGCD() {
        if (mc == null || mc.options == null || mc.options.getMouseSensitivity() == null) {
            return 0.0f;
        }

        float f1;
        return (f1 = (float) (mc.options.getMouseSensitivity().getValue() * 0.6 + 0.2)) * f1 * f1 * 8;
    }

    public static float getDeltaMouse(float delta) {
        float gcdValue = getGCDValue();
        if (!Float.isFinite(gcdValue) || gcdValue <= 0.0f) {
            return delta;
        }

        return Math.round(delta / gcdValue);
    }
}
