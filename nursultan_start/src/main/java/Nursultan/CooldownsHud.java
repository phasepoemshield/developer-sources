/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09180
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09221
 *  Nursultan.class09227
 *  Nursultan.class09728
 *  Nursultan.class09743
 *  Nursultan.class09777
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09801
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09976
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class10621
 *  Nursultan.class11644
 *  Nursultan.class11730
 *  Nursultan.class11740
 *  Nursultan.class11751
 *  Nursultan.class11753
 *  Nursultan.class11756
 *  Nursultan.class11761
 *  Nursultan.class11769
 *  Nursultan.class11867
 *  Nursultan.class11938
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06556
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class08044
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09728;
import Nursultan.class09743;
import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class10621;
import Nursultan.class11644;
import Nursultan.class11730;
import Nursultan.class11740;
import Nursultan.class11751;
import Nursultan.class11753;
import Nursultan.class11756;
import Nursultan.class11761;
import Nursultan.class11769;
import Nursultan.class11867;
import Nursultan.class11938;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06556;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class08044;

@class11761(u="cooldowns", i=10.0f, N=169.0f, L=true)
public class CooldownsHud
extends class11769 {
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
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object L_6;
    public static Object L_7;
    public static Object u_0;
    public static Object u_1;
    public Object i_0;

    public CooldownsHud() {
        super(CooldownsHud::N);
        this.t();
        this.i_0 = new class11740(120.0f);
    }

    static {
        CooldownsHud.d();
        N_0 = class06202.Nq();
        N_1 = class06570.nz.E();
        N_3 = class01894.y((String)"nursultan_example_ender_pearl");
        class09991 class099912 = class09991.N().N(class09962.N());
        y_1 = class09991.N((class09991[])new class09991[]{(class09991)class11756.y_1, class099912.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0f)});
        L_0 = class09991.N().N(class09962.N()).y(class09962.N((float)100.0f)).N(11.0f).i(11.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX);
        L_1 = class09227.N((T class092112) -> class09991.N().u(16.0f, 16.0f).i(class092112.M()));
        L_2 = class09991.N().y(class09962.N((float)38.0f, (float)Float.POSITIVE_INFINITY)).N(10.0f).i(9.0f).M(9.0f).N(class09975.COLUMN).N(class09983.BORDER_BOX);
        L_3 = class09991.N().N(class09962.N((float)0.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09975.ROW).B(4.0f).y(class09973.CENTER).N(class09983.BORDER_BOX);
        L_4 = class09991.N().u(16.0f, 16.0f);
        class09991 class099913 = class09991.N();
        L_5 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.REGULAR)});
        L_6 = class09227.N((T class092112) -> class09991.N((class09991[])new class09991[]{class09991.N().i(class092112.M()), class09221.N((int)14, (class09079)class09079.MEDIUM)}));
        L_7 = class09991.N().N(class09962.N((float)45.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09973.END).y(class09973.CENTER);
    }

    private static String i(int n) {
        float f = (class03448)((class06202)CooldownsHud.N_0).T_3 != null ? ((class03448)((class06202)CooldownsHud.N_0).T_3).method_54719().R() : 20.0f;
        int n2 = Math.max(0, (int)Math.ceil((float)n / Math.max(1.0f, f)));
        int n3 = n2 / 60;
        int n4 = n2 % 60;
        return n3 + ":" + (String)(n4 < 10 ? "0" + n4 : Integer.toString(n4));
    }

    private static List<class11751> b() {
        if ((class04453)((class06202)CooldownsHud.N_0).T_4 == null) {
            return List.of();
        }
        class06556 class065562 = ((class04453)((class06202)CooldownsHud.N_0).T_4).method_7357();
        Set<class01894> set = class11938.u().G().m() ? CooldownsHud.N(class065562) : null;
        int n = class065562.y;
        ArrayList<class11751> arrayList = new ArrayList<class11751>();
        for (Map.Entry entry : class065562.N.entrySet()) {
            class06581 class065812;
            int n2 = ((class10621)entry.getValue()).y() - n;
            if (n2 <= 0 || set != null && !set.contains(entry.getKey()) || (class065812 = (class06581)class04206.B.N((class01894)entry.getKey())) == class06570.N) continue;
            arrayList.add(new class11751((class01894)entry.getKey(), class065812.E(), n2));
        }
        return arrayList;
    }

    private static void d() {
        N_0 = null;
        N_1 = null;
        N_2 = 600;
        N_3 = null;
        N_4 = 10;
        N_5 = 16;
        N_6 = 120;
        N_7 = 14;
        u_0 = 4;
        u_1 = 20;
        y_0 = 45;
        y_1 = null;
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
        L_6 = null;
        L_7 = null;
    }

    private void t() {
    }

    private static List<String> j() {
        return CooldownsHud.b().stream().map(class117512 -> String.valueOf(class117512.y()) + " " + CooldownsHud.i(class117512.N())).toList();
    }

    public boolean y() {
        return class11938.u().G().U();
    }

    private static float N(String string, String string2) {
        class11753 class117532 = class11938.i();
        float f = class117532.N(string, 14.0f, class09079.REGULAR);
        float f2 = Math.max(45.0f, class117532.N(string2, 14.0f, class09079.MEDIUM));
        return 59.0f + f + f2;
    }

    private static class09798 N(String string, class06584 class065842) {
        class11867 class118672 = class11938.k().N(class065842);
        return class09778.N((class09991)((class09991)L_4), (T class097842) -> {
            class097842.N(string + "-iconSlot");
            if (class118672.L()) {
                class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)L_4, class09991.N().N(class118672.y(), class118672.N(), class118672.R(), class118672.i())});
                class097842.L(class097772 -> ((class09777)class097772.N(string + "-icon")).L(class11938.k().y()).N(class099912));
            }
        });
    }

    private static class09798 N(String string, String string2, class09211 class092112) {
        return class09778.N((class09991)((class09991)L_7), (T class097842) -> {
            class097842.N(string + "-durationBox");
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-duration")).L(string2).N(((class09227)L_6).N(class092112)));
        });
    }

    private static class09798 N(Void void_, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        CooldownsHud cooldownsHud = (CooldownsHud)((Object)class11730.N_5);
        class098092.u("cooldownsTicker", () -> (class11740)cooldownsHud.i_0);
        class098092.L("cooldownsDurations", CooldownsHud::j);
        List list = ((class11740)cooldownsHud.i_0).N(CooldownsHud.b(), class11751::y);
        boolean bl = class11753.y();
        boolean bl2 = !list.isEmpty() || bl;
        boolean bl3 = ((class11740)cooldownsHud.i_0).N(bl2);
        float f = ((class11740)cooldownsHud.i_0).N(bl2, CooldownsHud.N(list, bl));
        return class09778.N((class09991)((class09991)y_1), (T class097843) -> {
            class097843.N("cooldownsWindow");
            class097843.N_3((class09991)L_0, class097842 -> {
                class097842.N("cooldownsIconArea");
                class097842.L(class097772 -> ((class09777)class097772.N("hud-cooldowns")).L("icon:hud/cooldowns").N(((class09227)L_1).N(class092112)));
            });
            class097843.N((T class097842) -> ((class09784)class097842.N("cooldownsDivider")).N((class09991)class09180.N_3));
            class097843.y(CooldownsHud.N((List<class11751>)list, bl, class092112, bl3, f));
        });
    }

    public boolean N() {
        return !CooldownsHud.b().isEmpty() || class11753.y();
    }

    private static String N(class01894 class018942) {
        return "cooldownRow-" + class018942.toString().replace(':', '-');
    }

    private static class09798 N(List<class11751> list, boolean bl, class09211 class092112, boolean bl2, float f) {
        return class09778.N((class09991)(bl2 ? class11756.N((class09991)((class09991)L_2), (float)f, (float)120.0f, (class09743)((class09728)class11644.N_0)) : class11756.N((class09991)((class09991)L_2), (float)f, (float)120.0f)), (T class097843) -> {
            class097843.N("cooldownsContentBox");
            if (list.isEmpty() && bl) {
                String string = CooldownsHud.N((class01894)N_3);
                class097843.N_3(class11756.N((boolean)true, (boolean)bl2), class097842 -> {
                    class097842.N(string);
                    class097842.y(CooldownsHud.N(string, (class06584)N_1, ((class06584)N_1).d().getString()));
                    class097842.y(CooldownsHud.N(string, CooldownsHud.i(600), class092112));
                });
                return;
            }
            int n = 0;
            for (class11751 class117512 : list) {
                String string = CooldownsHud.N(class117512.y());
                class09991 class099912 = ((class11740)((CooldownsHud)((Object)((Object)class11730.N_5))).i_0).N((Object)class117512.y()) ? (class09991)class11756.L_5 : class11756.N((n++ == 0 ? 1 : 0) != 0, (boolean)bl2);
                class097843.N_3(class099912, class097842 -> {
                    class097842.N(string);
                    class097842.y(CooldownsHud.N(string, class117512.L(), class117512.L().d().getString()));
                    class097842.y(CooldownsHud.N(string, CooldownsHud.i(class117512.N()), class092112));
                });
            }
        });
    }

    private static float N(List<class11751> list, boolean bl) {
        if (list.isEmpty() && bl) {
            return CooldownsHud.N(((class06584)N_1).d().getString(), CooldownsHud.i(600));
        }
        float f = 0.0f;
        for (class11751 class117512 : list) {
            f = Math.max(f, CooldownsHud.N(class117512.L().d().getString(), CooldownsHud.i(class117512.N())));
        }
        return f;
    }

    private static Set<class01894> N(class06556 class065562) {
        HashSet<class01894> hashSet = new HashSet<class01894>();
        class08044 class080442 = ((class04453)((class06202)CooldownsHud.N_0).T_4).method_31548();
        for (int i = 0; i < class080442.method_5439(); ++i) {
            class01894 class018942;
            class06584 class065842 = class080442.method_5438(i);
            if (class065842.R() || (class018942 = class065562.y(class065842)) == null) continue;
            hashSet.add(class018942);
        }
        return hashSet;
    }

    private static class09798 N(String string, class06584 class065842, String string2) {
        return class09778.N((class09991)((class09991)L_3), (T class097842) -> {
            class097842.N(string + "-left");
            class097842.y(CooldownsHud.N(string, class065842));
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-name")).L(string2).N((class09991)L_5));
        });
    }
}

