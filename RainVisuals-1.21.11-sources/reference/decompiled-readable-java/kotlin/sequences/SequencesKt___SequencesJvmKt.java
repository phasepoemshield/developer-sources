/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001aC\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u0001H\u0007\u00a2\u0006\u0004\b\r\u0010\u0010\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0001H\u0007\u00a2\u0006\u0004\b\r\u0010\u0012\u001aI\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0019\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0017j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0018H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u000e\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u0001H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u0010\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0001H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u0012\u001aI\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u0016\u001a=\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0019\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0017j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0018H\u0007\u00a2\u0006\u0004\b\u001e\u0010\u001b\u001a7\u0010\"\u001a\u00020\u001f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u0013H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b \u0010!\u001a7\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\u0013H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010%\u001a-\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b'\u0010(\u001a?\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0019\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0017j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0018\u00a2\u0006\u0004\b'\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006*"}, d2={"R", "Lkotlin/sequences/Sequence;", "Ljava/lang/Class;", "klass", "filterIsInstance", "(Lkotlin/sequences/Sequence;Ljava/lang/Class;)Lkotlin/sequences/Sequence;", "", "C", "destination", "filterIsInstanceTo", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "", "T", "max", "(Lkotlin/sequences/Sequence;)Ljava/lang/Comparable;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Double;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Float;", "Lkotlin/Function1;", "selector", "maxBy", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "sumOf", "Ljava/math/BigInteger;", "sumOfBigInteger", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "Ljava/util/SortedSet;", "toSortedSet", "(Lkotlin/sequences/Sequence;)Ljava/util/SortedSet;", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/util/SortedSet;", "kotlin-stdlib"}, xs="kotlin/sequences/SequencesKt")
class SequencesKt___SequencesJvmKt
extends SequencesKt__SequencesKt {
    @NotNull
    public static final <R> Sequence<R> filterIsInstance(@NotNull Sequence<?> $this$filterIsInstance, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Sequence<?> sequence = SequencesKt.filter($this$filterIsInstance, (Function1)new Function1<Object, Boolean>(klass){
            final /* synthetic */ Class<R> $klass;

            @NotNull
            public final Boolean invoke(@Nullable Object it) {
                return this.$klass.isInstance(it);
            }
            {
                this.$klass = $klass;
                super(1);
            }
        });
        Intrinsics.checkNotNull(sequence, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return sequence;
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Float min(Sequence $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return SequencesKt.minOrNull($this$min);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Double max(Sequence $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return SequencesKt.maxOrNull($this$max);
    }

    /*
     * WARNING - void declaration
     */
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Sequence<? extends T> $this$minBy, Function1<? super T, ? extends R> selector) {
        T t;
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$minBy = false;
        Sequence<T> $this$minByOrNull$iv = $this$minBy;
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

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Sequence<? extends T> $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet)SequencesKt.toCollection($this$toSortedSet, (Collection)new TreeSet());
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ Comparable max(Sequence $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return SequencesKt.maxOrNull($this$max);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Sequence<?> $this$filterIsInstanceTo, @NotNull C destination, @NotNull Class<R> klass) {
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

    @OverloadResolutionByLambdaReturnType
    @JvmName(name="sumOfBigDecimal")
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <T> BigDecimal sumOfBigDecimal(Sequence<? extends T> $this$sumOf, Function1<? super T, ? extends BigDecimal> selector) {
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

    /*
     * WARNING - void declaration
     */
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Sequence<? extends T> $this$maxBy, Function1<? super T, ? extends R> selector) {
        T t;
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$maxBy = false;
        Sequence<T> $this$maxByOrNull$iv = $this$maxBy;
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

    @SinceKotlin(version="1.4")
    @JvmName(name="sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> BigInteger sumOfBigInteger(Sequence<? extends T> $this$sumOf, Function1<? super T, ? extends BigInteger> selector) {
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

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull Sequence<? extends T> $this$toSortedSet, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet)SequencesKt.toCollection($this$toSortedSet, (Collection)new TreeSet<T>(comparator));
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Float max(Sequence $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return SequencesKt.maxOrNull($this$max);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @SinceKotlin(version="1.1")
    public static final /* synthetic */ Double min(Sequence $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return SequencesKt.minOrNull($this$min);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    public static final /* synthetic */ Object maxWith(Sequence $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return SequencesKt.maxWithOrNull($this$maxWith, comparator);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    public static final /* synthetic */ Comparable min(Sequence $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return SequencesKt.minOrNull($this$min);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    public static final /* synthetic */ Object minWith(Sequence $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return SequencesKt.minWithOrNull($this$minWith, comparator);
    }
}

