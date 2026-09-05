/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02861
 *  minecraft.class06954
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02272;
import minecraft.class02303;
import minecraft.class02861;
import minecraft.class06954;

public class class02292
extends class02272 {
    private final class06954 L;
    private final class02303 u;

    public class02292(int n, class06954 class069542, class02303 class023032) {
        this(n, class069542, class023032, new long[n]);
    }

    public class02292(int n, class06954 class069542, class02303 class023032, long[] lArray) {
        super(n, lArray);
        this.L = class069542;
        this.u = class023032;
    }

    @Override
    protected void N() {
        if (this.L.N(this.u.N())) {
            this.L.N(this.u.N(), (class00381)new class02861((long[])this.y.clone(), this.u));
        }
    }
}

