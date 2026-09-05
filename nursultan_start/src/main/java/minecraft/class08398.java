/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

final class class08398<K, U, V>
extends Record {
    private final BiFunction<K, U, V> operation;
    private final @Nullable Object[] keys;
    private final @Nullable Object[] values;

    private @Nullable V L(int n) {
        return (V)this.values[n];
    }

    public @Nullable Object[] L() {
        return this.keys;
    }

    public class08398(BiFunction<K, U, V> biFunction, int n) {
        this(biFunction, new Object[n], new Object[n]);
    }

    private class08398(BiFunction<K, U, V> biFunction, @Nullable Object[] objectArray, @Nullable Object[] objectArray2) {
        this.operation = biFunction;
        this.keys = objectArray;
        this.values = objectArray2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08398.class, "operation;keys;values", "operation", "keys", "values"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08398.class, "operation;keys;values", "operation", "keys", "values"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08398.class, "operation;keys;values", "operation", "keys", "values"}, this);
    }

    public @Nullable Object[] u() {
        return this.values;
    }

    private @Nullable U u(int n) {
        return (U)this.values[n];
    }

    public BiFunction<K, U, V> y() {
        return this.operation;
    }

    private @Nullable K y(int n) {
        return (K)this.keys[n];
    }

    public void N(int n, K k, U u) {
        this.keys[n] = k;
        this.values[n] = u;
    }

    public void N(int n, Map<K, V> map) {
        V v = this.L(n);
        if (v != null) {
            K k = this.y(n);
            map.put(k, v);
        }
    }

    public int N() {
        return this.keys.length;
    }

    public void N(int n) {
        this.values[n] = this.operation.apply(this.y(n), this.u(n));
    }
}

