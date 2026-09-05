/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04051
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07079
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;
import minecraft.class04051;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07079;
import minecraft.class07438;

public class class01528 {
    public static <T extends class07079> class04119<T> N(int n) {
        return class01528.N(class070792 -> true, n);
    }

    private static boolean N(class07079 class070792) {
        return class070792.method_24520(arg_0 -> ((class07079)class070792).y(arg_0));
    }

    public static <T extends class07079> class04119<T> N(Predicate<T> predicate, int n) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.P), (App)class041282.y(class05378.s), (App)class041282.L(class05378.T), (App)class041282.y(class05378.B)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class070792, l) -> {
            class07438 class074382 = (class07438)class041282.y(class041393);
            if (predicate.test(class070792) && !class01528.N(class070792) && class070792.L(class074382) && ((class04051)class041282.y(class041395)).N(class074382)) {
                class041392.N((Object)new class05751((class07049)class074382, true));
                class070792.method_6104(class07050.field_5808);
                class070792.method_6121(class047822, (class07049)class074382);
                class041394.N((Object)true, (long)n);
                return true;
            }
            return false;
        }));
    }
}

