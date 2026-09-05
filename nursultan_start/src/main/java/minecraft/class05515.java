/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class01235
 *  minecraft.class02649
 *  minecraft.class02661
 *  minecraft.class04782
 *  minecraft.class06573
 *  minecraft.class06584
 *  minecraft.class06586
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07486
 *  minecraft.class08005
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00737;
import minecraft.class01235;
import minecraft.class02649;
import minecraft.class02661;
import minecraft.class04782;
import minecraft.class06573;
import minecraft.class06584;
import minecraft.class06586;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07486;
import minecraft.class08005;
import minecraft.class08036;

public abstract class class05515
extends class06586
implements class02661 {
    public static float N = 0.5f;

    public class05515(class06573 class065732) {
        super(class065732);
    }

    protected abstract class07486 N(class07299 var1, class00737 var2, class06584 var3);

    public class02649 N() {
        return class02649.N().N(class02649.N.L() * 0.5f).y(class02649.N.u() * 1.25f).N();
    }

    public class08005 N(class07299 class072992, class00737 class007372, class06584 class065842, class07211 class072112) {
        return this.N(class072992, class007372, class065842);
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class08005.N(this::N, (class04782)class047822, (class06584)class065842, (class07438)class080362, (float)-20.0f, (float)N, (float)1.0f);
        }
        class080362.method_7259(class01235.L.y((Object)this));
        class065842.N(1, (class07438)class080362);
        return class07082.N;
    }

    protected abstract class07486 N(class04782 var1, class07438 var2, class06584 var3);
}

