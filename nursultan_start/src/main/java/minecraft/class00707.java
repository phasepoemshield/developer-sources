/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class04909
 */
package minecraft;

import minecraft.class00685;
import minecraft.class00690;
import minecraft.class00702;
import minecraft.class04782;
import minecraft.class04909;

public class class00707
extends class00685 {
    private static final int y = 40;
    private int L;

    @Override
    public void L() {
        this.L = 0;
    }

    public class00707(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00707> B() {
        return class00702.B;
    }

    @Override
    public void y() {
        this.N.method_73183().method_8486(this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), class04909.zH, this.N.method_5634(), 2.5f, 0.8f + this.N.method_59922().z() * 0.3f, false);
    }

    @Override
    public void N(class04782 class047822) {
        if (this.L++ >= 40) {
            this.N.W().N(class00702.R);
        }
    }
}

