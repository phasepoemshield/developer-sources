/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09221
 *  Nursultan.class09778
 *  Nursultan.class09785
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09864
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09976
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11348
 *  Nursultan.class11860
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  Nursultan.class12013
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09778;
import Nursultan.class09785;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09864;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09976;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11348;
import Nursultan.class11860;
import Nursultan.class11938;
import Nursultan.class12002;
import Nursultan.class12013;

public class class11641 {
    private static String[] u;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;

    private static void M() {
        N_1 = u[3];
        N_2 = u[4];
    }

    private class11641() {
    }

    static {
        class11641.N();
        class11641.y();
        class11641.M();
        N_0 = new class11641()::N;
        N_3 = class09991.N().N(class09962.N((float)80.0f, (float)130.0f)).y(class09962.y((float)30.0f)).u(10.0f).i(10.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.y_1).intValue()).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX).Z(8.0f).N(class09976.SELF).y(true);
        N_4 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099912 = class09991.N();
        N_5 = class09991.N((class09991[])new class09991[]{(class09991)N_4, class099912.i(((Integer)class09181.N_0).intValue())});
    }

    private static void y() {
        u = new String[5];
        class11641.u[0] = "listener";
        class11641.u[1] = "\u2014";
        class11641.u[2] = "...";
        class11641.u[3] = "\u2014";
        class11641.u[4] = "...";
    }

    private static void N(class09785<class11348> class097852, class09785<Boolean> class097853) {
        class11348 class113482 = (class11348)class097852.L();
        if (class113482 == null) {
            return;
        }
        class11938.L().N((Object)class113482);
        class097852.N(null);
        class097853.N((Object)false);
    }

    private static void N(class11860 class118602, class09785<class11348> class097852) {
        class11641.N(class097852, (class09785<Boolean>)class118602.u());
        class11348 class113482 = new class11348((class120022, n) -> {
            class118602.N().accept(class120022, n);
            class11641.N(class097852, (class09785<Boolean>)class118602.u());
        });
        class097852.N((Object)class113482);
        class11938.L().y((Object)class113482);
        class118602.u().N((Object)true);
    }

    private static void N() {
    }

    private static String N(class12002 class120022, int n) {
        if (class120022 == null || class120022.y()) {
            return u[1];
        }
        return class12013.N((class12002)class120022, (int)n);
    }

    private class09798 N(class11860 class118602, class09809 class098092) {
        class09785 class097852 = class098092.N(u[0], (Object)null);
        return class09778.N((class09991)((class09991)N_3), (T class097842) -> {
            boolean bl = (Boolean)class118602.u().L();
            class097842.N(bl ? u[2] : class11641.N(class118602.y(), class118602.L()), bl ? (class09991)N_5 : (class09991)N_4);
            class097842.N(class09867.POINTER_DOWN, class098602 -> {
                if (((class09864)class098602).L() == 0 && class097852.L() == null) {
                    class11641.N(class118602, (class09785<class11348>)class097852);
                }
            });
            class097842.N(class09867.FOCUS, class098602 -> class11641.N(class118602, (class09785<class11348>)class097852));
        });
    }
}

