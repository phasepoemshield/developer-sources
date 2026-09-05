/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04534
 *  minecraft.class04802
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00351;
import minecraft.class00368;
import minecraft.class04534;
import minecraft.class04802;

public record class00358() implements class00335
{
    public static final class00358 N = new class00358();
    public static final MapCodec<class00358> y = MapCodec.unit((Object)N);

    public MapCodec<class00358> N() {
        return y;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        return new class00351(class003312.L(), new class04534(class003312.y().N(class04802.uu)));
    }
}

