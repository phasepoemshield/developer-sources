package fun.wonderful.client.modules.impl.render;

import fun.wonderful.Wonderful;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;

public class Ambience
extends Module {
    public static Ambience INSTANCE = new Ambience();
    private final ListSetting worldSettings = new ListSetting("Настройки мира", new BooleanSetting("Время", true), new BooleanSetting("Фог", true));
    public final FloatSetting timeSetting = new FloatSetting("Время", 12.0f, 0.0f, 24.0f, 1.0f).visible(() -> this.worldSettings.is("Время"));
    public final FloatSetting fogDistanceSetting = new FloatSetting("Дистанция фога", 100.0f, 20.0f, 200.0f, 1.0f).visible(() -> this.worldSettings.is("Фог"));

    public Ambience() {
        super("Ambience", "Настройки мира", Module.ModuleCategory.RENDER);
        this.addSettings(this.worldSettings, this.timeSetting, this.fogDistanceSetting);
    }

    public boolean isTimeEnabled() {
        return this.isEnable() && this.worldSettings.is("Время");
    }

    public boolean isFogEnabled() {
        return this.isEnable() && this.worldSettings.is("Фог");
    }

    public long getForcedTime() {
        return (long)this.timeSetting.get() * 1000L;
    }

    public float getFogDistance() {
        return this.fogDistanceSetting.get();
    }

    public int getFogColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }
}