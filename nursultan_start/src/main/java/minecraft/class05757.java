/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class01210
 *  minecraft.class03556
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class06289
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07789
 *  minecraft.class08041
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class01210;
import minecraft.class03556;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class06289;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07789;
import minecraft.class08041;
import minecraft.class08092;

public class class05757 {
    private static final int N = 16;

    private static boolean N(class04782 class047822, class07209 class072092) {
        return !class047822.N(class08041.class, new class00734(class072092), class07438::method_6113).isEmpty();
    }

    private static boolean N(class04782 class047822, class07209 class072092, class07438 class074382) {
        class00500 class005002 = class047822.method_8320(class072092);
        return class005002.N(class01210.F) && (Boolean)class005002.L((class08092)class07789.L) != false && !class074382.method_6113();
    }

    public static class04142<class07438> N(Predicate<class03556<class05369>> predicate, class05378<class06289> class053782) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class053782)).apply((Applicative)class041282, class041392 -> (class047822, class074382, l) -> {
            class06289 class062892 = (class06289)class041282.y(class041392);
            class07209 class072092 = class062892.y();
            if (class047822.method_27983() != class062892.N() || !class072092.method_19769((class00737)class074382.method_73189(), 16.0)) {
                return false;
            }
            class04782 class047823 = class047822.method_8503().N(class062892.N());
            if (class047823 == null || !class047823.method_19494().N(class072092, predicate)) {
                class041392.y();
            } else if (class05757.N(class047823, class072092, class074382)) {
                class041392.y();
                if (!class05757.N(class047823, class072092)) {
                    class047822.method_19494().y(class072092);
                    class047822.method_74535().y(class072092);
                }
            }
            return true;
        }));
    }
}

