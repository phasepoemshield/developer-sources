/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00869
 *  minecraft.class04887
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06052
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07529
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class00869;
import minecraft.class01153;
import minecraft.class01165;
import minecraft.class01168;
import minecraft.class01175;
import minecraft.class01183;
import minecraft.class01191;
import minecraft.class04887;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06052;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07529;

public class class01152
extends class06391<class01165> {
    public class01152(Codec<class01165> codec) {
        super(codec);
    }

    private void N(class05974 class059742, class07209 class072092, class01168 class011682, class01183 class011832) {
        class059742.method_8652(class011832.N(class072092.method_33096(class011682.i() - 1)), class00869.Lx.W(), 2);
        class059742.method_8652(class011832.N(class072092.method_33096(class011682.R() + 1)), class00869.Lb.W(), 2);
        class07218 class072182 = class072092.method_33096(class011682.R() + 2).method_25503();
        while (class072182.method_10264() < class011682.i() - 1) {
            class07209 class072093 = class011832.N((class07209)class072182);
            if (class01175.N((class07284)class059742, class072093) || class059742.method_8320(class072093).N(class00869.vF)) {
                class059742.method_8652(class072093, class00869.BO.W(), 2);
            }
            class072182.N(class07211.field_11036);
        }
    }

    private static class01153 N(class07209 class072092, boolean bl, class06069 class060692, int n, class06052 class060522, class06052 class060523) {
        return new class01153(class072092, bl, n, class060522.N(class060692), class060523.N(class060692));
    }

    public boolean N(class06058<class01165> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class01165 class011652 = (class01165)class060582.R();
        class06069 class060692 = class060582.u();
        if (!class01175.N((class07284)class059742, class072092)) {
            return false;
        }
        Optional<class01191> var6 = class01191.N((class04887)class059742, class072092, class011652.y, class01175::L, class01175::N);
        if (var6.isEmpty() || !(var6.get() instanceof class01168)) {
            return false;
        }
        class01168 class011682 = (class01168)var6.get();
        if (class011682.M() < 4) {
            return false;
        }
        int n = class04995.N((int)((int)((float)class011682.M() * class011652.i)), (int)class011652.L.y(), (int)class011652.L.L());
        int n2 = class04995.y((class06069)class060692, (int)class011652.L.y(), (int)n);
        class01153 class011532 = class01152.N(class072092.method_33096(class011682.i() - 1), false, class060692, n2, class011652.M, class011652.u);
        class01153 class011533 = class01152.N(class072092.method_33096(class011682.R() + 1), true, class060692, n2, class011652.B, class011652.u);
        class01183 class011832 = class011532.N(class011652) && class011533.N(class011652) ? new class01183(class072092.method_10264(), class060692, class011652.Z) : class01183.N();
        boolean bl = class011532.N(class059742, class011832);
        boolean bl2 = class011533.N(class059742, class011832);
        if (bl) {
            class011532.N(class059742, class060692, class011832);
        }
        if (bl2) {
            class011533.N(class059742, class060692, class011832);
        }
        if (class07529.h) {
            this.N(class059742, class072092, class011682, class011832);
        }
        return true;
    }
}

