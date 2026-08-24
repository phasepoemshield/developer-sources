/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\u001aC\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00050\u0003H\u0087H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\\\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012\u00a2\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0015\u001a(\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0016\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0087\b\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a=\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001aV\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012\u00a2\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001f\"\u001b\u0010$\u001a\u00020\u00018\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006%"}, d2={"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function1;", "Lkotlin/Result;", "", "resumeWith", "Lkotlin/coroutines/Continuation;", "Continuation", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lkotlin/coroutines/Continuation;", "block", "suspendCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "completion", "createCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "value", "resume", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "", "exception", "resumeWithException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "coroutineContext", "kotlin-stdlib"})
public final class ContinuationKt {
    @SinceKotlin(version="1.3")
    public static final <T> void startCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$startCoroutine, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$startCoroutine, completion)).resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static final <T> Continuation<Unit> createCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$createCoroutine, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$createCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation<Unit>(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$createCoroutine, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version="1.3")
    public static final <R, T> void startCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$startCoroutine, R receiver, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$startCoroutine, receiver, completion)).resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T> Continuation<T> Continuation(CoroutineContext context, Function1<? super Result<? extends T>, Unit> resumeWith) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resumeWith, "resumeWith");
        return new Continuation<T>(context, resumeWith){
            final /* synthetic */ Function1<Result<? extends T>, Unit> $resumeWith;
            final /* synthetic */ CoroutineContext $context;
            {
                this.$context = $context;
                this.$resumeWith = $resumeWith;
            }

            public void resumeWith(@NotNull Object result) {
                this.$resumeWith.invoke(Result.box-impl(result));
            }

            @NotNull
            public CoroutineContext getContext() {
                return this.$context;
            }
        };
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T> void resume(Continuation<? super T> $this$resume, T value) {
        Intrinsics.checkNotNullParameter($this$resume, "<this>");
        $this$resume.resumeWith(Result.constructor-impl(value));
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <T> Object suspendCoroutine(Function1<? super Continuation<? super T>, Unit> block, Continuation<? super T> $completion) {
        InlineMarker.mark(0);
        Continuation<? super T> c = $completion;
        boolean bl = false;
        SafeContinuation<T> safe = new SafeContinuation<T>(IntrinsicsKt.intercepted(c));
        block.invoke(safe);
        Object object = safe.getOrThrow();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        InlineMarker.mark(1);
        return object;
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <T> void resumeWithException(Continuation<? super T> $this$resumeWithException, Throwable exception) {
        Intrinsics.checkNotNullParameter($this$resumeWithException, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        $this$resumeWithException.resumeWith(Result.constructor-impl(ResultKt.createFailure(exception)));
    }

    @NotNull
    @SinceKotlin(version="1.3")
    public static final <R, T> Continuation<Unit> createCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$createCoroutine, R receiver, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$createCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation<Unit>(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$createCoroutine, receiver, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}

