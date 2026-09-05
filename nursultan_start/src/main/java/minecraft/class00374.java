/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class07070
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00336;
import minecraft.class00372;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07070;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public record class00374() implements class00372<class07070>
{
    public static final Codec<class07070> N = class07070.field_45121;
    public static final class00336<class00374, class07070> y = class00336.N(MapCodec.unit((Object)new class00374()), N);

    @Override
    public Codec<class07070> y() {
        return N;
    }

    @Override
    public class00336<class00374, class07070> N() {
        return y;
    }

    @Override
    public @Nullable class07070 y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return class074382 == null ? null : class074382.method_6068();
    }
}

