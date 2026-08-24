/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Loxxxde/\u0631\u0639;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "shouldRenderEmptySlots", "()Z", "Loxxxde/\u062e\u0630;", "showEmpty", "Loxxxde/\u062e\u0630;", "rain-visuals"})
public final class \u0631\u0639
extends Module {
    @NotNull
    private static final BooleanSetting showEmpty;
    @NotNull
    public static final \u0631\u0639 INSTANCE;

    public final boolean shouldRenderEmptySlots() {
        return (Boolean)showEmpty.getValue();
    }

    static {
        INSTANCE = new \u0631\u0639();
        showEmpty = INSTANCE.boolean("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u043f\u0443\u0441\u0442\u043e\u0442\u0443", true, "showEmpty");
    }

    private \u0631\u0639() {
        super("SaturationHud", \u0638\u0646.getHUD(), "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0437\u0430\u043f\u0430\u0441 \u043d\u0430\u0441\u044b\u0449\u0435\u043d\u0438\u044f \u043d\u0430\u0434 \u043f\u043e\u043b\u043e\u0441\u043e\u0439 \u0435\u0434\u044b");
    }
}

