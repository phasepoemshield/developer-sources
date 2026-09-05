/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01262
 *  minecraft.class01631
 *  minecraft.class02566
 *  minecraft.class03458
 *  minecraft.class03933
 *  minecraft.class06202
 *  minecraft.class07810
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01262;
import minecraft.class01631;
import minecraft.class02566;
import minecraft.class03458;
import minecraft.class03933;
import minecraft.class05973;
import minecraft.class06202;
import minecraft.class07810;

public class class05956
implements class01262 {
    private final class03458 N;
    private final class00392 y;

    public class05956(class03458 class034582) {
        this.N = class034582;
        this.y = class00392.y((String)class034582.N().name());
    }

    public void N(class05973 class059732) {
        class06202.Nq().NE().N((class00381)new class07810(this.N.N().id()));
    }

    public void N(class01054 class010542, float f, float f2) {
        class03933.N((class01054)class010542, (class01631)this.N.M(), (int)2, (int)2, (int)12, (int)class02566.y((float)f2));
    }

    public class00392 aw_() {
        return this.y;
    }

    public boolean ax_() {
        return true;
    }
}

