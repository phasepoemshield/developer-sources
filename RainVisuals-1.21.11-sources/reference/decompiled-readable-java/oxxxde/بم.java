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
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.LoreComponent
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.text.Text
 */
package oxxxde;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.ui.inventory.FunTimeOnlineHelperController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062e\u0624;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003cdeB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0003J/\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001aJ/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001aJ/\u0010\u001e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001aJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u0004\u0018\u00010$2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\b&\u0010'J-\u0010+\u001a\u0004\u0018\u00010$2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0(H\u0002\u00a2\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010-\u001a\u00020$H\u0002\u00a2\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020$2\u0006\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b6\u00107J!\u0010;\u001a\u00020\u00042\u0006\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010=\u001a\u000202H\u0002\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010=\u001a\u000202H\u0002\u00a2\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010=\u001a\u000202H\u0002\u00a2\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bC\u0010\u0003R\u0014\u0010D\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010P\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010Q\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010NR\u0016\u0010R\u001a\u0002088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010ER\u0016\u0010Z\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bZ\u0010ER\u0016\u0010[\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010ER\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010]R\u0011\u0010_\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b_\u0010\u0011R\u0011\u0010b\u001a\u0002028F\u00a2\u0006\u0006\u001a\u0004\b`\u0010a\u00a8\u0006f"}, d2={"Loxxxde/\u0628\u0645;", "", "<init>", "()V", "", "initialize", "Lnet/minecraft/class_2561;", "title", "", "isSelectorMenu", "(Lnet/minecraft/class_2561;)Z", "shouldShowButton", "Lnet/minecraft/class_1707;", "menu", "toggle", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_2561;)V", "shouldBlockInventoryClick", "()Z", "tick", "Lnet/minecraft/class_1657;", "player", "Loxxxde/\u062c\u0646;", "kind", "", "now", "selectAnarchyMode", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;Lkotakbaz/rain/ui/inventory/FunTimeOnlineHelperController$MenuKind;J)V", "selectTeam", "scanTeam", "selectBestTeam", "waitForBestServer", "joinBest", "", "Loxxxde/\u0630\u0642;", "serverCandidates", "(Lnet/minecraft/class_1707;)Ljava/util/List;", "", "teamSize", "findTeamSlot", "(Lnet/minecraft/class_1707;I)Ljava/lang/Integer;", "Lkotlin/Function1;", "Lnet/minecraft/class_1799;", "predicate", "findSlot", "(Lnet/minecraft/class_1707;Lkotlin/jvm/functions/Function1;)Ljava/lang/Integer;", "slot", "click", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;I)V", "menuKind", "(Lnet/minecraft/class_2561;)Lkotakbaz/rain/ui/inventory/FunTimeOnlineHelperController$MenuKind;", "", "value", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "containerSize", "(Lnet/minecraft/class_1707;)I", "Loxxxde/\u0630\u0641;", "nextState", "delay", "transition", "(Lkotakbaz/rain/ui/inventory/FunTimeOnlineHelperController$State;J)V", "message", "waitOrFail", "(JLjava/lang/String;)V", "fail", "(Ljava/lang/String;)V", "showStatus", "stop", "ACTION_DELAY_MS", "J", "EMPTY_TEAM_WAIT_MS", "STEP_TIMEOUT_MS", "TOTAL_TIMEOUT_MS", "", "teamSizes", "[I", "Lkotlin/text/Regex;", "anarchyRegex", "Lkotlin/text/Regex;", "teamNameRegex", "onlineRegex", "teamLoreRegex", "state", "Loxxxde/\u0630\u0641;", "teamIndex", "I", "expectedTeam", "bestServer", "Loxxxde/\u0630\u0642;", "startedAt", "stateStartedAt", "nextActionAt", "clicking", "Z", "initialized", "isRunning", "getStatusText", "()Ljava/lang/String;", "statusText", "State", "MenuKind", "ServerCandidate", "rain-visuals"})
public final class \u0628\u0645 {
    private static long nextActionAt;
    @NotNull
    private static final Regex anarchyRegex;
    private static final long STEP_TIMEOUT_MS = 6000L;
    @NotNull
    private static final Regex teamLoreRegex;
    private static long startedAt;
    private static long stateStartedAt;
    @Nullable
    private static FunTimeOnlineHelperController.ServerCandidate bestServer;
    private static boolean initialized;
    private static int expectedTeam;
    private static boolean clicking;
    @NotNull
    private static FunTimeOnlineHelperController.State state;
    private static final long TOTAL_TIMEOUT_MS = 25000L;
    @NotNull
    public static final \u0628\u0645 INSTANCE;
    private static final long ACTION_DELAY_MS = 300L;
    private static int teamIndex;
    @NotNull
    private static final Regex teamNameRegex;
    private static final long EMPTY_TEAM_WAIT_MS = 900L;
    @NotNull
    private static final int[] teamSizes;
    @NotNull
    private static final Regex onlineRegex;

