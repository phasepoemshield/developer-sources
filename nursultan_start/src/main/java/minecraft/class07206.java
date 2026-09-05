/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class00737
 *  minecraft.class00755
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00717;
import minecraft.class00737;
import minecraft.class00755;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;

public class class07206
implements class00755 {
    private static final int N = 6;

    private void y(class07210 class072102, class06584 class065842) {
        class06584 class065843 = class072102.i().N(class065842);
        if (class065843.R()) {
            return;
        }
        class07211 class072112 = (class07211)((Object)class072102.u().L((class08092)class06758.y));
        class07206.N((class07299)class072102.y(), class065843, 6, class072112, class06758.N((class07210)class072102));
        class07206.y(class072102);
        class07206.y(class072102, class072112);
    }

    private static void y(class07210 class072102) {
        class072102.y().N(1000, class072102.L(), 0);
    }

    private static void y(class07210 class072102, class07211 class072112) {
        class072102.y().N(2000, class072102.L(), class072112.L());
    }

    protected class06584 N(class07210 class072102, class06584 class065842, class06584 class065843) {
        class065842.B(1);
        if (class065842.R()) {
            return class065843;
        }
        this.y(class072102, class065843);
        return class065842;
    }

    protected void N(class07210 class072102, class07211 class072112) {
        class07206.y(class072102, class072112);
    }

    protected class06584 N(class07210 class072102, class06584 class065842) {
        class07211 class072112 = (class07211)((Object)class072102.u().L((class08092)class06758.y));
        class00737 class007372 = class06758.N((class07210)class072102);
        class06584 class065843 = class065842.N(1);
        class07206.N((class07299)class072102.y(), class065843, 6, class072112, class007372);
        return class065842;
    }

    public static void N(class07299 class072992, class06584 class065842, int n, class07211 class072112, class00737 class007372) {
        double d = class007372.N();
        double d2 = class007372.y();
        double d3 = class007372.L();
        d2 = class072112.z() == class07185.field_11052 ? (d2 -= 0.125) : (d2 -= 0.15625);
        class00717 class007172 = new class00717(class072992, d, d2, d3, class065842);
        double d4 = class072992.field_9229.U() * 0.1 + 0.2;
        class007172.method_18800(class072992.field_9229.N((double)class072112.P() * d4, 0.0172275 * (double)n), class072992.field_9229.N(0.2, 0.0172275 * (double)n), class072992.field_9229.N((double)class072112.T() * d4, 0.0172275 * (double)n));
        class072992.method_8649((class07049)class007172);
    }

    protected void N(class07210 class072102) {
        class07206.y(class072102);
    }

    public final class06584 dispense(class07210 class072102, class06584 class065842) {
        class06584 class065843 = this.N(class072102, class065842);
        this.N(class072102);
        this.N(class072102, (class07211)((Object)class072102.u().L((class08092)class06758.y)));
        return class065843;
    }
}

