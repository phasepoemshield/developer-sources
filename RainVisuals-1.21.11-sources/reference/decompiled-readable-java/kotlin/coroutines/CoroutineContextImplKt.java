/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "getPolymorphicElement", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "minusPolymorphicKey", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"})
public final class CoroutineContextImplKt {
    @SinceKotlin(version="1.3")
    @ExperimentalStdlibApi
    @Nullable
    public static final <E extends CoroutineContext.Element> E getPolymorphicElement(@NotNull CoroutineContext.Element $this$getPolymorphicElement, @NotNull CoroutineContext.Key<E> key) {
        CoroutineContext.Element element;
        Intrinsics.checkNotNullParameter($this$getPolymorphicElement, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof AbstractCoroutineContextKey) {
            Object v0;
            if (((AbstractCoroutineContextKey)key).isSubKey$kotlin_stdlib($this$getPolymorphicElement.getKey())) {
                Object e = ((AbstractCoroutineContextKey)key).tryCast$kotlin_stdlib($this$getPolymorphicElement);
                v0 = e instanceof CoroutineContext.Element ? e : null;
            } else {
                v0 = null;
            }
            return v0;
        }
        return (E)($this$getPolymorphicElement.getKey() == key ? element : null);
    }

    @SinceKotlin(version="1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final CoroutineContext minusPolymorphicKey(@NotNull CoroutineContext.Element $this$minusPolymorphicKey, @NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter($this$minusPolymorphicKey, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof AbstractCoroutineContextKey) {
            return ((AbstractCoroutineContextKey)key).isSubKey$kotlin_stdlib($this$minusPolymorphicKey.getKey()) && ((AbstractCoroutineContextKey)key).tryCast$kotlin_stdlib($this$minusPolymorphicKey) != null ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this$minusPolymorphicKey;
        }
        return $this$minusPolymorphicKey.getKey() == key ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this$minusPolymorphicKey;
    }
}

