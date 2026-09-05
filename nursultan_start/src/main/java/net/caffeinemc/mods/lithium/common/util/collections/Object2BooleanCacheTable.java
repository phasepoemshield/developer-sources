/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  minecraft.class04995
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.HashCommon;
import java.util.function.Predicate;
import minecraft.class04995;
import net.caffeinemc.mods.lithium.common.util.collections.Object2BooleanCacheTable$Node;

public final class Object2BooleanCacheTable<T> {
    private final int mask;
    private final Object2BooleanCacheTable$Node<T>[] nodes;
    private final Predicate<T> operator;

    public Object2BooleanCacheTable(int n, Predicate<T> predicate) {
        int n2 = class04995.L((int)n);
        this.mask = n2 - 1;
        this.nodes = new Object2BooleanCacheTable$Node[n2];
        this.operator = predicate;
    }

    public boolean get(T t) {
        int n = Object2BooleanCacheTable.hash(t) & this.mask;
        Object2BooleanCacheTable$Node<T> object2BooleanCacheTable$Node = this.nodes[n];
        if (object2BooleanCacheTable$Node != null && t.equals(object2BooleanCacheTable$Node.key)) {
            return object2BooleanCacheTable$Node.value;
        }
        boolean bl = this.operator.test(t);
        this.nodes[n] = new Object2BooleanCacheTable$Node<T>(t, bl);
        return bl;
    }

    private static <T> int hash(T t) {
        return HashCommon.mix((int)t.hashCode());
    }
}

