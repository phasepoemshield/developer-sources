package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "HandGlow", alias = "Hand Glow", category = Category.Render,
        description = "Мягкое свечение вокруг предметов в руках")
public class HandGlow extends Function {
    public final SliderSetting intensity = new SliderSetting("Сила", 0.55f, 0.0f, 2.0f, 0.05f);
    public final SliderSetting radius = new SliderSetting("Радиус", 18.0f, 5.0f, 60.0f, 1.0f);
    public final SliderSetting flamePower = new SliderSetting("Пламя", 0.75f, 0.0f, 2.0f, 0.05f);
    public final SliderSetting flameSpeed = new SliderSetting("Скорость", 1.25f, 0.2f, 4.0f, 0.05f);
    public final BooleanSetting rainbowFlame = new BooleanSetting("Разноцветное пламя", true);

    public HandGlow() {
        addSettings(intensity, radius, flamePower, flameSpeed, rainbowFlame);
    }

    public float getIntensity() {
        return intensity.get();
    }

    public float getRadius() {
        return radius.get();
    }

    public float getFlamePower() {
        return flamePower.get();
    }

    public float getFlameSpeed() {
        return flameSpeed.get();
    }

    public boolean isRainbowFlame() {
        return rainbowFlame.get();
    }
}
