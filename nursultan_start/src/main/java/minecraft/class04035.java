/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class04031;
import minecraft.class04055;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public class class04035
extends class06391<class04055> {
    public class04035(Codec<class04055> codec) {
        super(codec);
    }

    public boolean N(class06058<class04055> class060582) {
        int n;
        class05974 class059742 = class060582.y();
        class04055 class040552 = (class04055)class060582.R();
        class06069 class060692 = class060582.u();
        int n2 = class040552.N().size();
        int[] nArray = new int[n2];
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            nArray[i] = class040552.N().get(i).N().N(class060692);
            n3 += nArray[i];
        }
        if (n3 == 0) {
            return false;
        }
        class07218 class072182 = class060582.i().method_25503();
        class07218 class072183 = class072182.method_25503().N(class040552.y());
        for (n = 0; n < n3; ++n) {
            if (!class040552.L().test(class059742, class072183)) {
                class04035.N(nArray, n3, n, class040552.i());
                break;
            }
            class072183.N(class040552.y());
        }
        for (n = 0; n < n2; ++n) {
            int n4 = nArray[n];
            if (n4 == 0) continue;
            class04031 class040312 = class040552.N().get(n);
            for (int i = 0; i < n4; ++i) {
                class059742.method_8652((class07209)class072182, class040312.y().N(class060692, (class07209)class072182), 2);
                class072182.N(class040552.y());
            }
        }
        return true;
    }

    private static void N(int[] nArray, int n, int n2, boolean bl) {
        int n3;
        int n4 = n - n2;
        int n5 = bl ? 1 : -1;
        int n6 = bl ? 0 : nArray.length - 1;
        int n7 = bl ? nArray.length : -1;
        for (int i = n6; i != n7 && n4 > 0; n4 -= n3, i += n5) {
            n3 = Math.min(nArray[i], n4);
            int n8 = i;
            nArray[n8] = nArray[n8] - n3;
        }
    }
}

