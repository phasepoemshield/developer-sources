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
import minecraft.class04206;
import minecraft.class06039;
import minecraft.class06042;
import minecraft.class06052;
import minecraft.class06059;
import minecraft.class06073;

public interface class06061<P extends class06052> {
    public static final class06061<class06042> N = class06061.N("constant", class06042.y);
    public static final class06061<class06059> y = class06061.N("uniform", class06059.N);
    public static final class06061<class06073> L = class06061.N("clamped_normal", class06073.N);
    public static final class06061<class06039> u = class06061.N("trapezoid", class06039.N);

    public static <P extends class06052> class06061<P> N(String string, MapCodec<P> mapCodec) {
        return (class06061)class00751.N((class00751)class04206.K, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

