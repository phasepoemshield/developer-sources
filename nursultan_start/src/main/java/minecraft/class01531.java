/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04051
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05779
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class04051;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;

public class class01531 {
    private static final int N = 1;

    public static class04142<class07079> N(Function<class07438, Float> function) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.m), (App)class041282.N(class05378.P), (App)class041282.y(class05378.s), (App)class041282.N(class05378.B)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class070792, l) -> {
            class07438 class074382 = (class07438)class041282.y(class041394);
            Optional optional = class041282.N(class041395);
            if (optional.isPresent() && ((class04051)optional.get()).N(class074382) && class06293.N((class07079)class070792, (class07438)class074382, (int)1)) {
                class041392.y();
            } else {
                class041393.N((Object)new class05751((class07049)class074382, true));
                class041392.N((Object)new class05352((class05779)new class05751((class07049)class074382, false), ((Float)function.apply(class070792)).floatValue(), 0));
            }
            return true;
        }));
    }

    public static class04142<class07079> N(float f) {
        return class01531.N(class074382 -> Float.valueOf(f));
    }
}

