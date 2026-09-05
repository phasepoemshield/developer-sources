/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09916;

final class class09892 {
    private boolean N = true;
    private float y;
    private float L;
    private float u;
    private float i;

    private void L(float f, float f2, float f3, float f4) {
        if (f3 <= f || f4 <= f2) {
            return;
        }
        if (this.N) {
            this.y = f;
            this.L = f2;
            this.u = f3;
            this.i = f4;
            this.N = false;
            return;
        }
        this.y = Math.min(this.y, f);
        this.L = Math.min(this.L, f2);
        this.u = Math.max(this.u, f3);
        this.i = Math.max(this.i, f4);
    }

    class09916 L() {
        if (this.N) {
            return new class09916(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return new class09916(this.y, this.L, this.u - this.y, this.i - this.L);
    }

    class09892() {
    }

    void y(float f, float f2, float f3, float f4) {
        if (this.N) {
            return;
        }
        this.y = Math.max(this.y, f);
        this.L = Math.max(this.L, f2);
        this.u = Math.min(this.u, f3);
        this.i = Math.min(this.i, f4);
        if (this.u <= this.y || this.i <= this.L) {
            this.N = true;
        }
    }

    boolean y() {
        return this.N;
    }

    void N() {
        this.N = true;
        this.y = 0.0f;
        this.L = 0.0f;
        this.u = 0.0f;
        this.i = 0.0f;
    }

    void N(float f, float f2, float f3, float f4) {
        if (!(Float.isFinite(f) && Float.isFinite(f2) && Float.isFinite(f3) && Float.isFinite(f4))) {
            return;
        }
        if (f3 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        this.L(f, f2, f + f3, f2 + f4);
    }

    void N(class09892 class098922) {
        if (class098922.N) {
            return;
        }
        this.L(class098922.y, class098922.L, class098922.u, class098922.i);
    }

    void N(float f, float f2) {
        if (this.N || f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.y += f;
        this.L += f2;
        this.u += f;
        this.i += f2;
    }
}

