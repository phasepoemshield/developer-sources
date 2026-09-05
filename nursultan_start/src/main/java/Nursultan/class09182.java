/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09054
 *  Nursultan.class09079
 *  Nursultan.class09662
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09860
 *  Nursultan.class09865
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09976
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09992
 *  Nursultan.class09994
 *  Nursultan.class11054
 *  Nursultan.class11491
 *  Nursultan.class11519
 *  Nursultan.class11535
 *  Nursultan.class11614
 *  Nursultan.class11629
 *  Nursultan.class11644
 *  Nursultan.class11840
 *  Nursultan.class11938
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09054;
import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09200;
import Nursultan.class09221;
import Nursultan.class09250;
import Nursultan.class09662;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09860;
import Nursultan.class09865;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09992;
import Nursultan.class09994;
import Nursultan.class11054;
import Nursultan.class11491;
import Nursultan.class11519;
import Nursultan.class11535;
import Nursultan.class11614;
import Nursultan.class11629;
import Nursultan.class11644;
import Nursultan.class11840;
import Nursultan.class11938;
import Nursultan.class12020;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.UUID;

public class class09182 {
    public static Object N_0;
    public static Object N_1;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;
    public static Object u_4;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object i_3;
    public static Object i_4;
    public static Object i_5;
    public static Object i_6;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object M_0;
    public static Object M_1;
    public static Object M_2;

    private static void L() {
    }

    private static List<class11535> L(int n) {
        ArrayList<class11535> arrayList = new ArrayList<class11535>(((List)L_0).size());
        for (int i = 0; i < ((List)L_0).size(); ++i) {
            arrayList.add(new class11535(((class09200)((Object)((List)L_0).get(i))).N(), (n & 1 << i) != 0));
        }
        return arrayList;
    }

    private class09182() {
    }

