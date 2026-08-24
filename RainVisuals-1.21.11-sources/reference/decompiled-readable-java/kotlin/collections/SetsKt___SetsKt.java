/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0007\u001a4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\u0002\u00a2\u0006\u0004\b\u0003\u0010\t\u001a4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002\u00a2\u0006\u0004\b\u0003\u0010\u000b\u001a.\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0004\u001a.\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\r\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002\u00a2\u0006\u0004\b\r\u0010\u0007\u001a4\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\u0002\u00a2\u0006\u0004\b\r\u0010\t\u001a4\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002\u00a2\u0006\u0004\b\r\u0010\u000b\u001a.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\b\u000e\u0010\u0004\u00a8\u0006\u000f"}, d2={"T", "", "element", "minus", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "Lkotlin/sequences/Sequence;", "(Ljava/util/Set;Lkotlin/sequences/Sequence;)Ljava/util/Set;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, xs="kotlin/collections/SetsKt")
class SetsKt___SetsKt
extends SetsKt__SetsKt {
    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, @NotNull Iterable<? extends T> elements) {
        void var3_4;
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<T> other = CollectionsKt.convertToListIfNotCollection(elements);
        if (other.isEmpty()) {
            return CollectionsKt.toSet((Iterable)$this$minus);
        }
        if (other instanceof Set) {
            void var4_5;
            void $this$filterNotTo$iv;
            Iterable iterable = $this$minus;
            Collection destination$iv = new LinkedHashSet();
            boolean $i$f$filterNotTo = false;
            Iterator iterator2 = $this$filterNotTo$iv.iterator();
            while (iterator2.hasNext()) {
                Object element$iv;
                Object it = element$iv = iterator2.next();
                boolean bl = false;
                if (other.contains(it)) continue;
                destination$iv.add(element$iv);
            }
            return (Set)var4_5;
        }
        LinkedHashSet result = new LinkedHashSet($this$minus);
        result.removeAll(other);
        return (Set)var3_4;
    }

    @InlineOnly
    private static final <T> Set<T> plusElement(Set<? extends T> $this$plusElement, T element) {
        Intrinsics.checkNotNullParameter($this$plusElement, "<this>");
        return SetsKt.plus($this$plusElement, element);
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$plus.size() * 2));
        result.addAll($this$plus);
        CollectionsKt.addAll((Collection)result, elements);
        return result;
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet result = new LinkedHashSet($this$minus);
        CollectionsKt.removeAll((Collection)result, elements);
        return result;
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet result = new LinkedHashSet($this$minus);
        CollectionsKt.removeAll((Collection)result, elements);
        return result;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> $this$minus, T element) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$minus.size()));
        boolean removed = false;
        Iterable $this$filterTo$iv = $this$minus;
        boolean $i$f$filterTo = false;
        Iterator iterator2 = $this$filterTo$iv.iterator();
        while (iterator2.hasNext()) {
            void var7_7;
            boolean bl;
            Object element$iv;
            Object it = element$iv = iterator2.next();
            boolean bl2 = false;
            if (!removed && Intrinsics.areEqual(it, element)) {
                removed = true;
                bl = false;
            } else {
                bl = true;
            }
            if (!bl) continue;
            ((Collection)result).add(var7_7);
        }
        return (Set)((Collection)var2_2);
    }

    @InlineOnly
    private static final <T> Set<T> minusElement(Set<? extends T> $this$minusElement, T element) {
        Intrinsics.checkNotNullParameter($this$minusElement, "<this>");
        return SetsKt.minus($this$minusElement, element);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, @NotNull Iterable<? extends T> elements) {
        void var2_6;
        int n;
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer n2 = CollectionsKt.collectionSizeOrNull(elements);
        if (n2 != null) {
            Integer n3 = n2;
            int it = ((Number)n3).intValue();
            boolean bl = false;
            n = $this$plus.size() + it;
        } else {
            n = $this$plus.size() * 2;
        }
        int n4 = MapsKt.mapCapacity(n);
        LinkedHashSet result = new LinkedHashSet(n4);
        result.addAll($this$plus);
        CollectionsKt.addAll((Collection)result, elements);
        return (Set)var2_6;
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, T element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        LinkedHashSet<T> result = new LinkedHashSet<T>(MapsKt.mapCapacity($this$plus.size() + 1));
        result.addAll((Collection)$this$plus);
        result.add(element);
        return result;
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> $this$plus, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($this$plus.size() + elements.length));
        result.addAll($this$plus);
        CollectionsKt.addAll((Collection)result, elements);
        return result;
    }
}

