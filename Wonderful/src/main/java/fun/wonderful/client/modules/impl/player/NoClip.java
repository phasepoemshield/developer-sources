package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;

public class NoClip
extends Module {
    public static NoClip INSTANCE = new NoClip();

    public NoClip() {
        super("NoClip", "Позволяте проходить через блоки", Module.ModuleCategory.PLAYER);
    }

    @EventLink
    public void onUpdate(EventUpdate var1) {
    }
}