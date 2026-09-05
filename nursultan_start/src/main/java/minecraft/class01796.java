/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class03748
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01757;
import minecraft.class01782;
import minecraft.class02362;
import minecraft.class03748;
import minecraft.class04247;

class class01796
implements class01757<class01782> {
    private static final MapCodec<class01782> N = class03748.N.fieldOf("value").xmap(class01782::new, class01782::y);
    private static final class02362<class04247, class01782> y = class02362.N((class02362)class03748.u, class01782::y, class01782::new);

    class01796() {
    }

    @Override
    public class02362<class04247, class01782> y() {
        return y;
    }

    @Override
    public MapCodec<class01782> N() {
        return N;
    }
}

