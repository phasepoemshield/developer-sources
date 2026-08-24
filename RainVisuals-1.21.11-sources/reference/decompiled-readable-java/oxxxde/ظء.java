/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0630\u0631;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Loxxxde/\u0638\u0621;", "", "<init>", "()V", "", "textureId", "", "x", "y", "width", "height", "alpha", "", "draw", "(IFFFFF)V", "rain-visuals"})
public final class \u0638\u0621 {
    @NotNull
    public static final \u0638\u0621 INSTANCE = new \u0638\u0621();

    @JvmStatic
    public static final void draw(int textureId, float x, float y, float width, float height, float alpha) {
        block3: {
            block2: {
                if (textureId <= 0) break block2;
                if (width <= 1.0f) break block2;
                if (!(height <= 1.0f) && !(alpha <= 0.01f)) break block3;
            }
            return;
        }
        TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.GUI_SPECIAL).texture(textureId);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        textureRectRenderer.draw(x, y, width, height, color, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, RangesKt.coerceIn(alpha, 0.0f, 1.0f));
    }

    private \u0638\u0621() {
    }
}

