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

public class class11622 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;

    private class11622() {
    }

    static {
        class11622.N();
        class11622.y();
        class11622.i();
        N_0 = new class11622()::N;
        N_1 = new class11863(500.0f, 34.0f, 1.0f, 0.5f, 2.0f, 0.008333334f);
        N_2 = class09991.N().u(52.0f, 24.0f).Z(9999.0f).N(class09692.N((class09994[])new class09994[]{class09994.N((class09743)((class09743)N_1)), class09994.y((class09743)((class09743)N_1))})).z(1.0f);
        N_3 = class09991.N().u(28.0f, 20.0f).N(class09969.FLOATING).N(class09692.N((class09994[])new class09994[]{class09994.N((class09743)((class09743)N_1)), class09994.B((class09743)((class09743)N_1))})).N(2.0f, 2.0f).v(5.0f).L(class09662.N((int)-16777216, (float)0.15f)).Z(9999.0f);
        N_4 = class09227.N((T class092112) -> class09991.N().y(class092112.L()).u(class092112.R()));
        N_5 = class09991.N().y(-14869219).u(((Integer)class09181.u_0).intValue());
        N_6 = class09227.N((T class092112) -> class09991.N().y(class092112.z()).U(22.0f));
        N_7 = class09991.N().y(((Integer)class09181.u_1).intValue());
    }

    private static void i() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
        N_7 = null;
    }

    private static void y() {
    }

    private class09798 N(class11861 class118612, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        boolean bl = class118612.N();
        class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)N_2, bl ? ((class09227)N_4).N(class092112) : (class09991)N_5});
        class09991 class099913 = class09991.N((class09991[])new class09991[]{(class09991)N_3, bl ? ((class09227)N_6).N(class092112) : (class09991)N_7});
        return class09778.N((class09991)class099912, class097842 -> {
            class097842.N_1(class098602 -> class118612.y().accept(!bl));
            class097842.y(class099913);
        });
    }

    private static void N() {
    }
}

