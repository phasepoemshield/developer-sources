/*
 * Decompiled with CFR 0.152.
 */
package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0007\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u00a2\u0006\u0004\b\u0003\u0010\n\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007\u00a2\u0006\u0004\b\u0003\u0010\r\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010*\u00020\u0005H\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0013\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010*\u00020\bH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0014\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0015\u00a8\u0006\u0016"}, d2={"Ljava/util/stream/DoubleStream;", "Lkotlin/sequences/Sequence;", "", "asSequence", "(Ljava/util/stream/DoubleStream;)Lkotlin/sequences/Sequence;", "Ljava/util/stream/IntStream;", "", "(Ljava/util/stream/IntStream;)Lkotlin/sequences/Sequence;", "Ljava/util/stream/LongStream;", "", "(Ljava/util/stream/LongStream;)Lkotlin/sequences/Sequence;", "T", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)Lkotlin/sequences/Sequence;", "asStream", "(Lkotlin/sequences/Sequence;)Ljava/util/stream/Stream;", "", "toList", "(Ljava/util/stream/DoubleStream;)Ljava/util/List;", "(Ljava/util/stream/IntStream;)Ljava/util/List;", "(Ljava/util/stream/LongStream;)Ljava/util/List;", "(Ljava/util/stream/Stream;)Ljava/util/List;", "kotlin-stdlib-jdk8"}, pn="")
@JvmName(name="StreamsKt")
public final class StreamsKt {
    @NotNull
    @SinceKotlin(version="1.2")
    public static final <T> Stream<T> asStream(@NotNull Sequence<? extends T> $this$asStream) {
        Intrinsics.checkNotNullParameter($this$asStream, "<this>");
        Stream stream = StreamSupport.stream(() -> StreamsKt.asStream$lambda$4($this$asStream), 16, false);
        Intrinsics.checkNotNullExpressionValue(stream, "stream(...)");
        return stream;
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final <T> Sequence<T> asSequence(@NotNull Stream<T> $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new Sequence<T>($this$asSequence){
            final /* synthetic */ Stream $this_asSequence$inlined;
            {
                this.$this_asSequence$inlined = stream;
            }

            @NotNull
            public Iterator<T> iterator() {
                boolean bl = false;
                Iterator<T> iterator2 = this.$this_asSequence$inlined.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
                return iterator2;
            }
        };
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final Sequence<Double> asSequence(@NotNull DoubleStream $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new Sequence<Double>($this$asSequence){
            final /* synthetic */ DoubleStream $this_asSequence$inlined;
            {
                this.$this_asSequence$inlined = doubleStream;
            }

            @NotNull
            public Iterator<Double> iterator() {
                boolean bl = false;
                PrimitiveIterator.OfDouble ofDouble = this.$this_asSequence$inlined.iterator();
                Intrinsics.checkNotNullExpressionValue(ofDouble, "iterator(...)");
                return ofDouble;
            }
        };
    }

    @SinceKotlin(version="1.2")
    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull IntStream $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new Sequence<Integer>($this$asSequence){
            final /* synthetic */ IntStream $this_asSequence$inlined;
            {
                this.$this_asSequence$inlined = intStream;
            }

            @NotNull
            public Iterator<Integer> iterator() {
                boolean bl = false;
                PrimitiveIterator.OfInt ofInt = this.$this_asSequence$inlined.iterator();
                Intrinsics.checkNotNullExpressionValue(ofInt, "iterator(...)");
                return ofInt;
            }
        };
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final Sequence<Long> asSequence(@NotNull LongStream $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new Sequence<Long>($this$asSequence){
            final /* synthetic */ LongStream $this_asSequence$inlined;
            {
                this.$this_asSequence$inlined = longStream;
            }

            @NotNull
            public Iterator<Long> iterator() {
                boolean bl = false;
                PrimitiveIterator.OfLong ofLong = this.$this_asSequence$inlined.iterator();
                Intrinsics.checkNotNullExpressionValue(ofLong, "iterator(...)");
                return ofLong;
            }
        };
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final List<Integer> toList(@NotNull IntStream $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        int[] nArray = $this$toList.toArray();
        Intrinsics.checkNotNullExpressionValue(nArray, "toArray(...)");
        return ArraysKt.asList(nArray);
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final <T> List<T> toList(@NotNull Stream<T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        List list = $this$toList.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(list, "collect(...)");
        return list;
    }

    private static final Spliterator asStream$lambda$4(Sequence $this_asStream) {
        Intrinsics.checkNotNullParameter($this_asStream, "$this_asStream");
        return Spliterators.spliteratorUnknownSize($this_asStream.iterator(), 16);
    }

    @SinceKotlin(version="1.2")
    @NotNull
    public static final List<Double> toList(@NotNull DoubleStream $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        double[] dArray = $this$toList.toArray();
        Intrinsics.checkNotNullExpressionValue(dArray, "toArray(...)");
        return ArraysKt.asList(dArray);
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final List<Long> toList(@NotNull LongStream $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        long[] lArray = $this$toList.toArray();
        Intrinsics.checkNotNullExpressionValue(lArray, "toArray(...)");
        return ArraysKt.asList(lArray);
    }
}

