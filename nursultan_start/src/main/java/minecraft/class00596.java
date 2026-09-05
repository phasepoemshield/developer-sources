/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00585;
import minecraft.class00601;
import minecraft.class00607;
import minecraft.class00610;
import minecraft.class04995;

class class00596
implements class00585<class00601> {
    class00596() {
    }

    @Override
    public Float apply(Float f, class00601 class006012) {
        return Float.valueOf(class04995.B((float)class006012.y(), (float)f.floatValue(), (float)class006012.N()));
    }

    @Override
    public Codec<class00601> argumentCodec(class00607<Float> class006072) {
        return class00601.N;
    }

    @Override
    public class00610<class00601> argumentKeyframeLerp(class00607<Float> class006072) {
        return (f, class006012, class006013) -> new class00601(class04995.B((float)f, (float)class006012.N(), (float)class006013.N()), class04995.B((float)f, (float)class006012.y(), (float)class006013.y()));
    }
}

