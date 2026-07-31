package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventSlowWalking;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import ru.ocz.protection.annotation.Compile;

public class NoSlow
extends Module {
    public static NoSlow INSTANCE = new NoSlow();
    private final ModeSetting mode = new ModeSetting("Мод", "Grim Old", "Grim Old", "Grim Last");
    private final BooleanSetting sprint = new BooleanSetting("Спринт", true);

    public NoSlow() {
        super("NoSlow", "Убирает замедление во время разных действий", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.sprint);
    }

    @EventLink
    @Compile
    public native void onSlowDown(EventSlowWalking var1);
}