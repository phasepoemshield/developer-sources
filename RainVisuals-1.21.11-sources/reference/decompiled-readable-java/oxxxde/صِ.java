/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.TargetHudModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0635\u0650;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062e\u0630;", "noHurtCam", "Loxxxde/\u062e\u0630;", "getNoHurtCam", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "noHandSway", "getNoHandSway", "noFire", "getNoFire", "noStatusEffects", "getNoStatusEffects", "removeVignette", "getRemoveVignette", "noGlow", "getNoGlow", "hideMobs", "getHideMobs", "noBlackHearts", "getNoBlackHearts", "noTotemAnimation", "getNoTotemAnimation", "noBossBar", "getNoBossBar", "rain-visuals"})
public final class \u0635\u0650
extends Module {
    @NotNull
    private static final BooleanSetting noStatusEffects;
    @NotNull
    private static final BooleanSetting noHurtCam;
    @NotNull
    private static final BooleanSetting noBossBar;
    @NotNull
    private static final BooleanSetting noTotemAnimation;
    @NotNull
    private static final BooleanSetting noHandSway;
    @NotNull
    private static final BooleanSetting noBlackHearts;
    @NotNull
    private static final BooleanSetting noGlow;
    @NotNull
    private static final BooleanSetting hideMobs;
    @NotNull
    public static final \u0635\u0650 INSTANCE;
    @NotNull
    private static final BooleanSetting noFire;
    @NotNull
    private static final BooleanSetting removeVignette;

    private \u0635\u0650() {
        super("RenderTweaks", \u0638\u0646.getRENDER(), "\u0420\u0430\u0437\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0440\u0435\u043d\u0434\u0435\u0440\u0430");
    }

    @NotNull
    public final BooleanSetting getHideMobs() {
        return hideMobs;
    }

    @NotNull
    public final BooleanSetting getNoHurtCam() {
        return noHurtCam;
    }

    @NotNull
    public final BooleanSetting getNoStatusEffects() {
        return noStatusEffects;
    }

    @NotNull
    public final BooleanSetting getNoTotemAnimation() {
        return noTotemAnimation;
    }

    static {
        INSTANCE = new \u0635\u0650();
        noHurtCam = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u0442\u0440\u044f\u0441\u043a\u0443 \u044d\u043a\u0440\u0430\u043d\u0430", false, "noHurtCam");
        noHandSway = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u0442\u0440\u044f\u0441\u043a\u0443 \u0440\u0443\u043a", false, "noHandSway");
        noFire = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u043e\u0433\u043e\u043d\u044c", false, "noFire");
        noStatusEffects = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u0432\u0430\u043d\u0438\u043b\u044c\u043d\u044b\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u044b", false, "noStatusEffects").setVisible(\u0635\u0650::noStatusEffects$lambda$0);
        removeVignette = INSTANCE.boolean("\u041e\u0442\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0432\u0438\u043d\u044c\u0435\u0442\u043a\u0443", false, "removeVignette");
        noGlow = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u0441\u0432\u0435\u0447\u0435\u043d\u0438\u0435", false, "noGlow");
        hideMobs = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u043c\u043e\u0431\u043e\u0432", false, "hideMobs");
        noBlackHearts = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u0447\u0451\u0440\u043d\u044b\u0435 \u0441\u0435\u0440\u0434\u0446\u0430", false, "noBlackHearts");
        noTotemAnimation = INSTANCE.boolean("\u041e\u0442\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044e \u0442\u043e\u0442\u0435\u043c\u0430", false, "noTotemAnimation");
        noBossBar = INSTANCE.boolean("\u0423\u0431\u0440\u0430\u0442\u044c \u0431\u043e\u0441\u0441 \u0431\u0430\u0440", false, "noBossBar");
    }

    @NotNull
    public final BooleanSetting getRemoveVignette() {
        return removeVignette;
    }

    @NotNull
    public final BooleanSetting getNoGlow() {
        return noGlow;
    }

    private static final boolean noStatusEffects$lambda$0() {
        return !TargetHudModule.INSTANCE.isEnabled();
    }

    @NotNull
    public final BooleanSetting getNoBlackHearts() {
        return noBlackHearts;
    }

    @NotNull
    public final BooleanSetting getNoBossBar() {
        return noBossBar;
    }

    @NotNull
    public final BooleanSetting getNoFire() {
        return noFire;
    }

    @NotNull
    public final BooleanSetting getNoHandSway() {
        return noHandSway;
    }
}

