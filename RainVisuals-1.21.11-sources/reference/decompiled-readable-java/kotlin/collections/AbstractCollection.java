/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u00a6\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015\u00a2\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001f"}, d2={"Lkotlin/collections/AbstractCollection;", "E", "", "<init>", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "getSize", "()I", "size", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract class AbstractCollection<E>
implements Collection<E>,
KMappedMarker {
    @Override
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    protected AbstractCollection() {
    }

    @Override
    @NotNull
    public abstract Iterator<E> iterator();

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        boolean bl;
        block3: {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterable $this$all$iv = elements;
            boolean $i$f$all = false;
            if (((Collection)$this$all$iv).isEmpty()) {
                bl = true;
            } else {
                Iterator iterator2 = $this$all$iv.iterator();
                while (iterator2.hasNext()) {
                    void var6_6;
                    Object element$iv;
                    Object it = element$iv = iterator2.next();
                    boolean bl2 = false;
                    if (this.contains(var6_6)) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean contains(E element) {
        void var6_6;
        Iterable $this$any$iv = this;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            Object element$iv;
            if (!iterator2.hasNext()) return false;
            Object it = element$iv = iterator2.next();
            boolean bl = false;
        } while (!Intrinsics.areEqual(var6_6, element));
        return true;
    }

    @Override
    @NotNull
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean addAll(Collection<? extends E> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(E element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int getSize();

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this, ", ", "[", "]", 0, null, new Function1<E, CharSequence>(this){
            final /* synthetic */ AbstractCollection<E> this$0;
            {
                this.this$0 = $receiver;
                super(1);
            }

            @NotNull
            public final CharSequence invoke(E it) {
                return it == this.this$0 ? (CharSequence)"(this Collection)" : (CharSequence)String.valueOf(it);
            }
        }, 24, null);
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

