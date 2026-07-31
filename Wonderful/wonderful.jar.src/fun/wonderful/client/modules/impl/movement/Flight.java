package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import net.minecraft.util.math.Vec3d;
import ru.ocz.protection.annotation.Compile;

public class Flight
extends Module {
    public static Flight INSTANCE = new Flight();
    private final FloatSetting speed = new FloatSetting("Скорость", 2.0f, 0.1f, 10.0f, 0.1f);

    public Flight() {
        super("Flight", "Полёт", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.speed);
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    @Override
    public void onDisable() {
        super.onDisable();
        if (Flight.mc.player != null) {
            Flight.mc.player.setVelocity(Vec3d.ZERO);
        }
    }
}