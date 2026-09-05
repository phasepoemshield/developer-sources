/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01812
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01812;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public class class06396
extends class06391<class01812> {
    public class06396(Codec<class01812> codec) {
        super(codec);
    }

    @Override
    public boolean N(class06058<class01812> class060582) {
        class01812 class018122 = (class01812)class060582.R();
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        boolean bl = false;
        int n = class072092.method_10264();
        int n2 = n + class018122.i();
        int n3 = n - class018122.i() - 1;
        int n4 = class018122.L().N(class060692);
        class07218 class072182 = new class07218();
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-n4, 0, -n4), (class07209)class072092.method_10069(n4, 0, n4))) {
            int n5;
            int n6 = class072093.method_10263() - class072092.method_10263();
            if (n6 * n6 + (n5 = class072093.method_10260() - class072092.method_10260()) * n5 > n4 * n4) continue;
            bl |= this.N(class018122, class059742, class060692, n2, n3, class072182.N((class00753)class072093));
        }
        return bl;
    }

    protected boolean N(class01812 class018122, class05974 class059742, class06069 class060692, int n, int n2, class07218 class072182) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i = n; i > n2; --i) {
            class072182.method_10099(i);
            if (class018122.y().test((Object)class059742, (Object)class072182)) {
                class00500 class005002 = class018122.N().N(class059742, class060692, (class07209)class072182);
                class059742.method_8652((class07209)class072182, class005002, 2);
                if (!bl2) {
                    this.N_59(class059742, (class07209)class072182);
                }
                bl = true;
                bl2 = true;
                continue;
            }
            bl2 = false;
        }
        return bl;
    }
}

