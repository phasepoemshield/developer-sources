package sky.core.module.impl.visuals;

import sky.core.module.Category;
import sky.core.module.Module;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.ModeSetting;
import sky.core.module.setting.SliderSetting;

public final class TestModule extends Module {
    public static final TestModule INSTANCE = new TestModule();

    public final BooleanSetting testBoolean = new BooleanSetting("Test boolean", false);
    public final ModeSetting testMode = new ModeSetting("Test mode", "Alpha", "Alpha", "Beta", "Gamma");
    public final SliderSetting testSlider = new SliderSetting("Test slider", 0.5F, 0.0F, 1.0F, 0.05F);

    private TestModule() {
        super("Test", "Test settings for ClickGUI", Category.VISUALS);
        this.addSettings(this.testBoolean, this.testMode, this.testSlider);
    }
}
