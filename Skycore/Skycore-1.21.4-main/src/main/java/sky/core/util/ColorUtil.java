package sky.core.util;

import java.awt.Color;
import net.minecraft.util.math.MathHelper;

public final class ColorUtil {
    private ColorUtil() {
    }

    public static Color lerp(Color from, Color to, float t) {
        t = MathHelper.clamp(t, 0.0F, 1.0F);
        int r = (int) (from.getRed() + (to.getRed() - from.getRed()) * t);
        int g = (int) (from.getGreen() + (to.getGreen() - from.getGreen()) * t);
        int b = (int) (from.getBlue() + (to.getBlue() - from.getBlue()) * t);
        int a = (int) (from.getAlpha() + (to.getAlpha() - from.getAlpha()) * t);
        return new Color(r, g, b, a);
    }

    public static Color withAlpha(Color color, int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), MathHelper.clamp(alpha, 0, 255));
    }

    public static Color withAlpha(Color color, float alpha) {
        return withAlpha(color, (int) (MathHelper.clamp(alpha, 0.0F, 1.0F) * 255.0F));
    }

    public static int rgba(int red, int green, int blue, int alpha) {
        return (MathHelper.clamp(alpha, 0, 255) << 24)
                | (MathHelper.clamp(red, 0, 255) << 16)
                | (MathHelper.clamp(green, 0, 255) << 8)
                | MathHelper.clamp(blue, 0, 255);
    }

    public static int fixBrightness(int color) {
        if ((color >> 24 & 0xFF) != 0) {
            return color;
        }
        return color | 0xFF000000;
    }
}
