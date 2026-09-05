/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02781
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06018
 *  minecraft.class07079
 *  minecraft.class08476
 *  minecraft.class08484
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02781;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06018;
import minecraft.class07079;
import minecraft.class08476;
import minecraft.class08484;

public class class01495
extends class02781<class06018> {
    private static final class01894 N = class01894.y((String)"textures/entity/hoglin/hoglin.png");

    public class01495(class04832 class048322) {
        super(class048322, class04802.yn, class04802.yt, 0.7f);
    }

    protected boolean L(class08484 class084842) {
        return super.L((class08476)class084842) || class084842.y;
    }

    public class01894 N(class08484 class084842) {
        return N;
    }

    public void method_62354(class06018 class060182, class08484 class084842, float f) {
        super.method_62354((class07079)class060182, class084842, f);
        class084842.y = class060182.v();
    }
}

