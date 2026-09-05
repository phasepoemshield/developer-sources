/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class05235
 *  minecraft.class05487
 *  minecraft.class07007
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07536
 *  minecraft.class07746
 *  minecraft.class08052
 *  minecraft.class08054
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class07007;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07536;
import minecraft.class07746;
import minecraft.class08052;
import minecraft.class08054;
import minecraft.class08092;

public class class05077
extends class01219 {
    public static final MapCodec<class05077> N = MapCodec.unit(() -> y);
    public static final class05077 y = new class05077();
    private final Map<class00891, class00891> L = (Map)class07536.N((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put(class00869.W, class00869.Tb);
        hashMap.put(class00869.LK, class00869.Tb);
        hashMap.put(class00869.y, class00869.Tt);
        hashMap.put(class00869.Rm, class00869.TG);
        hashMap.put(class00869.RP, class00869.TG);
        hashMap.put(class00869.uP, class00869.Tj);
        hashMap.put(class00869.PR, class00869.Tj);
        hashMap.put(class00869.PB, class00869.TO);
        hashMap.put(class00869.RA, class00869.Tk);
        hashMap.put(class00869.Pu, class00869.Tk);
        hashMap.put(class00869.UY, class00869.Tn);
        hashMap.put(class00869.Pv, class00869.Tn);
        hashMap.put(class00869.Ul, class00869.Tg);
        hashMap.put(class00869.UG, class00869.Tg);
        hashMap.put(class00869.UO, class00869.Tw);
        hashMap.put(class00869.Pb, class00869.Tw);
        hashMap.put(class00869.Po, class00869.TY);
        hashMap.put(class00869.PI, class00869.TY);
        hashMap.put(class00869.Mg, class00869.Tv);
        hashMap.put(class00869.MI, class00869.Tv);
        hashMap.put(class00869.RT, class00869.Td);
        hashMap.put(class00869.Rs, class00869.Tl);
        hashMap.put(class00869.RQ, class00869.Rg);
    });

    private class05077() {
    }

    protected class05235<?> N() {
        return class05235.E;
    }

    public class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class00891 class008912 = this.L.get(class012283.y().i());
        if (class008912 == null) {
            return class012283;
        }
        class00500 class005002 = class012283.y();
        class00500 class005003 = class008912.W();
        if (class005002.y((class08092)class07746.y)) {
            class005003 = (class00500)class005003.y((class08092)class07746.y, (Comparable)((class07211)class005002.L((class08092)class07746.y)));
        }
        if (class005002.y((class08092)class07746.L)) {
            class005003 = (class00500)class005003.y((class08092)class07746.L, (Comparable)((class08052)class005002.L((class08092)class07746.L)));
        }
        if (class005002.y((class08092)class07007.y)) {
            class005003 = (class00500)class005003.y((class08092)class07007.y, (Comparable)((class08054)class005002.L((class08092)class07007.y)));
        }
        return new class01228(class012283.N(), class005003, class012283.L());
    }
}

