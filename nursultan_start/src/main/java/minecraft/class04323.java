/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01006
 *  minecraft.class01039
 *  minecraft.class01600
 *  minecraft.class01811
 *  minecraft.class02405
 *  minecraft.class02564
 *  minecraft.class02589
 *  minecraft.class03016
 *  minecraft.class04033
 *  minecraft.class04206
 *  minecraft.class06413
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01006;
import minecraft.class01039;
import minecraft.class01600;
import minecraft.class01811;
import minecraft.class02405;
import minecraft.class02564;
import minecraft.class02589;
import minecraft.class03016;
import minecraft.class04033;
import minecraft.class04206;
import minecraft.class04294;
import minecraft.class04296;
import minecraft.class04297;
import minecraft.class04308;
import minecraft.class04321;
import minecraft.class04331;
import minecraft.class06413;

public interface class04323<P extends class04297> {
    public static final class04323<class04033> N = class04323.N("block_predicate_filter", class04033.N);
    public static final class04323<class04331> y = class04323.N("rarity_filter", class04331.N);
    public static final class04323<class01811> L = class04323.N("surface_relative_threshold_filter", class01811.N);
    public static final class04323<class02564> u = class04323.N("surface_water_depth_filter", class02564.N);
    public static final class04323<class04294> i = class04323.N("biome", class04294.N);
    public static final class04323<class04321> R = class04323.N("count", class04321.N);
    public static final class04323<class01600> M = class04323.N("noise_based_count", class01600.N);
    public static final class04323<class06413> B = class04323.N("noise_threshold_count", class06413.N);
    public static final class04323<class01006> Z = class04323.N("count_on_every_layer", class01006.N);
    public static final class04323<class04296> z = class04323.N("environment_scan", class04296.N);
    public static final class04323<class02405> U = class04323.N("heightmap", class02405.N);
    public static final class04323<class04308> E = class04323.N("height_range", class04308.N);
    public static final class04323<class01039> W = class04323.N("in_square", class01039.N);
    public static final class04323<class03016> m = class04323.N("random_offset", class03016.N);
    public static final class04323<class02589> P = class04323.N("fixed_placement", class02589.N);

    private static <P extends class04297> class04323<P> N(String string, MapCodec<P> mapCodec) {
        return (class04323)class00751.N((class00751)class04206.A, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

