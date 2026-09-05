/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09331
 *  Nursultan.class11499
 *  Nursultan.class11938
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08038
 */
package Nursultan;

import Nursultan.class09331;
import Nursultan.class11499;
import Nursultan.class11938;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08038;

public class class11892 {
    private static double[] u;
    private static String[] B;
    public static Object N_0;

    private static void L() {
    }

    private class11892() {
        throw new UnsupportedOperationException(B[0]);
    }

    static {
        class11892.N();
        class11892.y();
        class11892.u();
        class11892.L();
        N_0 = class06202.Nq();
    }

    private static void u() {
        B = new String[1];
        class11892.B[0] = "This is a utility class and cannot be instantiated";
    }

    public static Optional<class06889> y(class06889 class068892, class06889 class068893, class07049 class070492) {
        class00734 class007342 = class070492.method_5829().M((double)class070492.method_5871());
        if (class007342.u(class068892)) {
            return Optional.of(class068892);
        }
        return class007342.y(class068892, class068893);
    }

    private static void y() {
    }

    private static class06145 N(class07049 class070492, Predicate<class07049> predicate, class06889 class068892, class06889 class068893, double d, double d2) {
        class06889 class068894 = class068893.y(class068892.M * d, class068892.B * d, class068892.Z * d);
        float f = 1.0f;
        class00734 class007342 = class070492.method_5829().y(class068892.L(d)).L((double)f, (double)f, (double)f);
        return class08038.N((class07049)class070492, (class06889)class068893, (class06889)class068894, (class00734)class007342, predicate, (double)d2);
    }

    public static boolean N(class06889 class068892, class06889 class068893, class00734 class007342) {
        if (class007342.u(class068892)) {
            return false;
        }
        return class007342.y(class068892, class068893).isEmpty();
    }

    public static class06183 N(class05862 class058622) {
        return class11892.N(class058622, (class00500 class005002, class07209 class072092) -> true);
    }

    public static class07089 N(class07049 class070492, class11499 class114992, double d, boolean bl, Predicate<class07049> predicate) {
        return class11892.N(class070492, class114992.y(), class114992.R(), d, bl, predicate);
    }

    public static class07089 N(class07049 class070492, double d, boolean bl, Predicate<class07049> predicate) {
        return class11892.N(class070492, class070492.method_5828(1.0f), d, bl, predicate);
    }

    public static class06183 N(class05862 class058623, BiPredicate<class00500, class07209> biPredicate) {
        return (class06183)class07290.N((class06889)class058623.y(), (class06889)class058623.N(), (Object)class058623, (class058622, class072092) -> {
            class00500 class005002 = ((class03448)((class06202)class11892.N_0).T_3).method_8320(class072092);
            class04688 class046882 = ((class03448)((class06202)class11892.N_0).T_3).method_8316(class072092);
            class06889 class068892 = class058622.y();
            class06889 class068893 = class058622.N();
            boolean bl = biPredicate.test(class005002, (class07209)class072092);
            class09331 class093312 = class09331.N((class00500)class005002, (class07209)class072092);
            class11938.L().L(class093312);
            if (class093312.y()) {
                bl = false;
            }
            class00494 class004942 = class058622.N(class005002, (class07290)((class03448)((class06202)class11892.N_0).T_3), class072092);
            class06183 class061832 = ((class03448)((class06202)class11892.N_0).T_3).N(class068892, class068893, class072092, class004942, class005002);
            class06183 class061833 = class058622.N(class046882, (class07290)((class03448)((class06202)class11892.N_0).T_3), class072092).method_1092(class068892, class068893, class072092);
            double d = class061832 == null ? u[0] : class068892.M(class061832.y());
            double d2 = class061833 == null ? u[1] : class068892.M(class061833.y());
            return d <= d2 && bl ? class061832 : class061833;
        }, (T class058622) -> {
            class06889 class068892 = class058622.y().u(class058622.N());
            return class06183.N((class06889)class058622.N(), (class07211)class07211.N((double)class068892.M, (double)class068892.B, (double)class068892.Z), (class07209)class07209.method_49638((class00737)class058622.N()));
        });
    }

    public static boolean N(class11499 class114992, double d, class05849 class058492, class05835 class058352) {
        class06889 class068892;
        class06889 class068893 = ((class04453)((class06202)class11892.N_0).T_4).method_5631(class114992.R(), class114992.y());
        class06889 class068894 = ((class04453)((class06202)class11892.N_0).T_4).method_33571();
        return ((class03448)((class06202)class11892.N_0).T_3).N(new class05862(class068894, class068892 = class068893.L(d).i(class068894), class058492, class058352, (class07049)((class04453)((class06202)class11892.N_0).T_4))).N() == class07113.field_1333;
    }

