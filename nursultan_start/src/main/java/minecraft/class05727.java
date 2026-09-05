/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Collections;
import java.util.List;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class07536;

public class class05727 {
    public static class04142<class07475> N(float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m)).apply((Applicative)class041282, class041392 -> (class047822, class074752, l) -> {
            if (class047822.N_17(class074752.method_24515())) {
                return false;
            }
            class07209 class072093 = class074752.method_24515();
            List list = (List)class07209.method_20437((class07209)class072093.method_10069(-1, -1, -1), (class07209)class072093.method_10069(1, 1, 1)).map(class07209::method_10062).collect(class07536.y());
            Collections.shuffle(list);
            list.stream().filter(class072092 -> !class047822.N_17(class072092)).filter(class072092 -> class047822.method_8515(class072092, (class07049)class074752)).filter(class072092 -> class047822.N((class07049)class074752)).findFirst().ifPresent(class072092 -> class041392.N((Object)new class05352(class072092, f, 0)));
            return true;
        }));
    }
}

