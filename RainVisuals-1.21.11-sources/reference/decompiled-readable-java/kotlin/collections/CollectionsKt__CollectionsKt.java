/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.ArrayAsCollection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001aJ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\n\u001a&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u0000H\u0087\b\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011\"\u00028\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0013\u001aU\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u001f\b\u0001\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00160\u0003\u00a2\u0006\u0002\b\u0017H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\b\u0019\u0010\n\u001aM\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00142\u001f\b\u0001\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00160\u0003\u00a2\u0006\u0002\b\u0017H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00112\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000\u00a2\u0006\u0004\b\u001e\u0010!\u001a\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u00a2\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000H\u0087\b\u00a2\u0006\u0004\b$\u0010#\u001a-\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011\"\u00028\u0000\u00a2\u0006\u0004\b$\u0010%\u001a'\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b'\u0010(\u001a5\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020\u001d2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0011\"\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b'\u0010%\u001a\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000H\u0087\b\u00a2\u0006\u0004\b)\u0010#\u001a-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011\"\u00028\u0000\u00a2\u0006\u0004\b)\u0010%\u001a'\u0010.\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b,\u0010-\u001a\u000f\u0010/\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\b/\u00100\u001a\u000f\u00101\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\b1\u00100\u001a'\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011H\u0000\u00a2\u0006\u0004\b2\u00103\u001aU\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010&\u001a\u00028\u00002\u001a\u00106\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`52\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u0001\u00a2\u0006\u0004\b7\u00108\u001aE\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0004\b7\u0010:\u001aG\u00107\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2\b\u0010&\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u0001\u00a2\u0006\u0004\b7\u0010<\u001ai\u0010@\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010=*\b\u0012\u0004\u0012\u00028\u00010;*\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010>\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00012\u0016\b\u0004\u0010?\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b@\u0010A\u001a3\u0010D\u001a\u00020C\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\bB*\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0087\b\u00a2\u0006\u0004\bD\u0010E\u001a=\u0010J\u001a\u00028\u0001\"\u0010\b\u0000\u0010F*\u0006\u0012\u0002\b\u00030\u001b*\u00028\u0001\"\u0004\b\u0001\u0010G*\u00028\u00002\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010HH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bJ\u0010K\u001a \u0010L\u001a\u00020C\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0087\b\u00a2\u0006\u0004\bL\u0010M\u001a3\u0010N\u001a\u00020C\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001bH\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u00a2\u0006\u0004\bN\u0010M\u001a%\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u00a2\u0006\u0004\bO\u0010P\u001a(\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001bH\u0087\b\u00a2\u0006\u0004\bQ\u0010R\u001a(\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0087\b\u00a2\u0006\u0004\bQ\u0010P\u001a-\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000S2\u0006\u0010U\u001a\u00020TH\u0007\u00a2\u0006\u0004\bV\u0010W\"\u0019\u0010[\u001a\u00020X*\u0006\u0012\u0002\b\u00030\u001b8F\u00a2\u0006\u0006\u001a\u0004\bY\u0010Z\"!\u0010^\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b8F\u00a2\u0006\u0006\u001a\u0004\b\\\u0010]\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006_"}, d2={"T", "", "size", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "init", "", "List", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "MutableList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arrayListOf", "()Ljava/util/ArrayList;", "", "elements", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "E", "capacity", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildList", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "collection", "", "collectionToArrayCommonImpl", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "emptyList", "()Ljava/util/List;", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "element", "listOfNotNull", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "(III)V", "rangeCheck", "throwCountOverflow", "()V", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "binarySearch", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "(Ljava/util/List;IILkotlin/jvm/functions/Function1;)I", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "K", "key", "selector", "binarySearchBy", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "Lkotlin/internal/OnlyInputTypes;", "", "containsAll", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "C", "R", "Lkotlin/Function0;", "defaultValue", "ifEmpty", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "(Ljava/util/Collection;)Z", "isNullOrEmpty", "optimizeReadOnlyList", "(Ljava/util/List;)Ljava/util/List;", "orEmpty", "(Ljava/util/Collection;)Ljava/util/Collection;", "", "Lkotlin/random/Random;", "random", "shuffled", "(Ljava/lang/Iterable;Lkotlin/random/Random;)Ljava/util/List;", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsKt
extends CollectionsKt__CollectionsJVMKt {
    /*
     * WARNING - void declaration
     */
    public static final <T extends Comparable<? super T>> int binarySearch(@NotNull List<? extends T> $this$binarySearch, @Nullable T element, int fromIndex, int toIndex) {
        void var4_4;
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        CollectionsKt__CollectionsKt.rangeCheck$CollectionsKt__CollectionsKt($this$binarySearch.size(), fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex + -1;
        while (low <= high) {
            void var6_6;
            int mid = low + high >>> 1;
            Comparable midVal = (Comparable)$this$binarySearch.get(mid);
            int cmp = ComparisonsKt.compareValues(midVal, element);
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var6_6;
        }
        return (int)(-(var4_4 + true));
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    @NotNull
    public static final <T> ArrayList<T> arrayListOf(T ... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList((Collection)new ArrayAsCollection<T>(elements, true));
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final Object[] collectionToArrayCommonImpl(@NotNull Collection<?> collection) {
        void var1_2;
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            boolean $i$f$emptyArray = false;
            return new Object[0];
        }
        Object[] destination = new Object[collection.size()];
        Iterator<?> iterator2 = collection.iterator();
        int index = 0;
        while (iterator2.hasNext()) {
            destination[index++] = iterator2.next();
        }
        return var1_2;
    }

    /*
     * WARNING - void declaration
     */
    public static final <T> int binarySearch(@NotNull List<? extends T> $this$binarySearch, T element, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        CollectionsKt__CollectionsKt.rangeCheck$CollectionsKt__CollectionsKt($this$binarySearch.size(), fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            void var7_7;
            int mid = low + high >>> 1;
            T midVal = $this$binarySearch.get(mid);
            int cmp = comparator.compare(midVal, element);
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var7_7;
        }
        return (int)(-(var5_5 + true));
    }

    public static /* synthetic */ int binarySearch$default(List list, Object object, Comparator comparator, int n, int n2, int n3, Object object2) {
        if ((n3 & 4) != 0) {
            n = 0;
        }
        if ((n3 & 8) != 0) {
            n2 = list.size();
        }
        return CollectionsKt.binarySearch(list, object, comparator, n, n2);
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int size, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ").");
        }
        if (fromIndex < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than zero.");
        }
        if (toIndex > size) {
            throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ").");
        }
    }

    @InlineOnly
    private static final <T> List<T> listOf() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public static final <T> List<T> mutableListOf(T ... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? (List)new ArrayList() : (List)new ArrayList((Collection)new ArrayAsCollection<T>(elements, true));
    }

    @InlineOnly
    private static final <T> List<T> orEmpty(List<? extends T> $this$orEmpty) {
        List<Object> list = $this$orEmpty;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <C extends Collection<?> & R, R> R ifEmpty(C $this$ifEmpty, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (R)($this$ifEmpty.isEmpty() ? defaultValue.invoke() : $this$ifEmpty);
    }

    @InlineOnly
    private static final <T> Collection<T> orEmpty(Collection<? extends T> $this$orEmpty) {
        Collection collection = $this$orEmpty;
        if (collection == null) {
            collection = CollectionsKt.emptyList();
        }
        return collection;
    }

    @NotNull
    public static final <T> List<T> listOf(T ... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt.asList(elements) : CollectionsKt.emptyList();
    }

    @NotNull
    public static final IntRange getIndices(@NotNull Collection<?> $this$indices) {
        Intrinsics.checkNotNullParameter($this$indices, "<this>");
        return new IntRange(0, $this$indices.size() - 1);
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <T> List<T> MutableList(int size, Function1<? super Integer, ? extends T> init) {
        void var2_2;
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList<T> list = new ArrayList<T>(size);
        int n = 0;
        while (n < size) {
            int index = n++;
            boolean bl = false;
            list.add(init.invoke(index));
        }
        return (List)var2_2;
    }

    @NotNull
    public static final <T> List<T> optimizeReadOnlyList(@NotNull List<? extends T> $this$optimizeReadOnlyList) {
        List<T> list;
        Intrinsics.checkNotNullParameter($this$optimizeReadOnlyList, "<this>");
        switch ($this$optimizeReadOnlyList.size()) {
            case 0: {
                list = CollectionsKt.emptyList();
                break;
            }
            case 1: {
                list = CollectionsKt.listOf($this$optimizeReadOnlyList.get(0));
                break;
            }
            default: {
                list = $this$optimizeReadOnlyList;
            }
        }
        return list;
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(@NotNull List<? extends T> $this$binarySearchBy, @Nullable K key, int fromIndex, int toIndex, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$binarySearchBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$binarySearchBy = false;
        return CollectionsKt.binarySearch($this$binarySearchBy, fromIndex, toIndex, new Function1<T, Integer>(selector, key){
            final /* synthetic */ K $key;
            final /* synthetic */ Function1<T, K> $selector;

            @NotNull
            public final Integer invoke(T it) {
                return ComparisonsKt.compareValues((Comparable)this.$selector.invoke(it), this.$key);
            }
            {
                this.$selector = $selector;
                this.$key = $key;
                super(1);
            }
        });
    }

    @NotNull
    public static final <T> List<T> listOfNotNull(T ... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt.filterNotNull(elements);
    }

    public static /* synthetic */ int binarySearch$default(List list, int n, int n2, Function1 function1, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = list.size();
        }
        return CollectionsKt.binarySearch(list, n, n2, function1);
    }

    @InlineOnly
    private static final <T> boolean isNotEmpty(Collection<? extends T> $this$isNotEmpty) {
        Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
        return !$this$isNotEmpty.isEmpty();
    }

    public static /* synthetic */ int binarySearchBy$default(List $this$binarySearchBy_u24default, Comparable key, int fromIndex, int toIndex, Function1 selector, int n, Object object) {
        if ((n & 2) != 0) {
            fromIndex = 0;
        }
        if ((n & 4) != 0) {
            toIndex = $this$binarySearchBy_u24default.size();
        }
        Intrinsics.checkNotNullParameter($this$binarySearchBy_u24default, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$binarySearchBy = false;
        return CollectionsKt.binarySearch($this$binarySearchBy_u24default, fromIndex, toIndex, new /* invalid duplicate definition of identical inner class */);
    }

    @NotNull
    public static final <T> Collection<T> asCollection(@NotNull T[] $this$asCollection) {
        Intrinsics.checkNotNullParameter($this$asCollection, "<this>");
        return new ArrayAsCollection<T>($this$asCollection, false);
    }

    /*
     * WARNING - void declaration
     */
    public static final <T> int binarySearch(@NotNull List<? extends T> $this$binarySearch, int fromIndex, int toIndex, @NotNull Function1<? super T, Integer> comparison) {
        void var4_4;
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        CollectionsKt__CollectionsKt.rangeCheck$CollectionsKt__CollectionsKt($this$binarySearch.size(), fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex + -1;
        while (low <= high) {
            void var6_6;
            int mid = low + high >>> 1;
            T midVal = $this$binarySearch.get(mid);
            int cmp = ((Number)comparison.invoke(midVal)).intValue();
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var6_6;
        }
        return (int)(-(var4_4 + true));
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<? extends T> list = CollectionsKt.toMutableList($this$shuffled);
        List<? extends T> $this$shuffled_u24lambda_u244 = list;
        boolean bl = false;
        CollectionsKt.shuffle($this$shuffled_u24lambda_u244, random);
        return list;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.6")
    private static final <E> List<E> buildList(int capacity, @BuilderInference Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List list = CollectionsKt.createListBuilder(capacity);
        builderAction.invoke(list);
        return CollectionsKt.build(list);
    }

    @NotNull
    public static final <T> List<T> listOfNotNull(@Nullable T element) {
        T t = element;
        return t != null ? CollectionsKt.listOf(t) : CollectionsKt.emptyList();
    }

    @NotNull
    public static final <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    public static final <T> int getLastIndex(@NotNull List<? extends T> $this$lastIndex) {
        Intrinsics.checkNotNullParameter($this$lastIndex, "<this>");
        return $this$lastIndex.size() - 1;
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = list.size();
        }
        return CollectionsKt.binarySearch(list, comparable, n, n2);
    }

    @SinceKotlin(version="1.3")
    @PublishedApi
    public static final void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    public static final void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList();
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <T> boolean isNullOrEmpty(Collection<? extends T> $this$isNullOrEmpty) {
        return $this$isNullOrEmpty == null || $this$isNullOrEmpty.isEmpty();
    }

    @SinceKotlin(version="1.6")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> List<E> buildList(@BuilderInference Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List list = CollectionsKt.createListBuilder();
        builderAction.invoke(list);
        return CollectionsKt.build(list);
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final <T> List<T> List(int size, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList<T> arrayList = new ArrayList<T>(size);
        int n = 0;
        while (n < size) {
            int n2 = n++;
            arrayList.add(init.invoke(n2));
        }
        return arrayList;
    }

    @InlineOnly
    private static final <T> boolean containsAll(Collection<? extends T> $this$containsAll, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter($this$containsAll, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return $this$containsAll.containsAll(elements);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> T[] collectionToArrayCommonImpl(@NotNull Collection<?> collection, @NotNull T[] array) {
        void var2_2;
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        if (collection.isEmpty()) {
            return CollectionsKt.terminateCollectionToArray(0, array);
        }
        T[] destination = array.length < collection.size() ? ArraysKt.arrayOfNulls(array, collection.size()) : array;
        Iterator<?> iterator2 = collection.iterator();
        int index = 0;
        while (iterator2.hasNext()) {
            int n = index++;
            destination[n] = iterator2.next();
        }
        return CollectionsKt.terminateCollectionToArray(collection.size(), var2_2);
    }
}

