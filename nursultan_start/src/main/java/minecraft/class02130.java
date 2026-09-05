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
import java.util.List;
import java.util.stream.Stream;
import minecraft.class02104;
import minecraft.class02108;
import minecraft.class02117;

class class02130
extends MapCodec<class02108> {
    final /* synthetic */ List N;

    class02130(List list) {
        this.N = list;
    }

    public <T> DataResult<class02108> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        DataResult<class02104> var3;
        DataResult dataResult = DataResult.success((Object)new class02104());
        for (class02117 class021172 : this.N) {
            var3 = this.N((DataResult<class02104>)dataResult, dynamicOps, mapLike, class021172);
        }
        return var3.map(class02104::N);
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return this.N.stream().map(class02117::y).map(arg_0 -> dynamicOps.createString(arg_0));
    }

    private <T, V> DataResult<class02104> N(DataResult<class02104> dataResult, DynamicOps<T> dynamicOps, MapLike<T> mapLike, class02117<V> class021172) {
        Object object2 = mapLike.get(class021172.y());
        if (object2 != null) {
            DataResult dataResult2 = class021172.u().parse(dynamicOps, object2);
            return dataResult.apply2stable((class021042, object) -> class021042.N(class021172, object), dataResult2);
        }
        return dataResult;
    }

    private <T, V> RecordBuilder<T> N(class02108 class021082, RecordBuilder<T> recordBuilder, class02117<V> class021172) {
        V v = class021082.N(class021172);
        if (v != null) {
            return recordBuilder.add(class021172.y(), v, class021172.u());
        }
        return recordBuilder;
    }

    public <T> RecordBuilder<T> encode(class02108 class021082, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        RecordBuilder<T> recordBuilder2 = recordBuilder;
        for (class02117 class021172 : this.N) {
            recordBuilder2 = this.N(class021082, recordBuilder2, class021172);
        }
        return recordBuilder2;
    }
}

