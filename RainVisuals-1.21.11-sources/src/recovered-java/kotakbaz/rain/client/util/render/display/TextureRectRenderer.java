/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import kotakbaz.rain.client.render.texture.GlTex;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import oxxxde.\u0634\u0638;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0018\u0010\u0019Jm\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011\u00a2\u0006\u0004\b'\u0010(Jy\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u0011\u00a2\u0006\u0004\b'\u0010)Jy\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u0011\u00a2\u0006\u0004\b'\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010+R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u0010-R\u0014\u00101\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104\u00a8\u00066"}, d2={"Loxxxde/\u062c\u062b;", "", "Loxxxde/\u0632\u062c;", "advanced", "<init>", "(Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;)V", "Loxxxde/\u0635\u0624;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "", "id", "texture", "(I)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "Loxxxde/\u0637\u062c;", "glTex", "(Lkotakbaz/rain/client/render/texture/GlTex;)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "", "width", "Ljava/awt/Color;", "color", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "gridSize", "pixelated", "(F)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "x", "y", "height", "Loxxxde/\u0633\u0629;", "Lorg/joml/Vector4f;", "radius", "mix", "u", "v", "texW", "texH", "alpha", "", "draw", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;FFFFFF)V", "(FFFFLjava/awt/Color;FFFFFFF)V", "(FFFFLjava/awt/Color;Lorg/joml/Vector4f;FFFFFF)V", "Loxxxde/\u0632\u062c;", "cachedBorderWidth", "F", "cachedBorderColor", "Ljava/awt/Color;", "cachedPixelGridSize", "cachedColor", "Loxxxde/\u0633\u0629;", "cachedRadius", "Lorg/joml/Vector4f;", "Companion", "rain-visuals"})
public final class TextureRectRenderer {
    @NotNull
    public static final \u0634\u0638 Companion = new \u0634\u0638(null);
    @NotNull
    private final QuadColor cachedColor;
    @NotNull
    private final AdvancedRectRenderer advanced;
    private float cachedPixelGridSize;
    @NotNull
    private Color cachedBorderColor;
    @NotNull
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);
    @NotNull
    private final Vector4f cachedRadius;
    private float cachedBorderWidth;

    public static /* synthetic */ void draw$default(TextureRectRenderer textureRectRenderer, float f, float f2, float f3, float f4, Color color, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int n, Object object) {
        if ((n & 0x40) != 0) {
            f6 = 0.0f;
        }
        if ((n & 0x80) != 0) {
            f7 = 0.0f;
        }
        if ((n & 0x100) != 0) {
            f8 = 0.0f;
        }
        if ((n & 0x200) != 0) {
            f9 = 1.0f;
        }
        if ((n & 0x400) != 0) {
            f10 = 1.0f;
        }
        if ((n & 0x800) != 0) {
            f11 = 1.0f;
        }
        textureRectRenderer.draw(f, f2, f3, f4, color, f5, f6, f7, f8, f9, f10, f11);
    }

    public final void draw(float x, float y, float width, float height, @NotNull Color color, @NotNull Vector4f radius, float mix, float u, float v, float texW, float texH, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.cachedColor.set(color);
        this.draw(x, y, width, height, this.cachedColor, radius, mix, u, v, texW, texH, alpha);
    }

    public TextureRectRenderer(@NotNull AdvancedRectRenderer advanced) {
        Intrinsics.checkNotNullParameter(advanced, "advanced");
        this.advanced = advanced;
        this.cachedBorderColor = TRANSPARENT;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        this.cachedColor = new QuadColor(color);
        this.cachedRadius = new Vector4f();
    }

    @NotNull
    public final TextureRectRenderer texture(@NotNull GlTex glTex) {
        Intrinsics.checkNotNullParameter(glTex, "glTex");
        this.advanced.texture(glTex);
        return this;
    }

    public static /* synthetic */ void draw$default(TextureRectRenderer textureRectRenderer, float f, float f2, float f3, float f4, Color color, Vector4f vector4f, float f5, float f6, float f7, float f8, float f9, float f10, int n, Object object) {
        if ((n & 0x40) != 0) {
            f5 = 0.0f;
        }
        if ((n & 0x80) != 0) {
            f6 = 0.0f;
        }
        if ((n & 0x100) != 0) {
            f7 = 0.0f;
        }
        if ((n & 0x200) != 0) {
            f8 = 1.0f;
        }
        if ((n & 0x400) != 0) {
            f9 = 1.0f;
        }
        if ((n & 0x800) != 0) {
            f10 = 1.0f;
        }
        textureRectRenderer.draw(f, f2, f3, f4, color, vector4f, f5, f6, f7, f8, f9, f10);
    }

    @NotNull
    public final TextureRectRenderer pixelated(float gridSize) {
        this.cachedPixelGridSize = RangesKt.coerceAtLeast(gridSize, 0.0f);
        return this;
    }

    public final void draw(float x, float y, float width, float height, @NotNull QuadColor color, @NotNull Vector4f radius, float mix, float u, float v, float texW, float texH, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.advanced.pixelated(this.cachedPixelGridSize).border(this.cachedBorderWidth, this.cachedBorderColor).drawTexture(x, y, width, height, color, mix, alpha, u, v, texW, texH, radius);
        this.advanced.pixelated(0.0f);
        this.advanced.border(0.0f, TRANSPARENT);
        this.cachedBorderWidth = 0.0f;
        this.cachedBorderColor = TRANSPARENT;
        this.cachedPixelGridSize = 0.0f;
    }

    @NotNull
    public final TextureRectRenderer border(float width, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedBorderWidth = width;
        this.cachedBorderColor = color;
        return this;
    }

    @NotNull
    public final TextureRectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        this.advanced.priority(pipeline);
        return this;
    }

    public final void draw(float x, float y, float width, float height, @NotNull Color color, float radius, float mix, float u, float v, float texW, float texH, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedColor.set(color);
        this.cachedRadius.set(radius, radius, radius, radius);
        this.draw(x, y, width, height, this.cachedColor, this.cachedRadius, mix, u, v, texW, texH, alpha);
    }

    @NotNull
    public final TextureRectRenderer texture(int id) {
        this.advanced.texture(id);
        return this;
    }
}

