/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09297
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 */
package Nursultan;

import Nursultan.class09297;
import Nursultan.class11951;
import Nursultan.class11961;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11943<T extends class09297> {
    public Object N_0;
    public Object N_1;

    class11943() {
        this.u();
        this.N_0 = (Object2IntMap)this.N(new Object2IntOpenHashMap(), object2IntOpenHashMap -> object2IntOpenHashMap.defaultReturnValue(-1));
        this.N_1 = new Int2ObjectOpenHashMap();
    }

    private void u() {
    }

    public <P extends class11951<T>> class11943<T> N(int n, Class<P> clazz, Supplier<P> supplier) {
        return this.N(n, clazz, supplier, 15);
    }

    public ObjectSet<Class<? extends class11951<T>>> N() {
        return ((Object2IntMap)this.N_0).keySet();
    }

    public boolean N(Class<?> clazz, int n) {
        int n2 = ((Object2IntMap)this.N_0).getInt(clazz);
        if (n2 == -1) {
            return false;
        }
        return ((class11961)((Object)((Int2ObjectMap)this.N_1).get(n2))).y(n);
    }

    public Integer N(Class<?> clazz) {
        int n = ((Object2IntMap)this.N_0).getInt(clazz);
        return n == -1 ? null : Integer.valueOf(n);
    }

    public class11951<?> N(int n, int n2) {
        class11961 class119612 = (class11961)((Object)((Int2ObjectMap)this.N_1).get(n));
        if (class119612 == null || !class119612.y(n2)) {
            return null;
        }
        return class119612.N().get();
    }

    public <R> R N(R r, Consumer<R> consumer) {
        consumer.accept(r);
        return r;
    }

    public <P extends class11951<T>> class11943<T> N(int n, Class<P> clazz, Supplier<P> supplier, int n2) {
        return this.N(n, clazz, supplier, n2, Integer.MAX_VALUE);
    }

    public <P extends class11951<T>> class11943<T> N(int n, Class<P> clazz, Supplier<P> supplier, int n2, int n3) {
        if (((Int2ObjectMap)this.N_1).containsKey(n)) {
            throw new IllegalArgumentException("Packet id " + n + " is already registered");
        }
        int n4 = ((Object2IntMap)this.N_0).put(clazz, n);
        if (n4 != -1) {
            throw new IllegalArgumentException("Packet " + String.valueOf(clazz) + " is already registered to ID " + n4);
        }
        ((Int2ObjectMap)this.N_1).put(n, (Object)new class11961(supplier, n2, n3));
        return this;
    }
}

