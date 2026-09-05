/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;

class class06351<A>
implements Decoder<A> {
    final /* synthetic */ Codec N;

    class06351(Codec codec) {
        this.N = codec;
    }

    public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> dynamicOps, T t) {
        try {
            return this.N.decode(dynamicOps, t);
        }
        catch (Exception exception) {
            return DataResult.error(() -> "Caught exception decoding " + String.valueOf(t) + ": " + exception.getMessage());
        }
    }
}

