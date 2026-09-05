/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class05439;
import minecraft.class05453;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08092;

public class class05481
extends class05439 {
    public static final MapCodec<class05481> y = class05481.y(class05481::new);
    public static final int L = 5;
    private static final class07211[] u = class07211.values();

    public class05481(class01362 class013622) {
        super(class013622);
    }

    public static boolean U(class00500 class005002) {
        return class005002.P() || class005002.N(class00869.K) && class005002.Y().R() == 8;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class060692.y(5) != 0) {
            return;
        }
        class07211 class072112 = u[class060692.y(u.length)];
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005003 = class047822.method_8320(class072093);
        class00891 class008912 = null;
        if (class05481.U(class005003)) {
            class008912 = class00869.bd;
        } else if (class005003.N(class00869.bd) && class005003.L(class05453.u) == class072112) {
            class008912 = class00869.bl;
        } else if (class005003.N(class00869.bl) && class005003.L(class05453.u) == class072112) {
            class008912 = class00869.bG;
        } else if (class005003.N(class00869.bG) && class005003.L(class05453.u) == class072112) {
            class008912 = class00869.bt;
        }
        if (class008912 != null) {
            class00500 class005004 = (class00500)((class00500)class008912.W().y(class05453.u, (Comparable)class072112)).y((class08092)class05453.L, (Comparable)Boolean.valueOf(class005003.Y().N() == class04684.L));
            class047822.method_8501(class072093, class005004);
        }
    }

    public MapCodec<class05481> N() {
        return y;
    }
}

