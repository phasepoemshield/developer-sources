/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013R1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "safeCast", "<init>", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "key", "", "isSubKey$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Key;)Z", "isSubKey", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "tryCast", "Lkotlin/jvm/functions/Function1;", "topmostKey", "Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"})
@ExperimentalStdlibApi
@SinceKotlin(version="1.3")
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B>
implements CoroutineContext.Key<E> {
    @NotNull
    private final Function1<CoroutineContext.Element, E> safeCast;
    @NotNull
    private final CoroutineContext.Key<?> topmostKey;

    public final boolean isSubKey$kotlin_stdlib(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.topmostKey == key;
    }

    public AbstractCoroutineContextKey(@NotNull CoroutineContext.Key<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.safeCast = safeCast;
        this.topmostKey = baseKey instanceof AbstractCoroutineContextKey ? ((AbstractCoroutineContextKey)baseKey).topmostKey : baseKey;
    }

    @Nullable
    public final E tryCast$kotlin_stdlib(@NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (E)((CoroutineContext.Element)this.safeCast.invoke(element));
    }
}

