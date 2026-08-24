/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00028\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00028\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\n\u00a8\u0006\u001c"}, d2={"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getFirst", "getSecond", "kotlin-stdlib"})
public final class Pair<A, B>
implements Serializable {
    private final A first;
    private final B second;

    public final A component1() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @NotNull
    public final Pair<A, B> copy(A first, B second) {
        return new Pair<A, B>(first, second);
    }

    public static /* synthetic */ Pair copy$default(Pair pair, Object object, Object object2, int n, Object object3) {
        if ((n & 1) != 0) {
            object = pair.first;
        }
        if ((n & 2) != 0) {
            object2 = pair.second;
        }
        return pair.copy(object, object2);
    }

    public int hashCode() {
        int result;
        int n = this.first == null ? 0 : (result = this.first.hashCode());
        int n2 = result * 31 + (this.second == null ? 0 : this.second.hashCode());
        return n2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair)other;
        if (!Intrinsics.areEqual(this.first, pair.first)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.second, pair.second)) {
            return false;
        }
        return true;
    }

    public final B component2() {
        return this.second;
    }

    @NotNull
    public String toString() {
        return "" + '(' + this.first + ", " + this.second + ')';
    }

    public final A getFirst() {
        return this.first;
    }
}

