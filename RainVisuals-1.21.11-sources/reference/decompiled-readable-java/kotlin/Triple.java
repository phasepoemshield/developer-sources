/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00028\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0007\u001a\u00028\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\b\u001a\u00028\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\f\u00a8\u0006 "}, d2={"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "kotlin-stdlib"})
public final class Triple<A, B, C>
implements Serializable {
    private final B second;
    private final A first;
    private final C third;

    public final B getSecond() {
        return this.second;
    }

    public static /* synthetic */ Triple copy$default(Triple triple, Object object, Object object2, Object object3, int n, Object object4) {
        if ((n & 1) != 0) {
            object = triple.first;
        }
        if ((n & 2) != 0) {
            object2 = triple.second;
        }
        if ((n & 4) != 0) {
            object3 = triple.third;
        }
        return triple.copy(object, object2, object3);
    }

    public final C component3() {
        return this.third;
    }

    @NotNull
    public final Triple<A, B, C> copy(A first, B second, C third) {
        return new Triple<A, B, C>(first, second, third);
    }

    public int hashCode() {
        int result;
        int n = this.first == null ? 0 : (result = this.first.hashCode());
        result = result * 31 + (this.second == null ? 0 : this.second.hashCode());
        int n2 = result * 31 + (this.third == null ? 0 : this.third.hashCode());
        return n2;
    }

    public final A getFirst() {
        return this.first;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple)other;
        if (!Intrinsics.areEqual(this.first, triple.first)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.second, triple.second)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.third, triple.third)) {
            return false;
        }
        return true;
    }

    public final A component1() {
        return this.first;
    }

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public final B component2() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    @NotNull
    public String toString() {
        return "" + '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}

