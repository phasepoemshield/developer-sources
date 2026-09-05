/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06273
 *  minecraft.class06670
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06273;
import minecraft.class06391;
import minecraft.class06670;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07536;

public class class06393
extends class06391<class06225> {
    private static final class06670 NE = class06670.N((class00891)class00869.e);
    private final class00500 NW = class00869.e.W();
    private final class00500 Nm = class00869.Ud.W();
    private final class00500 NP = class00869.yL.W();
    private final class00500 Ns = class00869.K.W();

    public class06393(Codec<class06225> codec) {
        super(codec);
    }

    private static void y(class05974 class059742, class07209 class072092) {
        class059742.method_8652(class072092, class00869.H.W(), 3);
        class059742.N(class072092, class00404.field_42780).ifPresent(class019652 -> class019652.N(class06273.yz, class072092.method_10063()));
    }

    @Override
    public boolean N(class06058<class06225> class060582) {
        int n;
        int n2;
        int n3;
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class072092 = class072092.method_10084();
        while (class059742.R(class072092) && class072092.method_10264() > class059742.method_31607() + 2) {
            class072092 = class072092.method_10074();
        }
        if (!NE.test(class059742.method_8320(class072092))) {
            return false;
        }
        for (n3 = -2; n3 <= 2; ++n3) {
            for (n2 = -2; n2 <= 2; ++n2) {
                if (!class059742.R(class072092.method_10069(n3, -1, n2)) || !class059742.R(class072092.method_10069(n3, -2, n2))) continue;
                return false;
            }
        }
        for (n3 = -2; n3 <= 0; ++n3) {
            for (n2 = -2; n2 <= 2; ++n2) {
                for (int i = -2; i <= 2; ++i) {
                    class059742.method_8652(class072092.method_10069(n2, n3, i), this.NP, 2);
                }
            }
        }
        class059742.method_8652(class072092, this.Ns, 2);
        for (class07211 class072112 : class07221.field_11062) {
            class059742.method_8652(class072092.method_10093(class072112), this.Ns, 2);
        }
        class07209 class072093 = class072092.method_10074();
        class059742.method_8652(class072093, this.NW, 2);
        for (class07211 class072113 : class07221.field_11062) {
            class059742.method_8652(class072093.method_10093(class072113), this.NW, 2);
        }
        for (n = -2; n <= 2; ++n) {
            for (int i = -2; i <= 2; ++i) {
                if (n != -2 && n != 2 && i != -2 && i != 2) continue;
                class059742.method_8652(class072092.method_10069(n, 1, i), this.NP, 2);
            }
        }
        class059742.method_8652(class072092.method_10069(2, 1, 0), this.Nm, 2);
        class059742.method_8652(class072092.method_10069(-2, 1, 0), this.Nm, 2);
        class059742.method_8652(class072092.method_10069(0, 1, 2), this.Nm, 2);
        class059742.method_8652(class072092.method_10069(0, 1, -2), this.Nm, 2);
        for (n = -1; n <= 1; ++n) {
            for (int i = -1; i <= 1; ++i) {
                if (n == 0 && i == 0) {
                    class059742.method_8652(class072092.method_10069(n, 4, i), this.NP, 2);
                    continue;
                }
                class059742.method_8652(class072092.method_10069(n, 4, i), this.Nm, 2);
            }
        }
        for (n = 1; n <= 3; ++n) {
            class059742.method_8652(class072092.method_10069(-1, n, -1), this.NP, 2);
            class059742.method_8652(class072092.method_10069(-1, n, 1), this.NP, 2);
            class059742.method_8652(class072092.method_10069(1, n, -1), this.NP, 2);
            class059742.method_8652(class072092.method_10069(1, n, 1), this.NP, 2);
        }
        class07209 class072094 = class072092;
        List<class07209> list = List.of(class072094, class072094.method_10078(), class072094.method_10072(), class072094.method_10067(), class072094.method_10095());
        class06069 class060692 = class060582.u();
        class06393.y(class059742, ((class07209)class07536.N_77(list, (class06069)class060692)).method_10087(1));
        class06393.y(class059742, ((class07209)class07536.N_77(list, (class06069)class060692)).method_10087(2));
        return true;
    }
}

