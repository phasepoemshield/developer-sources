/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class06133
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class06133;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;

public class class06298 {
    private static final float y = 0.95f;
    public static final int N = 3;

    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.i)).apply((Applicative)class041282, class041392 -> (class047822, class074382, l) -> {
            class00500 class005002;
            if (class047822.field_9229.z() <= 0.95f) {
                return false;
            }
            class07209 class072092 = ((class06289)((Object)((Object)((Object)((Object)class041282.y(class041392)))))).y();
            if (class072092.method_19771((class00753)class074382.method_24515(), 3.0) && (class005002 = class047822.method_8320(class072092)).N(class00869.sN)) {
                ((class06133)class005002.i()).N((class07049)class074382, (class07299)class047822, class072092, null);
            }
            return true;
        }));
    }
}

