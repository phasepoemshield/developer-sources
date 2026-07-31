/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2561
 *  net.minecraft.class_266
 *  net.minecraft.class_268
 *  net.minecraft.class_634
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  net.minecraft.class_8646
 *  net.minecraft.class_9011
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
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.util.other.e_0;
import kotakbaz.rain.client.waypoint.A;
import kotakbaz.rain.client.waypoint.d;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.event.events.G;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.B;
import kotakbaz.rain.module.setting.settings.c;
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
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_8646;
import net.minecraft.class_9011;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.render.o
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b&\u0010'J!\u0010*\u001a\u0004\u0018\u00010!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020!H\u0002\u00a2\u0006\u0004\b1\u0010$J\u0011\u00102\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\r2\u0006\u00100\u001a\u00020!H\u0002\u00a2\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b:\u0010\u0003J\u001f\u0010;\u001a\u00020\u00042\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020%H\u0002\u00a2\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bA\u0010\u0003J\u0017\u0010B\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bD\u0010\u0003J\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bF\u0010\u000bJ\u000f\u0010G\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bH\u0010\u0003J\u0019\u0010K\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010(\u001a\u00020!H\u0002\u00a2\u0006\u0004\bM\u0010$J\u0017\u0010P\u001a\u00020!2\u0006\u0010O\u001a\u00020NH\u0002\u00a2\u0006\u0004\bP\u0010QJ!\u0010T\u001a\u00020!2\u0006\u0010R\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Y\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010WR\u0014\u0010Z\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010WR\u0014\u0010[\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020I8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020I8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010^R\u0014\u0010`\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010h\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010i\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bi\u0010fR&\u0010l\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0k0j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0017\u0010o\u001a\u00020n8\u0006\u00a2\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010s\u001a\u00020n8\u0006\u00a2\u0006\f\n\u0004\bs\u0010p\u001a\u0004\bt\u0010rR\u0017\u0010u\u001a\u00020n8\u0006\u00a2\u0006\f\n\u0004\bu\u0010p\u001a\u0004\bv\u0010rR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010{\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010pR\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010WR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0086\u0001\u0010\\R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0087\u0001\u0010WR\u0018\u0010\u0088\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0088\u0001\u0010^R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0089\u0001\u0010WR\u0019\u0010\u008a\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0080\u0001R\u0018\u0010\u008b\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008b\u0001\u0010^R\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008c\u0001\u0010WR\u0018\u0010\u008d\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008d\u0001\u0010^\u00a8\u0006\u008e\u0001"}, d2={"Lkotakbaz/rain/module/modules/render/WayPointModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "canToggle", "()Z", "canBind", "value", "", "setEnabled", "(Z)V", "toggle", "", "key", "applyLegacyBindIfNeeded", "(I)V", "", "distance", "", "waypointAlphaByDistance", "(D)F", "Lkotakbaz/rain/event/events/KeyEvent;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_2561;", "message", "handleIncomingMessage", "(Lnet/minecraft/class_2561;)V", "", "raw", "matchesEventMessage", "(Ljava/lang/String;)Z", "Lnet/minecraft/class_2338;", "extractEventCoordinates", "(Ljava/lang/String;)Lnet/minecraft/class_2338;", "rawMessage", "normalizedMessage", "extractEventName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lnet/minecraft/class_746;", "player", "updateEventDelayAutomation", "(Lnet/minecraft/class_746;)V", "contextKey", "trySendEventDelayRequest", "findCurrentAnarchyNumber", "()Ljava/lang/Integer;", "extractAnarchyNumber", "(Ljava/lang/String;)Ljava/lang/Integer;", "targetTick", "scheduleEventDelayRequest", "(ILjava/lang/String;)V", "clearScheduledEventDelayRequest", "clearForServerContextSwitch", "handleEventDelayMessage", "(Ljava/lang/String;Ljava/lang/String;)Z", "eventName", "eventPos", "putEventWaypoint", "(Ljava/lang/String;Lnet/minecraft/class_2338;)V", "removeEventWaypoints", "isPlayerAlive", "(Lnet/minecraft/class_746;)Z", "resetDeathTracking", "clearSession", "resetEventDelayTracking", "clearEventDelayContext", "clearExpiredEventDelayState", "", "now", "touchEventDelayResponseTimeout", "(J)V", "isEventDelayNameLine", "", "world", "buildFunTimeSessionKey", "(Ljava/lang/Object;)Ljava/lang/String;", "sessionKey", "anarchyNumber", "buildEventDelayRequestContextKey", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "EVENT_WAYPOINT_NAME", "Ljava/lang/String;", "DEATH_WAYPOINT_NAME", "BOXED_EVENT_HEADER", "EVENT_DELAY_COMMAND", "AUTO_EVENT_DELAY_REQUEST_TICKS", "I", "EVENT_DELAY_CONTEXT_TIMEOUT_MS", "J", "AUTO_EVENT_DELAY_REQUEST_COOLDOWN_MS", "DEFAULT_WAYPOINT_HIDE_DISTANCE", "F", "WAYPOINT_FADE_DISTANCE", "D", "Lkotlin/text/Regex;", "eventCoordinatesRegex", "Lkotlin/text/Regex;", "eventNameLineRegex", "eventDelayNameRegex", "anarchyRegex", "", "Lkotlin/Pair;", "knownEventNames", "Ljava/util/List;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "showWaypoints", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "getShowWaypoints", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "autoEventPoint", "getAutoEventPoint", "deathPoint", "getDeathPoint", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "quickWaypointKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "removeLastWaypointKey", "fadeWaypointOnCloseDistance", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "fadeWaypointHideDistance", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "deathHandled", "Z", "lastAlivePos", "Lnet/minecraft/class_2338;", "lastFunTimeSessionKey", "lastKnownAnarchyNumber", "Ljava/lang/Integer;", "scheduledEventDelayRequestTick", "scheduledEventDelayRequestContextKey", "lastAutoEventDelayRequestAt", "lastAutoEventDelayRequestContextKey", "awaitingEventDelayResponse", "awaitingEventDelayResponseUntil", "pendingEventNameFromDelay", "pendingEventNameFromDelayAt", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nWayPointModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WayPointModule.kt\nkotakbaz/rain/module/modules/render/WayPointModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,431:1\n1#2:432\n296#3,2:433\n1915#3,2:435\n777#3:437\n873#3,2:438\n1915#3,2:440\n*S KotlinDebug\n*F\n+ 1 WayPointModule.kt\nkotakbaz/rain/module/modules/render/WayPointModule\n*L\n199#1:433,2\n267#1:435,2\n366#1:437\n366#1:438,2\n367#1:440,2\n*E\n"})
public final class o_0
extends a_0 {
    @NotNull
    public static final o_0 INSTANCE;
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
    private static final c h;
    @NotNull
    private static final c H;
    @NotNull
    private static final c i;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.b_0 I;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.b_0 j;
    @NotNull
    private static final c J;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 k;
    private static boolean K;
    @Nullable
    private static class_2338 l;
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

    private o_0() {
        int n = t[0];
        n ^= t[1];
        int n2 = t[3];
        n2 -= t[4];
        super((String)Q[n += t[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)Q[n2 -= t[5]]);
    }

    @NotNull
    public final c getShowWaypoints() {
        return h;
    }

    @NotNull
    public final c getAutoEventPoint() {
        return H;
    }

    @NotNull
    public final c getDeathPoint() {
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
    public void setEnabled(boolean bl) {
        if (super.isEnabled()) {
            return;
        }
        boolean bl2 = t[12];
        bl2 ^= t[13];
        super.setEnabled(bl2 ^= t[14]);
    }

    @Override
    public void toggle() {
    }

    public final void applyLegacyBindIfNeeded(int n) {
        block3: {
            block2: {
                int n2 = t[15];
                n2 -= t[16];
                if (n == (n2 -= t[17])) break block2;
                int n3 = t[18];
                n3 += t[19];
                if (((Number)I.getValue()).intValue() == (n3 ^= t[20])) break block3;
            }
            return;
        }
        I.setKey(n);
    }

    public final float waypointAlphaByDistance(double d2) {
        if (!((Boolean)J.getValue()).booleanValue()) {
            return 1.0f;
        }
        double d3 = ((Number)k.getValue()).floatValue();
        double d4 = d3 + Double.longBitsToDouble(0x14E2D6C8E820F1A2L ^ 0x54F2D6C8E820F1A2L);
        if (d2 <= d3) {
            return 0.0f;
        }
        if (d2 >= d4) {
            return 1.0f;
        }
        double d5 = d4 - d3;
        if (d5 <= 0.0) {
            return 1.0f;
        }
        return RangesKt.coerceIn((float)((d2 - d3) / d5), 0.0f, 1.0f);
    }

    @Commando
    public final void onKey(@NotNull G g2) {
        long l = -1379404930407587643L;
        long l2 = 8407337933617168632L;
        int n = t[21];
        n -= t[22];
        Intrinsics.checkNotNullParameter(g2, (String)Q[n += t[23]]);
        Integer n2 = g2.get(kotakbaz.rain.event.events.G.a.getBUTTON());
        if (n2 == null) {
            return;
        }
        int n3 = t[24];
        n3 -= t[25];
        long l3 = l2;
        int n4 = t[27];
        n4 += t[28];
        l2 = l3 ^ ((long)n2.intValue() << (n3 -= t[26]) ^ l3) & -1L << (n4 += t[29]);
        boolean bl = t[30];
        bl ^= t[31];
        if (Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getMOUSE()), bl -= t[32])) {
            return;
        }
        boolean bl2 = t[33];
        bl2 -= t[34];
        if (Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getRELEASE()), bl2 -= t[35])) {
            return;
        }
        if (b_0.getMc().field_1724 == null || b_0.getMc().field_1687 == null || b_0.getMc().field_1755 != null) {
            return;
        }
        int n5 = t[36];
        n5 -= t[37];
        if (((Number)I.getValue()).intValue() != (n5 ^= t[38])) {
            int n6 = t[39];
            n6 ^= t[40];
            if (((Number)I.getValue()).intValue() == (int)(l2 >>> (n6 += t[41]))) {
                kotakbaz.rain.client.waypoint.c.INSTANCE.createQuickWaypoint();
                return;
            }
        }
        int n7 = t[42];
        n7 ^= t[43];
        if (((Number)j.getValue()).intValue() != (n7 -= t[44])) {
            int n8 = t[45];
            n8 -= t[46];
            if (((Number)j.getValue()).intValue() == (int)(l2 >>> (n8 ^= t[47]))) {
                kotakbaz.rain.client.waypoint.c.INSTANCE.removeLastWaypoint();
            }
        }
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        long l = 4638761728926967495L;
        int n = t[48];
        n -= t[49];
        Intrinsics.checkNotNullParameter(d2, (String)Q[n -= t[50]]);
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            o_0 o_02 = this;
            long l2 = l;
            int n2 = t[51];
            n2 -= t[52];
            l = l2 ^ (0L ^ l2) & -1L << (n2 -= t[53]);
            o_02.resetDeathTracking();
            boolean bl = t[54];
            bl -= t[55];
            o_02.resetEventDelayTracking(bl -= t[56]);
            return;
        }
        class_746 class_7463 = class_7462;
        if (b_0.getMc().field_1687 == null) {
            this.resetDeathTracking();
            boolean bl = t[57];
            bl += t[58];
            this.resetEventDelayTracking(bl -= t[59]);
            return;
        }
        this.updateEventDelayAutomation(class_7463);
        if (this.isPlayerAlive(class_7463)) {
            o_0.l = class_7463.method_24515();
            int n3 = t[60];
            n3 ^= t[61];
            K = n3 ^= t[62];
            return;
        }
        if (K) {
            return;
        }
        int n4 = t[63];
        n4 -= t[64];
        K = n4 += t[65];
        if (!((Boolean)i.getValue()).booleanValue()) {
            return;
        }
        class_2338 class_23382 = o_0.l;
        if (class_23382 == null) {
            class_23382 = class_7463.method_24515();
        }
        class_2338 class_23383 = class_23382;
        int n5 = t[66];
        n5 -= t[67];
        String string = (String)Q[n5 += t[68]];
        boolean bl = t[69];
        bl -= t[70];
        Intrinsics.checkNotNull(class_23383);
        kotakbaz.rain.client.waypoint.c.INSTANCE.put(string, bl -= t[71], class_23383);
    }

    public final void handleIncomingMessage(@NotNull class_2561 class_25612) {
        int n = t[72];
        n ^= t[73];
        Intrinsics.checkNotNullParameter(class_25612, (String)Q[n -= t[74]]);
        if (!((Boolean)H.getValue()).booleanValue()) {
            return;
        }
        String string = class_25612.getString();
        Intrinsics.checkNotNull(string);
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n2 = t[75];
        n2 ^= t[76];
        Intrinsics.checkNotNullExpressionValue(locale, (String)Q[n2 += t[77]]);
        String string3 = string2.toLowerCase(locale);
        int n3 = t[78];
        n3 += t[79];
        int n4 = t[81];
        n4 ^= t[82];
        Intrinsics.checkNotNullExpressionValue(string3, (String)Q[n3 += t[80]] + (String)Q[n4 ^= t[83]]);
        String string4 = string3;
        if (this.handleEventDelayMessage(string, string4)) {
            return;
        }
        if (!this.matchesEventMessage(string4)) {
            return;
        }
        class_2338 class_23382 = this.extractEventCoordinates(string);
        if (class_23382 == null) {
            return;
        }
        string2 = class_23382;
        String string5 = this.extractEventName(string, string4);
        if (string5 == null) {
            int n5 = t[84];
            n5 ^= t[85];
            string5 = (String)Q[n5 -= t[86]];
        }
        String string6 = string5;
        this.putEventWaypoint(string6, (class_2338)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean matchesEventMessage(String string) {
        int n;
        block4: {
            block3: {
                block2: {
                    int n2 = t[87];
                    n2 += t[88];
                    n2 += t[89];
                    boolean bl = t[90];
                    bl += t[91];
                    int n3 = t[93];
                    n3 -= t[94];
                    if (!StringsKt.contains$default((CharSequence)string, (String)Q[n2], bl ^= t[92], n3 += t[95], null)) break block2;
                    CharSequence charSequence = string;
                    int n4 = t[96];
                    n4 -= t[97];
                    int n5 = t[99];
                    n5 -= t[100];
                    String string2 = (String)Q[n4 += t[98]] + (String)Q[n5 += t[101]];
                    Locale locale = Locale.ROOT;
                    int n6 = t[102];
                    n6 -= t[103];
                    Intrinsics.checkNotNullExpressionValue(locale, (String)Q[n6 ^= t[104]]);
                    String string3 = string2.toLowerCase(locale);
                    int n7 = t[105];
                    n7 += t[106];
                    int n8 = t[108];
                    n8 -= t[109];
                    Intrinsics.checkNotNullExpressionValue(string3, (String)Q[n7 ^= t[107]] + (String)Q[n8 -= t[110]]);
                    boolean bl2 = t[111];
                    bl2 -= t[112];
                    int n9 = t[114];
                    n9 -= t[115];
                    if (StringsKt.contains$default(charSequence, string3, bl2 += t[113], n9 ^= t[116], null)) break block3;
                }
                int n10 = t[117];
                n10 -= t[118];
                n10 -= t[119];
                boolean bl = t[120];
                bl -= t[121];
                int n11 = t[123];
                n11 += t[124];
                if (!StringsKt.contains$default((CharSequence)string, (String)Q[n10], bl += t[122], n11 -= t[125], null)) break block4;
                int n12 = t[126];
                n12 ^= t[127];
                n12 -= t[128];
                boolean bl3 = t[129];
                bl3 ^= t[130];
                int n13 = t[132];
                n13 -= t[133];
                if (!StringsKt.contains$default((CharSequence)string, (String)Q[n12], bl3 ^= t[131], n13 -= t[134], null)) break block4;
            }
            int n14 = t[135];
            n14 ^= t[136];
            n = n14 ^= t[137];
            return n != 0;
        }
        int n15 = t[138];
        n15 -= t[139];
        n = n15 -= t[140];
        return n != 0;
    }

    private final class_2338 extractEventCoordinates(String string) {
        long l = 4955947915243474441L;
        long l2 = -2788483537192902551L;
        long l3 = 4010564649376252826L;
        int n = t[141];
        n ^= t[142];
        int n2 = t[144];
        n2 ^= t[145];
        MatchResult matchResult = Regex.find$default(E, string, n += t[143], n2 ^= t[146], null);
        if (matchResult == null) {
            return null;
        }
        MatchResult matchResult2 = matchResult;
        int n3 = t[147];
        n3 += t[148];
        Integer n4 = StringsKt.toIntOrNull(matchResult2.getGroupValues().get(n3 += t[149]));
        if (n4 == null) {
            return null;
        }
        long l4 = l2;
        int n5 = t[150];
        n5 ^= t[151];
        l2 = l4 ^ ((long)n4.intValue() ^ l4) & -1L >>> (n5 -= t[152]);
        int n6 = t[153];
        n6 += t[154];
        Integer n7 = StringsKt.toIntOrNull(matchResult2.getGroupValues().get(n6 += t[155]));
        if (n7 == null) {
            return null;
        }
        int n8 = t[156];
        n8 += t[157];
        long l5 = l3;
        int n9 = t[159];
        n9 -= t[160];
        l3 = l5 ^ ((long)n7.intValue() << (n8 -= t[158]) ^ l5) & -1L << (n9 ^= t[161]);
        int n10 = t[162];
        n10 += t[163];
        Integer n11 = StringsKt.toIntOrNull(matchResult2.getGroupValues().get(n10 ^= t[164]));
        if (n11 == null) {
            return null;
        }
        long l6 = l3;
        int n12 = t[165];
        n12 ^= t[166];
        l3 = l6 ^ ((long)n11.intValue() ^ l6) & -1L >>> (n12 -= t[167]);
        int n13 = t[168];
        n13 -= t[169];
        return new class_2338((int)l2, (int)(l3 >>> (n13 += t[170])), (int)l3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final String extractEventName(String var1_1, String var2_2) {
        block11: {
            var13_3 = -5643165817167369718L;
            var15_4 = -5203997187874572405L;
            var18_5 = o_0.t[171];
            var18_5 ^= o_0.t[172];
            var20_6 = o_0.t[174];
            var20_6 += o_0.t[175];
            var4_7 = Regex.find$default(o_0.f, var1_1, var18_5 ^= o_0.t[173], var20_6 ^= o_0.t[176], null);
            if (var4_7 == null || (var5_8 = var4_7.getGroupValues()) == null) ** GOTO lbl-1000
            var22_9 = o_0.t[177];
            var22_9 -= o_0.t[178];
            var6_10 = CollectionsKt.getOrNull(var5_8, var22_9 ^= o_0.t[179]);
            if (var6_10 == null) ** GOTO lbl-1000
            var7_11 = StringsKt.trim((CharSequence)var6_10).toString();
            if (var7_11 != null) {
                var8_12 = var7_11;
                var9_13 /* !! */  = var8_12;
                v0 = var13_3;
                var24_14 = o_0.t[180];
                var24_14 -= o_0.t[181];
                var13_3 = v0 ^ (0L ^ v0) & -1L << (var24_14 += o_0.t[182]);
                if (((CharSequence)var9_13 /* !! */ ).length() > 0) {
                    var26_15 = o_0.t[183];
                    var26_15 += o_0.t[184];
                    v1 = var26_15 -= o_0.t[185];
                } else {
                    var28_16 = o_0.t[186];
                    var28_16 ^= o_0.t[187];
                    v1 = var28_16 ^= o_0.t[188];
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
            var5_8 = o_0.F.matchEntire(StringsKt.trim((CharSequence)var1_1).toString());
            if (var5_8 == null || (var6_10 = var5_8.getGroupValues()) == null) ** GOTO lbl-1000
            var30_18 = o_0.t[189];
            var30_18 += o_0.t[190];
            var7_11 = CollectionsKt.getOrNull(var6_10, var30_18 += o_0.t[191]);
            if (var7_11 == null) ** GOTO lbl-1000
            var8_12 = StringsKt.trim((CharSequence)var7_11).toString();
            if (var8_12 != null) {
                var9_13 /* !! */  = var8_12;
                var10_19 = var9_13 /* !! */ ;
                v3 = var15_4;
                var32_20 = o_0.t[192];
                var32_20 -= o_0.t[193];
                var15_4 = v3 ^ (0L ^ v3) & -1L >>> (var32_20 += o_0.t[194]);
                if (((CharSequence)var10_19).length() > 0) {
                    var34_21 = o_0.t[195];
                    var34_21 -= o_0.t[196];
                    v4 = var34_21 ^= o_0.t[197];
                } else {
                    var36_22 = o_0.t[198];
                    var36_22 -= o_0.t[199];
                    v4 = var36_22 += o_0.t[200];
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
            var6_10 = o_0.G;
            v6 = var15_4;
            var38_23 = o_0.t[201];
            var38_23 ^= o_0.t[202];
            var15_4 = v6 ^ (0L ^ v6) & -1L << (var38_23 -= o_0.t[203]);
            var8_12 = var6_10.iterator();
            while (var8_12.hasNext()) {
                var9_13 /* !! */  = var8_12.next();
                var10_19 = (Pair)var9_13 /* !! */ ;
                v7 = var15_4;
                var40_25 = o_0.t[204];
                var40_25 += o_0.t[205];
                var15_4 = v7 ^ (0L ^ v7) & -1L >>> (var40_25 += o_0.t[206]);
                var12_24 = (String)var10_19.component1();
                var42_26 = o_0.t[207];
                var42_26 += o_0.t[208];
                var44_27 = o_0.t[210];
                var44_27 += o_0.t[211];
                if (!StringsKt.contains$default((CharSequence)var2_2, var12_24, var42_26 += o_0.t[209], var44_27 += o_0.t[212], null)) continue;
                v8 /* !! */  = var9_13 /* !! */ ;
                break block11;
            }
            v8 /* !! */  = null;
        }
        v9 = (Pair)v8 /* !! */ ;
        return v9 != null ? (String)v9.getSecond() : null;
    }

    private final void updateEventDelayAutomation(class_746 class_7462) {
        String string;
        block11: {
            block10: {
                Integer n;
                long l = -2875567306750805311L;
                long l2 = -1584259446246089373L;
                if (!((Boolean)H.getValue()).booleanValue() || !e_0.INSTANCE.isFunTime()) {
                    boolean bl = t[213];
                    bl += t[214];
                    this.resetEventDelayTracking(bl ^= t[215]);
                    return;
                }
                class_638 class_6382 = b_0.getMc().field_1687;
                if (class_6382 == null) {
                    return;
                }
                class_638 class_6383 = class_6382;
                String string2 = this.buildFunTimeSessionKey(class_6383);
                if (!Intrinsics.areEqual(string2, L)) {
                    L = string2;
                    m = null;
                    this.clearForServerContextSwitch();
                    int n2 = t[216];
                    n2 -= t[217];
                    this.scheduleEventDelayRequest(class_7462.field_6012 + (n2 -= t[218]), this.buildEventDelayRequestContextKey(string2, null));
                }
                if ((n = this.findCurrentAnarchyNumber()) != null) {
                    Integer n3 = m;
                    if (n3 == null || n.intValue() != n3.intValue()) {
                        m = n;
                        this.clearForServerContextSwitch();
                        String string3 = this.buildEventDelayRequestContextKey(string2, n);
                        if (!this.trySendEventDelayRequest(string3)) {
                            int n4 = t[219];
                            n4 -= t[220];
                            this.scheduleEventDelayRequest(class_7462.field_6012 + (n4 ^= t[221]), string3);
                        }
                        return;
                    }
                }
                int n5 = t[222];
                n5 -= t[223];
                long l3 = l2;
                int n6 = t[225];
                n6 += t[226];
                l2 = l3 ^ ((long)M << (n5 ^= t[224]) ^ l3) & -1L << (n6 += t[227]);
                string = o_0.n;
                int n7 = t[228];
                n7 ^= t[229];
                if ((int)(l2 >>> (n7 += t[230])) < 0 || string == null) break block10;
                int n8 = t[231];
                n8 -= t[232];
                if (class_7462.field_6012 >= (int)(l2 >>> (n8 ^= t[233]))) break block11;
            }
            return;
        }
        if (!this.trySendEventDelayRequest(string) && b_0.getMc().field_1755 != null) {
            return;
        }
        this.clearScheduledEventDelayRequest();
    }

    private final boolean trySendEventDelayRequest(String string) {
        long l = -7736464126197395315L;
        if (b_0.getMc().field_1755 != null) {
            boolean bl = t[234];
            bl += t[235];
            return bl ^= t[236];
        }
        class_634 class_6342 = b_0.getMc().method_1562();
        if (class_6342 == null) {
            boolean bl = t[237];
            bl += t[238];
            return bl += t[239];
        }
        class_634 class_6343 = class_6342;
        long l2 = System.currentTimeMillis();
        int n = t[240];
        n ^= t[241];
        long l3 = l;
        int n2 = t[243];
        n2 += t[244];
        l = l3 ^ ((long)Intrinsics.areEqual(string, o) << (n ^= t[242]) ^ l3) & -1L << (n2 ^= t[245]);
        int n3 = t[246];
        n3 ^= t[247];
        if ((int)(l >>> (n3 += t[248])) != 0 && l2 - N < 15000L) {
            boolean bl = t[249];
            bl -= t[250];
            return bl -= t[251];
        }
        N = l2;
        o = string;
        this.touchEventDelayResponseTimeout(l2);
        this.clearEventDelayContext();
        int n4 = t[252];
        n4 += t[253];
        class_6343.method_45730((String)Q[n4 ^= t[254]]);
        boolean bl = t[255];
        bl += t[256];
        return bl -= t[257];
    }

    private final Integer findCurrentAnarchyNumber() {
        long l = -7457825278771138645L;
        long l2 = -8652226822177084464L;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null || (class_6382 = class_6382.method_8428()) == null) {
            return null;
        }
        class_638 class_6383 = class_6382;
        class_266 class_2662 = class_6383.method_1189(class_8646.field_45157);
        if (class_2662 == null) {
            return null;
        }
        class_266 class_2665 = class_2662;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_2665.method_1114().getString());
        Collection collection = class_6383.method_1184(class_2665);
        int n = t[258];
        n -= t[259];
        int n2 = t[261];
        n2 += t[262];
        Intrinsics.checkNotNullExpressionValue(collection, (String)Q[n -= t[260]] + (String)Q[n2 += t[263]]);
        Iterable iterable = collection;
        long l3 = l;
        int n3 = t[264];
        n3 ^= t[265];
        l = l3 ^ (0L ^ l3) & -1L << (n3 += t[266]);
        for (Object t2 : iterable) {
            class_268 class_2682;
            class_9011 class_90112 = (class_9011)t2;
            long l4 = l;
            int n4 = t[267];
            n4 -= t[268];
            l = l4 ^ (0L ^ l4) & -1L >>> (n4 -= t[269]);
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_90112.comp_2127());
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_90112.method_55387().getString());
            class_2561 class_25612 = class_90112.comp_2129();
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_25612 != null ? class_25612.getString() : null);
            if (class_6383.method_1164(class_90112.comp_2127()) == null) continue;
            long l5 = l2;
            int n5 = t[270];
            n5 ^= t[271];
            l2 = l5 ^ (0L ^ l5) & -1L << (n5 -= t[272]);
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_2682.method_1144().getString());
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_2682.method_1136().getString());
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_2682.method_1198((class_2561)class_2561.method_43470((String)class_90112.comp_2127())).getString());
            o_0.findCurrentAnarchyNumber$addCandidate(linkedHashSet, class_2682.method_1198(class_90112.method_55387()).getString());
        }
        return (Integer)SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence((Iterable)linkedHashSet), new B(this)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Integer extractAnarchyNumber(String string) {
        int n = t[273];
        n ^= t[274];
        int n2 = t[276];
        n2 ^= t[277];
        MatchResult matchResult = Regex.find$default(g, string, n += t[275], n2 += t[278], null);
        if (matchResult == null) return null;
        List<String> list = matchResult.getGroupValues();
        if (list == null) return null;
        int n3 = t[279];
        n3 ^= t[280];
        String string2 = CollectionsKt.getOrNull(list, n3 -= t[281]);
        if (string2 == null) return null;
        Integer n4 = StringsKt.toIntOrNull(string2);
        return n4;
    }

    private final void scheduleEventDelayRequest(int n, String string) {
        M = n;
        o_0.n = string;
    }

    private final void clearScheduledEventDelayRequest() {
        int n = t[282];
        n -= t[283];
        M = n -= t[284];
        o_0.n = null;
    }

    private final void clearForServerContextSwitch() {
        this.clearScheduledEventDelayRequest();
        this.clearEventDelayContext();
        int n = t[285];
        n += t[286];
        O = n += t[287];
        p = 0L;
        this.removeEventWaypoints();
    }

    private final boolean handleEventDelayMessage(String string, String string2) {
        int n;
        long l = -6099379783234889095L;
        this.clearExpiredEventDelayState();
        int n2 = t[288];
        n2 -= t[289];
        n2 -= t[290];
        int n3 = t[291];
        n3 -= t[292];
        boolean bl = t[294];
        bl += t[295];
        int n4 = t[297];
        n4 ^= t[298];
        if (StringsKt.contains$default((CharSequence)string2, (String)Q[n2] + (String)Q[n3 ^= t[293]], bl -= t[296], n4 += t[299], null)) {
            this.removeEventWaypoints();
            this.clearEventDelayContext();
            int n5 = t[300];
            n5 += t[301];
            O = n5 -= t[302];
            p = 0L;
            boolean bl2 = t[303];
            bl2 ^= t[304];
            return bl2 ^= t[305];
        }
        if (this.isEventDelayNameLine(string)) {
            String string3 = this.extractEventName(string, string2);
            if (string3 == null) {
                int n6 = t[306];
                n6 += t[307];
                string3 = (String)Q[n6 ^= t[308]];
            }
            P = string3;
            q = System.currentTimeMillis();
            int n7 = t[309];
            n7 += t[310];
            o_0.touchEventDelayResponseTimeout$default(this, 0L, n7 -= t[311], null);
            boolean bl3 = t[312];
            bl3 ^= t[313];
            return bl3 ^= t[314];
        }
        if (O || P != null) {
            int n8 = t[315];
            n8 += t[316];
            n = n8 ^= t[317];
        } else {
            int n9 = t[318];
            n9 ^= t[319];
            n = n9 ^= t[320];
        }
        int n10 = t[321];
        n10 ^= t[322];
        long l2 = l;
        int n11 = t[324];
        n11 -= t[325];
        l = l2 ^ ((long)n << (n10 -= t[323]) ^ l2) & -1L << (n11 += t[326]);
        int n12 = t[327];
        n12 += t[328];
        if ((int)(l >>> (n12 += t[329])) == 0) {
            boolean bl4 = t[330];
            bl4 += t[331];
            return bl4 ^= t[332];
        }
        int n13 = t[333];
        n13 += t[334];
        boolean bl5 = t[336];
        bl5 += t[337];
        int n14 = t[339];
        n14 ^= t[340];
        if (StringsKt.contains$default((CharSequence)string2, (String)Q[n13 += t[335]], bl5 -= t[338], n14 -= t[341], null)) {
            int n15 = t[342];
            n15 += t[343];
            o_0.touchEventDelayResponseTimeout$default(this, 0L, n15 -= t[344], null);
            boolean bl6 = t[345];
            bl6 += t[346];
            return bl6 -= t[347];
        }
        int n16 = t[348];
        n16 -= t[349];
        boolean bl7 = t[351];
        bl7 ^= t[352];
        int n17 = t[354];
        n17 += t[355];
        if (StringsKt.contains$default((CharSequence)string, (String)Q[n16 -= t[350]], bl7 ^= t[353], n17 ^= t[356], null)) {
            int n18 = t[357];
            n18 += t[358];
            boolean bl8 = t[360];
            bl8 -= t[361];
            int n19 = t[363];
            n19 += t[364];
            if (StringsKt.contains$default((CharSequence)string2, (String)Q[n18 -= t[359]], bl8 ^= t[362], n19 -= t[365], null)) {
                q = System.currentTimeMillis();
                int n20 = t[366];
                n20 ^= t[367];
                o_0.touchEventDelayResponseTimeout$default(this, 0L, n20 += t[368], null);
                boolean bl9 = t[369];
                bl9 += t[370];
                return bl9 ^= t[371];
            }
        }
        int n21 = t[372];
        n21 -= t[373];
        boolean bl10 = t[375];
        bl10 += t[376];
        int n22 = t[378];
        n22 -= t[379];
        if (StringsKt.contains$default((CharSequence)string, (String)Q[n21 -= t[374]], bl10 += t[377], n22 -= t[380], null)) {
            int n23 = t[381];
            n23 -= t[382];
            boolean bl11 = t[384];
            bl11 ^= t[385];
            int n24 = t[387];
            n24 ^= t[388];
            if (StringsKt.contains$default((CharSequence)string2, (String)Q[n23 ^= t[383]], bl11 ^= t[386], n24 += t[389], null)) {
                class_2338 class_23382 = this.extractEventCoordinates(string);
                if (class_23382 == null) {
                    boolean bl12 = t[390];
                    bl12 -= t[391];
                    return bl12 ^= t[392];
                }
                class_2338 class_23383 = class_23382;
                String string4 = P;
                if (string4 == null) {
                    int n25 = t[393];
                    n25 -= t[394];
                    string4 = (String)Q[n25 += t[395]];
                }
                String string5 = string4;
                this.putEventWaypoint(string5, class_23383);
                this.clearEventDelayContext();
                int n26 = t[396];
                n26 -= t[397];
                O = n26 ^= t[398];
                p = 0L;
                boolean bl13 = t[399];
                bl13 += 34;
                return bl13 += 43;
            }
        }
        int n5 = -54;
        n5 = n5 ^ 0x10;
        boolean bl2 = n5 ^ 0xFFFFFFDA;
        return bl2;
    }

    private final void putEventWaypoint(String string, class_2338 class_23382) {
        this.removeEventWaypoints();
        int n = 19;
        n = n + 16;
        boolean bl2 = n ^ 0x22;
        A a2 = kotakbaz.rain.client.waypoint.c.INSTANCE.add(string, bl2, class_23382);
        if (a2 == kotakbaz.rain.client.waypoint.A.A) {
            int n2 = 88;
            n2 -= 48;
            if (!Intrinsics.areEqual(string, (String)Q[n2 ^= 0x39])) {
                int n3 = -15;
                n3 -= -102;
                int n5 = -57;
                n5 = n5 - 68;
                boolean bl3 = n5 ^ 0xFFFFFF82;
                kotakbaz.rain.client.waypoint.c.INSTANCE.add((String)Q[n3 ^= 0x7A], bl3, class_23382);
            }
        }
    }

    private final void removeEventWaypoints() {
        long l = -7642397662711951874L;
        long l2 = 3082106297013205834L;
        long l3 = 5704189679444242321L;
        Iterable iterable = kotakbaz.rain.client.waypoint.c.INSTANCE.getWayPoints();
        long l4 = l2;
        int n = 133;
        n += -98;
        l2 = l4 ^ (0L ^ l4) & -1L >>> (n -= 3);
        Iterable iterable2 = iterable;
        Collection collection2 = new ArrayList();
        long l5 = l;
        int n2 = -17;
        n2 += 21;
        l = l5 ^ (0L ^ l5) & -1L >>> (n2 += 28);
        Iterator iterator2 = iterable2.iterator();
        while (iterator2.hasNext()) {
            Object t2 = iterator2.next();
            d d2 = (d)t2;
            long l6 = l2;
            int n3 = 110;
            n3 -= 87;
            l2 = l6 ^ (0L ^ l6) & -1L << (n3 += 9);
            if (!d2.getEvent()) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        long l7 = l2;
        int n4 = -19;
        n4 ^= 0xFFFFFFCA;
        l2 = l7 ^ (0L ^ l7) & -1L >>> (n4 -= 7);
        for (Collection collection2 : iterable) {
            d d3 = (d)((Object)collection2);
            long l8 = l3;
            int n5 = 43;
            n5 ^= 0x54;
            l3 = l8 ^ (0L ^ l8) & -1L << (n5 ^= 0x5F);
            kotakbaz.rain.client.waypoint.c.INSTANCE.remove(d3.getName());
        }
    }

    private final boolean isPlayerAlive(class_746 class_7462) {
        int n;
        if (class_7462.method_5805() && class_7462.method_6032() > 0.0f && class_7462.field_6213 <= 0) {
            int n2 = -48;
            n2 ^= 0xFFFFFFDA;
            n = n2 ^= 0xB;
        } else {
            int n3 = 179;
            n3 += -70;
            n = n3 += -109;
        }
        return n != 0;
    }

    private final void resetDeathTracking() {
        int n = 119;
        n ^= 0xFFFFFF94;
        K = n -= -29;
        l = null;
    }

    private final void resetEventDelayTracking(boolean bl) {
        this.clearScheduledEventDelayRequest();
        this.clearEventDelayContext();
        int n = 7;
        n -= 117;
        O = n ^= 0xFFFFFF92;
        p = 0L;
        if (bl) {
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
        long l = System.currentTimeMillis();
        if (O && l > p) {
            int n = -107;
            n += 116;
            O = n += -9;
            p = 0L;
        }
        if (P != null && l - q > 6000L) {
            this.clearEventDelayContext();
        }
    }

    private final void touchEventDelayResponseTimeout(long l) {
        int n = 78;
        n ^= 0x52;
        O = n += -27;
        p = l + 6000L;
    }

    static /* synthetic */ void touchEventDelayResponseTimeout$default(o_0 o_02, long l, int n, Object object) {
        int n2 = 244;
        n2 -= 121;
        if ((n & (n2 ^= 0x7A)) != 0) {
            l = System.currentTimeMillis();
        }
        o_02.touchEventDelayResponseTimeout(l);
    }

    private final boolean isEventDelayNameLine(String string) {
        return F.matches(((Object)StringsKt.trim((CharSequence)string)).toString());
    }

    private final String buildFunTimeSessionKey(Object object) {
        String string;
        long l = -5500441240751814123L;
        Object object2 = b_0.getMc().method_1558();
        if ((object2 != null && (object2 = object2.field_3761) != null ? ((Object)StringsKt.trim((CharSequence)object2)).toString() : (string = null)) == null) {
            string = "";
        }
        String string2 = string;
        int n = -122;
        n -= -115;
        long l2 = l;
        int n2 = 280;
        n2 -= 123;
        l = l2 ^ ((long)System.identityHashCode(object) << (n -= -39) ^ l2) & -1L << (n2 += -125);
        String string3 = string2;
        int n3 = -51;
        n3 += 24;
        int n4 = 12;
        n4 += -90;
        return string3 + (String)Q[n3 -= -61] + (int)(l >>> (n4 += 110));
    }

    private final String buildEventDelayRequestContextKey(String string, Integer n) {
        String string2;
        if (n == null) {
            String string3 = string;
            int n2 = -41;
            n2 ^= 0x28;
            string2 = string3 + (String)Q[n2 -= -28];
        } else {
            Integer n3 = n;
            String string4 = string;
            int n4 = 99;
            n4 ^= 0xFFFFFFD9;
            string2 = string4 + (String)Q[n4 ^= 0xFFFFFF85] + n3;
        }
        return string2;
    }

    private static final boolean fadeWaypointHideDistance$lambda$0() {
        return (Boolean)J.getValue();
    }

    private static final boolean _init_$lambda$0() {
        int n = -14;
        n = n ^ 0x31;
        boolean bl2 = n + 61;
        return bl2;
    }

    private static final void findCurrentAnarchyNumber$addCandidate(LinkedHashSet<String> linkedHashSet, String string) {
        String string2;
        block6: {
            block5: {
                int n;
                String string3;
                long l = -8180922069694209728L;
                if (string == null) break block5;
                String string4 = ((Object)StringsKt.trim((CharSequence)string)).toString();
                if (string4 == null) break block5;
                String string5 = string3 = string4;
                long l2 = l;
                int n2 = 211;
                n2 += -87;
                l = l2 ^ (0L ^ l2) & -1L << (n2 ^= 0x5C);
                if (((CharSequence)string5).length() > 0) {
                    int n3 = 3;
                    n3 += 84;
                    n = n3 += -86;
                } else {
                    int n4 = -17;
                    n4 -= 30;
                    n = n4 -= -47;
                }
                String string6 = string2 = n != 0 ? string3 : null;
                if (string2 != null) break block6;
            }
            return;
        }
        String string7 = string2;
        ((Collection)linkedHashSet).add(string7);
    }

    public static final /* synthetic */ Integer access$extractAnarchyNumber(o_0 o_02, String string) {
        return o_02.extractAnarchyNumber(string);
    }

    static {
        o_0.b();
        long l = -1267017655692034148L;
        long l2 = 6768309616860793967L;
        long l3 = -1912135682398565116L;
        long l4 = 2342602855858439912L;
        long l5 = -6846236998194562904L;
        long l6 = -672495531566633525L;
        long l7 = -6591553554115529687L;
        long l8 = 6373961402071202755L;
        long l9 = 7850946311449034697L;
        long l10 = -5401063370334892422L;
        long l11 = -2920671397885989127L;
        long l12 = 6189198532682485582L;
        long l13 = 1057195687297081903L;
        long l14 = -2920858613651066044L;
        int n = 115;
        n ^= 0xFFFFFF9D;
        Q = new Object[n += 89];
        long l15 = l14;
        int n2 = 59;
        n2 += -107;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= -80);
        Object[] objectArray = new Object[3];
        objectArray[0] = r;
        objectArray[1] = 0;
        Object object = o_0.A()[0];
        if (object == null) {
            char[] cArray = "\u3392\u338d\u33ae\u33d6\u33aa\u33a0\u3383\u33b9\u33ba\u334e\u338b\u338a\u33c0\u33d8\u33b9\u33bf\u33a0\u33c0\u33d6\u34f3\u339a\u33a4\u339a\u3389\u339b\u3383\u339c\u34f6\u3394\u33d4\u34f6\u339c\u2e5c\u33d1\u34f2\u33eb\u33ba\u33aa\u338a\u33ae\u33b0\u338a\u338f\u3394\u33a0\u3384\u34f7\u33ba\u3383\u339b\u33bc\u33ea\u34f5\u33ef\u2e5c\u3389\u338d\u33bb\u3398\u34f2\u33bb\u339a\u33aa\u338b\u339d\u33b9\u3389\u33b0\u334e\u33eb\u34f8\u2e5c\u3390\u33eb\u33d3\u33d4\u34f3\u33bf\u33ba\u33ae\u339b\u334d\u33eb\u338a\u33af\u34f6\u334e\u33d2\u33d8\u33a3\u34f4\u33bc\u33bc\u3393\u33d4\u34f2\u34f2\u338a\u3391\u33ad\u3394\u3384\u3394\u339a\u338a\u3392\u33bc\u3393\u34f5\u33ae\u33f0\u33a2\u33a9\u34f6\u33d5\u338d\u339a\u33d1\u34f1\u339e\u33ba\u33e9\u338b\u33f0\u334e\u3382\u339b\u33aa\u3389\u33a9\u3399\u338d\u3394\u33d6\u33e9\u33d1\u33d4\u3398\u34f5\u33c0\u33d7\u3392\u338d\u33d8\u334d\u33ae\u339e\u339b\u3384\u338d\u33a2\u33d2\u33a9\u34fe\u34f8\u34f7\u3391\u3391\u3383\u33bc\u33e9\u34f1\u34f5\u33aa\u33ae\u33d7\u34f1\u33d2\u33a2\u338b\u33d6\u33d5\u339e\u334d\u3394\u34f5\u33aa\u338f\u33d2\u338e\u33d2\u34f8\u34f5\u34f3\u34f1\u33d2\u334e\u338d\u339b\u33e9\u339d\u339a\u33a3\u338f\u33d8\u33d2\u33b0\u34f3\u33d5\u3391\u33b9\u34fe\u33a0\u339d\u33d6\u34fe\u338b\u34f3\u3391\u33e9\u334d\u33a9\u34f4\u34f5\u3398\u34f1\u338f\u339a\u33ba\u338a\u34f1\u34fd\u33a4\u338b\u339a\u33f0\u33a0\u339a\u33d5\u339e\u33e9\u3393\u3398\u33ae\u339f\u339d\u33ba\u34f4\u33aa\u339f\u33d1\u33bb\u34f2\u34f1\u34f2\u33e9\u33d1\u33ef\u33a0\u33f0\u334e\u33a9\u33af\u34fe\u34f4\u334d\u33d1\u33d5\u338a\u33bc\u3383\u338a\u33bf\u33d6\u33a4\u34f2\u334d\u2e5c\u3399\u33bb\u33b9\u33d7\u339b\u3382\u33bb\u33d7\u34fe\u338f\u3394\u338f\u3390\u33af\u33f0\u34f4\u334e\u34fd\u334e\u33ef\u338e\u33ef\u34f4\u33a3\u34f7\u3383\u33d7\u2e5c\u3390\u334d\u33bc\u3399\u33a9\u33af\u3384\u33a0\u33bc\u34f3\u34f2\u33a4\u33af\u33ad\u34f4\u33d1\u3390\u338d\u33e9\u33bf\u33a3\u33d1\u33d2\u33ea\u338e\u33e9\u338a\u33af\u334d\u33c0\u33d5\u3382\u33a9\u33bc\u34fd\u3382\u33d1\u34f8\u3391\u33ea\u338d\u33d2\u33e9\u33d4\u33bc\u338d\u33a2\u33b9\u339b\u338f\u33a0\u3389\u33d5\u338a\u33eb\u33e9\u338e\u339b\u3384\u33d3\u338b\u3383\u33d6\u33a9\u34f8\u33a0\u34f1\u33ae\u34fe\u33d5\u3393\u33b0\u34f3\u34f5\u339e\u34f2\u338b\u339e\u33a2\u33d1\u33a9\u339c\u34fd\u339a\u34fe\u338b\u338f\u33b9\u3384\u3398\u339d\u338a\u3390\u3384\u339f\u33d7\u33c0\u33a9\u33ae\u33b0\u339f\u33a4\u33af\u338d\u34f3\u33ba\u33ad\u3390\u334e\u3391\u33c0\u33ef\u33d1\u33d1\u334e\u3394\u3390\u338d\u33bc\u33a3\u3393\u33e9\u34f3\u338d\u33bf\u33ba\u3383\u33ae\u33ea\u33a9\u338a\u334d\u33d2\u33af\u3382\u34f4\u334e\u34f3\u2e5c\u338d\u33f0\u33a9\u34f6\u33ba\u34fe\u33ad\u3393\u339c\u34f7\u34f6\u33b9\u33a3\u3399\u34fd\u33aa\u33bc\u33d5\u3398\u33ef\u33a0\u33e9\u3383\u338a\u3398\u33ae\u34fd\u2e5c\u33bb\u33ef\u34f3\u3382\u3399\u33bf\u33af\u339c\u33d4\u33bb\u33a4\u338f\u338d\u3391\u334e\u33c0\u33bf\u33ea\u33e9\u33eb\u34fe\u3391\u33d3\u34f4\u33d7\u3399\u339a\u3394\u33d4\u339b\u33bb\u33b9\u3382\u33d3\u3393\u338a\u33b0\u339d\u338a\u33ef\u33a4\u33ea\u3390\u33c0\u33d6\u334d\u33d3\u334e\u33ad\u33bb\u33bf\u33d2\u339a\u34f2\u3398\u34f7\u33c0\u33f0\u33a0\u34fe\u338b\u3390\u33d8\u33ad\u34f7\u34f4\u33a3\u339d\u3398\u3389\u3394\u34f7\u33ba\u3382\u3383\u34fe\u33d5\u3393\u338e\u33ef\u34f4\u3384\u33a9\u33a2\u33b0\u33d3\u33a3\u33b9\u3382\u33b9\u33d7\u33f0\u33a2\u338d\u3383\u339e\u3398\u33ba\u3384\u3391\u3393\u33ea\u34f5\u33ef\u34f8\u33b0\u339b\u34f5\u33ba\u33bb\u33d6\u339a\u3382\u338e\u334d\u338b\u338b\u33ad\u33d6\u3383\u33ad\u33e9\u34f6\u33bc\u3391\u3391\u33f0\u3399\u338a\u338b\u3391\u33ba\u3391\u339a\u33eb\u33d5\u34f2\u34f4\u33ea\u3389\u339f\u339b\u334d\u338e\u33aa\u33d8\u33e9\u33f0\u33ea\u33a4\u33ad\u33d4\u2e5c\u33ad\u338d\u33aa\u33ad\u33ef\u34f7\u33d6\u3391\u33d7\u33a0\u338f\u338f\u3394\u34fe\u33a2\u33d8\u334e\u33eb\u3391\u33d4\u33ae\u33ba\u33a3\u338d\u3391\u33d2\u33a0\u3382\u33a9\u33ef\u34f6\u3394\u34f8\u34f3\u34f8\u3390\u33ae\u34f4\u33ba\u338f\u339a\u339c\u33ad\u3393\u3384\u3391\u33b9\u33a9\u334e\u334e\u3394\u3398\u2e5c\u33bf\u33aa\u338d\u34f6\u34f8\u33e9\u338a\u33e9\u33f0\u34fd\u3390\u339a\u3382\u3391\u3382\u33aa\u33ae\u339c\u33d4\u33eb\u33ef\u33d4\u339d\u339f\u34f6\u33d2\u33ae\u33a0\u34fd\u334e\u33a3\u34f2\u33d4\u33a3\u33e9\u339a\u33d4\u3398\u338d\u33d8\u33af\u34f5\u334e\u3390\u338b\u2e5c\u33d2\u33d1\u33bf\u339c\u3390\u33aa\u33b9\u34f7\u33af\u33aa\u33d4\u33ad\u33eb\u33eb\u33d4\u33b9\u3393\u339a\u33bb\u33a2\u338a\u34f6\u33ba\u33a9\u34f4\u33b9\u33ae\u33f0\u33d2\u338d\u34f5\u33e9\u339a\u338b\u34f5\u33d4\u34f4\u3391\u33eb\u33a9\u33bf\u33b9\u339d\u338f\u33d2\u338e\u339c\u339b\u33af\u33d6\u339b\u34f7\u33ad\u33a4\u33a4\u33a4\u33ef\u33a9\u33ae\u339e\u338f\u34f2\u33d8\u34f3\u33ba\u3394\u34f6\u33e9\u34f7\u334d\u33a9\u3383\u33ea\u3382\u33e9\u33bf\u33aa\u338b\u33d8\u3398\u2e5c\u33af\u3382\u338e\u33d2\u338b\u33ea\u339a\u33af\u33aa\u339e\u339b\u33d2\u33ae\u34f6\u33ba\u34fd\u33ba\u33ad\u3383\u33d2\u339b\u3391\u34f1\u338b\u34fd\u34f7\u33eb\u34f1\u33bb\u339b\u33d1\u33d7\u33b9\u339d\u33b9\u339d\u34f2\u33bb\u34f6\u33f0\u3382\u33d7\u33aa\u34f7\u338b\u3393\u339b\u33d4\u3393\u33bf\u339c\u3390\u3389\u33b9\u334d\u33af\u34f6\u34f7\u339b\u3399\u334e\u3391\u3393\u33a4\u33f0\u33c0\u33af\u33a4\u3399\u334d\u33bc\u3393\u33bb\u33d6\u33c0\u3390\u33a4\u33a2\u338f\u338e\u3383\u33d3\u34f6\u33ba\u33ef\u339c\u33bf\u3399\u339b\u334d\u338a\u33ea\u338f\u339f\u33bb\u34f4\u33d7\u33a2\u34fd\u3384\u33b9\u33a9\u339d\u33ad\u339e\u33e9\u33ad\u33d7\u33bf\u3394\u33d2\u33a0\u33e9\u34f7\u33a0\u3390\u2e5c\u34f4\u33d6\u34f1\u33bc\u3393\u3389\u33a0\u34f4\u33e9\u34f4\u339c\u33ba\u3391\u3390\u33aa\u34f5\u3383\u33af\u33eb\u33e9\u33bb\u33ad\u34fd\u33bf\u33ea\u33a2\u34f1\u34f1\u33af\u33c0\u34f7\u34f8\u33bf\u33d6\u33ae\u33d2\u33ad\u33a4\u33eb\u33b0\u33a3\u33ea\u338e\u33a4\u3390\u34f1\u34f4\u33f0\u33b0\u34f8\u334d\u34f4\u3384\u33d4\u33bf\u339d\u338b\u33aa\u3390\u3394\u3399\u33d1\u34f1\u3382\u34f4\u33ad\u33d3\u34fe\u3390\u34f7\u34f7\u339a\u33c0\u339c\u33ea\u33d5\u339f\u34f2\u33a0\u33d3\u33ad\u33b0\u33a9\u339c\u34f4\u33bb\u338a\u338a\u33f0\u33ad\u33d5\u33eb\u33d8\u33bc\u339d\u34f3\u33d3\u33b9\u33c0\u33d6\u339e\u3393\u3384\u33ae\u33eb\u33ad\u33bf\u3391\u33c0\u33d8\u33ef\u33ad\u33ea\u3398\u34f5\u3399\u33c0\u3382\u33ef\u33bc\u33b0\u3389\u2e5c\u34fd\u33ad\u3393\u33eb\u34fe\u34fd\u3383\u33d2\u338d\u33e9\u33a4\u33a9\u33a9\u338d\u33d7\u33d1\u33eb\u33d7\u3398\u33a4\u34f3\u338e\u33a9\u33a0\u3392\u33a2\u33d7\u3391\u3390\u33aa\u33bb\u33a9\u338d\u33ea\u34fd\u33b0\u33d6\u33bb\u33a4\u2e5c\u3392\u34f7\u338f\u34f2\u338d\u34f2\u33d2\u33bf\u34f7\u33af\u34f4\u34f4\u33ea\u33d5\u33c0\u3384\u33a2\u334d\u33d8\u3390\u34f1\u3389\u3398\u33d7\u34f3\u33ef\u33eb\u34fe\u334d\u33d4\u33ea\u334d\u33a4\u3390\u3399\u34f5\u3390\u33ad\u33af\u33d4\u34f3\u33d3\u338f\u33bf\u339e\u334d\u33b0\u33a4\u33a3\u3384\u33ba\u339e\u33ad\u3390\u3398\u339f\u3383\u339d\u34f6\u3391\u33ae\u33ea\u33e9\u34f3\u33b9\u338e\u33d2\u33d4\u3393\u33eb\u339c\u33d5\u33ba\u338b\u33b0\u34f1\u34f5\u338f\u34f2\u33b9\u33ea\u3383\u33d4\u33d6\u338d\u33a2\u33bf\u34f6\u33d2\u33d4\u34fe\u3389\u34f6\u33a9\u339e\u34f7\u34f2\u338b\u34f3\u3391\u3392\u33bc\u34fd\u3394\u339c\u2e5c\u33ef\u34f1\u33aa\u338f\u3384\u33d5\u33bc\u33d4\u34f2\u334e\u2e5c\u33a0\u339d\u33d1\u33a9\u33af\u3382\u2e5c\u33a2\u33f0\u338f\u339f\u338b\u33d2\u33d4\u33d5\u33a4\u34fd\u33a2\u2e5c\u334d\u3390\u33e9\u3394\u338a\u33d5\u3391\u3389\u3383\u339d\u33a2\u2e5c\u33d4\u33ae\u34f5\u339b\u338a\u33bb\u3391\u3393\u33d6\u334d\u3384\u33a4\u338f\u33d5\u339f\u339d\u33ad\u34f2\u33ae\u3399\u33f0\u33e9\u33a4\u3391\u33c0\u34fd\u338e\u33bf\u34f2\u34f1\u34f5\u339e\u33d8\u33d1\u33ae\u33f0\u339a\u334d\u33d3\u33d7\u3399\u33bc\u33d5\u34f7\u33b9\u3398\u33a2\u33c0\u3383\u338f\u3398\u33eb\u338e\u3390\u34f6\u33bc\u33d6\u334e\u33ea\u34f8\u3382\u34fd\u3398\u34fd\u3398\u33ad\u34f8\u34f2\u34f2\u3392\u338a\u33d3\u34f1\u3382\u33bf\u34f7\u3390\u3392\u33f0\u33a2\u33aa\u33f0\u33e9\u33a3\u33c0\u34f5\u3394\u34f6\u34f5\u34f6\u33bf\u33ae\u33c0\u33d4\u34fe\u3398\u3383\u3382\u33b9\u33bc\u33bf\u34f5\u34f3\u339f\u338d\u2e5c\u334d\u34f6\u33a3\u338b\u338a\u33bb\u3384\u33c0\u3399\u33d8\u3389\u34f8\u3392\u33a3\u339f\u34f2\u3390\u34f6\u338d\u33ad\u3399\u33bb\u34fe\u339c\u33af\u33ef\u34f6\u34fd\u34f6\u33e9\u3393\u34f3\u33d3\u33d4\u34f7\u3393\u33a4\u334d\u339c\u33bb\u34f5\u339e\u33bc\u3398\u339a\u33d3\u34f4\u33bc\u2e5c\u34fd\u34fe\u339d\u34fe\u3390\u33b9\u33af\u34fe\u34f2\u33eb\u33b9\u33bb\u34f7\u33a4\u34fe\u34fd\u33f0\u34f4\u34f4\u33a2\u33d3\u33d6\u33d3\u33a9\u33c0\u33d8\u34f7\u34f5\u34f1\u339b\u33d6\u3390\u33d3\u34f3\u33a2\u34f6\u34fe\u33d4\u34f5\u33f0\u33d2\u339b\u33bb\u33a0\u33e9\u334d\u2e5c\u33eb\u3389\u33a9\u339d\u33e9\u34f6\u3389\u33e9\u338e\u33a3\u33b9\u3390\u33e9\u33bf\u3389\u33c0\u34f6\u34f3\u33d8\u33bb\u33d3\u33ef\u3382\u33d7\u339b\u338e\u33b9\u33d1\u33bc\u33d6\u33d2\u339b\u3398\u3383\u33ae\u33ae\u3382\u33d6\u338b\u3392\u33f0\u3391\u34f3\u34f1\u33d5\u34f3\u3399\u3384\u33a9\u3390\u338e\u33a4\u338a\u33a4\u33d8\u34f2\u33f0\u33bc\u338b\u34f8\u33a2\u34f3\u34f6\u33eb\u33d2\u33bb\u339a\u33bb\u33d6\u33d6\u33a2\u33d5\u3384\u3393\u33ef\u33a0\u33ad\u33af\u34f5\u3393\u34f2\u34f1\u33d1\u33d1\u33d1\u33d4\u33a3\u338f\u338a\u3398\u33f0\u33eb\u3391\u33a4\u338f\u33d6\u3383\u339b\u33e9\u339c\u3389\u34f1\u33d4\u3390\u3383\u3389\u33bb\u33ea\u34f2\u33d3\u338b\u33d5\u33e9\u3389\u34fe\u3392\u33a9\u3393\u34f3\u33b9\u33ef\u34f8\u339e\u34f6\u33d6\u33bc\u339d\u34f2\u339a\u33ea\u34f6\u339f\u338a\u3384\u33ad\u34fd\u34f3\u2e5c\u33d7\u33d1\u339f\u33b9\u338d\u3398\u33a2\u339f\u33a3\u33d1\u33ef\u339b\u34f2\u33d1\u33bc\u33eb\u33ae\u33d2\u339d\u33ad\u33d2\u33e9\u33ea\u334d\u34f8\u3391\u33ae\u3394\u338e\u33d5\u338a\u34fe\u33af\u33d3\u33bf\u33bb\u338f\u3392\u3389\u33d2\u3392\u34fe\u33a4\u33eb\u34f6\u34fe\u34fd\u34f1\u3398\u33d4\u33b0\u338b\u33a9\u33c0\u34f3\u33f0\u33ba\u33bb\u33ba\u33bb\u3393\u338d\u33a2\u33af\u33d4\u339c\u339c\u33d4\u34f4\u33a2\u33d7\u33ba\u338e\u3392\u33a0\u33aa\u339c\u3390\u3383\u33ae\u33aa\u34f2\u33a3\u34fd\u33ba\u338b\u338d\u3393\u33d3\u33ba\u338d\u3393\u33a9\u3399\u33d1\u33d5\u3390\u33d1\u339d\u3394\u3382\u3383\u338e\u34f7\u338a\u3392\u339a\u339e\u33bf\u33aa\u3382\u33a4\u339a\u338f\u33c0\u33d2\u3398\u339c\u33e9\u33eb\u3398\u33ba\u33d2\u33e9\u34f8\u33a0\u339f\u338a\u3398\u33aa\u339b\u33e9\u33ea\u33a0\u33ad\u339a\u34fd\u3399\u34f2\u33c0\u33ae\u34f6\u3383\u33b9\u34fd\u33ae\u334d\u33a3\u3399\u33d1\u33d6\u33bb\u33bf\u34f6\u34fe\u33d8\u33ad\u34f3\u339c\u33ad\u33ef\u33ea\u34f2\u339b".toCharArray();
            for (int i2 = 0; i2 < 1728; ++i2) {
                int n3 = cArray[i2];
                n3 += 35553;
                n3 += 55846;
                n3 -= 1864;
                n3 ^= 0xE34A;
                n3 += 3338;
                n3 ^= 0xC66F;
                n3 -= 26930;
                n3 += 36084;
                n3 ^= 0x9E74;
                n3 += 60217;
                n3 += 15899;
                n3 ^= 0x363C;
                n3 ^= 0xE8DE;
                cArray[i2] = (char)(n3 ^= 0xB21F);
            }
            object = o_0.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)o_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n4 = -61;
        n4 ^= 0x56;
        l5 = l16 ^ (0x35600000000L ^ l16) & -1L << (n4 ^= 0xFFFFFFB5);
        long l17 = l12;
        int n5 = 62;
        n5 ^= 0x66;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n5 += -56);
        while (true) {
            int n6 = 33;
            n6 ^= 0xFFFFFFE7;
            if ((int)l12 >= (int)(l5 >>> (n6 ^= 0xFFFFFFE6))) break;
            int n3 = (int)l12;
            long l18 = l12;
            int n8 = 172;
            n8 += -125;
            int n9 = 35;
            n9 ^= 0xFFFFFFBF;
            l12 = l18 ^ (l18 ^ l18 + (long)(n8 ^= 0x2E)) & -1L >>> (n9 ^= 0xFFFFFFBC);
            long l19 = l8;
            int n10 = -176;
            n10 -= -87;
            l8 = l19 ^ ((long)cArray[n3] ^ l19) & -1L >>> (n10 += 121);
            int n7 = (int)l12;
            long l20 = l12;
            int n12 = 43;
            n12 += 83;
            int n13 = 61;
            n13 -= 18;
            l12 = l20 ^ (l20 ^ l20 + (long)(n12 += -125)) & -1L >>> (n13 += -11);
            int n14 = 8;
            n14 ^= 0xFFFFFFAF;
            long l21 = l9;
            int n15 = -85;
            n15 ^= 0x43;
            l9 = l21 ^ ((long)cArray[n7] << (n14 -= -121) ^ l21) & -1L << (n15 += 56);
            int n16 = -57;
            n16 += 18;
            n16 += 55;
            int n17 = -7;
            n17 ^= 0xFFFFFFC6;
            long l22 = l11;
            int n18 = -86;
            n18 -= -88;
            l11 = l22 ^ ((long)((int)l8 << n16 | (int)(l9 >>> (n17 -= 31))) ^ l22) & -1L >>> (n18 -= -30);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n19 = 152;
            n19 -= 34;
            l13 = l23 ^ (0L ^ l23) & -1L << (n19 ^= 0x56);
            while (true) {
                int n20 = 74;
                n20 += -90;
                if ((int)(l13 >>> (n20 ^= 0xFFFFFFD0)) >= (int)l11) break;
                int n21 = -76;
                n21 ^= 0x60;
                int n22 = -80;
                n22 -= -8;
                cArray2[(int)(l13 >>> (n21 -= -76))] = cArray[(int)l12 + (int)(l13 >>> (n22 ^= 0xFFFFFF98))];
                l13 += 0x100000000L;
            }
            int n23 = -46;
            n23 -= -88;
            int n11 = (int)(l14 >>> (n23 -= 10));
            l14 += 0x100000000L;
            o_0.Q[n11] = new String(cArray2);
            long l24 = l12;
            int n25 = -120;
            n25 -= -115;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n25 += 37);
        }
        INSTANCE = new o_0();
        int n26 = 5;
        n26 ^= 0xFFFFFF9E;
        int n27 = -17;
        n27 ^= 0x53;
        E = new Regex((String)Q[n26 ^= 0xFFFFFFAA] + (String)Q[n27 += 79]);
        int n28 = 87;
        n28 -= 65;
        int n29 = -85;
        n29 ^= 0x52;
        f = new Regex((String)Q[n28 += 10] + (String)Q[n29 -= -64]);
        int n30 = -123;
        n30 ^= 0xFFFFFFB7;
        int n31 = 92;
        n31 ^= 0x60;
        F = new Regex((String)Q[n30 += -31] + (String)Q[n31 -= -8]);
        int n32 = 305;
        n32 -= 121;
        int n33 = 162;
        n33 -= 83;
        g = new Regex((String)Q[n32 += -123] + (String)Q[n33 += -55], RegexOption.IGNORE_CASE);
        int n34 = -112;
        n34 ^= 0x29;
        Pair[] pairArray = new Pair[n34 += 77];
        int n35 = -119;
        n35 -= -115;
        n35 ^= 0xFFFFFFFC;
        int n36 = 26;
        n36 += -126;
        n36 += 109;
        int n37 = 63;
        n37 += 99;
        int n38 = 166;
        n38 -= 105;
        int n39 = 168;
        n39 -= 22;
        pairArray[n35] = TuplesKt.to((String)Q[n36] + (String)Q[n37 += -127], (String)Q[n38 += -60] + (String)Q[n39 -= 104]);
        int n40 = 110;
        n40 += -116;
        int n41 = 180;
        n41 += -83;
        int n42 = 169;
        n42 -= 38;
        pairArray[n40 += 7] = TuplesKt.to((String)Q[n41 ^= 0x7C], (String)Q[n42 += -64]);
        int n43 = 127;
        n43 ^= 0x5E;
        int n44 = -166;
        n44 -= -103;
        int n45 = 71;
        n45 ^= 3;
        pairArray[n43 += -31] = TuplesKt.to((String)Q[n44 ^= 0xFFFFFFE6], (String)Q[n45 -= 40]);
        int n46 = -146;
        n46 -= -99;
        int n47 = 115;
        n47 ^= 0x71;
        int n48 = 33;
        --n48;
        pairArray[n46 ^= 0xFFFFFFD2] = TuplesKt.to((String)Q[n47 += 5], (String)Q[n48 ^= 0x17]);
        int n49 = 114;
        n49 += -17;
        int n50 = 125;
        n50 += -39;
        int n51 = 93;
        n51 ^= 0xFFFFFF8B;
        pairArray[n49 ^= 0x65] = TuplesKt.to((String)Q[n50 += -56], (String)Q[n51 += 73]);
        int n52 = 57;
        n52 += -82;
        int n53 = -33;
        n53 ^= 0xFFFFFFB5;
        int n54 = -80;
        n54 -= -42;
        pairArray[n52 -= -30] = TuplesKt.to((String)Q[n53 += -59], (String)Q[n54 += 58]);
        G = CollectionsKt.listOf(pairArray);
        int n55 = 66;
        n55 ^= 0x58;
        n55 -= 13;
        int n56 = 42;
        n56 += 35;
        int n12 = -77;
        n12 = n12 ^ 0xFFFFFFCE;
        boolean bl2 = n12 - 124;
        h = INSTANCE.boolean((String)Q[n55] + (String)Q[n56 ^= 0x43], bl2);
        int n13 = 90;
        n13 ^= 0xFFFFFFEA;
        n13 -= -120;
        int n14 = -77;
        n14 ^= 0x36;
        int n16 = 110;
        n16 = n16 + -115;
        boolean bl3 = n16 ^ 0xFFFFFFFA;
        H = INSTANCE.boolean((String)Q[n13] + (String)Q[n14 ^= 0xFFFFFF97], bl3);
        int n17 = 83;
        n17 -= -21;
        n17 -= 94;
        int n18 = 2;
        n18 ^= 0x6B;
        int n20 = 97;
        n20 = n20 - 40;
        boolean bl4 = n20 ^ 0x39;
        i = INSTANCE.boolean((String)Q[n17] + (String)Q[n18 += -64], bl4);
        int n21 = 67;
        n21 += -60;
        int n22 = -125;
        n22 -= -118;
        int n23 = -39;
        n23 ^= 0xFFFFFFBE;
        I = INSTANCE.bind((String)Q[n21 -= -31] + (String)Q[n22 -= -77], n23 ^= 0xFFFFFF98);
        int n24 = -117;
        n24 += 4;
        int n25 = 172;
        n25 -= 33;
        int n57 = 1;
        n57 -= -5;
        j = INSTANCE.bind((String)Q[n24 ^= 0xFFFFFFA3] + (String)Q[n25 -= 75], n57 += -7);
        int n58 = 37;
        n58 -= 0;
        n58 += 15;
        int n59 = -164;
        n59 -= -49;
        int n61 = -39;
        n61 = n61 + -65;
        boolean bl5 = n61 ^ 0xFFFFFF99;
        J = INSTANCE.boolean((String)Q[n58] + (String)Q[n59 ^= 0xFFFFFFAC], bl5);
        int n62 = 22;
        n62 -= -117;
        int n63 = -42;
        n63 += 9;
        k = INSTANCE.slider((String)Q[n62 += -79] + (String)Q[n63 += 58], 3.0f, 0.0f, 10.0f, 1.0f).setVisible(o_0::fadeWaypointHideDistance$lambda$0);
        int n64 = -40;
        n64 ^= 0x21;
        M = n64 ^= 6;
        INSTANCE.setVisibleInGui(o_0::_init_$lambda$0);
        int n66 = -170;
        n66 = n66 + 123;
        boolean bl6 = n66 - -48;
        super.setEnabled(bl6);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = s;
        if (s == null) {
            objectArray = s = new Object[1];
        }
        if ((object2 = objectArray[n]) == null) {
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
                Object object4 = o_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u6a6c\u6a9a\u6903\u6a68\u68d6\u694a\u6967\u6b75\u6b98\u6b74\u68d4\u6b91\u6bbd\u6b8b\u68fb\u68d4\u6a9d\u694d".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 11269;
                        n2 -= 46535;
                        n2 += 2890;
                        n2 += 37296;
                        n2 ^= 0x19D1;
                        n2 ^= 0x7FF4;
                        n2 ^= 0x3534;
                        n2 += 59861;
                        n2 ^= 0xEFB6;
                        n2 += 7606;
                        n2 ^= 0xD6B7;
                        n2 -= 6936;
                        n2 -= 52731;
                        n2 += 65341;
                        n2 ^= 0xC29E;
                        cArray[i2] = (char)(n2 += 58719);
                    }
                    object4 = o_0.A()[1] = new String(cArray);
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
                Object object5 = o_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u84d0\u84d4\u99c6".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 ^= 0xF220;
                        n3 ^= 0x4364;
                        n3 += 22436;
                        n3 += 29226;
                        n3 -= 3083;
                        n3 -= 51343;
                        n3 -= 39728;
                        n3 -= 12562;
                        n3 ^= 0x9973;
                        n3 -= 65011;
                        n3 -= 42164;
                        n3 += 51286;
                        n3 ^= 0x3B59;
                        cArray[i3] = (char)(n3 ^= 0xD6BC);
                    }
                    object5 = o_0.A()[2] = new String(cArray);
                }
                R = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = o_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub1fb\ub1c7\ub1c5\u3b29\ub1f5\ub1f8\ub1f5\u3b29\ub1fe\ub1ed\ub1f5\ub1c5\u3b37\ub1fe\ub29b\ub29a\ub29a\ub1f3\ub29c\ub1f1".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 51908;
                    n4 ^= 0xCA5;
                    n4 += 30888;
                    n4 += 51787;
                    n4 -= 20719;
                    n4 ^= 0x2FF0;
                    n4 -= 5684;
                    n4 -= 3925;
                    n4 ^= 0xF7FB;
                    n4 += 60476;
                    n4 ^= 0xD89D;
                    n4 += 23743;
                    cArray[i4] = (char)(n4 ^= 0x5CFF);
                }
                object6 = o_0.A()[3] = new String(cArray);
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
        o_0.t[0xB2F9 ^ 0xB20D] = 0xFFFF4DD0 ^ 0xB20D;
        o_0.t[0x240A ^ 0x24C2] = 0x24B5 ^ 0x24C2;
        o_0.t[0xBC53 ^ 0xBCA3] = 0xFFFF4342 ^ 0xBCA3;
        o_0.t[0xCA0C ^ 0xCAE8] = 0xFFFF3540 ^ 0xCAE8;
        o_0.t[0x684E ^ 0x681C] = 0x6820 ^ 0x681C;
        o_0.t[0xB3F8 ^ 0xB3B6] = 0xFFFF4C43 ^ 0xB3B6;
        o_0.t[0x86FB ^ 0x86AE] = 0x86CC ^ 0x86AE;
        o_0.t[0xEDBB ^ 0xEDD1] = 0xFFFF1244 ^ 0xEDD1;
        o_0.t[0x7076 ^ 0x70E2] = 0xFFFF8F5D ^ 0x70E2;
        o_0.t[0x1E8D ^ 0x1FD9] = 0xFFFFE054 ^ 0x1FD9;
        o_0.t[0x108EF ^ 0x109FF] = 0x109B7 ^ 0x109FF;
        o_0.t[0xB1D0 ^ 0xB1A0] = 0xFFFF4E45 ^ 0xB1A0;
        o_0.t[0xB8CB ^ 0xB859] = 0xFFFF47AC ^ 0xB859;
        o_0.t[0x883B ^ 0x8834] = 0xFFFF7773 ^ 0x8834;
        o_0.t[0x8CE2 ^ 0x8DDC] = 0x8DB5 ^ 0x8DDC;
        o_0.t[0x21E5 ^ 0x2130] = 0x214B ^ 0x2130;
        o_0.t[0x9897 ^ 0x9879] = 0xFFFF67F6 ^ 0x9879;
        o_0.t[0xF79B ^ 0xF7F7] = 0xFFFF082A ^ 0xF7F7;
        o_0.t[0x108A8 ^ 0x10894] = 0x108E6 ^ 0x10894;
        o_0.t[0xE052 ^ 0xE0D0] = 0xFFFF1F66 ^ 0xE0D0;
        o_0.t[0x4223 ^ 0x4361] = 0x4366 ^ 0x4361;
        o_0.t[0xD038 ^ 0xD045] = 0xD018 ^ 0xD045;
        o_0.t[0x7E94 ^ 0x7E8F] = 0x7ED5 ^ 0x7E8F;
        o_0.t[0xA468 ^ 0xA429] = 0xA455 ^ 0xA429;
        o_0.t[0x6FD6 ^ 0x6F9C] = 0x6FA5 ^ 0x6F9C;
        o_0.t[0x48AF ^ 0x483F] = 0x4875 ^ 0x483F;
        o_0.t[0x10809 ^ 0x108AB] = 0x1088E ^ 0x108AB;
        o_0.t[0x3736 ^ 0x37F6] = 0x37A2 ^ 0x37F6;
        o_0.t[0xE573 ^ 0xE511] = 0xFFFF1AF0 ^ 0xE511;
        o_0.t[0x38E3 ^ 0x382A] = 0xFFFFC743 ^ 0x382A;
        o_0.t[0xEFD0 ^ 0xEF54] = 0xFFFF1076 ^ 0xEF54;
        o_0.t[0xF248 ^ 0xF2FE] = 0xF2D2 ^ 0xF2FE;
        o_0.t[0x84CD ^ 0x843E] = 0xFFFF7BD0 ^ 0x843E;
        o_0.t[0x10483 ^ 0x104D8] = 0x104AD ^ 0x104D8;
        o_0.t[0xC77D ^ 0xC7F1] = 0xFFFF3827 ^ 0xC7F1;
        o_0.t[0x6C5 ^ 0x602] = 0xFFFFF9FB ^ 0x602;
        o_0.t[0xD1D8 ^ 0xD1E7] = 0xFFFF2E5D ^ 0xD1E7;
        o_0.t[0x10A0E ^ 0x10A4D] = 0xFFFEF5E3 ^ 0x10A4D;
        o_0.t[0x91AA ^ 0x909D] = 0xFFFF6F5F ^ 0x909D;
        o_0.t[0xAE8F ^ 0xAEF6] = 0xAEF5 ^ 0xAEF6;
        o_0.t[0x4F7E ^ 0x4F57] = 0xFFFFB0D5 ^ 0x4F57;
        o_0.t[0xDE68 ^ 0xDFEE] = 0xFFFF2039 ^ 0xDFEE;
        o_0.t[0xD456 ^ 0xD55F] = 0xFFFF2A83 ^ 0xD55F;
        o_0.t[0x27F3 ^ 0x26C8] = 0x268F ^ 0x26C8;
        o_0.t[0x4C57 ^ 0x4C87] = 0xFFFFB378 ^ 0x4C87;
        o_0.t[0xFC7C ^ 0xFD26] = 0xFD21 ^ 0xFD26;
        o_0.t[0x90E4 ^ 0x91F3] = 0x91C6 ^ 0x91F3;
        o_0.t[0xF597 ^ 0xF588] = 0xF5D9 ^ 0xF588;
        o_0.t[0x5E4F ^ 0x5E16] = 0x5E6C ^ 0x5E16;
        o_0.t[0x52C6 ^ 0x521A] = 0xFFFFADCD ^ 0x521A;
        o_0.t[0x10E2 ^ 0x1026] = 0x107F ^ 0x1026;
        o_0.t[0x2548 ^ 0x247E] = 0x242F ^ 0x247E;
        o_0.t[0xCEB3 ^ 0xCF39] = 0xFFFF30CE ^ 0xCF39;
        o_0.t[0xF18F ^ 0xF174] = 0xF159 ^ 0xF174;
        o_0.t[0xE3DF ^ 0xE345] = 0xFFFF1C8B ^ 0xE345;
        o_0.t[0xAF92 ^ 0xAE9D] = 0xFFFF5102 ^ 0xAE9D;
        o_0.t[0xA752 ^ 0xA76B] = 0xFFFF5881 ^ 0xA76B;
        o_0.t[0xE9C2 ^ 0xE9DC] = 0xFFFF1633 ^ 0xE9DC;
        o_0.t[0x5CC ^ 0x4E4] = 0xFFFFFB44 ^ 0x4E4;
        o_0.t[0x10065 ^ 0x10140] = 0x1015E ^ 0x10140;
        o_0.t[0x79C8 ^ 0x7922] = 0x791B ^ 0x7922;
        o_0.t[0x1FAA ^ 0x1EA8] = 0xFFFFE157 ^ 0x1EA8;
        o_0.t[0x900C ^ 0x909D] = 0xFFFF6F20 ^ 0x909D;
        o_0.t[0x220C ^ 0x2387] = 0xFFFFDC35 ^ 0x2387;
        o_0.t[0x10B5 ^ 0x103C] = 0x1053 ^ 0x103C;
        o_0.t[0x169B ^ 0x16EF] = 0xFFFFE90A ^ 0x16EF;
        o_0.t[0x375A ^ 0x376B] = 0xFFFFC8E4 ^ 0x376B;
        o_0.t[0x5C5B ^ 0x5D35] = 0x5D59 ^ 0x5D35;
        o_0.t[0x3C72 ^ 0x3C7E] = 0xFFFFC3D0 ^ 0x3C7E;
        o_0.t[0x97EE ^ 0x9790] = 0xFFFF6847 ^ 0x9790;
        o_0.t[0x8E00 ^ 0x8E25] = 0x8E20 ^ 0x8E25;
        o_0.t[0x798 ^ 0x7CB] = 0xFFFFF879 ^ 0x7CB;
        o_0.t[0x4D50 ^ 0x4DD6] = 0xFFFFB243 ^ 0x4DD6;
        o_0.t[0x43A4 ^ 0x4342] = 0x4375 ^ 0x4342;
        o_0.t[0x23A2 ^ 0x2378] = 0xFFFFDCE8 ^ 0x2378;
        o_0.t[0x42B9 ^ 0x4259] = 0xFFFFBDBD ^ 0x4259;
        o_0.t[0xBA8B ^ 0xBBD6] = 0xBB81 ^ 0xBBD6;
        o_0.t[0xF4F7 ^ 0xF462] = 0xFFFF0BBD ^ 0xF462;
        o_0.t[0x8F8 ^ 0x9F2] = 0x9A1 ^ 0x9F2;
        o_0.t[0x302F ^ 0x304B] = 0x301F ^ 0x304B;
        o_0.t[0xAC2C ^ 0xACA3] = 0xFFFF534A ^ 0xACA3;
        o_0.t[0x188C ^ 0x19E5] = 0x19FD ^ 0x19E5;
        o_0.t[0x7D79 ^ 0x7DA0] = 0x7DB7 ^ 0x7DA0;
        o_0.t[0x8183 ^ 0x81B3] = 0xFFFF7E9A ^ 0x81B3;
        o_0.t[0x28D3 ^ 0x28EB] = 0x28A1 ^ 0x28EB;
        o_0.t[0xC2D5 ^ 0xC272] = 0xFFFF3DC7 ^ 0xC272;
        o_0.t[0xFF28 ^ 0xFE32] = 0xFFFF0156 ^ 0xFE32;
        o_0.t[0xFD3B ^ 0xFD54] = 0xFD06 ^ 0xFD54;
        o_0.t[0x90F9 ^ 0x90E1] = 0xFFFF6F32 ^ 0x90E1;
        o_0.t[0x1B51 ^ 0x1BC8] = 0xFFFFE42A ^ 0x1BC8;
        o_0.t[0x78DC ^ 0x78D7] = 0x78B0 ^ 0x78D7;
        o_0.t[0xAD1A ^ 0xAC12] = 0xAC03 ^ 0xAC12;
        o_0.t[0x10A8F ^ 0x10BA2] = 0x10BC5 ^ 0x10BA2;
        o_0.t[0xB13C ^ 0xB1C3] = 0xFFFF4E6A ^ 0xB1C3;
        o_0.t[0xC7EE ^ 0xC7B6] = 0xC7C0 ^ 0xC7B6;
        o_0.t[0x350 ^ 0x215] = 0x22C ^ 0x215;
        o_0.t[0x2A33 ^ 0x2B20] = 0xFFFFD4F0 ^ 0x2B20;
        o_0.t[0x964E ^ 0x9736] = 0x9714 ^ 0x9736;
        o_0.t[0x4345 ^ 0x4398] = 0x4395 ^ 0x4398;
        o_0.t[0x9118 ^ 0x914F] = 0xFFFF6E05 ^ 0x914F;
        o_0.t[0x6AC9 ^ 0x6A21] = 0xFFFF95A6 ^ 0x6A21;
        o_0.t[0xB174 ^ 0xB06D] = 0xFFFF4FE7 ^ 0xB06D;
        o_0.t[0x82A1 ^ 0x82AF] = 0xFFFF7D52 ^ 0x82AF;
        o_0.t[0x2077 ^ 0x208E] = 0xFFFFDF78 ^ 0x208E;
        o_0.t[0xB499 ^ 0xB5E5] = 0xB5F9 ^ 0xB5E5;
        o_0.t[0xE4EA ^ 0xE4FA] = 0xFFFF1B6F ^ 0xE4FA;
        o_0.t[0xA4ED ^ 0xA40E] = 0xFFFF5BB9 ^ 0xA40E;
        o_0.t[0x9EB1 ^ 0x9F32] = 0xFFFF60CE ^ 0x9F32;
        o_0.t[0x3267 ^ 0x325A] = 0x3256 ^ 0x325A;
        o_0.t[0x10F77 ^ 0x10F0B] = 0xFFFEF0B5 ^ 0x10F0B;
        o_0.t[0x8FAD ^ 0x8E25] = 0xFFFF71E7 ^ 0x8E25;
        o_0.t[0xC00C ^ 0xC064] = 0xFFFF3FFC ^ 0xC064;
        o_0.t[0x5714 ^ 0x5694] = 0xFFFFA910 ^ 0x5694;
        o_0.t[0x1F8C ^ 0x1EDD] = 0xFFFFE172 ^ 0x1EDD;
        o_0.t[0xEDF3 ^ 0xED20] = 0xFFFF12ED ^ 0xED20;
        o_0.t[0xF9D ^ 0xF84] = 0xFA7 ^ 0xF84;
        o_0.t[0x7100 ^ 0x7031] = 0xFFFF8FAB ^ 0x7031;
        o_0.t[0x5574 ^ 0x5574] = 0x5593 ^ 0x5574;
        o_0.t[0xF037 ^ 0xF02B] = 0xFFFF0FA0 ^ 0xF02B;
        o_0.t[0xA660 ^ 0xA69C] = 0xA6A4 ^ 0xA69C;
        o_0.t[0x2947 ^ 0x29F0] = 0x29B0 ^ 0x29F0;
        o_0.t[0x91D1 ^ 0x91E5] = 0xFFFF6E4B ^ 0x91E5;
        o_0.t[0xC92C ^ 0xC874] = 0xC81B ^ 0xC874;
        o_0.t[0x7BBC ^ 0x7BEA] = 0x7BBF ^ 0x7BEA;
        o_0.t[0x54AE ^ 0x5529] = 0x553C ^ 0x5529;
        o_0.t[0xC095 ^ 0xC0DC] = 0xC08D ^ 0xC0DC;
        o_0.t[0xFB2E ^ 0xFA70] = 0xFA57 ^ 0xFA70;
        o_0.t[0xF407 ^ 0xF58B] = 0xF5D7 ^ 0xF58B;
        o_0.t[0xC394 ^ 0xC281] = 0xC2A7 ^ 0xC281;
        o_0.t[0x1013C ^ 0x1001A] = 0xFFFEFFB9 ^ 0x1001A;
        o_0.t[0xFFA2 ^ 0xFF29] = 0xFFFF00C7 ^ 0xFF29;
        o_0.t[0x7EEF ^ 0x7E34] = 0xFFFF81D2 ^ 0x7E34;
        o_0.t[0x106AC ^ 0x107DC] = 0x107F2 ^ 0x107DC;
        o_0.t[0xC010 ^ 0xC158] = 0xFFFF3E96 ^ 0xC158;
        o_0.t[0xE5C3 ^ 0xE5E3] = 0xFFFF1A5E ^ 0xE5E3;
        o_0.t[0xC7EF ^ 0xC747] = 0xC7D2 ^ 0xC747;
        o_0.t[0x58D2 ^ 0x5853] = 0xFFFFA7D9 ^ 0x5853;
        o_0.t[0xD9FA ^ 0xD90F] = 0xFFFF26E4 ^ 0xD90F;
        o_0.t[0xA0A4 ^ 0xA1A7] = 0xFFFF5E2C ^ 0xA1A7;
        o_0.t[0x9767 ^ 0x97C7] = 0x97AD ^ 0x97C7;
        o_0.t[0x1064D ^ 0x1077E] = 0xFFFEF8D0 ^ 0x1077E;
        o_0.t[0x64D8 ^ 0x649E] = 0x64EE ^ 0x649E;
        o_0.t[0x8E65 ^ 0x8EAE] = 0x8EDA ^ 0x8EAE;
        o_0.t[0x1B9F ^ 0x1B67] = 0xFFFFE4F1 ^ 0x1B67;
        o_0.t[0x10E2B ^ 0x10E8D] = 0xFFFEF153 ^ 0x10E8D;
        o_0.t[0x4EDE ^ 0x4E0F] = 0x4E4C ^ 0x4E0F;
        o_0.t[0x2282 ^ 0x2389] = 0x2306 ^ 0x2389;
        o_0.t[0x411D ^ 0x418E] = 0x41ED ^ 0x418E;
        o_0.t[0x16AB ^ 0x17FC] = 0x1798 ^ 0x17FC;
        o_0.t[0xE283 ^ 0xE3E2] = 0xE39E ^ 0xE3E2;
        o_0.t[0x36EA ^ 0x36EE] = 0xFFFFC94D ^ 0x36EE;
        o_0.t[0x4F47 ^ 0x4F0B] = 0x4F5A ^ 0x4F0B;
        o_0.t[0xAC06 ^ 0xAC52] = 0xAC69 ^ 0xAC52;
        o_0.t[0x1FD7 ^ 0x1F09] = 0xFFFFE060 ^ 0x1F09;
        o_0.t[0xAFFA ^ 0xAEDB] = 0xAEEB ^ 0xAEDB;
        o_0.t[0x6053 ^ 0x6142] = 0xFFFF9EE1 ^ 0x6142;
        o_0.t[0x38BF ^ 0x381E] = 0x3821 ^ 0x381E;
        o_0.t[0xE8BC ^ 0xE8D5] = 0xE8F5 ^ 0xE8D5;
        o_0.t[0x3E69 ^ 0x3E44] = 0xFFFFC1ED ^ 0x3E44;
        o_0.t[0x9506 ^ 0x95C0] = 0xFFFF6A42 ^ 0x95C0;
        o_0.t[0xB827 ^ 0xB850] = 0xB80A ^ 0xB850;
        o_0.t[0x21C2 ^ 0x2173] = 0xFFFFDEC5 ^ 0x2173;
        o_0.t[0x6880 ^ 0x684A] = 0xFFFF97B7 ^ 0x684A;
        o_0.t[0x20D1 ^ 0x202C] = 0xFFFFDFB4 ^ 0x202C;
        o_0.t[0x1304 ^ 0x1332] = 0x1336 ^ 0x1332;
        o_0.t[0x8188 ^ 0x809A] = 0xFFFF7F09 ^ 0x809A;
        o_0.t[0xF0BB ^ 0xF0FF] = 0xF0BE ^ 0xF0FF;
        o_0.t[0x7EE2 ^ 0x7FAC] = 0x7FDC ^ 0x7FAC;
        o_0.t[0x3708 ^ 0x3667] = 0xFFFFC9D8 ^ 0x3667;
        o_0.t[0x7B34 ^ 0x7A61] = 0x7A1F ^ 0x7A61;
        o_0.t[0xF8AD ^ 0xF88A] = 0xFFFF07FE ^ 0xF88A;
        o_0.t[0x5380 ^ 0x52A3] = 0x52EA ^ 0x52A3;
        o_0.t[0x5D11 ^ 0x5C14] = 0x5C22 ^ 0x5C14;
        o_0.t[0x10217 ^ 0x10363] = 0xFFFEFCFA ^ 0x10363;
        o_0.t[0x6469 ^ 0x6426] = 0xFFFF9BE1 ^ 0x6426;
        o_0.t[0x45E6 ^ 0x4559] = 0xFFFFBAB9 ^ 0x4559;
        o_0.t[0xF1E ^ 0xF3D] = 0xFFFFF0CE ^ 0xF3D;
        o_0.t[0xBF3F ^ 0xBE55] = 0xBE7D ^ 0xBE55;
        o_0.t[0x7B54 ^ 0x7A0F] = 0xFFFF85CB ^ 0x7A0F;
        o_0.t[0xDD26 ^ 0xDC3B] = 0xDC2A ^ 0xDC3B;
        o_0.t[0xD5FC ^ 0xD47E] = 0xD425 ^ 0xD47E;
        o_0.t[0x571A ^ 0x5771] = 0xFFFFA885 ^ 0x5771;
        o_0.t[0xA0 ^ 4] = 0x78 ^ 4;
        o_0.t[0xBBCC ^ 0xBBD6] = 0xFFFF4446 ^ 0xBBD6;
        o_0.t[0x64E5 ^ 0x64DE] = 0xFFFF9B66 ^ 0x64DE;
        o_0.t[0xB6C4 ^ 0xB6F7] = 0xFFFF4913 ^ 0xB6F7;
        o_0.t[0x204A ^ 0x2062] = 0xFFFFDF88 ^ 0x2062;
        o_0.t[0x10958 ^ 0x1092B] = 0x10958 ^ 0x1092B;
        o_0.t[0x843F ^ 0x84B2] = 0x84D3 ^ 0x84B2;
        o_0.t[0x96A9 ^ 0x96BC] = 0x968D ^ 0x96BC;
        o_0.t[0x72BF ^ 0x73F9] = 0x73C6 ^ 0x73F9;
        o_0.t[0xD72C ^ 0xD7C3] = 0xD7AB ^ 0xD7C3;
        o_0.t[0x55E1 ^ 0x55E4] = 0x55A9 ^ 0x55E4;
        o_0.t[0x53F8 ^ 0x52D6] = 0xFFFFAD63 ^ 0x52D6;
        o_0.t[0x1068E ^ 0x107CE] = 0xFFFEF829 ^ 0x107CE;
        o_0.t[0x10A6B ^ 0x10B4C] = 0xFFFEF4B1 ^ 0x10B4C;
        o_0.t[0xBCC4 ^ 0xBCBC] = 0xBCF7 ^ 0xBCBC;
        o_0.t[0xBB40 ^ 0xBBB6] = 0xBB6F ^ 0xBBB6;
        o_0.t[0xD4DE ^ 0xD41C] = 0xFFFF2B8D ^ 0xD41C;
        o_0.t[0x8AC7 ^ 0x8AE1] = 0xFFFF757B ^ 0x8AE1;
        o_0.t[0x3935 ^ 0x3807] = 0x3869 ^ 0x3807;
        o_0.t[0xC286 ^ 0xC387] = 0xFFFF3C4E ^ 0xC387;
        o_0.t[0x4E34 ^ 0x4F52] = 0xFFFFB0DD ^ 0x4F52;
        o_0.t[0x197A ^ 0x19CA] = 0x19D2 ^ 0x19CA;
        o_0.t[0x1C88 ^ 0x1C50] = 0xFFFFE39F ^ 0x1C50;
        o_0.t[0x165E ^ 0x1745] = 0xFFFFE8D6 ^ 0x1745;
        o_0.t[0xC9B2 ^ 0xC837] = 0xFFFF37F6 ^ 0xC837;
        o_0.t[0x5375 ^ 0x5384] = 0x53D6 ^ 0x5384;
        o_0.t[0xB91E ^ 0xB924] = 0xFFFF46EB ^ 0xB924;
        o_0.t[0x512F ^ 0x51A1] = 0x51D7 ^ 0x51A1;
        o_0.t[0x6DAC ^ 0x6CC7] = 0x6CDE ^ 0x6CC7;
        o_0.t[0xE417 ^ 0xE593] = 0xFFFF1A2E ^ 0xE593;
        o_0.t[0x19F0 ^ 0x18FD] = 0x18D7 ^ 0x18FD;
        o_0.t[0x34C4 ^ 0x34A4] = 0x343E ^ 0x34A4;
        o_0.t[0x4088 ^ 0x41BD] = 0xFFFFBECF ^ 0x41BD;
        o_0.t[0xAE1C ^ 0xAE4D] = 0xFFFF51D9 ^ 0xAE4D;
        o_0.t[0x5D2E ^ 0x5DD0] = 0xFFFFA217 ^ 0x5DD0;
        o_0.t[0xE837 ^ 0xE848] = 0xFFFF17B5 ^ 0xE848;
        o_0.t[0x147F ^ 0x150C] = 0xFFFFEA97 ^ 0x150C;
        o_0.t[0x10719 ^ 0x1079E] = 0x107FD ^ 0x1079E;
        o_0.t[0x2001 ^ 0x20AE] = 0xFFFFDF04 ^ 0x20AE;
        o_0.t[0xA540 ^ 0xA527] = 0xFFFF5A9B ^ 0xA527;
        o_0.t[0x4447 ^ 0x445A] = 0x4461 ^ 0x445A;
        o_0.t[0x72F1 ^ 0x7248] = 0x7241 ^ 0x7248;
        o_0.t[0x4BB3 ^ 0x4AAB] = 0xFFFFB515 ^ 0x4AAB;
        o_0.t[0xC99F ^ 0xC9CF] = 0xC9B6 ^ 0xC9CF;
        o_0.t[0x4E0D ^ 0x4F22] = 0xFFFFB0A9 ^ 0x4F22;
        o_0.t[0x106AB ^ 0x106BC] = 0xFFFEF979 ^ 0x106BC;
        o_0.t[0xBA25 ^ 0xBB1D] = 0xFFFF44EA ^ 0xBB1D;
        o_0.t[0x8325 ^ 0x8205] = 0x823D ^ 0x8205;
        o_0.t[0x55E4 ^ 0x54A9] = 0x54B5 ^ 0x54A9;
        o_0.t[0xB43F ^ 0xB465] = 0xFFFF4BD2 ^ 0xB465;
        o_0.t[0xAF82 ^ 0xAE82] = 0xAEA3 ^ 0xAE82;
        o_0.t[0x1040B ^ 0x10401] = 0x10473 ^ 0x10401;
        o_0.t[0x4679 ^ 0x46C5] = 0xFFFFB971 ^ 0x46C5;
        o_0.t[0x6A3D ^ 0x6A4B] = 0x6A6E ^ 0x6A4B;
        o_0.t[0x861C ^ 0x8750] = 0x8738 ^ 0x8750;
        o_0.t[0x6A0A ^ 0x6B78] = 0xFFFF9485 ^ 0x6B78;
        o_0.t[0xC6E ^ 0xD4C] = 0xFFFFF2BF ^ 0xD4C;
        o_0.t[0x8DE8 ^ 0x8D27] = 0xFFFF7299 ^ 0x8D27;
        o_0.t[0x548E ^ 0x5507] = 0x5574 ^ 0x5507;
        o_0.t[0x4117 ^ 0x41BA] = 0x418E ^ 0x41BA;
        o_0.t[0x3706 ^ 0x37A8] = 0x37D8 ^ 0x37A8;
        o_0.t[0xC562 ^ 0xC458] = 0xFFFF3BBF ^ 0xC458;
        o_0.t[0xFDCA ^ 0xFD56] = 0xFFFF02DA ^ 0xFD56;
        o_0.t[0xC211 ^ 0xC375] = 0xC36F ^ 0xC375;
        o_0.t[0xCCE ^ 0xDD1] = 0xFFFFF24E ^ 0xDD1;
        o_0.t[0xC951 ^ 0xC920] = 0xFFFF36B3 ^ 0xC920;
        o_0.t[0xEAC4 ^ 0xEAEA] = 0xFFFF1552 ^ 0xEAEA;
        o_0.t[0x22E4 ^ 0x2206] = 0xFFFFDDEA ^ 0x2206;
        o_0.t[0x376B ^ 0x361E] = 0xFFFFC9F0 ^ 0x361E;
        o_0.t[0x2CB0 ^ 0x2C2D] = 0x2C1C ^ 0x2C2D;
        o_0.t[0xA43C ^ 0xA481] = 0xA4BD ^ 0xA481;
        o_0.t[0x607E ^ 0x6013] = 0x605B ^ 0x6013;
        o_0.t[0x87BE ^ 0x86F9] = 0x8686 ^ 0x86F9;
        o_0.t[0x4959 ^ 0x4998] = 0xFFFFB65D ^ 0x4998;
        o_0.t[0xFDFC ^ 0xFDF4] = 0xFDC0 ^ 0xFDF4;
        o_0.t[0x8B23 ^ 0x8B98] = 0xFFFF7423 ^ 0x8B98;
        o_0.t[0xB749 ^ 0xB7D6] = 0xB75F ^ 0xB7D6;
        o_0.t[0xE574 ^ 0xE541] = 0xE557 ^ 0xE541;
        o_0.t[0x3CE1 ^ 0x3CCA] = 0x3CCA ^ 0x3CCA;
        o_0.t[0x1155 ^ 0x1023] = 0xFFFFEF8A ^ 0x1023;
        o_0.t[0x4EEE ^ 0x4F8B] = 0x4FE7 ^ 0x4F8B;
        o_0.t[0x2778 ^ 0x263B] = 0x2656 ^ 0x263B;
        o_0.t[0x6DFB ^ 0x6D45] = 0xFFFF92A3 ^ 0x6D45;
        o_0.t[0x213A ^ 0x2065] = 0x2062 ^ 0x2065;
        o_0.t[0x8CCC ^ 0x8CAD] = 0x8C94 ^ 0x8CAD;
        o_0.t[0xD0ED ^ 0xD09F] = 0xD0C5 ^ 0xD09F;
        o_0.t[0x10BC5 ^ 0x10BCC] = 0x10BC7 ^ 0x10BCC;
        o_0.t[0xB540 ^ 0xB412] = 0xFFFF4B88 ^ 0xB412;
        o_0.t[0x936B ^ 0x93BD] = 0xFFFF6C76 ^ 0x93BD;
        o_0.t[0x18AA ^ 0x1810] = 0x181F ^ 0x1810;
        o_0.t[0x9A8C ^ 0x9AAE] = 0x9AC8 ^ 0x9AAE;
        o_0.t[0x1C97 ^ 0x1CE2] = 0x1C65 ^ 0x1CE2;
        o_0.t[0x9EB1 ^ 0x9FE1] = 0xFFFF600A ^ 0x9FE1;
        o_0.t[0xFA9F ^ 0xFA98] = 0xFFFF0533 ^ 0xFA98;
        o_0.t[0x2577 ^ 0x2575] = 0xFFFFDAE3 ^ 0x2575;
        o_0.t[0x157D ^ 0x15BE] = 0x159E ^ 0x15BE;
        o_0.t[0xDA12 ^ 0xDB58] = 0xDB1C ^ 0xDB58;
        o_0.t[0x37E0 ^ 0x368C] = 0xFFFFC979 ^ 0x368C;
        o_0.t[0xF1A3 ^ 0xF0CB] = 0xF08B ^ 0xF0CB;
        o_0.t[0xB7C9 ^ 0xB7D8] = 0xFFFF486B ^ 0xB7D8;
        o_0.t[0x3AE4 ^ 0x3A41] = 0x3A4A ^ 0x3A41;
        o_0.t[0xEAF8 ^ 0xEAC6] = 0xEAB8 ^ 0xEAC6;
        o_0.t[0xB1CF ^ 0xB0B4] = 0xFFFF4F7A ^ 0xB0B4;
        o_0.t[0x33A5 ^ 0x337A] = 0xFFFFCCDF ^ 0x337A;
        o_0.t[0x2AAB ^ 0x2A08] = 0x2A52 ^ 0x2A08;
        o_0.t[0xD2EE ^ 0xD242] = 0xFFFF2DCF ^ 0xD242;
        o_0.t[0x67C ^ 0x725] = 0xFFFFF89B ^ 0x725;
        o_0.t[0x2FCF ^ 0x2F7D] = 0xFFFFD0A6 ^ 0x2F7D;
        o_0.t[0xDFB8 ^ 0xDE39] = 0xFFFF21E6 ^ 0xDE39;
        o_0.t[0x10A43 ^ 0x10A71] = 0xFFFEF5E4 ^ 0x10A71;
        o_0.t[0xBD05 ^ 0xBD63] = 0xFFFF4229 ^ 0xBD63;
        o_0.t[0x7A35 ^ 0x7A81] = 0xFFFF855E ^ 0x7A81;
        o_0.t[0xC5E9 ^ 0xC55C] = 0xFFFF3AB7 ^ 0xC55C;
        o_0.t[0x7E78 ^ 0x7E99] = 0x7EE4 ^ 0x7E99;
        o_0.t[0x7BDF ^ 0x7B49] = 0xFFFF84D5 ^ 0x7B49;
        o_0.t[0x241C ^ 0x2466] = 0xFFFFDBDE ^ 0x2466;
        o_0.t[0xFCD ^ 0xF86] = 0xF4A ^ 0xF86;
        o_0.t[0xCBB4 ^ 0xCA9E] = 0xCABF ^ 0xCA9E;
        o_0.t[0x6E7F ^ 0x6E1A] = 0xFFFF91DB ^ 0x6E1A;
        o_0.t[0xE866 ^ 0xE82B] = 0xFFFF17A5 ^ 0xE82B;
        o_0.t[0x756E ^ 0x75C4] = 0xFFFF8A76 ^ 0x75C4;
        o_0.t[0xB1CA ^ 0xB1CB] = 0xB1A3 ^ 0xB1CB;
        o_0.t[0xEEBC ^ 0xEE79] = 0xFFFF11BF ^ 0xEE79;
        o_0.t[0xCC5F ^ 0xCD6B] = 0xCD49 ^ 0xCD6B;
        o_0.t[0xB326 ^ 0xB259] = 0xB267 ^ 0xB259;
        o_0.t[0x330E ^ 0x338B] = 0xFFFFCC00 ^ 0x338B;
        o_0.t[0xF4B7 ^ 0xF4D9] = 0xFFFF0B4B ^ 0xF4D9;
        o_0.t[0x10691 ^ 0x1066B] = 0xFFFEF9A3 ^ 0x1066B;
        o_0.t[0xD1E6 ^ 0xD132] = 0xFFFF2EBE ^ 0xD132;
        o_0.t[0xD88C ^ 0xD8D1] = 0xD88F ^ 0xD8D1;
        o_0.t[0xBDBB ^ 0xBD50] = 0xFFFF42DB ^ 0xBD50;
        o_0.t[0x107A6 ^ 0x106C6] = 0x106BD ^ 0x106C6;
        o_0.t[0xA962 ^ 0xA92A] = 0xA933 ^ 0xA92A;
        o_0.t[0x7492 ^ 0x75FF] = 0x75F3 ^ 0x75FF;
        o_0.t[0x5D06 ^ 0x5C12] = 0xFFFFA3C2 ^ 0x5C12;
        o_0.t[0x4F38 ^ 0x4E05] = 0x4E4B ^ 0x4E05;
        o_0.t[0xA92C ^ 0xA994] = 0xFFFF565E ^ 0xA994;
        o_0.t[0x9C1 ^ 0x92D] = 0xFFFFF6E9 ^ 0x92D;
        o_0.t[0xC370 ^ 0xC277] = 0xFFFF3DC6 ^ 0xC277;
        o_0.t[0x508 ^ 0x41E] = 0x412 ^ 0x41E;
        o_0.t[0x6F47 ^ 0x6F6B] = 0x6F30 ^ 0x6F6B;
        o_0.t[0xE6BF ^ 0xE731] = 0xFFFF18D0 ^ 0xE731;
        o_0.t[0xDC32 ^ 0xDCC5] = 0xDC96 ^ 0xDCC5;
        o_0.t[0xDF1B ^ 0xDF3A] = 0xDF60 ^ 0xDF3A;
        o_0.t[0x1FEC ^ 0x1FAE] = 0xFFFFE00E ^ 0x1FAE;
        o_0.t[0x3861 ^ 0x3967] = 0x395A ^ 0x3967;
        o_0.t[0x9F90 ^ 0x9EEE] = 0xFFFF6129 ^ 0x9EEE;
        o_0.t[0xCF01 ^ 0xCF89] = 0xCF84 ^ 0xCF89;
        o_0.t[0x7A72 ^ 0x7AD9] = 0xFFFF8560 ^ 0x7AD9;
        o_0.t[0xD07D ^ 0xD142] = 0xFFFF2ECC ^ 0xD142;
        o_0.t[0xF3BE ^ 0xF2CF] = 0xFFFF0D52 ^ 0xF2CF;
        o_0.t[0x63E2 ^ 0x63D5] = 0xFFFF9C6C ^ 0x63D5;
        o_0.t[0xED07 ^ 0xEC2B] = 0xFFFF1365 ^ 0xEC2B;
        o_0.t[0x4B31 ^ 0x4A2F] = 0x4A7F ^ 0x4A2F;
        o_0.t[0x5AF7 ^ 0x5AA9] = 0x5AC3 ^ 0x5AA9;
        o_0.t[0xC4FD ^ 0xC40F] = 0xFFFF3B9C ^ 0xC40F;
        o_0.t[0xB394 ^ 0xB387] = 0xB3DE ^ 0xB387;
        o_0.t[0x5DD2 ^ 0x5D00] = 0x5DA9 ^ 0x5D00;
        o_0.t[0xE73A ^ 0xE67E] = 0xE664 ^ 0xE67E;
        o_0.t[0x4589 ^ 0x4584] = 0x45D6 ^ 0x4584;
        o_0.t[0x1AFC ^ 0x1A6B] = 0x1A36 ^ 0x1A6B;
        o_0.t[0x9227 ^ 0x9221] = 0xFFFF6DFE ^ 0x9221;
        o_0.t[0xF40F ^ 0xF4E6] = 0xFFFF0B27 ^ 0xF4E6;
        o_0.t[0xC68 ^ 0xC42] = 0xC18 ^ 0xC42;
        o_0.t[0xC78E ^ 0xC7A1] = 0xFFFF3870 ^ 0xC7A1;
        o_0.t[0x8A0 ^ 0x98B] = 0x9DC ^ 0x98B;
        o_0.t[0x7560 ^ 0x7503] = 0x7590 ^ 0x7503;
        o_0.t[0x5C4 ^ 0x509] = 0xFFFFFAE1 ^ 0x509;
        o_0.t[0xA365 ^ 0xA2EA] = 0xFFFF5D5E ^ 0xA2EA;
        o_0.t[0xA86E ^ 0xA947] = 0xFFFF56CD ^ 0xA947;
        o_0.t[0xB315 ^ 0xB26F] = 0xFFFF4D83 ^ 0xB26F;
        o_0.t[0xFC1B ^ 0xFC85] = 0xFFFF0318 ^ 0xFC85;
        o_0.t[0x9E4E ^ 0x9E4D] = 0xFFFF61B1 ^ 0x9E4D;
        o_0.t[0xA4E0 ^ 0xA4F2] = 0xFFFF5B9B ^ 0xA4F2;
        o_0.t[0x99DA ^ 0x999D] = 0xFFFF6657 ^ 0x999D;
        o_0.t[0x771C ^ 0x7738] = 0x7752 ^ 0x7738;
        o_0.t[0x8431 ^ 0x844A] = 0x84EB ^ 0x844A;
        o_0.t[0xBC1B ^ 0xBC80] = 0xBCD2 ^ 0xBC80;
        o_0.t[0xB07A ^ 0xB15E] = 0xB17F ^ 0xB15E;
        o_0.t[0xA656 ^ 0xA752] = 0xA77D ^ 0xA752;
        o_0.t[0x45BB ^ 0x4531] = 0xFFFFBAF5 ^ 0x4531;
        o_0.t[0x89EB ^ 0x8888] = 0xFFFF7711 ^ 0x8888;
        o_0.t[0xC5E5 ^ 0xC4E9] = 0xC4AC ^ 0xC4E9;
        o_0.t[0x9B58 ^ 0x9BC0] = 0xFFFF6461 ^ 0x9BC0;
        o_0.t[0xD90F ^ 0xD876] = 0xFFFF27CE ^ 0xD876;
        o_0.t[0x42FA ^ 0x4398] = 0x43E7 ^ 0x4398;
        o_0.t[0x10435 ^ 0x1050C] = 0x1051D ^ 0x1050C;
        o_0.t[0x89E6 ^ 0x89A3] = 0x8999 ^ 0x89A3;
        o_0.t[0xCE62 ^ 0xCE3E] = 0xCE12 ^ 0xCE3E;
        o_0.t[0x2836 ^ 0x2885] = 0xFFFFD75F ^ 0x2885;
        o_0.t[0x10232 ^ 0x102DF] = 0x102D6 ^ 0x102DF;
        o_0.t[0x6E6A ^ 0x6F21] = 0x6F05 ^ 0x6F21;
        o_0.t[0x86D3 ^ 0x87CF] = 0xFFFF781D ^ 0x87CF;
        o_0.t[0xC3AB ^ 0xC2DC] = 0xC2FA ^ 0xC2DC;
        o_0.t[0x5A3 ^ 0x4F5] = 0x4F9 ^ 0x4F5;
        o_0.t[0x10D1D ^ 0x10C41] = 0x10CF1 ^ 0x10C41;
        o_0.t[0x47D6 ^ 0x47C0] = 0xFFFFB87B ^ 0x47C0;
        o_0.t[0xEE4C ^ 0xEE82] = 0xFFFF1132 ^ 0xEE82;
        o_0.t[0xAF1A ^ 0xAFFD] = 0xFFFF5095 ^ 0xAFFD;
        o_0.t[0xBDE ^ 0xB12] = 0xB9A ^ 0xB12;
        o_0.t[0x69FE ^ 0x6929] = 0x696E ^ 0x6929;
        o_0.t[0x6583 ^ 0x64BF] = 0x64B7 ^ 0x64BF;
        o_0.t[0xD200 ^ 0xD2A9] = 0xD28E ^ 0xD2A9;
        o_0.t[0x3F5A ^ 0x3FBF] = 0x3FFE ^ 0x3FBF;
        o_0.t[0xEE9C ^ 0xEFD5] = 0xFFFF1006 ^ 0xEFD5;
        o_0.t[0xEF4F ^ 0xEE00] = 0xFFFF11AC ^ 0xEE00;
        o_0.t[0xAE3C ^ 0xAEBC] = 0xAEA6 ^ 0xAEBC;
        o_0.t[0xCED3 ^ 0xCFAE] = 0xFFFF3051 ^ 0xCFAE;
        o_0.t[0x9304 ^ 0x935B] = 0x9355 ^ 0x935B;
        o_0.t[0xA8BF ^ 0xA83C] = 0xA800 ^ 0xA83C;
        o_0.t[0x1FCC ^ 0x1F8C] = 0x1FB9 ^ 0x1F8C;
        o_0.t[0xA43E ^ 0xA530] = 0xFFFF5AC7 ^ 0xA530;
        o_0.t[0x49F0 ^ 0x487D] = 0x4806 ^ 0x487D;
        o_0.t[0x7DA9 ^ 0x7DBD] = 0x7D80 ^ 0x7DBD;
        o_0.t[0xFDB1 ^ 0xFCE2] = 0xFFFF03EF ^ 0xFCE2;
        o_0.t[0x69D5 ^ 0x68E5] = 0x68F5 ^ 0x68E5;
        o_0.t[0x32D3 ^ 0x3392] = 0x3318 ^ 0x3392;
        o_0.t[0xF9DD ^ 0xF8BA] = 0xFFFF0771 ^ 0xF8BA;
    }
}

