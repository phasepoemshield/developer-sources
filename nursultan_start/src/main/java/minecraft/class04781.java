/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00869
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00869;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;

public class class04781
extends class06391<class06225> {
    private static final class07209 NE = new class07209(8, 3, 8);
    private static final class07321 NW = new class07321(NE);
    private static final int Nm = 16;
    private static final int NP = 1;

    public class04781(Codec<class06225> codec) {
        super(codec);
    }

    private static int N(int n, int n2, int n3, int n4) {
        return Math.max(Math.abs(n - n3), Math.abs(n2 - n4));
    }

    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class07321 class073212 = new class07321(class060582.i());
        if (class04781.N(class073212.B, class073212.Z, class04781.NW.B, class04781.NW.Z) > 1) {
            return true;
        }
        class07209 class072092 = NE.method_33096(class060582.i().method_10264() + NE.method_10264());
        class07218 class072182 = new class07218();
        for (int i = class073212.R(); i <= class073212.B(); ++i) {
            for (int j = class073212.i(); j <= class073212.M(); ++j) {
                if (class04781.N(class072092.method_10263(), class072092.method_10260(), j, i) > 16) continue;
                class072182.N(j, class072092.method_10264(), i);
                if (class072182.equals((Object)class072092)) {
                    class059742.method_8652((class07209)class072182, class00869.W.W(), 2);
                    continue;
                }
                class059742.method_8652((class07209)class072182, class00869.y.W(), 2);
            }
        }
        return true;
    }
}

