package fun.wonderful.api.utils.render.fonts.ttf;

import fun.wonderful.api.utils.render.fonts.ttf.FontUtil;
import fun.wonderful.api.utils.render.fonts.ttf.GradientFontRenderer;
import fun.wonderful.api.utils.render.fonts.ttf.MCFontRenderer;
import java.awt.Font;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lombok.Generated;
import net.minecraft.util.Identifier;

public class Fonts {
    private static final String MOD_ID = "wonderful";
    private static final Map<String, Map<Float, MCFontRenderer>> regularFonts = new HashMap<String, Map<Float, MCFontRenderer>>();
    private static final Map<String, Map<Float, GradientFontRenderer>> gradientFonts = new HashMap<String, Map<Float, GradientFontRenderer>>();
    public static MCFontRenderer comfortaa16;
    public static MCFontRenderer comfortaa18;
    public static MCFontRenderer comfortaa20;
    public static GradientFontRenderer comfortaaGradient18;
    public static MCFontRenderer roboto16;
    public static MCFontRenderer roboto18;
    public static MCFontRenderer roboto20;
    public static GradientFontRenderer robotoGradient18;
    public static MCFontRenderer montserrat16;
    public static MCFontRenderer montserrat18;
    public static MCFontRenderer montserrat20;
    public static GradientFontRenderer montserratGradient18;
    public static MCFontRenderer sfDisplaySemibold16;
    public static MCFontRenderer sfDisplaySemibold18;
    public static MCFontRenderer sfDisplaySemibold20;
    public static GradientFontRenderer sfDisplaySemiboldGradient18;
    private static boolean initialized;

    public static void init() {
        if (initialized) {
            return;
        }
        comfortaa16 = Fonts.getFont("comfortaa.ttf", 16.0f);
        comfortaa18 = Fonts.getFont("comfortaa.ttf", 18.0f);
        comfortaa20 = Fonts.getFont("comfortaa.ttf", 20.0f);
        comfortaaGradient18 = Fonts.getGradientFont("comfortaa.ttf", 18.0f);
        roboto16 = Fonts.getFont("roboto.ttf", 16.0f);
        roboto18 = Fonts.getFont("roboto.ttf", 18.0f);
        roboto20 = Fonts.getFont("roboto.ttf", 20.0f);
        robotoGradient18 = Fonts.getGradientFont("roboto.ttf", 18.0f);
        montserrat16 = Fonts.getFont("montserrat.ttf", 16.0f);
        montserrat18 = Fonts.getFont("montserrat.ttf", 18.0f);
        montserrat20 = Fonts.getFont("montserrat.ttf", 20.0f);
        montserratGradient18 = Fonts.getGradientFont("montserrat.ttf", 18.0f);
        sfDisplaySemibold16 = Fonts.getFont("sf_display_semibold", 16.0f);
        sfDisplaySemibold18 = Fonts.getFont("sf_display_semibold", 18.0f);
        sfDisplaySemibold20 = Fonts.getFont("sf_display_semibold", 20.0f);
        sfDisplaySemiboldGradient18 = Fonts.getGradientFont("sf_display_semibold", 18.0f);
        initialized = true;
    }

    public static MCFontRenderer getFont(String fontName, float size) {
        String resourceName = Fonts.normalizeTtfName(fontName);
        regularFonts.computeIfAbsent(resourceName, k2 -> new HashMap());
        Map<Float, MCFontRenderer> fontSizes = regularFonts.get(resourceName);
        if (fontSizes.containsKey(Float.valueOf(size))) {
            return fontSizes.get(Float.valueOf(size));
        }
        Font font = FontUtil.getFontFromTTF(Identifier.of((String)MOD_ID, (String)("fonts/ttf/" + resourceName)), size, 0);
        if (font == null) {
            font = new Font("Arial", 0, (int)size);
        }
        MCFontRenderer renderer = new MCFontRenderer(font, true, true);
        fontSizes.put(Float.valueOf(size), renderer);
        return renderer;
    }

