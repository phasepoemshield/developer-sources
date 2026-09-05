/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09692
 *  Nursultan.class09728
 *  Nursultan.class09736
 *  Nursultan.class09743
 *  Nursultan.class09759
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09842
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09970
 *  Nursultan.class09975
 *  Nursultan.class09976
 *  Nursultan.class09991
 *  Nursultan.class09993
 *  Nursultan.class09994
 *  Nursultan.class11072
 *  Nursultan.class11854
 *  Nursultan.class11863
 */
package Nursultan;

import Nursultan.class09179;
import Nursultan.class09180;
import Nursultan.class09191;
import Nursultan.class09212;
import Nursultan.class09214;
import Nursultan.class09216;
import Nursultan.class09223;
import Nursultan.class09226;
import Nursultan.class09229;
import Nursultan.class09692;
import Nursultan.class09728;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09759;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09842;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09970;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09991;
import Nursultan.class09993;
import Nursultan.class09994;
import Nursultan.class11072;
import Nursultan.class11854;
import Nursultan.class11863;

public class class09203 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;

    private class09203() {
    }

    static {
        class09203.y();
        class09203.N();
        L_0 = new class09203()::y;
        L_1 = new class11863(220.0f, 20.0f, 1.0f, 0.2f, 4.0f, 0.008333334f);
        L_3 = class09759.EASE_OUT;
        L_4 = new class09728(0.25f, (class09759)L_3);
        N_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N((float)100.0f)).N(class09975.COLUMN);
        N_3 = class09991.N().N(class09976.SELF).N(class09993.AUTO).N(class09970.OVERLAY).N(class09180.N(20.0f, 8.0f).L(4.0f)).N(class09975.COLUMN).N(class09962.N((float)100.0f)).y(class09962.y((float)659.0f));
        N_4 = class09991.N().y(class09962.y((float)20.0f));
        N_5 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).N(class09975.COLUMN);
        N_6 = class09991.N((class09991[])new class09991[]{(class09991)N_5, class09991.N().N(class09969.FLOATING).M()});
        N_7 = class09203::N;
    }

    private class09798 y(class09785<class11854> class097852, class09809 class098092) {
        return class09778.N((class09991)((class09991)N_2), (T class097842) -> class097842.N(new Object[]{class098092.N("header", (class09788)class09216.i_0, (Object)class097852), class09778.N((class09991)((class09991)class09180.N_2)), class098092.N("container", (class09788)N_7, (Object)class097852)}));
    }

    private static void y() {
    }

    private static String N(String string, int n, class11854 class118542) {
        return string + "_" + n + "_" + class118542.name();
    }

    private static class09798 N(class09785<class11854> class097852, class09809 class098092) {
        class09798 class097982;
        float f;
        class11854 class118542;
        class09229 class092292;
        String string = (String)class098092.y("nursultan:searchQuery", (Object)"").L();
        if (string != null && !string.isBlank()) {
            return class09203.N(class097852, class098092, string);
        }
        class09785 class097853 = class098092.N("contentTransition", () -> class09229.y((class11854)class097852.L()));
        class11854 class118543 = (class11854)class097852.L();
        if (class118543 != (class092292 = (class09229)((Object)class097853.L())).y()) {
            class092292 = class092292.N(class118543);
            class097853.N((Object)class092292);
        }
        class11854 class118544 = class092292.y();
        int n = class092292.N();
        boolean bl = class092292.B();
        if (bl) {
            class118542 = class092292.L();
            int n2 = Math.abs(class118544.ordinal() - class118542.ordinal());
            float f2 = Math.min(1.0f, (float)Math.max(0, n2 - 1) * 0.5f);
            float f3 = 659.0f * (1.0f + f2);
            int n3 = class092292.u();
            f = (float)n3 * f3;
            class097982 = class09203.N(class09203.N("prev", n, class118542), class118542, (float)(-n3) * f3, 0.0f, 0.0f, 1.0f, class098092, "prev_", null, n, false);
        } else {
            f = 0.0f;
            class097982 = null;
        }
        class118542 = class09203.N(class09203.N("new", n, class118544), class118544, 0.0f, 1.0f, f, bl ? 0.0f : 1.0f, class098092, "", (class09785<class09229>)(bl ? class097853 : null), n, true);
        return class09778.N((class09991)((class09991)N_3), arg_0 -> class09203.N(class118544, class097982, (class09798)class118542, arg_0));
    }

    private static class09798 N(class09809 class098092, class11854 class118542, String string) {
        String string2 = string + "tab:" + class118542.name();
        class11072 class110722 = class118542.N();
        if (class110722 != null) {
            return class098092.N(string2, (class09788)class09223.N_0, (Object)class110722);
        }
        if (class118542 == class11854.CONFIGS) {
            return class098092.N(string2, (class09788)class09179.N_0, null);
        }
        if (class118542 == class11854.AUTO_BUY) {
            return class098092.N(string2, (class09788)class09212.N_0, null);
        }
        return class098092.N(string2, (class09788)class09191.N_0, null);
    }

    private static class09798 N(String string, class11854 class118542, float f, float f2, float f3, float f4, class09809 class098092, String string2, class09785<class09229> class097852, int n, boolean bl) {
        return class09778.N((class09991)class09991.N((class09991[])new class09991[]{bl ? (class09991)N_5 : (class09991)N_6, class09991.N().m(f).l(f2).N(class09692.N((class09994[])new class09994[]{class09994.Z((class09743)((class11863)L_1)), class09994.s((class09743)((class09728)L_4))})).N(class099912 -> class099912.m(f3).l(f4))}), (T class097842) -> {
            class097842.N(string);
            if (class097852 != null) {
                class097842.N(class09867.TRANSITION_END, class098602 -> {
                    class09842 class098422 = (class09842)class098602;
                    if (class098422.N() == class09736.VISUAL_TRANSLATE_Y && class098422.y()) {
                        class097852.N(class092292 -> class092292.N() == n && class092292.y() == class118542 ? class092292.R() : class092292);
                    }
                });
            }
            class097842.y((class09991)N_4);
            class097842.y(class09203.N(class098092, class118542, string2));
            if (class118542 != class11854.ACCOUNTS) {
                class097842.y((class09991)N_4);
            }
        });
    }

    private static void N() {
        L_0 = null;
        L_1 = null;
        L_2 = Float.valueOf(0.25f);
        L_3 = null;
        L_4 = null;
        L_5 = 659;
        y_0 = 4;
        y_1 = 8;
        y_2 = 4;
        y_3 = Float.valueOf(659.0f);
        N_0 = Float.valueOf(0.5f);
        N_1 = Float.valueOf(1.0f);
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
        N_7 = null;
    }

    private static /* synthetic */ void N(class11854 class118542, class09798 class097982, class09798 class097983, class09784 class097842) {
        class097842.N("content:" + class118542.name());
        if (class097982 != null) {
            class097842.y(class097982);
        }
        class097842.y(class097983);
    }

    private static class09798 N(class09785<class11854> class097852, class09809 class098092, String string) {
        return class09778.N((class09991)((class09991)N_3), (T class097842) -> ((class09784)class097842.N("content:search")).N(new Object[]{class09778.N((class09991)((class09991)N_4)), class098092.N("searchResults", (class09788)class09226.N_0, (Object)new class09214(string, (class11854)class097852.L())), class09778.N((class09991)((class09991)N_4))}));
    }
}

