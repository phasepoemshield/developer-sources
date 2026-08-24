/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BJ\u00129\u0010\b\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0002\b\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\f\u0010\rJb\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000429\u0010\u000e\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0002\b\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J4\u0010\f\u001a\u00028\u0003\"\u0004\b\u0002\u0010\u0019\"\u0004\b\u0003\u0010\u001a*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u001b2\u0006\u0010\t\u001a\u00028\u0002H\u0096@\u00a2\u0006\u0004\b\f\u0010\u001cR \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 RI\u0010\"\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0002\b\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R!\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0013\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010$\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006%"}, d2={"Lkotlin/DeepRecursiveScopeImpl;", "T", "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "block", "value", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentFunction", "cont", "crossFunctionCompletion", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "runCallLoop", "()Ljava/lang/Object;", "U", "S", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "function", "Lkotlin/jvm/functions/Function3;", "Ljava/lang/Object;", "kotlin-stdlib"})
final class DeepRecursiveScopeImpl<T, R>
extends DeepRecursiveScope<T, R>
implements Continuation<R> {
    @Nullable
    private Object value;
    @NotNull
    private Object result;
    @NotNull
    private Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;
    @Nullable
    private Continuation<Object> cont;

    @Override
    public void resumeWith(@NotNull Object result) {
        this.cont = null;
        this.result = result;
    }

    /*
     * WARNING - void declaration
     */
    public final R runCallLoop() {
        while (true) {
            void var1_1;
            void var2_2;
            Object object;
            Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> result = this.result;
            if (this.cont == null) {
                object = result;
                ResultKt.throwOnFailure(object);
                return (R)object;
            }
            if (Result.equals-impl0(DeepRecursiveKt.access$getUNDEFINED_RESULT$p(), result)) {
                Continuation<Object> cont;
                try {
                    object = this.function;
                    Object object2 = this.value;
                    object = !(object instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(object, this, object2, cont) : ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object, 3)).invoke(this, object2, cont);
                }
                catch (Throwable e) {
                    cont.resumeWith(Result.constructor-impl(ResultKt.createFailure(e)));
                    continue;
                }
                Object r = object;
                if (r == IntrinsicsKt.getCOROUTINE_SUSPENDED()) continue;
                cont.resumeWith(Result.constructor-impl(r));
                continue;
            }
            this.result = DeepRecursiveKt.access$getUNDEFINED_RESULT$p();
            var2_2.resumeWith(var1_1);
        }
    }

    public static final /* synthetic */ void access$setFunction$p(DeepRecursiveScopeImpl $this, Function3 function3) {
        $this.function = function3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public Object callRecursive(T value, @NotNull Continuation<? super R> $completion) {
        Continuation<R> cont = $completion;
        boolean bl = false;
        Intrinsics.checkNotNull(cont, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = cont;
        this.value = value;
        Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            void var2_2;
            DebugProbesKt.probeCoroutineSuspended(var2_2);
        }
        return object;
    }

    public static final /* synthetic */ void access$setResult$p(DeepRecursiveScopeImpl $this, Object object) {
        $this.result = object;
    }

    private final Continuation<Object> crossFunctionCompletion(Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> currentFunction, Continuation<Object> cont) {
        CoroutineContext coroutineContext = EmptyCoroutineContext.INSTANCE;
        return new Continuation<Object>(coroutineContext, this, currentFunction, cont){
            final /* synthetic */ DeepRecursiveScopeImpl this$0;
            final /* synthetic */ Continuation $cont$inlined;
            final /* synthetic */ CoroutineContext $context;
            final /* synthetic */ Function3 $currentFunction$inlined;
            {
                this.$context = $context;
                this.this$0 = deepRecursiveScopeImpl;
                this.$currentFunction$inlined = function3;
                this.$cont$inlined = continuation;
            }

            @NotNull
            public CoroutineContext getContext() {
                return this.$context;
            }

            public void resumeWith(@NotNull Object result) {
                Object it = result;
                boolean bl = false;
                DeepRecursiveScopeImpl.access$setFunction$p(this.this$0, this.$currentFunction$inlined);
                DeepRecursiveScopeImpl.access$setCont$p(this.this$0, this.$cont$inlined);
                DeepRecursiveScopeImpl.access$setResult$p(this.this$0, it);
            }
        };
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public <U, S> Object callRecursive(@NotNull DeepRecursiveFunction<U, S> $this$callRecursive, U value, @NotNull Continuation<? super S> $completion) {
        Continuation<Object> cont = $completion;
        boolean bl = false;
        Function3<DeepRecursiveScope<U, S>, U, Continuation<S>, Object> function3 = $this$callRecursive.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNull(function3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        Function3<DeepRecursiveScope<U, S>, U, Continuation<S>, Object> function = function3;
        DeepRecursiveScopeImpl $this$callRecursive_u24lambda_u242_u24lambda_u241 = this;
        boolean bl2 = false;
        Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> currentFunction = $this$callRecursive_u24lambda_u242_u24lambda_u241.function;
        if (function != currentFunction) {
            $this$callRecursive_u24lambda_u242_u24lambda_u241.function = function;
            Intrinsics.checkNotNull(cont, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            $this$callRecursive_u24lambda_u242_u24lambda_u241.cont = $this$callRecursive_u24lambda_u242_u24lambda_u241.crossFunctionCompletion(currentFunction, cont);
        } else {
            Intrinsics.checkNotNull(cont, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            $this$callRecursive_u24lambda_u242_u24lambda_u241.cont = cont;
        }
        $this$callRecursive_u24lambda_u242_u24lambda_u241.value = value;
        Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            void var3_3;
            DebugProbesKt.probeCoroutineSuspended(var3_3);
        }
        return object;
    }

    public static final /* synthetic */ void access$setCont$p(DeepRecursiveScopeImpl $this, Continuation continuation) {
        $this.cont = continuation;
    }

    public DeepRecursiveScopeImpl(@NotNull Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T value) {
        Intrinsics.checkNotNullParameter(block, "block");
        super(null);
        this.function = block;
        this.value = value;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        this.result = DeepRecursiveKt.access$getUNDEFINED_RESULT$p();
    }

    @Override
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}

