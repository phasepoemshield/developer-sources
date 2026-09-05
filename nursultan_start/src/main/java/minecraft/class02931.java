/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class07709
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import minecraft.class02908;
import minecraft.class02911;
import minecraft.class07709;

class class02931<A>
implements Codec<A> {
    final /* synthetic */ Codec N;
    final /* synthetic */ class02911 y;

    class02931(class02911 class029112, Codec codec) {
        this.y = class029112;
        this.N = codec;
    }

    public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return this.N.decode(dynamicOps, t);
    }

    public <T> DataResult<T> encode(A a, DynamicOps<T> dynamicOps, T t) {
        return ((DataResult)this.y.N.getUnchecked(new class02908<A, T>(this.N, a, dynamicOps))).map(object -> {
            if (object instanceof class07709) {
                return ((class07709)object).N();
            }
            return object;
        });
    }
}

