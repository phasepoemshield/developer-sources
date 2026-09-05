/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07438;

public class class05756 {
    private static final int N = 36;

    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.d), (App)class041282.N(class05378.w), (App)class041282.N(class05378.Y)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            if (!(class041282.N(class041392).isPresent() || class041282.N(class041394).isPresent() || class041282.N(class041393).filter(class074383 -> class074383.method_5858((class07049)class074382) <= 36.0).isPresent())) {
                class041392.y();
                class041393.y();
                class074382.method_18868().N(class047822.method_75728(), class047822.N(), class074382.method_73189());
            }
            return true;
        }));
    }
}

