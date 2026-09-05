/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02566
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00589;
import minecraft.class00607;
import minecraft.class00610;
import minecraft.class02566;
import minecraft.class06338;

class class00605
implements class00589<Integer> {
    class00605() {
    }

    @Override
    public Integer apply(Integer n, Integer n2) {
        return class02566.i((int)n, (int)n2);
    }

    @Override
    public Codec<Integer> argumentCodec(class00607<Integer> class006072) {
        return class06338.P;
    }

    @Override
    public class00610<Integer> argumentKeyframeLerp(class00607<Integer> class006072) {
        return class00610.L();
    }
}

