package fun.wonderful.api.utils.render.fonts.msdf;

import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.MsdfFont;
import java.util.HashMap;
import net.minecraft.client.util.math.MatrixStack;

public class Fonts {
    private static final HashMap<String, MsdfFont> loadedFonts = new HashMap();
    private static final HashMap<String, Font[]> fontCache = new HashMap();
    private static boolean initialized = false;

    public static void init() {
        if (initialized) {
            return;
        }
        initialized = true;
        Fonts.loadFont("sf_regular");
        Fonts.loadFont("wave");
        Fonts.loadFont("icon");
        Fonts.loadFont("icon1");
        Fonts.loadFont("iconnew");
        Fonts.loadFont("suisse");
        Fonts.loadFont("vector");
    }

    private static void loadFont(String name) {
        try {
            MsdfFont msdfFont = MsdfFont.builder().atlas(name).data(name).build();
            loadedFonts.put(name, msdfFont);
            Font[] fonts = new Font[100];
            for (int i2 = 8; i2 < 100; ++i2) {
                fonts[i2] = new Font(msdfFont, (float)i2);
            }
            fontCache.put(name, fonts);
        }
        catch (Exception e2) {
            System.err.println("[Fonts] Failed to load " + name + ": " + e2.getMessage());
        }
    }

    public static Font getFont(String name, int size) {
        Font[] fonts;
        if (!initialized) {
            Fonts.init();
        }
        String cleanName = name.replace(".ttf", "");
        if (size < 8) {
            size = 8;
        }
        if (size >= 100) {
            size = 99;
        }
        if ((fonts = fontCache.get(cleanName)) != null && fonts[size] != null) {
            return fonts[size];
        }
        if (!loadedFonts.containsKey(cleanName)) {
            Fonts.loadFont(cleanName);
        }
        if ((fonts = fontCache.get(cleanName)) != null && fonts[size] != null) {
            return fonts[size];
        }
        return null;
    }

    public static void drawStringWithFade(Font font, String text, float x2, float y2, float maxWidth, int color) {
        if (font == null) {
            return;
        }
        MatrixStack stack = new MatrixStack();
        font.drawStringWithFade(stack, text, x2, y2, maxWidth, color);
    }
}