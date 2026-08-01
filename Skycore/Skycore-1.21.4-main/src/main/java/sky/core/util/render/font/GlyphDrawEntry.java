package sky.core.util.render.font;

public final class GlyphDrawEntry {
    private final float x;
    private final float y;
    private final int color;
    private final FontGlyph glyph;

    public GlyphDrawEntry(float x, float y, int color, FontGlyph glyph) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.glyph = glyph;
    }

    public float x() {
        return this.x;
    }

    public float y() {
        return this.y;
    }

    public int color() {
        return this.color;
    }

    public FontGlyph glyph() {
        return this.glyph;
    }
}
