/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0013"}, d2={"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "await", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Result;", "getResult-xLWZpok", "()Lkotlin/Result;", "setResult", "(Lkotlin/Result;)V", "kotlin-stdlib"})
final class RunSuspend
implements Continuation<Unit> {
    @Nullable
    private Result<Unit> result;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void await() {
        RunSuspend runSuspend = this;
        synchronized (runSuspend) {
            Result<Unit> result;
            boolean bl = false;
            while (true) {
                result = this.result;
                if (result != null) break;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                ((Object)this).wait();
            }
            Object object = result.unbox-impl();
            ResultKt.throwOnFailure(object);
            return;
        }
    }

    @Override
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final void setResult(@Nullable Result<Unit> result) {
        this.result = result;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void resumeWith(@NotNull Object result) {
        RunSuspend runSuspend = this;
        synchronized (runSuspend) {
            boolean bl = false;
            this.result = Result.box-impl(result);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            ((Object)this).notifyAll();
            Unit unit = Unit.INSTANCE;
            return;
        }
    }

    @Nullable
    public final Result<Unit> getResult-xLWZpok() {
        return this.result;
    }
}

