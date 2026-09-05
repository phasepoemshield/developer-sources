/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02695
 *  minecraft.class02837
 *  minecraft.class02848
 *  minecraft.class02854
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04453
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06517
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06918
 *  minecraft.class07027
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07085
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class08209
 *  minecraft.class08725
 */
package Nursultan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02695;
import minecraft.class02837;
import minecraft.class02848;
import minecraft.class02854;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06517;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06918;
import minecraft.class07027;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07085;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class08209;
import minecraft.class08725;

public class class11929 {
    private static String[] y;
    public static Object N_0;

    public static List<class00392> L(class06584 class065842) {
        class02848 class028482 = (class02848)class065842.y().method_58694(class02484.W);
        if (class028482 == null) {
            return Collections.emptyList();
        }
        return class028482.N().stream().filter(class003922 -> !class003922.getString().isBlank()).toList();
    }

    private static void L() {
    }

    public static float M(class06584 class065842) {
        return (float)(class065842.s() - class065842.P()) / (float)class065842.s() * 100.0f;
    }

    private class11929() {
        throw new UnsupportedOperationException(y[0]);
    }

    static {
        class11929.N();
        class11929.u();
        class11929.L();
        N_0 = class06202.Nq();
    }

    public static class06517 B(class06584 class065842) {
        return (class06517)class065842.a_(class02484.h, (Object)class06517.N);
    }

    public static int Z(class06584 class065842) {
        int n = 1;
        n = class11929.N(n, class04206.B.N((Object)class065842.B()));
        n = class11929.N(n, class11929.N((Object)(class065842.w() != null ? class065842.w().getString() : (!class065842.k().getString().isEmpty() ? class065842.k().getString() : class065842.B().z()))));
        return n;
    }

    public static List<class06584> i(class06584 class065842) {
        if (!class11929.y(class065842)) {
            return Collections.emptyList();
        }
        class02854 class028542 = (class02854)class065842.y().method_58694(class02484.NG);
        if (class028542 == null) {
            return Collections.emptyList();
        }
        if (class028542.y().allMatch(class06584::R)) {
            return Collections.emptyList();
        }
        return class028542.y().toList();
    }

    public static boolean U(class06584 class065842) {
        return class065842.B().R().N(class02484.d);
    }

    public static int z(class06584 class065842) {
        class08209 class082092 = (class08209)class065842.method_58694(class02484.w);
        return class082092 != null ? class082092.N() : 0;
    }

    public static boolean u(class06584 class065842) {
        return class065842.y().N(class02484.O) || class065842.y().N(class02484.g);
    }

    private static void u() {
        y = new String[1];
        class11929.y[0] = "This is a utility class and cannot be instantiated";
    }

    public static boolean y(class06584 class065842) {
        class06581 class065812 = class065842.B();
        return class065812 instanceof class06918 && ((class06918)class065812).L() instanceof class07027;
    }

    public static List<String> E(class06584 class065842) {
        class02848 class028482 = (class02848)class065842.y().method_58694(class02484.W);
        if (class028482 == null) {
            return Collections.emptyList();
        }
        return class028482.N().stream().map(class00392::getString).filter(string -> !string.isBlank()).toList();
    }

    public static int N(class06584 class065842, class05946<class07304> class059462) {
        class03556<class07304> var2 = class11929.N(class059462);
        if (var2 == null) {
            return 0;
        }
        return class07323.N(var2, (class06584)class065842);
    }

    public static class03556<class07304> N(class05946<class07304> class059462) {
        return ((class04453)((class06202)class11929.N_0).T_4).method_56673().L(class04227.yR).N(class059462).orElse(null);
    }

    public static boolean N(class06584 class065842, class07085 class070852) {
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        return class087252 != null && class087252.y() == class070852;
    }

    @SafeVarargs
    public static boolean N(class06584 class065842, class03556<class07084> ... class03556Array) {
        class06517 class065172 = class11929.B(class065842);
        return Arrays.stream(class03556Array).allMatch(class035562 -> {
            Iterator var2 = class065172.N().iterator();
            while (var2.hasNext()) {
                if (!((class07055)var2.next()).L().N(class035562)) continue;
                return true;
            }
            return false;
        });
    }

    private static void N() {
    }

    private static int N(int n, int n2) {
        return n * 31 + n2;
    }

    public static int N(class06584 class065842) {
        if (class065842.R()) {
            return 0;
        }
        float f = 0.0f;
        if ((class04453)((class06202)class11929.N_0).T_4 != null) {
            f = ((class04453)((class06202)class11929.N_0).T_4).method_7357().N(class065842, 0.0f);
        }
        int n = class11929.R(class065842);
        n = class11929.N(n, class065842.c());
        n = class11929.N(n, Float.floatToIntBits(f));
        n = class11929.N(n, class065842.P());
        return n;
    }

    private static int N(Object object) {
        return object == null ? 0 : object.hashCode();
    }

    public static boolean N(class06584 class065842, String string) {
        if (class065842.R()) {
            return false;
        }
        class02837 class028372 = (class02837)class065842.y().method_58694(class02484.y);
        if (class028372 == null) {
            return false;
        }
        return class028372.y().y(string);
    }

    public static class00891 N(String string) {
        return (class00891)class04206.i.N(class01894.y((String)string));
    }

    public static int R(class06584 class065842) {
        class02695 class026952 = class065842.y();
        int n = 1;
        n = class11929.N(n, class04206.B.N((Object)class065842.B()));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.E)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.j)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.F)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.Nn)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.y)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.Nv)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.Nu)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.Nt)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.h)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.Nb)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.f)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.C)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.S)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.A)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.NZ)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.NP)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.x)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.D)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.Ns)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.NR)));
        n = class11929.N(n, class11929.N(class026952.method_58694(class02484.NM)));
        n = class11929.N(n, class11929.N(class065842.Q() ? 1 : 0));
        return n;
    }
}

