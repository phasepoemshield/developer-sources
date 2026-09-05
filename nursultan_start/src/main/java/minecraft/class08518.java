/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class01474
 *  minecraft.class03194
 *  minecraft.class04887
 *  minecraft.class05894
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07004
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class01474;
import minecraft.class03194;
import minecraft.class04887;
import minecraft.class05894;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07004;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08531;

public class class08518
extends class06391<class08531> {
    private static final int NE = 1;
    private static final int NW = 2;
    private static final int Nm = 5;
    private static final int NP = 2;
    private static final int Ns = 2;

    public class08518(Codec<class08531> codec) {
        super(codec);
    }

    private boolean y(class07284 class072842, class07209 class072092) {
        return class072842.method_8320(class072092.method_10074()).L((class07290)class072842, class072092, class07211.field_11036);
    }

    private static Function<class00500, class00500> N(class07211 class072112) {
        return class005002 -> (class00500)class005002.L((class08092)class07004.L, (Comparable)class072112.z());
    }

    private BiConsumer<class07209, class00500> N(class05974 class059742) {
        return (class072092, class005002) -> class059742.method_8652(class072092, class005002, 19);
    }

    private void N(class05974 class059742, class06069 class060692, Set<class07209> set, List<class01474> list) {
        if (!list.isEmpty()) {
            class05894 class058942 = new class05894((class04887)class059742, this.N(class059742), class060692, set, Set.of(), Set.of());
            list.forEach(class014742 -> class014742.N(class058942));
        }
    }

    private class07209 N(class08531 class085312, class05974 class059742, class06069 class060692, class07218 class072182, Function<class00500, class00500> function) {
        class059742.method_8652((class07209)class072182, function.apply(class085312.y.N(class060692, (class07209)class072182)), 3);
        this.N_59(class059742, (class07209)class072182);
        return class072182.method_10062();
    }

    private boolean N(class05974 class059742, int n, class07218 class072182, class07211 class072112) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (!class03194.L((class04887)class059742, (class07209)class072182)) {
                return false;
            }
            if (!this.y((class07284)class059742, (class07209)class072182)) {
                if (++n2 > 2) {
                    return false;
                }
            } else {
                n2 = 0;
            }
            class072182.N(class072112);
        }
        class072182.N(class072112.b(), n);
        return true;
    }

    private void N(class08531 class085312, class05974 class059742, class06069 class060692, class07218 class072182) {
        class07209 class072092 = this.N(class085312, class059742, class060692, class072182, Function.identity());
        this.N(class059742, class060692, Set.of(class072092), class085312.u);
    }

    private void N(class05974 class059742, class07218 class072182) {
        class072182.N(class07211.field_11036, 1);
        for (int i = 0; i < 6; ++i) {
            if (this.N((class07284)class059742, (class07209)class072182)) {
                return;
            }
            class072182.N(class07211.field_11033);
        }
    }

    private void N(class08531 class085312, class07209 class072092, class05974 class059742, class06069 class060692) {
        this.N(class085312, class059742, class060692, class072092.method_25503());
        class07211 class072112 = class07221.field_11062.N(class060692);
        int n = class085312.L.N(class060692) - 2;
        class07218 class072182 = class072092.method_10079(class072112, 2 + class060692.y(2)).method_25503();
        this.N(class059742, class072182);
        if (this.N(class059742, n, class072182, class072112)) {
            this.N(class085312, class059742, class060692, n, class072182, class072112);
        }
    }

    private void N(class08531 class085312, class05974 class059742, class06069 class060692, int n, class07218 class072182, class07211 class072112) {
        HashSet<class07209> hashSet = new HashSet<class07209>();
        for (int i = 0; i < n; ++i) {
            hashSet.add(this.N(class085312, class059742, class060692, class072182, class08518.N(class072112)));
            class072182.N(class072112);
        }
        this.N(class059742, class060692, hashSet, class085312.i);
    }

    private boolean N(class07284 class072842, class07209 class072092) {
        return class03194.L((class04887)class072842, (class07209)class072092) && this.y(class072842, class072092);
    }

    public boolean N(class06058<class08531> class060582) {
        this.N((class08531)class060582.R(), class060582.i(), class060582.y(), class060582.u());
        return true;
    }
}

