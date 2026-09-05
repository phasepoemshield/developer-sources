/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09181
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11644
 */
package Nursultan;

import Nursultan.class09181;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11644;

public class class11756 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;

    private static void L() {
        N_0 = 4;
        N_1 = 10;
        N_2 = 1;
        N_3 = 12;
        N_4 = 10;
        y_0 = 32;
        y_1 = null;
        y_2 = null;
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
    }

    private class11756() {
    }

    static {
        class11756.y();
        class11756.N();
        class11756.L();
        y_1 = class09991.N().j(4.0f).v(10.0f).L(((Integer)class09181.y_5).intValue()).y(((Integer)class09181.y_4).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(12.0f).N(class09983.BORDER_BOX);
        y_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N((float)0.0f, (float)32.0f)).y().y(class09973.CENTER).N(class09983.BORDER_BOX).N(class09692.N((class09994[])new class09994[]{class09994.W((class09743)((class09743)class11644.N_0)), class09994.M((class09743)((class09743)class11644.N_0)), class09994.s((class09743)((class09743)class11644.N_0))})).y(class099912 -> class099912.y(class09962.N((float)0.0f, (float)0.0f)).R(0.0f).l(0.0f));
        L_0 = class09991.N().N(class099912 -> class099912.y(class09962.N((float)0.0f, (float)0.0f)).R(0.0f).l(0.0f));
        L_1 = class09991.N((class09991[])new class09991[]{(class09991)y_2, class09991.N().R(0.0f)});
        L_2 = class09991.N((class09991[])new class09991[]{(class09991)y_2, class09991.N().R(10.0f)});
        L_3 = class09991.N((class09991[])new class09991[]{(class09991)L_1, (class09991)L_0});
        L_4 = class09991.N((class09991[])new class09991[]{(class09991)L_2, (class09991)L_0});
        class09991 class099913 = class09991.N();
        L_5 = class09991.N((class09991[])new class09991[]{(class09991)y_2, class099913.y(class09962.N((float)0.0f, (float)0.0f)).R(0.0f).l(0.0f)});
    }

    private static void y() {
    }

    public static class09991 N(boolean bl, boolean bl2) {
        if (bl2) {
            return bl ? (class09991)L_3 : (class09991)L_4;
        }
        return bl ? (class09991)L_1 : (class09991)L_2;
    }

    public static class09991 N(class09991 class099912, float f, float f2) {
        float f3 = Math.max(f2, (float)Math.ceil(f));
        return class09991.N((class09991[])new class09991[]{class099912, class09991.N().N(class09962.y((float)f3))});
    }

    public static class09991 N(class09991 class099912, float f, float f2, class09743 class097432) {
        return class09991.N((class09991[])new class09991[]{class11756.N(class099912, f, f2), class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.E((class09743)class097432)}))});
    }

    private static void N() {
    }
}

