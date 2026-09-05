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
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class01173;
import minecraft.class01175;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;

public class class01185
extends class06391<class01173> {
    public class01185(Codec<class01173> codec) {
        super(codec);
    }

    private static void N(class07284 class072842, class06069 class060692, class07209 class072092, class01173 class011732) {
        class01175.L(class072842, class072092);
        for (class07211 class072112 : class07221.field_11062) {
            if (class060692.z() > class011732.L) continue;
            class07209 class072093 = class072092.method_10093(class072112);
            class01175.L(class072842, class072093);
            if (class060692.z() > class011732.u) continue;
            class07209 class072094 = class072093.method_10093(class07211.y((class06069)class060692));
            class01175.L(class072842, class072094);
            if (class060692.z() > class011732.i) continue;
            class07209 class072095 = class072094.method_10093(class07211.y((class06069)class060692));
            class01175.L(class072842, class072095);
        }
    }

    private static Optional<class07211> N(class07284 class072842, class07209 class072092, class06069 class060692) {
        boolean bl = class01175.y(class072842.method_8320(class072092.method_10084()));
        boolean bl2 = class01175.y(class072842.method_8320(class072092.method_10074()));
        if (bl && bl2) {
            return Optional.of(class060692.Z() ? class07211.field_11033 : class07211.field_11036);
        }
        if (bl) {
            return Optional.of(class07211.field_11033);
        }
        if (bl2) {
            return Optional.of(class07211.field_11036);
        }
        return Optional.empty();
    }

    public boolean N(class06058<class01173> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        class01173 class011732 = (class01173)class060582.R();
        Optional<class07211> var6 = class01185.N((class07284)class059742, class072092, class060692);
        if (var6.isEmpty()) {
            return false;
        }
        class07209 class072093 = class072092.method_10093(var6.get().b());
        class01185.N((class07284)class059742, class060692, class072093, class011732);
        int n = class060692.z() < class011732.y && class01175.L(class059742.method_8320(class072092.method_10093(var6.get()))) ? 2 : 1;
        class01175.N((class07284)class059742, class072092, var6.get(), n, false);
        return true;
    }
}

