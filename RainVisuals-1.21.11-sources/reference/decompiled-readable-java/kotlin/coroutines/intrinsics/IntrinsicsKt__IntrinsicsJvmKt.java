/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0083\b\u00a2\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010\u00a2\u0006\u0002\b\u00112\u0006\u0010\u0012\u001a\u00028\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u00a2\u0006\u0004\b\r\u0010\u0013\u001a%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00a2\u0006\u0004\b\u0014\u0010\u000b\u001a@\u0010\u0015\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001aY\u0010\u0015\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010\u00a2\u0006\u0002\b\u00112\u0006\u0010\u0012\u001a\u00028\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\b\u00a2\u0006\u0004\b\u0015\u0010\u0017\u001am\u0010\u0015\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019\u00a2\u0006\u0002\b\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0081\b\u00a2\u0006\u0004\b\u0015\u0010\u001b\u001a?\u0010\u001c\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u00a2\u0006\u0004\b\u001c\u0010\u0016\u001aX\u0010\u001c\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010\u00a2\u0006\u0002\b\u00112\u0006\u0010\u0012\u001a\u00028\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0001\u00a2\u0006\u0004\b\u001c\u0010\u0017\u001al\u0010\u001c\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019\u00a2\u0006\u0002\b\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001b\u00a8\u0006\u001d"}, d2={"T", "Lkotlin/coroutines/Continuation;", "completion", "Lkotlin/Function1;", "", "block", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)Lkotlin/coroutines/Continuation;", "createCoroutineFromSuspendFunction", "createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "createSimpleCoroutineForSuspendFunction", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapWithContinuationImpl", "kotlin-stdlib"}, xs="kotlin/coroutines/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsJvmKt {
    @SinceKotlin(version="1.3")
    @NotNull
    public static final <T> Continuation<T> intercepted(@NotNull Continuation<? super T> $this$intercepted) {
        Intrinsics.checkNotNullParameter($this$intercepted, "<this>");
        ContinuationImpl continuationImpl = $this$intercepted instanceof ContinuationImpl ? (ContinuationImpl)$this$intercepted : null;
        Continuation<Object> continuation = continuationImpl;
        if (continuationImpl == null || (continuation = continuation.intercepted()) == null) {
            Continuation<? super T> continuation2;
            continuation = continuation2;
        }
        return continuation;
    }

    @PublishedApi
    @Nullable
    public static final <T> Object wrapWithContinuationImpl(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$wrapWithContinuationImpl, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$wrapWithContinuationImpl, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation<? super T> newCompletion = IntrinsicsKt__IntrinsicsJvmKt.createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion));
        return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$wrapWithContinuationImpl, 1)).invoke(newCompletion);
    }

    @Nullable
    @PublishedApi
    public static final <R, P, T> Object wrapWithContinuationImpl(@NotNull Function3<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> $this$wrapWithContinuationImpl, R receiver, P param, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$wrapWithContinuationImpl, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation<? super T> newCompletion = IntrinsicsKt__IntrinsicsJvmKt.createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion));
        return ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$wrapWithContinuationImpl, 3)).invoke(receiver, param, newCompletion);
    }

    @InlineOnly
    private static final <R, P, T> Object startCoroutineUninterceptedOrReturn(Function3<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> $this$startCoroutineUninterceptedOrReturn, R receiver, P param, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutineUninterceptedOrReturn, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return !($this$startCoroutineUninterceptedOrReturn instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl($this$startCoroutineUninterceptedOrReturn, receiver, param, completion) : ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$startCoroutineUninterceptedOrReturn, 3)).invoke(receiver, param, completion);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @SinceKotlin(version="1.3")
    public static final <R, T> Continuation<Unit> createCoroutineUnintercepted(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$createCoroutineUnintercepted, R receiver, @NotNull Continuation<? super T> completion) {
        Continuation continuation;
        Intrinsics.checkNotNullParameter($this$createCoroutineUnintercepted, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation<T> probeCompletion = DebugProbesKt.probeCoroutineCreated(completion);
        if ($this$createCoroutineUnintercepted instanceof BaseContinuationImpl) {
            continuation = ((BaseContinuationImpl)((Object)$this$createCoroutineUnintercepted)).create(receiver, probeCompletion);
        } else {
            void var1_1;
            boolean $i$f$createCoroutineFromSuspendFunction = false;
            CoroutineContext context$iv = probeCompletion.getContext();
            continuation = context$iv == EmptyCoroutineContext.INSTANCE ? (Continuation)new RestrictedContinuationImpl(probeCompletion, $this$createCoroutineUnintercepted, receiver){
                final /* synthetic */ Object $receiver$inlined;
                final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
                private int label;
                {
                    this.$this_createCoroutineUnintercepted$inlined = function2;
                    this.$receiver$inlined = object;
                    Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                    super($completion);
                }

                @Nullable
                protected Object invokeSuspend(@NotNull Object result) {
                    Object object;
                    switch (this.label) {
                        case 0: {
                            this.label = 1;
                            ResultKt.throwOnFailure(result);
                            Continuation it = this;
                            boolean bl = false;
                            Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                            object = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, it);
                            break;
                        }
                        case 1: {
                            this.label = 2;
                            Object object2 = result;
                            ResultKt.throwOnFailure(object2);
                            object = object2;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("This coroutine had already completed".toString());
                        }
                    }
                    return object;
                }
            } : (Continuation)new ContinuationImpl(probeCompletion, context$iv, $this$createCoroutineUnintercepted, var1_1){
                private int label;
                final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
                final /* synthetic */ Object $receiver$inlined;

                @Nullable
                protected Object invokeSuspend(@NotNull Object result) {
                    Object object;
                    switch (this.label) {
                        case 0: {
                            this.label = 1;
                            ResultKt.throwOnFailure(result);
                            Continuation it = this;
                            boolean bl = false;
                            Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                            object = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, it);
                            break;
                        }
                        case 1: {
                            this.label = 2;
                            Object object2 = result;
                            ResultKt.throwOnFailure(object2);
                            object = object2;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("This coroutine had already completed".toString());
                        }
                    }
                    return object;
                }
                {
                    this.$this_createCoroutineUnintercepted$inlined = function2;
                    this.$receiver$inlined = object;
                    Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                    super($completion, $context);
                }
            };
        }
        return continuation;
    }

    @PublishedApi
    @Nullable
    public static final <R, T> Object wrapWithContinuationImpl(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$wrapWithContinuationImpl, R receiver, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$wrapWithContinuationImpl, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation<? super T> newCompletion = IntrinsicsKt__IntrinsicsJvmKt.createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion));
        return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$wrapWithContinuationImpl, 2)).invoke(receiver, newCompletion);
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <R, T> Object startCoroutineUninterceptedOrReturn(Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$startCoroutineUninterceptedOrReturn, R receiver, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutineUninterceptedOrReturn, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return !($this$startCoroutineUninterceptedOrReturn instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl($this$startCoroutineUninterceptedOrReturn, receiver, completion) : ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$startCoroutineUninterceptedOrReturn, 2)).invoke(receiver, completion);
    }

    @SinceKotlin(version="1.3")
    private static final <T> Continuation<Unit> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(Continuation<? super T> completion, Function1<? super Continuation<? super T>, ? extends Object> block) {
        boolean $i$f$createCoroutineFromSuspendFunction = false;
        CoroutineContext context = completion.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? (Continuation)new RestrictedContinuationImpl(completion, block){
            private int label;
            final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
            {
                this.$block = $block;
                Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super($completion);
            }

            @Nullable
            protected Object invokeSuspend(@NotNull Object result) {
                Object object;
                switch (this.label) {
                    case 0: {
                        this.label = 1;
                        Object object2 = result;
                        ResultKt.throwOnFailure(object2);
                        object = this.$block.invoke(this);
                        break;
                    }
                    case 1: {
                        this.label = 2;
                        Object object3 = result;
                        ResultKt.throwOnFailure(object3);
                        object = object3;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                }
                return object;
            }
        } : (Continuation)new ContinuationImpl(completion, context, block){
            private int label;
            final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
            {
                this.$block = $block;
                Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super($completion, $context);
            }

            @Nullable
            protected Object invokeSuspend(@NotNull Object result) {
                Object object;
                switch (this.label) {
                    case 0: {
                        this.label = 1;
                        Object object2 = result;
                        ResultKt.throwOnFailure(object2);
                        object = this.$block.invoke(this);
                        break;
                    }
                    case 1: {
                        this.label = 2;
                        Object object3 = result;
                        ResultKt.throwOnFailure(object3);
                        object = object3;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                }
                return object;
            }
        };
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T> Object startCoroutineUninterceptedOrReturn(Function1<? super Continuation<? super T>, ? extends Object> $this$startCoroutineUninterceptedOrReturn, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutineUninterceptedOrReturn, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return !($this$startCoroutineUninterceptedOrReturn instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl($this$startCoroutineUninterceptedOrReturn, completion) : ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$startCoroutineUninterceptedOrReturn, 1)).invoke(completion);
    }

    private static final <T> Continuation<T> createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(Continuation<? super T> completion) {
        CoroutineContext context = completion.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? (Continuation)new RestrictedContinuationImpl(completion){

            @Nullable
            protected Object invokeSuspend(@NotNull Object result) {
                Object object = result;
                ResultKt.throwOnFailure(object);
                return object;
            }
            {
                Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super($completion);
            }
        } : (Continuation)new ContinuationImpl(completion, context){

            @Nullable
            protected Object invokeSuspend(@NotNull Object result) {
                Object object = result;
                ResultKt.throwOnFailure(object);
                return object;
            }
            {
                Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super($completion, $context);
            }
        };
    }

    @NotNull
    @SinceKotlin(version="1.3")
    public static final <T> Continuation<Unit> createCoroutineUnintercepted(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$createCoroutineUnintercepted, @NotNull Continuation<? super T> completion) {
        Continuation continuation;
        Intrinsics.checkNotNullParameter($this$createCoroutineUnintercepted, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation<T> probeCompletion = DebugProbesKt.probeCoroutineCreated(completion);
        if ($this$createCoroutineUnintercepted instanceof BaseContinuationImpl) {
            continuation = ((BaseContinuationImpl)((Object)$this$createCoroutineUnintercepted)).create(probeCompletion);
        } else {
            boolean $i$f$createCoroutineFromSuspendFunction = false;
            CoroutineContext context$iv = probeCompletion.getContext();
            continuation = context$iv == EmptyCoroutineContext.INSTANCE ? (Continuation)new RestrictedContinuationImpl(probeCompletion, $this$createCoroutineUnintercepted){
                private int label;
                final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;

                @Nullable
                protected Object invokeSuspend(@NotNull Object result) {
                    Object object;
                    switch (this.label) {
                        case 0: {
                            this.label = 1;
                            ResultKt.throwOnFailure(result);
                            Continuation it = this;
                            boolean bl = false;
                            Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                            object = ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(it);
                            break;
                        }
                        case 1: {
                            this.label = 2;
                            Object object2 = result;
                            ResultKt.throwOnFailure(object2);
                            object = object2;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("This coroutine had already completed".toString());
                        }
                    }
                    return object;
                }
                {
                    this.$this_createCoroutineUnintercepted$inlined = function1;
                    Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                    super($completion);
                }
            } : (Continuation)new ContinuationImpl(probeCompletion, context$iv, $this$createCoroutineUnintercepted){
                final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
                private int label;

                @Nullable
                protected Object invokeSuspend(@NotNull Object result) {
                    Object object;
                    switch (this.label) {
                        case 0: {
                            this.label = 1;
                            ResultKt.throwOnFailure(result);
                            Continuation it = this;
                            boolean bl = false;
                            Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                            object = ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(it);
                            break;
                        }
                        case 1: {
                            this.label = 2;
                            Object object2 = result;
                            ResultKt.throwOnFailure(object2);
                            object = object2;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("This coroutine had already completed".toString());
                        }
                    }
                    return object;
                }
                {
                    this.$this_createCoroutineUnintercepted$inlined = function1;
                    Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                    super($completion, $context);
                }
            };
        }
        return continuation;
    }
}

