/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03008
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04300
 *  minecraft.class04562
 *  minecraft.class04573
 *  minecraft.class05056
 *  minecraft.class05946
 *  minecraft.class05967
 *  minecraft.class06066
 *  minecraft.class07376
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03008;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03865;
import minecraft.class03866;
import minecraft.class03873;
import minecraft.class03877;
import minecraft.class03885;
import minecraft.class03890;
import minecraft.class03896;
import minecraft.class03903;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04300;
import minecraft.class04562;
import minecraft.class04573;
import minecraft.class05056;
import minecraft.class05946;
import minecraft.class05967;
import minecraft.class06066;
import minecraft.class07376;

public class class03882 {
    public static final float N = -0.50375f;
    private static final float P = 0.08f;
    private static final double s = 1.5;
    private static final double T = 1.5;
    private static final double b = 1.5625;
    private static final double j = -0.703125;
    public static final double y = 0.390625;
    public static final int L = 64;
    public static final long u = 4096L;
    private static final int v = -64;
    private static final int n = 320;
    private static final double t = 1.5;
    private static final double G = -1.5;
    private static final int l = 24;
    private static final double d = 4.0;
    private static final class03877 w = class03865.N(10.0);
    private static final class03877 k = class03865.N();
    private static final class05946<class03877> Y = class03882.N("zero");
    private static final class05946<class03877> Q = class03882.N("y");
    private static final class05946<class03877> O = class03882.N("shift_x");
    private static final class05946<class03877> g = class03882.N("shift_z");
    private static final class05946<class03877> I = class03882.N("overworld/base_3d_noise");
    private static final class05946<class03877> J = class03882.N("nether/base_3d_noise");
    private static final class05946<class03877> o = class03882.N("end/base_3d_noise");
    public static final class05946<class03877> i = class03882.N("overworld/continents");
    public static final class05946<class03877> R = class03882.N("overworld/erosion");
    public static final class05946<class03877> M = class03882.N("overworld/ridges");
    public static final class05946<class03877> B = class03882.N("overworld/ridges_folded");
    public static final class05946<class03877> Z = class03882.N("overworld/offset");
    public static final class05946<class03877> z = class03882.N("overworld/factor");
    public static final class05946<class03877> U = class03882.N("overworld/jaggedness");
    public static final class05946<class03877> E = class03882.N("overworld/depth");
    private static final class05946<class03877> q = class03882.N("overworld/sloped_cheese");
    public static final class05946<class03877> W = class03882.N("overworld_large_biomes/continents");
    public static final class05946<class03877> m = class03882.N("overworld_large_biomes/erosion");
    private static final class05946<class03877> K = class03882.N("overworld_large_biomes/offset");
    private static final class05946<class03877> V = class03882.N("overworld_large_biomes/factor");
    private static final class05946<class03877> e = class03882.N("overworld_large_biomes/jaggedness");
    private static final class05946<class03877> H = class03882.N("overworld_large_biomes/depth");
    private static final class05946<class03877> c = class03882.N("overworld_large_biomes/sloped_cheese");
    private static final class05946<class03877> X = class03882.N("overworld_amplified/offset");
    private static final class05946<class03877> a = class03882.N("overworld_amplified/factor");
    private static final class05946<class03877> p = class03882.N("overworld_amplified/jaggedness");
    private static final class05946<class03877> F = class03882.N("overworld_amplified/depth");
    private static final class05946<class03877> A = class03882.N("overworld_amplified/sloped_cheese");
    private static final class05946<class03877> f = class03882.N("end/sloped_cheese");
    private static final class05946<class03877> C = class03882.N("overworld/caves/spaghetti_roughness_function");
    private static final class05946<class03877> S = class03882.N("overworld/caves/entrances");
    private static final class05946<class03877> x = class03882.N("overworld/caves/noodle");
    private static final class05946<class03877> D = class03882.N("overworld/caves/pillars");
    private static final class05946<class03877> h = class03882.N("overworld/caves/spaghetti_2d_thickness_modulator");
    private static final class05946<class03877> r = class03882.N("overworld/caves/spaghetti_2d");

