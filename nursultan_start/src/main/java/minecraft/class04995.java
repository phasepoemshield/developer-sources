/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class02566
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07536
 *  net.caffeinemc.mods.lithium.common.util.math.CompactSineLUT
 *  org.apache.commons.lang3.math.Fraction
 *  org.apache.commons.lang3.math.NumberUtils
 *  org.joml.Math
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Locale;
import java.util.UUID;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class02566;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07536;
import net.caffeinemc.mods.lithium.common.util.math.CompactSineLUT;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.NumberUtils;
import org.joml.Math;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04995 {
    private static final long E = 61440L;
    private static final long W = 16384L;
    private static final long m = -4611686018427387904L;
    private static final long P = Long.MIN_VALUE;
    public static final float N = (float)java.lang.Math.PI;
    public static final float y = 1.5707964f;
    public static final float L = (float)java.lang.Math.PI * 2;
    public static final float u = (float)java.lang.Math.PI / 180;
    public static final float i = 57.295776f;
    public static final float R = 1.0E-5f;
    public static final float M = class04995.N(2.0f);
    public static final Vector3f B = new Vector3f(0.0f, 1.0f, 0.0f);
    public static final Vector3f Z = new Vector3f(1.0f, 0.0f, 0.0f);
    public static final Vector3f z = new Vector3f(0.0f, 0.0f, 1.0f);
    private static final int s = 65536;
    private static final int T = 65535;
    private static final int b = 16384;
    private static final double j = 10430.378350470453;
    public static float[] U = (float[])class07536.N((Object)new float[65536], fArray -> {
        for (int i = 0; i < ((float[])fArray).length; ++i) {
            fArray[i] = (float)java.lang.Math.sin((double)i / 10430.378350470453);
        }
    });
    private static final class06069 v = class06069.i();
    private static final int[] n = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    private static final double t = 0.16666666666666666;
    private static final int G = 8;
    private static final int l = 257;
    private static final double d = Double.longBitsToDouble(4805340802404319232L);
    private static final double[] w = new double[257];
    private static final double[] k = new double[257];

    public static float L(class06069 class060692, float f, float f2) {
        return f + (float)class060692.E() * f2;
    }

    public static float L(float f, float f2, float f3, float f4, float f5) {
        return class04995.B(class04995.R(f, f2, f3), f4, f5);
    }

    public static int L(double d) {
        int n = (int)d;
        return d > (double)n ? n + 1 : n;
    }

    public static float L(float f, float f2, float f3) {
        float f4 = class04995.N(class04995.u(f, f2), -f3, f3);
        return f2 - f4;
    }

    public static int L(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static double L(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    public static int L(int n, int n2) {
        return java.lang.Math.floorMod(n, n2);
    }

    public static IntStream L(int n, int n2, int n3) {
        return class04995.y(n, n2, n3, 1);
    }

    public static float L(float f) {
        return java.lang.Math.abs(f);
    }

    public static double L(double d, double d2) {
        return (d % d2 + d2) % d2;
    }

    public static float L(float f, float f2) {
        return (f % f2 + f2) % f2;
    }

    public static float M(float f) {
        return f - (float)class04995.y(f);
    }

    public static int M(int n) {
        return class04995.R(n) - (class04995.i(n) ? 0 : 1);
    }

    public static double M(double d, double d2, double d3) {
        return java.lang.Math.sqrt(class04995.R(d, d2, d3));
    }

    public static int M(float f, float f2, float f3) {
        return class04995.N(f, f2, f3, 0);
    }

    public static double M(double d) {
        return Math.invsqrt((double)d);
    }

    public static float M(float f, float f2) {
        return (float)java.lang.Math.sqrt(class04995.i((double)f, (double)f2));
    }

    public static float P(double d) {
        return CompactSineLUT.cos((double)d);
    }

    public static int B(int n) {
        n ^= n >>> 16;
        n *= -2048144789;
        n ^= n >>> 13;
        n *= -1028477387;
        n ^= n >>> 16;
        return n;
    }

    public static float B(float f) {
        return Math.invsqrt((float)f);
    }

    public static float B(float f, float f2, float f3) {
        return f2 + f * (f3 - f2);
    }

    @Deprecated
    public static double B(double d) {
        double d2 = 0.5 * d;
        long l = Double.doubleToRawLongBits(d);
        l = 6910469410427058090L - (l >> 1);
        d = Double.longBitsToDouble(l);
        d *= 1.5 - d2 * d * d;
        return d;
    }

    public static float Z(float f, float f2, float f3) {
        return f2 + f * class04995.R(f3 - f2);
    }

    public static float Z(float f) {
        int n = Float.floatToIntBits(f);
        n = 1419967116 - n / 3;
        float f2 = Float.intBitsToFloat(n);
        f2 = 0.6666667f * f2 + 1.0f / (3.0f * f2 * f2 * f);
        f2 = 0.6666667f * f2 + 1.0f / (3.0f * f2 * f2 * f);
        return f2;
    }

    public static double Z(double d) {
        return d * d * d * (d * (d * 6.0 - 15.0) + 10.0);
    }

    public static int Z(int n) {
        return n * n;
    }

    public static double i(double d, double d2, double d3) {
        return d2 + d * class04995.i(d3 - d2);
    }

    public static double i(double d) {
        double d2 = d % 360.0;
        if (d2 >= 180.0) {
            d2 -= 360.0;
        }
        if (d2 < -180.0) {
            d2 += 360.0;
        }
        return d2;
    }

    public static int i(int n, int n2) {
        return class04995.R(n, n2) * n2;
    }

    public static float i(float f, float f2, float f3) {
        float f4 = class04995.u(f, f2);
        return class04995.u(f, f + f4, f3);
    }

    public static float i(float f, float f2) {
        return class04995.L(class04995.u(f, f2));
    }

    public static byte i(float f) {
        return (byte)class04995.y(f * 256.0f / 360.0f);
    }

    public static boolean i(int n) {
        return n != 0 && (n & n - 1) == 0;
    }

    public static double i(double d, double d2) {
        return d * d + d2 * d2;
    }

    public static float m(double d) {
        return CompactSineLUT.sin((double)d);
    }

    public static float U(float f, float f2, float f3) {
        return f * f + f2 * f2 + f3 * f3;
    }

    public static float U(float f) {
        return f * f * f;
    }

    public static int U(double d) {
        if (d == 0.0) {
            return 0;
        }
        return d > 0.0 ? 1 : -1;
    }

    public static double z(double d) {
        return 30.0 * d * d * (d - 1.0) * (d - 1.0);
    }

    public static float z(float f) {
        return f * f;
    }

    public static float z(float f, float f2, float f3) {
        float f4;
        for (f4 = f3 - f2; f4 < (float)(-java.lang.Math.PI); f4 += (float)java.lang.Math.PI * 2) {
        }
        while (f4 >= (float)java.lang.Math.PI) {
            f4 -= (float)java.lang.Math.PI * 2;
        }
        return f2 + f * f4;
    }

    public static double u(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public static double u(double d, double d2) {
        double d3;
        boolean bl;
        boolean bl2;
        boolean bl3;
        double d4 = d2 * d2 + d * d;
        if (Double.isNaN(d4)) {
            return Double.NaN;
        }
        boolean bl4 = bl3 = d < 0.0;
        if (bl3) {
            d = -d;
        }
        boolean bl5 = bl2 = d2 < 0.0;
        if (bl2) {
            d2 = -d2;
        }
        boolean bl6 = bl = d > d2;
        if (bl) {
            d3 = d2;
            d2 = d;
            d = d3;
        }
        d3 = class04995.B(d4);
        d2 *= d3;
        double d5 = class04995.d + (d *= d3);
        int n = (int)Double.doubleToRawLongBits(d5);
        double d6 = w[n];
        double d7 = k[n];
        double d8 = d5 - class04995.d;
        double d9 = d * d7 - d2 * d8;
        double d10 = (6.0 + d9 * d9) * d9 * 0.16666666666666666;
        double d11 = d6 + d10;
        if (bl) {
            d11 = 1.5707963267948966 - d11;
        }
        if (bl2) {
            d11 = java.lang.Math.PI - d11;
        }
        if (bl3) {
            d11 = -d11;
        }
        return d11;
    }

    public static float u(float f, float f2) {
        return class04995.R(f2 - f);
    }

    public static int u(float f) {
        int n = (int)f;
        return f > (float)n ? n + 1 : n;
    }

    public static boolean u(int n, int n2) {
        return n % n2 == 0;
    }

    public static int u(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("itemCount must be greater than or equal to zero");
        }
        return class04995.L(java.lang.Math.sqrt(n));
    }

    public static long u(double d) {
        long l = (long)d;
        return d > (double)l ? l + 1L : l;
    }

    public static float u(float f, float f2, float f3) {
        f3 = class04995.L(f3);
        if (f < f2) {
            return class04995.N(f + f3, f, f2);
        }
        return class04995.N(f - f3, f2, f);
    }

    public static int y(float f) {
        int n = (int)f;
        return f < (float)n ? n - 1 : n;
    }

    public static int y(float f, int n, int n2) {
        int n3 = n2 - n;
        return n + class04995.y(f * (float)(n3 - 1)) + (f > 0.0f ? 1 : 0);
    }

    public static IntStream y(int n, int n2, int n3, int n6) {
        if (n2 > n3) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "upperBound %d expected to be > lowerBound %d", n3, n2));
        }
        if (n6 < 1) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "step size expected to be >= 1, was %d", n6));
        }
        int n7 = class04995.N(n, n2, n3);
        return IntStream.iterate(n7, n4 -> {
            int n5 = java.lang.Math.abs(n7 - n4);
            return n7 - n5 >= n2 || n7 + n5 <= n3;
        }, n5 -> {
            int n6;
            boolean bl;
            boolean bl2 = n5 <= n7;
            int n7 = java.lang.Math.abs(n7 - n5);
            boolean bl3 = bl = n7 + n7 + n6 <= n3;
            if (!(bl2 && bl || (n6 = n7 - n7 - (bl2 ? n6 : 0)) < n2)) {
                return n6;
            }
            return n7 + n7 + n6;
        });
    }

    public static int y(int n, int n2) {
        return java.lang.Math.floorDiv(n, n2);
    }

    public static float y(float f, float f2, float f3, float f4, float f5) {
        return class04995.y(class04995.R(f, f2, f3), f4, f5);
    }

    public static long y(long l) {
        return l * l;
    }

    public static double y(double d, double d2, double d3, double d4, double d5) {
        return class04995.u(class04995.L(d, d2, d3), d4, d5);
    }

    public static int y(class06069 class060692, int n, int n2) {
        return class060692.y(n2 - n + 1) + n;
    }

    public static float y(class06069 class060692, float f, float f2) {
        return class060692.z() * (f2 - f) + f;
    }

    public static long y(double d) {
        long l = (long)d;
        return d < (double)l ? l - 1L : l;
    }

    public static double y(double d, double d2, double d3) {
        if (d < 0.0) {
            return d2;
        }
        if (d > 1.0) {
            return d3;
        }
        return class04995.u(d, d2, d3);
    }

    public static boolean y(double d, double d2) {
        return java.lang.Math.abs(d2 - d) < (double)1.0E-5f;
    }

    public static int y(int n) {
        int n2 = n % 360;
        if (n2 >= 180) {
            n2 -= 360;
        }
        if (n2 < -180) {
            n2 += 360;
        }
        return n2;
    }

    public static float y(float f, float f2, float f3) {
        if (f < 0.0f) {
            return f2;
        }
        if (f > 1.0f) {
            return f3;
        }
        return class04995.B(f, f2, f3);
    }

    @Deprecated
    public static long y(int n, int n2, int n3) {
        long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
        l = l * l * 42317861L + l * 11L;
        return l >> 16;
    }

    public static boolean y(float f, float f2) {
        return java.lang.Math.abs(f2 - f) < 1.0E-5f;
    }

    public static double E(double d) {
        return d * d;
    }

    public static double N(double d, double d2) {
        return java.lang.Math.max(java.lang.Math.abs(d), java.lang.Math.abs(d2));
    }

    public static int N(double d) {
        int n = (int)d;
        return d < (double)n ? n - 1 : n;
    }

    public static int N(int n, int n2) {
        return java.lang.Math.max(java.lang.Math.abs(n), java.lang.Math.abs(n2));
    }

    public static float N(long l) {
        float f = l % 360L;
        if (f >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static float N(byte by) {
        return (float)(by * 360) / 256.0f;
    }

    public static int N(int n) {
        return java.lang.Math.abs(n);
    }

    public static float N(float f, float f2) {
        return java.lang.Math.max(java.lang.Math.abs(f), java.lang.Math.abs(f2));
    }

    public static float N(float f) {
        return (float)java.lang.Math.sqrt(f);
    }

    public static double N(class06069 class060692, double d, double d2) {
        if (d >= d2) {
            return d;
        }
        return class060692.U() * (d2 - d) + d;
    }

    private static void N(CallbackInfo callbackInfo) {
        CompactSineLUT.init();
        U = null;
    }

    public static float N(class06069 class060692, float f, float f2) {
        if (f >= f2) {
            return f;
        }
        return class060692.z() * (f2 - f) + f;
    }

    public static int N(class06069 class060692, int n, int n2) {
        if (n >= n2) {
            return n;
        }
        return class060692.y(n2 - n + 1) + n;
    }

    public static int N(int n, int n2, int n3, int n4) {
        return class04995.N(n3 - n, n4 - n2);
    }

    public static int N(double d, int n) {
        return class04995.N(d / (double)n) * n;
    }

    public static Quaternionf N(Vector3f vector3f, Quaternionf quaternionf, Quaternionf quaternionf2) {
        float f = vector3f.dot(quaternionf.x, quaternionf.y, quaternionf.z);
        return quaternionf2.set(vector3f.x * f, vector3f.y * f, vector3f.z * f, quaternionf.w).normalize();
    }

    public static int N(Fraction fraction, int n) {
        return fraction.getNumerator() * n / fraction.getDenominator();
    }

    public static float N(float f, float f2, float f3, float f4, float f5) {
        return 0.5f * (2.0f * f3 + (f4 - f2) * f + (2.0f * f2 - 5.0f * f3 + 4.0f * f4 - f5) * f * f + (3.0f * f3 - f2 - 3.0f * f4 + f5) * f * f * f);
    }

    public static double N(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        return class04995.u(d3, class04995.N(d, d2, d4, d5, d6, d7), class04995.N(d, d2, d8, d9, d10, d11));
    }

    public static double N(double d, double d2, double d3, double d4, double d5, double d6) {
        return class04995.u(d2, class04995.u(d, d3, d4), class04995.u(d, d5, d6));
    }

    public static class06889 N(double d, class06889 class068892, class06889 class068893) {
        return new class06889(class04995.u(d, class068892.M, class068893.M), class04995.u(d, class068892.B, class068893.B), class04995.u(d, class068892.Z, class068893.Z));
    }

    public static float N(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return java.lang.Math.min(f, f3);
    }

    public static UUID N() {
        return class04995.N(v);
    }

    public static UUID N(class06069 class060692) {
        long l = class060692.B() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l2 = class060692.B() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l, l2);
    }

    public static int N(float f, float f2, float f3, int n) {
        float f4;
        float f5;
        int n2 = (int)(f * 6.0f) % 6;
        float f6 = f * 6.0f - (float)n2;
        float f7 = f3 * (1.0f - f2);
        float f8 = f3 * (1.0f - f6 * f2);
        float f9 = f3 * (1.0f - (1.0f - f6) * f2);
        return class02566.y((int)n, (int)class04995.N((int)(f5 * 255.0f), 0, 255), (int)class04995.N((int)(f4 * 255.0f), 0, 255), (int)class04995.N((int)((switch (n2) {
            case 0 -> {
                f5 = f3;
                f4 = f9;
                yield f7;
            }
            case 1 -> {
                f5 = f8;
                f4 = f3;
                yield f7;
            }
            case 2 -> {
                f5 = f7;
                f4 = f3;
                yield f9;
            }
            case 3 -> {
                f5 = f7;
                f4 = f8;
                yield f3;
            }
            case 4 -> {
                f5 = f9;
                f4 = f7;
                yield f3;
            }
            case 5 -> {
                f5 = f3;
                f4 = f7;
                yield f8;
            }
            default -> throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + f + ", " + f2 + ", " + f3);
        }) * 255.0f), 0, 255));
    }

    public static int N(int n, int n2, int n3) {
        return java.lang.Math.min(java.lang.Math.max(n, n2), n3);
    }

    public static int N(int n, int n2, IntPredicate intPredicate) {
        int n3 = n2 - n;
        while (n3 > 0) {
            int n4 = n3 / 2;
            int n5 = n + n4;
            if (intPredicate.test(n5)) {
                n3 = n4;
                continue;
            }
            n = n5 + 1;
            n3 -= n4 + 1;
        }
        return n;
    }

    public static int N(float f, int n, int n2) {
        return n + class04995.y(f * (float)(n2 - n));
    }

    public static long N(long l, long l2, long l3) {
        return java.lang.Math.min(java.lang.Math.max(l, l2), l3);
    }

    public static boolean N(class06889 class068892, class06889 class068893, class00734 class007342) {
        double d = (class007342.N + class007342.u) * 0.5;
        double d2 = (class007342.u - class007342.N) * 0.5;
        double d3 = class068892.M - d;
        if (java.lang.Math.abs(d3) > d2 && d3 * class068893.M >= 0.0) {
            return false;
        }
        double d4 = (class007342.y + class007342.i) * 0.5;
        double d5 = (class007342.i - class007342.y) * 0.5;
        double d6 = class068892.B - d4;
        if (java.lang.Math.abs(d6) > d5 && d6 * class068893.B >= 0.0) {
            return false;
        }
        double d7 = (class007342.L + class007342.R) * 0.5;
        double d8 = (class007342.R - class007342.L) * 0.5;
        double d9 = class068892.Z - d7;
        if (java.lang.Math.abs(d9) > d8 && d9 * class068893.Z >= 0.0) {
            return false;
        }
        double d10 = java.lang.Math.abs(class068893.M);
        double d11 = java.lang.Math.abs(class068893.B);
        double d12 = java.lang.Math.abs(class068893.Z);
        double d13 = class068893.B * d9 - class068893.Z * d6;
        if (java.lang.Math.abs(d13) > d5 * d12 + d8 * d11) {
            return false;
        }
        d13 = class068893.Z * d3 - class068893.M * d9;
        if (java.lang.Math.abs(d13) > d2 * d12 + d8 * d10) {
            return false;
        }
        d13 = class068893.M * d6 - class068893.B * d3;
        return java.lang.Math.abs(d13) < d2 * d11 + d5 * d10;
    }

    public static double N(double d, double d2, double d3, double d4, double d5) {
        return class04995.y(class04995.L(d, d2, d3), d4, d5);
    }

    public static int N(String string, int n) {
        return NumberUtils.toInt((String)string, (int)n);
    }

    @Deprecated
    public static long N(class00753 class007532) {
        return class04995.y(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public static double N(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return java.lang.Math.min(d, d3);
    }

    public static double W(double d) {
        return d + (2.0 * class06069.y((long)class04995.N(d * 3000.0)).U() - 1.0) * 1.0E-7 / 2.0;
    }

    public static int R(int n, int n2) {
        return -java.lang.Math.floorDiv(-n, n2);
    }

    public static double R(double d, double d2, double d3) {
        return d * d + d2 * d2 + d3 * d3;
    }

    public static float R(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    public static double R(double d, double d2) {
        return java.lang.Math.sqrt(class04995.i(d, d2));
    }

    public static double R(double d) {
        return d - (double)class04995.y(d);
    }

    public static float R(float f, float f2) {
        return (java.lang.Math.abs(f % f2 - f2 * 0.5f) - f2 * 0.25f) / (f2 * 0.25f);
    }

    public static float R(float f, float f2, float f3) {
        return (f - f2) / (f3 - f2);
    }

    public static int R(int n) {
        n = class04995.i(n) ? n : class04995.L(n);
        return class04995.n[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    static {
        for (int i = 0; i < 257; ++i) {
            double d = (double)i / 256.0;
            double d2 = java.lang.Math.asin(d);
            class04995.k[i] = java.lang.Math.cos(d2);
            class04995.w[i] = d2;
        }
    }
}

