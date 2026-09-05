/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02246
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class06581
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02246;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class06581;
import org.jspecify.annotations.Nullable;

public class class01944 {
    public static final class05946<class02246> N = class01944.N("blank");
    public static final class05946<class02246> y = class01944.N("angler");
    public static final class05946<class02246> L = class01944.N("archer");
    public static final class05946<class02246> u = class01944.N("arms_up");
    public static final class05946<class02246> i = class01944.N("blade");
    public static final class05946<class02246> R = class01944.N("brewer");
    public static final class05946<class02246> M = class01944.N("burn");
    public static final class05946<class02246> B = class01944.N("danger");
    public static final class05946<class02246> Z = class01944.N("explorer");
    public static final class05946<class02246> z = class01944.N("flow");
    public static final class05946<class02246> U = class01944.N("friend");
    public static final class05946<class02246> E = class01944.N("guster");
    public static final class05946<class02246> W = class01944.N("heart");
    public static final class05946<class02246> m = class01944.N("heartbreak");
    public static final class05946<class02246> P = class01944.N("howl");
    public static final class05946<class02246> s = class01944.N("miner");
    public static final class05946<class02246> T = class01944.N("mourner");
    public static final class05946<class02246> b = class01944.N("plenty");
    public static final class05946<class02246> j = class01944.N("prize");
    public static final class05946<class02246> v = class01944.N("scrape");
    public static final class05946<class02246> n = class01944.N("sheaf");
    public static final class05946<class02246> t = class01944.N("shelter");
    public static final class05946<class02246> G = class01944.N("skull");
    public static final class05946<class02246> l = class01944.N("snort");
    private static final Map<class06581, class05946<class02246>> d = Map.ofEntries(Map.entry(class06570.jl, N), Map.entry(class06570.kn, y), Map.entry(class06570.kt, L), Map.entry(class06570.kG, u), Map.entry(class06570.kl, i), Map.entry(class06570.kd, R), Map.entry(class06570.kw, M), Map.entry(class06570.kk, B), Map.entry(class06570.kY, Z), Map.entry(class06570.kQ, z), Map.entry(class06570.kO, U), Map.entry(class06570.kg, E), Map.entry(class06570.kI, W), Map.entry(class06570.kJ, m), Map.entry(class06570.ko, P), Map.entry(class06570.kq, s), Map.entry(class06570.kK, T), Map.entry(class06570.kV, b), Map.entry(class06570.ke, j), Map.entry(class06570.kH, v), Map.entry(class06570.kc, n), Map.entry(class06570.kX, t), Map.entry(class06570.ka, G), Map.entry(class06570.kp, l));

    public static class02246 N(class00751<class02246> class007512) {
        class01944.N(class007512, y, "angler_pottery_pattern");
        class01944.N(class007512, L, "archer_pottery_pattern");
        class01944.N(class007512, u, "arms_up_pottery_pattern");
        class01944.N(class007512, i, "blade_pottery_pattern");
        class01944.N(class007512, R, "brewer_pottery_pattern");
        class01944.N(class007512, M, "burn_pottery_pattern");
        class01944.N(class007512, B, "danger_pottery_pattern");
        class01944.N(class007512, Z, "explorer_pottery_pattern");
        class01944.N(class007512, z, "flow_pottery_pattern");
        class01944.N(class007512, U, "friend_pottery_pattern");
        class01944.N(class007512, E, "guster_pottery_pattern");
        class01944.N(class007512, W, "heart_pottery_pattern");
        class01944.N(class007512, m, "heartbreak_pottery_pattern");
        class01944.N(class007512, P, "howl_pottery_pattern");
        class01944.N(class007512, s, "miner_pottery_pattern");
        class01944.N(class007512, T, "mourner_pottery_pattern");
        class01944.N(class007512, b, "plenty_pottery_pattern");
        class01944.N(class007512, j, "prize_pottery_pattern");
        class01944.N(class007512, v, "scrape_pottery_pattern");
        class01944.N(class007512, n, "sheaf_pottery_pattern");
        class01944.N(class007512, t, "shelter_pottery_pattern");
        class01944.N(class007512, G, "skull_pottery_pattern");
        class01944.N(class007512, l, "snort_pottery_pattern");
        return class01944.N(class007512, N, "decorated_pot_side");
    }

    private static class02246 N(class00751<class02246> class007512, class05946<class02246> class059462, String string) {
        return (class02246)class00751.N(class007512, class059462, (Object)new class02246(class01894.y((String)string)));
    }

    public static @Nullable class05946<class02246> N(class06581 class065812) {
        return d.get(class065812);
    }

    private static class05946<class02246> N(String string) {
        return class05946.N((class05946)class04227.n, (class01894)class01894.y((String)string));
    }
}

