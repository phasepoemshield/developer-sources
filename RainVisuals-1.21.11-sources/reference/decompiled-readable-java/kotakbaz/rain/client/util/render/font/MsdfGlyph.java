/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package kotakbaz.rain.client.util.render.font;

import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import kotakbaz.rain.client.util.render.font.FontData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import org.joml.Vector4f;
import oxxxde.\u0628\u062f;
import oxxxde.\u062c\u0650;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001KB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u00ad\u0001\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019\u00a2\u0006\u0004\b \u0010!J\u00c7\u0001\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020)2\u0006\u0010.\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0004\b1\u00102R\u0017\u00103\u001a\u00020\u000f8\u0006\u00a2\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u00108R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u00108R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010E\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u00104R\u0016\u0010F\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u00104R\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u0010I\u00a8\u0006L"}, d2={"Loxxxde/\u0634\u064f;", "", "Loxxxde/\u062f\u062d;", "data", "", "atlasWidth", "atlasHeight", "<init>", "(Lkotakbaz/rain/client/util/render/font/FontData$GlyphData;FF)V", "Loxxxde/\u0627\u0646;", "buffer", "x", "y", "z", "size", "", "color", "thickness", "smoothness", "outlineThickness", "outlineColor", "fadeMin", "fadeMax", "fadeLeft", "fadeRight", "Loxxxde/\u0633\u0626;", "eTexture", "eColor", "eStyle", "eOutlineColor", "eFade", "eScissor", "apply", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFIFFFIFFFFLkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;)F", "meshBuilder", "u", "v", "scX", "scY", "scZ", "scW", "", "addVertex", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFFFFFFFFFLkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;FFFF)V", "width", "(F)F", "argb", "", "out", "normalizeArgb", "(I[F)V", "code", "I", "getCode", "()I", "minU", "F", "maxU", "minV", "maxV", "advance", "topPosition", "height", "Lorg/joml/Vector3f;", "currentPos", "Lorg/joml/Vector3f;", "colorBuffer", "[F", "outlineColorBuffer", "cachedColor", "cachedOutlineColor", "", "colorCached", "Z", "outlineColorCached", "ColoredGlyph", "rain-visuals"})
public final class MsdfGlyph {
    private boolean outlineColorCached;
    private final float width;
    private int cachedOutlineColor;
    private final float minU;
    private final float topPosition;
    private final float advance;
    private int cachedColor;
    private final float minV;
    private boolean colorCached;
    @NotNull
    private final float[] colorBuffer;
    @NotNull
    private final float[] outlineColorBuffer;
    @NotNull
    private final Vector3f currentPos;
    private final int code;
    private final float maxU;
    private final float maxV;
    private final float height;

    /*
     * WARNING - void declaration
     */
    private final void addVertex(MeshBuilder meshBuilder, float x, float y, float z, float u, float v, float smoothness, float thickness, float outlineThickness, float fadeMin, float fadeMax, float fadeLeft, float fadeRight, VertexElement eTexture, VertexElement eColor, VertexElement eStyle, VertexElement eOutlineColor, VertexElement eFade, VertexElement eScissor, float scX, float scY, float scZ, float scW) {
        void var23_23;
        this.currentPos.set(x, y, z);
        \u0628\u062f.INSTANCE.transformPosition(this.currentPos);
        ((MeshBuilder)meshBuilder.vertex(this.currentPos.x, this.currentPos.y, this.currentPos.z)).elementFloat(eTexture, u, v).elementFloat(eColor, this.colorBuffer[0], this.colorBuffer[1], this.colorBuffer[2], this.colorBuffer[3]).elementFloat(eStyle, thickness, smoothness, outlineThickness).elementFloat(eOutlineColor, this.outlineColorBuffer[0], this.outlineColorBuffer[1], this.outlineColorBuffer[2], this.outlineColorBuffer[3]).elementFloat(eFade, fadeMin, fadeMax, fadeLeft, fadeRight).elementFloat(eScissor, scX, scY, scZ, (float)var23_23);
    }

    public final float apply(@NotNull MeshBuilder buffer, float x, float y, float z, float size, int color, float thickness, float smoothness, float outlineThickness, int outlineColor, float fadeMin, float fadeMax, float fadeLeft, float fadeRight, @NotNull VertexElement eTexture, @NotNull VertexElement eColor, @NotNull VertexElement eStyle, @NotNull VertexElement eOutlineColor, @NotNull VertexElement eFade, @NotNull VertexElement eScissor) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(eTexture, "eTexture");
        Intrinsics.checkNotNullParameter(eColor, "eColor");
        Intrinsics.checkNotNullParameter(eStyle, "eStyle");
        Intrinsics.checkNotNullParameter(eOutlineColor, "eOutlineColor");
        Intrinsics.checkNotNullParameter(eFade, "eFade");
        Intrinsics.checkNotNullParameter(eScissor, "eScissor");
        float localY = y - this.topPosition * size;
        float w = this.width * size;
        float h = this.height * size;
        if (!this.colorCached || this.cachedColor != color) {
            this.cachedColor = color;
            this.colorCached = true;
            this.normalizeArgb(color, this.colorBuffer);
        }
        if (!this.outlineColorCached || this.cachedOutlineColor != outlineColor) {
            this.cachedOutlineColor = outlineColor;
            this.outlineColorCached = true;
            this.normalizeArgb(outlineColor, this.outlineColorBuffer);
        }
        Vector4f scissor = \u062c\u0650.INSTANCE.getCurrentScissorValues();
        this.addVertex(buffer, x, localY, z, this.minU, this.minV, smoothness, thickness, outlineThickness, fadeMin, fadeMax, fadeLeft, fadeRight, eTexture, eColor, eStyle, eOutlineColor, eFade, eScissor, scissor.x, scissor.y, scissor.z, scissor.w);
        this.addVertex(buffer, x, localY + h, z, this.minU, this.maxV, smoothness, thickness, outlineThickness, fadeMin, fadeMax, fadeLeft, fadeRight, eTexture, eColor, eStyle, eOutlineColor, eFade, eScissor, scissor.x, scissor.y, scissor.z, scissor.w);
        this.addVertex(buffer, x + w, localY + h, z, this.maxU, this.maxV, smoothness, thickness, outlineThickness, fadeMin, fadeMax, fadeLeft, fadeRight, eTexture, eColor, eStyle, eOutlineColor, eFade, eScissor, scissor.x, scissor.y, scissor.z, scissor.w);
        this.addVertex(buffer, x + w, localY, z, this.maxU, this.minV, smoothness, thickness, outlineThickness, fadeMin, fadeMax, fadeLeft, fadeRight, eTexture, eColor, eStyle, eOutlineColor, eFade, eScissor, scissor.x, scissor.y, scissor.z, scissor.w);
        return this.advance * size;
    }

    public MsdfGlyph(@NotNull FontData.GlyphData data, float atlasWidth, float atlasHeight) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = data.getUnicode();
        this.advance = data.getAdvance();
        this.currentPos = new Vector3f();
        this.colorBuffer = new float[4];
        this.outlineColorBuffer = new float[4];
        FontData.BoundsData atlasBounds = data.getAtlasBounds();
        if (atlasBounds != null) {
            this.minU = atlasBounds.getLeft() / atlasWidth;
            this.maxU = atlasBounds.getRight() / atlasWidth;
            this.minV = 1.0f - atlasBounds.getTop() / atlasHeight;
            this.maxV = 1.0f - atlasBounds.getBottom() / atlasHeight;
        } else {
            this.minU = 0.0f;
            this.maxU = 0.0f;
            this.minV = 0.0f;
            this.maxV = 0.0f;
        }
        FontData.BoundsData planeBounds = data.getPlaneBounds();
        if (planeBounds != null) {
            this.width = planeBounds.getRight() - planeBounds.getLeft();
            this.height = planeBounds.getTop() - planeBounds.getBottom();
            this.topPosition = planeBounds.getTop();
        } else {
            this.width = 0.0f;
            this.height = 0.0f;
            this.topPosition = 0.0f;
        }
    }

    public final float width(float size) {
        return this.advance * size;
    }

    public final int getCode() {
        return this.code;
    }

    private final void normalizeArgb(int argb, float[] out) {
        out[0] = (float)(argb >> 16 & 0xFF) / 255.0f;
        out[1] = (float)(argb >> 8 & 0xFF) / 255.0f;
        out[2] = (float)(argb & 0xFF) / 255.0f;
        out[3] = (float)(argb >>> 24 & 0xFF) / 255.0f;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0004H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0012\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u0013H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006\u001a"}, d2={"Loxxxde/\u063a;", "", "", "c", "", "color", "<init>", "(CI)V", "component1", "()C", "component2", "()I", "copy", "(CI)Lkotakbaz/rain/client/util/render/font/MsdfGlyph$ColoredGlyph;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "C", "getC", "I", "getColor", "rain-visuals"})
    public static final class ColoredGlyph {
        private final int color;
        private final char c;

        public ColoredGlyph(char c, int color) {
            this.c = c;
            this.color = color;
        }

        public final char component1() {
            return this.c;
        }

        @NotNull
        public final ColoredGlyph copy(char c, int color) {
            return new ColoredGlyph(c, color);
        }

        public final int getColor() {
            return this.color;
        }

        public final int component2() {
            return this.color;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColoredGlyph)) {
                return false;
            }
            ColoredGlyph coloredGlyph = (ColoredGlyph)other;
            if (this.c != coloredGlyph.c) {
                return false;
            }
            if (this.color != coloredGlyph.color) {
                return false;
            }
            return true;
        }

        public final char getC() {
            return this.c;
        }

        public int hashCode() {
            int result = Character.hashCode(this.c);
            result = result * 31 + Integer.hashCode(this.color);
            return result;
        }

        public static /* synthetic */ ColoredGlyph copy$default(ColoredGlyph coloredGlyph, char c, int n, int n2, Object object) {
            if ((n2 & 1) != 0) {
                c = coloredGlyph.c;
            }
            if ((n2 & 2) != 0) {
                n = coloredGlyph.color;
            }
            return coloredGlyph.copy(c, n);
        }

        @NotNull
        public String toString() {
            return "ColoredGlyph(c=" + this.c + ", color=" + this.color + ")";
        }
    }
}

