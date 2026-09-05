/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09860
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09965
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11067
 *  Nursultan.class11290
 *  Nursultan.class11503
 *  Nursultan.class11510
 *  Nursultan.class11536
 *  Nursultan.class11727
 *  Nursultan.class11844
 *  Nursultan.class11854
 *  Nursultan.class11882
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09184;
import Nursultan.class09211;
import Nursultan.class09213;
import Nursultan.class09214;
import Nursultan.class09219;
import Nursultan.class09221;
import Nursultan.class09224;
import Nursultan.class09227;
import Nursultan.class09250;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09860;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09965;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11067;
import Nursultan.class11290;
import Nursultan.class11503;
import Nursultan.class11510;
import Nursultan.class11536;
import Nursultan.class11727;
import Nursultan.class11844;
import Nursultan.class11854;
import Nursultan.class11882;
import Nursultan.class12020;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class class09226 {
    private static String[] P;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;

    private class09226() {
    }

    static {
        class09226.N();
        class09226.y();
        class09226.i();
        class09226.u();
        N_0 = new class09226()::N;
        N_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).u(20.0f).i(20.0f).B(20.0f).N(class09975.COLUMN).N(class09983.BORDER_BOX);
        N_3 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).Z(12.0f).z(1.0f).M(1.0f).N(class09983.BORDER_BOX).N(class09975.COLUMN).u(((Integer)class09181.y_1).intValue()).y(((Integer)class09181.y_0).intValue());
        y_0 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)60.0f)).y(class09973.CENTER).u(17.0f).i(17.0f).N(class09983.BORDER_BOX).N(new class09965(12.0f, 12.0f, 0.0f, 0.0f)).y(((Integer)class09181.y_3).intValue());
        y_1 = class09227.N((class09211 class092112) -> class09991.N((class09991[])new class09991[]{class09991.N().i(class092112.M()), class09221.N(18, class09079.SEMI_BOLD)}));
        y_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).u(18.0f).i(18.0f).N(class09975.COLUMN).N(class09983.BORDER_BOX);
        y_3 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)60.0f)).N(class09973.CENTER).y(class09973.CENTER);
        y_4 = class09991.N((class09991[])new class09991[]{class09991.N().i(-7171438), class09221.N(18, class09079.REGULAR)});
    }

    private static void i() {
        P = new String[4];
        class09226.P[0] = "settingUpdater";
        class09226.P[1] = " \u00bb ";
        class09226.P[2] = "search.nothing-found";
        class09226.P[3] = " \u00bb ";
    }

    private static void u() {
        N_1 = P[3];
    }

    private static void y() {
    }

    private static int N(class11854 class118542) {
        if (class118542 == class11854.CONFIGS) {
            return 4;
        }
        if (class118542 == class11854.AUTO_BUY) {
            return 8;
        }
        if (class118542 == class11854.ACCOUNTS) {
            return 16;
        }
        if (class118542.N() != null) {
            return 3;
        }
        return 0;
    }

    private static int N(Map.Entry<String, List<class11510>> entry) {
        int n = Integer.MIN_VALUE;
        for (class11510 class115102 : entry.getValue()) {
            n = Math.max(n, class115102.L());
        }
        return n;
    }

    private static List<Map.Entry<String, List<class11510>>> N(class09214 class092142) {
        Object object2;
        List var1 = class11503.N((String)class092142.N(), (int)class09226.N(class092142.y()));
        LinkedHashMap<String, List> linkedHashMap = new LinkedHashMap<String, List>();
        for (Object object2 : var1) {
            if (!(object2.N() instanceof class11067) && !(object2.N() instanceof class11536) && !(object2.N() instanceof class11290) && !(object2.N() instanceof class11882) && !(object2.N() instanceof class09250)) continue;
            linkedHashMap.computeIfAbsent(String.join((CharSequence)P[1], object2.y()), string -> new ArrayList()).add(object2);
        }
        ArrayList<Map.Entry<String, List<class11510>>> arrayList = new ArrayList<Map.Entry<String, List<class11510>>>(linkedHashMap.entrySet());
        object2 = arrayList.iterator();
        while (object2.hasNext()) {
            ((List)((Map.Entry)object2.next()).getValue()).sort(Comparator.comparingInt(class11510::L).reversed());
        }
        arrayList.sort(Comparator.comparingInt(class09226::N).reversed());
        return arrayList;
    }

    private class09798 N(class09214 class092142, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        class09785 class097852 = class098092.N(P[0], null);
        List<Map.Entry<String, List<class11510>>> var5 = class09226.N(class092142);
        if (var5.isEmpty()) {
            return class09778.N((class09991)((class09991)N_2), class097843 -> class097843.N_3((class09991)y_3, class097842 -> class097842.N(class12020.N((String)P[2]), (class09991)y_4)));
        }
        class09991 class099912 = ((class09227)y_1).N(class092112);
        return class09778.N((class09991)((class09991)N_2), class097842 -> {
            for (Map.Entry entry : var5) {
                String string = (String)entry.getKey();
                List list2 = (List)entry.getValue();
                class097842.N_3((class09991)N_3, class097843 -> {
                    class097843.N("searchGroup:" + string);
                    class097843.N(class09867.POINTER_DOWN, class09860::T);
                    class097843.N_3((class09991)y_0, class097842 -> class097842.N(string, class099912));
                    class097843.y((class09991)class09180.N_2);
                    class097843.N_3((class09991)y_2, class097842 -> class09226.N(class097842, list2, (class09785<Void>)class097852, class098092));
                });
            }
        });
    }

    private static void N() {
    }

    private static void N(class09784 class097842, List<class11510> list, class09785<Void> class097852, class09809 class098092) {
        for (int i = 0; i < list.size(); ++i) {
            Object object = list.get(i).N();
            if (object instanceof class11067) {
                class11067 class110672 = (class11067)object;
                class097842.y(class098092.N("moduleHit:" + class110672.N(), (class09788)class09213.y_1, (Object)class110672));
            } else if (object instanceof class11536) {
                class11536 class115362 = (class11536)object;
                class097842.y(class098092.N("settingHit:" + class115362.P().N(), (class09788)class09219.N_0, (Object)new class11844(class115362, class097852)));
            } else if (object instanceof class11290) {
                class11290 class112902 = (class11290)object;
                class097842.y(class098092.N("presetHit:" + String.valueOf(class112902.u()), (class09788)class09184.L_2, (Object)class112902));
            } else if (object instanceof class11882) {
                class11882 class118822 = (class11882)object;
                class097842.y(class098092.N("autoBuyHit:" + class118822.L().N(), (class09788)class09224.u_0, (Object)class118822));
            } else if (object instanceof class09250) {
                class09250 class092502 = (class09250)object;
                class097842.y(class098092.N("accountHit:" + String.valueOf(class092502.R()), (class09788)class11727.u_0, (Object)class092502));
            }
            if (i >= list.size() - 1) continue;
            class097842.y((class09991)class09180.N_2);
        }
    }
}

