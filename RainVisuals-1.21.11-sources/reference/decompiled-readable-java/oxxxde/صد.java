/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u0635\u062f {
    private static final ThreadLocal<Float> ALPHA;
    private static final ThreadLocal<Boolean> ACTIVE;

    public static int applyAlpha(int color) {
        if (!ACTIVE.get().booleanValue()) {
            return color;
        }
        int alpha = Math.round(ALPHA.get().floatValue() * 255.0f);
        return color & 0xFFFFFF | alpha << 24;
    }

    private static float clamp(float value) {
        return Math.max(0.0f, Math.min(1.0f, value));
    }

    private \u0635\u062f() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void withAlpha(float alpha, Runnable action) {
        boolean previousActive = ACTIVE.get();
        float previousAlpha = ALPHA.get().floatValue();
        ACTIVE.set(true);
        ALPHA.set(Float.valueOf(\u0635\u062f.clamp(alpha)));
        try {
            action.run();
        }
        finally {
            ACTIVE.set(previousActive);
            ALPHA.set(Float.valueOf(previousAlpha));
        }
    }

    static {
        ACTIVE = ThreadLocal.withInitial(() -> false);
        ALPHA = ThreadLocal.withInitial(() -> Float.valueOf(1.0f));
    }
}

