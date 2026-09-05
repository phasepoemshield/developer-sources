/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07438;

public class class01004 {
    public static class04142<class07438> N(int n, int n2) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.NP), (App)class041282.y(class05378.H), (App)class041282.N(class05378.Ns), (App)class041282.N(class05378.NT)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074382, l) -> {
            if (!class074382.method_6079().R()) {
                return false;
            }
            Optional optional = class041282.N(class041394);
            if (optional.isEmpty()) {
                class041394.N((Object)0);
            } else {
                int n3 = (Integer)optional.get();
                if (n3 > n) {
                    class041392.y();
                    class041394.y();
                    class041395.N((Object)true, (long)n2);
                } else {
                    class041394.N((Object)(n3 + 1));
                }
            }
            return true;
        }));
    }
}

