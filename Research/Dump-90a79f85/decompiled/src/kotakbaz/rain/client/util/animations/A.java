/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.animations;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0007J5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/client/util/animations/Easings;", "", "<init>", "()V", "", "t", "linear", "(F)F", "standard", "standardAccelerate", "standardDecelerate", "emphasized", "emphasizedAccelerate", "emphasizedDecelerate", "x1", "y1", "x2", "y2", "cubicBezier", "(FFFFF)F", "sampleCurveX", "(FFF)F", "sampleCurveY", "sampleCurveDerivativeX", "x", "solveCurveX", "rain-visuals"})
public final class A {
    @NotNull
    public static final A INSTANCE;
    public static int[] A;

    private A() {
        super();
    }

    public final float linear(float f2) {
        return RangesKt.coerceIn(f2, 0.0f, 1.0f);
    }

    public final float standard(float f2) {
        return this.cubicBezier(f2, 0.2f, 0.0f, 0.0f, 1.0f);
    }

    public final float standardAccelerate(float f2) {
        return this.cubicBezier(f2, 0.3f, 0.0f, 1.0f, 1.0f);
    }

    public final float standardDecelerate(float f2) {
        return this.cubicBezier(f2, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public final float emphasized(float f2) {
        return this.cubicBezier(f2, 0.2f, 0.0f, 0.0f, 1.0f);
    }

    public final float emphasizedAccelerate(float f2) {
        return this.cubicBezier(f2, 0.3f, 0.0f, 0.8f, 0.15f);
    }

    public final float emphasizedDecelerate(float f2) {
        return this.cubicBezier(f2, 0.05f, 0.7f, 0.1f, 1.0f);
    }

    public final float cubicBezier(float f2, float f3, float f4, float f5, float f6) {
        float f7 = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        float f8 = this.solveCurveX(f7, f3, f5);
        return RangesKt.coerceIn(this.sampleCurveY(f8, f4, f6), 0.0f, 1.0f);
    }

    private final float sampleCurveX(float f2, float f3, float f4) {
        float f5 = 1.0f - f2;
        return 3.0f * f5 * f5 * f2 * f3 + 3.0f * f5 * f2 * f2 * f4 + f2 * f2 * f2;
    }

    private final float sampleCurveY(float f2, float f3, float f4) {
        float f5 = 1.0f - f2;
        return 3.0f * f5 * f5 * f2 * f3 + 3.0f * f5 * f2 * f2 * f4 + f2 * f2 * f2;
    }

    private final float sampleCurveDerivativeX(float f2, float f3, float f4) {
        float f5 = 1.0f - f2;
        return 3.0f * f5 * f5 * f3 + 6.0f * f5 * f2 * (f4 - f3) + 3.0f * f2 * f2 * (1.0f - f4);
    }

    private final float solveCurveX(float f2, float f3, float f4) {
        long l = -1882755184547884793L;
        long l2 = -8319964362590130316L;
        long l3 = 7362293306257576406L;
        long l4 = 1284940477544579171L;
        float f5 = 0.0f;
        f5 = f2;
        long l5 = l3;
        int n = A[0];
        n -= A[1];
        l3 = l5 ^ (6L ^ l5) & -1L >>> (n += A[2]);
        long l6 = l4;
        int n2 = A[3];
        n2 -= A[4];
        l4 = l6 ^ (0L ^ l6) & -1L << (n2 += A[5]);
        while (true) {
            int n3 = A[6];
            n3 ^= A[7];
            if ((int)(l4 >>> (n3 -= A[8])) >= (int)l3) break;
            int n4 = A[9];
            n4 -= A[10];
            long l7 = l4;
            int n5 = A[12];
            n5 ^= A[13];
            l4 = l7 ^ ((long)((int)(l4 >>> (n4 -= A[11]))) ^ l7) & -1L >>> (n5 ^= A[14]);
            long l8 = l;
            int n6 = A[15];
            n6 ^= A[16];
            l = l8 ^ (0L ^ l8) & -1L << (n6 -= A[17]);
            float f6 = INSTANCE.sampleCurveX(f5, f3, f4) - f2;
            if (Math.abs(f6) < 1.0E-5f) {
                return f5;
            }
            float f7 = INSTANCE.sampleCurveDerivativeX(f5, f3, f4);
            if (!(Math.abs(f7) < 1.0E-6f)) {
                f5 -= f6 / f7;
            }
            l4 += 0x100000000L;
        }
        float f8 = 0.0f;
        float f9 = 1.0f;
        float f10 = f2;
        while (f8 < f9) {
            float f11 = this.sampleCurveX(f10, f3, f4);
            if (Math.abs(f11 - f2) < 1.0E-5f) {
                return f10;
            }
            if (f2 > f11) {
                f8 = f10;
            } else {
                f9 = f10;
            }
            f10 = (f9 + f8) * 0.5f;
        }
        return f10;
    }

    static {
        kotakbaz.rain.client.util.animations.A.a();
        INSTANCE = new A();
    }

    public static void a() {
        A = new int[0xCC35 ^ 0xCC27];
        kotakbaz.rain.client.util.animations.A.A[0x2AE0 ^ 0x2AE3] = 0x2A3D ^ 0x2AE3;
        kotakbaz.rain.client.util.animations.A.A[0xFAF3 ^ 0xFAF3] = 0xFA38 ^ 0xFAF3;
        kotakbaz.rain.client.util.animations.A.A[0x7F36 ^ 0x7F39] = 0xFFFF80F5 ^ 0x7F39;
        kotakbaz.rain.client.util.animations.A.A[0xC146 ^ 0xC14B] = 0xC17C ^ 0xC14B;
        kotakbaz.rain.client.util.animations.A.A[0xC4E3 ^ 0xC4F2] = 0xFFFF3B56 ^ 0xC4F2;
        kotakbaz.rain.client.util.animations.A.A[0x5E6F ^ 0x5E7F] = 0x5E77 ^ 0x5E7F;
        kotakbaz.rain.client.util.animations.A.A[0x1080 ^ 0x1085] = 0xFFFFEF02 ^ 0x1085;
        kotakbaz.rain.client.util.animations.A.A[0x3DA5 ^ 0x3DA7] = 0xFFFFC23F ^ 0x3DA7;
        kotakbaz.rain.client.util.animations.A.A[0xFD14 ^ 0xFD1C] = 0xFD1B ^ 0xFD1C;
        kotakbaz.rain.client.util.animations.A.A[0x1649 ^ 0x164E] = 0x163E ^ 0x164E;
        kotakbaz.rain.client.util.animations.A.A[0x10098 ^ 0x10094] = 0x100AD ^ 0x10094;
        kotakbaz.rain.client.util.animations.A.A[0x8332 ^ 0x8333] = 0x8370 ^ 0x8333;
        kotakbaz.rain.client.util.animations.A.A[0x4E16 ^ 0x4E1D] = 0x4E76 ^ 0x4E1D;
        kotakbaz.rain.client.util.animations.A.A[0x1940 ^ 0x194A] = 0xFFFFE684 ^ 0x194A;
        kotakbaz.rain.client.util.animations.A.A[0xA8C1 ^ 0xA8C7] = 0xA890 ^ 0xA8C7;
        kotakbaz.rain.client.util.animations.A.A[0x2617 ^ 0x2613] = 0x2656 ^ 0x2613;
        kotakbaz.rain.client.util.animations.A.A[0x8B11 ^ 0x8B18] = 0x8B41 ^ 0x8B18;
        kotakbaz.rain.client.util.animations.A.A[0x2132 ^ 0x213C] = 0x2112 ^ 0x213C;
    }
}

