/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.ScreenHandler
 */
package oxxxde;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotakbaz.rain.ui.inventory.InventoryAnalysis;
import kotakbaz.rain.ui.inventory.InventorySlotVisual;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotakbaz.rain.ui.inventory.MissingInventoryItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u0652;
import oxxxde.\u0631\u0644;
import oxxxde.\u0633\u0632;
import oxxxde.\u0634\u062c;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u064d;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001GB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0003J\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015\u00a2\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0004\u00a2\u0006\u0004\b%\u0010\u0003J\u001d\u0010&\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b/\u0010\u0003J\u001f\u00101\u001a\u0002002\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u00104R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020006j\b\u0012\u0004\u0012\u000200`78\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u00104R\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\bF\u0010\r\u00a8\u0006H"}, d2={"Loxxxde/\u0638\u0638;", "", "<init>", "()V", "", "initialize", "Loxxxde/\u0651;", "value", "load", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;)V", "unload", "", "hasLoadedInventory", "()Z", "toggleSorting", "stopSorting", "shouldBlockInventoryClick", "Lnet/minecraft/class_1703;", "menu", "beginInventoryFrame", "(Lnet/minecraft/class_1703;)V", "", "menuSlot", "Loxxxde/\u0633\u0642;", "visualAt", "(I)Lkotakbaz/rain/ui/inventory/InventorySlotVisual;", "", "Loxxxde/\u0637\u0641;", "missingItems", "()Ljava/util/List;", "", "slotName", "(I)Ljava/lang/String;", "x", "y", "markGhost", "(II)V", "expectInventoryReturnFromAuction", "isGhostPosition", "(II)Z", "Lnet/minecraft/class_310;", "client", "tickAuctionReturn", "(Lnet/minecraft/class_310;)V", "tickWaitingForAuction", "tickOpenAuction", "clearAuctionReturn", "clearFrame", "", "positionKey", "(II)J", "AUCTION_OPEN_TIMEOUT_TICKS", "I", "AUCTION_CLOSE_CONFIRM_TICKS", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "ghostPositions", "Ljava/util/HashSet;", "snapshot", "Loxxxde/\u0651;", "Loxxxde/\u0633\u062e;", "analysis", "Loxxxde/\u0633\u062e;", "Loxxxde/\u0631\u0644;", "auctionReturnState", "Loxxxde/\u0631\u0644;", "auctionTransitionTicks", "auctionClosedTicks", "initialized", "Z", "isSorting", "AuctionReturnState", "rain-visuals"})
public final class \u0638\u0638 {
    private static final int AUCTION_CLOSE_CONFIRM_TICKS = 2;
    private static boolean initialized;
    private static int auctionTransitionTicks;
    private static int auctionClosedTicks;
    private static final int AUCTION_OPEN_TIMEOUT_TICKS = 100;
    @NotNull
    private static InventoryAnalysis analysis;
    @NotNull
    public static final \u0638\u0638 INSTANCE;
    @NotNull
    private static \u0631\u0644 auctionReturnState;
    @NotNull
    private static final HashSet<Long> ghostPositions;
    @Nullable
    private static InventorySnapshot snapshot;

    private final long positionKey(int x, int y) {
        return (long)x << 32 ^ (long)y & 0xFFFFFFFFL;
    }

    private final void tickAuctionReturn(MinecraftClient client) {
        if (auctionReturnState == \u0631\u0644.IDLE) {
            return;
        }
        if (client.player == null || client.getNetworkHandler() == null) {
            this.clearAuctionReturn();
            return;
        }
        switch (\u062a\u0652.$EnumSwitchMapping$0[auctionReturnState.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                this.tickWaitingForAuction(client);
                break;
            }
            case 3: {
                this.tickOpenAuction(client);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void load(@NotNull InventorySnapshot value) {
        Intrinsics.checkNotNullParameter(value, "value");
        \u0637\u064d.INSTANCE.stop();
        snapshot = value.deepCopy();
    }

    @NotNull
    public final String slotName(int menuSlot) {
        return \u0633\u0632.INSTANCE.slotName(menuSlot);
    }

    public final void toggleSorting() {
        \u0637\u064d.INSTANCE.toggle(snapshot);
    }

    public final void unload() {
        \u0637\u064d.INSTANCE.stop();
        snapshot = null;
        this.clearFrame();
        \u0634\u062c.INSTANCE.clearLoadedSelection();
        this.clearAuctionReturn();
    }

    private final void clearFrame() {
        ghostPositions.clear();
        analysis = new InventoryAnalysis(MapsKt.emptyMap(), CollectionsKt.emptyList());
    }

    private static final void initialize$lambda$1(ClientPlayNetworkHandler clientPlayNetworkHandler, PacketSender packetSender, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(packetSender, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.unload();
    }

    public final void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        ClientTickEvents.END_CLIENT_TICK.register(\u0638\u0638::initialize$lambda$0);
        ClientPlayConnectionEvents.JOIN.register(\u0638\u0638::initialize$lambda$1);
        ClientPlayConnectionEvents.DISCONNECT.register(\u0638\u0638::initialize$lambda$2);
    }

    public final void expectInventoryReturnFromAuction() {
        auctionReturnState = \u0631\u0644.WAITING_FOR_AUCTION;
        auctionTransitionTicks = 0;
        auctionClosedTicks = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void tickWaitingForAuction(MinecraftClient client) {
        Screen screen;
        block5: {
            int n;
            block4: {
                screen = client.currentScreen;
                if (screen instanceof InventoryScreen) break block4;
                if (screen != null) break block5;
            }
            if ((auctionTransitionTicks = (n = auctionTransitionTicks) + 1) < 100) return;
            this.clearAuctionReturn();
            return;
        }
        if (screen instanceof HandledScreen) {
            auctionReturnState = \u0631\u0644.AUCTION_OPEN;
            auctionClosedTicks = 0;
            return;
        }
        this.clearAuctionReturn();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isGhostPosition(int x, int y) {
        if (!(\u0636\u0643.getMc().currentScreen instanceof InventoryScreen)) return false;
        if (\u0635\u0635.INSTANCE.getCustomScreen() != null) return false;
        if (!ghostPositions.contains(this.positionKey(x, y))) return false;
        return true;
    }

    public final boolean shouldBlockInventoryClick() {
        return \u0637\u064d.INSTANCE.getBlocksInput();
    }

    public final void stopSorting() {
        \u0637\u064d.INSTANCE.stop();
    }

    public final void beginInventoryFrame(@NotNull ScreenHandler menu) {
        Object object;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(menu, "menu");
                ghostPositions.clear();
                object = snapshot;
                if (object == null) break block2;
                InventorySnapshot it = object;
                boolean bl = false;
                InventoryAnalysis inventoryAnalysis = \u0633\u0632.INSTANCE.analyze(it, menu);
                object = inventoryAnalysis;
                if (inventoryAnalysis != null) break block3;
            }
            object = new InventoryAnalysis(MapsKt.emptyMap(), CollectionsKt.emptyList());
        }
        analysis = object;
    }

    public final boolean isSorting() {
        return \u0637\u064d.INSTANCE.getRunning();
    }

    @NotNull
    public final List<MissingInventoryItem> missingItems() {
        return analysis.getMissingItems();
    }

    private static final void initialize$lambda$0(MinecraftClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        \u0637\u064d.INSTANCE.tick(snapshot);
        INSTANCE.tickAuctionReturn(client);
    }

    /*
     * WARNING - void declaration
     */
    private final void tickOpenAuction(MinecraftClient client) {
        Screen screen = client.currentScreen;
        if (screen instanceof InventoryScreen) {
            this.clearAuctionReturn();
        } else if (screen instanceof HandledScreen) {
            auctionClosedTicks = 0;
        } else if (screen == null) {
            int n = auctionClosedTicks;
            auctionClosedTicks = n + 1;
            if (auctionClosedTicks < 2) {
                return;
            }
            ClientPlayerEntity clientPlayerEntity = client.player;
            if (clientPlayerEntity == null) {
                void var4_5;
                \u0638\u0638 $this$tickOpenAuction_u24lambda_u240 = this;
                boolean bl = false;
                super.clearAuctionReturn();
                return;
            }
            ClientPlayerEntity player = clientPlayerEntity;
            this.clearAuctionReturn();
            client.setScreen((Screen)new InventoryScreen((PlayerEntity)player));
        } else {
            this.clearAuctionReturn();
        }
    }

    static {
        INSTANCE = new \u0638\u0638();
        ghostPositions = new HashSet();
        analysis = new InventoryAnalysis(MapsKt.emptyMap(), CollectionsKt.emptyList());
        auctionReturnState = \u0631\u0644.IDLE;
    }

    public final boolean hasLoadedInventory() {
        return snapshot != null;
    }

    @Nullable
    public final InventorySlotVisual visualAt(int menuSlot) {
        return analysis.getVisuals().get(menuSlot);
    }

    private static final void initialize$lambda$2(ClientPlayNetworkHandler clientPlayNetworkHandler, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.unload();
    }

    private \u0638\u0638() {
    }

    private final void clearAuctionReturn() {
        auctionReturnState = \u0631\u0644.IDLE;
        auctionTransitionTicks = 0;
        auctionClosedTicks = 0;
    }

    public final void markGhost(int x, int y) {
        ((Collection)ghostPositions).add(this.positionKey(x, y));
    }
}

