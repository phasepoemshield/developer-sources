/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 */
package minecraft;

import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07476;

public class class07483
extends class06937 {
    private final class07476 N;

    public static boolean L(class06584 class065842) {
        return class065842.N(class06570.jU);
    }

    public class07483(class07476 class074762, class06695 class066952, int n, int n2, int n3) {
        super(class066952, n, n2, n3);
        this.N = class074762;
    }

    public boolean N(class06584 class065842) {
        return this.N.L(class065842) || class07483.L(class065842);
    }

    public int b_(class06584 class065842) {
        return class07483.L(class065842) ? 1 : super.b_(class065842);
    }
}

