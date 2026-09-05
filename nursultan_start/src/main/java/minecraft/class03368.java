/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class03594
 *  minecraft.class03604
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class03336;
import minecraft.class03338;
import minecraft.class03372;
import minecraft.class03594;
import minecraft.class03604;
import minecraft.class04206;

public interface class03368<P extends class03336> {
    public static final class03368<class03338> N = class03368.N("clear", class03338.N);
    public static final class03368<class03372> y = class03368.N("passthrough", class03372.y);
    public static final class03368<class03604> L = class03368.N("append_static", class03604.N);
    public static final class03368<class03594> u = class03368.N("append_loot", class03594.N);

    private static <P extends class03336> class03368<P> N(String string, MapCodec<P> mapCodec) {
        return (class03368)class00751.N((class00751)class04206.P, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

