/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01684
 *  minecraft.class01697
 *  minecraft.class03007
 *  minecraft.class03301
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01684;
import minecraft.class01697;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class03007;
import minecraft.class03301;
import minecraft.class04206;

public interface class02139<P extends class02142> {
    public static final class02139<class02151> N = class02139.N("constant", class02151.y);
    public static final class02139<class02135> y = class02139.N("uniform", class02135.N);
    public static final class02139<class01697> L = class02139.N("biased_to_bottom", class01697.N);
    public static final class02139<class01684> u = class02139.N("clamped", class01684.N);
    public static final class02139<class03301> i = class02139.N("weighted_list", class03301.N);
    public static final class02139<class03007> R = class02139.N("clamped_normal", class03007.N);

    public static <P extends class02142> class02139<P> N(String string, MapCodec<P> mapCodec) {
        return (class02139)class00751.N((class00751)class04206.V, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

