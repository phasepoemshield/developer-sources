package pulse.modules.utilities;

import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Item Scroller", b = "Quickly moves items while Shift and left mouse are held.", c = ModuleCategory.UTILITIES)
public class ItemScroller extends ClientModule {
    public final SliderSetting delay = new SliderSetting("Delay", 50.0f, 10.0f, 500.0f, 10.0f);
}
