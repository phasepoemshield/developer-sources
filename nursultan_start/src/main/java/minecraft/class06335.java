/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

class class06335<E>
extends MapCodec<E> {
    final /* synthetic */ MapCodec N;
    final /* synthetic */ MapCodec y;

    class06335(MapCodec mapCodec, MapCodec mapCodec2) {
        this.N = mapCodec;
        this.y = mapCodec2;
    }

    public String toString() {
        return String.valueOf(this.y) + " orCompressed " + String.valueOf(this.N);
    }

    public <T> DataResult<E> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        if (dynamicOps.compressMaps()) {
            return this.N.decode(dynamicOps, mapLike);
        }
        return this.y.decode(dynamicOps, mapLike);
    }

    public <T> RecordBuilder<T> encode(E e, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        if (dynamicOps.compressMaps()) {
            return this.N.encode(e, dynamicOps, recordBuilder);
        }
        return this.y.encode(e, dynamicOps, recordBuilder);
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return this.N.keys(dynamicOps);
    }
}

