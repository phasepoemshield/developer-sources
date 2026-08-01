package sky.core.module.impl.visuals;

import sky.core.module.Category;
import sky.core.module.Module;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.ModeSetting;
import sky.core.module.setting.MultiBooleanSetting;

public final class InterfaceModule extends Module {
    public static final InterfaceModule INSTANCE = new InterfaceModule();

    public final MultiBooleanSetting elements = new MultiBooleanSetting(
            "Elements",
            new BooleanSetting("Watermark", true),
            new BooleanSetting("TargetHud", true),
            new BooleanSetting("Notifications", true)
    );

    public final BooleanSetting showPcName = new BooleanSetting("Show PC name", true, () -> this.elements.is("Watermark"));
    public final BooleanSetting showFps = new BooleanSetting("Show FPS", true, () -> this.elements.is("Watermark"));
    public final ModeSetting targetHudMode = new ModeSetting("Mode", "Default", () -> this.elements.is("TargetHud"), "Default", "Follow");

    private InterfaceModule() {
        super("Interface", "HUD interface elements", Category.VISUALS);
        this.setEnabled(true);
        this.addSettings(this.elements, this.showPcName, this.showFps, this.targetHudMode);
    }

    public boolean isWatermarkEnabled() {
        return this.isEnabled() && this.elements.is("Watermark");
    }

    public boolean isTargetHudEnabled() {
        return this.isEnabled() && this.elements.is("TargetHud");
    }

    public boolean isNotificationsEnabled() {
        return this.isEnabled() && this.elements.is("Notifications");
    }
}
