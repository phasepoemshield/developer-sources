package fun.nexisdlc.client.utils.math;

import lombok.experimental.UtilityClass;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

@UtilityClass
public class MathUtil {
    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    public static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }

    public static float interpolate(float start, float end, float factor) {
        return start + (end - start) * factor;
    }

    public static float lerp(float start, float end, float factor) {
        return start + (end - start) * factor;
    }

    public static boolean isHovered(float mouseX, float mouseY, float x, float y, float width, float height) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    public static boolean isHovered(double mouseX, double mouseY, float x, float y, float width, float height) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    public static double round(double value, double places) {
        double factor = Math.pow(10, places);
        return Math.round(value * factor) / factor;
    }

    public static Vec3d getRotationVector(float pitch, float yaw) {
        float f = pitch * ((float) Math.PI / 180F);
        float g = -yaw * ((float) Math.PI / 180F);
        float h = MathHelper.cos(g);
        float i = MathHelper.sin(g);
        float j = MathHelper.cos(f);
        float k = MathHelper.sin(f);
        return new Vec3d((double) (i * j), (double) (-k), (double) (h * j));
    }

    public static float lerpAngle(float from, float to, float factor) {
        float diff = ((to - from + 180f) % 360f) - 180f;
        if (diff < -180f) diff += 360f;
        return from + diff * factor;
    }

    public float convertFastestToDefault(float value) {
        return value / 6;
    }

    public float convertFastestToDefault(float value, float factor) {
        return value / factor;
    }

    public float convertLerpFastestToDefault(float value) {
        return value / 6500;
    }
}
