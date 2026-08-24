/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyIterator;
import kotlin.collections.RingBuffer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"", "size", "step", "", "checkWindowSizeStep", "(II)V", "T", "", "iterator", "", "partialWindows", "reuseBuffer", "", "windowedIterator", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "windowedSequence", "(Lkotlin/sequences/Sequence;IIZZ)Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int size, int step) {
        boolean bl = size > 0 && step > 0;
        if (!bl) {
            boolean bl2 = false;
            String string = size != step ? "Both size " + size + " and step " + step + " must be greater than zero." : "size " + size + " must be greater than zero.";
            throw new IllegalArgumentException(string.toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator2, int size, int step, boolean partialWindows, boolean reuseBuffer) {
        Intrinsics.checkNotNullParameter(iterator2, "iterator");
        if (!iterator2.hasNext()) {
            return EmptyIterator.INSTANCE;
        }
        return SequencesKt.iterator(new Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object>(size, step, iterator2, reuseBuffer, partialWindows, null){
            int label;
            final /* synthetic */ int $size;
            final /* synthetic */ Iterator<T> $iterator;
            Object L$2;
            final /* synthetic */ boolean $partialWindows;
            private /* synthetic */ Object L$0;
            int I$0;
            final /* synthetic */ int $step;
            final /* synthetic */ boolean $reuseBuffer;
            Object L$1;

            @NotNull
            public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> $completion) {
                Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)((Object)function2);
            }
            {
                this.$size = $size;
                this.$step = $step;
                this.$iterator = $iterator;
                this.$reuseBuffer = $reuseBuffer;
                this.$partialWindows = $partialWindows;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object var1_1) {
                var9_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(var1_1);
                        $this$iterator = (SequenceScope)this.L$0;
                        bufferInitialCapacity = RangesKt.coerceAtMost(this.$size, 1024);
                        gap = this.$step - this.$size;
                        if (gap < 0) break;
                        buffer = new ArrayList<T>(bufferInitialCapacity);
                        skip = 0;
                        var7_10 = this.$iterator;
lbl12:
                        // 4 sources

                        while (var7_10.hasNext()) {
                            e = var7_10.next();
                            if (skip > 0) {
                                --skip;
                                continue;
                            }
                            buffer.add(e);
                            if (buffer.size() != this.$size) continue;
                            this.L$0 = $this$iterator;
                            this.L$1 = buffer;
                            this.L$2 = var7_10;
                            this.I$0 = gap;
                            this.label = 1;
                            v0 = $this$iterator.yield(buffer, this);
                            if (v0 == var9_2) {
                                return var9_2;
                            }
                            ** GOTO lbl37
                        }
                        break;
                    }
                    case 1: {
                        gap = this.I$0;
                        var7_10 = (Iterator<T>)this.L$2;
                        buffer = (ArrayList<T>)this.L$1;
                        $this$iterator = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure($result);
                        v0 = $result;
lbl37:
                        // 2 sources

                        if (this.$reuseBuffer) {
                            buffer.clear();
                        } else {
                            buffer = new ArrayList<E>(this.$size);
                        }
                        skip = gap;
                        ** GOTO lbl12
                    }
                }
                if (((Collection)buffer).isEmpty() == false && (this.$partialWindows || buffer.size() == this.$size)) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    v1 = $this$iterator.yield(buffer, this);
                    if (v1 == var9_2) {
                        return var9_2;
                    }
                }
                ** GOTO lbl112
                {
                    case 2: {
                        ResultKt.throwOnFailure($result);
                        v1 = $result;
                        ** GOTO lbl112
                    }
                }
                buffer = new RingBuffer<E>(bufferInitialCapacity);
                var6_9 = this.$iterator;
lbl58:
                // 4 sources

                while (var6_9.hasNext()) {
                    e = var6_9.next();
                    buffer.add(e);
                    if (!buffer.isFull()) continue;
                    if (buffer.size() < this.$size) {
                        buffer = buffer.expanded(this.$size);
                        continue;
                    }
                    this.L$0 = $this$iterator;
                    this.L$1 = buffer;
                    this.L$2 = var6_9;
                    this.label = 3;
                    v2 = $this$iterator.yield(this.$reuseBuffer != false ? (List)buffer : (List)new ArrayList<E>((Collection)buffer), this);
                    if (v2 == var9_2) {
                        return var9_2;
                    }
                    ** GOTO lbl80
                }
                {
                    break;
                    case 3: {
                        var6_9 = (Iterator<T>)this.L$2;
                        buffer = (RingBuffer)this.L$1;
                        $this$iterator = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure($result);
                        v2 = $result;
lbl80:
                        // 2 sources

                        buffer.removeFirst(this.$step);
                        ** GOTO lbl58
                    }
                }
                if (!this.$partialWindows) ** GOTO lbl112
lbl83:
                // 2 sources

                while (buffer.size() > this.$step) {
                    this.L$0 = $this$iterator;
                    this.L$1 = buffer;
                    this.L$2 = null;
                    this.label = 4;
                    v3 = $this$iterator.yield(this.$reuseBuffer != false ? (List)buffer : (List)new ArrayList<E>((Collection)buffer), this);
                    if (v3 == var9_2) {
                        return var9_2;
                    }
                    ** GOTO lbl98
                }
                {
                    break;
                    case 4: {
                        buffer = (RingBuffer<E>)this.L$1;
                        $this$iterator = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure($result);
                        v3 = $result;
lbl98:
                        // 2 sources

                        buffer.removeFirst(this.$step);
                        ** GOTO lbl83
                    }
                }
                if (((Collection)buffer).isEmpty() == false) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    v4 = $this$iterator.yield(buffer, this);
                    if (v4 == var9_2) {
                        return var9_2;
                    }
                }
                ** GOTO lbl112
                {
                    case 5: {
                        ResultKt.throwOnFailure($result);
                        v4 = $result;
lbl112:
                        // 5 sources

                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Nullable
            public final Object invoke(@NotNull SequenceScope<? super List<? extends T>> p1, @Nullable Continuation<? super Unit> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        });
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull Sequence<? extends T> $this$windowedSequence, int size, int step, boolean partialWindows, boolean reuseBuffer) {
        Intrinsics.checkNotNullParameter($this$windowedSequence, "<this>");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        return new Sequence<List<? extends T>>($this$windowedSequence, size, step, partialWindows, reuseBuffer){
            final /* synthetic */ int $size$inlined;
            final /* synthetic */ boolean $partialWindows$inlined;
            final /* synthetic */ Sequence $this_windowedSequence$inlined;
            final /* synthetic */ int $step$inlined;
            final /* synthetic */ boolean $reuseBuffer$inlined;
            {
                this.$this_windowedSequence$inlined = sequence;
                this.$size$inlined = n;
                this.$step$inlined = n2;
                this.$partialWindows$inlined = bl;
                this.$reuseBuffer$inlined = bl2;
            }

            @NotNull
            public Iterator<List<? extends T>> iterator() {
                boolean bl = false;
                return SlidingWindowKt.windowedIterator(this.$this_windowedSequence$inlined.iterator(), this.$size$inlined, this.$step$inlined, this.$partialWindows$inlined, this.$reuseBuffer$inlined);
            }
        };
    }
}

