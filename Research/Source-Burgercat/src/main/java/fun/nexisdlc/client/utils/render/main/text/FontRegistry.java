package fun.nexisdlc.client.utils.render.main.text;

import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.gl.GlBackend;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class FontRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(FontRegistry.class);
    private static final Map<String, MsdfFont> REGISTERED_FONTS = new HashMap<>();
    private static final Map<String, FontObject> FONT_OBJECTS = new HashMap<>();
    private static final Map<String, TextRenderer> TEXT_RENDERERS = new HashMap<>();

    private static GlBackend backend;
    private static boolean backendConfigured = false;
    private static boolean rendererFontsInitialized = false;

    public static FontObject SF_MEDIUM;
    public static FontObject WEXSIDE_MENU_ICONS;
    public static FontObject NEXIS_HUD;
    public static FontObject CATEGORIES;
    public static FontObject NURSULTAN;
    public static FontObject SF_SEMIBOLD;
    public static FontObject SF_BOLD;
    public static FontObject ICONS_NEXIS;
    public static FontObject TEST;
    public static FontObject INTER;
    public static FontObject ICONS_ASYNC;
    public static FontObject TEST1;
    public static FontObject FALLBACK_FONT;

    private FontRegistry() {
    }

    public static synchronized void initialize(GlBackend glBackend, Renderer2D renderer) {
        LOGGER.info("  - Инициализация FontRegistry...");
        configureBackend(glBackend);
        Objects.requireNonNull(renderer, "renderer");
        if (rendererFontsInitialized) {
            LOGGER.info("  ✓ FontRegistry уже инициализирован");
            return;
        }

        LOGGER.info("  - Регистрация текстовых рендереров...");
        renderer.registerTextRenderer(INTER, createTextRenderer(INTER));
        renderer.registerTextRenderer(SF_MEDIUM, createTextRenderer(SF_MEDIUM));
        renderer.registerTextRenderer(NURSULTAN, createTextRenderer(NURSULTAN));
        renderer.registerTextRenderer(NEXIS_HUD, createTextRenderer(NEXIS_HUD));
        renderer.registerTextRenderer(CATEGORIES, createTextRenderer(CATEGORIES));
        renderer.registerTextRenderer(WEXSIDE_MENU_ICONS, createTextRenderer(WEXSIDE_MENU_ICONS));
        renderer.registerTextRenderer(SF_SEMIBOLD, createTextRenderer(SF_SEMIBOLD));
        renderer.registerTextRenderer(SF_BOLD, createTextRenderer(SF_BOLD));
        renderer.registerTextRenderer(TEST, createTextRenderer(TEST));
        renderer.registerTextRenderer(ICONS_NEXIS, createTextRenderer(ICONS_NEXIS));
        renderer.registerTextRenderer(ICONS_ASYNC, createTextRenderer(ICONS_ASYNC));

        rendererFontsInitialized = true;
        LOGGER.info("  ✓ Зарегистрировано {} текстовых рендереров", TEXT_RENDERERS.size());
    }

    public static synchronized FontObject register(String id, String jsonResourcePath, String textureResourcePath) {
        ensureBackendConfigured();
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(jsonResourcePath, "jsonResourcePath");
        Objects.requireNonNull(textureResourcePath, "textureResourcePath");
        if (REGISTERED_FONTS.containsKey(id)) {
            throw new IllegalStateException("Font already registered: " + id);
        }
        MsdfFont font = MsdfFont.load(backend, jsonResourcePath, textureResourcePath);
        REGISTERED_FONTS.put(id, font);
        FontObject fontObject = new FontObject(id);
        FONT_OBJECTS.put(id, fontObject);
        return fontObject;
    }

    public static synchronized TextRenderer createTextRenderer(FontObject fontObject) {
        ensureBackendConfigured();
        Objects.requireNonNull(fontObject, "fontObject");

        // Проверяем кэш
        TextRenderer cached = TEXT_RENDERERS.get(fontObject.id);
        if (cached != null) {
            return cached;
        }

        MsdfFont primary = resolve(fontObject);

        // Первый fallback — TEST
        MsdfFont fallback1 = null;
        if (TEST != null && !TEST.id.equals(fontObject.id)) {
            fallback1 = resolve(TEST);
        }

        // Второй fallback — TEST1
        MsdfFont fallback2 = null;
        if (TEST1 != null && !TEST1.id.equals(fontObject.id)) {
            fallback2 = resolve(TEST1);
        }

        MsdfFont fallback3 = null;
        if (FALLBACK_FONT != null && !FALLBACK_FONT.id.equals(fontObject.id)) {
            fallback3 = resolve(FALLBACK_FONT);
        }

        TextRenderer renderer = new TextRenderer(backend, primary, fallback1, fallback2, fallback3);
        TEXT_RENDERERS.put(fontObject.id, renderer);
        return renderer;
    }

    /**
     * Computes the vertical baseline offset required to align the visual center of the specified glyph
     * with the provided anchor position when rendering at the given size. The result represents the
     * amount that must be added to the anchor's Y coordinate in order to place the glyph's bounding box
     * center at that anchor.
     *
     * @param fontObject font containing the glyph
     * @param codepoint  Unicode codepoint of the glyph to analyze
     * @param size       rendering size in pixels
     * @return baseline offset measured in pixels; zero when the glyph is unavailable
     */
    public static synchronized float centeredBaselineOffset(FontObject fontObject, int codepoint, float size) {
        ensureBackendConfigured();
        if (fontObject == null || size <= 0f) {
            return 0f;
        }
        MsdfFont font = resolve(fontObject);
        MsdfFont.Glyph glyph = font.glyph(codepoint);
        if (glyph == null || !glyph.renderable) {
            return 0f;
        }
        float emSize = Math.max(1.0e-6f, font.emSize());
        float scale = size / emSize;
        return (glyph.planeTop + glyph.planeBottom) * 0.5f * scale;
    }

    public static synchronized FontObject get(String id) {
        ensureBackendConfigured();
        FontObject fontObject = FONT_OBJECTS.get(id);
        if (fontObject == null) {
            throw new IllegalArgumentException("Font not registered: " + id);
        }
        return fontObject;
    }

    static synchronized MsdfFont resolve(FontObject fontObject) {
        ensureBackendConfigured();
        MsdfFont font = REGISTERED_FONTS.get(fontObject.id);
        if (font == null) {
            throw new IllegalStateException("Font not registered: " + fontObject.id);
        }
        return font;
    }

    public static synchronized void destroy() {
        if (!backendConfigured && REGISTERED_FONTS.isEmpty()) {
            return;
        }
        LOGGER.info("  - Уничтожение FontRegistry...");
        for (MsdfFont font : REGISTERED_FONTS.values()) {
            if (font != null) {
                font.destroy();
            }
        }
        REGISTERED_FONTS.clear();
        FONT_OBJECTS.clear();
        TEXT_RENDERERS.clear();
        SF_MEDIUM = null;
        CATEGORIES = null;
        NEXIS_HUD = null;
        WEXSIDE_MENU_ICONS = null;
        NURSULTAN = null;
        SF_SEMIBOLD = null;
        SF_BOLD = null;
        ICONS_NEXIS = null;
        TEST = null;
        INTER = null;
        ICONS_ASYNC = null;
        TEST1 = null;
        FALLBACK_FONT = null;
        backend = null;
        backendConfigured = false;
        rendererFontsInitialized = false;
        LOGGER.info("  ✓ FontRegistry уничтожен");
    }

    private static void configureBackend(GlBackend glBackend) {
        Objects.requireNonNull(glBackend, "backend");
        if (backendConfigured) {
            if (backend == glBackend) {
                return;
            }
            LOGGER.warn("  ! FontRegistry: обнаружен новый backend, сбрасываем состояние...");
            destroy();
        }
        backend = glBackend;
        backendConfigured = true;
        LOGGER.info("  - Регистрация встроенных шрифтов...");
        registerBuiltinFonts();
        LOGGER.info("  ✓ Зарегистрировано {} шрифтов", REGISTERED_FONTS.size());
    }

    private static void registerBuiltinFonts() {
        TEST1 = register(
                "TEST1",
                "assets/nexis/fonts/test.json",
                "assets/nexis/fonts/test.png");
        FALLBACK_FONT = register(
                "fallbackFont",
                "assets/nexis/fonts/fallback.json",
                "assets/nexis/fonts/fallback.png");
        TEST = register(
                "TEST",
                "assets/nexis/fonts/sf_pro_regular.json",
                "assets/nexis/fonts/sf_pro_regular.png");
        SF_MEDIUM = register(
                "inter_medium",
                "assets/nexis/fonts/sfprodisplaymedium.json",
                "assets/nexis/fonts/sfprodisplaymedium.png");
        WEXSIDE_MENU_ICONS = register(
                "wexside_menu_icons",
                "assets/nexis/fonts/govnoside.json",
                "assets/nexis/fonts/govnoside.png");
        NEXIS_HUD = register(
                "nexis_hud",
                "assets/nexis/fonts/NexisFonts.json",
                "assets/nexis/fonts/NexisFonts.png");
        CATEGORIES = register(
                "category",
                "assets/nexis/fonts/Category.json",
                "assets/nexis/fonts/Category.png");
        INTER = register(
                "inter",
                "assets/nexis/fonts/inter.json",
                "assets/nexis/fonts/inter.png");
        NURSULTAN = register(
                "nursultan",
                "assets/nexis/fonts/nurik.json",
                "assets/nexis/fonts/nurik.png");

        ICONS_NEXIS = register(
                "icons_nexis",
                "assets/nexis/fonts/nexis.json",
                "assets/nexis/fonts/nexis.png");
        ICONS_ASYNC = register(
                "icons_async",
                "assets/nexis/fonts/iconpack1.json",
                "assets/nexis/fonts/iconpack1.png");

        SF_SEMIBOLD = register(
                "sfprodisplaysemibold",
                "assets/nexis/fonts/sfprodisplaysemibold.json",
                "assets/nexis/fonts/sfprodisplaysemibold.png");

        SF_BOLD = register(
                "sfprodisplaybold",
                "assets/nexis/fonts/sfprodisplaybold.json",
                "assets/nexis/fonts/sfprodisplaybold.png");

    }

    private static void ensureBackendConfigured() {
        if (!backendConfigured || backend == null) {
            throw new IllegalStateException("FontRegistry.initialize(backend, renderer) must be called before use");
        }
    }
}
