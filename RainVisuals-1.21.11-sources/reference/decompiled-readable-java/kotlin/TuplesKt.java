/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u0086\u0004\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u0004\b\b\u0010\u000b\u00a8\u0006\f"}, d2={"A", "B", "that", "Lkotlin/Pair;", "to", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "T", "", "toList", "(Lkotlin/Pair;)Ljava/util/List;", "Lkotlin/Triple;", "(Lkotlin/Triple;)Ljava/util/List;", "kotlin-stdlib"})
@JvmName(name="TuplesKt")
public final class TuplesKt {
    @NotNull
    public static final <T> List<T> toList(@NotNull Triple<? extends T, ? extends T, ? extends T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        Object[] objectArray = new Object[3];
        objectArray[0] = $this$toList.getFirst();
        objectArray[1] = $this$toList.getSecond();
        objectArray[2] = $this$toList.getThird();
        return CollectionsKt.listOf(objectArray);
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Pair<? extends T, ? extends T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        Object[] objectArray = new Object[2];
        objectArray[0] = $this$toList.getFirst();
        objectArray[1] = $this$toList.getSecond();
        return CollectionsKt.listOf(objectArray);
    }

    @NotNull
    public static final <A, B> Pair<A, B> to(A $this$to, B that) {
        return new Pair<A, B>($this$to, that);
    }
}

