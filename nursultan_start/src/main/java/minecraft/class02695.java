/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09822
 *  Nursultan.class09826
 *  com.google.common.collect.Iterators
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  minecraft.class02477
 *  minecraft.class02480
 */
package minecraft;

import Nursultan.class09822;
import Nursultan.class09826;
import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02698;

public interface class02695
extends class02666,
Iterable<class02480<?>> {
    public static final class02695 N = new class02698();
    public static final Codec<class02695> y = class02695.y(class02477.u);

    default public Stream<class02480<?>> L() {
        return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.u(), 1345), false);
    }

    @Override
    default public Iterator<class02480<?>> iterator() {
        return Iterators.transform(this.y().iterator(), class024772 -> Objects.requireNonNull(this.u(class024772)));
    }

    default public boolean i() {
        return this.u() == 0;
    }

    default public int u() {
        return this.y().size();
    }

    public static Codec<class02695> y(Codec<Map<class02477<?>, Object>> codec) {
        return codec.flatComapMap(class02676::N, class026952 -> {
            int n = class026952.u();
            if (n == 0) {
                return DataResult.success((Object)Reference2ObjectMaps.emptyMap());
            }
            Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(n);
            for (class02480<?> class024802 : class026952) {
                if (class024802.N().u()) continue;
                reference2ObjectArrayMap.put((Object)class024802.N(), class024802.y());
            }
            return DataResult.success((Object)reference2ObjectArrayMap);
        });
    }

    public Set<class02477<?>> y();

    default public class02695 N(Predicate<class02477<?>> predicate) {
        return new class09822(this, predicate);
    }

    public static Codec<class02695> N(Codec<class02477<?>> codec) {
        return class02695.y(Codec.dispatchedMap(codec, class02477::L));
    }

    public static class02695 N(class02695 class026952, class02695 class026953) {
        return new class09826(class026953, class026952);
    }

    default public boolean N(class02477<?> class024772) {
        return this.method_58694(class024772) != null;
    }

    public static class02676 N() {
        return new class02676();
    }
}

