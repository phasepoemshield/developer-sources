/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09221
 *  Nursultan.class09222
 *  Nursultan.class09778
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11835
 *  Nursultan.class11851
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09222;
import Nursultan.class09778;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11617;
import Nursultan.class11621;
import Nursultan.class11835;
import Nursultan.class11851;
import Nursultan.class12018;
import Nursultan.class12020;

public class class11615 {
    private static String[] Z;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;
    public static Object y_7;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;

    private static void L() {
        N_1 = 150;
        N_2 = 30;
        N_3 = 8;
        y_0 = 1;
        y_1 = 8;
        y_2 = 30;
        y_3 = 112;
        y_4 = 134;
        y_5 = 12;
        y_6 = 14;
        y_7 = Z[5];
    }

    private class11615() {
    }

    static {
        class11615.N();
        class11615.L();
        N_0 = new class11615()::N;
        L_0 = class09991.N().u(150.0f, 30.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.y_1).intValue()).y().y(class09973.CENTER).u(8.0f).i(8.0f).N(class09983.BORDER_BOX).Z(8.0f);
        L_1 = class09991.N().N(class09969.FLOATING).U(-8.0f).u(150.0f, 30.0f);
        L_2 = class09991.N().N(class09969.FLOATING).U(122.0f).E(9.0f).u(12.0f, 12.0f).i(-7171438);
        L_3 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N((int)14, (class09079)class09079.REGULAR)});
        L_4 = class09991.N((class09991[])new class09991[]{class09991.N().N(false), class09221.N((int)14, (class09079)class09079.REGULAR)});
    }

    private class09798 N(class11835 class118352, class09809 class098092) {
        String string = class12020.N((class12018)class118352.N().E());
        boolean bl = class11615.N(string);
        return class09778.N((class09991)((class09991)L_0), (T class097842) -> {
            class097842.y(class098012 -> {
                class098012.N(Z[4]);
                class098012.L(string);
                class098012.N(bl ? (class09991)L_4 : (class09991)L_3);
            });
            class097842.i(class098132 -> {
                class098132.N(Z[3]);
                class098132.N((class09991)L_1);
                if (bl) {
                    class098132.y(class099122 -> class11617.N(string, -7171438, 14.0f, class09079.REGULAR, 150.0f, 8.0f, 112.0f, 134.0f, class099122.N(), class099122.y(), class099122.L(), class099122.u()));
                }
            });
            class097842.L(class097772 -> {
                class097772.N(Z[1]);
                class097772.L(Z[2]);
                class097772.N((class09991)L_2);
            });
            class097842.N_1(class098602 -> class118352.u().N((Object)true));
            class097842.y(class098092.N(Z[0], (class09788)class11621.N_0, (Object)new class11851(class118352.L(), class118352.u(), class118352.y())));
        });
    }

    private static void N() {
        Z = new String[6];
        class11615.Z[0] = "entryList";
        class11615.Z[1] = "selectableCheckIcon";
        class11615.Z[2] = "icon:menu/angles";
        class11615.Z[3] = "selectableSelectedFadeCanvas";
        class11615.Z[4] = "selectableSelectedText";
        class11615.Z[5] = "icon:menu/angles";
    }

    private static boolean N(String string) {
        return class09222.N((String)string, (float)14.0f, (class09079)class09079.REGULAR) > 104.0f;
    }
}

