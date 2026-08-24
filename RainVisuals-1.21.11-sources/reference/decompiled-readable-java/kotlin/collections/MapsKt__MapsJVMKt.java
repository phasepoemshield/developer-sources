/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt__MapWithDefaultKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000d\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u001a;\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001aX\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\b\u001a\u00020\u00072#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\b\u000bH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\b\u000bH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000f\u001a'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001ac\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a2*\u0010\u001d\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u001c\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0007\u00a2\u0006\u0004\b\u001f\u0010 \u001a[\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0001\u0010\u00012*\u0010\u001d\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u001c\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u00a2\u0006\u0004\b\u001f\u0010\"\u001aE\u0010'\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010$\u001a\u00028\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b'\u0010(\u001a \u0010+\u001a\u00020**\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0\u0004H\u0087\b\u00a2\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u00a2\u0006\u0004\b-\u0010\u0006\u001a8\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0081\b\u00a2\u0006\u0004\b.\u0010\u0006\u001aA\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0004\b/\u00100\u001aG\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a\u00a2\u0006\u0004\b/\u00101\"\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00064"}, d2={"K", "V", "", "builder", "", "build", "(Ljava/util/Map;)Ljava/util/Map;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildMapInternal", "(ILkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "createMapBuilder", "()Ljava/util/Map;", "(I)Ljava/util/Map;", "expectedSize", "mapCapacity", "(I)I", "Lkotlin/Pair;", "pair", "mapOf", "(Lkotlin/Pair;)Ljava/util/Map;", "Ljava/util/Comparator;", "comparator", "", "pairs", "Ljava/util/SortedMap;", "sortedMapOf", "(Ljava/util/Comparator;[Lkotlin/Pair;)Ljava/util/SortedMap;", "", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "Ljava/util/concurrent/ConcurrentMap;", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Ljava/util/Properties;", "toProperties", "(Ljava/util/Map;)Ljava/util/Properties;", "toSingletonMap", "toSingletonMapOrSelf", "toSortedMap", "(Ljava/util/Map;)Ljava/util/SortedMap;", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;", "INT_MAX_POWER_OF_TWO", "I", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt__MapsJVMKt
extends MapsKt__MapWithDefaultKt {
    private static final int INT_MAX_POWER_OF_TWO = 0x40000000;

    @PublishedApi
    @NotNull
    @SinceKotlin(version="1.3")
    public static final <K, V> Map<K, V> build(@NotNull Map<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((MapBuilder)builder).build();
    }

    @InlineOnly
    private static final Properties toProperties(Map<String, String> $this$toProperties) {
        Properties properties;
        Intrinsics.checkNotNullParameter($this$toProperties, "<this>");
        Properties $this$toProperties_u24lambda_u244 = properties = new Properties();
        boolean bl = false;
        $this$toProperties_u24lambda_u244.putAll($this$toProperties);
        return properties;
    }

    @PublishedApi
    public static final int mapCapacity(int expectedSize) {
        return expectedSize < 0 ? expectedSize : (expectedSize < 3 ? expectedSize + 1 : (expectedSize < 0x40000000 ? (int)((float)expectedSize / 0.75f + 1.0f) : Integer.MAX_VALUE));
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <K, V> Map<K, V> buildMapInternal(int capacity, Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map<K, V> map = MapsKt.createMapBuilder(capacity);
        builderAction.invoke(map);
        return MapsKt.build(map);
    }

    @SinceKotlin(version="1.3")
    @PublishedApi
    @NotNull
    public static final <K, V> Map<K, V> createMapBuilder(int capacity) {
        return new MapBuilder(capacity);
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(Pair<? extends K, ? extends V> ... pairs) {
        TreeMap treeMap;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap $this$sortedMapOf_u24lambda_u242 = treeMap = new TreeMap();
        boolean bl = false;
        MapsKt.putAll((Map)$this$sortedMapOf_u24lambda_u242, pairs);
        return treeMap;
    }

    @InlineOnly
    @PublishedApi
    @SinceKotlin(version="1.3")
    private static final <K, V> Map<K, V> buildMapInternal(Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map<K, V> map = MapsKt.createMapBuilder();
        builderAction.invoke(map);
        return MapsKt.build(map);
    }

    @NotNull
    @SinceKotlin(version="1.4")
    public static final <K, V> SortedMap<K, V> sortedMapOf(@NotNull Comparator<? super K> comparator, Pair<? extends K, ? extends V> ... pairs) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        TreeMap $this$sortedMapOf_u24lambda_u243 = treeMap;
        boolean bl = false;
        MapsKt.putAll((Map)$this$sortedMapOf_u24lambda_u243, pairs);
        return treeMap;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $this$toSortedMap) {
        Intrinsics.checkNotNullParameter($this$toSortedMap, "<this>");
        return new TreeMap<K, V>($this$toSortedMap);
    }

    @NotNull
    public static final <K, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $this$toSortedMap, @NotNull Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter($this$toSortedMap, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeMap<? extends K, ? extends V> treeMap = new TreeMap<K, V>(comparator);
        TreeMap<? extends K, ? extends V> $this$toSortedMap_u24lambda_u241 = treeMap;
        boolean bl = false;
        $this$toSortedMap_u24lambda_u241.putAll($this$toSortedMap);
        return treeMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> map = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(map, "singletonMap(...)");
        return map;
    }

    @InlineOnly
    private static final <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, ? extends V> $this$toSingletonMapOrSelf) {
        Intrinsics.checkNotNullParameter($this$toSingletonMapOrSelf, "<this>");
        return MapsKt.toSingletonMap($this$toSingletonMapOrSelf);
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static final <K, V> Map<K, V> createMapBuilder() {
        return new MapBuilder();
    }

    /*
     * WARNING - void declaration
     */
    public static final <K, V> V getOrPut(@NotNull ConcurrentMap<K, V> $this$getOrPut, K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrPut, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean $i$f$getOrPut = false;
        Object v = $this$getOrPut.get(key);
        if (v == null) {
            V v2;
            V v3 = v2 = defaultValue.invoke();
            boolean bl = false;
            v = $this$getOrPut.putIfAbsent(key, v3);
            if (v == null) {
                void var5_5;
                v = var5_5;
            }
        }
        return v;
    }

    @NotNull
    public static final <K, V> Map<K, V> toSingletonMap(@NotNull Map<? extends K, ? extends V> $this$toSingletonMap) {
        Map.Entry<K, V> entry;
        Intrinsics.checkNotNullParameter($this$toSingletonMap, "<this>");
        Map.Entry<K, V> $this$toSingletonMap_u24lambda_u245 = entry = $this$toSingletonMap.entrySet().iterator().next();
        boolean bl = false;
        Map<K, V> map = Collections.singletonMap($this$toSingletonMap_u24lambda_u245.getKey(), $this$toSingletonMap_u24lambda_u245.getValue());
        Intrinsics.checkNotNullExpressionValue(map, "with(...)");
        return map;
    }
}

