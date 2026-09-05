/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class04128
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05779
 *  minecraft.class07209
 *  minecraft.class07475
 *  org.apache.commons.lang3.mutable.MutableLong
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class04128;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05779;
import minecraft.class07209;
import minecraft.class07475;
import org.apache.commons.lang3.mutable.MutableLong;

public class class05548 {
    private static /* synthetic */ App N(MutableLong mutableLong, int n, float f, class04128 class041282) {
        return class041282.group((App)class041282.L(class05378.s), (App)class041282.L(class05378.m), (App)class041282.N(class05378.P)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074752, l) -> {
            if (class047822.method_8316(class074752.method_24515()).N(class01231.N)) {
                return false;
            }
            if (l < mutableLong.longValue()) {
                mutableLong.setValue(l + 20L + 2L);
                return true;
            }
            class07209 class072092 = null;
            class07209 class072093 = null;
            class07209 class072094 = class074752.method_24515();
            for (class07209 class072095 : class07209.method_25996((class07209)class072094, (int)n, (int)n, (int)n)) {
                if (class072095.method_10263() == class072094.method_10263() && class072095.method_10260() == class072094.method_10260()) continue;
                class00500 class005002 = class074752.method_73183().method_8320(class072095.method_10084());
                if (!class074752.method_73183().method_8320(class072095).N(class00869.K)) continue;
                if (class005002.P()) {
                    class072092 = class072095.method_10062();
                    break;
                }
                if (class072093 != null || class072095.method_19769((class00737)class074752.method_73189(), 1.5)) continue;
                class072093 = class072095.method_10062();
            }
            if (class072092 == null) {
                class072092 = class072093;
            }
            if (class072092 != null) {
                class041394.N((Object)new class05744(class072092));
                class041393.N((Object)new class05352((class05779)new class05744(class072092), f, 0));
            }
            mutableLong.setValue(l + 40L);
            return true;
        });
    }

    public static class04142<class07475> N(int n, float f) {
        return class04137.N_42(arg_0 -> class05548.N(new MutableLong(0L), n, f, arg_0));
    }
}

