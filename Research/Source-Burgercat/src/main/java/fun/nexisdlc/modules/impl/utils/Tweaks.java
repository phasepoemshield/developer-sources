package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "Tweaks", alias = "Tweaks", category = Category.Render, description = "Твики для удобства игры")
public class Tweaks extends Function {
    public BooleanSetting freezeHands = new BooleanSetting("\"Замораживать\" руки", false);
    public static BooleanSetting autoGps = new BooleanSetting("Авто гпс на ивент", false);
    public static ModeSetting dropAllMode = new ModeSetting("Тип \"Выбросить всё\"", "Обычный", "Обычный", "Легитный");
    public static BooleanSetting fasterAttackAnimation = new BooleanSetting("Ускоренная анимация удара", true);
    public static SliderSetting fasterAttackAnimationValue = new SliderSetting("Ускоренная анимация удара", 6, 1, 12, 1).setVisible(() -> fasterAttackAnimation.get());
    public static BooleanSetting f5animation = new BooleanSetting("Анимация F5", true);

    public Tweaks() {
        addSettings(
                freezeHands, autoGps, dropAllMode, fasterAttackAnimation, fasterAttackAnimationValue, f5animation
        );
    }
}
