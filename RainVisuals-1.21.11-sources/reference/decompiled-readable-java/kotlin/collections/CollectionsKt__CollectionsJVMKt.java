/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000X\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001aF\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\b\nH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\b\nH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\u000e\u001a\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0081\b\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0081\b\u00a2\u0006\u0004\b\u0013\u0010\u0011\u001a$\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0081\b\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u001a2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0081\b\u00a2\u0006\u0004\b\u0018\u0010\u001c\u001a\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001f\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u001a2\u0006\u0010 \u001a\u00028\u0000\u00a2\u0006\u0004\b!\u0010\"\u001a1\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u001a2\u0006\u0010#\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000\u00a2\u0006\u0004\b$\u0010%\u001a3\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\b\u0000\u0010\u001a*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00162\u0006\u0010'\u001a\u00020&H\u0000\u00a2\u0006\u0004\b(\u0010)\u001a%\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000*H\u0007\u00a2\u0006\u0004\b+\u0010,\u001a-\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010.\u001a\u00020-H\u0007\u00a2\u0006\u0004\b+\u0010/\u001a&\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u000000H\u0087\b\u00a2\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00063"}, d2={"E", "", "builder", "", "build", "(Ljava/util/List;)Ljava/util/List;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildListInternal", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "count", "checkCountOverflow", "(I)I", "index", "checkIndexOverflow", "", "collection", "", "", "collectionToArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "()Ljava/util/List;", "(I)Ljava/util/List;", "element", "listOf", "(Ljava/lang/Object;)Ljava/util/List;", "collectionSize", "terminateCollectionToArray", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "copyToArrayOfAny", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "", "shuffled", "(Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/util/Random;", "random", "(Ljava/lang/Iterable;Ljava/util/Random;)Ljava/util/List;", "Ljava/util/Enumeration;", "toList", "(Ljava/util/Enumeration;)Ljava/util/List;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsJVMKt {
    @SinceKotlin(version="1.2")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled) {
        List<T> list;
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        List<T> $this$shuffled_u24lambda_u240 = list = CollectionsKt.toMutableList($this$shuffled);
        boolean bl = false;
        Collections.shuffle($this$shuffled_u24lambda_u240);
        return list;
    }

    @NotNull
    public static final <T> List<T> listOf(T element) {
        List<T> list = Collections.singletonList(element);
        Intrinsics.checkNotNullExpressionValue(list, "singletonList(...)");
        return list;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> T[] terminateCollectionToArray(int collectionSize, @NotNull T[] array) {
        void var1_1;
        Intrinsics.checkNotNullParameter(array, "array");
        if (collectionSize < array.length) {
            array[collectionSize] = null;
        }
        return var1_1;
    }

    @NotNull
    @SinceKotlin(version="1.2")
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<? extends T> list = CollectionsKt.toMutableList($this$shuffled);
        List<? extends T> $this$shuffled_u24lambda_u241 = list;
        boolean bl = false;
        Collections.shuffle($this$shuffled_u24lambda_u241, random);
        return list;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    @PublishedApi
    private static final int checkCountOverflow(int count) {
        int n;
        if (count < 0) {
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                CollectionsKt.throwCountOverflow();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return n;
    }

    @NotNull
    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] $this$copyToArrayOfAny, boolean isVarargs) {
        Object[] objectArray;
        Intrinsics.checkNotNullParameter($this$copyToArrayOfAny, "<this>");
        if (isVarargs && Intrinsics.areEqual($this$copyToArrayOfAny.getClass(), Object[].class)) {
            objectArray = $this$copyToArrayOfAny;
        } else {
            T[] TArray = Arrays.copyOf($this$copyToArrayOfAny, $this$copyToArrayOfAny.length, Object[].class);
            objectArray = TArray;
            Intrinsics.checkNotNullExpressionValue(TArray, "copyOf(...)");
        }
        return objectArray;
    }

    @InlineOnly
    private static final <T> List<T> toList(Enumeration<T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        ArrayList<T> arrayList = Collections.list($this$toList);
        Intrinsics.checkNotNullExpressionValue(arrayList, "list(...)");
        return arrayList;
    }

    @SinceKotlin(version="1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List<E> list = CollectionsKt.createListBuilder();
        builderAction.invoke(list);
        return CollectionsKt.build(list);
    }

    @NotNull
    @PublishedApi
    @SinceKotlin(version="1.3")
    public static final <E> List<E> createListBuilder(int capacity) {
        return new ListBuilder(capacity);
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    @PublishedApi
    private static final int checkIndexOverflow(int index) {
        int n;
        if (index < 0) {
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                CollectionsKt.throwIndexOverflow();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return n;
    }

    @NotNull
    @PublishedApi
    @SinceKotlin(version="1.3")
    public static final <E> List<E> build(@NotNull List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder)builder).build();
    }

    @InlineOnly
    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return CollectionToArray.toArray(collection);
    }

    @SinceKotlin(version="1.3")
    @PublishedApi
    @NotNull
    public static final <E> List<E> createListBuilder() {
        return new ListBuilder();
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <E> List<E> buildListInternal(int capacity, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List<E> list = CollectionsKt.createListBuilder(capacity);
        builderAction.invoke(list);
        return CollectionsKt.build(list);
    }

    @InlineOnly
    private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(collection, array);
    }
}

