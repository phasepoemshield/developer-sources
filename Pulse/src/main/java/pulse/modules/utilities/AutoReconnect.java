package pulse.modules.utilities;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import pulse.events.ClientTickEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Auto Reconnect", b = "Keeps reconnect state available for the reconnect screen.", c = ModuleCategory.UTILITIES)
public class AutoReconnect extends ClientModule {
    private final SliderSetting delaySeconds = new SliderSetting("Delay", 3.0f, 0.0f, 30.0f, 0.5f);
    private ServerInfo lastServer;
    private long disconnectedAtMs = -1L;
    private boolean reconnectQueued;

    @EventHandler
    public void a(ClientTickEvent clientTickEvent) {
        if (c.getCurrentServerEntry() != null) {
            this.lastServer = c.getCurrentServerEntry();
            this.disconnectedAtMs = -1L;
            this.reconnectQueued = false;
            return;
        }
        if (!(c.currentScreen instanceof DisconnectedScreen) || this.lastServer == null) {
            return;
        }
        if (this.disconnectedAtMs < 0L) {
            this.disconnectedAtMs = System.currentTimeMillis();
            this.reconnectQueued = false;
        }
        if (this.reconnectQueued) {
            return;
        }
        if (System.currentTimeMillis() - this.disconnectedAtMs < o() * 1000L) {
            return;
        }
        this.reconnectQueued = true;
        ServerInfo server = this.lastServer;
        MultiplayerScreen parent = new MultiplayerScreen(new TitleScreen());
        ConnectScreen.connect(parent, c, ServerAddress.parse(server.address), server, false, null);
    }

    public boolean n() {
        return k();
    }

    public int o() {
        return Math.max(0, Math.round(this.delaySeconds.a()));
    }

    public ServerInfo p() {
        return this.lastServer;
    }

    @Override
    public void f() {
        this.disconnectedAtMs = -1L;
        this.reconnectQueued = false;
        super.f();
    }
}
