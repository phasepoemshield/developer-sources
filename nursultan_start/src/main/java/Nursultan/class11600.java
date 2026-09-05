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
 *  Nursultan.class09860
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11837
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09860;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11837;

public class class11600 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;

    private class11600() {
    }

    static {
        class11600.N();
        class11600.i();
        N_0 = new class11600()::N;
        N_2 = class09991.N().N(class09962.N()).y(class09962.N()).N(12.0f).B(8.0f).y(class09973.CENTER).N(class09975.ROW).N(class09983.BORDER_BOX).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f);
        class09991 class099912 = class09991.N();
        N_3 = class09991.N((class09991[])new class09991[]{class099912.i(((Integer)class09181.N_0).intValue()), class09221.N((int)16, (class09079)class09079.REGULAR)});
        N_4 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N((int)16, (class09079)class09079.REGULAR)});
    }

    private static void i() {
        N_1 = 20;
    }

    private static void N() {
    }

    private class09798 N(class11837 class118372, class09809 class098092) {
        return class09778.N((class09991)((class09991)N_2), (T class097842) -> {
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            if (!class118372.L()) {
                class097842.N_1(class098602 -> class118372.i().run());
            }
            class097842.L(class097772 -> {
                class097772.L(class118372.u());
                class097772.N(class09991.N().u(20.0f, 20.0f).i(class118372.y()));
            });
            if (class118372.N() != null && !class118372.N().isEmpty()) {
                class097842.N(class118372.N(), class118372.L() ? (class09991)N_4 : (class09991)N_3);
            }
        });
    }
}

