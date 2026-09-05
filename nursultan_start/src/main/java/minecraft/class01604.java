/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class02570
 *  minecraft.class02796
 *  minecraft.class04193
 *  minecraft.class04279
 *  minecraft.class07821
 *  minecraft.class07825
 */
package minecraft;

import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01610;
import minecraft.class02570;
import minecraft.class02796;
import minecraft.class04193;
import minecraft.class04279;
import minecraft.class07821;
import minecraft.class07825;

public class class01604
implements class07825 {
    private final class02796 N;
    private final class00642 y;

    public class01604(class02796 class027962, class00642 class006422) {
        this.N = class027962;
        this.y = class006422;
    }

    public void N(class07821 class078212) {
        if (class078212.u() != class04193.field_44975) {
            throw new UnsupportedOperationException("Invalid intention " + String.valueOf(class078212.u()));
        }
        this.y.method_56330(class04279.y, (class00638)new class01610(this.N, this.y, false));
        this.y.method_56329(class04279.u);
    }

    public boolean method_48106() {
        return this.y.method_10758();
    }

    public void method_10839(class02570 class025702) {
    }
}

