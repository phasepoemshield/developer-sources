/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05946
 */
package minecraft;

import minecraft.class05946;

@FunctionalInterface
public interface class08216<T, V> {
    public V get(class05946<T> var1);

    public static <T, V> class08216<T, V> N(V v) {
        return class059462 -> v;
    }
}

