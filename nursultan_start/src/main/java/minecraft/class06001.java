/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08713;

public class class06001
extends class05989 {
    public static final MapCodec<class06001> N = class06001.y(class06001::new);

    public static boolean T(class00500 class005002) {
        return class005002.N(class01210.f);
    }

    public class06001(class01362 class013622) {
        super(class013622, 2.0f);
    }

    @Override
    protected boolean U(class00500 class005002) {
        return true;
    }

    public MapCodec<class06001> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (this.a_(class005002, class054872, class072092)) {
            return this.W();
        }
        return class00869.N.W();
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class06001.T(class054872.method_8320(class072092.method_10074()));
    }
}

