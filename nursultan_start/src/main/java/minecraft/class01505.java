/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07078
 *  minecraft.class07305
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.UUID;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class07078;
import minecraft.class07305;
import minecraft.class07438;

public class class01505 {
    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.NW)).apply((Applicative)class041282, class041392 -> (class047822, class074383, l) -> {
            Optional.ofNullable(class047822.method_66347((UUID)class041282.y(class041392))).map(class070492 -> class070492 instanceof class07438 ? (class07438)class070492 : null).filter(class07438::method_29504).filter(class074382 -> class074382.method_5864() != class07078.Ly || (Boolean)class047822.method_64395().N(class07305.P) != false).ifPresent(class074382 -> class041392.y());
            return true;
        }));
    }
}

