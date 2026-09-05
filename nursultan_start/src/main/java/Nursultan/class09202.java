/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09864
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09970
 *  Nursultan.class09975
 *  Nursultan.class09976
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09993
 *  Nursultan.class09994
 *  Nursultan.class11536
 *  Nursultan.class11629
 *  Nursultan.class11644
 *  Nursultan.class11844
 *  Nursultan.class11862
 */
package Nursultan;

import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09219;
import Nursultan.class09662;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09864;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09970;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09993;
import Nursultan.class09994;
import Nursultan.class11536;
import Nursultan.class11629;
import Nursultan.class11644;
import Nursultan.class11844;
import Nursultan.class11862;
import java.util.Iterator;
import java.util.List;

public class class09202 {
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
    public static Object y_4;
    public static Object y_5;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;

    private static void L() {
    }

    private static float L(List<class11536<?>> list, int n) {
        if (!list.get(n).E()) {
            return -1.0f;
        }
        if (class09202.N(list, n)) {
            return 1.0f;
        }
        if (class09202.y(list, n)) {
            return 0.0f;
        }
        return -1.0f;
    }

    private class09202() {
    }

    static {
        class09202.N();
        class09202.L();
        class09202.y();
        class09202.R();
        y_0 = new class09202()::y;
        N_1 = class09991.N().N(class09962.y((float)0.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.N((float)40.0f, (float)500.0f)).N(class09976.PARENT).N(class09993.AUTO).N(class09970.OVERLAY).N(class09180.N(8.0f, 2.0f).L(4.0f)).N(class09975.COLUMN).N(class09983.BORDER_BOX);
        N_2 = class09991.N().N(class09962.y((float)0.0f, (float)Float.POSITIVE_INFINITY)).N(class09975.COLUMN).u(12.0f).i(12.0f).N(class09983.BORDER_BOX);
        N_3 = class09991.N().N(class09962.N()).y(class09962.N()).y(((Integer)class09181.y_0).intValue()).j(4.0f).v(20.0f).L(class09662.N((int)-16777216, (float)0.25f)).N(4.0f).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(12.0f).N(class09983.BORDER_BOX).l(1.0f).N(new class09994[]{class09994.E((class09743)((class09743)class11644.N_0)), class09994.s((class09743)((class09743)class11644.N_0))}).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        N_4 = class09991.N().N(class09976.SELF).N(class09975.COLUMN).N(class09983.BORDER_BOX).N(class09692.N((class09994[])new class09994[]{class09994.W((class09743)((class09743)class11644.N_0)), class09994.s((class09743)((class09743)class11644.N_0))}));
        class09991 class099913 = class09991.N();
        N_5 = class09991.N((class09991[])new class09991[]{(class09991)class09180.N_2, class099913.N(class09994.s((class09743)((class09743)class11644.N_0)))});
        N_6 = class09991.N().N(class09962.y((float)0.0f, (float)Float.POSITIVE_INFINITY)).N(class09976.SELF);
        N_7 = (class118622, class098092) -> {
            List var2 = class118622.y().w().values().stream().toList();
            class09785 class097852 = class098092.N("updater", null);
            class09202.N(var2);
            return class09778.N((class09991)class09991.N((class09991[])new class09991[]{(class09991)N_3, class11629.N((String)("settingsAnchor" + System.identityHashCode(class118622.N())), (float)0.0f, (int)1001)}), (T class097842) -> {
                class097842.N("settingsPanel");
                class097842.N_3((class09991)N_1, class097843 -> class097843.N_3((class09991)N_2, class097842 -> {
                    for (int i = 0; i < var2.size(); ++i) {
                        class11536 class115362 = (class11536)var2.get(i);
                        class09202.N(class097842, class115362, class09202.L(var2, i), (class09785<Void>)class097852, class098092);
                    }
                }));
            });
        };
    }

    private static class09991 y(boolean bl) {
        if (bl) {
            return (class09991)N_6;
        }
        return class09991.N((class09991[])new class09991[]{(class09991)N_6, class09991.N().N(class09969.FLOATING).N(0.0f, 0.0f)});
    }

    private static boolean y(List<class11536<?>> list, int n) {
        for (int i = n + 1; i < list.size(); ++i) {
            if (list.get(i).E()) continue;
            return true;
        }
        return false;
    }

    private class09798 y(class11862 class118622, class09809 class098092) {
        boolean bl = (Boolean)class118622.N().L();
        String string = "settingsAnchor" + System.identityHashCode(class118622.N());
        return class11629.N((class09991)class09991.N, (T class097842) -> {
            class097842.N(string);
            if (!bl) {
                return;
            }
            class097842.y(class11629.N((String)"settingsCatcher", (int)1000, () -> class118622.N().N((Object)false)));
            class097842.y(class098092.N("settingList", (class09788)N_7, (Object)class118622));
        });
    }

    private static void y() {
    }

    private static class09991 N(float f) {
        return class09991.N((class09991[])new class09991[]{(class09991)N_5, class09991.N().l(f)});
    }

    private static void N(List<class11536<?>> list) {
        Iterator<class11536<?>> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().m();
        }
    }

    private static boolean N(List<class11536<?>> list, int n) {
        for (int i = n + 1; i < list.size(); ++i) {
            if (!list.get(i).E()) continue;
            return true;
        }
        return false;
    }

    private static void N() {
    }

    private static class09991 N(boolean bl) {
        return class09991.N((class09991[])new class09991[]{(class09991)N_4, class09991.N().N(class09962.y((float)0.0f, (float)368.0f)).y(bl ? class09962.N() : class09962.N((float)0.0f, (float)0.0f)).l(bl ? 1.0f : 0.0f)});
    }

    private static void N(class09784 class097844, class11536<?> class115362, float f, class09785<Void> class097852, class09809 class098092) {
        String string = class115362.P().N();
        class097844.N_3(class09202.N(class115362.E()), class097843 -> {
            class097843.N("setting-row:" + string);
            class097843.N_3(class09202.y(class115362.E()), class097842 -> {
                class097842.N(class09867.POINTER_DOWN, class098602 -> {
                    if (((class09864)class098602).L() == 2) {
                        class115362.s();
                        class097852.y();
                        class098602.j();
                        class098602.T();
                    }
                });
                class097842.y(class098092.N(string, (class09788)class09219.N_0, (Object)new class11844(class115362, class097852)));
            });
        });
        if (f >= 0.0f) {
            class097844.N_3(class09202.N(f), class097842 -> class097842.N("setting-divider:" + string));
        }
    }

    private static void R() {
        y_0 = null;
        y_1 = "settingsAnchor";
        y_2 = 4;
        y_3 = 12;
        y_4 = 4;
        y_5 = 2;
        L_0 = 4;
        L_1 = 40;
        L_2 = 500;
        L_3 = 400;
        N_0 = 368;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
        N_7 = null;
    }
}

