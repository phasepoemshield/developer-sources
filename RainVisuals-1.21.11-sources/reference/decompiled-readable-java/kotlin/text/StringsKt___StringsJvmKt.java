/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000D\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\f\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0011\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0010\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030\u000ej\n\u0012\u0006\b\u0000\u0012\u00020\u0003`\u000fH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0007\u001a=\u0010\u0014\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\r\u001a1\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0010\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030\u000ej\n\u0012\u0006\b\u0000\u0012\u00020\u0003`\u000fH\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0012\u001a+\u0010\u0019\u001a\u00020\u0016*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u001a*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d*\u00020\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006 "}, d2={"", "", "index", "", "elementAt", "(Ljava/lang/CharSequence;I)C", "max", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", "R", "Lkotlin/Function1;", "selector", "maxBy", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "sumOf", "Ljava/math/BigInteger;", "sumOfBigInteger", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "Ljava/util/SortedSet;", "toSortedSet", "(Ljava/lang/CharSequence;)Ljava/util/SortedSet;", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt___StringsJvmKt
extends StringsKt__StringsKt {
    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ Character maxWith(CharSequence $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt.maxWithOrNull($this$maxWith, comparator);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    public static final /* synthetic */ Character minWith(CharSequence $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt.minWithOrNull($this$minWith, comparator);
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final BigInteger sumOfBigInteger(CharSequence $this$sumOf, Function1<? super Character, ? extends BigInteger> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigInteger = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "valueOf(...)");
        BigInteger sum = bigInteger;
        for (int i = 0; i < $this$sumOf.length(); ++i) {
            char element = $this$sumOf.charAt(i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(Character.valueOf(element))), "add(...)");
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence $this$maxBy, Function1<? super Character, ? extends R> selector) {
        Character c;
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$maxBy = false;
        CharSequence $this$maxByOrNull$iv = $this$maxBy;
        boolean $i$f$maxByOrNull = false;
        boolean bl = $this$maxByOrNull$iv.length() == 0;
        if (bl) {
            c = null;
        } else {
            char maxElem$iv = $this$maxByOrNull$iv.charAt(0);
            int lastIndex$iv = StringsKt.getLastIndex($this$maxByOrNull$iv);
            if (lastIndex$iv == 0) {
                c = Character.valueOf(maxElem$iv);
            } else {
                void var5_5;
                Comparable maxValue$iv = (Comparable)selector.invoke(Character.valueOf(maxElem$iv));
                IntIterator intIterator = new IntRange(1, lastIndex$iv).iterator();
                while (intIterator.hasNext()) {
                    void var11_11;
                    void var10_10;
                    int i$iv = intIterator.nextInt();
                    char e$iv = $this$maxByOrNull$iv.charAt(i$iv);
                    Comparable v$iv = (Comparable)selector.invoke(Character.valueOf(e$iv));
                    if (maxValue$iv.compareTo(v$iv) >= 0) continue;
                    maxElem$iv = var10_10;
                    void var7_7 = var11_11;
                }
                c = Character.valueOf((char)var5_5);
            }
        }
        return c;
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    public static final /* synthetic */ Character min(CharSequence $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return StringsKt.minOrNull($this$min);
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull CharSequence $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet)StringsKt.toCollection($this$toSortedSet, (Collection)new TreeSet());
    }

    /*
     * WARNING - void declaration
     */
    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence $this$minBy, Function1<? super Character, ? extends R> selector) {
        Character c;
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$minBy = false;
        CharSequence $this$minByOrNull$iv = $this$minBy;
        boolean $i$f$minByOrNull = false;
        boolean bl = $this$minByOrNull$iv.length() == 0;
        if (bl) {
            c = null;
        } else {
            char minElem$iv = $this$minByOrNull$iv.charAt(0);
            int lastIndex$iv = StringsKt.getLastIndex($this$minByOrNull$iv);
            if (lastIndex$iv == 0) {
                c = Character.valueOf(minElem$iv);
            } else {
                void var5_5;
                Comparable minValue$iv = (Comparable)selector.invoke(Character.valueOf(minElem$iv));
                IntIterator intIterator = new IntRange(1, lastIndex$iv).iterator();
                while (intIterator.hasNext()) {
                    void var11_11;
                    void var10_10;
                    int i$iv = intIterator.nextInt();
                    char e$iv = $this$minByOrNull$iv.charAt(i$iv);
                    Comparable v$iv = (Comparable)selector.invoke(Character.valueOf(e$iv));
                    if (minValue$iv.compareTo(v$iv) <= 0) continue;
                    minElem$iv = var10_10;
                    void var7_7 = var11_11;
                }
                c = Character.valueOf((char)var5_5);
            }
        }
        return c;
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    private static final BigDecimal sumOfBigDecimal(CharSequence $this$sumOf, Function1<? super Character, ? extends BigDecimal> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        BigDecimal sum = bigDecimal;
        for (int i = 0; i < $this$sumOf.length(); ++i) {
            char element = $this$sumOf.charAt(i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(Character.valueOf(element))), "add(...)");
        }
        return var2_2;
    }

    @InlineOnly
    private static final char elementAt(CharSequence $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt.charAt(index);
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ Character max(CharSequence $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return StringsKt.maxOrNull($this$max);
    }
}

