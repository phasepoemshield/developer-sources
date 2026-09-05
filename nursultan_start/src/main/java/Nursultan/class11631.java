/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09221
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09814
 *  Nursultan.class09844
 *  Nursultan.class09867
 *  Nursultan.class09904
 *  Nursultan.class09973
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11858
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09814;
import Nursultan.class09844;
import Nursultan.class09867;
import Nursultan.class09904;
import Nursultan.class09973;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11858;
import Nursultan.class12020;

public class class11631 {
    public static Object N_0;
    public static Object N_1;

    private static void L() {
    }

    private class11631() {
    }

    static {
        class11631.L();
        class11631.y();
        class11631.N();
        N_0 = new class11631()::N;
        class09991 class099913 = class09991.N().u(150.0f, 30.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.y_1).intValue()).i(((Integer)class09181.N_4).intValue()).y(class09973.CENTER).u(8.0f).N(class09983.BORDER_BOX).Z(8.0f);
        N_1 = class09991.N((class09991[])new class09991[]{class099913.u(class099912 -> class099912.i(((Integer)class09181.N_0).intValue())), class09221.N((int)14, (class09079)class09079.REGULAR)});
    }

    private static void y() {
    }

    private class09798 N(class11858 class118582, class09809 class098092) {
        return ((class09814)((class09814)((class09814)((class09814)((class09814)class09778.i().N(class118582.u())).L(class118582.i()).N((class09991)N_1)).i(class12020.N((String)class118582.u())).N(class09867.FOCUS, class098602 -> class118582.L().N((Object)true))).N(class09867.BLUR, class098602 -> {
            class118582.L().N((Object)false);
            class09904 class099042 = class098602.z();
            if (class118582.y() != null && !class118582.y().matcher(class099042.B()).matches()) {
                class099042.N(class118582.i());
            }
        })).N(class09867.INPUT, class098602 -> {
            class09844 class098442 = (class09844)class098602;
            String string = class098442.y();
            if (class118582.y() == null || class118582.y().matcher(string).matches()) {
                class118582.N().accept(string);
            } else if (!string.isEmpty()) {
                class098602.z().N(class098442.N());
            }
        })).i();
    }

    private static void N() {
    }
}

