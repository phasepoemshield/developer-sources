/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001 B\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u001f\u00a8\u0006!"}, d2={"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "initialResult", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "getOrThrow", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "Ljava/lang/Object;", "Companion", "kotlin-stdlib"})
@PublishedApi
@SinceKotlin(version="1.3")
public final class SafeContinuation<T>
implements Continuation<T>,
CoroutineStackFrame {
    @Nullable
    private volatile Object result;
    @NotNull
    private final Continuation<T> delegate;
    private static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> RESULT;
    @NotNull
    private static final Companion Companion;

    @PublishedApi
    public SafeContinuation(@NotNull Continuation<? super T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this(delegate, (Object)CoroutineSingletons.UNDECIDED);
    }

    @Nullable
    @PublishedApi
    public final Object getOrThrow() {
        Object object;
        Object result = this.result;
        if (result == CoroutineSingletons.UNDECIDED) {
            if (RESULT.compareAndSet(this, (Object)CoroutineSingletons.UNDECIDED, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            result = this.result;
        }
        if (result == CoroutineSingletons.RESUMED) {
            object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        } else {
            if (result instanceof Result.Failure) {
                throw ((Result.Failure)result).exception;
            }
            object = result;
        }
        return object;
    }

    public SafeContinuation(@NotNull Continuation<? super T> delegate, @Nullable Object initialResult) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.result = initialResult;
    }

    @Override
    @NotNull
    public CoroutineContext getContext() {
        return this.delegate.getContext();
    }

    @Override
    public void resumeWith(@NotNull Object result) {
        block2: {
            while (true) {
                Object cur = this.result;
                if (cur == CoroutineSingletons.UNDECIDED) {
                    if (!RESULT.compareAndSet(this, (Object)CoroutineSingletons.UNDECIDED, result)) continue;
                    return;
                }
                if (cur != IntrinsicsKt.getCOROUTINE_SUSPENDED()) break block2;
                if (RESULT.compareAndSet(this, IntrinsicsKt.getCOROUTINE_SUSPENDED(), (Object)CoroutineSingletons.RESUMED)) break;
            }
            this.delegate.resumeWith(result);
            return;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        return continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame)((Object)continuation) : null;
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    static {
        Companion = new Companion(null);
        RESULT = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");
    }

    @Override
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003Rj\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0003\u00a8\u0006\n"}, d2={"Lkotlin/coroutines/SafeContinuation$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "kotlin-stdlib"})
    private static final class Companion {
        private Companion() {
        }

        private static /* synthetic */ void getRESULT$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

