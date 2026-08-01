package pulse.modules.hud;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Inventory HUD", b = "Отображение инвентаря.", c = ModuleCategory.HUD)
public class InventoryHud extends ClientModule {
    private final SliderSetting scale = new SliderSetting("Scale", 1.0f, 0.8f, 2.0f, 0.1f);

    public InventoryHud() {
        collectSettings();
    }

    public SliderSetting n() {
        return this.scale;
    }
}
