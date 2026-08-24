/*
 * Decompiled with CFR 0.152.
 */
package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\u00060)j\u0002`*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006-"}, d2={"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "", "exceptionalState", "()Ljava/lang/Throwable;", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "nextNotReady", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "yield", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterator", "yieldAll", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "nextIterator", "Ljava/util/Iterator;", "nextStep", "Lkotlin/coroutines/Continuation;", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "", "Lkotlin/sequences/State;", "state", "I", "kotlin-stdlib"})
final class SequenceBuilderIterator<T>
extends SequenceScope<T>
implements Iterator<T>,
Continuation<Unit>,
KMappedMarker {
    @Nullable
    private T nextValue;
    @Nullable
    private Iterator<? extends T> nextIterator;
    @Nullable
    private Continuation<? super Unit> nextStep;
    private int state;

    @Override
    @Nullable
    public Object yieldAll(@NotNull Iterator<? extends T> iterator2, @NotNull Continuation<? super Unit> $completion) {
        if (!iterator2.hasNext()) {
            return Unit.INSTANCE;
        }
        this.nextIterator = iterator2;
        this.state = 2;
        Continuation<? super Unit> c = $completion;
        boolean bl = false;
        this.nextStep = c;
        Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return object;
        }
        return Unit.INSTANCE;
    }

    private final Throwable exceptionalState() {
        Throwable throwable;
        switch (this.state) {
            case 4: {
                throwable = new NoSuchElementException();
                break;
            }
            case 5: {
                throwable = new IllegalStateException("Iterator has failed.");
                break;
            }
            default: {
                throwable = new IllegalStateException("Unexpected state of the iterator: " + this.state);
            }
        }
        return throwable;
    }

    private final T nextNotReady() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.next();
    }

    @Override
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final void setNextStep(@Nullable Continuation<? super Unit> continuation) {
        this.nextStep = continuation;
    }

    @Nullable
    public final Continuation<Unit> getNextStep() {
        return this.nextStep;
    }

    @Override
    @Nullable
    public Object yield(T value, @NotNull Continuation<? super Unit> $completion) {
        this.nextValue = value;
        this.state = 3;
        Continuation<? super Unit> c = $completion;
        boolean bl = false;
        this.nextStep = c;
        Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return object;
        }
        return Unit.INSTANCE;
    }

    @Override
    public boolean hasNext() {
        while (true) {
            Continuation<? super Unit> step;
            switch (this.state) {
                case 0: {
                    break;
                }
                case 1: {
                    Iterator<T> iterator2 = this.nextIterator;
                    Intrinsics.checkNotNull(iterator2);
                    if (iterator2.hasNext()) {
                        this.state = 2;
                        return true;
                    }
                    this.nextIterator = null;
                    break;
                }
                case 4: {
                    return false;
                }
                case 2: 
                case 3: {
                    return true;
                }
                default: {
                    throw this.exceptionalState();
                }
            }
            this.state = 5;
            Intrinsics.checkNotNull(this.nextStep);
            this.nextStep = null;
            step.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        }
    }

    @Override
    public T next() {
        switch (this.state) {
            case 0: 
            case 1: {
                return this.nextNotReady();
            }
            case 2: {
                this.state = 1;
                Iterator<T> iterator2 = this.nextIterator;
                Intrinsics.checkNotNull(iterator2);
                return iterator2.next();
            }
            case 3: {
                this.state = 0;
                T result = this.nextValue;
                this.nextValue = null;
                return result;
            }
        }
        throw this.exceptionalState();
    }

    @Override
    public void resumeWith(@NotNull Object result) {
        Object object = result;
        ResultKt.throwOnFailure(object);
        this.state = 4;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

