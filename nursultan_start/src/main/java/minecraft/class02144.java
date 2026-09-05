/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import minecraft.class02134;

class class02144<E>
implements Codec<class02134<E>> {
    final /* synthetic */ Codec N;

    class02144(Codec codec) {
        this.N = codec;
    }

    public <T> DataResult<Pair<class02134<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        Dynamic dynamic = new Dynamic(dynamicOps, t);
        return dynamic.get("data").flatMap(arg_0 -> ((Codec)this.N).parse(arg_0)).map(object -> new class02134<Object>(object, dynamic.get("weight").asInt(1))).map(class021342 -> Pair.of((Object)class021342, (Object)dynamicOps.empty()));
    }

    public <T> DataResult<T> encode(class02134<E> class021342, DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.mapBuilder().add("weight", dynamicOps.createInt(class021342.y)).add("data", this.N.encodeStart(dynamicOps, class021342.N)).build(t);
    }
}

