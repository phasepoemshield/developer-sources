/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedDoubleRange;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.ComparableOpenEndRange;
import kotlin.ranges.ComparableRange;
import kotlin.ranges.OpenEndDoubleRange;
import kotlin.ranges.OpenEndFloatRange;
import kotlin.ranges.OpenEndRange;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000F\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001aB\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u0007\"\u0018\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\t*\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0087\n\u00a2\u0006\u0004\b\r\u0010\u000e\u001aB\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u0007\"\u0018\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0087\n\u00a2\u0006\u0004\b\r\u0010\u0010\u001a2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0016*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0017\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0019\u001a2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0087\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001c\u001a\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001d\u00a8\u0006\u001e"}, d2={"", "isPositive", "", "step", "", "checkStepIsPositive", "(ZLjava/lang/Number;)V", "", "T", "Lkotlin/ranges/ClosedRange;", "", "R", "element", "contains", "(Lkotlin/ranges/ClosedRange;Ljava/lang/Object;)Z", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;Ljava/lang/Object;)Z", "", "that", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(DD)Lkotlin/ranges/ClosedFloatingPointRange;", "", "(FF)Lkotlin/ranges/ClosedFloatingPointRange;", "rangeUntil", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;", "(DD)Lkotlin/ranges/OpenEndRange;", "(FF)Lkotlin/ranges/OpenEndRange;", "kotlin-stdlib"}, xs="kotlin/ranges/RangesKt")
class RangesKt__RangesKt {
    @NotNull
    public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(@NotNull T $this$rangeTo, @NotNull T that) {
        Intrinsics.checkNotNullParameter($this$rangeTo, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableRange<T>($this$rangeTo, that);
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Double> rangeTo(double $this$rangeTo, double that) {
        return new ClosedDoubleRange($this$rangeTo, that);
    }

    @SinceKotlin(version="1.9")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final <T, R extends OpenEndRange<T> & Iterable<? extends T>> boolean contains(R $this$contains, T element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return element != null && $this$contains.contains((Comparable)((Comparable)element));
    }

    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @NotNull
    public static final OpenEndRange<Float> rangeUntil(float $this$rangeUntil, float that) {
        return new OpenEndFloatRange($this$rangeUntil, that);
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T, R extends ClosedRange<T> & Iterable<? extends T>> boolean contains(R $this$contains, T element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return element != null && $this$contains.contains((Comparable)((Comparable)element));
    }

    public static final void checkStepIsPositive(boolean isPositive, @NotNull Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (!isPositive) {
            throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
    }

    @NotNull
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.9")
    public static final OpenEndRange<Double> rangeUntil(double $this$rangeUntil, double that) {
        return new OpenEndDoubleRange($this$rangeUntil, that);
    }

    @NotNull
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.9")
    public static final <T extends Comparable<? super T>> OpenEndRange<T> rangeUntil(@NotNull T $this$rangeUntil, @NotNull T that) {
        Intrinsics.checkNotNullParameter($this$rangeUntil, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableOpenEndRange<T>($this$rangeUntil, that);
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Float> rangeTo(float $this$rangeTo, float that) {
        return new ClosedFloatRange($this$rangeTo, that);
    }
}

