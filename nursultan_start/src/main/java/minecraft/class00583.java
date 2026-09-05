/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02566
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00589;
import minecraft.class00607;
import minecraft.class00610;
import minecraft.class00614;
import minecraft.class02566;
import minecraft.class04995;

class class00583
implements class00589<class00614> {
    class00583() {
    }

    @Override
    public Integer apply(Integer n, class00614 class006142) {
        int n2 = class02566.y((int)class02566.R((int)n), (float)class006142.N());
        return class02566.N((float)class006142.y(), (int)n, (int)n2);
    }

    @Override
    public Codec<class00614> argumentCodec(class00607<Integer> class006072) {
        return class00614.L;
    }

    @Override
    public class00610<class00614> argumentKeyframeLerp(class00607<Integer> class006072) {
        return (f, class006142, class006143) -> new class00614(class04995.B((float)f, (float)class006142.N(), (float)class006143.N()), class04995.B((float)f, (float)class006142.y(), (float)class006143.y()));
    }
}

