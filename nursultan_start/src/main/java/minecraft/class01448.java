/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01468
 *  minecraft.class01479
 *  minecraft.class01978
 *  minecraft.class02257
 *  minecraft.class04206
 *  minecraft.class05047
 *  minecraft.class05048
 *  minecraft.class05061
 *  minecraft.class05078
 *  minecraft.class05080
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01442;
import minecraft.class01446;
import minecraft.class01460;
import minecraft.class01468;
import minecraft.class01479;
import minecraft.class01978;
import minecraft.class02257;
import minecraft.class04206;
import minecraft.class05047;
import minecraft.class05048;
import minecraft.class05061;
import minecraft.class05078;
import minecraft.class05080;

public class class01448<P extends class01479> {
    public static final class01448<class01460> N = class01448.N("blob_foliage_placer", class01460.N);
    public static final class01448<class01442> y = class01448.N("spruce_foliage_placer", class01442.N);
    public static final class01448<class01446> L = class01448.N("pine_foliage_placer", class01446.N);
    public static final class01448<class01468> u = class01448.N("acacia_foliage_placer", class01468.N);
    public static final class01448<class05047> i = class01448.N("bush_foliage_placer", class05047.R);
    public static final class01448<class05080> R = class01448.N("fancy_foliage_placer", class05080.R);
    public static final class01448<class05048> M = class01448.N("jungle_foliage_placer", class05048.N);
    public static final class01448<class05061> B = class01448.N("mega_pine_foliage_placer", class05061.N);
    public static final class01448<class05078> Z = class01448.N("dark_oak_foliage_placer", class05078.N);
    public static final class01448<class02257> z = class01448.N("random_spread_foliage_placer", class02257.N);
    public static final class01448<class01978> U = class01448.N("cherry_foliage_placer", class01978.N);
    private final MapCodec<P> E;

    public class01448(MapCodec<P> mapCodec) {
        this.E = mapCodec;
    }

    private static <P extends class01479> class01448<P> N(String string, MapCodec<P> mapCodec) {
        return (class01448)class00751.N((class00751)class04206.C, (String)string, new class01448<P>(mapCodec));
    }

    public MapCodec<P> N() {
        return this.E;
    }
}

