/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00305
 *  minecraft.class03774
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
import minecraft.class05838;
import minecraft.class06222;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07313;

public class class05641
extends class07313 {
    public class05641(String string, class03774 class037742, class06510 class065102, class06584 class065842, float f, int n) {
        super(string, class037742, class065102, class065842, f, n);
    }

    protected class06581 Z() {
        return class06570.dp;
    }

    public class00305 i() {
        return switch (this.B()) {
            default -> throw new MatchException(null, null);
            case class03774.field_40243 -> class06222.B;
            case class03774.field_40242, class03774.field_40244 -> class06222.Z;
        };
    }

    public class05838<class05641> u() {
        return class05838.L;
    }

    public class06514<class05641> method_8119() {
        return class06514.T;
    }
}

