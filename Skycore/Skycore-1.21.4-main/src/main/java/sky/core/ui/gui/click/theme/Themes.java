package sky.core.ui.gui.click.theme;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import sky.core.ui.gui.click.ClickGuiTheme;

public final class Themes {
    public static final String DEFAULT_ID = "default";
    public static final String RED_ID = "red";
    public static final String GREEN_ID = "green";
    public static final String PINK_ID = "pink";
    public static final String WHITE_ID = "white";
    public static final String RAINBOW_ID = "rainbow";

    private static final long RAINBOW_CYCLE_MS = 7000L;

    private static final Theme DEFAULT = new Theme(
            DEFAULT_ID,
            "Default",
            new Color(130, 105, 255, 255),
            new Color(32, 24, 41, 255),
            new Color(9, 9, 18, 255),
            new Color(28, 24, 42, 255),
            new Color(14, 12, 22, 255),
            new Color(31, 25, 50, 255),
            new Color(22, 16, 36, 255),
            new Color(45, 42, 58, 180),
            new Color(40, 38, 52, 255),
            new Color(55, 55, 65, 255),
            new Color(28, 28, 28, 255)
    );

    private static final Theme RED = new Theme(
            RED_ID,
            "Red",
            new Color(255, 118, 118, 255),
            new Color(38, 22, 26, 255),
            new Color(14, 8, 10, 255),
            new Color(34, 20, 24, 255),
            new Color(18, 10, 12, 255),
            new Color(42, 22, 28, 255),
            new Color(28, 14, 18, 255),
            new Color(58, 38, 42, 180),
            new Color(52, 34, 38, 255),
            new Color(62, 40, 44, 255),
            new Color(36, 22, 24, 255)
    );

    private static final Theme GREEN = new Theme(
            GREEN_ID,
            "Green",
            new Color(142, 230, 118, 255),
            new Color(24, 34, 26, 255),
            new Color(9, 14, 11, 255),
            new Color(22, 32, 24, 255),
            new Color(11, 16, 13, 255),
            new Color(26, 38, 28, 255),
            new Color(16, 24, 18, 255),
            new Color(38, 52, 40, 180),
            new Color(34, 46, 36, 255),
            new Color(44, 58, 46, 255),
            new Color(24, 34, 26, 255)
    );

    private static final Theme PINK = new Theme(
            PINK_ID,
            "Pink",
            new Color(255, 130, 195, 255),
            new Color(36, 22, 34, 255),
            new Color(13, 8, 12, 255),
            new Color(32, 20, 30, 255),
            new Color(16, 10, 15, 255),
            new Color(40, 22, 36, 255),
            new Color(26, 14, 24, 255),
            new Color(56, 36, 50, 180),
            new Color(48, 32, 44, 255),
            new Color(58, 38, 52, 255),
            new Color(32, 20, 28, 255)
    );

    private static final Theme WHITE = new Theme(
            WHITE_ID,
            "White",
            new Color(232, 232, 238, 255),
            new Color(28, 28, 32, 255),
            new Color(10, 10, 12, 255),
            new Color(24, 24, 28, 255),
            new Color(12, 12, 14, 255),
            new Color(30, 30, 34, 255),
            new Color(18, 18, 22, 255),
            new Color(42, 42, 48, 180),
            new Color(36, 36, 42, 255),
            new Color(48, 48, 54, 255),
            new Color(26, 26, 30, 255)
    );

    private static final Theme RAINBOW = new Theme(
            RAINBOW_ID,
            "Rainbow",
            new Color(255, 80, 120, 255),
            new Color(30, 24, 38, 255),
            new Color(10, 9, 16, 255),
            new Color(26, 22, 36, 255),
            new Color(13, 11, 20, 255),
            new Color(30, 24, 42, 255),
            new Color(20, 16, 30, 255),
            new Color(44, 40, 56, 180),
            new Color(38, 34, 50, 255),
            new Color(52, 48, 62, 255),
            new Color(28, 24, 34, 255),
            true
    );

    private static final List<Theme> REGISTERED = Arrays.asList(DEFAULT, RED, GREEN, PINK, WHITE, RAINBOW);
    private static Theme current = DEFAULT;

    private Themes() {
    }

    public static List<Theme> getAll() {
        return REGISTERED;
    }

    public static Theme getCurrent() {
        return current;
    }

    public static Color getRainbowColor() {
        return fromHue(getRainbowHue(), 0.40F, 0.94F);
    }

    public static float getRainbowHue() {
        return (System.currentTimeMillis() % RAINBOW_CYCLE_MS) / (float) RAINBOW_CYCLE_MS;
    }

    public static void applyRainbowTheme() {
        float hue = getRainbowHue();
        ClickGuiTheme target = ClickGuiTheme.theme;

        target.setPanelTop(fromHue(hue, 0.16F, 0.20F));
        target.setPanelBottom(fromHue(hue, 0.18F, 0.09F));
        target.setCardTop(fromHue(hue, 0.14F, 0.17F));
        target.setCardBottom(fromHue(hue, 0.16F, 0.10F));
        target.setCardActiveTop(fromHue(hue, 0.20F, 0.22F));
        target.setCardActiveBottom(fromHue(hue, 0.22F, 0.14F));

        Color accent = fromHue(hue, 0.40F, 0.94F);
        target.setAccent(accent);
        target.setToggleOn(accent);
        target.setModeOn(accent);
        target.setSliderFill(accent);
        target.setModeOff(withAlpha(fromHue(hue, 0.12F, 0.26F), 180));
        target.setSliderTrack(fromHue(hue, 0.10F, 0.22F));
        target.setToggleOff(fromHue(hue, 0.08F, 0.30F));
        target.setHudSeparator(fromHue(hue, 0.10F, 0.18F));
    }

    private static Color fromHue(float hue, float saturation, float brightness) {
        Color color = Color.getHSBColor(hue, saturation, brightness);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
    }

    private static Color withAlpha(Color color, int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    public static Theme getById(String id) {
        if (id == null) {
            return DEFAULT;
        }
        for (Theme theme : REGISTERED) {
            if (theme.getId().equalsIgnoreCase(id)) {
                return theme;
            }
        }
        return DEFAULT;
    }

    public static void apply(String id) {
        apply(getById(id));
    }

    public static void apply(Theme theme) {
        current = theme;
        if (theme.isAnimated()) {
            applyRainbowTheme();
        } else {
            theme.apply();
        }
    }

    public static void update() {
        if (current.isAnimated()) {
            applyRainbowTheme();
        }
    }

    public static void init() {
        apply(current);
    }
}
