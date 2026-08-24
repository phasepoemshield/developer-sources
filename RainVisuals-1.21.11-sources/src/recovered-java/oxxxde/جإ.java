/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u062c\u0625 {
    private static final ThreadLocal<Float> ALPHA = ThreadLocal.withInitial(() -> Float.valueOf(1.0f));

    public static float currentAlpha() {
        return ALPHA.get().floatValue();
    }

    private \u062c\u0625() {
    }

    public static void withAlpha(float alpha, Runnable renderCall) {
        float previous = ALPHA.get().floatValue();
        ALPHA.set(Float.valueOf(Math.max(0.0f, Math.min(1.0f, alpha))));
        try {
            renderCall.run();
        }
        finally {
            ALPHA.set(Float.valueOf(previous));
        }
    }
}

