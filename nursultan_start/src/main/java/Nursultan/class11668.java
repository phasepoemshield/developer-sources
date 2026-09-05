/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class02837
 *  minecraft.class03519
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class08983
 */
package Nursultan;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import minecraft.class02837;
import minecraft.class03519;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08983;

public class class11668<T>
implements Codec<class08983<T>> {
    final /* synthetic */ Codec N;

    public class11668(Codec codec) {
        this.N = codec;
    }

    public <V> DataResult<Pair<class08983<T>, V>> decode(DynamicOps<V> dynamicOps, V v) {
        return class02837.y.decode(dynamicOps, v).flatMap(pair -> {
            class07001 class070012 = ((class07001)pair.getFirst()).N();
            class07709 class077092 = class070012.b("id");
            if (class077092 == null) {
                return DataResult.error(() -> "Expected 'id' field in " + String.valueOf(v));
            }
            return this.N.parse(class11668.N(dynamicOps), (Object)class077092).map(object -> Pair.of((Object)new class08983(object, class070012), (Object)pair.getSecond()));
        });
    }

    public <V> DataResult<V> encode(class08983<T> class089832, DynamicOps<V> dynamicOps, V v) {
        return this.N.encodeStart(class11668.N(dynamicOps), class089832.N).flatMap(class077092 -> {
            class07001 class070012 = class089832.y.N();
            class070012.N("id", class077092);
            return class02837.y.encode((Object)class070012, dynamicOps, v);
        });
    }

    private static <T> DynamicOps<class07709> N(DynamicOps<T> dynamicOps) {
        if (dynamicOps instanceof class03519) {
            return ((class03519)dynamicOps).N((DynamicOps)class07713.N);
        }
        return class07713.N;
    }
}

