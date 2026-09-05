/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class01042
 *  minecraft.class02061
 *  minecraft.class03023
 *  minecraft.class03195
 *  minecraft.class03216
 *  minecraft.class03229
 *  minecraft.class03556
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03882
 *  minecraft.class03890
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04300
 *  minecraft.class04562
 *  minecraft.class04564
 *  minecraft.class04573
 *  minecraft.class05946
 *  minecraft.class07529
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class01042;
import minecraft.class01921;
import minecraft.class02061;
import minecraft.class03023;
import minecraft.class03195;
import minecraft.class03216;
import minecraft.class03229;
import minecraft.class03556;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03882;
import minecraft.class03890;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04300;
import minecraft.class04562;
import minecraft.class04564;
import minecraft.class04573;
import minecraft.class05946;
import minecraft.class07529;

public final class class01835 {
    private static final float B = 0.05f;
    private static final float Z = 0.26666668f;
    public static final float N = 0.4f;
    private static final float z = 0.93333334f;
    private static final float U = 0.1f;
    public static final float y = 0.56666666f;
    private static final float E = 0.7666667f;
    public static final float L = -0.11f;
    public static final float u = 0.03f;
    public static final float i = 0.3f;
    public static final float R = -0.78f;
    public static final float M = -0.375f;
    private static final float W = -0.225f;
    private static final float m = 0.9f;
    private final class03195 P = class03195.N((float)-1.0f, (float)1.0f);
    private final class03195[] s = new class03195[]{class03195.N((float)-1.0f, (float)-0.45f), class03195.N((float)-0.45f, (float)-0.15f), class03195.N((float)-0.15f, (float)0.2f), class03195.N((float)0.2f, (float)0.55f), class03195.N((float)0.55f, (float)1.0f)};
    private final class03195[] T = new class03195[]{class03195.N((float)-1.0f, (float)-0.35f), class03195.N((float)-0.35f, (float)-0.1f), class03195.N((float)-0.1f, (float)0.1f), class03195.N((float)0.1f, (float)0.3f), class03195.N((float)0.3f, (float)1.0f)};
    private final class03195[] b = new class03195[]{class03195.N((float)-1.0f, (float)-0.78f), class03195.N((float)-0.78f, (float)-0.375f), class03195.N((float)-0.375f, (float)-0.2225f), class03195.N((float)-0.2225f, (float)0.05f), class03195.N((float)0.05f, (float)0.45f), class03195.N((float)0.45f, (float)0.55f), class03195.N((float)0.55f, (float)1.0f)};
    private final class03195 j = this.s[0];
    private final class03195 v = class03195.N((class03195)this.s[1], (class03195)this.s[4]);
    private final class03195 n = class03195.N((float)-1.2f, (float)-1.05f);
    private final class03195 t = class03195.N((float)-1.05f, (float)-0.455f);
    private final class03195 G = class03195.N((float)-0.455f, (float)-0.19f);
    private final class03195 l = class03195.N((float)-0.19f, (float)-0.11f);
    private final class03195 d = class03195.N((float)-0.11f, (float)0.55f);
    private final class03195 w = class03195.N((float)-0.11f, (float)0.03f);
    private final class03195 k = class03195.N((float)0.03f, (float)0.3f);
    private final class03195 Y = class03195.N((float)0.3f, (float)1.0f);
    private final class05946<class00780>[][] Q = new class05946[][]{{class00795.h, class00795.x, class00795.C, class00795.A, class00795.p}, {class00795.D, class00795.S, class00795.f, class00795.F, class00795.p}};
    private final class05946<class00780>[][] O = new class05946[][]{{class00795.u, class00795.u, class00795.u, class00795.b, class00795.T}, {class00795.y, class00795.y, class00795.Z, class00795.T, class00795.s}, {class00795.z, class00795.y, class00795.Z, class00795.U, class00795.E}, {class00795.j, class00795.j, class00795.Z, class00795.d, class00795.d}, {class00795.R, class00795.R, class00795.R, class00795.R, class00795.R}};
    private final class05946<class00780>[][] g = new class05946[][]{{class00795.i, null, class00795.b, null, null}, {null, null, null, null, class00795.P}, {class00795.L, null, null, class00795.m, null}, {null, null, class00795.y, class00795.w, class00795.k}, {null, null, null, null, null}};
    private final class05946<class00780>[][] I = new class05946[][]{{class00795.u, class00795.u, class00795.u, class00795.b, class00795.b}, {class00795.g, class00795.g, class00795.Z, class00795.T, class00795.s}, {class00795.g, class00795.g, class00795.g, class00795.g, class00795.W}, {class00795.v, class00795.v, class00795.Z, class00795.Z, class00795.d}, {class00795.Y, class00795.Y, class00795.Y, class00795.O, class00795.O}};
    private final class05946<class00780>[][] J = new class05946[][]{{class00795.i, null, null, null, null}, {class00795.I, null, class00795.g, class00795.g, class00795.P}, {class00795.I, class00795.I, class00795.Z, class00795.U, null}, {null, null, null, null, null}, {class00795.Q, class00795.Q, null, null, null}};
    private final class05946<class00780>[][] o = new class05946[][]{{class00795.t, class00795.t, class00795.n, class00795.G, class00795.G}, {class00795.t, class00795.t, class00795.n, class00795.G, class00795.G}, {class00795.n, class00795.n, class00795.n, class00795.G, class00795.G}, {null, null, null, null, null}, {null, null, null, null, null}};

