/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09488
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02880
 *  minecraft.class02895
 */
package minecraft;

import Nursultan.class09488;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00667;
import minecraft.class01637;
import minecraft.class01666;
import minecraft.class01668;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02880;
import minecraft.class02895;

public interface class01659 {
    public static <B extends class00667> class02362<B, class01659> N(class01637<B> class016372, List<class01668<? super B, ?>> list) {
        Map<class01894, class02362> map = list.stream().collect(Collectors.toUnmodifiableMap(class016682 -> class016682.N().N(), class01668::y));
        return new class09488(map, class016372);
    }

    public static <B extends ByteBuf, T extends class01659> class02362<B, T> N(class02880<B, T> class028802, class02895<B, T> class028952) {
        return class02362.N_34(class028802, class028952);
    }

    public static <T extends class01659> class01666<T> N(String string) {
        return new class01666(class01894.y((String)string));
    }

    public class01666<? extends class01659> method_56479();
}

