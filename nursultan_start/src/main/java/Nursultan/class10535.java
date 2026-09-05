/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class05715
 */
package Nursultan;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import minecraft.class05715;

public class class10535<A>
implements Codec<A> {
    final /* synthetic */ Codec N;
    final /* synthetic */ int y;
    final /* synthetic */ DataFixer L;
    final /* synthetic */ class05715 u;

    public class10535(class05715 class057152, Codec codec, int n, DataFixer dataFixer) {
        this.u = class057152;
        this.N = codec;
        this.y = n;
        this.L = dataFixer;
    }

    public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> dynamicOps, T t) {
        int n = dynamicOps.get(t, "DataVersion").flatMap(arg_0 -> dynamicOps.getNumberValue(arg_0)).map(Number::intValue).result().orElse(this.y);
        Dynamic dynamic = new Dynamic(dynamicOps, dynamicOps.remove(t, "DataVersion"));
        Dynamic dynamic2 = this.u.N(this.L, dynamic, n);
        return this.N.decode(dynamic2);
    }

    public <T> DataResult<T> encode(A a, DynamicOps<T> dynamicOps, T t) {
        return this.N.encode(a, dynamicOps, t).flatMap(object -> dynamicOps.mergeToMap(object, dynamicOps.createString("DataVersion"), dynamicOps.createInt(class05715.N())));
    }
}

