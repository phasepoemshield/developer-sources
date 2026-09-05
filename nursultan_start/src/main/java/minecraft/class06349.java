/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec$ResultFunction
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import org.apache.commons.lang3.mutable.MutableObject;

class class06349<A>
implements Codec.ResultFunction<A> {
    final /* synthetic */ Object N;

    class06349(Object object) {
        this.N = object;
    }

    public String toString() {
        return "OrElsePartial[" + String.valueOf(this.N) + "]";
    }

    public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> dynamicOps, T t, DataResult<Pair<A, T>> dataResult) {
        MutableObject mutableObject = new MutableObject();
        if (dataResult.resultOrPartial(arg_0 -> ((MutableObject)mutableObject).setValue(arg_0)).isPresent()) {
            return dataResult;
        }
        return DataResult.error(() -> "(" + (String)mutableObject.get() + " -> using default)", (Object)Pair.of((Object)this.N, t));
    }

    public <T> DataResult<T> coApply(DynamicOps<T> dynamicOps, A a, DataResult<T> dataResult) {
        return dataResult;
    }
}

