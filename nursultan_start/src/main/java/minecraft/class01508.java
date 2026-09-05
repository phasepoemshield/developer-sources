/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04051
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class04995
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class04051;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class04995;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;

public class class01508 {
    public static class04119<class07079> N(int n, float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m), (App)class041282.N(class05378.P), (App)class041282.y(class05378.s), (App)class041282.y(class05378.B)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class070792, l) -> {
            class07438 class074382 = (class07438)class041282.y(class041394);
            if (class074382.method_24516((class07049)class070792, (double)n) && ((class04051)class041282.y(class041395)).N(class074382)) {
                class041393.N((Object)new class05751((class07049)class074382, true));
                class070792.F().N(-f, 0.0f);
                class070792.method_36456(class04995.L((float)class070792.method_36454(), (float)class070792.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), (float)0.0f));
                return true;
            }
            return false;
        }));
    }
}

