package fun.wonderful.api.utils.render.fonts.msdf;

import fun.wonderful.api.QClient;
import java.util.HashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class Fonts {
    private static final String[] DEFAULT_FONTS = new String[]{"sf_regular", "wave", "icon", "icon1", "iconnew", "suisse", "vector", "clickgui", "kantumruy", "semibold", "logo", "menu", "mainmenu", "wonderful", "theme", "altmanager", "desc", "energy"};
    private static final HashMap<String, MsdfFont> loadedFonts = new HashMap();
    private static final HashMap<String, Font[]> fontCache = new HashMap();
    private static boolean initialized = false;

    public static boolean isReady() {
        MinecraftClient client = QClient.mc;
        return client != null && client.isFinishedLoading() && client.getResourceManager() != null;
    }

    public static void init() {
        if (initialized || !Fonts.isReady()) {
            return;
        }
        boolean loadedAny = false;
        for (String name : DEFAULT_FONTS) {
            if (Fonts.loadFont(name)) {
                loadedAny = true;
            }
        }
        if (loadedAny) {
            initialized = true;
            System.out.println("[Fonts] Loaded " + loadedFonts.size() + " MSDF fonts");
        }
    }

    private static boolean loadFont(String name) {
        if (fontCache.containsKey(name)) {
            return true;
        }
        try {
            MsdfFont msdfFont = MsdfFont.builder().name(name).atlas(name).data(name).build();
            loadedFonts.put(name, msdfFont);
            Font[] fonts = new Font[100];
            for (int i2 = 8; i2 < 100; ++i2) {
                fonts[i2] = new Font(msdfFont, (float)i2);
            }
            fontCache.put(name, fonts);
            return true;
        }
        catch (Exception e2) {
            System.err.println("[Fonts] Failed to load " + name + ": " + e2.getMessage());
            return false;
        }
    }

    public static Font getFont(String name, int size) {
        Font[] fonts;
        if (!initialized) {
            Fonts.init();
        }
        if (!initialized) {
            return null;
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
        if (!loadedFonts.containsKey(cleanName) && Fonts.loadFont(cleanName)) {
            fonts = fontCache.get(cleanName);
            if (fonts != null && fonts[size] != null) {
                return fonts[size];
            }
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
