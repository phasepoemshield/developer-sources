/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class03911 {
    protected class03911() {
    }

    public static double y(double d) {
        if (d < -0.5) {
            return 0.75;
        }
        if (d < 0.0) {
            return 1.0;
        }
        if (d < 0.5) {
            return 1.5;
        }
        return 2.0;
    }

    public static double N(double d) {
        if (d < -0.75) {
            return 0.5;
        }
        if (d < -0.5) {
            return 0.75;
        }
        if (d < 0.5) {
            return 1.0;
        }
        if (d < 0.75) {
            return 2.0;
        }
        return 3.0;
    }
}

