/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.controls.RectType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import oxxxde.\u0631\u0624;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0019\u00a2\u0006\u0004\b\u0017\u0010\u001aJ=\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b!\u0010\"J-\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015\u00a2\u0006\u0004\b!\u0010#J\u001d\u0010$\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\b&\u0010\u0018J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b'\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00101\u00a8\u00063"}, d2={"Loxxxde/\u0636\u0650;", "", "Loxxxde/\u0632\u062c;", "advanced", "<init>", "(Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;)V", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Loxxxde/\u0635\u0624;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Loxxxde/\u0631\u0635;", "type", "(Lkotakbaz/rain/client/util/render/engine/controls/RectType;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "", "r", "round", "(F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "x", "y", "width", "height", "radius", "", "draw", "(FFFFFLjava/awt/Color;)V", "(FFFF)V", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "borderWidth", "borderColor", "Loxxxde/\u0632\u062c;", "cachedRadius", "Lorg/joml/Vector4f;", "Loxxxde/\u0633\u0629;", "cachedColor", "Loxxxde/\u0633\u0629;", "cachedBorderWidth", "F", "cachedBorderColor", "Ljava/awt/Color;", "Companion", "rain-visuals"})
public final class BasicRectRenderer {
    @NotNull
    private final QuadColor cachedColor;
    @NotNull
    private final AdvancedRectRenderer advanced;
    @NotNull
    private Color cachedBorderColor;
    @NotNull
    private static final Color TRANSPARENT;
    private float cachedBorderWidth;
    @NotNull
    public static final \u0631\u0624 Companion;
    @NotNull
    private final Vector4f cachedRadius;

    static {
        Companion = new \u0631\u0624(null);
        TRANSPARENT = new Color(0, 0, 0, 0);
    }

    @NotNull
    public final BasicRectRenderer borderColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedBorderColor = color;
        return this;
    }

    public final void draw(float x, float y, float width, float height) {
        this.advanced.type(RectType.BASIC);
        this.advanced.drawRect(x, y, width, height, this.cachedColor, this.cachedRadius, this.cachedBorderWidth, this.cachedBorderColor);
        this.cachedBorderWidth = 0.0f;
        this.cachedBorderColor = TRANSPARENT;
    }

    @NotNull
    public final BasicRectRenderer round(float r) {
        this.advanced.round(r);
        this.cachedRadius.set(r, r, r, r);
        return this;
    }

    public BasicRectRenderer(@NotNull AdvancedRectRenderer advanced) {
        Intrinsics.checkNotNullParameter(advanced, "advanced");
        this.advanced = advanced;
        this.cachedRadius = new Vector4f();
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        this.cachedColor = new QuadColor(color);
        this.cachedBorderColor = TRANSPARENT;
    }

    @NotNull
    public final BasicRectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        this.advanced.priority(pipeline);
        return this;
    }

    @NotNull
    public final BasicRectRenderer border(float width, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedBorderWidth = width;
        this.cachedBorderColor = color;
        return this;
    }

    @NotNull
    public final BasicRectRenderer round(@NotNull Vector4f r) {
        Intrinsics.checkNotNullParameter(r, "r");
        this.advanced.round(r);
        this.cachedRadius.set((Vector4fc)r);
        return this;
    }

    @NotNull
    public final BasicRectRenderer borderWidth(float width) {
        this.cachedBorderWidth = width;
        return this;
    }

    @NotNull
    public final BasicRectRenderer color(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        Intrinsics.checkNotNullParameter(c3, "c3");
        Intrinsics.checkNotNullParameter(c4, "c4");
        this.advanced.color(c1, c2, c3, c4);
        this.cachedColor.set(c1, c2, c3, c4);
        return this;
    }

    @NotNull
    public final BasicRectRenderer color(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.advanced.color(color);
        this.cachedColor.set(color);
        return this;
    }

    public final void draw(float x, float y, float width, float height, float radius, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.cachedColor.set(color);
        this.cachedRadius.set(radius, radius, radius, radius);
        this.advanced.type(RectType.BASIC);
        this.advanced.drawRect(x, y, width, height, this.cachedColor, this.cachedRadius, this.cachedBorderWidth, this.cachedBorderColor);
        this.cachedBorderWidth = 0.0f;
        this.cachedBorderColor = TRANSPARENT;
    }

    @NotNull
    public final BasicRectRenderer type(@NotNull RectType type) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.advanced.type(type);
        return this;
    }
}

