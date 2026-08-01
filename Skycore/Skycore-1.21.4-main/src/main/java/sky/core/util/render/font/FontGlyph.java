package sky.core.util.render.font;

import java.util.Objects;

public final class FontGlyph {
    private final int u;
    private final int v;
    private final int width;
    private final int height;
    private final char value;
    private final FontGlyphAtlas atlas;

    public FontGlyph(int u, int v, int width, int height, char value, FontGlyphAtlas atlas) {
        this.u = u;
        this.v = v;
        this.width = width;
        this.height = height;
        this.value = value;
        this.atlas = atlas;
    }

    public int u() {
        return this.u;
    }

    public int v() {
        return this.v;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public char value() {
        return this.value;
    }

    public FontGlyphAtlas atlas() {
        return this.atlas;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontGlyph glyph)) {
            return false;
        }
        return this.u == glyph.u
                && this.v == glyph.v
                && this.width == glyph.width
                && this.height == glyph.height
                && this.value == glyph.value
                && Objects.equals(this.atlas, glyph.atlas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.u, this.v, this.width, this.height, this.value, this.atlas);
    }
}
