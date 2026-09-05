/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class00734
 *  minecraft.class01404
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04641
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08382
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import minecraft.class00734;
import minecraft.class01404;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03657;
import minecraft.class03664;
import minecraft.class03665;
import minecraft.class03675;
import minecraft.class03679;
import minecraft.class03685;
import minecraft.class03693;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04641;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08382;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class03688
extends class07049 {
    static final Logger N = LogUtils.getLogger();
    public static final int y = -1;
    private static final class02131<Integer> s = class03289.N(class03688.class, (class04383)class02154.y);
    private static final class02131<Integer> T = class03289.N(class03688.class, (class04383)class02154.y);
    private static final class02131<Integer> b = class03289.N(class03688.class, (class04383)class02154.y);
    private static final class02131<Vector3fc> j = class03289.N(class03688.class, (class04383)class02154.K);
    private static final class02131<Vector3fc> v = class03289.N(class03688.class, (class04383)class02154.K);
    private static final class02131<Quaternionfc> n = class03289.N(class03688.class, (class04383)class02154.V);
    private static final class02131<Quaternionfc> t = class03289.N(class03688.class, (class04383)class02154.V);
    private static final class02131<Byte> G = class03289.N(class03688.class, (class04383)class02154.N);
    private static final class02131<Integer> l = class03289.N(class03688.class, (class04383)class02154.y);
    private static final class02131<Float> d = class03289.N(class03688.class, (class04383)class02154.u);
    private static final class02131<Float> w = class03289.N(class03688.class, (class04383)class02154.u);
    private static final class02131<Float> k = class03289.N(class03688.class, (class04383)class02154.u);
    private static final class02131<Float> Y = class03289.N(class03688.class, (class04383)class02154.u);
    private static final class02131<Float> Q = class03289.N(class03688.class, (class04383)class02154.u);
    private static final class02131<Integer> O = class03289.N(class03688.class, (class04383)class02154.y);
    private static final IntSet g = IntSet.of((int[])new int[]{j.N(), v.N(), n.N(), t.N(), G.N(), l.N(), w.N(), k.N()});
    private static final int I = 0;
    private static final int J = 0;
    private static final int o = 0;
    private static final float q = 0.0f;
    private static final float K = 1.0f;
    private static final float V = 1.0f;
    private static final float e = 0.0f;
    private static final float H = 0.0f;
    private static final int c = -1;
    public static final String L = "teleport_duration";
    public static final String u = "interpolation_duration";
    public static final String i = "start_interpolation";
    public static final String R = "transformation";
    public static final String M = "billboard";
    public static final String B = "brightness";
    public static final String Z = "view_range";
    public static final String z = "shadow_radius";
    public static final String U = "shadow_strength";
    public static final String E = "width";
    public static final String W = "height";
    public static final String m = "glow_color_override";
    private long X = Integer.MIN_VALUE;
    private int a;
    private float p;
    private class00734 F;
    private boolean A = true;
    protected boolean P;
    private boolean f;
    private boolean C;
    private @Nullable class03657 S;
    private final class08382 x = new class08382((class07049)this, 0);

    public @Nullable class03657 L() {
        return this.S;
    }

    public final void L(float f) {
        this.field_6011.N(k, (Object)Float.valueOf(f));
    }

    public final void L(int n) {
        this.field_6011.N(b, (Object)n);
    }

    public final class03679 M() {
        return class03679.field_42411.apply(((Byte)this.field_6011.N(G)).byteValue());
    }

    public final float P() {
        return ((Float)this.field_6011.N(Q)).floatValue();
    }

    private class03657 T() {
        return new class03657(class03665.N(class03688.N(this.field_6011)), this.M(), this.Z(), class03664.N(this.U()), class03664.N(this.E()), this.m());
    }

    public boolean method_5696() {
        return true;
    }

    public class04641 method_5657() {
        return class04641.field_15975;
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (Q.equals(class021312) || Y.equals(class021312)) {
            this.s();
        }
        if (s.equals(class021312)) {
            this.f = true;
        }
        if (b.equals(class021312)) {
            this.x.method_66266(this.R());
        }
        if (T.equals(class021312)) {
            this.C = true;
        }
        if (g.contains(class021312.N())) {
            this.P = true;
        }
    }

    public int method_22861() {
        int n = this.m();
        return n != -1 ? n : super.method_22861();
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(b, (Object)0);
        class042932.N(s, (Object)0);
        class042932.N(T, (Object)0);
        class042932.N(j, (Object)new Vector3f());
        class042932.N(v, (Object)new Vector3f(1.0f, 1.0f, 1.0f));
        class042932.N(t, (Object)new Quaternionf());
        class042932.N(n, (Object)new Quaternionf());
        class042932.N(G, (Object)class03679.field_42406.N());
        class042932.N(l, (Object)-1);
        class042932.N(d, (Object)Float.valueOf(1.0f));
        class042932.N(w, (Object)Float.valueOf(0.0f));
        class042932.N(k, (Object)Float.valueOf(1.0f));
        class042932.N(Y, (Object)Float.valueOf(0.0f));
        class042932.N(Q, (Object)Float.valueOf(0.0f));
        class042932.N(O, (Object)-1);
    }

    public void method_5814(double d, double d2, double d3) {
        super.method_5814(d, d2, d3);
        this.s();
    }

    public void method_5773() {
        class07049 class070492 = this.method_5854();
        if (class070492 != null && class070492.method_31481()) {
            this.method_5848();
        }
        if (this.method_73183().method_8608()) {
            int n;
            if (this.f) {
                this.f = false;
                n = this.i();
                this.X = this.field_6012 + n;
            }
            if (this.C) {
                this.C = false;
                this.a = this.u();
            }
            if (this.P) {
                this.P = false;
                n = this.a != 0 ? 1 : 0;
                this.S = n != 0 && this.S != null ? this.N(this.S, this.p) : this.T();
                this.N(n != 0, this.p);
            }
            this.x.method_66271();
        }
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    protected void method_5652(class08329 class083292) {
        class083292.N(R, class01404.y, (Object)class03688.N(this.field_6011));
        class083292.N(M, class03679.field_42410, (Object)this.M());
        class083292.N(u, this.u());
        class083292.N(L, this.R());
        class083292.N(Z, this.z());
        class083292.N(z, this.U());
        class083292.N(U, this.E());
        class083292.N(E, this.W());
        class083292.N(W, this.P());
        class083292.N(m, this.m());
        class083292.y(B, class03675.y, (Object)this.B());
    }

    public boolean method_5640(double d) {
        return d < class04995.E((double)((double)this.z() * 64.0 * class03688.method_5824()));
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992.N(R, class01404.y).orElse(class01404.N()));
        this.N(class082992.N(u, 0));
        this.y(class082992.N(i, 0));
        int n = class082992.N(L, 0);
        this.L(class04995.N((int)n, (int)0, (int)59));
        this.N(class082992.N(M, class03679.field_42410).orElse(class03679.field_42406));
        this.N(class082992.N(Z, 1.0f));
        this.y(class082992.N(z, 0.0f));
        this.L(class082992.N(U, 1.0f));
        this.u(class082992.N(E, 0.0f));
        this.i(class082992.N(W, 0.0f));
        this.u(class082992.N(m, -1));
        this.N((class03675)class082992.N(B, class03675.y).orElse(null));
    }

    public class08382 method_66233() {
        return this.x;
    }

    public class03688(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_5960 = true;
        this.F = this.method_5829();
    }

    public final @Nullable class03675 B() {
        int n = (Integer)this.field_6011.N(l);
        return n != -1 ? class03675.L(n) : null;
    }

    public final int Z() {
        return (Integer)this.field_6011.N(l);
    }

    public final void i(float f) {
        this.field_6011.N(Q, (Object)Float.valueOf(f));
    }

    public final int i() {
        return (Integer)this.field_6011.N(s);
    }

    private void s() {
        float f = this.W();
        float f2 = this.P();
        this.A = f == 0.0f || f2 == 0.0f;
        float f3 = f / 2.0f;
        double d = this.method_23317();
        double d2 = this.method_23318();
        double d3 = this.method_23321();
        this.F = new class00734(d - (double)f3, d2, d3 - (double)f3, d + (double)f3, d2 + (double)f2, d3 + (double)f3);
    }

    public final int m() {
        return (Integer)this.field_6011.N(O);
    }

    public final float U() {
        return ((Float)this.field_6011.N(w)).floatValue();
    }

    public final float z() {
        return ((Float)this.field_6011.N(d)).floatValue();
    }

    public final void u(int n) {
        this.field_6011.N(O, (Object)n);
    }

    public final int u() {
        return (Integer)this.field_6011.N(T);
    }

    public final void u(float f) {
        this.field_6011.N(Y, (Object)Float.valueOf(f));
    }

    public boolean y() {
        return !this.A;
    }

    public final void y(int n) {
        this.field_6011.N(s, (Object)n, true);
    }

    public final void y(float f) {
        this.field_6011.N(w, (Object)Float.valueOf(f));
    }

    public final float E() {
        return ((Float)this.field_6011.N(k)).floatValue();
    }

    public final void N(@Nullable class03675 class036752) {
        this.field_6011.N(l, (Object)(class036752 != null ? class036752.N() : -1));
    }

    public final void N(class03679 class036792) {
        this.field_6011.N(G, (Object)class036792.N());
    }

    public final void N(class01404 class014042) {
        this.field_6011.N(j, (Object)class014042.i());
        this.field_6011.N(n, (Object)class014042.R());
        this.field_6011.N(v, (Object)class014042.M());
        this.field_6011.N(t, (Object)class014042.B());
    }

    private class03657 N(class03657 class036572, float f) {
        class01404 class014042 = class036572.N().method_48888(f);
        float f2 = class036572.u().method_48886(f);
        float f3 = class036572.i().method_48886(f);
        return new class03657(new class03685(class014042, class03688.N(this.field_6011)), this.M(), this.Z(), new class03693(f2, this.U()), new class03693(f3, this.E()), this.m());
    }

    protected abstract void N(boolean var1, float var2);

    private static class01404 N(class03289 class032892) {
        Vector3fc vector3fc = (Vector3fc)class032892.N(j);
        Quaternionfc quaternionfc = (Quaternionfc)class032892.N(n);
        Vector3fc vector3fc2 = (Vector3fc)class032892.N(v);
        Quaternionfc quaternionfc2 = (Quaternionfc)class032892.N(t);
        return new class01404(vector3fc, quaternionfc, vector3fc2, quaternionfc2);
    }

    public final void N(int n) {
        this.field_6011.N(T, (Object)n);
    }

    public class00734 N() {
        return this.F;
    }

    public final void N(float f) {
        this.field_6011.N(d, (Object)Float.valueOf(f));
    }

    public final float W() {
        return ((Float)this.field_6011.N(Y)).floatValue();
    }

    public float R(float f) {
        float f2;
        int n = this.a;
        if (n <= 0) {
            return 1.0f;
        }
        this.p = f2 = class04995.N((float)class04995.R((float)((float)((long)this.field_6012 - this.X) + f), (float)0.0f, (float)n), (float)0.0f, (float)1.0f);
        return f2;
    }

    public final int R() {
        return (Integer)this.field_6011.N(b);
    }
}

