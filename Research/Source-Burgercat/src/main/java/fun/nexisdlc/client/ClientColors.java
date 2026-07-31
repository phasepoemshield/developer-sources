package fun.nexisdlc.client;

import fun.nexisdlc.ui.HudTheme;

import java.awt.*;

public class ClientColors {
    private static final long TRANSITION_MS = 300L;

    private static boolean customThemeActive = false;
    private static int customBackground = 0xFF121219;
    private static int customText = 0xFFE6E6F2;
    private static int customIcon = 0xFF5690FF;
    private static int customGradientStart = 0xFF5690FF;
    private static int customGradientEnd = 0xFF669EFF;

    private static boolean transitioning = false;
    private static boolean deactivateAfterTransition = false;
    private static long transitionStart = 0L;
    private static int fromBackground;
    private static int fromText;
    private static int fromIcon;
    private static int fromGradientStart;
    private static int fromGradientEnd;
    private static int targetBackground;
    private static int targetText;
    private static int targetIcon;
    private static int targetGradientStart;
    private static int targetGradientEnd;

    public static final Color BACKGROUND = new Color(0, true) {
        @Override
        public int getRGB() { return getBackgroundRgb(); }
        @Override
        public int getRed() { return (getRGB() >> 16) & 0xFF; }
        @Override
        public int getGreen() { return (getRGB() >> 8) & 0xFF; }
        @Override
        public int getBlue() { return getRGB() & 0xFF; }
        @Override
        public int getAlpha() { return (getRGB() >> 24) & 0xFF; }
    };

    public static final Color TEXT = new Color(0, true) {
        @Override
        public int getRGB() { return getTextRgb(); }
        @Override
        public int getRed() { return (getRGB() >> 16) & 0xFF; }
        @Override
        public int getGreen() { return (getRGB() >> 8) & 0xFF; }
        @Override
        public int getBlue() { return getRGB() & 0xFF; }
        @Override
        public int getAlpha() { return (getRGB() >> 24) & 0xFF; }
    };

    public static final Color ICON = new Color(0, true) {
        @Override
        public int getRGB() { return getIconRgb(); }
        @Override
        public int getRed() { return (getRGB() >> 16) & 0xFF; }
        @Override
        public int getGreen() { return (getRGB() >> 8) & 0xFF; }
        @Override
        public int getBlue() { return getRGB() & 0xFF; }
        @Override
        public int getAlpha() { return (getRGB() >> 24) & 0xFF; }
    };

    public static final Color GRADIENT_START = new Color(0, true) {
        @Override
        public int getRGB() { return getGradientStartRgb(); }
        @Override
        public int getRed() { return (getRGB() >> 16) & 0xFF; }
        @Override
        public int getGreen() { return (getRGB() >> 8) & 0xFF; }
        @Override
        public int getBlue() { return getRGB() & 0xFF; }
        @Override
        public int getAlpha() { return (getRGB() >> 24) & 0xFF; }
    };

    public static final Color GRADIENT_END = new Color(0, true) {
        @Override
        public int getRGB() { return getGradientEndRgb(); }
        @Override
        public int getRed() { return (getRGB() >> 16) & 0xFF; }
        @Override
        public int getGreen() { return (getRGB() >> 8) & 0xFF; }
        @Override
        public int getBlue() { return getRGB() & 0xFF; }
        @Override
        public int getAlpha() { return (getRGB() >> 24) & 0xFF; }
    };

    public static void setBackground(int argb) {
        cancelTransition();
        customThemeActive = true;
        customBackground = argb;
    }

    public static void setText(int argb) {
        cancelTransition();
        customThemeActive = true;
        customText = argb;
    }

    public static void setIcon(int argb) {
        cancelTransition();
        customThemeActive = true;
        customIcon = argb;
    }

    public static void setGradientStart(int argb) {
        cancelTransition();
        customThemeActive = true;
        customGradientStart = argb;
    }

    public static void setGradientEnd(int argb) {
        cancelTransition();
        customThemeActive = true;
        customGradientEnd = argb;
    }

