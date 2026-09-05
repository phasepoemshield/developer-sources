/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00442
 *  minecraft.class06986
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import minecraft.class00442;
import minecraft.class06986;
import org.jspecify.annotations.Nullable;

class class06976<K, V> {
    private final Map<K, class06986<V>> N = new HashMap<K, class06986<V>>();

    class06976() {
    }

    public @Nullable V y(K k) {
        class06986<V> class069862 = this.N.get(k);
        return (V)(class069862 != null ? class069862.N() : null);
    }

    public void y(Predicate<K> predicate) {
        this.N.keySet().removeIf(predicate);
    }

    public void N(BiConsumer<K, V> biConsumer) {
        this.N.forEach((object, class069862) -> biConsumer.accept(object, class069862.N()));
    }

    public void N(long l, K k, class00442<V> class004422) {
        if (class004422.y().isPresent()) {
            this.N.put(k, new class06986(class004422.y().get(), l + (long)class004422.N().L()));
        } else {
            this.N.remove(k);
        }
    }

    public void N(Predicate<class06986<V>> predicate) {
        this.N.values().removeIf(predicate);
    }

    public void N(K k) {
        this.N.remove(k);
    }
}

