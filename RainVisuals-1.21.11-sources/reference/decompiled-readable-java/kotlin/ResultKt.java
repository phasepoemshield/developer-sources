/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00008\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a\u0086\u0001\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00010\b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00000\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u000b*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a]\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u000b*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\b2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\b\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a_\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00010\b2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00000\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u00a2\u0006\u0004\b\u001c\u0010\u0018\u001aR\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00010\b2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00000\fH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u0018\u001aY\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\b2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u001e0\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u00a2\u0006\u0004\b\u0011\u0010\u0018\u001aY\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\b2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001e0\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u00a2\u0006\u0004\b\u0010\u0010\u0018\u001ac\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u000b*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\b2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\fH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u00a2\u0006\u0004\b \u0010\u0018\u001aV\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u000b*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\b2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\fH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\u0018\u001aB\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0005*\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u00a2\u0006\u0002\b\"H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\u0018\u001a\u0017\u0010#\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\bH\u0001\u00a2\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006%"}, d2={"", "exception", "", "createFailure", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "Lkotlin/Result;", "runCatching", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "onSuccess", "onFailure", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrThrow", "(Ljava/lang/Object;)Ljava/lang/Object;", "transform", "map", "mapCatching", "", "action", "recover", "recoverCatching", "Lkotlin/ExtensionFunctionType;", "throwOnFailure", "(Ljava/lang/Object;)V", "kotlin-stdlib"})
public final class ResultKt {
    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <R, T> R fold(Object $this$fold, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable exception = Result.exceptionOrNull-impl($this$fold);
        return exception == null ? onSuccess.invoke($this$fold) : onFailure.invoke(exception);
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <R, T extends R> Object recover(Object $this$recover, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable exception = Result.exceptionOrNull-impl($this$recover);
        return exception == null ? $this$recover : Result.constructor-impl(transform.invoke(exception));
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T> Object onSuccess(Object $this$onSuccess, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Result.isSuccess-impl($this$onSuccess)) {
            action.invoke($this$onSuccess);
        }
        return $this$onSuccess;
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <R, T extends R> Object recoverCatching(Object $this$recoverCatching, Function1<? super Throwable, ? extends R> transform) {
        Object object;
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable exception = Result.exceptionOrNull-impl($this$recoverCatching);
        if (exception == null) {
            object = $this$recoverCatching;
        } else {
            Object object2;
            Object object3 = $this$recoverCatching;
            try {
                Object $this$recoverCatching_u24lambda_u245 = object3;
                boolean bl = false;
                object2 = Result.constructor-impl(transform.invoke(exception));
            }
            catch (Throwable throwable) {
                object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            object = object2;
        }
        return object;
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    public static final void throwOnFailure(@NotNull Object $this$throwOnFailure) {
        if ($this$throwOnFailure instanceof Result.Failure) {
            throw ((Result.Failure)$this$throwOnFailure).exception;
        }
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <R, T extends R> R getOrDefault(Object $this$getOrDefault, R defaultValue) {
        if (Result.isFailure-impl($this$getOrDefault)) {
            return defaultValue;
        }
        return (R)$this$getOrDefault;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <R, T> Object mapCatching(Object $this$mapCatching, Function1<? super T, ? extends R> transform) {
        Object object;
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (Result.isSuccess-impl($this$mapCatching)) {
            Object object2;
            Object object3 = $this$mapCatching;
            try {
                Object $this$mapCatching_u24lambda_u243 = object3;
                boolean bl = false;
                object2 = Result.constructor-impl(transform.invoke($this$mapCatching_u24lambda_u243));
            }
            catch (Throwable throwable) {
                object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            object = object2;
        } else {
            Object object4;
            object = Result.constructor-impl(object4);
        }
        return object;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <R> Object runCatching(Function0<? extends R> block) {
        Object object;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            object = Result.constructor-impl(block.invoke());
        }
        catch (Throwable e) {
            object = Result.constructor-impl(ResultKt.createFailure(e));
        }
        return object;
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <T> T getOrThrow(Object $this$getOrThrow) {
        ResultKt.throwOnFailure($this$getOrThrow);
        return (T)$this$getOrThrow;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <R, T> Object map(Object $this$map, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return Result.isSuccess-impl($this$map) ? Result.constructor-impl(transform.invoke($this$map)) : Result.constructor-impl($this$map);
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <T, R> Object runCatching(T $this$runCatching, Function1<? super T, ? extends R> block) {
        Object object;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            object = Result.constructor-impl(block.invoke($this$runCatching));
        }
        catch (Throwable e) {
            object = Result.constructor-impl(ResultKt.createFailure(e));
        }
        return object;
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <R, T extends R> R getOrElse(Object $this$getOrElse, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable exception = Result.exceptionOrNull-impl($this$getOrElse);
        return (R)(exception == null ? $this$getOrElse : onFailure.invoke(exception));
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T> Object onFailure(Object $this$onFailure, Function1<? super Throwable, Unit> action) {
        Object object;
        block0: {
            Intrinsics.checkNotNullParameter(action, "action");
            Throwable throwable = Result.exceptionOrNull-impl($this$onFailure);
            if (throwable == null) break block0;
            Throwable throwable2 = throwable;
            Throwable it = throwable2;
            boolean bl = false;
            action.invoke(it);
        }
        return object;
    }

    @NotNull
    @SinceKotlin(version="1.3")
    @PublishedApi
    public static final Object createFailure(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.Failure(exception);
    }
}

