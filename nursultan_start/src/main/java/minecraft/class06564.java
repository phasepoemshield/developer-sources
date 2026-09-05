/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06113
 *  minecraft.class06501
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07504
 *  minecraft.class07760
 *  minecraft.class08036
 *  minecraft.class08080
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class00500;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06113;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07504;
import minecraft.class07760;
import minecraft.class08036;
import minecraft.class08080;

public class class06564
extends class06581 {
    private final class07078<? extends class07504> N;

    public class06564(class07078<? extends class07504> class070782, class06573 class065732) {
        super(class065732);
        this.N = class070782;
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07209 class072092;
        class07299 class072992 = class065012.method_8045();
        class00500 class005002 = class072992.method_8320(class072092 = class065012.method_8037());
        if (!class005002.N(class01210.e)) {
            return class07082.u;
        }
        class06584 class065842 = class065012.method_8041();
        class08080 class080802 = class005002.i() instanceof class07760 ? (class08080)class005002.L(((class07760)class005002.i()).L()) : class08080.field_12665;
        double d = 0.0;
        if (class080802.y()) {
            d = 0.5;
        }
        class06889 class068892 = new class06889((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.0625 + d, (double)class072092.method_10260() + 0.5);
        class07504 class075042 = class07504.N((class07299)class072992, (double)class068892.M, (double)class068892.B, (double)class068892.Z, this.N, (class06113)class06113.field_16470, (class06584)class065842, (class08036)class065012.method_8036());
        if (class075042 == null) {
            return class07082.u;
        }
        if (class07504.N((class07299)class072992)) {
            List var11 = class072992.N_70(null, class075042.method_5829());
            Iterator var12 = var11.iterator();
            while (var12.hasNext()) {
                if (!((class07049)var12.next() instanceof class07504)) continue;
                return class07082.u;
            }
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class047822.method_8649((class07049)class075042);
            class047822.N((class03556)class01194.v, class072092, class01164.N((class07049)class065012.method_8036(), (class00500)class047822.method_8320(class072092.method_10074())));
        }
        class065842.B(1);
        return class07082.N;
    }
}

