/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotakbaz.rain.ui.menu.FunTimeEventsApi;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0651;
import oxxxde.\u0633\u0628;
import oxxxde.\u0639\u062e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c0\u0002\u0018\u00002\u00020\u0001:\tfghijklmnB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0004\b \u0010!J-\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020(2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020(0\"H\u0002\u00a2\u0006\u0004\b+\u0010,J+\u0010.\u001a\b\u0012\u0004\u0012\u00020$0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\"2\u0006\u0010-\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b.\u0010/J-\u00103\u001a\u0004\u0018\u00010\u001a2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007002\u0006\u00102\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\n2\u0006\u0010'\u001a\u00020$2\u0006\u00105\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b6\u00107J+\u00108\u001a\b\u0012\u0004\u0012\u00020$0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\"2\u0006\u00102\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b8\u0010/J\u0017\u0010:\u001a\u00020\r2\u0006\u00109\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0004\u0018\u00010\r*\u00020\rH\u0002\u00a2\u0006\u0004\b<\u0010;J\u001d\u0010=\u001a\u0004\u0018\u00010\r*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u0007*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\r0J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u001c\u0010P\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010S\u001a\n O*\u0004\u0018\u00010R0R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bX\u0010GR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_R\"\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020`008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\ba\u0010\\R$\u0010d\u001a\u0012\u0012\u0004\u0012\u00020(0bj\b\u0012\u0004\u0012\u00020(`c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bd\u0010e\u00a8\u0006o"}, d2={"Loxxxde/\u062e\u0645;", "", "<init>", "()V", "Loxxxde/\u062e\u064e;", "snapshot", "()Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Snapshot;", "", "anarchy", "secondsLeft", "", "syncWithLiveCountdown", "(Ljava/lang/Integer;I)V", "", "name", "Loxxxde/\u0634\u0629;", "status", "syncWithLiveEvent", "(Ljava/lang/Integer;Ljava/lang/String;Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Status;Ljava/lang/Integer;)V", "refreshIfNeeded", "Loxxxde/\u0632\u0647;", "response", "publishSuccess", "(Lkotakbaz/rain/ui/menu/FunTimeEventsApi$ParsedResponse;)V", "publishFailure", "json", "", "fetchedAt", "parse", "(Ljava/lang/String;J)Lkotakbaz/rain/ui/menu/FunTimeEventsApi$ParsedResponse;", "Lcom/google/gson/JsonObject;", "Loxxxde/\u0633\u0622;", "parseEvent", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/ui/menu/FunTimeEventsApi$RawEvent;", "", "events", "Loxxxde/\u0635\u0629;", "createEvent", "(ILjava/util/List;J)Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Event;", "event", "Loxxxde/\u062f\u0643;", "toCandidate", "(Lkotakbaz/rain/ui/menu/FunTimeEventsApi$RawEvent;)Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Candidate;", "mergeDuplicates", "(Ljava/util/List;)Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Candidate;", "originAt", "rebaseDeadlines", "(Ljava/util/List;J)Ljava/util/List;", "", "countdowns", "now", "resolveSnapshotOrigin", "(Ljava/util/Map;J)Ljava/lang/Long;", "expiresAt", "putLiveOverride", "(Lkotakbaz/rain/ui/menu/FunTimeEventsApi$Event;J)V", "applyLiveOverrides", "id", "eventName", "(Ljava/lang/String;)Ljava/lang/String;", "normalizedValue", "string", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;", "int", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)I", "seconds", "formatDuration", "(I)Ljava/lang/String;", "ENDPOINT", "Ljava/lang/String;", "REFRESH_INTERVAL_MS", "J", "MAX_CALIBRATION_OFFSET_SECONDS", "I", "", "ignoredEventIds", "Ljava/util/Set;", "ignoredEventNames", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/net/http/HttpClient;", "client", "Ljava/net/http/HttpClient;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loading", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastRequestAt", "current", "Loxxxde/\u062e\u064e;", "systemCountdowns", "Ljava/util/Map;", "Loxxxde/\u062d\u064d;", "liveCountdown", "Loxxxde/\u062d\u064d;", "Loxxxde/\u062a\u0646;", "liveOverrides", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "candidateComparator", "Ljava/util/Comparator;", "Snapshot", "Event", "Status", "ParsedResponse", "LiveCountdown", "LiveOverride", "RawEvent", "CandidateKey", "Candidate", "rain-visuals"})
public final class \u062e\u0645 {
    @NotNull
    private static final AtomicBoolean loading;
    private static final int MAX_CALIBRATION_OFFSET_SECONDS = 600;
    @NotNull
    private static volatile FunTimeEventsApi.Snapshot current;
    @NotNull
    public static final \u062e\u0645 INSTANCE;
    @NotNull
    private static volatile Map<Integer, Integer> systemCountdowns;
    @NotNull
    private static volatile Map<Integer, FunTimeEventsApi.LiveOverride> liveOverrides;
    @NotNull
    private static final Set<String> ignoredEventNames;
    private static final long REFRESH_INTERVAL_MS = 5000L;
    @NotNull
    private static final String ENDPOINT = "https://api.sskyness.space/api/server/funtime/events";
    @Nullable
    private static volatile FunTimeEventsApi.LiveCountdown liveCountdown;
    private static volatile long lastRequestAt;
    @NotNull
    private static final Comparator<FunTimeEventsApi.Candidate> candidateComparator;
    @NotNull
    private static final Set<String> ignoredEventIds;
    private static final ExecutorService executor;
    private static final HttpClient client;

    private static final Comparable candidateComparator$lambda$3(FunTimeEventsApi.Candidate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSecondsLeft() > 0 ? (Comparable)Integer.valueOf(it.getSecondsLeft()) : (Comparable)Integer.valueOf(Integer.MAX_VALUE);
    }

    private static final Comparable candidateComparator$lambda$0(FunTimeEventsApi.Candidate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getStatus().getPriority());
    }

    private final void publishFailure() {
        FunTimeEventsApi.Snapshot previous = current;
        current = FunTimeEventsApi.Snapshot.copy$default(previous, previous.getGeneration() + 1L, null, false, true, 0L, 18, null);
    }

    private final FunTimeEventsApi.Candidate toCandidate(FunTimeEventsApi.RawEvent event) {
        String phase;
        String string = event.getId();
        if (string == null) {
            return null;
        }
        String id = string;
        String string2 = event.getPhase();
        if (string2 == null) {
            return null;
        }
        FunTimeEventsApi.Status status = switch (phase = string2) {
            case "STARTING", "ACTIVATING" -> FunTimeEventsApi.Status.ACTIVATING;
            case "OPENED" -> FunTimeEventsApi.Status.OPENED;
            case "RUNNING" -> FunTimeEventsApi.Status.RUNNING;
            case "LOOTING" -> FunTimeEventsApi.Status.LOOTING;
            case "WAITING" -> FunTimeEventsApi.Status.WAITING;
            default -> null;
        };
        if (status == null) {
            return null;
        }
        FunTimeEventsApi.Status status2 = status;
        return new FunTimeEventsApi.Candidate(id, phase, status2, event.getSecondsLeft(), event.getLoot(), Intrinsics.areEqual(event.getType(), "system"));
    }

    /*
     * Unable to fully structure code
     */
    private final FunTimeEventsApi.Candidate mergeDuplicates(List<FunTimeEventsApi.Candidate> events) {
        block7: {
            block6: {
                first = CollectionsKt.first(events);
                var3_3 = events;
                var12_4 = null;
                var11_5 = null;
                var10_6 = null;
                var9_7 = first;
                var4_8 = var3_3.iterator();
                if (!var4_8.hasNext()) {
                    throw new NoSuchElementException();
                }
                p0 = (FunTimeEventsApi.Candidate)var4_8.next();
                $i$a$-maxOf-FunTimeEventsApi$mergeDuplicates$1 = false;
                p0 = p0.getSecondsLeft();
                while (var4_8.hasNext()) {
                    p0 = (FunTimeEventsApi.Candidate)var4_8.next();
                    $i$a$-maxOf-FunTimeEventsApi$mergeDuplicates$1 = false;
                    p0 = p0.getSecondsLeft();
                    if (p0 >= p0) continue;
                    p0 = p0;
                }
                var13_19 = p0;
                var3_3 = events;
                for (FunTimeEventsApi.Candidate p0 : var3_3) {
                    $i$a$-firstNotNullOfOrNull-FunTimeEventsApi$mergeDuplicates$2 = false;
                    if ((var5_12 = var5_12.getLoot()) == null) continue;
                    v0 = var5_12;
                    break block6;
                }
                v0 = null;
            }
            var14_20 = v0;
            var3_3 = events;
            $i$f$any = false;
            if (!($this$any$iv instanceof Collection)) ** GOTO lbl-1000
            if (((Collection)$this$any$iv).isEmpty()) {
                v1 = false;
            } else lbl-1000:
            // 3 sources

            {
                for (T element$iv : $this$any$iv) {
                    var7_18 = (FunTimeEventsApi.Candidate)element$iv;
                    var8_21 = false;
                    if (!var7_18.getSystem()) continue;
                    v1 = true;
                    break block7;
                }
                v1 = false;
            }
        }
        var15_22 = v1;
        return FunTimeEventsApi.Candidate.copy$default(var9_7, var10_6, var11_5, var12_4, var13_19, var14_20, var15_22, 7, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String string(JsonObject $this$string, String name) {
        JsonElement jsonElement = $this$string.get(name);
        JsonElement jsonElement2 = jsonElement;
        if (jsonElement == null) return null;
        JsonElement jsonElement3 = jsonElement2;
        JsonElement it = jsonElement3;
        boolean bl = false;
        if (!it.isJsonPrimitive()) return null;
        JsonElement jsonElement4 = jsonElement3;
        jsonElement2 = jsonElement4;
        if (jsonElement4 == null) return null;
        String string = jsonElement2.getAsString();
        return string;
    }

    private final int int(JsonObject $this$int, String name) {
        Object object;
        Object object2 = $this$int;
        try {
            JsonObject $this$int_u24lambda_u240 = object2;
            boolean bl = false;
            JsonElement jsonElement = $this$int_u24lambda_u240.get(name);
            object = Result.constructor-impl(jsonElement != null ? jsonElement.getAsInt() : 0);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        object = 0;
        return ((Number)(Result.isFailure-impl(object2) ? object : object2)).intValue();
    }

    /*
     * WARNING - void declaration
     */
    private final FunTimeEventsApi.Event createEvent(int anarchy, List<FunTimeEventsApi.RawEvent> events, long fetchedAt) {
        void var1_1;
        Object object;
        void $this$mapTo$iv$iv;
        Object list$iv$iv;
        Map $this$groupByTo$iv$iv;
        Sequence $this$groupBy$iv = SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence((Iterable)events), \u062e\u0645::createEvent$lambda$0), new \u0639\u062e(this));
        boolean $i$f$groupBy = false;
        Sequence sequence = $this$groupBy$iv;
        Object destination$iv$iv = new LinkedHashMap();
        boolean $i$f$groupByTo = false;
        Iterator<Object> iterator2 = $this$groupByTo$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void v0;
            Object element$iv$iv = iterator2.next();
            FunTimeEventsApi.Candidate it = (FunTimeEventsApi.Candidate)element$iv$iv;
            boolean bl = false;
            FunTimeEventsApi.CandidateKey key$iv$iv = new FunTimeEventsApi.CandidateKey(it.getId(), it.getPhase());
            Object $this$getOrPut$iv$iv$iv = destination$iv$iv;
            FunTimeEventsApi.CandidateKey key$iv$iv$iv = key$iv$iv;
            boolean $i$f$getOrPut = false;
            Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv$iv);
            if (value$iv$iv$iv == null) {
                void var20_35;
                boolean bl2 = false;
                List answer$iv$iv$iv = new ArrayList();
                $this$getOrPut$iv$iv$iv.put(key$iv$iv$iv, answer$iv$iv$iv);
                v0 = var20_35;
            } else {
                void var19_34;
                v0 = var19_34;
            }
            list$iv$iv = (List)v0;
            list$iv$iv.add(element$iv$iv);
        }
        Map $this$map$iv = destination$iv$iv;
        boolean $i$f$map = false;
        $this$groupByTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList($this$map$iv.size());
        boolean $i$f$mapTo = false;
        iterator2 = $this$mapTo$iv$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            Object item$iv$iv;
            list$iv$iv = item$iv$iv = (Map.Entry)iterator2.next();
            Object object2 = destination$iv$iv;
            boolean bl = false;
            List duplicates = (List)list$iv$iv.getValue();
            object2.add(INSTANCE.mergeDuplicates(duplicates));
        }
        List<FunTimeEventsApi.Candidate> candidates = CollectionsKt.sortedWith((List)destination$iv$iv, candidateComparator);
        FunTimeEventsApi.Candidate primary = CollectionsKt.firstOrNull(candidates);
        if (primary != null) {
            Long l;
            Iterable $this$distinctBy$iv = candidates;
            boolean $i$f$distinctBy = false;
            HashSet<Object> set$iv = new HashSet<Object>();
            ArrayList list$iv = new ArrayList();
            for (Object e$iv : $this$distinctBy$iv) {
                Object key$iv = (FunTimeEventsApi.Candidate)e$iv;
                boolean bl = false;
                if (!set$iv.add(key$iv = ((FunTimeEventsApi.Candidate)key$iv).getId())) continue;
                list$iv.add(e$iv);
            }
            int additionalCount = RangesKt.coerceAtLeast(((List)list$iv).size() - 1, 0);
            Comparable<StringBuilder> $this$createEvent_u24lambda_u243 = $i$f$distinctBy = new StringBuilder();
            boolean bl = false;
            $this$createEvent_u24lambda_u243.append(INSTANCE.eventName(primary.getId()));
            String string = primary.getLoot();
            if (string != null) {
                String it = string;
                boolean bl3 = false;
                $this$createEvent_u24lambda_u243.append(" \u2022 ").append(it);
            }
            if (additionalCount > 0) {
                $this$createEvent_u24lambda_u243.append(" + \u0435\u0449\u0451 ").append(additionalCount);
            }
            String name = $i$f$distinctBy.toString();
            $this$createEvent_u24lambda_u243 = primary.getSecondsLeft();
            int it = ((Number)((Object)$this$createEvent_u24lambda_u243)).intValue();
            boolean bl4 = false;
            Comparable<StringBuilder> countdown = primary.getStatus().getHasCountdown() && it > 0 ? $this$createEvent_u24lambda_u243 : null;
            int n = anarchy;
            String string2 = name;
            FunTimeEventsApi.Status status = primary.getStatus();
            Comparable<StringBuilder> comparable = countdown;
            Comparable<StringBuilder> comparable2 = countdown;
            if (comparable2 != null) {
                it = ((Number)((Object)comparable2)).intValue();
                Comparable<StringBuilder> comparable3 = comparable;
                FunTimeEventsApi.Status status2 = status;
                String string3 = string2;
                int n2 = n;
                boolean bl5 = false;
                Long l2 = fetchedAt + (long)it * 1000L;
                n = n2;
                string2 = string3;
                status = status2;
                comparable = comparable3;
                l = l2;
            } else {
                l = null;
            }
            String string4 = primary.getId() + ":" + primary.getPhase();
            boolean bl6 = true;
            Long l3 = l;
            Comparable<StringBuilder> comparable4 = comparable;
            FunTimeEventsApi.Status status3 = status;
            String string5 = string2;
            int n3 = n;
            return new FunTimeEventsApi.Event(n3, string5, status3, (Integer)comparable4, l3, bl6, string4);
        }
        Sequence<FunTimeEventsApi.RawEvent> $this$maxByOrNull$iv = SequencesKt.filter(CollectionsKt.asSequence((Iterable)events), \u062e\u0645::createEvent$lambda$6);
        boolean $i$f$maxByOrNull = false;
        Iterator<FunTimeEventsApi.RawEvent> iterator$iv = $this$maxByOrNull$iv.iterator();
        if (!iterator$iv.hasNext()) {
            object = null;
        } else {
            FunTimeEventsApi.RawEvent maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                object = maxElem$iv;
            } else {
                void var10_14;
                FunTimeEventsApi.RawEvent maxValue$iv22 = maxElem$iv;
                boolean e$iv = false;
                int maxValue$iv22 = maxValue$iv22.getSecondsLeft();
                do {
                    void var13_24;
                    int n;
                    void var14_27;
                    FunTimeEventsApi.RawEvent v$iv = e$iv = iterator$iv.next();
                    boolean bl = false;
                    int n4 = var14_27.getSecondsLeft();
                    if (n >= n4) continue;
                    iterator2 = var13_24;
                    n = n4;
                } while (var10_14.hasNext());
                object = iterator2;
            }
        }
        FunTimeEventsApi.RawEvent upcoming = (FunTimeEventsApi.RawEvent)object;
        if (upcoming != null) {
            return new FunTimeEventsApi.Event(anarchy, "\u0421\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u0435", FunTimeEventsApi.Status.UPCOMING, upcoming.getSecondsLeft(), fetchedAt + (long)upcoming.getSecondsLeft() * 1000L, false, "system:upcoming");
        }
        return new FunTimeEventsApi.Event((int)var1_1, "\u041d\u0435\u0442 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0445 \u0441\u043e\u0431\u044b\u0442\u0438\u0439", FunTimeEventsApi.Status.IDLE, null, null, false, "system:idle");
    }

    private \u062e\u0645() {
    }

    private static final Comparable candidateComparator$lambda$2(FunTimeEventsApi.Candidate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSystem() ? (Comparable)Integer.valueOf(0) : (Comparable)Integer.valueOf(1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void publishSuccess(FunTimeEventsApi.ParsedResponse response) {
        \u062e\u0645 \u062e\u06452 = this;
        synchronized (\u062e\u06452) {
            Object object;
            FunTimeEventsApi.Snapshot previous;
            block8: {
                block7: {
                    boolean bl = false;
                    previous = current;
                    systemCountdowns = response.getSystemCountdowns();
                    Long origin = INSTANCE.resolveSnapshotOrigin(response.getSystemCountdowns(), response.getFetchedAt());
                    object = origin;
                    if (object == null) break block7;
                    long it = ((Number)object).longValue();
                    boolean bl2 = false;
                    List<FunTimeEventsApi.Event> list = INSTANCE.rebaseDeadlines(response.getEvents(), it);
                    object = list;
                    if (list != null) break block8;
                }
                object = response.getEvents();
            }
            List<FunTimeEventsApi.Event> events = object;
            current = new FunTimeEventsApi.Snapshot(previous.getGeneration() + 1L, INSTANCE.applyLiveOverrides(events, response.getFetchedAt()), false, false, response.getFetchedAt());
            Unit unit = Unit.INSTANCE;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final List<FunTimeEventsApi.Event> rebaseDeadlines(List<FunTimeEventsApi.Event> events, long originAt) {
        void var7_6;
        void $this$mapTo$iv$iv;
        Iterable $this$map$iv = events;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            FunTimeEventsApi.Event event;
            FunTimeEventsApi.Event event2 = (FunTimeEventsApi.Event)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            if (StringsKt.startsWith$default(event2.getTimerIdentity$rain_visuals(), "live:", false, 2, null)) {
                event = event2;
            } else {
                Integer n = event2.getReportedSeconds();
                if (n == null) {
                    event = event2;
                } else {
                    int seconds = n;
                    event = FunTimeEventsApi.Event.copy$default(event2, 0, null, null, null, originAt + (long)seconds * 1000L, false, null, 111, null);
                }
            }
            collection.add(event);
        }
        return (List)var7_6;
    }

    /*
     * WARNING - void declaration
     */
    private final List<FunTimeEventsApi.Event> applyLiveOverrides(List<FunTimeEventsApi.Event> events, long now) {
        Iterable $this$sortedBy$iv;
        Map.Entry entry;
        List<Object> $this$mapTo$iv;
        Map valid;
        Map<Integer, FunTimeEventsApi.LiveOverride> $this$filterValues$iv = liveOverrides;
        boolean $i$f$filterValues232 = false;
        LinkedHashMap<Integer, FunTimeEventsApi.LiveOverride> result$iv = new LinkedHashMap<Integer, FunTimeEventsApi.LiveOverride>();
        for (Map.Entry<Integer, FunTimeEventsApi.LiveOverride> entry2 : $this$filterValues$iv.entrySet()) {
            FunTimeEventsApi.LiveOverride liveOverride = entry2.getValue();
            boolean bl = false;
            boolean bl2 = liveOverride.getExpiresAt() > now;
            if (!bl2) continue;
            result$iv.put(entry2.getKey(), entry2.getValue());
        }
        liveOverrides = valid = (Map)result$iv;
        if (valid.isEmpty()) {
            return events;
        }
        Iterable $i$f$filterValues232 = events;
        Collection destination$iv = new HashSet();
        boolean $i$f$mapTo = false;
        for (Object t : $this$mapTo$iv) {
            void var11_20;
            FunTimeEventsApi.Event p0 = (FunTimeEventsApi.Event)t;
            Collection collection = destination$iv;
            boolean bl = false;
            collection.add(var11_20.getAnarchy());
        }
        HashSet known = (HashSet)destination$iv;
        List<Object> $this$applyLiveOverrides_u24lambda_u241 = $this$mapTo$iv = CollectionsKt.createListBuilder();
        boolean bl = false;
        Iterable iterable = events;
        boolean bl3 = false;
        for (Object element$iv : iterable) {
            FunTimeEventsApi.Event it = (FunTimeEventsApi.Event)element$iv;
            boolean bl32 = false;
            Object object = (FunTimeEventsApi.LiveOverride)valid.get(it.getAnarchy());
            if (object == null || (object = ((FunTimeEventsApi.LiveOverride)object).getEvent()) == null) {
                object = entry;
            }
            $this$applyLiveOverrides_u24lambda_u241.add(object);
        }
        Map map = valid;
        boolean bl4 = false;
        Iterator<Object> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            void var16_30;
            Map.Entry element$iv;
            entry = element$iv = (Map.Entry)iterator2.next();
            boolean bl42 = false;
            int anarchy = ((Number)entry.getKey()).intValue();
            FunTimeEventsApi.LiveOverride override = (FunTimeEventsApi.LiveOverride)entry.getValue();
            if (known.contains(anarchy)) continue;
            $this$applyLiveOverrides_u24lambda_u241.add(var16_30.getEvent());
        }
        $this$sortedBy$iv = CollectionsKt.build($this$sortedBy$iv);
        boolean $i$f$sortedBy = false;
        return CollectionsKt.sortedWith($this$sortedBy$iv, new \u0633\u0628());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public final void syncWithLiveEvent(@Nullable Integer anarchy, @NotNull String name, @NotNull FunTimeEventsApi.Status status, @Nullable Integer secondsLeft) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter((Object)status, "status");
        Integer n = anarchy;
        if (n == null) {
            return;
        }
        n.intValue();
        String normalizedName = StringsKt.removeSuffix(((Object)StringsKt.trim((CharSequence)name)).toString(), (CharSequence)":");
        Object object = normalizedName;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string = ((String)object).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        if (ignoredEventNames.contains(string)) {
            return;
        }
        object = this;
        synchronized (object) {
            void var8_9;
            CharSequence charSequence;
            Long l;
            Integer countdown;
            Integer n2;
            boolean bl = false;
            long now = System.currentTimeMillis();
            Integer n3 = secondsLeft;
            if (n3 != null) {
                Integer n4 = n3;
                int it = ((Number)n4).intValue();
                boolean bl2 = false;
                n2 = status.getHasCountdown() && it > 0 ? n4 : null;
            } else {
                n2 = null;
            }
            Integer n5 = countdown = n2;
            if (n5 != null) {
                int it = ((Number)n5).intValue();
                boolean bl3 = false;
                l = now + (long)it * 1000L;
            } else {
                l = null;
            }
            Long deadline = l;
            int n6 = anarchy;
            CharSequence it = normalizedName;
            boolean bl4 = it.length() == 0;
            if (bl4) {
                int n7 = n6;
                boolean bl5 = false;
                String string2 = "\u0421\u043e\u0431\u044b\u0442\u0438\u0435";
                n6 = n7;
                charSequence = string2;
            } else {
                charSequence = it;
            }
            String string3 = "live:event";
            boolean bl6 = true;
            Long l2 = deadline;
            Integer n8 = countdown;
            FunTimeEventsApi.Status status2 = status;
            String string4 = (String)charSequence;
            int n9 = n6;
            FunTimeEventsApi.Event event = new FunTimeEventsApi.Event(n9, string4, status2, n8, l2, bl6, string3);
            Long l3 = deadline;
            INSTANCE.putLiveOverride(event, l3 != null ? l3 + 30000L : now + 600000L);
            FunTimeEventsApi.Snapshot previous = current;
            current = FunTimeEventsApi.Snapshot.copy$default(previous, previous.getGeneration() + 1L, INSTANCE.applyLiveOverrides(previous.getEvents(), (long)var8_9), false, false, 0L, 28, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    private static final void refreshIfNeeded$lambda$0$3(Function2 $tmp0, Object p0, Object p1) {
        $tmp0.invoke(p0, p1);
    }

    private final String formatDuration(int seconds) {
        String string;
        if (seconds >= 3600) {
            String string2 = "%d:%02d:%02d";
            Locale locale = Locale.ROOT;
            Object[] objectArray = new Object[3];
            objectArray[0] = seconds / 3600;
            objectArray[1] = seconds / 60 % 60;
            objectArray[2] = seconds % 60;
            String string3 = String.format(locale, string2, Arrays.copyOf(objectArray, objectArray.length));
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "format(...)");
        } else {
            String string4 = "%d:%02d";
            Locale locale = Locale.ROOT;
            Object[] objectArray = new Object[2];
            objectArray[0] = seconds / 60;
            objectArray[1] = seconds % 60;
            String string5 = String.format(locale, string4, Arrays.copyOf(objectArray, objectArray.length));
            string = string5;
            Intrinsics.checkNotNullExpressionValue(string5, "format(...)");
        }
        return string;
    }

    static {
        INSTANCE = new \u062e\u0645();
        Object[] objectArray = new String[2];
        objectArray[0] = "airdrop";
        objectArray[1] = "altarundead";
        ignoredEventIds = SetsKt.setOf(objectArray);
        objectArray = new String[2];
        objectArray[0] = "\u0430\u0438\u0440\u0434\u0440\u043e\u043f";
        objectArray[1] = "\u0430\u043b\u0442\u0430\u0440\u044c \u043d\u0435\u0436\u0438\u0442\u0438";
        ignoredEventNames = SetsKt.plus(ignoredEventIds, (Iterable)SetsKt.setOf(objectArray));
        executor = Executors.newSingleThreadExecutor(\u062e\u0645::executor$lambda$0);
        client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).executor(executor).build();
        loading = new AtomicBoolean();
        current = new FunTimeEventsApi.Snapshot(0L, null, false, false, 0L, 31, null);
        systemCountdowns = MapsKt.emptyMap();
        liveOverrides = MapsKt.emptyMap();
        objectArray = new Function1[5];
        objectArray[0] = \u062e\u0645::candidateComparator$lambda$0;
        objectArray[1] = \u062e\u0645::candidateComparator$lambda$1;
        objectArray[2] = \u062e\u0645::candidateComparator$lambda$2;
        objectArray[3] = \u062e\u0645::candidateComparator$lambda$3;
        objectArray[4] = \u062e\u0645::candidateComparator$lambda$4;
        candidateComparator = ComparisonsKt.compareBy(objectArray);
    }

    private final String eventName(String id) {
        return switch (id) {
            case "beacon" -> "\u041c\u0430\u044f\u043a";
            case "deathchest" -> "\u0421\u0443\u043d\u0434\u0443\u043a \u0441\u043c\u0435\u0440\u0442\u0438";
            case "geyser" -> "\u0413\u0435\u0439\u0437\u0435\u0440";
            case "hellm" -> "\u0421\u0443\u043d\u0434\u0443\u043a \u0441\u043c\u0435\u0440\u0442\u0438";
            case "meteor_rain" -> "\u041c\u0435\u0442\u0435\u043e\u0440\u0438\u0442";
            case "myst_beacon" -> "\u041c\u0438\u0441\u0442\u0438\u043a";
            case "vulkan" -> "\u0412\u0443\u043b\u043a\u0430\u043d";
            default -> {
                String var3_3 = StringsKt.replace$default(id, '_', ' ', false, 4, null);
                if (((CharSequence)var3_3).length() > 0) {
                    void it;
                    char var4_4 = var3_3.charAt(0);
                    StringBuilder var6_6 = new StringBuilder();
                    boolean $i$a$-replaceFirstCharWithCharSequence-FunTimeEventsApi$eventName$1 = false;
                    Locale v1 = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(v1, "ROOT");
                    StringBuilder v2 = var6_6.append((Object)CharsKt.titlecase((char)it, v1));
                    String var4_5 = var3_3;
                    int var5_7 = 1;
                    String v3 = var4_5.substring(var5_7);
                    Intrinsics.checkNotNullExpressionValue(v3, "substring(...)");
                    yield v2.append(v3).toString();
                }
                yield var3_3;
            }
        };
    }

    private static final Comparable candidateComparator$lambda$1(FunTimeEventsApi.Candidate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getStatus().getHasCountdown() && it.getSecondsLeft() > 0 ? (Comparable)Integer.valueOf(0) : (Comparable)Integer.valueOf(1);
    }

    private static final FunTimeEventsApi.ParsedResponse refreshIfNeeded$lambda$0$0(\u062e\u0645 $this_runCatching, HttpResponse response) {
        int n = response.statusCode();
        if (!(200 <= n ? n < 300 : false)) {
            boolean bl = false;
            String string = "FunTime events API returned HTTP " + response.statusCode();
            throw new IllegalArgumentException(string.toString());
        }
        Object t = response.body();
        Intrinsics.checkNotNullExpressionValue(t, "body(...)");
        return $this_runCatching.parse((String)t, System.currentTimeMillis());
    }

    @NotNull
    public final FunTimeEventsApi.Snapshot snapshot() {
        this.refreshIfNeeded();
        return current;
    }

    private static final boolean createEvent$lambda$0(FunTimeEventsApi.RawEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId() != null && !ignoredEventIds.contains(it.getId());
    }

    public static final /* synthetic */ FunTimeEventsApi.Candidate access$toCandidate(\u062e\u0645 $this, FunTimeEventsApi.RawEvent event) {
        return $this.toCandidate(event);
    }

    private static final FunTimeEventsApi.ParsedResponse refreshIfNeeded$lambda$0$1(Function1 $tmp0, Object p0) {
        return (FunTimeEventsApi.ParsedResponse)$tmp0.invoke(p0);
    }

    private static final int resolveSnapshotOrigin$offset(int liveSeconds, int reported) {
        return reported - liveSeconds;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void syncWithLiveCountdown(@Nullable Integer anarchy, int secondsLeft) {
        if (secondsLeft <= 0) {
            return;
        }
        var3_3 = this;
        synchronized (var3_3) {
            $i$a$-synchronized-FunTimeEventsApi$syncWithLiveCountdown$1 = false;
            now = System.currentTimeMillis();
            deadline = now + (long)secondsLeft * 1000L;
            \u062e\u0645.liveCountdown = new FunTimeEventsApi.LiveCountdown(anarchy, deadline);
            previous = \u062e\u0645.current;
            var10_9 = \u062e\u0645.INSTANCE.resolveSnapshotOrigin(\u062e\u0645.systemCountdowns, now);
            if (var10_9 == null) ** GOTO lbl-1000
            it = ((Number)var10_9).longValue();
            $i$a$-let-FunTimeEventsApi$syncWithLiveCountdown$1$rebased$1 = false;
            var14_12 = \u062e\u0645.INSTANCE.rebaseDeadlines(previous.getEvents(), (long)var11_10);
            if (var14_12 != null) {
                v0 = var14_12;
            } else lbl-1000:
            // 2 sources

            {
                v0 = rebased = previous.getEvents();
            }
            if (anarchy != null) {
                \u062e\u0645.INSTANCE.putLiveOverride(new FunTimeEventsApi.Event(anarchy, "\u0421\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u0435", FunTimeEventsApi.Status.UPCOMING, secondsLeft, deadline, false, "live:upcoming"), deadline + 30000L);
            }
            \u062e\u0645.current = FunTimeEventsApi.Snapshot.copy$default(previous, previous.getGeneration() + 1L, \u062e\u0645.INSTANCE.applyLiveOverrides(rebased, now), false, false, 0L, 28, null);
            var4_5 = Unit.INSTANCE;
            return;
        }
    }

    private static final Unit refreshIfNeeded$lambda$0$2(\u062e\u0645 $this_runCatching, FunTimeEventsApi.ParsedResponse response, Throwable failure) {
        if (failure == null && response != null) {
            $this_runCatching.publishSuccess(response);
        } else {
            $this_runCatching.publishFailure();
        }
        loading.set(false);
        return Unit.INSTANCE;
    }

    private static final boolean parse$lambda$3$0(FunTimeEventsApi.RawEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getType(), "system") && it.getId() == null && it.getSecondsLeft() > 0;
    }

    private static final Comparable candidateComparator$lambda$4(FunTimeEventsApi.Candidate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Comparable)((Object)it.getId());
    }

    private final void putLiveOverride(FunTimeEventsApi.Event event, long expiresAt) {
        liveOverrides = MapsKt.plus(liveOverrides, TuplesKt.to(event.getAnarchy(), new FunTimeEventsApi.LiveOverride(event, expiresAt)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String normalizedValue(String $this$normalizedValue) {
        String string = ((Object)StringsKt.trim((CharSequence)$this$normalizedValue)).toString();
        String it = string;
        boolean bl = false;
        if (((CharSequence)it).length() <= 0) return null;
        boolean bl2 = true;
        if (!bl2) return null;
        if (StringsKt.equals(it, "null", true)) return null;
        boolean bl3 = true;
        if (!bl3) return null;
        String string2 = string;
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    private final Long resolveSnapshotOrigin(Map<Integer, Integer> countdowns, long now) {
        v0 = \u062e\u0645.liveCountdown;
        if (v0 == null) {
            return null;
        }
        live = v0;
        liveSeconds = (int)((live.getDeadlineAt() - now + 999L) / 1000L);
        if (liveSeconds <= 0) {
            return null;
        }
        var7_5 = live.getAnarchy();
        if (var7_5 == null) ** GOTO lbl-1000
        p0 = ((Number)var7_5).intValue();
        $i$a$-let-FunTimeEventsApi$resolveSnapshotOrigin$reported$1 = false;
        var8_10 = countdowns.get(p0);
        if (var8_10 == null) ** GOTO lbl-1000
        var10_7 = var8_10;
        it = ((Number)var10_7).intValue();
        $i$a$-takeIf-FunTimeEventsApi$resolveSnapshotOrigin$reported$2 = false;
        var13_12 = \u062e\u0645.resolveSnapshotOrigin$offset(liveSeconds, it);
        var9_14 = (0 <= var13_12 ? var13_12 < 601 : false) ? var10_7 : null;
        if (var9_14 != null) {
            v1 = var9_14;
        } else lbl-1000:
        // 3 sources

        {
            $this$filter$iv = countdowns.values();
            $i$f$filter = false;
            var13_13 = $this$filter$iv;
            destination$iv$iv = new ArrayList<E>();
            $i$f$filterTo = false;
            for (T element$iv$iv : $this$filterTo$iv$iv) {
                it = ((Number)element$iv$iv).intValue();
                $i$a$-filter-FunTimeEventsApi$resolveSnapshotOrigin$reported$3 = false;
                var20_24 = \u062e\u0645.resolveSnapshotOrigin$offset(liveSeconds, it);
                v2 = 0 <= var20_24 ? var20_24 < 601 : false;
                if (!v2) continue;
                destination$iv$iv.add(element$iv$iv);
            }
            $this$minByOrNull$iv = (List)destination$iv$iv;
            $i$f$minByOrNull = false;
            iterator$iv = $this$minByOrNull$iv.iterator();
            if (!iterator$iv.hasNext()) {
                v3 = null;
            } else {
                minElem$iv = iterator$iv.next();
                if (!iterator$iv.hasNext()) {
                    v3 = minElem$iv;
                } else {
                    minValue$iv = ((Number)minElem$iv).intValue();
                    e$iv = false;
                    minValue$iv = \u062e\u0645.resolveSnapshotOrigin$offset(liveSeconds, minValue$iv);
                    do {
                        e$iv = iterator$iv.next();
                        v$iv = ((Number)e$iv).intValue();
                        var18_22 = false;
                        var17_21 = \u062e\u0645.resolveSnapshotOrigin$offset(liveSeconds, v$iv);
                        if (minValue$iv <= var17_21) continue;
                        var14_15 = var16_19;
                        var15_16 = var17_21;
                    } while (var13_13.hasNext());
                    v3 = var14_15;
                }
            }
            v4 = v3;
            if (v4 != null) {
                v1 = v4;
            } else {
                return null;
            }
        }
        var6_25 = v1;
        return (long)(var2_2 - (long)\u062e\u0645.resolveSnapshotOrigin$offset((int)var5_4, var6_25) * 1000L);
    }

    private static final Thread executor$lambda$0(Runnable runnable) {
        Thread thread2;
        Thread $this$executor_u24lambda_u240_u240 = thread2 = new Thread(runnable, "Rain-FunTime-Events");
        boolean bl = false;
        $this$executor_u24lambda_u240_u240.setDaemon(true);
        return thread2;
    }

    private static final boolean createEvent$lambda$6(FunTimeEventsApi.RawEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getType(), "system") && it.getId() == null && it.getSecondsLeft() > 0;
    }

    private final void refreshIfNeeded() {
        block6: {
            Object object;
            long now;
            block5: {
                block4: {
                    now = System.currentTimeMillis();
                    if (now - lastRequestAt < 5000L) break block4;
                    if (loading.compareAndSet(false, true)) break block5;
                }
                return;
            }
            lastRequestAt = now;
            FunTimeEventsApi.Snapshot beforeLoading = current;
            current = FunTimeEventsApi.Snapshot.copy$default(beforeLoading, beforeLoading.getGeneration() + 1L, null, true, false, 0L, 18, null);
            HttpRequest request = HttpRequest.newBuilder(URI.create(ENDPOINT)).timeout(Duration.ofSeconds(8L)).header("Accept", "application/json").GET().build();
            Object object2 = this;
            try {
                \u062e\u0645 $this$refreshIfNeeded_u24lambda_u240 = object2;
                boolean bl = false;
                object = Result.constructor-impl(((CompletableFuture)client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(arg_0 -> \u062e\u0645.refreshIfNeeded$lambda$0$1(arg_0 -> \u062e\u0645.refreshIfNeeded$lambda$0$0($this$refreshIfNeeded_u24lambda_u240, arg_0), arg_0))).whenComplete((arg_0, arg_1) -> \u062e\u0645.refreshIfNeeded$lambda$0$3((arg_0, arg_1) -> \u062e\u0645.refreshIfNeeded$lambda$0$2($this$refreshIfNeeded_u24lambda_u240, arg_0, arg_1), arg_0, arg_1)));
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block6;
            Object it = object = throwable;
            boolean bl = false;
            INSTANCE.publishFailure();
            loading.set(false);
        }
    }

    public static final /* synthetic */ String access$formatDuration(\u062e\u0645 $this, int seconds) {
        return $this.formatDuration(seconds);
    }

    private final FunTimeEventsApi.RawEvent parseEvent(JsonObject json) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        if (json == null) {
            return null;
        }
        String string6 = this.string(json, "event-type");
        if (string6 != null) {
            string5 = string6;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String string7 = string5.toLowerCase(locale);
            string4 = string7;
            Intrinsics.checkNotNullExpressionValue(string7, "toLowerCase(...)");
        } else {
            string4 = null;
        }
        String string8 = string4;
        if (string4 == null) {
            string8 = "";
        }
        if ((string3 = this.string(json, "id")) != null && (string3 = this.normalizedValue(string3)) != null) {
            String string9 = string3;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String string10 = string9.toLowerCase(locale);
            string2 = string10;
            Intrinsics.checkNotNullExpressionValue(string10, "toLowerCase(...)");
        } else {
            string2 = null;
        }
        String string11 = this.string(json, "phase");
        if (string11 != null) {
            string5 = string11;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String string12 = string5.toUpperCase(locale);
            string = string12;
            Intrinsics.checkNotNullExpressionValue(string12, "toUpperCase(...)");
        } else {
            string = null;
        }
        String string13 = this.string(json, "loot");
        return new FunTimeEventsApi.RawEvent(string8, string2, string, RangesKt.coerceAtLeast(this.int(json, "time-seconds-left"), 0), string13 != null ? this.normalizedValue(string13) : null);
    }

    /*
     * WARNING - void declaration
     */
    private final FunTimeEventsApi.ParsedResponse parse(String json, long fetchedAt) {
        void var7_10;
        void var2_2;
        void var12_18;
        Object object;
        Object object2;
        int anarchy;
        JsonElement root = JsonParser.parseString(json);
        if (!root.isJsonObject()) {
            boolean $i$a$-require-FunTimeEventsApi$parse$32 = false;
            String $i$a$-require-FunTimeEventsApi$parse$32 = "FunTime events response is not an object";
            throw new IllegalArgumentException($i$a$-require-FunTimeEventsApi$parse$32.toString());
        }
        JsonElement response = root.getAsJsonObject().get("response");
        if (!(response != null && response.isJsonArray())) {
            boolean $i$a$-require-FunTimeEventsApi$parse$42 = false;
            String $i$a$-require-FunTimeEventsApi$parse$42 = "FunTime events response has no array";
            throw new IllegalArgumentException($i$a$-require-FunTimeEventsApi$parse$42.toString());
        }
        LinkedHashMap grouped = new LinkedHashMap();
        JsonArray jsonArray = response.getAsJsonArray();
        Intrinsics.checkNotNullExpressionValue(jsonArray, "getAsJsonArray(...)");
        Iterable $this$forEach$iv = jsonArray;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Object object3;
            Integer n;
            JsonElement server;
            Object object4;
            JsonElement element = (JsonElement)element$iv;
            boolean bl = false;
            Object it = object4 = element;
            boolean $i$a$-takeIf-FunTimeEventsApi$parse$3$server$22 = false;
            Object object5 = ((JsonElement)it).isJsonObject() ? object4 : null;
            JsonElement jsonElement = object5;
            if (object5 == null) continue;
            if ((jsonElement = jsonElement.getAsJsonObject()) == null || (object4 = INSTANCE.string((JsonObject)(server = jsonElement), "server")) == null) continue;
            Object $i$a$-takeIf-FunTimeEventsApi$parse$3$server$22 = object4;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String string = ((String)$i$a$-takeIf-FunTimeEventsApi$parse$3$server$22).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
            it = string;
            if (it == null || ($i$a$-takeIf-FunTimeEventsApi$parse$3$server$22 = StringsKt.removePrefix((String)it, (CharSequence)"anarchy")) == null || (n = StringsKt.toIntOrNull((String)$i$a$-takeIf-FunTimeEventsApi$parse$3$server$22)) == null) continue;
            anarchy = n;
            Map $this$getOrPut$iv = grouped;
            Object key$iv = anarchy;
            boolean $i$f$getOrPut = false;
            Object value$iv = $this$getOrPut$iv.get(key$iv);
            if (value$iv == null) {
                boolean answer$iv22 = false;
                ArrayList answer$iv22 = new ArrayList();
                $this$getOrPut$iv.put(key$iv, answer$iv22);
                object3 = answer$iv22;
            } else {
                object3 = value$iv;
            }
            List target = (List)object3;
            object2 = ((JsonObject)server).get("events");
            if (object2 == null) continue;
            Object it2 = $i$f$getOrPut = object2;
            boolean bl2 = false;
            key$iv = ((JsonElement)it2).isJsonArray() ? $i$f$getOrPut : null;
            if (key$iv == null || ($i$f$getOrPut = ((JsonElement)key$iv).getAsJsonArray()) == null) continue;
            Iterable $this$mapNotNullTo$iv = (Iterable)$i$f$getOrPut;
            Collection destination$iv = target;
            boolean $i$f$mapNotNullTo = false;
            Iterable $this$forEach$iv$iv = $this$mapNotNullTo$iv;
            boolean $i$f$forEach2 = false;
            object = $this$forEach$iv$iv.iterator();
            while (object.hasNext()) {
                FunTimeEventsApi.RawEvent rawEvent;
                JsonElement jsonElement2;
                Object element$iv$iv;
                Object element$iv2 = element$iv$iv = object.next();
                boolean bl3 = false;
                JsonElement it3 = (JsonElement)element$iv2;
                boolean bl4 = false;
                JsonElement jsonElement3 = jsonElement2 = it3;
                \u062e\u0645 \u062e\u06452 = INSTANCE;
                boolean bl5 = false;
                JsonElement jsonElement4 = Boolean.valueOf(jsonElement3.isJsonObject()).booleanValue() ? jsonElement2 : null;
                if (\u062e\u06452.parseEvent(jsonElement4 != null ? jsonElement4.getAsJsonObject() : null) == null) continue;
                boolean bl6 = false;
                destination$iv.add(rawEvent);
            }
            List cfr_ignored_0 = (List)destination$iv;
        }
        HashMap countdowns = new HashMap();
        Map $this$map$iv = grouped;
        boolean $i$f$map = false;
        Map $this$mapTo$iv$iv = $this$map$iv;
        Collection destination$iv$iv = new ArrayList($this$map$iv.size());
        boolean $i$f$mapTo = false;
        object2 = $this$mapTo$iv$iv.entrySet().iterator();
        while (object2.hasNext()) {
            void var19_31;
            void var18_30;
            Object v7;
            Map.Entry item$iv$iv;
            Map.Entry entry = item$iv$iv = object2.next();
            Collection collection = destination$iv$iv;
            boolean bl = false;
            anarchy = ((Number)entry.getKey()).intValue();
            List rawEvents = (List)entry.getValue();
            Iterator<FunTimeEventsApi.RawEvent> destination$iv = SequencesKt.filter(CollectionsKt.asSequence(rawEvents), \u062e\u0645::parse$lambda$3$0).iterator();
            if (!destination$iv.hasNext()) {
                v7 = null;
            } else {
                void $i$a$-let-FunTimeEventsApi$parse$events$1$3;
                Object p0 = destination$iv.next();
                boolean bl7 = false;
                p0 = ((FunTimeEventsApi.RawEvent)p0).getSecondsLeft();
                while (destination$iv.hasNext()) {
                    Object object6 = destination$iv.next();
                    boolean bl8 = false;
                    if (p0.compareTo(object6 = (Comparable)Integer.valueOf(((FunTimeEventsApi.RawEvent)object6).getSecondsLeft())) >= 0) continue;
                    p0 = object6;
                }
                v7 = $i$a$-let-FunTimeEventsApi$parse$events$1$3;
            }
            object = v7;
            if (object != null) {
                void var20_37;
                int it = ((Number)object).intValue();
                boolean bl9 = false;
                ((Map)countdowns).put(anarchy, (int)var20_37);
            }
            collection.add(INSTANCE.createEvent((int)var18_30, (List<FunTimeEventsApi.RawEvent>)var19_31, fetchedAt));
        }
        Iterable iterable = (List)var12_18;
        boolean bl = false;
        List<FunTimeEventsApi.Event> list = CollectionsKt.sortedWith(iterable, new \u0628\u0651());
        return new FunTimeEventsApi.ParsedResponse(list, (long)var2_2, (Map)var7_10);
    }
}

