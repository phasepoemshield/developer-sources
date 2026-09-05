/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01017
 *  minecraft.class01541
 *  minecraft.class01574
 *  minecraft.class04206
 *  minecraft.class04338
 *  minecraft.class04748
 *  minecraft.class04761
 *  minecraft.class04769
 *  minecraft.class04776
 *  minecraft.class04906
 *  minecraft.class05053
 *  minecraft.class05592
 *  minecraft.class05983
 *  minecraft.class06196
 *  minecraft.class06198
 *  minecraft.class06218
 *  minecraft.class06382
 *  minecraft.class06387
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01017;
import minecraft.class01541;
import minecraft.class01574;
import minecraft.class04206;
import minecraft.class04338;
import minecraft.class04748;
import minecraft.class04761;
import minecraft.class04769;
import minecraft.class04776;
import minecraft.class04906;
import minecraft.class05053;
import minecraft.class05592;
import minecraft.class05983;
import minecraft.class06196;
import minecraft.class06198;
import minecraft.class06218;
import minecraft.class06382;
import minecraft.class06387;

public interface class04367<S extends class04748> {
    public static final class04367<class04338> N = class04367.N("buried_treasure", class04338.N);
    public static final class04367<class06382> y = class04367.N("desert_pyramid", class06382.N);
    public static final class04367<class06387> L = class04367.N("end_city", class06387.N);
    public static final class04367<class06218> u = class04367.N("fortress", (MapCodec)class06218.N_1);
    public static final class04367<class01574> i = class04367.N("igloo", class01574.N);
    public static final class04367<class01017> R = class04367.N("jigsaw", class01017.Z);
    public static final class04367<class01541> M = class04367.N("jungle_temple", class01541.N);
    public static final class04367<class06196> B = class04367.N("mineshaft", class06196.N);
    public static final class04367<class05983> Z = class04367.N("nether_fossil", class05983.N);
    public static final class04367<class06198> z = class04367.N("ocean_monument", class06198.N);
    public static final class04367<class04906> U = class04367.N("ocean_ruin", class04906.N);
    public static final class04367<class05053> E = class04367.N("ruined_portal", class05053.N);
    public static final class04367<class05592> W = class04367.N("shipwreck", class05592.N);
    public static final class04367<class04776> m = class04367.N("stronghold", class04776.N);
    public static final class04367<class04769> P = class04367.N("swamp_hut", class04769.N);
    public static final class04367<class04761> s = class04367.N("woodland_mansion", class04761.N);

    private static <S extends class04748> class04367<S> N(String string, MapCodec<S> mapCodec) {
        return (class04367)class00751.N((class00751)class04206.F, (String)string, () -> mapCodec);
    }

    public MapCodec<S> codec();
}

