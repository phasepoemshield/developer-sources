/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class05462
 *  minecraft.class06572
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class05462;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public record class08921() implements class06572
{
    public static final MapCodec<class08921> N = MapCodec.unit((Object)((Object)new class08921()));

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        return class05462.u((class06584)class065842);
    }

    public MapCodec<class08921> N() {
        return N;
    }
}

