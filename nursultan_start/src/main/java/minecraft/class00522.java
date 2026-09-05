/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09956
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  minecraft.class00478
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09956;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00478;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public abstract class class00522<O, S> {
    public static final String y = "Name";
    public static final String L = "Properties";
    private static final Function<Map.Entry<class08092<?>, Comparable<?>>, String> N = new class00478();
    protected final O u;
    @class09956(N="values", y="field_24738")
    public final Reference2ObjectArrayMap<class08092<?>, Comparable<?>> i;
    private Map<class08092<?>, S[]> M;
    protected final MapCodec<S> R;

    public <T extends Comparable<T>> T L(class08092<T> class080922) {
        Comparable comparable = (Comparable)this.i.get(class080922);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot get property " + String.valueOf(class080922) + " as it does not exist in " + String.valueOf(this.u));
        }
        return (T)((Comparable)class080922.M().cast(comparable));
    }

    public Map<class08092<?>, Comparable<?>> L() {
        return this.i;
    }

    public <T extends Comparable<T>, V extends T> S L(class08092<T> class080922, V v) {
        Comparable comparable = (Comparable)this.i.get(class080922);
        if (comparable == null) {
            return (S)this;
        }
        return this.N(class080922, v, comparable);
    }

    public class00522(O o, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> reference2ObjectArrayMap, MapCodec<S> mapCodec) {
        this.u = o;
        this.i = reference2ObjectArrayMap;
        this.R = mapCodec;
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.u);
        if (!this.L().isEmpty()) {
            stringBuilder.append('[');
            stringBuilder.append(this.L().entrySet().stream().map(N).collect(Collectors.joining(",")));
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        return super.hashCode();
    }

    private <T extends Comparable<T>> @Nullable T i(class08092<T> class080922) {
        Comparable comparable = (Comparable)this.i.get(class080922);
        if (comparable == null) {
            return null;
        }
        return (T)((Comparable)class080922.M().cast(comparable));
    }

    private Map<class08092<?>, Comparable<?>> u(class08092<?> class080922, Comparable<?> comparable) {
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(this.i);
        reference2ObjectArrayMap.put(class080922, comparable);
        return reference2ObjectArrayMap;
    }

    public <T extends Comparable<T>> Optional<T> u(class08092<T> class080922) {
        return Optional.ofNullable(this.i(class080922));
    }

    public <T extends Comparable<T>, V extends T> S y(class08092<T> class080922, V v) {
        Comparable comparable = (Comparable)this.i.get(class080922);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot set property " + String.valueOf(class080922) + " as it does not exist in " + String.valueOf(this.u));
        }
        return this.N(class080922, v, comparable);
    }

    public Collection<class08092<?>> y() {
        return Collections.unmodifiableCollection(this.i.keySet());
    }

    public boolean y(class08092<?> class080922) {
        return this.i.containsKey(class080922);
    }

    private <T extends Comparable<T>, V extends T> S N(class08092<T> class080922, V v, Comparable<?> comparable) {
        if (comparable.equals(v)) {
            return (S)this;
        }
        int n = class080922.N(v);
        if (n < 0) {
            throw new IllegalArgumentException("Cannot set property " + String.valueOf(class080922) + " to " + String.valueOf(v) + " on " + String.valueOf(this.u) + ", it is not an allowed value");
        }
        return this.M.get(class080922)[n];
    }

    public <T extends Comparable<T>> T N(class08092<T> class080922, T t) {
        return (T)((Comparable)Objects.requireNonNullElse(this.i(class080922), t));
    }

    protected static <T> T N(List<T> list, T t) {
        int n = list.indexOf(t) + 1;
        return (T)(n == list.size() ? list.getFirst() : list.get(n));
    }

    public void N(Map<Map<class08092<?>, Comparable<?>>, S> map) {
        if (this.M != null) {
            throw new IllegalStateException();
        }
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(this.i.size());
        ObjectIterator objectIterator = this.i.entrySet().iterator();
        while (objectIterator.hasNext()) {
            class08092 class080922 = (class08092)((Map.Entry)objectIterator.next()).getKey();
            reference2ObjectArrayMap.put(class080922, class080922.N().stream().map(comparable -> map.get(this.u((class08092<?>)class080922, (Comparable<?>)comparable))).toArray());
        }
        this.M = reference2ObjectArrayMap;
    }

    public <T extends Comparable<T>> S N(class08092<T> class080922) {
        return this.y(class080922, (Comparable)class00522.N(class080922.N(), this.L(class080922)));
    }

    protected static <O, S extends class00522<O, S>> Codec<S> N(Codec<O> codec, Function<O, S> function) {
        return codec.dispatch(y, class005222 -> class005222.u, object -> {
            class00522 class005222 = (class00522)function.apply(object);
            if (class005222.L().isEmpty()) {
                return MapCodec.unit((Object)class005222);
            }
            return class005222.R.codec().lenientOptionalFieldOf(L).xmap(optional -> optional.orElse(class005222), Optional::of);
        });
    }
}

