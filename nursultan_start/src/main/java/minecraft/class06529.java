/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00512
 *  minecraft.class01894
 *  minecraft.class04770
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00512;
import minecraft.class01894;
import minecraft.class04770;
import minecraft.class06556;

public class class06529
extends class06556 {
    private final class04770 L;

    public class06529(class04770 class047702) {
        this.L = class047702;
    }

    @Override
    protected void y(class01894 class018942, int n) {
        super.y(class018942, n);
        this.L.field_13987.method_14364((class00381)new class00512(class018942, n));
    }

    @Override
    protected void y(class01894 class018942) {
        super.y(class018942);
        this.L.field_13987.method_14364((class00381)new class00512(class018942, 0));
    }
}

