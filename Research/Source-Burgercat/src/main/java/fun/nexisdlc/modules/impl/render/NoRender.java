package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;

@FunctionAdd(name = "NoRender", alias = "No Render", category = Category.Render, description = "Убирает ненужные оверлеи")
public class NoRender extends Function {
    public static ModeListSetting noRenderElements = new ModeListSetting("Не отображать",
            new BooleanSetting("Огонь", true),
            new BooleanSetting("Плохие эффекты", true),
            new BooleanSetting("Оверлей блоков", true),
            new BooleanSetting("Погоду", false),
            new BooleanSetting("Цифры в скорборде", true),
            new BooleanSetting("Тотем на экране", true),
            new BooleanSetting("Фон инвентаря", false)
    );

    public NoRender() {
        addSettings(noRenderElements);
    }

    public static boolean isEnabled(String name) {
        return fun.nexisdlc.Nexis.getFunctionManager().getNoRender().isState()
                && noRenderElements.getByName(name).get();
    }
}

