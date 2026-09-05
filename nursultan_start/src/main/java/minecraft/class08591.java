/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07089
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07486
 *  minecraft.class08038
 */
package minecraft;

import java.util.List;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07089;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07486;
import minecraft.class08038;

public class class08591
extends class07486 {
    public class08591(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class07078.yu, class072992, d, d2, d3, class065842);
    }

    public class08591(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.yu, class072992, class074382, class065842);
    }

    public class08591(class07078<? extends class08591> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void N(class04782 class047822, class06584 class065842, class07089 class070892) {
        class06517 class065172 = (class06517)class065842.a_(class02484.h, (Object)class06517.N);
        float f = ((Float)class065842.a_(class02484.r, (Object)Float.valueOf(1.0f))).floatValue();
        Iterable var6 = class065172.N();
        class00734 class007342 = this.method_5829().L(class070892.y().u(this.method_73189()));
        class00734 class007343 = class007342.L(4.0, 2.0, 4.0);
        List var9 = this.method_73183().N(class07438.class, class007343);
        float f2 = class08038.N((class07049)this);
        if (!var9.isEmpty()) {
            class07049 class070492 = this.P();
            for (class07438 class074382 : var9) {
                double d;
                if (!class074382.method_6086() || !((d = class007342.u(class074382.method_5829().M((double)f2))) < 16.0)) continue;
                double d2 = 1.0 - Math.sqrt(d) / 4.0;
                for (class07055 class070552 : var6) {
                    class03556 var20 = class070552.L();
                    if (((class07084)var20.N()).N()) {
                        ((class07084)var20.N()).N(class047822, (class07049)this, this.z(), class074382, class070552.i(), d2);
                        continue;
                    }
                    int n2 = class070552.N(n -> (int)(d2 * (double)n * (double)f + 0.5));
                    class07055 class070553 = new class07055(var20, n2, class070552.i(), class070552.R(), class070552.M());
                    if (class070553.N(20)) continue;
                    class074382.method_37222(class070553, class070492);
                }
            }
        }
    }

    protected class06581 N() {
        return class06570.lO;
    }
}

