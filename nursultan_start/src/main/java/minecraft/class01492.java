/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class01238
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05378
 *  minecraft.class06018
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class01238;
import minecraft.class01489;
import minecraft.class01514;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05378;
import minecraft.class06018;
import minecraft.class07438;

public class class01492 {
    public static class04119<class01489> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.Nt), (App)class041282.L(class05378.NW), (App)class041282.L(class05378.Nj), (App)class041282.N(class05378.Nw)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class014892, l) -> {
            if (class014892.method_6109() || class041282.N(class041395).map(list -> list.stream().anyMatch(class01492::N)).isPresent()) {
                return false;
            }
            class06018 class060182 = (class06018)class041282.y(class041392);
            class01514.L(class047822, class014892, (class07438)class060182);
            class01514.y((class01238)class014892);
            class01514.y(class047822, (class01238)class014892, (class07438)class060182);
            class041282.N(class041395).ifPresent(list -> list.forEach(class01514::y));
            return true;
        }));
    }

    private static boolean N(class01238 class012382) {
        return class012382.method_18868().N(class05378.Nj);
    }
}

