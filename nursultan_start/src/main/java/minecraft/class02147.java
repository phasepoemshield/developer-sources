/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01217
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01217;
import minecraft.class02149;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07438;

public class class02147
extends class02149 {
    public static final float N = 8.0f;

    @Override
    protected boolean u(class04782 class047822, class07438 class074382, class07438 class074383) {
        return this.y(class074382, class074383) && class074383.method_5799() && (this.y(class074383) || this.N(class074382, class074383)) && class05355.y((class04782)class047822, (class07438)class074382, (class07438)class074383);
    }

    private boolean y(class07438 class074382, class07438 class074383) {
        return class074383.method_5858((class07049)class074382) <= 64.0;
    }

    @Override
    protected class05378<class07438> y() {
        return class05378.Q;
    }

    private boolean y(class07438 class074382) {
        return class074382.method_5864().N(class01217.z);
    }

    private boolean N(class07438 class074382, class07438 class074383) {
        return !class074382.method_18868().N(class05378.S) && class074383.method_5864().N(class01217.U);
    }
}

