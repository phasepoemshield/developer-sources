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
 *  Nursultan.class10997
 *  Nursultan.class11300
 *  Nursultan.class11644
 *  Nursultan.class11730
 *  Nursultan.class11740
 *  Nursultan.class11753
 *  Nursultan.class11756
 *  Nursultan.class11761
 *  Nursultan.class11769
 *  Nursultan.class11782
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class05018
 *  minecraft.class05913
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class08388
 *  minecraft.class08392
 *  minecraft.class08923
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
import Nursultan.class10997;
import Nursultan.class11300;
import Nursultan.class11644;
import Nursultan.class11730;
import Nursultan.class11740;
import Nursultan.class11753;
import Nursultan.class11756;
import Nursultan.class11761;
import Nursultan.class11769;
import Nursultan.class11782;
import Nursultan.class11938;
import Nursultan.class12020;
import java.util.List;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05018;
import minecraft.class05913;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class08388;
import minecraft.class08392;
import minecraft.class08923;

@class11761(u="effects", i=10.0f, N=118.0f, L=true)
public class EffectsHud
extends class11769 {
    public Object N_0;
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
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object M_0;
    public static Object M_1;

    private static String L(class07055 class070552) {
        int n = Byte.toUnsignedInt((byte)class070552.i()) + 1;
        return n <= 1 ? "" : Integer.toString(n);
    }

    private static String L(class03556<class07084> class035562) {
        return class035562.i().map(class059462 -> class059462.N().toString()).orElse("unknown");
    }

    private static boolean M(class07055 class070552) {
        return class070552 != null && !((class07084)class070552.L().N()).z();
    }

    private static List<class07055> T() {
        if ((class04453)((class06202)EffectsHud.M_0).T_4 == null) {
            return List.of();
        }
        return ((class04453)((class06202)EffectsHud.M_0).T_4).method_6026().stream().filter(class070552 -> !((class07084)class070552.L().N()).N()).toList();
    }

    public EffectsHud() {
        super(EffectsHud::N);
        this.b();
        this.N_0 = new class11740(120.0f);
    }

    static {
        EffectsHud.n();
        M_0 = class06202.Nq();
        M_1 = new class07055(class07047.N, 999);
        i_1 = class01894.y((String)"textures/atlas/gui.png");
        L_3 = class11300.L((int)-1, (float)72.0f);
        class09991 class099912 = class09991.N().N(class09962.N());
        L_4 = class09991.N((class09991[])new class09991[]{(class09991)class11756.y_1, class099912.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0f)});
        L_5 = class09991.N().N(class09962.N()).y(class09962.N((float)100.0f)).N(11.0f).i(11.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX);
        L_6 = class09227.N((T class092112) -> class09991.N().u(16.0f, 16.0f).i(class092112.M()));
        y_0 = class09991.N().y(class09962.N((float)38.0f, (float)Float.POSITIVE_INFINITY)).N(10.0f).i(9.0f).M(9.0f).N(class09975.COLUMN).N(class09983.BORDER_BOX);
        y_1 = class09991.N().N(class09962.N((float)0.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09975.ROW).B(4.0f).y(class09973.CENTER).N(class09983.BORDER_BOX);
        y_2 = class09991.N().u(18.0f, 18.0f);
        y_3 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW).B(4.0f).y(class09973.CENTER);
        class09991 class099913 = class09991.N();
        y_4 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099914 = class09991.N();
        y_5 = class09991.N((class09991[])new class09991[]{class099914.i(((Integer)L_3).intValue()).m(1.0f), class09221.N((int)12, (class09079)class09079.REGULAR)});
        y_6 = class09227.N((T class092112) -> class09991.N((class09991[])new class09991[]{class09991.N().i(class092112.M()), class09221.N((int)14, (class09079)class09079.MEDIUM)}));
        y_7 = class09991.N().N(class09962.N((float)45.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09973.END).y(class09973.CENTER);
        u_0 = class09227.N((T class092112) -> class09991.N((class09991[])new class09991[]{((class09227)y_6).N(class092112), class09991.N().i(class092112.M()).l(1.0f)}));
        u_1 = class09227.N((T class092112) -> class09991.N((class09991[])new class09991[]{((class09227)y_6).N(class092112), class09991.N().i(-35981).l(1.0f)}));
    }

    private static String i(class07055 class070552) {
        return EffectsHud.N((class03556<class07084>)class070552.L());
    }

    private void b() {
    }

    private static void n() {
        M_0 = null;
        M_1 = null;
        i_0 = "mcatlas:textures/atlas/gui.png";
        i_1 = null;
        i_2 = 10;
        R_0 = 20;
        R_1 = 18;
        R_2 = 120;
        R_3 = 14;
        L_0 = 12;
        L_1 = 4;
        L_2 = 45;
        L_3 = -1191182337;
        L_4 = null;
        L_5 = null;
        L_6 = null;
        y_0 = null;
        y_1 = null;
        y_2 = null;
        y_3 = null;
        y_4 = null;
        y_5 = null;
        y_6 = null;
        y_7 = null;
        u_0 = null;
        u_1 = null;
    }

    private static String d() {
        return class12020.N((String)"hud.example");
    }

    private static List<String> t() {
        return EffectsHud.T().stream().map(EffectsHud::N).toList();
    }

    private static String u(class07055 class070552) {
        return class08392.N((String)class070552.z(), (Object[])new Object[0]);
    }

    private static float y(String string, String string2, String string3) {
        class11753 class117532 = class11938.i();
        float f = class117532.N(string, 14.0f, class09079.REGULAR);
        float f2 = class117532.N(string2, 12.0f, class09079.REGULAR);
        float f3 = Math.max(45.0f, class117532.N(string3, 14.0f, class09079.MEDIUM));
        return 41.0f + f + ((float)(f2 > 0.0f ? 4 : 0) + f2) + 20.0f + f3;
    }

    public boolean y() {
        return class11938.u().Y().U();
    }

    private static class01894 y(class03556<class07084> class035562) {
        return class035562.i().map(class05946::N).map(class018942 -> class018942.R("mob_effect/")).orElseGet(class08923::L);
    }

    public boolean N() {
        return !EffectsHud.T().isEmpty() || class11753.y();
    }

    private static class09798 N(String string, String string2, String string3) {
        return class09778.N((class09991)((class09991)y_3), (T class097842) -> {
            class097842.N(string + "-nameBox");
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-name")).L(string2).N((class09991)y_4));
            if (!string3.isEmpty()) {
                class097842.y((T class098012) -> ((class09801)class098012.N(string + "-level")).L(string3).N((class09991)y_5));
            }
        });
    }

    private static class09798 N(String string, class03556<class07084> class035562) {
        class08388 class083882 = ((class06202)M_0).yW().N(new class05913((class01894)i_1, EffectsHud.y(class035562)));
        class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)y_2, class09991.N().N(class083882.method_4594(), class083882.method_4593(), class083882.method_4577(), class083882.method_4575())});
        return class09778.N((class09991)((class09991)y_2), (T class097842) -> {
            class097842.N(string + "-iconSlot");
            class097842.L((T class097772) -> ((class09777)class097772.N(string + "-icon")).L("mcatlas:textures/atlas/gui.png").N(class099912));
        });
    }

    private static class09798 N(List<class07055> list, boolean bl, class09211 class092112, boolean bl2, float f) {
        return class09778.N((class09991)(bl2 ? class11756.N((class09991)((class09991)y_0), (float)f, (float)120.0f, (class09743)((class09728)class11644.N_0)) : class11756.N((class09991)((class09991)y_0), (float)f, (float)120.0f)), (T class097843) -> {
            class097843.N("effectsContentBox");
            if (list.isEmpty() && bl) {
                String string = "effectRow-example";
                class097843.N_3(class11756.N((boolean)true, (boolean)bl2), class097842 -> {
                    class097842.N(string);
                    class097842.y(EffectsHud.N(string, (class03556<class07084>)class07047.N, EffectsHud.d(), "2", (class07055)M_1));
                    class097842.y(EffectsHud.N(string, "9:41", null, class092112));
                });
                return;
            }
            int n = 0;
            for (class07055 class070552 : list) {
                String string = EffectsHud.i(class070552);
                class09991 class099912 = ((class11740)((EffectsHud)((Object)((Object)class11730.N_0))).N_0).N((Object)EffectsHud.L((class03556<class07084>)class070552.L())) ? (class09991)class11756.L_5 : class11756.N((n++ == 0 ? 1 : 0) != 0, (boolean)bl2);
                class097843.N_3(class099912, class097842 -> {
                    class097842.N(string);
                    class097842.y(EffectsHud.N(string, (class03556<class07084>)class070552.L(), EffectsHud.u(class070552), EffectsHud.L(class070552), class070552));
                    class097842.y(EffectsHud.N(string, EffectsHud.N(class070552), class070552, class092112));
                });
            }
        });
    }

    private static class09798 N(String string, String string2, class07055 class070552, class09211 class092112) {
        class09991 class099912 = EffectsHud.M(class070552) ? ((class09227)u_1).N(class092112) : ((class09227)u_0).N(class092112);
        return class09778.N((class09991)((class09991)y_7), (T class097842) -> {
            class097842.N(string + "-durationBox");
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-duration")).L(string2).N(class099912));
        });
    }

    private static String N(class07055 class070552) {
        if (class070552.y()) {
            return "**:**";
        }
        float f = (class03448)((class06202)EffectsHud.M_0).T_3 != null ? ((class03448)((class06202)EffectsHud.M_0).T_3).method_54719().R() : 20.0f;
        return class05018.N((int)class070552.u(), (float)f);
    }

    private static String N(class03556<class07084> class035562) {
        return "effectRow-" + EffectsHud.L(class035562);
    }

    private static class09798 N(Void void_, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        EffectsHud effectsHud = (EffectsHud)((Object)class11730.N_0);
        class098092.u("effectsTicker", () -> (class11740)effectsHud.N_0);
        class098092.L("effectsDurations", EffectsHud::t);
        List list = ((class11740)effectsHud.N_0).N(EffectsHud.T(), (T class070552) -> EffectsHud.L((class03556<class07084>)class070552.L()));
        boolean bl = class11753.y();
        boolean bl2 = !list.isEmpty() || bl;
        boolean bl3 = ((class11740)effectsHud.N_0).N(bl2);
        float f = ((class11740)effectsHud.N_0).N(bl2, EffectsHud.N(list, bl));
        return class09778.N((class09991)((class09991)L_4), (T class097843) -> {
            class097843.N("effectsWindow");
            class097843.N_3((class09991)L_5, class097842 -> {
                class097842.N("effectsIconArea");
                class097842.L((T class097772) -> ((class09777)class097772.N("hud-effects")).L("icon:hud/potions").N(((class09227)L_6).N(class092112)));
            });
            class097843.N((T class097842) -> ((class09784)class097842.N("effectsDivider")).N((class09991)class09180.N_3));
            class097843.y(EffectsHud.N((List<class07055>)list, bl, class092112, bl3, f));
        });
    }

    private static class09798 N(String string, class03556<class07084> class035562, String string2, String string3, class07055 class070552) {
        return class09778.N((class09991)((class09991)y_1), (T class097842) -> {
            class097842.N(string + "-left");
            class097842.y(EffectsHud.N(string, class035562));
            class097842.y(EffectsHud.N(string, string2, string3));
        });
    }

    private static float N(List<class07055> list, boolean bl) {
        if (list.isEmpty() && bl) {
            return EffectsHud.y(EffectsHud.d(), "2", "9:41");
        }
        float f = 0.0f;
        for (class07055 class070552 : list) {
            f = Math.max(f, EffectsHud.y(EffectsHud.u(class070552), EffectsHud.L(class070552), EffectsHud.N(class070552)));
        }
        return f;
    }

    @class11782
    public void N(class10997 class109972) {
        class11938.i().N();
    }
}

