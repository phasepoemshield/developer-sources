/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04051
 *  minecraft.class04128
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class04051;
import minecraft.class04128;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07438;

public class class05778 {
    private static /* synthetic */ App N(int n, class07078 class070782, class04128 class041282) {
        return class041282.group((App)class041282.N(class05378.P), (App)class041282.L(class05378.b), (App)class041282.y(class05378.B)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class074382, l) -> {
            Optional var10 = ((class04051)class041282.y(class041394)).N(class074383 -> class074383.method_5858((class07049)class074382) <= (double)n && class070782.equals(class074383.method_5864()));
            if (var10.isEmpty()) {
                return false;
            }
            class07438 class074384 = (class07438)var10.get();
            class041393.N((Object)class074384);
            class041392.N((Object)new class05751((class07049)class074384, true));
            return true;
        });
    }

    public static class04142<class07438> N(class07078<?> class070782, int n) {
        return class04137.N_42(arg_0 -> class05778.N(n * n, class070782, arg_0));
    }
}

