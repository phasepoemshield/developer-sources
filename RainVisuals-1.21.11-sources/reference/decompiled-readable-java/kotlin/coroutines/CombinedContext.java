/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00012\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b#\u0010 J\u000f\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010*\u00a8\u0006,"}, d2={"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "", "contains", "(Lkotlin/coroutines/CoroutineContext$Element;)Z", "context", "containsAll", "(Lkotlin/coroutines/CombinedContext;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "", "hashCode", "()I", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "size", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "Serialized", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public final class CombinedContext
implements CoroutineContext,
Serializable {
    @NotNull
    private final CoroutineContext left;
    @NotNull
    private final CoroutineContext.Element element;

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        void var1_1;
        E e;
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedContext cur = this;
        while (true) {
            e = cur.element.get(key);
            if (e != null) {
                void var5_5;
                E e2;
                E it = e2 = e;
                boolean bl = false;
                return var5_5;
            }
            CoroutineContext next = cur.left;
            if (!(next instanceof CombinedContext)) break;
            cur = (CombinedContext)next;
        }
        return e.get(var1_1);
    }

    public boolean equals(@Nullable Object other) {
        return this == other || other instanceof CombinedContext && ((CombinedContext)other).size() == this.size() && ((CombinedContext)other).containsAll(this);
    }

    @NotNull
    public String toString() {
        return '[' + this.fold("", toString.1.INSTANCE) + ']';
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext context) {
        return CoroutineContext.DefaultImpls.plus(this, context);
    }

    public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    private final boolean contains(CoroutineContext.Element element) {
        return Intrinsics.areEqual(this.get(element.getKey()), element);
    }

    /*
     * WARNING - void declaration
     */
    private final Object writeReplace() {
        void var2_2;
        int n = this.size();
        CoroutineContext[] elements = new CoroutineContext[n];
        Ref.IntRef index = new Ref.IntRef();
        this.fold(Unit.INSTANCE, (Function2)new Function2<Unit, CoroutineContext.Element, Unit>(elements, index){
            final /* synthetic */ Ref.IntRef $index;
            final /* synthetic */ CoroutineContext[] $elements;

            /*
             * WARNING - void declaration
             */
            public final void invoke(@NotNull Unit unit, @NotNull CoroutineContext.Element element) {
                void var2_2;
                Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(element, "element");
                int n = this.$index.element;
                this.$index.element = n + 1;
                this.$elements[n] = var2_2;
            }
            {
                this.$elements = $elements;
                this.$index = $index;
                super(2);
            }
        });
        boolean bl = index.element == n;
        if (!bl) {
            String string = "Check failed.";
            throw new IllegalStateException(string.toString());
        }
        return new Serialized((CoroutineContext[])var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private final int size() {
        CombinedContext cur = this;
        int size = 2;
        while (true) {
            void var2_2;
            CombinedContext combinedContext;
            CoroutineContext coroutineContext = cur.left;
            if ((coroutineContext instanceof CombinedContext ? (CombinedContext)coroutineContext : null) == null) {
                return size;
            }
            combinedContext = combinedContext;
            ++var2_2;
        }
    }

    private final boolean containsAll(CombinedContext context) {
        CoroutineContext next;
        CombinedContext cur = context;
        while (true) {
            if (!this.contains(cur.element)) {
                return false;
            }
            next = cur.left;
            if (!(next instanceof CombinedContext)) break;
            cur = (CombinedContext)next;
        }
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.contains((CoroutineContext.Element)next);
    }

    @Override
    public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.left.fold(initial, operation), this.element);
    }

    @Override
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.element.get(key);
        if (obj != null) {
            Object obj2 = obj;
            Object it = obj2;
            boolean bl = false;
            return this.left;
        }
        CoroutineContext newLeft = this.left.minusKey(key);
        return newLeft == this.left ? (CoroutineContext)this : (newLeft == EmptyCoroutineContext.INSTANCE ? (CoroutineContext)this.element : (CoroutineContext)new CombinedContext(newLeft, this.element));
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2={"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lkotlin/coroutines/CoroutineContext;", "elements", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "", "readResolve", "()Ljava/lang/Object;", "[Lkotlin/coroutines/CoroutineContext;", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "Companion", "kotlin-stdlib"})
    private static final class Serialized
    implements Serializable {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 0L;
        @NotNull
        private final CoroutineContext[] elements;

        @NotNull
        public final CoroutineContext[] getElements() {
            return this.elements;
        }

        public Serialized(@NotNull CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        /*
         * WARNING - void declaration
         */
        private final Object readResolve() {
            void var4_4;
            void $this$fold$iv;
            CoroutineContext[] coroutineContextArray = this.elements;
            EmptyCoroutineContext initial$iv = EmptyCoroutineContext.INSTANCE;
            boolean $i$f$fold = false;
            CoroutineContext accumulator$iv = initial$iv;
            int n = ((void)$this$fold$iv).length;
            for (int i = 0; i < n; ++i) {
                void p1;
                void element$iv;
                void var8_8 = element$iv = $this$fold$iv[i];
                CoroutineContext p0 = accumulator$iv;
                boolean bl = false;
                accumulator$iv = p0.plus((CoroutineContext)p1);
            }
            return var4_4;
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }
        }
    }
}

