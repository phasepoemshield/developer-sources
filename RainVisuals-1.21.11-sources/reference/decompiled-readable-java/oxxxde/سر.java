/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.List;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0641;
import oxxxde.\u062f\u0626;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0014\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f\u00a2\u0006\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086D\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R!\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*8\u0006\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u00a8\u00060"}, d2={"Loxxxde/\u0633\u0631;", "", "<init>", "()V", "", "scale", "()F", "scalePercent", "scaleProgress", "progress", "scalePercentForProgress", "(F)F", "", "setScaleProgress", "(F)V", "value", "setScalePercent", "hudScale", "hudScalePercent", "hudScaleProgress", "hudScalePercentForProgress", "setHudScaleProgress", "setHudScalePercent", "", "renderGuiBackground", "()Z", "toggleGuiBackground", "", "openKey", "I", "getOpenKey", "()I", "Loxxxde/\u0637\u064f;", "scaleSetting", "Loxxxde/\u0637\u064f;", "hudScaleSetting", "Loxxxde/\u062e\u0630;", "guiBackgroundSetting", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u064a;", "scaleAnimation", "Loxxxde/\u0631\u064a;", "", "Loxxxde/\u0631\u0641;", "settings", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "rain-visuals"})
public final class \u0633\u0631 {
    @NotNull
    private static final List<Setting<?>> settings;
    @NotNull
    private static final BooleanSetting guiBackgroundSetting;
    private static final int openKey;
    @NotNull
    private static final AnimationUtil scaleAnimation;
    @NotNull
    private static final SliderSetting hudScaleSetting;
    @NotNull
    private static final SliderSetting scaleSetting;
    @NotNull
    public static final \u0633\u0631 INSTANCE;

    public final void setHudScaleProgress(float progress) {
        this.setHudScalePercent(this.hudScalePercentForProgress(progress));
    }

    private \u0633\u0631() {
    }

    public final float hudScalePercentForProgress(float progress) {
        float clamped = RangesKt.coerceIn(progress, 0.0f, 1.0f);
        return hudScaleSetting.getMin() + (hudScaleSetting.getMax() - hudScaleSetting.getMin()) * clamped;
    }

    public final float hudScale() {
        return ((Number)hudScaleSetting.getValue()).floatValue() / 100.0f;
    }

    @NotNull
    public final List<Setting<?>> getSettings() {
        return settings;
    }

    public final boolean renderGuiBackground() {
        return (Boolean)guiBackgroundSetting.getValue();
    }

    public final float scaleProgress() {
        return scaleSetting.progress();
    }

    public final void setScalePercent(float value) {
        scaleSetting.setClamped(value);
    }

    public final float hudScalePercent() {
        return ((Number)hudScaleSetting.getValue()).floatValue();
    }

    public final float scale() {
        float target = ((Number)scaleSetting.getValue()).floatValue() / 100.0f;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        return scaleAnimation.animate(target, 150.0f, new \u062f\u0626(\u0628\u06412));
    }

    public final int getOpenKey() {
        return openKey;
    }

    public final void setScaleProgress(float progress) {
        this.setScalePercent(this.scalePercentForProgress(progress));
    }

    static {
        INSTANCE = new \u0633\u0631();
        openKey = 344;
        scaleSetting = new SliderSetting("GUI Size", 120.0f, 75.0f, 150.0f, 1.0f, "guiScale");
        hudScaleSetting = new SliderSetting("HUD Size", 120.0f, 50.0f, 200.0f, 1.0f, "hudScale");
        guiBackgroundSetting = new BooleanSetting("GUI Background", false, "background");
        scaleAnimation = new AnimationUtil(1.0f);
        Setting[] settingArray = new Setting[3];
        settingArray[0] = scaleSetting;
        settingArray[1] = hudScaleSetting;
        settingArray[2] = guiBackgroundSetting;
        settings = CollectionsKt.listOf(settingArray);
    }

    public final float hudScaleProgress() {
        return hudScaleSetting.progress();
    }

    public final void toggleGuiBackground() {
        guiBackgroundSetting.toggle();
    }

    public final void setHudScalePercent(float value) {
        hudScaleSetting.setClamped(value);
    }

    public final float scalePercentForProgress(float progress) {
        float clamped = RangesKt.coerceIn(progress, 0.0f, 1.0f);
        return scaleSetting.getMin() + (scaleSetting.getMax() - scaleSetting.getMin()) * clamped;
    }

    public final float scalePercent() {
        return ((Number)scaleSetting.getValue()).floatValue();
    }
}

