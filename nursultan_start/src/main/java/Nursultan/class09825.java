/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02477
 *  minecraft.class02480
 *  minecraft.class02695
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.google.common.collect.Iterators;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.Set;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public final class class09825
extends Record
implements class02695 {
    private final Reference2ObjectMap<class02477<?>, Object> map;

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        return (T)this.map.get(class024772);
    }

    public class09825(Reference2ObjectMap<class02477<?>, Object> reference2ObjectMap) {
        this.map = reference2ObjectMap;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09825.class, "map", "map"}, this, object);
    }

    public String toString() {
        return this.map.toString();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09825.class, "map", "map"}, this);
    }

    public Iterator<class02480<?>> iterator() {
        return Iterators.transform((Iterator)Reference2ObjectMaps.fastIterator(this.map), class02480::N);
    }

    public int u() {
        return this.map.size();
    }

    public Set<class02477<?>> y() {
        return this.map.keySet();
    }

    public boolean N(class02477<?> class024772) {
        return this.map.containsKey(class024772);
    }

    public Reference2ObjectMap<class02477<?>, Object> R() {
        return this.map;
    }
}

