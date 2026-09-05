/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09180
 *  Nursultan.class09666
 *  Nursultan.class09692
 *  Nursultan.class09693
 *  Nursultan.class09728
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09976
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11300
 *  Nursultan.class11616
 *  Nursultan.class11644
 *  Nursultan.class11753
 *  Nursultan.class11756
 *  Nursultan.class11761
 *  Nursultan.class11766
 *  Nursultan.class11769
 *  Nursultan.class11834
 *  Nursultan.class11845
 *  Nursultan.class11849
 *  Nursultan.class11857
 *  Nursultan.class11863
 *  Nursultan.class11868
 *  Nursultan.class11875
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class09180;
import Nursultan.class09666;
import Nursultan.class09692;
import Nursultan.class09693;
import Nursultan.class09728;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11300;
import Nursultan.class11616;
import Nursultan.class11644;
import Nursultan.class11753;
import Nursultan.class11756;
import Nursultan.class11761;
import Nursultan.class11766;
import Nursultan.class11769;
import Nursultan.class11834;
import Nursultan.class11845;
import Nursultan.class11849;
import Nursultan.class11857;
import Nursultan.class11863;
import Nursultan.class11868;
import Nursultan.class11875;
import Nursultan.class11938;
import Nursultan.class12020;
import java.util.List;
import org.joml.Vector2f;

