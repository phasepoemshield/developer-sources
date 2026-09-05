/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class02072;

public class class02078
implements class02072 {
    public int N;
    public int y;
    public int L;
    public int u;
    public float i;
    public float R;

    @Override
    public class02078 N(float f) {
        this.i = f;
        return this;
    }

    public class02078() {
    }

    public class02078(class02078 class020782) {
        this.N = class020782.N;
        this.y = class020782.y;
        this.L = class020782.L;
        this.u = class020782.u;
        this.i = class020782.i;
        this.R = class020782.R;
    }

    @Override
    public class02078 B() {
        return this;
    }

    @Override
    public class02078 N(int n) {
        return this.N(n, n);
    }

    @Override
    public class02078 y(int n) {
        this.N = n;
        return this;
    }

    @Override
    public class02078 M(int n) {
        return ((class02078)this.L(n)).i(n);
    }

    @Override
    public class02078 u(int n) {
        this.L = n;
        return this;
    }

    @Override
    public class02078 M() {
        return new class02078(this);
    }

    @Override
    public class02078 L(int n) {
        this.y = n;
        return this;
    }

    @Override
    public class02078 y(float f) {
        this.R = f;
        return this;
    }

    @Override
    public class02078 N(float f, float f2) {
        this.i = f;
        this.R = f2;
        return this;
    }

    @Override
    public class02078 N(int n, int n2, int n3, int n4) {
        return ((class02078)this.y(n).u(n3).L(n2)).i(n4);
    }

    @Override
    public class02078 N(int n, int n2) {
        return this.R(n).M(n2);
    }

    @Override
    public class02078 i(int n) {
        this.u = n;
        return this;
    }

    @Override
    public class02078 R(int n) {
        return this.y(n).u(n);
    }
}

