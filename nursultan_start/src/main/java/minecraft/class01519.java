/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00717
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00717;
import minecraft.class01514;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07438;

public class class01519 {
    public static class04142<class07438> N(int n) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.H), (App)class041282.L(class05378.NP), (App)class041282.L(class05378.Nb), (App)class041282.L(class05378.NT)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074382, l) -> {
            if (!class01514.N(((class00717)class041282.y(class041392)).N())) {
                return false;
            }
            class041393.N((Object)true, (long)n);
            return true;
        }));
    }
}

