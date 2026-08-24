/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gl.Framebuffer
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.KawaseRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gl.Framebuffer;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import oxxxde.\u0631\u0629;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0018\u00a2\u0006\u0004\b\u0016\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001f\u0010\u000eJU\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010&J-\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010'J5\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010(JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010)JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010*JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010+JU\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010,JU\u0010-\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010;\u00a8\u0006="}, d2={"Loxxxde/\u062c\u0621;", "", "Loxxxde/\u062c\u062b;", "textureRect", "Loxxxde/\u0627\u0652;", "kawase", "<init>", "(Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;Lkotakbaz/rain/client/util/render/display/KawaseRenderer;)V", "Loxxxde/\u0635\u0624;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "", "radius", "round", "(F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "mix", "width", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "borderWidth", "borderColor", "x", "y", "height", "Loxxxde/\u0633\u0629;", "", "draw", "(FFFFLorg/joml/Vector4f;Lkotakbaz/rain/client/util/color/QuadColor;FFLjava/awt/Color;)V", "(FFFF)V", "(FFFFF)V", "(FFFFLorg/joml/Vector4f;Lkotakbaz/rain/client/util/color/QuadColor;F)V", "(FFFFFLjava/awt/Color;F)V", "(FFFFLorg/joml/Vector4f;Ljava/awt/Color;F)V", "(FFFFLorg/joml/Vector4f;Ljava/awt/Color;FFLjava/awt/Color;)V", "drawWithBorder", "(FFFFFLjava/awt/Color;FFLjava/awt/Color;)V", "Loxxxde/\u062c\u062b;", "Loxxxde/\u0627\u0652;", "currentPipeline", "Loxxxde/\u0635\u0624;", "cachedRadius", "Lorg/joml/Vector4f;", "cachedColor", "Loxxxde/\u0633\u0629;", "cachedMix", "F", "cachedBorderWidth", "cachedBorderColor", "Ljava/awt/Color;", "Companion", "rain-visuals"})
public final class BlurredRectRenderer {
    @NotNull
    private Color cachedBorderColor;
    @NotNull
    private final TextureRectRenderer textureRect;
    private float cachedBorderWidth;
    private float cachedMix;
    @NotNull
    private final QuadColor cachedColor;
    @NotNull
    private final KawaseRenderer kawase;
    @NotNull
    private ClientRenderPipeline currentPipeline;
    @NotNull
    private final Vector4f cachedRadius;
    @NotNull
    public static final \u0631\u0629 Companion = new \u0631\u0629(null);
    @NotNull
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);

    @NotNull
    public final BlurredRectRenderer borderWidth(float width) {
        this.cachedBorderWidth = width;
        return this;
    }

    public final void draw(float x, float y, float width, float height, @NotNull Vector4f radius, @NotNull Color color, float mix) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedColor.set(color);
        this.draw(x, y, width, height, radius, this.cachedColor, mix);
    }

    @NotNull
    public final BlurredRectRenderer color(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        Intrinsics.checkNotNullParameter(c3, "c3");
        Intrinsics.checkNotNullParameter(c4, "c4");
        this.cachedColor.set(c1, c2, c3, c4);
        return this;
    }

    public final void draw(float x, float y, float width, float height, float radius) {
        this.cachedRadius.set(radius, radius, radius, radius);
        this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, this.cachedMix, this.cachedBorderWidth, this.cachedBorderColor);
        this.cachedBorderWidth = 0.0f;
        this.cachedBorderColor = TRANSPARENT;
    }

    public final void draw(float x, float y, float width, float height, float radius, @NotNull Color color, float mix) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedColor.set(color);
        this.cachedRadius.set(radius, radius, radius, radius);
        this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, mix);
    }

    @NotNull
    public final BlurredRectRenderer round(@NotNull Vector4f radius) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.cachedRadius.set((Vector4fc)radius);
        return this;
    }

    @NotNull
    public final BlurredRectRenderer mix(float mix) {
        this.cachedMix = mix;
        return this;
    }

    public final void draw(float x, float y, float width, float height, @NotNull Vector4f radius, @NotNull Color color, float mix, float borderWidth, @NotNull Color borderColor) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.cachedColor.set(color);
        this.draw(x, y, width, height, radius, this.cachedColor, mix, borderWidth, borderColor);
    }

    @NotNull
    public final BlurredRectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        this.currentPipeline = pipeline;
        return this;
    }

    public final void draw(float x, float y, float width, float height, @NotNull Vector4f radius, @NotNull QuadColor color, float mix) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(color, "color");
        this.draw(x, y, width, height, radius, color, mix, this.cachedBorderWidth, this.cachedBorderColor);
        this.cachedBorderWidth = 0.0f;
        this.cachedBorderColor = TRANSPARENT;
    }

    @NotNull
    public final BlurredRectRenderer color(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedColor.set(color);
        return this;
    }

    @NotNull
    public final BlurredRectRenderer round(float radius) {
        this.cachedRadius.set(radius, radius, radius, radius);
        return this;
    }

    public final void draw(float x, float y, float width, float height, @NotNull Vector4f radius, @NotNull QuadColor color, float mix, float borderWidth, @NotNull Color borderColor) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        if (!this.kawase.hasFramebuffer()) {
            return;
        }
        int textureId = this.kawase.texture().texture().getGlId();
        Framebuffer fbo = this.kawase.framebuffer();
        float scale = \u0636\u0643.getMc().getWindow().getScaleFactor();
        float screenW = (float)fbo.textureWidth / scale;
        float screenH = (float)fbo.textureHeight / scale;
        float u = x / screenW;
        float texW = width / screenW;
        float v = 1.0f - (y + height) / screenH;
        float texH = height / screenH;
        float alpha = (float)color.getColor1().getAlpha() / 255.0f;
        this.textureRect.priority(this.currentPipeline).texture(textureId).border(borderWidth, borderColor).draw(x, y, width, height, color, radius, mix, u, v, texW, texH, alpha);
    }

    @NotNull
    public final BlurredRectRenderer border(float width, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedBorderWidth = width;
        this.cachedBorderColor = color;
        return this;
    }

    public final void drawWithBorder(float x, float y, float width, float height, float radius, @NotNull Color color, float mix, float borderWidth, @NotNull Color borderColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.cachedColor.set(color);
        this.cachedRadius.set(radius, radius, radius, radius);
        this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, mix, borderWidth, borderColor);
    }

    public final void draw(float x, float y, float width, float height) {
        this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, this.cachedMix, this.cachedBorderWidth, this.cachedBorderColor);
        this.cachedBorderWidth = 0.0f;
        this.cachedBorderColor = TRANSPARENT;
    }

    public BlurredRectRenderer(@NotNull TextureRectRenderer textureRect, @NotNull KawaseRenderer kawase) {
        Intrinsics.checkNotNullParameter(textureRect, "textureRect");
        Intrinsics.checkNotNullParameter(kawase, "kawase");
        this.textureRect = textureRect;
        this.kawase = kawase;
        this.currentPipeline = ClientRenderPipeline.LOW;
        this.cachedRadius = new Vector4f();
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        this.cachedColor = new QuadColor(color);
        this.cachedMix = 0.2f;
        this.cachedBorderColor = TRANSPARENT;
    }

    @NotNull
    public final BlurredRectRenderer borderColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedBorderColor = color;
        return this;
    }
}

