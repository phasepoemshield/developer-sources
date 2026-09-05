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
import java.util.function.Function;
import minecraft.class04003;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07438;

public class class04005 {
    public static <E extends class04003> class04142<E> N(Function<E, Optional<? extends class07438>> function) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.NK), (App)class041282.L(class05378.s), (App)class041282.N(class05378.I)).apply((Applicative)class041282, (class041392, class041393, class041394) -> (class047822, class040032, l) -> {
            Optional optional = (Optional)function.apply(class040032);
            if (optional.filter(class040032::L).isEmpty()) {
                return false;
            }
            class041392.N((Object)((class07438)optional.get()));
            class041394.y();
            return true;
        }));
    }
}

