/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u000bJ\u001d\u0010\u001a\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u000fJ\u001d\u0010\u001b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u000fR\u001e\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006!"}, d2={"Lkotlin/collections/builders/MapBuilderKeys;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "contains", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "", "getSize", "()I", "size", "kotlin-stdlib"})
public final class MapBuilderKeys<E>
extends AbstractMutableSet<E>
implements Set<E>,
KMutableSet {
    @NotNull
    private final MapBuilder<E, ?> backing;

    public MapBuilderKeys(@NotNull MapBuilder<E, ?> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.backing = backing;
    }

    @Override
    public void clear() {
        this.backing.clear();
    }

    @Override
    public boolean remove(Object element) {
        return this.backing.removeKey$kotlin_stdlib(element) >= 0;
    }

    @Override
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    @Override
    @NotNull
    public Iterator<E> iterator() {
        return this.backing.keysIterator$kotlin_stdlib();
    }

    @Override
    public boolean add(E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object element) {
        return this.backing.containsKey(element);
    }

    @Override
    public int getSize() {
        return this.backing.size();
    }
}

