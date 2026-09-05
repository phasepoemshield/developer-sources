/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class02135
 *  minecraft.class04119
 *  minecraft.class04137
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
import java.util.function.Function;
import minecraft.class02135;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class07049;
import minecraft.class07438;

public class class01269 {
    public static class04119<class07438> N(class02135 class021352, Function<class07438, Float> function, class05378<? extends class07438> class053782, boolean bl) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class053782), (App)class041282.N(class05378.P), (App)class041282.L(class05378.m)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            if (!class074382.method_6109()) {
                return false;
            }
            class07438 class074383 = (class07438)class041282.y(class041392);
            if (class074382.method_24516((class07049)class074383, (double)(class021352.L() + 1)) && !class074382.method_24516((class07049)class074383, (double)class021352.y())) {
                class05352 class053522 = new class05352((class05779)new class05751((class07049)class074383, bl, bl), ((Float)function.apply(class074382)).floatValue(), class021352.y() - 1);
                class041393.N((Object)new class05751((class07049)class074383, true, bl));
                class041394.N((Object)class053522);
                return true;
            }
            return false;
        }));
    }

    public static class04119<class07438> N(class02135 class021352, float f) {
        return class01269.N(class021352, class074382 -> Float.valueOf(f), (class05378<? extends class07438>)class05378.e, false);
    }
}

