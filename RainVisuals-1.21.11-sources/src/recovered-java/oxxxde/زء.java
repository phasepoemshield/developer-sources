/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.DisconnectedScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.multiplayer.ConnectScreen
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.network.ServerInfo$ServerType
 *  net.minecraft.text.Text
 */
package oxxxde;

import java.util.Locale;
import kotakbaz.rain.client.discord.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#\u00a8\u0006$"}, d2={"Loxxxde/\u0632\u0621;", "", "<init>", "()V", "", "anarchy", "", "connect", "(I)V", "Lnet/minecraft/class_310;", "client", "tick", "(Lnet/minecraft/class_310;)V", "clearPending", "", "SERVER_ADDRESS", "Ljava/lang/String;", "COMMAND_DELAY_TICKS", "I", "", "READY_FALLBACK_MS", "J", "REQUEST_TIMEOUT_MS", "CANCEL_SCREEN_GRACE_MS", "pendingAnarchy", "Ljava/lang/Integer;", "requestedAtMs", "connectedAtMs", "readyTicks", "", "connectionStartPending", "Z", "connectionStarted", "welcomeReceived", "trackedLevel", "Ljava/lang/Object;", "rain-visuals"})
public final class \u0632\u0621 {
    @Nullable
    private static Integer pendingAnarchy;
    private static boolean welcomeReceived;
    private static boolean connectionStartPending;
    @Nullable
    private static Object trackedLevel;
    private static int readyTicks;
    private static final long REQUEST_TIMEOUT_MS = 90000L;
    @NotNull
    public static final \u0632\u0621 INSTANCE;
    @NotNull
    private static final String SERVER_ADDRESS = "funtime.su";
    private static long requestedAtMs;
    private static final long READY_FALLBACK_MS = 20000L;
    private static long connectedAtMs;
    private static boolean connectionStarted;
    private static final int COMMAND_DELAY_TICKS = 10;
    private static final long CANCEL_SCREEN_GRACE_MS = 1000L;

    public final void connect(int anarchy) {
        pendingAnarchy = anarchy;
        requestedAtMs = System.currentTimeMillis();
        connectedAtMs = 0L;
        readyTicks = 0;
        connectionStartPending = true;
        connectionStarted = false;
        welcomeReceived = false;
        trackedLevel = null;
        \u0635\u0635.INSTANCE.closeCustomScreenImmediately();
        if (\u0636\u0643.getMc().world != null) {
            \u0636\u0643.getMc().disconnect((Text)Text.translatable((String)"disconnect.quitting"));
        }
    }

    private final void clearPending() {
        pendingAnarchy = null;
        requestedAtMs = 0L;
        connectedAtMs = 0L;
        readyTicks = 0;
        connectionStartPending = false;
        connectionStarted = false;
        welcomeReceived = false;
        trackedLevel = null;
    }

    static {
        INSTANCE = new \u0632\u0621();
        ClientTickEvents.END_CLIENT_TICK.register(INSTANCE::tick);
        ClientReceiveMessageEvents.GAME.register(\u0632\u0621::_init_$lambda$0);
    }

    private final void tick(MinecraftClient client) {
        int anarchy;
        block13: {
            block12: {
                Integer n = pendingAnarchy;
                if (n == null) {
                    return;
                }
                anarchy = n;
                long elapsedMs = System.currentTimeMillis() - requestedAtMs;
                if (elapsedMs >= 90000L) {
                    this.clearPending();
                    return;
                }
                if (connectionStartPending) {
                    if (client.world != null || client.getNetworkHandler() != null) {
                        return;
                    }
                    connectionStartPending = false;
                    connectionStarted = true;
                    a parent = new a();
                    ServerInfo server = new ServerInfo("\u0424\u0430\u043d\u0422\u0430\u0439\u043c", SERVER_ADDRESS, ServerInfo.ServerType.OTHER);
                    ConnectScreen.connect((Screen)parent, (MinecraftClient)client, (ServerAddress)ServerAddress.parse((String)SERVER_ADDRESS), (ServerInfo)server, (boolean)false, null);
                    return;
                }
                if (client.world == null && connectionStarted && elapsedMs >= 1000L && (client.currentScreen instanceof a || client.currentScreen instanceof DisconnectedScreen)) {
                    this.clearPending();
                    return;
                }
                if (!\u0636\u0647.INSTANCE.isFunTime() || client.world == null || client.player == null) break block12;
                if (client.getNetworkHandler() != null) break block13;
            }
            readyTicks = 0;
            return;
        }
        if (trackedLevel != client.world) {
            trackedLevel = client.world;
            connectedAtMs = System.currentTimeMillis();
            readyTicks = 0;
        }
        long stableConnectionMs = System.currentTimeMillis() - connectedAtMs;
        if (!welcomeReceived && stableConnectionMs < 20000L) {
            return;
        }
        int n = readyTicks;
        readyTicks = n + 1;
        if (readyTicks < 10) {
            return;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = client.getNetworkHandler();
        if (clientPlayNetworkHandler != null) {
            clientPlayNetworkHandler.sendChatCommand("an" + anarchy);
        }
        this.clearPending();
    }

    private \u0632\u0621() {
    }

    private static final void _init_$lambda$0(Text message, boolean bl) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (pendingAnarchy == null || !\u0636\u0647.INSTANCE.isFunTime()) {
            return;
        }
        String string = message.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = string;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        String text = string3;
        if (StringsKt.contains$default((CharSequence)text, "\u0434\u043e\u0431\u0440\u043e \u043f\u043e\u0436\u0430\u043b\u043e\u0432\u0430\u0442\u044c", false, 2, null)) {
            if (StringsKt.contains$default((CharSequence)text, "funtime", false, 2, null)) {
                welcomeReceived = true;
                readyTicks = 0;
            }
        }
    }
}

