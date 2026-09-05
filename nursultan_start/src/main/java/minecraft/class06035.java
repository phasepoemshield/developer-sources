/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class05974
 *  minecraft.class06191
 *  minecraft.class06203
 *  minecraft.class06209
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06191;
import minecraft.class06203;
import minecraft.class06209;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public class class06035
extends class06391<class06191> {
    private static final int NE = 7;

    class06035(Codec<class06191> codec) {
        super(codec);
    }

    private int N(class06069 class060692, int n) {
        return Math.round((class060692.z() - class060692.z()) * (float)n);
    }

    private void N(class07218 class072182, class06069 class060692, class07209 class072092, int n) {
        int n2 = this.N(class060692, n);
        int n3 = this.N(class060692, n);
        int n4 = this.N(class060692, n);
        class072182.N((class00753)class072092, n2, n3, n4);
    }

    public boolean N(class06058<class06191> class060582) {
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class06191 class061912 = class060582.R();
        class07209 class072092 = class060582.i();
        int n = class060692.y(class061912.L + 1);
        class07218 class072182 = new class07218();
        block0: for (int i = 0; i < n; ++i) {
            this.N(class072182, class060692, class072092, Math.min(i, 7));
            class00500 class005002 = class059742.method_8320((class07209)class072182);
            for (class06209 class062092 : class061912.y) {
                if (!class06203.N((class00500)class005002, arg_0 -> ((class05974)class059742).method_8320(arg_0), (class06069)class060692, (class06191)class061912, (class06209)class062092, (class07218)class072182)) continue;
                class059742.method_8652((class07209)class072182, class062092.L, 2);
                continue block0;
            }
        }
        return true;
    }
}

