/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06069;

public class class04019 {
    public final class06069 N;
    private double y;
    private boolean L;

    public class04019(class06069 class060692) {
        this.N = class060692;
    }

    public double y() {
        double d;
        double d2;
        double d3;
        if (this.L) {
            this.L = false;
            return this.y;
        }
        do {
            d2 = 2.0 * this.N.U() - 1.0;
            d = 2.0 * this.N.U() - 1.0;
        } while ((d3 = class04995.E((double)d2) + class04995.E((double)d)) >= 1.0 || d3 == 0.0);
        double d4 = Math.sqrt(-2.0 * Math.log(d3) / d3);
        this.y = d * d4;
        this.L = true;
        return d2 * d4;
    }

    public void N() {
        this.L = false;
    }
}

