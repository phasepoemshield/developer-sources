/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01669
 *  minecraft.class02276
 *  minecraft.class04995
 */
package minecraft;

import java.util.Locale;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01669;
import minecraft.class02276;
import minecraft.class04995;

public class class03718
extends class01669 {
    private static final int i = -16711681;
    private static final int R = -6250241;
    private static final int M = -65536;
    private static final int B = 1024;
    private static final int Z = 0x100000;
    private static final int z = 0x100000;

    private static String L(double d) {
        if (d >= 1048576.0) {
            return String.format(Locale.ROOT, "%.1f MiB/s", d / 1048576.0);
        }
        if (d >= 1024.0) {
            return String.format(Locale.ROOT, "%.1f KiB/s", d / 1024.0);
        }
        return String.format(Locale.ROOT, "%d B/s", class04995.N((double)d));
    }

    public class03718(class01590 class015902, class02276 class022762) {
        super(class015902, class022762);
    }

    private static double i(double d) {
        return d * 20.0;
    }

    protected void u(class01054 class010542, int n, int n2, int n3) {
        this.N(class010542, n, n2, n3, 64);
        this.N(class010542, n, n2, n3, 1024);
        this.N(class010542, n, n2, n3, 16384);
        this.N(class010542, class03718.L(1048576.0), n + 1, n3 - class03718.u(1048576.0) + 1);
    }

    private static int u(double d) {
        return (int)Math.round(Math.log(d + 1.0) * 60.0 / Math.log(1048576.0));
    }

    protected int y(double d) {
        return class03718.u(class03718.i(d));
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4) {
        this.N(class010542, n, n2, n3 - class03718.u(n4), class03718.L(n4));
    }

    protected int N(long l) {
        return this.N(class03718.i(l), 0.0, -16711681, 8192.0, -6250241, 1.048576E7, -65536);
    }

    private void N(class01054 class010542, int n, int n2, int n3, String string) {
        this.N(class010542, string, n + 1, n3 + 1);
        class010542.N(n, n + n2 - 1, n3, -1);
    }

    protected String N(double d) {
        return class03718.L(class03718.i(d));
    }
}

