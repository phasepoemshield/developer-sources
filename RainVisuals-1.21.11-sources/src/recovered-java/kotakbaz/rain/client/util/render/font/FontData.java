/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.font;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u062e;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005\u001e\u001f !\"B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019\u00a8\u0006#"}, d2={"Loxxxde/\u0627\u062d;", "", "<init>", "()V", "Loxxxde/\u0627\u0644;", "atlas", "Loxxxde/\u0627\u0644;", "getAtlas", "()Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "setAtlas", "(Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;)V", "Loxxxde/\u0635\u0643;", "metrics", "Loxxxde/\u0635\u0643;", "getMetrics", "()Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "setMetrics", "(Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;)V", "", "Loxxxde/\u062f\u062d;", "glyphs", "Ljava/util/List;", "getGlyphs", "()Ljava/util/List;", "setGlyphs", "(Ljava/util/List;)V", "Loxxxde/\u062a\u062e;", "kernings", "getKernings", "setKernings", "AtlasData", "MetricsData", "GlyphData", "BoundsData", "KerningData", "rain-visuals"})
public final class FontData {
    @NotNull
    private AtlasData atlas = new AtlasData();
    @NotNull
    private MetricsData metrics = new MetricsData();
    @SerializedName(value="kerning")
    @NotNull
    private List<\u062a\u062e> kernings;
    @NotNull
    private List<GlyphData> glyphs = CollectionsKt.emptyList();

    @NotNull
    public final List<GlyphData> getGlyphs() {
        return this.glyphs;
    }

    public final void setGlyphs(@NotNull List<GlyphData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.glyphs = list;
    }

    public final void setAtlas(@NotNull AtlasData atlasData) {
        Intrinsics.checkNotNullParameter(atlasData, "<set-?>");
        this.atlas = atlasData;
    }

    public FontData() {
        this.kernings = CollectionsKt.emptyList();
    }

    public final void setKernings(@NotNull List<\u062a\u062e> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.kernings = list;
    }

    public final void setMetrics(@NotNull MetricsData metricsData) {
        Intrinsics.checkNotNullParameter(metricsData, "<set-?>");
        this.metrics = metricsData;
    }

    @NotNull
    public final AtlasData getAtlas() {
        return this.atlas;
    }

    @NotNull
    public final MetricsData getMetrics() {
        return this.metrics;
    }

    @NotNull
    public final List<\u062a\u062e> getKernings() {
        return this.kernings;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n\u00a8\u0006\u0011"}, d2={"Loxxxde/\u0627\u0644;", "", "<init>", "()V", "", "range", "F", "getRange", "()F", "setRange", "(F)V", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "rain-visuals"})
    public static final class AtlasData {
        @SerializedName(value="distanceRange")
        private float range;
        private float width;
        private float height;

        public final void setWidth(float f) {
            this.width = f;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getRange() {
            return this.range;
        }

        public final void setHeight(float f) {
            this.height = f;
        }

        public final void setRange(float f) {
            this.range = f;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n\u00a8\u0006\u0014"}, d2={"Loxxxde/\u0638\u0623;", "", "<init>", "()V", "", "left", "F", "getLeft", "()F", "setLeft", "(F)V", "top", "getTop", "setTop", "right", "getRight", "setRight", "bottom", "getBottom", "setBottom", "rain-visuals"})
    public static final class BoundsData {
        private float left;
        private float top;
        private float right;
        private float bottom;

        public final void setBottom(float f) {
            this.bottom = f;
        }

        public final float getBottom() {
            return this.bottom;
        }

        public final void setTop(float f) {
            this.top = f;
        }

        public final void setRight(float f) {
            this.right = f;
        }

        public final float getTop() {
            return this.top;
        }

        public final void setLeft(float f) {
            this.left = f;
        }

        public final float getRight() {
            return this.right;
        }

        public final float getLeft() {
            return this.left;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018\u00a8\u0006\u001c"}, d2={"Loxxxde/\u062f\u062d;", "", "<init>", "()V", "", "unicode", "I", "getUnicode", "()I", "setUnicode", "(I)V", "", "advance", "F", "getAdvance", "()F", "setAdvance", "(F)V", "Loxxxde/\u0638\u0623;", "planeBounds", "Loxxxde/\u0638\u0623;", "getPlaneBounds", "()Lkotakbaz/rain/client/util/render/font/FontData$BoundsData;", "setPlaneBounds", "(Lkotakbaz/rain/client/util/render/font/FontData$BoundsData;)V", "atlasBounds", "getAtlasBounds", "setAtlasBounds", "rain-visuals"})
    public static final class GlyphData {
        @Nullable
        private BoundsData atlasBounds;
        private int unicode;
        private float advance;
        @Nullable
        private BoundsData planeBounds;

        public final void setPlaneBounds(@Nullable BoundsData boundsData) {
            this.planeBounds = boundsData;
        }

        public final float getAdvance() {
            return this.advance;
        }

        public final int getUnicode() {
            return this.unicode;
        }

        @Nullable
        public final BoundsData getPlaneBounds() {
            return this.planeBounds;
        }

        public final void setUnicode(int n) {
            this.unicode = n;
        }

        @Nullable
        public final BoundsData getAtlasBounds() {
            return this.atlasBounds;
        }

        public final void setAtlasBounds(@Nullable BoundsData boundsData) {
            this.atlasBounds = boundsData;
        }

        public final void setAdvance(float f) {
            this.advance = f;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0012"}, d2={"Loxxxde/\u0635\u0643;", "", "<init>", "()V", "", "baselineHeight", "()F", "lineHeight", "F", "getLineHeight", "setLineHeight", "(F)V", "ascender", "getAscender", "setAscender", "descender", "getDescender", "setDescender", "rain-visuals"})
    public static final class MetricsData {
        private float descender;
        private float ascender;
        private float lineHeight;

        public final void setLineHeight(float f) {
            this.lineHeight = f;
        }

        public final float baselineHeight() {
            return this.lineHeight + this.descender;
        }

        public final void setAscender(float f) {
            this.ascender = f;
        }

        public final float getAscender() {
            return this.ascender;
        }

        public final float getDescender() {
            return this.descender;
        }

        public final void setDescender(float f) {
            this.descender = f;
        }

        public final float getLineHeight() {
            return this.lineHeight;
        }
    }
}

