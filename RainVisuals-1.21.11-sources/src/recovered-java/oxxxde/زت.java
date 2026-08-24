/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2={"Loxxxde/\u0632\u062a;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062e\u0630;", "removeBackground", "Loxxxde/\u062e\u0630;", "getRemoveBackground", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "addShadow", "getAddShadow", "rain-visuals"})
public final class \u0632\u062a
extends Module {
    @NotNull
    public static final \u0632\u062a INSTANCE = new \u0632\u062a();
    @NotNull
    private static final BooleanSetting addShadow;
    @NotNull
    private static final BooleanSetting removeBackground;

    private \u0632\u062a() {
        super("NameTags", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0432\u0438\u0437\u0443\u0430\u043b\u0430 \u043d\u0435\u0439\u043c\u0442\u044d\u0433\u0430");
    }

    @NotNull
    public final BooleanSetting getRemoveBackground() {
        return removeBackground;
    }

    static {
        removeBackground = Module.boolean$default(INSTANCE, "\u0423\u0431\u0440\u0430\u0442\u044c \u0444\u043e\u043d", true, null, 4, null);
        addShadow = Module.boolean$default(INSTANCE, "\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0442\u0435\u043d\u0438", true, null, 4, null);
    }

    @NotNull
    public final BooleanSetting getAddShadow() {
        return addShadow;
    }
}

