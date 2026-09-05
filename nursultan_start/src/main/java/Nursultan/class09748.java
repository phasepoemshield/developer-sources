/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09729;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

final class class09748
extends Record
implements class09729 {
    private final Map<Long, Integer> pairs;

    class09748(Map<Long, Integer> map) {
        this.pairs = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09748.class, "pairs", "pairs"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09748.class, "pairs", "pairs"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09748.class, "pairs", "pairs"}, this);
    }

    @Override
    public int N(int n, int n2) {
        Integer n3 = this.pairs.get((long)n << 32 | (long)n2 & 0xFFFFFFFFL);
        return n3 == null ? Integer.MIN_VALUE : n3;
    }

    public Map<Long, Integer> N() {
        return this.pairs;
    }
}

