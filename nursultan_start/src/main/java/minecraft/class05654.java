/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00305
 *  minecraft.class03774
 *  minecraft.class05669
 *  minecraft.class05838
 *  minecraft.class06222
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07313
 */
package minecraft;

import minecraft.class00305;
import minecraft.class03774;
import minecraft.class05669;
import minecraft.class05838;
import minecraft.class06222;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07313;

public class class05654
extends class07313 {
    public class05654(String string, class03774 class037742, class06510 class065102, class06584 class065842, float f, int n) {
        super(string, class037742, class065102, class065842, f, n);
    }

    protected class06581 Z() {
        return class06570.RG;
    }

    public class00305 i() {
        return switch (class05669.N[this.B().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> class06222.R;
            case 2 -> class06222.i;
            case 3 -> class06222.M;
        };
    }

    public class05838<class05654> u() {
        return class05838.y;
    }

    public class06514<class05654> method_8119() {
        return class06514.s;
    }
}

