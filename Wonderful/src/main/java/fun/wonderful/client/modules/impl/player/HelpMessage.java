package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;

public class HelpMessage
extends Module {
    public static HelpMessage INSTANCE = new HelpMessage();
    private final BindSetting bind = new BindSetting("Бинд", -1);

    public HelpMessage() {
        super("HelpMessage", "Отправляет координаты в глобальный чат", Module.ModuleCategory.PLAYER);
        this.addSettings(this.bind);
    }

    @EventLink
    public void onBinding(EventBinding event) {
        if (HelpMessage.mc.player == null || mc.getNetworkHandler() == null || HelpMessage.mc.currentScreen != null) {
            return;
        }
        if (event.getKey() != this.bind.getKey()) {
            return;
        }
        int x2 = HelpMessage.mc.player.getBlockX();
        int y2 = HelpMessage.mc.player.getBlockY();
        int z2 = HelpMessage.mc.player.getBlockZ();
        mc.getNetworkHandler().sendChatMessage("! " + x2 + " " + y2 + " " + z2);
    }
}