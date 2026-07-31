package pulse.modules.hud;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Cooldowns HUD", b = "Displays item cooldowns on screen.", c = ModuleCategory.HUD)
public class CooldownsHud extends ClientModule {
    private final SliderSetting scale = new SliderSetting("Scale", 1.0f, 1.0f, 2.0f, 0.1f);

    public CooldownsHud() {
        collectSettings();
    }

    public SliderSetting n() {
        return this.scale;
    }
}
