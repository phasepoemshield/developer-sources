package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "ElytraMotion", alias = "Elytra Motion", category = Category.Movement, description = "Настройка дистанции движения на элитре")
public class ElytraMotion extends Function {
    public static SliderSetting elytraMotionDistance = new SliderSetting("Дистанция", 2, 1, 3, 0.1f);

    public ElytraMotion() {
        addSettings(elytraMotionDistance);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
