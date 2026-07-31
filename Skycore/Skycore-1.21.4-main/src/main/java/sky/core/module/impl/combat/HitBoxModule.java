package sky.core.module.impl.combat;

import sky.core.module.Category;
import sky.core.module.Module;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.SliderSetting;

public final class HitBoxModule extends Module {
    public static final HitBoxModule INSTANCE = new HitBoxModule();

    public final SliderSetting size = new SliderSetting("Size", 0.2F, 0.0F, 1.0F, 0.05F);
    private final BooleanSetting showHitBox = new BooleanSetting("Show size", true);

    private HitBoxModule() {
        super("HitBox", "Expands entity hitboxes", Category.COMBAT);
        this.addSettings(this.size, this.showHitBox);
    }

    public boolean shouldShowHitBox() {
        return this.isEnabled() && this.showHitBox.get();
    }
}
