/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class03556
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05672
 *  minecraft.class06289
 *  minecraft.class07438
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.Optional;
import minecraft.class03556;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class06289;
import minecraft.class07438;
import minecraft.class08041;

public class class05940 {
    public static class04142<class08041> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.L), (App)class041282.y(class05378.M)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class080412, l) -> {
            class06289 class062892 = (class06289)class041282.y(class041392);
            class047822.method_19494().L(class062892.y()).ifPresent(class035562 -> ((List)class041282.y(class041393)).stream().filter(class074382 -> class074382 instanceof class08041 && class074382 != class080412).map(class074382 -> (class08041)class074382).filter(class07438::method_5805).filter(class080412 -> class05940.N(class062892, (class03556<class05369>)class035562, class080412)).reduce((class08041)class080412, class05940::N));
            return true;
        }));
    }

    private static class08041 N(class08041 class080412, class08041 class080413) {
        class08041 class080414;
        class08041 class080415;
        if (class080412.u() > class080413.u()) {
            class080415 = class080412;
            class080414 = class080413;
        } else {
            class080415 = class080413;
            class080414 = class080412;
        }
        class080414.method_18868().y(class05378.L);
        return class080415;
    }

    private static boolean N(class06289 class062892, class03556<class05369> class035562, class08041 class080412) {
        Optional var3 = class080412.method_18868().L(class05378.L);
        return var3.isPresent() && class062892.equals(var3.get()) && class05940.N(class035562, (class03556<class05672>)class080412.t().y());
    }

    private static boolean N(class03556<class05369> class035562, class03556<class05672> class035563) {
        return ((class05672)class035563.N()).y().test(class035562);
    }
}

