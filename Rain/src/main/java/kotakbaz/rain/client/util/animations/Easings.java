/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.animations;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0007J5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/client/util/animations/Easings;", "", "<init>", "()V", "", "t", "linear", "(F)F", "standard", "standardAccelerate", "standardDecelerate", "emphasized", "emphasizedAccelerate", "emphasizedDecelerate", "x1", "y1", "x2", "y2", "cubicBezier", "(FFFFF)F", "sampleCurveX", "(FFF)F", "sampleCurveY", "sampleCurveDerivativeX", "x", "solveCurveX", "rain-visuals"})
public final class Easings {
    @NotNull
    public static final Easings INSTANCE;
    public static int[] A;

    private Easings() {
    }

    public final float linear(float t2) {
        return RangesKt.coerceIn(t2, 0.0f, 1.0f);
    }

    public final float standard(float t2) {
        return this.cubicBezier(t2, 0.2f, 0.0f, 0.0f, 1.0f);
    }

    public final float standardAccelerate(float t2) {
        return this.cubicBezier(t2, 0.3f, 0.0f, 1.0f, 1.0f);
    }

    public final float standardDecelerate(float t2) {
        return this.cubicBezier(t2, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public final float emphasized(float t2) {
        return this.cubicBezier(t2, 0.2f, 0.0f, 0.0f, 1.0f);
    }

    public final float emphasizedAccelerate(float t2) {
        return this.cubicBezier(t2, 0.3f, 0.0f, 0.8f, 0.15f);
    }

    public final float emphasizedDecelerate(float t2) {
        return this.cubicBezier(t2, 0.05f, 0.7f, 0.1f, 1.0f);
    }

    public final float cubicBezier(float t2, float x1, float y1, float x2, float y2) {
        float f2 = RangesKt.coerceIn(t2, 0.0f, 1.0f);
        float f3 = this.solveCurveX(f2, x1, x2);
        return RangesKt.coerceIn(this.sampleCurveY(f3, y1, y2), 0.0f, 1.0f);
    }

    private final float sampleCurveX(float t2, float x1, float x2) {
        float f2 = 1.0f - t2;
        return 3.0f * f2 * f2 * t2 * x1 + 3.0f * f2 * t2 * t2 * x2 + t2 * t2 * t2;
    }

    private final float sampleCurveY(float t2, float y1, float y2) {
        float f2 = 1.0f - t2;
        return 3.0f * f2 * f2 * t2 * y1 + 3.0f * f2 * t2 * t2 * y2 + t2 * t2 * t2;
    }

    private final float sampleCurveDerivativeX(float t2, float x1, float x2) {
        float f2 = 1.0f - t2;
        return 3.0f * f2 * f2 * x1 + 6.0f * f2 * t2 * (x2 - x1) + 3.0f * t2 * t2 * (1.0f - x2);
    }

    private final float solveCurveX(float x2, float x1, float x22) {
        long l2 = -1882755184547884793L;
        long l3 = -8319964362590130316L;
        long l4 = 7362293306257576406L;
        long l5 = 1284940477544579171L;
        float f2 = 0.0f;
        f2 = x2;
        long l6 = l4;
        int n2 = A[0];
        n2 -= A[1];
        l4 = l6 ^ (6L ^ l6) & -1L >>> (n2 += A[2]);
        long l7 = l5;
        int n3 = A[3];
        n3 -= A[4];
        l5 = l7 ^ (0L ^ l7) & -1L << (n3 += A[5]);
        while (true) {
            int n4 = A[6];
            n4 ^= A[7];
            if ((int)(l5 >>> (n4 -= A[8])) >= (int)l4) break;
            int n5 = A[9];
            n5 -= A[10];
            long l8 = l5;
            int n6 = A[12];
            n6 ^= A[13];
            l5 = l8 ^ ((long)((int)(l5 >>> (n5 -= A[11]))) ^ l8) & -1L >>> (n6 ^= A[14]);
            long l9 = l2;
            int n7 = A[15];
            n7 ^= A[16];
            l2 = l9 ^ (0L ^ l9) & -1L << (n7 -= A[17]);
            float f3 = INSTANCE.sampleCurveX(f2, x1, x22) - x2;
            if (Math.abs(f3) < 1.0E-5f) {
                return f2;
            }
            float f4 = INSTANCE.sampleCurveDerivativeX(f2, x1, x22);
            if (!(Math.abs(f4) < 1.0E-6f)) {
                f2 -= f3 / f4;
            }
            l5 += 0x100000000L;
        }
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = x2;
        while (f5 < f6) {
            float f8 = this.sampleCurveX(f7, x1, x22);
            if (Math.abs(f8 - x2) < 1.0E-5f) {
                return f7;
            }
            if (x2 > f8) {
                f5 = f7;
            } else {
                f6 = f7;
            }
            f7 = (f6 + f5) * 0.5f;
        }
        return f7;
    }

    static {
        Easings.a();
        INSTANCE = new Easings();
    }

    public static void a() {
        A = new int[0xCC35 ^ 0xCC27];
        Easings.A[0x2AE0 ^ 0x2AE3] = 0x2A3D ^ 0x2AE3;
        Easings.A[0xFAF3 ^ 0xFAF3] = 0xFA38 ^ 0xFAF3;
        Easings.A[0x7F36 ^ 0x7F39] = 0xFFFF80F5 ^ 0x7F39;
        Easings.A[0xC146 ^ 0xC14B] = 0xC17C ^ 0xC14B;
        Easings.A[0xC4E3 ^ 0xC4F2] = 0xFFFF3B56 ^ 0xC4F2;
        Easings.A[0x5E6F ^ 0x5E7F] = 0x5E77 ^ 0x5E7F;
        Easings.A[0x1080 ^ 0x1085] = 0xFFFFEF02 ^ 0x1085;
        Easings.A[0x3DA5 ^ 0x3DA7] = 0xFFFFC23F ^ 0x3DA7;
        Easings.A[0xFD14 ^ 0xFD1C] = 0xFD1B ^ 0xFD1C;
        Easings.A[0x1649 ^ 0x164E] = 0x163E ^ 0x164E;
        Easings.A[0x10098 ^ 0x10094] = 0x100AD ^ 0x10094;
        Easings.A[0x8332 ^ 0x8333] = 0x8370 ^ 0x8333;
        Easings.A[0x4E16 ^ 0x4E1D] = 0x4E76 ^ 0x4E1D;
        Easings.A[0x1940 ^ 0x194A] = 0xFFFFE684 ^ 0x194A;
        Easings.A[0xA8C1 ^ 0xA8C7] = 0xA890 ^ 0xA8C7;
        Easings.A[0x2617 ^ 0x2613] = 0x2656 ^ 0x2613;
        Easings.A[0x8B11 ^ 0x8B18] = 0x8B41 ^ 0x8B18;
        Easings.A[0x2132 ^ 0x213C] = 0x2112 ^ 0x213C;
    }
}

