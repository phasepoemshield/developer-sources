/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01180
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02577
 *  minecraft.class02941
 *  minecraft.class04802
 *  minecraft.class04817
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07070
 *  minecraft.class07541
 *  minecraft.class08004
 *  minecraft.class08118
 *  minecraft.class08278
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01180;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02577;
import minecraft.class02941;
import minecraft.class03089;
import minecraft.class04802;
import minecraft.class04817;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07070;
import minecraft.class07541;
import minecraft.class08004;
import minecraft.class08118;
import minecraft.class08278;
import minecraft.class08476;
import org.joml.Quaternionfc;

public class class03122
extends class02941<class07541, class08278, class04817> {
    private static final class01894 N = class01894.y((String)"textures/entity/zombie/drowned.png");

    public class03122(class04832 class048322) {
        super(class048322, (class03089)new class04817(class048322.N(class04802.Nc)), (class03089)new class04817(class048322.N(class04802.NX)), class08118.N((class08118)class04802.NF, (class01140)class048322.R(), class04817::new), class08118.N((class08118)class04802.Na, (class01140)class048322.R(), class04817::new));
        this.N((class06249)new class02577((class06252)this, class048322.R()));
    }

    public class08278 method_55269() {
        return new class08278();
    }

    public class01894 N(class08278 class082782) {
        return N;
    }

    protected void y(class08278 class082782, class01421 class014212, float f, float f2) {
        super.y((class08476)class082782, class014212, f, f2);
        float f3 = class082782.L;
        if (f3 > 0.0f) {
            float f4 = -10.0f - class082782.h;
            float f5 = class04995.B((float)f3, (float)0.0f, (float)f4);
            class014212.N((Quaternionfc)class02058.y.N(f5), 0.0f, class082782.T / 2.0f / f2, 0.0f);
        }
    }

    protected class01180 N(class07541 class075412, class07070 class070702) {
        class06584 class065842 = class075412.method_61420(class070702);
        if (class075412.method_6068() == class070702 && class075412.Nl() && class065842.N(class06570.db)) {
            return class01180.field_63542;
        }
        return super.N((class08004)class075412, class070702);
    }
}

