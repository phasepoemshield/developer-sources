/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0007J5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0015\u00a8\u0006\u001a"}, d2={"Loxxxde/\u0628\u0641;", "", "<init>", "()V", "", "t", "linear", "(F)F", "standard", "standardAccelerate", "standardDecelerate", "emphasized", "emphasizedAccelerate", "emphasizedDecelerate", "x1", "y1", "x2", "y2", "cubicBezier", "(FFFFF)F", "sampleCurveX", "(FFF)F", "sampleCurveY", "sampleCurveDerivativeX", "x", "solveCurveX", "rain-visuals"})
public final class \u0628\u0641 {
    @NotNull
    public static final \u0628\u0641 INSTANCE = new \u0628\u0641();

    public final float linear(float t) {
        return RangesKt.coerceIn(t, 0.0f, 1.0f);
    }

    public final float emphasizedDecelerate(float t) {
        return this.cubicBezier(t, 0.05f, 0.7f, 0.1f, 1.0f);
    }

    public final float cubicBezier(float t, float x1, float y1, float x2, float y2) {
        float clamped = RangesKt.coerceIn(t, 0.0f, 1.0f);
        float u = this.solveCurveX(clamped, x1, x2);
        return RangesKt.coerceIn(this.sampleCurveY(u, y1, y2), 0.0f, 1.0f);
    }

    public final float standard(float t) {
        return this.cubicBezier(t, 0.2f, 0.0f, 0.0f, 1.0f);
    }

    public final float standardAccelerate(float t) {
        return this.cubicBezier(t, 0.3f, 0.0f, 1.0f, 1.0f);
    }

    public final float standardDecelerate(float t) {
        return this.cubicBezier(t, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    private \u0628\u0641() {
    }

    private final float sampleCurveX(float t, float x1, float x2) {
        float inv = 1.0f - t;
        return 3.0f * inv * inv * t * x1 + 3.0f * inv * t * t * x2 + t * t * t;
    }

    /*
     * WARNING - void declaration
     */
    private final float solveCurveX(float x, float x1, float x2) {
        void var7_10;
        float t = 0.0f;
        t = x;
        int n = 6;
        for (int i = 0; i < n; ++i) {
            int it = i;
            boolean bl = false;
            float xEst = INSTANCE.sampleCurveX(t, x1, x2) - x;
            if (Math.abs(xEst) < 1.0E-5f) {
                return t;
            }
            float d = INSTANCE.sampleCurveDerivativeX(t, x1, x2);
            if (Math.abs(d) < 1.0E-6f) continue;
            t -= xEst / d;
        }
        float t0 = 0.0f;
        float t1 = 1.0f;
        float t2 = x;
        while (t0 < t1) {
            float xEst = this.sampleCurveX(t2, x1, x2);
            if (Math.abs(xEst - x) < 1.0E-5f) {
                return t2;
            }
            if (x > xEst) {
                t0 = t2;
            } else {
                t1 = t2;
            }
            t2 = (t1 + t0) * 0.5f;
        }
        return (float)var7_10;
    }

    private final float sampleCurveY(float t, float y1, float y2) {
        float inv = 1.0f - t;
        return 3.0f * inv * inv * t * y1 + 3.0f * inv * t * t * y2 + t * t * t;
    }

    public final float emphasized(float t) {
        return this.cubicBezier(t, 0.2f, 0.0f, 0.0f, 1.0f);
    }

    public final float emphasizedAccelerate(float t) {
        return this.cubicBezier(t, 0.3f, 0.0f, 0.8f, 0.15f);
    }

    private final float sampleCurveDerivativeX(float t, float x1, float x2) {
        float inv = 1.0f - t;
        return 3.0f * inv * inv * x1 + 6.0f * inv * t * (x2 - x1) + 3.0f * t * t * (1.0f - x2);
    }
}

