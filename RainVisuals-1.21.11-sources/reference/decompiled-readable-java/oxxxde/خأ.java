/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.DisconnectedScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.multiplayer.ConnectScreen
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.ServerInfo
 */
package oxxxde;

import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2={"Loxxxde/\u062e\u0623;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_419;", "screen", "tickDisconnectedScreen", "(Lnet/minecraft/class_419;)V", "captureCurrentServer", "resetDisconnectState", "", "RECONNECT_DELAY_MS", "J", "Lnet/minecraft/class_642;", "lastServer", "Lnet/minecraft/class_642;", "trackedScreen", "Lnet/minecraft/class_419;", "disconnectedAt", "", "reconnectStarted", "Z", "rain-visuals"})
public final class \u062e\u0623
extends Module {
    private static boolean reconnectStarted;
    @Nullable
    private static ServerInfo lastServer;
    @NotNull
    public static final \u062e\u0623 INSTANCE;
    private static long disconnectedAt;
    private static final long RECONNECT_DELAY_MS = 3000L;
    @Nullable
    private static DisconnectedScreen trackedScreen;

    @Override
    public void onEnable() {
        this.captureCurrentServer();
        this.resetDisconnectState();
    }

    @Override
    public void onDisable() {
        lastServer = null;
        this.resetDisconnectState();
    }

    /*
     * WARNING - void declaration
     */
    private static final void _init_$lambda$0(MinecraftClient client) {
        void var1_2;
        Intrinsics.checkNotNullParameter(client, "client");
        Screen screen = client.currentScreen;
        DisconnectedScreen disconnectedScreen = screen instanceof DisconnectedScreen ? (DisconnectedScreen)screen : null;
        if (disconnectedScreen == null) {
            return;
        }
        DisconnectedScreen screen2 = disconnectedScreen;
        INSTANCE.tickDisconnectedScreen((DisconnectedScreen)var1_2);
    }

    private \u062e\u0623() {
        super("AutoRecconect", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0435\u0440\u0435\u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u043f\u0440\u0438 \u043a\u0438\u043a\u0435");
    }

    static {
        INSTANCE = new \u062e\u0623();
        ClientTickEvents.END_CLIENT_TICK.register(\u062e\u0623::_init_$lambda$0);
    }

    private final void resetDisconnectState() {
        trackedScreen = null;
        disconnectedAt = 0L;
        reconnectStarted = false;
    }

    private final void captureCurrentServer() {
        ServerInfo serverInfo = \u0636\u0643.getMc().getCurrentServerEntry();
        if (serverInfo == null) {
            return;
        }
        ServerInfo current = serverInfo;
        ServerInfo copy = new ServerInfo(current.name, current.address, current.getServerType());
        copy.copyWithSettingsFrom(current);
        lastServer = copy;
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.captureCurrentServer();
    }

    public final void tickDisconnectedScreen(@NotNull DisconnectedScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (!this.isEnabled()) {
            return;
        }
        ServerInfo serverInfo = lastServer;
        if (serverInfo == null) {
            return;
        }
        ServerInfo server = serverInfo;
        if (\u0636\u0643.getMc().currentScreen != screen) {
            return;
        }
        if (trackedScreen != screen) {
            trackedScreen = screen;
            disconnectedAt = System.currentTimeMillis();
            reconnectStarted = false;
        }
        if (reconnectStarted || System.currentTimeMillis() - disconnectedAt < 3000L) {
            return;
        }
        reconnectStarted = true;
        ConnectScreen.connect((Screen)((Screen)screen), (MinecraftClient)\u0636\u0643.getMc(), (ServerAddress)ServerAddress.parse((String)server.address), (ServerInfo)server, (boolean)false, null);
    }
}

