/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class04983
 *  minecraft.class04995
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class04983;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class08092;

public class class06011
extends class06391<class06225> {
    private static final class07211[] NE = class07211.values();

    public class06011(Codec<class06225> codec) {
        super(codec);
    }

    private void y(class07284 class072842, class06069 class060692, class07209 class072092) {
        class07218 class072182 = new class07218();
        for (int i = 0; i < 100; ++i) {
            class00500 class005002;
            class072182.N((class00753)class072092, class060692.y(8) - class060692.y(8), class060692.y(2) - class060692.y(7), class060692.y(8) - class060692.y(8));
            if (!class072842.R((class07209)class072182) || !(class005002 = class072842.method_8320(class072182.method_10084())).N(class00869.id) && !class005002.N(class00869.EJ)) continue;
            int n = class04995.N((class06069)class060692, (int)1, (int)8);
            if (class060692.y(6) == 0) {
                n *= 2;
            }
            if (class060692.y(5) == 0) {
                n = 1;
            }
            int n2 = 17;
            int n3 = 25;
            class06011.N(class072842, class060692, class072182, n, 17, 25);
        }
    }

    private void N(class07284 class072842, class06069 class060692, class07209 class072092) {
        class072842.method_8652(class072092, class00869.EJ.W(), 2);
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        for (int i = 0; i < 200; ++i) {
            class072182.N((class00753)class072092, class060692.y(6) - class060692.y(6), class060692.y(2) - class060692.y(5), class060692.y(6) - class060692.y(6));
            if (!class072842.R((class07209)class072182)) continue;
            int n = 0;
            for (class07211 class072112 : NE) {
                class00500 class005002 = class072842.method_8320((class07209)class072183.N((class00753)class072182, class072112));
                if (class005002.N(class00869.id) || class005002.N(class00869.EJ)) {
                    ++n;
                }
                if (n > 1) break;
            }
            if (n != true) continue;
            class072842.method_8652((class07209)class072182, class00869.EJ.W(), 2);
        }
    }

    public static void N(class07284 class072842, class06069 class060692, class07218 class072182, int n, int n2, int n3) {
        for (int i = 0; i <= n; ++i) {
            if (class072842.R((class07209)class072182)) {
                if (i == n || !class072842.R(class072182.method_10074())) {
                    class072842.method_8652((class07209)class072182, (class00500)class00869.sl.W().y((class08092)class04983.i, (Comparable)Integer.valueOf(class04995.N((class06069)class060692, (int)n2, (int)n3))), 2);
                    break;
                }
                class072842.method_8652((class07209)class072182, class00869.sd.W(), 2);
            }
            class072182.N(class07211.field_11033);
        }
    }

    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        if (!class059742.R(class072092)) {
            return false;
        }
        class00500 class005002 = class059742.method_8320(class072092.method_10084());
        if (!class005002.N(class00869.id) && !class005002.N(class00869.EJ)) {
            return false;
        }
        this.N((class07284)class059742, class060692, class072092);
        this.y((class07284)class059742, class060692, class072092);
        return true;
    }
}

