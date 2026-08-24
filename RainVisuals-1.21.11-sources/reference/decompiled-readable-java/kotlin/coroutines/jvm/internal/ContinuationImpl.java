/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CompletedContinuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0013\u00a8\u0006\u0014"}, d2={"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlin/coroutines/CoroutineContext;", "_context", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "intercepted", "()Lkotlin/coroutines/Continuation;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class ContinuationImpl
extends BaseContinuationImpl {
    @Nullable
    private transient Continuation<Object> intercepted;
    @Nullable
    private final CoroutineContext _context;

    @NotNull
    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation == null) {
            Continuation continuation2;
            Object object = (ContinuationInterceptor)this.getContext().get(ContinuationInterceptor.Key);
            if (object == null || (object = object.interceptContinuation(this)) == null) {
                object = this;
            }
            Continuation it = continuation2 = object;
            boolean bl = false;
            this.intercepted = it;
            continuation = continuation2;
        }
        return continuation;
    }

    public ContinuationImpl(@Nullable Continuation<Object> completion) {
        Continuation<Object> continuation = completion;
        this(completion, continuation != null ? continuation.getContext() : null);
    }

    @Override
    protected void releaseIntercepted() {
        Continuation<Object> intercepted = this.intercepted;
        if (intercepted != null && intercepted != this) {
            Object e = this.getContext().get(ContinuationInterceptor.Key);
            Intrinsics.checkNotNull(e);
            ((ContinuationInterceptor)e).releaseInterceptedContinuation(intercepted);
        }
        this.intercepted = CompletedContinuation.INSTANCE;
    }

    @Override
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public ContinuationImpl(@Nullable Continuation<Object> completion, @Nullable CoroutineContext _context) {
        super(completion);
        this._context = _context;
    }
}

