package fun.nexisdlc.client.utils.render.main.text;

import fun.nexisdlc.client.utils.render.main.gl.GlBackend;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class TextRenderer {
    private static final float[] IDENTITY_TRANSFORM = new float[]{
            1f, 0f, 0f,
            0f, 1f, 0f,
            0f, 0f, 1f
    };
    private static final float GRADIENT_SPAN = 0.85f;

    private final GlBackend backend;
    private final MsdfFont font;           // основной шрифт
    private final MsdfFont fallbackFont1;  // первый fallback (TEST)
    private final MsdfFont fallbackFont2;  // второй fallback (TEST1)
    private final MsdfFont fallbackFont3;  // третий fallback (fallbackFont)
    private final Map<Integer, ResolvedGlyph> glyphCache = new HashMap<>();
    private final Map<Integer, Boolean> missingGlyphCache = new HashMap<>();

    // Fallback Unicode → ASCII replacements for symbols missing in all MSDF fonts
    private static final Int2IntOpenHashMap GLYPH_FALLBACKS = new Int2IntOpenHashMap();
    static {
        GLYPH_FALLBACKS.put(0x2022, '*'); // • Bullet
        GLYPH_FALLBACKS.put(0x2023, '*'); // ‣ Triangular Bullet
        GLYPH_FALLBACKS.put(0x25AA, '*'); // ▪ Small Black Square
        GLYPH_FALLBACKS.put(0x25AB, '*'); // ▫ Small White Square
        GLYPH_FALLBACKS.put(0x25CF, '*'); // ● Black Circle
        GLYPH_FALLBACKS.put(0x25CB, '*'); // ○ White Circle
        GLYPH_FALLBACKS.put(0x2713, 'v'); // ✓ Check Mark
        GLYPH_FALLBACKS.put(0x2714, 'v'); // ✔ Heavy Check Mark
        GLYPH_FALLBACKS.put(0x2717, 'x'); // ✗ Ballot X
        GLYPH_FALLBACKS.put(0x2718, 'x'); // ✘ Heavy Ballot X
        GLYPH_FALLBACKS.put(0x2192, '>'); // → Rightwards Arrow
        GLYPH_FALLBACKS.put(0x2190, '<'); // ← Leftwards Arrow
        GLYPH_FALLBACKS.put(0x2191, '^'); // ↑ Upwards Arrow
        GLYPH_FALLBACKS.put(0x2193, 'v'); // ↓ Downwards Arrow
        GLYPH_FALLBACKS.put(0x2665, 'v'); // ♥ Heart Suit
        GLYPH_FALLBACKS.put(0x2666, 'v'); // ♦ Diamond Suit
        GLYPH_FALLBACKS.put(0x2660, '^'); // ♠ Spade Suit
        GLYPH_FALLBACKS.put(0x2663, '^'); // ♣ Club Suit
        GLYPH_FALLBACKS.defaultReturnValue(-1);
    }
    private int[] layoutCodepoints = new int[32];
    private MsdfFont[] layoutFonts = new MsdfFont[32];
    private MsdfFont.Glyph[] layoutGlyphs = new MsdfFont.Glyph[32];
    private float[] layoutScales = new float[32];
    private float[] layoutPenXs = new float[32];
    private int layoutGlyphCount;
    private int layoutCharCount;
    private float layoutWidth;

    // C1: LRU layout cache to avoid re-shaping the same strings every frame
    private static final int LAYOUT_CACHE_MAX = 128;
    private final Map<Long, CachedLayout> layoutCache = new LinkedHashMap<>(LAYOUT_CACHE_MAX, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Long, CachedLayout> eldest) {
            return size() > LAYOUT_CACHE_MAX;
        }
    };

    public TextRenderer(GlBackend backend, MsdfFont font) {
        this(backend, font, null, null, null);
    }

    public TextRenderer(GlBackend backend, MsdfFont font, MsdfFont fallbackFont1) {
        this(backend, font, fallbackFont1, null, null);
    }

    // Новый конструктор с двумя fallback'ами
    public TextRenderer(GlBackend backend, MsdfFont font,
                        MsdfFont fallbackFont1, MsdfFont fallbackFont2) {
        this(backend, font, fallbackFont1, fallbackFont2, null);
    }

    public TextRenderer(GlBackend backend, MsdfFont font,
                        MsdfFont fallbackFont1, MsdfFont fallbackFont2, MsdfFont fallbackFont3) {
        this.backend = Objects.requireNonNull(backend, "backend");
        this.font = Objects.requireNonNull(font, "font");
        this.fallbackFont1 = fallbackFont1;
        this.fallbackFont2 = fallbackFont2;
        this.fallbackFont3 = fallbackFont3;
    }
    public void drawText(float x, float y, float size, String text, int rgbaPremul) {
        drawText(x, y, size, text, rgbaPremul, "l", IDENTITY_TRANSFORM);
    }

    public void drawText(float x, float y, float size, String text, int rgbaPremul, float[] transform) {
        drawText(x, y, size, text, rgbaPremul, "l", transform);
    }

    public void drawText(float x, float y, float size, String text, int rgbaPremul, String alignKey) {
        drawText(x, y, size, text, rgbaPremul, alignKey, IDENTITY_TRANSFORM);
    }

    public void drawText(float x, float y, float size, String text, int rgbaPremul, String alignKey, float[] transform) {
        if (size <= 0f) {
            return;
        }
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return;
        }

        float[] matrix = (transform != null && transform.length >= 6) ? transform : IDENTITY_TRANSFORM;
        float scale = size / Math.max(1e-6f, font.emSize());
        float lineHeight = font.lineHeight() * scale;
        float baselineY = y;
        char align = 'l';
        if (alignKey != null && !alignKey.isEmpty()) {
            align = Character.toLowerCase(alignKey.charAt(0));
        }
        int color = rgbaPremul;

        int length = content.length();
        int lineStart = 0;
        for (int i = 0; i <= length; i++) {
            if (i != length && content.charAt(i) != '\n') {
                continue;
            }
            layoutLine(content, lineStart, i, scale);
            float width = 0f;
            if (align == 'c' || align == 'r') {
                width = layoutWidth;
            }
            float startX = x;
            if (align == 'c') {
                startX = x - width * 0.5f;
            } else if (align == 'r') {
                startX = x - width;
            }
            drawPreparedLine(startX, baselineY, color, matrix);
            baselineY += lineHeight;
            lineStart = i + 1;
        }
    }

    public void drawGradientText(float x, float y, float size, String text, int startColor, int endColor) {
        drawGradientText(x, y, size, text, startColor, endColor, "l", IDENTITY_TRANSFORM);
    }

    public void drawGradientText(float x, float y, float size, String text,
                                 int startColor, int endColor, String alignKey) {
        drawGradientText(x, y, size, text, startColor, endColor, alignKey, IDENTITY_TRANSFORM);
    }

    public void drawGradientText(float x, float y, float size, String text,
                                 int startColor, int endColor, String alignKey, float[] transform) {
        if (size <= 0f) {
            return;
        }
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return;
        }

        float[] matrix = (transform != null && transform.length >= 6) ? transform : IDENTITY_TRANSFORM;
        float scale = size / Math.max(1e-6f, font.emSize());
        float lineHeight = font.lineHeight() * scale;
        float baselineY = y;
        char align = 'l';
        if (alignKey != null && !alignKey.isEmpty()) {
            align = Character.toLowerCase(alignKey.charAt(0));
        }

        int length = content.length();
        int lineStart = 0;
        for (int i = 0; i <= length; i++) {
            if (i != length && content.charAt(i) != '\n') {
                continue;
            }
            layoutLine(content, lineStart, i, scale);
            float width = 0f;
            if (align == 'c' || align == 'r') {
                width = layoutWidth;
            }
            float startX = x;
            if (align == 'c') {
                startX = x - width * 0.5f;
            } else if (align == 'r') {
                startX = x - width;
            }
            drawPreparedGradientLine(startX, baselineY, startColor, endColor, matrix);
            baselineY += lineHeight;
            lineStart = i + 1;
        }
    }

    private void drawPreparedLine(float x,
                                  float baseline,
                                  int color,
                                  float[] matrix) {
        if (layoutGlyphCount == 0) {
            return;
        }
        float baselineY = baseline;
        for (int i = 0; i < layoutGlyphCount; i++) {
            MsdfFont glyphFont = layoutFonts[i];
            MsdfFont.Glyph glyph = layoutGlyphs[i];
            float glyphScale = layoutScales[i];
            if (glyph.renderable) {
                float penX = x + layoutPenXs[i];
                float x0 = penX + glyph.planeLeft * glyphScale;
                float y0 = baselineY - glyph.planeTop * glyphScale;
                float x1 = penX + glyph.planeRight * glyphScale;
                float y1 = baselineY - glyph.planeBottom * glyphScale;
                float width = x1 - x0;
                float height = y1 - y0;
                if (width > 0f && height > 0f) {
                    backend.enqueueMsdfGlyph(glyphFont.textureId(), glyphFont.distanceRange(),
                            x0, y0, width, height,
                            glyph.u0, glyph.v1, glyph.u1, glyph.v0,
                            color, matrix);
                }
            }
        }
    }

    private void drawPreparedGradientLine(float x,
                                          float baseline,
                                          int startColor,
                                          int endColor,
                                          float[] matrix) {
        if (layoutGlyphCount == 0) {
            return;
        }
        float baselineY = baseline;
        int index = 0;

        for (int i = 0; i < layoutGlyphCount; i++) {
            MsdfFont glyphFont = layoutFonts[i];
            MsdfFont.Glyph glyph = layoutGlyphs[i];
            float glyphScale = layoutScales[i];
            if (glyph.renderable) {
                float penX = x + layoutPenXs[i];
                float x0 = penX + glyph.planeLeft * glyphScale;
                float y0 = baselineY - glyph.planeTop * glyphScale;
                float x1 = penX + glyph.planeRight * glyphScale;
                float y1 = baselineY - glyph.planeBottom * glyphScale;
                float width = x1 - x0;
                float height = y1 - y0;
                if (width > 0f && height > 0f) {
                    float t = layoutCharCount <= 1 ? 0f : (index / (float) (layoutCharCount - 1));
                    float startG = (1f - GRADIENT_SPAN) * 0.5f;
                    t = Math.max(0f, Math.min(1f, startG + t * GRADIENT_SPAN));
                    int color = lerpColor(startColor, endColor, t);
                    backend.enqueueMsdfGlyph(glyphFont.textureId(), glyphFont.distanceRange(),
                            x0, y0, width, height,
                            glyph.u0, glyph.v1, glyph.u1, glyph.v0,
                            color, matrix);
                }
            }
            index++;
        }
    }

    public TextMetrics measureText(String text, float size) {
        if (size <= 0f) {
            return new TextMetrics(0f, 0f);
        }
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return new TextMetrics(0f, 0f);
        }
        float scale = size / Math.max(1e-6f, font.emSize());
        float lineHeight = font.lineHeight() * scale;
        int length = content.length();
        float maxWidth = 0f;
        int lineCount = 0;
        int lineStart = 0;
        for (int i = 0; i <= length; i++) {
            if (i != length && content.charAt(i) != '\n') {
                continue;
            }
            layoutLine(content, lineStart, i, scale);
            maxWidth = Math.max(maxWidth, layoutWidth);
            lineCount++;
            lineStart = i + 1;
        }
        float height = Math.max(lineHeight * lineCount, lineHeight);
        return new TextMetrics(maxWidth, height);
    }

    private float measureLineWidth(String line, float scale) {
        layoutLine(line, 0, line.length(), scale);
        return layoutWidth;
    }

    private float measureLineWidth(String line, int start, int end, float scale) {
        layoutLine(line, start, end, scale);
        return layoutWidth;
    }

    private void layoutLine(String line, int start, int end, float scale) {
        layoutGlyphCount = 0;
        layoutCharCount = 0;
        layoutWidth = 0f;
        if (start >= end) {
            return;
        }
        // C1: check layout cache first
        String keyStr = line.substring(start, end);
        long key = layoutCacheKey(keyStr, scale);
        CachedLayout cached = layoutCache.get(key);
        if (cached != null) {
            layoutGlyphCount = cached.glyphCount;
            layoutCharCount = cached.charCount;
            layoutWidth = cached.width;
            ensureLayoutCapacity(layoutGlyphCount);
            System.arraycopy(cached.codepoints, 0, layoutCodepoints, 0, layoutGlyphCount);
            System.arraycopy(cached.fonts, 0, layoutFonts, 0, layoutGlyphCount);
            System.arraycopy(cached.glyphs, 0, layoutGlyphs, 0, layoutGlyphCount);
            System.arraycopy(cached.scales, 0, layoutScales, 0, layoutGlyphCount);
            System.arraycopy(cached.penXs, 0, layoutPenXs, 0, layoutGlyphCount);
            return;
        }
        float penX = 0f;
        int prevCodepoint = -1;
        MsdfFont prevFont = null;
        for (int i = start; i < end;) {
            char ch = line.charAt(i);
            if (ch == '\\' && i + 9 < end && line.charAt(i + 1) == 'c') {
                i += 10;
                continue;
            }
            int cp = line.codePointAt(i);
            int cpLen = Character.charCount(cp);
            i += cpLen;

            ResolvedGlyph resolved = resolveGlyphCached(cp);
            if (resolved == null) {
                continue;
            }
            MsdfFont glyphFont = resolved.font;
            MsdfFont.Glyph glyph = resolved.glyph;
            float glyphScale = scaleForFont(glyphFont, scale);

            if (prevCodepoint != -1 && prevFont == glyphFont) {
                penX += glyphFont.kerning(prevCodepoint, cp) * glyphScale;
            }

            ensureLayoutCapacity(layoutGlyphCount + 1);
            layoutCodepoints[layoutGlyphCount] = cp;
            layoutFonts[layoutGlyphCount] = glyphFont;
            layoutGlyphs[layoutGlyphCount] = glyph;
            layoutScales[layoutGlyphCount] = glyphScale;
            layoutPenXs[layoutGlyphCount] = penX;
            layoutGlyphCount++;

            penX += glyph.advance * glyphScale;
            prevCodepoint = cp;
            prevFont = glyphFont;
            layoutCharCount++;
        }
        layoutWidth = penX;
        // C1: save to cache
        if (layoutGlyphCount > 0) {
            int[] cp = new int[layoutGlyphCount];
            MsdfFont[] fonts = new MsdfFont[layoutGlyphCount];
            MsdfFont.Glyph[] glyphs = new MsdfFont.Glyph[layoutGlyphCount];
            float[] scales = new float[layoutGlyphCount];
            float[] penXs = new float[layoutGlyphCount];
            System.arraycopy(layoutCodepoints, 0, cp, 0, layoutGlyphCount);
            System.arraycopy(layoutFonts, 0, fonts, 0, layoutGlyphCount);
            System.arraycopy(layoutGlyphs, 0, glyphs, 0, layoutGlyphCount);
            System.arraycopy(layoutScales, 0, scales, 0, layoutGlyphCount);
            System.arraycopy(layoutPenXs, 0, penXs, 0, layoutGlyphCount);
            layoutCache.put(key, new CachedLayout(cp, fonts, glyphs, scales, penXs,
                    layoutGlyphCount, layoutCharCount, layoutWidth));
        }
    }

    private void ensureLayoutCapacity(int required) {
        if (required <= layoutCodepoints.length) {
            return;
        }
        int newCapacity = Math.max(required, layoutCodepoints.length * 2);
        int[] newCodepoints = new int[newCapacity];
        MsdfFont[] newFonts = new MsdfFont[newCapacity];
        MsdfFont.Glyph[] newGlyphs = new MsdfFont.Glyph[newCapacity];
        float[] newScales = new float[newCapacity];
        float[] newPenXs = new float[newCapacity];
        System.arraycopy(layoutCodepoints, 0, newCodepoints, 0, layoutGlyphCount);
        System.arraycopy(layoutFonts, 0, newFonts, 0, layoutGlyphCount);
        System.arraycopy(layoutGlyphs, 0, newGlyphs, 0, layoutGlyphCount);
        System.arraycopy(layoutScales, 0, newScales, 0, layoutGlyphCount);
        System.arraycopy(layoutPenXs, 0, newPenXs, 0, layoutGlyphCount);
        layoutCodepoints = newCodepoints;
        layoutFonts = newFonts;
        layoutGlyphs = newGlyphs;
        layoutScales = newScales;
        layoutPenXs = newPenXs;
    }

    private ResolvedGlyph resolveGlyphCached(int codepoint) {
        ResolvedGlyph cached = glyphCache.get(codepoint);
        if (cached != null) {
            return cached;
        }
        if (missingGlyphCache.containsKey(codepoint)) {
            return null;
        }
        ResolvedGlyph resolved = resolveGlyph(codepoint);
        if (resolved != null) {
            glyphCache.put(codepoint, resolved);
            return resolved;
        }
        missingGlyphCache.put(codepoint, Boolean.TRUE);
        return null;
    }

    private ResolvedGlyph resolveGlyph(int codepoint) {
        int actualCodepoint = codepoint;
        // Если хочешь оставить замену ⚡ → что-то другое, можно оставить здесь
        // actualCodepoint = GLYPH_REPLACEMENTS.getOrDefault(codepoint, codepoint);

        // 1. Основной шрифт
        MsdfFont.Glyph glyph = font.glyph(actualCodepoint);
        if (glyph != null) {
            return new ResolvedGlyph(font, glyph);
        }

        // 2. Первый fallback (TEST)
        if (fallbackFont1 != null) {
            glyph = fallbackFont1.glyph(actualCodepoint);
            if (glyph != null) {
                return new ResolvedGlyph(fallbackFont1, glyph);
            }
        }

        // 3. Второй fallback (TEST1)
        if (fallbackFont2 != null) {
            glyph = fallbackFont2.glyph(actualCodepoint);
            if (glyph != null) {
                return new ResolvedGlyph(fallbackFont2, glyph);
            }
        }

        if (fallbackFont3 != null) {
            glyph = fallbackFont3.glyph(actualCodepoint);
            if (glyph != null) {
                return new ResolvedGlyph(fallbackFont3, glyph);
            }
        }

        // 5. ASCII fallback для распространённых Unicode-символов
        int fallbackCp = GLYPH_FALLBACKS.get(codepoint);
        if (fallbackCp != -1 && fallbackCp != codepoint) {
            return resolveGlyph(fallbackCp); // один уровень рекурсии, т.к. fallbackCp — ASCII
        }

        return null; // глиф не найден нигде
    }

    private float scaleForFont(MsdfFont glyphFont, float primaryScale) {
        if (glyphFont == font) {
            return primaryScale;
        }
        float size = primaryScale * Math.max(1e-6f, font.emSize());
        return size / Math.max(1e-6f, glyphFont.emSize());
    }

    private static int lerpColor(int startColor, int endColor, float t) {
        t = Math.max(0f, Math.min(1f, t));
        int a1 = (startColor >>> 24) & 0xFF;
        int r1 = (startColor >>> 16) & 0xFF;
        int g1 = (startColor >>> 8) & 0xFF;
        int b1 = startColor & 0xFF;
        int a2 = (endColor >>> 24) & 0xFF;
        int r2 = (endColor >>> 16) & 0xFF;
        int g2 = (endColor >>> 8) & 0xFF;
        int b2 = endColor & 0xFF;
        int a = Math.round(a1 + (a2 - a1) * t);
        int r = Math.round(r1 + (r2 - r1) * t);
        int g = Math.round(g1 + (g2 - g1) * t);
        int b = Math.round(b1 + (b2 - b1) * t);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    public static final class TextMetrics {
        public final float width;
        public final float height;

        public TextMetrics(float width, float height) {
            this.width = width;
            this.height = height;
        }
    }

    private record ResolvedGlyph(MsdfFont font, MsdfFont.Glyph glyph) {}

    private static final class CachedLayout {
        final int[] codepoints;
        final MsdfFont[] fonts;
        final MsdfFont.Glyph[] glyphs;
        final float[] scales;
        final float[] penXs;
        final int glyphCount;
        final int charCount;
        final float width;

        CachedLayout(int[] codepoints, MsdfFont[] fonts, MsdfFont.Glyph[] glyphs,
                     float[] scales, float[] penXs, int glyphCount, int charCount, float width) {
            this.codepoints = codepoints;
            this.fonts = fonts;
            this.glyphs = glyphs;
            this.scales = scales;
            this.penXs = penXs;
            this.glyphCount = glyphCount;
            this.charCount = charCount;
            this.width = width;
        }
    }

    private static long layoutCacheKey(String text, float scale) {
        long h = text.hashCode();
        return (h << 32) | (Float.floatToIntBits(scale) & 0xFFFFFFFFL);
    }
}
