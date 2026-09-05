/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSortedMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapDecoder
 *  com.mojang.serialization.MapEncoder
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  minecraft.class06647
 *  minecraft.class08084
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00522;
import minecraft.class06647;
import minecraft.class08084;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class00507<O, S extends class00522<O, S>> {
    static final Pattern N = Pattern.compile("^[a-z0-9_]+$");
    private final O y;
    private final ImmutableSortedMap<String, class08092<?>> L;
    private final ImmutableList<S> u;

    public O L() {
        return this.y;
    }

    protected class00507(Function<O, S> function, O o, class06647<O, S> class066472, Map<String, class08092<?>> map) {
        Object object2;
        this.y = o;
        this.L = ImmutableSortedMap.copyOf(map);
        Supplier<Object> supplier = () -> (class00522)function.apply(o);
        MapCodec<Object> mapCodec = MapCodec.of((MapEncoder)Encoder.empty(), (MapDecoder)Decoder.unit(supplier));
        for (Object object2 : this.L.entrySet()) {
            mapCodec = class00507.N(mapCodec, supplier, (String)object2.getKey(), (class08092)object2.getValue());
        }
        MapCodec<Object> mapCodec2 = mapCodec;
        object2 = Maps.newLinkedHashMap();
        ArrayList arrayList = Lists.newArrayList();
        Stream<List<List<Object>>> stream = Stream.of(Collections.emptyList());
        for (class08092 var12 : this.L.values()) {
            stream = stream.flatMap(list -> var12.N().stream().map(comparable -> {
                ArrayList arrayList = Lists.newArrayList((Iterable)list);
                arrayList.add(Pair.of((Object)var12, (Object)comparable));
                return arrayList;
            }));
        }
        stream.forEach(arg_0 -> class00507.N(class066472, o, mapCodec2, (Map)object2, arrayList, arg_0));
        for (class00522 class005222 : arrayList) {
            class005222.N(object2);
        }
        this.u = ImmutableList.copyOf((Collection)arrayList);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("block", this.y).add("properties", this.L.values().stream().map(class08092::R).collect(Collectors.toList())).toString();
    }

    public Collection<class08092<?>> u() {
        return this.L.values();
    }

    public S y() {
        return (S)((class00522)this.u.get(0));
    }

    private static /* synthetic */ void N(class06647 class066472, Object object, MapCodec mapCodec, Map map, List list, List list2) {
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(list2.size());
        for (Pair pair : list2) {
            reference2ObjectArrayMap.put((Object)((class08092)pair.getFirst()), (Object)((Comparable)pair.getSecond()));
        }
        class00522 class005222 = (class00522)class066472.create(object, reference2ObjectArrayMap, mapCodec);
        map.put(reference2ObjectArrayMap, class005222);
        list.add(class005222);
    }

    public ImmutableList<S> N() {
        return this.u;
    }

    public @Nullable class08092<?> N(String string) {
        return (class08092)this.L.get((Object)string);
    }

    private static <S extends class00522<?, S>, T extends Comparable<T>> MapCodec<S> N(MapCodec<S> mapCodec, Supplier<S> supplier, String string2, class08092<T> class080922) {
        return Codec.mapPair(mapCodec, (MapCodec)class080922.i().fieldOf(string2).orElseGet(string -> {}, () -> class080922.N((class00522)supplier.get()))).xmap(pair -> (class00522)((class00522)pair.getFirst()).y(class080922, ((class08084)pair.getSecond()).y()), class005222 -> Pair.of((Object)class005222, (Object)class080922.N(class005222)));
    }
}

