package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;

@FunctionAdd(name = "FixHP", alias = "Fix HP", category = Category.Utilities, description = "Фикс хп для серверов с рандомными хп")
public class FixHP extends Function {
    public static ModeSetting mode = new ModeSetting("Режим", "FunTime", "FunTime", "ReallyWorld");

    public FixHP() {
        addSettings(mode);
    }
}
