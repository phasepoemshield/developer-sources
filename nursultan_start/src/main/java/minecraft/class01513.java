/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class02484
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class01489;
import minecraft.class01514;
import minecraft.class02484;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;

public class class01513 {
    public static class04142<class01489> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.NP)).apply((Applicative)class041282, class041392 -> (class047822, class014892, l) -> {
            if (class014892.method_6079().R() || class014892.method_6079().L(class02484.H)) {
                return false;
            }
            class01514.N(class047822, class014892, true);
            return true;
        }));
    }
}

