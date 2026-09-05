/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05779
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class07049;
import minecraft.class07438;

public class class01490 {
    private static final int N = 1;

    public static class04142<class07438> N(float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.P), (App)class041282.L(class05378.m), (App)class041282.y(class05378.v)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            if (class074382.method_5765()) {
                return false;
            }
            class07049 class070492 = (class07049)class041282.y(class041394);
            if (class070492.method_24516((class07049)class074382, 1.0)) {
                class074382.method_5804(class070492);
            } else {
                class041392.N((Object)new class05751(class070492, true));
                class041393.N((Object)new class05352((class05779)new class05751(class070492, false), f, 1));
            }
            return true;
        }));
    }
}

