package ru.destra.animation;

public interface Easing {
    // Class-based easings (no dependencies, must come first)
    PowerEasing ELASTIC = new EasingElastic();
    PowerEasing BACK = new EasingBack();
    PowerEasing BOUNCE_POWER = new EasingBounce();
    BaseEasing EXPO_BASE = new EasingBackIn();
    BaseEasing QUAD_BASE = new EasingQuad();
    BaseEasing CUBIC_BASE = new EasingCubic();

    // Basic easing lambdas
    Easing LINEAR = (t, b, c, d) -> c * t / d + b;

    Easing EASE_IN_QUAD = (t, b, c, d) -> {
        float v = t / d;
        return c * v * v + b;
    };

    Easing EASE_OUT_QUAD = (t, b, c, d) -> {
        float v = t / d;
        return -c * v * (v - 2.0F) + b;
    };

    Easing EASE_IN_OUT_QUAD = (t, b, c, d) -> {
        float v = t / (d / 2.0F);
        if (v < 1.0F) return c / 2.0F * v * v + b;
        v--;
        return -c / 2.0F * (v * (v - 2.0F) - 1.0F) + b;
    };

    Easing EASE_IN_CUBIC = (t, b, c, d) -> {
        float v = t / d;
        return c * v * v * v + b;
    };

    Easing EASE_OUT_CUBIC = (t, b, c, d) -> {
        float v = t / d - 1.0F;
        return c * (v * v * v + 1.0F) + b;
    };

    Easing EASE_IN_OUT_CUBIC = (t, b, c, d) -> {
        float v = t / (d / 2.0F);
        if (v < 1.0F) return c / 2.0F * v * v * v + b;
        v -= 2.0F;
        return c / 2.0F * (v * v * v + 2.0F) + b;
    };

    Easing EASE_IN_QUART = (t, b, c, d) -> {
        float v = t / d;
        return c * v * v * v * v + b;
    };

    Easing EASE_OUT_QUART = (t, b, c, d) -> {
        float v = t / d - 1.0F;
        return -c * (v * v * v * v - 1.0F) + b;
    };

    Easing EASE_IN_OUT_QUART = (t, b, c, d) -> {
        float v = t / (d / 2.0F);
        if (v < 1.0F) return c / 2.0F * v * v * v * v + b;
        v -= 2.0F;
        return -c / 2.0F * (v * v * v * v - 2.0F) + b;
    };

    Easing EASE_IN_QUINT = (t, b, c, d) -> {
        float v = t / d;
        return c * v * v * v * v * v + b;
    };

    Easing EASE_OUT_QUINT = (t, b, c, d) -> {
        float v = t / d - 1.0F;
        return c * (v * v * v * v * v + 1.0F) + b;
    };

    Easing EASE_IN_OUT_QUINT = (t, b, c, d) -> {
        float v = t / (d / 2.0F);
        if (v < 1.0F) return c / 2.0F * v * v * v * v * v + b;
        v -= 2.0F;
        return c / 2.0F * (v * v * v * v * v + 2.0F) + b;
    };

    Easing EASE_IN_SINE = (t, b, c, d) ->
        -c * (float) Math.cos(t / d * (Math.PI / 2.0)) + c + b;

    Easing EASE_OUT_SINE = (t, b, c, d) ->
        c * (float) Math.sin(t / d * (Math.PI / 2.0)) + b;

    Easing EASE_IN_OUT_SINE = (t, b, c, d) ->
        -c / 2.0F * ((float) Math.cos(Math.PI * t / d) - 1.0F) + b;

    Easing EASE_IN_EXPO = (t, b, c, d) ->
        t == 0.0F ? b : c * (float) Math.pow(2.0, 10.0F * (t / d - 1.0F)) + b;

    Easing EASE_OUT_EXPO = (t, b, c, d) ->
        t == d ? b + c : c * (-((float) Math.pow(2.0, -10.0F * t / d)) + 1.0F) + b;

    Easing EASE_IN_OUT_EXPO = (t, b, c, d) -> {
        if (t == 0.0F) return b;
        if (t == d) return b + c;
        float v = t / (d / 2.0F);
        if (v < 1.0F) return c / 2.0F * (float) Math.pow(2.0, 10.0F * (v - 1.0F)) + b;
        v--;
        return c / 2.0F * (-((float) Math.pow(2.0, -10.0F * v)) + 2.0F) + b;
    };

    Easing EASE_IN_CIRC = (t, b, c, d) -> {
        float v = t / d;
        return -c * ((float) Math.sqrt(1.0F - v * v) - 1.0F) + b;
    };

    Easing EASE_OUT_CIRC = (t, b, c, d) -> {
        float v = t / d - 1.0F;
        return c * (float) Math.sqrt(1.0F - v * v) + b;
    };

    Easing EASE_IN_OUT_CIRC = (t, b, c, d) -> {
        float v = t / (d / 2.0F);
        if (v < 1.0F) return -c / 2.0F * ((float) Math.sqrt(1.0F - v * v) - 1.0F) + b;
        v -= 2.0F;
        return c / 2.0F * ((float) Math.sqrt(1.0F - v * v) + 1.0F) + b;
    };

    // Bounce easings (depend on earlier easings, must come last)
    Easing EASE_OUT_BOUNCE = (t, b, c, d) -> {
        if ((t /= d) < 0.36363637F) {
            return c * (7.5625F * t * t) + b;
        } else if (t < 0.72727275F) {
            float v = t - 0.54545456F;
            return c * (7.5625F * v * v + 0.75F) + b;
        } else if (t < 0.90909094F) {
            float v = t - 0.8181818F;
            return c * (7.5625F * v * v + 0.9375F) + b;
        } else {
            float v = t - 0.95454544F;
            return c * (7.5625F * v * v + 0.984375F) + b;
        }
    };

    Easing EASE_IN_BOUNCE = (t, b, c, d) ->
        c - EASE_OUT_BOUNCE.ease(d - t, 0.0F, c, d) + b;

    Easing EASE_IN_OUT_BOUNCE = (t, b, c, d) ->
        t < d / 2.0F
            ? EASE_IN_BOUNCE.ease(t * 2.0F, 0.0F, c, d) * 0.5F + b
            : EASE_OUT_BOUNCE.ease(t * 2.0F - d, 0.0F, c, d) * 0.5F + c * 0.5F + b;

    float ease(float t, float b, float c, float d);

    /** Kept for binary compatibility. Fields are now initialized inline. */
    static void init() {}
}