    public static GradientFontRenderer getGradientFont(String fontName, float size) {
        String resourceName = Fonts.normalizeTtfName(fontName);
        gradientFonts.computeIfAbsent(resourceName, k2 -> new HashMap());
        Map<Float, GradientFontRenderer> fontSizes = gradientFonts.get(resourceName);
        if (fontSizes.containsKey(Float.valueOf(size))) {
            return fontSizes.get(Float.valueOf(size));
        }
        Font font = FontUtil.getFontFromTTF(Identifier.of((String)MOD_ID, (String)("fonts/ttf/" + resourceName)), size, 0);
        if (font == null) {
            font = new Font("Arial", 0, (int)size);
        }
        GradientFontRenderer renderer = new GradientFontRenderer(font, true, true);
        fontSizes.put(Float.valueOf(size), renderer);
        return renderer;
    }

    public static void drawStringWithFade(MCFontRenderer font, String text, float x2, float y2, float maxWidth, int color) {
        if (text == null || text.isEmpty() || maxWidth <= 0.0f) {
            return;
        }
        float currentX = x2;
        float fadeZoneWidth = Math.min(22.0f, Math.max(8.0f, maxWidth * 0.35f));
        float fadeStartX = x2 + maxWidth - fadeZoneWidth;
        int originalAlpha = color >> 24 & 0xFF;
        for (int i2 = 0; i2 < text.length(); ++i2) {
            String ch = String.valueOf(text.charAt(i2));
            float charWidth = font.getStringWidth(ch);
            if (currentX > x2 + maxWidth && i2 > 0) break;
            int finalColor = color;
            if (currentX > fadeStartX) {
                float progress = (currentX - fadeStartX) / fadeZoneWidth;
                progress = Math.max(0.0f, Math.min(1.0f, progress));
                float fadeFactor = (float)Math.cos((double)progress * Math.PI / 2.0);
                int newAlpha = (int)((float)originalAlpha * fadeFactor);
                finalColor = color & 0xFFFFFF | newAlpha << 24;
            }
            if ((finalColor >> 24 & 0xFF) > 4) {
                font.drawString(ch, currentX, y2, finalColor);
            }
            currentX += charWidth;
        }
    }

    public static MCFontRenderer getSystemFont(String fontName, float size) {
        String key = "system_" + fontName;
        regularFonts.computeIfAbsent(key, k2 -> new HashMap());
        Map<Float, MCFontRenderer> fontSizes = regularFonts.get(key);
        if (fontSizes.containsKey(Float.valueOf(size))) {
            return fontSizes.get(Float.valueOf(size));
        }
        Font font = new Font(fontName, 0, (int)size);
        MCFontRenderer renderer = new MCFontRenderer(font, true, true);
        fontSizes.put(Float.valueOf(size), renderer);
        return renderer;
    }

    public static MCFontRenderer getSystemFont(String fontName, float size, int style) {
        String key = "system_" + fontName + "_" + style;
        regularFonts.computeIfAbsent(key, k2 -> new HashMap());
        Map<Float, MCFontRenderer> fontSizes = regularFonts.get(key);
        if (fontSizes.containsKey(Float.valueOf(size))) {
            return fontSizes.get(Float.valueOf(size));
        }
        Font font = new Font(fontName, style, (int)size);
        MCFontRenderer renderer = new MCFontRenderer(font, true, true);
        fontSizes.put(Float.valueOf(size), renderer);
        return renderer;
    }

    public static void clearCache() {
        regularFonts.clear();
        gradientFonts.clear();
        initialized = false;
    }

    public static void clearCache(String fontName) {
        String resourceName = Fonts.normalizeTtfName(fontName);
        regularFonts.remove(resourceName);
        gradientFonts.remove(resourceName);
    }

    private static String normalizeTtfName(String fontName) {
        if (fontName == null || fontName.isBlank()) {
            return "";
        }
        String cleanName = fontName.replace('\\', '/');
        int fileNameStart = cleanName.lastIndexOf(47);
        if (fileNameStart >= 0) {
            cleanName = cleanName.substring(fileNameStart + 1);
        }
        return cleanName.toLowerCase(Locale.ROOT).endsWith(".ttf") ? cleanName : cleanName + ".ttf";
    }

    @Generated
    public static boolean isInitialized() {
        return initialized;
    }

    static {
        initialized = false;
    }
}