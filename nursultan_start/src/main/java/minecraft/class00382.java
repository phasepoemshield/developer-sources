/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class08299;
import minecraft.class08329;

public class class00382
extends class00394 {
    private static final int N = 0;
    private int y = 0;

    public class00382(class07209 class072092, class00500 class005002) {
        super(class00404.field_11908, class072092, class005002);
    }

    public void N(int n) {
        this.y = n;
    }

    public int N() {
        return this.y;
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.y = class082992.N("OutputSignal", 0);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("OutputSignal", this.y);
    }
}

