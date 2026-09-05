/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapLike
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import java.util.Optional;

class class06369<A>
implements Codec<Optional<A>> {
    final /* synthetic */ Codec N;

    class06369(Codec codec) {
        this.N = codec;
    }

    public <T> DataResult<Pair<Optional<A>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        if (class06369.N(dynamicOps, t)) {
            return DataResult.success((Object)Pair.of(Optional.empty(), t));
        }
        return this.N.decode(dynamicOps, t).map(pair -> pair.mapFirst(Optional::of));
    }

    public <T> DataResult<T> encode(Optional<A> optional, DynamicOps<T> dynamicOps, T t) {
        if (optional.isEmpty()) {
            return DataResult.success((Object)dynamicOps.emptyMap());
        }
        return this.N.encode(optional.get(), dynamicOps, t);
    }

    private static <T> boolean N(DynamicOps<T> dynamicOps, T t) {
        Optional optional = dynamicOps.getMap(t).result();
        return optional.isPresent() && ((MapLike)optional.get()).entries().findAny().isEmpty();
    }
}

