/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05779
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00737;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05779;
import minecraft.class07438;

public class class03655 {
    public static class04142<class07438> N(Function<class07438, Optional<class05779>> function, Predicate<class07438> predicate, int n, int n2, float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.P), (App)class041282.N(class05378.m)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            Optional optional = (Optional)function.apply(class074382);
            if (optional.isEmpty() || !predicate.test(class074382)) {
                return false;
            }
            class05779 class057792 = (class05779)optional.get();
            if (class074382.method_73189().N((class00737)class057792.N(), (double)n2)) {
                return false;
            }
            class05779 class057793 = (class05779)optional.get();
            class041392.N((Object)class057793);
            class041393.N((Object)new class05352(class057793, f, n));
            return true;
        }));
    }
}

