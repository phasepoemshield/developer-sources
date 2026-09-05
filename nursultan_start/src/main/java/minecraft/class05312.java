/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01939
 *  minecraft.class02773
 *  minecraft.class03640
 *  minecraft.class04206
 *  minecraft.class05039
 *  minecraft.class05064
 *  minecraft.class05069
 *  minecraft.class05079
 *  minecraft.class05291
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01939;
import minecraft.class02773;
import minecraft.class03640;
import minecraft.class04206;
import minecraft.class05039;
import minecraft.class05064;
import minecraft.class05069;
import minecraft.class05079;
import minecraft.class05291;
import minecraft.class05314;
import minecraft.class05326;

public class class05312<P extends class05291> {
    public static final class05312<class05314> N = class05312.N("straight_trunk_placer", class05314.N);
    public static final class05312<class05326> y = class05312.N("forking_trunk_placer", class05326.N);
    public static final class05312<class05039> L = class05312.N("giant_trunk_placer", class05039.N);
    public static final class05312<class05069> u = class05312.N("mega_jungle_trunk_placer", class05069.M);
    public static final class05312<class05064> i = class05312.N("dark_oak_trunk_placer", class05064.N);
    public static final class05312<class05079> R = class05312.N("fancy_trunk_placer", class05079.N);
    public static final class05312<class02773> M = class05312.N("bending_trunk_placer", class02773.N);
    public static final class05312<class03640> B = class05312.N("upwards_branching_trunk_placer", class03640.N);
    public static final class05312<class01939> Z = class05312.N("cherry_trunk_placer", class01939.N);
    private final MapCodec<P> z;

    public class05312(MapCodec<P> mapCodec) {
        this.z = mapCodec;
    }

    private static <P extends class05291> class05312<P> N(String string, MapCodec<P> mapCodec) {
        return (class05312)class00751.N((class00751)class04206.S, (String)string, new class05312<P>(mapCodec));
    }

    public MapCodec<P> N() {
        return this.z;
    }
}

