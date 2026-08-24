/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.Grouping;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\u001a7\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001aa\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u00020\nH\u0081\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000f"}, d2={"T", "K", "Lkotlin/collections/Grouping;", "", "", "eachCount", "(Lkotlin/collections/Grouping;)Ljava/util/Map;", "V", "R", "", "Lkotlin/Function1;", "", "f", "mapValuesInPlace", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "kotlin-stdlib"}, xs="kotlin/collections/GroupingKt")
class GroupingKt__GroupingJVMKt {
    @InlineOnly
    @PublishedApi
    private static final <K, V, R> Map<K, R> mapValuesInPlace(Map<K, V> $this$mapValuesInPlace, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> f) {
        Map<K, V> map;
        Intrinsics.checkNotNullParameter($this$mapValuesInPlace, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        Iterable $this$forEach$iv = $this$mapValuesInPlace.entrySet();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Map.Entry it = (Map.Entry)element$iv;
            boolean bl = false;
            Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            TypeIntrinsics.asMutableMapEntry(it).setValue(f.invoke(it));
        }
        return TypeIntrinsics.asMutableMap(map);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> eachCount(@NotNull Grouping<T, ? extends K> $this$eachCount) {
        Intrinsics.checkNotNullParameter($this$eachCount, "<this>");
        var1_1 = $this$eachCount;
        destination$iv = new LinkedHashMap<K, V>();
        $i$f$foldTo = false;
        $this$aggregateTo$iv$iv = $this$foldTo$iv;
        $i$f$aggregateTo = false;
        var6_8 = $this$aggregateTo$iv$iv.sourceIterator();
        while (var6_8.hasNext()) {
            e$iv$iv = var6_8.next();
            key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            accumulator$iv$iv = destination$iv.get(key$iv$iv);
            if (accumulator$iv$iv != null) ** GOTO lbl-1000
            if (!destination$iv.containsKey(key$iv$iv)) {
                v0 = true;
            } else lbl-1000:
            // 2 sources

            {
                v0 = false;
            }
            var10_13 = v0;
            var11_14 = e$iv$iv;
            acc$iv = accumulator$iv$iv;
            key$iv = key$iv$iv;
            var14_17 = key$iv$iv;
            var15_18 = destination$iv;
            $i$a$-aggregateTo-GroupingKt__GroupingKt$foldTo$1$iv = false;
            v1 /* !! */  = key$iv;
            if (first$iv != false) {
                var24_27 = v1 /* !! */ ;
                var19_22 = false;
                v2 /* !! */  = new Ref.IntRef();
                v1 /* !! */  = var24_27;
            } else {
                v2 /* !! */  = acc$iv;
            }
            acc = (Ref.IntRef)v2 /* !! */ ;
            $i$a$-foldTo-GroupingKt__GroupingJVMKt$eachCount$2 = false;
            $this$eachCount_u24lambda_u242_u24lambda_u241 = var21_24 = acc;
            $i$a$-apply-GroupingKt__GroupingJVMKt$eachCount$2$1 = false;
            $this$eachCount_u24lambda_u242_u24lambda_u241.element = var22_25.element + 1;
            var18_21 = var21_24;
            var15_18.put(var14_17, var18_21);
        }
        var1_1 = var2_2;
        var2_2 = var1_1.entrySet();
        var3_4 = var2_2.iterator();
        while (var3_4.hasNext()) {
            var4_5 = (Map.Entry)var3_4.next();
            Intrinsics.checkNotNull(var4_5, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            it = var4_5;
            var24_27 = TypeIntrinsics.asMutableMapEntry(var4_5);
            var6_9 = false;
            var24_27.setValue(((Ref.IntRef)var5_7.getValue()).element);
        }
        return TypeIntrinsics.asMutableMap(var1_1);
    }
}

