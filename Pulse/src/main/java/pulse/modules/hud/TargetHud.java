package pulse.modules.hud;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Target HUD", b = "Shows target information.", c = ModuleCategory.HUD)
public class TargetHud extends ClientModule {
    private final SliderSetting scale = new SliderSetting("Scale", 1.0f, 1.0f, 2.0f, 0.1f);

    public TargetHud() {
        collectSettings();
    }

    public SliderSetting n() {
        return this.scale;
    }
}
