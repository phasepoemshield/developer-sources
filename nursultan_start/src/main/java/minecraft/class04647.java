/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02431
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06129
 *  minecraft.class07438
 *  minecraft.class08441
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02431;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06129;
import minecraft.class07438;
import minecraft.class08441;
import minecraft.class08476;

public class class04647
extends class02795<class06129, class08441, class02431> {
    private static final class01894 N = class01894.y((String)"textures/entity/cat/ocelot.png");

    public class04647(class04832 class048322) {
        super(class048322, (class06078)new class02431(class048322.N(class04802.LB)), (class06078)new class02431(class048322.N(class04802.LZ)), 0.4f);
    }

    public class08441 method_55269() {
        return new class08441();
    }

    public void method_62354(class06129 class061292, class08441 class084412, float f) {
        super.method_62354((class07438)class061292, (class08476)class084412, f);
        class084412.u = class061292.method_18276();
        class084412.i = class061292.method_5624();
    }

    public class01894 N(class08441 class084412) {
        return N;
    }
}

