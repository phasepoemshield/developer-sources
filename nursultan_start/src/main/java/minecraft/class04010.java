/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;

public class class04010 {
    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.P), (App)class041282.N(class05378.NV), (App)class041282.N(class05378.NK), (App)class041282.L(class05378.s)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074382, l) -> {
            Optional<class07209> optional = class041282.N(class041394).map(class07049::method_24515).or(() -> class041282.N(class041393));
            if (optional.isEmpty()) {
                return false;
            }
            class041392.N((Object)new class05744(optional.get()));
            return true;
        }));
    }
}

