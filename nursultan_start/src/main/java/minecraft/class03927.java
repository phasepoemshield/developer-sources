/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05369
 *  minecraft.class05946
 *  minecraft.class06637
 *  minecraft.class07536
 *  minecraft.class07789
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05369;
import minecraft.class05946;
import minecraft.class06637;
import minecraft.class07536;
import minecraft.class07789;
import minecraft.class08092;

public class class03927 {
    public static final class05946<class05369> N = class03927.N("armorer");
    public static final class05946<class05369> y = class03927.N("butcher");
    public static final class05946<class05369> L = class03927.N("cartographer");
    public static final class05946<class05369> u = class03927.N("cleric");
    public static final class05946<class05369> i = class03927.N("farmer");
    public static final class05946<class05369> R = class03927.N("fisherman");
    public static final class05946<class05369> M = class03927.N("fletcher");
    public static final class05946<class05369> B = class03927.N("leatherworker");
    public static final class05946<class05369> Z = class03927.N("librarian");
    public static final class05946<class05369> z = class03927.N("mason");
    public static final class05946<class05369> U = class03927.N("shepherd");
    public static final class05946<class05369> E = class03927.N("toolsmith");
    public static final class05946<class05369> W = class03927.N("weaponsmith");
    public static final class05946<class05369> m = class03927.N("home");
    public static final class05946<class05369> P = class03927.N("meeting");
    public static final class05946<class05369> s = class03927.N("beehive");
    public static final class05946<class05369> T = class03927.N("bee_nest");
    public static final class05946<class05369> b = class03927.N("nether_portal");
    public static final class05946<class05369> j = class03927.N("lodestone");
    public static final class05946<class05369> v = class03927.N("lightning_rod");
    public static final class05946<class05369> n = class03927.N("test_instance");
    private static final Set<class00500> t = (Set)ImmutableList.of((Object)class00869.yn, (Object)class00869.yt, (Object)class00869.yb, (Object)class00869.yj, (Object)class00869.ys, (Object)class00869.ym, (Object)class00869.yv, (Object)class00869.yz, (Object)class00869.yP, (Object)class00869.yE, (Object)class00869.yZ, (Object)class00869.yB, (Object[])new class00891[]{class00869.yW, class00869.yT, class00869.yM, class00869.yU}).stream().flatMap(class008912 -> class008912.E().N().stream()).filter(class005002 -> class005002.L((class08092)class07789.y) == class06637.field_12560).collect(ImmutableSet.toImmutableSet());
    private static final Set<class00500> G = (Set)ImmutableList.of((Object)class00869.MZ, (Object)class00869.MU, (Object)class00869.Mz, (Object)class00869.ME).stream().flatMap(class008912 -> class008912.E().N().stream()).collect(ImmutableSet.toImmutableSet());
    private static final Set<class00500> l = (Set)ImmutableList.of((Object)class00869.vq, (Object)class00869.vK, (Object)class00869.vV, (Object)class00869.ve, (Object)class00869.vH, (Object)class00869.vc, (Object)class00869.vX, (Object)class00869.va).stream().flatMap(class008912 -> class008912.E().N().stream()).collect(ImmutableSet.toImmutableSet());
    private static Map<class00500, class03556<class05369>> d = Maps.newHashMap();

    private static /* synthetic */ Stream L(class00891 class008912) {
        return class008912.E().N().stream();
    }

    private static /* synthetic */ Stream u(class00891 class008912) {
        return class008912.E().N().stream();
    }

    private static /* synthetic */ Stream y(class00891 class008912) {
        return class008912.E().N().stream();
    }

    public static boolean y(class00500 class005002) {
        return d.containsKey(class005002);
    }

    public static class05369 N(class00751<class05369> class007512) {
        class03927.N(class007512, N, class03927.N(class00869.Pf), 1, 1);
        class03927.N(class007512, y, class03927.N(class00869.PA), 1, 1);
        class03927.N(class007512, L, class03927.N(class00869.PC), 1, 1);
        class03927.N(class007512, u, class03927.N(class00869.MB), 1, 1);
        class03927.N(class007512, i, class03927.N(class00869.TL), 1, 1);
        class03927.N(class007512, R, class03927.N(class00869.PF), 1, 1);
        class03927.N(class007512, M, class03927.N(class00869.PS), 1, 1);
        class03927.N(class007512, B, G, 1, 1);
        class03927.N(class007512, Z, class03927.N(class00869.PD), 1, 1);
        class03927.N(class007512, z, class03927.N(class00869.Pr), 1, 1);
        class03927.N(class007512, U, class03927.N(class00869.Pp), 1, 1);
        class03927.N(class007512, E, class03927.N(class00869.Ph), 1, 1);
        class03927.N(class007512, W, class03927.N(class00869.Px), 1, 1);
        class03927.N(class007512, m, t, 1, 1);
        class03927.N(class007512, P, class03927.N(class00869.sN), 32, 6);
        class03927.N(class007512, s, class03927.N(class00869.TR), 0, 1);
        class03927.N(class007512, T, class03927.N(class00869.Ti), 0, 1);
        class03927.N(class007512, b, class03927.N(class00869.iq), 0, 1);
        class03927.N(class007512, j, class03927.N(class00869.TT), 0, 1);
        class03927.N(class007512, n, class03927.N(class00869.Ty), 0, 1);
        return class03927.N(class007512, v, l, 0, 1);
    }

    private static Set<class00500> N(class00891 class008912) {
        return ImmutableSet.copyOf((Collection)class008912.E().N());
    }

    private static class05946<class05369> N(String string) {
        return class05946.N((class05946)class04227.NZ, (class01894)class01894.y((String)string));
    }

    public static Optional<class03556<class05369>> N(class00500 class005002) {
        return Optional.ofNullable(d.get(class005002));
    }

    public static class05369 N(class00751<class05369> class007512, class05946<class05369> class059462, Set<class00500> set, int n, int n2) {
        class05369 class053692 = new class05369(set, n, n2);
        class00751.N(class007512, class059462, (Object)class053692);
        class03927.N((class03556<class05369>)class007512.y(class059462), set);
        return class053692;
    }

    private static void N(class03556<class05369> class035562, Set<class00500> set) {
        set.forEach(class005002 -> {
            if (d.put((class00500)class005002, class035562) != null) {
                throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", class005002)));
            }
        });
    }
}

