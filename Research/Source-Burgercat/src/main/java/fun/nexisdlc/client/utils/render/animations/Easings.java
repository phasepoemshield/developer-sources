package fun.nexisdlc.client.utils.render.animations;

/**
 * Collection of high-quality easing curves inspired by cubic bezier presets and
 * physically-plausible interpolations. These can be combined with the
 * spring-based animators to sculpt motion.
 */
public final class Easings {

    // --- LINEAR ---
    public static final EasingFunction LINEAR = t -> clamp(t);

    // --- QUAD ---
    public static final EasingFunction EASE_IN_QUAD = t -> {
        float p = clamp(t);
        return p * p;
    };

    public static final EasingFunction EASE_OUT_QUAD = t -> {
        float p = clamp(t);
        return 1.0f - (1.0f - p) * (1.0f - p);
    };

    public static final EasingFunction EASE_IN_OUT_QUAD = t -> {
        float p = clamp(t);
        return p < 0.5f ? 2.0f * p * p : 1.0f - (float) Math.pow(-2.0f * p + 2.0f, 2) / 2.0f;
    };

    // --- CUBIC ---
    public static final EasingFunction EASE_IN_CUBIC = t -> {
        float p = clamp(t);
        return p * p * p;
    };

    public static final EasingFunction EASE_OUT_CUBIC = t -> {
        float p = clamp(t);
        float inv = 1.0f - p;
        return 1.0f - inv * inv * inv;
    };

    public static final EasingFunction EASE_IN_OUT_CUBIC = t -> {
        float p = clamp(t);
        return p < 0.5f ? 4.0f * p * p * p : 1.0f - (float) Math.pow(-2.0f * p + 2.0f, 3) / 2.0f;
    };

    // --- QUART ---
    public static final EasingFunction EASE_IN_QUART = t -> {
        float p = clamp(t);
        return p * p * p * p;
    };

    public static final EasingFunction EASE_OUT_QUART = t -> {
        float p = clamp(t);
        float inv = 1.0f - p;
        return 1.0f - inv * inv * inv * inv;
    };

    public static final EasingFunction EASE_IN_OUT_QUART = t -> {
        float p = clamp(t);
        return p < 0.5f ? 8.0f * p * p * p * p : 1.0f - (float) Math.pow(-2.0f * p + 2.0f, 4) / 2.0f;
    };

    // --- QUINT ---
    public static final EasingFunction EASE_IN_QUINT = t -> {
        float p = clamp(t);
        return p * p * p * p * p;
    };

    public static final EasingFunction EASE_OUT_QUINT = t -> {
        float p = clamp(t);
        float inv = 1.0f - p;
        return 1.0f - inv * inv * inv * inv * inv;
    };

    public static final EasingFunction EASE_IN_OUT_QUINT = t -> {
        float p = clamp(t);
        if (p < 0.5f) {
            float scaled = p * 2.0f;
            return 0.5f * scaled * scaled * scaled * scaled * scaled;
        }
        float scaled = (p - 0.5f) * 2.0f;
        float inv = 1.0f - scaled;
        return 1.0f - 0.5f * inv * inv * inv * inv * inv;
    };

    // --- SINE ---
    public static final EasingFunction EASE_IN_SINE = t -> {
        float p = clamp(t);
        return 1.0f - (float) Math.cos((p * Math.PI) / 2.0);
    };

    public static final EasingFunction EASE_OUT_SINE = t -> {
        float p = clamp(t);
        return (float) Math.sin((p * Math.PI) / 2.0);
    };

    public static final EasingFunction EASE_IN_OUT_SINE = t -> {
        float p = clamp(t);
        return -(float) (Math.cos(Math.PI * p) - 1.0) / 2.0f;
    };

    // --- BACK ---
    private static final float C1 = 1.70158f;
    private static final float C2 = C1 * 1.525f;
    private static final float C3 = C1 + 1.0f;

    public static final EasingFunction EASE_IN_BACK = t -> {
        float p = clamp(t);
        return C3 * p * p * p - C1 * p * p;
    };

    public static final EasingFunction EASE_OUT_BACK = t -> {
        float p = clamp(t);
        float inv = p - 1.0f;
        return 1.0f + C3 * (float) Math.pow(inv, 3) + C1 * (float) Math.pow(inv, 2);
    };

    public static final EasingFunction EASE_IN_OUT_BACK = t -> {
        float p = clamp(t);
        return p < 0.5f
                ? ((float) Math.pow(2.0f * p, 2) * ((C2 + 1.0f) * 2.0f * p - C2)) / 2.0f
                : ((float) Math.pow(2.0f * p - 2.0f, 2) * ((C2 + 1.0f) * (p * 2.0f - 2.0f) + C2) + 2.0f) / 2.0f;
    };

