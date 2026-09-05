/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09662
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09844
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
 *  Nursultan.class11290
 *  Nursultan.class11308
 *  Nursultan.class11316
 *  Nursultan.class11324
 *  Nursultan.class11535
 *  Nursultan.class11621
 *  Nursultan.class11629
 *  Nursultan.class11644
 *  Nursultan.class11789
 *  Nursultan.class11851
 *  Nursultan.class11938
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09192;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09662;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09844;
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
import Nursultan.class11290;
import Nursultan.class11308;
import Nursultan.class11316;
import Nursultan.class11324;
import Nursultan.class11535;
import Nursultan.class11621;
import Nursultan.class11629;
import Nursultan.class11644;
import Nursultan.class11789;
import Nursultan.class11851;
import Nursultan.class11938;
import Nursultan.class12020;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public class class09194 {
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
    public static Object y_6;
    public static Object y_7;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object L_6;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object i_3;
    public static Object i_4;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object M_0;
    public static Object M_1;
    public static Object M_2;

    private static boolean L(class11789 class117892) {
        return class117892 != null && class117892.y() != 0L;
    }

    private class09194() {
    }

    static {
        class09194.N();
        class09194.y();
        class09194.u();
        u_0 = new class09194()::N;
        M_1 = Pattern.compile("^[0-9]{0,4}$");
        M_2 = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        class09192 class091922 = new class09192("share-1-day", 1);
        class09192 class091923 = new class09192("share-7-days", 7);
        class09192 class091924 = new class09192("share-30-days", 30);
        R_0 = List.of(class091922, class091923, class091924, new class09192("share-forever", 0));
        R_1 = class09991.N().N(class09969.FLOATING).N(0.0f, 0.0f).R().N(1001).N(class09973.CENTER).y(class09973.CENTER).N(class09976.SELF).Z(16.0f).j(5.0f).y(class09662.N((int)-16777216, (float)0.35f)).l(1.0f).N(class09994.s((class09743)((class09743)class11644.N_0))).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        R_2 = class09991.N().N(class09962.y((float)360.0f)).y(class09962.N()).N(16.0f).B(12.0f).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(12.0f).v(20.0f).L(class09662.N((int)-16777216, (float)0.25f)).N(class09973.START).y(class09973.START).N(class09983.BORDER_BOX).N(class09975.COLUMN);
        class09991 class099913 = class09991.N();
        R_3 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N(20, class09079.SEMI_BOLD)});
        y_1 = class09992.N((String)"share.modal.close");
        y_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).y(class09973.CENTER).y().N(class09975.ROW);
        y_3 = class09991.N().u(16.0f, 16.0f).N(class09973.CENTER).y(class09973.CENTER).N((class09992)y_1, class099912 -> class099912.i(((Integer)class09181.N_0).intValue()));
        y_4 = class09991.N().u(16.0f, 16.0f).N((class09992)y_1).i(-7171438).N(class09692.N((class09994[])new class09994[]{class09994.L((class09743)((class09743)class11644.N_0))}));
        y_5 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).B(6.0f).N(class09975.COLUMN);
        y_6 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)44.0f)).u(12.0f).i(12.0f).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f).N(class09983.BORDER_BOX).y(class09973.CENTER).y().N(class09975.ROW);
        class09991 class099914 = class09991.N();
        y_7 = class09991.N((class09991[])new class09991[]{(class09991)y_6, class099914.u(((Integer)class09181.y_2).intValue())});
        class09991 class099915 = class09991.N();
        N_0 = class09991.N((class09991[])new class09991[]{class099915.i(((Integer)class09181.N_0).intValue()), class09221.N(16, class09079.REGULAR)});
        N_1 = class09991.N().u(12.0f, 12.0f).i(-7171438);
        N_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)44.0f)).u(12.0f).i(12.0f).N(class09976.SELF).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f).N(class09983.BORDER_BOX).y(class09973.CENTER).N(class09975.ROW);
        class09991 class099916 = class09991.N().N(class09962.y((float)0.0f, (float)Float.POSITIVE_INFINITY));
        N_3 = class09991.N((class09991[])new class09991[]{class099916.y(class09962.y((float)0.0f, (float)100.0f)).y(class09973.CENTER).N(class09983.BORDER_BOX), class09221.N(16, class09079.REGULAR)});
        N_4 = class09991.N((class09991[])new class09991[]{(class09991)N_3, class09991.N().i(-7171438)});
        class09991 class099917 = class09991.N();
        N_5 = class09991.N((class09991[])new class09991[]{(class09991)N_3, class099917.i(((Integer)class09181.N_0).intValue())});
        N_6 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)44.0f)).B(12.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX).y(((Integer)class09181.y_0).intValue()).u(((Integer)class09181.y_1).intValue()).z(1.0f).Z(8.0f).N(class09975.ROW);
        class09991 class099918 = class09991.N();
        i_0 = class09991.N((class09991[])new class09991[]{class099918.i(((Integer)class09181.N_0).intValue()), class09221.N(16, class09079.REGULAR)});
        i_1 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N(13, class09079.REGULAR)});
        i_2 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR)});
        i_3 = class09991.N((class09991[])new class09991[]{class09991.N().i(-1720197), class09221.N(14, class09079.REGULAR)});
        i_4 = class09991.N((class09991[])new class09991[]{class09991.N().i(-29813), class09221.N(16, class09079.REGULAR)});
    }

    private static List<class11535> Z(int n) {
        ArrayList<class11535> arrayList = new ArrayList<class11535>(((List)R_0).size());
        for (int i = 0; i < ((List)R_0).size(); ++i) {
            arrayList.add(new class11535(((class09192)((Object)((List)R_0).get(i))).N(), i == n));
        }
        return arrayList;
    }

    private static void u() {
        u_0 = null;
        u_1 = "nursultan:shareModalTarget";
        u_2 = 256;
        u_3 = 360;
        L_0 = 44;
        L_1 = -29813;
        L_2 = 12;
        L_3 = "icon:menu/angles";
        L_4 = 16;
        L_5 = 12;
        L_6 = Float.valueOf(328.0f);
        M_0 = 86400000L;
        M_1 = null;
        M_2 = null;
        R_0 = null;
        R_1 = null;
        R_2 = null;
        R_3 = null;
        y_0 = 16;
        y_1 = null;
        y_2 = null;
        y_3 = null;
        y_4 = null;
        y_5 = null;
        y_6 = null;
        y_7 = null;
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
        i_0 = null;
        i_1 = null;
        i_2 = null;
        i_3 = null;
        i_4 = null;
    }

    private static void y() {
    }

    private static class09991 y(class09211 class092112) {
        return class09991.N((class09991[])new class09991[]{class09991.N().i(class092112.M()), class09221.N(16, class09079.REGULAR)});
    }

    private static String y(class11789 class117892) {
        if (class09194.L(class117892)) {
            return class12020.N((String)"share.modal.expires") + " " + LocalDateTime.ofInstant(Instant.ofEpochMilli(class117892.y()), ZoneId.systemDefault()).format((DateTimeFormatter)M_2);
        }
        return class12020.N((String)"share.modal.forever");
    }

    private static void y(class11290 class112902) {
        class11938.J().N(class112902.Z(), 0L, 1);
    }

    private static int E(String string) {
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return 0;
        }
        try {
            int n = Integer.parseInt(string2);
            if (n <= 0) {
                return 0;
            }
            return Math.min(n, 9999);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    private static class09798 N(class09809 class098092, class09785<Integer> class097852, class09785<Boolean> class097853) {
        return class09778.N((class09991)((Boolean)class097853.L() != false ? (class09991)y_7 : (class09991)y_6), (T class097842) -> {
            class097842.N("shareDurationField");
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            class097842.N(class09194.N((Integer)class097852.L()), (class09991)N_0);
            class097842.L((T class097772) -> {
                class097772.N("shareDurationChevron");
                class097772.L("icon:menu/angles");
                class097772.N((class09991)N_1);
            });
            class097842.N_1(class098602 -> {
                class097853.N((Object)true);
                class098602.T();
            });
            class097842.y(class098092.N("shareDurationList", (class09788)class11621.N_0, (Object)new class11851(class09194.Z((Integer)class097852.L()), class097853, class115352 -> class09194.N(class097852, class115352), Float.valueOf(328.0f), -12.0f)));
        });
    }

    private static void N(class09809 class098092, UUID uUID) {
        class098092.N("shareSeenGen:" + String.valueOf(uUID));
        class098092.N("shareDuration:" + String.valueOf(uUID));
        class098092.N("shareDurationOpen:" + String.valueOf(uUID));
        class098092.N("shareActs:" + String.valueOf(uUID));
    }

    private static String N(class11789 class117892) {
        if (class117892.i() == 0) {
            return String.valueOf(class117892.L());
        }
        return class117892.L() + " / " + class117892.i();
    }

    private class09798 N(Void void_, class09809 class098092) {
        class09785 class097852 = class098092.y("nursultan:shareModalTarget", (Object)null);
        UUID uUID = (UUID)class097852.L();
        if (uUID == null) {
            return class09778.N((T class097842) -> ((class09784)class097842.N("shareModalHidden")).N(class11629.N()));
        }
        class11290 class112902 = class11938.G().N(uUID).orElse(null);
        if (class112902 == null || class112902.Z() <= 0L) {
            class097852.N(null);
            return class09778.N((T class097842) -> ((class09784)class097842.N("shareModalHidden")).N(class11629.N()));
        }
        if (!Boolean.TRUE.equals(class098092.L("shareModalConnected", () -> class11938.z().R()))) {
            class097852.N(null);
            return class09778.N((T class097842) -> ((class09784)class097842.N("shareModalHidden")).N(class11629.N()));
        }
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        class11324 class113242 = class11938.J();
        long l = class112902.Z();
        class11789 class117892 = (class11789)class098092.L("shareEntry:" + String.valueOf(uUID), () -> class113242.i(l));
        boolean bl = class117892 != null;
        class11316 class113162 = (class11316)class098092.L("shareSignal", () -> ((class11324)class113242).N());
        class09785 class097853 = class098092.N("shareSeenGen:" + String.valueOf(uUID), (Object)class113162.y());
        if (class113162.y() > (Long)class097853.L() && class113162.u() == l) {
            class097853.N((Object)class113162.y());
            if (class113162.N() == class11308.CREATED || class113162.N() == class11308.DELETED) {
                class09194.N(class098092, uUID);
                class097852.N(null);
                return class09778.N((T class097842) -> ((class09784)class097842.N("shareModalHidden")).N(class11629.N()));
            }
        }
        class09785 class097854 = class098092.N("shareDuration:" + String.valueOf(uUID), (Object)(((List)R_0).size() - 1));
        class09785 class097855 = class098092.N("shareDurationOpen:" + String.valueOf(uUID), (Object)false);
        class09785 class097856 = class098092.N("shareActs:" + String.valueOf(uUID), (Object)"");
        return class09778.N((class09991)((class09991)R_1), (T class097842) -> {
            class097842.N("shareModalBlur");
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            class097842.N(class09867.CLICK, class09860::T);
            class097842.N(class09867.KEY_DOWN, class098602 -> {
                class09865 class098652;
                if (class098602 instanceof class09865 && (class098652 = (class09865)class098602).y() && class098652.N() == 256) {
                    class097852.N(null);
                    class098602.T();
                }
            });
            class097842.N_3((class09991)R_2, class097843 -> {
                class097843.N("shareModalPanel");
                class097843.N(class09867.POINTER_DOWN, class09860::T);
                class097843.N(class09867.CLICK, class09860::T);
                class097843.N_3((class09991)y_2, class097842 -> {
                    class097842.N(class12020.N((String)(bl ? "share.modal.title-shared" : "share.modal.title")), (class09991)R_3);
                    class097842.y(class09194.N("shareModalClose", () -> class097852.N(null)));
                });
                if (bl) {
                    class097843.N_3((class09991)y_5, class097842 -> {
                        class097842.N("shareInfoGroup");
                        class097842.N(class09194.y(class117892), (class09991)i_2);
                        class097842.N(class12020.N((String)"share.modal.used") + " " + class09194.N(class117892), (class09991)i_2);
                        if (class117892.N()) {
                            class097842.N(class12020.N((String)"share.modal.stale-hint"), (class09991)i_3);
                        }
                    });
                    class097843.N_3((class09991)N_6, class097842 -> {
                        class097842.N("shareCopyExistingButton");
                        class097842.N(class09867.POINTER_DOWN, class09860::T);
                        class097842.N_1(class098602 -> {
                            class113242.N(class117892);
                            class09194.N(class098092, uUID);
                            class097852.N(null);
                            class098602.T();
                        });
                        class097842.N(class12020.N((String)"share.modal.copy"), (class09991)i_0);
                    });
                    class097843.N_3((class09991)N_6, class097842 -> {
                        class097842.N("shareRefreshButton");
                        class097842.N(class09867.POINTER_DOWN, class09860::T);
                        class097842.N_1(class098602 -> {
                            class113242.u(l);
                            class098602.T();
                        });
                        class097842.N(class12020.N((String)"share.modal.refresh"), (class09991)i_0);
                    });
                    class097843.N_3((class09991)N_6, class097842 -> {
                        class097842.N("shareDeleteButton");
                        class097842.N(class09867.POINTER_DOWN, class09860::T);
                        class097842.N_1(class098602 -> {
                            class09194.N(class112902);
                            class09194.N(class098092, uUID);
                            class097852.N(null);
                            class098602.T();
                        });
                        class097842.N(class12020.N((String)"share.modal.delete-link"), (class09991)i_4);
                    });
                } else {
                    class097843.N_3((class09991)y_5, class097842 -> {
                        class097842.N("shareDurationGroup");
                        class097842.N(class12020.N((String)"share.modal.duration"), (class09991)i_1);
                        class097842.y(class09194.N(class098092, (class09785<Integer>)class097854, (class09785<Boolean>)class097855));
                    });
                    class097843.N_3((class09991)y_5, class097842 -> {
                        class097842.N("shareLimitGroup");
                        class097842.N(class12020.N((String)"share.modal.limit"), (class09991)i_1);
                        class097842.y(class09194.N((class09785<String>)class097856));
                    });
                    class097843.N_3((class09991)N_6, class097842 -> {
                        class097842.N("shareCopyLinkButton");
                        class097842.N(class09867.POINTER_DOWN, class09860::T);
                        class097842.N_1(class098602 -> {
                            class09194.N(class112902, (class09785<Integer>)class097854, (class09785<String>)class097856);
                            class09194.N(class098092, uUID);
                            class097852.N(null);
                            class098602.T();
                        });
                        class097842.N(class12020.N((String)"share.modal.copy-link"), (class09991)i_0);
                    });
                    class097843.N_3(class09194.N(class092112), class097842 -> {
                        class097842.N("shareCopyOnceButton");
                        class097842.N(class09867.POINTER_DOWN, class09860::T);
                        class097842.N_1(class098602 -> {
                            class09194.y(class112902);
                            class09194.N(class098092, uUID);
                            class097852.N(null);
                            class098602.T();
                        });
                        class097842.N(class12020.N((String)"share.modal.copy-once"), class09194.y(class092112));
                    });
                }
            });
        });
    }

    private static class09798 N(class09785<String> class097852) {
        return class09778.N((class09991)((class09991)N_2), (T class097842) -> {
            class097842.N("shareActivationsField");
            class097842.u((T class098142) -> {
                class098142.N("shareActivationsInput");
                class098142.L((String)class097852.L());
                class098142.N(((String)class097852.L()).isEmpty() ? (class09991)N_4 : (class09991)N_5);
                class098142.i(class12020.N((String)"share.modal.unlimited"));
                class098142.N(class09867.INPUT, class098602 -> {
                    class09844 class098442 = (class09844)class098602;
                    String string = class098442.y();
                    if (((Pattern)M_1).matcher(string).matches()) {
                        class097852.N((Object)string);
                    } else {
                        class098602.z().N(class098442.N());
                    }
                });
            });
        });
    }

    private static void N() {
    }

    private static String N(int n) {
        return class12020.N((String)("entry." + ((class09192)((Object)((List)R_0).get(n))).N()));
    }

    private static class09798 N(String string, Runnable runnable) {
        return class09778.N((class09991)((class09991)y_3), (T class097842) -> {
            class097842.N(string);
            class097842.N(class09867.POINTER_DOWN, class09860::T);
            class097842.N_1(class098602 -> {
                runnable.run();
                class098602.T();
            });
            class097842.L((T class097772) -> class097772.L("icon:menu/xmark").N((class09991)y_4));
        });
    }

    private static void N(class09785<Integer> class097852, class11535 class115352) {
        for (int i = 0; i < ((List)R_0).size(); ++i) {
            if (!class115352.E().N().equals("entry." + ((class09192)((Object)((List)R_0).get(i))).N())) continue;
            class097852.N((Object)i);
            return;
        }
    }

    private static void N(class11290 class112902, class09785<Integer> class097852, class09785<String> class097853) {
        int n = ((class09192)((Object)((List)R_0).get((Integer)class097852.L()))).y();
        long l = n == 0 ? 0L : System.currentTimeMillis() + (long)n * 86400000L;
        class11938.J().N(class112902.Z(), l, class09194.E((String)class097853.L()));
    }

    private static class09991 N(class09211 class092112) {
        return class09991.N((class09991[])new class09991[]{(class09991)N_6, class09991.N().y(class09662.N((int)class092112.M(), (float)0.15f)).u(class092112.M())});
    }

    private static void N(class11290 class112902) {
        class11938.J().y(class112902.Z());
    }
}

