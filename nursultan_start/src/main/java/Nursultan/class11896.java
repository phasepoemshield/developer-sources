/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11328
 *  Nursultan.class11929
 *  Nursultan.class11933
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02536
 *  minecraft.class02710
 *  minecraft.class02833
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class05298
 *  minecraft.class05316
 *  minecraft.class05320
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07304
 *  minecraft.class07314
 *  org.apache.commons.lang3.mutable.MutableFloat
 */
package Nursultan;

import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11328;
import Nursultan.class11929;
import Nursultan.class11933;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Comparator;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02536;
import minecraft.class02710;
import minecraft.class02833;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class05316;
import minecraft.class05320;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07304;
import minecraft.class07314;
import org.apache.commons.lang3.mutable.MutableFloat;

public class class11896 {
    public static Object[] N;
    private static double[] L;
    private static String[] i;
    private static byte[] M;

    private static void L() {
        M = new byte[1];
        class11896.M[0] = 2;
    }

    private class11896() {
        throw new UnsupportedOperationException(i[0]);
    }

    static {
        class11896.L();
        class11896.R();
        class11896.N();
        class11896.i();
        class11896.y();
        class11896.N[0] = class06202.Nq();
        class11896.N[1] = new class05320(class05316.N((class07078)class07078.Ly));
    }

    private static void i() {
        i = new String[1];
        class11896.i[0] = "This is a utility class and cannot be instantiated";
    }

    private static void y() {
        N = new Object[M[0]];
    }

    public static Optional<class11297> N(class11933 class119332) {
        Optional<class11297> var1 = class11281.L((class11328)class119332.u()).sorted(Comparator.comparingDouble(object -> ((class11297)object).N().P() - ((class11297)object).N().s()).thenComparingDouble(object -> -class11896.N(((class11297)object).N(), class119332.y())).thenComparingDouble(object -> -class11929.N((class06584)((class11297)object).N(), (class05946)class07314.G))).max(Comparator.comparingDouble(class112972 -> class11896.N(class119332.y(), class112972.N())));
        if (var1.isEmpty()) {
            return var1;
        }
        if (class119332 != class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_0 && class11896.N(class119332, var1.get().N())) {
            return Optional.empty();
        }
        return var1;
    }

    public static boolean N(class11933 class119332, class06584 class065842) {
        return class11896.N(class119332.y(), ((class04453)((class06202)class11896.N[0]).T_4).method_6118(class119332.y())) >= class11896.N(class119332.y(), class065842);
    }

    private static void N() {
    }

    private static double N(class07085 class070852, class06584 class065842) {
        if (class065842.R()) {
            return L[2];
        }
        MutableFloat mutableFloat = new MutableFloat(0.0f);
        for (Object2IntMap.Entry entry : ((class02710)class065842.a_(class02484.P, (Object)class02710.N)).y()) {
            ((class07304)((class03556)entry.getKey()).N()).N(class02523.L).forEach(class029442 -> mutableFloat.setValue(((class02536)class029442.N()).N(entry.getIntValue(), ((class04453)((class06202)class11896.N[0]).T_4).method_59922(), mutableFloat.floatValue())));
        }
        ((class02833)class065842.a_(class02484.b, (Object)class02833.N)).y().stream().filter(class028242 -> (class028242.N() == class05298.y || class028242.N() == class05298.L) && class028242.L().y(class070852)).map(class028242 -> class028242.y().y()).forEach(arg_0 -> ((MutableFloat)mutableFloat).add(arg_0));
        return mutableFloat.doubleValue();
    }

    private static double N(class06584 class065842, class07085 class070852) {
        if (class065842.L(class02484.b)) {
            return ((class02833)class065842.method_58694(class02484.b)).y().stream().filter(class028242 -> class028242.L().y(class070852)).mapToDouble(class028242 -> ((class05320)N[1]).L(class028242.N())).max().orElse(L[0]);
        }
        return L[1];
    }

    private static void R() {
        L = new double[3];
        class11896.L[0] = Double.longBitsToDouble(0L);
        class11896.L[1] = Double.longBitsToDouble(0L);
        class11896.L[2] = Double.longBitsToDouble(0L);
    }
}

