/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00891
 *  minecraft.class01041
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00891;
import minecraft.class01041;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import org.jspecify.annotations.Nullable;

public class class05286
extends class06391<class01041> {
    public class05286(Codec<class01041> codec) {
        super(codec);
    }

    public boolean N(class06058<class01041> class060582) {
        class07209 class072092;
        class01041 class010412 = (class01041)class060582.R();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class00891 class008912 = class010412.y.i();
        class07209 class072093 = class05286.N((class07284)class059742, class060582.i().method_25503().N(class07185.field_11052, class059742.method_31607() + 1, class059742.method_31600()), class008912);
        if (class072093 == null) {
            return false;
        }
        int n = class010412.N().N(class060692);
        int n2 = class010412.N().N(class060692);
        int n3 = class010412.N().N(class060692);
        int n4 = Math.max(n, Math.max(n2, n3));
        boolean bl = false;
        Iterator var12 = class07209.method_25996((class07209)class072093, (int)n, (int)n2, (int)n3).iterator();
        while (var12.hasNext() && (class072092 = (class07209)var12.next()).method_19455((class00753)class072093) <= n4) {
            if (!class059742.method_8320(class072092).N(class008912)) continue;
            this.N((class00807)class059742, class072092, class010412.L);
            bl = true;
        }
        return bl;
    }

    private static @Nullable class07209 N(class07284 class072842, class07218 class072182, class00891 class008912) {
        while (class072182.method_10264() > class072842.method_31607() + 1) {
            if (class072842.method_8320((class07209)class072182).N(class008912)) {
                return class072182;
            }
            class072182.N(class07211.field_11033);
        }
        return null;
    }
}

