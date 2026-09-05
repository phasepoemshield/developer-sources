/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class02649
 *  minecraft.class02661
 *  minecraft.class04782
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07206
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08005
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00737;
import minecraft.class02649;
import minecraft.class02661;
import minecraft.class04782;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07206;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08005;
import minecraft.class08092;

public class class04438
extends class07206 {
    private final class02661 N;
    private final class02649 u;

    public class04438(class06581 class065812) {
        if (!(class065812 instanceof class02661)) {
            throw new IllegalArgumentException(String.valueOf(class065812) + " not instance of " + class02661.class.getSimpleName());
        }
        class02661 class026612 = (class02661)class065812;
        this.N = class026612;
        this.u = class026612.N();
    }

    public class06584 N(class07210 class072102, class06584 class065842) {
        class04782 class047822 = class072102.y();
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class00737 class007372 = this.u.y().getDispensePosition(class072102, class072112);
        class08005.N((class08005)this.N.N((class07299)class047822, class007372, class065842, class072112), (class04782)class047822, (class06584)class065842, (double)class072112.P(), (double)class072112.s(), (double)class072112.T(), (float)this.u.u(), (float)this.u.L());
        class065842.B(1);
        return class065842;
    }

    protected void N(class07210 class072102) {
        class072102.y().N(this.u.i().orElse(1002), class072102.L(), 0);
    }
}

