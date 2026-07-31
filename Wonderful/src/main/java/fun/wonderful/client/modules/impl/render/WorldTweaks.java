package fun.wonderful.client.modules.impl.render;

import fun.wonderful.Wonderful;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.render.sky.SkyShaderRenderer;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;

public class WorldTweaks
extends Module {
    public static WorldTweaks INSTANCE = new WorldTweaks();
    private final ListSetting worldSettings = new ListSetting("Настройки мира", new BooleanSetting("Время", true), new BooleanSetting("Туман", true), new BooleanSetting("Шейдерное небо", false));
    private final FloatSetting timeSetting = new FloatSetting("Время", 12.0f, 0.0f, 24.0f, 1.0f).visible(() -> this.worldSettings.is("Время"));
    private final FloatSetting fogDistanceSetting = new FloatSetting("Дистанция тумана", 100.0f, 20.0f, 200.0f, 1.0f).visible(() -> this.worldSettings.is("Туман"));
    public final ModeSetting skyType = new ModeSetting("Тип неба", "Туман", "Туман", "Дождь", "Polar").visible(() -> this.worldSettings.is("Шейдерное небо"));
    private final BooleanSetting polarRgb = new BooleanSetting("Polar RGB", false).visible(() -> this.worldSettings.is("Шейдерное небо") && this.skyType.is("Polar"));
    private final FloatSetting polarSpeed = new FloatSetting("Polar Скорость", 1.0f, 0.1f, 4.0f, 0.1f).visible(() -> this.worldSettings.is("Шейдерное небо") && this.skyType.is("Polar"));
    private final FloatSetting polarScale = new FloatSetting("Polar Масштаб", 1.35f, 0.5f, 3.0f, 0.05f).visible(() -> this.worldSettings.is("Шейдерное небо") && this.skyType.is("Polar"));

    public WorldTweaks() {
        super("Ambience", "Настройки мира", Module.ModuleCategory.RENDER);
        this.addSettings(this.worldSettings, this.timeSetting, this.fogDistanceSetting, this.skyType, this.polarRgb, this.polarSpeed, this.polarScale);
    }

    public boolean isTimeEnabled() {
        return this.isEnable() && this.worldSettings.is("Время");
    }

    public boolean isFogEnabled() {
        return this.isEnable() && this.worldSettings.is("Туман");
    }

    public boolean isShaderSkyEnabled() {
        return this.isEnable() && this.worldSettings.is("Шейдерное небо");
    }

    public SkyShaderRenderer.Mode getShaderSkyMode() {
        if (this.skyType.is("Дождь")) {
            return SkyShaderRenderer.Mode.RAIN;
        }
        if (this.skyType.is("Polar")) {
            return SkyShaderRenderer.Mode.POLAR;
        }
        return SkyShaderRenderer.Mode.FOG;
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

    public float[] getPolarColor1() {
        int c2 = this.polarRgb.isState() ? ColorUtils.rainbow(12, 0, 0.85f, 1.0f, 1.0f) : this.getThemeColorIndex(0);
        return new float[]{ColorUtils.redf(c2), ColorUtils.greenf(c2), ColorUtils.bluef(c2)};
    }

    public float[] getPolarColor2() {
        int c2 = this.polarRgb.isState() ? ColorUtils.rainbow(12, 120, 0.85f, 1.0f, 1.0f) : this.getThemeColorIndex(180);
        return new float[]{ColorUtils.redf(c2), ColorUtils.greenf(c2), ColorUtils.bluef(c2)};
    }

    public float getPolarSpeed() {
        return this.polarSpeed.get();
    }

    public float getPolarScale() {
        return this.polarScale.get();
    }

    private int getThemeColorIndex(int index) {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            int[] colors = Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color;
            if (index == 0 || colors.length < 2) {
                return colors[0];
            }
            return colors[Math.min(1, colors.length - 1)];
        }
        return ColorUtils.getThemeColor(index);
    }
}