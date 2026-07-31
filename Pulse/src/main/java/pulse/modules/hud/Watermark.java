package pulse.modules.hud;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;

@ModuleInfo(a = "Watermark", b = "Displays the client watermark", c = ModuleCategory.HUD)
public class Watermark extends ClientModule {
    public Watermark() {
        collectSettings();
    }
}
