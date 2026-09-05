/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09227
 *  Nursultan.class09662
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09969
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11861
 *  Nursultan.class11863
 */
package Nursultan;

import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09227;
import Nursultan.class09662;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09969;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11861;
import Nursultan.class11863;

public class class11601 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object y_0;
    public static Object y_1;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;

    private class11601() {
    }

    static {
        class11601.y();
        class11601.N();
        u_0 = (class09788<class11861>) new class11601()::N;
        u_2 = class11601.R(52);
        y_0 = class11601.R(24);
        N_0 = class11601.R(28);
        N_1 = (int)((Integer)y_0);
        int n = (Integer)u_2;
        N_2 = n - ((Integer)N_0).intValue() - 4;
        N_3 = new class11863(500.0f, 34.0f, 1.0f, 0.5f, 2.0f, 0.008333334f);
        class09991 class099912 = class09991.N();
        int n2 = (Integer)u_2;
        N_4 = class099912.u((float)n2, (float)((Integer)y_0).intValue()).Z(9999.0f).N(class09692.N((class09994[])new class09994[]{class09994.N((class09743)((class09743)N_3)), class09994.y((class09743)((class09743)N_3))})).z(1.0f);
        class09991 class099913 = class09991.N();
        int n3 = (Integer)N_0;
        L_0 = class099913.u((float)n3, (float)((Integer)N_1).intValue()).N(class09969.FLOATING).N(class09692.N((class09994[])new class09994[]{class09994.N((class09743)((class09743)N_3)), class09994.B((class09743)((class09743)N_3))})).N(2.0f, 0.0f).v(5.0f).L(class09662.N((int)-16777216, (float)0.15f)).Z(9999.0f);
        L_1 = class09227.N((class09211 class092112) -> class09991.N().y(class092112.L()).u(class092112.R()));
        L_2 = class09991.N().y(-14869219).u(((Integer)class09181.u_0).intValue());
        L_3 = class09227.N((class09211 class092112) -> class09991.N().y(class092112.z()).U((float)((Integer)N_2).intValue()));
        L_4 = class09991.N().y(((Integer)class09181.u_1).intValue());
    }

    private static void y() {
    }

    private class09798 N(class11861 class118612, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        boolean bl = class118612.N();
        class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)N_4, bl ? ((class09227)L_1).N(class092112) : (class09991)L_2});
        class09991 class099913 = class09991.N((class09991[])new class09991[]{(class09991)L_0, bl ? ((class09227)L_3).N(class092112) : (class09991)L_4});
        return class09778.N((class09991)class099912, class097842 -> {
            class097842.N_1(class098602 -> class118612.y().accept(!bl));
            class097842.y(class099913);
        });
    }

    private static void N() {
        u_1 = Float.valueOf(0.6f);
        u_2 = 0;
        y_0 = 0;
        y_1 = 2;
        N_0 = 0;
        N_1 = 0;
        N_2 = 0;
    }

    private static int R(int n) {
        return Math.round((float)n * 0.6f / 2.0f) * 2;
    }
}

