/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04449
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06509
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08582
 */
package minecraft;

import java.util.Optional;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04449;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06509;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08582;

public class class04473
extends class06581 {
    public class04473(class06573 class065732) {
        super(class065732);
    }

    public class06509 y(class06584 class065842) {
        return class06509.field_39058;
    }

    private Optional<class03556<class04449>> N(class06584 class065842, class01929 class019292) {
        class08582 class085822 = (class08582)class065842.method_58694(class02484.NZ);
        return class085822 != null ? class085822.N(class019292) : Optional.empty();
    }

    private static void N(class07299 class072992, class08036 class080362, class04449 class044492) {
        class04891 class048912 = (class04891)class044492.N().N();
        float f = class044492.L() / 16.0f;
        class072992.method_43129((class07049)class080362, (class07049)class080362, class048912, class04911.field_15247, f, 1.0f);
        class072992.method_32888((class03556)class01194.Y, class080362.method_73189(), class01164.N((class07049)class080362));
    }

    public int N(class06584 class065842, class07438 class074382) {
        return this.N(class065842, (class01929)class074382.method_56673()).map(class035562 -> class04995.y((float)(((class04449)class035562.N()).y() * 20.0f))).orElse(0);
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        Optional<class03556<class04449>> var5 = this.N(class065842, (class01929)class080362.method_56673());
        if (var5.isPresent()) {
            class04449 class044492 = (class04449)var5.get().N();
            class080362.method_6019(class070502);
            class04473.N(class072992, class080362, class044492);
            class080362.method_7357().N(class065842, class04995.y((float)(class044492.y() * 20.0f)));
            class080362.method_7259(class01235.L.y((Object)this));
            return class07082.L;
        }
        return class07082.u;
    }

    public static class06584 N(class06581 class065812, class03556<class04449> class035562) {
        class06584 class065842 = new class06584((class07310)class065812);
        class065842.N(class02484.NZ, (Object)new class08582(class035562));
        return class065842;
    }
}

