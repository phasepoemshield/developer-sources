/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class06889;

public class class08605 {
    protected int N;
    public class06889 y;
    public float L;
    public float u;

    class08605(int n, class06889 class068892, float f, float f2) {
        this.N = n;
        this.y = class068892;
        this.L = f;
        this.u = f2;
    }

    public void N(float f, float f2) {
        this.L += f;
        this.u += f2;
    }

    public void N(class06889 class068892) {
        this.y = this.y.i(class068892);
    }

    public void N() {
        --this.N;
    }
}

