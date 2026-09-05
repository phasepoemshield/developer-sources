/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;

class class06358<E>
implements Codec<E> {
    final /* synthetic */ Codec N;
    final /* synthetic */ Codec y;

    class06358(Codec codec, Codec codec2) {
        this.N = codec;
        this.y = codec2;
    }

    public String toString() {
        return String.valueOf(this.y) + " orCompressed " + String.valueOf(this.N);
    }

    public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> dynamicOps, T t) {
        if (dynamicOps.compressMaps()) {
            return this.N.decode(dynamicOps, t);
        }
        return this.y.decode(dynamicOps, t);
    }

    public <T> DataResult<T> encode(E e, DynamicOps<T> dynamicOps, T t) {
        if (dynamicOps.compressMaps()) {
            return this.N.encode(e, dynamicOps, t);
        }
        return this.y.encode(e, dynamicOps, t);
    }
}

