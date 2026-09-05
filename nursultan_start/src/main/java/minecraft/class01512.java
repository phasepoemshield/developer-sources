/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class01514;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07078;
import minecraft.class07438;

public class class01512 {
    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.s), (App)class041282.N(class05378.Nj)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            class07438 class074383 = (class07438)class041282.y(class041392);
            if (class074383.method_5864() == class07078.NP && class074383.method_29504()) {
                class041393.N((Object)true, (long)class01514.u.N(class074382.method_73183().field_9229));
            }
            return true;
        }));
    }
}

