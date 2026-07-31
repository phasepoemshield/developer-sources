/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.other.ServerUtil;
import kotakbaz.rain.client.waypoint.A;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.client.waypoint.a_0;
import kotakbaz.rain.client.waypoint.d;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.B;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b&\u0010'J!\u0010*\u001a\u0004\u0018\u00010!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020!H\u0002\u00a2\u0006\u0004\b1\u0010$J\u0011\u00102\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\r2\u0006\u00100\u001a\u00020!H\u0002\u00a2\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b:\u0010\u0003J\u001f\u0010;\u001a\u00020\u00042\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020%H\u0002\u00a2\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bA\u0010\u0003J\u0017\u0010B\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bD\u0010\u0003J\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bF\u0010\u000bJ\u000f\u0010G\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bH\u0010\u0003J\u0019\u0010K\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010(\u001a\u00020!H\u0002\u00a2\u0006\u0004\bM\u0010$J\u0017\u0010P\u001a\u00020!2\u0006\u0010O\u001a\u00020NH\u0002\u00a2\u0006\u0004\bP\u0010QJ!\u0010T\u001a\u00020!2\u0006\u0010R\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Y\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010WR\u0014\u0010Z\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010WR\u0014\u0010[\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020I8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020I8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010^R\u0014\u0010`\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010h\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010i\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bi\u0010fR&\u0010l\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0k0j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0017\u0010o\u001a\u00020n8\u0006\u00a2\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010s\u001a\u00020n8\u0006\u00a2\u0006\f\n\u0004\bs\u0010p\u001a\u0004\bt\u0010rR\u0017\u0010u\u001a\u00020n8\u0006\u00a2\u0006\f\n\u0004\bu\u0010p\u001a\u0004\bv\u0010rR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010{\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010pR\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010WR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0086\u0001\u0010\\R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0087\u0001\u0010WR\u0018\u0010\u0088\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0088\u0001\u0010^R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0089\u0001\u0010WR\u0019\u0010\u008a\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0080\u0001R\u0018\u0010\u008b\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008b\u0001\u0010^R\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008c\u0001\u0010WR\u0018\u0010\u008d\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008d\u0001\u0010^\u00a8\u0006\u008e\u0001"}, d2={"Lkotakbaz/rain/module/modules/render/WayPointModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "canToggle", "()Z", "canBind", "value", "", "setEnabled", "(Z)V", "toggle", "", "key", "applyLegacyBindIfNeeded", "(I)V", "", "distance", "", "waypointAlphaByDistance", "(D)F", "Lkotakbaz/rain/event/events/KeyEvent;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_2561;", "message", "handleIncomingMessage", "(Lnet/minecraft/class_2561;)V", "", "raw", "matchesEventMessage", "(Ljava/lang/String;)Z", "Lnet/minecraft/class_2338;", "extractEventCoordinates", "(Ljava/lang/String;)Lnet/minecraft/class_2338;", "rawMessage", "normalizedMessage", "extractEventName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lnet/minecraft/class_746;", "player", "updateEventDelayAutomation", "(Lnet/minecraft/class_746;)V", "contextKey", "trySendEventDelayRequest", "findCurrentAnarchyNumber", "()Ljava/lang/Integer;", "extractAnarchyNumber", "(Ljava/lang/String;)Ljava/lang/Integer;", "targetTick", "scheduleEventDelayRequest", "(ILjava/lang/String;)V", "clearScheduledEventDelayRequest", "clearForServerContextSwitch", "handleEventDelayMessage", "(Ljava/lang/String;Ljava/lang/String;)Z", "eventName", "eventPos", "putEventWaypoint", "(Ljava/lang/String;Lnet/minecraft/class_2338;)V", "removeEventWaypoints", "isPlayerAlive", "(Lnet/minecraft/class_746;)Z", "resetDeathTracking", "clearSession", "resetEventDelayTracking", "clearEventDelayContext", "clearExpiredEventDelayState", "", "now", "touchEventDelayResponseTimeout", "(J)V", "isEventDelayNameLine", "", "world", "buildFunTimeSessionKey", "(Ljava/lang/Object;)Ljava/lang/String;", "sessionKey", "anarchyNumber", "buildEventDelayRequestContextKey", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "EVENT_WAYPOINT_NAME", "Ljava/lang/String;", "DEATH_WAYPOINT_NAME", "BOXED_EVENT_HEADER", "EVENT_DELAY_COMMAND", "AUTO_EVENT_DELAY_REQUEST_TICKS", "I", "EVENT_DELAY_CONTEXT_TIMEOUT_MS", "J", "AUTO_EVENT_DELAY_REQUEST_COOLDOWN_MS", "DEFAULT_WAYPOINT_HIDE_DISTANCE", "F", "WAYPOINT_FADE_DISTANCE", "D", "Lkotlin/text/Regex;", "eventCoordinatesRegex", "Lkotlin/text/Regex;", "eventNameLineRegex", "eventDelayNameRegex", "anarchyRegex", "", "Lkotlin/Pair;", "knownEventNames", "Ljava/util/List;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "showWaypoints", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "getShowWaypoints", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "autoEventPoint", "getAutoEventPoint", "deathPoint", "getDeathPoint", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "quickWaypointKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "removeLastWaypointKey", "fadeWaypointOnCloseDistance", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "fadeWaypointHideDistance", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "deathHandled", "Z", "lastAlivePos", "Lnet/minecraft/class_2338;", "lastFunTimeSessionKey", "lastKnownAnarchyNumber", "Ljava/lang/Integer;", "scheduledEventDelayRequestTick", "scheduledEventDelayRequestContextKey", "lastAutoEventDelayRequestAt", "lastAutoEventDelayRequestContextKey", "awaitingEventDelayResponse", "awaitingEventDelayResponseUntil", "pendingEventNameFromDelay", "pendingEventNameFromDelayAt", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nWayPointModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WayPointModule.kt\nkotakbaz/rain/module/modules/render/WayPointModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,431:1\n1#2:432\n296#3,2:433\n1915#3,2:435\n777#3:437\n873#3,2:438\n1915#3,2:440\n*S KotlinDebug\n*F\n+ 1 WayPointModule.kt\nkotakbaz/rain/module/modules/render/WayPointModule\n*L\n199#1:433,2\n267#1:435,2\n366#1:437\n366#1:438,2\n367#1:440,2\n*E\n"})
public final class WayPointModule
extends Module {
    @NotNull
    public static final WayPointModule INSTANCE;
    @NotNull
    private static final String a = "Event";
    @NotNull
    private static final String A = "\u0422\u043e\u0447\u043a\u0430 \u0421\u043c\u0435\u0440\u0442\u0438";
    @NotNull
    private static final String b = "\u2554\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2566\u2550\u2550\u2557";
    @NotNull
    private static final String B = "event delay";
    private static final int c = 40;
    private static final long C = 6000L;
    private static final long d = 15000L;
    private static final float D = 3.0f;
    private static final double e = 4.0;
    @NotNull
    private static final Regex E;
    @NotNull
    private static final Regex f;
    @NotNull
    private static final Regex F;
    @NotNull
    private static final Regex g;
    @NotNull
    private static final List<Pair<String, String>> G;
    @NotNull
    private static final BooleanSetting h;
    @NotNull
    private static final BooleanSetting H;
    @NotNull
    private static final BooleanSetting i;
    @NotNull
    private static final BindSetting I;
    @NotNull
    private static final BindSetting j;
    @NotNull
    private static final BooleanSetting J;
    @NotNull
    private static final SliderSetting k;
    private static boolean K;
    @Nullable
    private static BlockPos l;
    @Nullable
    private static String L;
    @Nullable
    private static Integer m;
    private static int M;
    @Nullable
    private static String n;
    private static long N;
    @Nullable
    private static String o;
    private static boolean O;
    private static long p;
    @Nullable
    private static String P;
    private static long q;
    private static Object[] Q;
    private static Object R;
    private static Object[] s;
    private static Object[] r;
    private static Object[] S;
    public static int[] t;

    private WayPointModule() {
        int n2 = t[0];
        n2 ^= t[1];
        int n3 = t[3];
        n3 -= t[4];
        super((String)Q[n2 += t[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)Q[n3 -= t[5]]);
    }

    @NotNull
    public final BooleanSetting getShowWaypoints() {
        return h;
    }

    @NotNull
    public final BooleanSetting getAutoEventPoint() {
        return H;
    }

    @NotNull
    public final BooleanSetting getDeathPoint() {
        return i;
    }

    @Override
    public boolean canToggle() {
        boolean bl = t[6];
        bl -= t[7];
        return bl ^= t[8];
    }

    @Override
    public boolean canBind() {
        boolean bl = t[9];
        bl -= t[10];
        return bl += t[11];
    }

    @Override
    public void setEnabled(boolean value2) {
        if (super.isEnabled()) {
            return;
        }
        boolean bl = t[12];
        bl ^= t[13];
        super.setEnabled(bl ^= t[14]);
    }

    @Override
    public void toggle() {
    }

    public final void applyLegacyBindIfNeeded(int key) {
        block3: {
            block2: {
                int n2 = t[15];
                n2 -= t[16];
                if (key == (n2 -= t[17])) break block2;
                int n3 = t[18];
                n3 += t[19];
                if (((Number)I.getValue()).intValue() == (n3 ^= t[20])) break block3;
            }
            return;
        }
        I.setKey(key);
    }

    public final float waypointAlphaByDistance(double distance) {
        if (!((Boolean)J.getValue()).booleanValue()) {
            return 1.0f;
        }
        double d2 = ((Number)k.getValue()).floatValue();
        double d3 = d2 + Double.longBitsToDouble(0x14E2D6C8E820F1A2L ^ 0x54F2D6C8E820F1A2L);
        if (distance <= d2) {
            return 0.0f;
        }
        if (distance >= d3) {
            return 1.0f;
        }
        double d4 = d3 - d2;
        if (d4 <= 0.0) {
            return 1.0f;
        }
        return RangesKt.coerceIn((float)((distance - d2) / d4), 0.0f, 1.0f);
    }

    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        long l2 = -1379404930407587643L;
        long l3 = 8407337933617168632L;
        int n2 = t[21];
        n2 -= t[22];
        Intrinsics.checkNotNullParameter(event, (String)Q[n2 += t[23]]);
        Integer n3 = event.get(KeyEvent.a.getBUTTON());
        if (n3 == null) {
            return;
        }
        int n4 = t[24];
        n4 -= t[25];
        long l4 = l3;
        int n5 = t[27];
        n5 += t[28];
        l3 = l4 ^ ((long)n3.intValue() << (n4 -= t[26]) ^ l4) & -1L << (n5 += t[29]);
        boolean bl = t[30];
        bl ^= t[31];
        if (Intrinsics.areEqual(event.get(KeyEvent.a.getMOUSE()), bl -= t[32])) {
            return;
        }
        boolean bl2 = t[33];
        bl2 -= t[34];
        if (Intrinsics.areEqual(event.get(KeyEvent.a.getRELEASE()), bl2 -= t[35])) {
            return;
        }
        if (kotakbaz.rain.client.extensions.b.getMc().player == null || kotakbaz.rain.client.extensions.b.getMc().world == null || kotakbaz.rain.client.extensions.b.getMc().currentScreen != null) {
            return;
        }
        int n6 = t[36];
        n6 -= t[37];
        if (((Number)I.getValue()).intValue() != (n6 ^= t[38])) {
            int n7 = t[39];
            n7 ^= t[40];
            if (((Number)I.getValue()).intValue() == (int)(l3 >>> (n7 += t[41]))) {
                WayPointManager.INSTANCE.createQuickWaypoint();
                return;
            }
        }
        int n8 = t[42];
        n8 ^= t[43];
        if (((Number)j.getValue()).intValue() != (n8 -= t[44])) {
            int n9 = t[45];
            n9 -= t[46];
            if (((Number)j.getValue()).intValue() == (int)(l3 >>> (n9 ^= t[47]))) {
                WayPointManager.INSTANCE.removeLastWaypoint();
            }
        }
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 4638761728926967495L;
        int n2 = t[48];
        n2 -= t[49];
        Intrinsics.checkNotNullParameter(event, (String)Q[n2 -= t[50]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            WayPointModule wayPointModule = this;
            long l3 = l2;
            int n3 = t[51];
            n3 -= t[52];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= t[53]);
            wayPointModule.resetDeathTracking();
            boolean bl = t[54];
            bl -= t[55];
            wayPointModule.resetEventDelayTracking(bl -= t[56]);
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null) {
            this.resetDeathTracking();
            boolean bl = t[57];
            bl += t[58];
            this.resetEventDelayTracking(bl -= t[59]);
            return;
        }
        this.updateEventDelayAutomation(clientPlayerEntity2);
        if (this.isPlayerAlive(clientPlayerEntity2)) {
            l = clientPlayerEntity2.getBlockPos();
            int n4 = t[60];
            n4 ^= t[61];
            K = n4 ^= t[62];
            return;
        }
        if (K) {
            return;
        }
        int n5 = t[63];
        n5 -= t[64];
        K = n5 += t[65];
        if (!((Boolean)i.getValue()).booleanValue()) {
            return;
        }
        BlockPos blockPos = l;
        if (blockPos == null) {
            blockPos = clientPlayerEntity2.getBlockPos();
        }
        BlockPos blockPos2 = blockPos;
        int n6 = t[66];
        n6 -= t[67];
        String string = (String)Q[n6 += t[68]];
        boolean bl = t[69];
        bl -= t[70];
        Intrinsics.checkNotNull(blockPos2);
        WayPointManager.INSTANCE.put(string, bl -= t[71], blockPos2);
    }

    public final void handleIncomingMessage(@NotNull Text message) {
        int n2 = t[72];
        n2 ^= t[73];
        Intrinsics.checkNotNullParameter(message, (String)Q[n2 -= t[74]]);
        if (!((Boolean)H.getValue()).booleanValue()) {
            return;
        }
        String string = message.getString();
        Intrinsics.checkNotNull(string);
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n3 = t[75];
        n3 ^= t[76];
        Intrinsics.checkNotNullExpressionValue(locale, (String)Q[n3 += t[77]]);
        String string3 = string2.toLowerCase(locale);
        int n4 = t[78];
        n4 += t[79];
        int n5 = t[81];
        n5 ^= t[82];
        Intrinsics.checkNotNullExpressionValue(string3, (String)Q[n4 += t[80]] + (String)Q[n5 ^= t[83]]);
        String string4 = string3;
        if (this.handleEventDelayMessage(string, string4)) {
            return;
        }
        if (!this.matchesEventMessage(string4)) {
            return;
        }
        BlockPos blockPos = this.extractEventCoordinates(string);
        if (blockPos == null) {
            return;
        }
        string2 = blockPos;
        String string5 = this.extractEventName(string, string4);
        if (string5 == null) {
            int n6 = t[84];
            n6 ^= t[85];
            string5 = (String)Q[n6 -= t[86]];
        }
        String string6 = string5;
        this.putEventWaypoint(string6, (BlockPos)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean matchesEventMessage(String raw) {
        int n2;
        block4: {
            block3: {
                block2: {
                    int n3 = t[87];
                    n3 += t[88];
                    n3 += t[89];
                    boolean bl = t[90];
                    bl += t[91];
                    int n4 = t[93];
                    n4 -= t[94];
                    if (!StringsKt.contains$default((CharSequence)raw, (String)Q[n3], bl ^= t[92], n4 += t[95], null)) break block2;
                    CharSequence charSequence = raw;
                    int n5 = t[96];
                    n5 -= t[97];
                    int n6 = t[99];
                    n6 -= t[100];
                    String string = (String)Q[n5 += t[98]] + (String)Q[n6 += t[101]];
                    Locale locale = Locale.ROOT;
                    int n7 = t[102];
                    n7 -= t[103];
                    Intrinsics.checkNotNullExpressionValue(locale, (String)Q[n7 ^= t[104]]);
                    String string2 = string.toLowerCase(locale);
                    int n8 = t[105];
                    n8 += t[106];
                    int n9 = t[108];
                    n9 -= t[109];
                    Intrinsics.checkNotNullExpressionValue(string2, (String)Q[n8 ^= t[107]] + (String)Q[n9 -= t[110]]);
                    boolean bl2 = t[111];
                    bl2 -= t[112];
                    int n10 = t[114];
                    n10 -= t[115];
                    if (StringsKt.contains$default(charSequence, string2, bl2 += t[113], n10 ^= t[116], null)) break block3;
                }
                int n11 = t[117];
                n11 -= t[118];
                n11 -= t[119];
                boolean bl = t[120];
                bl -= t[121];
                int n12 = t[123];
                n12 += t[124];
                if (!StringsKt.contains$default((CharSequence)raw, (String)Q[n11], bl += t[122], n12 -= t[125], null)) break block4;
                int n13 = t[126];
                n13 ^= t[127];
                n13 -= t[128];
                boolean bl3 = t[129];
                bl3 ^= t[130];
                int n14 = t[132];
                n14 -= t[133];
                if (!StringsKt.contains$default((CharSequence)raw, (String)Q[n13], bl3 ^= t[131], n14 -= t[134], null)) break block4;
            }
            int n15 = t[135];
            n15 ^= t[136];
            n2 = n15 ^= t[137];
            return n2 != 0;
        }
        int n16 = t[138];
        n16 -= t[139];
        n2 = n16 -= t[140];
        return n2 != 0;
    }

    private final BlockPos extractEventCoordinates(String raw) {
        long l2 = 4955947915243474441L;
        long l3 = -2788483537192902551L;
        long l4 = 4010564649376252826L;
        int n2 = t[141];
        n2 ^= t[142];
        int n3 = t[144];
        n3 ^= t[145];
        MatchResult matchResult = Regex.find$default(E, raw, n2 += t[143], n3 ^= t[146], null);
        if (matchResult == null) {
            return null;
        }
        MatchResult matchResult2 = matchResult;
        int n4 = t[147];
        n4 += t[148];
        Integer n5 = StringsKt.toIntOrNull(matchResult2.getGroupValues().get(n4 += t[149]));
        if (n5 == null) {
            return null;
        }
        long l5 = l3;
        int n6 = t[150];
        n6 ^= t[151];
        l3 = l5 ^ ((long)n5.intValue() ^ l5) & -1L >>> (n6 -= t[152]);
        int n7 = t[153];
        n7 += t[154];
        Integer n8 = StringsKt.toIntOrNull(matchResult2.getGroupValues().get(n7 += t[155]));
        if (n8 == null) {
            return null;
        }
        int n9 = t[156];
        n9 += t[157];
        long l6 = l4;
        int n10 = t[159];
        n10 -= t[160];
        l4 = l6 ^ ((long)n8.intValue() << (n9 -= t[158]) ^ l6) & -1L << (n10 ^= t[161]);
        int n11 = t[162];
        n11 += t[163];
        Integer n12 = StringsKt.toIntOrNull(matchResult2.getGroupValues().get(n11 ^= t[164]));
        if (n12 == null) {
            return null;
        }
        long l7 = l4;
        int n13 = t[165];
        n13 ^= t[166];
        l4 = l7 ^ ((long)n12.intValue() ^ l7) & -1L >>> (n13 -= t[167]);
        int n14 = t[168];
        n14 -= t[169];
        return new BlockPos((int)l3, (int)(l4 >>> (n14 += t[170])), (int)l4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final String extractEventName(String rawMessage, String normalizedMessage) {
        block11: {
            var13_3 = -5643165817167369718L;
            var15_4 = -5203997187874572405L;
            var18_5 = WayPointModule.t[171];
            var18_5 ^= WayPointModule.t[172];
            var20_6 = WayPointModule.t[174];
            var20_6 += WayPointModule.t[175];
            var4_7 = Regex.find$default(WayPointModule.f, rawMessage, var18_5 ^= WayPointModule.t[173], var20_6 ^= WayPointModule.t[176], null);
            if (var4_7 == null || (var5_8 = var4_7.getGroupValues()) == null) ** GOTO lbl-1000
            var22_9 = WayPointModule.t[177];
            var22_9 -= WayPointModule.t[178];
            var6_10 = CollectionsKt.getOrNull(var5_8, var22_9 ^= WayPointModule.t[179]);
            if (var6_10 == null) ** GOTO lbl-1000
            var7_11 = StringsKt.trim((CharSequence)var6_10).toString();
            if (var7_11 != null) {
                var8_12 = var7_11;
                var9_13 /* !! */  = var8_12;
                v0 = var13_3;
                var24_14 = WayPointModule.t[180];
                var24_14 -= WayPointModule.t[181];
                var13_3 = v0 ^ (0L ^ v0) & -1L << (var24_14 += WayPointModule.t[182]);
                if (((CharSequence)var9_13 /* !! */ ).length() > 0) {
                    var26_15 = WayPointModule.t[183];
                    var26_15 += WayPointModule.t[184];
                    v1 = var26_15 -= WayPointModule.t[185];
                } else {
                    var28_16 = WayPointModule.t[186];
                    var28_16 ^= WayPointModule.t[187];
                    v1 = var28_16 ^= WayPointModule.t[188];
                }
                v2 = v1 != 0 ? var8_12 : null;
            } else lbl-1000:
            // 3 sources

            {
                v2 = var3_17 = null;
            }
            if (var3_17 != null) {
                return var3_17;
            }
            var5_8 = WayPointModule.F.matchEntire(StringsKt.trim((CharSequence)rawMessage).toString());
            if (var5_8 == null || (var6_10 = var5_8.getGroupValues()) == null) ** GOTO lbl-1000
            var30_18 = WayPointModule.t[189];
            var30_18 += WayPointModule.t[190];
            var7_11 = CollectionsKt.getOrNull(var6_10, var30_18 += WayPointModule.t[191]);
            if (var7_11 == null) ** GOTO lbl-1000
            var8_12 = StringsKt.trim((CharSequence)var7_11).toString();
            if (var8_12 != null) {
                var9_13 /* !! */  = var8_12;
                var10_19 = var9_13 /* !! */ ;
                v3 = var15_4;
                var32_20 = WayPointModule.t[192];
                var32_20 -= WayPointModule.t[193];
                var15_4 = v3 ^ (0L ^ v3) & -1L >>> (var32_20 += WayPointModule.t[194]);
                if (((CharSequence)var10_19).length() > 0) {
                    var34_21 = WayPointModule.t[195];
                    var34_21 -= WayPointModule.t[196];
                    v4 = var34_21 ^= WayPointModule.t[197];
                } else {
                    var36_22 = WayPointModule.t[198];
                    var36_22 -= WayPointModule.t[199];
                    v4 = var36_22 += WayPointModule.t[200];
                }
                v5 = v4 != 0 ? var9_13 /* !! */  : null;
            } else lbl-1000:
            // 3 sources

            {
                v5 = var4_7 = null;
            }
            if (var4_7 != null) {
                return var4_7;
            }
            var6_10 = WayPointModule.G;
            v6 = var15_4;
            var38_23 = WayPointModule.t[201];
            var38_23 ^= WayPointModule.t[202];
            var15_4 = v6 ^ (0L ^ v6) & -1L << (var38_23 -= WayPointModule.t[203]);
            var8_12 = var6_10.iterator();
            while (var8_12.hasNext()) {
                var9_13 /* !! */  = var8_12.next();
                var10_19 = (Pair)var9_13 /* !! */ ;
                v7 = var15_4;
                var40_25 = WayPointModule.t[204];
                var40_25 += WayPointModule.t[205];
                var15_4 = v7 ^ (0L ^ v7) & -1L >>> (var40_25 += WayPointModule.t[206]);
                var12_24 = (String)var10_19.component1();
                var42_26 = WayPointModule.t[207];
                var42_26 += WayPointModule.t[208];
                var44_27 = WayPointModule.t[210];
                var44_27 += WayPointModule.t[211];
                if (!StringsKt.contains$default((CharSequence)normalizedMessage, var12_24, var42_26 += WayPointModule.t[209], var44_27 += WayPointModule.t[212], null)) continue;
                v8 /* !! */  = var9_13 /* !! */ ;
                break block11;
            }
            v8 /* !! */  = null;
        }
        v9 = (Pair)v8 /* !! */ ;
        return v9 != null ? (String)v9.getSecond() : null;
    }

    private final void updateEventDelayAutomation(ClientPlayerEntity player) {
        String string;
        block11: {
            block10: {
                Integer n2;
                long l2 = -2875567306750805311L;
                long l3 = -1584259446246089373L;
                if (!((Boolean)H.getValue()).booleanValue() || !ServerUtil.INSTANCE.isFunTime()) {
                    boolean bl = t[213];
                    bl += t[214];
                    this.resetEventDelayTracking(bl ^= t[215]);
                    return;
                }
                ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
                if (clientWorld == null) {
                    return;
                }
                ClientWorld clientWorld2 = clientWorld;
                String string2 = this.buildFunTimeSessionKey(clientWorld2);
                if (!Intrinsics.areEqual(string2, L)) {
                    L = string2;
                    m = null;
                    this.clearForServerContextSwitch();
                    int n3 = t[216];
                    n3 -= t[217];
                    this.scheduleEventDelayRequest(player.age + (n3 -= t[218]), this.buildEventDelayRequestContextKey(string2, null));
                }
                if ((n2 = this.findCurrentAnarchyNumber()) != null) {
                    Integer n4 = m;
                    if (n4 == null || n2.intValue() != n4.intValue()) {
                        m = n2;
                        this.clearForServerContextSwitch();
                        String string3 = this.buildEventDelayRequestContextKey(string2, n2);
                        if (!this.trySendEventDelayRequest(string3)) {
                            int n5 = t[219];
                            n5 -= t[220];
                            this.scheduleEventDelayRequest(player.age + (n5 ^= t[221]), string3);
                        }
                        return;
                    }
                }
                int n6 = t[222];
                n6 -= t[223];
                long l4 = l3;
                int n7 = t[225];
                n7 += t[226];
                l3 = l4 ^ ((long)M << (n6 ^= t[224]) ^ l4) & -1L << (n7 += t[227]);
                string = n;
                int n8 = t[228];
                n8 ^= t[229];
                if ((int)(l3 >>> (n8 += t[230])) < 0 || string == null) break block10;
                int n9 = t[231];
                n9 -= t[232];
                if (player.age >= (int)(l3 >>> (n9 ^= t[233]))) break block11;
            }
            return;
        }
        if (!this.trySendEventDelayRequest(string) && kotakbaz.rain.client.extensions.b.getMc().currentScreen != null) {
            return;
        }
        this.clearScheduledEventDelayRequest();
    }

    private final boolean trySendEventDelayRequest(String contextKey) {
        long l2 = -7736464126197395315L;
        if (kotakbaz.rain.client.extensions.b.getMc().currentScreen != null) {
            boolean bl = t[234];
            bl += t[235];
            return bl ^= t[236];
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            boolean bl = t[237];
            bl += t[238];
            return bl += t[239];
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler2 = clientPlayNetworkHandler;
        long l3 = System.currentTimeMillis();
        int n2 = t[240];
        n2 ^= t[241];
        long l4 = l2;
        int n3 = t[243];
        n3 += t[244];
        l2 = l4 ^ ((long)Intrinsics.areEqual(contextKey, o) << (n2 ^= t[242]) ^ l4) & -1L << (n3 ^= t[245]);
        int n4 = t[246];
        n4 ^= t[247];
        if ((int)(l2 >>> (n4 += t[248])) != 0 && l3 - N < 15000L) {
            boolean bl = t[249];
            bl -= t[250];
            return bl -= t[251];
        }
        N = l3;
        o = contextKey;
        this.touchEventDelayResponseTimeout(l3);
        this.clearEventDelayContext();
        int n5 = t[252];
        n5 += t[253];
        clientPlayNetworkHandler2.sendChatCommand((String)Q[n5 ^= t[254]]);
        boolean bl = t[255];
        bl += t[256];
        return bl -= t[257];
    }

    private final Integer findCurrentAnarchyNumber() {
        long l2 = -7457825278771138645L;
        long l3 = -8652226822177084464L;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
            return null;
        }
        ClientWorld clientWorld2 = clientWorld;
        ScoreboardObjective scoreboardObjective = clientWorld2.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
        if (scoreboardObjective == null) {
            return null;
        }
        ScoreboardObjective scoreboardObjective2 = scoreboardObjective;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, scoreboardObjective2.getDisplayName().getString());
        Collection collection = clientWorld2.getScoreboardEntries(scoreboardObjective2);
        int n2 = t[258];
        n2 -= t[259];
        int n3 = t[261];
        n3 += t[262];
        Intrinsics.checkNotNullExpressionValue(collection, (String)Q[n2 -= t[260]] + (String)Q[n3 += t[263]]);
        Iterable iterable = collection;
        long l4 = l2;
        int n4 = t[264];
        n4 ^= t[265];
        l2 = l4 ^ (0L ^ l4) & -1L << (n4 += t[266]);
        for (Object t2 : iterable) {
            Team team;
            ScoreboardEntry scoreboardEntry = (ScoreboardEntry)t2;
            long l5 = l2;
            int n5 = t[267];
            n5 -= t[268];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n5 -= t[269]);
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, scoreboardEntry.owner());
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, scoreboardEntry.name().getString());
            Text text = scoreboardEntry.display();
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, text != null ? text.getString() : null);
            if (clientWorld2.getScoreHolderTeam(scoreboardEntry.owner()) == null) continue;
            long l6 = l3;
            int n6 = t[270];
            n6 ^= t[271];
            l3 = l6 ^ (0L ^ l6) & -1L << (n6 -= t[272]);
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, team.getPrefix().getString());
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, team.getSuffix().getString());
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, team.decorateName((Text)Text.literal((String)scoreboardEntry.owner())).getString());
            WayPointModule.findCurrentAnarchyNumber$addCandidate(linkedHashSet, team.decorateName(scoreboardEntry.name()).getString());
        }
        return (Integer)SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence((Iterable)linkedHashSet), new B(this)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Integer extractAnarchyNumber(String raw) {
        int n2 = t[273];
        n2 ^= t[274];
        int n3 = t[276];
        n3 ^= t[277];
        MatchResult matchResult = Regex.find$default(g, raw, n2 += t[275], n3 += t[278], null);
        if (matchResult == null) return null;
        List<String> list = matchResult.getGroupValues();
        if (list == null) return null;
        int n4 = t[279];
        n4 ^= t[280];
        String string = CollectionsKt.getOrNull(list, n4 -= t[281]);
        if (string == null) return null;
        Integer n5 = StringsKt.toIntOrNull(string);
        return n5;
    }

    private final void scheduleEventDelayRequest(int targetTick, String contextKey) {
        M = targetTick;
        n = contextKey;
    }

    private final void clearScheduledEventDelayRequest() {
        int n2 = t[282];
        n2 -= t[283];
        M = n2 -= t[284];
        n = null;
    }

    private final void clearForServerContextSwitch() {
        this.clearScheduledEventDelayRequest();
        this.clearEventDelayContext();
        int n2 = t[285];
        n2 += t[286];
        O = n2 += t[287];
        p = 0L;
        this.removeEventWaypoints();
    }

    private final boolean handleEventDelayMessage(String rawMessage, String normalizedMessage) {
        int n2;
        long l2 = -6099379783234889095L;
        this.clearExpiredEventDelayState();
        int n3 = t[288];
        n3 -= t[289];
        n3 -= t[290];
        int n4 = t[291];
        n4 -= t[292];
        boolean bl = t[294];
        bl += t[295];
        int n5 = t[297];
        n5 ^= t[298];
        if (StringsKt.contains$default((CharSequence)normalizedMessage, (String)Q[n3] + (String)Q[n4 ^= t[293]], bl -= t[296], n5 += t[299], null)) {
            this.removeEventWaypoints();
            this.clearEventDelayContext();
            int n6 = t[300];
            n6 += t[301];
            O = n6 -= t[302];
            p = 0L;
            boolean bl2 = t[303];
            bl2 ^= t[304];
            return bl2 ^= t[305];
        }
        if (this.isEventDelayNameLine(rawMessage)) {
            String string = this.extractEventName(rawMessage, normalizedMessage);
            if (string == null) {
                int n7 = t[306];
                n7 += t[307];
                string = (String)Q[n7 ^= t[308]];
            }
            P = string;
            q = System.currentTimeMillis();
            int n8 = t[309];
            n8 += t[310];
            WayPointModule.touchEventDelayResponseTimeout$default(this, 0L, n8 -= t[311], null);
            boolean bl3 = t[312];
            bl3 ^= t[313];
            return bl3 ^= t[314];
        }
        if (O || P != null) {
            int n9 = t[315];
            n9 += t[316];
            n2 = n9 ^= t[317];
        } else {
            int n10 = t[318];
            n10 ^= t[319];
            n2 = n10 ^= t[320];
        }
        int n11 = t[321];
        n11 ^= t[322];
        long l3 = l2;
        int n12 = t[324];
        n12 -= t[325];
        l2 = l3 ^ ((long)n2 << (n11 -= t[323]) ^ l3) & -1L << (n12 += t[326]);
        int n13 = t[327];
        n13 += t[328];
        if ((int)(l2 >>> (n13 += t[329])) == 0) {
            boolean bl4 = t[330];
            bl4 += t[331];
            return bl4 ^= t[332];
        }
        int n14 = t[333];
        n14 += t[334];
        boolean bl5 = t[336];
        bl5 += t[337];
        int n15 = t[339];
        n15 ^= t[340];
        if (StringsKt.contains$default((CharSequence)normalizedMessage, (String)Q[n14 += t[335]], bl5 -= t[338], n15 -= t[341], null)) {
            int n16 = t[342];
            n16 += t[343];
            WayPointModule.touchEventDelayResponseTimeout$default(this, 0L, n16 -= t[344], null);
            boolean bl6 = t[345];
            bl6 += t[346];
            return bl6 -= t[347];
        }
        int n17 = t[348];
        n17 -= t[349];
        boolean bl7 = t[351];
        bl7 ^= t[352];
        int n18 = t[354];
        n18 += t[355];
        if (StringsKt.contains$default((CharSequence)rawMessage, (String)Q[n17 -= t[350]], bl7 ^= t[353], n18 ^= t[356], null)) {
            int n19 = t[357];
            n19 += t[358];
            boolean bl8 = t[360];
            bl8 -= t[361];
            int n20 = t[363];
            n20 += t[364];
            if (StringsKt.contains$default((CharSequence)normalizedMessage, (String)Q[n19 -= t[359]], bl8 ^= t[362], n20 -= t[365], null)) {
                q = System.currentTimeMillis();
                int n21 = t[366];
                n21 ^= t[367];
                WayPointModule.touchEventDelayResponseTimeout$default(this, 0L, n21 += t[368], null);
                boolean bl9 = t[369];
                bl9 += t[370];
                return bl9 ^= t[371];
            }
        }
        int n22 = t[372];
        n22 -= t[373];
        boolean bl10 = t[375];
        bl10 += t[376];
        int n23 = t[378];
        n23 -= t[379];
        if (StringsKt.contains$default((CharSequence)rawMessage, (String)Q[n22 -= t[374]], bl10 += t[377], n23 -= t[380], null)) {
            int n24 = t[381];
            n24 -= t[382];
            boolean bl11 = t[384];
            bl11 ^= t[385];
            int n25 = t[387];
            n25 ^= t[388];
            if (StringsKt.contains$default((CharSequence)normalizedMessage, (String)Q[n24 ^= t[383]], bl11 ^= t[386], n25 += t[389], null)) {
                BlockPos blockPos = this.extractEventCoordinates(rawMessage);
                if (blockPos == null) {
                    boolean bl12 = t[390];
                    bl12 -= t[391];
                    return bl12 ^= t[392];
                }
                BlockPos blockPos2 = blockPos;
                String string = P;
                if (string == null) {
                    int n26 = t[393];
                    n26 -= t[394];
                    string = (String)Q[n26 += t[395]];
                }
                String string2 = string;
                this.putEventWaypoint(string2, blockPos2);
                this.clearEventDelayContext();
                int n27 = t[396];
                n27 -= t[397];
                O = n27 ^= t[398];
                p = 0L;
                boolean bl13 = t[399];
                bl13 += 34;
                return bl13 += 43;
            }
        }
        int n6 = -54;
        n6 = n6 ^ 0x10;
        boolean bl2 = n6 ^ 0xFFFFFFDA;
        return bl2;
    }

    private final void putEventWaypoint(String eventName, BlockPos eventPos) {
        this.removeEventWaypoints();
        int n2 = 19;
        n2 = n2 + 16;
        boolean bl2 = n2 ^ 0x22;
        a_0 a_02 = WayPointManager.INSTANCE.add(eventName, bl2, eventPos);
        if (a_02 == kotakbaz.rain.client.waypoint.A.A) {
            int n3 = 88;
            n3 -= 48;
            if (!Intrinsics.areEqual(eventName, (String)Q[n3 ^= 0x39])) {
                int n4 = -15;
                n4 -= -102;
                int n6 = -57;
                n6 = n6 - 68;
                boolean bl3 = n6 ^ 0xFFFFFF82;
                WayPointManager.INSTANCE.add((String)Q[n4 ^= 0x7A], bl3, eventPos);
            }
        }
    }

    private final void removeEventWaypoints() {
        long l2 = -7642397662711951874L;
        long l3 = 3082106297013205834L;
        long l4 = 5704189679444242321L;
        Iterable iterable = WayPointManager.INSTANCE.getWayPoints();
        long l5 = l3;
        int n2 = 133;
        n2 += -98;
        l3 = l5 ^ (0L ^ l5) & -1L >>> (n2 -= 3);
        Iterable iterable2 = iterable;
        Collection collection2 = new ArrayList();
        long l6 = l2;
        int n3 = -17;
        n3 += 21;
        l2 = l6 ^ (0L ^ l6) & -1L >>> (n3 += 28);
        Iterator iterator2 = iterable2.iterator();
        while (iterator2.hasNext()) {
            Object t2 = iterator2.next();
            d d2 = (d)t2;
            long l7 = l3;
            int n4 = 110;
            n4 -= 87;
            l3 = l7 ^ (0L ^ l7) & -1L << (n4 += 9);
            if (!d2.getEvent()) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        long l8 = l3;
        int n5 = -19;
        n5 ^= 0xFFFFFFCA;
        l3 = l8 ^ (0L ^ l8) & -1L >>> (n5 -= 7);
        for (Collection collection2 : iterable) {
            d d3 = (d)((Object)collection2);
            long l9 = l4;
            int n6 = 43;
            n6 ^= 0x54;
            l4 = l9 ^ (0L ^ l9) & -1L << (n6 ^= 0x5F);
            WayPointManager.INSTANCE.remove(d3.getName());
        }
    }

    private final boolean isPlayerAlive(ClientPlayerEntity player) {
        int n2;
        if (player.isAlive() && player.getHealth() > 0.0f && player.deathTime <= 0) {
            int n3 = -48;
            n3 ^= 0xFFFFFFDA;
            n2 = n3 ^= 0xB;
        } else {
            int n4 = 179;
            n4 += -70;
            n2 = n4 += -109;
        }
        return n2 != 0;
    }

    private final void resetDeathTracking() {
        int n2 = 119;
        n2 ^= 0xFFFFFF94;
        K = n2 -= -29;
        l = null;
    }

    private final void resetEventDelayTracking(boolean clearSession) {
        this.clearScheduledEventDelayRequest();
        this.clearEventDelayContext();
        int n2 = 7;
        n2 -= 117;
        O = n2 ^= 0xFFFFFF92;
        p = 0L;
        if (clearSession) {
            L = null;
            m = null;
            o = null;
        }
    }

    private final void clearEventDelayContext() {
        P = null;
        q = 0L;
    }

    private final void clearExpiredEventDelayState() {
        long l2 = System.currentTimeMillis();
        if (O && l2 > p) {
            int n2 = -107;
            n2 += 116;
            O = n2 += -9;
            p = 0L;
        }
        if (P != null && l2 - q > 6000L) {
            this.clearEventDelayContext();
        }
    }

    private final void touchEventDelayResponseTimeout(long now) {
        int n2 = 78;
        n2 ^= 0x52;
        O = n2 += -27;
        p = now + 6000L;
    }

    static /* synthetic */ void touchEventDelayResponseTimeout$default(WayPointModule wayPointModule, long l2, int n2, Object object) {
        int n3 = 244;
        n3 -= 121;
        if ((n2 & (n3 ^= 0x7A)) != 0) {
            l2 = System.currentTimeMillis();
        }
        wayPointModule.touchEventDelayResponseTimeout(l2);
    }

    private final boolean isEventDelayNameLine(String rawMessage) {
        return F.matches(((Object)StringsKt.trim((CharSequence)rawMessage)).toString());
    }

    private final String buildFunTimeSessionKey(Object world) {
        String string;
        long l2 = -5500441240751814123L;
        Object object = kotakbaz.rain.client.extensions.b.getMc().getCurrentServerEntry();
        if ((object != null && (object = object.address) != null ? ((Object)StringsKt.trim((CharSequence)object)).toString() : (string = null)) == null) {
            string = "";
        }
        String string2 = string;
        int n2 = -122;
        n2 -= -115;
        long l3 = l2;
        int n3 = 280;
        n3 -= 123;
        l2 = l3 ^ ((long)System.identityHashCode(world) << (n2 -= -39) ^ l3) & -1L << (n3 += -125);
        String string3 = string2;
        int n4 = -51;
        n4 += 24;
        int n5 = 12;
        n5 += -90;
        return string3 + (String)Q[n4 -= -61] + (int)(l2 >>> (n5 += 110));
    }

    private final String buildEventDelayRequestContextKey(String sessionKey, Integer anarchyNumber) {
        String string;
        if (anarchyNumber == null) {
            String string2 = sessionKey;
            int n2 = -41;
            n2 ^= 0x28;
            string = string2 + (String)Q[n2 -= -28];
        } else {
            Integer n3 = anarchyNumber;
            String string3 = sessionKey;
            int n4 = 99;
            n4 ^= 0xFFFFFFD9;
            string = string3 + (String)Q[n4 ^= 0xFFFFFF85] + n3;
        }
        return string;
    }

    private static final boolean fadeWaypointHideDistance$lambda$0() {
        return (Boolean)J.getValue();
    }

    private static final boolean _init_$lambda$0() {
        int n2 = -14;
        n2 = n2 ^ 0x31;
        boolean bl2 = n2 + 61;
        return bl2;
    }

    private static final void findCurrentAnarchyNumber$addCandidate(LinkedHashSet<String> candidates, String value2) {
        String string;
        block6: {
            block5: {
                int n2;
                String string2;
                long l2 = -8180922069694209728L;
                if (value2 == null) break block5;
                String string3 = ((Object)StringsKt.trim((CharSequence)value2)).toString();
                if (string3 == null) break block5;
                String string4 = string2 = string3;
                long l3 = l2;
                int n3 = 211;
                n3 += -87;
                l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= 0x5C);
                if (((CharSequence)string4).length() > 0) {
                    int n4 = 3;
                    n4 += 84;
                    n2 = n4 += -86;
                } else {
                    int n5 = -17;
                    n5 -= 30;
                    n2 = n5 -= -47;
                }
                String string5 = string = n2 != 0 ? string2 : null;
                if (string != null) break block6;
            }
            return;
        }
        String string6 = string;
        ((Collection)candidates).add(string6);
    }

    public static final /* synthetic */ Integer access$extractAnarchyNumber(WayPointModule $this, String raw) {
        return $this.extractAnarchyNumber(raw);
    }

    static {
        WayPointModule.b();
        long l2 = -1267017655692034148L;
        long l3 = 6768309616860793967L;
        long l4 = -1912135682398565116L;
        long l5 = 2342602855858439912L;
        long l6 = -6846236998194562904L;
        long l7 = -672495531566633525L;
        long l8 = -6591553554115529687L;
        long l9 = 6373961402071202755L;
        long l10 = 7850946311449034697L;
        long l11 = -5401063370334892422L;
        long l12 = -2920671397885989127L;
        long l13 = 6189198532682485582L;
        long l14 = 1057195687297081903L;
        long l15 = -2920858613651066044L;
        int n2 = 115;
        n2 ^= 0xFFFFFF9D;
        Q = new Object[n2 += 89];
        long l16 = l15;
        int n3 = 59;
        n3 += -107;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= -80);
        Object[] objectArray = new Object[3];
        objectArray[0] = r;
        objectArray[1] = 0;
        Object object = WayPointModule.A()[0];
        if (object == null) {
            char[] cArray = "\u3392\u338d\u33ae\u33d6\u33aa\u33a0\u3383\u33b9\u33ba\u334e\u338b\u338a\u33c0\u33d8\u33b9\u33bf\u33a0\u33c0\u33d6\u34f3\u339a\u33a4\u339a\u3389\u339b\u3383\u339c\u34f6\u3394\u33d4\u34f6\u339c\u2e5c\u33d1\u34f2\u33eb\u33ba\u33aa\u338a\u33ae\u33b0\u338a\u338f\u3394\u33a0\u3384\u34f7\u33ba\u3383\u339b\u33bc\u33ea\u34f5\u33ef\u2e5c\u3389\u338d\u33bb\u3398\u34f2\u33bb\u339a\u33aa\u338b\u339d\u33b9\u3389\u33b0\u334e\u33eb\u34f8\u2e5c\u3390\u33eb\u33d3\u33d4\u34f3\u33bf\u33ba\u33ae\u339b\u334d\u33eb\u338a\u33af\u34f6\u334e\u33d2\u33d8\u33a3\u34f4\u33bc\u33bc\u3393\u33d4\u34f2\u34f2\u338a\u3391\u33ad\u3394\u3384\u3394\u339a\u338a\u3392\u33bc\u3393\u34f5\u33ae\u33f0\u33a2\u33a9\u34f6\u33d5\u338d\u339a\u33d1\u34f1\u339e\u33ba\u33e9\u338b\u33f0\u334e\u3382\u339b\u33aa\u3389\u33a9\u3399\u338d\u3394\u33d6\u33e9\u33d1\u33d4\u3398\u34f5\u33c0\u33d7\u3392\u338d\u33d8\u334d\u33ae\u339e\u339b\u3384\u338d\u33a2\u33d2\u33a9\u34fe\u34f8\u34f7\u3391\u3391\u3383\u33bc\u33e9\u34f1\u34f5\u33aa\u33ae\u33d7\u34f1\u33d2\u33a2\u338b\u33d6\u33d5\u339e\u334d\u3394\u34f5\u33aa\u338f\u33d2\u338e\u33d2\u34f8\u34f5\u34f3\u34f1\u33d2\u334e\u338d\u339b\u33e9\u339d\u339a\u33a3\u338f\u33d8\u33d2\u33b0\u34f3\u33d5\u3391\u33b9\u34fe\u33a0\u339d\u33d6\u34fe\u338b\u34f3\u3391\u33e9\u334d\u33a9\u34f4\u34f5\u3398\u34f1\u338f\u339a\u33ba\u338a\u34f1\u34fd\u33a4\u338b\u339a\u33f0\u33a0\u339a\u33d5\u339e\u33e9\u3393\u3398\u33ae\u339f\u339d\u33ba\u34f4\u33aa\u339f\u33d1\u33bb\u34f2\u34f1\u34f2\u33e9\u33d1\u33ef\u33a0\u33f0\u334e\u33a9\u33af\u34fe\u34f4\u334d\u33d1\u33d5\u338a\u33bc\u3383\u338a\u33bf\u33d6\u33a4\u34f2\u334d\u2e5c\u3399\u33bb\u33b9\u33d7\u339b\u3382\u33bb\u33d7\u34fe\u338f\u3394\u338f\u3390\u33af\u33f0\u34f4\u334e\u34fd\u334e\u33ef\u338e\u33ef\u34f4\u33a3\u34f7\u3383\u33d7\u2e5c\u3390\u334d\u33bc\u3399\u33a9\u33af\u3384\u33a0\u33bc\u34f3\u34f2\u33a4\u33af\u33ad\u34f4\u33d1\u3390\u338d\u33e9\u33bf\u33a3\u33d1\u33d2\u33ea\u338e\u33e9\u338a\u33af\u334d\u33c0\u33d5\u3382\u33a9\u33bc\u34fd\u3382\u33d1\u34f8\u3391\u33ea\u338d\u33d2\u33e9\u33d4\u33bc\u338d\u33a2\u33b9\u339b\u338f\u33a0\u3389\u33d5\u338a\u33eb\u33e9\u338e\u339b\u3384\u33d3\u338b\u3383\u33d6\u33a9\u34f8\u33a0\u34f1\u33ae\u34fe\u33d5\u3393\u33b0\u34f3\u34f5\u339e\u34f2\u338b\u339e\u33a2\u33d1\u33a9\u339c\u34fd\u339a\u34fe\u338b\u338f\u33b9\u3384\u3398\u339d\u338a\u3390\u3384\u339f\u33d7\u33c0\u33a9\u33ae\u33b0\u339f\u33a4\u33af\u338d\u34f3\u33ba\u33ad\u3390\u334e\u3391\u33c0\u33ef\u33d1\u33d1\u334e\u3394\u3390\u338d\u33bc\u33a3\u3393\u33e9\u34f3\u338d\u33bf\u33ba\u3383\u33ae\u33ea\u33a9\u338a\u334d\u33d2\u33af\u3382\u34f4\u334e\u34f3\u2e5c\u338d\u33f0\u33a9\u34f6\u33ba\u34fe\u33ad\u3393\u339c\u34f7\u34f6\u33b9\u33a3\u3399\u34fd\u33aa\u33bc\u33d5\u3398\u33ef\u33a0\u33e9\u3383\u338a\u3398\u33ae\u34fd\u2e5c\u33bb\u33ef\u34f3\u3382\u3399\u33bf\u33af\u339c\u33d4\u33bb\u33a4\u338f\u338d\u3391\u334e\u33c0\u33bf\u33ea\u33e9\u33eb\u34fe\u3391\u33d3\u34f4\u33d7\u3399\u339a\u3394\u33d4\u339b\u33bb\u33b9\u3382\u33d3\u3393\u338a\u33b0\u339d\u338a\u33ef\u33a4\u33ea\u3390\u33c0\u33d6\u334d\u33d3\u334e\u33ad\u33bb\u33bf\u33d2\u339a\u34f2\u3398\u34f7\u33c0\u33f0\u33a0\u34fe\u338b\u3390\u33d8\u33ad\u34f7\u34f4\u33a3\u339d\u3398\u3389\u3394\u34f7\u33ba\u3382\u3383\u34fe\u33d5\u3393\u338e\u33ef\u34f4\u3384\u33a9\u33a2\u33b0\u33d3\u33a3\u33b9\u3382\u33b9\u33d7\u33f0\u33a2\u338d\u3383\u339e\u3398\u33ba\u3384\u3391\u3393\u33ea\u34f5\u33ef\u34f8\u33b0\u339b\u34f5\u33ba\u33bb\u33d6\u339a\u3382\u338e\u334d\u338b\u338b\u33ad\u33d6\u3383\u33ad\u33e9\u34f6\u33bc\u3391\u3391\u33f0\u3399\u338a\u338b\u3391\u33ba\u3391\u339a\u33eb\u33d5\u34f2\u34f4\u33ea\u3389\u339f\u339b\u334d\u338e\u33aa\u33d8\u33e9\u33f0\u33ea\u33a4\u33ad\u33d4\u2e5c\u33ad\u338d\u33aa\u33ad\u33ef\u34f7\u33d6\u3391\u33d7\u33a0\u338f\u338f\u3394\u34fe\u33a2\u33d8\u334e\u33eb\u3391\u33d4\u33ae\u33ba\u33a3\u338d\u3391\u33d2\u33a0\u3382\u33a9\u33ef\u34f6\u3394\u34f8\u34f3\u34f8\u3390\u33ae\u34f4\u33ba\u338f\u339a\u339c\u33ad\u3393\u3384\u3391\u33b9\u33a9\u334e\u334e\u3394\u3398\u2e5c\u33bf\u33aa\u338d\u34f6\u34f8\u33e9\u338a\u33e9\u33f0\u34fd\u3390\u339a\u3382\u3391\u3382\u33aa\u33ae\u339c\u33d4\u33eb\u33ef\u33d4\u339d\u339f\u34f6\u33d2\u33ae\u33a0\u34fd\u334e\u33a3\u34f2\u33d4\u33a3\u33e9\u339a\u33d4\u3398\u338d\u33d8\u33af\u34f5\u334e\u3390\u338b\u2e5c\u33d2\u33d1\u33bf\u339c\u3390\u33aa\u33b9\u34f7\u33af\u33aa\u33d4\u33ad\u33eb\u33eb\u33d4\u33b9\u3393\u339a\u33bb\u33a2\u338a\u34f6\u33ba\u33a9\u34f4\u33b9\u33ae\u33f0\u33d2\u338d\u34f5\u33e9\u339a\u338b\u34f5\u33d4\u34f4\u3391\u33eb\u33a9\u33bf\u33b9\u339d\u338f\u33d2\u338e\u339c\u339b\u33af\u33d6\u339b\u34f7\u33ad\u33a4\u33a4\u33a4\u33ef\u33a9\u33ae\u339e\u338f\u34f2\u33d8\u34f3\u33ba\u3394\u34f6\u33e9\u34f7\u334d\u33a9\u3383\u33ea\u3382\u33e9\u33bf\u33aa\u338b\u33d8\u3398\u2e5c\u33af\u3382\u338e\u33d2\u338b\u33ea\u339a\u33af\u33aa\u339e\u339b\u33d2\u33ae\u34f6\u33ba\u34fd\u33ba\u33ad\u3383\u33d2\u339b\u3391\u34f1\u338b\u34fd\u34f7\u33eb\u34f1\u33bb\u339b\u33d1\u33d7\u33b9\u339d\u33b9\u339d\u34f2\u33bb\u34f6\u33f0\u3382\u33d7\u33aa\u34f7\u338b\u3393\u339b\u33d4\u3393\u33bf\u339c\u3390\u3389\u33b9\u334d\u33af\u34f6\u34f7\u339b\u3399\u334e\u3391\u3393\u33a4\u33f0\u33c0\u33af\u33a4\u3399\u334d\u33bc\u3393\u33bb\u33d6\u33c0\u3390\u33a4\u33a2\u338f\u338e\u3383\u33d3\u34f6\u33ba\u33ef\u339c\u33bf\u3399\u339b\u334d\u338a\u33ea\u338f\u339f\u33bb\u34f4\u33d7\u33a2\u34fd\u3384\u33b9\u33a9\u339d\u33ad\u339e\u33e9\u33ad\u33d7\u33bf\u3394\u33d2\u33a0\u33e9\u34f7\u33a0\u3390\u2e5c\u34f4\u33d6\u34f1\u33bc\u3393\u3389\u33a0\u34f4\u33e9\u34f4\u339c\u33ba\u3391\u3390\u33aa\u34f5\u3383\u33af\u33eb\u33e9\u33bb\u33ad\u34fd\u33bf\u33ea\u33a2\u34f1\u34f1\u33af\u33c0\u34f7\u34f8\u33bf\u33d6\u33ae\u33d2\u33ad\u33a4\u33eb\u33b0\u33a3\u33ea\u338e\u33a4\u3390\u34f1\u34f4\u33f0\u33b0\u34f8\u334d\u34f4\u3384\u33d4\u33bf\u339d\u338b\u33aa\u3390\u3394\u3399\u33d1\u34f1\u3382\u34f4\u33ad\u33d3\u34fe\u3390\u34f7\u34f7\u339a\u33c0\u339c\u33ea\u33d5\u339f\u34f2\u33a0\u33d3\u33ad\u33b0\u33a9\u339c\u34f4\u33bb\u338a\u338a\u33f0\u33ad\u33d5\u33eb\u33d8\u33bc\u339d\u34f3\u33d3\u33b9\u33c0\u33d6\u339e\u3393\u3384\u33ae\u33eb\u33ad\u33bf\u3391\u33c0\u33d8\u33ef\u33ad\u33ea\u3398\u34f5\u3399\u33c0\u3382\u33ef\u33bc\u33b0\u3389\u2e5c\u34fd\u33ad\u3393\u33eb\u34fe\u34fd\u3383\u33d2\u338d\u33e9\u33a4\u33a9\u33a9\u338d\u33d7\u33d1\u33eb\u33d7\u3398\u33a4\u34f3\u338e\u33a9\u33a0\u3392\u33a2\u33d7\u3391\u3390\u33aa\u33bb\u33a9\u338d\u33ea\u34fd\u33b0\u33d6\u33bb\u33a4\u2e5c\u3392\u34f7\u338f\u34f2\u338d\u34f2\u33d2\u33bf\u34f7\u33af\u34f4\u34f4\u33ea\u33d5\u33c0\u3384\u33a2\u334d\u33d8\u3390\u34f1\u3389\u3398\u33d7\u34f3\u33ef\u33eb\u34fe\u334d\u33d4\u33ea\u334d\u33a4\u3390\u3399\u34f5\u3390\u33ad\u33af\u33d4\u34f3\u33d3\u338f\u33bf\u339e\u334d\u33b0\u33a4\u33a3\u3384\u33ba\u339e\u33ad\u3390\u3398\u339f\u3383\u339d\u34f6\u3391\u33ae\u33ea\u33e9\u34f3\u33b9\u338e\u33d2\u33d4\u3393\u33eb\u339c\u33d5\u33ba\u338b\u33b0\u34f1\u34f5\u338f\u34f2\u33b9\u33ea\u3383\u33d4\u33d6\u338d\u33a2\u33bf\u34f6\u33d2\u33d4\u34fe\u3389\u34f6\u33a9\u339e\u34f7\u34f2\u338b\u34f3\u3391\u3392\u33bc\u34fd\u3394\u339c\u2e5c\u33ef\u34f1\u33aa\u338f\u3384\u33d5\u33bc\u33d4\u34f2\u334e\u2e5c\u33a0\u339d\u33d1\u33a9\u33af\u3382\u2e5c\u33a2\u33f0\u338f\u339f\u338b\u33d2\u33d4\u33d5\u33a4\u34fd\u33a2\u2e5c\u334d\u3390\u33e9\u3394\u338a\u33d5\u3391\u3389\u3383\u339d\u33a2\u2e5c\u33d4\u33ae\u34f5\u339b\u338a\u33bb\u3391\u3393\u33d6\u334d\u3384\u33a4\u338f\u33d5\u339f\u339d\u33ad\u34f2\u33ae\u3399\u33f0\u33e9\u33a4\u3391\u33c0\u34fd\u338e\u33bf\u34f2\u34f1\u34f5\u339e\u33d8\u33d1\u33ae\u33f0\u339a\u334d\u33d3\u33d7\u3399\u33bc\u33d5\u34f7\u33b9\u3398\u33a2\u33c0\u3383\u338f\u3398\u33eb\u338e\u3390\u34f6\u33bc\u33d6\u334e\u33ea\u34f8\u3382\u34fd\u3398\u34fd\u3398\u33ad\u34f8\u34f2\u34f2\u3392\u338a\u33d3\u34f1\u3382\u33bf\u34f7\u3390\u3392\u33f0\u33a2\u33aa\u33f0\u33e9\u33a3\u33c0\u34f5\u3394\u34f6\u34f5\u34f6\u33bf\u33ae\u33c0\u33d4\u34fe\u3398\u3383\u3382\u33b9\u33bc\u33bf\u34f5\u34f3\u339f\u338d\u2e5c\u334d\u34f6\u33a3\u338b\u338a\u33bb\u3384\u33c0\u3399\u33d8\u3389\u34f8\u3392\u33a3\u339f\u34f2\u3390\u34f6\u338d\u33ad\u3399\u33bb\u34fe\u339c\u33af\u33ef\u34f6\u34fd\u34f6\u33e9\u3393\u34f3\u33d3\u33d4\u34f7\u3393\u33a4\u334d\u339c\u33bb\u34f5\u339e\u33bc\u3398\u339a\u33d3\u34f4\u33bc\u2e5c\u34fd\u34fe\u339d\u34fe\u3390\u33b9\u33af\u34fe\u34f2\u33eb\u33b9\u33bb\u34f7\u33a4\u34fe\u34fd\u33f0\u34f4\u34f4\u33a2\u33d3\u33d6\u33d3\u33a9\u33c0\u33d8\u34f7\u34f5\u34f1\u339b\u33d6\u3390\u33d3\u34f3\u33a2\u34f6\u34fe\u33d4\u34f5\u33f0\u33d2\u339b\u33bb\u33a0\u33e9\u334d\u2e5c\u33eb\u3389\u33a9\u339d\u33e9\u34f6\u3389\u33e9\u338e\u33a3\u33b9\u3390\u33e9\u33bf\u3389\u33c0\u34f6\u34f3\u33d8\u33bb\u33d3\u33ef\u3382\u33d7\u339b\u338e\u33b9\u33d1\u33bc\u33d6\u33d2\u339b\u3398\u3383\u33ae\u33ae\u3382\u33d6\u338b\u3392\u33f0\u3391\u34f3\u34f1\u33d5\u34f3\u3399\u3384\u33a9\u3390\u338e\u33a4\u338a\u33a4\u33d8\u34f2\u33f0\u33bc\u338b\u34f8\u33a2\u34f3\u34f6\u33eb\u33d2\u33bb\u339a\u33bb\u33d6\u33d6\u33a2\u33d5\u3384\u3393\u33ef\u33a0\u33ad\u33af\u34f5\u3393\u34f2\u34f1\u33d1\u33d1\u33d1\u33d4\u33a3\u338f\u338a\u3398\u33f0\u33eb\u3391\u33a4\u338f\u33d6\u3383\u339b\u33e9\u339c\u3389\u34f1\u33d4\u3390\u3383\u3389\u33bb\u33ea\u34f2\u33d3\u338b\u33d5\u33e9\u3389\u34fe\u3392\u33a9\u3393\u34f3\u33b9\u33ef\u34f8\u339e\u34f6\u33d6\u33bc\u339d\u34f2\u339a\u33ea\u34f6\u339f\u338a\u3384\u33ad\u34fd\u34f3\u2e5c\u33d7\u33d1\u339f\u33b9\u338d\u3398\u33a2\u339f\u33a3\u33d1\u33ef\u339b\u34f2\u33d1\u33bc\u33eb\u33ae\u33d2\u339d\u33ad\u33d2\u33e9\u33ea\u334d\u34f8\u3391\u33ae\u3394\u338e\u33d5\u338a\u34fe\u33af\u33d3\u33bf\u33bb\u338f\u3392\u3389\u33d2\u3392\u34fe\u33a4\u33eb\u34f6\u34fe\u34fd\u34f1\u3398\u33d4\u33b0\u338b\u33a9\u33c0\u34f3\u33f0\u33ba\u33bb\u33ba\u33bb\u3393\u338d\u33a2\u33af\u33d4\u339c\u339c\u33d4\u34f4\u33a2\u33d7\u33ba\u338e\u3392\u33a0\u33aa\u339c\u3390\u3383\u33ae\u33aa\u34f2\u33a3\u34fd\u33ba\u338b\u338d\u3393\u33d3\u33ba\u338d\u3393\u33a9\u3399\u33d1\u33d5\u3390\u33d1\u339d\u3394\u3382\u3383\u338e\u34f7\u338a\u3392\u339a\u339e\u33bf\u33aa\u3382\u33a4\u339a\u338f\u33c0\u33d2\u3398\u339c\u33e9\u33eb\u3398\u33ba\u33d2\u33e9\u34f8\u33a0\u339f\u338a\u3398\u33aa\u339b\u33e9\u33ea\u33a0\u33ad\u339a\u34fd\u3399\u34f2\u33c0\u33ae\u34f6\u3383\u33b9\u34fd\u33ae\u334d\u33a3\u3399\u33d1\u33d6\u33bb\u33bf\u34f6\u34fe\u33d8\u33ad\u34f3\u339c\u33ad\u33ef\u33ea\u34f2\u339b".toCharArray();
            for (int i2 = 0; i2 < 1728; ++i2) {
                int n4 = cArray[i2];
                n4 += 35553;
                n4 += 55846;
                n4 -= 1864;
                n4 ^= 0xE34A;
                n4 += 3338;
                n4 ^= 0xC66F;
                n4 -= 26930;
                n4 += 36084;
                n4 ^= 0x9E74;
                n4 += 60217;
                n4 += 15899;
                n4 ^= 0x363C;
                n4 ^= 0xE8DE;
                cArray[i2] = (char)(n4 ^= 0xB21F);
            }
            object = WayPointModule.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)WayPointModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = -61;
        n5 ^= 0x56;
        l6 = l17 ^ (0x35600000000L ^ l17) & -1L << (n5 ^= 0xFFFFFFB5);
        long l18 = l13;
        int n6 = 62;
        n6 ^= 0x66;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 += -56);
        while (true) {
            int n7 = 33;
            n7 ^= 0xFFFFFFE7;
            if ((int)l13 >= (int)(l6 >>> (n7 ^= 0xFFFFFFE6))) break;
            int n4 = (int)l13;
            long l19 = l13;
            int n9 = 172;
            n9 += -125;
            int n10 = 35;
            n10 ^= 0xFFFFFFBF;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 ^= 0x2E)) & -1L >>> (n10 ^= 0xFFFFFFBC);
            long l20 = l9;
            int n11 = -176;
            n11 -= -87;
            l9 = l20 ^ ((long)cArray[n4] ^ l20) & -1L >>> (n11 += 121);
            int n8 = (int)l13;
            long l21 = l13;
            int n13 = 43;
            n13 += 83;
            int n14 = 61;
            n14 -= 18;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 += -125)) & -1L >>> (n14 += -11);
            int n15 = 8;
            n15 ^= 0xFFFFFFAF;
            long l22 = l10;
            int n16 = -85;
            n16 ^= 0x43;
            l10 = l22 ^ ((long)cArray[n8] << (n15 -= -121) ^ l22) & -1L << (n16 += 56);
            int n17 = -57;
            n17 += 18;
            n17 += 55;
            int n18 = -7;
            n18 ^= 0xFFFFFFC6;
            long l23 = l12;
            int n19 = -86;
            n19 -= -88;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 -= 31))) ^ l23) & -1L >>> (n19 -= -30);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 152;
            n20 -= 34;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 ^= 0x56);
            while (true) {
                int n21 = 74;
                n21 += -90;
                if ((int)(l14 >>> (n21 ^= 0xFFFFFFD0)) >= (int)l12) break;
                int n22 = -76;
                n22 ^= 0x60;
                int n23 = -80;
                n23 -= -8;
                cArray2[(int)(l14 >>> (n22 -= -76))] = cArray[(int)l13 + (int)(l14 >>> (n23 ^= 0xFFFFFF98))];
                l14 += 0x100000000L;
            }
            int n24 = -46;
            n24 -= -88;
            int n12 = (int)(l15 >>> (n24 -= 10));
            l15 += 0x100000000L;
            WayPointModule.Q[n12] = new String(cArray2);
            long l25 = l13;
            int n26 = -120;
            n26 -= -115;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 += 37);
        }
        INSTANCE = new WayPointModule();
        int n27 = 5;
        n27 ^= 0xFFFFFF9E;
        int n28 = -17;
        n28 ^= 0x53;
        E = new Regex((String)Q[n27 ^= 0xFFFFFFAA] + (String)Q[n28 += 79]);
        int n29 = 87;
        n29 -= 65;
        int n30 = -85;
        n30 ^= 0x52;
        f = new Regex((String)Q[n29 += 10] + (String)Q[n30 -= -64]);
        int n31 = -123;
        n31 ^= 0xFFFFFFB7;
        int n32 = 92;
        n32 ^= 0x60;
        F = new Regex((String)Q[n31 += -31] + (String)Q[n32 -= -8]);
        int n33 = 305;
        n33 -= 121;
        int n34 = 162;
        n34 -= 83;
        g = new Regex((String)Q[n33 += -123] + (String)Q[n34 += -55], RegexOption.IGNORE_CASE);
        int n35 = -112;
        n35 ^= 0x29;
        Pair[] pairArray = new Pair[n35 += 77];
        int n36 = -119;
        n36 -= -115;
        n36 ^= 0xFFFFFFFC;
        int n37 = 26;
        n37 += -126;
        n37 += 109;
        int n38 = 63;
        n38 += 99;
        int n39 = 166;
        n39 -= 105;
        int n40 = 168;
        n40 -= 22;
        pairArray[n36] = TuplesKt.to((String)Q[n37] + (String)Q[n38 += -127], (String)Q[n39 += -60] + (String)Q[n40 -= 104]);
        int n41 = 110;
        n41 += -116;
        int n42 = 180;
        n42 += -83;
        int n43 = 169;
        n43 -= 38;
        pairArray[n41 += 7] = TuplesKt.to((String)Q[n42 ^= 0x7C], (String)Q[n43 += -64]);
        int n44 = 127;
        n44 ^= 0x5E;
        int n45 = -166;
        n45 -= -103;
        int n46 = 71;
        n46 ^= 3;
        pairArray[n44 += -31] = TuplesKt.to((String)Q[n45 ^= 0xFFFFFFE6], (String)Q[n46 -= 40]);
        int n47 = -146;
        n47 -= -99;
        int n48 = 115;
        n48 ^= 0x71;
        int n49 = 33;
        --n49;
        pairArray[n47 ^= 0xFFFFFFD2] = TuplesKt.to((String)Q[n48 += 5], (String)Q[n49 ^= 0x17]);
        int n50 = 114;
        n50 += -17;
        int n51 = 125;
        n51 += -39;
        int n52 = 93;
        n52 ^= 0xFFFFFF8B;
        pairArray[n50 ^= 0x65] = TuplesKt.to((String)Q[n51 += -56], (String)Q[n52 += 73]);
        int n53 = 57;
        n53 += -82;
        int n54 = -33;
        n54 ^= 0xFFFFFFB5;
        int n55 = -80;
        n55 -= -42;
        pairArray[n53 -= -30] = TuplesKt.to((String)Q[n54 += -59], (String)Q[n55 += 58]);
        G = CollectionsKt.listOf(pairArray);
        int n56 = 66;
        n56 ^= 0x58;
        n56 -= 13;
        int n57 = 42;
        n57 += 35;
        int n13 = -77;
        n13 = n13 ^ 0xFFFFFFCE;
        boolean bl2 = n13 - 124;
        h = INSTANCE.cfr_renamed_0((String)Q[n56] + (String)Q[n57 ^= 0x43], bl2);
        int n14 = 90;
        n14 ^= 0xFFFFFFEA;
        n14 -= -120;
        int n15 = -77;
        n15 ^= 0x36;
        int n17 = 110;
        n17 = n17 + -115;
        boolean bl3 = n17 ^ 0xFFFFFFFA;
        H = INSTANCE.cfr_renamed_0((String)Q[n14] + (String)Q[n15 ^= 0xFFFFFF97], bl3);
        int n18 = 83;
        n18 -= -21;
        n18 -= 94;
        int n19 = 2;
        n19 ^= 0x6B;
        int n21 = 97;
        n21 = n21 - 40;
        boolean bl4 = n21 ^ 0x39;
        i = INSTANCE.cfr_renamed_0((String)Q[n18] + (String)Q[n19 += -64], bl4);
        int n22 = 67;
        n22 += -60;
        int n23 = -125;
        n23 -= -118;
        int n24 = -39;
        n24 ^= 0xFFFFFFBE;
        I = INSTANCE.bind((String)Q[n22 -= -31] + (String)Q[n23 -= -77], n24 ^= 0xFFFFFF98);
        int n25 = -117;
        n25 += 4;
        int n26 = 172;
        n26 -= 33;
        int n58 = 1;
        n58 -= -5;
        j = INSTANCE.bind((String)Q[n25 ^= 0xFFFFFFA3] + (String)Q[n26 -= 75], n58 += -7);
        int n59 = 37;
        n59 -= 0;
        n59 += 15;
        int n60 = -164;
        n60 -= -49;
        int n62 = -39;
        n62 = n62 + -65;
        boolean bl5 = n62 ^ 0xFFFFFF99;
        J = INSTANCE.cfr_renamed_0((String)Q[n59] + (String)Q[n60 ^= 0xFFFFFFAC], bl5);
        int n63 = 22;
        n63 -= -117;
        int n64 = -42;
        n64 += 9;
        k = INSTANCE.slider((String)Q[n63 += -79] + (String)Q[n64 += 58], 3.0f, 0.0f, 10.0f, 1.0f).setVisible(WayPointModule::fadeWaypointHideDistance$lambda$0);
        int n65 = -40;
        n65 ^= 0x21;
        M = n65 ^= 6;
        INSTANCE.setVisibleInGui(WayPointModule::_init_$lambda$0);
        int n67 = -170;
        n67 = n67 + 123;
        boolean bl6 = n67 - -48;
        super.setEnabled(bl6);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = s;
        if (s == null) {
            objectArray = s = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                r = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0xA500 ^ 0xA510];
                byArray[0xFB94 ^ 0xFB9E] = 0xFFFF0421 ^ 0xFB9E;
                byArray[0x5AA3 ^ 0x5AAF] = 0xFFFFA515 ^ 0x5AAF;
                byArray[0x6BB ^ 0x6B4] = 0x6B0 ^ 0x6B4;
                byArray[0x3904 ^ 0x390F] = 0x3909 ^ 0x390F;
                byArray[0xBA3F ^ 0xBA3E] = 0xFFFF45C0 ^ 0xBA3E;
                byArray[0xC0C0 ^ 0xC0C8] = 0xFFFF3F61 ^ 0xC0C8;
                byArray[0x10167 ^ 0x10165] = 0x10162 ^ 0x10165;
                byArray[0xFF85 ^ 0xFF82] = 0xFFAF ^ 0xFF82;
                byArray[0xF71A ^ 0xF71A] = 0xFFFF08D3 ^ 0xF71A;
                byArray[0x109E4 ^ 0x109E0] = 0xFFFEF619 ^ 0x109E0;
                byArray[0x1BAD ^ 0x1BA8] = 0xFFFFE47A ^ 0x1BA8;
                byArray[0xB7C9 ^ 0xB7C4] = 0xFFFF482B ^ 0xB7C4;
                byArray[0x75ED ^ 0x75EE] = 0x75BB ^ 0x75EE;
                byArray[0xDEC ^ 0xDEA] = 0xDFB ^ 0xDEA;
                byArray[0x23BE ^ 0x23B0] = 0x23F8 ^ 0x23B0;
                byArray[0x64D4 ^ 0x64DD] = 0xFFFF9B74 ^ 0x64DD;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (R == null) {
                byte[] byArray2 = new byte[0x4120 ^ 0x4100];
                byArray2[0x29A0 ^ 0x29A9] = 0xFFFFD62E ^ 0x29A9;
                byArray2[0x69AB ^ 0x69A7] = 0xFFFF965A ^ 0x69A7;
                byArray2[0x1A2D ^ 0x1A27] = 0x1A61 ^ 0x1A27;
                byArray2[0x1BAD ^ 0x1BA9] = 0x1BF7 ^ 0x1BA9;
                byArray2[0x2FDD ^ 0x2FC0] = 0xFFFFD05C ^ 0x2FC0;
                byArray2[0x10AFB ^ 0x10AF3] = 0xFFFEF53E ^ 0x10AF3;
                byArray2[0x3BBD ^ 0x3BBB] = 0xFFFFC408 ^ 0x3BBB;
                byArray2[0x514A ^ 0x514B] = 0xFFFFAE88 ^ 0x514B;
                byArray2[0x1D3F ^ 0x1D38] = 0x1D28 ^ 0x1D38;
                byArray2[0x6E8F ^ 0x6E81] = 0xFFFF915B ^ 0x6E81;
                byArray2[0xB044 ^ 0xB049] = 0xB067 ^ 0xB049;
                byArray2[0xC37C ^ 0xC369] = 0xC32E ^ 0xC369;
                byArray2[0xDB50 ^ 0xDB5B] = 0xDB15 ^ 0xDB5B;
                byArray2[0x2329 ^ 0x2335] = 0xFFFFDCB5 ^ 0x2335;
                byArray2[0x75FB ^ 0x75EB] = 0xFFFF8A31 ^ 0x75EB;
                byArray2[0x5BF4 ^ 0x5BEA] = 0x5BBF ^ 0x5BEA;
                byArray2[0x8DEA ^ 0x8DF5] = 0x8DEF ^ 0x8DF5;
                byArray2[0xF719 ^ 0xF71B] = 0xFFFF08D0 ^ 0xF71B;
                byArray2[0x6631 ^ 0x662B] = 0x6645 ^ 0x662B;
                byArray2[0x6022 ^ 0x6036] = 0x6018 ^ 0x6036;
                byArray2[0x3D0F ^ 0x3D0C] = 0xFFFFC28E ^ 0x3D0C;
                byArray2[0x7DFD ^ 0x7DE4] = 0xFFFF8221 ^ 0x7DE4;
                byArray2[0xFF33 ^ 0xFF22] = 0xFFFF00F6 ^ 0xFF22;
                byArray2[0xA05 ^ 0xA1E] = 0xA1A ^ 0xA1E;
                byArray2[0x955B ^ 0x954C] = 0x952C ^ 0x954C;
                byArray2[0x9FC4 ^ 0x9FCB] = 0xFFFF604A ^ 0x9FCB;
                byArray2[0x40F ^ 0x417] = 0x40F ^ 0x417;
                byArray2[0x5AB7 ^ 0x5AA4] = 0x5AF8 ^ 0x5AA4;
                byArray2[0xD24B ^ 0xD24B] = 0xFFFF2DC0 ^ 0xD24B;
                byArray2[0xB677 ^ 0xB665] = 0xFFFF49CA ^ 0xB665;
                byArray2[0x12A1 ^ 0x12B7] = 0xFFFFED25 ^ 0x12B7;
                byArray2[0x99D5 ^ 0x99D0] = 0x999D ^ 0x99D0;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = WayPointModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u6a6c\u6a9a\u6903\u6a68\u68d6\u694a\u6967\u6b75\u6b98\u6b74\u68d4\u6b91\u6bbd\u6b8b\u68fb\u68d4\u6a9d\u694d".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 11269;
                        n3 -= 46535;
                        n3 += 2890;
                        n3 += 37296;
                        n3 ^= 0x19D1;
                        n3 ^= 0x7FF4;
                        n3 ^= 0x3534;
                        n3 += 59861;
                        n3 ^= 0xEFB6;
                        n3 += 7606;
                        n3 ^= 0xD6B7;
                        n3 -= 6936;
                        n3 -= 52731;
                        n3 += 65341;
                        n3 ^= 0xC29E;
                        cArray[i2] = (char)(n3 += 58719);
                    }
                    object4 = WayPointModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = -101;
                byArray4[11] = 50;
                byArray4[5] = 70;
                byArray4[6] = 104;
                byArray4[12] = -14;
                byArray4[14] = -104;
                byArray4[13] = 57;
                byArray4[9] = -22;
                byArray4[7] = 32;
                byArray4[2] = -36;
                byArray4[15] = -100;
                byArray4[3] = -73;
                byArray4[1] = 2;
                byArray4[4] = -47;
                byArray4[8] = -59;
                byArray4[0] = -74;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 10, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = WayPointModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u84d0\u84d4\u99c6".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0xF220;
                        n4 ^= 0x4364;
                        n4 += 22436;
                        n4 += 29226;
                        n4 -= 3083;
                        n4 -= 51343;
                        n4 -= 39728;
                        n4 -= 12562;
                        n4 ^= 0x9973;
                        n4 -= 65011;
                        n4 -= 42164;
                        n4 += 51286;
                        n4 ^= 0x3B59;
                        cArray[i3] = (char)(n4 ^= 0xD6BC);
                    }
                    object5 = WayPointModule.A()[2] = new String(cArray);
                }
                R = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = WayPointModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub1fb\ub1c7\ub1c5\u3b29\ub1f5\ub1f8\ub1f5\u3b29\ub1fe\ub1ed\ub1f5\ub1c5\u3b37\ub1fe\ub29b\ub29a\ub29a\ub1f3\ub29c\ub1f1".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 51908;
                    n5 ^= 0xCA5;
                    n5 += 30888;
                    n5 += 51787;
                    n5 -= 20719;
                    n5 ^= 0x2FF0;
                    n5 -= 5684;
                    n5 -= 3925;
                    n5 ^= 0xF7FB;
                    n5 += 60476;
                    n5 ^= 0xD89D;
                    n5 += 23743;
                    cArray[i4] = (char)(n5 ^= 0x5CFF);
                }
                object6 = WayPointModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)R), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = S;
        if (S == null) {
            S = new Object[4];
            objectArray = S;
        }
        return objectArray;
    }

    public static void b() {
        t = new int[0x4D7F ^ 0x4CEF];
        WayPointModule.t[0xB2F9 ^ 0xB20D] = 0xFFFF4DD0 ^ 0xB20D;
        WayPointModule.t[0x240A ^ 0x24C2] = 0x24B5 ^ 0x24C2;
        WayPointModule.t[0xBC53 ^ 0xBCA3] = 0xFFFF4342 ^ 0xBCA3;
        WayPointModule.t[0xCA0C ^ 0xCAE8] = 0xFFFF3540 ^ 0xCAE8;
        WayPointModule.t[0x684E ^ 0x681C] = 0x6820 ^ 0x681C;
        WayPointModule.t[0xB3F8 ^ 0xB3B6] = 0xFFFF4C43 ^ 0xB3B6;
        WayPointModule.t[0x86FB ^ 0x86AE] = 0x86CC ^ 0x86AE;
        WayPointModule.t[0xEDBB ^ 0xEDD1] = 0xFFFF1244 ^ 0xEDD1;
        WayPointModule.t[0x7076 ^ 0x70E2] = 0xFFFF8F5D ^ 0x70E2;
        WayPointModule.t[0x1E8D ^ 0x1FD9] = 0xFFFFE054 ^ 0x1FD9;
        WayPointModule.t[0x108EF ^ 0x109FF] = 0x109B7 ^ 0x109FF;
        WayPointModule.t[0xB1D0 ^ 0xB1A0] = 0xFFFF4E45 ^ 0xB1A0;
        WayPointModule.t[0xB8CB ^ 0xB859] = 0xFFFF47AC ^ 0xB859;
        WayPointModule.t[0x883B ^ 0x8834] = 0xFFFF7773 ^ 0x8834;
        WayPointModule.t[0x8CE2 ^ 0x8DDC] = 0x8DB5 ^ 0x8DDC;
        WayPointModule.t[0x21E5 ^ 0x2130] = 0x214B ^ 0x2130;
        WayPointModule.t[0x9897 ^ 0x9879] = 0xFFFF67F6 ^ 0x9879;
        WayPointModule.t[0xF79B ^ 0xF7F7] = 0xFFFF082A ^ 0xF7F7;
        WayPointModule.t[0x108A8 ^ 0x10894] = 0x108E6 ^ 0x10894;
        WayPointModule.t[0xE052 ^ 0xE0D0] = 0xFFFF1F66 ^ 0xE0D0;
        WayPointModule.t[0x4223 ^ 0x4361] = 0x4366 ^ 0x4361;
        WayPointModule.t[0xD038 ^ 0xD045] = 0xD018 ^ 0xD045;
        WayPointModule.t[0x7E94 ^ 0x7E8F] = 0x7ED5 ^ 0x7E8F;
        WayPointModule.t[0xA468 ^ 0xA429] = 0xA455 ^ 0xA429;
        WayPointModule.t[0x6FD6 ^ 0x6F9C] = 0x6FA5 ^ 0x6F9C;
        WayPointModule.t[0x48AF ^ 0x483F] = 0x4875 ^ 0x483F;
        WayPointModule.t[0x10809 ^ 0x108AB] = 0x1088E ^ 0x108AB;
        WayPointModule.t[0x3736 ^ 0x37F6] = 0x37A2 ^ 0x37F6;
        WayPointModule.t[0xE573 ^ 0xE511] = 0xFFFF1AF0 ^ 0xE511;
        WayPointModule.t[0x38E3 ^ 0x382A] = 0xFFFFC743 ^ 0x382A;
        WayPointModule.t[0xEFD0 ^ 0xEF54] = 0xFFFF1076 ^ 0xEF54;
        WayPointModule.t[0xF248 ^ 0xF2FE] = 0xF2D2 ^ 0xF2FE;
        WayPointModule.t[0x84CD ^ 0x843E] = 0xFFFF7BD0 ^ 0x843E;
        WayPointModule.t[0x10483 ^ 0x104D8] = 0x104AD ^ 0x104D8;
        WayPointModule.t[0xC77D ^ 0xC7F1] = 0xFFFF3827 ^ 0xC7F1;
        WayPointModule.t[0x6C5 ^ 0x602] = 0xFFFFF9FB ^ 0x602;
        WayPointModule.t[0xD1D8 ^ 0xD1E7] = 0xFFFF2E5D ^ 0xD1E7;
        WayPointModule.t[0x10A0E ^ 0x10A4D] = 0xFFFEF5E3 ^ 0x10A4D;
        WayPointModule.t[0x91AA ^ 0x909D] = 0xFFFF6F5F ^ 0x909D;
        WayPointModule.t[0xAE8F ^ 0xAEF6] = 0xAEF5 ^ 0xAEF6;
        WayPointModule.t[0x4F7E ^ 0x4F57] = 0xFFFFB0D5 ^ 0x4F57;
        WayPointModule.t[0xDE68 ^ 0xDFEE] = 0xFFFF2039 ^ 0xDFEE;
        WayPointModule.t[0xD456 ^ 0xD55F] = 0xFFFF2A83 ^ 0xD55F;
        WayPointModule.t[0x27F3 ^ 0x26C8] = 0x268F ^ 0x26C8;
        WayPointModule.t[0x4C57 ^ 0x4C87] = 0xFFFFB378 ^ 0x4C87;
        WayPointModule.t[0xFC7C ^ 0xFD26] = 0xFD21 ^ 0xFD26;
        WayPointModule.t[0x90E4 ^ 0x91F3] = 0x91C6 ^ 0x91F3;
        WayPointModule.t[0xF597 ^ 0xF588] = 0xF5D9 ^ 0xF588;
        WayPointModule.t[0x5E4F ^ 0x5E16] = 0x5E6C ^ 0x5E16;
        WayPointModule.t[0x52C6 ^ 0x521A] = 0xFFFFADCD ^ 0x521A;
        WayPointModule.t[0x10E2 ^ 0x1026] = 0x107F ^ 0x1026;
        WayPointModule.t[0x2548 ^ 0x247E] = 0x242F ^ 0x247E;
        WayPointModule.t[0xCEB3 ^ 0xCF39] = 0xFFFF30CE ^ 0xCF39;
        WayPointModule.t[0xF18F ^ 0xF174] = 0xF159 ^ 0xF174;
        WayPointModule.t[0xE3DF ^ 0xE345] = 0xFFFF1C8B ^ 0xE345;
        WayPointModule.t[0xAF92 ^ 0xAE9D] = 0xFFFF5102 ^ 0xAE9D;
        WayPointModule.t[0xA752 ^ 0xA76B] = 0xFFFF5881 ^ 0xA76B;
        WayPointModule.t[0xE9C2 ^ 0xE9DC] = 0xFFFF1633 ^ 0xE9DC;
        WayPointModule.t[0x5CC ^ 0x4E4] = 0xFFFFFB44 ^ 0x4E4;
        WayPointModule.t[0x10065 ^ 0x10140] = 0x1015E ^ 0x10140;
        WayPointModule.t[0x79C8 ^ 0x7922] = 0x791B ^ 0x7922;
        WayPointModule.t[0x1FAA ^ 0x1EA8] = 0xFFFFE157 ^ 0x1EA8;
        WayPointModule.t[0x900C ^ 0x909D] = 0xFFFF6F20 ^ 0x909D;
        WayPointModule.t[0x220C ^ 0x2387] = 0xFFFFDC35 ^ 0x2387;
        WayPointModule.t[0x10B5 ^ 0x103C] = 0x1053 ^ 0x103C;
        WayPointModule.t[0x169B ^ 0x16EF] = 0xFFFFE90A ^ 0x16EF;
        WayPointModule.t[0x375A ^ 0x376B] = 0xFFFFC8E4 ^ 0x376B;
        WayPointModule.t[0x5C5B ^ 0x5D35] = 0x5D59 ^ 0x5D35;
        WayPointModule.t[0x3C72 ^ 0x3C7E] = 0xFFFFC3D0 ^ 0x3C7E;
        WayPointModule.t[0x97EE ^ 0x9790] = 0xFFFF6847 ^ 0x9790;
        WayPointModule.t[0x8E00 ^ 0x8E25] = 0x8E20 ^ 0x8E25;
        WayPointModule.t[0x798 ^ 0x7CB] = 0xFFFFF879 ^ 0x7CB;
        WayPointModule.t[0x4D50 ^ 0x4DD6] = 0xFFFFB243 ^ 0x4DD6;
        WayPointModule.t[0x43A4 ^ 0x4342] = 0x4375 ^ 0x4342;
        WayPointModule.t[0x23A2 ^ 0x2378] = 0xFFFFDCE8 ^ 0x2378;
        WayPointModule.t[0x42B9 ^ 0x4259] = 0xFFFFBDBD ^ 0x4259;
        WayPointModule.t[0xBA8B ^ 0xBBD6] = 0xBB81 ^ 0xBBD6;
        WayPointModule.t[0xF4F7 ^ 0xF462] = 0xFFFF0BBD ^ 0xF462;
        WayPointModule.t[0x8F8 ^ 0x9F2] = 0x9A1 ^ 0x9F2;
        WayPointModule.t[0x302F ^ 0x304B] = 0x301F ^ 0x304B;
        WayPointModule.t[0xAC2C ^ 0xACA3] = 0xFFFF534A ^ 0xACA3;
        WayPointModule.t[0x188C ^ 0x19E5] = 0x19FD ^ 0x19E5;
        WayPointModule.t[0x7D79 ^ 0x7DA0] = 0x7DB7 ^ 0x7DA0;
        WayPointModule.t[0x8183 ^ 0x81B3] = 0xFFFF7E9A ^ 0x81B3;
        WayPointModule.t[0x28D3 ^ 0x28EB] = 0x28A1 ^ 0x28EB;
        WayPointModule.t[0xC2D5 ^ 0xC272] = 0xFFFF3DC7 ^ 0xC272;
        WayPointModule.t[0xFF28 ^ 0xFE32] = 0xFFFF0156 ^ 0xFE32;
        WayPointModule.t[0xFD3B ^ 0xFD54] = 0xFD06 ^ 0xFD54;
        WayPointModule.t[0x90F9 ^ 0x90E1] = 0xFFFF6F32 ^ 0x90E1;
        WayPointModule.t[0x1B51 ^ 0x1BC8] = 0xFFFFE42A ^ 0x1BC8;
        WayPointModule.t[0x78DC ^ 0x78D7] = 0x78B0 ^ 0x78D7;
        WayPointModule.t[0xAD1A ^ 0xAC12] = 0xAC03 ^ 0xAC12;
        WayPointModule.t[0x10A8F ^ 0x10BA2] = 0x10BC5 ^ 0x10BA2;
        WayPointModule.t[0xB13C ^ 0xB1C3] = 0xFFFF4E6A ^ 0xB1C3;
        WayPointModule.t[0xC7EE ^ 0xC7B6] = 0xC7C0 ^ 0xC7B6;
        WayPointModule.t[0x350 ^ 0x215] = 0x22C ^ 0x215;
        WayPointModule.t[0x2A33 ^ 0x2B20] = 0xFFFFD4F0 ^ 0x2B20;
        WayPointModule.t[0x964E ^ 0x9736] = 0x9714 ^ 0x9736;
        WayPointModule.t[0x4345 ^ 0x4398] = 0x4395 ^ 0x4398;
        WayPointModule.t[0x9118 ^ 0x914F] = 0xFFFF6E05 ^ 0x914F;
        WayPointModule.t[0x6AC9 ^ 0x6A21] = 0xFFFF95A6 ^ 0x6A21;
        WayPointModule.t[0xB174 ^ 0xB06D] = 0xFFFF4FE7 ^ 0xB06D;
        WayPointModule.t[0x82A1 ^ 0x82AF] = 0xFFFF7D52 ^ 0x82AF;
        WayPointModule.t[0x2077 ^ 0x208E] = 0xFFFFDF78 ^ 0x208E;
        WayPointModule.t[0xB499 ^ 0xB5E5] = 0xB5F9 ^ 0xB5E5;
        WayPointModule.t[0xE4EA ^ 0xE4FA] = 0xFFFF1B6F ^ 0xE4FA;
        WayPointModule.t[0xA4ED ^ 0xA40E] = 0xFFFF5BB9 ^ 0xA40E;
        WayPointModule.t[0x9EB1 ^ 0x9F32] = 0xFFFF60CE ^ 0x9F32;
        WayPointModule.t[0x3267 ^ 0x325A] = 0x3256 ^ 0x325A;
        WayPointModule.t[0x10F77 ^ 0x10F0B] = 0xFFFEF0B5 ^ 0x10F0B;
        WayPointModule.t[0x8FAD ^ 0x8E25] = 0xFFFF71E7 ^ 0x8E25;
        WayPointModule.t[0xC00C ^ 0xC064] = 0xFFFF3FFC ^ 0xC064;
        WayPointModule.t[0x5714 ^ 0x5694] = 0xFFFFA910 ^ 0x5694;
        WayPointModule.t[0x1F8C ^ 0x1EDD] = 0xFFFFE172 ^ 0x1EDD;
        WayPointModule.t[0xEDF3 ^ 0xED20] = 0xFFFF12ED ^ 0xED20;
        WayPointModule.t[0xF9D ^ 0xF84] = 0xFA7 ^ 0xF84;
        WayPointModule.t[0x7100 ^ 0x7031] = 0xFFFF8FAB ^ 0x7031;
        WayPointModule.t[0x5574 ^ 0x5574] = 0x5593 ^ 0x5574;
        WayPointModule.t[0xF037 ^ 0xF02B] = 0xFFFF0FA0 ^ 0xF02B;
        WayPointModule.t[0xA660 ^ 0xA69C] = 0xA6A4 ^ 0xA69C;
        WayPointModule.t[0x2947 ^ 0x29F0] = 0x29B0 ^ 0x29F0;
        WayPointModule.t[0x91D1 ^ 0x91E5] = 0xFFFF6E4B ^ 0x91E5;
        WayPointModule.t[0xC92C ^ 0xC874] = 0xC81B ^ 0xC874;
        WayPointModule.t[0x7BBC ^ 0x7BEA] = 0x7BBF ^ 0x7BEA;
        WayPointModule.t[0x54AE ^ 0x5529] = 0x553C ^ 0x5529;
        WayPointModule.t[0xC095 ^ 0xC0DC] = 0xC08D ^ 0xC0DC;
        WayPointModule.t[0xFB2E ^ 0xFA70] = 0xFA57 ^ 0xFA70;
        WayPointModule.t[0xF407 ^ 0xF58B] = 0xF5D7 ^ 0xF58B;
        WayPointModule.t[0xC394 ^ 0xC281] = 0xC2A7 ^ 0xC281;
        WayPointModule.t[0x1013C ^ 0x1001A] = 0xFFFEFFB9 ^ 0x1001A;
        WayPointModule.t[0xFFA2 ^ 0xFF29] = 0xFFFF00C7 ^ 0xFF29;
        WayPointModule.t[0x7EEF ^ 0x7E34] = 0xFFFF81D2 ^ 0x7E34;
        WayPointModule.t[0x106AC ^ 0x107DC] = 0x107F2 ^ 0x107DC;
        WayPointModule.t[0xC010 ^ 0xC158] = 0xFFFF3E96 ^ 0xC158;
        WayPointModule.t[0xE5C3 ^ 0xE5E3] = 0xFFFF1A5E ^ 0xE5E3;
        WayPointModule.t[0xC7EF ^ 0xC747] = 0xC7D2 ^ 0xC747;
        WayPointModule.t[0x58D2 ^ 0x5853] = 0xFFFFA7D9 ^ 0x5853;
        WayPointModule.t[0xD9FA ^ 0xD90F] = 0xFFFF26E4 ^ 0xD90F;
        WayPointModule.t[0xA0A4 ^ 0xA1A7] = 0xFFFF5E2C ^ 0xA1A7;
        WayPointModule.t[0x9767 ^ 0x97C7] = 0x97AD ^ 0x97C7;
        WayPointModule.t[0x1064D ^ 0x1077E] = 0xFFFEF8D0 ^ 0x1077E;
        WayPointModule.t[0x64D8 ^ 0x649E] = 0x64EE ^ 0x649E;
        WayPointModule.t[0x8E65 ^ 0x8EAE] = 0x8EDA ^ 0x8EAE;
        WayPointModule.t[0x1B9F ^ 0x1B67] = 0xFFFFE4F1 ^ 0x1B67;
        WayPointModule.t[0x10E2B ^ 0x10E8D] = 0xFFFEF153 ^ 0x10E8D;
        WayPointModule.t[0x4EDE ^ 0x4E0F] = 0x4E4C ^ 0x4E0F;
        WayPointModule.t[0x2282 ^ 0x2389] = 0x2306 ^ 0x2389;
        WayPointModule.t[0x411D ^ 0x418E] = 0x41ED ^ 0x418E;
        WayPointModule.t[0x16AB ^ 0x17FC] = 0x1798 ^ 0x17FC;
        WayPointModule.t[0xE283 ^ 0xE3E2] = 0xE39E ^ 0xE3E2;
        WayPointModule.t[0x36EA ^ 0x36EE] = 0xFFFFC94D ^ 0x36EE;
        WayPointModule.t[0x4F47 ^ 0x4F0B] = 0x4F5A ^ 0x4F0B;
        WayPointModule.t[0xAC06 ^ 0xAC52] = 0xAC69 ^ 0xAC52;
        WayPointModule.t[0x1FD7 ^ 0x1F09] = 0xFFFFE060 ^ 0x1F09;
        WayPointModule.t[0xAFFA ^ 0xAEDB] = 0xAEEB ^ 0xAEDB;
        WayPointModule.t[0x6053 ^ 0x6142] = 0xFFFF9EE1 ^ 0x6142;
        WayPointModule.t[0x38BF ^ 0x381E] = 0x3821 ^ 0x381E;
        WayPointModule.t[0xE8BC ^ 0xE8D5] = 0xE8F5 ^ 0xE8D5;
        WayPointModule.t[0x3E69 ^ 0x3E44] = 0xFFFFC1ED ^ 0x3E44;
        WayPointModule.t[0x9506 ^ 0x95C0] = 0xFFFF6A42 ^ 0x95C0;
        WayPointModule.t[0xB827 ^ 0xB850] = 0xB80A ^ 0xB850;
        WayPointModule.t[0x21C2 ^ 0x2173] = 0xFFFFDEC5 ^ 0x2173;
        WayPointModule.t[0x6880 ^ 0x684A] = 0xFFFF97B7 ^ 0x684A;
        WayPointModule.t[0x20D1 ^ 0x202C] = 0xFFFFDFB4 ^ 0x202C;
        WayPointModule.t[0x1304 ^ 0x1332] = 0x1336 ^ 0x1332;
        WayPointModule.t[0x8188 ^ 0x809A] = 0xFFFF7F09 ^ 0x809A;
        WayPointModule.t[0xF0BB ^ 0xF0FF] = 0xF0BE ^ 0xF0FF;
        WayPointModule.t[0x7EE2 ^ 0x7FAC] = 0x7FDC ^ 0x7FAC;
        WayPointModule.t[0x3708 ^ 0x3667] = 0xFFFFC9D8 ^ 0x3667;
        WayPointModule.t[0x7B34 ^ 0x7A61] = 0x7A1F ^ 0x7A61;
        WayPointModule.t[0xF8AD ^ 0xF88A] = 0xFFFF07FE ^ 0xF88A;
        WayPointModule.t[0x5380 ^ 0x52A3] = 0x52EA ^ 0x52A3;
        WayPointModule.t[0x5D11 ^ 0x5C14] = 0x5C22 ^ 0x5C14;
        WayPointModule.t[0x10217 ^ 0x10363] = 0xFFFEFCFA ^ 0x10363;
        WayPointModule.t[0x6469 ^ 0x6426] = 0xFFFF9BE1 ^ 0x6426;
        WayPointModule.t[0x45E6 ^ 0x4559] = 0xFFFFBAB9 ^ 0x4559;
        WayPointModule.t[0xF1E ^ 0xF3D] = 0xFFFFF0CE ^ 0xF3D;
        WayPointModule.t[0xBF3F ^ 0xBE55] = 0xBE7D ^ 0xBE55;
        WayPointModule.t[0x7B54 ^ 0x7A0F] = 0xFFFF85CB ^ 0x7A0F;
        WayPointModule.t[0xDD26 ^ 0xDC3B] = 0xDC2A ^ 0xDC3B;
        WayPointModule.t[0xD5FC ^ 0xD47E] = 0xD425 ^ 0xD47E;
        WayPointModule.t[0x571A ^ 0x5771] = 0xFFFFA885 ^ 0x5771;
        WayPointModule.t[0xA0 ^ 4] = 0x78 ^ 4;
        WayPointModule.t[0xBBCC ^ 0xBBD6] = 0xFFFF4446 ^ 0xBBD6;
        WayPointModule.t[0x64E5 ^ 0x64DE] = 0xFFFF9B66 ^ 0x64DE;
        WayPointModule.t[0xB6C4 ^ 0xB6F7] = 0xFFFF4913 ^ 0xB6F7;
        WayPointModule.t[0x204A ^ 0x2062] = 0xFFFFDF88 ^ 0x2062;
        WayPointModule.t[0x10958 ^ 0x1092B] = 0x10958 ^ 0x1092B;
        WayPointModule.t[0x843F ^ 0x84B2] = 0x84D3 ^ 0x84B2;
        WayPointModule.t[0x96A9 ^ 0x96BC] = 0x968D ^ 0x96BC;
        WayPointModule.t[0x72BF ^ 0x73F9] = 0x73C6 ^ 0x73F9;
        WayPointModule.t[0xD72C ^ 0xD7C3] = 0xD7AB ^ 0xD7C3;
        WayPointModule.t[0x55E1 ^ 0x55E4] = 0x55A9 ^ 0x55E4;
        WayPointModule.t[0x53F8 ^ 0x52D6] = 0xFFFFAD63 ^ 0x52D6;
        WayPointModule.t[0x1068E ^ 0x107CE] = 0xFFFEF829 ^ 0x107CE;
        WayPointModule.t[0x10A6B ^ 0x10B4C] = 0xFFFEF4B1 ^ 0x10B4C;
        WayPointModule.t[0xBCC4 ^ 0xBCBC] = 0xBCF7 ^ 0xBCBC;
        WayPointModule.t[0xBB40 ^ 0xBBB6] = 0xBB6F ^ 0xBBB6;
        WayPointModule.t[0xD4DE ^ 0xD41C] = 0xFFFF2B8D ^ 0xD41C;
        WayPointModule.t[0x8AC7 ^ 0x8AE1] = 0xFFFF757B ^ 0x8AE1;
        WayPointModule.t[0x3935 ^ 0x3807] = 0x3869 ^ 0x3807;
        WayPointModule.t[0xC286 ^ 0xC387] = 0xFFFF3C4E ^ 0xC387;
        WayPointModule.t[0x4E34 ^ 0x4F52] = 0xFFFFB0DD ^ 0x4F52;
        WayPointModule.t[0x197A ^ 0x19CA] = 0x19D2 ^ 0x19CA;
        WayPointModule.t[0x1C88 ^ 0x1C50] = 0xFFFFE39F ^ 0x1C50;
        WayPointModule.t[0x165E ^ 0x1745] = 0xFFFFE8D6 ^ 0x1745;
        WayPointModule.t[0xC9B2 ^ 0xC837] = 0xFFFF37F6 ^ 0xC837;
        WayPointModule.t[0x5375 ^ 0x5384] = 0x53D6 ^ 0x5384;
        WayPointModule.t[0xB91E ^ 0xB924] = 0xFFFF46EB ^ 0xB924;
        WayPointModule.t[0x512F ^ 0x51A1] = 0x51D7 ^ 0x51A1;
        WayPointModule.t[0x6DAC ^ 0x6CC7] = 0x6CDE ^ 0x6CC7;
        WayPointModule.t[0xE417 ^ 0xE593] = 0xFFFF1A2E ^ 0xE593;
        WayPointModule.t[0x19F0 ^ 0x18FD] = 0x18D7 ^ 0x18FD;
        WayPointModule.t[0x34C4 ^ 0x34A4] = 0x343E ^ 0x34A4;
        WayPointModule.t[0x4088 ^ 0x41BD] = 0xFFFFBECF ^ 0x41BD;
        WayPointModule.t[0xAE1C ^ 0xAE4D] = 0xFFFF51D9 ^ 0xAE4D;
        WayPointModule.t[0x5D2E ^ 0x5DD0] = 0xFFFFA217 ^ 0x5DD0;
        WayPointModule.t[0xE837 ^ 0xE848] = 0xFFFF17B5 ^ 0xE848;
        WayPointModule.t[0x147F ^ 0x150C] = 0xFFFFEA97 ^ 0x150C;
        WayPointModule.t[0x10719 ^ 0x1079E] = 0x107FD ^ 0x1079E;
        WayPointModule.t[0x2001 ^ 0x20AE] = 0xFFFFDF04 ^ 0x20AE;
        WayPointModule.t[0xA540 ^ 0xA527] = 0xFFFF5A9B ^ 0xA527;
        WayPointModule.t[0x4447 ^ 0x445A] = 0x4461 ^ 0x445A;
        WayPointModule.t[0x72F1 ^ 0x7248] = 0x7241 ^ 0x7248;
        WayPointModule.t[0x4BB3 ^ 0x4AAB] = 0xFFFFB515 ^ 0x4AAB;
        WayPointModule.t[0xC99F ^ 0xC9CF] = 0xC9B6 ^ 0xC9CF;
        WayPointModule.t[0x4E0D ^ 0x4F22] = 0xFFFFB0A9 ^ 0x4F22;
        WayPointModule.t[0x106AB ^ 0x106BC] = 0xFFFEF979 ^ 0x106BC;
        WayPointModule.t[0xBA25 ^ 0xBB1D] = 0xFFFF44EA ^ 0xBB1D;
        WayPointModule.t[0x8325 ^ 0x8205] = 0x823D ^ 0x8205;
        WayPointModule.t[0x55E4 ^ 0x54A9] = 0x54B5 ^ 0x54A9;
        WayPointModule.t[0xB43F ^ 0xB465] = 0xFFFF4BD2 ^ 0xB465;
        WayPointModule.t[0xAF82 ^ 0xAE82] = 0xAEA3 ^ 0xAE82;
        WayPointModule.t[0x1040B ^ 0x10401] = 0x10473 ^ 0x10401;
        WayPointModule.t[0x4679 ^ 0x46C5] = 0xFFFFB971 ^ 0x46C5;
        WayPointModule.t[0x6A3D ^ 0x6A4B] = 0x6A6E ^ 0x6A4B;
        WayPointModule.t[0x861C ^ 0x8750] = 0x8738 ^ 0x8750;
        WayPointModule.t[0x6A0A ^ 0x6B78] = 0xFFFF9485 ^ 0x6B78;
        WayPointModule.t[0xC6E ^ 0xD4C] = 0xFFFFF2BF ^ 0xD4C;
        WayPointModule.t[0x8DE8 ^ 0x8D27] = 0xFFFF7299 ^ 0x8D27;
        WayPointModule.t[0x548E ^ 0x5507] = 0x5574 ^ 0x5507;
        WayPointModule.t[0x4117 ^ 0x41BA] = 0x418E ^ 0x41BA;
        WayPointModule.t[0x3706 ^ 0x37A8] = 0x37D8 ^ 0x37A8;
        WayPointModule.t[0xC562 ^ 0xC458] = 0xFFFF3BBF ^ 0xC458;
        WayPointModule.t[0xFDCA ^ 0xFD56] = 0xFFFF02DA ^ 0xFD56;
        WayPointModule.t[0xC211 ^ 0xC375] = 0xC36F ^ 0xC375;
        WayPointModule.t[0xCCE ^ 0xDD1] = 0xFFFFF24E ^ 0xDD1;
        WayPointModule.t[0xC951 ^ 0xC920] = 0xFFFF36B3 ^ 0xC920;
        WayPointModule.t[0xEAC4 ^ 0xEAEA] = 0xFFFF1552 ^ 0xEAEA;
        WayPointModule.t[0x22E4 ^ 0x2206] = 0xFFFFDDEA ^ 0x2206;
        WayPointModule.t[0x376B ^ 0x361E] = 0xFFFFC9F0 ^ 0x361E;
        WayPointModule.t[0x2CB0 ^ 0x2C2D] = 0x2C1C ^ 0x2C2D;
        WayPointModule.t[0xA43C ^ 0xA481] = 0xA4BD ^ 0xA481;
        WayPointModule.t[0x607E ^ 0x6013] = 0x605B ^ 0x6013;
        WayPointModule.t[0x87BE ^ 0x86F9] = 0x8686 ^ 0x86F9;
        WayPointModule.t[0x4959 ^ 0x4998] = 0xFFFFB65D ^ 0x4998;
        WayPointModule.t[0xFDFC ^ 0xFDF4] = 0xFDC0 ^ 0xFDF4;
        WayPointModule.t[0x8B23 ^ 0x8B98] = 0xFFFF7423 ^ 0x8B98;
        WayPointModule.t[0xB749 ^ 0xB7D6] = 0xB75F ^ 0xB7D6;
        WayPointModule.t[0xE574 ^ 0xE541] = 0xE557 ^ 0xE541;
        WayPointModule.t[0x3CE1 ^ 0x3CCA] = 0x3CCA ^ 0x3CCA;
        WayPointModule.t[0x1155 ^ 0x1023] = 0xFFFFEF8A ^ 0x1023;
        WayPointModule.t[0x4EEE ^ 0x4F8B] = 0x4FE7 ^ 0x4F8B;
        WayPointModule.t[0x2778 ^ 0x263B] = 0x2656 ^ 0x263B;
        WayPointModule.t[0x6DFB ^ 0x6D45] = 0xFFFF92A3 ^ 0x6D45;
        WayPointModule.t[0x213A ^ 0x2065] = 0x2062 ^ 0x2065;
        WayPointModule.t[0x8CCC ^ 0x8CAD] = 0x8C94 ^ 0x8CAD;
        WayPointModule.t[0xD0ED ^ 0xD09F] = 0xD0C5 ^ 0xD09F;
        WayPointModule.t[0x10BC5 ^ 0x10BCC] = 0x10BC7 ^ 0x10BCC;
        WayPointModule.t[0xB540 ^ 0xB412] = 0xFFFF4B88 ^ 0xB412;
        WayPointModule.t[0x936B ^ 0x93BD] = 0xFFFF6C76 ^ 0x93BD;
        WayPointModule.t[0x18AA ^ 0x1810] = 0x181F ^ 0x1810;
        WayPointModule.t[0x9A8C ^ 0x9AAE] = 0x9AC8 ^ 0x9AAE;
        WayPointModule.t[0x1C97 ^ 0x1CE2] = 0x1C65 ^ 0x1CE2;
        WayPointModule.t[0x9EB1 ^ 0x9FE1] = 0xFFFF600A ^ 0x9FE1;
        WayPointModule.t[0xFA9F ^ 0xFA98] = 0xFFFF0533 ^ 0xFA98;
        WayPointModule.t[0x2577 ^ 0x2575] = 0xFFFFDAE3 ^ 0x2575;
        WayPointModule.t[0x157D ^ 0x15BE] = 0x159E ^ 0x15BE;
        WayPointModule.t[0xDA12 ^ 0xDB58] = 0xDB1C ^ 0xDB58;
        WayPointModule.t[0x37E0 ^ 0x368C] = 0xFFFFC979 ^ 0x368C;
        WayPointModule.t[0xF1A3 ^ 0xF0CB] = 0xF08B ^ 0xF0CB;
        WayPointModule.t[0xB7C9 ^ 0xB7D8] = 0xFFFF486B ^ 0xB7D8;
        WayPointModule.t[0x3AE4 ^ 0x3A41] = 0x3A4A ^ 0x3A41;
        WayPointModule.t[0xEAF8 ^ 0xEAC6] = 0xEAB8 ^ 0xEAC6;
        WayPointModule.t[0xB1CF ^ 0xB0B4] = 0xFFFF4F7A ^ 0xB0B4;
        WayPointModule.t[0x33A5 ^ 0x337A] = 0xFFFFCCDF ^ 0x337A;
        WayPointModule.t[0x2AAB ^ 0x2A08] = 0x2A52 ^ 0x2A08;
        WayPointModule.t[0xD2EE ^ 0xD242] = 0xFFFF2DCF ^ 0xD242;
        WayPointModule.t[0x67C ^ 0x725] = 0xFFFFF89B ^ 0x725;
        WayPointModule.t[0x2FCF ^ 0x2F7D] = 0xFFFFD0A6 ^ 0x2F7D;
        WayPointModule.t[0xDFB8 ^ 0xDE39] = 0xFFFF21E6 ^ 0xDE39;
        WayPointModule.t[0x10A43 ^ 0x10A71] = 0xFFFEF5E4 ^ 0x10A71;
        WayPointModule.t[0xBD05 ^ 0xBD63] = 0xFFFF4229 ^ 0xBD63;
        WayPointModule.t[0x7A35 ^ 0x7A81] = 0xFFFF855E ^ 0x7A81;
        WayPointModule.t[0xC5E9 ^ 0xC55C] = 0xFFFF3AB7 ^ 0xC55C;
        WayPointModule.t[0x7E78 ^ 0x7E99] = 0x7EE4 ^ 0x7E99;
        WayPointModule.t[0x7BDF ^ 0x7B49] = 0xFFFF84D5 ^ 0x7B49;
        WayPointModule.t[0x241C ^ 0x2466] = 0xFFFFDBDE ^ 0x2466;
        WayPointModule.t[0xFCD ^ 0xF86] = 0xF4A ^ 0xF86;
        WayPointModule.t[0xCBB4 ^ 0xCA9E] = 0xCABF ^ 0xCA9E;
        WayPointModule.t[0x6E7F ^ 0x6E1A] = 0xFFFF91DB ^ 0x6E1A;
        WayPointModule.t[0xE866 ^ 0xE82B] = 0xFFFF17A5 ^ 0xE82B;
        WayPointModule.t[0x756E ^ 0x75C4] = 0xFFFF8A76 ^ 0x75C4;
        WayPointModule.t[0xB1CA ^ 0xB1CB] = 0xB1A3 ^ 0xB1CB;
        WayPointModule.t[0xEEBC ^ 0xEE79] = 0xFFFF11BF ^ 0xEE79;
        WayPointModule.t[0xCC5F ^ 0xCD6B] = 0xCD49 ^ 0xCD6B;
        WayPointModule.t[0xB326 ^ 0xB259] = 0xB267 ^ 0xB259;
        WayPointModule.t[0x330E ^ 0x338B] = 0xFFFFCC00 ^ 0x338B;
        WayPointModule.t[0xF4B7 ^ 0xF4D9] = 0xFFFF0B4B ^ 0xF4D9;
        WayPointModule.t[0x10691 ^ 0x1066B] = 0xFFFEF9A3 ^ 0x1066B;
        WayPointModule.t[0xD1E6 ^ 0xD132] = 0xFFFF2EBE ^ 0xD132;
        WayPointModule.t[0xD88C ^ 0xD8D1] = 0xD88F ^ 0xD8D1;
        WayPointModule.t[0xBDBB ^ 0xBD50] = 0xFFFF42DB ^ 0xBD50;
        WayPointModule.t[0x107A6 ^ 0x106C6] = 0x106BD ^ 0x106C6;
        WayPointModule.t[0xA962 ^ 0xA92A] = 0xA933 ^ 0xA92A;
        WayPointModule.t[0x7492 ^ 0x75FF] = 0x75F3 ^ 0x75FF;
        WayPointModule.t[0x5D06 ^ 0x5C12] = 0xFFFFA3C2 ^ 0x5C12;
        WayPointModule.t[0x4F38 ^ 0x4E05] = 0x4E4B ^ 0x4E05;
        WayPointModule.t[0xA92C ^ 0xA994] = 0xFFFF565E ^ 0xA994;
        WayPointModule.t[0x9C1 ^ 0x92D] = 0xFFFFF6E9 ^ 0x92D;
        WayPointModule.t[0xC370 ^ 0xC277] = 0xFFFF3DC6 ^ 0xC277;
        WayPointModule.t[0x508 ^ 0x41E] = 0x412 ^ 0x41E;
        WayPointModule.t[0x6F47 ^ 0x6F6B] = 0x6F30 ^ 0x6F6B;
        WayPointModule.t[0xE6BF ^ 0xE731] = 0xFFFF18D0 ^ 0xE731;
        WayPointModule.t[0xDC32 ^ 0xDCC5] = 0xDC96 ^ 0xDCC5;
        WayPointModule.t[0xDF1B ^ 0xDF3A] = 0xDF60 ^ 0xDF3A;
        WayPointModule.t[0x1FEC ^ 0x1FAE] = 0xFFFFE00E ^ 0x1FAE;
        WayPointModule.t[0x3861 ^ 0x3967] = 0x395A ^ 0x3967;
        WayPointModule.t[0x9F90 ^ 0x9EEE] = 0xFFFF6129 ^ 0x9EEE;
        WayPointModule.t[0xCF01 ^ 0xCF89] = 0xCF84 ^ 0xCF89;
        WayPointModule.t[0x7A72 ^ 0x7AD9] = 0xFFFF8560 ^ 0x7AD9;
        WayPointModule.t[0xD07D ^ 0xD142] = 0xFFFF2ECC ^ 0xD142;
        WayPointModule.t[0xF3BE ^ 0xF2CF] = 0xFFFF0D52 ^ 0xF2CF;
        WayPointModule.t[0x63E2 ^ 0x63D5] = 0xFFFF9C6C ^ 0x63D5;
        WayPointModule.t[0xED07 ^ 0xEC2B] = 0xFFFF1365 ^ 0xEC2B;
        WayPointModule.t[0x4B31 ^ 0x4A2F] = 0x4A7F ^ 0x4A2F;
        WayPointModule.t[0x5AF7 ^ 0x5AA9] = 0x5AC3 ^ 0x5AA9;
        WayPointModule.t[0xC4FD ^ 0xC40F] = 0xFFFF3B9C ^ 0xC40F;
        WayPointModule.t[0xB394 ^ 0xB387] = 0xB3DE ^ 0xB387;
        WayPointModule.t[0x5DD2 ^ 0x5D00] = 0x5DA9 ^ 0x5D00;
        WayPointModule.t[0xE73A ^ 0xE67E] = 0xE664 ^ 0xE67E;
        WayPointModule.t[0x4589 ^ 0x4584] = 0x45D6 ^ 0x4584;
        WayPointModule.t[0x1AFC ^ 0x1A6B] = 0x1A36 ^ 0x1A6B;
        WayPointModule.t[0x9227 ^ 0x9221] = 0xFFFF6DFE ^ 0x9221;
        WayPointModule.t[0xF40F ^ 0xF4E6] = 0xFFFF0B27 ^ 0xF4E6;
        WayPointModule.t[0xC68 ^ 0xC42] = 0xC18 ^ 0xC42;
        WayPointModule.t[0xC78E ^ 0xC7A1] = 0xFFFF3870 ^ 0xC7A1;
        WayPointModule.t[0x8A0 ^ 0x98B] = 0x9DC ^ 0x98B;
        WayPointModule.t[0x7560 ^ 0x7503] = 0x7590 ^ 0x7503;
        WayPointModule.t[0x5C4 ^ 0x509] = 0xFFFFFAE1 ^ 0x509;
        WayPointModule.t[0xA365 ^ 0xA2EA] = 0xFFFF5D5E ^ 0xA2EA;
        WayPointModule.t[0xA86E ^ 0xA947] = 0xFFFF56CD ^ 0xA947;
        WayPointModule.t[0xB315 ^ 0xB26F] = 0xFFFF4D83 ^ 0xB26F;
        WayPointModule.t[0xFC1B ^ 0xFC85] = 0xFFFF0318 ^ 0xFC85;
        WayPointModule.t[0x9E4E ^ 0x9E4D] = 0xFFFF61B1 ^ 0x9E4D;
        WayPointModule.t[0xA4E0 ^ 0xA4F2] = 0xFFFF5B9B ^ 0xA4F2;
        WayPointModule.t[0x99DA ^ 0x999D] = 0xFFFF6657 ^ 0x999D;
        WayPointModule.t[0x771C ^ 0x7738] = 0x7752 ^ 0x7738;
        WayPointModule.t[0x8431 ^ 0x844A] = 0x84EB ^ 0x844A;
        WayPointModule.t[0xBC1B ^ 0xBC80] = 0xBCD2 ^ 0xBC80;
        WayPointModule.t[0xB07A ^ 0xB15E] = 0xB17F ^ 0xB15E;
        WayPointModule.t[0xA656 ^ 0xA752] = 0xA77D ^ 0xA752;
        WayPointModule.t[0x45BB ^ 0x4531] = 0xFFFFBAF5 ^ 0x4531;
        WayPointModule.t[0x89EB ^ 0x8888] = 0xFFFF7711 ^ 0x8888;
        WayPointModule.t[0xC5E5 ^ 0xC4E9] = 0xC4AC ^ 0xC4E9;
        WayPointModule.t[0x9B58 ^ 0x9BC0] = 0xFFFF6461 ^ 0x9BC0;
        WayPointModule.t[0xD90F ^ 0xD876] = 0xFFFF27CE ^ 0xD876;
        WayPointModule.t[0x42FA ^ 0x4398] = 0x43E7 ^ 0x4398;
        WayPointModule.t[0x10435 ^ 0x1050C] = 0x1051D ^ 0x1050C;
        WayPointModule.t[0x89E6 ^ 0x89A3] = 0x8999 ^ 0x89A3;
        WayPointModule.t[0xCE62 ^ 0xCE3E] = 0xCE12 ^ 0xCE3E;
        WayPointModule.t[0x2836 ^ 0x2885] = 0xFFFFD75F ^ 0x2885;
        WayPointModule.t[0x10232 ^ 0x102DF] = 0x102D6 ^ 0x102DF;
        WayPointModule.t[0x6E6A ^ 0x6F21] = 0x6F05 ^ 0x6F21;
        WayPointModule.t[0x86D3 ^ 0x87CF] = 0xFFFF781D ^ 0x87CF;
        WayPointModule.t[0xC3AB ^ 0xC2DC] = 0xC2FA ^ 0xC2DC;
        WayPointModule.t[0x5A3 ^ 0x4F5] = 0x4F9 ^ 0x4F5;
        WayPointModule.t[0x10D1D ^ 0x10C41] = 0x10CF1 ^ 0x10C41;
        WayPointModule.t[0x47D6 ^ 0x47C0] = 0xFFFFB87B ^ 0x47C0;
        WayPointModule.t[0xEE4C ^ 0xEE82] = 0xFFFF1132 ^ 0xEE82;
        WayPointModule.t[0xAF1A ^ 0xAFFD] = 0xFFFF5095 ^ 0xAFFD;
        WayPointModule.t[0xBDE ^ 0xB12] = 0xB9A ^ 0xB12;
        WayPointModule.t[0x69FE ^ 0x6929] = 0x696E ^ 0x6929;
        WayPointModule.t[0x6583 ^ 0x64BF] = 0x64B7 ^ 0x64BF;
        WayPointModule.t[0xD200 ^ 0xD2A9] = 0xD28E ^ 0xD2A9;
        WayPointModule.t[0x3F5A ^ 0x3FBF] = 0x3FFE ^ 0x3FBF;
        WayPointModule.t[0xEE9C ^ 0xEFD5] = 0xFFFF1006 ^ 0xEFD5;
        WayPointModule.t[0xEF4F ^ 0xEE00] = 0xFFFF11AC ^ 0xEE00;
        WayPointModule.t[0xAE3C ^ 0xAEBC] = 0xAEA6 ^ 0xAEBC;
        WayPointModule.t[0xCED3 ^ 0xCFAE] = 0xFFFF3051 ^ 0xCFAE;
        WayPointModule.t[0x9304 ^ 0x935B] = 0x9355 ^ 0x935B;
        WayPointModule.t[0xA8BF ^ 0xA83C] = 0xA800 ^ 0xA83C;
        WayPointModule.t[0x1FCC ^ 0x1F8C] = 0x1FB9 ^ 0x1F8C;
        WayPointModule.t[0xA43E ^ 0xA530] = 0xFFFF5AC7 ^ 0xA530;
        WayPointModule.t[0x49F0 ^ 0x487D] = 0x4806 ^ 0x487D;
        WayPointModule.t[0x7DA9 ^ 0x7DBD] = 0x7D80 ^ 0x7DBD;
        WayPointModule.t[0xFDB1 ^ 0xFCE2] = 0xFFFF03EF ^ 0xFCE2;
        WayPointModule.t[0x69D5 ^ 0x68E5] = 0x68F5 ^ 0x68E5;
        WayPointModule.t[0x32D3 ^ 0x3392] = 0x3318 ^ 0x3392;
        WayPointModule.t[0xF9DD ^ 0xF8BA] = 0xFFFF0771 ^ 0xF8BA;
    }
}

