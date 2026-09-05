/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07536
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07536;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class class02566 {
    private static final int N = 1024;
    private static final short[] y = (short[])class07536.N((Object)new short[256], sArray -> {
        for (int i = 0; i < ((short[])sArray).length; ++i) {
            float f = (float)i / 255.0f;
            sArray[i] = (short)Math.round(class02566.i(f) * 1023.0f);
        }
    });
    private static final byte[] L = (byte[])class07536.N((Object)new byte[1024], byArray -> {
        for (int i = 0; i < ((byte[])byArray).length; ++i) {
            float f = (float)i / 1023.0f;
            byArray[i] = (byte)Math.round(class02566.R(f) * 255.0f);
        }
    });

    public static int L(int n) {
        return n >> 16 & 0xFF;
    }

    private static int L(int n, int n2, int n3, int n4) {
        int n5 = (y[n] + y[n2] + y[n3] + y[n4]) / 4;
        return L[n5] & 0xFF;
    }

    public static int L(int n, int n2) {
        return class02566.y(class02566.y(n), Math.max(class02566.L(n) - class02566.L(n2), 0), Math.max(class02566.u(n) - class02566.u(n2), 0), Math.max(class02566.i(n) - class02566.i(n2), 0));
    }

    public static int L(float f) {
        return class02566.u(f) << 24;
    }

    public static int L(int n, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        int n2 = class02566.L(n);
        int n3 = class02566.u(n);
        int n4 = class02566.i(n);
        int n5 = class02566.y(n);
        int n6 = Math.max(Math.max(n2, n3), n4);
        int n7 = Math.min(Math.min(n2, n3), n4);
        float f6 = n6 - n7;
        float f7 = n6 != 0 ? f6 / (float)n6 : 0.0f;
        if (f7 == 0.0f) {
            f5 = 0.0f;
        } else {
            f4 = (float)(n6 - n2) / f6;
            f3 = (float)(n6 - n3) / f6;
            f2 = (float)(n6 - n4) / f6;
            f5 = n2 == n6 ? f2 - f3 : (n3 == n6 ? 2.0f + f4 - f2 : 4.0f + f3 - f4);
            if ((f5 /= 6.0f) < 0.0f) {
                f5 += 1.0f;
            }
        }
        if (f7 == 0.0f) {
            n3 = n4 = Math.round(f * 255.0f);
            n2 = n4;
            return class02566.y(n5, n2, n3, n4);
        }
        f4 = (f5 - (float)Math.floor(f5)) * 6.0f;
        f3 = f4 - (float)Math.floor(f4);
        f2 = f * (1.0f - f7);
        float f8 = f * (1.0f - f7 * f3);
        float f9 = f * (1.0f - f7 * (1.0f - f3));
        switch ((int)f4) {
            case 0: {
                n2 = Math.round(f * 255.0f);
                n3 = Math.round(f9 * 255.0f);
                n4 = Math.round(f2 * 255.0f);
                break;
            }
            case 1: {
                n2 = Math.round(f8 * 255.0f);
                n3 = Math.round(f * 255.0f);
                n4 = Math.round(f2 * 255.0f);
                break;
            }
            case 2: {
                n2 = Math.round(f2 * 255.0f);
                n3 = Math.round(f * 255.0f);
                n4 = Math.round(f9 * 255.0f);
                break;
            }
            case 3: {
                n2 = Math.round(f2 * 255.0f);
                n3 = Math.round(f8 * 255.0f);
                n4 = Math.round(f * 255.0f);
                break;
            }
            case 4: {
                n2 = Math.round(f9 * 255.0f);
                n3 = Math.round(f2 * 255.0f);
                n4 = Math.round(f * 255.0f);
                break;
            }
            case 5: {
                n2 = Math.round(f * 255.0f);
                n3 = Math.round(f2 * 255.0f);
                n4 = Math.round(f8 * 255.0f);
            }
        }
        return class02566.y(n5, n2, n3, n4);
    }

    public static int M(int n) {
        return n | 0xFF000000;
    }

    public static int M(int n, int n2) {
        return class02566.y((class02566.y(n) + class02566.y(n2)) / 2, (class02566.L(n) + class02566.L(n2)) / 2, (class02566.u(n) + class02566.u(n2)) / 2, (class02566.i(n) + class02566.i(n2)) / 2);
    }

    public static float P(int n) {
        return class02566.j(class02566.u(n));
    }

    public static int T(int n) {
        return n & 0xFF00FF00 | (n & 0xFF0000) >> 16 | (n & 0xFF) << 16;
    }

    public static int B(int n) {
        return n & 0xFFFFFF;
    }

    public static int Z(int n) {
        return n << 24 | 0xFFFFFF;
    }

    public static int i(int n, int n2) {
        int n3 = class02566.y(n);
        int n4 = class02566.y(n2);
        if (n4 == 255) {
            return n2;
        }
        if (n4 == 0) {
            return n;
        }
        int n5 = n4 + n3 * (255 - n4) / 255;
        return class02566.y(n5, class02566.u(n5, n4, class02566.L(n), class02566.L(n2)), class02566.u(n5, n4, class02566.u(n), class02566.u(n2)), class02566.u(n5, n4, class02566.i(n), class02566.i(n2)));
    }

    public static int i(int n) {
        return n & 0xFF;
    }

    private static float i(float f) {
        if (f >= 0.04045f) {
            return (float)Math.pow(((double)f + 0.055) / 1.055, 2.4);
        }
        return f / 12.92f;
    }

    public static int b(int n) {
        return class02566.T(n);
    }

    public static float s(int n) {
        return class02566.j(class02566.i(n));
    }

    public static float m(int n) {
        return class02566.j(class02566.L(n));
    }

    private static float j(int n) {
        return (float)n / 255.0f;
    }

    public static Vector3f U(int n) {
        return new Vector3f(class02566.m(n), class02566.P(n), class02566.s(n));
    }

    public static int z(int n) {
        return n << 24;
    }

    public static int u(float f) {
        return class04995.y((float)(f * 255.0f));
    }

    public static int u(int n) {
        return n >> 8 & 0xFF;
    }

    private static int u(int n, int n2, int n3, int n4) {
        return (n4 * n2 + n3 * (n - n2)) / n;
    }

    public static int u(int n, int n2) {
        return class02566.y(class02566.y(n), Math.clamp((long)((long)class02566.L(n) * (long)n2 / 255L), (int)0, (int)255), Math.clamp((long)((long)class02566.u(n) * (long)n2 / 255L), (int)0, (int)255), Math.clamp((long)((long)class02566.i(n) * (long)n2 / 255L), (int)0, (int)255));
    }

    public static int y(float f, int n, int n2) {
        return class02566.y(class04995.N((float)f, (int)class02566.y(n), (int)class02566.y(n2)), L[class04995.N((float)f, (int)y[class02566.L(n)], (int)y[class02566.L(n2)])] & 0xFF, L[class04995.N((float)f, (int)y[class02566.u(n)], (int)y[class02566.u(n2)])] & 0xFF, L[class04995.N((float)f, (int)y[class02566.i(n)], (int)y[class02566.i(n2)])] & 0xFF);
    }

    public static int y(float f) {
        return class02566.u(f) << 24 | 0xFFFFFF;
    }

    public static int y(int n, float f) {
        return class02566.N(n, f, f, f);
    }

    public static int y(int n, int n2) {
        return class02566.y(class02566.y(n), Math.min(class02566.L(n) + class02566.L(n2), 255), Math.min(class02566.u(n) + class02566.u(n2), 255), Math.min(class02566.i(n) + class02566.i(n2), 255));
    }

    public static int y(int n) {
        return n >>> 24;
    }

    public static int y(int n, int n2, int n3, int n4) {
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
    }

    public static Vector4f E(int n) {
        return new Vector4f(class02566.m(n), class02566.P(n), class02566.s(n), class02566.W(n));
    }

    public static int N(int n, float f) {
        if (n == 0 || f <= 0.0f) {
            return 0;
        }
        if (f >= 1.0f) {
            return n;
        }
        return class02566.N(class02566.W(n) * f, n);
    }

    public static int N(int n, int n2, int n3) {
        return class02566.y(255, n, n2, n3);
    }

    public static float N(int n) {
        return (float)y[n] / 1023.0f;
    }

    public static int N(class06889 class068892) {
        return class02566.N(class02566.u((float)class068892.N()), class02566.u((float)class068892.y()), class02566.u((float)class068892.L()));
    }

    public static int N(int n, int n2) {
        if (n == -1) {
            return n2;
        }
        if (n2 == -1) {
            return n;
        }
        return class02566.y(class02566.y(n) * class02566.y(n2) / 255, class02566.L(n) * class02566.L(n2) / 255, class02566.u(n) * class02566.u(n2) / 255, class02566.i(n) * class02566.i(n2) / 255);
    }

    public static int N(int n, int n2, int n3, int n4) {
        return class02566.y((class02566.y(n) + class02566.y(n2) + class02566.y(n3) + class02566.y(n4)) / 4, class02566.L(class02566.L(n), class02566.L(n2), class02566.L(n3), class02566.L(n4)), class02566.L(class02566.u(n), class02566.u(n2), class02566.u(n3), class02566.u(n4)), class02566.L(class02566.i(n), class02566.i(n2), class02566.i(n3), class02566.i(n4)));
    }

    public static int N(float f, int n, int n2) {
        int n3 = class04995.N((float)f, (int)class02566.y(n), (int)class02566.y(n2));
        int n4 = class04995.N((float)f, (int)class02566.L(n), (int)class02566.L(n2));
        int n5 = class04995.N((float)f, (int)class02566.u(n), (int)class02566.u(n2));
        int n6 = class04995.N((float)f, (int)class02566.i(n), (int)class02566.i(n2));
        return class02566.y(n3, n4, n5, n6);
    }

    public static int N(float f, int n) {
        return class02566.u(f) << 24 | n & 0xFFFFFF;
    }

    public static int N(float f, float f2, float f3, float f4) {
        return class02566.y(class02566.u(f), class02566.u(f2), class02566.u(f3), class02566.u(f4));
    }

    public static int N(int n, float f, float f2, float f3) {
        return class02566.y(class02566.y(n), Math.clamp((long)((int)((float)class02566.L(n) * f)), (int)0, (int)255), Math.clamp((long)((int)((float)class02566.u(n) * f2)), (int)0, (int)255), Math.clamp((long)((int)((float)class02566.i(n) * f3)), (int)0, (int)255));
    }

    public static int N(float f) {
        return L[class04995.y((float)(f * 1023.0f))] & 0xFF;
    }

    public static float W(int n) {
        return class02566.j(class02566.y(n));
    }

    public static int R(int n, int n2) {
        return n << 24 | n2 & 0xFFFFFF;
    }

    public static int R(int n) {
        int n2 = (int)((float)class02566.L(n) * 0.3f + (float)class02566.u(n) * 0.59f + (float)class02566.i(n) * 0.11f);
        return class02566.y(class02566.y(n), n2, n2, n2);
    }

    private static float R(float f) {
        if (f >= 0.0031308f) {
            return (float)(1.055 * Math.pow(f, 0.4166666666666667) - 0.055);
        }
        return 12.92f * f;
    }
}

