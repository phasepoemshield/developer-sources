/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09221
 *  Nursultan.class09662
 *  Nursultan.class09743
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11535
 *  Nursultan.class11851
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09662;
import Nursultan.class09743;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11535;
import Nursultan.class11629;
import Nursultan.class11644;
import Nursultan.class11851;
import Nursultan.class12018;
import Nursultan.class12020;

public class class11621 {
    private static String[] L;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;

    private static void M() {
        N_1 = 30;
        N_2 = 4;
        N_3 = 1;
        N_4 = 4;
        y_6 = L[3];
    }

    private class11621() {
    }

    static {
        class11621.N();
        class11621.y();
        class11621.M();
        N_0 = new class11621()::N;
        y_0 = class09991.N().N(class09962.N()).y(class09962.N((float)30.0f, (float)Float.POSITIVE_INFINITY)).y(-16119286).N(4.0f).N(class09983.BORDER_BOX).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f).B(4.0f).v(10.0f).L(class09662.N((int)-16777216, (float)0.25f)).N(class09975.COLUMN).l(1.0f).y(class099912 -> class099912.l(0.0f)).N(class09994.s((class09743)((class09743)class11644.N_0)));
        y_1 = class09991.N().N(class09962.y((float)142.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.y((float)30.0f)).y(class09973.CENTER).N(4.0f).N(class09983.BORDER_BOX).Z(6.0f).L(class099912 -> class099912.y(-15592942));
        y_2 = class09991.N((class09991[])new class09991[]{(class09991)y_1, class09991.N().y(-15592942)});
        y_3 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099913 = class09991.N();
        y_4 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.REGULAR)});
        y_5 = class11629.N();
    }

    private static void y() {
        L = new String[4];
        class11621.L[0] = "entryListMount";
        class11621.L[1] = "entryListCatcher";
        class11621.L[2] = "entryListPanel";
        class11621.L[3] = "entryListAnchor";
    }

    private class09798 N(class11851 class118512, class09809 class098092) {
        boolean bl = (Boolean)class118512.N().L();
        String string = "entryListAnchor" + System.identityHashCode(class118512.N());
        class09991 class099912 = class09991.N().N(class09969.FLOATING).U(class118512.y()).u(0.0f, 0.0f);
        class09991 class099913 = class118512.L() != null ? class09991.N((class09991[])new class09991[]{(class09991)y_0, class09991.N().N(class09962.y((float)class118512.L().floatValue()))}) : (class09991)y_0;
        return class11629.N((class09991)y_5, (class09784 class097844) -> {
            class097844.N(L[0]);
            class097844.N_3(class099912, class097842 -> class097842.N(string));
            if (!bl) {
                return;
            }
            class097844.y(class11629.N(L[1], 2000, () -> class118512.N().N((Object)false)));
            class097844.N_3(class09991.N((class09991[])new class09991[]{class099913, class11629.N(string, 0.0f, 2001)}), class097843 -> {
                class097843.N(L[2]);
                for (class11535 class115352 : class118512.i()) {
                    class097843.N_3(class115352.U() ? (class09991)y_2 : (class09991)y_1, class097842 -> {
                        class097842.N(class12020.N((class12018)class115352.E()), class115352.U() ? (class09991)y_4 : (class09991)y_3);
                        class097842.N_1(class098602 -> {
                            class118512.u().accept(class115352);
                            class118512.N().N((Object)false);
                        });
                    });
                }
            });
        });
    }

    private static void N() {
    }
}

