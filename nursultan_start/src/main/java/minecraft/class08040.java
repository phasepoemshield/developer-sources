/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05668
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07057
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04782;
import minecraft.class05668;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07057;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07299;
import minecraft.class07438;

public class class08040
extends class05668 {
    protected double method_7490() {
        return 0.07;
    }

    public class08040(class07078<? extends class08040> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class08040(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class07078.h, d, d2, d3, class072992, class065842);
    }

    public class08040(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.h, class074382, class072992, class065842);
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class047822.N(2002, this.method_24515(), -13083194);
            int n = 3 + class047822.field_9229.y(5) + class047822.field_9229.y(5);
            if (class070892 instanceof class06183) {
                class06889 class068892 = ((class06183)class070892).i().W();
                class07057.N((class04782)class047822, (class06889)class070892.y(), (class06889)class068892, (int)n);
            } else {
                class07057.N((class04782)class047822, (class06889)class070892.y(), (class06889)this.method_18798().L(-1.0), (int)n);
            }
            this.method_31472();
        }
    }

    protected class06581 N() {
        return class06570.GB;
    }
}

