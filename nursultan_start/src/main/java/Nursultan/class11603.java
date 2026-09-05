/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09221
 *  Nursultan.class09227
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09965
 *  Nursultan.class09973
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11300
 *  Nursultan.class11853
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09965;
import Nursultan.class09973;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11300;
import Nursultan.class11634;
import Nursultan.class11644;
import Nursultan.class11853;

public class class11603 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
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

    private class11603() {
    }

    static {
        class11603.N();
        L_0 = new class11603()::N;
        N_0 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.y((class09743)((class09743)class11644.N_0)), class09994.N((class09743)((class09743)class11644.N_0))}));
        N_1 = class09991.N().N(class09994.L((class09743)((class09743)class11644.N_0)));
        class09991 class099912 = class09991.N().N(class09962.N());
        N_2 = class09991.N((class09991[])new class09991[]{(class09991)N_0, class099912.y(class09962.N()).u(12.0f).i(12.0f).R(4.0f).M(4.0f).z(1.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX)});
        y_0 = class11603.N(class09965.N((float)8.0f));
        y_1 = class11603.N(new class09965(8.0f, 0.0f, 0.0f, 8.0f));
        y_2 = class11603.N(new class09965(0.0f, 8.0f, 8.0f, 0.0f));
        y_3 = class11603.y(class09965.N((float)8.0f));
        y_4 = class11603.y(new class09965(8.0f, 0.0f, 0.0f, 8.0f));
        y_5 = class11603.y(new class09965(0.0f, 8.0f, 8.0f, 0.0f));
        y_6 = class09991.N((class09991[])new class09991[]{(class09991)N_1, class09991.N().i(-7171438), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099913 = class09991.N();
        y_7 = class09991.N((class09991[])new class09991[]{(class09991)N_1, class099913.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.REGULAR)});
    }

    private static class09991 y(class09965 class099652) {
        return class09991.N((class09991[])new class09991[]{(class09991)N_2, class09991.N().y(class11300.L((int)0x121212, (float)64.0f)).u(class11300.L((int)0x191919, (float)96.0f)).N(class099652)});
    }

    private static class09227 N(class09965 class099652) {
        return class09227.N((T class092112) -> class09991.N((class09991[])new class09991[]{(class09991)N_2, class09991.N().y(class092112.L()).u(class092112.R()).N(class099652)}));
    }

    private static class09991 N(class11853 class118532, class09211 class092112) {
        return switch (((int[])class11634.N_0)[class118532.y().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> {
                if (class118532.u()) {
                    yield ((class09227)y_0).N(class092112);
                }
                yield (class09991)y_3;
            }
            case 2 -> {
                if (class118532.u()) {
                    yield ((class09227)y_1).N(class092112);
                }
                yield (class09991)y_4;
            }
            case 3 -> class118532.u() ? ((class09227)y_2).N(class092112) : (class09991)y_5;
        };
    }

    private class09798 N(class11853 class118532, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        return class09778.N((class09991)class11603.N(class118532, class092112), (T class097842) -> {
            class097842.N_1(class098602 -> class118532.N().run());
            class097842.N(class118532.L(), class118532.u() ? (class09991)y_7 : (class09991)y_6);
        });
    }

    private static void N() {
        L_1 = 12;
        L_2 = 4;
        L_3 = 8;
    }
}

