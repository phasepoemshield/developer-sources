/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07438;

public class class04432 {
    public static class04142<class07438> N(class00891 class008912) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.s), (App)class041282.y(class05378.m), (App)class041282.y(class05378.r)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            if (class074382.method_5799() || !class074382.method_24828()) {
                return false;
            }
            class07209 class072092 = class074382.method_24515().method_10074();
            for (class07211 class072112 : class07221.field_11062) {
                class07209 class072093;
                class07209 class072094 = class072092.method_10093(class072112);
                if (!class047822.method_8320(class072094).M((class07290)class047822, class072094).method_20538(class07211.field_11036).method_1110() || !class047822.method_8316(class072094).y((class04651)class04684.L) || !class047822.method_8320(class072093 = class072094.method_10084()).P()) continue;
                class00500 class005002 = class008912.W();
                class047822.method_8652(class072093, class005002, 3);
                class047822.N((class03556)class01194.Z, class072093, class01164.N((class07049)class074382, (class00500)class005002));
                class047822.method_43129(null, (class07049)class074382, class04909.EO, class04911.field_15245, 1.0f, 1.0f);
                class041394.y();
                return true;
            }
            return true;
        }));
    }
}

