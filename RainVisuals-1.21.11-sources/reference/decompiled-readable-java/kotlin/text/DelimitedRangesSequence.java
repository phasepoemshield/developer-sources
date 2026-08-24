/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012:\u0010\u000e\u001a6\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\b\u00a2\u0006\u0002\b\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013RH\u0010\u000e\u001a6\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\b\u00a2\u0006\u0002\b\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0016\u00a8\u0006\u0017"}, d2={"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/CharSequence;", "I", "kotlin-stdlib"})
final class DelimitedRangesSequence
implements Sequence<IntRange> {
    @NotNull
    private final CharSequence input;
    private final int startIndex;
    @NotNull
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> getNextMatch;
    private final int limit;

    public static final /* synthetic */ int access$getLimit$p(DelimitedRangesSequence $this) {
        return $this.limit;
    }

    public static final /* synthetic */ int access$getStartIndex$p(DelimitedRangesSequence $this) {
        return $this.startIndex;
    }

    public DelimitedRangesSequence(@NotNull CharSequence input, int startIndex, int limit, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = startIndex;
        this.limit = limit;
        this.getNextMatch = getNextMatch;
    }

    public static final /* synthetic */ Function2 access$getGetNextMatch$p(DelimitedRangesSequence $this) {
        return $this.getNextMatch;
    }

    public static final /* synthetic */ CharSequence access$getInput$p(DelimitedRangesSequence $this) {
        return $this.input;
    }

    @Override
    @NotNull
    public Iterator<IntRange> iterator() {
        return new Iterator<IntRange>(this){
            private int nextSearchIndex;
            private int counter;
            @Nullable
            private IntRange nextItem;
            private int currentStartIndex;
            private int nextState;
            final /* synthetic */ DelimitedRangesSequence this$0;

            public final int getNextSearchIndex() {
                return this.nextSearchIndex;
            }

            public final void setNextState(int n) {
                this.nextState = n;
            }

            public final int getCurrentStartIndex() {
                return this.currentStartIndex;
            }

            public final int getNextState() {
                return this.nextState;
            }

            public final int getCounter() {
                return this.counter;
            }

            public final void setNextSearchIndex(int n) {
                this.nextSearchIndex = n;
            }

            /*
             * WARNING - void declaration
             */
            @NotNull
            public IntRange next() {
                void var1_1;
                if (this.nextState == -1) {
                    this.calcNext();
                }
                if (this.nextState == 0) {
                    throw new NoSuchElementException();
                }
                IntRange intRange = this.nextItem;
                Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                IntRange result = intRange;
                this.nextItem = null;
                this.nextState = -1;
                return var1_1;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setCurrentStartIndex(int n) {
                this.currentStartIndex = n;
            }
            {
                this.this$0 = $receiver;
                this.nextState = -1;
                this.nextSearchIndex = this.currentStartIndex = RangesKt.coerceIn(DelimitedRangesSequence.access$getStartIndex$p($receiver), 0, DelimitedRangesSequence.access$getInput$p($receiver).length());
            }

            public final void setCounter(int n) {
                this.counter = n;
            }

            /*
             * Unable to fully structure code
             */
            private final void calcNext() {
                block5: {
                    block6: {
                        block4: {
                            if (this.nextSearchIndex >= 0) break block4;
                            this.nextState = 0;
                            this.nextItem = null;
                            break block5;
                        }
                        if (DelimitedRangesSequence.access$getLimit$p(this.this$0) <= 0) break block6;
                        ++this.counter;
                        if (this.counter >= DelimitedRangesSequence.access$getLimit$p(this.this$0)) ** GOTO lbl-1000
                    }
                    if (this.nextSearchIndex > DelimitedRangesSequence.access$getInput$p(this.this$0).length()) lbl-1000:
                    // 2 sources

                    {
                        this.nextItem = new IntRange(this.currentStartIndex, StringsKt.getLastIndex(DelimitedRangesSequence.access$getInput$p(this.this$0)));
                        this.nextSearchIndex = -1;
                    } else {
                        match = (Pair)DelimitedRangesSequence.access$getGetNextMatch$p(this.this$0).invoke(DelimitedRangesSequence.access$getInput$p(this.this$0), this.nextSearchIndex);
                        if (match == null) {
                            this.nextItem = new IntRange(this.currentStartIndex, StringsKt.getLastIndex(DelimitedRangesSequence.access$getInput$p(this.this$0)));
                            this.nextSearchIndex = -1;
                        } else {
                            index = ((Number)match.component1()).intValue();
                            length = ((Number)match.component2()).intValue();
                            this.nextItem = RangesKt.until(this.currentStartIndex, index);
                            this.currentStartIndex = index + length;
                            this.nextSearchIndex = this.currentStartIndex + (length == 0 ? 1 : 0);
                        }
                    }
                    this.nextState = 1;
                }
            }

            public final void setNextItem(@Nullable IntRange intRange) {
                this.nextItem = intRange;
            }

            @Nullable
            public final IntRange getNextItem() {
                return this.nextItem;
            }

            public boolean hasNext() {
                if (this.nextState == -1) {
                    this.calcNext();
                }
                return this.nextState == 1;
            }
        };
    }
}

