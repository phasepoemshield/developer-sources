/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class02063
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class02063;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class05666;
import minecraft.class05672;
import minecraft.class08041;

public class class05712 {
    public static class04142<class08041> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.L)).apply((Applicative)class041282, class041392 -> (class047822, class080412, l) -> {
            class05666 class056662 = class080412.t();
            if (!class056662.y().N(class05672.y) && !class056662.y().N(class05672.W) && class080412.u() == 0 && class056662.L() <= 1) {
                class080412.N(class080412.t().y((class02063)class047822.method_30349(), class05672.y));
                class080412.L(class047822);
                return true;
            }
            return false;
        }));
    }
}

