/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04877
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07086
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01286;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04877;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07086;
import minecraft.class07438;

public class class01848
extends class07084 {
    public class01848(class01286 class012862, int n) {
        super(class012862, n);
    }

    public boolean N(int n, int n2) {
        return true;
    }

    public boolean N(class04782 class047822, class07438 class074382, int n) {
        class04877 class048772;
        class04770 class047702;
        if (class074382 instanceof class04770 && !(class047702 = (class04770)class074382).method_7325() && class047822.y() != class07086.field_5801 && class047822.method_19500(class047702.method_24515()) && ((class048772 = class047822.method_19502(class047702.method_24515())) == null || class048772.E() < class048772.U())) {
            class047702.method_6092(new class07055(class07047.q, 600, n));
            class047702.method_58586(class047702.method_24515());
            return false;
        }
        return true;
    }
}

