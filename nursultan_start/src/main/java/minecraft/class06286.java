/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00753
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class06286 {
    public static boolean N(class04782 class047822, class07438 class074382, class07209 class072092) {
        return class047822.N_17(class072092) && (double)class047822.N(class07830.field_13197, class072092).method_10264() <= class074382.method_23318();
    }

    private static @Nullable class06889 N(class04782 class047822, class07438 class074382) {
        class06069 class060692 = class074382.method_59922();
        class07209 class072092 = class074382.method_24515();
        for (int i = 0; i < 10; ++i) {
            class07209 class072093 = class072092.method_10069(class060692.y(20) - 10, class060692.y(6) - 3, class060692.y(20) - 10);
            if (!class06286.N(class047822, class074382, class072093)) continue;
            return class06889.L((class00753)class072093);
        }
        return null;
    }

    public static class04119<class07438> N(float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m)).apply((Applicative)class041282, class041392 -> (class047822, class074382, l) -> {
            if (class047822.N_17(class074382.method_24515())) {
                return false;
            }
            Optional.ofNullable(class06286.N(class047822, class074382)).ifPresent(class068892 -> class041392.N((Object)new class05352(class068892, f, 0)));
            return true;
        }));
    }
}

