/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class03528;
import minecraft.class03532;
import minecraft.class03548;
import minecraft.class04206;

public interface class03549<SP extends class03532> {
    public static final class03549<class03528> N = class03549.N("random_spread", class03528.N);
    public static final class03549<class03548> y = class03549.N("concentric_rings", class03548.N);

    private static <SP extends class03532> class03549<SP> N(String string, MapCodec<SP> mapCodec) {
        return (class03549)class00751.N((class00751)class04206.a, (String)string, () -> mapCodec);
    }

    public MapCodec<SP> codec();
}

