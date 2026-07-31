package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import ru.ocz.protection.annotation.Compile;

public class NoClip
extends Module {
    public static NoClip INSTANCE = new NoClip();

    public NoClip() {
        super("NoClip", "Позволяте проходить через блоки", Module.ModuleCategory.PLAYER);
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);
}