    private static class03877 L(class02055<class05056> class020552) {
        double d = 25.0;
        double d2 = 0.3;
        class03877 class038772 = class03865.y((class03556<class05056>)class020552.y(class03008.P), 25.0, 0.3);
        class03877 class038773 = class03865.N((class03556<class05056>)class020552.y(class03008.s), 0.0, -2.0);
        class03877 class038774 = class03865.N((class03556<class05056>)class020552.y(class03008.T), 0.0, 1.1);
        return class03865.u(class03865.y(class03865.N(class03865.y(class038772, class03865.N(2.0)), class038773), class038774.B()));
    }

    public static class03866 L(class02055<class03877> class020552, class02055<class05056> class020553) {
        return class03882.y(class020552, class020553, class03882.N(class03882.N(class020552, o), 0, 256));
    }

    private static class03877 L(class03877 class038772) {
        return class03865.y(class03865.N(class03865.R(class038772)), class03865.N(0.64)).E();
    }

    private static class03877 i(class02055<class03877> class020552, class02055<class05056> class020553) {
        class03877 class038772 = class03882.N(class020552, Q);
        int n = -64;
        int n2 = -60;
        int n3 = 320;
        class03877 class038773 = class03882.N(class038772, class03865.y((class03556<class05056>)class020553.y(class03008.q), 1.0, 1.0), -60, 320, -1);
        class03877 class038774 = class03882.N(class038772, class03865.N((class03556<class05056>)class020553.y(class03008.K), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
        double d = 2.6666666666666665;
        class03877 class038775 = class03882.N(class038772, class03865.y((class03556<class05056>)class020553.y(class03008.V), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
        class03877 class038776 = class03882.N(class038772, class03865.y((class03556<class05056>)class020553.y(class03008.e), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
        class03877 class038777 = class03865.y(class03865.N(1.5), class03865.u(class038775.R(), class038776.R()));
        return class03865.N(class038773, -1000000.0, 0.0, class03865.N(64.0), class03865.N(class038774, class038777));
    }

    private static class03877 u(class02055<class03877> class020552, class02055<class05056> class020553) {
        class03877 class038772 = class03865.u(class03865.y((class03556<class05056>)class020553.y(class03008.l), 2.0, 1.0));
        class03877 class038773 = class03865.N((class03556<class05056>)class020553.y(class03008.d), -0.065, -0.088);
        class03877 class038774 = class03865.N(class038772, (class03556<class05056>)class020553.y(class03008.t), class03873.field_37066);
        class03877 class038775 = class03865.N(class038772, (class03556<class05056>)class020553.y(class03008.G), class03873.field_37066);
        class03877 class038776 = class03865.N(class03865.u(class038774, class038775), class038773).N(-1.0, 1.0);
        class03877 class038777 = class03882.N(class020552, C);
        return class03865.u(class03865.L(class03865.N(class03865.N(class03865.y((class03556<class05056>)class020553.y(class03008.Y), 0.75, 0.5), class03865.N(0.37)), class03865.N(-10, 30, 0.3, 0.0)), class03865.N(class038777, class038776)));
    }

    private static class03877 u(class03877 class038772) {
        return class03882.N(class038772, 0, 128);
    }

    private static class03877 y(class03877 class038772, class03877 class038773) {
        class03877 class038774 = class03865.y(class038773, class038772);
        return class03865.y(class03865.N(4.0), class038774.z());
    }

    public static class03866 y(class02055<class03877> class020552, class02055<class05056> class020553) {
        return class03882.y(class020552, class020553, class03882.N(class020552, -64, 192));
    }

    private static class03866 y(class02055<class03877> class020552, class02055<class05056> class020553, class03877 class038772) {
        class03877 class038773 = class03882.N(class020552, O);
        class03877 class038774 = class03882.N(class020552, g);
        class03877 class038775 = class03865.N(class038773, class038774, 0.25, (class03556<class05056>)class020553.y(class03008.N));
        class03877 class038776 = class03865.N(class038773, class038774, 0.25, (class03556<class05056>)class020553.y(class03008.y));
        class03877 class038777 = class03882.L(class038772);
        return new class03866(class03865.N(), class03865.N(), class03865.N(), class03865.N(), class038775, class038776, class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class038777, class03865.N(), class03865.N(), class03865.N());
    }

    private static class03877 y(class03877 class038772) {
        return class03865.y(class03865.N(class03865.N(class038772.R(), class03865.N(-0.6666666666666666)).R(), class03865.N(-0.3333333333333333)), class03865.N(-3.0));
    }

    private static class03877 y(class02055<class05056> class020552) {
        class03877 class038772 = class03865.N((class03556<class05056>)class020552.y(class03008.w));
        return class03865.u(class03865.y(class03865.N((class03556<class05056>)class020552.y(class03008.k), 0.0, -0.1), class03865.N(class038772.R(), class03865.N(-0.4))));
    }

    public static class03866 N() {
        return new class03866(class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N());
    }

    public static class03866 N(class02055<class03877> class020552) {
        class03877 class038772 = class03865.L(class03865.N(0L));
        class03877 class038773 = class03882.L(class03882.u(class03882.N(class020552, f)));
        return new class03866(class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class03865.N(), class038772, class03865.N(), class03865.N(), class03865.N(), class038773, class03865.N(), class03865.N(), class03865.N());
    }

    private static class03877 N(class03877 class038772, class03877 class038773, int n, int n2, int n3) {
        return class03865.N(class03865.N(class038772, (double)n, (double)(n2 + 1), class038773, class03865.N((double)n3)));
    }

    private static class05946<class03877> N(String string) {
        return class05946.N((class05946)class04227.yy, (class01894)class01894.y((String)string));
    }

    private static class03877 N(class03877 class038772, int n, int n2, int n3, int n4, double d, int n5, int n6, double d2) {
        class03877 class038773 = class038772;
        class038773 = class03865.N(class03865.N(n + n2 - n3, n + n2 - n4, 1.0, 0.0), d, class038773);
        class038773 = class03865.N(class03865.N(n + n5, n + n6, 0.0, 1.0), d2, class038773);
        return class038773;
    }

    private static class03877 N(class03877 class038772, class03877 class038773, boolean bl) {
        class03877 class038774 = class03865.L(class038773);
        class03877 class038775 = class03865.L(class038772);
        class03877 class038776 = class03882.N(class03865.N(class03865.y(class03865.N(0.2734375), class038774.U()), class03865.y(class03865.N(-1.0), class038775)), 1.5, -1.5, -64.0, 320.0);
        class038776 = class038776.N(-40.0, 320.0);
        return class03865.N(class03865.N(class03882.N(bl, class03865.N(class03882.y(class038774, class03882.N(class038775)), class03865.N(-0.703125)).N(-64.0, 64.0)), class03865.N(-0.390625)), class038776, -64, class05967.y.N());
    }

    private static class03877 N(class04116<class03877> class041162, class05946<class03877> class059462, class03877 class038772) {
        return new class03885((class03556<class03877>)class041162.N(class059462, (Object)class038772));
    }

    private static class03877 N(class03877 class038772, class03877 class038773) {
        return class03865.y(class03865.L(class03865.N(class03865.y(), class038773, class038772)));
    }

    private static class03877 N(class03877 class038772, double d, double d2, double d3, double d4) {
        double d5 = (d4 - d3) / (d2 - d);
        double d6 = d3 - d * d5;
        return class03865.N(class03865.y(class038772, class03865.N(d5)), class03865.N(d6));
    }

    private static void N(class04116<class03877> class041162, class02055<class03877> class020552, class03877 class038772, class03556<class03877> class035562, class03556<class03877> class035563, class05946<class03877> class059462, class05946<class03877> class059463, class05946<class03877> class059464, class05946<class03877> class059465, class05946<class03877> class059466, boolean bl) {
        class03890 class038902 = new class03890(class035562);
        class03890 class038903 = new class03890(class035563);
        class03890 class038904 = new class03890((class03556<class03877>)class020552.y(M));
        class03890 class038905 = new class03890((class03556<class03877>)class020552.y(B));
        class03877 class038773 = class03882.N(class041162, class059462, class03882.N(class03865.N(class03865.N(-0.50375f), class03865.N((class04562<class03903, class03890>)class04300.N((class04573)class038902, (class04573)class038903, (class04573)class038905, (boolean)bl))), class03865.L()));
        class03877 class038774 = class03882.N(class041162, class059463, class03882.N(class03865.N((class04562<class03903, class03890>)class04300.N((class04573)class038902, (class04573)class038903, (class04573)class038904, (class04573)class038905, (boolean)bl)), w));
        class03877 class038775 = class03882.N(class041162, class059465, class03882.N(class038773));
        class03877 class038776 = class03865.y(class03882.N(class041162, class059464, class03882.N(class03865.N((class04562<class03903, class03890>)class04300.y((class04573)class038902, (class04573)class038903, (class04573)class038904, (class04573)class038905, (boolean)bl)), k)), class038772.Z());
        class03877 class038777 = class03882.y(class038774, class03865.N(class038775, class038776));
        class041162.N(class059466, (Object)class03865.N(class038777, class03882.N(class020552, I)));
    }

    private static class03877 N(class02055<class03877> class020552, class02055<class05056> class020553, class03877 class038772) {
        class03877 class038773 = class03882.N(class020552, r);
        class03877 class038774 = class03882.N(class020552, C);
        class03877 class038775 = class03865.N((class03556<class05056>)class020553.y(class03008.Q), 8.0);
        class03877 class038776 = class03865.y(class03865.N(4.0), class038775.M());
        class03877 class038777 = class03865.N((class03556<class05056>)class020553.y(class03008.O), 0.6666666666666666);
        class03877 class038778 = class03865.N(class03865.N(class03865.N(0.27), class038777).N(-1.0, 1.0), class03865.N(class03865.N(1.5), class03865.y(class03865.N(-0.64), class038772)).N(0.0, 0.5));
        class03877 class038779 = class03865.L(class03865.L(class03865.N(class038776, class038778), class03882.N(class020552, S)), class03865.N(class038773, class038774));
        class03877 class0387710 = class03882.N(class020552, D);
        class03877 class0387711 = class03865.N(class0387710, -1000000.0, 0.03, class03865.N(-1000000.0), class0387710);
        return class03865.u(class038779, class0387711);
    }

    private static class03877 N(class03877 class038772) {
        return class03865.N(class03865.N(-64, 320, 1.5, -1.5), class038772);
    }

    public static float N(float f) {
        return -(Math.abs(Math.abs(f) - 0.6666667f) - 0.33333334f) * 3.0f;
    }

    private static class03877 N(class02055<class03877> class020552, class05946<class03877> class059462) {
        return new class03885((class03556<class03877>)class020552.y(class059462));
    }

    private static class03877 N(class03877 class038772, int n, int n2) {
        return class03882.N(class038772, n, n2, 72, -184, -23.4375, 4, 32, -0.234375);
    }

    private static class03877 N(class02055<class03877> class020552, int n, int n2) {
        return class03882.N(class03882.N(class020552, J), n, n2, 24, 0, 0.9375, -8, 24, 2.5);
    }

    public static class03866 N(class02055<class03877> class020552, class02055<class05056> class020553) {
        return class03882.y(class020552, class020553, class03882.N(class020552, 0, 128));
    }

    public static class03866 N(class02055<class03877> class020552, class02055<class05056> class020553, boolean bl, boolean bl2) {
        class03877 class038772 = class03865.N((class03556<class05056>)class020553.y(class03008.U), 0.5);
        class03877 class038773 = class03865.N((class03556<class05056>)class020553.y(class03008.E), 0.67);
        class03877 class038774 = class03865.N((class03556<class05056>)class020553.y(class03008.m), 0.7142857142857143);
        class03877 class038775 = class03865.N((class03556<class05056>)class020553.y(class03008.W));
        class03877 class038776 = class03882.N(class020552, O);
        class03877 class038777 = class03882.N(class020552, g);
        class03877 class038778 = class03865.N(class038776, class038777, 0.25, (class03556<class05056>)class020553.y(bl ? class03008.i : class03008.N));
        class03877 class038779 = class03865.N(class038776, class038777, 0.25, (class03556<class05056>)class020553.y(bl ? class03008.R : class03008.y));
        class03877 class0387710 = class03882.N(class020552, bl ? K : (bl2 ? X : Z));
        class03877 class0387711 = class03882.N(class020552, bl ? V : (bl2 ? a : z));
        class03877 class0387712 = class03882.N(class020552, bl ? H : (bl2 ? F : E));
        class03877 class0387713 = class03882.N(class0387710, class0387711, bl2);
        class03877 class0387714 = class03882.N(class020552, bl ? c : (bl2 ? A : q));
        class03877 class0387715 = class03865.L(class0387714, class03865.y(class03865.N(5.0), class03882.N(class020552, S)));
        class03877 class0387716 = class03865.N(class0387714, -1000000.0, 1.5625, class0387715, class03882.N(class020552, class020553, class0387714));
        class03877 class0387717 = class03865.L(class03882.L(class03882.N(bl2, class0387716)), class03882.N(class020552, x));
        class03877 class0387718 = class03882.N(class020552, Q);
        int n = Stream.of(class03896.values()).mapToInt(class038962 -> class038962.field_33607).min().orElse(-class07376.i * 2);
        int n2 = Stream.of(class03896.values()).mapToInt(class038962 -> class038962.field_33608).max().orElse(-class07376.i * 2);
        class03877 class0387719 = class03882.N(class0387718, class03865.y((class03556<class05056>)class020553.y(class03008.g), 1.5, 1.5), n, n2, 0);
        float f = 4.0f;
        class03877 class0387720 = class03882.N(class0387718, class03865.y((class03556<class05056>)class020553.y(class03008.I), 4.0, 4.0), n, n2, 0).R();
        class03877 class0387721 = class03882.N(class0387718, class03865.y((class03556<class05056>)class020553.y(class03008.J), 4.0, 4.0), n, n2, 0).R();
        class03877 class0387722 = class03865.N(class03865.N(-0.08f), class03865.u(class0387720, class0387721));
        class03877 class0387723 = class03865.N((class03556<class05056>)class020553.y(class03008.o));
        return new class03866(class038772, class038773, class038774, class038775, class038778, class038779, class03882.N(class020552, bl ? W : i), class03882.N(class020552, bl ? m : R), class0387712, class03882.N(class020552, M), class0387713, class0387717, class0387719, class0387722, class0387723);
    }

    public static class03556<? extends class03877> N(class04116<class03877> class041162) {
        class02055 class020552 = class041162.N(class04227.yW);
        class02055 class020553 = class041162.N(class04227.yy);
        class041162.N(Y, (Object)class03865.N());
        int n = class07376.i * 2;
        int n2 = class07376.u * 2;
        class041162.N(Q, (Object)class03865.N(n, n2, (double)n, (double)n2));
        class03877 class038772 = class03882.N(class041162, O, class03865.y(class03865.L(class03865.y((class03556<class05056>)class020552.y(class03008.z)))));
        class03877 class038773 = class03882.N(class041162, g, class03865.y(class03865.L(class03865.L((class03556<class05056>)class020552.y(class03008.z)))));
        class041162.N(I, (Object)class06066.N((double)0.25, (double)0.125, (double)80.0, (double)160.0, (double)8.0));
        class041162.N(J, (Object)class06066.N((double)0.25, (double)0.375, (double)80.0, (double)60.0, (double)8.0));
        class041162.N(o, (Object)class06066.N((double)0.25, (double)0.25, (double)80.0, (double)160.0, (double)4.0));
        class03529 class035292 = class041162.N(i, (Object)class03865.y(class03865.N(class038772, class038773, 0.25, (class03556<class05056>)class020552.y(class03008.L))));
        class03529 class035293 = class041162.N(R, (Object)class03865.y(class03865.N(class038772, class038773, 0.25, (class03556<class05056>)class020552.y(class03008.u))));
        class03877 class038774 = class03882.N(class041162, M, class03865.y(class03865.N(class038772, class038773, 0.25, (class03556<class05056>)class020552.y(class03008.Z))));
        class041162.N(B, (Object)class03882.y(class038774));
        class03877 class038775 = class03865.y((class03556<class05056>)class020552.y(class03008.H), 1500.0, 0.0);
        class03882.N(class041162, (class02055<class03877>)class020553, class038775, (class03556<class03877>)class035292, (class03556<class03877>)class035293, Z, z, U, E, q, false);
        class03529 class035294 = class041162.N(W, (Object)class03865.y(class03865.N(class038772, class038773, 0.25, (class03556<class05056>)class020552.y(class03008.M))));
        class03529 class035295 = class041162.N(m, (Object)class03865.y(class03865.N(class038772, class038773, 0.25, (class03556<class05056>)class020552.y(class03008.B))));
        class03882.N(class041162, (class02055<class03877>)class020553, class038775, (class03556<class03877>)class035294, (class03556<class03877>)class035295, K, V, e, H, c, false);
        class03882.N(class041162, (class02055<class03877>)class020553, class038775, (class03556<class03877>)class035292, (class03556<class03877>)class035293, X, a, p, F, A, true);
        class041162.N(f, (Object)class03865.N(class03865.N(0L), class03882.N((class02055<class03877>)class020553, o)));
        class041162.N(C, (Object)class03882.y((class02055<class05056>)class020552));
        class041162.N(h, (Object)class03865.u(class03865.N((class03556<class05056>)class020552.y(class03008.n), 2.0, 1.0, -0.6, -1.3)));
        class041162.N(r, (Object)class03882.R((class02055<class03877>)class020553, (class02055<class05056>)class020552));
        class041162.N(S, (Object)class03882.u((class02055<class03877>)class020553, (class02055<class05056>)class020552));
        class041162.N(x, (Object)class03882.i((class02055<class03877>)class020553, (class02055<class05056>)class020552));
        return class041162.N(D, (Object)class03882.L((class02055<class05056>)class020552));
    }

    private static class03877 N(boolean bl, class03877 class038772) {
        return class03882.N(class038772, -64, 384, bl ? 16 : 80, bl ? 0 : 64, -0.078125, 0, 24, bl ? 0.4 : 0.1171875);
    }

    private static class03877 R(class02055<class03877> class020552, class02055<class05056> class020553) {
        class03877 class038772 = class03865.N(class03865.y((class03556<class05056>)class020553.y(class03008.v), 2.0, 1.0), (class03556<class05056>)class020553.y(class03008.b), class03873.field_37067);
        class03877 class038773 = class03865.N((class03556<class05056>)class020553.y(class03008.j), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
        class03877 class038774 = class03882.N(class020552, h);
        class03877 class038775 = class03865.N(class03865.N(class038773, class03865.N(-64, 320, 8.0, -40.0)).R(), class038774).B();
        double d = 0.083;
        return class03865.u(class03865.N(class038772, class03865.y(class03865.N(0.083), class038774)), class038775).N(-1.0, 1.0);
    }
}

