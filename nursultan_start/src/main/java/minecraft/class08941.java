/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public record class08941() implements class08909
{
    public static final MapCodec<class08941> N = MapCodec.unit((Object)new class08941());

    public MapCodec<class08941> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return class065842.b();
    }
}