    public static void setThemeColors(int background, int text, int icon, int gradientStart, int gradientEnd) {
        fromBackground = getBackgroundRgb();
        fromText = getTextRgb();
        fromIcon = getIconRgb();
        fromGradientStart = getGradientStartRgb();
        fromGradientEnd = getGradientEndRgb();

        targetBackground = background;
        targetText = text;
        targetIcon = icon;
        targetGradientStart = gradientStart;
        targetGradientEnd = gradientEnd;

        customBackground = background;
        customText = text;
        customIcon = icon;
        customGradientStart = gradientStart;
        customGradientEnd = gradientEnd;
        customThemeActive = true;
        deactivateAfterTransition = false;
        transitioning = true;
        transitionStart = System.currentTimeMillis();
    }

    public static void clearCustomTheme() {
        fromBackground = getBackgroundRgb();
        fromText = getTextRgb();
        fromIcon = getIconRgb();
        fromGradientStart = getGradientStartRgb();
        fromGradientEnd = getGradientEndRgb();

        targetBackground = HudTheme.getBackgroundColor();
        targetText = HudTheme.getTextColor();
        targetIcon = HudTheme.getAccentColor(1.0f);
        targetGradientStart = HudTheme.getAccentColor(1.0f);
        targetGradientEnd = HudTheme.getAccentHoverColor(1.0f);

        customBackground = targetBackground;
        customText = targetText;
        customIcon = targetIcon;
        customGradientStart = targetGradientStart;
        customGradientEnd = targetGradientEnd;
        customThemeActive = true;
        deactivateAfterTransition = true;
        transitioning = true;
        transitionStart = System.currentTimeMillis();
    }

    public static int applyAlpha(int rgb, float alpha) {
        Color c = new Color(rgb, true);
        int a = Math.round(c.getAlpha() * Math.max(0f, Math.min(1f, alpha)));
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), a).getRGB();
    }

    private static int getBackgroundRgb() {
        return getColor(customBackground, fromBackground, targetBackground, HudTheme.getBackgroundColor());
    }

    private static int getTextRgb() {
        return getColor(customText, fromText, targetText, HudTheme.getTextColor());
    }

    private static int getIconRgb() {
        return getColor(customIcon, fromIcon, targetIcon, HudTheme.getAccentColor(1.0f));
    }

    private static int getGradientStartRgb() {
        return getColor(customGradientStart, fromGradientStart, targetGradientStart, HudTheme.getAccentColor(1.0f));
    }

    private static int getGradientEndRgb() {
        return getColor(customGradientEnd, fromGradientEnd, targetGradientEnd, HudTheme.getAccentHoverColor(1.0f));
    }

    private static int getColor(int custom, int from, int target, int fallback) {
        updateTransition();
        if (transitioning) {
            return blend(from, target, transitionProgress());
        }
        return customThemeActive ? custom : fallback;
    }

    private static void updateTransition() {
        if (!transitioning) {
            return;
        }
        if (System.currentTimeMillis() - transitionStart < TRANSITION_MS) {
            return;
        }
        transitioning = false;
        customThemeActive = !deactivateAfterTransition;
        deactivateAfterTransition = false;
    }

    private static float transitionProgress() {
        float t = (System.currentTimeMillis() - transitionStart) / (float) TRANSITION_MS;
        t = Math.max(0f, Math.min(1f, t));
        return t * t * (3f - 2f * t);
    }

    private static void cancelTransition() {
        transitioning = false;
        deactivateAfterTransition = false;
    }

    private static int blend(int from, int to, float t) {
        int fa = (from >>> 24) & 0xFF;
        int fr = (from >>> 16) & 0xFF;
        int fg = (from >>> 8) & 0xFF;
        int fb = from & 0xFF;
        int ta = (to >>> 24) & 0xFF;
        int tr = (to >>> 16) & 0xFF;
        int tg = (to >>> 8) & 0xFF;
        int tb = to & 0xFF;

        int a = Math.round(fa + (ta - fa) * t);
        int r = Math.round(fr + (tr - fr) * t);
        int g = Math.round(fg + (tg - fg) * t);
        int b = Math.round(fb + (tb - fb) * t);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }
}
