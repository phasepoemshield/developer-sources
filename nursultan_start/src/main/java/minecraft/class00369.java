/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03574
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00367;
import minecraft.class00368;
import minecraft.class03574;

public record class00369() implements class00335
{
    public static final MapCodec<class00369> N = MapCodec.unit((Object)new class00369());

    public MapCodec<class00369> N() {
        return N;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        return new class00367(new class03574(class003312));
    }
}

