/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01757;
import minecraft.class01784;
import minecraft.class02362;
import minecraft.class04247;

class class01779
implements class01757<class01784> {
    private static final MapCodec<class01784> N = MapCodec.unit((Object)class01784.N);
    private static final class02362<class04247, class01784> y = class02362.N((Object)class01784.N);

    class01779() {
    }

    @Override
    public class02362<class04247, class01784> y() {
        return y;
    }

    @Override
    public MapCodec<class01784> N() {
        return N;
    }
}

