/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.scoreboard.ScoreboardDisplaySlot
 *  net.minecraft.scoreboard.ScoreboardEntry
 *  net.minecraft.scoreboard.ScoreboardObjective
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Text
 *  net.minecraft.util.math.BlockPos
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package kotakbaz.rain.module.modules.render;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.ui.menu.FunTimeEventsApi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062e\u0645;
import oxxxde.\u062f\u0644;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0647;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002\u00a2\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020!H\u0002\u00a2\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020!H\u0002\u00a2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020!H\u0002\u00a2\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020!H\u0002\u00a2\u0006\u0004\b/\u00100J!\u00101\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002\u00a2\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020!H\u0002\u00a2\u0006\u0004\b8\u0010-J\u0011\u00109\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u0004\u0018\u00010\r2\u0006\u0010+\u001a\u00020!H\u0002\u00a2\u0006\u0004\b;\u0010'J\u001f\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\r2\u0006\u00107\u001a\u00020!H\u0002\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b@\u0010\u0003J\u001f\u0010A\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002\u00a2\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020.H\u0002\u00a2\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bG\u0010\u0003J\u0017\u0010H\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bJ\u0010\u0003J\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bL\u0010\u000bJ\u000f\u0010M\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bM\u0010\u0003J\u000f\u0010N\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bN\u0010\u0003J\u0019\u0010Q\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020OH\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\bS\u0010-J\u0017\u0010V\u001a\u00020!2\u0006\u0010U\u001a\u00020TH\u0002\u00a2\u0006\u0004\bV\u0010WJ!\u0010Z\u001a\u00020!2\u0006\u0010X\u001a\u00020!2\b\u0010Y\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010_\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010`\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010]R\u0014\u0010a\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020O8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020O8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010dR\u0014\u0010f\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010n\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010lR\u0014\u0010o\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bo\u0010lR\u0014\u0010p\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bp\u0010lR\u0014\u0010q\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bq\u0010lR\u0014\u0010r\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\br\u0010lR&\u0010u\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0t0s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bu\u0010vR\u0017\u0010x\u001a\u00020w8\u0006\u00a2\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010|\u001a\u00020w8\u0006\u00a2\u0006\f\n\u0004\b|\u0010y\u001a\u0004\b}\u0010{R\u0017\u0010~\u001a\u00020w8\u0006\u00a2\u0006\f\n\u0004\b~\u0010y\u001a\u0004\b\u007f\u0010{R\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R\u0016\u0010\u0084\u0001\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0084\u0001\u0010yR\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008c\u0001\u0010]R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008f\u0001\u0010bR\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0090\u0001\u0010]R\u0018\u0010\u0091\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0091\u0001\u0010dR\u001a\u0010\u0092\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0092\u0001\u0010]R\u0019\u0010\u0093\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u0089\u0001R\u0018\u0010\u0094\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0094\u0001\u0010dR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0095\u0001\u0010]R\u0018\u0010\u0096\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0096\u0001\u0010dR\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0097\u0001\u0010]R\u0018\u0010\u0098\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0098\u0001\u0010d\u00a8\u0006\u0099\u0001"}, d2={"Loxxxde/\u0636\u062a;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "canToggle", "()Z", "canBind", "value", "", "setEnabled", "(Z)V", "toggle", "", "key", "applyLegacyBindIfNeeded", "(I)V", "", "distance", "", "waypointAlphaByDistance", "(D)F", "Loxxxde/\u062a\u0632;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Loxxxde/\u0633\u062d;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_2561;", "message", "handleIncomingMessage", "(Lnet/minecraft/class_2561;)V", "", "rawMessage", "normalizedMessage", "syncEventsApiMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "parseEventCountdownSeconds", "(Ljava/lang/String;)Ljava/lang/Integer;", "Loxxxde/\u0634\u0629;", "liveEventStatus", "(Ljava/lang/String;)Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Status;", "raw", "matchesEventMessage", "(Ljava/lang/String;)Z", "Lnet/minecraft/class_2338;", "extractEventCoordinates", "(Ljava/lang/String;)Lnet/minecraft/class_2338;", "extractEventName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lnet/minecraft/class_746;", "player", "updateEventDelayAutomation", "(Lnet/minecraft/class_746;)V", "contextKey", "trySendEventDelayRequest", "findCurrentAnarchyNumber", "()Ljava/lang/Integer;", "extractAnarchyNumber", "targetTick", "scheduleEventDelayRequest", "(ILjava/lang/String;)V", "clearScheduledEventDelayRequest", "clearForServerContextSwitch", "handleEventDelayMessage", "(Ljava/lang/String;Ljava/lang/String;)Z", "eventName", "eventPos", "putEventWaypoint", "(Ljava/lang/String;Lnet/minecraft/class_2338;)V", "removeEventWaypoints", "isPlayerAlive", "(Lnet/minecraft/class_746;)Z", "resetDeathTracking", "clearSession", "resetEventDelayTracking", "clearEventDelayContext", "clearExpiredEventDelayState", "", "now", "touchEventDelayResponseTimeout", "(J)V", "isEventDelayNameLine", "", "world", "buildFunTimeSessionKey", "(Ljava/lang/Object;)Ljava/lang/String;", "sessionKey", "anarchyNumber", "buildEventDelayRequestContextKey", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "EVENT_WAYPOINT_NAME", "Ljava/lang/String;", "DEATH_WAYPOINT_NAME", "BOXED_EVENT_HEADER", "EVENT_DELAY_COMMAND", "AUTO_EVENT_DELAY_REQUEST_TICKS", "I", "EVENT_DELAY_CONTEXT_TIMEOUT_MS", "J", "AUTO_EVENT_DELAY_REQUEST_COOLDOWN_MS", "DEFAULT_WAYPOINT_HIDE_DISTANCE", "F", "WAYPOINT_FADE_DISTANCE", "D", "Lkotlin/text/Regex;", "eventCoordinatesRegex", "Lkotlin/text/Regex;", "eventNameLineRegex", "eventDelayNameRegex", "anarchyRegex", "eventCountdownHoursRegex", "eventCountdownMinutesRegex", "eventCountdownSecondsRegex", "", "Lkotlin/Pair;", "knownEventNames", "Ljava/util/List;", "Loxxxde/\u062e\u0630;", "showWaypoints", "Loxxxde/\u062e\u0630;", "getShowWaypoints", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "autoEventPoint", "getAutoEventPoint", "deathPoint", "getDeathPoint", "Loxxxde/\u0630\u064f;", "quickWaypointKey", "Loxxxde/\u0630\u064f;", "removeLastWaypointKey", "fadeWaypointOnCloseDistance", "Loxxxde/\u0637\u064f;", "fadeWaypointHideDistance", "Loxxxde/\u0637\u064f;", "deathHandled", "Z", "lastAlivePos", "Lnet/minecraft/class_2338;", "lastFunTimeSessionKey", "lastKnownAnarchyNumber", "Ljava/lang/Integer;", "scheduledEventDelayRequestTick", "scheduledEventDelayRequestContextKey", "lastAutoEventDelayRequestAt", "lastAutoEventDelayRequestContextKey", "awaitingEventDelayResponse", "awaitingEventDelayResponseUntil", "pendingEventNameFromDelay", "pendingEventNameFromDelayAt", "pendingEventsApiName", "pendingEventsApiNameAt", "rain-visuals"})
@RecompileFormat
public final class WayPointModule
extends Module {
    private static long awaitingEventDelayResponseUntil;
    @Nullable
    private static String lastAutoEventDelayRequestContextKey;
    @Nullable
    private static Integer lastKnownAnarchyNumber;
    @NotNull
    private static final String EVENT_WAYPOINT_NAME = "Event";
    @NotNull
    private static final Regex eventCoordinatesRegex;
    private static long pendingEventNameFromDelayAt;
    @NotNull
    private static final Regex eventCountdownSecondsRegex;
    @NotNull
    private static final Regex eventNameLineRegex;
    @NotNull
    private static final Regex eventCountdownMinutesRegex;
    private static boolean deathHandled;
    @NotNull
    private static final BindSetting quickWaypointKey;
    @NotNull
    private static final String BOXED_EVENT_HEADER = "\u2554\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2557";
    @Nullable
    private static String pendingEventsApiName;
    @NotNull
    private static final SliderSetting fadeWaypointHideDistance;
    private static final float DEFAULT_WAYPOINT_HIDE_DISTANCE = 3.0f;
    private static final int AUTO_EVENT_DELAY_REQUEST_TICKS = 40;
    @NotNull
    public static final WayPointModule INSTANCE;
    @NotNull
    private static final Regex anarchyRegex;
    @Nullable
    private static String scheduledEventDelayRequestContextKey;
    @NotNull
    private static final String EVENT_DELAY_COMMAND = "event delay";
    private static final double WAYPOINT_FADE_DISTANCE = 4.0;
    @NotNull
    private static final Regex eventDelayNameRegex;
    private static int scheduledEventDelayRequestTick;
    @Nullable
    private static BlockPos lastAlivePos;
    @Nullable
    private static String lastFunTimeSessionKey;
    @NotNull
    private static final BooleanSetting deathPoint;
    @NotNull
    private static final BooleanSetting fadeWaypointOnCloseDistance;
    private static long pendingEventsApiNameAt;
    private static boolean awaitingEventDelayResponse;
    @NotNull
    private static final List<Pair<String, String>> knownEventNames;
    @NotNull
    private static final BooleanSetting autoEventPoint;
    private static final long EVENT_DELAY_CONTEXT_TIMEOUT_MS = 6000L;
    private static final long AUTO_EVENT_DELAY_REQUEST_COOLDOWN_MS = 15000L;
    @NotNull
    private static final BindSetting removeLastWaypointKey;
    @NotNull
    private static final Regex eventCountdownHoursRegex;
    @NotNull
    private static final String DEATH_WAYPOINT_NAME = "Death Point";
    @Nullable
    private static String pendingEventNameFromDelay;
    @NotNull
    private static final BooleanSetting showWaypoints;
    private static long lastAutoEventDelayRequestAt;

    /*
     * Unable to fully structure code
     */
    private final void syncEventsApiMessage(String rawMessage, String normalizedMessage) {
        v0 = WayPointModule.lastKnownAnarchyNumber;
        if (v0 == null) {
            v0 = this.findCurrentAnarchyNumber();
        }
        anarchy = v0;
        if (StringsKt.contains$default((CharSequence)normalizedMessage, "\u0434\u043e \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0435\u0433\u043e \u0438\u0432\u0435\u043d\u0442\u0430", false, 2, null)) ** GOTO lbl-1000
        if (StringsKt.contains$default((CharSequence)normalizedMessage, "until next event", false, 2, null)) lbl-1000:
        // 2 sources

        {
            v1 = true;
        } else {
            v1 = false;
        }
        isCountdown = v1;
        if (isCountdown) {
            v2 = this.parseEventCountdownSeconds(normalizedMessage);
            if (v2 != null) {
                seconds = ((Number)v2).intValue();
                $i$a$-let-WayPointModule$syncEventsApiMessage$1 = false;
                \u062e\u0645.INSTANCE.syncWithLiveCountdown(anarchy, seconds);
            }
            WayPointModule.pendingEventsApiName = null;
            WayPointModule.pendingEventsApiNameAt = 0L;
            return;
        }
        var6_9 = WayPointModule.eventDelayNameRegex.matchEntire(StringsKt.trim((CharSequence)rawMessage).toString());
        if (var6_9 == null || (seconds = var6_9.getGroupValues()) == null) ** GOTO lbl-1000
        $i$a$-let-WayPointModule$syncEventsApiMessage$1 = CollectionsKt.getOrNull(seconds, 2);
        if ($i$a$-let-WayPointModule$syncEventsApiMessage$1 == null) ** GOTO lbl-1000
        var9_11 = StringsKt.trim((CharSequence)$i$a$-let-WayPointModule$syncEventsApiMessage$1).toString();
        if (var9_11 != null) {
            p0 = var10_12 = var9_11;
            $i$a$-takeIf-WayPointModule$syncEventsApiMessage$eventName$1 = false;
            v3 = ((CharSequence)p0).length() > 0 ? var10_12 : null;
        } else lbl-1000:
        // 3 sources

        {
            v3 = null;
        }
        eventName = v3;
        if (eventName != null) {
            WayPointModule.pendingEventsApiName = eventName;
            WayPointModule.pendingEventsApiNameAt = System.currentTimeMillis();
            return;
        }
        if (StringsKt.contains$default((CharSequence)normalizedMessage, "\u0441\u0442\u0430\u0442\u0443\u0441", false, 2, null)) ** GOTO lbl-1000
        if (StringsKt.contains$default((CharSequence)normalizedMessage, "status", false, 2, null)) lbl-1000:
        // 2 sources

        {
            v4 = true;
        } else {
            v4 = false;
        }
        hasStatus = v4;
        if (!hasStatus) {
            return;
        }
        v5 = WayPointModule.pendingEventsApiName;
        if (v5 == null) {
            return;
        }
        pendingName = v5;
        if (System.currentTimeMillis() - WayPointModule.pendingEventsApiNameAt > 6000L) {
            WayPointModule.pendingEventsApiName = null;
            WayPointModule.pendingEventsApiNameAt = 0L;
            return;
        }
        v6 = this.liveEventStatus((String)var2_2);
        if (v6 == null) {
            return;
        }
        var8_8 = v6;
        \u062e\u0645.INSTANCE.syncWithLiveEvent((Integer)var3_3, (String)var7_6, var8_8, this.parseEventCountdownSeconds((String)var2_2));
    }

    private final void resetEventDelayTracking(boolean clearSession) {
        this.clearScheduledEventDelayRequest();
        this.clearEventDelayContext();
        awaitingEventDelayResponse = false;
        awaitingEventDelayResponseUntil = 0L;
        if (clearSession) {
            lastFunTimeSessionKey = null;
            lastKnownAnarchyNumber = null;
            lastAutoEventDelayRequestContextKey = null;
        }
    }

    private final void resetDeathTracking() {
        deathHandled = false;
        lastAlivePos = null;
    }

    private static final boolean _init_$lambda$0() {
        return false;
    }

    @Override
    public void toggle() {
    }

    private final void clearForServerContextSwitch() {
        this.clearScheduledEventDelayRequest();
        this.clearEventDelayContext();
        awaitingEventDelayResponse = false;
        awaitingEventDelayResponseUntil = 0L;
        pendingEventsApiName = null;
        pendingEventsApiNameAt = 0L;
        this.removeEventWaypoints();
    }

    public static final /* synthetic */ Integer access$extractAnarchyNumber(WayPointModule $this, String raw) {
        return $this.extractAnarchyNumber(raw);
    }

    /*
     * WARNING - void declaration
     */
    private final BlockPos extractEventCoordinates(String raw) {
        void var5_5;
        void var4_4;
        void var3_3;
        MatchResult matchResult = Regex.find$default(eventCoordinatesRegex, raw, 0, 2, null);
        if (matchResult == null) {
            return null;
        }
        MatchResult match = matchResult;
        Integer n = StringsKt.toIntOrNull(match.getGroupValues().get(1));
        if (n == null) {
            return null;
        }
        int x = n;
        Integer n2 = StringsKt.toIntOrNull(match.getGroupValues().get(2));
        if (n2 == null) {
            return null;
        }
        int y = n2;
        Integer n3 = StringsKt.toIntOrNull(match.getGroupValues().get(3));
        if (n3 == null) {
            return null;
        }
        int z = n3;
        return new BlockPos((int)var3_3, (int)var4_4, (int)var5_5);
    }

    /*
     * Unable to fully structure code
     */
    private final String extractEventName(String rawMessage, String normalizedMessage) {
        block7: {
            var4_3 = Regex.find$default(WayPointModule.eventNameLineRegex, rawMessage, 0, 2, null);
            if (var4_3 == null || (var5_4 = var4_3.getGroupValues()) == null) ** GOTO lbl-1000
            var6_5 = CollectionsKt.getOrNull(var5_4, 1);
            if (var6_5 == null) ** GOTO lbl-1000
            var7_6 = StringsKt.trim((CharSequence)var6_5).toString();
            if (var7_6 != null) {
                p0 = var8_8 = var7_6;
                $i$a$-takeIf-WayPointModule$extractEventName$directName$1 = false;
                v0 = ((CharSequence)p0).length() > 0 ? var8_8 : null;
            } else lbl-1000:
            // 3 sources

            {
                v0 = null;
            }
            directName = v0;
            if (directName != null) {
                return directName;
            }
            var5_4 = WayPointModule.eventDelayNameRegex.matchEntire(StringsKt.trim((CharSequence)rawMessage).toString());
            if (var5_4 == null || (var6_5 = var5_4.getGroupValues()) == null) ** GOTO lbl-1000
            var7_6 = (String)CollectionsKt.getOrNull(var6_5, 2);
            if (var7_6 == null) ** GOTO lbl-1000
            var8_8 = StringsKt.trim((CharSequence)var7_6).toString();
            if (var8_8 != null) {
                p0 = p0 = var8_8;
                $i$a$-takeIf-WayPointModule$extractEventName$delayName$1 = false;
                v1 = ((CharSequence)p0).length() > 0 ? p0 : null;
            } else lbl-1000:
            // 3 sources

            {
                v1 = null;
            }
            delayName = v1;
            if (delayName != null) {
                return delayName;
            }
            $this$firstOrNull$iv = WayPointModule.knownEventNames;
            $i$f$firstOrNull = false;
            for (E element$iv : $this$firstOrNull$iv) {
                var10_12 = (Pair)element$iv;
                $i$a$-firstOrNull-WayPointModule$extractEventName$1 = false;
                var12_15 = (String)var10_12.component1();
                if (!StringsKt.contains$default((CharSequence)normalizedMessage, var12_15, false, 2, null)) continue;
                v2 = var9_9;
                break block7;
            }
            v2 = null;
        }
        v3 = v2;
        return v3 != null ? (String)v3.getSecond() : null;
    }

    @NotNull
    public final BooleanSetting getAutoEventPoint() {
        return autoEventPoint;
    }

    @NotNull
    public final BooleanSetting getDeathPoint() {
        return deathPoint;
    }

    private final String buildEventDelayRequestContextKey(String sessionKey, Integer anarchyNumber) {
        return anarchyNumber == null ? sessionKey + "#pending" : sessionKey + "#anarchy:" + anarchyNumber;
    }

    /*
     * Unable to fully structure code
     */
    private final Integer parseEventCountdownSeconds(String message) {
        v0 = Regex.find$default(WayPointModule.eventCountdownHoursRegex, message, 0, 2, null);
        if (v0 == null || (v0 = v0.getGroupValues()) == null) ** GOTO lbl-1000
        if ((v0 = (String)CollectionsKt.getOrNull(v0, 1)) != null && (v0 = StringsKt.toIntOrNull((String)v0)) != null) {
            v1 = v0.intValue();
        } else lbl-1000:
        // 2 sources

        {
            v1 = 0;
        }
        hours = v1;
        v2 = Regex.find$default(WayPointModule.eventCountdownMinutesRegex, message, 0, 2, null);
        if (v2 == null || (v2 = v2.getGroupValues()) == null) ** GOTO lbl-1000
        if ((v2 = (String)CollectionsKt.getOrNull(v2, 1)) != null && (v2 = StringsKt.toIntOrNull((String)v2)) != null) {
            v3 = v2.intValue();
        } else lbl-1000:
        // 2 sources

        {
            v3 = 0;
        }
        minutes = v3;
        v4 = Regex.find$default(WayPointModule.eventCountdownSecondsRegex, message, 0, 2, null);
        if (v4 == null || (v4 = v4.getGroupValues()) == null) ** GOTO lbl-1000
        if ((v4 = (String)CollectionsKt.getOrNull(v4, 1)) != null && (v4 = StringsKt.toIntOrNull((String)v4)) != null) {
            v5 = v4.intValue();
        } else lbl-1000:
        // 2 sources

        {
            v5 = 0;
        }
        seconds = v5;
        var5_5 = hours * 3600 + minutes * 60 + seconds;
        var6_6 = ((Number)var5_5).intValue();
        var7_7 = false;
        return var6_6 > 0 ? var5_5 : null;
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            this.resetDeathTracking();
            this.resetEventDelayTracking(true);
            return;
        }
        if (\u0636\u0643.getMc().world == null) {
            this.resetDeathTracking();
            this.resetEventDelayTracking(true);
            return;
        }
        this.updateEventDelayAutomation(clientPlayerEntity);
        if (this.isPlayerAlive(clientPlayerEntity)) {
            lastAlivePos = clientPlayerEntity.getBlockPos();
            deathHandled = false;
            return;
        }
        if (deathHandled) {
            return;
        }
        deathHandled = true;
        if (!((Boolean)deathPoint.getValue()).booleanValue()) {
            return;
        }
        BlockPos blockPos = lastAlivePos;
        if (blockPos == null) {
            blockPos = clientPlayerEntity.getBlockPos();
            Intrinsics.checkNotNullExpressionValue(blockPos, "blockPosition(...)");
        }
        WayPointManager.INSTANCE.put(DEATH_WAYPOINT_NAME, false, blockPos);
    }

    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Integer n = event.get(KeyEvent.Companion.getBUTTON());
        if (n == null) {
            return;
        }
        int button = n;
        if (Intrinsics.areEqual(event.get(KeyEvent.Companion.getMOUSE()), true)) {
            return;
        }
        if (Intrinsics.areEqual(event.get(KeyEvent.Companion.getRELEASE()), true)) {
            return;
        }
        if (\u0636\u0643.getMc().player == null || \u0636\u0643.getMc().world == null || \u0636\u0643.getMc().currentScreen != null) {
            return;
        }
        if (((Number)quickWaypointKey.getValue()).intValue() != -1) {
            if (((Number)quickWaypointKey.getValue()).intValue() == button) {
                WayPointManager.INSTANCE.createQuickWaypoint();
                return;
            }
        }
        if (((Number)removeLastWaypointKey.getValue()).intValue() != -1) {
            if (((Number)removeLastWaypointKey.getValue()).intValue() == button) {
                WayPointManager.INSTANCE.removeLastWaypoint();
            }
        }
    }

    private static final void findCurrentAnarchyNumber$addCandidate(LinkedHashSet<String> candidates, String value) {
        String string;
        block4: {
            block3: {
                String string2;
                if (value == null) break block3;
                String string3 = ((Object)StringsKt.trim((CharSequence)value)).toString();
                if (string3 == null) break block3;
                String p0 = string2 = string3;
                boolean bl = false;
                string = ((CharSequence)p0).length() > 0 ? string2 : null;
                if (string != null) break block4;
            }
            return;
        }
        String normalized = string;
        ((Collection)candidates).add(normalized);
    }

    private final void clearExpiredEventDelayState() {
        long now = System.currentTimeMillis();
        if (awaitingEventDelayResponse && now > awaitingEventDelayResponseUntil) {
            awaitingEventDelayResponse = false;
            awaitingEventDelayResponseUntil = 0L;
        }
        if (pendingEventNameFromDelay != null && now - pendingEventNameFromDelayAt > 6000L) {
            this.clearEventDelayContext();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void handleIncomingMessage(@NotNull Text message) {
        void var5_5;
        Intrinsics.checkNotNullParameter(message, "message");
        String string = message.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String rawMessage = string;
        String string2 = rawMessage;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        String normalizedMessage = string3;
        this.syncEventsApiMessage(rawMessage, normalizedMessage);
        if (!((Boolean)autoEventPoint.getValue()).booleanValue()) {
            return;
        }
        if (this.handleEventDelayMessage(rawMessage, normalizedMessage)) {
            return;
        }
        if (!this.matchesEventMessage(normalizedMessage)) {
            return;
        }
        BlockPos blockPos = this.extractEventCoordinates(rawMessage);
        if (blockPos == null) {
            return;
        }
        BlockPos eventPos = blockPos;
        String string4 = this.extractEventName(rawMessage, normalizedMessage);
        if (string4 == null) {
            string4 = EVENT_WAYPOINT_NAME;
        }
        String eventName = string4;
        this.putEventWaypoint((String)var5_5, (BlockPos)string2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final FunTimeEventsApi.Status liveEventStatus(String message) {
        FunTimeEventsApi.Status status;
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        if (StringsKt.contains$default((CharSequence)message, "\u043d\u0430\u0447\u043d", false, 2, null)) {
                                            if (StringsKt.contains$default((CharSequence)message, "\u0447\u0435\u0440\u0435\u0437", false, 2, null)) {
                                                status = FunTimeEventsApi.Status.ACTIVATING;
                                                return status;
                                            }
                                        }
                                        if (StringsKt.contains$default((CharSequence)message, "\u043e\u0442\u043a\u0440\u043e", false, 2, null)) {
                                            if (StringsKt.contains$default((CharSequence)message, "\u0447\u0435\u0440\u0435\u0437", false, 2, null)) {
                                                status = FunTimeEventsApi.Status.ACTIVATING;
                                                return status;
                                            }
                                        }
                                        if (StringsKt.contains$default((CharSequence)message, "activat", false, 2, null)) break block21;
                                        if (!StringsKt.contains$default((CharSequence)message, "starting", false, 2, null)) break block22;
                                    }
                                    status = FunTimeEventsApi.Status.ACTIVATING;
                                    return status;
                                }
                                if (StringsKt.contains$default((CharSequence)message, "\u043b\u0443\u0442", false, 2, null)) break block23;
                                if (!StringsKt.contains$default((CharSequence)message, "loot", false, 2, null)) break block24;
                            }
                            status = FunTimeEventsApi.Status.LOOTING;
                            return status;
                        }
                        if (StringsKt.contains$default((CharSequence)message, "\u043e\u0436\u0438\u0434\u0430", false, 2, null)) break block25;
                        if (!StringsKt.contains$default((CharSequence)message, "waiting", false, 2, null)) break block26;
                    }
                    status = FunTimeEventsApi.Status.WAITING;
                    return status;
                }
                if (StringsKt.contains$default((CharSequence)message, "\u043e\u0442\u043a\u0440\u044b\u0442", false, 2, null)) break block27;
                if (!StringsKt.contains$default((CharSequence)message, "opened", false, 2, null)) break block28;
            }
            status = FunTimeEventsApi.Status.OPENED;
            return status;
        }
        if (!StringsKt.contains$default((CharSequence)message, "\u0430\u043a\u0442\u0438\u0432", false, 2, null)) {
            if (!StringsKt.contains$default((CharSequence)message, "\u0438\u0434\u0451\u0442", false, 2, null)) {
                if (!StringsKt.contains$default((CharSequence)message, "running", false, 2, null)) {
                    void var1_1;
                    if (!StringsKt.contains$default((CharSequence)var1_1, "\u0437\u0430\u0432\u0435\u0440\u0448", false, 2, null)) {
                        if (!StringsKt.contains$default((CharSequence)var1_1, "\u0437\u0430\u043a\u0440\u043e", false, 2, null)) {
                            return null;
                        }
                    }
                }
            }
        }
        status = FunTimeEventsApi.Status.RUNNING;
        return status;
    }

    /*
     * WARNING - void declaration
     */
    private final void removeEventWaypoints() {
        void $this$filterTo$iv$iv;
        Iterable $this$filter$iv = WayPointManager.INSTANCE.getWayPoints();
        boolean $i$f$filter = false;
        Object object = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            WayPointManager.WayPoint it = (WayPointManager.WayPoint)element$iv$iv;
            boolean bl = false;
            if (!it.getEvent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        object = $this$forEach$iv.iterator();
        while (object.hasNext()) {
            Object element$iv = object.next();
            WayPointManager.WayPoint it = (WayPointManager.WayPoint)element$iv;
            boolean bl = false;
            WayPointManager.INSTANCE.remove(it.getName());
        }
    }

    private final void putEventWaypoint(String eventName, BlockPos eventPos) {
        this.removeEventWaypoints();
        WayPointManager.AddResult addResult = WayPointManager.INSTANCE.add(eventName, true, eventPos);
        if (addResult == WayPointManager.AddResult.ALREADY_EXISTS && !Intrinsics.areEqual(eventName, EVENT_WAYPOINT_NAME)) {
            WayPointManager.INSTANCE.add(EVENT_WAYPOINT_NAME, true, eventPos);
        }
    }

    private final boolean handleEventDelayMessage(String rawMessage, String normalizedMessage) {
        this.clearExpiredEventDelayState();
        if (StringsKt.contains$default((CharSequence)normalizedMessage, "until next event", false, 2, null)) {
            this.removeEventWaypoints();
            this.clearEventDelayContext();
            awaitingEventDelayResponse = false;
            awaitingEventDelayResponseUntil = 0L;
            return true;
        }
        if (this.isEventDelayNameLine(rawMessage)) {
            String string = this.extractEventName(rawMessage, normalizedMessage);
            if (string == null) {
                string = EVENT_WAYPOINT_NAME;
            }
            pendingEventNameFromDelay = string;
            pendingEventNameFromDelayAt = System.currentTimeMillis();
            WayPointModule.touchEventDelayResponseTimeout$default(this, 0L, 1, null);
            return true;
        }
        boolean hasDelayContext = awaitingEventDelayResponse || pendingEventNameFromDelay != null;
        if (!hasDelayContext) {
            return false;
        }
        if (StringsKt.contains$default((CharSequence)normalizedMessage, "[events]", false, 2, null)) {
            WayPointModule.touchEventDelayResponseTimeout$default(this, 0L, 1, null);
            return true;
        }
        if (StringsKt.contains$default((CharSequence)rawMessage, "||", false, 2, null)) {
            if (StringsKt.contains$default((CharSequence)normalizedMessage, "status", false, 2, null)) {
                pendingEventNameFromDelayAt = System.currentTimeMillis();
                WayPointModule.touchEventDelayResponseTimeout$default(this, 0L, 1, null);
                return true;
            }
        }
        if (StringsKt.contains$default((CharSequence)rawMessage, "||", false, 2, null)) {
            if (StringsKt.contains$default((CharSequence)normalizedMessage, "coordinates", false, 2, null)) {
                BlockPos blockPos = this.extractEventCoordinates(rawMessage);
                if (blockPos == null) {
                    return false;
                }
                BlockPos blockPos2 = blockPos;
                String string = pendingEventNameFromDelay;
                if (string == null) {
                    string = EVENT_WAYPOINT_NAME;
                }
                String string2 = string;
                this.putEventWaypoint(string2, blockPos2);
                this.clearEventDelayContext();
                awaitingEventDelayResponse = false;
                awaitingEventDelayResponseUntil = 0L;
                return true;
            }
        }
        return false;
    }

    private final boolean isEventDelayNameLine(String rawMessage) {
        return eventDelayNameRegex.matches(((Object)StringsKt.trim((CharSequence)rawMessage)).toString());
    }

    private final void clearScheduledEventDelayRequest() {
        scheduledEventDelayRequestTick = -1;
        scheduledEventDelayRequestContextKey = null;
    }

    @Override
    public boolean canToggle() {
        return false;
    }

    private final void clearEventDelayContext() {
        pendingEventNameFromDelay = null;
        pendingEventNameFromDelayAt = 0L;
    }

    @Override
    public void setEnabled(boolean value) {
        if (super.isEnabled()) {
            return;
        }
        super.setEnabled(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean matchesEventMessage(String raw) {
        if (StringsKt.contains$default((CharSequence)raw, "coordinates", false, 2, null)) {
            CharSequence charSequence = raw;
            String string = BOXED_EVENT_HEADER;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String string2 = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
            if (StringsKt.contains$default(charSequence, string2, false, 2, null)) return true;
        }
        if (!StringsKt.contains$default((CharSequence)raw, "|||", false, 2, null)) return false;
        if (!StringsKt.contains$default((CharSequence)raw, "coordinates", false, 2, null)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isPlayerAlive(ClientPlayerEntity player) {
        if (!player.isAlive()) return false;
        if (!(player.getHealth() > 0.0f)) return false;
        if (player.deathTime > 0) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final Integer findCurrentAnarchyNumber() {
        void $this$getObjectiveForSlot$iv;
        ClientWorld scoreboard;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
            return null;
        }
        ClientWorld clientWorld2 = scoreboard = clientWorld;
        ScoreboardDisplaySlot slot$iv = ScoreboardDisplaySlot.SIDEBAR;
        boolean $i$f$getObjectiveForSlot = false;
        ScoreboardObjective scoreboardObjective = $this$getObjectiveForSlot$iv.getObjectiveForSlot(slot$iv);
        if (scoreboardObjective == null) {
            return null;
        }
        ScoreboardObjective objective = scoreboardObjective;
        LinkedHashSet<String> candidates = new LinkedHashSet<String>();
        WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, objective.getDisplayName().getString());
        ClientWorld $this$getScoreboardEntries$iv = scoreboard;
        ScoreboardObjective objective$iv = objective;
        boolean $i$f$getScoreboardEntries = false;
        Collection collection = $this$getScoreboardEntries$iv.getScoreboardEntries(objective$iv);
        Intrinsics.checkNotNullExpressionValue(collection, "listPlayerScores(...)");
        Iterable $this$forEach$iv = collection;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var15_18;
            Team $this$decorateName$iv;
            Team team;
            void var11_13;
            void var10_12;
            ScoreboardEntry entry = (ScoreboardEntry)element$iv;
            boolean bl = false;
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, entry.owner());
            ScoreboardEntry $this$name$iv = entry;
            boolean $i$f$name = false;
            Text text = var10_12.name();
            Intrinsics.checkNotNullExpressionValue(text, "ownerName(...)");
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, text.getString());
            Text text2 = entry.display();
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, text2 != null ? text2.getString() : null);
            ClientWorld $this$getScoreHolderTeam$iv = scoreboard;
            Intrinsics.checkNotNullExpressionValue(entry.owner(), "owner(...)");
            boolean $i$f$getScoreHolderTeam = false;
            if (var11_13.getScoreHolderTeam((String)team) == null) continue;
            boolean bl2 = false;
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, \u0637\u062b.getPrefix(team).getString());
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, \u0637\u062b.getSuffix(team).getString());
            Team team2 = team;
            MutableText mutableText = Text.literal((String)entry.owner());
            Intrinsics.checkNotNullExpressionValue(mutableText, "literal(...)");
            Text name$iv = (Text)mutableText;
            boolean $i$f$decorateName = false;
            MutableText mutableText2 = $this$decorateName$iv.decorateName(name$iv);
            Intrinsics.checkNotNullExpressionValue(mutableText2, "getFormattedName(...)");
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, ((Text)mutableText2).getString());
            $this$decorateName$iv = team;
            name$iv = entry;
            $i$f$decorateName = false;
            Text text3 = name$iv.name();
            Intrinsics.checkNotNullExpressionValue(text3, "ownerName(...)");
            name$iv = text3;
            boolean bl3 = false;
            MutableText mutableText3 = team2.decorateName((Text)var15_18);
            Intrinsics.checkNotNullExpressionValue(mutableText3, "getFormattedName(...)");
            WayPointModule.findCurrentAnarchyNumber$addCandidate(candidates, ((Text)mutableText3).getString());
        }
        return (Integer)SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence((Iterable)candidates), new \u062f\u0644(this)));
    }

    private final String buildFunTimeSessionKey(Object world) {
        Object object = \u0636\u0643.getMc().getCurrentServerEntry();
        String string = object != null && (object = object.address) != null ? ((Object)StringsKt.trim((CharSequence)object)).toString() : null;
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        String serverAddress = string2;
        return serverAddress + "#" + System.identityHashCode(world);
    }

    private final void scheduleEventDelayRequest(int targetTick, String contextKey) {
        scheduledEventDelayRequestTick = targetTick;
        scheduledEventDelayRequestContextKey = contextKey;
    }

    /*
     * WARNING - void declaration
     */
    private final void updateEventDelayAutomation(ClientPlayerEntity player) {
        Integer currentAnarchyNumber;
        block11: {
            block10: {
                if (!((Boolean)autoEventPoint.getValue()).booleanValue()) break block10;
                if (\u0636\u0647.INSTANCE.isFunTime()) break block11;
            }
            this.resetEventDelayTracking(true);
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        String sessionKey = this.buildFunTimeSessionKey(world);
        if (!Intrinsics.areEqual(sessionKey, lastFunTimeSessionKey)) {
            lastFunTimeSessionKey = sessionKey;
            lastKnownAnarchyNumber = null;
            this.clearForServerContextSwitch();
            this.scheduleEventDelayRequest(player.age + 40, this.buildEventDelayRequestContextKey(sessionKey, null));
        }
        if ((currentAnarchyNumber = this.findCurrentAnarchyNumber()) != null) {
            Integer n = lastKnownAnarchyNumber;
            if (n == null || currentAnarchyNumber.intValue() != n.intValue()) {
                lastKnownAnarchyNumber = currentAnarchyNumber;
                this.clearForServerContextSwitch();
                String contextKey = this.buildEventDelayRequestContextKey(sessionKey, currentAnarchyNumber);
                if (!this.trySendEventDelayRequest(contextKey)) {
                    void scheduledTick;
                    this.scheduleEventDelayRequest(player.age + 2, (String)scheduledTick);
                }
                return;
            }
        }
        int scheduledTick = scheduledEventDelayRequestTick;
        String scheduledContextKey = scheduledEventDelayRequestContextKey;
        if (scheduledTick < 0 || scheduledContextKey == null || player.age < scheduledTick) {
            return;
        }
        if (!this.trySendEventDelayRequest(scheduledContextKey) && \u0636\u0643.getMc().currentScreen != null) {
            return;
        }
        this.clearScheduledEventDelayRequest();
    }

    public final float waypointAlphaByDistance(double distance) {
        if (!((Boolean)fadeWaypointOnCloseDistance.getValue()).booleanValue()) {
            return 1.0f;
        }
        double hideDistance = ((Number)fadeWaypointHideDistance.getValue()).floatValue();
        double fadeStartDistance = hideDistance + 4.0;
        if (distance <= hideDistance) {
            return 0.0f;
        }
        if (distance >= fadeStartDistance) {
            return 1.0f;
        }
        double range = fadeStartDistance - hideDistance;
        if (range <= 0.0) {
            return 1.0f;
        }
        return RangesKt.coerceIn((float)((distance - hideDistance) / range), 0.0f, 1.0f);
    }

    private WayPointModule() {
        super("WayPoint", \u0638\u0646.getRENDER(), "Waypoint Settings");
    }

    public final void applyLegacyBindIfNeeded(int key) {
        block3: {
            block2: {
                if (key == -1) break block2;
                if (((Number)quickWaypointKey.getValue()).intValue() == -1) break block3;
            }
            return;
        }
        quickWaypointKey.setKey(key);
    }

    @NotNull
    public final BooleanSetting getShowWaypoints() {
        return showWaypoints;
    }

    static /* synthetic */ void touchEventDelayResponseTimeout$default(WayPointModule wayPointModule, long l, int n, Object object) {
        if ((n & 1) != 0) {
            l = System.currentTimeMillis();
        }
        wayPointModule.touchEventDelayResponseTimeout(l);
    }

    private final boolean trySendEventDelayRequest(String contextKey) {
        if (\u0636\u0643.getMc().currentScreen != null) {
            return false;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            return false;
        }
        ClientPlayNetworkHandler networkHandler = clientPlayNetworkHandler;
        long now = System.currentTimeMillis();
        boolean sameContext = Intrinsics.areEqual(contextKey, lastAutoEventDelayRequestContextKey);
        if (sameContext && now - lastAutoEventDelayRequestAt < 15000L) {
            return true;
        }
        lastAutoEventDelayRequestAt = now;
        lastAutoEventDelayRequestContextKey = contextKey;
        this.touchEventDelayResponseTimeout(now);
        this.clearEventDelayContext();
        networkHandler.sendChatCommand(EVENT_DELAY_COMMAND);
        return true;
    }

    private final void touchEventDelayResponseTimeout(long now) {
        awaitingEventDelayResponse = true;
        awaitingEventDelayResponseUntil = now + 6000L;
    }

    @Override
    public boolean canBind() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Integer extractAnarchyNumber(String raw) {
        MatchResult matchResult = Regex.find$default(anarchyRegex, raw, 0, 2, null);
        if (matchResult == null) return null;
        List<String> list = matchResult.getGroupValues();
        if (list == null) return null;
        String string = CollectionsKt.getOrNull(list, 1);
        if (string == null) return null;
        Integer n = StringsKt.toIntOrNull(string);
        return n;
    }

    private static final boolean fadeWaypointHideDistance$lambda$0() {
        return (Boolean)fadeWaypointOnCloseDistance.getValue();
    }

    static {
        INSTANCE = new WayPointModule();
        eventCoordinatesRegex = new Regex("\\[?(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)\\]?");
        eventNameLineRegex = new Regex("\\|{3}\\s*\\[([^\\[\\]\\r\\n]+)]\\s*\\|{3}");
        eventDelayNameRegex = new Regex("^\\s*\\[(\\d+)]\\s+([^:\\r\\n]+):\\s*$");
        anarchyRegex = new Regex("(?:anarchy|\u0430\u043d\u0430\u0440\u0445\u0438\u044f)\\s*[-#:]?\\s*(\\d{2,4})", RegexOption.IGNORE_CASE);
        eventCountdownHoursRegex = new Regex("(\\d+)\\s*(?:\u0447(?:\u0430\u0441(?:\u0430|\u043e\u0432)?)?|h(?:ours?)?)", RegexOption.IGNORE_CASE);
        eventCountdownMinutesRegex = new Regex("(\\d+)\\s*(?:\u043c\u0438\u043d(?:\u0443\u0442(?:\u0430|\u044b)?)?|m(?:in(?:ute)?s?)?)", RegexOption.IGNORE_CASE);
        eventCountdownSecondsRegex = new Regex("(\\d+)\\s*(?:\u0441\u0435\u043a(?:\u0443\u043d\u0434(?:\u0430|\u044b)?)?|s(?:ec(?:ond)?s?)?)", RegexOption.IGNORE_CASE);
        Pair[] pairArray = new Pair[6];
        pairArray[0] = TuplesKt.to("meteor shower", "Meteor Shower");
        pairArray[1] = TuplesKt.to("death chest", "Death Chest");
        pairArray[2] = TuplesKt.to("meteorite", "Meteorite");
        pairArray[3] = TuplesKt.to("volcano", "Volcano");
        pairArray[4] = TuplesKt.to("beacon", "Beacon");
        pairArray[5] = TuplesKt.to("mystic", "Mystic");
        knownEventNames = CollectionsKt.listOf(pairArray);
        showWaypoints = Module.boolean$default(INSTANCE, "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u043c\u0435\u0442\u043a\u0438", true, null, 4, null);
        autoEventPoint = Module.boolean$default(INSTANCE, "\u0410\u0432\u0442\u043e-\u043c\u0435\u0442\u043a\u0438 \u043d\u0430 \u0438\u0432\u0435\u043d\u0442\u044b FunTime", true, null, 4, null);
        deathPoint = Module.boolean$default(INSTANCE, "\u0410\u0432\u0442\u043e-\u043c\u0435\u0442\u043a\u0430 \u043d\u0430 \u043c\u0435\u0441\u0442\u0435 \u0432\u0430\u0448\u0435\u0439 \u0441\u043c\u0435\u0440\u0442\u0438", false, null, 4, null);
        quickWaypointKey = Module.bind$default(INSTANCE, "\u0421\u043e\u0437\u0434\u0430\u0442\u044c \u043c\u0435\u0442\u043a\u0443 \u043d\u0430 \u043c\u0435\u0441\u0442\u0435", -1, null, 4, null);
        removeLastWaypointKey = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430 \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f \u043c\u0435\u0442\u043a\u0438", -1, null, 4, null);
        fadeWaypointOnCloseDistance = Module.boolean$default(INSTANCE, "\u0417\u0430\u0442\u0443\u0445\u0430\u043d\u0438\u0435 \u043c\u0435\u0442\u043a\u0438 \u043f\u0440\u0438 \u043f\u0440\u0438\u0431\u043b\u0438\u0436\u0435\u043d\u0438\u0438 \u043a \u043d\u0435\u0439", true, null, 4, null);
        fadeWaypointHideDistance = Module.slider$default(INSTANCE, "\u0417\u0430\u0442\u0443\u0445\u0430\u043d\u0438\u0435 \u0432 \u0440\u0430\u0434\u0438\u0443\u0441\u0430\u0445 \u0431\u043b\u043e\u043a\u043e\u0432", 3.0f, 0.0f, 10.0f, 1.0f, null, 32, null).setVisible(WayPointModule::fadeWaypointHideDistance$lambda$0);
        scheduledEventDelayRequestTick = -1;
        INSTANCE.setVisibleInGui(WayPointModule::_init_$lambda$0);
        super.setEnabled(true);
    }
}