    static {
        class09182.L();
        class09182.y();
        class09182.N();
        R_0 = new class09182()::N;
        class09200 class092002 = new class09200("account-generated", class09054.OFFLINE_GENERATED);
        class09200 class092003 = new class09200("account-offline", class09054.OFFLINE);
        L_0 = List.of(class092002, class092003, new class09200("account-microsoft", class09054.MICROSOFT));
        L_1 = class09991.N().N(class09969.FLOATING).N(0.0f, 0.0f).R().N(1001).N(class09973.CENTER).y(class09973.CENTER).N(class09976.SELF).Z(16.0f).j(5.0f).y(class09662.N((int)-16777216, (float)0.35f)).l(1.0f).N(class09994.s((class09743)((class09743)class11644.N_0))).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        L_2 = class09991.N().N(class09962.y((float)360.0f)).y(class09962.N()).N(16.0f).B(12.0f).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(12.0f).v(20.0f).L(class09662.N((int)-16777216, (float)0.25f)).N(class09973.START).y(class09973.START).N(class09983.BORDER_BOX).N(class09975.COLUMN);
        class09991 class099913 = class09991.N();
        L_3 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N(20, class09079.SEMI_BOLD)});
        N_0 = class09992.N((String)"account.delete.modal.close");
        N_1 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).y(class09973.CENTER).y().N(class09975.ROW);
        i_0 = class09991.N().u(16.0f, 16.0f).N(class09973.CENTER).y(class09973.CENTER).N((class09992)N_0, class099912 -> class099912.i(((Integer)class09181.N_0).intValue()));
        i_1 = class09991.N().u(16.0f, 16.0f).N((class09992)N_0).i(-7171438).N(class09692.N((class09994[])new class09994[]{class09994.L((class09743)((class09743)class11644.N_0))}));
        i_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).B(6.0f).N(class09975.COLUMN);
        i_3 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N(13, class09079.REGULAR)});
        i_4 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)44.0f)).u(12.0f).i(12.0f).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f).N(class09983.BORDER_BOX).y(class09973.CENTER).y().N(class09975.ROW);
        class09991 class099914 = class09991.N();
        i_5 = class09991.N((class09991[])new class09991[]{(class09991)i_4, class099914.u(((Integer)class09181.y_2).intValue())});
        class09991 class099915 = class09991.N();
        i_6 = class09991.N((class09991[])new class09991[]{class099915.i(((Integer)class09181.N_0).intValue()), class09221.N(16, class09079.REGULAR)});
        u_0 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N(16, class09079.REGULAR)});
        u_1 = class09991.N().u(12.0f, 12.0f).i(-7171438);
        u_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)44.0f)).B(12.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f).N(class09975.ROW);
        u_3 = class09991.N((class09991[])new class09991[]{(class09991)u_2, class09991.N().L(true).l(0.5f)});
        u_4 = class09991.N((class09991[])new class09991[]{class09991.N().i(-29813), class09221.N(16, class09079.REGULAR)});
    }

    private static String z(int n) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int i = 0; i < ((List)L_0).size(); ++i) {
            if ((n & 1 << i) == 0) continue;
            stringJoiner.add(class12020.N((String)("entry." + ((class09200)((Object)((List)L_0).get(i))).N())));
        }
        return stringJoiner.toString();
    }

    private static Set<class09054> u(int n) {
        EnumSet<class09054> var1 = EnumSet.noneOf(class09054.class);
        for (int i = 0; i < ((List)L_0).size(); ++i) {
            if ((n & 1 << i) == 0) continue;
            var1.add(((class09200)((Object)((List)L_0).get(i))).y());
        }
        return var1;
    }

    private static void y() {
    }

    private static void N(Set<class09054> set) {
        class11491 class114912 = (class11491)class11938.M().N(class11491.class);
        boolean bl = false;
        for (class09250 class092502 : class11938.s().u()) {
            if (class092502.y() || !set.contains(class092502.L())) continue;
            class11054.N((UUID)class092502.R());
            if (class092502.R().equals(class114912.y())) {
                class114912.N(null);
                bl = true;
            }
            class11938.s().N(class092502.R());
        }
        if (bl) {
            class11519.y(class11491.class);
        }
    }

    private class09798 N(Void void_, class09809 class098092) {
        class09785 class097852 = class098092.y("nursultan:deleteAccountsModalOpened", (Object)false);
        if (!((Boolean)class097852.L()).booleanValue()) {
            return class09778.N((T class097842) -> ((class09784)class097842.N("deleteAccountsModalHidden")).N(class11629.N()));
        }
        class09785 class097853 = class098092.N("deleteAccountsTargets", (Object)0);
        class09785 class097854 = class098092.N("deleteAccountsListOpened", (Object)false);
        Runnable runnable = () -> {
            class097853.N((Object)0);
            class097854.N((Object)false);
            class097852.N((Object)false);
        };
        return class09778.N((class09991)((class09991)L_1), (T class097842) -> {
            class097842.N("deleteAccountsModalBlur");
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            class097842.N(class09867.CLICK, class09860::T);
            class097842.N(class09867.KEY_DOWN, class098602 -> {
                class09865 class098652;
                if (class098602 instanceof class09865 && (class098652 = (class09865)class098602).y() && class098652.N() == 256) {
                    runnable.run();
                    class098602.T();
                }
            });
            class097842.N_3((class09991)L_2, class097843 -> {
                class097843.N("deleteAccountsModalPanel");
                class097843.N(class09867.POINTER_DOWN, class09860::T);
                class097843.N(class09867.CLICK, class09860::T);
                class097843.N_3((class09991)N_1, class097842 -> {
                    class097842.N(class12020.N((String)"account.delete.title"), (class09991)L_3);
                    class097842.y(class09182.N(runnable));
                });
                class097843.N_3((class09991)i_2, class097842 -> {
                    class097842.N("deleteAccountsTargetGroup");
                    class097842.N(class12020.N((String)"account.delete.select"), (class09991)i_3);
                    class097842.y(class09182.N(class098092, (class09785<Integer>)class097853, (class09785<Boolean>)class097854));
                });
                boolean bl = (Integer)class097853.L() == 0;
                class097843.N_3(bl ? (class09991)u_3 : (class09991)u_2, class097842 -> {
                    class097842.N("deleteAccountsConfirmButton");
                    class097842.N(class09867.POINTER_DOWN, class09860::T);
                    if (!bl) {
                        class097842.N_1(class098602 -> {
                            class09182.N(class09182.u((Integer)class097853.L()));
                            runnable.run();
                            class098602.T();
                        });
                    }
                    class097842.N(class12020.N((String)"account.delete.confirm"), (class09991)u_4);
                });
            });
        });
    }

    private static void N() {
        R_0 = null;
        R_1 = "nursultan:deleteAccountsModalOpened";
        R_2 = 256;
        R_3 = 360;
        y_0 = 44;
        y_1 = -29813;
        y_2 = 12;
        y_3 = "icon:menu/angles";
        y_4 = 16;
        M_0 = 12;
        M_1 = Float.valueOf(328.0f);
        M_2 = 0;
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = 16;
        N_0 = null;
        N_1 = null;
        i_0 = null;
        i_1 = null;
        i_2 = null;
        i_3 = null;
        i_4 = null;
        i_5 = null;
        i_6 = null;
        u_0 = null;
        u_1 = null;
        u_2 = null;
        u_3 = null;
        u_4 = null;
    }

    private static void N(class09785<Integer> class097852, class11535 class115352) {
        for (int i = 0; i < ((List)L_0).size(); ++i) {
            if (!class115352.E().N().equals("entry." + ((class09200)((Object)((List)L_0).get(i))).N())) continue;
            class097852.N((Object)((Integer)class097852.L() ^ 1 << i));
            return;
        }
    }

    private static class09798 N(class09809 class098092, class09785<Integer> class097852, class09785<Boolean> class097853) {
        return class09778.N((class09991)((Boolean)class097853.L() != false ? (class09991)i_5 : (class09991)i_4), (T class097842) -> {
            class097842.N("deleteAccountsTargetField");
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            boolean bl = (Integer)class097852.L() == 0;
            class097842.N(bl ? "\u2014" : class09182.z((Integer)class097852.L()), bl ? (class09991)u_0 : (class09991)i_6);
            class097842.L((T class097772) -> {
                class097772.N("deleteAccountsTargetChevron");
                class097772.L("icon:menu/angles");
                class097772.N((class09991)u_1);
            });
            class097842.N_1(class098602 -> {
                class097853.N((Object)true);
                class098602.T();
            });
            class097842.y(class098092.N("deleteAccountsTargetList", (class09788)class11614.y_0, (Object)new class11840(class09182.L((Integer)class097852.L()), class097853, class115352 -> class09182.N(class097852, class115352), Float.valueOf(328.0f), -12.0f)));
        });
    }

    private static class09798 N(Runnable runnable) {
        return class09778.N((class09991)((class09991)i_0), (T class097842) -> {
            class097842.N("deleteAccountsModalClose");
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            class097842.N_1(class098602 -> {
                runnable.run();
                class098602.T();
            });
            class097842.L((T class097772) -> class097772.L("icon:menu/xmark").N((class09991)i_1));
        });
    }
}

