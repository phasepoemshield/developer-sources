/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class04128
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05779
 *  minecraft.class06092
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07475
 *  org.apache.commons.lang3.mutable.MutableLong
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class04128;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05779;
import minecraft.class06092;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07475;
import org.apache.commons.lang3.mutable.MutableLong;

public class class04424 {
    private static /* synthetic */ App N(MutableLong mutableLong, int n, float f, class04128 class041282) {
        return class041282.group((App)class041282.L(class05378.s), (App)class041282.L(class05378.m), (App)class041282.N(class05378.P)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074752, l) -> {
            if (class047822.method_8316(class074752.method_24515()).N(class01231.N)) {
                return false;
            }
            if (l < mutableLong.longValue()) {
                mutableLong.setValue(l + 40L);
                return true;
            }
            class06092 class060922 = class06092.N((class07049)class074752);
            class07209 class072092 = class074752.method_24515();
            class07218 class072182 = new class07218();
            block0: for (class07209 class072093 : class07209.method_25996((class07209)class072092, (int)n, (int)n, (int)n)) {
                if (class072093.method_10263() == class072092.method_10263() && class072093.method_10260() == class072092.method_10260() || !class047822.method_8320(class072093).y((class07290)class047822, class072093, class060922).method_1110() || class047822.method_8320((class07209)class072182.N((class00753)class072093, class07211.field_11033)).y((class07290)class047822, class072093, class060922).method_1110()) continue;
                for (class07211 class072112 : class07221.field_11062) {
                    class072182.N((class00753)class072093, class072112);
                    if (!class047822.method_8320((class07209)class072182).P() || !class047822.method_8320((class07209)class072182.N(class07211.field_11033)).N(class00869.K)) continue;
                    class041394.N((Object)new class05744(class072093));
                    class041393.N((Object)new class05352((class05779)new class05744(class072093), f, 0));
                    break block0;
                }
            }
            mutableLong.setValue(l + 40L);
            return true;
        });
    }

    public static class04142<class07475> N(int n, float f) {
        return class04137.N_42(arg_0 -> class04424.N(new MutableLong(0L), n, f, arg_0));
    }
}

