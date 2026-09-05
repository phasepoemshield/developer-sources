/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01681
 *  minecraft.class01708
 *  minecraft.class04206
 *  minecraft.class04299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01681;
import minecraft.class01708;
import minecraft.class03850;
import minecraft.class03851;
import minecraft.class03854;
import minecraft.class03855;
import minecraft.class04206;
import minecraft.class04299;

public interface class03862<P extends class03855> {
    public static final class03862<class03850> N = class03862.N("constant", class03850.y);
    public static final class03862<class03854> y = class03862.N("uniform", class03854.N);
    public static final class03862<class03851> L = class03862.N("biased_to_bottom", class03851.N);
    public static final class03862<class01681> u = class03862.N("very_biased_to_bottom", class01681.N);
    public static final class03862<class01708> i = class03862.N("trapezoid", class01708.N);
    public static final class03862<class04299> R = class03862.N("weighted_list", class04299.N);

    private static <P extends class03855> class03862<P> N(String string, MapCodec<P> mapCodec) {
        return (class03862)class00751.N((class00751)class04206.e, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

