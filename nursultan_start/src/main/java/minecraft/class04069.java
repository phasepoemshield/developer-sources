/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02149
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class02149;
import minecraft.class04067;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07438;

public class class04069
extends class02149 {
    public static final float N = 10.0f;

    private boolean i(class04782 class047822, class07438 class074382, class07438 class074383) {
        return class04067.N(class074383) && class05355.y((class04782)class047822, (class07438)class074382, (class07438)class074383);
    }

    protected boolean u(class04782 class047822, class07438 class074382, class07438 class074383) {
        class07438 class074384;
        class07438 class074385;
        class04782 class047823;
        if (!class074382.method_18868().N(class05378.S) && this.i(class047823 = class047822, class074385 = class074382, class074384 = class074383) && this.y((class07438)(class047823 = class074383)) && !this.N(class074382, class074383)) {
            return class074383.method_24516((class07049)class074382, 10.0);
        }
        return false;
    }

    private boolean y(class07438 class074382) {
        return true;
    }

    protected class05378<class07438> y() {
        return class05378.Q;
    }

    private boolean N(class07438 class074382, class07438 class074383) {
        return class074382.method_18868().L(class05378.Ny).orElseGet(ArrayList::new).contains(class074383.method_5667());
    }
}

