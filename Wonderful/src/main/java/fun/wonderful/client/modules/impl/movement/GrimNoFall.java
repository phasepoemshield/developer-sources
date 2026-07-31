package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;

public class GrimNoFall
extends Module {
    public static GrimNoFall INSTANCE = new GrimNoFall();

    public GrimNoFall() {
        super("NoFall", "Убирает урон от падения", Module.ModuleCategory.MOVEMENT);
    }

    @EventLink
    public void onUpdate(EventUpdate var1) {
    }
}