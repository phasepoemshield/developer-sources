/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package Nursultan;

import minecraft.class04995;

public class class11300 {
    public static int L(int n, float f) {
        return Math.round(Math.clamp((float)f, (float)0.0f, (float)100.0f) / 100.0f * 255.0f) << 24 | n & 0xFFFFFF;
    }

    public static float[] L(int n) {
        float f;
        float f2 = (float)class11300.u(n) / 255.0f;
        float f3 = (float)class11300.N(n) / 255.0f;
        float f4 = (float)class11300.i(n) / 255.0f;
        float f5 = Math.max(f2, Math.max(f3, f4));
        float f6 = Math.min(f2, Math.min(f3, f4));
        float f7 = (f5 + f6) / 2.0f;
        if (f5 == f6) {
            return new float[]{0.0f, 0.0f, f7};
        }
        float f8 = f5 - f6;
        float f9 = f = f7 > 0.5f ? f8 / (2.0f - f5 - f6) : f8 / (f5 + f6);
        float f10 = f5 == f2 ? ((f3 - f4) / f8 + (f3 < f4 ? 6.0f : 0.0f)) / 6.0f : (f5 == f3 ? ((f4 - f2) / f8 + 2.0f) / 6.0f : ((f2 - f3) / f8 + 4.0f) / 6.0f);
        return new float[]{f10 * 360.0f, f, f7};
    }

    private static float L(float f, float f2, float f3) {
        float f4 = f3;
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        if (f4 < 0.16666667f) {
            return f + (f2 - f) * 6.0f * f4;
        }
        if (f4 < 0.5f) {
            return f2;
        }
        if (f4 < 0.6666667f) {
            return f + (f2 - f) * (0.6666667f - f4) * 6.0f;
        }
        return f;
    }

    private class11300() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int i(int n) {
        return n & 0xFF;
    }

    public static int u(int n) {
        return n >> 16 & 0xFF;
    }

    public static int u(int n, float f) {
        return class11300.N(n, Math.round((float)class11300.y(n) * Math.clamp((float)f, (float)0.0f, (float)1.0f)));
    }

    public static int y(int n, int n2, int n3, int n4) {
        return n4 << 24 | n << 16 | n2 << 8 | n3;
    }

    public static int y(int n, float f) {
        int n2 = class11300.u(n);
        int n3 = class11300.N(n);
        int n4 = class11300.i(n);
        int n5 = class11300.y(n);
        return class11300.y(Math.max((int)((float)n2 * f), 0), Math.max((int)((float)n3 * f), 0), Math.max((int)((float)n4 * f), 0), n5);
    }

    public static int y(float f, float f2, float f3) {
        float f4 = (f % 360.0f + 360.0f) % 360.0f / 360.0f;
        if (f2 == 0.0f) {
            int n = Math.round(f3 * 255.0f);
            return n << 16 | n << 8 | n;
        }
        float f5 = f3 < 0.5f ? f3 * (1.0f + f2) : f3 + f2 - f3 * f2;
        float f6 = 2.0f * f3 - f5;
        int n = Math.round(class11300.L(f6, f5, f4 + 0.33333334f) * 255.0f);
        int n2 = Math.round(class11300.L(f6, f5, f4) * 255.0f);
        int n3 = Math.round(class11300.L(f6, f5, f4 - 0.33333334f) * 255.0f);
        return (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | n3 & 0xFF;
    }

    public static int y(int n, int n2) {
        return class11300.y(n, n, n, n2);
    }

    public static int y(int n) {
        return n >>> 24;
    }

    public static int N(int n, int n2, float f) {
        int n3 = class11300.u(n);
        int n4 = class11300.N(n);
        int n5 = class11300.i(n);
        int n6 = class11300.y(n);
        int n7 = class11300.u(n2);
        int n8 = class11300.N(n2);
        int n9 = class11300.i(n2);
        int n10 = class11300.y(n2);
        return class11300.y(class04995.N((float)f, (int)n3, (int)n7), class04995.N((float)f, (int)n4, (int)n8), class04995.N((float)f, (int)n5, (int)n9), class04995.N((float)f, (int)n6, (int)n10));
    }

    public static int N(float f, float f2, float f3) {
        return 0xFF000000 | (int)(f * 255.0f) << 16 | (int)(f2 * 255.0f) << 8 | (int)(f3 * 255.0f);
    }

    public static int N(int n) {
        return n >> 8 & 0xFF;
    }

    public static int N(float f) {
        int n;
        int n2;
        int n3 = Math.round(f * 85.0f);
        if (n3 < 43) {
            n2 = 255;
            n = Math.round((float)n3 * 5.94f);
        } else {
            n2 = Math.round(255.0f - (float)(n3 - 43) * 6.07f);
            n = 255;
        }
        return 0xFF000000 | (n2 & 0xFF) << 16 | (n & 0xFF) << 8;
    }

    public static int N(int n, int n2, int n3, int n4) {
        int n5 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        n5 = (n5 >= 180 ? 360 - n5 : n5) * 2;
        return class11300.N(n3, n4, (float)n5 / 360.0f);
    }

    public static int N(int n, float f) {
        int n2 = class11300.u(n);
        int n3 = class11300.N(n);
        int n4 = class11300.i(n);
        int n5 = class11300.y(n);
        int n6 = (int)(1.0 / (1.0 - (double)f));
        if (n2 == 0 && n3 == 0 && n4 == 0) {
            return class11300.y(n6, n6, n6, n5);
        }
        if (n2 > 0 && n2 < n6) {
            n2 = n6;
        }
        if (n3 > 0 && n3 < n6) {
            n3 = n6;
        }
        if (n4 > 0 && n4 < n6) {
            n4 = n6;
        }
        return class11300.y(Math.min((int)((float)n2 / f), 255), Math.min((int)((float)n3 / f), 255), Math.min((int)((float)n4 / f), 255), n5);
    }

    public static boolean N(int n, int n2, int n3) {
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 16 & 0xFF;
        int n8 = n2 >> 8 & 0xFF;
        int n9 = n2 & 0xFF;
        return Math.abs(n4 - n7) <= n3 && Math.abs(n5 - n8) <= n3 && Math.abs(n6 - n9) <= n3;
    }

    public static int N(int n, int n2) {
        return Math.clamp((long)n2, (int)0, (int)255) << 24 | n & 0xFFFFFF;
    }
}

