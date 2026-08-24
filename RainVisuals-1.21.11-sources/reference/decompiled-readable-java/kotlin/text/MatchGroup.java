/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t\u00a8\u0006\u001a"}, d2={"Lkotlin/text/MatchGroup;", "", "", "value", "Lkotlin/ranges/IntRange;", "range", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/ranges/IntRange;", "copy", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Lkotlin/text/MatchGroup;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lkotlin/ranges/IntRange;", "getRange", "Ljava/lang/String;", "getValue", "kotlin-stdlib"})
public final class MatchGroup {
    @NotNull
    private final IntRange range;
    @NotNull
    private final String value;

    @NotNull
    public final IntRange component2() {
        return this.range;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup)other;
        if (!Intrinsics.areEqual(this.value, matchGroup.value)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.range, matchGroup.range)) {
            return false;
        }
        return true;
    }

    public MatchGroup(@NotNull String value, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.value = value;
        this.range = range;
    }

    public static /* synthetic */ MatchGroup copy$default(MatchGroup matchGroup, String string, IntRange intRange, int n, Object object) {
        if ((n & 1) != 0) {
            string = matchGroup.value;
        }
        if ((n & 2) != 0) {
            intRange = matchGroup.range;
        }
        return matchGroup.copy(string, intRange);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final MatchGroup copy(@NotNull String value, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        return new MatchGroup(value, range);
    }

    @NotNull
    public final String component1() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.value + ", range=" + this.range + ')';
    }

    public int hashCode() {
        int result = this.value.hashCode();
        result = result * 31 + this.range.hashCode();
        return result;
    }

    @NotNull
    public final IntRange getRange() {
        return this.range;
    }
}

