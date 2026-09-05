/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11887;

public class class11905 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;
    public static Object u_4;
    public static Object u_5;
    public static Object u_6;
    public static Object u_7;
    public static Object i_0;
    public static Object i_1;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object R_4;
    public static Object R_5;
    public static Object R_6;
    public static Object R_7;

    private static void L() {
    }

    public static class11887 L(double d) {
        return d2 -> {
            if (d2 < 0.5) {
                return Math.pow(2.0, d - 1.0) * Math.pow(d2, d);
            }
            return 1.0 - Math.pow(-2.0 * d2 + 2.0, d) / 2.0;
        };
    }

    private class11905() {
    }

    static {
        class11905.y();
        class11905.u();
        class11905.L();
        class11905.N();
        class11905.i();
        N_5 = d -> d;
        N_6 = class11905.y(2);
        L_0 = class11905.N(2);
        L_1 = class11905.L(2.0);
        L_2 = class11905.y(3);
        L_3 = class11905.N(3);
        L_4 = class11905.L(3.0);
        L_5 = class11905.y(4);
        i_0 = class11905.N(4);
        i_1 = class11905.L(4.0);
        u_0 = class11905.y(5);
        u_1 = class11905.N(5);
        u_2 = class11905.L(5.0);
        u_3 = d -> 1.0 - Math.cos(d * Math.PI / 2.0);
        u_4 = d -> Math.sin(d * Math.PI / 2.0);
        u_5 = d -> -(Math.cos(Math.PI * d) - 1.0) / 2.0;
        u_6 = d -> 1.0 - Math.sqrt(1.0 - Math.pow(d, 2.0));
        u_7 = d -> Math.sqrt(1.0 - Math.pow(d - 1.0, 2.0));
        R_0 = d -> {
            if (d < 0.5) {
                return (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * d, 2.0))) / 2.0;
            }
            return (Math.sqrt(1.0 - Math.pow(-2.0 * d + 2.0, 2.0)) + 1.0) / 2.0;
        };
        R_1 = d -> {
            if (d == 0.0 || d == 1.0) {
                return d;
            }
            return Math.pow(-2.0, 10.0 * d - 10.0) * Math.sin((d * 10.0 - 10.75) * 2.0943951023931953);
        };
        R_2 = d -> {
            if (d == 0.0 || d == 1.0) {
                return d;
            }
            return Math.pow(2.0, -10.0 * d) * Math.sin((d * 10.0 - 0.75) * 2.0943951023931953) + 1.0;
        };
        R_3 = d -> {
            if (d == 0.0 || d == 1.0) {
                return d;
            }
            if (d < 0.5) {
                return -(Math.pow(2.0, 20.0 * d - 10.0) * Math.sin((20.0 * d - 11.125) * 1.3962634015954636)) / 2.0;
            }
            return Math.pow(2.0, -20.0 * d + 10.0) * Math.sin((20.0 * d - 11.125) * 1.3962634015954636) / 2.0 + 1.0;
        };
        R_4 = d -> {
            if (d != 0.0) {
                return Math.pow(2.0, 10.0 * d - 10.0);
            }
            return d;
        };
        R_5 = d -> {
            if (d != 1.0) {
                return 1.0 - Math.pow(2.0, -10.0 * d);
            }
            return d;
        };
        R_6 = d -> {
            if (d == 0.0 || d == 1.0) {
                return d;
            }
            if (d < 0.5) {
                return Math.pow(2.0, 20.0 * d - 10.0) / 2.0;
            }
            return (2.0 - Math.pow(2.0, -20.0 * d + 10.0)) / 2.0;
        };
        R_7 = d -> 2.70158 * Math.pow(d, 3.0) - 1.70158 * Math.pow(d, 2.0);
        y_0 = d -> 1.0 + 2.70158 * Math.pow(d - 1.0, 3.0) + 1.70158 * Math.pow(d - 1.0, 2.0);
        y_1 = d -> {
            if (d < 0.5) {
                return Math.pow(2.0 * d, 2.0) * (7.189819 * d - 2.5949095) / 2.0;
            }
            return (Math.pow(2.0 * d - 2.0, 2.0) * (3.5949095 * (d * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
        };
        y_2 = d -> {
            double d2 = 7.5625;
            double d3 = 2.75;
            if (d < 1.0 / d3) {
                return d2 * Math.pow(d, 2.0);
            }
            if (d < 2.0 / d3) {
                return d2 * Math.pow(d - 1.5 / d3, 2.0) + 0.75;
            }
            if (d < 2.5 / d3) {
                return d2 * Math.pow(d - 2.25 / d3, 2.0) + 0.9375;
            }
            return d2 * Math.pow(d - 2.625 / d3, 2.0) + 0.984375;
        };
        y_3 = d -> 1.0 - ((class11887)y_2).ease(1.0 - d);
        y_4 = d -> {
            if (d < 0.5) {
                return (1.0 - ((class11887)y_2).ease(1.0 - 2.0 * d)) / 2.0;
            }
            return (1.0 + ((class11887)y_2).ease(2.0 * d - 1.0)) / 2.0;
        };
    }

    private static void i() {
        N_0 = 1.70158;
        N_1 = 2.5949095;
        N_2 = 2.70158;
        N_3 = 2.0943951023931953;
        N_4 = 1.3962634015954636;
        N_5 = null;
        N_6 = null;
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
        i_0 = null;
        i_1 = null;
        u_0 = null;
        u_1 = null;
        u_2 = null;
        u_3 = null;
        u_4 = null;
        u_5 = null;
        u_6 = null;
        u_7 = null;
        R_0 = null;
        R_1 = null;
        R_2 = null;
        R_3 = null;
        R_4 = null;
        R_5 = null;
        R_6 = null;
        R_7 = null;
        y_0 = null;
        y_1 = null;
        y_2 = null;
        y_3 = null;
        y_4 = null;
    }

    private static void u() {
    }

    private static void y() {
    }

    public static class11887 y(int n) {
        return class11905.N((double)n);
    }

    public static class11887 y(double d) {
        return d2 -> 1.0 - Math.pow(1.0 - d2, d);
    }

    public static class11887 N(double d) {
        return d2 -> Math.pow(d2, d);
    }

    private static void N() {
    }

    public static class11887 N(int n) {
        return class11905.y((double)n);
    }
}