    private static class06145 N(class07049 class070492, Predicate<class07049> predicate, class06889 class068892, double d, double d2) {
        return class11892.N(class070492, predicate, class070492.method_5828(1.0f), class068892, d, d2);
    }

    public static boolean N(class06889 class068892, class06889 class068893, class05849 class058492, class05835 class058352) {
        return class11892.N(new class05862(class068892, class068893, class058492, class058352, (class07049)((class04453)((class06202)class11892.N_0).T_4))).N() == class07113.field_1333;
    }

    private static void N() {
        u = new double[2];
        class11892.u[0] = Double.longBitsToDouble(0x7FEFFFFFFFFFFFFFL);
        class11892.u[1] = Double.longBitsToDouble(0x7FEFFFFFFFFFFFFFL);
    }

    public static boolean N(class06889 class068892, class05849 class058492, class05835 class058352) {
        return class11892.N(((class04453)((class06202)class11892.N_0).T_4).method_33571(), class068892, class058492, class058352);
    }

    public static class07089 N(class07049 class070492, float f, float f2, double d, boolean bl, Predicate<class07049> predicate) {
        return class11892.N(class070492, class070492.method_5631(f2, f), d, bl, predicate);
    }

    public static boolean N(class06889 class068892, class06889 class068893, class07049 class070492) {
        return class11892.N(class068892, class068893, class070492.method_5829().M((double)class070492.method_5871()));
    }

    private static class07089 N(class07089 class070892, class06889 class068892, double d) {
        if (!class070892.y().N((class00737)class068892, d)) {
            class06889 class068893 = class070892.y();
            class07211 class072112 = class07211.N((double)(class068893.M - class068892.M), (double)(class068893.B - class068892.B), (double)(class068893.Z - class068892.Z));
            return class06183.N((class06889)class068893, (class07211)class072112, (class07209)class07209.method_49638((class00737)class068893));
        }
        return class070892;
    }

    public static class07089 N(class07049 class070492, class06889 class068892, double d, boolean bl, Predicate<class07049> predicate) {
        return class11892.N(class070492, class070492.method_5836(1.0f), class068892, d, bl, predicate);
    }

    public static boolean N(class11499 class114992, double d, class07049 class070492) {
        class06889 class068892 = ((class04453)((class06202)class11892.N_0).T_4).method_5631(class114992.R(), class114992.y());
        class06889 class068893 = ((class04453)((class06202)class11892.N_0).T_4).method_33571();
        class06889 class068894 = class068892.L(d);
        return class11892.N(class068893, class068893.i(class068894), class070492);
    }

    public static boolean N(class11499 class114992, double d, class00734 class007342) {
        class06889 class068892 = ((class04453)((class06202)class11892.N_0).T_4).method_5631(class114992.R(), class114992.y());
        class06889 class068893 = ((class04453)((class06202)class11892.N_0).T_4).method_33571();
        class06889 class068894 = class068892.L(d);
        return class11892.N(class068893, class068893.i(class068894), class007342);
    }

    private static class07089 N(class07049 class070492, double d, Predicate<class07049> predicate) {
        class06145 class061452;
        double d2 = d;
        double d3 = class04995.E((double)d2);
        class06889 class068892 = class070492.method_5836(1.0f);
        class07089 class070892 = class070492.method_5745(d2, 1.0f, false);
        double d4 = class070892.y().M(class068892);
        if (class070892.N() != class07113.field_1333) {
            d3 = d4;
            d2 = Math.sqrt(d4);
        }
        return (class061452 = class11892.N(class070492, predicate, class068892, d2, d3)) != null && class061452.y().M(class068892) < d4 ? class11892.N((class07089)class061452, class068892, d) : class11892.N(class070892, class068892, d);
    }

    public static class07089 N(class07049 class070492, class06889 class068892, class06889 class068893, double d, boolean bl, Predicate<class07049> predicate) {
        if (bl) {
            return class11892.N(class070492, d, predicate);
        }
        double d2 = class04995.E((double)d);
        class06145 class061452 = class11892.N(class070492, predicate, class068893, class068892, d, d2);
        if (class061452 == null) {
            return null;
        }
        return class11892.N((class07089)class061452, class068892, d);
    }
}