    private class05946<class00780> L(int n, int n2, class03195 class031952) {
        return n == 0 ? this.M(n, n2, class031952) : this.y(n, n2, class031952);
    }

    private void L(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952) {
        this.N(consumer, this.P, this.P, this.l, class03195.N((class03195)this.b[0], (class03195)this.b[2]), class031952, 0.0f, (class05946<class00780>)class00795.a);
        this.N(consumer, class03195.N((class03195)this.s[1], (class03195)this.s[2]), this.P, class03195.N((class03195)this.w, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.M);
        this.N(consumer, class03195.N((class03195)this.s[3], (class03195)this.s[4]), this.P, class03195.N((class03195)this.w, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.B);
        for (int i = 0; i < this.s.length; ++i) {
            class03195 class031953 = this.s[i];
            for (int j = 0; j < this.T.length; ++j) {
                class03195 class031954 = this.T[j];
                class05946<class00780> var7 = this.N(i, j, class031952);
                class05946<class00780> var8 = this.y(i, j, class031952);
                class05946<class00780> var9 = this.L(i, j, class031952);
                class05946<class00780> var10 = this.B(i, j, class031952);
                class05946<class00780> var11 = this.i(i, j, class031952);
                class05946<class00780> var12 = this.N(i, j);
                class05946<class00780> var13 = this.N(i, j, class031952, var7);
                class05946<class00780> var14 = this.u(i, j, class031952);
                class05946<class00780> var15 = this.M(i, j, class031952);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.w, (class03195)this.Y), this.b[0], class031952, 0.0f, var15);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.w, (class03195)this.k), this.b[1], class031952, 0.0f, var9);
                this.N(consumer, class031953, class031954, this.Y, this.b[1], class031952, 0.0f, i == 0 ? var15 : var11);
                this.N(consumer, class031953, class031954, this.w, this.b[2], class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, this.k, this.b[2], class031952, 0.0f, var8);
                this.N(consumer, class031953, class031954, this.Y, this.b[2], class031952, 0.0f, var11);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.w), this.b[3], class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[3], class031952, 0.0f, var8);
                if (class031952.y() < 0L) {
                    this.N(consumer, class031953, class031954, this.l, this.b[4], class031952, 0.0f, var12);
                    this.N(consumer, class031953, class031954, class03195.N((class03195)this.w, (class03195)this.Y), this.b[4], class031952, 0.0f, var7);
                } else {
                    this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.Y), this.b[4], class031952, 0.0f, var7);
                }
                this.N(consumer, class031953, class031954, this.l, this.b[5], class031952, 0.0f, var14);
                this.N(consumer, class031953, class031954, this.w, this.b[5], class031952, 0.0f, var13);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[5], class031952, 0.0f, var10);
                if (class031952.y() < 0L) {
                    this.N(consumer, class031953, class031954, this.l, this.b[6], class031952, 0.0f, var12);
                } else {
                    this.N(consumer, class031953, class031954, this.l, this.b[6], class031952, 0.0f, var7);
                }
                if (i != 0) continue;
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.w, (class03195)this.Y), this.b[6], class031952, 0.0f, var7);
            }
        }
    }

    private void L(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952, class03195 class031953, class03195 class031954, class03195 class031955, class03195 class031956, float f, class05946<class00780> class059462) {
        consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)class031952, (class03195)class031953, (class03195)class031954, (class03195)class031955, (class03195)class03195.N((float)1.1f), (class03195)class031956, (float)f), class059462));
    }

    private void L(Consumer<Pair<class03229, class05946<class00780>>> consumer) {
        this.N(consumer, this.P, this.P, this.n, this.P, this.P, 0.0f, (class05946<class00780>)class00795.r);
        for (int i = 0; i < this.s.length; ++i) {
            class03195 class031952 = this.s[i];
            this.N(consumer, class031952, this.P, this.t, this.P, this.P, 0.0f, this.Q[0][i]);
            this.N(consumer, class031952, this.P, this.G, this.P, this.P, 0.0f, this.Q[1][i]);
        }
    }

    public class03195[] L() {
        return this.T;
    }

    public String L(double d) {
        return class01835.N(d, this.b);
    }

    public class03195[] M() {
        return new class03195[]{class03195.N((float)-2.0f, (float)0.0f), class03195.N((float)0.0f, (float)2.0f)};
    }

    private class05946<class00780> M(int n, int n2, class03195 class031952) {
        if (n >= 3) {
            return this.i(n, n2, class031952);
        }
        if (n2 <= 1) {
            return class00795.o;
        }
        return class00795.J;
    }

    private class05946<class00780> B(int n, int n2, class03195 class031952) {
        class05946<class00780> var4 = this.o[n][n2];
        return var4 == null ? this.N(n, n2, class031952) : var4;
    }

    public String i(double d) {
        return class01835.N(d, this.T);
    }

    public class03195[] i() {
        return new class03195[]{this.n, this.t, this.G, this.l, this.w, this.k, this.Y};
    }

    private class05946<class00780> i(int n, int n2, class03195 class031952) {
        class05946<class00780> var4;
        if (class031952.y() >= 0L && (var4 = this.J[n][n2]) != null) {
            return var4;
        }
        return this.I[n][n2];
    }

    private void i(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952) {
        this.N(consumer, this.j, this.P, this.l, class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, (class05946<class00780>)(class031952.y() < 0L ? class00795.a : class00795.H));
        this.N(consumer, this.v, this.P, this.l, class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, (class05946<class00780>)(class031952.y() < 0L ? class00795.a : class00795.e));
        this.N(consumer, this.j, this.P, this.w, class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, (class05946<class00780>)class00795.H);
        this.N(consumer, this.v, this.P, this.w, class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, (class05946<class00780>)class00795.e);
        this.N(consumer, this.j, this.P, class03195.N((class03195)this.l, (class03195)this.Y), class03195.N((class03195)this.b[2], (class03195)this.b[5]), class031952, 0.0f, (class05946<class00780>)class00795.H);
        this.N(consumer, this.v, this.P, class03195.N((class03195)this.l, (class03195)this.Y), class03195.N((class03195)this.b[2], (class03195)this.b[5]), class031952, 0.0f, (class05946<class00780>)class00795.e);
        this.N(consumer, this.j, this.P, this.l, this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.H);
        this.N(consumer, this.v, this.P, this.l, this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.e);
        this.N(consumer, class03195.N((class03195)this.s[1], (class03195)this.s[2]), this.P, class03195.N((class03195)this.d, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.M);
        this.N(consumer, class03195.N((class03195)this.s[3], (class03195)this.s[4]), this.P, class03195.N((class03195)this.d, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.B);
        this.N(consumer, this.j, this.P, class03195.N((class03195)this.d, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.H);
        for (int i = 0; i < this.s.length; ++i) {
            class03195 class031953 = this.s[i];
            for (int j = 0; j < this.T.length; ++j) {
                class03195 class031954 = this.T[j];
                class05946<class00780> var7 = this.y(i, j, class031952);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, var7);
            }
        }
    }

    private void i(Consumer<Pair<class03229, class05946<class00780>>> consumer) {
        this.y(consumer, this.P, this.P, class03195.N((float)0.8f, (float)1.0f), this.P, this.P, 0.0f, (class05946<class00780>)class00795.NN);
        this.y(consumer, this.P, class03195.N((float)0.7f, (float)1.0f), this.P, this.P, this.P, 0.0f, (class05946<class00780>)class00795.Ny);
        this.L(consumer, this.P, this.P, this.P, class03195.N((class03195)this.b[0], (class03195)this.b[1]), this.P, 0.0f, (class05946<class00780>)class00795.NL);
    }

    private void u(Consumer<Pair<class03229, class05946<class00780>>> consumer) {
        this.L(consumer, class03195.N((float)-1.0f, (float)-0.93333334f));
        this.y(consumer, class03195.N((float)-0.93333334f, (float)-0.7666667f));
        this.N(consumer, class03195.N((float)-0.7666667f, (float)-0.56666666f));
        this.y(consumer, class03195.N((float)-0.56666666f, (float)-0.4f));
        this.L(consumer, class03195.N((float)-0.4f, (float)-0.26666668f));
        this.u(consumer, class03195.N((float)-0.26666668f, (float)-0.05f));
        this.i(consumer, class03195.N((float)-0.05f, (float)0.05f));
        this.u(consumer, class03195.N((float)0.05f, (float)0.26666668f));
        this.L(consumer, class03195.N((float)0.26666668f, (float)0.4f));
        this.y(consumer, class03195.N((float)0.4f, (float)0.56666666f));
        this.N(consumer, class03195.N((float)0.56666666f, (float)0.7666667f));
        this.y(consumer, class03195.N((float)0.7666667f, (float)0.93333334f));
        this.L(consumer, class03195.N((float)0.93333334f, (float)1.0f));
    }

    private void u(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952) {
        this.N(consumer, this.P, this.P, this.l, class03195.N((class03195)this.b[0], (class03195)this.b[2]), class031952, 0.0f, (class05946<class00780>)class00795.a);
        this.N(consumer, class03195.N((class03195)this.s[1], (class03195)this.s[2]), this.P, class03195.N((class03195)this.w, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.M);
        this.N(consumer, class03195.N((class03195)this.s[3], (class03195)this.s[4]), this.P, class03195.N((class03195)this.w, (class03195)this.Y), this.b[6], class031952, 0.0f, (class05946<class00780>)class00795.B);
        for (int i = 0; i < this.s.length; ++i) {
            class03195 class031953 = this.s[i];
            for (int j = 0; j < this.T.length; ++j) {
                class03195 class031954 = this.T[j];
                class05946<class00780> var7 = this.N(i, j, class031952);
                class05946<class00780> var8 = this.y(i, j, class031952);
                class05946<class00780> var9 = this.L(i, j, class031952);
                class05946<class00780> var10 = this.N(i, j);
                class05946<class00780> var11 = this.N(i, j, class031952, var7);
                class05946<class00780> var12 = this.u(i, j, class031952);
                this.N(consumer, class031953, class031954, this.w, class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, var8);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, var9);
                this.N(consumer, class031953, class031954, this.w, class03195.N((class03195)this.b[2], (class03195)this.b[3]), class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), class03195.N((class03195)this.b[2], (class03195)this.b[3]), class031952, 0.0f, var8);
                this.N(consumer, class031953, class031954, this.l, class03195.N((class03195)this.b[3], (class03195)this.b[4]), class031952, 0.0f, var10);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.w, (class03195)this.Y), this.b[4], class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, this.l, this.b[5], class031952, 0.0f, var12);
                this.N(consumer, class031953, class031954, this.w, this.b[5], class031952, 0.0f, var11);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[5], class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, this.l, this.b[6], class031952, 0.0f, var10);
                if (i != 0) continue;
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.w, (class03195)this.Y), this.b[6], class031952, 0.0f, var7);
            }
        }
    }

    public String u(double d) {
        return class01835.N(d, this.s);
    }

    public class03195[] u() {
        return this.b;
    }

    private class05946<class00780> u(int n, int n2, class03195 class031952) {
        class05946<class00780> var4 = class031952.y() >= 0L ? this.N(n, n2, class031952) : this.N(n, n2);
        return this.N(n, n2, class031952, var4);
    }

    private void y(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952) {
        for (int i = 0; i < this.s.length; ++i) {
            class03195 class031953 = this.s[i];
            for (int j = 0; j < this.T.length; ++j) {
                class03195 class031954 = this.T[j];
                class05946<class00780> var7 = this.N(i, j, class031952);
                class05946<class00780> var8 = this.y(i, j, class031952);
                class05946<class00780> var9 = this.L(i, j, class031952);
                class05946<class00780> var10 = this.i(i, j, class031952);
                class05946<class00780> var11 = this.B(i, j, class031952);
                class05946<class00780> var12 = this.N(i, j, class031952, var7);
                class05946<class00780> var13 = this.M(i, j, class031952);
                class05946<class00780> var14 = this.R(i, j, class031952);
                this.N(consumer, class031953, class031954, this.l, class03195.N((class03195)this.b[0], (class03195)this.b[1]), class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, this.w, this.b[0], class031952, 0.0f, var13);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[0], class031952, 0.0f, var14);
                this.N(consumer, class031953, class031954, this.w, this.b[1], class031952, 0.0f, var9);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[1], class031952, 0.0f, var13);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.w), class03195.N((class03195)this.b[2], (class03195)this.b[3]), class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[2], class031952, 0.0f, var10);
                this.N(consumer, class031953, class031954, this.k, this.b[3], class031952, 0.0f, var8);
                this.N(consumer, class031953, class031954, this.Y, this.b[3], class031952, 0.0f, var10);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.Y), this.b[4], class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.w), this.b[5], class031952, 0.0f, var12);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[5], class031952, 0.0f, var11);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.Y), this.b[6], class031952, 0.0f, var7);
            }
        }
    }

    private void y(Consumer<Pair<class03229, class05946<class00780>>> consumer) {
        class04564 class045642;
        class01921 class019212 = new class02061().N(class04227.yy, class03882::N).N(class04227.yW, class03023::N).N((class01042)class01042.N((class00751)class04206.NF)).y(class04227.yy);
        class03890 class038902 = new class03890((class03556)class019212.y(class03882.i));
        class03890 class038903 = new class03890((class03556)class019212.y(class03882.R));
        class03890 class038904 = new class03890((class03556)class019212.y(class03882.B));
        consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)this.P, (class03195)this.P, (class03195)this.P, (class03195)this.P, (class03195)class03195.N((float)0.0f), (class03195)this.P, (float)0.01f), (Object)class00795.y));
        class04562 class045622 = class04300.N((class04573)class038903, (class04573)class038904, (float)-0.15f, (float)0.0f, (float)0.0f, (float)0.1f, (float)0.0f, (float)-0.03f, (boolean)false, (boolean)false, (class04573)class04573.y);
        if (class045622 instanceof class04564) {
            class045642 = (class04564)class045622;
            class05946 var9 = class00795.R;
            for (float f : class045642.i()) {
                consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)this.P, (class03195)this.P, (class03195)this.P, (class03195)class03195.N((float)f), (class03195)class03195.N((float)0.0f), (class03195)this.P, (float)0.0f), (Object)var9));
                var9 = var9 == class00795.R ? class00795.Y : class00795.R;
            }
        }
        if ((class045642 = class04300.N((class04573)class038902, (class04573)class038903, (class04573)class038904, (boolean)false)) instanceof class04564) {
            class04564 class045643 = class045642;
            for (float f : class045643.i()) {
                consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)this.P, (class03195)this.P, (class03195)class03195.N((float)f), (class03195)this.P, (class03195)class03195.N((float)0.0f), (class03195)this.P, (float)0.0f), (Object)class00795.b));
            }
        }
    }

    public class03195[] y() {
        return this.s;
    }

    public String y(double d) {
        double d2 = class03216.N((float)((float)d));
        if (d2 < (double)this.n.y()) {
            return "Mushroom fields";
        }
        if (d2 < (double)this.t.y()) {
            return "Deep ocean";
        }
        if (d2 < (double)this.G.y()) {
            return "Ocean";
        }
        if (d2 < (double)this.l.y()) {
            return "Coast";
        }
        if (d2 < (double)this.w.y()) {
            return "Near inland";
        }
        if (d2 < (double)this.k.y()) {
            return "Mid inland";
        }
        return "Far inland";
    }

    private void y(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952, class03195 class031953, class03195 class031954, class03195 class031955, class03195 class031956, float f, class05946<class00780> class059462) {
        consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)class031952, (class03195)class031953, (class03195)class031954, (class03195)class031955, (class03195)class03195.N((float)0.2f, (float)0.9f), (class03195)class031956, (float)f), class059462));
    }

    private class05946<class00780> y(int n, int n2, class03195 class031952) {
        return n == 4 ? this.N(n2, class031952) : this.N(n, n2, class031952);
    }

    private void N(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952) {
        for (int i = 0; i < this.s.length; ++i) {
            class03195 class031953 = this.s[i];
            for (int j = 0; j < this.T.length; ++j) {
                class03195 class031954 = this.T[j];
                class05946<class00780> var7 = this.N(i, j, class031952);
                class05946<class00780> var8 = this.y(i, j, class031952);
                class05946<class00780> var9 = this.L(i, j, class031952);
                class05946<class00780> var10 = this.i(i, j, class031952);
                class05946<class00780> var11 = this.B(i, j, class031952);
                class05946<class00780> var12 = this.N(i, j, class031952, var11);
                class05946<class00780> var13 = this.R(i, j, class031952);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.Y), this.b[0], class031952, 0.0f, var13);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.w), this.b[1], class031952, 0.0f, var9);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[1], class031952, 0.0f, var13);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.w), class03195.N((class03195)this.b[2], (class03195)this.b[3]), class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[2], class031952, 0.0f, var10);
                this.N(consumer, class031953, class031954, this.k, this.b[3], class031952, 0.0f, var8);
                this.N(consumer, class031953, class031954, this.Y, this.b[3], class031952, 0.0f, var10);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.Y), this.b[4], class031952, 0.0f, var7);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.w), this.b[5], class031952, 0.0f, var12);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.k, (class03195)this.Y), this.b[5], class031952, 0.0f, var11);
                this.N(consumer, class031953, class031954, class03195.N((class03195)this.l, (class03195)this.Y), this.b[6], class031952, 0.0f, var7);
            }
        }
    }

    private class05946<class00780> N(int n, int n2, class03195 class031952, class05946<class00780> class059462) {
        if (n > 1 && n2 < 4 && class031952.y() >= 0L) {
            return class00795.l;
        }
        return class059462;
    }

    private static String N(double d, class03195[] class03195Array) {
        double d2 = class03216.N((float)((float)d));
        for (int i = 0; i < class03195Array.length; ++i) {
            if (!(d2 < (double)class03195Array[i].y())) continue;
            return "" + i;
        }
        return "?";
    }

    private class05946<class00780> N(int n, int n2, class03195 class031952) {
        if (class031952.y() < 0L) {
            return this.O[n][n2];
        }
        class05946<class00780> var4 = this.g[n][n2];
        return var4 == null ? this.O[n][n2] : var4;
    }

    public List<class03229> N() {
        class03195 class031952 = class03195.N((float)0.0f);
        float f = 0.16f;
        return List.of(new class03229(this.P, this.P, class03195.N((class03195)this.d, (class03195)this.P), this.P, class031952, class03195.N((float)-1.0f, (float)-0.16f), 0L), new class03229(this.P, this.P, class03195.N((class03195)this.d, (class03195)this.P), this.P, class031952, class03195.N((float)0.16f, (float)1.0f), 0L));
    }

    private class05946<class00780> N(int n, class03195 class031952) {
        if (n < 2) {
            return class031952.y() < 0L ? class00795.Y : class00795.Q;
        }
        if (n < 3) {
            return class00795.Y;
        }
        return class00795.O;
    }

    private class05946<class00780> N(int n, int n2) {
        if (n == 0) {
            return class00795.X;
        }
        if (n == 4) {
            return class00795.R;
        }
        return class00795.c;
    }

    private void N(Consumer<Pair<class03229, class05946<class00780>>> consumer, class03195 class031952, class03195 class031953, class03195 class031954, class03195 class031955, class03195 class031956, float f, class05946<class00780> class059462) {
        consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)class031952, (class03195)class031953, (class03195)class031954, (class03195)class031955, (class03195)class03195.N((float)0.0f), (class03195)class031956, (float)f), class059462));
        consumer.accept((Pair<class03229, class05946<class00780>>)Pair.of((Object)class03216.N((class03195)class031952, (class03195)class031953, (class03195)class031954, (class03195)class031955, (class03195)class03195.N((float)1.0f), (class03195)class031956, (float)f), class059462));
    }

    protected void N(Consumer<Pair<class03229, class05946<class00780>>> consumer) {
        if (class07529.NG) {
            this.y(consumer);
            return;
        }
        this.L(consumer);
        this.u(consumer);
        this.i(consumer);
    }

    public static String N(double d) {
        if (d < (double)class03882.N((float)0.05f)) {
            return "Valley";
        }
        if (d < (double)class03882.N((float)0.26666668f)) {
            return "Low";
        }
        if (d < (double)class03882.N((float)0.4f)) {
            return "Mid";
        }
        if (d < (double)class03882.N((float)0.56666666f)) {
            return "High";
        }
        return "Peak";
    }

    public static boolean N(class03877 class038772, class03877 class038773, class03875 class038752) {
        return class038772.N(class038752) < (double)-0.225f && class038773.N(class038752) > (double)0.9f;
    }

    public class03195[] R() {
        return new class03195[]{class03195.N((float)-2.0f, (float)class03882.N((float)0.05f)), class03195.N((float)class03882.N((float)0.05f), (float)class03882.N((float)0.26666668f)), class03195.N((float)class03882.N((float)0.26666668f), (float)class03882.N((float)0.4f)), class03195.N((float)class03882.N((float)0.4f), (float)class03882.N((float)0.56666666f)), class03195.N((float)class03882.N((float)0.56666666f), (float)2.0f)};
    }

    private class05946<class00780> R(int n, int n2, class03195 class031952) {
        if (n <= 2) {
            return class031952.y() < 0L ? class00795.K : class00795.q;
        }
        if (n == 3) {
            return class00795.V;
        }
        return this.N(n2, class031952);
    }
}

