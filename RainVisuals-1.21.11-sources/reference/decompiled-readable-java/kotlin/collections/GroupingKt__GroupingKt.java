/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt__GroupingJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u00a5\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u00b9\u0001\u0010\u0013\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001aK\u0010\u0016\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00150\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u0002H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u00c6\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000326\u0010\u0019\u001a2\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00182K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u001aH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a\u0081\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u001d\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0018H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001e\u001a\u00da\u0001\u0010\u001f\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u000326\u0010\u0019\u001a2\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00182K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u001aH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001f\u0010 \u001a\u0095\u0001\u0010\u001f\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00028\u00032\u0006\u0010\u001d\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0018H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001f\u0010!\u001a\u0092\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\"\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b#\u0010$\u001a\u00a6\u0001\u0010%\u001a\u00028\u0003\"\u0004\b\u0000\u0010\"\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001\"\u0016\b\u0003\u0010\u0011*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006'"}, d2={"T", "K", "R", "Lkotlin/collections/Grouping;", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "key", "accumulator", "element", "", "first", "operation", "", "aggregate", "(Lkotlin/collections/Grouping;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "", "M", "destination", "aggregateTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "", "eachCountTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "Lkotlin/Function2;", "initialValueSelector", "Lkotlin/Function3;", "fold", "(Lkotlin/collections/Grouping;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "S", "reduce", "(Lkotlin/collections/Grouping;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib"}, xs="kotlin/collections/GroupingKt")
class GroupingKt__GroupingKt
extends GroupingKt__GroupingJVMKt {
    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(@NotNull Grouping<T, ? extends K> $this$eachCountTo, @NotNull M destination) {
        void var1_1;
        void $this$foldTo$iv;
        Intrinsics.checkNotNullParameter($this$eachCountTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Grouping<T, ? extends K> grouping = $this$eachCountTo;
        Integer initialValue$iv = 0;
        boolean $i$f$foldTo = false;
        void $this$aggregateTo$iv$iv = $this$foldTo$iv;
        boolean $i$f$aggregateTo = false;
        Iterator iterator2 = $this$aggregateTo$iv$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void var17_18;
            void first$iv;
            Object e$iv$iv = iterator2.next();
            Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            Integer accumulator$iv$iv = destination.get(key$iv$iv);
            boolean bl = accumulator$iv$iv == null && !destination.containsKey(key$iv$iv);
            Object e$iv = e$iv$iv;
            Integer acc$iv = accumulator$iv$iv;
            Object k = key$iv$iv;
            M m = destination;
            boolean bl2 = false;
            int acc = ((Number)(first$iv != false ? initialValue$iv : acc$iv)).intValue();
            boolean bl3 = false;
            Integer n = (int)(var17_18 + true);
            m.put(k, (Integer)n);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> fold(@NotNull Grouping<T, ? extends K> $this$fold, @NotNull Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        void var7_7;
        void $this$aggregateTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$fold, "<this>");
        Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$fold = false;
        Grouping<T, ? extends K> $this$aggregate$iv = $this$fold;
        boolean $i$f$aggregate = false;
        Grouping<T, ? extends K> grouping = $this$aggregate$iv;
        Map destination$iv$iv = new LinkedHashMap();
        boolean $i$f$aggregateTo = false;
        Iterator iterator2 = $this$aggregateTo$iv$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void e;
            void first;
            Object e$iv$iv = iterator2.next();
            Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
            boolean bl = accumulator$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv);
            Object t = e$iv$iv;
            Object acc = accumulator$iv$iv;
            Object key = key$iv$iv;
            Object k = key$iv$iv;
            Map map = destination$iv$iv;
            boolean bl2 = false;
            R r = operation.invoke(key, first != false ? initialValueSelector.invoke(key, e) : acc, t);
            map.put(k, r);
        }
        return var7_7;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @SinceKotlin(version="1.1")
    public static final <T, K, R> Map<K, R> aggregate(@NotNull Grouping<T, ? extends K> $this$aggregate, @NotNull Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        void var4_4;
        void $this$aggregateTo$iv;
        Intrinsics.checkNotNullParameter($this$aggregate, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$aggregate = false;
        Grouping<T, ? extends K> grouping = $this$aggregate;
        Map destination$iv = new LinkedHashMap();
        boolean $i$f$aggregateTo = false;
        Iterator iterator2 = $this$aggregateTo$iv.sourceIterator();
        while (iterator2.hasNext()) {
            Object accumulator$iv;
            Object key$iv;
            Object e$iv = iterator2.next();
            destination$iv.put(key$iv, operation.invoke(key$iv, accumulator$iv, e$iv, (accumulator$iv = destination$iv.get(key$iv = $this$aggregateTo$iv.keyOf(e$iv))) == null && !destination$iv.containsKey(key$iv)));
        }
        return var4_4;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> fold(@NotNull Grouping<T, ? extends K> $this$fold, R initialValue, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        void var7_7;
        void $this$aggregateTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$fold, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$fold = false;
        Grouping<T, ? extends K> $this$aggregate$iv = $this$fold;
        boolean $i$f$aggregate = false;
        Grouping<T, ? extends K> grouping = $this$aggregate$iv;
        Map destination$iv$iv = new LinkedHashMap();
        boolean $i$f$aggregateTo = false;
        Iterator iterator2 = $this$aggregateTo$iv$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void var14_14;
            void first;
            Object e$iv$iv = iterator2.next();
            Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
            boolean bl = accumulator$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv);
            Object e = e$iv$iv;
            Object acc = accumulator$iv$iv;
            Object k = key$iv$iv;
            Map map = destination$iv$iv;
            boolean bl2 = false;
            R r = operation.invoke(first != false ? initialValue : acc, var14_14);
            map.put(k, r);
        }
        return var7_7;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull Grouping<T, ? extends K> $this$foldTo, @NotNull M destination, @NotNull Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$foldTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$foldTo = false;
        Grouping<T, K> $this$aggregateTo$iv = $this$foldTo;
        boolean $i$f$aggregateTo = false;
        Iterator<T> iterator2 = $this$aggregateTo$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void var13_13;
            void e;
            void first;
            T e$iv = iterator2.next();
            K key$iv = $this$aggregateTo$iv.keyOf(e$iv);
            R accumulator$iv = destination.get(key$iv);
            boolean bl = accumulator$iv == null && !destination.containsKey(key$iv);
            T t = e$iv;
            R acc = accumulator$iv;
            K key = key$iv;
            K k = key$iv;
            M m = destination;
            boolean bl2 = false;
            R r = operation.invoke(key, first != false ? initialValueSelector.invoke(key, e) : var13_13, t);
            m.put(k, r);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @SinceKotlin(version="1.1")
    public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(@NotNull Grouping<T, ? extends K> $this$reduceTo, @NotNull M destination, @NotNull Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$reduceTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$reduceTo = false;
        Grouping<T, K> $this$aggregateTo$iv = $this$reduceTo;
        boolean $i$f$aggregateTo = false;
        Iterator<T> iterator2 = $this$aggregateTo$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void acc;
            void e;
            void first;
            T e$iv = iterator2.next();
            K key$iv = $this$aggregateTo$iv.keyOf(e$iv);
            S accumulator$iv = destination.get(key$iv);
            boolean bl = accumulator$iv == null && !destination.containsKey(key$iv);
            T t = e$iv;
            S s = accumulator$iv;
            K key = key$iv;
            K k = key$iv;
            M m = destination;
            boolean bl2 = false;
            void var17_17 = first != false ? e : operation.invoke(key, acc, t);
            m.put(k, var17_17);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(@NotNull Grouping<T, ? extends K> $this$aggregateTo, @NotNull M destination, @NotNull Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$aggregateTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$aggregateTo = false;
        Iterator<T> iterator2 = $this$aggregateTo.sourceIterator();
        while (iterator2.hasNext()) {
            T e = iterator2.next();
            K key = $this$aggregateTo.keyOf(e);
            R accumulator = destination.get(key);
            destination.put(key, operation.invoke(key, accumulator, e, accumulator == null && !destination.containsKey(key)));
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @SinceKotlin(version="1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull Grouping<T, ? extends K> $this$foldTo, @NotNull M destination, R initialValue, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$foldTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$foldTo = false;
        Grouping<T, K> $this$aggregateTo$iv = $this$foldTo;
        boolean $i$f$aggregateTo = false;
        Iterator<T> iterator2 = $this$aggregateTo$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void first;
            T e$iv = iterator2.next();
            K key$iv = $this$aggregateTo$iv.keyOf(e$iv);
            R accumulator$iv = destination.get(key$iv);
            boolean bl = accumulator$iv == null && !destination.containsKey(key$iv);
            T t = e$iv;
            R acc = accumulator$iv;
            K k = key$iv;
            M m = destination;
            boolean bl2 = false;
            R r = operation.invoke(first != false ? initialValue : acc, t);
            m.put(k, r);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> reduce(@NotNull Grouping<T, ? extends K> $this$reduce, @NotNull Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        void var6_6;
        void $this$aggregateTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$reduce, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        boolean $i$f$reduce = false;
        Grouping<T, ? extends K> $this$aggregate$iv = $this$reduce;
        boolean $i$f$aggregate = false;
        Grouping<T, ? extends K> grouping = $this$aggregate$iv;
        Map destination$iv$iv = new LinkedHashMap();
        boolean $i$f$aggregateTo = false;
        Iterator iterator2 = $this$aggregateTo$iv$iv.sourceIterator();
        while (iterator2.hasNext()) {
            void e;
            void first;
            Object e$iv$iv = iterator2.next();
            Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
            boolean bl = accumulator$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv);
            Object t = e$iv$iv;
            Object acc = accumulator$iv$iv;
            Object key = key$iv$iv;
            Object k = key$iv$iv;
            Map map = destination$iv$iv;
            boolean bl2 = false;
            void var19_19 = first != false ? e : operation.invoke(key, acc, t);
            map.put(k, var19_19);
        }
        return var6_6;
    }
}

