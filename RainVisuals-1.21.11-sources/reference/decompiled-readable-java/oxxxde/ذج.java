/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0630\u062c;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "value", "", "setTabProgress", "(F)V", "Loxxxde/\u062e\u0630;", "animateHotbar", "Loxxxde/\u062e\u0630;", "getAnimateHotbar", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "animateChat", "getAnimateChat", "smoothTab", "getSmoothTab", "animateInventory", "getAnimateInventory", "tabProgress", "F", "getTabProgress", "()F", "rain-visuals"})
public final class \u0630\u062c
extends Module {
    @NotNull
    private static final BooleanSetting animateChat;
    @NotNull
    private static final BooleanSetting smoothTab;
    private static float tabProgress;
    @NotNull
    public static final \u0630\u062c INSTANCE;
    @NotNull
    private static final BooleanSetting animateInventory;
    @NotNull
    private static final BooleanSetting animateHotbar;

    private \u0630\u062c() {
        super("BetterHUD", \u0638\u0646.getRENDER(), "\u041f\u043b\u0430\u043d\u044b\u0435 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438 \u0438\u043d\u0442\u0435\u0440\u0439\u0444\u0435\u0439\u0441\u0430");
    }

    public final void setTabProgress(float value) {
        tabProgress = RangesKt.coerceIn(value, 0.0f, 1.0f);
    }

    @NotNull
    public final BooleanSetting getAnimateChat() {
        return animateChat;
    }

    public final float getTabProgress() {
        return tabProgress;
    }

    @NotNull
    public final BooleanSetting getSmoothTab() {
        return smoothTab;
    }

    static {
        INSTANCE = new \u0630\u062c();
        animateHotbar = Module.boolean$default(INSTANCE, "\u0410\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0445\u043e\u0442\u0431\u0430\u0440", false, null, 4, null);
        animateChat = Module.boolean$default(INSTANCE, "\u0410\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0447\u0430\u0442", true, null, 4, null);
        smoothTab = Module.boolean$default(INSTANCE, "\u0410\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0442\u0430\u0431", true, null, 4, null);
        animateInventory = Module.boolean$default(INSTANCE, "\u0410\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c", true, null, 4, null);
    }

    @NotNull
    public final BooleanSetting getAnimateInventory() {
        return animateInventory;
    }

    @NotNull
    public final BooleanSetting getAnimateHotbar() {
        return animateHotbar;
    }
}

