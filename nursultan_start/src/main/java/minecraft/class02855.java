/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class01134
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02726
 *  minecraft.class02736
 *  minecraft.class02757
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class05539
 *  minecraft.class06271
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class06959
 *  minecraft.class07504
 *  minecraft.class08454
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.util.Objects;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class01134;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02726;
import minecraft.class02736;
import minecraft.class02757;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class05539;
import minecraft.class06271;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class06959;
import minecraft.class07504;
import minecraft.class08454;
import org.joml.Quaternionfc;

public abstract class class02855<T extends class07504, S extends class08454>
extends class04507<T, S> {
    private static final class01894 y = class01894.y((String)"textures/entity/minecart.png");
    private static final float L = 0.75f;
    protected final class05539 N;

    public class02855(class04832 class048322, class01134 class011342) {
        super(class048322);
        this.field_4673 = 0.7f;
        this.N = new class05539(class048322.N(class011342));
    }

    private static <S extends class08454> void y(S s, class01421 class014212) {
        double d = s.E;
        double d2 = s.W;
        double d3 = s.m;
        float f = s.N;
        float f2 = s.y;
        if (s.I != null && s.J != null && s.o != null) {
            class06889 class068892 = s.J;
            class06889 class068893 = s.o;
            class014212.N(s.I.M - d, (class068892.B + class068893.B) / 2.0 - d2, s.I.Z - d3);
            class06889 class068894 = class068893.y(-class068892.M, -class068892.B, -class068892.Z);
            if (class068894.M() != 0.0) {
                class068894 = class068894.u();
                f2 = (float)(Math.atan2(class068894.Z, class068894.M) * 180.0 / Math.PI);
                f = (float)(Math.atan(class068894.B) * 73.0);
            }
        }
        class014212.N(0.0f, 0.375f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(180.0f - f2));
        class014212.N((Quaternionfc)class02058.R.N(-f));
    }

    public void method_3936(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        class00500 class005002;
        super.method_3936(s, class014212, class012372, class069592);
        class014212.N();
        long l = ((class08454)s).L;
        float f = (((float)(l >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f2 = (((float)(l >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f3 = (((float)(l >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        class014212.N(f, f2, f3);
        if (((class08454)s).Z) {
            class02855.N(s, class014212);
        } else {
            class02855.y(s, class014212);
        }
        float f4 = ((class08454)s).i;
        if (f4 > 0.0f) {
            class014212.N((Quaternionfc)class02058.y.N(class04995.m((double)f4) * f4 * ((class08454)s).R / 10.0f * (float)((class08454)s).u));
        }
        if ((class005002 = ((class08454)s).B).b() != class06898.field_11455) {
            class014212.N();
            class014212.y(0.75f, 0.75f, 0.75f);
            class014212.N(-0.5f, (float)(((class08454)s).M - 8) / 16.0f, 0.5f);
            class014212.N((Quaternionfc)class02058.u.N(90.0f));
            this.N(s, class005002, class014212, class012372, ((class08454)s).G);
            class014212.y();
        }
        class014212.y(-1.0f, -1.0f, 1.0f);
        class012372.N((class06271)this.N, s, class014212, this.N.method_23500(y), ((class08454)s).G, class01384.u, ((class08454)s).l, null);
        class014212.y();
    }

    protected class00734 method_62358(T t) {
        class00734 class007342 = super.method_62358(t);
        if (!t.i().P()) {
            return class007342.y(0.0, (double)((float)t.M() * 0.75f / 16.0f), 0.0);
        }
        return class007342;
    }

    public class06889 method_23169(S s) {
        class06889 class068892 = super.method_23169(s);
        if (((class08454)s).Z && ((class08454)s).g != null) {
            return class068892.y(((class08454)s).g.M - ((class08454)s).E, ((class08454)s).g.B - ((class08454)s).W, ((class08454)s).g.Z - ((class08454)s).m);
        }
        return class068892;
    }

    protected void N(S s, class00500 class005002, class01421 class014212, class01237 class012372, int n) {
        class012372.N(class014212, class005002, n, class01384.u, ((class08454)s).l);
    }

    private static <S extends class08454> void N(S s, class01421 class014212) {
        class014212.N((Quaternionfc)class02058.u.N(s.y));
        class014212.N((Quaternionfc)class02058.R.N(-s.N));
        class014212.N(0.0f, 0.375f, 0.0f);
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        class02736 class027362 = t.N();
        if (class027362 instanceof class02726) {
            class02726 class027262 = (class02726)class027362;
            class02855.N(t, class027262, s, f);
            ((class08454)s).Z = true;
        } else {
            class027362 = t.N();
            if (class027362 instanceof class02757) {
                class02757 class027572 = (class02757)class027362;
                class02855.N(t, class027572, s, f);
                ((class08454)s).Z = false;
            }
        }
        long l = (long)t.method_5628() * 493286711L;
        ((class08454)s).L = l * l * 4392167121L + l * 98761L;
        ((class08454)s).i = (float)t.G() - f;
        ((class08454)s).u = t.l();
        ((class08454)s).R = Math.max(t.t() - f, 0.0f);
        ((class08454)s).M = t.M();
        ((class08454)s).B = t.i();
    }

    private static <T extends class07504, S extends class08454> void N(T t, class02757 class027572, S s, float f) {
        float f2 = 0.3f;
        s.N = t.method_61414(f);
        s.y = t.method_61415(f);
        double d = s.E;
        double d2 = s.W;
        double d3 = s.m;
        class06889 class068892 = class027572.L(d, d2, d3);
        if (class068892 != null) {
            s.I = class068892;
            class06889 class068893 = class027572.N(d, d2, d3, (double)0.3f);
            class06889 class068894 = class027572.N(d, d2, d3, (double)-0.3f);
            s.J = Objects.requireNonNullElse(class068893, class068892);
            s.o = Objects.requireNonNullElse(class068894, class068892);
        } else {
            s.I = null;
            s.J = null;
            s.o = null;
        }
    }

    private static <T extends class07504, S extends class08454> void N(T t, class02726 class027262, S s, float f) {
        if (class027262.P()) {
            s.g = class027262.i(f);
            s.N = class027262.L(f);
            s.y = class027262.u(f);
        } else {
            s.g = null;
            s.N = t.method_36455();
            s.y = t.method_36454();
        }
    }
}

