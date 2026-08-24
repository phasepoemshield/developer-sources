/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\rR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lkotlin/sequences/GeneratorSequence;", "", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"})
final class GeneratorSequence<T>
implements Sequence<T> {
    @NotNull
    private final Function1<T, T> getNextValue;
    @NotNull
    private final Function0<T> getInitialValue;

    public static final /* synthetic */ Function0 access$getGetInitialValue$p(GeneratorSequence $this) {
        return $this.getInitialValue;
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private int nextState;
            @Nullable
            private T nextItem;
            final /* synthetic */ GeneratorSequence<T> this$0;

            public final int getNextState() {
                return this.nextState;
            }

            private final void calcNext() {
                Object object;
                if (this.nextState == -2) {
                    object = GeneratorSequence.access$getGetInitialValue$p(this.this$0).invoke();
                } else {
                    Function1 function1 = GeneratorSequence.access$getGetNextValue$p(this.this$0);
                    T t = this.nextItem;
                    Intrinsics.checkNotNull(t);
                    object = this.nextItem = function1.invoke(t);
                }
                this.nextState = this.nextItem == null ? 0 : 1;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean hasNext() {
                if (this.nextState < 0) {
                    this.calcNext();
                }
                return this.nextState == 1;
            }

            public final void setNextItem(@Nullable T t) {
                this.nextItem = t;
            }

            @Nullable
            public final T getNextItem() {
                return this.nextItem;
            }
            {
                this.this$0 = $receiver;
                this.nextState = -2;
            }

            public final void setNextState(int n) {
                this.nextState = n;
            }

            /*
             * WARNING - void declaration
             */
            @NotNull
            public T next() {
                void var1_1;
                if (this.nextState < 0) {
                    this.calcNext();
                }
                if (this.nextState == 0) {
                    throw new NoSuchElementException();
                }
                T t = this.nextItem;
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                T result = t;
                this.nextState = -1;
                return var1_1;
            }
        };
    }

    public static final /* synthetic */ Function1 access$getGetNextValue$p(GeneratorSequence $this) {
        return $this.getNextValue;
    }

    public GeneratorSequence(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }
}

