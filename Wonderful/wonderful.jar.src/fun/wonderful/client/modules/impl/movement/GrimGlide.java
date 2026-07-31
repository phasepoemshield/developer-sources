package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMotion;
import fun.wonderful.client.modules.Module;
import ru.ocz.protection.annotation.Compile;

public class GrimGlide
extends Module {
    public static GrimGlide INSTANCE = new GrimGlide();
    private long lastTickTime = 0L;
    private int ticksTwo = 0;

    public GrimGlide() {
        super("GrimGlide", "Ускорение на элитре без фейерверков", Module.ModuleCategory.MOVEMENT);
    }

    @EventLink
    @Compile
    public native void onMotion(EventMotion var1);

    @Override
    public void onEnable() {
        super.onEnable();
        this.ticksTwo = 0;
        this.lastTickTime = System.currentTimeMillis();
    }

    @Override
    public void onDisable() {
        this.ticksTwo = 0;
        super.onDisable();
    }
}