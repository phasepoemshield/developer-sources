/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08019
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class01894;
import minecraft.class08019;

final class class01709
extends Record {
    private final Map<class01894, class08019> map;
    public static final Codec<class01709> N = Codec.unboundedMap((Codec)class01894.N, (Codec)class08019.N).xmap(class01709::new, class01709::N);

    class01709(Map<class01894, class08019> map) {
        this.map = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01709.class, "map", "map"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01709.class, "map", "map"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01709.class, "map", "map"}, this);
    }

    public Map<class01894, class08019> N() {
        return this.map;
    }

    public void N(BiConsumer<class01894, class08019> biConsumer) {
        this.map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> biConsumer.accept((class01894)entry.getKey(), (class08019)entry.getValue()));
    }
}

