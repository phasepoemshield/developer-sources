/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01590
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class04680
 *  minecraft.class06090
 *  minecraft.class06128
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class08762
 *  minecraft.class08764
 *  minecraft.class08966
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01590;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class04680;
import minecraft.class06090;
import minecraft.class06128;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class08762;
import minecraft.class08764;
import minecraft.class08966;
import org.jspecify.annotations.Nullable;

public class class00092
implements class08762 {
    private static final int N = 1200;
    private static final class00392 y = class00392.L((String)"tutorial.craft_planks.title");
    private static final class00392 L = class00392.L((String)"tutorial.craft_planks.description");
    private final class08764 u;
    private @Nullable class06128 i;
    private int R;

    public class00092(class08764 class087642) {
        this.u = class087642;
    }

    public void y() {
        if (this.i != null) {
            this.i.B();
            this.i = null;
        }
    }

    public void N(class06584 class065842) {
        if (class065842.N(class01226.y)) {
            this.u.N(class08966.field_5653);
        }
    }

    public static boolean N(class04453 class044532, class03530<class06581> class035302) {
        for (class03556 var3 : class04206.B.u(class035302)) {
            if (class044532.O().N(class01235.y.y((Object)((class06581)var3.N()))) <= 0) continue;
            return true;
        }
        return false;
    }

    public void N() {
        class04453 class044532;
        ++this.R;
        if (!this.u.R()) {
            this.u.N(class08966.field_5653);
            return;
        }
        class06202 class062022 = this.u.i();
        if (this.R == 1 && (class044532 = (class04453)class062022.T_4) != null) {
            if (class044532.method_31548().N(class01226.y)) {
                this.u.N(class08966.field_5653);
                return;
            }
            if (class00092.N(class044532, (class03530<class06581>)class01226.y)) {
                this.u.N(class08966.field_5653);
                return;
            }
        }
        if (this.R >= 1200 && this.i == null) {
            this.i = new class06128((class01590)class062022.i_3, class06090.field_2236, y, L, false);
            class062022.m().N((class04680)this.i);
        }
    }
}

