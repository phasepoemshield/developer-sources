package fun.nexisdlc.client.utils.render.color;

import fun.nexisdlc.client.utils.math.MathUtil;
import lombok.experimental.UtilityClass;
import net.minecraft.util.math.MathHelper;

import java.awt.*;

@UtilityClass
public class ColorUtils {
    public Color gradient(Color color, Color color2, double speed, double count) {
        int angle = (int) (((System.currentTimeMillis()) / speed + count) % 360);
        angle = (angle >= 180 ? 360 - angle : angle) * 2;
        return interpolateColorC(color, color2, angle / 360f);
    }

    public Color interpolateColorC(Color color1, Color color2, float amount) {
        amount = Math.min(1, Math.max(0, amount));
        return new Color(interpolateInt(color1.getRed(), color2.getRed(), amount), interpolateInt(color1.getGreen(), color2.getGreen(), amount), interpolateInt(color1.getBlue(), color2.getBlue(), amount), interpolateInt(color1.getAlpha(), color2.getAlpha(), amount));
    }

    public int interpolateInt(int oldValue, int newValue, double interpolationValue) {
        return (int) MathUtil.interpolate(oldValue, newValue, (float) interpolationValue);
    }

    public static float[] rgba(final int color) {
        return new float[] {
                (color >> 16 & 0xFF) / 255f,
                (color >> 8 & 0xFF) / 255f,
                (color & 0xFF) / 255f,
                (color >> 24 & 0xFF) / 255f
        };
    }

    public static int red(int color) {
        return (color >> 16) & 0xFF;
    }

    public static int green(int color) {
        return (color >> 8) & 0xFF;
    }

    public static int blue(int color) {
        return color & 0xFF;
    }


    public float redf(int c) {
        return red(c) / 255.0f;
    }

    public float greenf(int c) {
        return green(c) / 255.0f;
    }

    public float bluef(int c) {
        return blue(c) / 255.0f;
    }

    public float alphaf(int c) {
        return alpha(c) / 255.0f;
    }

    public int alpha(int c) {
        return (c >> 24) & 0xFF;
    }

    public static int rgba(int r, int g, int b, int a) {
        return a << 24 | r << 16 | g << 8 | b;
    }

