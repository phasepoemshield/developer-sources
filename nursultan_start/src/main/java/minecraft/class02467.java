/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02470;
import minecraft.class02487;
import minecraft.class02500;
import minecraft.class04247;

public abstract class class02467<T extends class02500>
implements class02487<T> {
    private final Codec<T> L;
    private final MapCodec<class02470<T>> u;
    private final class02362<class04247, class02470<T>> i;

    @Override
    public Codec<T> L() {
        return this.L;
    }

    public class02467(Codec<T> codec) {
        this.L = codec;
        this.u = class02470.N(this, codec);
        this.i = class02389.u(codec).N_10(class025002 -> new class02470<class02500>(this, (class02500)class025002), class02470::y);
    }

    @Override
    public class02362<class04247, class02470<T>> i() {
        return this.i;
    }

    @Override
    public MapCodec<class02470<T>> u() {
        return this.u;
    }
}

