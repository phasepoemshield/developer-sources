/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00392
 *  minecraft.class03519
 *  minecraft.class03748
 *  minecraft.class05001
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import minecraft.class00392;
import minecraft.class03519;
import minecraft.class03748;
import minecraft.class05001;

class class01721
implements Codec<class00392> {
    final /* synthetic */ int N;

    class01721(int n) {
        this.N = n;
    }

    public <T> DataResult<Pair<class00392, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return class03748.N.decode(dynamicOps, t).flatMap(pair -> {
            if (this.N(dynamicOps, (class00392)pair.getFirst())) {
                return DataResult.error(() -> "Component was too large: greater than max size " + this.N);
            }
            return DataResult.success((Object)pair);
        });
    }

    private static <T> DynamicOps<JsonElement> N(DynamicOps<T> dynamicOps) {
        if (dynamicOps instanceof class03519) {
            return ((class03519)dynamicOps).N((DynamicOps)JsonOps.INSTANCE);
        }
        return JsonOps.INSTANCE;
    }

    private <T> boolean N(DynamicOps<T> dynamicOps, class00392 class003922) {
        DataResult var3 = class03748.N.encodeStart(class01721.N(dynamicOps), (Object)class003922);
        return var3.isSuccess() && class05001.N((JsonElement)((JsonElement)var3.getOrThrow()), (int)this.N);
    }

    public <T> DataResult<T> encode(class00392 class003922, DynamicOps<T> dynamicOps, T t) {
        return class03748.N.encodeStart(dynamicOps, (Object)class003922);
    }
}

