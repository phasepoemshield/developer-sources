/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000@\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001aF\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\b\nH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\b\nH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0011\u001a!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00122\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00122\u001a\u0010\u001d\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u001bj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001c2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001f"}, d2={"E", "", "builder", "", "build", "(Ljava/util/Set;)Ljava/util/Set;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildSetInternal", "(ILkotlin/jvm/functions/Function1;)Ljava/util/Set;", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Set;", "createSetBuilder", "()Ljava/util/Set;", "(I)Ljava/util/Set;", "T", "element", "setOf", "(Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "Ljava/util/TreeSet;", "sortedSetOf", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib"}, xs="kotlin/collections/SetsKt")
class SetsKt__SetsJVMKt {
    @SinceKotlin(version="1.3")
    @PublishedApi
    @NotNull
    public static final <E> Set<E> createSetBuilder(int capacity) {
        return new SetBuilder(capacity);
    }

    @NotNull
    public static final <T> TreeSet<T> sortedSetOf(@NotNull Comparator<? super T> comparator, T ... elements) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet)ArraysKt.toCollection(elements, (Collection)new TreeSet<T>(comparator));
    }

    @NotNull
    @PublishedApi
    @SinceKotlin(version="1.3")
    public static final <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    @NotNull
    public static final <T> Set<T> setOf(T element) {
        Set<T> set = Collections.singleton(element);
        Intrinsics.checkNotNullExpressionValue(set, "singleton(...)");
        return set;
    }

    @NotNull
    public static final <T> TreeSet<T> sortedSetOf(T ... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet)ArraysKt.toCollection(elements, (Collection)new TreeSet());
    }

    @PublishedApi
    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <E> Set<E> buildSetInternal(int capacity, Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set<E> set = SetsKt.createSetBuilder(capacity);
        builderAction.invoke(set);
        return SetsKt.build(set);
    }

    @SinceKotlin(version="1.3")
    @PublishedApi
    @NotNull
    public static final <E> Set<E> build(@NotNull Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((SetBuilder)builder).build();
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <E> Set<E> buildSetInternal(Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set<E> set = SetsKt.createSetBuilder();
        builderAction.invoke(set);
        return SetsKt.build(set);
    }
}