    // --- CIRC ---
    public static final EasingFunction EASE_IN_CIRC = t -> {
        float p = clamp(t);
        return 1.0f - (float) Math.sqrt(1.0f - (float) Math.pow(p, 2));
    };

    public static final EasingFunction EASE_OUT_CIRC = t -> {
        float p = clamp(t);
        return (float) Math.sqrt(1.0f - (float) Math.pow(p - 1.0f, 2));
    };

    public static final EasingFunction EASE_IN_OUT_CIRC = t -> {
        float p = clamp(t);
        return p < 0.5f
                ? (1.0f - (float) Math.sqrt(1.0f - (float) Math.pow(2.0f * p, 2))) / 2.0f
                : ((float) Math.sqrt(1.0f - (float) Math.pow(-2.0f * p + 2.0f, 2)) + 1.0f) / 2.0f;
    };

    // --- ELASTIC ---
    private static final float C4 = (float) (2.0 * Math.PI) / 3.0f;
    private static final float C5 = (float) (2.0 * Math.PI) / 4.5f;

    public static final EasingFunction EASE_IN_ELASTIC = t -> {
        float p = clamp(t);
        return p == 0.0f ? 0.0f : p == 1.0f ? 1.0f
                                  : -(float) Math.pow(2, 10.0f * p - 10.0f) * (float) Math.sin((p * 10.0f - 10.75f) * C4);
    };

    public static final EasingFunction EASE_OUT_ELASTIC = t -> {
        float p = clamp(t);
        return p == 0.0f ? 0.0f : p == 1.0f ? 1.0f
                                  : (float) Math.pow(2, -10.0f * p) * (float) Math.sin((p * 10.0f - 0.75f) * C4) + 1.0f;
    };

    public static final EasingFunction EASE_IN_OUT_ELASTIC = t -> {
        float p = clamp(t);
        return p == 0.0f ? 0.0f : p == 1.0f ? 1.0f
                                  : p < 0.5f
                                    ? -((float) Math.pow(2, 20.0f * p - 10.0f) * (float) Math.sin((20.0f * p - 11.125f) * C5)) / 2.0f
                                    : ((float) Math.pow(2, -20.0f * p + 10.0f) * (float) Math.sin((20.0f * p - 11.125f) * C5)) / 2.0f + 1.0f;
    };

    // --- BOUNCE ---
    public static final EasingFunction EASE_IN_BOUNCE = t -> {
        float p = clamp(t);
        return 1.0f - bounceOut(1.0f - p);
    };

    public static final EasingFunction EASE_OUT_BOUNCE = t -> {
        float p = clamp(t);
        return bounceOut(p);
    };

    public static final EasingFunction EASE_IN_OUT_BOUNCE = t -> {
        float p = clamp(t);
        return p < 0.5f
                ? (1.0f - bounceOut(1.0f - 2.0f * p)) / 2.0f
                : (1.0f + bounceOut(2.0f * p - 1.0f)) / 2.0f;
    };

    // --- SPECIAL / CUSTOM ---
    public static final EasingFunction SMOOTH_STEP = t -> {
        float p = clamp(t);
        return p * p * (3.0f - 2.0f * p);
    };

    public static final EasingFunction FIGMA_EASE_IN_OUT = cubicBezier(0.42f, 0.0f, 0.58f, 1.0f);


    private Easings() {
    }

    // --- UTILS ---
    private static float clamp(float value) {
        if (value <= 0.0f) return 0.0f;
        if (value >= 1.0f) return 1.0f;
        return value;
    }

    private static float bounceOut(float t) {
        float n1 = 7.5625f;
        float d1 = 2.75f;

        if (t < 1.0f / d1) {
            return n1 * t * t;
        } else if (t < 2.0f / d1) {
            float p = t - 1.5f / d1;
            return n1 * p * p + 0.75f;
        } else if (t < 2.5f / d1) {
            float p = t - 2.25f / d1;
            return n1 * p * p + 0.9375f;
        } else {
            float p = t - 2.625f / d1;
            return n1 * p * p + 0.984375f;
        }
    }

    private static EasingFunction cubicBezier(float x1, float y1, float x2, float y2) {
        return t -> {
            float p = clamp(t);
            if (p <= 0f || p >= 1f) {
                return p;
            }

            // Invert X(u)=p with binary search, then evaluate Y(u).
            float lo = 0f;
            float hi = 1f;
            float u = p;
            for (int i = 0; i < 14; i++) {
                float x = bezier(u, x1, x2);
                if (x < p) {
                    lo = u;
                } else {
                    hi = u;
                }
                u = (lo + hi) * 0.5f;
            }
            return clamp(bezier(u, y1, y2));
        };
    }

    private static float bezier(float t, float p1, float p2) {
        float omt = 1f - t;
        return 3f * omt * omt * t * p1 + 3f * omt * t * t * p2 + t * t * t;
    }
}