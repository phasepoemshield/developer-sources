/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04453
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04453;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public record class08935() implements class08909
{
    public static final MapCodec<class08935> N = MapCodec.unit((Object)new class08935());

    public MapCodec<class08935> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return class074382 instanceof class04453 && ((class04453)class074382).method_31548().y() == class065842;
    }
}

