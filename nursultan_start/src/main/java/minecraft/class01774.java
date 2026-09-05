/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00411
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00411;
import minecraft.class01757;
import minecraft.class01759;
import minecraft.class02362;
import minecraft.class04247;

class class01774
implements class01757<class01759> {
    private static final MapCodec<class01759> N = class00411.N.xmap(class01759::new, class01759::y);
    private static final class02362<class04247, class01759> y = class02362.N((class02362)class00411.L, class01759::y, class01759::new);

    class01774() {
    }

    @Override
    public class02362<class04247, class01759> y() {
        return y;
    }

    @Override
    public MapCodec<class01759> N() {
        return N;
    }
}

