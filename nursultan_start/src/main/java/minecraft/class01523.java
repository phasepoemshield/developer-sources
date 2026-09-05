/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05378
 *  minecraft.class07079
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import minecraft.class01494;
import minecraft.class01525;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05378;
import minecraft.class07079;
import minecraft.class07438;

public class class01523 {
    private static final int N = 200;

    public static <E extends class07079> class04142<E> N_28(class01494<E> class014942) {
        return class01523.N((class04782 class047822, class07438 class074382) -> false, class014942, true);
    }

    public static <E extends class07079> class04142<E> N() {
        return class01523.N((class04782 class047822, class07438 class074382) -> false, (class04782 class047822, E class070792, class07438 class074382) -> {}, true);
    }

    public static <E extends class07079> class04142<E> N(class01525 class015252, class01494<E> class014942, boolean bl) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.s), (App)class041282.N(class05378.I)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class070792, l) -> {
            class07438 class074382 = (class07438)class041282.y(class041392);
            if (!class070792.method_18395(class074382) || bl && class01523.N(class070792, class041282.N(class041393)) || !class074382.method_5805() || class074382.method_73183() != class070792.method_73183() || class015252.test(class047822, class074382)) {
                class014942.accept(class047822, class070792, class074382);
                class041392.y();
                return true;
            }
            return true;
        }));
    }

    private static boolean N(class07438 class074382, Optional<Long> optional) {
        return optional.isPresent() && class074382.method_73183().N() - optional.get() > 200L;
    }

    public static <E extends class07079> class04142<E> N(class01525 class015252) {
        return class01523.N(class015252, (class04782 class047822, E class070792, class07438 class074382) -> {}, true);
    }
}

