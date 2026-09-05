/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07438;

public class class05556 {
    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.X), (App)class041282.N(class05378.w)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            int n = (Integer)class041282.y(class041392);
            if (n <= 0) {
                class041392.y();
                class041393.y();
                class074382.method_18868().i();
            } else {
                class041392.N((Object)(n - 1));
            }
            return true;
        }));
    }
}

