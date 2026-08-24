/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0010*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, d2={"T", "Lkotlin/Function0;", "", "iterator", "", "Iterable", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Iterable;", "", "default", "collectionSizeOrDefault", "(Ljava/lang/Iterable;I)I", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "", "flatten", "(Ljava/lang/Iterable;)Ljava/util/List;", "R", "Lkotlin/Pair;", "unzip", "(Ljava/lang/Iterable;)Lkotlin/Pair;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__IterablesKt
extends CollectionsKt__CollectionsKt {
    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> List<T> flatten(@NotNull Iterable<? extends Iterable<? extends T>> $this$flatten) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$flatten, "<this>");
        ArrayList result = new ArrayList();
        Iterator<Iterable<T>> iterator2 = $this$flatten.iterator();
        while (iterator2.hasNext()) {
            Iterable<? extends T> element = iterator2.next();
            CollectionsKt.addAll((Collection)result, element);
        }
        return (List)var1_1;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> $this$unzip) {
        Intrinsics.checkNotNullParameter($this$unzip, "<this>");
        int expectedSize = CollectionsKt.collectionSizeOrDefault($this$unzip, 10);
        ArrayList<T> listT = new ArrayList<T>(expectedSize);
        ArrayList<R> listR = new ArrayList<R>(expectedSize);
        for (Pair<T, R> pair : $this$unzip) {
            listT.add(pair.getFirst());
            listR.add(pair.getSecond());
        }
        return TuplesKt.to(listT, listR);
    }

    @InlineOnly
    private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> iterator2) {
        Intrinsics.checkNotNullParameter(iterator2, "iterator");
        return new Iterable<T>(iterator2){
            final /* synthetic */ Function0<Iterator<T>> $iterator;

            @NotNull
            public Iterator<T> iterator() {
                return this.$iterator.invoke();
            }
            {
                this.$iterator = $iterator;
            }
        };
    }

    @PublishedApi
    @Nullable
    public static final <T> Integer collectionSizeOrNull(@NotNull Iterable<? extends T> $this$collectionSizeOrNull) {
        Intrinsics.checkNotNullParameter($this$collectionSizeOrNull, "<this>");
        return $this$collectionSizeOrNull instanceof Collection ? Integer.valueOf(((Collection)$this$collectionSizeOrNull).size()) : null;
    }

    @PublishedApi
    public static final <T> int collectionSizeOrDefault(@NotNull Iterable<? extends T> $this$collectionSizeOrDefault, int n) {
        Intrinsics.checkNotNullParameter($this$collectionSizeOrDefault, "<this>");
        return $this$collectionSizeOrDefault instanceof Collection ? ((Collection)$this$collectionSizeOrDefault).size() : n;
    }
}

