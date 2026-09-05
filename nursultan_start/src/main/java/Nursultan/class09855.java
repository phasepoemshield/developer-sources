/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

final class class09855 {
    private static final float N = 1.0E-6f;
    private float y;
    private float L;

    boolean L(float f) {
        if (this.L()) {
            return true;
        }
        return this.y(f) > 0.0f;
    }

    private boolean L() {
        return this.y <= 1.0E-6f;
    }

    class09855(float f) {
        this.N(f);
    }

    private static float u(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f) || f <= 1.0E-6f) {
            return 0.0f;
        }
        return f;
    }

    float y(float f) {
        float f2 = Math.max(0.0f, f);
        if (this.L()) {
            return f2;
        }
        this.L += f2;
        float f3 = 1.0f / this.y;
        int n = (int)(this.L / f3);
        if (n <= 0) {
            return 0.0f;
        }
        float f4 = (float)n * f3;
        this.L -= f4;
        return f4;
    }

    void y() {
        this.L = 0.0f;
    }

    public float N() {
        return this.y;
    }

    public void N(float f) {
        this.y = class09855.u(f);
    }
}

