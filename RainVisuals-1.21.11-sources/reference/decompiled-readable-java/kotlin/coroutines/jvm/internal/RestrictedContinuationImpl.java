/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2={"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class RestrictedContinuationImpl
extends BaseContinuationImpl {
    @Override
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public RestrictedContinuationImpl(@Nullable Continuation<Object> completion) {
        super(completion);
        Continuation<Object> continuation = completion;
        if (continuation != null) {
            Continuation<Object> continuation2 = continuation;
            Continuation<Object> it = continuation2;
            boolean bl = false;
            boolean bl2 = it.getContext() == EmptyCoroutineContext.INSTANCE;
            if (!bl2) {
                boolean bl3 = false;
                String string = "Coroutines with restricted suspension must have EmptyCoroutineContext";
                throw new IllegalArgumentException(string.toString());
            }
        }
    }
}

