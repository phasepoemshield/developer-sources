/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class07536;

public final class class05660 {
    public static final class05946<class05660> N = class05660.N("desert");
    public static final class05946<class05660> y = class05660.N("jungle");
    public static final class05946<class05660> L = class05660.N("plains");
    public static final class05946<class05660> u = class05660.N("savanna");
    public static final class05946<class05660> i = class05660.N("snow");
    public static final class05946<class05660> R = class05660.N("swamp");
    public static final class05946<class05660> M = class05660.N("taiga");
    public static final Codec<class03556<class05660>> B = class03539.N((class05946)class04227.NH);
    public static final class02362<class04247, class03556<class05660>> Z = class02389.y((class05946)class04227.NH);
    public static final Map<class05946<class00780>, class05946<class05660>> z = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        hashMap.put(class00795.Y, N);
        hashMap.put(class00795.R, N);
        hashMap.put(class00795.Q, N);
        hashMap.put(class00795.O, N);
        hashMap.put(class00795.k, y);
        hashMap.put(class00795.d, y);
        hashMap.put(class00795.w, y);
        hashMap.put(class00795.v, u);
        hashMap.put(class00795.j, u);
        hashMap.put(class00795.l, u);
        hashMap.put(class00795.h, i);
        hashMap.put(class00795.D, i);
        hashMap.put(class00795.H, i);
        hashMap.put(class00795.i, i);
        hashMap.put(class00795.X, i);
        hashMap.put(class00795.b, i);
        hashMap.put(class00795.u, i);
        hashMap.put(class00795.J, i);
        hashMap.put(class00795.o, i);
        hashMap.put(class00795.q, i);
        hashMap.put(class00795.K, i);
        hashMap.put(class00795.M, R);
        hashMap.put(class00795.B, R);
        hashMap.put(class00795.s, M);
        hashMap.put(class00795.P, M);
        hashMap.put(class00795.t, M);
        hashMap.put(class00795.n, M);
        hashMap.put(class00795.T, M);
        hashMap.put(class00795.G, M);
    });

    public static class05660 N(class00751<class05660> class007512) {
        class05660.N(class007512, N);
        class05660.N(class007512, y);
        class05660.N(class007512, L);
        class05660.N(class007512, u);
        class05660.N(class007512, i);
        class05660.N(class007512, R);
        return class05660.N(class007512, M);
    }

    public static class05946<class05660> N(class03556<class00780> class035562) {
        return class035562.i().map(z::get).orElse(L);
    }

    private static class05946<class05660> N(String string) {
        return class05946.N((class05946)class04227.NH, (class01894)class01894.y((String)string));
    }

    private static class05660 N(class00751<class05660> class007512, class05946<class05660> class059462) {
        return (class05660)class00751.N(class007512, class059462, (Object)new class05660());
    }
}

