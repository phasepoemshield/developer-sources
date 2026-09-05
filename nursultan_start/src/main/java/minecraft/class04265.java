/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Streams
 *  minecraft.class00201
 *  minecraft.class00225
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05498
 *  minecraft.class05513
 *  minecraft.class05531
 *  minecraft.class06993
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class00225;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04272;
import minecraft.class04274;
import minecraft.class04782;
import minecraft.class05498;
import minecraft.class05513;
import minecraft.class05531;
import minecraft.class06993;

public class class04265 {
    private static final int y = 50;
    public static final class04274 N = (class035292, class047822) -> Stream.of(new class05513(class035292, class06993.field_11467, class047822, class04272.N()));

    public static class05498 N() {
        return class04265.N(50);
    }

    public static class05498 N(int n) {
        return collection -> collection.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(class055132 -> class055132.t().u())).entrySet().stream().flatMap(entry -> {
            class03556 class035562 = (class03556)entry.getKey();
            return Streams.mapWithIndex(Lists.partition((List)((List)entry.getValue()), (int)n).stream(), (list, l) -> class04265.N(List.copyOf(list), (class03556<class00225>)class035562, (int)l));
        }).toList();
    }

    public static class05531 N(Collection<class05513> collection, class03556<class00225> class035562, int n) {
        return new class05531(n, collection, class035562);
    }

    public static List<class05531> N(Collection<class03529<class00201>> collection, class04274 class042742, class04782 class047822) {
        return collection.stream().flatMap(class035292 -> class042742.decorate((class03529<class00201>)class035292, class047822)).collect(Collectors.groupingBy(class055132 -> class055132.t().u())).entrySet().stream().flatMap(entry -> {
            class03556 class035562 = (class03556)entry.getKey();
            return Streams.mapWithIndex(Lists.partition((List)((List)entry.getValue()), (int)50).stream(), (list, l) -> class04265.N(list, (class03556<class00225>)class035562, (int)l));
        }).toList();
    }
}

