/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u0631\u0626;
import oxxxde.\u0636\u0646;
import oxxxde.\u0638\u0646;
import oxxxde.\u0638\u0650;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001d\u00a8\u0006 "}, d2={"Loxxxde/\u0627\u0645;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "Loxxxde/\u0638\u0635;", "category", "Lkotlin/Function0;", "", "isActive", "<init>", "(Lkotakbaz/rain/client/extensions/Category;Lkotlin/jvm/functions/Function0;)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "Loxxxde/\u0638\u0635;", "getCategory", "()Lkotakbaz/rain/client/extensions/Category;", "Lkotlin/jvm/functions/Function0;", "Loxxxde/\u0631\u064a;", "stateAnim", "Loxxxde/\u0631\u064a;", "hoverAnim", "Companion", "rain-visuals"})
public final class \u0627\u0645
extends \u0627\u0638
implements PipelinedRender {
    private static final float ICON_SIZE_FACTOR = 0.35f;
    public static final float ACTIVE_OFFSET_X = 0.75f;
    private static final float SIDEBAR_PADDING = 0.5f;
    @NotNull
    public static final \u0636\u0646 Companion = new \u0636\u0646(null);
    @NotNull
    private final Function0<Boolean> isActive;
    @NotNull
    private final AnimationUtil stateAnim;
    @NotNull
    private final AnimationUtil hoverAnim;
    @NotNull
    private final Category category;

    public /* synthetic */ \u0627\u0645(Category category, Function0 function0, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            function0 = \u0627\u0645::_init_$lambda$0;
        }
        this(category, function0);
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);
        targetState = this.isActive.invoke().booleanValue() ? 1.0f : 0.0f;
        var6_5 = \u0628\u0641.INSTANCE;
        state = this.stateAnim.animate(targetState, 250.0f, new \u0631\u0626(var6_5));
        if (!((float)mouseX >= this.getX()) || !((float)mouseX <= this.getX() + this.getWidth())) ** GOTO lbl-1000
        if (!((float)mouseY >= this.getY())) ** GOTO lbl-1000
        if ((float)mouseY <= this.getY() + this.getHeight()) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        hovered = v0;
        var8_8 = \u0628\u0641.INSTANCE;
        hover = RangesKt.coerceIn(this.hoverAnim.animate(hovered ? 1.0f : 0.0f, 170.0f, new \u0638\u0650(var8_8)), 0.0f, 1.0f);
        iconOff = new Color(130, 130, 130, 255);
        iconOn = new Color(0, 0, 0, 255);
        iconBase = \u0628\u062d.INSTANCE.interpolateColor(iconOff, iconOn, Math.max(state, hover * 0.36f));
        textDrawColor = \u0628\u062d.INSTANCE.setAlpha(iconBase, (float)iconBase.getAlpha() / 255.0f * this.getAlpha());
        iconSize = this.getHeight() * 0.35f;
        var14_14 = this.category;
        iconOffsetX = Intrinsics.areEqual(var14_14, \u0638\u0646.getRENDER()) ? -0.2f : (Intrinsics.areEqual(var14_14, \u0638\u0646.getPLAYER()) ? 1.0f : (Intrinsics.areEqual(var14_14, \u0638\u0646.getHUD()) ? 0.0f : (Intrinsics.areEqual(var14_14, \u0638\u0646.getPOINTS()) ? 0.0f : 0.0f)));
        Font.drawCenteredText$default(this.getIconFont().priority(this.iconsPipeline()), this.category.getIcon(), this.getX() + 0.75f + this.getWidth() * 0.5f + iconOffsetX, this.calcMidY(this.getY(), this.getHeight(), (float)var12_13), (float)var12_13, (Color)var11_12, 0.0f, 32, null);
    }

    private static final boolean _init_$lambda$0() {
        return false;
    }

    public \u0627\u0645(@NotNull Category category, @NotNull Function0<Boolean> isActive) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(isActive, "isActive");
        this.category = category;
        this.isActive = isActive;
        this.stateAnim = new AnimationUtil(0.0f, 1, null);
        this.hoverAnim = new AnimationUtil(0.0f, 1, null);
        this.setPadding(0.5f);
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }
}

