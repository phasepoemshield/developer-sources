/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class03195;
import minecraft.class03198;
import minecraft.class03200;
import minecraft.class03211;
import minecraft.class03229;
import minecraft.class03231;
import minecraft.class03235;
import org.jspecify.annotations.Nullable;

public final class class03197<T> {
    private static final int N = 6;
    private final class03235<T> y;
    private final ThreadLocal<@Nullable class03211<T>> L = new ThreadLocal();

    private static <T> List<class03198<T>> L(List<? extends class03235<T>> list) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        int n = (int)Math.pow(6.0, Math.floor(Math.log((double)list.size() - 0.01) / Math.log(6.0)));
        for (class03235<T> class032352 : list) {
            arrayList2.add(class032352);
            if (arrayList2.size() < n) continue;
            arrayList.add(new class03198(arrayList2));
            arrayList2 = Lists.newArrayList();
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new class03198(arrayList2));
        }
        return arrayList;
    }

    private class03197(class03235<T> class032352) {
        this.y = class032352;
    }

    static <T> List<class03195> y(List<? extends class03235<T>> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
        }
        int n = 7;
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < 7; ++i) {
            arrayList.add(null);
        }
        for (class03235<T> class032352 : list) {
            for (int i = 0; i < 7; ++i) {
                arrayList.set(i, class032352.y[i].y((class03195)((Object)arrayList.get(i))));
            }
        }
        return arrayList;
    }

    public T N(class03231 class032312, class03200<T> class032002) {
        long[] lArray = class032312.N();
        class03211<T> class032112 = this.y.N(lArray, this.L.get(), class032002);
        this.L.set(class032112);
        return class032112.N;
    }

    public static <T> class03197<T> N(List<Pair<class03229, T>> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
        }
        int n = ((class03229)((Object)list.get(0).getFirst())).N().size();
        if (n != 7) {
            throw new IllegalStateException("Expecting parameter space to be 7, got " + n);
        }
        List list2 = list.stream().map(pair -> new class03211<Object>((class03229)((Object)((Object)pair.getFirst())), pair.getSecond())).collect(Collectors.toCollection(ArrayList::new));
        return new class03197<T>(class03197.N(n, list2));
    }

    private static <T> class03235<T> N(int n, List<? extends class03235<T>> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() <= 6) {
            list.sort(Comparator.comparingLong(class032352 -> {
                long l = 0L;
                for (int i = 0; i < n; ++i) {
                    class03195 class031952 = class032352.y[i];
                    l += Math.abs((class031952.N() + class031952.y()) / 2L);
                }
                return l;
            }));
            return new class03198(list);
        }
        long l = Long.MAX_VALUE;
        int n2 = -1;
        List<class03198<T>> list2 = null;
        for (int i = 0; i < n; ++i) {
            class03197.N(list, n, i, false);
            List<class03198<T>> list3 = class03197.L(list);
            long l2 = 0L;
            for (class03198<T> class031983 : list3) {
                l2 += class03197.N(class031983.y);
            }
            if (l <= l2) continue;
            l = l2;
            n2 = i;
            list2 = list3;
        }
        class03197.N(list2, n, n2, true);
        return new class03198(list2.stream().map(class031982 -> class03197.N(n, Arrays.asList(class031982.N))).collect(Collectors.toList()));
    }

    private static <T> void N(List<? extends class03235<T>> list, int n, int n2, boolean bl) {
        Comparator<class03235<class03235<T>>> comparator = class03197.N(n2, bl);
        for (int i = 1; i < n; ++i) {
            comparator = comparator.thenComparing(class03197.N((n2 + i) % n, bl));
        }
        list.sort(comparator);
    }

    private static <T> Comparator<class03235<T>> N(int n, boolean bl) {
        return Comparator.comparingLong(class032352 -> {
            class03195 class031952 = class032352.y[n];
            long l = (class031952.N() + class031952.y()) / 2L;
            return bl ? Math.abs(l) : l;
        });
    }

    private static long N(class03195[] class03195Array) {
        long l = 0L;
        for (class03195 class031952 : class03195Array) {
            l += Math.abs(class031952.y() - class031952.N());
        }
        return l;
    }
}

