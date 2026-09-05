/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class04782
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01286;
import minecraft.class04782;
import minecraft.class07084;
import minecraft.class07438;

public class class07081
extends class07084 {
    public class07081(class01286 class012862, int n) {
        super(class012862, n);
    }

    @Override
    public void N(class07438 class074382, int n) {
        super.N(class074382, n);
        class074382.method_6073(Math.max(class074382.method_6067(), (float)(4 * (1 + n))));
    }

    @Override
    public boolean N(int n, int n2) {
        return true;
    }

    @Override
    public boolean N(class04782 class047822, class07438 class074382, int n) {
        return class074382.method_6067() > 0.0f;
    }
}

