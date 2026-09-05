/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09898;
import Nursultan.class10021;

public final class class09937
implements class09898 {
    private final class10021 N;
    private float y;
    private float L;
    private float u;
    private float i;
    private float R;
    private float M;
    private float B;
    private float Z;
    private float z;
    private float U;
    private float E;
    private float W;
    private int m;
    private float P;
    private String s = "";
    private float T;
    private float b;
    private int j;
    private float v;
    private float n;
    private float t;
    private float G;
    private int l = -1;
    private boolean d;
    private Object w;

    private void w() {
        ++this.j;
        this.N.e();
    }

    public void L(float f) {
        float f2 = Math.max(0.0f, f);
        if (class09937.M(this.i, f2)) {
            return;
        }
        this.i = f2;
        this.w();
    }

    public void L(float f, float f2) {
        if (class09937.M(this.y, f) && class09937.M(this.L, f2)) {
            return;
        }
        this.y = f;
        this.L = f2;
        this.w();
    }

    @Override
    public float L() {
        return this.L;
    }

    @Override
    public float M() {
        return this.U;
    }

    private static boolean M(float f, float f2) {
        return Float.floatToIntBits(f) == Float.floatToIntBits(f2);
    }

    public float P() {
        return this.b;
    }

    public boolean T() {
        return this.d;
    }

    class09937(class10021 class100212) {
        this.N = class100212;
    }

    @Override
    public float B() {
        return this.E;
    }

    @Override
    public float Z() {
        return this.W;
    }

    @Override
    public float i() {
        return this.i;
    }

    public void i(float f, float f2) {
        float f3 = Math.max(0.0f, class09693.N((float)f, (float)f2));
        float f4 = class09693.N((float)this.T, (float)0.0f, (float)f3);
        if (class09937.M(this.b, f3) && class09937.M(this.T, f4)) {
            return;
        }
        this.b = f3;
        this.T = f4;
        this.w();
    }

    public float b() {
        return this.v;
    }

    public int s() {
        return this.l;
    }

    public float n() {
        return this.G;
    }

    public float l() {
        return this.B;
    }

    public float d() {
        return this.Z;
    }

    public float m() {
        return this.T;
    }

    public float t() {
        return this.R;
    }

    public float v() {
        return this.t;
    }

    public float j() {
        return this.n;
    }

    public float U() {
        return this.P;
    }

    public int z() {
        return this.m;
    }

    @Override
    public float u() {
        return this.u;
    }

    public void u(float f, float f2) {
        this.B = f;
        this.Z = f2;
    }

    private float u(float f) {
        return class09693.N((float)f, (float)0.0f, (float)this.b);
    }

    public void y(float f, float f2) {
        float f3 = Math.max(0.0f, f);
        float f4 = Math.max(0.0f, f2);
        if (class09937.M(this.u, f3) && class09937.M(this.i, f4)) {
            return;
        }
        this.u = f3;
        this.i = f4;
        this.w();
    }

    public void y(float f) {
        float f2 = Math.max(0.0f, f);
        if (class09937.M(this.u, f2)) {
            return;
        }
        this.u = f2;
        this.w();
    }

    @Override
    public float y() {
        return this.y;
    }

    public String E() {
        return this.s;
    }

    public void N(float f, float f2, float f3, float f4, int n, boolean bl) {
        this.v = f;
        this.n = f2;
        this.t = f3;
        this.G = f4;
        this.l = n;
        this.d = bl;
    }

    public void N(float f) {
        this.P = f;
    }

    public void N(float f, float f2, float f3, float f4) {
        float f5 = Math.max(0.0f, f3);
        float f6 = Math.max(0.0f, f4);
        if (class09937.M(this.z, f) && class09937.M(this.U, f2) && class09937.M(this.E, f5) && class09937.M(this.W, f6)) {
            return;
        }
        this.z = f;
        this.U = f2;
        this.E = f5;
        this.W = f6;
        this.w();
    }

    public Object N() {
        return this.w;
    }

    public void N(String string) {
        String string2;
        String string3 = string2 = string == null ? "" : string;
        if (this.s.equals(string2)) {
            return;
        }
        this.s = string2;
        this.w();
    }

    public void N(float f, float f2) {
        this.R = Math.max(0.0f, f);
        this.M = Math.max(0.0f, f2);
    }

    public void N(Object object) {
        this.w = object;
    }

    public void N(int n) {
        if (this.m == n) {
            return;
        }
        this.m = n;
        this.w();
        this.N.H();
    }

    public int W() {
        return this.j;
    }

    @Override
    public float R() {
        return this.z;
    }

    public boolean R(float f, float f2) {
        float f3 = class09693.N((float)f, (float)f2);
        float f4 = this.u(f3);
        if (class09937.M(this.T, f4)) {
            return false;
        }
        this.T = f4;
        this.w();
        return true;
    }

    public float G() {
        return this.M;
    }
}

