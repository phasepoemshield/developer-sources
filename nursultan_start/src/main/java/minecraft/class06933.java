/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00690
 *  minecraft.class01194
 *  minecraft.class01231
 *  minecraft.class01235
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05835
 *  minecraft.class05970
 *  minecraft.class06183
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07048
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import minecraft.class00690;
import minecraft.class01194;
import minecraft.class01231;
import minecraft.class01235;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05835;
import minecraft.class05970;
import minecraft.class06183;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class07048;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08036;

public class class06933
extends class06581 {
    public class06933(class06573 class065732) {
        super(class065732);
    }

    protected class06584 N(class06584 class065842, class08036 class080362, class06584 class065843) {
        class080362.method_7259(class01235.L.y((Object)this));
        return class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843);
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        List var4 = class072992.N(class07048.class, class080362.method_5829().M(2.0), class070482 -> class070482.method_5805() && class070482.z() instanceof class00690);
        class06584 class065842 = class080362.method_5998(class070502);
        if (!var4.isEmpty()) {
            class07048 class070483 = (class07048)var4.get(0);
            class070483.N(class070483.N() - 0.5f);
            class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.La, class04911.field_15254, 1.0f, 1.0f);
            class072992.N((class07049)class080362, (class03556)class01194.d, class080362.method_73189());
            if (class080362 instanceof class04770) {
                class04770 class047702 = (class04770)class080362;
                class06912.C.N(class047702, class065842, (class07049)class070483);
            }
            return class07082.N.N(this.N(class065842, class080362, new class06584((class07310)class06570.lQ)));
        }
        class06183 class061832 = class06933.N((class07299)class072992, (class08036)class080362, (class05835)class05835.field_1345);
        if (class061832.N() == class07113.field_1333) {
            return class07082.i;
        }
        if (class061832.N() == class07113.field_1332) {
            class07209 class072092 = class061832.u();
            if (!class072992.method_8505((class07049)class080362, class072092)) {
                return class07082.i;
            }
            if (class072992.method_8316(class072092).N(class01231.N)) {
                class072992.method_43128((class07049)class080362, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.LX, class04911.field_15254, 1.0f, 1.0f);
                class072992.N((class07049)class080362, (class03556)class01194.d, class072092);
                return class07082.N.N(this.N(class065842, class080362, class06517.N((class06581)class06570.ns, (class03556)class06506.N)));
            }
        }
        return class07082.i;
    }
}

