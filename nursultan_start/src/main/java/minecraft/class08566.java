/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07048
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07486
 */
package minecraft;

import minecraft.class04782;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07048;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07486;

public class class08566
extends class07486 {
    public class08566(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class07078.yi, class072992, d, d2, d3, class065842);
    }

    public class08566(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.yi, class072992, class074382, class065842);
    }

    public class08566(class07078<? extends class08566> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class06581 N() {
        return class06570.lJ;
    }

    public void N(class04782 class047822, class06584 class065842, class07089 class070892) {
        class07048 class070482 = new class07048(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321());
        class07049 class070492 = this.z();
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class070482.N(class074382);
        }
        class070482.N(3.0f);
        class070482.L(-0.5f);
        class070482.N(600);
        class070482.L(10);
        class070482.u(-class070482.N() / (float)class070482.u());
        class070482.method_66652(class065842);
        class047822.method_8649((class07049)class070482);
    }
}

