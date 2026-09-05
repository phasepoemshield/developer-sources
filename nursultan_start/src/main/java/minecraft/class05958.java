/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01262
 *  minecraft.class02566
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01262;
import minecraft.class02566;
import minecraft.class05973;
import minecraft.class08394;

class class05958
implements class01262 {
    private final int N;
    private final boolean y;

    public class05958(int n, boolean bl) {
        this.N = n;
        this.y = bl;
    }

    public void N(class05973 class059732) {
        class059732.B += this.N;
    }

    public void N(class01054 class010542, float f, float f2) {
        int n = class02566.N((float)f2, (float)f, (float)f, (float)f);
        if (this.N < 0) {
            class010542.N(class08394.Na, class05973.y, 0, 0, 16, 16, n);
        } else {
            class010542.N(class08394.Na, class05973.L, 0, 0, 16, 16, n);
        }
    }

    public class00392 aw_() {
        return this.N < 0 ? class05973.i : class05973.R;
    }

    public boolean ax_() {
        return this.y;
    }
}

