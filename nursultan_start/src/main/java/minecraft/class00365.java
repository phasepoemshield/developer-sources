/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02484
 *  minecraft.class03252
 *  minecraft.class03254
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00336;
import minecraft.class00372;
import minecraft.class02484;
import minecraft.class03252;
import minecraft.class03254;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public record class00365() implements class00372<class05946<class03252>>
{
    public static final Codec<class05946<class03252>> N = class05946.N((class05946)class04227.yw);
    public static final class00336<class00365, class05946<class03252>> y = class00336.N(MapCodec.unit((Object)new class00365()), N);

    @Override
    public Codec<class05946<class03252>> y() {
        return N;
    }

    @Override
    public class00336<class00365, class05946<class03252>> N() {
        return y;
    }

    @Override
    public @Nullable class05946<class03252> y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        class03254 class032542 = (class03254)class065842.method_58694(class02484.Nu);
        if (class032542 == null) {
            return null;
        }
        return class032542.N().i().orElse(null);
    }
}

