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
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class00717;
import minecraft.class01489;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07438;

public class class01493<E extends class01489> {
    public static class04142<class07438> N(int n) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.NP), (App)class041282.N(class05378.H)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            if (!class074382.method_6079().R()) {
                return false;
            }
            Optional optional = class041282.N(class041393);
            if (optional.isPresent() && ((class00717)optional.get()).method_24516((class07049)class074382, (double)n)) {
                return false;
            }
            class041392.y();
            return true;
        }));
    }
}

