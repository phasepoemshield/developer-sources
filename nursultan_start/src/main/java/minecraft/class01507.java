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
import minecraft.class01498;
import minecraft.class01500;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05378;
import minecraft.class07079;
import minecraft.class07438;

public class class01507 {
    public static <E extends class07079> class04142<E> N(class01500<E> class015002, class01498<E> class014982) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.s), (App)class041282.N(class05378.I)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class070792, l) -> {
            if (!class015002.test(class047822, class070792)) {
                return false;
            }
            Optional<class07438> var8 = class014982.get(class047822, class070792);
            if (var8.isEmpty()) {
                return false;
            }
            class07438 class074382 = var8.get();
            if (!class070792.method_18395(class074382)) {
                return false;
            }
            class041392.N((Object)class074382);
            class041393.y();
            return true;
        }));
    }

    public static <E extends class07079> class04142<E> N(class01498<E> class014982) {
        return class01507.N((class04782 class047822, E class070792) -> true, class014982);
    }
}

