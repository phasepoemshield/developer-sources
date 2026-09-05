/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11908
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package Nursultan;

import Nursultan.class11908;
import java.util.List;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public class class11179 {
    private static double[] Z;
    private static double[] b;
    private static double[] j;
    private static double[] n;
    private static double[] t;
    private static double[] Y;
    private static double[] X;
    private static double[] a;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public Object L_0;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object i_0;
    public Object i_1;
    public boolean i_init;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public Object R_6;
    public Object R_7;
    public boolean R_init;

    private void L(double d, double d2, double d3) {
        if (((Boolean)this.R_7).booleanValue()) {
            return;
        }
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        if (!((Boolean)this.R_2).booleanValue() && (d != t[1] || d2 != Y[0] || d3 != Y[1]) && class04995.E((double)d) + class04995.E((double)d2) + class04995.E((double)d3) < (Double)y_0) {
            class06889 class068892 = class07049.method_20736(null, (class06889)new class06889(d, d2, d3), (class00734)((class00734)this.R_6), (class07299)((class03448)((class06202)class11179.y_1).T_3), List.of());
            d = class068892.M;
            d2 = class068892.B;
            d3 = class068892.Z;
        }
        if (d != Y[2] || d2 != n[0] || d3 != n[1]) {
            this.R_6 = ((class00734)this.R_6).u(d, d2, d3);
            this.t();
        }
        if (Math.abs(d5) >= n[2] && Math.abs(d2) < n[3]) {
            this.R_7 = true;
        }
        this.L_0 = d5 != d2 && d5 < n[4];
        if (d4 != d) {
            ((Vector3d)this.N_1).x = X[0];
        }
        if (d6 != d3) {
            ((Vector3d)this.N_1).z = X[1];
        }
    }

    public int L() {
        return (Integer)this.N_3;
    }

    public Vector3d M() {
        return (Vector3d)this.N_1;
    }

    private static void T() {
        y_0 = j[0];
    }

    public class11179(int n, int n2) {
        this.b();
        this.i_0 = n;
        this.i_1 = n2;
        this.N_2 = Float.valueOf(1.0f);
        this.N_4 = Float.valueOf(class11908.y((float)0.0f, (float)((float)Math.PI * 2)));
        this.N_5 = Float.valueOf(((Float)this.N_4).floatValue());
        float f = class11908.y((float)0.03f, (float)0.2f);
        this.R_0 = Float.valueOf(class11908.y((float)0.0f, (float)1.0f) < 0.5f ? -f : f);
        this.R_2 = false;
        this.N_1 = new Vector3d();
        this.u_0 = new Vector3d();
        this.u_1 = new Vector3d();
        this.N_0 = new Vector3d(b[0], b[1], b[2]);
        this.R_5 = a[0];
        this.R_6 = (class00734)y_2;
    }

    static {
        class11179.n();
        class11179.T();
        y_0 = (double)class04995.Z((int)100);
        y_1 = class06202.Nq();
        y_2 = new class00734(Z[0], Z[1], Z[2], Z[3], Z[4], Z[5]);
    }

    public Vector3d B() {
        return (Vector3d)this.u_0;
    }

    public Vector3d Z() {
        return (Vector3d)this.N_0;
    }

    public int i() {
        return (Integer)this.R_3;
    }

    private void b() {
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = 0;
            this.i_1 = 0;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = 0;
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
        }
        if (!this.R_init) {
            this.R_init = true;
            this.R_0 = Float.valueOf(0.0f);
            this.R_1 = Z[6];
            this.R_2 = false;
            this.R_3 = 0;
            this.R_4 = false;
            this.R_5 = Z[7];
            this.R_7 = false;
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = false;
        }
    }

    private static void n() {
        b = new double[3];
        class11179.b[0] = Double.longBitsToDouble(4591870180174331904L);
        class11179.b[1] = Double.longBitsToDouble(4591870180174331904L);
        class11179.b[2] = Double.longBitsToDouble(4591870180174331904L);
        a = new double[3];
        class11179.a[0] = Double.longBitsToDouble(4607002274986721280L);
        class11179.a[1] = Double.longBitsToDouble(4585925428558828667L);
        class11179.a[2] = Double.longBitsToDouble(4604480258916220928L);
        t = new double[2];
        class11179.t[0] = Double.longBitsToDouble(4604480258916220928L);
        class11179.t[1] = Double.longBitsToDouble(0L);
        Y = new double[3];
        class11179.Y[0] = Double.longBitsToDouble(0L);
        class11179.Y[1] = Double.longBitsToDouble(0L);
        class11179.Y[2] = Double.longBitsToDouble(0L);
        n = new double[5];
        class11179.n[0] = Double.longBitsToDouble(0L);
        class11179.n[1] = Double.longBitsToDouble(0L);
        class11179.n[2] = Double.longBitsToDouble(4532020583461814272L);
        class11179.n[3] = Double.longBitsToDouble(4532020583461814272L);
        class11179.n[4] = Double.longBitsToDouble(0L);
        X = new double[4];
        class11179.X[0] = Double.longBitsToDouble(0L);
        class11179.X[1] = Double.longBitsToDouble(0L);
        class11179.X[2] = Double.longBitsToDouble(0x4000000000000000L);
        class11179.X[3] = Double.longBitsToDouble(0x4000000000000000L);
        Z = new double[8];
        class11179.Z[0] = Double.longBitsToDouble(0L);
        class11179.Z[1] = Double.longBitsToDouble(0L);
        class11179.Z[2] = Double.longBitsToDouble(0L);
        class11179.Z[3] = Double.longBitsToDouble(0L);
        class11179.Z[4] = Double.longBitsToDouble(0L);
        class11179.Z[5] = Double.longBitsToDouble(0L);
        class11179.Z[6] = Double.longBitsToDouble(0L);
        class11179.Z[7] = Double.longBitsToDouble(0L);
        j = new double[1];
        class11179.j[0] = Double.longBitsToDouble(0L);
    }

    public float m() {
        return ((Float)this.N_5).floatValue();
    }

    private void t() {
        ((Vector3d)this.u_1).set((((class00734)this.R_6).N + ((class00734)this.R_6).u) / X[2], ((class00734)this.R_6).y, (((class00734)this.R_6).L + ((class00734)this.R_6).R) / X[3]);
    }

    public boolean U() {
        return (Boolean)this.R_4;
    }

    public float z() {
        return ((Float)this.R_0).floatValue();
    }

    public int u() {
        return (Integer)this.i_0;
    }

    public class11179 y(float f) {
        this.N_2 = Float.valueOf(f);
        return this;
    }

    public void y(double d, double d2, double d3) {
        ((Vector3d)this.u_1).set(d, d2, d3);
        ((Vector3d)this.u_0).set(d, d2, d3);
        this.R_6 = new class00734(d - ((Vector3d)this.N_0).x, d2, d3 - ((Vector3d)this.N_0).z, d + ((Vector3d)this.N_0).x, d2 + ((Vector3d)this.N_0).y, d3 + ((Vector3d)this.N_0).z);
    }

    public class11179 y(int n) {
        this.N_3 = n;
        return this;
    }

    public float y() {
        return ((Float)this.N_4).floatValue();
    }

    public void y(Vector3d vector3d) {
        this.y(vector3d.x, vector3d.y, vector3d.z);
    }

    public void y(class06889 class068892) {
        this.N(class068892.M, class068892.B, class068892.Z);
    }

    public class11179 y(double d) {
        this.R_5 = d;
        return this;
    }

    public void E() {
        ((Vector3d)this.u_0).set((Vector3dc)((Vector3d)this.u_1));
        this.N_5 = Float.valueOf(((Float)this.N_4).floatValue());
        this.N_4 = Float.valueOf(((Float)this.N_4).floatValue() + ((Float)this.R_0).floatValue());
        int n = (Integer)this.R_3;
        this.R_3 = n + 1;
        if (n >= (Integer)this.i_0) {
            this.R_4 = true;
            return;
        }
        ((Vector3d)this.N_1).y -= a[1] * (Double)this.R_1;
        this.L(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z);
        ((Vector3d)this.N_1).set(((Vector3d)this.N_1).x * (Double)this.R_5, ((Vector3d)this.N_1).y * (Double)this.R_5, ((Vector3d)this.N_1).z * (Double)this.R_5);
        if (((Boolean)this.L_0).booleanValue()) {
            ((Vector3d)this.N_1).x *= a[2];
            ((Vector3d)this.N_1).z *= t[0];
        }
    }

    public class11179 N(double d) {
        this.R_1 = d;
        return this;
    }

    public void N(Vector3d vector3d) {
        this.N(vector3d.x, vector3d.y, vector3d.z);
    }

    public class11179 N(float f) {
        this.R_0 = Float.valueOf(f);
        return this;
    }

    public void N(class06889 class068892) {
        this.y(class068892.M, class068892.B, class068892.Z);
    }

    public float N() {
        return ((Float)this.N_2).floatValue();
    }

    public void N(int n) {
        this.i_0 = Math.min((Integer)this.i_0, (Integer)this.R_3 + n);
    }

    public void N(double d, double d2, double d3) {
        ((Vector3d)this.N_1).set(d, d2, d3);
    }

    public class11179 N(boolean bl) {
        this.R_2 = bl;
        return this;
    }

    public Vector3d W() {
        return (Vector3d)this.u_1;
    }

    public int R() {
        return (Integer)this.i_1;
    }
}

