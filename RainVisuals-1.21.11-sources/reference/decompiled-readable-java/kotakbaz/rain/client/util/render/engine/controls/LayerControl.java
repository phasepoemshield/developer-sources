/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.layout.MenuLayout;
import kotakbaz.rain.ui.menu.render.MenuScrollBarRenderer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u064e;
import oxxxde.\u0630\u0631;
import oxxxde.\u0630\u063a;
import oxxxde.\u0633\u0643;
import oxxxde.\u0638\u064e;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005JS\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0017\u00a8\u0006\u001c"}, d2={"Loxxxde/\u062c\u0644;", "", "Loxxxde/\u0627\u0633;", "pipelines", "<init>", "(Lkotakbaz/rain/ui/api/PipelinedRender;)V", "Loxxxde/\u0632\u0652;", "layout", "", "contentHeight", "viewHeight", "scrollOffset", "alpha", "mouseX", "mouseY", "", "dragging", "Loxxxde/\u062e\u0641;", "render", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;FFFFFFZ)Lkotakbaz/rain/ui/menu/render/MenuScrollBarRenderer$State;", "Loxxxde/\u0627\u0633;", "Loxxxde/\u0631\u064a;", "visibilityAnimation", "Loxxxde/\u0631\u064a;", "hoverAnimation", "thumbHeightAnimation", "thumbYAnimation", "State", "rain-visuals"})
public final class LayerControl {
    @NotNull
    private final AnimationUtil visibilityAnimation;
    @NotNull
    private final PipelinedRender pipelines;
    @NotNull
    private final AnimationUtil thumbHeightAnimation;
    @NotNull
    private final AnimationUtil hoverAnimation;
    @NotNull
    private final AnimationUtil thumbYAnimation;

    public LayerControl(@NotNull PipelinedRender pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        this.pipelines = pipelines;
        this.visibilityAnimation = new AnimationUtil(0.0f, 1, null);
        this.hoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.thumbHeightAnimation = new AnimationUtil(0.0f, 1, null);
        this.thumbYAnimation = new AnimationUtil(0.0f, 1, null);
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public final MenuScrollBarRenderer.State render(@NotNull MenuLayout layout, float contentHeight, float viewHeight, float scrollOffset, float alpha, float mouseX, float mouseY, boolean dragging) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        trackX = layout.getScrollBarX();
        trackY = layout.getScrollBarY();
        baseTrackWidth = 2.5f;
        trackHeight = layout.getScrollBarHeight();
        if (!(contentHeight > viewHeight + 0.5f)) ** GOTO lbl-1000
        if (trackHeight > 0.0f) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        canScroll = v0;
        var15_14 = \u0628\u0641.INSTANCE;
        visibility = RangesKt.coerceIn(this.visibilityAnimation.animate(canScroll ? 1.0f : 0.0f, 200.0f, new \u0633\u0643(var15_14)), 0.0f, 1.0f);
        targetThumbHeight = canScroll == false ? trackHeight : RangesKt.coerceIn(trackHeight * (viewHeight / contentHeight), 12.0f, trackHeight);
        targetTravel = RangesKt.coerceAtLeast(trackHeight - targetThumbHeight, 0.0f);
        maxOffset = RangesKt.coerceAtLeast(contentHeight - viewHeight, 0.0f);
        if (!canScroll) ** GOTO lbl-1000
        if (maxOffset <= 0.0f) lbl-1000:
        // 2 sources

        {
            v1 = 0.0f;
        } else {
            v1 = RangesKt.coerceIn(scrollOffset / maxOffset, 0.0f, 1.0f);
        }
        progress = v1;
        targetThumbY = trackY + targetTravel * progress;
        var21_21 = \u0628\u0641.INSTANCE;
        thumbHeight = RangesKt.coerceIn(this.thumbHeightAnimation.animate(targetThumbHeight, 180.0f, new \u0638\u064e(var21_21)), 0.0f, trackHeight);
        var22_24 = \u0628\u0641.INSTANCE;
        thumbY = RangesKt.coerceIn(this.thumbYAnimation.animate(targetThumbY, 120.0f, new \u062c\u064e(var22_24)), trackY, RangesKt.coerceAtLeast(trackY + trackHeight - thumbHeight, trackY));
        rawState = new MenuScrollBarRenderer.State(trackX, trackY, baseTrackWidth, trackHeight, thumbY, thumbHeight, canScroll);
        hovered = dragging || rawState.contains(mouseX, mouseY);
        var25_26 = \u0628\u0641.INSTANCE;
        hover = RangesKt.coerceIn(this.hoverAnimation.animate(hovered && canScroll ? 1.0f : 0.0f, 160.0f, new \u0630\u063a(var25_26)), 0.0f, 1.0f);
        trackWidth = baseTrackWidth + hover;
        renderX = trackX - (trackWidth - baseTrackWidth) * 0.5f;
        renderedAlpha = alpha * visibility;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.pipelines.rectPipeline()).color(\u062b\u0652.INSTANCE.surface((0.07f + 0.035f * hover) * renderedAlpha)).round(1.0f).mix(0.95f).draw(renderX, trackY, trackWidth, trackHeight);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.pipelines.rectPipeline()).color(\u062b\u0652.INSTANCE.title((0.35f + 0.35f * hover) * renderedAlpha)).round(1.0f).mix(0.95f).draw(renderX, thumbY, trackWidth, thumbHeight);
        return new MenuScrollBarRenderer.State((float)var26_29, (float)var10_10, (float)var25_27, (float)var12_12, (float)var21_22, (float)var20_23, (boolean)var13_13);
    }

    public static /* synthetic */ MenuScrollBarRenderer.State render$default(LayerControl layerControl, MenuLayout menuLayout, float f, float f2, float f3, float f4, float f5, float f6, boolean bl, int n, Object object) {
        if ((n & 0x20) != 0) {
            f5 = Float.NaN;
        }
        if ((n & 0x40) != 0) {
            f6 = Float.NaN;
        }
        if ((n & 0x80) != 0) {
            bl = false;
        }
        return layerControl.render(menuLayout, f, f2, f3, f4, f5, f6, bl);
    }
}

