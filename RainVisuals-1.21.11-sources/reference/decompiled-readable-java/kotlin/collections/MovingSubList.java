/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2={"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "list", "<init>", "(Ljava/util/List;)V", "", "index", "get", "(I)Ljava/lang/Object;", "fromIndex", "toIndex", "", "move", "(II)V", "_size", "I", "Ljava/util/List;", "getSize", "()I", "size", "kotlin-stdlib"})
public final class MovingSubList<E>
extends AbstractList<E>
implements RandomAccess {
    private int fromIndex;
    @NotNull
    private final List<E> list;
    private int _size;

    @Override
    public int getSize() {
        return this._size;
    }

    public final void move(int fromIndex, int toIndex) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.list.size());
        this.fromIndex = fromIndex;
        this._size = toIndex - fromIndex;
    }

    public MovingSubList(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @Override
    public E get(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this._size);
        return this.list.get(this.fromIndex + index);
    }
}

