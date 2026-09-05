/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01669
 *  minecraft.class02276
 */
package minecraft;

import java.util.Locale;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01669;
import minecraft.class02276;

public class class03716
extends class01669 {
    private static final int i = 500;

    public class03716(class01590 class015902, class02276 class022762) {
        super(class015902, class022762);
    }

    protected void u(class01054 class010542, int n, int n2, int n3) {
        this.N(class010542, "500 ms", n + 1, n3 - 60 + 1);
    }

    protected int y(double d) {
        return (int)Math.round(d * 60.0 / 500.0);
    }

    protected int N(long l) {
        return this.N(l, 0.0, -16711936, 250.0, -256, 500.0, -65536);
    }

    protected String N(double d) {
        return String.format(Locale.ROOT, "%d ms", (int)Math.round(d));
    }
}

