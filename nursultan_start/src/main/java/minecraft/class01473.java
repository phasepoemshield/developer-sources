/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01443
 *  minecraft.class01452
 *  minecraft.class01461
 *  minecraft.class01813
 *  minecraft.class01814
 *  minecraft.class01840
 *  minecraft.class02771
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01443;
import minecraft.class01452;
import minecraft.class01461;
import minecraft.class01471;
import minecraft.class01813;
import minecraft.class01814;
import minecraft.class01840;
import minecraft.class02771;
import minecraft.class04206;

public class class01473<P extends class01471> {
    public static final class01473<class01452> N = class01473.N("simple_state_provider", class01452.y);
    public static final class01473<class01461> y = class01473.N("weighted_state_provider", class01461.y);
    public static final class01473<class01814> L = class01473.N("noise_threshold_provider", class01814.y);
    public static final class01473<class01840> u = class01473.N("noise_provider", class01840.M);
    public static final class01473<class01813> i = class01473.N("dual_noise_provider", class01813.y);
    public static final class01473<class01443> R = class01473.N("rotated_block_provider", class01443.y);
    public static final class01473<class02771> M = class01473.N("randomized_int_state_provider", class02771.y);
    private final MapCodec<P> B;

    public class01473(MapCodec<P> mapCodec) {
        this.B = mapCodec;
    }

    private static <P extends class01471> class01473<P> N(String string, MapCodec<P> mapCodec) {
        return (class01473)class00751.N((class00751)class04206.f, (String)string, new class01473<P>(mapCodec));
    }

    public MapCodec<P> N() {
        return this.B;
    }
}

