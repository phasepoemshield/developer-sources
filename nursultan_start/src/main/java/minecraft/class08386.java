/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08909
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public record class08386() implements class08909
{
    public static final MapCodec<class08386> N = MapCodec.unit((Object)((Object)new class08386()));

    public MapCodec<class08386> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        class06202 class062022 = class06202.Nq();
        class07049 class070492 = class062022.F();
        return class070492 != null ? class074382 == class070492 : class074382 == (class04453)class062022.T_4;
    }
}

