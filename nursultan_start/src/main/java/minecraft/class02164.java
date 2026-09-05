/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07084
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01286;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07084;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07438;

public class class02164
extends class07084 {
    public class02164(class01286 class012862, int n, class07126 class071262) {
        super(class012862, n, class071262);
    }

    public boolean N(int n, int n2) {
        return n == 1;
    }

    public boolean N(class04782 class047822, class07438 class074382, int n) {
        if (class074382 instanceof class04770) {
            class07209 class072092;
            class04770 class047702 = (class04770)class074382;
            if (!class074382.method_7325() && (class072092 = class047702.method_58585()) != null) {
                class047822.method_19495().N(class047702, class072092);
                class047702.method_58584();
                return false;
            }
        }
        return true;
    }
}

