/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01517
 *  minecraft.class07049
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class01517;
import minecraft.class07049;
import minecraft.class08036;

public class class03106 {
    public static final float N = 1.0f;
    protected float y = 20.0f;
    protected long L = class01517.N / 20L;
    protected int u = 0;
    protected boolean i = true;
    protected boolean R = false;

    public void L(int n) {
        this.u = n;
    }

    public float M() {
        return (float)this.L / (float)class01517.y;
    }

    public long B() {
        return this.L;
    }

    public boolean Z() {
        return this.i;
    }

    public int U() {
        return this.u;
    }

    public boolean z() {
        return this.u > 0;
    }

    public boolean E() {
        return this.R;
    }

    public boolean N(class07049 class070492) {
        return !this.Z() && !(class070492 instanceof class08036) && class070492.method_54757() <= 0;
    }

    public void N(boolean bl) {
        this.R = bl;
    }

    public void N(float f) {
        this.y = Math.max(f, 1.0f);
        this.L = (long)((double)class01517.N / (double)this.y);
    }

    public void W() {
        boolean bl = this.i = !this.R || this.u > 0;
        if (this.u > 0) {
            --this.u;
        }
    }

    public float R() {
        return this.y;
    }
}

