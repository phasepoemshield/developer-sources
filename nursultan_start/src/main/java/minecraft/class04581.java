/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public final class class04581 {
    private class04581() {
    }

    public static <T> boolean N(Map<T, Set<T>> map, Set<T> set, Set<T> set2, Consumer<T> consumer, T t) {
        if (set.contains(t)) {
            return false;
        }
        if (set2.contains(t)) {
            return true;
        }
        set2.add(t);
        for (Object e : (Set)map.getOrDefault(t, (Set<T>)ImmutableSet.of())) {
            if (!class04581.N(map, set, set2, consumer, e)) continue;
            return true;
        }
        set2.remove(t);
        set.add(t);
        consumer.accept(t);
        return false;
    }
}

