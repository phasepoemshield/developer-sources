/*
 * Decompiled with CFR 0.152.
 */
package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003B\u001f\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003\u00a2\u0006\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0010"}, d2={"Lkotlin/comparisons/ReversedComparator;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "<init>", "(Ljava/util/Comparator;)V", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "()Ljava/util/Comparator;", "Ljava/util/Comparator;", "getComparator", "kotlin-stdlib"})
final class ReversedComparator<T>
implements Comparator<T> {
    @NotNull
    private final Comparator<T> comparator;

    @Override
    public int compare(T a2, T b2) {
        return this.comparator.compare(b2, a2);
    }

    @Override
    @NotNull
    public final Comparator<T> reversed() {
        return this.comparator;
    }

    public ReversedComparator(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    @NotNull
    public final Comparator<T> getComparator() {
        return this.comparator;
    }
}

