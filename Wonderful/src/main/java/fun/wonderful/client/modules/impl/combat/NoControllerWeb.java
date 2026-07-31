package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBlockCollide;
import fun.wonderful.client.modules.Module;

public class NoControllerWeb
extends Module {
    public static NoControllerWeb INSTANCE = new NoControllerWeb();

    public NoControllerWeb() {
        super("NoControllerWeb", "Позволяет ломать и бить сквозь паутину", Module.ModuleCategory.COMBAT);
    }

    @EventLink
    public void onBlockCollide(EventBlockCollide var1) {
    }
}