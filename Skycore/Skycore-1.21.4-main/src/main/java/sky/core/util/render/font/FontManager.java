package sky.core.util.render.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FontManager {
    private static final Logger LOGGER = LoggerFactory.getLogger("Skycore");
    private static final FontRenderer[] REGULAR = new FontRenderer[65];
    private static final FontRenderer[] MEDIUM = new FontRenderer[65];
    private static final FontRenderer[] ICONS = new FontRenderer[65];

    private FontManager() {
    }

    public static FontRenderer getRegular(int size) {
        return getOrLoad(REGULAR, size, "suisse_regular.ttf", "Segoe UI");
    }

    public static FontRenderer getMedium(int size) {
        return getOrLoad(MEDIUM, size, "suisse_medium.ttf", "Segoe UI");
    }

    public static FontRenderer getIcons(int size) {
        int clampedSize = Math.clamp(size, 6, 64);
        if (ICONS[clampedSize] == null) {
            Font baseFont = loadFont("icons.ttf", null);
            if (baseFont != null) {
                ICONS[clampedSize] = new FontRenderer(baseFont, clampedSize / 2.0F);
            } else {
                ICONS[clampedSize] = getRegular(size);
            }
        }
        return ICONS[clampedSize];
    }

    private static FontRenderer getOrLoad(FontRenderer[] cache, int size, String fileName, String fallbackName) {
        int clampedSize = Math.clamp(size, 6, 64);
        if (cache[clampedSize] == null) {
            cache[clampedSize] = load(clampedSize, fileName, fallbackName);
        }
        return cache[clampedSize];
    }

    private static FontRenderer load(float size, String fileName, String fallbackName) {
        Font baseFont = loadFont(fileName, fallbackName);
        if (baseFont == null) {
            return null;
        }
        return new FontRenderer(baseFont, size / 2.0F);
    }

    private static Font loadFont(String fileName, String fallbackName) {
        try (InputStream stream = FontManager.class.getResourceAsStream("/assets/skycore/font/" + fileName)) {
            if (stream != null) {
                return Font.createFont(Font.TRUETYPE_FONT, stream);
            }
        } catch (IOException | FontFormatException exception) {
            LOGGER.warn("Failed to load font {} from assets", fileName, exception);
        }

        if (fallbackName == null) {
            return null;
        }

        LOGGER.warn("Font asset missing: assets/skycore/font/{}. Using {}", fileName, fallbackName);
        return new Font(fallbackName, Font.PLAIN, 12);
    }
}
