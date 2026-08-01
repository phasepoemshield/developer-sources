package pulse.modules.visuals;

import java.awt.Color;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ModeSetting;
import pulse.core.Bool;

@ModuleInfo(a = "Hit Color", b = "Изменяет цвет сущностей при получении урона", c = ModuleCategory.VISUALS)
public class HitColor extends ClientModule {
    private final ModeSetting e = new ModeSetting("Режим", new String[]{"Полностью", "Скин"}, "Полностью");
    private final BooleanSetting f = new BooleanSetting("Цвет клиента", true);
    private final ColorSetting g = new ColorSetting("Кастомный цвет", Color.RED).a(() -> {
        return Boolean.valueOf(Bool.from(this.f.k().booleanValue() ? 0 : 1));
    });
    public static int a;
    public static boolean b;

    public Color n() {
        return !this.f.k().booleanValue() ? this.g.k() : ModuleRegistry.CLIENT_COLOR.n();
    }

    public boolean o() {
        return k();
    }

    public boolean p() {
        return this.e.c("Полностью");
    }

    public static String c(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }
}
