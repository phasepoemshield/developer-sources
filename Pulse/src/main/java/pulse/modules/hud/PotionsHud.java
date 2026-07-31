package pulse.modules.hud;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Potions", b = "Shows active potion effects.", c = ModuleCategory.HUD)
public class PotionsHud extends ClientModule {
    private final BooleanSetting vanillaHud = new BooleanSetting("Vanilla HUD", false);
    private final SliderSetting scale = new SliderSetting("Scale", 1.0f, 1.0f, 2.0f, 0.1f);

    public PotionsHud() {
        collectSettings();
    }

    public BooleanSetting n() {
        return this.vanillaHud;
    }

    public SliderSetting o() {
        return this.scale;
    }
}
