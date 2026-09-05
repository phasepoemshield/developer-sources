/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00143
 *  minecraft.class03556
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05672
 *  minecraft.class06289
 *  minecraft.class06293
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.Optional;
import minecraft.class00143;
import minecraft.class03556;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class06293;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class08041;

public class class05968 {
    public static class04142<class08041> N(float f) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.u), (App)class041282.L(class05378.L), (App)class041282.y(class05378.M), (App)class041282.N(class05378.m), (App)class041282.N(class05378.P)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395, class041396) -> (class047822, class080413, l) -> {
            if (class080413.method_6109()) {
                return false;
            }
            if (!class080413.t().y().N(class05672.y)) {
                return false;
            }
            class07209 class072092 = ((class06289)class041282.y(class041392)).y();
            Optional var11 = class047822.method_19494().L(class072092);
            if (var11.isEmpty()) {
                return true;
            }
            ((List)class041282.y(class041394)).stream().filter(class074382 -> class074382 instanceof class08041 && class074382 != class080413).map(class074382 -> (class08041)class074382).filter(class07438::method_5805).filter(class080412 -> class05968.N((class03556<class05369>)((class03556)var11.get()), class080412, class072092)).findFirst().ifPresent(class080412 -> {
                class041395.y();
                class041396.y();
                class041392.y();
                if (class080412.method_18868().L(class05378.L).isEmpty()) {
                    class06293.N((class07438)class080412, (class07209)class072092, (float)f, (int)1);
                    class080412.method_18868().N(class05378.u, (Object)class06289.N((class05946)class047822.method_27983(), (class07209)class072092));
                    class047822.method_74535().y(class072092);
                }
            });
            return true;
        }));
    }

    private static boolean N(class03556<class05369> class035562, class08041 class080412, class07209 class072092) {
        if (class080412.method_18868().L(class05378.u).isPresent()) {
            return false;
        }
        Optional var4 = class080412.method_18868().L(class05378.L);
        if (((class05672)class080412.t().y().N()).y().test(class035562)) {
            if (var4.isEmpty()) {
                return class05968.N((class07475)class080412, class072092, (class05369)class035562.N());
            }
            return ((class06289)var4.get()).y().equals((Object)class072092);
        }
        return false;
    }

    private static boolean N(class07475 class074752, class07209 class072092, class05369 class053692) {
        class00143 class001432 = class074752.f().N(class072092, class053692.L());
        return class001432 != null && class001432.z();
    }
}