    public static Color applyOpacity(Color color, float opacity) {
        opacity = Math.min(1, Math.max(0, opacity));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) (color.getAlpha() * opacity));
    }

    public Color interpolateColor(Color current, Color target, float speed, int alpha) {
        int red = (int) Math.max(0, Math.min(255, current.getRed() + (target.getRed() - current.getRed()) * speed));
        int green = (int) Math.max(0, Math.min(255, current.getGreen() + (target.getGreen() - current.getGreen()) * speed));
        int blue = (int) Math.max(0, Math.min(255, current.getBlue() + (target.getBlue() - current.getBlue()) * speed));
        return new Color(red, green, blue, alpha);
    }

    public Color interpolateColor(Color current, Color target, float speed) {
        int red = (int) Math.max(0, Math.min(255, current.getRed() + (target.getRed() - current.getRed()) * speed));
        int green = (int) Math.max(0, Math.min(255, current.getGreen() + (target.getGreen() - current.getGreen()) * speed));
        int blue = (int) Math.max(0, Math.min(255, current.getBlue() + (target.getBlue() - current.getBlue()) * speed));
        return new Color(red, green, blue);
    }

    public static int rgb(int r, int g, int b) {
        return 255 << 24 | r << 16 | g << 8 | b;
    }

    public static Color darken(Color color, float factor, int alpha) {
        factor = MathUtil.clamp(factor, 0.0f, 1.0f);

        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        r = (int) (r * (1.0f - factor));
        g = (int) (g * (1.0f - factor));
        b = (int) (b * (1.0f - factor));

        r = (int) MathUtil.clamp(r, 0, 255);
        g = (int) MathUtil.clamp(g, 0, 255);
        b = (int) MathUtil.clamp(b, 0, 255);

        return new Color(r, g, b, alpha);
    }


    public static Color darken(Color color, float factor) {
        return darken(color, factor, color.getAlpha());
    }

    public static int darken(int color, float factor) {
        factor = MathUtil.clamp(factor, 0.0f, 1.0f);

        float[] components = rgba(color);
        int r = (int) (components[0] * 255);
        int g = (int) (components[1] * 255);
        int b = (int) (components[2] * 255);

        r = (int) (r * (1.0f - factor));
        g = (int) (g * (1.0f - factor));
        b = (int) (b * (1.0f - factor));

        r = (int) MathUtil.clamp(r, 0, 255);
        g = (int) MathUtil.clamp(g, 0, 255);
        b = (int) MathUtil.clamp(b, 0, 255);

        return rgb(r, g, b);
    }

    public static int multAlpha(int color, float alpha) {
        alpha = MathHelper.clamp(alpha, 0.0f, 1.0f);
        int a = (int) (((color >> 24) & 0xFF) * alpha);
        return (color & 0x00FFFFFF) | (a << 24);
    }
    public static int darkenWithAlpha(int color, float factor) {
        factor = MathUtil.clamp(factor, 0.0f, 1.0f);

        int a = (color >> 24) & 0xFF;
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;

        r = (int) (r * (1.0f - factor));
        g = (int) (g * (1.0f - factor));
        b = (int) (b * (1.0f - factor));

        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));

        return rgba(r, g, b, a);
    }

    public static Color darkenWithAlpha(Color color, float factor) {
        factor = MathUtil.clamp(factor, 0.0f, 1.0f);

        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        int a = color.getAlpha();

        r = (int) (r * (1.0f - factor));
        g = (int) (g * (1.0f - factor));
        b = (int) (b * (1.0f - factor));

        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));

        return new Color(r, g, b, a);
    }

    public String formatting(int color) {
        return "⏏" + color + "⏏";
    }

    public static int fade(int speed, int index, int first, int second) {
        int angle = (int) ((System.currentTimeMillis() / speed + index) % 360);
        angle = angle >= 180 ? 360 - angle : angle;
        return interpolate(first, second, angle / 180f);
    }

    public static Color lighten(Color color, float factor) {
        int rgb = color.getRGB();
        int lightenedRgb = lighten(rgb, factor);
        return new Color(lightenedRgb);
    }

    public static Color lightenWithAlpha(Color color, float factor) {
        int argb = color.getRGB();
        int lightenedArgb = lightenWithAlpha(argb, factor);
        return new Color(lightenedArgb, true);
    }

    public static int lighten(int color, float factor) {
        factor = MathUtil.clamp(factor, 0.0f, 1.0f);

        float[] components = rgba(color);

        components[0] = components[0] * (1.0f - factor) + factor;
        components[1] = components[1] * (1.0f - factor) + factor;
        components[2] = components[2] * (1.0f - factor) + factor;

        int r = (int) (components[0] * 255);
        int g = (int) (components[1] * 255);
        int b = (int) (components[2] * 255);

        r = (int) MathUtil.clamp(r, 0, 255);
        g = (int) MathUtil.clamp(g, 0, 255);
        b = (int) MathUtil.clamp(b, 0, 255);

        return rgb(r, g, b);
    }

    public static int lightenWithAlpha(int color, float factor) {
        factor = MathUtil.clamp(factor, 0.0f, 1.0f);

        float[] components = rgba(color);

        components[0] = components[0] * (1.0f - factor) + factor;
        components[1] = components[1] * (1.0f - factor) + factor;
        components[2] = components[2] * (1.0f - factor) + factor;

        int r = (int) MathUtil.clamp((int) (components[0] * 255), 0, 255);
        int g = (int) MathUtil.clamp((int) (components[1] * 255), 0, 255);
        int b = (int) MathUtil.clamp((int) (components[2] * 255), 0, 255);
        int a = (int) (components[3] * 255);

        return rgba(r, g, b, a);
    }

    public static int gradientColor(int color1, int color2, float speed, long tick, int duration) {
        long fullCycle = duration * 2L;

        float rawProgress = (tick % fullCycle) / (float) fullCycle;

        float smoothedProgress = (float) (Math.sin(rawProgress * Math.PI * 2) + 1) / 2;

        float progress = Math.max(0.0f, Math.min(1.0f, smoothedProgress * speed));

        int r1 = (color1 >> 16) & 0xFF;
        int g1 = (color1 >> 8) & 0xFF;
        int b1 = color1 & 0xFF;
        int a1 = (color1 >> 24) & 0xFF;

        int r2 = (color2 >> 16) & 0xFF;
        int g2 = (color2 >> 8) & 0xFF;
        int b2 = color2 & 0xFF;
        int a2 = (color2 >> 24) & 0xFF;

        int red = (int) (r1 + (r2 - r1) * progress);
        int green = (int) (g1 + (g2 - g1) * progress);
        int blue = (int) (b1 + (b2 - b1) * progress);
        int alpha = (int) (a1 + (a2 - a1) * progress);

        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }

    public static Color injectAlpha(final Color color, final int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), MathHelper.clamp(alpha, 0, 255));
    }

    public static int injectAlpha(final int color, final int alpha) {
        return ColorUtils.rgba(red(color), green(color), blue(color), MathHelper.clamp(alpha, 0, 255));
    }

    public static boolean isLightColor(Color color) {
        float[] hsl = rgbToHsl(color.getRed(), color.getGreen(), color.getBlue());
        return hsl[2] > 0.7f;
    }

    public static boolean isLightColor(int rgb) {
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = rgb & 0xFF;
        float[] hsl = rgbToHsl(r, g, b);
        return hsl[2] > 0.7f;
    }

    private static float[] rgbToHsl(int r, int g, int b) {
        float rf = r / 255f;
        float gf = g / 255f;
        float bf = b / 255f;

        float max = Math.max(rf, Math.max(gf, bf));
        float min = Math.min(rf, Math.min(gf, bf));
        float delta = max - min;

        float h, s, l;
        l = (max + min) / 2f;

        if (delta == 0) {
            h = 0;
            s = 0;
        } else {
            s = delta / (1 - Math.abs(2 * l - 1));

            if (max == rf) {
                h = ((gf - bf) / delta) % 6;
            } else if (max == gf) {
                h = (bf - rf) / delta + 2;
            } else {
                h = (rf - gf) / delta + 4;
            }

            h /= 6;
            if (h < 0) h += 1;
        }

        return new float[] {h, s, l};
    }

    public static int interpolate(int start, int end, float value) {
        float[] startColor = rgba(start);
        float[] endColor = rgba(end);

        return rgba((int) MathUtil.interpolate(startColor[0] * 255, endColor[0] * 255, value),
                (int) MathUtil.interpolate(startColor[1] * 255, endColor[1] * 255, value),
                (int) MathUtil.interpolate(startColor[2] * 255, endColor[2] * 255, value),
                (int) MathUtil.interpolate(startColor[3] * 255, endColor[3] * 255, value));
    }

    public static Color lerpColor(Color color1, Color color2, float t) {
        float clampedT = MathHelper.clamp(t, 0.0f, 1.0f);
        int r = (int) MathHelper.clamp(color1.getRed() + (color2.getRed() - color1.getRed()) * clampedT, 0, 255);
        int g = (int) MathHelper.clamp(color1.getGreen() + (color2.getGreen() - color1.getGreen()) * clampedT, 0, 255);
        int b = (int) MathHelper.clamp(color1.getBlue() + (color2.getBlue() - color1.getBlue()) * clampedT, 0, 255);
        int a = (int) MathHelper.clamp(color1.getAlpha() + (color2.getAlpha() - color1.getAlpha()) * clampedT, 0, 255);
        return new Color(r, g, b, a);
    }

    public static int brightenWithAlpha(int color, float factor) {
        factor = Math.max(0.0f, factor);

        float[] components = rgba(color);

        float brightenedR = Math.min(1.0f, components[0] + factor);
        float brightenedG = Math.min(1.0f, components[1] + factor);
        float brightenedB = Math.min(1.0f, components[2] + factor);

        int r = (int) (brightenedR * 255);
        int g = (int) (brightenedG * 255);
        int b = (int) (brightenedB * 255);
        int a = (int) (components[3] * 255);

        return rgba(r, g, b, a);
    }

    public static Color brightenWithAlpha(Color color, float factor) {
        int argb = color.getRGB();
        int brightenedArgb = brightenWithAlpha(argb, factor);
        return new Color(brightenedArgb, true);
    }
}