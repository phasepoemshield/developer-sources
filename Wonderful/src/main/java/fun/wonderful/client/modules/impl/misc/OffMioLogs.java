package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.client.modules.Module;
import ru.ocz.protection.annotation.VM;

public class OffMioLogs
extends Module {
    public static final OffMioLogs INSTANCE = new OffMioLogs();

    public OffMioLogs() {
        super("OffMioLogs", "Скрывает сообщения Grim в чате, где нет вашего ника", Module.ModuleCategory.MISC);
    }

    @EventLink
    @VM
    public void onEvent(EventPacket var1) {
    }
}