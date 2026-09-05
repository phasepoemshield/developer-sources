/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01894
 *  minecraft.class01964
 *  minecraft.class01970
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08483
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01894;
import minecraft.class01964;
import minecraft.class01970;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08483;

public class class03595
extends class02795<class01964, class08483, class01970> {
    private static final class01894 N = class01894.y((String)"textures/entity/sniffer/sniffer.png");

    public class03595(class04832 class048322) {
        super(class048322, (class06078)new class01970(class048322.N(class04802.ub)), (class06078)new class01970(class048322.N(class04802.uj)), 1.1f);
    }

    public class08483 method_55269() {
        return new class08483();
    }

    public class01894 N(class08483 class084832) {
        return N;
    }

    public void method_62354(class01964 class019642, class08483 class084832, float f) {
        super.method_62354((class07438)class019642, (class08476)class084832, f);
        class084832.N = class019642.W();
        class084832.y.N(class019642.u);
        class084832.L.N(class019642.L);
        class084832.u.N(class019642.i);
        class084832.i.N(class019642.N);
        class084832.R.N(class019642.y);
    }

    protected class00734 y(class01964 class019642) {
        return super.method_62358((class07438)class019642).M((double)0.6f);
    }
}

