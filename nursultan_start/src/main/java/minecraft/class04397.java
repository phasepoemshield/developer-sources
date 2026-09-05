/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00500
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
 *  minecraft.class07290
 *  minecraft.class07475
 *  org.apache.commons.lang3.mutable.MutableLong
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00500;
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
import minecraft.class07290;
import minecraft.class07475;
import org.apache.commons.lang3.mutable.MutableLong;

public class class04397 {
    private static final int N = 60;

    private static /* synthetic */ App N(MutableLong mutableLong, int n, float f, class04128 class041282) {
        return class041282.group((App)class041282.L(class05378.s), (App)class041282.L(class05378.m), (App)class041282.N(class05378.P)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074752, l) -> {
            if (!class047822.method_8316(class074752.method_24515()).N(class01231.N)) {
                return false;
            }
            if (l < mutableLong.longValue()) {
                mutableLong.setValue(l + 60L);
                return true;
            }
            class07209 class072092 = class074752.method_24515();
            class07218 class072182 = new class07218();
            class06092 class060922 = class06092.N((class07049)class074752);
            for (class07209 class072093 : class07209.method_25996((class07209)class072092, (int)n, (int)n, (int)n)) {
                if (class072093.method_10263() == class072092.method_10263() && class072093.method_10260() == class072092.method_10260()) continue;
                class00500 class005002 = class047822.method_8320(class072093);
                class00500 class005003 = class047822.method_8320((class07209)class072182.N((class00753)class072093, class07211.field_11033));
                if (class005002.N(class00869.K) || !class047822.method_8316(class072093).W() || !class005002.y((class07290)class047822, class072093, class060922).method_1110() || !class005003.L((class07290)class047822, (class07209)class072182, class07211.field_11036)) continue;
                class07209 class072094 = class072093.method_10062();
                class041394.N((Object)new class05744(class072094));
                class041393.N((Object)new class05352((class05779)new class05744(class072094), f, 1));
                break;
            }
            mutableLong.setValue(l + 60L);
            return true;
        });
    }

    public static class04142<class07475> N(int n, float f) {
        return class04137.N_42(arg_0 -> class04397.N(new MutableLong(0L), n, f, arg_0));
    }
}

