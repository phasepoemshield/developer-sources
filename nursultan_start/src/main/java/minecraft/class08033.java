/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class08043;

public class class08033 {
    private static final boolean R = false;
    private static final boolean M = false;
    private static final boolean B = false;
    private static final boolean Z = false;
    private static final boolean z = true;
    private static final float U = 0.05f;
    private static final float E = 0.1f;
    public boolean N;
    public boolean y;
    public boolean L;
    public boolean u;
    public boolean i = true;
    private float W = 0.05f;
    private float m = 0.1f;

    public class08043 L() {
        return new class08043(this.N, this.y, this.L, this.u, this.i, this.W, this.m);
    }

    public float y() {
        return this.m;
    }

    public void y(float f) {
        this.m = f;
    }

    public void N(float f) {
        this.W = f;
    }

    public float N() {
        return this.W;
    }

    public void N(class08043 class080432) {
        this.N = class080432.N();
        this.y = class080432.y();
        this.L = class080432.L();
        this.u = class080432.u();
        this.i = class080432.i();
        this.W = class080432.R();
        this.m = class080432.M();
    }
}

