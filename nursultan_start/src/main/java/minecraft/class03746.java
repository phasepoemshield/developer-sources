/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00275
 *  minecraft.class01134
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05437
 *  minecraft.class06078
 *  minecraft.class06244
 *  minecraft.class06260
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08790
 */
package minecraft;

import minecraft.class00275;
import minecraft.class01134;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05437;
import minecraft.class06078;
import minecraft.class06244;
import minecraft.class06260;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08790;

public class class03746
extends class00275 {
    private final class06260 N;
    private final class01894 y;
    private final class06078<class08790> L;

    public class03746(class04832 class048322, class01134 class011342) {
        super(class048322);
        this.y = class011342.N().N(string -> "textures/entity/" + string + ".png");
        this.N = new class06260(class048322.N(class04802.Q), class018942 -> class06851.i());
        this.L = new class05437(class048322.N(class011342));
    }

    protected class07311 method_64520() {
        return this.L.method_23500(this.y);
    }

    protected class06078<class08790> method_64517() {
        return this.L;
    }

    protected void method_64521(class08790 class087902, class01421 class014212, class01237 class012372, int n) {
        if (!class087902.R) {
            class012372.N((class06271)this.N, (Object)class06244.field_17274, class014212, this.N.method_23500(this.y), n, class01384.u, class087902.l, null);
        }
    }
}

