/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotakbaz.rain.ui.menu.settings.impl.ColorSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062d\u0642;
import oxxxde.\u0630;
import oxxxde.\u0630\u0622;
import oxxxde.\u0630\u0633;
import oxxxde.\u0637\u062e;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Loxxxde/\u062b\u0633;", "", "<init>", "()V", "Loxxxde/\u0631\u0641;", "setting", "Loxxxde/\u0622;", "create", "(Lkotakbaz/rain/module/setting/Setting;)Lkotakbaz/rain/ui/menu/settings/ModuleSettingComponent;", "rain-visuals"})
public final class \u062b\u0633 {
    @NotNull
    public static final \u062b\u0633 INSTANCE = new \u062b\u0633();

    @Nullable
    public final ModuleSettingComponent<?> create(@NotNull Setting<?> setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Setting<?> setting2 = setting;
        return setting2 instanceof BooleanSetting ? (ModuleSettingComponent)new \u0630\u0633((BooleanSetting)setting) : (setting2 instanceof SliderSetting ? (ModuleSettingComponent)new \u0637\u062e((SliderSetting)setting) : (setting2 instanceof ModeSetting ? (ModuleSettingComponent)new \u062d\u0642((ModeSetting)setting) : (setting2 instanceof TextSetting ? (ModuleSettingComponent)new \u0630\u0622((TextSetting)setting) : (setting2 instanceof BindSetting ? (ModuleSettingComponent)new \u0630((BindSetting)setting) : (setting2 instanceof ColorSetting ? (ModuleSettingComponent)new ColorSettingComponent((ColorSetting)setting) : null)))));
    }

    private \u062b\u0633() {
    }
}

