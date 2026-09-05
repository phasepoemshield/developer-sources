/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09662
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09964
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11067
 *  Nursultan.class11300
 *  Nursultan.class11629
 *  Nursultan.class11644
 *  Nursultan.class11846
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09662;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09964;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11067;
import Nursultan.class11300;
import Nursultan.class11629;
import Nursultan.class11644;
import Nursultan.class11846;

public class class09217 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;

    private class09217() {
    }

    static {
        class09217.N();
        class09217.y();
        y_0 = new class09217()::N;
        N_0 = class09991.N().M().N(class09962.N()).y(class09962.N()).N(12.0f).B(8.0f).j(4.0f).v(10.0f).L(class09662.N((int)-16777216, (float)0.25f)).N(class09975.COLUMN).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.L_2).intValue()).z(1.0f).Z(12.0f).N(class09983.BORDER_BOX).l(1.0f).W(16.0f).N(class099912 -> class099912.l(0.0f).W(0.0f)).y(class099912 -> class099912.l(0.0f).W(0.0f)).N(new class09994[]{class09994.s((class09743)((class09743)class11644.N_0)), class09994.Z((class09743)((class09743)class11644.N_0))});
        class09991[] class09991Array = new class09991[2];
        class09991Array[0] = class09221.N(20, class09079.REGULAR);
        class09991 class099913 = class09991.N();
        class09991Array[1] = class099913.i(((Integer)class09181.N_0).intValue());
        N_1 = class09991.N((class09991[])class09991Array);
        class09991[] class09991Array2 = new class09991[2];
        class09991Array2[0] = class09221.N(14, class09079.REGULAR);
        class09991 class099914 = class09991.N();
        class09991Array2[1] = class099914.i(class11300.L((int)0x646464, (float)64.0f)).N(class09964.NOWRAP);
        N_2 = class09991.N((class09991[])class09991Array2);
    }

    private static int y(String[] stringArray, int n) {
        int n2 = 1;
        int n3 = 0;
        for (String string : stringArray) {
            if (n3 == 0) {
                n3 = string.length();
                continue;
            }
            if (n3 + 1 + string.length() > n) {
                ++n2;
                n3 = string.length();
                continue;
            }
            n3 += 1 + string.length();
        }
        return n2;
    }

    private static void y() {
        y_0 = null;
        y_1 = 12;
        y_2 = 12;
        y_3 = 8;
        y_4 = 16;
        y_5 = 36;
        N_0 = null;
        N_1 = null;
        N_2 = null;
    }

    private static String y(String string) {
        String string2 = string.trim().replaceAll("\\s+", " ");
        if (string2.isEmpty()) {
            return string2;
        }
        String[] stringArray = string2.split(" ");
        if (stringArray.length == 1) {
            return string2;
        }
        int n = class09217.y(stringArray, 36);
        int n2 = 1;
        int n3 = 36;
        int n4 = 36;
        while (n2 <= n3) {
            int n5 = (n2 + n3) / 2;
            if (class09217.y(stringArray, n5) <= n) {
                n4 = n5;
                n3 = n5 - 1;
                continue;
            }
            n2 = n5 + 1;
        }
        return class09217.N(stringArray, n4);
    }

    private static String N(String[] stringArray, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        for (String string : stringArray) {
            if (n2 == 0) {
                stringBuilder.append(string);
                n2 = string.length();
                continue;
            }
            if (n2 + 1 + string.length() > n) {
                stringBuilder.append('\n').append(string);
                n2 = string.length();
                continue;
            }
            stringBuilder.append(' ').append(string);
            n2 += 1 + string.length();
        }
        return stringBuilder.toString();
    }

    private class09798 N(class11846 class118462, class09809 class098092) {
        class11067 class110672 = class118462.L();
        return class09778.N((class09991)class09991.N((class09991[])new class09991[]{(class09991)N_0, class11629.N((String)class118462.N(), (float)0.0f, (int)500)}), class097842 -> {
            class097842.N(class110672.L(), (class09991)N_1);
            class097842.N(class09217.y(class118462.y()), (class09991)N_2);
        });
    }

    private static void N() {
    }
}

