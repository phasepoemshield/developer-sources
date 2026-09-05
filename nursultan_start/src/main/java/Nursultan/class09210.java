/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09777
 *  Nursultan.class09778
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11472
 *  Nursultan.class11839
 *  Nursultan.class11854
 *  Nursultan.class11878
 *  Nursultan.class11938
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09180;
import Nursultan.class09195;
import Nursultan.class09211;
import Nursultan.class09218;
import Nursultan.class09227;
import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11472;
import Nursultan.class11839;
import Nursultan.class11854;
import Nursultan.class11878;
import Nursultan.class11938;
import Nursultan.class12020;

public class class09210 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;

    private static void L() {
    }

    private class09210() {
    }

    static {
        class09210.L();
        class09210.y();
        class09210.N();
        class09210.u();
        N_0 = new class09210()::N;
        N_1 = class09991.N().N(class09962.y((float)270.0f)).y(class09962.N((float)100.0f)).N(class09975.ROW);
        N_2 = class09991.N().N(class09962.y((float)269.0f)).y(class09962.N((float)100.0f)).N(class09975.COLUMN);
        N_3 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)89.0f)).N(class09973.CENTER).y(class09973.CENTER);
        N_4 = class09227.N((class09211 class092112) -> class09991.N().N(class09962.y((float)52.0f)).y(class09962.y((float)38.0f)).i(class092112.M()));
        N_5 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N((float)100.0f)).R(30.0f).u(22.0f).N(class09983.BORDER_BOX).N(class09975.COLUMN);
        N_6 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).B(6.0f).M(33.0f).N(class09975.COLUMN).R(9.0f);
    }

    private static class11878 i() {
        int n = ((class11472)class11938.L_2).U();
        Object object = n > 0 ? "glid:" + n : "icons/unknown.png";
        return new class11878((String)object, ((class11472)class11938.L_2).Z(), ((class11472)class11938.L_2).z());
    }

    private static void u() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
    }

    private static void y() {
    }

    private static class09798 N(class09809 class098092, class09785<class11854> class097852, String string, String string2, class11854 class118542) {
        return class098092.N(string2, (class09788)class09218.N_0, (Object)new class11839(string, string2, class118542, class097852));
    }

    private class09798 N(class09785<class11854> class097852, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        class11878 class118782 = class09210.i();
        return class09778.N((class09991)((class09991)N_1), (T class097842) -> class097842.N(new Object[]{class09778.N((class09991)((class09991)N_2), (T class097844) -> {
            class097844.N(new Object[]{class09778.N((class09991)((class09991)N_3), (T class097842) -> class097842.L(class097772 -> ((class09777)class097772.N("logo")).L("icon:menu/nursultan").N(((class09227)N_4).N(class092112)))), class09778.N((class09991)((class09991)class09180.N_2)), class09778.N((class09991)((class09991)N_5), (T class097843) -> {
                class097843.N(class12020.N((String)"tab.features"), (class09991)class09180.N_4);
                class097843.N_3((class09991)N_6, class097842 -> class097842.N(new Object[]{class09210.N(class098092, class097852, "category.combat", "combat", class11854.COMBAT), class09210.N(class098092, class097852, "category.movement", "movement", class11854.MOVEMENT), class09210.N(class098092, class097852, "category.visual", "visuals", class11854.VISUAL), class09210.N(class098092, class097852, "category.player", "player", class11854.PLAYER), class09210.N(class098092, class097852, "category.misc", "misc", class11854.MISC)}));
                class097843.N(class12020.N((String)"tab.manager"), (class09991)class09180.N_4);
                class097843.N_3((class09991)N_6, class097842 -> class097842.N(new Object[]{class09210.N(class098092, class097852, "category.configs", "presets", class11854.CONFIGS), class09210.N(class098092, class097852, "category.autobuy", "autobuy", class11854.AUTO_BUY), class09210.N(class098092, class097852, "category.accounts", "accounts", class11854.ACCOUNTS)}));
            }), class09778.N((class09991)((class09991)class09180.N_2))});
            class097844.y(class098092.N("avatar", (class09788)class09195.N_0, (Object)class118782));
        }), class09778.N((class09991)((class09991)class09180.N_3))}));
    }

    private static void N() {
    }
}

