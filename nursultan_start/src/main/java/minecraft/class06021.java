/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class00901
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class00901;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07299;

public class class06021
extends class00891
implements class00873 {
    public static final MapCodec<class06021> N = class06021.y(class06021::new);

    public class06021(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        boolean bl = false;
        boolean bl2 = false;
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-1, -1, -1), (class07209)class072092.method_10069(1, 1, 1))) {
            class00500 class005003 = class047822.method_8320(class072093);
            if (class005003.N(class00869.sE)) {
                bl2 = true;
            }
            if (class005003.N(class00869.sn)) {
                bl = true;
            }
            if (!bl2 || !bl) continue;
            break;
        }
        if (bl2 && bl) {
            class047822.method_8652(class072092, class060692.Z() ? class00869.sE.W() : class00869.sn.W(), 3);
        } else if (bl2) {
            class047822.method_8652(class072092, class00869.sE.W(), 3);
        } else if (bl) {
            class047822.method_8652(class072092, class00869.sn.W(), 3);
        }
    }

    public MapCodec<class06021> N() {
        return N;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        if (!class054872.method_8320(class072092.method_10084()).Z()) {
            return false;
        }
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-1, -1, -1), (class07209)class072092.method_10069(1, 1, 1))) {
            if (!class054872.method_8320(class072093).N(class01210.Nr)) continue;
            return true;
        }
        return false;
    }

    public class00901 ay_() {
        return class00901.field_47834;
    }
}

