/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03852
 *  minecraft.class04802
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00348;
import minecraft.class00368;
import minecraft.class03852;
import minecraft.class04802;

public record class00376() implements class00335
{
    public static final MapCodec<class00376> N = MapCodec.unit((Object)new class00376());

    public MapCodec<class00376> N() {
        return N;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        return new class00348(new class03852(class003312.y().N(class04802.ue)));
    }
}

