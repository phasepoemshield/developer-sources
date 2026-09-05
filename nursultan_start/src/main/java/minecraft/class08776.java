/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01590
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04680
 *  minecraft.class06090
 *  minecraft.class06128
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07209
 *  minecraft.class08966
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01590;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04680;
import minecraft.class06090;
import minecraft.class06128;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class08757;
import minecraft.class08762;
import minecraft.class08764;
import minecraft.class08966;
import org.jspecify.annotations.Nullable;

public class class08776
implements class08762 {
    private static final int N = 600;
    private static final class00392 y = class00392.L((String)"tutorial.punch_tree.title");
    private static final class00392 L = class00392.N((String)"tutorial.punch_tree.description", (Object[])new Object[]{class08764.N("attack")});
    private final class08764 u;
    private @Nullable class06128 i;
    private int R;
    private int M;

    public class08776(class08764 class087642) {
        this.u = class087642;
    }

    @Override
    public void y() {
        if (this.i != null) {
            this.i.B();
            this.i = null;
        }
    }

    @Override
    public void N(class03448 class034482, class07209 class072092, class00500 class005002, float f) {
        boolean bl = class005002.N(class01210.g);
        if (bl && f > 0.0f) {
            if (this.i != null) {
                this.i.N(f);
            }
            if (f >= 1.0f) {
                this.u.N(class08966.field_5652);
            }
        } else if (this.i != null) {
            this.i.N(0.0f);
        } else if (bl) {
            ++this.M;
        }
    }

    @Override
    public void N(class06584 class065842) {
        if (class065842.N(class01226.g)) {
            this.u.N(class08966.field_5655);
            return;
        }
    }

    @Override
    public void N() {
        class04453 class044532;
        ++this.R;
        if (!this.u.R()) {
            this.u.N(class08966.field_5653);
            return;
        }
        class06202 class062022 = this.u.i();
        if (this.R == 1 && (class044532 = (class04453)class062022.T_4) != null) {
            if (class044532.method_31548().N(class01226.g)) {
                this.u.N(class08966.field_5655);
                return;
            }
            if (class08757.N(class044532)) {
                this.u.N(class08966.field_5655);
                return;
            }
        }
        if ((this.R >= 600 || this.M > 3) && this.i == null) {
            this.i = new class06128((class01590)class062022.i_3, class06090.field_2235, y, L, true);
            class062022.m().N((class04680)this.i);
        }
    }
}

