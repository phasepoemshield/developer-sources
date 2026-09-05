/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class04782
 *  minecraft.class07084
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01286;
import minecraft.class04782;
import minecraft.class07084;
import minecraft.class07438;

public class class01863
extends class07084 {
    public static final int L = 25;

    public class01863(class01286 class012862, int n) {
        super(class012862, n);
    }

    public boolean N(class04782 class047822, class07438 class074382, int n) {
        if (class074382.method_6032() > 1.0f) {
            class074382.method_64397(class047822, class074382.method_48923().T(), 1.0f);
        }
        return true;
    }

    public boolean N(int n, int n2) {
        int n3 = 25 >> n2;
        if (n3 > 0) {
            return n % n3 == 0;
        }
        return true;
    }
}

