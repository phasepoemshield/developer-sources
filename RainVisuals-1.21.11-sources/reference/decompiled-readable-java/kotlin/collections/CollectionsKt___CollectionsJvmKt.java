/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000h\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\n\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\t\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0011\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\u00120\u0001H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0013\u001aI\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u001a\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0019H\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u000f\u001a\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u0011\u001a\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\u00120\u0001H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u0013\u001aI\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u0017\u001a=\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u001a\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0019H\u0007\u00a2\u0006\u0004\b\u001f\u0010\u001c\u001a\u001d\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000 \u00a2\u0006\u0004\b\"\u0010#\u001a7\u0010'\u001a\u00020$\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0\u0014H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b%\u0010&\u001a7\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020(0\u0014H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010*\u001a-\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b,\u0010-\u001a?\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u001a\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0019\u00a2\u0006\u0004\b,\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006/"}, d2={"R", "", "Ljava/lang/Class;", "klass", "", "filterIsInstance", "(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;", "", "C", "destination", "filterIsInstanceTo", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "", "T", "max", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "Lkotlin/Function1;", "selector", "maxBy", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "", "", "reverse", "(Ljava/util/List;)V", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "sumOf", "Ljava/math/BigInteger;", "sumOfBigInteger", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "Ljava/util/SortedSet;", "toSortedSet", "(Ljava/lang/Iterable;)Ljava/util/SortedSet;", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/SortedSet;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt___CollectionsJvmKt
extends CollectionsKt__ReversedViewsKt {
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    public static final /* synthetic */ Object maxWith(Iterable $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.maxWithOrNull($this$maxWith, comparator);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    public static final /* synthetic */ Comparable min(Iterable $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return CollectionsKt.minOrNull($this$min);
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> $this$toSortedSet, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet)CollectionsKt.toCollection($this$toSortedSet, (Collection)new TreeSet<T>(comparator));
    }

    public static final <T> void reverse(@NotNull List<T> $this$reverse) {
        Intrinsics.checkNotNullParameter($this$reverse, "<this>");
        Collections.reverse($this$reverse);
    }

    @InlineOnly
    @JvmName(name="sumOfBigDecimal")
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> $this$sumOf, Function1<? super T, ? extends BigDecimal> selector) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "valueOf(...)");
        BigDecimal sum = bigDecimal2;
        Iterator<T> iterator2 = $this$sumOf.iterator();
        while (iterator2.hasNext()) {
            T element = iterator2.next();
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(element)), "add(...)");
        }
        return bigDecimal;
    }

    @NotNull
    public static final <R> List<R> filterIsInstance(@NotNull Iterable<?> $this$filterIsInstance, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List)CollectionsKt.filterIsInstanceTo($this$filterIsInstance, (Collection)new ArrayList(), klass);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    public static final /* synthetic */ Comparable max(Iterable $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return CollectionsKt.maxOrNull($this$max);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Double max(Iterable $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return CollectionsKt.maxOrNull($this$max);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet)CollectionsKt.toCollection($this$toSortedSet, (Collection)new TreeSet());
    }

    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @SinceKotlin(version="1.4")
    @JvmName(name="sumOfBigInteger")
    private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> $this$sumOf, Function1<? super T, ? extends BigInteger> selector) {
        BigInteger bigInteger;
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigInteger2 = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger2, "valueOf(...)");
        BigInteger sum = bigInteger2;
        Iterator<T> iterator2 = $this$sumOf.iterator();
        while (iterator2.hasNext()) {
            T element = iterator2.next();
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(element)), "add(...)");
        }
        return bigInteger;
    }

    /*
     * WARNING - void declaration
     */
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> $this$maxBy, Function1<? super T, ? extends R> selector) {
        T t;
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$maxBy = false;
        Iterable<T> $this$maxByOrNull$iv = $this$maxBy;
        boolean $i$f$maxByOrNull = false;
        Iterator<T> iterator$iv = $this$maxByOrNull$iv.iterator();
        if (!iterator$iv.hasNext()) {
            t = null;
        } else {
            T maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                t = maxElem$iv;
            } else {
                void var6_6;
                Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
                do {
                    void var9_9;
                    T e$iv;
                    Comparable v$iv;
                    if (maxValue$iv.compareTo(v$iv = (Comparable)selector.invoke(e$iv = iterator$iv.next())) >= 0) continue;
                    maxElem$iv = e$iv;
                    maxValue$iv = var9_9;
                } while (iterator$iv.hasNext());
                t = var6_6;
            }
        }
        return t;
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Float min(Iterable $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return CollectionsKt.minOrNull($this$min);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    public static final /* synthetic */ Object minWith(Iterable $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.minWithOrNull($this$minWith, comparator);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Iterable<?> $this$filterIsInstanceTo, @NotNull C destination, @NotNull Class<R> klass) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$filterIsInstanceTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Iterator<?> iterator2 = $this$filterIsInstanceTo.iterator();
        while (iterator2.hasNext()) {
            Object element = iterator2.next();
            if (!klass.isInstance(element)) continue;
            destination.add(element);
        }
        return var1_1;
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Float max(Iterable $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return CollectionsKt.maxOrNull($this$max);
    }

    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Double min(Iterable $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return CollectionsKt.minOrNull($this$min);
    }

    /*
     * WARNING - void declaration
     */
    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> $this$minBy, Function1<? super T, ? extends R> selector) {
        T t;
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$minBy = false;
        Iterable<T> $this$minByOrNull$iv = $this$minBy;
        boolean $i$f$minByOrNull = false;
        Iterator<T> iterator$iv = $this$minByOrNull$iv.iterator();
        if (!iterator$iv.hasNext()) {
            t = null;
        } else {
            T minElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                t = minElem$iv;
            } else {
                void var6_6;
                Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
                do {
                    void var9_9;
                    T e$iv;
                    Comparable v$iv;
                    if (minValue$iv.compareTo(v$iv = (Comparable)selector.invoke(e$iv = iterator$iv.next())) <= 0) continue;
                    minElem$iv = e$iv;
                    minValue$iv = var9_9;
                } while (iterator$iv.hasNext());
                t = var6_6;
            }
        }
        return t;
    }
}