@class11761(u="notify", i=0.0f, N=200.0f, y=class11616.VERTICAL)
public class NotifyHud
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
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;
    public static Object u_4;
    public static Object u_5;

    public NotifyHud() {
        super(NotifyHud::N);
    }

    static {
        NotifyHud.d();
        N_6 = class11300.L((int)0xFFFFFF, (float)12.0f);
        N_7 = class09991.N().N(class09975.COLUMN).N(class09973.CENTER).y(class09962.N()).L(true);
        y_0 = class09991.N().N(class09962.N()).y(class09962.N((float)0.0f, (float)64.0f)).M(8.0f).N(class09692.N((class09994[])new class09994[]{class09994.W((class09743)((class09743)class11644.N_0)), class09994.M((class09743)((class09743)class11644.N_0)), class09994.s((class09743)((class09743)class11644.N_0))})).N(class099912 -> class099912.y(class09962.N((float)0.0f, (float)0.0f)).M(0.0f).l(0.0f)).y(class099912 -> class099912.y(class09962.N((float)0.0f, (float)0.0f)).M(0.0f).l(0.0f));
        y_1 = class09991.N((class09991[])new class09991[]{(class09991)y_0, class09991.N().M(0.0f)});
        class09991 class099913 = class09991.N();
        u_0 = class09991.N((class09991[])new class09991[]{(class09991)y_0, class099913.y(class09962.N((float)0.0f, (float)0.0f)).M(0.0f).l(0.0f)});
        class09991 class099914 = class09991.N().N(class09962.N());
        u_1 = class09991.N((class09991[])new class09991[]{(class09991)class11756.y_1, class099914.y(class09962.N()).N(class09975.ROW).y(class09973.CENTER).B(9.0f).y(10.0f)});
        u_2 = class09991.N().N(class09962.N()).y(class09962.N()).L(10.0f).y(class09973.CENTER);
        u_3 = class09991.N((class09991[])new class09991[]{(class09991)u_2, class09991.N().N(class09976.SELF)});
        u_4 = class09991.N().N(class09962.N()).y(class09962.y((float)0.0f, (float)Float.POSITIVE_INFINITY)).L(10.0f).N(class09983.BORDER_BOX);
        u_5 = class09991.N().N(class09962.y((float)4.0f)).y(class09962.N((float)100.0f)).Z(999.0f).N(class09976.SELF).y(((Integer)N_6).intValue());
        L_0 = class11863.N();
        L_1 = class09991.N().R().Z(999.0f).N(class09692.N((class09994[])new class09994[]{class09994.Z((class09743)((class09743)L_0))}));
        L_3 = List.of(new class11875(() -> true), new class11875(() -> false));
        L_4 = -1;
    }

    private static void d() {
        N_0 = Float.valueOf(0.6f);
        N_1 = 10;
        N_2 = 8;
        N_3 = 9;
        N_4 = 64;
        N_5 = Float.valueOf(4.0f);
        N_6 = 0x1FFFFFFF;
        N_7 = null;
        y_0 = null;
        y_1 = null;
        u_0 = null;
        u_1 = null;
        u_2 = null;
        u_3 = null;
        u_4 = null;
        u_5 = null;
        L_0 = null;
        L_1 = null;
        L_2 = 5000L;
        L_3 = null;
        L_4 = -1;
        L_5 = null;
    }

    private static boolean k() {
        return class11938.g().N().stream().anyMatch(class11834::W);
    }

    public Vector2f U() {
        return new Vector2f(0.0f, NotifyHud.u() * 0.72f);
    }

    public class09991 z() {
        return class09991.N().N(class09666.N((float)(NotifyHud.B() / 2.0f), (float)-50.0f));
    }

    private static class11834 u(int n) {
        if ((class11834)L_5 == null || (Integer)L_4 != n || !((class11834)L_5).E()) {
            L_4 = n;
            long l = System.currentTimeMillis();
            long l2 = l - l % 5000L + 5000L;
            L_5 = class11938.g().i().y().N((class11849)((List)L_3).get(n)).N((class11868)new class11857(class12020.N((String)"hud.example.notify"))).N(5000L).i().N(l2);
        }
        return (class11834)L_5;
    }

    public boolean y() {
        return class11938.u().Nv().U() || NotifyHud.k();
    }

    private static class09666 N(class11834 class118342) {
        long l = class118342.M();
        if (l <= 0L) {
            return class09666.N;
        }
        float f = class09693.N((float)((float)(class118342.Z() - System.currentTimeMillis()) / (float)l));
        return class09666.y((float)((1.0f - f) * 100.0f));
    }

    private static /* synthetic */ void N(List list, int n, class09809 class098092, class09784 class097842) {
        class097842.N("notifyStack");
        for (int i = list.size() - 1; i >= 0; --i) {
            class097842.y(NotifyHud.N((class11834)list.get(i), i == n, class098092));
        }
    }

    private static class09798 N(class11834 class118342, boolean bl, class09809 class098092) {
        String string = "notify-" + class118342.N();
        return class09778.N((class09991)(class118342.E() ? (bl ? (class09991)y_1 : (class09991)y_0) : (class09991)u_0), class097842 -> {
            class097842.N(string);
            class097842.N_3((class09991)u_1, class097843 -> {
                class11868 class118682;
                class097843.N(string + "-card");
                class11849 class118492 = class118342.L();
                if (class118492 != null) {
                    class097843.N_3((class09991)u_2, class097842_2 -> {
                        class097842_2.N(string + "-thumbnail");
                        class097842_2.y(class118492.N(class098092, class118342));
                    });
                    class097843.N(class097842_3 -> ((class09784)class097842_3.N(string + "-divider")).N((class09991)class09180.N_3));
                }
                if ((class118682 = class118342.y()) != null) {
                    class09991 class099912 = class11756.N((class09991)((class09991)u_3), (float)class118682.N(), (float)0.0f, (class09743)((class09728)class11644.N_0));
                    class097843.N_3(class099912, class097842_4 -> {
                        class097842_4.N(string + "-content");
                        class097842_4.y(class118682.N(class098092, class118342));
                    });
                }
                if (class118342.M() > 0L) {
                    class097843.y(NotifyHud.N(string, class118342));
                }
            });
        });
    }

    private static class09798 N(Void void_, class09809 class098092) {
        class11845 class118452 = class11938.g();
        class098092.L("notifyRevision", () -> ((class11845)class118452).y());
        class098092.u("notifyTicker", class11766::new);
        List<class11834> var3 = class118452.N();
        List<class11834> list = class11938.u().Nv().U() ? var3 : var3.stream().filter(class11834::W).toList();
        List<class11834> var4_4 = list.isEmpty() && class11753.y() ? List.of(NotifyHud.u((Integer)class098092.L("notifyExampleStage", NotifyHud::G))) : list;
        int n2 = -1;
        for (int i = 0; i < var4_4.size(); ++i) {
            if (!((class11834)var4_4.get(i)).E()) continue;
            n2 = i;
            break;
        }
        int finalN = n2;
        return class09778.N((class09991)((class09991)N_7), arg_0 -> NotifyHud.N((List)var4_4, finalN, class098092, arg_0));
    }

    private static class09798 N(String string, class11834 class118342) {
        class11874 type = class118342.B();
        int color = type != null ? type.color() : 0xFF29B6F6;
        class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)L_1, class09991.N().y(color).y(NotifyHud.N(class118342))});
        return class09778.N((class09991)((class09991)u_4), class097842 -> {
            class097842.N(string + "-timeZone");
            class097842.N_3((class09991)u_5, class097843 -> {
                class097843.N(string + "-timeTrack");
                class097843.N(class097842_5 -> ((class09784)class097842_5.N(string + "-timeFill")).N(class099912));
            });
        });
    }

    public boolean N() {
        return !class11938.g().N().isEmpty() || class11753.y();
    }

    private static int G() {
        return (int)(System.currentTimeMillis() / 5000L % (long)((List)L_3).size());
    }
}

