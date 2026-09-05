/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02214
 *  minecraft.class03162
 *  minecraft.class03191
 *  minecraft.class03312
 *  minecraft.class03317
 *  minecraft.class04206
 *  minecraft.class04304
 *  minecraft.class04311
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class02214;
import minecraft.class03162;
import minecraft.class03191;
import minecraft.class03312;
import minecraft.class03317;
import minecraft.class04024;
import minecraft.class04025;
import minecraft.class04029;
import minecraft.class04041;
import minecraft.class04046;
import minecraft.class04048;
import minecraft.class04052;
import minecraft.class04206;
import minecraft.class04304;
import minecraft.class04311;

public interface class04054<P extends class04025> {
    public static final class04054<class04052> N = class04054.N("matching_blocks", class04052.N);
    public static final class04054<class03191> y = class04054.N("matching_block_tag", class03191.R);
    public static final class04054<class04041> L = class04054.N("matching_fluids", class04041.N);
    public static final class04054<class03162> u = class04054.N("has_sturdy_face", class03162.N);
    public static final class04054<class04311> i = class04054.N("solid", class04311.N);
    public static final class04054<class04024> R = class04054.N("replaceable", class04024.N);
    public static final class04054<class04048> M = class04054.N("would_survive", class04048.N);
    public static final class04054<class04304> B = class04054.N("inside_world_bounds", class04304.N);
    public static final class04054<class03317> Z = class04054.N("any_of", class03317.N);
    public static final class04054<class03312> z = class04054.N("all_of", class03312.N);
    public static final class04054<class04029> U = class04054.N("not", class04029.N);
    public static final class04054<class04046> E = class04054.N("true", class04046.i);
    public static final class04054<class02214> W = class04054.N("unobstructed", class02214.N);

    private static <P extends class04025> class04054<P> N(String string, MapCodec<P> mapCodec) {
        return (class04054)class00751.N((class00751)class04206.H, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

