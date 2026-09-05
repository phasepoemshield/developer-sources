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
 *  Nursultan.class11067
 *  Nursultan.class11398
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
import Nursultan.class11067;
import Nursultan.class11398;
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

@class11761(u="hotkeys", i=10.0f, N=65.0f, L=true)
public class HotkeysHud
extends class11769 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public Object y_0;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object L_6;
    public static Object L_7;

    private static void T() {
        L_0 = 10;
        L_1 = 120;
        L_2 = 14;
        L_3 = 20;
        L_4 = 16;
        L_5 = null;
        L_6 = null;
        L_7 = null;
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
    }

    public HotkeysHud() {
        super(HotkeysHud::N);
        this.d();
        this.y_0 = new class11740(120.0f);
    }

    static {
        HotkeysHud.T();
        class09991 class099912 = class09991.N().N(class09962.N());
        L_5 = class09991.N((class09991[])new class09991[]{(class09991)class11756.y_1, class099912.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0f)});
        L_6 = class09991.N().N(class09962.N()).y(class09962.N((float)100.0f)).N(11.0f).i(11.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX);
        L_7 = class09227.N((T class092112) -> class09991.N().u(16.0f, 16.0f).i(class092112.M()));
        N_0 = class09991.N().y(class09962.N((float)38.0f, (float)Float.POSITIVE_INFINITY)).N(10.0f).i(9.0f).M(9.0f).N(class09975.COLUMN).N(class09983.BORDER_BOX);
        class09991 class099913 = class09991.N();
        N_1 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.REGULAR)});
        N_2 = class09227.N((T class092112) -> class09991.N((class09991[])new class09991[]{class09991.N().i(class092112.M()), class09221.N((int)14, (class09079)class09079.MEDIUM)}));
        N_3 = class09991.N().N(class09962.N((float)16.0f, (float)Float.POSITIVE_INFINITY)).y(class09962.N((float)100.0f)).N(class09973.END).y(class09973.CENTER);
    }

    private void d() {
    }

    private static List<class11067> t() {
        return class11938.u().a().filter(HotkeysHud::N).toList();
    }

    private static String j() {
        return class12020.N((String)"hud.example");
    }

    public boolean y() {
        return class11938.u().J().U();
    }

    private static float N(String string, String string2) {
        class11753 class117532 = class11938.i();
        float f = class117532.N(string, 14.0f, class09079.REGULAR);
        float f2 = Math.max(16.0f, class117532.N(string2, 14.0f, class09079.MEDIUM));
        return 19.0f + f + 20.0f + f2;
    }

    private static float N(List<class11067> list, boolean bl) {
        if (list.isEmpty() && bl) {
            return HotkeysHud.N(HotkeysHud.j(), "None");
        }
        float f = 0.0f;
        for (class11067 class110672 : list) {
            f = Math.max(f, HotkeysHud.N(class110672.L(), class110672.R().z()));
        }
        return f;
    }

    public boolean N() {
        return class11753.y() || class11938.u().a().anyMatch(HotkeysHud::N);
    }

    private static class09798 N(List<class11067> list, boolean bl, class09211 class092112, boolean bl2, float f) {
        return class09778.N((class09991)(bl2 ? class11756.N((class09991)((class09991)N_0), (float)f, (float)120.0f, (class09743)((class09728)class11644.N_0)) : class11756.N((class09991)((class09991)N_0), (float)f, (float)120.0f)), (T class097842) -> {
            class097842.N("hotkeysContentBox");
            if (list.isEmpty() && bl) {
                String string = "hotkey-row-example";
                class097842.N_3(class11756.N((boolean)true, (boolean)bl2), class097843 -> {
                    class097843.N(string);
                    class097843.y((T class098012) -> ((class09801)class098012.N(string + "-name")).L(HotkeysHud.j()).N((class09991)N_1));
                    class097843.N_3((class09991)N_3, class097842 -> {
                        class097842.N(string + "-bind-box");
                        class097842.y((T class098012) -> ((class09801)class098012.N(string + "-bind")).L("None").N(((class09227)N_2).N(class092112)));
                    });
                });
                return;
            }
            int n = 0;
            for (class11067 class110672 : list) {
                String string = "hotkey-" + class110672.N();
                class09991 class099912 = ((class11740)((HotkeysHud)((Object)((Object)class11730.N_1))).y_0).N((Object)class110672) ? (class09991)class11756.L_5 : class11756.N((n++ == 0 ? 1 : 0) != 0, (boolean)bl2);
                class097842.N_3(class099912, class097843 -> {
                    class097843.N(string);
                    class097843.y((T class098012) -> ((class09801)class098012.N(string + "-name")).L(class110672.L()).N((class09991)N_1));
                    class097843.N_3((class09991)N_3, class097842 -> {
                        class097842.N(string + "-bind-box");
                        class097842.y((T class098012) -> ((class09801)class098012.N(string + "-bind")).L(class110672.R().z()).N(((class09227)N_2).N(class092112)));
                    });
                });
            }
        });
    }

    @class11782
    public void N(class11398 class113982) {
        String string = class113982.y().L();
        if (string != null && string.startsWith("module/")) {
            class11938.i().N();
        }
    }

    private static class09798 N(Void void_, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        HotkeysHud hotkeysHud = (HotkeysHud)((Object)class11730.N_1);
        class098092.u("hotkeysTicker", () -> (class11740)hotkeysHud.y_0);
        List list = ((class11740)hotkeysHud.y_0).N(HotkeysHud.t(), (T class110672) -> class110672);
        boolean bl = class11753.y();
        boolean bl2 = !list.isEmpty() || bl;
        boolean bl3 = ((class11740)hotkeysHud.y_0).N(bl2);
        float f = ((class11740)hotkeysHud.y_0).N(bl2, HotkeysHud.N(list, bl));
        return class09778.N((class09991)((class09991)L_5), (T class097843) -> {
            class097843.N("hotkeysWindow");
            class097843.N_3((class09991)L_6, class097842 -> {
                class097842.N("hotkeysIconArea");
                class097842.L(class097772 -> ((class09777)class097772.N("hud-hotkeys")).L("icon:hud/hotkeys").N(((class09227)L_7).N(class092112)));
            });
            class097843.N((T class097842) -> ((class09784)class097842.N("hotkeysDivider")).N((class09991)class09180.N_3));
            class097843.y(HotkeysHud.N((List<class11067>)list, bl, class092112, bl3, f));
        });
    }

    private static boolean N(class11067 class110672) {
        return class110672.U() && class110672.R().N() && !class110672.R().B();
    }
}

