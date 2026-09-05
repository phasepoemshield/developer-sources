/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09819
 */
package Nursultan;

import Nursultan.class09819;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class class11740<K, V>
implements class09819 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;
    public static Object y_0;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = false;
        }
    }

    public class11740(float f) {
        this.M();
        this.N_0 = new LinkedHashMap();
        this.N_1 = new HashMap();
        this.N_2 = Float.valueOf(f);
    }

    static {
        class11740.i();
    }

    private static void i() {
        y_0 = 180L;
    }

    public boolean N(boolean bl) {
        boolean bl2 = (Boolean)this.N_3;
        this.N_3 = bl;
        return bl2;
    }

    public boolean N(K k) {
        return ((Map)this.N_1).containsKey(k);
    }

    public float N(boolean bl, float f) {
        if (bl) {
            this.N_2 = Float.valueOf(f);
        }
        return ((Float)this.N_2).floatValue();
    }

    public boolean N() {
        return !((Map)this.N_1).isEmpty();
    }

    public List<V> N(List<V> list, Function<V, K> function) {
        long l = System.currentTimeMillis();
        HashSet<K> hashSet = new HashSet<K>();
        for (Object object2 : list) {
            K k = function.apply(object2);
            hashSet.add(k);
            ((Map)this.N_0).put(k, object2);
            ((Map)this.N_1).remove(k);
        }
        for (Object object2 : ((Map)this.N_0).keySet()) {
            if (hashSet.contains(object2)) continue;
            ((Map)this.N_1).putIfAbsent(object2, l);
        }
        ((Map)this.N_0).keySet().removeIf(object -> {
            Long l2 = (Long)((Map)this.N_1).get(object);
            if (l2 == null || l - l2 < 180L) {
                return false;
            }
            ((Map)this.N_1).remove(object);
            return true;
        });
        return List.copyOf(((Map)this.N_0).values());
    }

    public boolean N(float f) {
        return true;
    }
}

