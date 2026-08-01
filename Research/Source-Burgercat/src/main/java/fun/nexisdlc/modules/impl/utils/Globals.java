package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.globals.GlobalsManager;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import net.minecraft.util.Formatting;

@FunctionAdd(name = "Globals", alias = "Globals", category = Category.Utilities, description = "Группа, общие точки и друзья")
public class Globals extends Function implements ILogger {
    public static final BindSetting pointBind = new BindSetting("Бинд точки", 0);
    public static final BooleanSetting autoConnect = new BooleanSetting("Авто-подключение", true);
    public static final BooleanSetting customTextureSync = new BooleanSetting("Синхронизация кастомных текстурок", false);

    private final GlobalsManager manager = GlobalsManager.getInstance();
    private long lastHeartbeat;
    private long lastInventorySync;

    public Globals() {
        addSettings(pointBind, autoConnect, customTextureSync);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        String token = ClientContainer.getGlobalsLease();
        if (token == null || token.isBlank()) {
            logDirect("Globals: lease не выдан сервером", Formatting.RED);
            setState(false);
            return;
        }
        manager.setToken(token);
        manager.connect();
    }

    @Override
    public void onDisable() {
        manager.disconnect();
        super.onDisable();
    }

    @EventHandler
    public void onTick(UpdateEvent event) {
        manager.setCustomTextureSyncEnabled(customTextureSync.get());
        long now = System.currentTimeMillis();
        if (now - lastHeartbeat >= 3000L) {
            manager.heartbeat();
            lastHeartbeat = now;
        }
        if (now - lastInventorySync >= 1500L) {
            manager.syncInventory();
            lastInventorySync = now;
        }
    }

    @EventHandler
    public void onKey(EventKey event) {
        if (ClientContainer.isHide()) return;
        if (event.getAction() == 1 && event.isKeyDown(pointBind.get())) {
            manager.createPoint();
            logDirect("Точка успешно поставлена", Formatting.GRAY);
        }
    }

    public static GlobalsManager manager() {
        return GlobalsManager.getInstance();
    }
}
