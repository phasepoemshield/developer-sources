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
 *  Nursultan.class11535
 *  Nursultan.class11840
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
import Nursultan.class11535;
import Nursultan.class11614;
import Nursultan.class11617;
import Nursultan.class11840;
import Nursultan.class12018;
import Nursultan.class12020;
import java.util.stream.Collectors;

public class class11645 {
    private static String[] R;
    private static String[] j;
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
    public static Object y_5;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;

    private class11645() {
    }

    static {
        class11645.N();
        class11645.y();
        N_0 = new class11645()::N;
        y_1 = class09991.N().u(150.0f, 30.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.y_1).intValue()).y().y(class09973.CENTER).u(8.0f).i(8.0f).N(class09983.BORDER_BOX).Z(8.0f);
        y_2 = class09991.N().N(class09969.FLOATING).U(-8.0f).u(150.0f, 30.0f);
        y_3 = class09991.N().N(class09969.FLOATING).U(122.0f).E(9.0f).u(12.0f, 12.0f).i(-7171438);
        y_4 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N((int)14, (class09079)class09079.REGULAR)});
        y_5 = class09991.N((class09991[])new class09991[]{class09991.N().N(false), class09221.N((int)14, (class09079)class09079.REGULAR)});
    }

    private static boolean Z(String string) {
        return class09222.N((String)string, (float)14.0f, (class09079)class09079.REGULAR) > 104.0f;
    }

    private static void y() {
        N_1 = j[1];
        N_2 = 150;
        N_3 = 30;
        N_4 = 8;
        N_5 = 1;
        N_6 = 8;
        L_0 = 30;
        L_1 = 112;
        L_2 = 134;
        L_3 = 12;
        L_4 = 14;
        y_0 = j[2];
    }

    private class09798 N(class11840 class118402, class09809 class098092) {
        String string = class11645.N(class118402);
        boolean bl = class11645.Z(string);
        return class09778.N((class09991)((class09991)y_1), (T class097842) -> {
            class097842.y(class098012 -> {
                class098012.N(j[0]);
                class098012.L(string);
                class098012.N(bl ? (class09991)y_5 : (class09991)y_4);
            });
            class097842.i(class098132 -> {
                class098132.N(R[5]);
                class098132.N((class09991)y_2);
                if (bl) {
                    class098132.y(class099122 -> class11617.N(string, -7171438, 14.0f, class09079.REGULAR, 150.0f, 8.0f, 112.0f, 134.0f, class099122.N(), class099122.y(), class099122.L(), class099122.u()));
                }
            });
            class097842.L(class097772 -> {
                class097772.N(R[3]);
                class097772.L(R[4]);
                class097772.N((class09991)y_3);
            });
            class097842.N_1(class098602 -> class118402.L().N((Object)true));
            class097842.y(class098092.N(R[2], (class09788)class11614.y_0, (Object)class118402));
        });
    }

    private static void N() {
        R = new String[6];
        class11645.R[0] = ", ";
        class11645.R[1] = "\u2014";
        class11645.R[2] = "comboList";
        class11645.R[3] = "comboCheckIcon";
        class11645.R[4] = "icon:menu/angles";
        class11645.R[5] = "comboSelectedFadeCanvas";
        j = new String[3];
        class11645.j[0] = "comboSelectedText";
        class11645.j[1] = "\u2014";
        class11645.j[2] = "icon:menu/angles";
    }

    private static String N(class11840 class118402) {
        String string = class118402.u().stream().filter(class11535::U).map(class115352 -> class12020.N((class12018)class115352.E())).collect(Collectors.joining(R[0]));
        return string.isEmpty() ? R[1] : string;
    }
}

