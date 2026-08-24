/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadataKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016\u00a2\u0006\u0004\b\n\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010H$\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2={"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "value", "", "create", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/Continuation;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class BaseContinuationImpl
implements Continuation<Object>,
CoroutineStackFrame,
Serializable {
    @Nullable
    private final Continuation<Object> completion;

    protected void releaseIntercepted() {
    }

    @Nullable
    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public BaseContinuationImpl(@Nullable Continuation<Object> completion) {
        this.completion = completion;
    }

    @Override
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return DebugMetadataKt.getStackTraceElement(this);
    }

    @Nullable
    protected abstract Object invokeSuspend(@NotNull Object var1);

    @NotNull
    public String toString() {
        StackTraceElement stackTraceElement = this.getStackTraceElement();
        return "Continuation at " + (stackTraceElement != null ? (Serializable)stackTraceElement : (Serializable)((Object)this.getClass().getName()));
    }

    @NotNull
    public Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        return continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame)((Object)continuation) : null;
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override
    public final void resumeWith(@NotNull Object result) {
        Continuation<Object> completion;
        Object outcome;
        Continuation<Object> current = null;
        current = this;
        Object param = null;
        param = result;
        while (true) {
            Object object;
            BaseContinuationImpl baseContinuationImpl;
            DebugProbesKt.probeCoroutineResumed(current);
            BaseContinuationImpl $this$resumeWith_u24lambda_u240 = baseContinuationImpl = current;
            boolean bl = false;
            Intrinsics.checkNotNull($this$resumeWith_u24lambda_u240.completion);
            try {
                Object outcome2 = $this$resumeWith_u24lambda_u240.invokeSuspend(param);
                if (outcome2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return;
                }
                object = Result.constructor-impl(object);
            }
            catch (Throwable exception) {
                object = Result.constructor-impl(ResultKt.createFailure(exception));
            }
            outcome = object;
            $this$resumeWith_u24lambda_u240.releaseIntercepted();
            if (!(completion instanceof BaseContinuationImpl)) break;
            current = completion;
            param = outcome;
        }
        completion.resumeWith(outcome);
    }
}

