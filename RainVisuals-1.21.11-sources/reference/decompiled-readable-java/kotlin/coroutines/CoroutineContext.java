/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u00a6\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH&\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lkotlin/coroutines/CoroutineContext;", "", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "Element", "Key", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public interface CoroutineContext {
    @Nullable
    public <E extends Element> E get(@NotNull Key<E> var1);

    @NotNull
    public CoroutineContext minusKey(@NotNull Key<?> var1);

    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext var1);

    public <R> R fold(R var1, @NotNull Function2<? super R, ? super Element, ? extends R> var2);

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"})
    public static interface Element
    extends CoroutineContext {
        @Override
        public <R> R fold(R var1, @NotNull Function2<? super R, ? super Element, ? extends R> var2);

        @Override
        @NotNull
        public CoroutineContext minusKey(@NotNull Key<?> var1);

        @Override
        @Nullable
        public <E extends Element> E get(@NotNull Key<E> var1);

        @NotNull
        public Key<?> getKey();

        @Metadata(mv={1, 9, 0}, k=3, xi=48)
        public static final class DefaultImpls {
            @NotNull
            public static CoroutineContext plus(@NotNull Element $this, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return kotlin.coroutines.CoroutineContext$DefaultImpls.plus($this, context);
            }

            @NotNull
            public static CoroutineContext minusKey(@NotNull Element $this, @NotNull Key<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual($this.getKey(), key) ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this;
            }

            public static <R> R fold(@NotNull Element $this, R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(initial, $this);
            }

            @Nullable
            public static <E extends Element> E get(@NotNull Element $this, @NotNull Key<E> key) {
                Element element;
                Intrinsics.checkNotNullParameter(key, "key");
                if (Intrinsics.areEqual($this.getKey(), key)) {
                    Intrinsics.checkNotNull($this, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    element = $this;
                } else {
                    element = null;
                }
                return (E)element;
            }
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003\u00a8\u0006\u0004"}, d2={"Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "", "kotlin-stdlib"})
    public static interface Key<E extends Element> {
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @NotNull
        public static CoroutineContext plus(@NotNull CoroutineContext $this, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? $this : context.fold($this, plus.1.INSTANCE);
        }
    }
}

