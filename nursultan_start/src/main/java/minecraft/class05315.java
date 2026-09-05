/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05332;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;

public class class05315
extends class06391<class05332> {
    private static final ImmutableList<class00891> NE = ImmutableList.of((Object)class00869.q, (Object)class00869.ML, (Object)class00869.Mu, (Object)class00869.Mi, (Object)class00869.MR, (Object)class00869.LA, (Object)class00869.La);
    private static final class07211[] NW = class07211.values();
    private static final double Nm = 0.9;

    public class05315(Codec<class05332> codec) {
        super(codec);
    }

    public boolean N(class06058<class05332> class060582) {
        class07209 class072092;
        boolean bl = false;
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class05332 class053322 = (class05332)class060582.R();
        class07209 class072093 = class060582.i();
        boolean bl2 = class060692.U() < 0.9;
        int n = bl2 ? class053322.i().N(class060692) : 0;
        int n2 = bl2 ? class053322.i().N(class060692) : 0;
        boolean bl3 = bl2 && n != 0 && n2 != 0;
        int n3 = class053322.L().N(class060692);
        int n4 = class053322.L().N(class060692);
        int n5 = Math.max(n3, n4);
        Iterator var14 = class07209.method_25996((class07209)class072093, (int)n3, (int)0, (int)n4).iterator();
        while (var14.hasNext() && (class072092 = (class07209)var14.next()).method_19455((class00753)class072093) <= n5) {
            class07209 class072094;
            if (!class05315.N((class07284)class059742, class072092, class053322)) continue;
            if (bl3) {
                bl = true;
                this.N((class00807)class059742, class072092, class053322.y());
            }
            if (!class05315.N((class07284)class059742, class072094 = class072092.method_10069(n, 0, n2), class053322)) continue;
            bl = true;
            this.N((class00807)class059742, class072094, class053322.N());
        }
        return bl;
    }

    private static boolean N(class07284 class072842, class07209 class072092, class05332 class053322) {
        class00500 class005002 = class072842.method_8320(class072092);
        if (class005002.N(class053322.N().i())) {
            return false;
        }
        if (NE.contains((Object)class005002.i())) {
            return false;
        }
        for (class07211 class072112 : NW) {
            boolean bl = class072842.method_8320(class072092.method_10093(class072112)).P();
            if ((!bl || class072112 == class07211.field_11036) && (bl || class072112 != class07211.field_11036)) continue;
            return false;
        }
        return true;
    }
}

