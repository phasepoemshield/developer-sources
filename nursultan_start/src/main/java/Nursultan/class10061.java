/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class10036;

final class class10061 {
    float N;
    float y;
    float L;
    float u;
    float i;
    float R;
    float M;
    float B;
    String Z;
    private boolean U;
    private boolean E;
    int z = -1;

    float L(class10036 class100362) {
        return class100362 == class10036.WIDTH ? this.N : this.y;
    }

    void L(class10036 class100362, float f) {
        if (class100362 == class10036.WIDTH) {
            this.i = Math.max(0.0f, f);
            return;
        }
        this.R = Math.max(0.0f, f);
    }

    class10061() {
    }

    void i(class10036 class100362) {
        float f = this.L(class100362);
        this.L(class100362, Math.min(f, this.N(class100362)));
        float f2 = this.R(class100362) ? f : Math.min(f, this.y(class100362));
        this.u(class100362, f2);
    }

    float u(class10036 class100362) {
        return class100362 == class10036.WIDTH ? this.L : this.u;
    }

    void u(class10036 class100362, float f) {
        if (class100362 == class10036.WIDTH) {
            this.M = Math.max(0.0f, f);
            return;
        }
        this.B = Math.max(0.0f, f);
    }

    float y(class10036 class100362) {
        return class100362 == class10036.WIDTH ? this.M : this.B;
    }

    void y(class10036 class100362, float f) {
        if (class100362 == class10036.WIDTH) {
            this.L = Math.max(0.0f, f);
            return;
        }
        this.u = Math.max(0.0f, f);
    }

    void N() {
        this.N = 0.0f;
        this.y = 0.0f;
        this.L = 0.0f;
        this.u = 0.0f;
        this.i = 0.0f;
        this.R = 0.0f;
        this.M = 0.0f;
        this.B = 0.0f;
        this.Z = null;
        this.U = false;
        this.E = false;
    }

    void N(class10036 class100362, boolean bl) {
        if (class100362 == class10036.WIDTH) {
            this.U = bl;
            return;
        }
        this.E = bl;
    }

    void N(class10036 class100362, float f) {
        if (class100362 == class10036.WIDTH) {
            this.N = Math.max(0.0f, f);
            return;
        }
        this.y = Math.max(0.0f, f);
    }

    float N(class10036 class100362) {
        return class100362 == class10036.WIDTH ? this.i : this.R;
    }

    private boolean R(class10036 class100362) {
        return class100362 == class10036.WIDTH ? this.U : this.E;
    }
}

