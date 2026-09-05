/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01517
 *  minecraft.class01590
 *  minecraft.class01669
 *  minecraft.class02276
 *  minecraft.class02869
 */
package minecraft;

import java.util.Locale;
import java.util.function.Supplier;
import minecraft.class01054;
import minecraft.class01517;
import minecraft.class01590;
import minecraft.class01669;
import minecraft.class02276;
import minecraft.class02869;

public class class03751
extends class01669 {
    private static final int i = -6745839;
    private static final int R = -4548257;
    private static final int M = -10547572;
    private final Supplier<Float> B;

    private static double L(double d) {
        return d / 1000000.0;
    }

    protected void L(class01054 class010542, int n, int n2, int n3) {
        long l = this.u.N(n3, class02869.field_48719.ordinal());
        int n4 = this.y(l);
        class010542.N(n2, n - n4, n2 + 1, n, -6745839);
        long l2 = this.u.N(n3, class02869.field_48720.ordinal());
        int n5 = this.y(l2);
        class010542.N(n2, n - n4 - n5, n2 + 1, n - n4, -4548257);
        long l3 = this.u.N(n3) - this.u.N(n3, class02869.field_48721.ordinal()) - l - l2;
        int n6 = this.y(l3);
        class010542.N(n2, n - n6 - n5 - n4, n2 + 1, n - n5 - n4, -10547572);
    }

    public class03751(class01590 class015902, class02276 class022762, Supplier<Float> supplier) {
        super(class015902, class022762);
        this.B = supplier;
    }

    protected void u(class01054 class010542, int n, int n2, int n3) {
        float f = (float)class01517.L / this.B.get().floatValue();
        this.N(class010542, String.format(Locale.ROOT, "%.1f TPS", Float.valueOf(f)), n + 1, n3 - 60 + 1);
    }

    protected int y(double d) {
        return (int)Math.round(class03751.L(d) * 60.0 / (double)this.B.get().floatValue());
    }

    protected long y(int n) {
        return this.u.N(n) - this.u.N(n, class02869.field_48721.ordinal());
    }

    protected int N(long l) {
        float f = this.B.get().floatValue();
        return this.N(class03751.L(l), f, -16711936, (double)f * 1.125, -256, (double)f * 1.25, -65536);
    }

    protected String N(double d) {
        return String.format(Locale.ROOT, "%d ms", (int)Math.round(class03751.L(d)));
    }
}

