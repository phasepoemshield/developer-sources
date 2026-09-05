/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class04995;

public class class03269 {
    public float N;
    public float y;
    public float L;
    private float u = 1.0f;

    public float L() {
        return this.L * this.u;
    }

    public float L(float f) {
        return (this.L - this.y * (1.0f - f)) * this.u;
    }

    public boolean u() {
        return this.y > 1.0E-5f;
    }

    public float y() {
        return this.y;
    }

    public float y(float f) {
        return Math.min(class04995.B((float)f, (float)this.N, (float)this.y), 1.0f);
    }

    public void N(float f) {
        this.y = f;
    }

    public void N() {
        this.N = 0.0f;
        this.y = 0.0f;
        this.L = 0.0f;
    }

    public void N(float f, float f2, float f3) {
        this.N = this.y;
        this.y += (f - this.y) * f2;
        this.L += this.y;
        this.u = f3;
    }
}

