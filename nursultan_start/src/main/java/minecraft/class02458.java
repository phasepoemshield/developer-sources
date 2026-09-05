/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class02256
 *  minecraft.class02616
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class08088
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class02256;
import minecraft.class02616;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class08088;
import minecraft.class08092;

public class class02458
extends class02616 {
    public class02458(Codec<class02256> codec) {
        super(codec);
    }

    protected boolean N(class05974 class059742, class02256 class022562, class08088 class080882, class06069 class060692, class07209 class072092) {
        if (super.N(class059742, class022562, class080882, class060692, class072092.method_10074())) {
            class00500 class005002 = class059742.method_8320(class072092);
            if (class005002.y((class08092)class06665.q) && !((Boolean)class005002.L((class08092)class06665.q)).booleanValue()) {
                class059742.method_8652(class072092, (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(true)), 2);
            }
            return true;
        }
        return false;
    }

    private static boolean N(class05974 class059742, class07209 class072092, class07218 class072182, class07211 class072112) {
        class072182.N((class00753)class072092, class072112);
        return !class059742.method_8320((class07209)class072182).L((class07290)class059742, (class07209)class072182, class072112.b());
    }

    private static boolean N(class05974 class059742, Set<class07209> set, class07209 class072092, class07218 class072182) {
        return class02458.N(class059742, class072092, class072182, class07211.field_11043) || class02458.N(class059742, class072092, class072182, class07211.field_11034) || class02458.N(class059742, class072092, class072182, class07211.field_11035) || class02458.N(class059742, class072092, class072182, class07211.field_11039) || class02458.N(class059742, class072092, class072182, class07211.field_11033);
    }

    protected Set<class07209> N(class05974 class059742, class02256 class022562, class06069 class060692, class07209 class072092, Predicate<class00500> predicate, int n, int n2) {
        Set var8 = super.N(class059742, class022562, class060692, class072092, predicate, n, n2);
        HashSet<class07209> hashSet = new HashSet<class07209>();
        class07218 class072182 = new class07218();
        for (class07209 class072093 : var8) {
            if (class02458.N(class059742, var8, class072093, class072182)) continue;
            hashSet.add(class072093);
        }
        for (class07209 class072093 : hashSet) {
            class059742.method_8652(class072093, class00869.K.W(), 2);
        }
        return hashSet;
    }
}