    /*
     * WARNING - void declaration
     */
    private final void scanTeam(GenericContainerScreenHandler menu, PlayerEntity player, FunTimeOnlineHelperController.MenuKind kind, long now) {
        void $this$filterTo$iv$iv;
        if (kind != FunTimeOnlineHelperController.MenuKind.SERVERS) {
            this.waitOrFail(now, "Online Helper: \u0441\u043f\u0438\u0441\u043e\u043a \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u0432 x" + expectedTeam + " \u043d\u0435 \u043e\u0442\u043a\u0440\u044b\u043b\u0441\u044f");
            return;
        }
        List<FunTimeOnlineHelperController.ServerCandidate> allCandidates = this.serverCandidates(menu);
        Iterable $this$filter$iv = allCandidates;
        boolean $i$f$filter = false;
        Object object = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            FunTimeOnlineHelperController.ServerCandidate it = (FunTimeOnlineHelperController.ServerCandidate)element$iv$iv;
            boolean bl = false;
            boolean bl2 = it.getTeamSize() == expectedTeam;
            if (!bl2) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        List candidates = (List)destination$iv$iv;
        if (candidates.isEmpty()) {
            boolean bl;
            block12: {
                Iterable $this$any$iv = allCandidates;
                boolean $i$f$any = false;
                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                    bl = false;
                } else {
                    for (Object element$iv : $this$any$iv) {
                        FunTimeOnlineHelperController.ServerCandidate it = (FunTimeOnlineHelperController.ServerCandidate)element$iv;
                        boolean bl3 = false;
                        boolean bl4 = it.getTeamSize() != expectedTeam;
                        if (!bl4) continue;
                        bl = true;
                        break block12;
                    }
                    bl = false;
                }
            }
            boolean staleMenu = bl;
            if (staleMenu || now - stateStartedAt < 900L) {
                this.waitOrFail(now, "Online Helper: \u0441\u0435\u0440\u0432\u0435\u0440\u044b x" + expectedTeam + " \u043d\u0435 \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u043b\u0438\u0441\u044c");
                return;
            }
        }
        Sequence<FunTimeOnlineHelperController.ServerCandidate> $this$forEach$iv2 = SequencesKt.filter(CollectionsKt.asSequence(candidates), \u0628\u0645::scanTeam$lambda$2);
        boolean $i$f$forEach = false;
        object = $this$forEach$iv2.iterator();
        while (object.hasNext()) {
            void var14_21;
            Object element$iv = object.next();
            FunTimeOnlineHelperController.ServerCandidate candidate = (FunTimeOnlineHelperController.ServerCandidate)element$iv;
            boolean bl = false;
            FunTimeOnlineHelperController.ServerCandidate currentBest = bestServer;
            if (currentBest != null && candidate.getOnline() >= currentBest.getOnline() && (candidate.getOnline() != currentBest.getOnline() || candidate.getAnarchy() >= var14_21.getAnarchy())) continue;
            bestServer = candidate;
        }
        if (teamIndex < ArraysKt.getLastIndex(teamSizes)) {
            int $this$forEach$iv2 = teamIndex;
            teamIndex = $this$forEach$iv2 + 1;
            expectedTeam = teamSizes[teamIndex];
            \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.SELECT_TEAM, 0L, 2, null);
            return;
        }
        FunTimeOnlineHelperController.ServerCandidate serverCandidate = bestServer;
        if (serverCandidate == null) {
            \u0628\u0645 \u0628\u06452 = this;
            boolean bl = false;
            \u0628\u06452.fail("Online Helper: \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u0432 \u0441 \u043e\u043d\u043b\u0430\u0439\u043d\u043e\u043c \u043e\u0442 1 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e");
            return;
        }
        FunTimeOnlineHelperController.ServerCandidate best = serverCandidate;
        if (expectedTeam == best.getTeamSize()) {
            \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.JOIN_BEST, 0L, 2, null);
        } else {
            void var8_6;
            expectedTeam = var8_6.getTeamSize();
            \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.SELECT_BEST_TEAM, 0L, 2, null);
        }
    }

    private final Integer findTeamSlot(GenericContainerScreenHandler menu, int teamSize) {
        return this.findSlot(menu, arg_0 -> \u0628\u0645.findTeamSlot$lambda$0(teamSize, arg_0));
    }

    /*
     * WARNING - void declaration
     */
    private final void joinBest(GenericContainerScreenHandler menu, PlayerEntity player, FunTimeOnlineHelperController.MenuKind kind, long now) {
        Object v2;
        FunTimeOnlineHelperController.ServerCandidate best;
        block4: {
            if (kind != FunTimeOnlineHelperController.MenuKind.SERVERS) {
                this.waitOrFail(now, "Online Helper: \u0441\u043f\u0438\u0441\u043e\u043a \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u0432 \u0437\u0430\u043a\u0440\u044b\u0442");
                return;
            }
            FunTimeOnlineHelperController.ServerCandidate serverCandidate = bestServer;
            if (serverCandidate == null) {
                \u0628\u0645 $this$joinBest_u24lambda_u240 = this;
                boolean bl = false;
                $this$joinBest_u24lambda_u240.fail("Online Helper: \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442 \u043f\u043e\u0438\u0441\u043a\u0430 \u043f\u043e\u0442\u0435\u0440\u044f\u043d");
                return;
            }
            best = serverCandidate;
            Iterable $this$firstOrNull$iv = this.serverCandidates(menu);
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var11_11;
                FunTimeOnlineHelperController.ServerCandidate it = (FunTimeOnlineHelperController.ServerCandidate)element$iv;
                boolean bl = false;
                boolean bl2 = it.getTeamSize() == best.getTeamSize() && it.getAnarchy() == best.getAnarchy() && it.getOnline() > 0;
                if (!bl2) continue;
                v2 = var11_11;
                break block4;
            }
            v2 = null;
        }
        FunTimeOnlineHelperController.ServerCandidate serverCandidate = v2;
        if (serverCandidate == null) {
            this.waitOrFail(now, "Online Helper: \u0430\u043d\u0430\u0440\u0445\u0438\u044f " + best.getAnarchy() + " \u0431\u043e\u043b\u044c\u0448\u0435 \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430");
            return;
        }
        FunTimeOnlineHelperController.ServerCandidate candidate = serverCandidate;
        this.click(menu, player, candidate.getSlot());
        this.showStatus("Online Helper: \u0430\u043d\u0430\u0440\u0445\u0438\u044f " + candidate.getAnarchy() + ", \u043e\u043d\u043b\u0430\u0439\u043d " + candidate.getOnline() + "/" + candidate.getCapacity());
        this.stop();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean shouldShowButton(@NotNull Text title) {
        Intrinsics.checkNotNullParameter(title, "title");
        FunTimeOnlineHelperController.MenuKind menuKind = this.menuKind(title);
        if (menuKind == null) {
            return false;
        }
        FunTimeOnlineHelperController.MenuKind kind = menuKind;
        if (!\u0636\u0647.INSTANCE.isFunTime()) return false;
        if (kind == FunTimeOnlineHelperController.MenuKind.ROOT) return true;
        if (!this.isRunning()) return false;
        return true;
    }

    private final void transition(FunTimeOnlineHelperController.State nextState, long delay) {
        state = nextState;
        stateStartedAt = System.currentTimeMillis();
        nextActionAt = stateStartedAt + delay;
    }

    private final String normalize(String value) {
        CharSequence charSequence = value;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string = charSequence.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        charSequence = string;
        Regex regex = new Regex("\\s+");
        String string2 = " ";
        return ((Object)StringsKt.trim((CharSequence)regex.replace(charSequence, string2))).toString();
    }

    public final boolean shouldBlockInventoryClick() {
        return this.isRunning() && !clicking;
    }

    private final void selectAnarchyMode(GenericContainerScreenHandler menu, PlayerEntity player, FunTimeOnlineHelperController.MenuKind kind, long now) {
        block6: {
            block5: {
                if (kind == FunTimeOnlineHelperController.MenuKind.TEAM) break block5;
                if (kind != FunTimeOnlineHelperController.MenuKind.SERVERS) break block6;
            }
            \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.SELECT_TEAM, 0L, 2, null);
            return;
        }
        if (kind != FunTimeOnlineHelperController.MenuKind.ROOT) {
            this.waitOrFail(now, "Online Helper: \u0440\u0435\u0436\u0438\u043c \u0430\u043d\u0430\u0440\u0445\u0438\u0438 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
            return;
        }
        Integer n = this.findSlot(menu, \u0628\u0645::selectAnarchyMode$lambda$0);
        if (n == null) {
            this.waitOrFail(now, "Online Helper: \u0440\u0435\u0436\u0438\u043c \u0430\u043d\u0430\u0440\u0445\u0438\u0438 1.21.11 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
            return;
        }
        int slot = n;
        this.click(menu, player, slot);
        \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.SELECT_TEAM, 0L, 2, null);
    }

    private final void tick() {
        if (!this.isRunning()) {
            return;
        }
        long now = System.currentTimeMillis();
        if (now - startedAt >= 25000L) {
            this.fail("Online Helper: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u043e \u0432\u0440\u0435\u043c\u044f \u043e\u0436\u0438\u0434\u0430\u043d\u0438\u044f");
            return;
        }
        if (now < nextActionAt) {
            return;
        }
        Screen screen = \u0636\u0643.getMc().currentScreen;
        HandledScreen handledScreen = screen instanceof HandledScreen ? (HandledScreen)screen : null;
        if (handledScreen == null) {
            \u0628\u0645 $this$tick_u24lambda_u240 = this;
            boolean bl = false;
            $this$tick_u24lambda_u240.fail("Online Helper: \u043c\u0435\u043d\u044e \u0431\u044b\u043b\u043e \u0437\u0430\u043a\u0440\u044b\u0442\u043e");
            return;
        }
        HandledScreen screen2 = handledScreen;
        ScreenHandler $this$tick_u24lambda_u240 = screen2.getScreenHandler();
        GenericContainerScreenHandler genericContainerScreenHandler = $this$tick_u24lambda_u240 instanceof GenericContainerScreenHandler ? (GenericContainerScreenHandler)$this$tick_u24lambda_u240 : null;
        if (genericContainerScreenHandler == null) {
            \u0628\u0645 $this$tick_u24lambda_u241 = this;
            boolean bl = false;
            $this$tick_u24lambda_u241.fail("Online Helper: \u043d\u0435\u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u043c\u043e\u0435 \u043c\u0435\u043d\u044e");
            return;
        }
        GenericContainerScreenHandler menu = genericContainerScreenHandler;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            \u0628\u0645 $this$tick_u24lambda_u242 = this;
            boolean bl = false;
            $this$tick_u24lambda_u242.stop();
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (!\u0636\u0647.INSTANCE.isFunTime() || player.currentScreenHandler != menu || \u0636\u0643.getMc().interactionManager == null) {
            this.stop();
            return;
        }
        Text text = screen2.getTitle();
        Intrinsics.checkNotNullExpressionValue(text, "getTitle(...)");
        FunTimeOnlineHelperController.MenuKind kind = this.menuKind(text);
        if (kind == null) {
            if (now - stateStartedAt >= 6000L) {
                this.fail("Online Helper: \u043c\u0435\u043d\u044e FunTime \u043d\u0435 \u0440\u0430\u0441\u043f\u043e\u0437\u043d\u0430\u043d\u043e");
            }
            return;
        }
        switch (\u062e\u0624.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                this.selectAnarchyMode(menu, (PlayerEntity)player, kind, now);
                break;
            }
            case 3: {
                this.selectTeam(menu, (PlayerEntity)player, kind, now);
                break;
            }
            case 4: {
                this.scanTeam(menu, (PlayerEntity)player, kind, now);
                break;
            }
            case 5: {
                this.selectBestTeam(menu, (PlayerEntity)player, kind, now);
                break;
            }
            case 6: {
                this.waitForBestServer(menu, (PlayerEntity)player, kind, now);
                break;
            }
            case 7: {
                this.joinBest(menu, (PlayerEntity)player, kind, now);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final String getStatusText() {
        return switch (\u062e\u0624.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1 -> "\u041d\u0430\u0439\u0442\u0438 \u0430\u043d\u0430\u0440\u0445\u0438\u044e \u0441 \u043c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u044b\u043c \u043e\u043d\u043b\u0430\u0439\u043d\u043e\u043c";
            case 2 -> "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u044e \u0441\u043f\u0438\u0441\u043e\u043a \u0430\u043d\u0430\u0440\u0445\u0438\u0439...";
            case 3, 4 -> "\u041f\u0440\u043e\u0432\u0435\u0440\u044f\u044e \u043a\u043e\u043c\u0430\u043d\u0434\u044b x" + expectedTeam + "...";
            case 5, 6 -> {
                FunTimeOnlineHelperController.ServerCandidate server = bestServer;
                if (server == null) {
                    yield "\u0412\u044b\u0431\u0438\u0440\u0430\u044e \u043b\u0443\u0447\u0448\u0438\u0439 \u0441\u0435\u0440\u0432\u0435\u0440...";
                }
                yield "\u0410\u043d\u0430\u0440\u0445\u0438\u044f " + server.getAnarchy() + ": " + server.getOnline() + "/" + server.getCapacity();
            }
            case 7 -> "\u0412\u0445\u043e\u0436\u0443 \u043d\u0430 \u043d\u0430\u0439\u0434\u0435\u043d\u043d\u0443\u044e \u0430\u043d\u0430\u0440\u0445\u0438\u044e...";
            default -> throw new NoWhenBranchMatchedException();
        };
    }

    private final void selectBestTeam(GenericContainerScreenHandler menu, PlayerEntity player, FunTimeOnlineHelperController.MenuKind kind, long now) {
        if (kind != FunTimeOnlineHelperController.MenuKind.SERVERS) {
            if (kind != FunTimeOnlineHelperController.MenuKind.TEAM) {
                this.waitOrFail(now, "Online Helper: \u043d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0432\u0435\u0440\u043d\u0443\u0442\u044c\u0441\u044f \u043a \u043b\u0443\u0447\u0448\u0435\u0439 \u0433\u0440\u0443\u043f\u043f\u0435");
                return;
            }
        }
        Integer n = this.findTeamSlot(menu, expectedTeam);
        if (n == null) {
            this.waitOrFail(now, "Online Helper: \u043a\u043e\u043c\u0430\u043d\u0434\u044b x" + expectedTeam + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u044b");
            return;
        }
        int slot = n;
        this.click(menu, player, slot);
        \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.WAIT_BEST_SERVER, 0L, 2, null);
    }

    private static final boolean scanTeam$lambda$2(FunTimeOnlineHelperController.ServerCandidate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOnline() > 0;
    }

    private final int containerSize(GenericContainerScreenHandler menu) {
        return menu.getRows() * 9;
    }

    private final void selectTeam(GenericContainerScreenHandler menu, PlayerEntity player, FunTimeOnlineHelperController.MenuKind kind, long now) {
        if (kind == FunTimeOnlineHelperController.MenuKind.ROOT) {
            this.waitOrFail(now, "Online Helper: \u0441\u043f\u0438\u0441\u043e\u043a \u043a\u043e\u043c\u0430\u043d\u0434 \u043d\u0435 \u043e\u0442\u043a\u0440\u044b\u043b\u0441\u044f");
            return;
        }
        Integer n = this.findTeamSlot(menu, expectedTeam);
        if (n == null) {
            this.waitOrFail(now, "Online Helper: \u043a\u043e\u043c\u0430\u043d\u0434\u044b x" + expectedTeam + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u044b");
            return;
        }
        int slot = n;
        this.click(menu, player, slot);
        \u0628\u0645.transition$default(this, FunTimeOnlineHelperController.State.WAIT_SERVERS, 0L, 2, null);
    }

    public final void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        ClientTickEvents.END_CLIENT_TICK.register(\u0628\u0645::initialize$lambda$0);
        ClientPlayConnectionEvents.JOIN.register(\u0628\u0645::initialize$lambda$1);
        ClientPlayConnectionEvents.DISCONNECT.register(\u0628\u0645::initialize$lambda$2);
    }

    private final void stop() {
        state = FunTimeOnlineHelperController.State.IDLE;
        teamIndex = 0;
        expectedTeam = ArraysKt.first(teamSizes);
        bestServer = null;
        startedAt = 0L;
        stateStartedAt = 0L;
        nextActionAt = 0L;
        clicking = false;
    }

    public final void toggle(@NotNull GenericContainerScreenHandler menu, @NotNull Text title) {
        block11: {
            block10: {
                block9: {
                    block8: {
                        Intrinsics.checkNotNullParameter(menu, "menu");
                        Intrinsics.checkNotNullParameter(title, "title");
                        if (this.isRunning()) {
                            this.stop();
                            this.showStatus("Online Helper \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d");
                            return;
                        }
                        if (!\u0636\u0647.INSTANCE.isFunTime()) break block8;
                        if (this.menuKind(title) == FunTimeOnlineHelperController.MenuKind.ROOT) break block9;
                    }
                    return;
                }
                ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
                if (clientPlayerEntity == null) {
                    return;
                }
                ClientPlayerEntity player = clientPlayerEntity;
                if (\u0636\u0643.getMc().interactionManager == null) break block10;
                if (player.currentScreenHandler == menu && menu.getCursorStack().isEmpty()) break block11;
            }
            return;
        }
        teamIndex = 0;
        expectedTeam = ArraysKt.first(teamSizes);
        bestServer = null;
        startedAt = System.currentTimeMillis();
        this.transition(FunTimeOnlineHelperController.State.SELECT_ANARCHY, 0L);
    }

    private final FunTimeOnlineHelperController.MenuKind menuKind(Text title) {
        String string = title.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String value = this.normalize(string);
        return StringsKt.contains$default((CharSequence)value, "\u0432\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0442\u0438\u043f \u0440\u0435\u0436\u0438\u043c\u0430", false, 2, null) ? FunTimeOnlineHelperController.MenuKind.TEAM : (StringsKt.contains$default((CharSequence)value, "\u0432\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0441\u0435\u0440\u0432\u0435\u0440", false, 2, null) ? FunTimeOnlineHelperController.MenuKind.SERVERS : (StringsKt.contains$default((CharSequence)value, "\u0432\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c", false, 2, null) ? FunTimeOnlineHelperController.MenuKind.ROOT : null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void click(GenericContainerScreenHandler menu, PlayerEntity player, int slot) {
        clicking = true;
        try {
            ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
            if (clientPlayerInteractionManager != null) {
                clientPlayerInteractionManager.clickSlot(menu.syncId, slot, 0, SlotActionType.PICKUP, player);
            }
            menu.sendContentUpdates();
        }
        finally {
            clicking = false;
        }
    }

    private static final void initialize$lambda$2(ClientPlayNetworkHandler clientPlayNetworkHandler, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.stop();
    }

    private \u0628\u0645() {
    }

    private static final void initialize$lambda$1(ClientPlayNetworkHandler clientPlayNetworkHandler, PacketSender packetSender, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(packetSender, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.stop();
    }

    private static final boolean selectAnarchyMode$lambda$0(ItemStack stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        String string = stack.getName().getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return StringsKt.contains$default((CharSequence)INSTANCE.normalize(string), "\u0430\u043d\u0430\u0440\u0445\u0438\u044f 1.21.11", false, 2, null);
    }

    private final void fail(String message) {
        this.showStatus(message);
        this.stop();
    }

    static {
        INSTANCE = new \u0628\u0645();
        int[] nArray = new int[5];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 3;
        nArray[3] = 5;
        nArray[4] = 10;
        teamSizes = nArray;
        anarchyRegex = new Regex("\u0430\u043d\u0430\u0440\u0445\u0438\u044f\\s*[-#:]?\\s*(\\d+)", RegexOption.IGNORE_CASE);
        teamNameRegex = new Regex("\u043a\u043e\u043c\u0430\u043d\u0434[\u0430\u044b]?\\s*[x\u0445\u00d7]\\s*(\\d+)", RegexOption.IGNORE_CASE);
        onlineRegex = new Regex("\u043e\u043d\u043b\u0430\u0439\u043d\\s+\u0440\u0435\u0436\u0438\u043c\u0430\\s*:\\s*(\\d+)\\s*/\\s*(\\d+)", RegexOption.IGNORE_CASE);
        teamLoreRegex = new Regex("\u0438\u0433\u0440\u043e\u043a\u043e\u0432\\s+\u0432\\s+\u043a\u043e\u043c\u0430\u043d\u0434\u0435\\s*:\\s*(\\d+)", RegexOption.IGNORE_CASE);
        state = FunTimeOnlineHelperController.State.IDLE;
        expectedTeam = 1;
    }

    private static final void initialize$lambda$0(MinecraftClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.tick();
    }

    private final void waitOrFail(long now, String message) {
        if (now - stateStartedAt >= 6000L) {
            this.fail(message);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean findTeamSlot$lambda$0(int $teamSize, ItemStack stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        String string = stack.getName().getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        MatchResult matchResult = Regex.find$default(teamNameRegex, INSTANCE.normalize(string), 0, 2, null);
        if (matchResult == null) return false;
        List<String> list = matchResult.getGroupValues();
        if (list == null) return false;
        String string2 = CollectionsKt.getOrNull(list, 1);
        if (string2 == null) return false;
        Integer n = StringsKt.toIntOrNull(string2);
        int n2 = $teamSize;
        if (n == null) return false;
        if (n != n2) return false;
        return true;
    }

    static /* synthetic */ void transition$default(\u0628\u0645 \u0628\u06452, FunTimeOnlineHelperController.State state, long l, int n, Object object) {
        if ((n & 2) != 0) {
            l = 300L;
        }
        \u0628\u06452.transition(state, l);
    }

    private static final CharSequence serverCandidates$lambda$0$0(Text it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return INSTANCE.normalize(string);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final Integer findSlot(GenericContainerScreenHandler menu, Function1<? super ItemStack, Boolean> predicate) {
        void var6_6;
        Object v0;
        boolean bl;
        Iterable $this$firstOrNull$iv = RangesKt.until(0, this.containerSize(menu));
        boolean $i$f$firstOrNull = false;
        Iterator iterator2 = $this$firstOrNull$iv.iterator();
        do {
            ItemStack stack;
            if (!iterator2.hasNext()) {
                v0 = null;
                return v0;
            }
            Object element$iv = iterator2.next();
            int slot = ((Number)element$iv).intValue();
            boolean bl2 = false;
            Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot).getStack(), "getItem(...)");
            if (!stack.isEmpty()) {
                if (predicate.invoke((ItemStack)stack).booleanValue()) {
                    bl = true;
                    continue;
                }
            }
            bl = false;
        } while (!bl);
        v0 = var6_6;
        return v0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final List<FunTimeOnlineHelperController.ServerCandidate> serverCandidates(GenericContainerScreenHandler menu) {
        $this$mapNotNull$iv = RangesKt.until(0, this.containerSize(menu));
        $i$f$mapNotNull = false;
        var4_4 = $this$mapNotNull$iv;
        destination$iv$iv = new ArrayList<E>();
        $i$f$mapNotNullTo = false;
        $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        $i$f$forEach = false;
        var9_9 = $this$forEach$iv$iv$iv.iterator();
        while (var9_9.hasNext()) {
            block15: {
                block14: {
                    element$iv$iv = element$iv$iv$iv = ((IntIterator)var9_9).nextInt();
                    $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = false;
                    slot = element$iv$iv;
                    $i$a$-mapNotNull-FunTimeOnlineHelperController$serverCandidates$1 = false;
                    Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot).getStack(), "getItem(...)");
                    if (!stack.isEmpty()) break block14;
                    v0 = null;
                    break block15;
                }
                v1 = stack.getName().getString();
                Intrinsics.checkNotNullExpressionValue(v1, "getString(...)");
                var16_16 = Regex.find$default(\u0628\u0645.anarchyRegex, \u0628\u0645.INSTANCE.normalize(v1), 0, 2, null);
                if (var16_16 == null || (var17_17 = var16_16.getGroupValues()) == null) ** GOTO lbl-1000
                var18_18 = CollectionsKt.getOrNull(var17_17, 1);
                if (var18_18 == null || (var19_19 = StringsKt.toIntOrNull(var18_18)) == null) lbl-1000:
                // 2 sources

                {
                    v0 = null;
                } else {
                    anarchy = var19_19;
                    v2 = (LoreComponent)stack.get(DataComponentTypes.LORE);
                    v3 /* !! */  = v2 != null ? v2.lines() : null;
                    v4 = v3 /* !! */ ;
                    if (v3 /* !! */  == null) {
                        v4 = CollectionsKt.emptyList();
                    }
                    lore = CollectionsKt.joinToString$default(v4, "\n", null, null, 0, null, (Function1<Text, CharSequence>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, serverCandidates$lambda$0$0(net.minecraft.text.Text ), (Lnet/minecraft/text/Text;)Ljava/lang/CharSequence;)(), 30, null);
                    if (Regex.find$default(\u0628\u0645.onlineRegex, lore, 0, 2, null) == null) {
                        v0 = null;
                    } else if (Regex.find$default(\u0628\u0645.teamLoreRegex, lore, 0, 2, null) == null) {
                        v0 = null;
                    } else {
                        v5 = CollectionsKt.getOrNull(onlineMatch.getGroupValues(), 1);
                        if (v5 == null || (v5 = StringsKt.toIntOrNull((String)v5)) == null) {
                            v0 = null;
                        } else {
                            online = v5.intValue();
                            v6 = CollectionsKt.getOrNull(onlineMatch.getGroupValues(), 2);
                            if (v6 == null || (v6 = StringsKt.toIntOrNull((String)v6)) == null) {
                                v0 = null;
                            } else {
                                capacity = v6.intValue();
                                v7 = CollectionsKt.getOrNull(teamMatch.getGroupValues(), 1);
                                if (v7 == null || (v7 = StringsKt.toIntOrNull((String)v7)) == null) {
                                    v0 = null;
                                } else {
                                    var22_23 = v7.intValue();
                                    v0 = new FunTimeOnlineHelperController.ServerCandidate((int)var20_21, (int)var19_20, (int)var21_22, var22_23, (int)var13_13);
                                }
                            }
                        }
                    }
                }
            }
            if (v0 == null) continue;
            var23_24 = v0;
            var24_25 = false;
            var5_5.add(var23_24);
        }
        return (List)var5_5;
    }

    /*
     * WARNING - void declaration
     */
    private final void waitForBestServer(GenericContainerScreenHandler menu, PlayerEntity player, FunTimeOnlineHelperController.MenuKind kind, long now) {
        void var4_4;
        void var3_3;
        void var2_2;
        void var1_1;
        FunTimeOnlineHelperController.ServerCandidate candidate;
        Object v2;
        FunTimeOnlineHelperController.ServerCandidate best;
        block4: {
            if (kind != FunTimeOnlineHelperController.MenuKind.SERVERS) {
                this.waitOrFail(now, "Online Helper: \u043b\u0443\u0447\u0448\u0438\u0439 \u0441\u043f\u0438\u0441\u043e\u043a \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u0432 \u043d\u0435 \u043e\u0442\u043a\u0440\u044b\u043b\u0441\u044f");
                return;
            }
            FunTimeOnlineHelperController.ServerCandidate serverCandidate = bestServer;
            if (serverCandidate == null) {
                \u0628\u0645 $this$waitForBestServer_u24lambda_u240 = this;
                boolean bl = false;
                $this$waitForBestServer_u24lambda_u240.fail("Online Helper: \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442 \u043f\u043e\u0438\u0441\u043a\u0430 \u043f\u043e\u0442\u0435\u0440\u044f\u043d");
                return;
            }
            best = serverCandidate;
            Iterable $this$firstOrNull$iv = this.serverCandidates(menu);
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var11_11;
                FunTimeOnlineHelperController.ServerCandidate it = (FunTimeOnlineHelperController.ServerCandidate)element$iv;
                boolean bl = false;
                boolean bl2 = it.getTeamSize() == best.getTeamSize() && it.getAnarchy() == best.getAnarchy() && it.getOnline() > 0;
                if (!bl2) continue;
                v2 = var11_11;
                break block4;
            }
            v2 = null;
        }
        FunTimeOnlineHelperController.ServerCandidate serverCandidate = v2;
        if (serverCandidate == null) {
            this.waitOrFail(now, "Online Helper: \u0430\u043d\u0430\u0440\u0445\u0438\u044f " + best.getAnarchy() + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430");
            return;
        }
        bestServer = candidate = serverCandidate;
        this.transition(FunTimeOnlineHelperController.State.JOIN_BEST, 0L);
        this.joinBest((GenericContainerScreenHandler)var1_1, (PlayerEntity)var2_2, (FunTimeOnlineHelperController.MenuKind)var3_3, (long)var4_4);
    }

    public final boolean isSelectorMenu(@NotNull Text title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return \u0636\u0647.INSTANCE.isFunTime() && this.menuKind(title) != null;
    }

    private final void showStatus(String message) {
        \u0636\u0643.getMc().inGameHud.setOverlayMessage((Text)Text.literal((String)message), false);
    }

    public final boolean isRunning() {
        return state != FunTimeOnlineHelperController.State.IDLE;
    }
}

