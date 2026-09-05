/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01100
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class05041
 *  minecraft.class05481
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class06391
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07536
 *  minecraft.class07836
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01100;
import minecraft.class01117;
import minecraft.class01119;
import minecraft.class01121;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class05041;
import minecraft.class05481;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class06391;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07536;
import minecraft.class07836;
import minecraft.class08092;

public class class01132
extends class06391<class01100> {
    private static final class07211[] NE = class07211.values();

    public class01132(Codec<class01100> codec) {
        super(codec);
    }

    public boolean N(class06058<class01100> class060582) {
        class00500 class005002;
        int n;
        int n2;
        class01100 class011002 = (class01100)class060582.R();
        class06069 class060692 = class060582.u();
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        int n3 = class011002.W;
        int n4 = class011002.m;
        LinkedList linkedList = Lists.newLinkedList();
        int n5 = class011002.U.N(class060692);
        class05041 class050412 = class05041.N((class06069)new class07836((class06069)new class06075(class059742.method_8412())), (int)-4, (double[])new double[]{1.0});
        LinkedList linkedList2 = Lists.newLinkedList();
        double d = (double)n5 / (double)class011002.z.L();
        class01119 class011192 = class011002.u;
        class01121 class011212 = class011002.L;
        class01117 class011172 = class011002.i;
        double d2 = 1.0 / Math.sqrt(class011192.y);
        double d3 = 1.0 / Math.sqrt(class011192.L + d);
        double d4 = 1.0 / Math.sqrt(class011192.u + d);
        double d5 = 1.0 / Math.sqrt(class011192.i + d);
        double d6 = 1.0 / Math.sqrt(class011172.L + class060692.U() / 2.0 + (n5 > 3 ? d : 0.0));
        boolean bl = (double)class060692.z() < class011172.y;
        int n6 = 0;
        for (n2 = 0; n2 < n5; ++n2) {
            int n7;
            int n8;
            n = class011002.z.N(class060692);
            class07209 class072093 = class072092.method_10069(n, n8 = class011002.z.N(class060692), n7 = class011002.z.N(class060692));
            class005002 = class059742.method_8320(class072093);
            if ((class005002.P() || class005002.N(class011212.B)) && ++n6 > class011002.s) {
                return false;
            }
            linkedList.add(Pair.of((Object)class072093, (Object)class011002.E.N(class060692)));
        }
        if (bl) {
            n2 = class060692.y(4);
            n = n5 * 2 + 1;
            if (n2 == 0) {
                linkedList2.add(class072092.method_10069(n, 7, 0));
                linkedList2.add(class072092.method_10069(n, 5, 0));
                linkedList2.add(class072092.method_10069(n, 1, 0));
            } else if (n2 == 1) {
                linkedList2.add(class072092.method_10069(0, 7, n));
                linkedList2.add(class072092.method_10069(0, 5, n));
                linkedList2.add(class072092.method_10069(0, 1, n));
            } else if (n2 == 2) {
                linkedList2.add(class072092.method_10069(n, 7, n));
                linkedList2.add(class072092.method_10069(n, 5, n));
                linkedList2.add(class072092.method_10069(n, 1, n));
            } else {
                linkedList2.add(class072092.method_10069(0, 7, 0));
                linkedList2.add(class072092.method_10069(0, 5, 0));
                linkedList2.add(class072092.method_10069(0, 1, 0));
            }
        }
        ArrayList arrayList = Lists.newArrayList();
        Predicate var31 = class01132.N(class011002.L.M);
        for (class07209 class072094 : class07209.method_10097((class07209)class072092.method_10069(n3, n3, n3), (class07209)class072092.method_10069(n4, n4, n4))) {
            double d7 = class050412.N((double)class072094.method_10263(), (double)class072094.method_10264(), (double)class072094.method_10260()) * class011002.P;
            double d8 = 0.0;
            double d9 = 0.0;
            for (Pair pair : linkedList) {
                d8 += class04995.M((double)(class072094.method_10262((class00753)pair.getFirst()) + (double)((Integer)pair.getSecond()).intValue())) + d7;
            }
            for (Pair pair : linkedList2) {
                d9 += class04995.M((double)(class072094.method_10262((class00753)pair) + (double)class011172.u)) + d7;
            }
            if (d8 < d5) continue;
            if (bl && d9 >= d6 && d8 < d2) {
                this.N(class059742, class072094, class00869.N.W(), var31);
                for (class07211 class072112 : NE) {
                    class07209 class072095 = class072094.method_10093(class072112);
                    class04688 class046882 = class059742.method_8316(class072095);
                    if (class046882.W()) continue;
                    class059742.N(class072095, class046882.N(), 0);
                }
                continue;
            }
            if (d8 >= d2) {
                this.N(class059742, class072094, class011212.N.N(class060692, class072094), var31);
                continue;
            }
            if (d8 >= d3) {
                boolean bl2;
                boolean bl3 = bl2 = (double)class060692.z() < class011002.B;
                if (bl2) {
                    this.N(class059742, class072094, class011212.L.N(class060692, class072094), var31);
                } else {
                    this.N(class059742, class072094, class011212.y.N(class060692, class072094), var31);
                }
                if (class011002.Z && !bl2 || !((double)class060692.z() < class011002.M)) continue;
                arrayList.add(class072094.method_10062());
                continue;
            }
            if (d8 >= d4) {
                this.N(class059742, class072094, class011212.u.N(class060692, class072094), var31);
                continue;
            }
            if (!(d8 >= d5)) continue;
            this.N(class059742, class072094, class011212.i.N(class060692, class072094), var31);
        }
        List<class00500> var32 = class011212.R;
        block5: for (class07209 class072096 : arrayList) {
            class005002 = (class00500)class07536.N_77(var32, (class06069)class060692);
            for (class07211 class072113 : NE) {
                if (class005002.y((class08092)class06665.F)) {
                    class005002 = (class00500)class005002.y((class08092)class06665.F, (Comparable)class072113);
                }
                class07209 class072097 = class072096.method_10093(class072113);
                class00500 class005003 = class059742.method_8320(class072097);
                if (class005002.y((class08092)class06665.q)) {
                    class005002 = (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(class005003.Y().u()));
                }
                if (!class05481.U((class00500)class005003)) continue;
                this.N(class059742, class072097, class005002, var31);
                continue block5;
            }
        }
        return true;
    }
}

