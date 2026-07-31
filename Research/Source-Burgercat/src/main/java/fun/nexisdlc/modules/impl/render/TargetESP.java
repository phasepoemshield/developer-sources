package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "TargetESP", alias = "Target ESP", category = Category.Render, description = "Отображает эффекты вокруг текущего таргета из любого модуля")
public class TargetESP extends Function {

    public final ModeSetting targetEspType = new ModeSetting(
            "Тип таргет есп",
            "Шейдер",
            "Шейдер", "Квадрат", "Цепи", "Кристалы", "Кристалы Новые");

    public final ModeSetting imageType = new ModeSetting("Картинка", "Нет", "Нет", "Квадрат", "Полу квадрат")
            .setVisible(() -> targetEspType.is("Квадрат"));

    public final ModeSetting shaderType = new ModeSetting("Шейдер", "Нет", "Нет", "Призраки", "Души", "Души 2",
            "Колечко")
            .setVisible(() -> targetEspType.is("Шейдер"));

    public final SliderSetting sizeDush = new SliderSetting("Размер частиц", 0.22f, 0.1f, 0.4f, 0.01f)
            .setVisible(() -> targetEspType.is("Шейдер"));
    public final SliderSetting dlinaDush = new SliderSetting("Длина эффекта", 6f, 1f, 12f, 0.1f)
            .setVisible(() -> targetEspType.is("Шейдер"));
    public final SliderSetting factorDush = new SliderSetting("Фактор эффекта", 12f, 0f, 22f, 0.1f)
            .setVisible(() -> targetEspType.is("Шейдер"));
    public final SliderSetting particleDensityDush = new SliderSetting("Кол-во частиц", 1.7f, 1f, 3f, 0.1f)
            .setVisible(() -> targetEspType.is("Шейдер"));

    public final SliderSetting chainSpeed = new SliderSetting("Скорость цепей", 1.0f, 0.1f, 3.0f, 0.1f)
            .setVisible(() -> targetEspType.is("Цепи"));

    public TargetESP() {
        addSettings(targetEspType, imageType, shaderType, sizeDush, dlinaDush, factorDush,
                particleDensityDush, chainSpeed);
    }
}
