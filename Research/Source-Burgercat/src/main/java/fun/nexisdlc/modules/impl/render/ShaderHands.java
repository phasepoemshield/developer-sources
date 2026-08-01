package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "ShaderHands", alias = "Shader Hands", category = Category.Render,
        description = "Шейдерные эффекты для рук и предметов от первого лица")
public class ShaderHands extends Function {
    public static final String MODE_FLAT = "Flat";
    public static final String MODE_FILLED = "Filled";
    public static final String MODE_GLOW = "Glow";
    public static final String MODE_SHADER = "Shader";
    public static final String MODE_SHADER2 = "Shader2";

    private static ShaderHands instance;

    public final ModeSetting mode = new ModeSetting("Режим", MODE_FLAT, MODE_FLAT, MODE_FILLED, MODE_GLOW, MODE_SHADER, MODE_SHADER2);
    public final ColorSetting color = new ColorSetting("Цвет", ClientColors.ICON.getRGB()).setVisible(() -> !isUseThemeColor());
    public final BooleanSetting useThemeColor = new BooleanSetting("Цвет темы", false).setVisible(this::isAnyShaderMode);
    public final SliderSetting alpha = new SliderSetting("Прозрачность", 15.0f, 0.0f, 100.0f, 1.0f).setVisible(this::isFlatMode);
    public final SliderSetting outlineAlpha = new SliderSetting("Обводка", 12.0f, 0.0f, 100.0f, 1.0f).setVisible(this::isFlatMode);
    public final SliderSetting shaderSpeed = new SliderSetting("Скорость", 50.0f, 0.0f, 200.0f, 1.0f).setVisible(this::isShaderMode);
    public final SliderSetting shaderIntensity = new SliderSetting("Интенсивность", 100.0f, 0.0f, 200.0f, 1.0f).setVisible(this::isShaderMode);
    public final BooleanSetting fill = new BooleanSetting("Заливка", true).setVisible(this::isShader2Mode);
    public final SliderSetting distortion = new SliderSetting("Искажение", 100.0f, 0.0f, 300.0f, 1.0f).setVisible(this::isShader2Mode);
    public final SliderSetting firePower = new SliderSetting("Сила огня", 100.0f, 0.0f, 300.0f, 1.0f).setVisible(this::isShader2Mode);
    public final SliderSetting fireAlpha = new SliderSetting("Альфа огня", 100.0f, 0.0f, 100.0f, 1.0f).setVisible(this::isShader2Mode);

    public ShaderHands() {
        instance = this;
        addSettings(mode, color, useThemeColor, alpha, outlineAlpha, shaderSpeed, shaderIntensity, fill, distortion, firePower, fireAlpha);
    }

    public static ShaderHands getInstance() {
        return instance;
    }

    public boolean isFlatMode() {
        return MODE_FLAT.equalsIgnoreCase(mode.get());
    }

    public boolean isFilledMode() {
        return MODE_FILLED.equalsIgnoreCase(mode.get());
    }

    public boolean isGlowMode() {
        return MODE_GLOW.equalsIgnoreCase(mode.get());
    }

    public boolean isShaderMode() {
        return MODE_SHADER.equalsIgnoreCase(mode.get());
    }

    public boolean isShader2Mode() {
        return MODE_SHADER2.equalsIgnoreCase(mode.get());
    }

    public boolean isAnyShaderMode() {
        return isShaderMode() || isShader2Mode();
    }

    public boolean isUseThemeColor() {
        return useThemeColor.get();
    }

    public int getModeIndex() {
        if (isFilledMode()) return 1;
        if (isGlowMode()) return 2;
        if (isShaderMode()) return 3;
        if (isShader2Mode()) return 4;
        return 0;
    }

    public float getShaderSpeed() {
        return shaderSpeed.get() / 100.0f;
    }

    public float getShaderIntensity() {
        return shaderIntensity.get() / 100.0f;
    }

    public boolean isFill() {
        return fill.get();
    }

    public float getDistortion() {
        return distortion.get() / 100.0f;
    }

    public float getFirePower() {
        return firePower.get() / 100.0f;
    }

    public float getFireAlpha() {
        return Math.max(0.0f, Math.min(1.0f, fireAlpha.get() / 100.0f));
    }

    public int getBaseColor() {
        return isUseThemeColor() ? ClientColors.ICON.getRGB() : color.get();
    }

    public int getRenderColor() {
        int baseColor = getBaseColor();
        int sourceAlpha = (baseColor >> 24) & 0xFF;
        int alphaValue = Math.max(0, Math.min(255, Math.round((alpha.get() / 100.0f) * sourceAlpha)));
        return (alphaValue << 24) | (baseColor & 0x00FFFFFF);
    }

    public float getFlatOutlineAlpha() {
        return Math.max(0.0f, Math.min(1.0f, outlineAlpha.get() / 100.0f));
    }
}
