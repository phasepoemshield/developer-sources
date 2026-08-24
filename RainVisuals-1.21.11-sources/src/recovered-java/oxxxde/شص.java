/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0010"}, d2={"Loxxxde/\u0634\u0635;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "shouldClearWaterOverlay", "()Z", "shouldClearWaterFog", "shouldClearLavaFog", "Loxxxde/\u062e\u0630;", "water", "Loxxxde/\u062e\u0630;", "getWater", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "lava", "getLava", "rain-visuals"})
public final class \u0634\u0635
extends Module {
    @NotNull
    private static final BooleanSetting lava;
    @NotNull
    public static final \u0634\u0635 INSTANCE;
    @NotNull
    private static final BooleanSetting water;

    public final boolean shouldClearWaterFog() {
        return this.isEnabled() && ((Boolean)water.getValue()).booleanValue();
    }

    static {
        INSTANCE = new \u0634\u0635();
        water = Module.boolean$default(INSTANCE, "\u041f\u043e\u0434 \u0432\u043e\u0434\u043e\u0439", true, null, 4, null);
        lava = Module.boolean$default(INSTANCE, "\u041f\u043e\u0434 \u043b\u0430\u0432\u043e\u0439", true, null, 4, null);
    }

    @NotNull
    public final BooleanSetting getLava() {
        return lava;
    }

    public final boolean shouldClearLavaFog() {
        return this.isEnabled() && ((Boolean)lava.getValue()).booleanValue();
    }

    private \u0634\u0635() {
        super("NoFluid", \u0638\u0646.getRENDER(), "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0440\u0430\u0437\u043c\u044b\u0442\u0438\u0435 \u043f\u043e\u0434 \u0436\u0438\u0434\u043a\u043e\u0441\u0442\u044f\u043c\u0438");
    }

    @NotNull
    public final BooleanSetting getWater() {
        return water;
    }

    public final boolean shouldClearWaterOverlay() {
        return this.isEnabled() && ((Boolean)water.getValue()).booleanValue();
    }
}

