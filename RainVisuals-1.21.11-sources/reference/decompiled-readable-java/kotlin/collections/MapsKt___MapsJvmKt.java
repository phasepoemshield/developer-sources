/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000&\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001ap\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\f\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\u000bH\u0087\b\u00a2\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\t\u001ao\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\f\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\u000bH\u0007\u00a2\u0006\u0004\b\u0010\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0011"}, d2={"K", "V", "", "R", "", "Lkotlin/Function1;", "", "selector", "maxBy", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map$Entry;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/Map$Entry;", "minBy", "minWith", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt___MapsJvmKt
extends MapsKt__MapsKt {
    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @InlineOnly
    private static final /* synthetic */ <K, V> Map.Entry<K, V> maxWith(Map<? extends K, ? extends V> $this$maxWith, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.maxWithOrNull((Iterable)$this$maxWith.entrySet(), comparator);
    }

    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @InlineOnly
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxBy(Map<? extends K, ? extends V> $this$maxBy, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Object v0;
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterable iterable = $this$maxBy.entrySet();
        Iterator iterator2 = iterable.iterator();
        if (!iterator2.hasNext()) {
            v0 = null;
        } else {
            Object t = iterator2.next();
            if (!iterator2.hasNext()) {
                v0 = t;
            } else {
                Comparable comparable = (Comparable)selector.invoke((Map.Entry<K, V>)t);
                do {
                    Object t2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)selector.invoke((Map.Entry<K, V>)(t2 = iterator2.next()))) >= 0) continue;
                    t = t2;
                    comparable = comparable2;
                } while (iterator2.hasNext());
                v0 = t;
            }
        }
        return v0;
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minBy(Map<? extends K, ? extends V> $this$minBy, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Object v0;
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$minBy = false;
        Iterable iterable = $this$minBy.entrySet();
        Iterator iterator2 = iterable.iterator();
        if (!iterator2.hasNext()) {
            v0 = null;
        } else {
            Object t = iterator2.next();
            if (!iterator2.hasNext()) {
                v0 = t;
            } else {
                Comparable comparable = (Comparable)selector.invoke((Map.Entry<K, V>)t);
                do {
                    Object t2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)selector.invoke((Map.Entry<K, V>)(t2 = iterator2.next()))) <= 0) continue;
                    t = t2;
                    comparable = comparable2;
                } while (iterator2.hasNext());
                v0 = t;
            }
        }
        return v0;
    }

    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    public static final /* synthetic */ Map.Entry minWith(Map $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry)CollectionsKt.minWithOrNull($this$minWith.entrySet(), comparator);
    }
}

