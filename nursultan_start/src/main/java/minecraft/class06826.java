/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class04206
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class04206;
import minecraft.class06839;
import org.jspecify.annotations.Nullable;

public final class class06826 {
    public static final Codec<class06826> N = Codec.dispatchedMap((Codec)class04206.Nm.T(), class06839::B).xmap(class06826::N, class06826::u);
    private final Reference2ObjectMap<class06839<?>, Object> y;

    public int L() {
        return this.y.size();
    }

    public <T> @Nullable T L(class06839<T> class068392) {
        return (T)this.y.remove(class068392);
    }

    public class06826(Reference2ObjectMap<class06839<?>, Object> reference2ObjectMap) {
        this.y = reference2ObjectMap;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        class06826 class068262 = (class06826)object;
        return Objects.equals(this.y, class068262.y);
    }

    public String toString() {
        return this.y.toString();
    }

    public int hashCode() {
        return Objects.hash(this.y);
    }

    private Reference2ObjectMap<class06839<?>, Object> u() {
        return this.y;
    }

    public class06826 y(class06826 class068262) {
        class06826 class068263 = class06826.N(this);
        class068263.N(class068262, class068392 -> true);
        return class068263;
    }

    public <T> @Nullable T y(class06839<T> class068392) {
        return (T)this.y.get(class068392);
    }

    public Set<class06839<?>> y() {
        return this.y.keySet();
    }

    public boolean N(class06839<?> class068392) {
        return this.y.containsKey(class068392);
    }

    public static class06826 N(Stream<class06839<?>> stream) {
        Reference2ObjectOpenHashMap reference2ObjectOpenHashMap = new Reference2ObjectOpenHashMap();
        stream.forEach(class068392 -> reference2ObjectOpenHashMap.put(class068392, class068392.Z()));
        return new class06826((Reference2ObjectMap<class06839<?>, Object>)reference2ObjectOpenHashMap);
    }

    public static class06826 N(class06826 class068262) {
        return new class06826((Reference2ObjectMap<class06839<?>, Object>)new Reference2ObjectOpenHashMap(class068262.y));
    }

    private static class06826 N(Map<class06839<?>, Object> map) {
        return new class06826((Reference2ObjectMap<class06839<?>, Object>)new Reference2ObjectOpenHashMap(map));
    }

    public static class06826 N() {
        return new class06826((Reference2ObjectMap<class06839<?>, Object>)new Reference2ObjectOpenHashMap());
    }

    public void N(class06826 class068262, Predicate<class06839<?>> predicate) {
        for (class06839<?> var4 : class068262.y()) {
            if (!predicate.test(var4)) continue;
            class06826.N(class068262, var4, this);
        }
    }

    private static <T> void N(class06826 class068262, class06839<T> class068392, class06826 class068263) {
        class068263.N(class068392, Objects.requireNonNull(class068262.y(class068392)));
    }

    public <T> void N(class06839<T> class068392, T t) {
        this.y.put(class068392, t);
    }
}

