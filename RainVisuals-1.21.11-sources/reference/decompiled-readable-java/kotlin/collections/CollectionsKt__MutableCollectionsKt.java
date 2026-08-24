/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000T\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a/\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b\u0005\u0010\b\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0004\b\u0005\u0010\n\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0016\u001a*\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0087\n\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a0\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\n\u00a2\u0006\u0004\b\u0019\u0010\u001b\u001a0\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\n\u00a2\u0006\u0004\b\u0019\u0010\u001c\u001a0\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087\n\u00a2\u0006\u0004\b\u0019\u0010\u001d\u001a*\u0010\u001e\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0087\n\u00a2\u0006\u0004\b\u001e\u0010\u001a\u001a0\u0010\u001e\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\n\u00a2\u0006\u0004\b\u001e\u0010\u001b\u001a0\u0010\u001e\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\n\u00a2\u0006\u0004\b\u001e\u0010\u001c\u001a0\u0010\u001e\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087\n\u00a2\u0006\u0004\b\u001e\u0010\u001d\u001a/\u0010 \u001a\u00020\u0004\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b\u001f*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\b \u0010!\u001a(\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010#\u001a\u00020\"H\u0087\b\u00a2\u0006\u0004\b \u0010$\u001a/\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b%\u0010\u0006\u001a-\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b%\u0010\b\u001a-\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0004\b%\u0010\n\u001a5\u0010%\u001a\u00020\u0004\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b\u001f*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0087\b\u00a2\u0006\u0004\b%\u0010&\u001a1\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b%\u0010'\u001a1\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b%\u0010(\u001a\u001f\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u00a2\u0006\u0004\b)\u0010*\u001a!\u0010+\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u00a2\u0006\u0004\b+\u0010*\u001a\u001f\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u00a2\u0006\u0004\b,\u0010*\u001a!\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u00a2\u0006\u0004\b-\u0010*\u001a/\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b.\u0010\u0006\u001a-\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b.\u0010\b\u001a-\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0004\b.\u0010\n\u001a5\u0010.\u001a\u00020\u0004\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b\u001f*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0087\b\u00a2\u0006\u0004\b.\u0010&\u001a1\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b.\u0010'\u001a1\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b.\u0010(\u001a\u0017\u00101\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u00a2\u0006\u0004\b/\u00100\u00a8\u00062"}, d2={"T", "", "", "elements", "", "addAll", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "Lkotlin/sequences/Sequence;", "(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Z", "", "convertToListIfNotCollection", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "", "Lkotlin/Function1;", "predicate", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z", "filterInPlace", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Z", "element", "", "minusAssign", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "(Ljava/util/Collection;Ljava/lang/Iterable;)V", "(Ljava/util/Collection;Lkotlin/sequences/Sequence;)V", "plusAssign", "Lkotlin/internal/OnlyInputTypes;", "remove", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "", "index", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "retainNothing$CollectionsKt__MutableCollectionsKt", "(Ljava/util/Collection;)Z", "retainNothing", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsKt
extends CollectionsKt__MutableCollectionsJVMKt {
    @InlineOnly
    private static final <T> boolean retainAll(Collection<? extends T> $this$retainAll, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return TypeIntrinsics.asMutableCollection($this$retainAll).retainAll(elements);
    }

    public static final <T> boolean addAll(@NotNull Collection<? super T> $this$addAll, @NotNull Sequence<? extends T> elements) {
        boolean bl;
        Intrinsics.checkNotNullParameter($this$addAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean result = false;
        Iterator<T> iterator2 = elements.iterator();
        while (iterator2.hasNext()) {
            T item = iterator2.next();
            if (!$this$addAll.add(item)) continue;
            bl = true;
        }
        return bl;
    }

    public static final <T> boolean addAll(@NotNull Collection<? super T> $this$addAll, @NotNull Iterable<? extends T> elements) {
        boolean bl;
        Intrinsics.checkNotNullParameter($this$addAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return $this$addAll.addAll((Collection)elements);
        }
        boolean result = false;
        Iterator<T> iterator2 = elements.iterator();
        while (iterator2.hasNext()) {
            T item = iterator2.next();
            if (!$this$addAll.add(item)) continue;
            bl = true;
        }
        return bl;
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.addAll($this$plusAssign, elements);
    }

    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final <T> T removeLast(@NotNull List<T> $this$removeLast) {
        Intrinsics.checkNotNullParameter($this$removeLast, "<this>");
        if ($this$removeLast.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return $this$removeLast.remove(CollectionsKt.getLastIndex($this$removeLast));
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.removeAll($this$minusAssign, elements);
    }

    public static final <T> boolean retainAll(@NotNull List<T> $this$retainAll, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, T[] elements) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.removeAll($this$minusAssign, elements);
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, T element) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        $this$plusAssign.add(element);
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.addAll($this$plusAssign, elements);
    }

    @InlineOnly
    private static final <T> boolean removeAll(Collection<? extends T> $this$removeAll, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return TypeIntrinsics.asMutableCollection($this$removeAll).removeAll(elements);
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> $this$filterInPlace, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) {
        void var3_3;
        Iterator<T> iterator2;
        boolean result = false;
        Iterator<T> $this$filterInPlace_u24lambda_u240 = iterator2 = $this$filterInPlace.iterator();
        boolean bl = false;
        while ($this$filterInPlace_u24lambda_u240.hasNext()) {
            if (predicate.invoke($this$filterInPlace_u24lambda_u240.next()) != predicateResultToRemove) continue;
            $this$filterInPlace_u24lambda_u240.remove();
            result = true;
        }
        return (boolean)var3_3;
    }

    @Deprecated(message="Use removeAt(index) instead.", replaceWith=@ReplaceWith(expression="removeAt(index)", imports={}), level=DeprecationLevel.ERROR)
    @InlineOnly
    private static final <T> T remove(List<T> $this$remove, int index) {
        Intrinsics.checkNotNullParameter($this$remove, "<this>");
        return $this$remove.remove(index);
    }

    @NotNull
    public static final <T> Collection<T> convertToListIfNotCollection(@NotNull Iterable<? extends T> $this$convertToListIfNotCollection) {
        Intrinsics.checkNotNullParameter($this$convertToListIfNotCollection, "<this>");
        return $this$convertToListIfNotCollection instanceof Collection ? (Collection)$this$convertToListIfNotCollection : (Collection)CollectionsKt.toList($this$convertToListIfNotCollection);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> $this$retainAll, @NotNull Sequence<? extends T> elements) {
        Collection<? super T> collection;
        Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List<? extends T> list = SequencesKt.toList(elements);
        boolean bl = !((Collection)list).isEmpty();
        if (bl) {
            return $this$retainAll.retainAll((Collection)list);
        }
        return CollectionsKt__MutableCollectionsKt.retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static final <T> boolean removeAll(@NotNull Collection<? super T> $this$removeAll, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean bl = elements.length == 0;
        return !bl && $this$removeAll.removeAll((Collection)ArraysKt.asList(elements));
    }

    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final <T> T removeFirst(@NotNull List<T> $this$removeFirst) {
        Intrinsics.checkNotNullParameter($this$removeFirst, "<this>");
        if ($this$removeFirst.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return $this$removeFirst.remove(0);
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> $this$plusAssign, T[] elements) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.addAll($this$plusAssign, elements);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @Nullable
    public static final <T> T removeFirstOrNull(@NotNull List<T> $this$removeFirstOrNull) {
        Intrinsics.checkNotNullParameter($this$removeFirstOrNull, "<this>");
        return $this$removeFirstOrNull.isEmpty() ? null : (T)$this$removeFirstOrNull.remove(0);
    }

    @Nullable
    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final <T> T removeLastOrNull(@NotNull List<T> $this$removeLastOrNull) {
        Intrinsics.checkNotNullParameter($this$removeLastOrNull, "<this>");
        return $this$removeLastOrNull.isEmpty() ? null : (T)$this$removeLastOrNull.remove(CollectionsKt.getLastIndex($this$removeLastOrNull));
    }

    public static final <T> boolean removeAll(@NotNull Collection<? super T> $this$removeAll, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return $this$removeAll.removeAll(CollectionsKt.convertToListIfNotCollection(elements));
    }

    public static final <T> boolean addAll(@NotNull Collection<? super T> $this$addAll, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter($this$addAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return $this$addAll.addAll((Collection)ArraysKt.asList(elements));
    }

    public static final <T> boolean removeAll(@NotNull Iterable<? extends T> $this$removeAll, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
    }

    public static final <T> boolean removeAll(@NotNull List<T> $this$removeAll, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> $this$retainAll, @NotNull T[] elements) {
        Collection<? super T> collection;
        Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean bl = elements.length == 0;
        boolean bl2 = !bl;
        if (bl2) {
            return $this$retainAll.retainAll((Collection)ArraysKt.asList(elements));
        }
        return CollectionsKt__MutableCollectionsKt.retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final <T> boolean removeAll(@NotNull Collection<? super T> $this$removeAll, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$removeAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List<? extends T> list = SequencesKt.toList(elements);
        if (((Collection)list).isEmpty()) return false;
        boolean bl = true;
        if (!bl) return false;
        if (!$this$removeAll.removeAll((Collection)list)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> $this$filterInPlace, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) {
        if (!($this$filterInPlace instanceof RandomAccess)) {
            Intrinsics.checkNotNull($this$filterInPlace, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable($this$filterInPlace), predicate, predicateResultToRemove);
        }
        int writeIndex = 0;
        IntIterator intIterator = new IntRange(0, CollectionsKt.getLastIndex($this$filterInPlace)).iterator();
        while (intIterator.hasNext()) {
            int readIndex = intIterator.nextInt();
            T element = $this$filterInPlace.get(readIndex);
            if (predicate.invoke(element) == predicateResultToRemove) continue;
            if (writeIndex != readIndex) {
                $this$filterInPlace.set(writeIndex, element);
            }
            ++writeIndex;
        }
        if (writeIndex < $this$filterInPlace.size()) {
            int removeIndex = CollectionsKt.getLastIndex($this$filterInPlace);
            int n = writeIndex;
            if (n <= removeIndex) {
                while (true) {
                    void var4_5;
                    $this$filterInPlace.remove(removeIndex);
                    if (removeIndex == n) break;
                    --var4_5;
                }
            }
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.removeAll($this$minusAssign, elements);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> $this$retainAll, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return $this$retainAll.retainAll(CollectionsKt.convertToListIfNotCollection(elements));
    }

    @InlineOnly
    private static final <T> boolean remove(Collection<? extends T> $this$remove, T element) {
        Intrinsics.checkNotNullParameter($this$remove, "<this>");
        return TypeIntrinsics.asMutableCollection($this$remove).remove(element);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> $this$retainNothing) {
        void var1_1;
        boolean result = !$this$retainNothing.isEmpty();
        $this$retainNothing.clear();
        return (boolean)var1_1;
    }

    public static final <T> boolean retainAll(@NotNull Iterable<? extends T> $this$retainAll, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$retainAll, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> $this$minusAssign, T element) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        $this$minusAssign.remove(element);
    }
}

