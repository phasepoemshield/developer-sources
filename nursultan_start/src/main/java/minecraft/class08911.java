/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class06572
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public record class08911() implements class06572
{
    public static final MapCodec<class08911> N = MapCodec.unit((Object)((Object)new class08911()));

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class07438 class074382;
        return class089612 != null && (class074382 = class089612.method_72393()) instanceof class08036 ? ((class08036)class074382).method_7357().N(class065842, 0.0f) : 0.0f;
    }

    public MapCodec<class08911> N() {
        return N;
    }
}

