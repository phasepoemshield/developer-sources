/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 */
package minecraft;

import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06357;

public class class06365
implements class06357 {
    private final class01028 N;

    public class06365(class01028 class010282) {
        this.N = class010282;
    }

    @Override
    public void method_32665(class01054 class010542, class01590 class015902, int n, int n2) {
        class010542.N(class015902, this.N, n, n2, -1, true);
    }

    @Override
    public int method_32664(class01590 class015902) {
        return class015902.N(this.N);
    }

    @Override
    public int method_32661(class01590 class015902) {
        return 10;
    }
}

