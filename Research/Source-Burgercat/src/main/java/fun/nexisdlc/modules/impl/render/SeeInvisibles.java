package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

@FunctionAdd(name = "SeeInvisibles", alias = "See Invisibles", category = Category.Render, description = "Показывает невидимых игроков")
public class SeeInvisibles extends Function {
    public SliderSetting opacity = new SliderSetting("Прозрачность", 0.5f, 0.1f, 1f, 0.1f);
    public ColorSetting color = new ColorSetting("Цвет", 0xFFFFFFFF);
    public ModeSetting colorMode = new ModeSetting("Режим цвета", "Свой", "Свой", "От темы");

    public SeeInvisibles() {
        addSettings(colorMode, color, opacity);
    }
}
