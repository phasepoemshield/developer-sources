/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  minecraft.class03511
 */
package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import minecraft.class03511;

public class class03495<K, V extends class03511<K>> {
    private final Map<K, V> N = new HashMap();

    private static /* synthetic */ void y(Multimap multimap, Object object, class03511 class035112) {
        class035112.N(object2 -> class03495.y(multimap, object, object2));
    }

    private static <K> void y(Multimap<K, K> multimap, K k, K k2) {
        if (!class03495.N(multimap, k, k2)) {
            multimap.put(k, k2);
        }
    }

    private void N(Multimap<K, K> multimap, Set<K> set, K k, BiConsumer<K, V> biConsumer) {
        if (!set.add(k)) {
            return;
        }
        multimap.get(k).forEach(object -> this.N(multimap, set, object, biConsumer));
        class03511 class035112 = (class03511)this.N.get(k);
        if (class035112 != null) {
            biConsumer.accept(k, class035112);
        }
    }

    private /* synthetic */ void N(Multimap multimap, Set set, BiConsumer biConsumer, Object object) {
        this.N(multimap, set, object, biConsumer);
    }

    public class03495<K, V> N(K k, V v) {
        this.N.put(k, v);
        return this;
    }

    private static <K> boolean N(Multimap<K, K> multimap, K k, K k2) {
        Collection collection = multimap.get(k2);
        if (collection.contains(k)) {
            return true;
        }
        return collection.stream().anyMatch(object2 -> class03495.N(multimap, k, object2));
    }

    private static /* synthetic */ void N(Multimap multimap, Object object, class03511 class035112) {
        class035112.y(object2 -> class03495.y(multimap, object, object2));
    }

    public void N(BiConsumer<K, V> biConsumer) {
        HashMultimap hashMultimap = HashMultimap.create();
        this.N.forEach((arg_0, arg_1) -> class03495.y((Multimap)hashMultimap, arg_0, arg_1));
        this.N.forEach((arg_0, arg_1) -> class03495.N((Multimap)hashMultimap, arg_0, arg_1));
        HashSet hashSet = new HashSet();
        this.N.keySet().forEach(arg_0 -> this.N((Multimap)hashMultimap, hashSet, biConsumer, arg_0));
    }
}

