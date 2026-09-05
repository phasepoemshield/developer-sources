/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02484
 *  minecraft.class02820
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06558
 *  minecraft.class06570
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
import minecraft.class02820;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06558;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public record class00345() implements class00372<class06558>
{
    public static final Codec<class06558> N = class06558.field_55209;
    public static final class00336<class00345, class06558> y = class00336.N(MapCodec.unit((Object)new class00345()), N);

    @Override
    public Codec<class06558> y() {
        return N;
    }

    @Override
    public class00336<class00345, class06558> N() {
        return y;
    }

    @Override
    public class06558 y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        class02820 class028202 = (class02820)class065842.method_58694(class02484.x);
        if (class028202 == null || class028202.y()) {
            return class06558.field_55206;
        }
        if (class028202.N(class06570.GJ)) {
            return class06558.field_55208;
        }
        return class06558.field_55207;
    }
}

