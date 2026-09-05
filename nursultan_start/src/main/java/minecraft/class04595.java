/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class04141
 *  minecraft.class04897
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class04141;
import minecraft.class04610;
import minecraft.class04628;
import minecraft.class04897;
import minecraft.class08394;

class class04595
extends class04897 {
    private final class01894 N;

    class04595(class04628 class046282, int n, class01894 class018942) {
        super(18, 18, new class01883(class04610.y, class04610.N), class053622 -> class046282.N.y(class046282.N.y(n)), class046282.N.y(n).L());
        this.N = class018942;
        this.method_47400(class04141.N((class00392)this.method_25369()));
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class01894 class018942 = this.field_45356.N(this.method_37303(), this.method_25367());
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
        class010542.N(class08394.Na, this.N, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
    }
}

