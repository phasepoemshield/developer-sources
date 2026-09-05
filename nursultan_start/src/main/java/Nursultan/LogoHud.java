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
 *  Nursultan.class09666
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
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11300
 *  Nursultan.class11472
 *  Nursultan.class11616
 *  Nursultan.class11756
 *  Nursultan.class11761
 *  Nursultan.class11769
 *  Nursultan.class11902
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.Logo;
import Nursultan.class09079;
import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09666;
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
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11300;
import Nursultan.class11472;
import Nursultan.class11616;
import Nursultan.class11756;
import Nursultan.class11761;
import Nursultan.class11769;
import Nursultan.class11902;
import Nursultan.class11910;
import Nursultan.class11938;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import minecraft.class04453;
import minecraft.class06202;

@class11761(u="logo", i=10.0f, N=10.0f, y=class11616.NONE)
public class LogoHud
extends class11769 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
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
    public static Object L_4;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;

    private static String w() {
        String string = ((class11472)class11938.L_2).Z();
        return string == null ? "" : string;
    }

    private static class09798 L(Logo logo, class09211 class092112) {
        return class09778.N((class09991)((class09991)u_1), (T class097842) -> {
            class097842.N("logoBottomPill");
            boolean[] blArray = new boolean[]{false};
            if (logo.j().U()) {
                LogoHud.N(class097842, class092112);
                blArray[0] = true;
            }
            if (logo.P().U()) {
                if (blArray[0]) {
                    LogoHud.N(class097842, "logoDivAfterCoords");
                }
                LogoHud.N(class097842, "logoItemBps", "bps", LogoHud.O(), "bps", class092112);
                blArray[0] = true;
            }
            if (logo.n().U()) {
                if (blArray[0]) {
                    LogoHud.N(class097842, "logoDivAfterBps");
                }
                LogoHud.N(class097842, "logoItemTps", "tps", Float.toString(class11938.U().y()), "tps", class092112);
            }
        });
    }

    public LogoHud() {
        super(LogoHud::N);
    }

    static {
        LogoHud.G();
        L_0 = class06202.Nq();
        L_1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        N_2 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.COLUMN).B(8.0f);
        N_3 = class09991.N((class09991[])new class09991[]{(class09991)N_2, class09991.N().N(class09973.END)});
        u_0 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW).B(8.0f).y(class09973.CENTER);
        class09991 class099912 = class09991.N().N(class09962.N());
        u_1 = class09991.N((class09991[])new class09991[]{(class09991)class11756.y_1, class099912.y(class09962.y((float)37.0f)).N(class09975.ROW).y(class09973.CENTER)});
        u_2 = class09991.N().N(class09962.N()).y(class09962.y((float)37.0f)).N(class09975.ROW).y(10.0f).B(4.0f).y(class09973.CENTER).N(class09983.BORDER_BOX);
        y_0 = class09991.N().N(class09962.y((float)37.0f)).y(class09962.y((float)37.0f)).N(class09973.CENTER).y(class09973.CENTER).u(1.0f).N(class09983.BORDER_BOX);
        y_1 = class09227.N((T class092112) -> class09991.N().u(16.0f, 16.0f).i(class092112.M()));
        y_2 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW).y(class09973.CENTER);
        y_3 = class09991.N((class09991[])new class09991[]{(class09991)y_2, class09991.N().u(4.0f)});
        class09991 class099913 = class09991.N();
        y_4 = class09991.N((class09991[])new class09991[]{class099913.i(((Integer)class09181.N_0).intValue()), class09221.N((int)14, (class09079)class09079.MEDIUM)});
        class09991 class099914 = class09991.N();
        y_5 = class09991.N((class09991[])new class09991[]{class099914.i(class11300.L((int)-1, (float)72.0f)), class09221.N((int)14, (class09079)class09079.MEDIUM)});
    }

    private static int b() {
        if ((class04453)((class06202)LogoHud.L_0).T_4 == null) {
            return 0;
        }
        return Math.round(class11902.N() * 10.0f);
    }

    private static boolean t() {
        Logo logo = class11938.u().Nj();
        return logo.T().i() == logo.m();
    }

    public class09991 z() {
        if (!LogoHud.t()) {
            return class09991.N;
        }
        return class09991.N().N(class09666.N((float)(LogoHud.B() - 20.0f), (float)-100.0f));
    }

    private static boolean u(Logo logo) {
        return logo.j().U() || logo.P().U() || logo.n().U();
    }

    private static String y(int n) {
        return Integer.toString(LogoHud.N(n));
    }

    public boolean y() {
        return class11938.u().Nj().U();
    }

    private static boolean y(Logo logo) {
        return logo.t().U() || logo.s().U() || logo.b().U() || logo.v().U();
    }

    private static class09798 y(Logo logo, class09211 class092112) {
        return class09778.N((class09991)((class09991)u_0), (T class097842) -> {
            class097842.N("logoTopRow");
            class097842.y(LogoHud.y(class092112));
            if (LogoHud.y(logo)) {
                class097842.y(LogoHud.N(logo, class092112));
            }
        });
    }

    private static class09798 y(class09211 class092112) {
        return class09778.N((class09991)((class09991)u_1), (T class097844) -> {
            class097844.N("logoPill");
            class097844.N_3((class09991)y_0, class097842 -> {
                class097842.N("logoPillIconItem");
                class097842.L((T class097772) -> ((class09777)class097772.N("logoPillIcon")).L("icon:hud/nursultan").N(((class09227)y_1).N(class092112)));
            });
            LogoHud.N(class097844, "logoPillDivider");
            class097844.N_3((class09991)u_2, class097843 -> {
                class097843.N("logoPillTextItem");
                class097843.N_3((class09991)y_2, class097842 -> {
                    class097842.N("logoPillText");
                    class097842.y((T class098012) -> ((class09801)class098012.N("logoPillText-value")).L("Nursultan").N((class09991)y_4));
                });
            });
        });
    }

    private static void N(class09784 class097843, String string) {
        class097843.N((T class097842) -> ((class09784)class097842.N(string)).N((class09991)class09180.N_3));
    }

    private static void N(class09784 class097843, String string, String string2, String string3, boolean bl) {
        class09991 class099912 = bl ? (class09991)y_3 : (class09991)y_2;
        class097843.N_3(class099912, class097842 -> {
            class097842.N(string);
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-label")).L(string2).N((class09991)y_5));
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-value")).L(string3).N((class09991)y_4));
        });
    }

    private static int N(int n) {
        if ((class04453)((class06202)LogoHud.L_0).T_4 == null) {
            return 0;
        }
        return (int)Math.floor(switch (n) {
            case 0 -> ((class04453)((class06202)LogoHud.L_0).T_4).method_23317();
            case 1 -> ((class04453)((class06202)LogoHud.L_0).T_4).method_23318();
            default -> ((class04453)((class06202)LogoHud.L_0).T_4).method_23321();
        });
    }

    private static class09798 N(Logo logo, class09211 class092112) {
        return class09778.N((class09991)((class09991)u_1), (T class097842) -> {
            class097842.N("logoDetailsPill");
            boolean[] blArray = new boolean[]{false};
            if (logo.t().U()) {
                LogoHud.N(class097842, "logoItemLogin", "player", LogoHud.w(), null, class092112);
                blArray[0] = true;
            }
            if (logo.s().U()) {
                if (blArray[0]) {
                    LogoHud.N(class097842, "logoDivAfterLogin");
                }
                LogoHud.N(class097842, "logoItemFps", "fps", Integer.toString(((class06202)L_0).Nx()), "fps", class092112);
                blArray[0] = true;
            }
            if (logo.b().U()) {
                if (blArray[0]) {
                    LogoHud.N(class097842, "logoDivAfterFps");
                }
                LogoHud.N(class097842, "logoItemPing", "ping", Integer.toString(class11910.u()), "ms", class092112);
                blArray[0] = true;
            }
            if (logo.v().U()) {
                if (blArray[0]) {
                    LogoHud.N(class097842, "logoDivAfterPing");
                }
                LogoHud.N(class097842, "logoItemTime", "time", LocalTime.now().format((DateTimeFormatter)L_1), null, class092112);
            }
        });
    }

    private static void N(class09784 class097842, String string, String string2, String string3, String string4, class09211 class092112) {
        class097842.N_3((class09991)u_2, class097843 -> {
            class097843.N(string);
            class097843.L((T class097772) -> ((class09777)class097772.N(string + "-icon")).L("icon:hud/" + string2).N(((class09227)y_1).N(class092112)));
            class097843.N_3((class09991)y_2, class097842 -> {
                class097842.N(string + "-text");
                class097842.y((T class098012) -> ((class09801)class098012.N(string + "-value")).L(string3).N((class09991)y_4));
                if (string4 != null) {
                    class097842.y((T class098012) -> ((class09801)class098012.N(string + "-suffix")).L(string4).N((class09991)y_5));
                }
            });
        });
    }

    private static void N(class09784 class097842, class09211 class092112) {
        String string = "logoItemCoords";
        class097842.N_3((class09991)u_2, class097843 -> {
            class097843.N(string);
            class097843.L((T class097772) -> ((class09777)class097772.N(string + "-icon")).L("icon:hud/coordinates").N(((class09227)y_1).N(class092112)));
            class097843.N_3((class09991)y_2, class097842 -> {
                class097842.N(string + "-text");
                LogoHud.N(class097842, string + "-x", "x", LogoHud.y(0), false);
                LogoHud.N(class097842, string + "-y", "y", LogoHud.y(1), true);
                LogoHud.N(class097842, string + "-z", "z", LogoHud.y(2), true);
            });
        });
    }

    private static class09798 N(Void void_, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        Logo logo = class11938.u().Nj();
        class098092.L("logoSelection", () -> LogoHud.N(logo));
        class098092.L("logoX", () -> LogoHud.N(0));
        class098092.L("logoY", () -> LogoHud.N(1));
        class098092.L("logoZ", () -> LogoHud.N(2));
        class098092.L("logoMotion", LogoHud::b);
        class098092.L("logoFps", () -> ((class06202)((class06202)L_0)).Nx());
        class098092.L("logoPing", class11910::u);
        class098092.L("logoTime", () -> LocalTime.now().toSecondOfDay());
        class098092.L("logoAlign", LogoHud::t);
        return class09778.N((class09991)(LogoHud.t() ? (class09991)N_3 : (class09991)N_2), (T class097842) -> {
            class097842.N("logoRoot");
            class097842.y(LogoHud.y(logo, class092112));
            if (LogoHud.u(logo)) {
                class097842.y(LogoHud.L(logo, class092112));
            }
        });
    }

    private static int N(Logo logo) {
        int n = 0;
        if (logo.t().U()) {
            n |= 1;
        }
        if (logo.s().U()) {
            n |= 2;
        }
        if (logo.b().U()) {
            n |= 4;
        }
        if (logo.v().U()) {
            n |= 8;
        }
        if (logo.j().U()) {
            n |= 0x10;
        }
        if (logo.P().U()) {
            n |= 0x20;
        }
        if (logo.n().U()) {
            n |= 0x40;
        }
        return n;
    }

    private static String O() {
        if ((class04453)((class06202)LogoHud.L_0).T_4 == null) {
            return "0.0";
        }
        return String.format(Locale.ROOT, "%.1f", Float.valueOf(class11902.N()));
    }

    private static void G() {
        L_0 = null;
        L_1 = null;
        L_2 = 8;
        L_3 = 4;
        L_4 = 16;
        N_0 = 10;
        N_1 = 37;
        N_2 = null;
        N_3 = null;
        u_0 = null;
        u_1 = null;
        u_2 = null;
        y_0 = null;
        y_1 = null;
        y_2 = null;
        y_3 = null;
        y_4 = null;
        y_5 = null;
    }
}

