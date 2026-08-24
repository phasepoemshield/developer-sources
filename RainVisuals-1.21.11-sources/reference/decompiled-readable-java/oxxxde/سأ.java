/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u062d;
import oxxxde.\u062b\u0652;
import oxxxde.\u0630\u0631;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Loxxxde/\u0633\u0623;", "", "<init>", "()V", "", "rowX", "rowY", "rowWidth", "rowHeight", "padding", "progress", "alpha", "enableProgress", "Loxxxde/\u0635\u0624;", "pipeline", "", "render", "(FFFFFFFFLkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "disabledAlpha", "enabledAlpha", "alphaByState", "(FFFF)F", "rain-visuals"})
public final class \u0633\u0623 {
    @NotNull
    public static final \u0633\u0623 INSTANCE = new \u0633\u0623();

    private \u0633\u0623() {
    }

    private final float alphaByState(float disabledAlpha, float enabledAlpha, float enableProgress, float alpha) {
        return (disabledAlpha + (enabledAlpha - disabledAlpha) * enableProgress) * alpha;
    }

    /*
     * WARNING - void declaration
     */
    public final void render(float rowX, float rowY, float rowWidth, float rowHeight, float padding, float progress, float alpha, float enableProgress, @NotNull ClientRenderPipeline pipeline) {
        void var20_20;
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        float toggleHeight = rowHeight * 0.55f;
        float toggleWidth = toggleHeight * 1.7f;
        float toggleX = rowX + rowWidth - padding - toggleWidth;
        float toggleY = rowY + (rowHeight - toggleHeight) * 0.5f;
        float stateProgress = RangesKt.coerceIn(enableProgress, 0.0f, 1.0f);
        float renderAlpha = RangesKt.coerceIn(alpha, 0.0f, 1.0f);
        Color toggleOff = \u062b\u0652.INSTANCE.value(this.alphaByState(0.06f, 0.12f, stateProgress, renderAlpha));
        Color toggleOn = \u062b\u0652.INSTANCE.title(this.alphaByState(0.14f, 0.28f, stateProgress, renderAlpha));
        Color toggleBg = \u0628\u062d.INSTANCE.interpolateColor(toggleOff, toggleOn, progress);
        Color knobColor = \u062b\u0652.INSTANCE.title(this.alphaByState(0.45f, 0.9f, stateProgress, renderAlpha));
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(pipeline).color(toggleBg).round(toggleHeight / 2.8f).draw(toggleX, toggleY, toggleWidth, toggleHeight);
        float knobSize = toggleHeight - 2.0f;
        float knobX = toggleX + 1.0f + (toggleWidth - knobSize - 2.0f) * progress;
        float knobY = toggleY + 1.0f;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(pipeline).color(knobColor).round(knobSize / 3.0f).draw(knobX, knobY, (float)var20_20, (float)var20_20);
    }
}

