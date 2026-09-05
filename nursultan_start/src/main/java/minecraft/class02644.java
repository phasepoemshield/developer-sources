/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class03857
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class07872
 *  minecraft.class08288
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02795;
import minecraft.class03857;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class07872;
import minecraft.class08288;
import minecraft.class08476;

public class class02644
extends class02795<class07872, class08288, class03857> {
    private static final class01894 N = class01894.y((String)"textures/entity/turtle/big_sea_turtle.png");

    public class02644(class04832 class048322) {
        super(class048322, (class06078)new class03857(class048322.N(class04802.up)), (class06078)new class03857(class048322.N(class04802.uF)), 0.7f);
    }

    public class08288 method_55269() {
        return new class08288();
    }

    public class01894 N(class08288 class082882) {
        return N;
    }

    public void method_62354(class07872 class078722, class08288 class082882, float f) {
        super.method_62354((class07438)class078722, (class08476)class082882, f);
        class082882.N = !class078722.method_5799() && class078722.method_24828();
        class082882.y = class078722.W();
        class082882.L = !class078722.method_6109() && class078722.B();
    }

    protected float u(class08288 class082882) {
        float f = super.method_55831((class08476)class082882);
        if (class082882.NB) {
            return f * 0.83f;
        }
        return f;
    }
}

