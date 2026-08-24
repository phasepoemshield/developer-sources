/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Loxxxde/\u0635\u0628;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062e\u0630;", "noScoreboard", "Loxxxde/\u062e\u0630;", "getNoScoreboard", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "noNumber", "getNoNumber", "Loxxxde/\u0637\u064f;", "scoreboardScale", "Loxxxde/\u0637\u064f;", "getScoreboardScale", "()Lkotakbaz/rain/module/setting/settings/SliderSetting;", "rain-visuals"})
public final class \u0635\u0628
extends Module {
    @NotNull
    private static final BooleanSetting noNumber;
    @NotNull
    private static final SliderSetting scoreboardScale;
    @NotNull
    private static final BooleanSetting noScoreboard;
    @NotNull
    public static final \u0635\u0628 INSTANCE;

    @NotNull
    public final SliderSetting getScoreboardScale() {
        return scoreboardScale;
    }

    @NotNull
    public final BooleanSetting getNoScoreboard() {
        return noScoreboard;
    }

    static {
        INSTANCE = new \u0635\u0628();
        noScoreboard = Module.boolean$default(INSTANCE, "\u0423\u0431\u0440\u0430\u0442\u044c \u0441\u043a\u043e\u0440\u0431\u043e\u0440\u0434", false, null, 4, null);
        noNumber = Module.boolean$default(INSTANCE, "\u0423\u0431\u0440\u0430\u0442\u044c \u0447\u0438\u0441\u043b\u0430", true, null, 4, null);
        scoreboardScale = Module.slider$default(INSTANCE, "\u0420\u0430\u0437\u043c\u0435\u0440", 1.0f, 0.1f, 3.0f, 0.01f, null, 32, null);
    }

    private \u0635\u0628() {
        super("ScoreBoard", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0441\u043a\u043e\u0440\u0431\u043e\u0440\u0434\u0430");
    }

    @NotNull
    public final BooleanSetting getNoNumber() {
        return noNumber;
    }
}

