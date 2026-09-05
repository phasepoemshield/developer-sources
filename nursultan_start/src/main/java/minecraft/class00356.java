/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
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
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public record class00356() implements class00372<class03662>
{
    public static final Codec<class03662> N = class03662.field_42468;
    public static final class00336<class00356, class03662> y = class00336.N(MapCodec.unit((Object)new class00356()), N);

    @Override
    public Codec<class03662> y() {
        return N;
    }

    @Override
    public class00336<class00356, class03662> N() {
        return y;
    }

    @Override
    public class03662 y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return class036622;
    }
}

