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

public class class01534 {
    public static class04142<class07438> N(class05378<?> class053782, int n) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.s), (App)class041282.L(class05378.Nq), (App)class041282.y(class053782)).apply((Applicative)class041282, (App)class041282.N(() -> "[BecomePassive if " + String.valueOf(class053782) + " present]", (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            class041393.N((Object)true, (long)n);
            class041392.y();
            return true;
        })));
    }
}

