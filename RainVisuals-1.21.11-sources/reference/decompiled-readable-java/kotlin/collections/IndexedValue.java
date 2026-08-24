/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00028\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006\u001a"}, d2={"Lkotlin/collections/IndexedValue;", "T", "", "", "index", "value", "<init>", "(ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "I", "getIndex", "Ljava/lang/Object;", "getValue", "kotlin-stdlib"})
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int index, T value) {
        this.index = index;
        this.value = value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue)other;
        if (this.index != indexedValue.index) {
            return false;
        }
        if (!Intrinsics.areEqual(this.value, indexedValue.value)) {
            return false;
        }
        return true;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }

    public final int component1() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    @NotNull
    public final IndexedValue<T> copy(int index, T value) {
        return new IndexedValue<T>(index, value);
    }

    public final T component2() {
        return this.value;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int result = Integer.hashCode(this.index);
        result = result * 31 + (this.value == null ? 0 : this.value.hashCode());
        return (int)var1_1;
    }

    public static /* synthetic */ IndexedValue copy$default(IndexedValue indexedValue, int n, Object object, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            n = indexedValue.index;
        }
        if ((n2 & 2) != 0) {
            object = indexedValue.value;
        }
        return indexedValue.copy(n, object);
    }
}

