/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01096
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01235
 *  minecraft.class02484
 *  minecraft.class02708
 *  minecraft.class03556
 *  minecraft.class04835
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05970
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07027
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01096;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01235;
import minecraft.class02484;
import minecraft.class02708;
import minecraft.class03556;
import minecraft.class04835;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05970;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07027;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08036;
import minecraft.class08092;

public interface class04823 {
    public static final Map<String, class04835> N = new Object2ObjectArrayMap();
    public static final Codec<class04835> y = Codec.stringResolver(class04835::N, N::get);
    public static final class04835 L = class04823.N("empty");
    public static final class04835 u = class04823.N("water");
    public static final class04835 i = class04823.N("lava");
    public static final class04835 R = class04823.N("powder_snow");

    private static class07082 L(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842) {
        return class04823.N(class072992, class072092) ? class07082.L : class04823.N(class072992, class072092, class080362, class070502, class065842, (class00500)class00869.ME.W().y((class08092)class01096.M, (Comparable)Integer.valueOf(3)), class04909.uv);
    }

    private static class07082 i(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842) {
        class02708 class027082 = (class02708)class065842.a_(class02484.Nv, (Object)class02708.L);
        if (class027082.y().isEmpty()) {
            return class07082.R;
        }
        if (!class072992.method_8608()) {
            class06584 class065843 = class065842.L(1);
            class065843.N(class02484.Nv, (Object)class027082.N());
            class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843, (boolean)false));
            class080362.method_7281(class01235.NN);
            class01096.L((class00500)class005002, (class07299)class072992, (class07209)class072092);
        }
        return class07082.N;
    }

    private static class07082 u(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842) {
        if (!(class00891.N((class06581)class065842.B()) instanceof class07027)) {
            return class07082.R;
        }
        if (!class072992.method_8608()) {
            class06584 class065843 = class065842.N((class07310)class00869.Ee, 1);
            class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843, (boolean)false));
            class080362.method_7281(class01235.Ny);
            class01096.L((class00500)class005002, (class07299)class072992, (class07209)class072092);
        }
        return class07082.N;
    }

    private static class07082 y(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842) {
        return class04823.N(class072992, class072092) ? class07082.L : class04823.N(class072992, class072092, class080362, class070502, class065842, class00869.MU.W(), class04909.uj);
    }

    public static class04835 N(String string) {
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
        object2ObjectOpenHashMap.defaultReturnValue((class005002, class072992, class072092, class080362, class070502, class065842) -> class07082.R);
        class04835 class048352 = new class04835(string, (Map)object2ObjectOpenHashMap);
        N.put(string, class048352);
        return class048352;
    }

    public static class07082 N(class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842, class00500 class005002, class04891 class048912) {
        if (!class072992.method_8608()) {
            class06581 class065812 = class065842.B();
            class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)new class06584((class07310)class06570.jU)));
            class080362.method_7281(class01235.D);
            class080362.method_7259(class01235.L.y((Object)class065812));
            class072992.method_8501(class072092, class005002);
            class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
            class072992.N(null, (class03556)class01194.w, class072092);
        }
        return class07082.N;
    }

    public static class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842, class06584 class065843, Predicate<class00500> predicate, class04891 class048912) {
        if (!predicate.test(class005002)) {
            return class07082.R;
        }
        if (!class072992.method_8608()) {
            class06581 class065812 = class065842.B();
            class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843));
            class080362.method_7281(class01235.h);
            class080362.method_7259(class01235.L.y((Object)class065812));
            class072992.method_8501(class072092, class00869.MZ.W());
            class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
            class072992.N(null, (class03556)class01194.d, class072092);
        }
        return class07082.N;
    }

    public static void N(Map<class06581, class04823> map) {
        map.put(class06570.jW, class04823::y);
        map.put(class06570.jE, class04823::N);
        map.put(class06570.jm, class04823::L);
    }

    public static void N() {
        Map var0 = L.y();
        class04823.N(var0);
        var0.put(class06570.ns, (class005002, class072992, class072092, class080362, class070502, class065842) -> {
            class06517 class065172 = (class06517)class065842.method_58694(class02484.h);
            if (class065172 == null || !class065172.N(class06506.N)) {
                return class07082.R;
            }
            if (!class072992.method_8608()) {
                class06581 class065812 = class065842.B();
                class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)new class06584((class07310)class06570.nP)));
                class080362.method_7281(class01235.h);
                class080362.method_7259(class01235.L.y((Object)class065812));
                class072992.method_8501(class072092, class00869.Mz.W());
                class072992.method_8396(null, class072092, class04909.Lc, class04911.field_15245, 1.0f, 1.0f);
                class072992.N(null, (class03556)class01194.w, class072092);
            }
            return class07082.N;
        });
        Map var1 = u.y();
        class04823.N(var1);
        var1.put(class06570.jU, (class005003, class072992, class072092, class080362, class070502, class065842) -> class04823.N(class005003, class072992, class072092, class080362, class070502, class065842, new class06584((class07310)class06570.jE), class005002 -> (Integer)class005002.L((class08092)class01096.M) == 3, class04909.ut));
        var1.put(class06570.nP, (class005002, class072992, class072092, class080362, class070502, class065842) -> {
            if (!class072992.method_8608()) {
                class06581 class065812 = class065842.B();
                class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)class06517.N((class06581)class06570.ns, (class03556)class06506.N)));
                class080362.method_7281(class01235.h);
                class080362.method_7259(class01235.L.y((Object)class065812));
                class01096.L((class00500)class005002, (class07299)class072992, (class07209)class072092);
                class072992.method_8396(null, class072092, class04909.LX, class04911.field_15245, 1.0f, 1.0f);
                class072992.N(null, (class03556)class01194.d, class072092);
            }
            return class07082.N;
        });
        var1.put(class06570.ns, (class005002, class072992, class072092, class080362, class070502, class065842) -> {
            if ((Integer)class005002.L((class08092)class01096.M) == 3) {
                return class07082.R;
            }
            class06517 class065172 = (class06517)class065842.method_58694(class02484.h);
            if (class065172 == null || !class065172.N(class06506.N)) {
                return class07082.R;
            }
            if (!class072992.method_8608()) {
                class080362.method_6122(class070502, class05970.N((class06584)class065842, (class08036)class080362, (class06584)new class06584((class07310)class06570.nP)));
                class080362.method_7281(class01235.h);
                class080362.method_7259(class01235.L.y((Object)class065842.B()));
                class072992.method_8501(class072092, (class00500)class005002.N((class08092)class01096.M));
                class072992.method_8396(null, class072092, class04909.Lc, class04911.field_15245, 1.0f, 1.0f);
                class072992.N(null, (class03556)class01194.w, class072092);
            }
            return class07082.N;
        });
        var1.put(class06570.bB, class04823::R);
        var1.put(class06570.bM, class04823::R);
        var1.put(class06570.bR, class04823::R);
        var1.put(class06570.bi, class04823::R);
        var1.put(class06570.Gh, class04823::R);
        var1.put(class06570.sA, class04823::R);
        var1.put(class06570.li, class04823::i);
        var1.put(class06570.lE, class04823::i);
        var1.put(class06570.lv, class04823::i);
        var1.put(class06570.ls, class04823::i);
        var1.put(class06570.lT, class04823::i);
        var1.put(class06570.lm, class04823::i);
        var1.put(class06570.lb, class04823::i);
        var1.put(class06570.lB, class04823::i);
        var1.put(class06570.lW, class04823::i);
        var1.put(class06570.lz, class04823::i);
        var1.put(class06570.lM, class04823::i);
        var1.put(class06570.lR, class04823::i);
        var1.put(class06570.lU, class04823::i);
        var1.put(class06570.lP, class04823::i);
        var1.put(class06570.lj, class04823::i);
        var1.put(class06570.lZ, class04823::i);
        var1.put(class06570.zx, class04823::u);
        var1.put(class06570.Uu, class04823::u);
        var1.put(class06570.UE, class04823::u);
        var1.put(class06570.UB, class04823::u);
        var1.put(class06570.UZ, class04823::u);
        var1.put(class06570.UR, class04823::u);
        var1.put(class06570.Uz, class04823::u);
        var1.put(class06570.zr, class04823::u);
        var1.put(class06570.Ui, class04823::u);
        var1.put(class06570.Uy, class04823::u);
        var1.put(class06570.zh, class04823::u);
        var1.put(class06570.zD, class04823::u);
        var1.put(class06570.UL, class04823::u);
        var1.put(class06570.UM, class04823::u);
        var1.put(class06570.UU, class04823::u);
        var1.put(class06570.UN, class04823::u);
        Map var2 = i.y();
        var2.put(class06570.jU, (class005003, class072992, class072092, class080362, class070502, class065842) -> class04823.N(class005003, class072992, class072092, class080362, class070502, class065842, new class06584((class07310)class06570.jW), class005002 -> true, class04909.ud));
        class04823.N(var2);
        Map var3 = R.y();
        var3.put(class06570.jU, (class005003, class072992, class072092, class080362, class070502, class065842) -> class04823.N(class005003, class072992, class072092, class080362, class070502, class065842, new class06584((class07310)class06570.jm), class005002 -> (Integer)class005002.L((class08092)class01096.M) == 3, class04909.uw));
        class04823.N(var3);
    }

    private static boolean N(class07299 class072992, class07209 class072092) {
        return class072992.method_8316(class072092.method_10084()).N(class01231.N);
    }

    private static class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842) {
        return class04823.N(class072992, class072092, class080362, class070502, class065842, (class00500)class00869.Mz.W().y((class08092)class01096.M, (Comparable)Integer.valueOf(3)), class04909.us);
    }

    private static class07082 R(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06584 class065842) {
        if (!class065842.N(class01226.Lz)) {
            return class07082.R;
        }
        if (!class065842.L(class02484.F)) {
            return class07082.R;
        }
        if (!class072992.method_8608()) {
            class065842.y(class02484.F);
            class080362.method_7281(class01235.r);
            class01096.L((class00500)class005002, (class07299)class072992, (class07209)class072092);
        }
        return class07082.N;
    }

    public class07082 interact(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class07050 var5, class06584 var6);
}

