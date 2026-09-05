/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01669
 *  minecraft.class02276
 *  minecraft.class05630
 *  minecraft.class06202
 */
package minecraft;

import java.util.Locale;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01669;
import minecraft.class02276;
import minecraft.class05630;
import minecraft.class06202;

public class class03755
extends class01669 {
    private static final int i = 30;
    private static final double R = 33.333333333333336;

    private static double L(double d) {
        return d / 1000000.0;
    }

    public class03755(class01590 class015902, class02276 class022762) {
        super(class015902, class022762);
    }

    protected void u(class01054 class010542, int n, int n2, int n3) {
        this.N(class010542, "30 FPS", n + 1, n3 - 60 + 1);
        this.N(class010542, "60 FPS", n + 1, n3 - 30 + 1);
        class010542.N(n, n + n2 - 1, n3 - 30, -1);
        int n4 = (Integer)((class05630)class06202.Nq().i_7).B().method_41753();
        if (n4 > 0 && n4 <= 250) {
            class010542.N(n, n + n2 - 1, n3 - this.y(1.0E9 / (double)n4) - 1, -16711681);
        }
    }

    protected int y(double d) {
        return (int)Math.round(class03755.L(d) * 60.0 / 33.333333333333336);
    }

    protected String N(double d) {
        return String.format(Locale.ROOT, "%d ms", (int)Math.round(class03755.L(d)));
    }

    protected int N(long l) {
        return this.N(class03755.L(l), 0.0, -16711936, 28.0, -256, 56.0, -65536);
    }
}

