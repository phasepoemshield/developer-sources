/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.content.registry.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ImmutableCollectionUtils {
    public static <T> List<T> getAsMutableList(Supplier<List<T>> supplier, Consumer<List<T>> consumer) {
        List<T> list = supplier.get();
        if (!(list instanceof ArrayList)) {
            list = new ArrayList<T>(list);
            consumer.accept(list);
        }
        return list;
    }

    public static <K, V> Map<K, V> getAsMutableMap(Supplier<Map<K, V>> supplier, Consumer<Map<K, V>> consumer) {
        Map<K, V> map = supplier.get();
        if (!(map instanceof HashMap)) {
            map = new HashMap<K, V>(map);
            consumer.accept(map);
        }
        return map;
    }

    public static <T> Set<T> getAsMutableSet(Supplier<Set<T>> supplier, Consumer<Set<T>> consumer) {
        Set<T> set = supplier.get();
        if (!(set instanceof HashSet)) {
            set = new HashSet<T>(set);
            consumer.accept(set);
        }
        return set;
    }
}

