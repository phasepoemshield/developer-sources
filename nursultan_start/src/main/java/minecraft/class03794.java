/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class02957
 *  minecraft.class02981
 *  minecraft.class02989
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class02981;
import minecraft.class02989;
import minecraft.class03767;

public class class03794 {
    public static final class02957 N;
    public static final class02957 y;
    public static final class02957 L;
    public static final class02957 u;
    public static final class02981 i;
    public static final Codec<class03767> R;
    public static final class03767 M;
    public static final class03767 B;

    public static boolean N(class03767 class037672) {
        return !class037672.N(M);
    }

    public static String N(class03767 class037672, class03767 class037673) {
        return class03794.N(i, class037672, class037673);
    }

    public static String N(class02981 class029812, class03767 class037672, class03767 class037673) {
        Set var3 = class029812.y(class037673);
        Set var4 = class029812.y(class037672);
        return var3.stream().filter(class018942 -> !var4.contains(class018942)).map(class01894::toString).collect(Collectors.joining(", "));
    }

    static {
        class02989 class029892 = new class02989("main");
        N = class029892.N("vanilla");
        y = class029892.N("trade_rebalance");
        L = class029892.N("redstone_experiments");
        u = class029892.N("minecart_improvements");
        i = class029892.N();
        R = i.y();
        B = M = class03767.N(N);
    }
}

