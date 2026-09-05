/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00869
 *  minecraft.class02484
 *  minecraft.class02687
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class06501
 *  minecraft.class06570
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class00869;
import minecraft.class02484;
import minecraft.class02687;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class06501;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06926
extends class06581 {
    private static final class00392 N = class00392.L((String)"item.minecraft.lodestone_compass");

    public boolean L(class06584 class065842) {
        return class065842.L(class02484.NP) || super.L(class065842);
    }

    public class06926(class06573 class065732) {
        super(class065732);
    }

    public void N(class06584 class065842, class04782 class047822, class07049 class070492, @Nullable class07085 class070852) {
        class02687 class026872;
        class02687 class026873 = (class02687)class065842.method_58694(class02484.NP);
        if (class026873 != null && (class026872 = class026873.N(class047822)) != class026873) {
            class065842.N(class02484.NP, (Object)class026872);
        }
    }

    public class00392 N(class06584 class065842) {
        return class065842.L(class02484.NP) ? N : super.N(class065842);
    }

    public class07082 N(class06501 class065012) {
        class07209 class072092 = class065012.method_8037();
        class07299 class072992 = class065012.method_8045();
        if (class072992.method_8320(class072092).N(class00869.TT)) {
            class072992.method_8396(null, class072092, class04909.Td, class04911.field_15248, 1.0f, 1.0f);
            class08036 class080362 = class065012.method_8036();
            class06584 class065842 = class065012.method_8041();
            boolean bl = !class080362.method_56992() && class065842.c() == 1;
            class02687 class026872 = new class02687(Optional.of(class06289.N((class05946)class072992.method_27983(), (class07209)class072092)), true);
            if (bl) {
                class065842.N(class02484.NP, (Object)class026872);
            } else {
                class06584 class065843 = class065842.N((class07310)class06570.jJ, 1);
                class065842.N(1, (class07438)class080362);
                class065843.N(class02484.NP, (Object)class026872);
                if (!class080362.method_31548().M(class065843)) {
                    class080362.method_7328(class065843, false);
                }
            }
            return class07082.N;
        }
        return super.N(class065012);
    }
}

